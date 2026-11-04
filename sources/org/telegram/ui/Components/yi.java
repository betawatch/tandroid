package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class yi extends oj0 {
    public final int r = org.telegram.messenger.h10.t0;
    public final Context s;
    public final /* synthetic */ ej w;

    public yi(ej ejVar, Context context) {
        this.w = ejVar;
        this.s = context;
    }

    @Override // org.telegram.ui.Components.zi0
    public final String F(int i3) {
        return null;
    }

    @Override // org.telegram.ui.Components.zi0
    public final void G(tj0 tj0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // org.telegram.ui.Components.oj0
    public final int M(int i3) {
        if (i3 == 0 || i3 == R() - 1) {
            return 1;
        }
        int i10 = i3 - 1;
        int i11 = this.r;
        HashMap hashMap = org.telegram.messenger.g5.r(i11).c0;
        ArrayList arrayList = org.telegram.messenger.g5.r(i11).d0;
        if (i10 < arrayList.size()) {
            return ((ArrayList) hashMap.get(arrayList.get(i10))).size();
        }
        return 0;
    }

    @Override // org.telegram.ui.Components.oj0
    public final Object O(int i3, int i10) {
        if (i3 == 0) {
            return null;
        }
        int i11 = i3 - 1;
        int i12 = this.r;
        HashMap hashMap = org.telegram.messenger.g5.r(i12).c0;
        ArrayList arrayList = org.telegram.messenger.g5.r(i12).d0;
        if (i11 < arrayList.size()) {
            ArrayList arrayList2 = (ArrayList) hashMap.get(arrayList.get(i11));
            if (i10 < arrayList2.size()) {
                return arrayList2.get(i10);
            }
        }
        return null;
    }

    @Override // org.telegram.ui.Components.oj0
    public final int P(int i3, int i10) {
        if (i3 == 0) {
            return 1;
        }
        return i3 == R() - 1 ? 2 : 0;
    }

    @Override // org.telegram.ui.Components.oj0
    public final int R() {
        return org.telegram.messenger.g5.r(this.r).d0.size() + 2;
    }

    @Override // org.telegram.ui.Components.oj0
    public final View T(int i3, View view) {
        return null;
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean V(int i3, int i10, u4.d1 d1Var) {
        if (i3 == 0 || i3 == R() - 1) {
            return false;
        }
        int i11 = this.r;
        return i10 < ((ArrayList) org.telegram.messenger.g5.r(i11).c0.get(org.telegram.messenger.g5.r(i11).d0.get(i3 + (-1)))).size();
    }

    @Override // org.telegram.ui.Components.oj0
    public final void W(int i3, int i10, u4.d1 d1Var) {
        TLRPC.User user;
        if (d1Var.f == 0) {
            dj djVar = (dj) d1Var.a;
            Object O = O(i3, i10);
            boolean z10 = true;
            if (i3 == R() - 2 && i10 == M(i3) - 1) {
                z10 = false;
            }
            if (O instanceof org.telegram.messenger.d5) {
                org.telegram.messenger.d5 d5Var = (org.telegram.messenger.d5) O;
                user = d5Var.m;
                if (user == null) {
                    djVar.setCurrentId(d5Var.a);
                    djVar.a(null, org.telegram.messenger.g5.m(0, d5Var.i, d5Var.j), new wi(d5Var, 0), z10);
                    user = null;
                }
            } else {
                user = (TLRPC.User) O;
            }
            if (user != null) {
                djVar.a(user, null, new xi(0, user), z10);
            }
            boolean containsKey = this.w.x.containsKey(ui.a(O));
            wo woVar = djVar.d;
            if (woVar.getVisibility() != 0) {
                woVar.setVisibility(0);
            }
            woVar.a(containsKey, false);
        }
    }

    @Override // org.telegram.ui.Components.oj0, u4.h0
    public final void f() {
        X(false);
        this.w.R();
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View djVar;
        Context context = this.s;
        if (i3 == 0) {
            djVar = new dj(context, this.w.a);
        } else if (i3 != 1) {
            djVar = new View(context);
            djVar.setTag(-33024);
        } else {
            djVar = new View(context);
            djVar.setLayoutParams(new u4.p0(-1, org.telegram.messenger.g0.L(56.0f)));
            djVar.setTag(-33024);
        }
        return new bj0(djVar);
    }
}
