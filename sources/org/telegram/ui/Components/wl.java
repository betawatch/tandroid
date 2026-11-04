package org.telegram.ui.Components;

import android.graphics.RectF;
import android.os.Build;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class wl extends org.telegram.ui.eq0 {
    public ArrayList a = new ArrayList();
    public final /* synthetic */ zl b;

    public wl(zl zlVar) {
        this.b = zlVar;
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final void D() {
        zl zlVar = this.b;
        zlVar.c();
        zlVar.i(zlVar.Q.Q, false);
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final org.telegram.ui.mq0 E(org.telegram.messenger.zi ziVar, TLRPC.FileLocation fileLocation, int i3, boolean z10, boolean z11) {
        org.telegram.messenger.ye yeVar;
        ArrayList arrayList;
        zl zlVar = this.b;
        ArrayList arrayList2 = zlVar.b;
        am amVar = zlVar.Q;
        if (i3 >= 0 && i3 < this.a.size() && x(i3) && (yeVar = (org.telegram.messenger.ye) this.a.get(i3)) != null) {
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
                        if (xlVar2 != null && xlVar2.b == yeVar && xlVar2.k > 0.5d) {
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
                org.telegram.ui.mq0 mq0Var = new org.telegram.ui.mq0();
                int[] iArr = new int[2];
                zlVar.getLocationInWindow(iArr);
                if (Build.VERSION.SDK_INT < 26) {
                    iArr[0] = iArr[0] - amVar.b.S();
                }
                mq0Var.b = iArr[0];
                mq0Var.c = iArr[1] + ((int) ylVar.a);
                mq0Var.k = 1.0f;
                mq0Var.d = zlVar;
                ImageReceiver imageReceiver = xlVar.c;
                mq0Var.a = imageReceiver;
                mq0Var.e = imageReceiver.p();
                mq0Var.h = new int[]{(int) r8.left, (int) r8.top, (int) r8.right, (int) r8.bottom};
                RectF rectF = xlVar.q;
                mq0Var.j = (int) (-zlVar.getY());
                mq0Var.i = zlVar.getHeight() - ((int) (((-zlVar.getY()) + amVar.r.getHeight()) - amVar.b.Z0()));
                return mq0Var;
            }
        }
        return null;
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final int H() {
        return this.b.h.size();
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final int R(Object obj) {
        int indexOf;
        Integer valueOf = Integer.valueOf(((org.telegram.messenger.ye) obj).C);
        zl zlVar = this.b;
        if (zlVar.h.size() <= 1 || (indexOf = zlVar.h.indexOf(valueOf)) < 0) {
            return -1;
        }
        zlVar.h.remove(indexOf);
        zlVar.c();
        return indexOf;
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final int S(int i3) {
        org.telegram.messenger.ye yeVar;
        if (i3 < 0 || i3 >= this.a.size() || (yeVar = (org.telegram.messenger.ye) this.a.get(i3)) == null) {
            return -1;
        }
        return this.b.h.indexOf(Integer.valueOf(yeVar.C));
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final void X(int i3) {
        org.telegram.messenger.ye yeVar;
        ArrayList arrayList;
        boolean z10;
        if (i3 < 0 || i3 >= this.a.size() || (yeVar = (org.telegram.messenger.ye) this.a.get(i3)) == null) {
            return;
        }
        int i10 = yeVar.C;
        zl zlVar = this.b;
        zlVar.invalidate();
        for (int i11 = 0; i11 < zlVar.b.size(); i11++) {
            yl ylVar = (yl) zlVar.b.get(i11);
            if (ylVar != null && (arrayList = ylVar.h) != null) {
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    xl xlVar = (xl) arrayList.get(i12);
                    if (xlVar != null && xlVar.b.C == i10) {
                        xl.a(xlVar, yeVar);
                    }
                }
                ul ulVar = ylVar.k;
                if (ulVar == null || ((ArrayList) ulVar.f) == null) {
                    z10 = false;
                } else {
                    z10 = false;
                    for (int i13 = 0; i13 < ((ArrayList) ylVar.k.f).size(); i13++) {
                        if (((org.telegram.messenger.ye) ((ArrayList) ylVar.k.f).get(i13)).C == i10) {
                            ((ArrayList) ylVar.k.f).set(i13, yeVar);
                            z10 = true;
                        }
                    }
                }
                if (z10) {
                    yl.a(ylVar, ylVar.k, true);
                }
            }
        }
        zlVar.g();
        zlVar.invalidate();
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final ArrayList c() {
        return this.b.h;
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final int k(int i3, org.telegram.messenger.b20 b20Var) {
        if (i3 < 0 || i3 >= this.a.size()) {
            return -1;
        }
        Integer valueOf = Integer.valueOf(((org.telegram.messenger.ye) this.a.get(i3)).C);
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

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final boolean u() {
        return false;
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final HashMap v() {
        return this.b.d;
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final boolean x(int i3) {
        if (i3 < 0 || i3 >= this.a.size()) {
            return false;
        }
        return this.b.h.contains(Integer.valueOf(((org.telegram.messenger.ye) this.a.get(i3)).C));
    }
}
