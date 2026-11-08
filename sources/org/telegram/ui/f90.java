package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.widget.TextView;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class f90 extends org.telegram.ui.Cells.k3 {
    public boolean E;
    public final /* synthetic */ h90 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f90(h90 h90Var, Context context, String str, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, str, false, false, -1, f6Var);
        this.F = h90Var;
    }

    @Override // org.telegram.ui.Cells.k3
    public final void b(Editable editable) {
        int i7;
        if (this.E) {
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(editable);
        h90 h90Var = this.F;
        if (isEmpty) {
            h90Var.s.setText("");
            return;
        }
        try {
            long parseLong = Long.parseLong(editable.toString());
            if (parseLong > h90Var.getMessagesController().a6) {
                this.E = true;
                parseLong = h90Var.getMessagesController().a6;
                setText(Long.toString(parseLong));
                this.E = false;
            }
            TextView textView = h90Var.s;
            int i10 = h90Var.getConnectionsManager().isTestBackend() ? 2131746155 : 2131746158;
            org.telegram.messenger.r1 i11 = org.telegram.messenger.r1.i();
            i7 = ((org.telegram.ui.ActionBar.f2) h90Var).currentAccount;
            textView.setText(org.telegram.messenger.id.a0(null, null, i10, i11.f((long) ((parseLong / 1000.0d) * org.telegram.messenger.qp.s1(i7).c6), "USD")));
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
