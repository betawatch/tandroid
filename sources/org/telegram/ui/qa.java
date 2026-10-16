package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class qa extends s4.v {
    public final /* synthetic */ va d;

    public qa(va vaVar) {
        this.d = vaVar;
    }

    @Override // s4.v
    public final void a(RecyclerView recyclerView, s4.b1 b1Var) {
        super.a(recyclerView, b1Var);
        View view = b1Var.a;
        view.setPressed(false);
        view.setTag(R.id.dragging, null);
    }

    @Override // s4.v
    public final int e(RecyclerView recyclerView, s4.b1 b1Var) {
        return (b1Var.f == 4 && ((sa) b1Var.a).G) ? s4.v.l(3, 0) : s4.v.l(0, 0);
    }

    @Override // s4.v
    public final boolean n(RecyclerView recyclerView, s4.b1 b1Var, s4.b1 b1Var2) {
        if (b1Var.f != b1Var2.f) {
            return false;
        }
        View view = b1Var2.a;
        if ((view instanceof sa) && !((sa) view).G) {
            return false;
        }
        ma maVar = this.d.c;
        int b10 = b1Var.b();
        int b11 = b1Var2.b();
        int i10 = b10 - 4;
        int i11 = b11 - 4;
        va vaVar = maVar.c;
        ArrayList arrayList = vaVar.v;
        if (i10 < arrayList.size() && i11 < arrayList.size()) {
            if (b10 != b11) {
                vaVar.d = true;
            }
            TLRPC.TL_username tL_username = (TLRPC.TL_username) arrayList.get(i10);
            arrayList.set(i10, (TLRPC.TL_username) arrayList.get(i11));
            arrayList.set(i11, tL_username);
            maVar.p(b10, b11);
            int size = arrayList.size() + 3;
            if (b10 == size || b11 == size) {
                maVar.n(b10, 3);
                maVar.n(b11, 3);
            }
        }
        return true;
    }

    @Override // s4.v
    public final void p(s4.b1 b1Var, int i10) {
        va vaVar = this.d;
        if (i10 == 0) {
            va.Y(vaVar);
        } else {
            vaVar.b.I0(false);
            b1Var.a.setPressed(true);
        }
        if (b1Var != null) {
            b1Var.a.setTag(R.id.dragging, i10 == 2 ? Boolean.TRUE : null);
        }
    }

    @Override // s4.v
    public final void q(s4.b1 b1Var) {
    }
}
