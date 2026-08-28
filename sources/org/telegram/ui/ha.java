package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ha extends f2.d0 {
    public final /* synthetic */ ma d;

    public ha(ma maVar) {
        this.d = maVar;
    }

    @Override // f2.d0
    public final void a(RecyclerView recyclerView, f2.q1 q1Var) {
        super.a(recyclerView, q1Var);
        View view = q1Var.a;
        view.setPressed(false);
        view.setTag(R.id.dragging, null);
    }

    @Override // f2.d0
    public final int e(RecyclerView recyclerView, f2.q1 q1Var) {
        return (q1Var.f == 4 && ((ja) q1Var.a).C) ? f2.d0.l(3, 0) : f2.d0.l(0, 0);
    }

    @Override // f2.d0
    public final boolean n(RecyclerView recyclerView, f2.q1 q1Var, f2.q1 q1Var2) {
        if (q1Var.f != q1Var2.f) {
            return false;
        }
        View view = q1Var2.a;
        if ((view instanceof ja) && !((ja) view).C) {
            return false;
        }
        da daVar = this.d.c;
        int b10 = q1Var.b();
        int b11 = q1Var2.b();
        int i9 = b10 - 4;
        int i10 = b11 - 4;
        ma maVar = daVar.c;
        ArrayList arrayList = maVar.v;
        if (i9 < arrayList.size() && i10 < arrayList.size()) {
            if (b10 != b11) {
                maVar.d = true;
            }
            TLRPC.TL_username tL_username = (TLRPC.TL_username) arrayList.get(i9);
            arrayList.set(i9, (TLRPC.TL_username) arrayList.get(i10));
            arrayList.set(i10, tL_username);
            daVar.p(b10, b11);
            int size = arrayList.size() + 3;
            if (b10 == size || b11 == size) {
                daVar.n(b10, 3);
                daVar.n(b11, 3);
            }
        }
        return true;
    }

    @Override // f2.d0
    public final void p(f2.q1 q1Var, int i9) {
        ma maVar = this.d;
        if (i9 == 0) {
            ma.X(maVar);
        } else {
            maVar.b.I0(false);
            q1Var.a.setPressed(true);
        }
        if (q1Var != null) {
            q1Var.a.setTag(R.id.dragging, i9 == 2 ? Boolean.TRUE : null);
        }
    }

    @Override // f2.d0
    public final void q(f2.q1 q1Var) {
    }
}
