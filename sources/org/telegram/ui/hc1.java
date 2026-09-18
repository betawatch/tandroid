package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ThemeActivity;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class hc1 extends org.telegram.ui.Components.vl0 {
    public final Context c;
    public org.telegram.ui.ActionBar.i6 d;
    public ArrayList e;
    public final /* synthetic */ ThemeActivity f;

    public hc1(ThemeActivity themeActivity, Context context) {
        this.f = themeActivity;
        this.c = context;
        l();
    }

    @Override // org.telegram.ui.Components.vl0
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
            org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.e.get(i10);
            innerAccentView.d = i6Var;
            innerAccentView.e = g6Var;
            innerAccentView.a(false);
            return;
        }
        if (j3 != 1) {
            return;
        }
        xb1 xb1Var = (xb1) view;
        org.telegram.ui.ActionBar.i6 i6Var2 = this.d;
        int i11 = xb1.c;
        xb1Var.getClass();
        if (i6Var2.W >= 8) {
            xb1Var.b = new int[]{i6Var2.l(6), i6Var2.l(4), i6Var2.l(7), i6Var2.l(2), i6Var2.l(0), i6Var2.l(5), i6Var2.l(3)};
        } else {
            xb1Var.b = new int[7];
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        Context context = this.c;
        return i10 != 0 ? new org.telegram.ui.Components.gl0(new xb1(context)) : new org.telegram.ui.Components.gl0(new ThemeActivity.InnerAccentView(context));
    }
}
