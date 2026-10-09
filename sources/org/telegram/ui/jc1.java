package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ThemeActivity;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class jc1 extends org.telegram.ui.Components.pm0 {
    public final Context c;
    public org.telegram.ui.ActionBar.h6 d;
    public ArrayList e;
    public final /* synthetic */ ThemeActivity f;

    public jc1(ThemeActivity themeActivity, Context context) {
        this.f = themeActivity;
        this.c = context;
        l();
    }

    @Override // org.telegram.ui.Components.pm0
    public final boolean D(s4.d1 d1Var) {
        return false;
    }

    @Override // s4.i0
    public final int h() {
        if (this.e.isEmpty()) {
            return 0;
        }
        return this.e.size() + 1;
    }

    @Override // s4.i0
    public final int j(int i10) {
        return i10 == h() - 1 ? 1 : 0;
    }

    @Override // s4.i0
    public final void l() {
        this.d = this.f.f == 1 ? org.telegram.ui.ActionBar.i6.J : org.telegram.ui.ActionBar.i6.B0();
        this.e = new ArrayList(this.d.b0);
        super.l();
    }

    @Override // s4.i0
    public final void v(s4.d1 d1Var, int i10) {
        View view = d1Var.a;
        int j3 = j(i10);
        if (j3 == 0) {
            ThemeActivity.InnerAccentView innerAccentView = (ThemeActivity.InnerAccentView) view;
            org.telegram.ui.ActionBar.h6 h6Var = this.d;
            org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.e.get(i10);
            innerAccentView.d = h6Var;
            innerAccentView.e = g6Var;
            innerAccentView.a(false);
            return;
        }
        if (j3 != 1) {
            return;
        }
        zb1 zb1Var = (zb1) view;
        org.telegram.ui.ActionBar.h6 h6Var2 = this.d;
        int i11 = zb1.c;
        zb1Var.getClass();
        if (h6Var2.W >= 8) {
            zb1Var.b = new int[]{h6Var2.l(6), h6Var2.l(4), h6Var2.l(7), h6Var2.l(2), h6Var2.l(0), h6Var2.l(5), h6Var2.l(3)};
        } else {
            zb1Var.b = new int[7];
        }
    }

    @Override // s4.i0
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        Context context = this.c;
        return i10 != 0 ? new org.telegram.ui.Components.am0(new zb1(context)) : new org.telegram.ui.Components.am0(new ThemeActivity.InnerAccentView(context));
    }
}
