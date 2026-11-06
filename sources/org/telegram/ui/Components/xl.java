package org.telegram.ui.Components;

import android.graphics.RectF;
import android.os.Build;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class xl extends org.telegram.ui.nq0 {
    public ArrayList a = new ArrayList();
    public final /* synthetic */ am b;

    public xl(am amVar) {
        this.b = amVar;
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final void D() {
        am amVar = this.b;
        amVar.c();
        amVar.i(amVar.P.P, false);
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final org.telegram.ui.wq0 E(org.telegram.messenger.ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        org.telegram.messenger.gf gfVar;
        ArrayList arrayList;
        am amVar = this.b;
        ArrayList arrayList2 = amVar.b;
        bm bmVar = amVar.P;
        if (i7 >= 0 && i7 < this.a.size() && x(i7) && (gfVar = (org.telegram.messenger.gf) this.a.get(i7)) != null) {
            int size = arrayList2.size();
            zl zlVar = null;
            yl ylVar = null;
            for (int i10 = 0; i10 < size; i10++) {
                zlVar = (zl) arrayList2.get(i10);
                if (zlVar != null && (arrayList = zlVar.h) != null) {
                    int size2 = arrayList.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 >= size2) {
                            break;
                        }
                        yl ylVar2 = (yl) arrayList.get(i11);
                        if (ylVar2 != null && ylVar2.b == gfVar && ylVar2.k > 0.5d) {
                            ylVar = (yl) arrayList.get(i11);
                            break;
                        }
                        i11++;
                    }
                    if (ylVar != null) {
                        break;
                    }
                }
            }
            if (zlVar != null && ylVar != null) {
                org.telegram.ui.wq0 wq0Var = new org.telegram.ui.wq0();
                int[] iArr = new int[2];
                amVar.getLocationInWindow(iArr);
                if (Build.VERSION.SDK_INT < 26) {
                    iArr[0] = iArr[0] - bmVar.b.S();
                }
                wq0Var.b = iArr[0];
                wq0Var.c = iArr[1] + ((int) zlVar.a);
                wq0Var.k = 1.0f;
                wq0Var.d = amVar;
                ImageReceiver imageReceiver = ylVar.c;
                wq0Var.a = imageReceiver;
                wq0Var.e = imageReceiver.p();
                wq0Var.h = new int[]{(int) r8.left, (int) r8.top, (int) r8.right, (int) r8.bottom};
                RectF rectF = ylVar.q;
                wq0Var.j = (int) (-amVar.getY());
                wq0Var.i = amVar.getHeight() - ((int) (((-amVar.getY()) + bmVar.r.getHeight()) - bmVar.b.Z0()));
                return wq0Var;
            }
        }
        return null;
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final int H() {
        return this.b.h.size();
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final int R(Object obj) {
        int indexOf;
        Integer valueOf = Integer.valueOf(((org.telegram.messenger.gf) obj).C);
        am amVar = this.b;
        if (amVar.h.size() <= 1 || (indexOf = amVar.h.indexOf(valueOf)) < 0) {
            return -1;
        }
        amVar.h.remove(indexOf);
        amVar.c();
        return indexOf;
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final int S(int i7) {
        org.telegram.messenger.gf gfVar;
        if (i7 < 0 || i7 >= this.a.size() || (gfVar = (org.telegram.messenger.gf) this.a.get(i7)) == null) {
            return -1;
        }
        return this.b.h.indexOf(Integer.valueOf(gfVar.C));
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final void X(int i7) {
        org.telegram.messenger.gf gfVar;
        ArrayList arrayList;
        boolean z9;
        if (i7 < 0 || i7 >= this.a.size() || (gfVar = (org.telegram.messenger.gf) this.a.get(i7)) == null) {
            return;
        }
        int i10 = gfVar.C;
        am amVar = this.b;
        amVar.invalidate();
        for (int i11 = 0; i11 < amVar.b.size(); i11++) {
            zl zlVar = (zl) amVar.b.get(i11);
            if (zlVar != null && (arrayList = zlVar.h) != null) {
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    yl ylVar = (yl) arrayList.get(i12);
                    if (ylVar != null && ylVar.b.C == i10) {
                        yl.a(ylVar, gfVar);
                    }
                }
                vl vlVar = zlVar.k;
                if (vlVar == null || ((ArrayList) vlVar.f) == null) {
                    z9 = false;
                } else {
                    z9 = false;
                    for (int i13 = 0; i13 < ((ArrayList) zlVar.k.f).size(); i13++) {
                        if (((org.telegram.messenger.gf) ((ArrayList) zlVar.k.f).get(i13)).C == i10) {
                            ((ArrayList) zlVar.k.f).set(i13, gfVar);
                            z9 = true;
                        }
                    }
                }
                if (z9) {
                    zl.a(zlVar, zlVar.k, true);
                }
            }
        }
        amVar.g();
        amVar.invalidate();
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final ArrayList c() {
        return this.b.h;
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final int k(int i7, org.telegram.messenger.j20 j20Var) {
        if (i7 < 0 || i7 >= this.a.size()) {
            return -1;
        }
        Integer valueOf = Integer.valueOf(((org.telegram.messenger.gf) this.a.get(i7)).C);
        am amVar = this.b;
        int indexOf = amVar.h.indexOf(valueOf);
        if (indexOf < 0) {
            amVar.h.add(valueOf);
            amVar.c();
            return amVar.h.size() - 1;
        }
        if (amVar.h.size() <= 1) {
            return -1;
        }
        amVar.h.remove(indexOf);
        amVar.c();
        return indexOf;
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final boolean u() {
        return false;
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final HashMap v() {
        return this.b.d;
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final boolean x(int i7) {
        if (i7 < 0 || i7 >= this.a.size()) {
            return false;
        }
        return this.b.h.contains(Integer.valueOf(((org.telegram.messenger.gf) this.a.get(i7)).C));
    }
}
