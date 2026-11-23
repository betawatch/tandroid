package org.telegram.ui.Components;

import android.graphics.RectF;
import android.os.Build;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class nm extends org.telegram.ui.oq0 {
    public ArrayList a = new ArrayList();
    public final /* synthetic */ qm b;

    public nm(qm qmVar) {
        this.b = qmVar;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final void D() {
        qm qmVar = this.b;
        qmVar.c();
        qmVar.i(qmVar.Q.Q, false);
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final org.telegram.ui.wq0 E(org.telegram.messenger.gj gjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        org.telegram.messenger.ff ffVar;
        ArrayList arrayList;
        qm qmVar = this.b;
        ArrayList arrayList2 = qmVar.b;
        rm rmVar = qmVar.Q;
        if (i7 >= 0 && i7 < this.a.size() && x(i7) && (ffVar = (org.telegram.messenger.ff) this.a.get(i7)) != null) {
            int size = arrayList2.size();
            pm pmVar = null;
            om omVar = null;
            for (int i10 = 0; i10 < size; i10++) {
                pmVar = (pm) arrayList2.get(i10);
                if (pmVar != null && (arrayList = pmVar.h) != null) {
                    int size2 = arrayList.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 >= size2) {
                            break;
                        }
                        om omVar2 = (om) arrayList.get(i11);
                        if (omVar2 != null && omVar2.b == ffVar && omVar2.k > 0.5d) {
                            omVar = (om) arrayList.get(i11);
                            break;
                        }
                        i11++;
                    }
                    if (omVar != null) {
                        break;
                    }
                }
            }
            if (pmVar != null && omVar != null) {
                org.telegram.ui.wq0 wq0Var = new org.telegram.ui.wq0();
                int[] iArr = new int[2];
                qmVar.getLocationInWindow(iArr);
                if (Build.VERSION.SDK_INT < 26) {
                    iArr[0] = iArr[0] - rmVar.b.T();
                }
                wq0Var.b = iArr[0];
                wq0Var.c = iArr[1] + ((int) pmVar.a);
                wq0Var.k = 1.0f;
                wq0Var.d = qmVar;
                ImageReceiver imageReceiver = omVar.c;
                wq0Var.a = imageReceiver;
                wq0Var.e = imageReceiver.p();
                wq0Var.h = new int[]{(int) r8.left, (int) r8.top, (int) r8.right, (int) r8.bottom};
                RectF rectF = omVar.q;
                wq0Var.j = (int) (-qmVar.getY());
                wq0Var.i = qmVar.getHeight() - ((int) (((-qmVar.getY()) + rmVar.r.getHeight()) - rmVar.b.a1()));
                return wq0Var;
            }
        }
        return null;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final int H() {
        return this.b.h.size();
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final int R(Object obj) {
        int indexOf;
        Integer valueOf = Integer.valueOf(((org.telegram.messenger.ff) obj).C);
        qm qmVar = this.b;
        if (qmVar.h.size() <= 1 || (indexOf = qmVar.h.indexOf(valueOf)) < 0) {
            return -1;
        }
        qmVar.h.remove(indexOf);
        qmVar.c();
        return indexOf;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final int S(int i7) {
        org.telegram.messenger.ff ffVar;
        if (i7 < 0 || i7 >= this.a.size() || (ffVar = (org.telegram.messenger.ff) this.a.get(i7)) == null) {
            return -1;
        }
        return this.b.h.indexOf(Integer.valueOf(ffVar.C));
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final void X(int i7) {
        org.telegram.messenger.ff ffVar;
        ArrayList arrayList;
        boolean z10;
        if (i7 < 0 || i7 >= this.a.size() || (ffVar = (org.telegram.messenger.ff) this.a.get(i7)) == null) {
            return;
        }
        int i10 = ffVar.C;
        qm qmVar = this.b;
        qmVar.invalidate();
        for (int i11 = 0; i11 < qmVar.b.size(); i11++) {
            pm pmVar = (pm) qmVar.b.get(i11);
            if (pmVar != null && (arrayList = pmVar.h) != null) {
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    om omVar = (om) arrayList.get(i12);
                    if (omVar != null && omVar.b.C == i10) {
                        om.a(omVar, ffVar);
                    }
                }
                lm lmVar = pmVar.k;
                if (lmVar == null || ((ArrayList) lmVar.f) == null) {
                    z10 = false;
                } else {
                    z10 = false;
                    for (int i13 = 0; i13 < ((ArrayList) pmVar.k.f).size(); i13++) {
                        if (((org.telegram.messenger.ff) ((ArrayList) pmVar.k.f).get(i13)).C == i10) {
                            ((ArrayList) pmVar.k.f).set(i13, ffVar);
                            z10 = true;
                        }
                    }
                }
                if (z10) {
                    pm.a(pmVar, pmVar.k, true);
                }
            }
        }
        qmVar.g();
        qmVar.invalidate();
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final ArrayList c() {
        return this.b.h;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final int k(int i7, org.telegram.messenger.f20 f20Var) {
        if (i7 < 0 || i7 >= this.a.size()) {
            return -1;
        }
        Integer valueOf = Integer.valueOf(((org.telegram.messenger.ff) this.a.get(i7)).C);
        qm qmVar = this.b;
        int indexOf = qmVar.h.indexOf(valueOf);
        if (indexOf < 0) {
            qmVar.h.add(valueOf);
            qmVar.c();
            return qmVar.h.size() - 1;
        }
        if (qmVar.h.size() <= 1) {
            return -1;
        }
        qmVar.h.remove(indexOf);
        qmVar.c();
        return indexOf;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final boolean u() {
        return false;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final HashMap v() {
        return this.b.d;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final boolean x(int i7) {
        if (i7 < 0 || i7 >= this.a.size()) {
            return false;
        }
        return this.b.h.contains(Integer.valueOf(((org.telegram.messenger.ff) this.a.get(i7)).C));
    }
}
