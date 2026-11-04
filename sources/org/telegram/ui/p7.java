package org.telegram.ui;

import android.graphics.drawable.ColorDrawable;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class p7 extends h7 {
    public m.o3 n;
    public final ArrayList r;
    public org.telegram.ui.Components.xp s;
    public final /* synthetic */ u7 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p7(u7 u7Var) {
        super(u7Var, 1);
        this.w = u7Var;
        this.r = new ArrayList();
    }

    @Override // org.telegram.ui.h7, org.telegram.ui.g7
    public final void F() {
        super.F();
        ArrayList arrayList = this.r;
        arrayList.clear();
        int i3 = 0;
        while (true) {
            ArrayList arrayList2 = this.e;
            if (i3 >= arrayList2.size()) {
                return;
            }
            arrayList.add(new org.telegram.messenger.ye(0, ((n7) arrayList2.get(i3)).d.a.getPath(), 0, ((n7) arrayList2.get(i3)).d.d == 1, 0, 0));
            i3++;
        }
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        if (this.s == null) {
            org.telegram.ui.Components.xp xpVar = new org.telegram.ui.Components.xp(new ColorDrawable(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.X9, false)), org.telegram.ui.ActionBar.k6.R4);
            this.s = xpVar;
            xpVar.x = true;
        }
        org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) d1Var.a;
        di.b bVar = ((n7) this.e.get(i3)).d;
        Object tag = n7Var.getTag();
        ImageReceiver imageReceiver = n7Var.c;
        boolean z10 = bVar == tag;
        n7Var.setTag(bVar);
        int max = (int) Math.max(100.0f, org.telegram.messenger.g0.c1().x / org.telegram.messenger.g0.p);
        int i10 = bVar.d;
        File file = bVar.a;
        if (i10 == 1) {
            imageReceiver.q0(org.telegram.messenger.ac.g("vthumb://0:" + file.getAbsolutePath()), com.google.android.recaptcha.internal.a.i(max, "_", max), this.s, null, null, 0);
            n7Var.m(org.telegram.messenger.g0.i0(bVar.c, false, false), true);
        } else {
            imageReceiver.q0(org.telegram.messenger.ac.g("thumb://0:" + file.getAbsolutePath()), com.google.android.recaptcha.internal.a.i(max, "_", max), this.s, null, null, 0);
            n7Var.m(org.telegram.messenger.g0.i0(bVar.c, false, false), false);
        }
        n7Var.i(this.w.h.j.contains(bVar), z10);
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        if (this.n == null) {
            this.n = new m.o3(viewGroup.getContext(), null);
        }
        o7 o7Var = new o7(this, viewGroup.getContext(), this.n, this.w.e.getCurrentAccount());
        o7Var.setStyle(1);
        return new org.telegram.ui.Components.bj0(o7Var);
    }
}
