package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class qq0 extends tl0 {
    public final /* synthetic */ ws0 J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qq0(ws0 ws0Var, Context context, org.telegram.ui.ActionBar.d2 d2Var, int i3, long j10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, d2Var, i3, j10, e6Var);
        this.J = ws0Var;
    }

    @Override // org.telegram.ui.Components.tl0
    public final void b(boolean z10) {
        tq0 tq0Var = this.J.L0;
        tq0Var.setAlpha(1.0f - this.F);
        tq0Var.setPivotX(tq0Var.getWidth() / 2.0f);
        tq0Var.setScaleX(((1.0f - this.F) * 0.2f) + 0.8f);
        tq0Var.setPivotY(org.telegram.messenger.g0.L(48.0f));
        tq0Var.setScaleY(((1.0f - this.F) * 0.2f) + 0.8f);
    }

    @Override // org.telegram.ui.Components.tl0
    public final boolean f(dh.n0 n0Var) {
        er0 er0Var;
        ws0 ws0Var = this.J;
        org.telegram.ui.ActionBar.q0 q0Var = ws0Var.q0;
        if (q0Var == null) {
            return false;
        }
        ws0Var.Z0 = n0Var;
        String obj = q0Var.getSearchField().getText().toString();
        ws0Var.X0 = (obj.length() == 0 && ws0Var.Z0 == null) ? false : true;
        ws0Var.z1(false);
        int i3 = ws0Var.n0[0].F;
        if (i3 == 11) {
            is0 is0Var = ws0Var.V;
            if (is0Var != null) {
                is0Var.E(ws0Var.Z0, obj);
            }
            org.telegram.messenger.g0.v1(q0Var.getSearchField());
            return true;
        }
        if (i3 == 12 && (er0Var = ws0Var.W) != null) {
            org.telegram.ui.xm xmVar = er0Var.a;
            org.telegram.ui.wj wjVar = xmVar.D1;
            if (wjVar != null) {
                wjVar.e(n0Var, true);
            }
            boolean z10 = (TextUtils.isEmpty(xmVar.I3) && xmVar.F3 == null) ? false : true;
            xmVar.H3 = z10;
            xmVar.r0 = z10;
            xmVar.Lc(false);
            xmVar.md();
        }
        return true;
    }

    @Override // org.telegram.ui.Components.tl0
    public final void h(boolean z10) {
        super.h(z10);
        ws0 ws0Var = this.J;
        qq0 qq0Var = ws0Var.M0;
        g(ws0Var.Y0 && (ws0Var.getSelectedTab() == 11 || ws0Var.getSelectedTab() == 12) && qq0Var.a());
        org.telegram.ui.ActionBar.q0 q0Var = ws0Var.p0;
        if (q0Var != null) {
            int i3 = (a() && ws0Var.y1.getUserConfig().q()) ? R.drawable.navbar_search_tag : R.drawable.outline_header_search;
            fh0 fh0Var = q0Var.y;
            if (fh0Var != null && q0Var.E != i3) {
                if (z10) {
                    q0Var.E = i3;
                    org.telegram.messenger.g0.R3(fh0Var, i3);
                } else {
                    q0Var.E = i3;
                    fh0Var.setImageResource(i3);
                }
            }
        }
        org.telegram.ui.ActionBar.q0 q0Var2 = ws0Var.q0;
        if (q0Var2 != null) {
            q0Var2.setSearchFieldHint(org.telegram.messenger.bd.M0((qq0Var != null && qq0Var.a() && ws0Var.getSelectedTab() == 11) ? 2131745878 : 2131745846, null));
        }
    }
}
