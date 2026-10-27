package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ThemeActivity;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class fb1 extends org.telegram.ui.Components.mm0 {
    public final Context c;
    public org.telegram.ui.ActionBar.x6 d;
    public ArrayList e;
    public final /* synthetic */ ThemeActivity f;

    public fb1(ThemeActivity themeActivity, Context context) {
        this.f = themeActivity;
        this.c = context;
        l();
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean D(s4.e1 e1Var) {
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
        this.d = this.f.f == 1 ? org.telegram.ui.ActionBar.y6.J : org.telegram.ui.ActionBar.y6.C0();
        this.e = new ArrayList(this.d.b0);
        super.l();
    }

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        View view = e1Var.a;
        int j10 = j(i10);
        if (j10 == 0) {
            ThemeActivity.InnerAccentView innerAccentView = (ThemeActivity.InnerAccentView) view;
            org.telegram.ui.ActionBar.x6 x6Var = this.d;
            org.telegram.ui.ActionBar.w6 w6Var = (org.telegram.ui.ActionBar.w6) this.e.get(i10);
            innerAccentView.d = x6Var;
            innerAccentView.e = w6Var;
            innerAccentView.a(false);
            return;
        }
        if (j10 != 1) {
            return;
        }
        va1 va1Var = (va1) view;
        org.telegram.ui.ActionBar.x6 x6Var2 = this.d;
        int i11 = va1.c;
        va1Var.getClass();
        if (x6Var2.W >= 8) {
            va1Var.b = new int[]{x6Var2.l(6), x6Var2.l(4), x6Var2.l(7), x6Var2.l(2), x6Var2.l(0), x6Var2.l(5), x6Var2.l(3)};
        } else {
            va1Var.b = new int[7];
        }
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        Context context = this.c;
        return i10 != 0 ? new org.telegram.ui.Components.wl0(new va1(context)) : new org.telegram.ui.Components.wl0(new ThemeActivity.InnerAccentView(context));
    }
}
