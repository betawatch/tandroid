package org.telegram.ui;

import android.graphics.drawable.ColorDrawable;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class n7 extends f7 {
    public m.o3 n;
    public final ArrayList r;
    public org.telegram.ui.Components.oq s;
    public final /* synthetic */ s7 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n7(s7 s7Var) {
        super(s7Var, 1);
        this.w = s7Var;
        this.r = new ArrayList();
    }

    @Override // org.telegram.ui.f7, org.telegram.ui.e7
    public final void F() {
        super.F();
        ArrayList arrayList = this.r;
        arrayList.clear();
        int i7 = 0;
        while (true) {
            ArrayList arrayList2 = this.e;
            if (i7 >= arrayList2.size()) {
                return;
            }
            arrayList.add(new org.telegram.messenger.ff(0, ((l7) arrayList2.get(i7)).d.a.getPath(), 0, ((l7) arrayList2.get(i7)).d.d == 1, 0, 0));
            i7++;
        }
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        if (this.s == null) {
            org.telegram.ui.Components.oq oqVar = new org.telegram.ui.Components.oq(new ColorDrawable(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.X9, false)), org.telegram.ui.ActionBar.m6.R4);
            this.s = oqVar;
            oqVar.x = true;
        }
        org.telegram.ui.Cells.p7 p7Var = (org.telegram.ui.Cells.p7) f1Var.a;
        ei.b bVar = ((l7) this.e.get(i7)).d;
        Object tag = p7Var.getTag();
        ImageReceiver imageReceiver = p7Var.c;
        boolean z10 = bVar == tag;
        p7Var.setTag(bVar);
        int max = (int) Math.max(100.0f, org.telegram.messenger.g0.c1().x / org.telegram.messenger.g0.p);
        int i10 = bVar.d;
        File file = bVar.a;
        if (i10 == 1) {
            imageReceiver.q0(org.telegram.messenger.gc.g("vthumb://0:" + file.getAbsolutePath()), com.google.android.gms.internal.vision.e2.j(max, "_", max), this.s, null, null, 0);
            p7Var.m(org.telegram.messenger.g0.i0(bVar.c, false, false), true);
        } else {
            imageReceiver.q0(org.telegram.messenger.gc.g("thumb://0:" + file.getAbsolutePath()), com.google.android.gms.internal.vision.e2.j(max, "_", max), this.s, null, null, 0);
            p7Var.m(org.telegram.messenger.g0.i0(bVar.c, false, false), false);
        }
        p7Var.i(this.w.h.j.contains(bVar), z10);
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        if (this.n == null) {
            this.n = new m.o3(viewGroup.getContext(), null);
        }
        m7 m7Var = new m7(this, viewGroup.getContext(), this.n, this.w.e.getCurrentAccount());
        m7Var.setStyle(1);
        return new org.telegram.ui.Components.mj0(m7Var);
    }
}
