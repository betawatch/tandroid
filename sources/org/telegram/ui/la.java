package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class la extends s4.v {
    public final /* synthetic */ qa d;

    public la(qa qaVar) {
        this.d = qaVar;
    }

    @Override // s4.v
    public final void a(RecyclerView recyclerView, s4.c1 c1Var) {
        super.a(recyclerView, c1Var);
        View view = c1Var.a;
        view.setPressed(false);
        view.setTag(R.id.dragging, null);
    }

    @Override // s4.v
    public final int e(RecyclerView recyclerView, s4.c1 c1Var) {
        return (c1Var.f == 4 && ((na) c1Var.a).G) ? s4.v.l(3, 0) : s4.v.l(0, 0);
    }

    @Override // s4.v
    public final boolean n(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2) {
        if (c1Var.f != c1Var2.f) {
            return false;
        }
        View view = c1Var2.a;
        if ((view instanceof na) && !((na) view).G) {
            return false;
        }
        ha haVar = this.d.c;
        int b10 = c1Var.b();
        int b11 = c1Var2.b();
        int i10 = b10 - 4;
        int i11 = b11 - 4;
        qa qaVar = haVar.c;
        ArrayList arrayList = qaVar.v;
        if (i10 < arrayList.size() && i11 < arrayList.size()) {
            if (b10 != b11) {
                qaVar.d = true;
            }
            TLRPC.TL_username tL_username = (TLRPC.TL_username) arrayList.get(i10);
            arrayList.set(i10, (TLRPC.TL_username) arrayList.get(i11));
            arrayList.set(i11, tL_username);
            haVar.p(b10, b11);
            int size = arrayList.size() + 3;
            if (b10 == size || b11 == size) {
                haVar.n(b10, 3);
                haVar.n(b11, 3);
            }
        }
        return true;
    }

    @Override // s4.v
    public final void p(s4.c1 c1Var, int i10) {
        qa qaVar = this.d;
        if (i10 == 0) {
            qa.Y(qaVar);
        } else {
            qaVar.b.I0(false);
            c1Var.a.setPressed(true);
        }
        if (c1Var != null) {
            c1Var.a.setTag(R.id.dragging, i10 == 2 ? Boolean.TRUE : null);
        }
    }

    @Override // s4.v
    public final void q(s4.c1 c1Var) {
    }
}
