package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class nj extends xj0 {
    public final int r = org.telegram.messenger.j10.t0;
    public final Context s;
    public final /* synthetic */ tj w;

    public nj(tj tjVar, Context context) {
        this.w = tjVar;
        this.s = context;
    }

    @Override // org.telegram.ui.Components.ij0
    public final String F(int i7) {
        return null;
    }

    @Override // org.telegram.ui.Components.ij0
    public final void G(ck0 ck0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // org.telegram.ui.Components.xj0
    public final int M(int i7) {
        if (i7 == 0 || i7 == R() - 1) {
            return 1;
        }
        int i10 = i7 - 1;
        int i11 = this.r;
        HashMap hashMap = org.telegram.messenger.i5.r(i11).c0;
        ArrayList arrayList = org.telegram.messenger.i5.r(i11).d0;
        if (i10 < arrayList.size()) {
            return ((ArrayList) hashMap.get(arrayList.get(i10))).size();
        }
        return 0;
    }

    @Override // org.telegram.ui.Components.xj0
    public final Object O(int i7, int i10) {
        if (i7 == 0) {
            return null;
        }
        int i11 = i7 - 1;
        int i12 = this.r;
        HashMap hashMap = org.telegram.messenger.i5.r(i12).c0;
        ArrayList arrayList = org.telegram.messenger.i5.r(i12).d0;
        if (i11 < arrayList.size()) {
            ArrayList arrayList2 = (ArrayList) hashMap.get(arrayList.get(i11));
            if (i10 < arrayList2.size()) {
                return arrayList2.get(i10);
            }
        }
        return null;
    }

    @Override // org.telegram.ui.Components.xj0
    public final int P(int i7, int i10) {
        if (i7 == 0) {
            return 1;
        }
        return i7 == R() - 1 ? 2 : 0;
    }

    @Override // org.telegram.ui.Components.xj0
    public final int R() {
        return org.telegram.messenger.i5.r(this.r).d0.size() + 2;
    }

    @Override // org.telegram.ui.Components.xj0
    public final View T(int i7, View view) {
        return null;
    }

    @Override // org.telegram.ui.Components.xj0
    public final boolean V(int i7, int i10, v4.f1 f1Var) {
        if (i7 == 0 || i7 == R() - 1) {
            return false;
        }
        int i11 = this.r;
        return i10 < ((ArrayList) org.telegram.messenger.i5.r(i11).c0.get(org.telegram.messenger.i5.r(i11).d0.get(i7 + (-1)))).size();
    }

    @Override // org.telegram.ui.Components.xj0
    public final void W(int i7, int i10, v4.f1 f1Var) {
        TLRPC.User user;
        if (f1Var.f == 0) {
            sj sjVar = (sj) f1Var.a;
            Object O = O(i7, i10);
            boolean z10 = true;
            if (i7 == R() - 2 && i10 == M(i7) - 1) {
                z10 = false;
            }
            if (O instanceof org.telegram.messenger.f5) {
                org.telegram.messenger.f5 f5Var = (org.telegram.messenger.f5) O;
                user = f5Var.m;
                if (user == null) {
                    sjVar.setCurrentId(f5Var.a);
                    sjVar.a(null, org.telegram.messenger.i5.m(0, f5Var.i, f5Var.j), new lj(f5Var, 0), z10);
                    user = null;
                }
            } else {
                user = (TLRPC.User) O;
            }
            if (user != null) {
                sjVar.a(user, null, new mj(0, user), z10);
            }
            boolean containsKey = this.w.x.containsKey(jj.a(O));
            mp mpVar = sjVar.d;
            if (mpVar.getVisibility() != 0) {
                mpVar.setVisibility(0);
            }
            mpVar.a(containsKey, false);
        }
    }

    @Override // org.telegram.ui.Components.xj0, v4.i0
    public final void f() {
        X(false);
        this.w.S();
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View sjVar;
        Context context = this.s;
        if (i7 == 0) {
            sjVar = new sj(context, this.w.a);
        } else if (i7 != 1) {
            sjVar = new View(context);
            sjVar.setTag(-33024);
        } else {
            sjVar = new View(context);
            sjVar.setLayoutParams(new v4.q0(-1, org.telegram.messenger.g0.L(56.0f)));
            sjVar.setTag(-33024);
        }
        return new kj0(sjVar);
    }
}
