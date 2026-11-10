package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class rq0 extends ql0 {
    public final /* synthetic */ ys0 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rq0(ys0 ys0Var, Context context, org.telegram.ui.ActionBar.f2 f2Var, int i7, long j3, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, f2Var, i7, j3, h6Var);
        this.I = ys0Var;
    }

    @Override // org.telegram.ui.Components.ql0
    public final void b(boolean z9) {
        uq0 uq0Var = this.I.K0;
        uq0Var.setAlpha(1.0f - this.E);
        uq0Var.setPivotX(uq0Var.getWidth() / 2.0f);
        uq0Var.setScaleX(((1.0f - this.E) * 0.2f) + 0.8f);
        uq0Var.setPivotY(org.telegram.messenger.g0.L(48.0f));
        uq0Var.setScaleY(((1.0f - this.E) * 0.2f) + 0.8f);
    }

    @Override // org.telegram.ui.Components.ql0
    public final boolean f(ch.o0 o0Var) {
        fr0 fr0Var;
        ys0 ys0Var = this.I;
        org.telegram.ui.ActionBar.r0 r0Var = ys0Var.p0;
        if (r0Var == null) {
            return false;
        }
        ys0Var.Y0 = o0Var;
        String obj = r0Var.getSearchField().getText().toString();
        ys0Var.W0 = (obj.length() == 0 && ys0Var.Y0 == null) ? false : true;
        ys0Var.B1(false);
        int i7 = ys0Var.m0[0].E;
        if (i7 == 11) {
            ks0 ks0Var = ys0Var.U;
            if (ks0Var != null) {
                ks0Var.E(ys0Var.Y0, obj);
            }
            org.telegram.messenger.g0.v1(r0Var.getSearchField());
            return true;
        }
        if (i7 == 12 && (fr0Var = ys0Var.V) != null) {
            org.telegram.ui.dn dnVar = fr0Var.a;
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

    @Override // org.telegram.ui.Components.ql0
    public final void h(boolean z9) {
        super.h(z9);
        ys0 ys0Var = this.I;
        rq0 rq0Var = ys0Var.L0;
        g(ys0Var.X0 && (ys0Var.getSelectedTab() == 11 || ys0Var.getSelectedTab() == 12) && rq0Var.a());
        org.telegram.ui.ActionBar.r0 r0Var = ys0Var.o0;
        if (r0Var != null) {
            int i7 = (a() && ys0Var.x1.getUserConfig().q()) ? R.drawable.navbar_search_tag : R.drawable.outline_header_search;
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
        org.telegram.ui.ActionBar.r0 r0Var2 = ys0Var.p0;
        if (r0Var2 != null) {
            r0Var2.setSearchFieldHint(org.telegram.messenger.id.M0((rq0Var != null && rq0Var.a() && ys0Var.getSelectedTab() == 11) ? 2131745868 : 2131745836, null));
        }
    }
}
