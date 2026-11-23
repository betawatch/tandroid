package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class cr0 extends em0 {
    public final /* synthetic */ jt0 J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cr0(jt0 jt0Var, Context context, org.telegram.ui.ActionBar.g2 g2Var, int i7, long j3, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, g2Var, i7, j3, h6Var);
        this.J = jt0Var;
    }

    @Override // org.telegram.ui.Components.em0
    public final void b(boolean z10) {
        fr0 fr0Var = this.J.L0;
        fr0Var.setAlpha(1.0f - this.F);
        fr0Var.setPivotX(fr0Var.getWidth() / 2.0f);
        fr0Var.setScaleX(((1.0f - this.F) * 0.2f) + 0.8f);
        fr0Var.setPivotY(org.telegram.messenger.g0.L(48.0f));
        fr0Var.setScaleY(((1.0f - this.F) * 0.2f) + 0.8f);
    }

    @Override // org.telegram.ui.Components.em0
    public final boolean f(ch.p0 p0Var) {
        qr0 qr0Var;
        jt0 jt0Var = this.J;
        org.telegram.ui.ActionBar.q0 q0Var = jt0Var.q0;
        if (q0Var == null) {
            return false;
        }
        jt0Var.Z0 = p0Var;
        String obj = q0Var.getSearchField().getText().toString();
        jt0Var.X0 = (obj.length() == 0 && jt0Var.Z0 == null) ? false : true;
        jt0Var.B1(false);
        int i7 = jt0Var.n0[0].F;
        if (i7 == 11) {
            vs0 vs0Var = jt0Var.V;
            if (vs0Var != null) {
                vs0Var.E(jt0Var.Z0, obj);
            }
            org.telegram.messenger.g0.v1(q0Var.getSearchField());
            return true;
        }
        if (i7 == 12 && (qr0Var = jt0Var.W) != null) {
            org.telegram.ui.cn cnVar = qr0Var.a;
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

    @Override // org.telegram.ui.Components.em0
    public final void h(boolean z10) {
        super.h(z10);
        jt0 jt0Var = this.J;
        cr0 cr0Var = jt0Var.M0;
        g(jt0Var.Y0 && (jt0Var.getSelectedTab() == 11 || jt0Var.getSelectedTab() == 12) && cr0Var.a());
        org.telegram.ui.ActionBar.q0 q0Var = jt0Var.p0;
        if (q0Var != null) {
            int i7 = (a() && jt0Var.y1.getUserConfig().q()) ? R.drawable.navbar_search_tag : R.drawable.outline_header_search;
            rh0 rh0Var = q0Var.y;
            if (rh0Var != null && q0Var.E != i7) {
                if (z10) {
                    q0Var.E = i7;
                    org.telegram.messenger.g0.P3(rh0Var, i7);
                } else {
                    q0Var.E = i7;
                    rh0Var.setImageResource(i7);
                }
            }
        }
        org.telegram.ui.ActionBar.q0 q0Var2 = jt0Var.q0;
        if (q0Var2 != null) {
            q0Var2.setSearchFieldHint(org.telegram.messenger.hd.N0((cr0Var != null && cr0Var.a() && jt0Var.getSelectedTab() == 11) ? 2131745672 : 2131745640, null));
        }
    }
}
