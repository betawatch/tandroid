package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class rj extends dk0 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public qj f;
    public int h;
    public final /* synthetic */ vj n;

    public rj(vj vjVar, Context context) {
        this.n = vjVar;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        return f1Var.f == 0;
    }

    public final Object E(int i7) {
        int i10 = i7 - 1;
        if (i10 < 0 || i10 >= this.d.size()) {
            return null;
        }
        return this.d.get(i10);
    }

    @Override // v4.i0
    public final int b() {
        return this.d.size() + 2;
    }

    @Override // v4.i0
    public final int d(int i7) {
        if (i7 == 0) {
            return 1;
        }
        return i7 == b() - 1 ? 2 : 0;
    }

    @Override // v4.i0
    public final void f() {
        super.f();
        this.n.S();
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        TLRPC.User user;
        if (f1Var.f == 0) {
            uj ujVar = (uj) f1Var.a;
            boolean z10 = i7 != b() + (-2);
            Object E = E(i7);
            if (E instanceof org.telegram.messenger.f5) {
                org.telegram.messenger.f5 f5Var = (org.telegram.messenger.f5) E;
                user = f5Var.m;
                if (user == null) {
                    ujVar.setCurrentId(f5Var.a);
                    ujVar.a(null, (CharSequence) this.e.get(i7 - 1), new nj(f5Var, 1), z10);
                    user = null;
                }
            } else {
                user = (TLRPC.User) E;
            }
            if (user != null) {
                ujVar.a(user, (CharSequence) this.e.get(i7 - 1), new oj(1, user), z10);
            }
            boolean containsKey = this.n.x.containsKey(lj.a(E));
            op opVar = ujVar.d;
            if (opVar.getVisibility() != 0) {
                opVar.setVisibility(0);
            }
            opVar.a(containsKey, false);
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View ujVar;
        Context context = this.c;
        if (i7 == 0) {
            ujVar = new uj(context, this.n.a);
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
