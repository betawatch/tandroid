package org.telegram.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.widget.TextView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class i90 extends org.telegram.ui.Cells.k3 {
    public boolean E;
    public final /* synthetic */ k90 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i90(k90 k90Var, Context context, String str, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, str, false, false, -1, h6Var);
        this.F = k90Var;
    }

    @Override // org.telegram.ui.Cells.k3
    public final void b(Editable editable) {
        int i7;
        if (this.E) {
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(editable);
        k90 k90Var = this.F;
        if (isEmpty) {
            k90Var.s.setText("");
            return;
        }
        try {
            long parseLong = Long.parseLong(editable.toString());
            if (parseLong > k90Var.getMessagesController().a6) {
                this.E = true;
                parseLong = k90Var.getMessagesController().a6;
                setText(Long.toString(parseLong));
                this.E = false;
            }
            TextView textView = k90Var.s;
            int i10 = k90Var.getConnectionsManager().isTestBackend() ? 2131746152 : 2131746155;
            org.telegram.messenger.r1 i11 = org.telegram.messenger.r1.i();
            i7 = ((org.telegram.ui.ActionBar.f2) k90Var).currentAccount;
            textView.setText(org.telegram.messenger.id.a0(null, null, i10, i11.f((long) ((parseLong / 1000.0d) * org.telegram.messenger.qp.s1(i7).c6), "USD")));
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
