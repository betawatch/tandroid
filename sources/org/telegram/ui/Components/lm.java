package org.telegram.ui.Components;

import android.graphics.RectF;
import android.os.Build;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class lm extends org.telegram.ui.oq0 {
    public ArrayList a = new ArrayList();
    public final /* synthetic */ om b;

    public lm(om omVar) {
        this.b = omVar;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final void D() {
        om omVar = this.b;
        omVar.c();
        omVar.i(omVar.Q.Q, false);
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final org.telegram.ui.wq0 E(org.telegram.messenger.fj fjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        org.telegram.messenger.ef efVar;
        ArrayList arrayList;
        om omVar = this.b;
        ArrayList arrayList2 = omVar.b;
        pm pmVar = omVar.Q;
        if (i7 >= 0 && i7 < this.a.size() && x(i7) && (efVar = (org.telegram.messenger.ef) this.a.get(i7)) != null) {
            int size = arrayList2.size();
            nm nmVar = null;
            mm mmVar = null;
            for (int i10 = 0; i10 < size; i10++) {
                nmVar = (nm) arrayList2.get(i10);
                if (nmVar != null && (arrayList = nmVar.h) != null) {
                    int size2 = arrayList.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 >= size2) {
                            break;
                        }
                        mm mmVar2 = (mm) arrayList.get(i11);
                        if (mmVar2 != null && mmVar2.b == efVar && mmVar2.k > 0.5d) {
                            mmVar = (mm) arrayList.get(i11);
                            break;
                        }
                        i11++;
                    }
                    if (mmVar != null) {
                        break;
                    }
                }
            }
            if (nmVar != null && mmVar != null) {
                org.telegram.ui.wq0 wq0Var = new org.telegram.ui.wq0();
                int[] iArr = new int[2];
                omVar.getLocationInWindow(iArr);
                if (Build.VERSION.SDK_INT < 26) {
                    iArr[0] = iArr[0] - pmVar.b.T();
                }
                wq0Var.b = iArr[0];
                wq0Var.c = iArr[1] + ((int) nmVar.a);
                wq0Var.k = 1.0f;
                wq0Var.d = omVar;
                ImageReceiver imageReceiver = mmVar.c;
                wq0Var.a = imageReceiver;
                wq0Var.e = imageReceiver.p();
                wq0Var.h = new int[]{(int) r8.left, (int) r8.top, (int) r8.right, (int) r8.bottom};
                RectF rectF = mmVar.q;
                wq0Var.j = (int) (-omVar.getY());
                wq0Var.i = omVar.getHeight() - ((int) (((-omVar.getY()) + pmVar.r.getHeight()) - pmVar.b.a1()));
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
        Integer valueOf = Integer.valueOf(((org.telegram.messenger.ef) obj).C);
        om omVar = this.b;
        if (omVar.h.size() <= 1 || (indexOf = omVar.h.indexOf(valueOf)) < 0) {
            return -1;
        }
        omVar.h.remove(indexOf);
        omVar.c();
        return indexOf;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final int S(int i7) {
        org.telegram.messenger.ef efVar;
        if (i7 < 0 || i7 >= this.a.size() || (efVar = (org.telegram.messenger.ef) this.a.get(i7)) == null) {
            return -1;
        }
        return this.b.h.indexOf(Integer.valueOf(efVar.C));
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final void X(int i7) {
        org.telegram.messenger.ef efVar;
        ArrayList arrayList;
        boolean z10;
        if (i7 < 0 || i7 >= this.a.size() || (efVar = (org.telegram.messenger.ef) this.a.get(i7)) == null) {
            return;
        }
        int i10 = efVar.C;
        om omVar = this.b;
        omVar.invalidate();
        for (int i11 = 0; i11 < omVar.b.size(); i11++) {
            nm nmVar = (nm) omVar.b.get(i11);
            if (nmVar != null && (arrayList = nmVar.h) != null) {
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    mm mmVar = (mm) arrayList.get(i12);
                    if (mmVar != null && mmVar.b.C == i10) {
                        mm.a(mmVar, efVar);
                    }
                }
                jm jmVar = nmVar.k;
                if (jmVar == null || ((ArrayList) jmVar.f) == null) {
                    z10 = false;
                } else {
                    z10 = false;
                    for (int i13 = 0; i13 < ((ArrayList) nmVar.k.f).size(); i13++) {
                        if (((org.telegram.messenger.ef) ((ArrayList) nmVar.k.f).get(i13)).C == i10) {
                            ((ArrayList) nmVar.k.f).set(i13, efVar);
                            z10 = true;
                        }
                    }
                }
                if (z10) {
                    nm.a(nmVar, nmVar.k, true);
                }
            }
        }
        omVar.g();
        omVar.invalidate();
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final ArrayList c() {
        return this.b.h;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final int k(int i7, org.telegram.messenger.d20 d20Var) {
        if (i7 < 0 || i7 >= this.a.size()) {
            return -1;
        }
        Integer valueOf = Integer.valueOf(((org.telegram.messenger.ef) this.a.get(i7)).C);
        om omVar = this.b;
        int indexOf = omVar.h.indexOf(valueOf);
        if (indexOf < 0) {
            omVar.h.add(valueOf);
            omVar.c();
            return omVar.h.size() - 1;
        }
        if (omVar.h.size() <= 1) {
            return -1;
        }
        omVar.h.remove(indexOf);
        omVar.c();
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
        return this.b.h.contains(Integer.valueOf(((org.telegram.messenger.ef) this.a.get(i7)).C));
    }
}
