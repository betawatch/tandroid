package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class aj extends sk0 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public zi f;
    public int h;
    public final /* synthetic */ ej n;

    public aj(ej ejVar, Context context) {
        this.n = ejVar;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f == 0;
    }

    public final Object E(int i10) {
        int i11 = i10 - 1;
        if (i11 < 0 || i11 >= this.d.size()) {
            return null;
        }
        return this.d.get(i11);
    }

    @Override // s4.g0
    public final int b() {
        return this.d.size() + 2;
    }

    @Override // s4.g0
    public final int d(int i10) {
        if (i10 == 0) {
            return 1;
        }
        return i10 == b() - 1 ? 2 : 0;
    }

    @Override // s4.g0
    public final void f() {
        super.f();
        this.n.Q();
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        TLRPC.User user;
        if (c1Var.f == 0) {
            dj djVar = (dj) c1Var.a;
            boolean z10 = i10 != b() + (-2);
            Object E = E(i10);
            if (E instanceof org.telegram.messenger.f5) {
                org.telegram.messenger.f5 f5Var = (org.telegram.messenger.f5) E;
                user = f5Var.m;
                if (user == null) {
                    djVar.setCurrentId(f5Var.a);
                    djVar.a(null, (CharSequence) this.e.get(i10 - 1), new wi(f5Var, 1), z10);
                    user = null;
                }
            } else {
                user = (TLRPC.User) E;
            }
            if (user != null) {
                djVar.a(user, (CharSequence) this.e.get(i10 - 1), new xi(1, user), z10);
            }
            boolean containsKey = this.n.x.containsKey(ui.a(E));
            ep epVar = djVar.d;
            if (epVar.getVisibility() != 0) {
                epVar.setVisibility(0);
            }
            epVar.a(containsKey, false);
        }
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View djVar;
        Context context = this.c;
        if (i10 == 0) {
            djVar = new dj(context, this.n.a);
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
