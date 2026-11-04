package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class aj extends sj0 {
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

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        return d1Var.f == 0;
    }

    public final Object E(int i3) {
        int i10 = i3 - 1;
        if (i10 < 0 || i10 >= this.d.size()) {
            return null;
        }
        return this.d.get(i10);
    }

    @Override // u4.h0
    public final int b() {
        return this.d.size() + 2;
    }

    @Override // u4.h0
    public final int d(int i3) {
        if (i3 == 0) {
            return 1;
        }
        return i3 == b() - 1 ? 2 : 0;
    }

    @Override // u4.h0
    public final void f() {
        super.f();
        this.n.R();
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        TLRPC.User user;
        if (d1Var.f == 0) {
            dj djVar = (dj) d1Var.a;
            boolean z10 = i3 != b() + (-2);
            Object E = E(i3);
            if (E instanceof org.telegram.messenger.d5) {
                org.telegram.messenger.d5 d5Var = (org.telegram.messenger.d5) E;
                user = d5Var.m;
                if (user == null) {
                    djVar.setCurrentId(d5Var.a);
                    djVar.a(null, (CharSequence) this.e.get(i3 - 1), new wi(d5Var, 1), z10);
                    user = null;
                }
            } else {
                user = (TLRPC.User) E;
            }
            if (user != null) {
                djVar.a(user, (CharSequence) this.e.get(i3 - 1), new xi(1, user), z10);
            }
            boolean containsKey = this.n.x.containsKey(ui.a(E));
            wo woVar = djVar.d;
            if (woVar.getVisibility() != 0) {
                woVar.setVisibility(0);
            }
            woVar.a(containsKey, false);
        }
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View djVar;
        Context context = this.c;
        if (i3 == 0) {
            djVar = new dj(context, this.n.a);
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
