package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class co0 extends xr0 {
    public final /* synthetic */ jo0 a;

    public co0(jo0 jo0Var) {
        this.a = jo0Var;
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final fs0 E(org.telegram.messenger.kj kjVar, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        jo0 jo0Var = this.a;
        org.telegram.ui.Cells.v5 a02 = jo0.a0(jo0Var, i10);
        if (a02 == null) {
            return null;
        }
        org.telegram.ui.Components.g9 imageView = a02.getImageView();
        int[] iArr = new int[2];
        imageView.getLocationInWindow(iArr);
        fs0 fs0Var = new fs0();
        fs0Var.b = iArr[0];
        fs0Var.c = iArr[1];
        fs0Var.d = jo0Var.K;
        ImageReceiver imageReceiver = imageView.getImageReceiver();
        fs0Var.a = imageReceiver;
        fs0Var.e = imageReceiver.p();
        fs0Var.k = a02.getScale();
        a02.g(false);
        return fs0Var;
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final void G() {
        jo0 jo0Var = this.a;
        int childCount = jo0Var.K.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = jo0Var.K.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.v5) {
                ((org.telegram.ui.Cells.v5) childAt).g(true);
            }
        }
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final int H() {
        return this.a.b.size();
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final int R(Object obj) {
        Object valueOf = obj instanceof org.telegram.messenger.ff ? Integer.valueOf(((org.telegram.messenger.ff) obj).C) : obj instanceof org.telegram.messenger.jf ? ((org.telegram.messenger.jf) obj).B : null;
        if (valueOf == null) {
            return -1;
        }
        jo0 jo0Var = this.a;
        if (!jo0Var.b.containsKey(valueOf)) {
            return -1;
        }
        jo0Var.b.remove(valueOf);
        int indexOf = jo0Var.c.indexOf(valueOf);
        if (indexOf >= 0) {
            jo0Var.c.remove(indexOf);
        }
        if (jo0Var.e) {
            jo0Var.m0();
        }
        return indexOf;
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final void X(int i10) {
        jo0 jo0Var = this.a;
        org.telegram.messenger.xe xeVar = jo0Var.J;
        org.telegram.ui.Cells.v5 a02 = jo0.a0(jo0Var, i10);
        if (a02 != null) {
            if (xeVar == null) {
                a02.e((org.telegram.messenger.jf) jo0Var.f.get(i10));
                return;
            }
            org.telegram.ui.Components.g9 imageView = a02.getImageView();
            imageView.r();
            org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) xeVar.e.get(i10);
            String str = ffVar.c;
            int i11 = ffVar.C;
            String str2 = ffVar.I;
            if (str != null) {
                imageView.h(str, null, org.telegram.ui.ActionBar.t6.R4);
                return;
            }
            if (str2 == null) {
                imageView.setImageDrawable(org.telegram.ui.ActionBar.t6.R4);
                return;
            }
            imageView.s(ffVar.J, ffVar.K, true);
            if (!ffVar.b || ffVar.d()) {
                imageView.h("thumb://" + i11 + ":" + str2, null, org.telegram.ui.ActionBar.t6.R4);
                return;
            }
            imageView.h("vthumb://" + i11 + ":" + str2, null, org.telegram.ui.ActionBar.t6.R4);
        }
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final void a0(int i10) {
        jo0 jo0Var = this.a;
        int childCount = jo0Var.K.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = jo0Var.K.getChildAt(i11);
            if (childAt.getTag() != null) {
                org.telegram.ui.Cells.v5 v5Var = (org.telegram.ui.Cells.v5) childAt;
                int intValue = ((Integer) childAt.getTag()).intValue();
                org.telegram.messenger.xe xeVar = jo0Var.J;
                if (xeVar == null ? !(intValue < 0 || intValue >= jo0Var.f.size()) : !(intValue < 0 || intValue >= xeVar.e.size())) {
                    if (intValue == i10) {
                        v5Var.g(true);
                        return;
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final ArrayList c() {
        return this.a.c;
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final org.telegram.messenger.lc j(int i10) {
        org.telegram.ui.Cells.v5 a02 = jo0.a0(this.a, i10);
        if (a02 != null) {
            return a02.getImageView().getImageReceiver().p();
        }
        return null;
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final int k(int i10, org.telegram.messenger.y20 y20Var) {
        int d02;
        boolean z10;
        jo0 jo0Var = this.a;
        org.telegram.messenger.xe xeVar = jo0Var.J;
        if (xeVar != null) {
            if (i10 < 0 || i10 >= xeVar.e.size()) {
                return -1;
            }
            org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) jo0Var.J.e.get(i10);
            d02 = jo0Var.d0(-1, ffVar);
            if (d02 == -1) {
                ffVar.s = y20Var;
                d02 = jo0Var.c.indexOf(Integer.valueOf(ffVar.C));
                z10 = true;
            } else {
                ffVar.s = null;
                z10 = false;
            }
        } else {
            if (i10 < 0 || i10 >= jo0Var.f.size()) {
                return -1;
            }
            org.telegram.messenger.jf jfVar = (org.telegram.messenger.jf) jo0Var.f.get(i10);
            d02 = jo0Var.d0(-1, jfVar);
            if (d02 == -1) {
                jfVar.s = y20Var;
                d02 = jo0Var.c.indexOf(jfVar.B);
                z10 = true;
            } else {
                jfVar.s = null;
                z10 = false;
            }
        }
        int childCount = jo0Var.K.getChildCount();
        int i11 = 0;
        while (true) {
            if (i11 >= childCount) {
                break;
            }
            View childAt = jo0Var.K.getChildAt(i11);
            if (((Integer) childAt.getTag()).intValue() == i10) {
                ((org.telegram.ui.Cells.v5) childAt).b(jo0Var.e ? d02 : -1, z10, false);
            } else {
                i11++;
            }
        }
        jo0Var.n0(z10 ? 1 : 2);
        jo0Var.s0.y();
        return d02;
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final void o(int i10, org.telegram.messenger.y20 y20Var, boolean z10, int i11, int i12, boolean z11) {
        jo0 jo0Var = this.a;
        ArrayList arrayList = jo0Var.f;
        org.telegram.messenger.xe xeVar = jo0Var.J;
        if (jo0Var.b.isEmpty()) {
            if (xeVar != null) {
                if (i10 < 0 || i10 >= xeVar.e.size()) {
                    return;
                }
                org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) xeVar.e.get(i10);
                ffVar.s = y20Var;
                jo0Var.d0(-1, ffVar);
            } else {
                if (i10 < 0 || i10 >= arrayList.size()) {
                    return;
                }
                org.telegram.messenger.jf jfVar = (org.telegram.messenger.jf) arrayList.get(i10);
                jfVar.s = y20Var;
                jo0Var.d0(-1, jfVar);
            }
        }
        jo0Var.j0(i11, z10);
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final boolean u() {
        jo0 jo0Var = this.a;
        jo0Var.s0.u0(0, true, true);
        jo0Var.finishFragment();
        return true;
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final HashMap v() {
        return this.a.b;
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final boolean x(int i10) {
        jo0 jo0Var = this.a;
        org.telegram.messenger.xe xeVar = jo0Var.J;
        return xeVar != null ? i10 >= 0 && i10 < xeVar.e.size() && jo0Var.b.containsKey(Integer.valueOf(((org.telegram.messenger.ff) jo0Var.J.e.get(i10)).C)) : i10 >= 0 && i10 < jo0Var.f.size() && jo0Var.b.containsKey(((org.telegram.messenger.jf) jo0Var.f.get(i10)).B);
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final boolean z() {
        return this.a.E;
    }
}
