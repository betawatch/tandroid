package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class ij extends tj0 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public hj f;
    public int h;
    public final /* synthetic */ mj n;

    public ij(mj mjVar, Context context) {
        this.n = mjVar;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        return e1Var.f == 0;
    }

    public final Object E(int i7) {
        int i10 = i7 - 1;
        if (i10 < 0 || i10 >= this.d.size()) {
            return null;
        }
        return this.d.get(i10);
    }

    @Override // v4.h0
    public final int b() {
        return this.d.size() + 2;
    }

    @Override // v4.h0
    public final int d(int i7) {
        if (i7 == 0) {
            return 1;
        }
        return i7 == b() - 1 ? 2 : 0;
    }

    @Override // v4.h0
    public final void f() {
        super.f();
        this.n.S();
    }

    @Override // v4.h0
    public final void t(v4.e1 e1Var, int i7) {
        TLRPC.User user;
        if (e1Var.f == 0) {
            lj ljVar = (lj) e1Var.a;
            boolean z10 = i7 != b() + (-2);
            Object E = E(i7);
            if (E instanceof org.telegram.messenger.d5) {
                org.telegram.messenger.d5 d5Var = (org.telegram.messenger.d5) E;
                user = d5Var.m;
                if (user == null) {
                    ljVar.setCurrentId(d5Var.a);
                    ljVar.a(null, (CharSequence) this.e.get(i7 - 1), new ej(d5Var, 1), z10);
                    user = null;
                }
            } else {
                user = (TLRPC.User) E;
            }
            if (user != null) {
                ljVar.a(user, (CharSequence) this.e.get(i7 - 1), new fj(1, user), z10);
            }
            boolean containsKey = this.n.x.containsKey(cj.a(E));
            fp fpVar = ljVar.d;
            if (fpVar.getVisibility() != 0) {
                fpVar.setVisibility(0);
            }
            fpVar.a(containsKey, false);
        }
    }

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        View ljVar;
        Context context = this.c;
        if (i7 == 0) {
            ljVar = new lj(context, this.n.a);
        } else if (i7 != 1) {
            ljVar = new View(context);
            ljVar.setTag(-33024);
        } else {
            ljVar = new View(context);
            ljVar.setLayoutParams(new v4.p0(-1, org.telegram.messenger.g0.L(56.0f)));
            ljVar.setTag(-33024);
        }
        return new cj0(ljVar);
    }
}
