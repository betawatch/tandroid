package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class sr0 extends sm0 {
    public final /* synthetic */ au0 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sr0(au0 au0Var, Context context, org.telegram.ui.ActionBar.k2 k2Var, int i10, long j10, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, k2Var, i10, j10, p6Var);
        this.I = au0Var;
    }

    @Override // org.telegram.ui.Components.sm0
    public final void b(boolean z10) {
        vr0 vr0Var = this.I.K0;
        vr0Var.setAlpha(1.0f - this.E);
        vr0Var.setPivotX(vr0Var.getWidth() / 2.0f);
        vr0Var.setScaleX(((1.0f - this.E) * 0.2f) + 0.8f);
        vr0Var.setPivotY(org.telegram.messenger.i0.L(48.0f));
        vr0Var.setScaleY(((1.0f - this.E) * 0.2f) + 0.8f);
    }

    @Override // org.telegram.ui.Components.sm0
    public final boolean f(sg.o0 o0Var) {
        gs0 gs0Var;
        au0 au0Var = this.I;
        org.telegram.ui.ActionBar.t0 t0Var = au0Var.p0;
        if (t0Var == null) {
            return false;
        }
        au0Var.Y0 = o0Var;
        String obj = t0Var.getSearchField().getText().toString();
        au0Var.W0 = (obj.length() == 0 && au0Var.Y0 == null) ? false : true;
        au0Var.x1(false);
        int i10 = au0Var.m0[0].E;
        if (i10 == 11) {
            mt0 mt0Var = au0Var.U;
            if (mt0Var != null) {
                mt0Var.E(obj, au0Var.Y0);
            }
            org.telegram.messenger.i0.v1(t0Var.getSearchField());
            return true;
        }
        if (i10 == 12 && (gs0Var = au0Var.V) != null) {
            org.telegram.ui.vn vnVar = gs0Var.a;
            org.telegram.ui.wk wkVar = vnVar.C1;
            if (wkVar != null) {
                wkVar.e(o0Var, true);
            }
            boolean z10 = (TextUtils.isEmpty(vnVar.H3) && vnVar.E3 == null) ? false : true;
            vnVar.G3 = z10;
            vnVar.q0 = z10;
            vnVar.Gc(false);
            vnVar.hd();
        }
        return true;
    }

    @Override // org.telegram.ui.Components.sm0
    public final void h(boolean z10) {
        super.h(z10);
        au0 au0Var = this.I;
        sr0 sr0Var = au0Var.L0;
        g(au0Var.X0 && (au0Var.getSelectedTab() == 11 || au0Var.getSelectedTab() == 12) && sr0Var.a());
        org.telegram.ui.ActionBar.t0 t0Var = au0Var.o0;
        if (t0Var != null) {
            int i10 = (a() && au0Var.x1.getUserConfig().q()) ? R.drawable.navbar_search_tag : R.drawable.outline_header_search;
            fi0 fi0Var = t0Var.y;
            if (fi0Var != null && t0Var.D != i10) {
                if (z10) {
                    t0Var.D = i10;
                    org.telegram.messenger.i0.Q3(fi0Var, i10);
                } else {
                    t0Var.D = i10;
                    fi0Var.setImageResource(i10);
                }
            }
        }
        org.telegram.ui.ActionBar.t0 t0Var2 = au0Var.p0;
        if (t0Var2 != null) {
            t0Var2.setSearchFieldHint(org.telegram.messenger.dd.L0((sr0Var != null && sr0Var.a() && au0Var.getSelectedTab() == 11) ? 2131745885 : 2131745853, null));
        }
    }
}
