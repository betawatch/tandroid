package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ka extends f2.b0 {
    public final /* synthetic */ pa d;

    public ka(pa paVar) {
        this.d = paVar;
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
        return (l1Var.f == 4 && ((ma) l1Var.a).D) ? f2.b0.l(3, 0) : f2.b0.l(0, 0);
    }

    @Override // f2.b0
    public final boolean n(RecyclerView recyclerView, f2.l1 l1Var, f2.l1 l1Var2) {
        if (l1Var.f != l1Var2.f) {
            return false;
        }
        View view = l1Var2.a;
        if ((view instanceof ma) && !((ma) view).D) {
            return false;
        }
        ga gaVar = this.d.c;
        int b10 = l1Var.b();
        int b11 = l1Var2.b();
        int i10 = b10 - 4;
        int i11 = b11 - 4;
        pa paVar = gaVar.c;
        ArrayList arrayList = paVar.v;
        if (i10 < arrayList.size() && i11 < arrayList.size()) {
            if (b10 != b11) {
                paVar.d = true;
            }
            TLRPC.TL_username tL_username = (TLRPC.TL_username) arrayList.get(i10);
            arrayList.set(i10, (TLRPC.TL_username) arrayList.get(i11));
            arrayList.set(i11, tL_username);
            gaVar.p(b10, b11);
            int size = arrayList.size() + 3;
            if (b10 == size || b11 == size) {
                gaVar.n(b10, 3);
                gaVar.n(b11, 3);
            }
        }
        return true;
    }

    @Override // f2.b0
    public final void p(f2.l1 l1Var, int i10) {
        pa paVar = this.d;
        if (i10 == 0) {
            pa.Y(paVar);
        } else {
            paVar.b.I0(false);
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
