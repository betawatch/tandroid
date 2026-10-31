package org.telegram.ui;

import android.graphics.drawable.ColorDrawable;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class o7 extends g7 {
    public m.p3 n;
    public final ArrayList r;
    public org.telegram.ui.Components.eq s;
    public final /* synthetic */ t7 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o7(t7 t7Var) {
        super(t7Var, 1);
        this.w = t7Var;
        this.r = new ArrayList();
    }

    @Override // org.telegram.ui.g7, org.telegram.ui.f7
    public final void F() {
        super.F();
        ArrayList arrayList = this.r;
        arrayList.clear();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.e;
            if (i10 >= arrayList2.size()) {
                return;
            }
            arrayList.add(new org.telegram.messenger.ef(0, ((m7) arrayList2.get(i10)).d.a.getPath(), 0, ((m7) arrayList2.get(i10)).d.d == 1, 0, 0));
            i10++;
        }
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        if (this.s == null) {
            org.telegram.ui.Components.eq eqVar = new org.telegram.ui.Components.eq(new ColorDrawable(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.X9, false)), org.telegram.ui.ActionBar.t6.R4);
            this.s = eqVar;
            eqVar.x = true;
        }
        org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) c1Var.a;
        sh.a aVar = ((m7) this.e.get(i10)).d;
        Object tag = s7Var.getTag();
        ImageReceiver imageReceiver = s7Var.c;
        boolean z10 = aVar == tag;
        s7Var.setTag(aVar);
        int max = (int) Math.max(100.0f, org.telegram.messenger.i0.c1().x / org.telegram.messenger.i0.p);
        int i11 = aVar.d;
        File file = aVar.a;
        if (i11 == 1) {
            imageReceiver.q0(org.telegram.messenger.ic.g("vthumb://0:" + file.getAbsolutePath()), a1.g.i(max, max, "_"), this.s, null, null, 0);
            s7Var.m(org.telegram.messenger.i0.i0(aVar.c, false, false), true);
        } else {
            imageReceiver.q0(org.telegram.messenger.ic.g("thumb://0:" + file.getAbsolutePath()), a1.g.i(max, max, "_"), this.s, null, null, 0);
            s7Var.m(org.telegram.messenger.i0.i0(aVar.c, false, false), false);
        }
        s7Var.i(this.w.h.j.contains(aVar), z10);
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        if (this.n == null) {
            this.n = new m.p3(viewGroup.getContext(), (org.telegram.ui.ActionBar.p6) null);
        }
        n7 n7Var = new n7(this, viewGroup.getContext(), this.n, this.w.e.getCurrentAccount());
        n7Var.setStyle(1);
        return new org.telegram.ui.Components.ck0(n7Var);
    }
}
