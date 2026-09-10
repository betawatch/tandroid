package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ThemeActivity;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class mc1 extends org.telegram.ui.Components.ul0 {
    public final Context c;
    public org.telegram.ui.ActionBar.i6 d;
    public ArrayList e;
    public final /* synthetic */ ThemeActivity f;

    public mc1(ThemeActivity themeActivity, Context context) {
        this.f = themeActivity;
        this.c = context;
        l();
    }

    @Override // org.telegram.ui.Components.ul0
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
        this.d = this.f.f == 1 ? org.telegram.ui.ActionBar.j6.J : org.telegram.ui.ActionBar.j6.A0();
        this.e = new ArrayList(this.d.b0);
        super.l();
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        View view = c1Var.a;
        int j3 = j(i10);
        if (j3 == 0) {
            ThemeActivity.InnerAccentView innerAccentView = (ThemeActivity.InnerAccentView) view;
            org.telegram.ui.ActionBar.i6 i6Var = this.d;
            org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) this.e.get(i10);
            innerAccentView.d = i6Var;
            innerAccentView.e = h6Var;
            innerAccentView.a(false);
            return;
        }
        if (j3 != 1) {
            return;
        }
        cc1 cc1Var = (cc1) view;
        org.telegram.ui.ActionBar.i6 i6Var2 = this.d;
        int i11 = cc1.c;
        cc1Var.getClass();
        if (i6Var2.W >= 8) {
            cc1Var.b = new int[]{i6Var2.l(6), i6Var2.l(4), i6Var2.l(7), i6Var2.l(2), i6Var2.l(0), i6Var2.l(5), i6Var2.l(3)};
        } else {
            cc1Var.b = new int[7];
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        Context context = this.c;
        return i10 != 0 ? new org.telegram.ui.Components.fl0(new cc1(context)) : new org.telegram.ui.Components.fl0(new ThemeActivity.InnerAccentView(context));
    }
}
