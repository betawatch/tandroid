package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ia extends f2.c0 {
    public final /* synthetic */ na d;

    public ia(na naVar) {
        this.d = naVar;
    }

    @Override // f2.c0
    public final void a(RecyclerView recyclerView, f2.o1 o1Var) {
        super.a(recyclerView, o1Var);
        View view = o1Var.a;
        view.setPressed(false);
        view.setTag(R.id.dragging, null);
    }

    @Override // f2.c0
    public final int e(RecyclerView recyclerView, f2.o1 o1Var) {
        return (o1Var.f == 4 && ((ka) o1Var.a).C) ? f2.c0.l(3, 0) : f2.c0.l(0, 0);
    }

    @Override // f2.c0
    public final boolean n(RecyclerView recyclerView, f2.o1 o1Var, f2.o1 o1Var2) {
        if (o1Var.f != o1Var2.f) {
            return false;
        }
        View view = o1Var2.a;
        if ((view instanceof ka) && !((ka) view).C) {
            return false;
        }
        ea eaVar = this.d.c;
        int b10 = o1Var.b();
        int b11 = o1Var2.b();
        int i10 = b10 - 4;
        int i11 = b11 - 4;
        na naVar = eaVar.c;
        ArrayList arrayList = naVar.v;
        if (i10 < arrayList.size() && i11 < arrayList.size()) {
            if (b10 != b11) {
                naVar.d = true;
            }
            TLRPC.TL_username tL_username = (TLRPC.TL_username) arrayList.get(i10);
            arrayList.set(i10, (TLRPC.TL_username) arrayList.get(i11));
            arrayList.set(i11, tL_username);
            eaVar.p(b10, b11);
            int size = arrayList.size() + 3;
            if (b10 == size || b11 == size) {
                eaVar.n(b10, 3);
                eaVar.n(b11, 3);
            }
        }
        return true;
    }

    @Override // f2.c0
    public final void p(f2.o1 o1Var, int i10) {
        na naVar = this.d;
        if (i10 == 0) {
            na.Y(naVar);
        } else {
            naVar.b.I0(false);
            o1Var.a.setPressed(true);
        }
        if (o1Var != null) {
            o1Var.a.setTag(R.id.dragging, i10 == 2 ? Boolean.TRUE : null);
        }
    }

    @Override // f2.c0
    public final void q(f2.o1 o1Var) {
    }
}
