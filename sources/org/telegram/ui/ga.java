package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ga extends f2.b0 {
    public final /* synthetic */ la d;

    public ga(la laVar) {
        this.d = laVar;
    }

    @Override // f2.b0
    public final void a(RecyclerView recyclerView, f2.n1 n1Var) {
        super.a(recyclerView, n1Var);
        View view = n1Var.a;
        view.setPressed(false);
        view.setTag(R.id.dragging, null);
    }

    @Override // f2.b0
    public final int e(RecyclerView recyclerView, f2.n1 n1Var) {
        return (n1Var.f == 4 && ((ia) n1Var.a).C) ? f2.b0.l(3, 0) : f2.b0.l(0, 0);
    }

    @Override // f2.b0
    public final boolean n(RecyclerView recyclerView, f2.n1 n1Var, f2.n1 n1Var2) {
        if (n1Var.f != n1Var2.f) {
            return false;
        }
        View view = n1Var2.a;
        if ((view instanceof ia) && !((ia) view).C) {
            return false;
        }
        ca caVar = this.d.c;
        int b10 = n1Var.b();
        int b11 = n1Var2.b();
        int i10 = b10 - 4;
        int i11 = b11 - 4;
        la laVar = caVar.c;
        ArrayList arrayList = laVar.v;
        if (i10 < arrayList.size() && i11 < arrayList.size()) {
            if (b10 != b11) {
                laVar.d = true;
            }
            TLRPC.TL_username tL_username = (TLRPC.TL_username) arrayList.get(i10);
            arrayList.set(i10, (TLRPC.TL_username) arrayList.get(i11));
            arrayList.set(i11, tL_username);
            caVar.p(b10, b11);
            int size = arrayList.size() + 3;
            if (b10 == size || b11 == size) {
                caVar.n(b10, 3);
                caVar.n(b11, 3);
            }
        }
        return true;
    }

    @Override // f2.b0
    public final void p(f2.n1 n1Var, int i10) {
        la laVar = this.d;
        if (i10 == 0) {
            la.Y(laVar);
        } else {
            laVar.b.I0(false);
            n1Var.a.setPressed(true);
        }
        if (n1Var != null) {
            n1Var.a.setTag(R.id.dragging, i10 == 2 ? Boolean.TRUE : null);
        }
    }

    @Override // f2.b0
    public final void q(f2.n1 n1Var) {
    }
}
