package org.telegram.ui.Components;

import android.graphics.RectF;
import android.os.Build;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class fm extends org.telegram.ui.yr0 {
    public ArrayList a = new ArrayList();
    public final /* synthetic */ im b;

    public fm(im imVar) {
        this.b = imVar;
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final void D() {
        im imVar = this.b;
        imVar.c();
        imVar.i(imVar.P.P, false);
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final org.telegram.ui.gs0 E(org.telegram.messenger.jj jjVar, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        org.telegram.messenger.ef efVar;
        ArrayList arrayList;
        im imVar = this.b;
        ArrayList arrayList2 = imVar.b;
        jm jmVar = imVar.P;
        if (i10 >= 0 && i10 < this.a.size() && x(i10) && (efVar = (org.telegram.messenger.ef) this.a.get(i10)) != null) {
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
                        if (gmVar2 != null && gmVar2.b == efVar && gmVar2.k > 0.5d) {
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
                org.telegram.ui.gs0 gs0Var = new org.telegram.ui.gs0();
                int[] iArr = new int[2];
                imVar.getLocationInWindow(iArr);
                if (Build.VERSION.SDK_INT < 26) {
                    iArr[0] = iArr[0] - jmVar.b.T();
                }
                gs0Var.b = iArr[0];
                gs0Var.c = iArr[1] + ((int) hmVar.a);
                gs0Var.k = 1.0f;
                gs0Var.d = imVar;
                ImageReceiver imageReceiver = gmVar.c;
                gs0Var.a = imageReceiver;
                gs0Var.e = imageReceiver.p();
                gs0Var.h = new int[]{(int) r8.left, (int) r8.top, (int) r8.right, (int) r8.bottom};
                RectF rectF = gmVar.q;
                gs0Var.j = (int) (-imVar.getY());
                gs0Var.i = imVar.getHeight() - ((int) (((-imVar.getY()) + jmVar.r.getHeight()) - jmVar.b.Y0()));
                return gs0Var;
            }
        }
        return null;
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final int H() {
        return this.b.h.size();
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final int R(Object obj) {
        int indexOf;
        Integer valueOf = Integer.valueOf(((org.telegram.messenger.ef) obj).C);
        im imVar = this.b;
        if (imVar.h.size() <= 1 || (indexOf = imVar.h.indexOf(valueOf)) < 0) {
            return -1;
        }
        imVar.h.remove(indexOf);
        imVar.c();
        return indexOf;
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final int S(int i10) {
        org.telegram.messenger.ef efVar;
        if (i10 < 0 || i10 >= this.a.size() || (efVar = (org.telegram.messenger.ef) this.a.get(i10)) == null) {
            return -1;
        }
        return this.b.h.indexOf(Integer.valueOf(efVar.C));
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final void X(int i10) {
        org.telegram.messenger.ef efVar;
        ArrayList arrayList;
        boolean z10;
        if (i10 < 0 || i10 >= this.a.size() || (efVar = (org.telegram.messenger.ef) this.a.get(i10)) == null) {
            return;
        }
        int i11 = efVar.C;
        im imVar = this.b;
        imVar.invalidate();
        for (int i12 = 0; i12 < imVar.b.size(); i12++) {
            hm hmVar = (hm) imVar.b.get(i12);
            if (hmVar != null && (arrayList = hmVar.h) != null) {
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    gm gmVar = (gm) arrayList.get(i13);
                    if (gmVar != null && gmVar.b.C == i11) {
                        gm.a(gmVar, efVar);
                    }
                }
                dm dmVar = hmVar.k;
                if (dmVar == null || ((ArrayList) dmVar.f) == null) {
                    z10 = false;
                } else {
                    z10 = false;
                    for (int i14 = 0; i14 < ((ArrayList) hmVar.k.f).size(); i14++) {
                        if (((org.telegram.messenger.ef) ((ArrayList) hmVar.k.f).get(i14)).C == i11) {
                            ((ArrayList) hmVar.k.f).set(i14, efVar);
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

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final ArrayList c() {
        return this.b.h;
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final int k(int i10, org.telegram.messenger.x20 x20Var) {
        if (i10 < 0 || i10 >= this.a.size()) {
            return -1;
        }
        Integer valueOf = Integer.valueOf(((org.telegram.messenger.ef) this.a.get(i10)).C);
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

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final boolean u() {
        return false;
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final HashMap v() {
        return this.b.d;
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final boolean x(int i10) {
        if (i10 < 0 || i10 >= this.a.size()) {
            return false;
        }
        return this.b.h.contains(Integer.valueOf(((org.telegram.messenger.ef) this.a.get(i10)).C));
    }
}
