package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class qj extends dk0 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public pj f;
    public int h;
    public final /* synthetic */ uj n;

    public qj(uj ujVar, Context context) {
        this.n = ujVar;
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
            tj tjVar = (tj) f1Var.a;
            boolean z10 = i7 != b() + (-2);
            Object E = E(i7);
            if (E instanceof org.telegram.messenger.f5) {
                org.telegram.messenger.f5 f5Var = (org.telegram.messenger.f5) E;
                user = f5Var.m;
                if (user == null) {
                    tjVar.setCurrentId(f5Var.a);
                    tjVar.a(null, (CharSequence) this.e.get(i7 - 1), new mj(f5Var, 1), z10);
                    user = null;
                }
            } else {
                user = (TLRPC.User) E;
            }
            if (user != null) {
                tjVar.a(user, (CharSequence) this.e.get(i7 - 1), new nj(1, user), z10);
            }
            boolean containsKey = this.n.x.containsKey(kj.a(E));
            lp lpVar = tjVar.d;
            if (lpVar.getVisibility() != 0) {
                lpVar.setVisibility(0);
            }
            lpVar.a(containsKey, false);
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View tjVar;
        Context context = this.c;
        if (i7 == 0) {
            tjVar = new tj(context, this.n.a);
        } else if (i7 != 1) {
            tjVar = new View(context);
            tjVar.setTag(-33024);
        } else {
            tjVar = new View(context);
            tjVar.setLayoutParams(new v4.q0(-1, org.telegram.messenger.g0.L(56.0f)));
            tjVar.setTag(-33024);
        }
        return new mj0(tjVar);
    }
}
