package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ThemeActivity;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class i61 extends org.telegram.ui.Components.pj0 {
    public final Context c;
    public org.telegram.ui.ActionBar.k6 d;
    public ArrayList e;
    public final /* synthetic */ ThemeActivity f;

    public i61(ThemeActivity themeActivity, Context context) {
        this.f = themeActivity;
        this.c = context;
        f();
    }

    @Override // org.telegram.ui.Components.pj0
    public final boolean D(v4.d1 d1Var) {
        return false;
    }

    @Override // v4.g0
    public final int b() {
        if (this.e.isEmpty()) {
            return 0;
        }
        return this.e.size() + 1;
    }

    @Override // v4.g0
    public final int d(int i7) {
        return i7 == b() - 1 ? 1 : 0;
    }

    @Override // v4.g0
    public final void f() {
        this.d = this.f.f == 1 ? org.telegram.ui.ActionBar.l6.J : org.telegram.ui.ActionBar.l6.D0();
        this.e = new ArrayList(this.d.b0);
        super.f();
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        View view = d1Var.a;
        int d = d(i7);
        if (d == 0) {
            ThemeActivity.InnerAccentView innerAccentView = (ThemeActivity.InnerAccentView) view;
            org.telegram.ui.ActionBar.k6 k6Var = this.d;
            org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.e.get(i7);
            innerAccentView.d = k6Var;
            innerAccentView.e = i6Var;
            innerAccentView.a(false);
            return;
        }
        if (d != 1) {
            return;
        }
        z51 z51Var = (z51) view;
        org.telegram.ui.ActionBar.k6 k6Var2 = this.d;
        int i10 = z51.c;
        z51Var.getClass();
        if (k6Var2.W >= 8) {
            z51Var.b = new int[]{k6Var2.l(6), k6Var2.l(4), k6Var2.l(7), k6Var2.l(2), k6Var2.l(0), k6Var2.l(5), k6Var2.l(3)};
        } else {
            z51Var.b = new int[7];
        }
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        Context context = this.c;
        return i7 != 0 ? new org.telegram.ui.Components.yi0(new z51(context)) : new org.telegram.ui.Components.yi0(new ThemeActivity.InnerAccentView(context));
    }
}
