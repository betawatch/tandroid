package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class mb0 extends org.telegram.ui.Cells.i3 {
    public boolean x;
    public final /* synthetic */ ob0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mb0(ob0 ob0Var, Context context, String str, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, str, false, false, -1, g6Var);
        this.y = ob0Var;
    }

    @Override // org.telegram.ui.Cells.i3
    public final void b(Editable editable) {
        int i10;
        if (this.x) {
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(editable);
        ob0 ob0Var = this.y;
        if (isEmpty) {
            ob0Var.s.setText("");
            return;
        }
        try {
            long parseLong = Long.parseLong(editable.toString());
            if (parseLong > ob0Var.getMessagesController().starsSubscriptionAmountMax) {
                this.x = true;
                parseLong = ob0Var.getMessagesController().starsSubscriptionAmountMax;
                setText(Long.toString(parseLong));
                this.x = false;
            }
            TextView textView = ob0Var.s;
            int i11 = ob0Var.getConnectionsManager().isTestBackend() ? R.string.RequireMonthlyFeePriceTest5Minutes : R.string.RequireMonthlyFeePrice;
            BillingController billingController = BillingController.getInstance();
            i10 = ((org.telegram.ui.ActionBar.p2) ob0Var).currentAccount;
            textView.setText(LocaleController.formatString(i11, billingController.formatCurrency((long) ((parseLong / 1000.0d) * MessagesController.getInstance(i10).starsUsdWithdrawRate1000), "USD")));
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }
}
