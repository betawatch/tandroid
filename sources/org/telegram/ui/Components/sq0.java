package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class sq0 extends rl0 {
    public final /* synthetic */ zs0 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sq0(zs0 zs0Var, Context context, org.telegram.ui.ActionBar.f2 f2Var, int i7, long j3, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, f2Var, i7, j3, g6Var);
        this.I = zs0Var;
    }

    @Override // org.telegram.ui.Components.rl0
    public final void b(boolean z9) {
        vq0 vq0Var = this.I.K0;
        vq0Var.setAlpha(1.0f - this.E);
        vq0Var.setPivotX(vq0Var.getWidth() / 2.0f);
        vq0Var.setScaleX(((1.0f - this.E) * 0.2f) + 0.8f);
        vq0Var.setPivotY(org.telegram.messenger.g0.L(48.0f));
        vq0Var.setScaleY(((1.0f - this.E) * 0.2f) + 0.8f);
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean f(ch.o0 o0Var) {
        gr0 gr0Var;
        zs0 zs0Var = this.I;
        org.telegram.ui.ActionBar.r0 r0Var = zs0Var.p0;
        if (r0Var == null) {
            return false;
        }
        zs0Var.Y0 = o0Var;
        String obj = r0Var.getSearchField().getText().toString();
        zs0Var.W0 = (obj.length() == 0 && zs0Var.Y0 == null) ? false : true;
        zs0Var.B1(false);
        int i7 = zs0Var.m0[0].E;
        if (i7 == 11) {
            ls0 ls0Var = zs0Var.U;
            if (ls0Var != null) {
                ls0Var.E(zs0Var.Y0, obj);
            }
            org.telegram.messenger.g0.v1(r0Var.getSearchField());
            return true;
        }
        if (i7 == 12 && (gr0Var = zs0Var.V) != null) {
            org.telegram.ui.dn dnVar = gr0Var.a;
            org.telegram.ui.ck ckVar = dnVar.C1;
            if (ckVar != null) {
                ckVar.e(o0Var, true);
            }
            boolean z9 = (TextUtils.isEmpty(dnVar.H3) && dnVar.E3 == null) ? false : true;
            dnVar.G3 = z9;
            dnVar.q0 = z9;
            dnVar.Oc(false);
            dnVar.pd();
        }
        return true;
    }

    @Override // org.telegram.ui.Components.rl0
    public final void h(boolean z9) {
        super.h(z9);
        zs0 zs0Var = this.I;
        sq0 sq0Var = zs0Var.L0;
        g(zs0Var.X0 && (zs0Var.getSelectedTab() == 11 || zs0Var.getSelectedTab() == 12) && sq0Var.a());
        org.telegram.ui.ActionBar.r0 r0Var = zs0Var.o0;
        if (r0Var != null) {
            int i7 = (a() && zs0Var.x1.getUserConfig().q()) ? R.drawable.navbar_search_tag : R.drawable.outline_header_search;
            dh0 dh0Var = r0Var.y;
            if (dh0Var != null && r0Var.D != i7) {
                if (z9) {
                    r0Var.D = i7;
                    org.telegram.messenger.g0.R3(dh0Var, i7);
                } else {
                    r0Var.D = i7;
                    dh0Var.setImageResource(i7);
                }
            }
        }
        org.telegram.ui.ActionBar.r0 r0Var2 = zs0Var.p0;
        if (r0Var2 != null) {
            r0Var2.setSearchFieldHint(org.telegram.messenger.id.M0((sq0Var != null && sq0Var.a() && zs0Var.getSelectedTab() == 11) ? 2131745868 : 2131745836, null));
        }
    }
}
