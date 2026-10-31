package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class eo0 extends yr0 {
    public final /* synthetic */ lo0 a;

    public eo0(lo0 lo0Var) {
        this.a = lo0Var;
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final gs0 E(org.telegram.messenger.jj jjVar, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        lo0 lo0Var = this.a;
        org.telegram.ui.Cells.v5 Z = lo0.Z(lo0Var, i10);
        if (Z == null) {
            return null;
        }
        org.telegram.ui.Components.g9 imageView = Z.getImageView();
        int[] iArr = new int[2];
        imageView.getLocationInWindow(iArr);
        gs0 gs0Var = new gs0();
        gs0Var.b = iArr[0];
        gs0Var.c = iArr[1];
        gs0Var.d = lo0Var.K;
        ImageReceiver imageReceiver = imageView.getImageReceiver();
        gs0Var.a = imageReceiver;
        gs0Var.e = imageReceiver.p();
        gs0Var.k = Z.getScale();
        Z.g(false);
        return gs0Var;
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final void G() {
        lo0 lo0Var = this.a;
        int childCount = lo0Var.K.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = lo0Var.K.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.v5) {
                ((org.telegram.ui.Cells.v5) childAt).g(true);
            }
        }
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final int H() {
        return this.a.b.size();
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final int R(Object obj) {
        Object valueOf = obj instanceof org.telegram.messenger.ef ? Integer.valueOf(((org.telegram.messenger.ef) obj).C) : obj instanceof org.telegram.messenger.hf ? ((org.telegram.messenger.hf) obj).B : null;
        if (valueOf == null) {
            return -1;
        }
        lo0 lo0Var = this.a;
        if (!lo0Var.b.containsKey(valueOf)) {
            return -1;
        }
        lo0Var.b.remove(valueOf);
        int indexOf = lo0Var.c.indexOf(valueOf);
        if (indexOf >= 0) {
            lo0Var.c.remove(indexOf);
        }
        if (lo0Var.e) {
            lo0Var.l0();
        }
        return indexOf;
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final void X(int i10) {
        lo0 lo0Var = this.a;
        org.telegram.messenger.we weVar = lo0Var.J;
        org.telegram.ui.Cells.v5 Z = lo0.Z(lo0Var, i10);
        if (Z != null) {
            if (weVar == null) {
                Z.e((org.telegram.messenger.hf) lo0Var.f.get(i10));
                return;
            }
            org.telegram.ui.Components.g9 imageView = Z.getImageView();
            imageView.r();
            org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) weVar.e.get(i10);
            String str = efVar.c;
            int i11 = efVar.C;
            String str2 = efVar.I;
            if (str != null) {
                imageView.h(str, null, org.telegram.ui.ActionBar.t6.R4);
                return;
            }
            if (str2 == null) {
                imageView.setImageDrawable(org.telegram.ui.ActionBar.t6.R4);
                return;
            }
            imageView.s(efVar.J, efVar.K, true);
            if (!efVar.b || efVar.d()) {
                imageView.h("thumb://" + i11 + ":" + str2, null, org.telegram.ui.ActionBar.t6.R4);
                return;
            }
            imageView.h("vthumb://" + i11 + ":" + str2, null, org.telegram.ui.ActionBar.t6.R4);
        }
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final void a0(int i10) {
        lo0 lo0Var = this.a;
        int childCount = lo0Var.K.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = lo0Var.K.getChildAt(i11);
            if (childAt.getTag() != null) {
                org.telegram.ui.Cells.v5 v5Var = (org.telegram.ui.Cells.v5) childAt;
                int intValue = ((Integer) childAt.getTag()).intValue();
                org.telegram.messenger.we weVar = lo0Var.J;
                if (weVar == null ? !(intValue < 0 || intValue >= lo0Var.f.size()) : !(intValue < 0 || intValue >= weVar.e.size())) {
                    if (intValue == i10) {
                        v5Var.g(true);
                        return;
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final ArrayList c() {
        return this.a.c;
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final org.telegram.messenger.kc j(int i10) {
        org.telegram.ui.Cells.v5 Z = lo0.Z(this.a, i10);
        if (Z != null) {
            return Z.getImageView().getImageReceiver().p();
        }
        return null;
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final int k(int i10, org.telegram.messenger.x20 x20Var) {
        int c02;
        boolean z10;
        lo0 lo0Var = this.a;
        org.telegram.messenger.we weVar = lo0Var.J;
        if (weVar != null) {
            if (i10 < 0 || i10 >= weVar.e.size()) {
                return -1;
            }
            org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) lo0Var.J.e.get(i10);
            c02 = lo0Var.c0(-1, efVar);
            if (c02 == -1) {
                efVar.s = x20Var;
                c02 = lo0Var.c.indexOf(Integer.valueOf(efVar.C));
                z10 = true;
            } else {
                efVar.s = null;
                z10 = false;
            }
        } else {
            if (i10 < 0 || i10 >= lo0Var.f.size()) {
                return -1;
            }
            org.telegram.messenger.hf hfVar = (org.telegram.messenger.hf) lo0Var.f.get(i10);
            c02 = lo0Var.c0(-1, hfVar);
            if (c02 == -1) {
                hfVar.s = x20Var;
                c02 = lo0Var.c.indexOf(hfVar.B);
                z10 = true;
            } else {
                hfVar.s = null;
                z10 = false;
            }
        }
        int childCount = lo0Var.K.getChildCount();
        int i11 = 0;
        while (true) {
            if (i11 >= childCount) {
                break;
            }
            View childAt = lo0Var.K.getChildAt(i11);
            if (((Integer) childAt.getTag()).intValue() == i10) {
                ((org.telegram.ui.Cells.v5) childAt).b(lo0Var.e ? c02 : -1, z10, false);
            } else {
                i11++;
            }
        }
        lo0Var.m0(z10 ? 1 : 2);
        lo0Var.s0.y();
        return c02;
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final void o(int i10, org.telegram.messenger.x20 x20Var, boolean z10, int i11, int i12, boolean z11) {
        lo0 lo0Var = this.a;
        ArrayList arrayList = lo0Var.f;
        org.telegram.messenger.we weVar = lo0Var.J;
        if (lo0Var.b.isEmpty()) {
            if (weVar != null) {
                if (i10 < 0 || i10 >= weVar.e.size()) {
                    return;
                }
                org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) weVar.e.get(i10);
                efVar.s = x20Var;
                lo0Var.c0(-1, efVar);
            } else {
                if (i10 < 0 || i10 >= arrayList.size()) {
                    return;
                }
                org.telegram.messenger.hf hfVar = (org.telegram.messenger.hf) arrayList.get(i10);
                hfVar.s = x20Var;
                lo0Var.c0(-1, hfVar);
            }
        }
        lo0Var.i0(i11, z10);
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final boolean u() {
        lo0 lo0Var = this.a;
        lo0Var.s0.u0(0, true, true);
        lo0Var.finishFragment();
        return true;
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final HashMap v() {
        return this.a.b;
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final boolean x(int i10) {
        lo0 lo0Var = this.a;
        org.telegram.messenger.we weVar = lo0Var.J;
        return weVar != null ? i10 >= 0 && i10 < weVar.e.size() && lo0Var.b.containsKey(Integer.valueOf(((org.telegram.messenger.ef) lo0Var.J.e.get(i10)).C)) : i10 >= 0 && i10 < lo0Var.f.size() && lo0Var.b.containsKey(((org.telegram.messenger.hf) lo0Var.f.get(i10)).B);
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final boolean z() {
        return this.a.E;
    }
}
