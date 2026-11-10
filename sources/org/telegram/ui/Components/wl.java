package org.telegram.ui.Components;

import android.graphics.RectF;
import android.os.Build;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class wl extends org.telegram.ui.qq0 {
    public ArrayList a = new ArrayList();
    public final /* synthetic */ zl b;

    public wl(zl zlVar) {
        this.b = zlVar;
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final void D() {
        zl zlVar = this.b;
        zlVar.c();
        zlVar.i(zlVar.P.P, false);
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final org.telegram.ui.zq0 E(org.telegram.messenger.ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        org.telegram.messenger.gf gfVar;
        ArrayList arrayList;
        zl zlVar = this.b;
        ArrayList arrayList2 = zlVar.b;
        am amVar = zlVar.P;
        if (i7 >= 0 && i7 < this.a.size() && x(i7) && (gfVar = (org.telegram.messenger.gf) this.a.get(i7)) != null) {
            int size = arrayList2.size();
            yl ylVar = null;
            xl xlVar = null;
            for (int i10 = 0; i10 < size; i10++) {
                ylVar = (yl) arrayList2.get(i10);
                if (ylVar != null && (arrayList = ylVar.h) != null) {
                    int size2 = arrayList.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 >= size2) {
                            break;
                        }
                        xl xlVar2 = (xl) arrayList.get(i11);
                        if (xlVar2 != null && xlVar2.b == gfVar && xlVar2.k > 0.5d) {
                            xlVar = (xl) arrayList.get(i11);
                            break;
                        }
                        i11++;
                    }
                    if (xlVar != null) {
                        break;
                    }
                }
            }
            if (ylVar != null && xlVar != null) {
                org.telegram.ui.zq0 zq0Var = new org.telegram.ui.zq0();
                int[] iArr = new int[2];
                zlVar.getLocationInWindow(iArr);
                if (Build.VERSION.SDK_INT < 26) {
                    iArr[0] = iArr[0] - amVar.b.S();
                }
                zq0Var.b = iArr[0];
                zq0Var.c = iArr[1] + ((int) ylVar.a);
                zq0Var.k = 1.0f;
                zq0Var.d = zlVar;
                ImageReceiver imageReceiver = xlVar.c;
                zq0Var.a = imageReceiver;
                zq0Var.e = imageReceiver.p();
                zq0Var.h = new int[]{(int) r8.left, (int) r8.top, (int) r8.right, (int) r8.bottom};
                RectF rectF = xlVar.q;
                zq0Var.j = (int) (-zlVar.getY());
                zq0Var.i = zlVar.getHeight() - ((int) (((-zlVar.getY()) + amVar.r.getHeight()) - amVar.b.Z0()));
                return zq0Var;
            }
        }
        return null;
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final int H() {
        return this.b.h.size();
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final int R(Object obj) {
        int indexOf;
        Integer valueOf = Integer.valueOf(((org.telegram.messenger.gf) obj).C);
        zl zlVar = this.b;
        if (zlVar.h.size() <= 1 || (indexOf = zlVar.h.indexOf(valueOf)) < 0) {
            return -1;
        }
        zlVar.h.remove(indexOf);
        zlVar.c();
        return indexOf;
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final int S(int i7) {
        org.telegram.messenger.gf gfVar;
        if (i7 < 0 || i7 >= this.a.size() || (gfVar = (org.telegram.messenger.gf) this.a.get(i7)) == null) {
            return -1;
        }
        return this.b.h.indexOf(Integer.valueOf(gfVar.C));
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final void X(int i7) {
        org.telegram.messenger.gf gfVar;
        ArrayList arrayList;
        boolean z9;
        if (i7 < 0 || i7 >= this.a.size() || (gfVar = (org.telegram.messenger.gf) this.a.get(i7)) == null) {
            return;
        }
        int i10 = gfVar.C;
        zl zlVar = this.b;
        zlVar.invalidate();
        for (int i11 = 0; i11 < zlVar.b.size(); i11++) {
            yl ylVar = (yl) zlVar.b.get(i11);
            if (ylVar != null && (arrayList = ylVar.h) != null) {
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    xl xlVar = (xl) arrayList.get(i12);
                    if (xlVar != null && xlVar.b.C == i10) {
                        xl.a(xlVar, gfVar);
                    }
                }
                ul ulVar = ylVar.k;
                if (ulVar == null || ((ArrayList) ulVar.f) == null) {
                    z9 = false;
                } else {
                    z9 = false;
                    for (int i13 = 0; i13 < ((ArrayList) ylVar.k.f).size(); i13++) {
                        if (((org.telegram.messenger.gf) ((ArrayList) ylVar.k.f).get(i13)).C == i10) {
                            ((ArrayList) ylVar.k.f).set(i13, gfVar);
                            z9 = true;
                        }
                    }
                }
                if (z9) {
                    yl.a(ylVar, ylVar.k, true);
                }
            }
        }
        zlVar.g();
        zlVar.invalidate();
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final ArrayList c() {
        return this.b.h;
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final int k(int i7, org.telegram.messenger.j20 j20Var) {
        if (i7 < 0 || i7 >= this.a.size()) {
            return -1;
        }
        Integer valueOf = Integer.valueOf(((org.telegram.messenger.gf) this.a.get(i7)).C);
        zl zlVar = this.b;
        int indexOf = zlVar.h.indexOf(valueOf);
        if (indexOf < 0) {
            zlVar.h.add(valueOf);
            zlVar.c();
            return zlVar.h.size() - 1;
        }
        if (zlVar.h.size() <= 1) {
            return -1;
        }
        zlVar.h.remove(indexOf);
        zlVar.c();
        return indexOf;
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final boolean u() {
        return false;
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final HashMap v() {
        return this.b.d;
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final boolean x(int i7) {
        if (i7 < 0 || i7 >= this.a.size()) {
            return false;
        }
        return this.b.h.contains(Integer.valueOf(((org.telegram.messenger.gf) this.a.get(i7)).C));
    }
}
