package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class ar0 extends cm0 {
    public final /* synthetic */ gt0 J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ar0(gt0 gt0Var, Context context, org.telegram.ui.ActionBar.h2 h2Var, int i7, long j3, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, h2Var, i7, j3, i6Var);
        this.J = gt0Var;
    }

    @Override // org.telegram.ui.Components.cm0
    public final void b(boolean z10) {
        dr0 dr0Var = this.J.L0;
        dr0Var.setAlpha(1.0f - this.F);
        dr0Var.setPivotX(dr0Var.getWidth() / 2.0f);
        dr0Var.setScaleX(((1.0f - this.F) * 0.2f) + 0.8f);
        dr0Var.setPivotY(org.telegram.messenger.g0.L(48.0f));
        dr0Var.setScaleY(((1.0f - this.F) * 0.2f) + 0.8f);
    }

    @Override // org.telegram.ui.Components.cm0
    public final boolean f(ch.p0 p0Var) {
        or0 or0Var;
        gt0 gt0Var = this.J;
        org.telegram.ui.ActionBar.r0 r0Var = gt0Var.q0;
        if (r0Var == null) {
            return false;
        }
        gt0Var.Z0 = p0Var;
        String obj = r0Var.getSearchField().getText().toString();
        gt0Var.X0 = (obj.length() == 0 && gt0Var.Z0 == null) ? false : true;
        gt0Var.B1(false);
        int i7 = gt0Var.n0[0].F;
        if (i7 == 11) {
            ss0 ss0Var = gt0Var.V;
            if (ss0Var != null) {
                ss0Var.E(gt0Var.Z0, obj);
            }
            org.telegram.messenger.g0.v1(r0Var.getSearchField());
            return true;
        }
        if (i7 == 12 && (or0Var = gt0Var.W) != null) {
            org.telegram.ui.cn cnVar = or0Var.a;
            org.telegram.ui.bk bkVar = cnVar.D1;
            if (bkVar != null) {
                bkVar.e(p0Var, true);
            }
            boolean z10 = (TextUtils.isEmpty(cnVar.I3) && cnVar.F3 == null) ? false : true;
            cnVar.H3 = z10;
            cnVar.r0 = z10;
            cnVar.Pc(false);
            cnVar.qd();
        }
        return true;
    }

    @Override // org.telegram.ui.Components.cm0
    public final void h(boolean z10) {
        super.h(z10);
        gt0 gt0Var = this.J;
        ar0 ar0Var = gt0Var.M0;
        g(gt0Var.Y0 && (gt0Var.getSelectedTab() == 11 || gt0Var.getSelectedTab() == 12) && ar0Var.a());
        org.telegram.ui.ActionBar.r0 r0Var = gt0Var.p0;
        if (r0Var != null) {
            int i7 = (a() && gt0Var.y1.getUserConfig().q()) ? R.drawable.navbar_search_tag : R.drawable.outline_header_search;
            ph0 ph0Var = r0Var.y;
            if (ph0Var != null && r0Var.E != i7) {
                if (z10) {
                    r0Var.E = i7;
                    org.telegram.messenger.g0.P3(ph0Var, i7);
                } else {
                    r0Var.E = i7;
                    ph0Var.setImageResource(i7);
                }
            }
        }
        org.telegram.ui.ActionBar.r0 r0Var2 = gt0Var.q0;
        if (r0Var2 != null) {
            r0Var2.setSearchFieldHint(org.telegram.messenger.gd.M0((ar0Var != null && ar0Var.a() && gt0Var.getSelectedTab() == 11) ? 2131745673 : 2131745641, null));
        }
    }
}
