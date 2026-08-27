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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class db0 extends org.telegram.ui.Cells.g3 {
    public boolean x;
    public final /* synthetic */ fb0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public db0(fb0 fb0Var, Context context, String str, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, str, false, false, -1, c6Var);
        this.y = fb0Var;
    }

    @Override // org.telegram.ui.Cells.g3
    public final void b(Editable editable) {
        int i10;
        if (this.x) {
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(editable);
        fb0 fb0Var = this.y;
        if (isEmpty) {
            fb0Var.s.setText("");
            return;
        }
        try {
            long parseLong = Long.parseLong(editable.toString());
            if (parseLong > fb0Var.getMessagesController().starsSubscriptionAmountMax) {
                this.x = true;
                parseLong = fb0Var.getMessagesController().starsSubscriptionAmountMax;
                setText(Long.toString(parseLong));
                this.x = false;
            }
            TextView textView = fb0Var.s;
            int i11 = fb0Var.getConnectionsManager().isTestBackend() ? R.string.RequireMonthlyFeePriceTest5Minutes : R.string.RequireMonthlyFeePrice;
            BillingController billingController = BillingController.getInstance();
            i10 = ((org.telegram.ui.ActionBar.n2) fb0Var).currentAccount;
            textView.setText(LocaleController.formatString(i11, billingController.formatCurrency((long) ((parseLong / 1000.0d) * MessagesController.getInstance(i10).starsUsdWithdrawRate1000), "USD")));
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }
}
