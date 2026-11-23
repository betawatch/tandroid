package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ThemeActivity;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class g61 extends org.telegram.ui.Components.dk0 {
    public final Context c;
    public org.telegram.ui.ActionBar.m6 d;
    public ArrayList e;
    public final /* synthetic */ ThemeActivity f;

    public g61(ThemeActivity themeActivity, Context context) {
        this.f = themeActivity;
        this.c = context;
        f();
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        return false;
    }

    @Override // v4.i0
    public final int b() {
        if (this.e.isEmpty()) {
            return 0;
        }
        return this.e.size() + 1;
    }

    @Override // v4.i0
    public final int d(int i7) {
        return i7 == b() - 1 ? 1 : 0;
    }

    @Override // v4.i0
    public final void f() {
        this.d = this.f.f == 1 ? org.telegram.ui.ActionBar.n6.J : org.telegram.ui.ActionBar.n6.D0();
        this.e = new ArrayList(this.d.c0);
        super.f();
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        View view = f1Var.a;
        int d = d(i7);
        if (d == 0) {
            ThemeActivity.InnerAccentView innerAccentView = (ThemeActivity.InnerAccentView) view;
            org.telegram.ui.ActionBar.m6 m6Var = this.d;
            org.telegram.ui.ActionBar.k6 k6Var = (org.telegram.ui.ActionBar.k6) this.e.get(i7);
            innerAccentView.d = m6Var;
            innerAccentView.e = k6Var;
            innerAccentView.a(false);
            return;
        }
        if (d != 1) {
            return;
        }
        x51 x51Var = (x51) view;
        org.telegram.ui.ActionBar.m6 m6Var2 = this.d;
        int i10 = x51.c;
        x51Var.getClass();
        if (m6Var2.X >= 8) {
            x51Var.b = new int[]{m6Var2.l(6), m6Var2.l(4), m6Var2.l(7), m6Var2.l(2), m6Var2.l(0), m6Var2.l(5), m6Var2.l(3)};
        } else {
            x51Var.b = new int[7];
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        Context context = this.c;
        return i7 != 0 ? new org.telegram.ui.Components.mj0(new x51(context)) : new org.telegram.ui.Components.mj0(new ThemeActivity.InnerAccentView(context));
    }
}
