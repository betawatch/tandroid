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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class qb0 extends org.telegram.ui.Cells.i3 {
    public boolean x;
    public final /* synthetic */ sb0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qb0(sb0 sb0Var, Context context, String str, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, str, false, false, -1, d6Var);
        this.y = sb0Var;
    }

    @Override // org.telegram.ui.Cells.i3
    public final void b(Editable editable) {
        int i10;
        if (this.x) {
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(editable);
        sb0 sb0Var = this.y;
        if (isEmpty) {
            sb0Var.s.setText("");
            return;
        }
        try {
            long parseLong = Long.parseLong(editable.toString());
            if (parseLong > sb0Var.getMessagesController().starsSubscriptionAmountMax) {
                this.x = true;
                parseLong = sb0Var.getMessagesController().starsSubscriptionAmountMax;
                setText(Long.toString(parseLong));
                this.x = false;
            }
            TextView textView = sb0Var.s;
            int i11 = sb0Var.getConnectionsManager().isTestBackend() ? R.string.RequireMonthlyFeePriceTest5Minutes : R.string.RequireMonthlyFeePrice;
            BillingController billingController = BillingController.getInstance();
            i10 = ((org.telegram.ui.ActionBar.n2) sb0Var).currentAccount;
            textView.setText(LocaleController.formatString(i11, billingController.formatCurrency((long) ((parseLong / 1000.0d) * MessagesController.getInstance(i10).starsUsdWithdrawRate1000), "USD")));
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
