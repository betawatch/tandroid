package org.telegram.ui.Components;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class kk implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.fj b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ViewGroup d;
    public final /* synthetic */ dk0 e;

    public /* synthetic */ kk(dk0 dk0Var, ViewGroup viewGroup, org.telegram.messenger.fj fjVar, boolean z10, int i7) {
        this.a = i7;
        this.e = dk0Var;
        this.d = viewGroup;
        this.b = fjVar;
        this.c = z10;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.a) {
            case 0:
                org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) this.d;
                i7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                lk lkVar = (lk) this.e;
                org.telegram.ui.vz vzVar = lkVar.I;
                mk mkVar = lkVar.Y;
                boolean x10 = mkVar.b.V2.x();
                boolean z10 = this.c;
                if (!x10) {
                    i7Var.b(false, z10);
                    break;
                } else {
                    org.telegram.messenger.fj fjVar = this.b;
                    int e12 = fjVar.e1();
                    vzVar.a = org.telegram.messenger.fj.B0(fjVar.k);
                    vzVar.b = e12;
                    i7Var.b(mkVar.U.containsKey(vzVar), z10);
                    break;
                }
            case 1:
                org.telegram.ui.Cells.u2 u2Var = (org.telegram.ui.Cells.u2) this.d;
                u2Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.c00 c00Var = ((org.telegram.ui.wz) this.e).c;
                boolean V1 = c00Var.p0.V1();
                boolean z11 = this.c;
                if (!V1) {
                    u2Var.c0(false, z11);
                    break;
                } else {
                    org.telegram.ui.vz vzVar2 = c00Var.T;
                    org.telegram.messenger.fj fjVar2 = this.b;
                    int e13 = fjVar2.e1();
                    vzVar2.a = org.telegram.messenger.fj.B0(fjVar2.k);
                    vzVar2.b = e13;
                    u2Var.c0(c00Var.p0.r0(c00Var.T), z11);
                    break;
                }
            case 2:
                org.telegram.ui.Cells.i7 i7Var2 = (org.telegram.ui.Cells.i7) this.d;
                i7Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.c00 c00Var2 = ((org.telegram.ui.xz) this.e).w;
                boolean V12 = c00Var2.p0.V1();
                boolean z12 = this.c;
                if (!V12) {
                    i7Var2.b(false, z12);
                    break;
                } else {
                    org.telegram.ui.vz vzVar3 = c00Var2.T;
                    org.telegram.messenger.fj fjVar3 = this.b;
                    int e14 = fjVar3.e1();
                    vzVar3.a = org.telegram.messenger.fj.B0(fjVar3.k);
                    vzVar3.b = e14;
                    i7Var2.b(c00Var2.p0.r0(c00Var2.T), z12);
                    break;
                }
            case 3:
                org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) this.d;
                h7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.c00 c00Var3 = ((org.telegram.ui.xz) this.e).w;
                boolean V13 = c00Var3.p0.V1();
                boolean z13 = this.c;
                if (!V13) {
                    h7Var.e(false, z13);
                    break;
                } else {
                    org.telegram.ui.vz vzVar4 = c00Var3.T;
                    org.telegram.messenger.fj fjVar4 = this.b;
                    int e15 = fjVar4.e1();
                    vzVar4.a = org.telegram.messenger.fj.B0(fjVar4.k);
                    vzVar4.b = e15;
                    h7Var.e(c00Var3.p0.r0(c00Var3.T), z13);
                    break;
                }
            default:
                org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) this.d;
                l7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.c00 c00Var4 = ((org.telegram.ui.zz) this.e).w;
                boolean V14 = c00Var4.p0.V1();
                boolean z14 = this.c;
                if (!V14) {
                    l7Var.f(false, z14);
                    break;
                } else {
                    org.telegram.ui.vz vzVar5 = c00Var4.T;
                    org.telegram.messenger.fj fjVar5 = this.b;
                    int e16 = fjVar5.e1();
                    vzVar5.a = org.telegram.messenger.fj.B0(fjVar5.k);
                    vzVar5.b = e16;
                    l7Var.f(c00Var4.p0.r0(c00Var4.T), z14);
                    break;
                }
        }
        return true;
    }
}
