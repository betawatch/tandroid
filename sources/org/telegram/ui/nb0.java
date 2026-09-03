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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class nb0 extends org.telegram.ui.Cells.h3 {
    public boolean x;
    public final /* synthetic */ pb0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nb0(pb0 pb0Var, Context context, String str, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, str, false, false, -1, f6Var);
        this.y = pb0Var;
    }

    @Override // org.telegram.ui.Cells.h3
    public final void b(Editable editable) {
        int i10;
        if (this.x) {
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(editable);
        pb0 pb0Var = this.y;
        if (isEmpty) {
            pb0Var.s.setText("");
            return;
        }
        try {
            long parseLong = Long.parseLong(editable.toString());
            if (parseLong > pb0Var.getMessagesController().starsSubscriptionAmountMax) {
                this.x = true;
                parseLong = pb0Var.getMessagesController().starsSubscriptionAmountMax;
                setText(Long.toString(parseLong));
                this.x = false;
            }
            TextView textView = pb0Var.s;
            int i11 = pb0Var.getConnectionsManager().isTestBackend() ? R.string.RequireMonthlyFeePriceTest5Minutes : R.string.RequireMonthlyFeePrice;
            BillingController billingController = BillingController.getInstance();
            i10 = ((org.telegram.ui.ActionBar.p2) pb0Var).currentAccount;
            textView.setText(LocaleController.formatString(i11, billingController.formatCurrency((long) ((parseLong / 1000.0d) * MessagesController.getInstance(i10).starsUsdWithdrawRate1000), "USD")));
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
