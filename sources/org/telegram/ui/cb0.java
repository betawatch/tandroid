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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class cb0 extends org.telegram.ui.Cells.g3 {
    public boolean x;
    public final /* synthetic */ eb0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cb0(eb0 eb0Var, Context context, String str, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, str, false, false, -1, c6Var);
        this.y = eb0Var;
    }

    @Override // org.telegram.ui.Cells.g3
    public final void b(Editable editable) {
        int i10;
        if (this.x) {
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(editable);
        eb0 eb0Var = this.y;
        if (isEmpty) {
            eb0Var.s.setText("");
            return;
        }
        try {
            long parseLong = Long.parseLong(editable.toString());
            if (parseLong > eb0Var.getMessagesController().starsSubscriptionAmountMax) {
                this.x = true;
                parseLong = eb0Var.getMessagesController().starsSubscriptionAmountMax;
                setText(Long.toString(parseLong));
                this.x = false;
            }
            TextView textView = eb0Var.s;
            int i11 = eb0Var.getConnectionsManager().isTestBackend() ? R.string.RequireMonthlyFeePriceTest5Minutes : R.string.RequireMonthlyFeePrice;
            BillingController billingController = BillingController.getInstance();
            i10 = ((org.telegram.ui.ActionBar.o2) eb0Var).currentAccount;
            textView.setText(LocaleController.formatString(i11, billingController.formatCurrency((long) ((parseLong / 1000.0d) * MessagesController.getInstance(i10).starsUsdWithdrawRate1000), "USD")));
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }
}
