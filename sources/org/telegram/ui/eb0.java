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

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class eb0 extends org.telegram.ui.Cells.h3 {
    public boolean E;
    public final /* synthetic */ gb0 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eb0(gb0 gb0Var, Context context, String str, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, str, false, false, -1, g6Var);
        this.F = gb0Var;
    }

    @Override // org.telegram.ui.Cells.h3
    public final void b(Editable editable) {
        int i10;
        if (this.E) {
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(editable);
        gb0 gb0Var = this.F;
        if (isEmpty) {
            gb0Var.s.setText("");
            return;
        }
        try {
            long parseLong = Long.parseLong(editable.toString());
            if (parseLong > gb0Var.getMessagesController().starsSubscriptionAmountMax) {
                this.E = true;
                parseLong = gb0Var.getMessagesController().starsSubscriptionAmountMax;
                setText(Long.toString(parseLong));
                this.E = false;
            }
            TextView textView = gb0Var.s;
            int i11 = gb0Var.getConnectionsManager().isTestBackend() ? R.string.RequireMonthlyFeePriceTest5Minutes : R.string.RequireMonthlyFeePrice;
            BillingController billingController = BillingController.getInstance();
            i10 = ((org.telegram.ui.ActionBar.o2) gb0Var).currentAccount;
            textView.setText(LocaleController.formatString(i11, billingController.formatCurrency((long) ((parseLong / 1000.0d) * MessagesController.getInstance(i10).starsUsdWithdrawRate1000), "USD")));
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
