package org.telegram.ui.Components;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class bk implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.gj b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ViewGroup d;
    public final /* synthetic */ tj0 e;

    public /* synthetic */ bk(tj0 tj0Var, ViewGroup viewGroup, org.telegram.messenger.gj gjVar, boolean z10, int i7) {
        this.a = i7;
        this.e = tj0Var;
        this.d = viewGroup;
        this.b = gjVar;
        this.c = z10;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.a) {
            case 0:
                org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) this.d;
                g7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                ck ckVar = (ck) this.e;
                org.telegram.ui.sz szVar = ckVar.I;
                dk dkVar = ckVar.Y;
                boolean x10 = dkVar.b.V2.x();
                boolean z10 = this.c;
                if (!x10) {
                    g7Var.b(false, z10);
                    break;
                } else {
                    org.telegram.messenger.gj gjVar = this.b;
                    int e12 = gjVar.e1();
                    szVar.a = org.telegram.messenger.gj.B0(gjVar.k);
                    szVar.b = e12;
                    g7Var.b(dkVar.U.containsKey(szVar), z10);
                    break;
                }
            case 1:
                org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) this.d;
                t2Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.zz zzVar = ((org.telegram.ui.tz) this.e).c;
                boolean g02 = zzVar.p0.g0();
                boolean z11 = this.c;
                if (!g02) {
                    t2Var.e0(false, z11);
                    break;
                } else {
                    org.telegram.ui.sz szVar2 = zzVar.T;
                    org.telegram.messenger.gj gjVar2 = this.b;
                    int e13 = gjVar2.e1();
                    szVar2.a = org.telegram.messenger.gj.B0(gjVar2.k);
                    szVar2.b = e13;
                    t2Var.e0(zzVar.p0.l(zzVar.T), z11);
                    break;
                }
            case 2:
                org.telegram.ui.Cells.g7 g7Var2 = (org.telegram.ui.Cells.g7) this.d;
                g7Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.zz zzVar2 = ((org.telegram.ui.uz) this.e).w;
                boolean g03 = zzVar2.p0.g0();
                boolean z12 = this.c;
                if (!g03) {
                    g7Var2.b(false, z12);
                    break;
                } else {
                    org.telegram.ui.sz szVar3 = zzVar2.T;
                    org.telegram.messenger.gj gjVar3 = this.b;
                    int e14 = gjVar3.e1();
                    szVar3.a = org.telegram.messenger.gj.B0(gjVar3.k);
                    szVar3.b = e14;
                    g7Var2.b(zzVar2.p0.l(zzVar2.T), z12);
                    break;
                }
            case 3:
                org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) this.d;
                f7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.zz zzVar3 = ((org.telegram.ui.uz) this.e).w;
                boolean g04 = zzVar3.p0.g0();
                boolean z13 = this.c;
                if (!g04) {
                    f7Var.e(false, z13);
                    break;
                } else {
                    org.telegram.ui.sz szVar4 = zzVar3.T;
                    org.telegram.messenger.gj gjVar4 = this.b;
                    int e15 = gjVar4.e1();
                    szVar4.a = org.telegram.messenger.gj.B0(gjVar4.k);
                    szVar4.b = e15;
                    f7Var.e(zzVar3.p0.l(zzVar3.T), z13);
                    break;
                }
            default:
                org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) this.d;
                j7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.zz zzVar4 = ((org.telegram.ui.wz) this.e).w;
                boolean g05 = zzVar4.p0.g0();
                boolean z14 = this.c;
                if (!g05) {
                    j7Var.f(false, z14);
                    break;
                } else {
                    org.telegram.ui.sz szVar5 = zzVar4.T;
                    org.telegram.messenger.gj gjVar5 = this.b;
                    int e16 = gjVar5.e1();
                    szVar5.a = org.telegram.messenger.gj.B0(gjVar5.k);
                    szVar5.b = e16;
                    j7Var.f(zzVar4.p0.l(zzVar4.T), z14);
                    break;
                }
        }
        return true;
    }
}
