package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.widget.TextView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ka0 extends org.telegram.ui.Cells.m3 {
    public boolean E;
    public final /* synthetic */ ma0 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ka0(ma0 ma0Var, Context context, String str, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, str, false, false, -1, p6Var);
        this.F = ma0Var;
    }

    @Override // org.telegram.ui.Cells.m3
    public final void b(Editable editable) {
        int i10;
        if (this.E) {
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(editable);
        ma0 ma0Var = this.F;
        if (isEmpty) {
            ma0Var.s.setText("");
            return;
        }
        try {
            long parseLong = Long.parseLong(editable.toString());
            if (parseLong > ma0Var.getMessagesController().b6) {
                this.E = true;
                parseLong = ma0Var.getMessagesController().b6;
                setText(Long.toString(parseLong));
                this.E = false;
            }
            TextView textView = ma0Var.s;
            int i11 = ma0Var.getConnectionsManager().isTestBackend() ? 2131746169 : 2131746172;
            org.telegram.messenger.u1 i12 = org.telegram.messenger.u1.i();
            i10 = ((org.telegram.ui.ActionBar.k2) ma0Var).currentAccount;
            textView.setText(org.telegram.messenger.cd.a0(null, null, i11, i12.f((long) ((parseLong / 1000.0d) * org.telegram.messenger.vp.r1(i10).d6), "USD")));
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }
}
