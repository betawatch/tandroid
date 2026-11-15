package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ThemeActivity;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class e61 extends org.telegram.ui.Components.tj0 {
    public final Context c;
    public org.telegram.ui.ActionBar.i6 d;
    public ArrayList e;
    public final /* synthetic */ ThemeActivity f;

    public e61(ThemeActivity themeActivity, Context context) {
        this.f = themeActivity;
        this.c = context;
        f();
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        return false;
    }

    @Override // v4.h0
    public final int b() {
        if (this.e.isEmpty()) {
            return 0;
        }
        return this.e.size() + 1;
    }

    @Override // v4.h0
    public final int d(int i7) {
        return i7 == b() - 1 ? 1 : 0;
    }

    @Override // v4.h0
    public final void f() {
        this.d = this.f.f == 1 ? org.telegram.ui.ActionBar.j6.J : org.telegram.ui.ActionBar.j6.D0();
        this.e = new ArrayList(this.d.c0);
        super.f();
    }

    @Override // v4.h0
    public final void t(v4.e1 e1Var, int i7) {
        View view = e1Var.a;
        int d = d(i7);
        if (d == 0) {
            ThemeActivity.InnerAccentView innerAccentView = (ThemeActivity.InnerAccentView) view;
            org.telegram.ui.ActionBar.i6 i6Var = this.d;
            org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.e.get(i7);
            innerAccentView.d = i6Var;
            innerAccentView.e = g6Var;
            innerAccentView.a(false);
            return;
        }
        if (d != 1) {
            return;
        }
        v51 v51Var = (v51) view;
        org.telegram.ui.ActionBar.i6 i6Var2 = this.d;
        int i10 = v51.c;
        v51Var.getClass();
        if (i6Var2.X >= 8) {
            v51Var.b = new int[]{i6Var2.l(6), i6Var2.l(4), i6Var2.l(7), i6Var2.l(2), i6Var2.l(0), i6Var2.l(5), i6Var2.l(3)};
        } else {
            v51Var.b = new int[7];
        }
    }

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        Context context = this.c;
        return i7 != 0 ? new org.telegram.ui.Components.cj0(new v51(context)) : new org.telegram.ui.Components.cj0(new ThemeActivity.InnerAccentView(context));
    }
}
