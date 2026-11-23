package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.widget.TextView;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class i90 extends org.telegram.ui.Cells.l3 {
    public boolean F;
    public final /* synthetic */ k90 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i90(k90 k90Var, Context context, String str, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, str, false, false, -1, h6Var);
        this.G = k90Var;
    }

    @Override // org.telegram.ui.Cells.l3
    public final void b(Editable editable) {
        int i7;
        if (this.F) {
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(editable);
        k90 k90Var = this.G;
        if (isEmpty) {
            k90Var.s.setText("");
            return;
        }
        try {
            long parseLong = Long.parseLong(editable.toString());
            if (parseLong > k90Var.getMessagesController().d6) {
                this.F = true;
                parseLong = k90Var.getMessagesController().d6;
                setText(Long.toString(parseLong));
                this.F = false;
            }
            TextView textView = k90Var.s;
            int i10 = k90Var.getConnectionsManager().isTestBackend() ? 2131745956 : 2131745959;
            org.telegram.messenger.r1 i11 = org.telegram.messenger.r1.i();
            i7 = ((org.telegram.ui.ActionBar.g2) k90Var).currentAccount;
            textView.setText(org.telegram.messenger.hd.a0(null, null, i10, i11.f((long) ((parseLong / 1000.0d) * org.telegram.messenger.np.u1(i7).f6), "USD")));
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
