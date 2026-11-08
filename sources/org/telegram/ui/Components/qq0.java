package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class qq0 extends ql0 {
    public final /* synthetic */ xs0 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qq0(xs0 xs0Var, Context context, org.telegram.ui.ActionBar.f2 f2Var, int i7, long j3, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f2Var, i7, j3, f6Var);
        this.I = xs0Var;
    }

    @Override // org.telegram.ui.Components.ql0
    public final void b(boolean z9) {
        tq0 tq0Var = this.I.K0;
        tq0Var.setAlpha(1.0f - this.E);
        tq0Var.setPivotX(tq0Var.getWidth() / 2.0f);
        tq0Var.setScaleX(((1.0f - this.E) * 0.2f) + 0.8f);
        tq0Var.setPivotY(org.telegram.messenger.g0.L(48.0f));
        tq0Var.setScaleY(((1.0f - this.E) * 0.2f) + 0.8f);
    }

    @Override // org.telegram.ui.Components.ql0
    public final boolean f(ch.o0 o0Var) {
        er0 er0Var;
        xs0 xs0Var = this.I;
        org.telegram.ui.ActionBar.r0 r0Var = xs0Var.p0;
        if (r0Var == null) {
            return false;
        }
        xs0Var.Y0 = o0Var;
        String obj = r0Var.getSearchField().getText().toString();
        xs0Var.W0 = (obj.length() == 0 && xs0Var.Y0 == null) ? false : true;
        xs0Var.z1(false);
        int i7 = xs0Var.m0[0].E;
        if (i7 == 11) {
            js0 js0Var = xs0Var.U;
            if (js0Var != null) {
                js0Var.E(xs0Var.Y0, obj);
            }
            org.telegram.messenger.g0.v1(r0Var.getSearchField());
            return true;
        }
        if (i7 == 12 && (er0Var = xs0Var.V) != null) {
            org.telegram.ui.bn bnVar = er0Var.a;
            org.telegram.ui.ak akVar = bnVar.C1;
            if (akVar != null) {
                akVar.e(o0Var, true);
            }
            boolean z9 = (TextUtils.isEmpty(bnVar.H3) && bnVar.E3 == null) ? false : true;
            bnVar.G3 = z9;
            bnVar.q0 = z9;
            bnVar.Lc(false);
            bnVar.md();
        }
        return true;
    }

    @Override // org.telegram.ui.Components.ql0
    public final void h(boolean z9) {
        super.h(z9);
        xs0 xs0Var = this.I;
        qq0 qq0Var = xs0Var.L0;
        g(xs0Var.X0 && (xs0Var.getSelectedTab() == 11 || xs0Var.getSelectedTab() == 12) && qq0Var.a());
        org.telegram.ui.ActionBar.r0 r0Var = xs0Var.o0;
        if (r0Var != null) {
            int i7 = (a() && xs0Var.x1.getUserConfig().q()) ? R.drawable.navbar_search_tag : R.drawable.outline_header_search;
            ch0 ch0Var = r0Var.y;
            if (ch0Var != null && r0Var.D != i7) {
                if (z9) {
                    r0Var.D = i7;
                    org.telegram.messenger.g0.R3(ch0Var, i7);
                } else {
                    r0Var.D = i7;
                    ch0Var.setImageResource(i7);
                }
            }
        }
        org.telegram.ui.ActionBar.r0 r0Var2 = xs0Var.p0;
        if (r0Var2 != null) {
            r0Var2.setSearchFieldHint(org.telegram.messenger.id.M0((qq0Var != null && qq0Var.a() && xs0Var.getSelectedTab() == 11) ? 2131745871 : 2131745839, null));
        }
    }
}
