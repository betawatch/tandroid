package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class mm0 extends eq0 {
    public final /* synthetic */ sm0 a;

    public mm0(sm0 sm0Var) {
        this.a = sm0Var;
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final mq0 E(org.telegram.messenger.zi ziVar, TLRPC.FileLocation fileLocation, int i3, boolean z10, boolean z11) {
        sm0 sm0Var = this.a;
        org.telegram.ui.Cells.q5 a02 = sm0.a0(sm0Var, i3);
        if (a02 == null) {
            return null;
        }
        org.telegram.ui.Components.k9 imageView = a02.getImageView();
        int[] iArr = new int[2];
        imageView.getLocationInWindow(iArr);
        mq0 mq0Var = new mq0();
        mq0Var.b = iArr[0];
        mq0Var.c = iArr[1];
        mq0Var.d = sm0Var.L;
        ImageReceiver imageReceiver = imageView.getImageReceiver();
        mq0Var.a = imageReceiver;
        mq0Var.e = imageReceiver.p();
        mq0Var.k = a02.getScale();
        a02.g(false);
        return mq0Var;
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final void G() {
        sm0 sm0Var = this.a;
        int childCount = sm0Var.L.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = sm0Var.L.getChildAt(i3);
            if (childAt instanceof org.telegram.ui.Cells.q5) {
                ((org.telegram.ui.Cells.q5) childAt).g(true);
            }
        }
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final int H() {
        return this.a.b.size();
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final int R(Object obj) {
        Object valueOf = obj instanceof org.telegram.messenger.ye ? Integer.valueOf(((org.telegram.messenger.ye) obj).C) : obj instanceof org.telegram.messenger.bf ? ((org.telegram.messenger.bf) obj).B : null;
        if (valueOf == null) {
            return -1;
        }
        sm0 sm0Var = this.a;
        if (!sm0Var.b.containsKey(valueOf)) {
            return -1;
        }
        sm0Var.b.remove(valueOf);
        int indexOf = sm0Var.c.indexOf(valueOf);
        if (indexOf >= 0) {
            sm0Var.c.remove(indexOf);
        }
        if (sm0Var.e) {
            sm0Var.m0();
        }
        return indexOf;
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final void X(int i3) {
        sm0 sm0Var = this.a;
        org.telegram.messenger.pe peVar = sm0Var.K;
        org.telegram.ui.Cells.q5 a02 = sm0.a0(sm0Var, i3);
        if (a02 != null) {
            if (peVar == null) {
                a02.e((org.telegram.messenger.bf) sm0Var.f.get(i3));
                return;
            }
            org.telegram.ui.Components.k9 imageView = a02.getImageView();
            imageView.r();
            org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) peVar.e.get(i3);
            String str = yeVar.c;
            int i10 = yeVar.C;
            String str2 = yeVar.I;
            if (str != null) {
                imageView.h(str, null, org.telegram.ui.ActionBar.k6.R4);
                return;
            }
            if (str2 == null) {
                imageView.setImageDrawable(org.telegram.ui.ActionBar.k6.R4);
                return;
            }
            imageView.s(yeVar.J, yeVar.K, true);
            if (!yeVar.b || yeVar.d()) {
                imageView.h("thumb://" + i10 + ":" + str2, null, org.telegram.ui.ActionBar.k6.R4);
                return;
            }
            imageView.h("vthumb://" + i10 + ":" + str2, null, org.telegram.ui.ActionBar.k6.R4);
        }
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final void a0(int i3) {
        sm0 sm0Var = this.a;
        int childCount = sm0Var.L.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = sm0Var.L.getChildAt(i10);
            if (childAt.getTag() != null) {
                org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                int intValue = ((Integer) childAt.getTag()).intValue();
                org.telegram.messenger.pe peVar = sm0Var.K;
                if (peVar == null ? !(intValue < 0 || intValue >= sm0Var.f.size()) : !(intValue < 0 || intValue >= peVar.e.size())) {
                    if (intValue == i3) {
                        q5Var.g(true);
                        return;
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final ArrayList c() {
        return this.a.c;
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final org.telegram.messenger.cc j(int i3) {
        org.telegram.ui.Cells.q5 a02 = sm0.a0(this.a, i3);
        if (a02 != null) {
            return a02.getImageView().getImageReceiver().p();
        }
        return null;
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final int k(int i3, org.telegram.messenger.b20 b20Var) {
        int d02;
        boolean z10;
        sm0 sm0Var = this.a;
        org.telegram.messenger.pe peVar = sm0Var.K;
        if (peVar != null) {
            if (i3 < 0 || i3 >= peVar.e.size()) {
                return -1;
            }
            org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) sm0Var.K.e.get(i3);
            d02 = sm0Var.d0(-1, yeVar);
            if (d02 == -1) {
                yeVar.s = b20Var;
                d02 = sm0Var.c.indexOf(Integer.valueOf(yeVar.C));
                z10 = true;
            } else {
                yeVar.s = null;
                z10 = false;
            }
        } else {
            if (i3 < 0 || i3 >= sm0Var.f.size()) {
                return -1;
            }
            org.telegram.messenger.bf bfVar = (org.telegram.messenger.bf) sm0Var.f.get(i3);
            d02 = sm0Var.d0(-1, bfVar);
            if (d02 == -1) {
                bfVar.s = b20Var;
                d02 = sm0Var.c.indexOf(bfVar.B);
                z10 = true;
            } else {
                bfVar.s = null;
                z10 = false;
            }
        }
        int childCount = sm0Var.L.getChildCount();
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                break;
            }
            View childAt = sm0Var.L.getChildAt(i10);
            if (((Integer) childAt.getTag()).intValue() == i3) {
                ((org.telegram.ui.Cells.q5) childAt).b(sm0Var.e ? d02 : -1, z10, false);
            } else {
                i10++;
            }
        }
        sm0Var.n0(z10 ? 1 : 2);
        sm0Var.t0.m();
        return d02;
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final void o(int i3, org.telegram.messenger.b20 b20Var, boolean z10, int i10, int i11, boolean z11) {
        sm0 sm0Var = this.a;
        ArrayList arrayList = sm0Var.f;
        org.telegram.messenger.pe peVar = sm0Var.K;
        if (sm0Var.b.isEmpty()) {
            if (peVar != null) {
                if (i3 < 0 || i3 >= peVar.e.size()) {
                    return;
                }
                org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) peVar.e.get(i3);
                yeVar.s = b20Var;
                sm0Var.d0(-1, yeVar);
            } else {
                if (i3 < 0 || i3 >= arrayList.size()) {
                    return;
                }
                org.telegram.messenger.bf bfVar = (org.telegram.messenger.bf) arrayList.get(i3);
                bfVar.s = b20Var;
                sm0Var.d0(-1, bfVar);
            }
        }
        sm0Var.j0(i10, z10);
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final boolean u() {
        sm0 sm0Var = this.a;
        sm0Var.t0.v0(0, true, true);
        sm0Var.finishFragment();
        return true;
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final HashMap v() {
        return this.a.b;
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final boolean x(int i3) {
        sm0 sm0Var = this.a;
        org.telegram.messenger.pe peVar = sm0Var.K;
        return peVar != null ? i3 >= 0 && i3 < peVar.e.size() && sm0Var.b.containsKey(Integer.valueOf(((org.telegram.messenger.ye) sm0Var.K.e.get(i3)).C)) : i3 >= 0 && i3 < sm0Var.f.size() && sm0Var.b.containsKey(((org.telegram.messenger.bf) sm0Var.f.get(i3)).B);
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final boolean z() {
        return this.a.F;
    }
}
