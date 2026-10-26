package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ThemeActivity;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class db1 extends org.telegram.ui.Components.lm0 {
    public final Context c;
    public org.telegram.ui.ActionBar.x6 d;
    public ArrayList e;
    public final /* synthetic */ ThemeActivity f;

    public db1(ThemeActivity themeActivity, Context context) {
        this.f = themeActivity;
        this.c = context;
        l();
    }

    @Override // org.telegram.ui.Components.lm0
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
        ta1 ta1Var = (ta1) view;
        org.telegram.ui.ActionBar.x6 x6Var2 = this.d;
        int i11 = ta1.c;
        ta1Var.getClass();
        if (x6Var2.W >= 8) {
            ta1Var.b = new int[]{x6Var2.l(6), x6Var2.l(4), x6Var2.l(7), x6Var2.l(2), x6Var2.l(0), x6Var2.l(5), x6Var2.l(3)};
        } else {
            ta1Var.b = new int[7];
        }
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        Context context = this.c;
        return i10 != 0 ? new org.telegram.ui.Components.vl0(new ta1(context)) : new org.telegram.ui.Components.vl0(new ThemeActivity.InnerAccentView(context));
    }
}
