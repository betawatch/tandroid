package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class yi extends ok0 {
    public final int r = org.telegram.messenger.d20.s0;
    public final Context s;
    public final /* synthetic */ ej w;

    public yi(ej ejVar, Context context) {
        this.w = ejVar;
        this.s = context;
    }

    @Override // org.telegram.ui.Components.ak0
    public final String F(int i10) {
        return null;
    }

    @Override // org.telegram.ui.Components.ak0
    public final void G(tk0 tk0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // org.telegram.ui.Components.ok0
    public final int M(int i10) {
        if (i10 == 0 || i10 == R() - 1) {
            return 1;
        }
        int i11 = i10 - 1;
        int i12 = this.r;
        HashMap hashMap = org.telegram.messenger.i5.r(i12).b0;
        ArrayList arrayList = org.telegram.messenger.i5.r(i12).c0;
        if (i11 < arrayList.size()) {
            return ((ArrayList) hashMap.get(arrayList.get(i11))).size();
        }
        return 0;
    }

    @Override // org.telegram.ui.Components.ok0
    public final Object O(int i10, int i11) {
        if (i10 == 0) {
            return null;
        }
        int i12 = i10 - 1;
        int i13 = this.r;
        HashMap hashMap = org.telegram.messenger.i5.r(i13).b0;
        ArrayList arrayList = org.telegram.messenger.i5.r(i13).c0;
        if (i12 < arrayList.size()) {
            ArrayList arrayList2 = (ArrayList) hashMap.get(arrayList.get(i12));
            if (i11 < arrayList2.size()) {
                return arrayList2.get(i11);
            }
        }
        return null;
    }

    @Override // org.telegram.ui.Components.ok0
    public final int P(int i10, int i11) {
        if (i10 == 0) {
            return 1;
        }
        return i10 == R() - 1 ? 2 : 0;
    }

    @Override // org.telegram.ui.Components.ok0
    public final int R() {
        return org.telegram.messenger.i5.r(this.r).c0.size() + 2;
    }

    @Override // org.telegram.ui.Components.ok0
    public final View T(int i10, View view) {
        return null;
    }

    @Override // org.telegram.ui.Components.ok0
    public final boolean V(int i10, int i11, s4.c1 c1Var) {
        if (i10 == 0 || i10 == R() - 1) {
            return false;
        }
        int i12 = this.r;
        return i11 < ((ArrayList) org.telegram.messenger.i5.r(i12).b0.get(org.telegram.messenger.i5.r(i12).c0.get(i10 + (-1)))).size();
    }

    @Override // org.telegram.ui.Components.ok0
    public final void W(int i10, int i11, s4.c1 c1Var) {
        TLRPC.User user;
        if (c1Var.f == 0) {
            dj djVar = (dj) c1Var.a;
            Object O = O(i10, i11);
            boolean z10 = true;
            if (i10 == R() - 2 && i11 == M(i10) - 1) {
                z10 = false;
            }
            if (O instanceof org.telegram.messenger.f5) {
                org.telegram.messenger.f5 f5Var = (org.telegram.messenger.f5) O;
                user = f5Var.m;
                if (user == null) {
                    djVar.setCurrentId(f5Var.a);
                    djVar.a(null, org.telegram.messenger.i5.m(0, f5Var.i, f5Var.j), new wi(f5Var, 0), z10);
                    user = null;
                }
            } else {
                user = (TLRPC.User) O;
            }
            if (user != null) {
                djVar.a(user, null, new xi(0, user), z10);
            }
            boolean containsKey = this.w.x.containsKey(ui.a(O));
            ep epVar = djVar.d;
            if (epVar.getVisibility() != 0) {
                epVar.setVisibility(0);
            }
            epVar.a(containsKey, false);
        }
    }

    @Override // org.telegram.ui.Components.ok0, s4.g0
    public final void f() {
        X(false);
        this.w.Q();
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View djVar;
        Context context = this.s;
        if (i10 == 0) {
            djVar = new dj(context, this.w.a);
        } else if (i10 != 1) {
            djVar = new View(context);
            djVar.setTag(-33024);
        } else {
            djVar = new View(context);
            djVar.setLayoutParams(new s4.o0(-1, org.telegram.messenger.i0.L(56.0f)));
            djVar.setTag(-33024);
        }
        return new ck0(djVar);
    }
}
