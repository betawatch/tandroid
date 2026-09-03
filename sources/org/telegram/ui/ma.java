package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ma extends f2.b0 {
    public final /* synthetic */ ra d;

    public ma(ra raVar) {
        this.d = raVar;
    }

    @Override // f2.b0
    public final void a(RecyclerView recyclerView, f2.l1 l1Var) {
        super.a(recyclerView, l1Var);
        View view = l1Var.a;
        view.setPressed(false);
        view.setTag(R.id.dragging, null);
    }

    @Override // f2.b0
    public final int e(RecyclerView recyclerView, f2.l1 l1Var) {
        return (l1Var.f == 4 && ((oa) l1Var.a).D) ? f2.b0.l(3, 0) : f2.b0.l(0, 0);
    }

    @Override // f2.b0
    public final boolean n(RecyclerView recyclerView, f2.l1 l1Var, f2.l1 l1Var2) {
        if (l1Var.f != l1Var2.f) {
            return false;
        }
        View view = l1Var2.a;
        if ((view instanceof oa) && !((oa) view).D) {
            return false;
        }
        ia iaVar = this.d.c;
        int b10 = l1Var.b();
        int b11 = l1Var2.b();
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

    @Override // f2.b0
    public final void p(f2.l1 l1Var, int i10) {
        ra raVar = this.d;
        if (i10 == 0) {
            ra.Y(raVar);
        } else {
            raVar.b.I0(false);
            l1Var.a.setPressed(true);
        }
        if (l1Var != null) {
            l1Var.a.setTag(R.id.dragging, i10 == 2 ? Boolean.TRUE : null);
        }
    }

    @Override // f2.b0
    public final void q(f2.l1 l1Var) {
    }
}
