package org.telegram.ui.Components;

import android.graphics.RectF;
import android.os.Build;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class fm extends org.telegram.ui.xr0 {
    public ArrayList a = new ArrayList();
    public final /* synthetic */ im b;

    public fm(im imVar) {
        this.b = imVar;
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final void D() {
        im imVar = this.b;
        imVar.c();
        imVar.i(imVar.P.P, false);
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final org.telegram.ui.fs0 E(org.telegram.messenger.kj kjVar, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        org.telegram.messenger.ff ffVar;
        ArrayList arrayList;
        im imVar = this.b;
        ArrayList arrayList2 = imVar.b;
        jm jmVar = imVar.P;
        if (i10 >= 0 && i10 < this.a.size() && x(i10) && (ffVar = (org.telegram.messenger.ff) this.a.get(i10)) != null) {
            int size = arrayList2.size();
            hm hmVar = null;
            gm gmVar = null;
            for (int i11 = 0; i11 < size; i11++) {
                hmVar = (hm) arrayList2.get(i11);
                if (hmVar != null && (arrayList = hmVar.h) != null) {
                    int size2 = arrayList.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= size2) {
                            break;
                        }
                        gm gmVar2 = (gm) arrayList.get(i12);
                        if (gmVar2 != null && gmVar2.b == ffVar && gmVar2.k > 0.5d) {
                            gmVar = (gm) arrayList.get(i12);
                            break;
                        }
                        i12++;
                    }
                    if (gmVar != null) {
                        break;
                    }
                }
            }
            if (hmVar != null && gmVar != null) {
                org.telegram.ui.fs0 fs0Var = new org.telegram.ui.fs0();
                int[] iArr = new int[2];
                imVar.getLocationInWindow(iArr);
                if (Build.VERSION.SDK_INT < 26) {
                    iArr[0] = iArr[0] - jmVar.b.T();
                }
                fs0Var.b = iArr[0];
                fs0Var.c = iArr[1] + ((int) hmVar.a);
                fs0Var.k = 1.0f;
                fs0Var.d = imVar;
                ImageReceiver imageReceiver = gmVar.c;
                fs0Var.a = imageReceiver;
                fs0Var.e = imageReceiver.p();
                fs0Var.h = new int[]{(int) r8.left, (int) r8.top, (int) r8.right, (int) r8.bottom};
                RectF rectF = gmVar.q;
                fs0Var.j = (int) (-imVar.getY());
                fs0Var.i = imVar.getHeight() - ((int) (((-imVar.getY()) + jmVar.r.getHeight()) - jmVar.b.Y0()));
                return fs0Var;
            }
        }
        return null;
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final int H() {
        return this.b.h.size();
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final int R(Object obj) {
        int indexOf;
        Integer valueOf = Integer.valueOf(((org.telegram.messenger.ff) obj).C);
        im imVar = this.b;
        if (imVar.h.size() <= 1 || (indexOf = imVar.h.indexOf(valueOf)) < 0) {
            return -1;
        }
        imVar.h.remove(indexOf);
        imVar.c();
        return indexOf;
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final int S(int i10) {
        org.telegram.messenger.ff ffVar;
        if (i10 < 0 || i10 >= this.a.size() || (ffVar = (org.telegram.messenger.ff) this.a.get(i10)) == null) {
            return -1;
        }
        return this.b.h.indexOf(Integer.valueOf(ffVar.C));
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final void X(int i10) {
        org.telegram.messenger.ff ffVar;
        ArrayList arrayList;
        boolean z10;
        if (i10 < 0 || i10 >= this.a.size() || (ffVar = (org.telegram.messenger.ff) this.a.get(i10)) == null) {
            return;
        }
        int i11 = ffVar.C;
        im imVar = this.b;
        imVar.invalidate();
        for (int i12 = 0; i12 < imVar.b.size(); i12++) {
            hm hmVar = (hm) imVar.b.get(i12);
            if (hmVar != null && (arrayList = hmVar.h) != null) {
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    gm gmVar = (gm) arrayList.get(i13);
                    if (gmVar != null && gmVar.b.C == i11) {
                        gm.a(gmVar, ffVar);
                    }
                }
                dm dmVar = hmVar.k;
                if (dmVar == null || ((ArrayList) dmVar.f) == null) {
                    z10 = false;
                } else {
                    z10 = false;
                    for (int i14 = 0; i14 < ((ArrayList) hmVar.k.f).size(); i14++) {
                        if (((org.telegram.messenger.ff) ((ArrayList) hmVar.k.f).get(i14)).C == i11) {
                            ((ArrayList) hmVar.k.f).set(i14, ffVar);
                            z10 = true;
                        }
                    }
                }
                if (z10) {
                    hm.a(hmVar, hmVar.k, true);
                }
            }
        }
        imVar.g();
        imVar.invalidate();
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final ArrayList c() {
        return this.b.h;
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final int k(int i10, org.telegram.messenger.y20 y20Var) {
        if (i10 < 0 || i10 >= this.a.size()) {
            return -1;
        }
        Integer valueOf = Integer.valueOf(((org.telegram.messenger.ff) this.a.get(i10)).C);
        im imVar = this.b;
        int indexOf = imVar.h.indexOf(valueOf);
        if (indexOf < 0) {
            imVar.h.add(valueOf);
            imVar.c();
            return imVar.h.size() - 1;
        }
        if (imVar.h.size() <= 1) {
            return -1;
        }
        imVar.h.remove(indexOf);
        imVar.c();
        return indexOf;
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final boolean u() {
        return false;
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final HashMap v() {
        return this.b.d;
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final boolean x(int i10) {
        if (i10 < 0 || i10 >= this.a.size()) {
            return false;
        }
        return this.b.h.contains(Integer.valueOf(((org.telegram.messenger.ff) this.a.get(i10)).C));
    }
}
