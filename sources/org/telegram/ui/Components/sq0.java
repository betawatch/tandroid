package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class sq0 extends ul0 {
    public final /* synthetic */ ys0 J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sq0(ys0 ys0Var, Context context, org.telegram.ui.ActionBar.e2 e2Var, int i7, long j3, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e2Var, i7, j3, e6Var);
        this.J = ys0Var;
    }

    @Override // org.telegram.ui.Components.ul0
    public final void b(boolean z10) {
        vq0 vq0Var = this.J.L0;
        vq0Var.setAlpha(1.0f - this.F);
        vq0Var.setPivotX(vq0Var.getWidth() / 2.0f);
        vq0Var.setScaleX(((1.0f - this.F) * 0.2f) + 0.8f);
        vq0Var.setPivotY(org.telegram.messenger.g0.L(48.0f));
        vq0Var.setScaleY(((1.0f - this.F) * 0.2f) + 0.8f);
    }

    @Override // org.telegram.ui.Components.ul0
    public final boolean f(ch.p0 p0Var) {
        gr0 gr0Var;
        ys0 ys0Var = this.J;
        org.telegram.ui.ActionBar.q0 q0Var = ys0Var.q0;
        if (q0Var == null) {
            return false;
        }
        ys0Var.Z0 = p0Var;
        String obj = q0Var.getSearchField().getText().toString();
        ys0Var.X0 = (obj.length() == 0 && ys0Var.Z0 == null) ? false : true;
        ys0Var.B1(false);
        int i7 = ys0Var.n0[0].F;
        if (i7 == 11) {
            ks0 ks0Var = ys0Var.V;
            if (ks0Var != null) {
                ks0Var.E(ys0Var.Z0, obj);
            }
            org.telegram.messenger.g0.v1(q0Var.getSearchField());
            return true;
        }
        if (i7 == 12 && (gr0Var = ys0Var.W) != null) {
            org.telegram.ui.bn bnVar = gr0Var.a;
            org.telegram.ui.ak akVar = bnVar.D1;
            if (akVar != null) {
                akVar.e(p0Var, true);
            }
            boolean z10 = (TextUtils.isEmpty(bnVar.I3) && bnVar.F3 == null) ? false : true;
            bnVar.H3 = z10;
            bnVar.r0 = z10;
            bnVar.Pc(false);
            bnVar.qd();
        }
        return true;
    }

    @Override // org.telegram.ui.Components.ul0
    public final void h(boolean z10) {
        super.h(z10);
        ys0 ys0Var = this.J;
        sq0 sq0Var = ys0Var.M0;
        g(ys0Var.Y0 && (ys0Var.getSelectedTab() == 11 || ys0Var.getSelectedTab() == 12) && sq0Var.a());
        org.telegram.ui.ActionBar.q0 q0Var = ys0Var.p0;
        if (q0Var != null) {
            int i7 = (a() && ys0Var.y1.getUserConfig().q()) ? R.drawable.navbar_search_tag : R.drawable.outline_header_search;
            fh0 fh0Var = q0Var.y;
            if (fh0Var != null && q0Var.E != i7) {
                if (z10) {
                    q0Var.E = i7;
                    org.telegram.messenger.g0.Q3(fh0Var, i7);
                } else {
                    q0Var.E = i7;
                    fh0Var.setImageResource(i7);
                }
            }
        }
        org.telegram.ui.ActionBar.q0 q0Var2 = ys0Var.q0;
        if (q0Var2 != null) {
            q0Var2.setSearchFieldHint(org.telegram.messenger.hd.M0((sq0Var != null && sq0Var.a() && ys0Var.getSelectedTab() == 11) ? 2131745868 : 2131745836, null));
        }
    }
}
