package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ThemeActivity;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class dc1 extends org.telegram.ui.Components.yl0 {
    public final Context c;
    public org.telegram.ui.ActionBar.h6 d;
    public ArrayList e;
    public final /* synthetic */ ThemeActivity f;

    public dc1(ThemeActivity themeActivity, Context context) {
        this.f = themeActivity;
        this.c = context;
        l();
    }

    @Override // org.telegram.ui.Components.yl0
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
        this.d = this.f.f == 1 ? org.telegram.ui.ActionBar.i6.J : org.telegram.ui.ActionBar.i6.A0();
        this.e = new ArrayList(this.d.b0);
        super.l();
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        View view = c1Var.a;
        int j3 = j(i10);
        if (j3 == 0) {
            ThemeActivity.InnerAccentView innerAccentView = (ThemeActivity.InnerAccentView) view;
            org.telegram.ui.ActionBar.h6 h6Var = this.d;
            org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.e.get(i10);
            innerAccentView.d = h6Var;
            innerAccentView.e = f6Var;
            innerAccentView.a(false);
            return;
        }
        if (j3 != 1) {
            return;
        }
        tb1 tb1Var = (tb1) view;
        org.telegram.ui.ActionBar.h6 h6Var2 = this.d;
        int i11 = tb1.c;
        tb1Var.getClass();
        if (h6Var2.W >= 8) {
            tb1Var.b = new int[]{h6Var2.l(6), h6Var2.l(4), h6Var2.l(7), h6Var2.l(2), h6Var2.l(0), h6Var2.l(5), h6Var2.l(3)};
        } else {
            tb1Var.b = new int[7];
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        Context context = this.c;
        return i10 != 0 ? new org.telegram.ui.Components.il0(new tb1(context)) : new org.telegram.ui.Components.il0(new ThemeActivity.InnerAccentView(context));
    }
}
