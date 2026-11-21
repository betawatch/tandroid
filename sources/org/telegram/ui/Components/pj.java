package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class pj extends zj0 {
    public final int r = org.telegram.messenger.j10.t0;
    public final Context s;
    public final /* synthetic */ vj w;

    public pj(vj vjVar, Context context) {
        this.w = vjVar;
        this.s = context;
    }

    @Override // org.telegram.ui.Components.kj0
    public final String F(int i7) {
        return null;
    }

    @Override // org.telegram.ui.Components.kj0
    public final void G(ek0 ek0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // org.telegram.ui.Components.zj0
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

    @Override // org.telegram.ui.Components.zj0
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

    @Override // org.telegram.ui.Components.zj0
    public final int P(int i7, int i10) {
        if (i7 == 0) {
            return 1;
        }
        return i7 == R() - 1 ? 2 : 0;
    }

    @Override // org.telegram.ui.Components.zj0
    public final int R() {
        return org.telegram.messenger.i5.r(this.r).d0.size() + 2;
    }

    @Override // org.telegram.ui.Components.zj0
    public final View T(int i7, View view) {
        return null;
    }

    @Override // org.telegram.ui.Components.zj0
    public final boolean V(int i7, int i10, v4.f1 f1Var) {
        if (i7 == 0 || i7 == R() - 1) {
            return false;
        }
        int i11 = this.r;
        return i10 < ((ArrayList) org.telegram.messenger.i5.r(i11).c0.get(org.telegram.messenger.i5.r(i11).d0.get(i7 + (-1)))).size();
    }

    @Override // org.telegram.ui.Components.zj0
    public final void W(int i7, int i10, v4.f1 f1Var) {
        TLRPC.User user;
        if (f1Var.f == 0) {
            uj ujVar = (uj) f1Var.a;
            Object O = O(i7, i10);
            boolean z10 = true;
            if (i7 == R() - 2 && i10 == M(i7) - 1) {
                z10 = false;
            }
            if (O instanceof org.telegram.messenger.f5) {
                org.telegram.messenger.f5 f5Var = (org.telegram.messenger.f5) O;
                user = f5Var.m;
                if (user == null) {
                    ujVar.setCurrentId(f5Var.a);
                    ujVar.a(null, org.telegram.messenger.i5.m(0, f5Var.i, f5Var.j), new nj(f5Var, 0), z10);
                    user = null;
                }
            } else {
                user = (TLRPC.User) O;
            }
            if (user != null) {
                ujVar.a(user, null, new oj(0, user), z10);
            }
            boolean containsKey = this.w.x.containsKey(lj.a(O));
            op opVar = ujVar.d;
            if (opVar.getVisibility() != 0) {
                opVar.setVisibility(0);
            }
            opVar.a(containsKey, false);
        }
    }

    @Override // org.telegram.ui.Components.zj0, v4.i0
    public final void f() {
        X(false);
        this.w.S();
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View ujVar;
        Context context = this.s;
        if (i7 == 0) {
            ujVar = new uj(context, this.w.a);
        } else if (i7 != 1) {
            ujVar = new View(context);
            ujVar.setTag(-33024);
        } else {
            ujVar = new View(context);
            ujVar.setLayoutParams(new v4.q0(-1, org.telegram.messenger.g0.L(56.0f)));
            ujVar.setTag(-33024);
        }
        return new mj0(ujVar);
    }
}
