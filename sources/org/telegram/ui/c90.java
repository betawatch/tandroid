package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.widget.TextView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class c90 extends org.telegram.ui.Cells.k3 {
    public boolean F;
    public final /* synthetic */ e90 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c90(e90 e90Var, Context context, String str, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, str, false, false, -1, e6Var);
        this.G = e90Var;
    }

    @Override // org.telegram.ui.Cells.k3
    public final void b(Editable editable) {
        int i3;
        if (this.F) {
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(editable);
        e90 e90Var = this.G;
        if (isEmpty) {
            e90Var.s.setText("");
            return;
        }
        try {
            long parseLong = Long.parseLong(editable.toString());
            if (parseLong > e90Var.getMessagesController().a6) {
                this.F = true;
                parseLong = e90Var.getMessagesController().a6;
                setText(Long.toString(parseLong));
                this.F = false;
            }
            TextView textView = e90Var.s;
            int i10 = e90Var.getConnectionsManager().isTestBackend() ? 2131746162 : 2131746165;
            org.telegram.messenger.r1 i11 = org.telegram.messenger.r1.i();
            i3 = ((org.telegram.ui.ActionBar.d2) e90Var).currentAccount;
            textView.setText(org.telegram.messenger.bd.a0(null, null, i10, i11.f((long) ((parseLong / 1000.0d) * org.telegram.messenger.hp.s1(i3).c6), "USD")));
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
