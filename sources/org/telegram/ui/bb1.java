package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ThemeActivity;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class bb1 extends org.telegram.ui.Components.lm0 {
    public final Context c;
    public org.telegram.ui.ActionBar.j6 d;
    public ArrayList e;
    public final /* synthetic */ ThemeActivity f;

    public bb1(ThemeActivity themeActivity, Context context) {
        this.f = themeActivity;
        this.c = context;
        l();
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        return false;
    }

    @Override // s4.g0
    public final int h() {
        if (this.e.isEmpty()) {
            return 0;
        }
        return this.e.size() + 1;
    }

    @Override // s4.g0
    public final int j(int i10) {
        return i10 == h() - 1 ? 1 : 0;
    }

    @Override // s4.g0
    public final void l() {
        this.d = this.f.f == 1 ? org.telegram.ui.ActionBar.k6.J : org.telegram.ui.ActionBar.k6.C0();
        this.e = new ArrayList(this.d.b0);
        super.l();
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        View view = b1Var.a;
        int j10 = j(i10);
        if (j10 == 0) {
            ThemeActivity.InnerAccentView innerAccentView = (ThemeActivity.InnerAccentView) view;
            org.telegram.ui.ActionBar.j6 j6Var = this.d;
            org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.e.get(i10);
            innerAccentView.d = j6Var;
            innerAccentView.e = i6Var;
            innerAccentView.a(false);
            return;
        }
        if (j10 != 1) {
            return;
        }
        ra1 ra1Var = (ra1) view;
        org.telegram.ui.ActionBar.j6 j6Var2 = this.d;
        int i11 = ra1.c;
        ra1Var.getClass();
        if (j6Var2.W >= 8) {
            ra1Var.b = new int[]{j6Var2.l(6), j6Var2.l(4), j6Var2.l(7), j6Var2.l(2), j6Var2.l(0), j6Var2.l(5), j6Var2.l(3)};
        } else {
            ra1Var.b = new int[7];
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        Context context = this.c;
        return i10 != 0 ? new org.telegram.ui.Components.wl0(new ra1(context)) : new org.telegram.ui.Components.wl0(new ThemeActivity.InnerAccentView(context));
    }
}
