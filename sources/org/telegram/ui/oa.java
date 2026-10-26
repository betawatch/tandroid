package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class oa extends s4.w {
    public final /* synthetic */ ta d;

    public oa(ta taVar) {
        this.d = taVar;
    }

    @Override // s4.w
    public final void a(RecyclerView recyclerView, s4.e1 e1Var) {
        super.a(recyclerView, e1Var);
        View view = e1Var.a;
        view.setPressed(false);
        view.setTag(R.id.dragging, null);
    }

    @Override // s4.w
    public final int e(RecyclerView recyclerView, s4.e1 e1Var) {
        return (e1Var.f == 4 && ((qa) e1Var.a).G) ? s4.w.l(3, 0) : s4.w.l(0, 0);
    }

    @Override // s4.w
    public final boolean n(RecyclerView recyclerView, s4.e1 e1Var, s4.e1 e1Var2) {
        if (e1Var.f != e1Var2.f) {
            return false;
        }
        View view = e1Var2.a;
        if ((view instanceof qa) && !((qa) view).G) {
            return false;
        }
        ka kaVar = this.d.c;
        int b10 = e1Var.b();
        int b11 = e1Var2.b();
        int i10 = b10 - 4;
        int i11 = b11 - 4;
        ta taVar = kaVar.c;
        ArrayList arrayList = taVar.v;
        if (i10 < arrayList.size() && i11 < arrayList.size()) {
            if (b10 != b11) {
                taVar.d = true;
            }
            TLRPC.TL_username tL_username = (TLRPC.TL_username) arrayList.get(i10);
            arrayList.set(i10, (TLRPC.TL_username) arrayList.get(i11));
            arrayList.set(i11, tL_username);
            kaVar.p(b10, b11);
            int size = arrayList.size() + 3;
            if (b10 == size || b11 == size) {
                kaVar.n(b10, 3);
                kaVar.n(b11, 3);
            }
        }
        return true;
    }

    @Override // s4.w
    public final void p(s4.e1 e1Var, int i10) {
        ta taVar = this.d;
        if (i10 == 0) {
            ta.Z(taVar);
        } else {
            taVar.b.I0(false);
            e1Var.a.setPressed(true);
        }
        if (e1Var != null) {
            e1Var.a.setTag(R.id.dragging, i10 == 2 ? Boolean.TRUE : null);
        }
    }

    @Override // s4.w
    public final void q(s4.e1 e1Var) {
    }
}
