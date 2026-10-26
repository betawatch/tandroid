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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class bb0 extends org.telegram.ui.Cells.g3 {
    public boolean E;
    public final /* synthetic */ db0 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bb0(db0 db0Var, Context context, String str, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, str, false, false, -1, u6Var);
        this.F = db0Var;
    }

    @Override // org.telegram.ui.Cells.g3
    public final void b(Editable editable) {
        int i10;
        if (this.E) {
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(editable);
        db0 db0Var = this.F;
        if (isEmpty) {
            db0Var.s.setText("");
            return;
        }
        try {
            long parseLong = Long.parseLong(editable.toString());
            if (parseLong > db0Var.getMessagesController().starsSubscriptionAmountMax) {
                this.E = true;
                parseLong = db0Var.getMessagesController().starsSubscriptionAmountMax;
                setText(Long.toString(parseLong));
                this.E = false;
            }
            TextView textView = db0Var.s;
            int i11 = db0Var.getConnectionsManager().isTestBackend() ? R.string.RequireMonthlyFeePriceTest5Minutes : R.string.RequireMonthlyFeePrice;
            BillingController billingController = BillingController.getInstance();
            i10 = ((org.telegram.ui.ActionBar.r2) db0Var).currentAccount;
            textView.setText(LocaleController.formatString(i11, billingController.formatCurrency((long) ((parseLong / 1000.0d) * MessagesController.getInstance(i10).starsUsdWithdrawRate1000), "USD")));
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
