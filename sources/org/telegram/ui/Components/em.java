package org.telegram.ui.Components;

import android.graphics.RectF;
import android.os.Build;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class em extends org.telegram.ui.mq0 {
    public ArrayList a = new ArrayList();
    public final /* synthetic */ hm b;

    public em(hm hmVar) {
        this.b = hmVar;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final void D() {
        hm hmVar = this.b;
        hmVar.c();
        hmVar.i(hmVar.Q.Q, false);
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final org.telegram.ui.uq0 E(org.telegram.messenger.gj gjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        org.telegram.messenger.ff ffVar;
        ArrayList arrayList;
        hm hmVar = this.b;
        ArrayList arrayList2 = hmVar.b;
        im imVar = hmVar.Q;
        if (i7 >= 0 && i7 < this.a.size() && x(i7) && (ffVar = (org.telegram.messenger.ff) this.a.get(i7)) != null) {
            int size = arrayList2.size();
            gm gmVar = null;
            fm fmVar = null;
            for (int i10 = 0; i10 < size; i10++) {
                gmVar = (gm) arrayList2.get(i10);
                if (gmVar != null && (arrayList = gmVar.h) != null) {
                    int size2 = arrayList.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 >= size2) {
                            break;
                        }
                        fm fmVar2 = (fm) arrayList.get(i11);
                        if (fmVar2 != null && fmVar2.b == ffVar && fmVar2.k > 0.5d) {
                            fmVar = (fm) arrayList.get(i11);
                            break;
                        }
                        i11++;
                    }
                    if (fmVar != null) {
                        break;
                    }
                }
            }
            if (gmVar != null && fmVar != null) {
                org.telegram.ui.uq0 uq0Var = new org.telegram.ui.uq0();
                int[] iArr = new int[2];
                hmVar.getLocationInWindow(iArr);
                if (Build.VERSION.SDK_INT < 26) {
                    iArr[0] = iArr[0] - imVar.b.T();
                }
                uq0Var.b = iArr[0];
                uq0Var.c = iArr[1] + ((int) gmVar.a);
                uq0Var.k = 1.0f;
                uq0Var.d = hmVar;
                ImageReceiver imageReceiver = fmVar.c;
                uq0Var.a = imageReceiver;
                uq0Var.e = imageReceiver.p();
                uq0Var.h = new int[]{(int) r8.left, (int) r8.top, (int) r8.right, (int) r8.bottom};
                RectF rectF = fmVar.q;
                uq0Var.j = (int) (-hmVar.getY());
                uq0Var.i = hmVar.getHeight() - ((int) (((-hmVar.getY()) + imVar.r.getHeight()) - imVar.b.Z0()));
                return uq0Var;
            }
        }
        return null;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final int H() {
        return this.b.h.size();
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final int R(Object obj) {
        int indexOf;
        Integer valueOf = Integer.valueOf(((org.telegram.messenger.ff) obj).C);
        hm hmVar = this.b;
        if (hmVar.h.size() <= 1 || (indexOf = hmVar.h.indexOf(valueOf)) < 0) {
            return -1;
        }
        hmVar.h.remove(indexOf);
        hmVar.c();
        return indexOf;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final int S(int i7) {
        org.telegram.messenger.ff ffVar;
        if (i7 < 0 || i7 >= this.a.size() || (ffVar = (org.telegram.messenger.ff) this.a.get(i7)) == null) {
            return -1;
        }
        return this.b.h.indexOf(Integer.valueOf(ffVar.C));
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final void X(int i7) {
        org.telegram.messenger.ff ffVar;
        ArrayList arrayList;
        boolean z10;
        if (i7 < 0 || i7 >= this.a.size() || (ffVar = (org.telegram.messenger.ff) this.a.get(i7)) == null) {
            return;
        }
        int i10 = ffVar.C;
        hm hmVar = this.b;
        hmVar.invalidate();
        for (int i11 = 0; i11 < hmVar.b.size(); i11++) {
            gm gmVar = (gm) hmVar.b.get(i11);
            if (gmVar != null && (arrayList = gmVar.h) != null) {
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    fm fmVar = (fm) arrayList.get(i12);
                    if (fmVar != null && fmVar.b.C == i10) {
                        fm.a(fmVar, ffVar);
                    }
                }
                cm cmVar = gmVar.k;
                if (cmVar == null || ((ArrayList) cmVar.f) == null) {
                    z10 = false;
                } else {
                    z10 = false;
                    for (int i13 = 0; i13 < ((ArrayList) gmVar.k.f).size(); i13++) {
                        if (((org.telegram.messenger.ff) ((ArrayList) gmVar.k.f).get(i13)).C == i10) {
                            ((ArrayList) gmVar.k.f).set(i13, ffVar);
                            z10 = true;
                        }
                    }
                }
                if (z10) {
                    gm.a(gmVar, gmVar.k, true);
                }
            }
        }
        hmVar.g();
        hmVar.invalidate();
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final ArrayList c() {
        return this.b.h;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final int k(int i7, org.telegram.messenger.g20 g20Var) {
        if (i7 < 0 || i7 >= this.a.size()) {
            return -1;
        }
        Integer valueOf = Integer.valueOf(((org.telegram.messenger.ff) this.a.get(i7)).C);
        hm hmVar = this.b;
        int indexOf = hmVar.h.indexOf(valueOf);
        if (indexOf < 0) {
            hmVar.h.add(valueOf);
            hmVar.c();
            return hmVar.h.size() - 1;
        }
        if (hmVar.h.size() <= 1) {
            return -1;
        }
        hmVar.h.remove(indexOf);
        hmVar.c();
        return indexOf;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final boolean u() {
        return false;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final HashMap v() {
        return this.b.d;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final boolean x(int i7) {
        if (i7 < 0 || i7 >= this.a.size()) {
            return false;
        }
        return this.b.h.contains(Integer.valueOf(((org.telegram.messenger.ff) this.a.get(i7)).C));
    }
}
