package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ThemeActivity;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class oc1 extends org.telegram.ui.Components.lm0 {
    public final Context c;
    public org.telegram.ui.ActionBar.f6 d;
    public ArrayList e;
    public final /* synthetic */ ThemeActivity f;

    public oc1(ThemeActivity themeActivity, Context context) {
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
        this.d = this.f.f == 1 ? org.telegram.ui.ActionBar.g6.J : org.telegram.ui.ActionBar.g6.B0();
        this.e = new ArrayList(this.d.b0);
        super.l();
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        View view = b1Var.a;
        int j10 = j(i10);
        if (j10 == 0) {
            ThemeActivity.InnerAccentView innerAccentView = (ThemeActivity.InnerAccentView) view;
            org.telegram.ui.ActionBar.f6 f6Var = this.d;
            org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.e.get(i10);
            innerAccentView.d = f6Var;
            innerAccentView.e = e6Var;
            innerAccentView.a(false);
            return;
        }
        if (j10 != 1) {
            return;
        }
        ec1 ec1Var = (ec1) view;
        org.telegram.ui.ActionBar.f6 f6Var2 = this.d;
        int i11 = ec1.c;
        ec1Var.getClass();
        if (f6Var2.W >= 8) {
            ec1Var.b = new int[]{f6Var2.l(6), f6Var2.l(4), f6Var2.l(7), f6Var2.l(2), f6Var2.l(0), f6Var2.l(5), f6Var2.l(3)};
        } else {
            ec1Var.b = new int[7];
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        Context context = this.c;
        return i10 != 0 ? new org.telegram.ui.Components.wl0(new ec1(context)) : new org.telegram.ui.Components.wl0(new ThemeActivity.InnerAccentView(context));
    }
}
