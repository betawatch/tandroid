// default package

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class hfa extends xu9 {
    public final /* synthetic */ nha J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hfa(nha nhaVar, Context context, d dVar, int i, long j, ylb ylbVar) {
        super(context, dVar, i, j, ylbVar);
        this.J = nhaVar;
    }

    @Override // xu9
    public final void b(boolean z) {
        kfa kfaVar = this.J.L0;
        kfaVar.setAlpha(1.0f - this.F);
        kfaVar.setPivotX(kfaVar.getWidth() / 2.0f);
        kfaVar.setScaleX(((1.0f - this.F) * 0.2f) + 0.8f);
        kfaVar.setPivotY(gm.L(48.0f));
        kfaVar.setScaleY(((1.0f - this.F) * 0.2f) + 0.8f);
    }

    @Override // xu9
    public final boolean f(k39 k39Var) {
        vfa vfaVar;
        nha nhaVar = this.J;
        r7 r7Var = nhaVar.q0;
        if (r7Var == null) {
            return false;
        }
        nhaVar.Z0 = k39Var;
        String obj = r7Var.getSearchField().getText().toString();
        nhaVar.X0 = (obj.length() == 0 && nhaVar.Z0 == null) ? false : true;
        nhaVar.z1(false);
        int i = nhaVar.n0[0].F;
        if (i == 11) {
            zga zgaVar = nhaVar.V;
            if (zgaVar != null) {
                zgaVar.E(nhaVar.Z0, obj);
            }
            gm.t1(r7Var.getSearchField());
            return true;
        }
        if (i == 12 && (vfaVar = nhaVar.W) != null) {
            fw1 fw1Var = vfaVar.a;
            ys1 ys1Var = fw1Var.D1;
            if (ys1Var != null) {
                ys1Var.e(k39Var, true);
            }
            boolean z = (TextUtils.isEmpty(fw1Var.I3) && fw1Var.F3 == null) ? false : true;
            fw1Var.H3 = z;
            fw1Var.r0 = z;
            fw1Var.Pc(false);
            fw1Var.qd();
        }
        return true;
    }

    @Override // xu9
    public final void h(boolean z) {
        super.h(z);
        nha nhaVar = this.J;
        hfa hfaVar = nhaVar.M0;
        g(nhaVar.Y0 && (nhaVar.getSelectedTab() == 11 || nhaVar.getSelectedTab() == 12) && hfaVar.a());
        r7 r7Var = nhaVar.p0;
        if (r7Var != null) {
            int i = (a() && nhaVar.y1.getUserConfig().p()) ? R.drawable.navbar_search_tag : R.drawable.outline_header_search;
            s09 s09Var = r7Var.y;
            if (s09Var != null && r7Var.E != i) {
                if (z) {
                    r7Var.E = i;
                    gm.L3(s09Var, i);
                } else {
                    r7Var.E = i;
                    s09Var.setImageResource(i);
                }
            }
        }
        r7 r7Var2 = nhaVar.q0;
        if (r7Var2 != null) {
            r7Var2.setSearchFieldHint(jb6.M0((hfaVar != null && hfaVar.a() && nhaVar.getSelectedTab() == 11) ? 2131745602 : 2131745570, null));
        }
    }
}
