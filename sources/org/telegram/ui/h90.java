package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.widget.TextView;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class h90 extends org.telegram.ui.Cells.l3 {
    public boolean F;
    public final /* synthetic */ j90 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h90(j90 j90Var, Context context, String str, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, str, false, false, -1, i6Var);
        this.G = j90Var;
    }

    @Override // org.telegram.ui.Cells.l3
    public final void b(Editable editable) {
        int i7;
        if (this.F) {
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(editable);
        j90 j90Var = this.G;
        if (isEmpty) {
            j90Var.s.setText("");
            return;
        }
        try {
            long parseLong = Long.parseLong(editable.toString());
            if (parseLong > j90Var.getMessagesController().d6) {
                this.F = true;
                parseLong = j90Var.getMessagesController().d6;
                setText(Long.toString(parseLong));
                this.F = false;
            }
            TextView textView = j90Var.s;
            int i10 = j90Var.getConnectionsManager().isTestBackend() ? 2131745956 : 2131745959;
            org.telegram.messenger.r1 i11 = org.telegram.messenger.r1.i();
            i7 = ((org.telegram.ui.ActionBar.g2) j90Var).currentAccount;
            textView.setText(org.telegram.messenger.gd.a0(null, null, i10, i11.f((long) ((parseLong / 1000.0d) * org.telegram.messenger.mp.u1(i7).f6), "USD")));
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
