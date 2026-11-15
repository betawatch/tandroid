package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.widget.TextView;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class g90 extends org.telegram.ui.Cells.k3 {
    public boolean F;
    public final /* synthetic */ i90 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g90(i90 i90Var, Context context, String str, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, str, false, false, -1, e6Var);
        this.G = i90Var;
    }

    @Override // org.telegram.ui.Cells.k3
    public final void b(Editable editable) {
        int i7;
        if (this.F) {
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(editable);
        i90 i90Var = this.G;
        if (isEmpty) {
            i90Var.s.setText("");
            return;
        }
        try {
            long parseLong = Long.parseLong(editable.toString());
            if (parseLong > i90Var.getMessagesController().b6) {
                this.F = true;
                parseLong = i90Var.getMessagesController().b6;
                setText(Long.toString(parseLong));
                this.F = false;
            }
            TextView textView = i90Var.s;
            int i10 = i90Var.getConnectionsManager().isTestBackend() ? 2131746152 : 2131746155;
            org.telegram.messenger.r1 i11 = org.telegram.messenger.r1.i();
            i7 = ((org.telegram.ui.ActionBar.e2) i90Var).currentAccount;
            textView.setText(org.telegram.messenger.hd.a0(null, null, i10, i11.f((long) ((parseLong / 1000.0d) * org.telegram.messenger.np.s1(i7).d6), "USD")));
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
