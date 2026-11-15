package org.telegram.ui;

import android.graphics.drawable.ColorDrawable;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class o7 extends g7 {
    public m.o3 n;
    public final ArrayList r;
    public org.telegram.ui.Components.fq s;
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
        int i7 = 0;
        while (true) {
            ArrayList arrayList2 = this.e;
            if (i7 >= arrayList2.size()) {
                return;
            }
            arrayList.add(new org.telegram.messenger.ff(0, ((m7) arrayList2.get(i7)).d.a.getPath(), 0, ((m7) arrayList2.get(i7)).d.d == 1, 0, 0));
            i7++;
        }
    }

    @Override // v4.h0
    public final void t(v4.e1 e1Var, int i7) {
        if (this.s == null) {
            org.telegram.ui.Components.fq fqVar = new org.telegram.ui.Components.fq(new ColorDrawable(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.X9, false)), org.telegram.ui.ActionBar.j6.R4);
            this.s = fqVar;
            fqVar.x = true;
        }
        org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) e1Var.a;
        ei.b bVar = ((m7) this.e.get(i7)).d;
        Object tag = n7Var.getTag();
        ImageReceiver imageReceiver = n7Var.c;
        boolean z10 = bVar == tag;
        n7Var.setTag(bVar);
        int max = (int) Math.max(100.0f, org.telegram.messenger.g0.c1().x / org.telegram.messenger.g0.p);
        int i10 = bVar.d;
        File file = bVar.a;
        if (i10 == 1) {
            imageReceiver.q0(org.telegram.messenger.gc.g("vthumb://0:" + file.getAbsolutePath()), com.google.android.gms.internal.vision.e2.j(max, "_", max), this.s, null, null, 0);
            n7Var.m(org.telegram.messenger.g0.i0(bVar.c, false, false), true);
        } else {
            imageReceiver.q0(org.telegram.messenger.gc.g("thumb://0:" + file.getAbsolutePath()), com.google.android.gms.internal.vision.e2.j(max, "_", max), this.s, null, null, 0);
            n7Var.m(org.telegram.messenger.g0.i0(bVar.c, false, false), false);
        }
        n7Var.i(this.w.h.j.contains(bVar), z10);
    }

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        if (this.n == null) {
            this.n = new m.o3(viewGroup.getContext(), null);
        }
        n7 n7Var = new n7(this, viewGroup.getContext(), this.n, this.w.e.getCurrentAccount());
        n7Var.setStyle(1);
        return new org.telegram.ui.Components.cj0(n7Var);
    }
}
