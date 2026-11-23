package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class br0 extends em0 {
    public final /* synthetic */ it0 J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public br0(it0 it0Var, Context context, org.telegram.ui.ActionBar.g2 g2Var, int i7, long j3, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, g2Var, i7, j3, i6Var);
        this.J = it0Var;
    }

    @Override // org.telegram.ui.Components.em0
    public final void b(boolean z10) {
        er0 er0Var = this.J.L0;
        er0Var.setAlpha(1.0f - this.F);
        er0Var.setPivotX(er0Var.getWidth() / 2.0f);
        er0Var.setScaleX(((1.0f - this.F) * 0.2f) + 0.8f);
        er0Var.setPivotY(org.telegram.messenger.g0.L(48.0f));
        er0Var.setScaleY(((1.0f - this.F) * 0.2f) + 0.8f);
    }

    @Override // org.telegram.ui.Components.em0
    public final boolean f(ch.p0 p0Var) {
        pr0 pr0Var;
        it0 it0Var = this.J;
        org.telegram.ui.ActionBar.q0 q0Var = it0Var.q0;
        if (q0Var == null) {
            return false;
        }
        it0Var.Z0 = p0Var;
        String obj = q0Var.getSearchField().getText().toString();
        it0Var.X0 = (obj.length() == 0 && it0Var.Z0 == null) ? false : true;
        it0Var.B1(false);
        int i7 = it0Var.n0[0].F;
        if (i7 == 11) {
            us0 us0Var = it0Var.V;
            if (us0Var != null) {
                us0Var.E(it0Var.Z0, obj);
            }
            org.telegram.messenger.g0.v1(q0Var.getSearchField());
            return true;
        }
        if (i7 == 12 && (pr0Var = it0Var.W) != null) {
            org.telegram.ui.cn cnVar = pr0Var.a;
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
        it0 it0Var = this.J;
        br0 br0Var = it0Var.M0;
        g(it0Var.Y0 && (it0Var.getSelectedTab() == 11 || it0Var.getSelectedTab() == 12) && br0Var.a());
        org.telegram.ui.ActionBar.q0 q0Var = it0Var.p0;
        if (q0Var != null) {
            int i7 = (a() && it0Var.y1.getUserConfig().q()) ? R.drawable.navbar_search_tag : R.drawable.outline_header_search;
            qh0 qh0Var = q0Var.y;
            if (qh0Var != null && q0Var.E != i7) {
                if (z10) {
                    q0Var.E = i7;
                    org.telegram.messenger.g0.P3(qh0Var, i7);
                } else {
                    q0Var.E = i7;
                    qh0Var.setImageResource(i7);
                }
            }
        }
        org.telegram.ui.ActionBar.q0 q0Var2 = it0Var.q0;
        if (q0Var2 != null) {
            q0Var2.setSearchFieldHint(org.telegram.messenger.gd.N0((br0Var != null && br0Var.a() && it0Var.getSelectedTab() == 11) ? 2131745672 : 2131745640, null));
        }
    }
}
