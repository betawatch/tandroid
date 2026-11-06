package org.telegram.ui;

import android.graphics.drawable.ColorDrawable;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class o7 extends g7 {
    public m.q3 n;
    public final ArrayList r;
    public org.telegram.ui.Components.xp s;
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
            arrayList.add(new org.telegram.messenger.gf(0, ((m7) arrayList2.get(i7)).d.a.getPath(), 0, ((m7) arrayList2.get(i7)).d.d == 1, 0, 0));
            i7++;
        }
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        if (this.s == null) {
            org.telegram.ui.Components.xp xpVar = new org.telegram.ui.Components.xp(new ColorDrawable(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.X9, false)), org.telegram.ui.ActionBar.k6.R4);
            this.s = xpVar;
            xpVar.x = true;
        }
        org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) d1Var.a;
        ci.b bVar = ((m7) this.e.get(i7)).d;
        Object tag = o7Var.getTag();
        ImageReceiver imageReceiver = o7Var.c;
        boolean z9 = bVar == tag;
        o7Var.setTag(bVar);
        int max = (int) Math.max(100.0f, org.telegram.messenger.g0.c1().x / org.telegram.messenger.g0.p);
        int i10 = bVar.d;
        File file = bVar.a;
        if (i10 == 1) {
            imageReceiver.q0(org.telegram.messenger.hc.g("vthumb://0:" + file.getAbsolutePath()), com.google.android.recaptcha.internal.a.j(max, "_", max), this.s, null, null, 0);
            o7Var.m(org.telegram.messenger.g0.i0(bVar.c, false, false), true);
        } else {
            imageReceiver.q0(org.telegram.messenger.hc.g("thumb://0:" + file.getAbsolutePath()), com.google.android.recaptcha.internal.a.j(max, "_", max), this.s, null, null, 0);
            o7Var.m(org.telegram.messenger.g0.i0(bVar.c, false, false), false);
        }
        o7Var.i(this.w.h.j.contains(bVar), z9);
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        if (this.n == null) {
            this.n = new m.q3(viewGroup.getContext(), null);
        }
        n7 n7Var = new n7(this, viewGroup.getContext(), this.n, this.w.e.getCurrentAccount());
        n7Var.setStyle(1);
        return new org.telegram.ui.Components.xi0(n7Var);
    }
}
