package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ThemeActivity;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class h61 extends org.telegram.ui.Components.oj0 {
    public final Context c;
    public org.telegram.ui.ActionBar.j6 d;
    public ArrayList e;
    public final /* synthetic */ ThemeActivity f;

    public h61(ThemeActivity themeActivity, Context context) {
        this.f = themeActivity;
        this.c = context;
        f();
    }

    @Override // org.telegram.ui.Components.oj0
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
        this.d = this.f.f == 1 ? org.telegram.ui.ActionBar.k6.J : org.telegram.ui.ActionBar.k6.D0();
        this.e = new ArrayList(this.d.b0);
        super.f();
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        View view = d1Var.a;
        int d = d(i7);
        if (d == 0) {
            ThemeActivity.InnerAccentView innerAccentView = (ThemeActivity.InnerAccentView) view;
            org.telegram.ui.ActionBar.j6 j6Var = this.d;
            org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) this.e.get(i7);
            innerAccentView.d = j6Var;
            innerAccentView.e = h6Var;
            innerAccentView.a(false);
            return;
        }
        if (d != 1) {
            return;
        }
        y51 y51Var = (y51) view;
        org.telegram.ui.ActionBar.j6 j6Var2 = this.d;
        int i10 = y51.c;
        y51Var.getClass();
        if (j6Var2.W >= 8) {
            y51Var.b = new int[]{j6Var2.l(6), j6Var2.l(4), j6Var2.l(7), j6Var2.l(2), j6Var2.l(0), j6Var2.l(5), j6Var2.l(3)};
        } else {
            y51Var.b = new int[7];
        }
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        Context context = this.c;
        return i7 != 0 ? new org.telegram.ui.Components.xi0(new y51(context)) : new org.telegram.ui.Components.xi0(new ThemeActivity.InnerAccentView(context));
    }
}
