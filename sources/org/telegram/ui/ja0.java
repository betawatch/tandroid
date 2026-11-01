package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.widget.TextView;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class ja0 extends org.telegram.ui.Cells.m3 {
    public boolean E;
    public final /* synthetic */ la0 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ja0(la0 la0Var, Context context, String str, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, str, false, false, -1, p6Var);
        this.F = la0Var;
    }

    @Override // org.telegram.ui.Cells.m3
    public final void b(Editable editable) {
        int i10;
        if (this.E) {
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(editable);
        la0 la0Var = this.F;
        if (isEmpty) {
            la0Var.s.setText("");
            return;
        }
        try {
            long parseLong = Long.parseLong(editable.toString());
            if (parseLong > la0Var.getMessagesController().b6) {
                this.E = true;
                parseLong = la0Var.getMessagesController().b6;
                setText(Long.toString(parseLong));
                this.E = false;
            }
            TextView textView = la0Var.s;
            int i11 = la0Var.getConnectionsManager().isTestBackend() ? 2131746169 : 2131746172;
            org.telegram.messenger.u1 i12 = org.telegram.messenger.u1.i();
            i10 = ((org.telegram.ui.ActionBar.k2) la0Var).currentAccount;
            textView.setText(org.telegram.messenger.dd.a0(null, null, i11, i12.f((long) ((parseLong / 1000.0d) * org.telegram.messenger.wp.r1(i10).d6), "USD")));
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }
}
