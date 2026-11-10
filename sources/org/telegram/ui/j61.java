package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ThemeActivity;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class j61 extends org.telegram.ui.Components.oj0 {
    public final Context c;
    public org.telegram.ui.ActionBar.l6 d;
    public ArrayList e;
    public final /* synthetic */ ThemeActivity f;

    public j61(ThemeActivity themeActivity, Context context) {
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
        this.d = this.f.f == 1 ? org.telegram.ui.ActionBar.m6.J : org.telegram.ui.ActionBar.m6.D0();
        this.e = new ArrayList(this.d.b0);
        super.f();
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        View view = d1Var.a;
        int d = d(i7);
        if (d == 0) {
            ThemeActivity.InnerAccentView innerAccentView = (ThemeActivity.InnerAccentView) view;
            org.telegram.ui.ActionBar.l6 l6Var = this.d;
            org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) this.e.get(i7);
            innerAccentView.d = l6Var;
            innerAccentView.e = j6Var;
            innerAccentView.a(false);
            return;
        }
        if (d != 1) {
            return;
        }
        a61 a61Var = (a61) view;
        org.telegram.ui.ActionBar.l6 l6Var2 = this.d;
        int i10 = a61.c;
        a61Var.getClass();
        if (l6Var2.W >= 8) {
            a61Var.b = new int[]{l6Var2.l(6), l6Var2.l(4), l6Var2.l(7), l6Var2.l(2), l6Var2.l(0), l6Var2.l(5), l6Var2.l(3)};
        } else {
            a61Var.b = new int[7];
        }
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        Context context = this.c;
        return i7 != 0 ? new org.telegram.ui.Components.xi0(new a61(context)) : new org.telegram.ui.Components.xi0(new ThemeActivity.InnerAccentView(context));
    }
}
