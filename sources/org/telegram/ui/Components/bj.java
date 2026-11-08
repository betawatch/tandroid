package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class bj extends oj0 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public aj f;
    public int h;
    public final /* synthetic */ fj n;

    public bj(fj fjVar, Context context) {
        this.n = fjVar;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        return d1Var.f == 0;
    }

    public final Object E(int i7) {
        int i10 = i7 - 1;
        if (i10 < 0 || i10 >= this.d.size()) {
            return null;
        }
        return this.d.get(i10);
    }

    @Override // v4.g0
    public final int b() {
        return this.d.size() + 2;
    }

    @Override // v4.g0
    public final int d(int i7) {
        if (i7 == 0) {
            return 1;
        }
        return i7 == b() - 1 ? 2 : 0;
    }

    @Override // v4.g0
    public final void f() {
        super.f();
        this.n.R();
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        TLRPC.User user;
        if (d1Var.f == 0) {
            ej ejVar = (ej) d1Var.a;
            boolean z9 = i7 != b() + (-2);
            Object E = E(i7);
            if (E instanceof org.telegram.messenger.d5) {
                org.telegram.messenger.d5 d5Var = (org.telegram.messenger.d5) E;
                user = d5Var.m;
                if (user == null) {
                    ejVar.setCurrentId(d5Var.a);
                    ejVar.a(null, (CharSequence) this.e.get(i7 - 1), new xi(d5Var, 1), z9);
                    user = null;
                }
            } else {
                user = (TLRPC.User) E;
            }
            if (user != null) {
                ejVar.a(user, (CharSequence) this.e.get(i7 - 1), new yi(1, user), z9);
            }
            boolean containsKey = this.n.x.containsKey(vi.a(E));
            wo woVar = ejVar.d;
            if (woVar.getVisibility() != 0) {
                woVar.setVisibility(0);
            }
            woVar.a(containsKey, false);
        }
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View ejVar;
        Context context = this.c;
        if (i7 == 0) {
            ejVar = new ej(context, this.n.a);
        } else if (i7 != 1) {
            ejVar = new View(context);
            ejVar.setTag(-33024);
        } else {
            ejVar = new View(context);
            ejVar.setLayoutParams(new v4.o0(-1, org.telegram.messenger.g0.L(56.0f)));
            ejVar.setTag(-33024);
        }
        return new xi0(ejVar);
    }
}
