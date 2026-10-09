package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class ma extends s4.w {
    public final /* synthetic */ ra d;

    public ma(ra raVar) {
        this.d = raVar;
    }

    @Override // s4.w
    public final void a(RecyclerView recyclerView, s4.d1 d1Var) {
        super.a(recyclerView, d1Var);
        View view = d1Var.a;
        view.setPressed(false);
        view.setTag(R.id.dragging, null);
    }

    @Override // s4.w
    public final int e(RecyclerView recyclerView, s4.d1 d1Var) {
        return (d1Var.f == 4 && ((oa) d1Var.a).G) ? s4.w.l(3, 0) : s4.w.l(0, 0);
    }

    @Override // s4.w
    public final boolean n(RecyclerView recyclerView, s4.d1 d1Var, s4.d1 d1Var2) {
        if (d1Var.f != d1Var2.f) {
            return false;
        }
        View view = d1Var2.a;
        if ((view instanceof oa) && !((oa) view).G) {
            return false;
        }
        ia iaVar = this.d.c;
        int b10 = d1Var.b();
        int b11 = d1Var2.b();
        int i10 = b10 - 4;
        int i11 = b11 - 4;
        ra raVar = iaVar.c;
        ArrayList arrayList = raVar.v;
        if (i10 < arrayList.size() && i11 < arrayList.size()) {
            if (b10 != b11) {
                raVar.d = true;
            }
            TLRPC.TL_username tL_username = (TLRPC.TL_username) arrayList.get(i10);
            arrayList.set(i10, (TLRPC.TL_username) arrayList.get(i11));
            arrayList.set(i11, tL_username);
            iaVar.p(b10, b11);
            int size = arrayList.size() + 3;
            if (b10 == size || b11 == size) {
                iaVar.n(b10, 3);
                iaVar.n(b11, 3);
            }
        }
        return true;
    }

    @Override // s4.w
    public final void p(s4.d1 d1Var, int i10) {
        ra raVar = this.d;
        if (i10 == 0) {
            ra.Y(raVar);
        } else {
            raVar.b.I0(false);
            d1Var.a.setPressed(true);
        }
        if (d1Var != null) {
            d1Var.a.setTag(R.id.dragging, i10 == 2 ? Boolean.TRUE : null);
        }
    }

    @Override // s4.w
    public final void q(s4.d1 d1Var) {
    }
}
