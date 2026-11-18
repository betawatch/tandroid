package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class pj extends bk0 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public oj f;
    public int h;
    public final /* synthetic */ tj n;

    public pj(tj tjVar, Context context) {
        this.n = tjVar;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.bk0
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
            sj sjVar = (sj) f1Var.a;
            boolean z10 = i7 != b() + (-2);
            Object E = E(i7);
            if (E instanceof org.telegram.messenger.f5) {
                org.telegram.messenger.f5 f5Var = (org.telegram.messenger.f5) E;
                user = f5Var.m;
                if (user == null) {
                    sjVar.setCurrentId(f5Var.a);
                    sjVar.a(null, (CharSequence) this.e.get(i7 - 1), new lj(f5Var, 1), z10);
                    user = null;
                }
            } else {
                user = (TLRPC.User) E;
            }
            if (user != null) {
                sjVar.a(user, (CharSequence) this.e.get(i7 - 1), new mj(1, user), z10);
            }
            boolean containsKey = this.n.x.containsKey(jj.a(E));
            mp mpVar = sjVar.d;
            if (mpVar.getVisibility() != 0) {
                mpVar.setVisibility(0);
            }
            mpVar.a(containsKey, false);
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View sjVar;
        Context context = this.c;
        if (i7 == 0) {
            sjVar = new sj(context, this.n.a);
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
