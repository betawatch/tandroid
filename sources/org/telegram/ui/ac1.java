package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ThemeActivity;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class ac1 extends org.telegram.ui.Components.ll0 {
    public final Context c;
    public org.telegram.ui.ActionBar.g6 d;
    public ArrayList e;
    public final /* synthetic */ ThemeActivity f;

    public ac1(ThemeActivity themeActivity, Context context) {
        this.f = themeActivity;
        this.c = context;
        l();
    }

    @Override // org.telegram.ui.Components.ll0
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override // s4.h0
    public final int h() {
        if (this.e.isEmpty()) {
            return 0;
        }
        return this.e.size() + 1;
    }

    @Override // s4.h0
    public final int j(int i10) {
        return i10 == h() - 1 ? 1 : 0;
    }

    @Override // s4.h0
    public final void l() {
        this.d = this.f.f == 1 ? org.telegram.ui.ActionBar.h6.J : org.telegram.ui.ActionBar.h6.A0();
        this.e = new ArrayList(this.d.b0);
        super.l();
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        View view = c1Var.a;
        int j3 = j(i10);
        if (j3 == 0) {
            ThemeActivity.InnerAccentView innerAccentView = (ThemeActivity.InnerAccentView) view;
            org.telegram.ui.ActionBar.g6 g6Var = this.d;
            org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.e.get(i10);
            innerAccentView.d = g6Var;
            innerAccentView.e = f6Var;
            innerAccentView.a(false);
            return;
        }
        if (j3 != 1) {
            return;
        }
        qb1 qb1Var = (qb1) view;
        org.telegram.ui.ActionBar.g6 g6Var2 = this.d;
        int i11 = qb1.c;
        qb1Var.getClass();
        if (g6Var2.W >= 8) {
            qb1Var.b = new int[]{g6Var2.l(6), g6Var2.l(4), g6Var2.l(7), g6Var2.l(2), g6Var2.l(0), g6Var2.l(5), g6Var2.l(3)};
        } else {
            qb1Var.b = new int[7];
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        Context context = this.c;
        return i10 != 0 ? new org.telegram.ui.Components.wk0(new qb1(context)) : new org.telegram.ui.Components.wk0(new ThemeActivity.InnerAccentView(context));
    }
}
