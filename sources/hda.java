// default package

import android.content.Context;
import android.text.TextUtils;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class hda extends vs9 {
    public final /* synthetic */ nfa J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hda(nfa nfaVar, Context context, d dVar, int i, long j, wjb wjbVar) {
        super(context, dVar, i, j, wjbVar);
        this.J = nfaVar;
    }

    @Override // vs9
    public final void b(boolean z) {
        kda kdaVar = this.J.L0;
        kdaVar.setAlpha(1.0f - this.F);
        kdaVar.setPivotX(kdaVar.getWidth() / 2.0f);
        kdaVar.setScaleX(((1.0f - this.F) * 0.2f) + 0.8f);
        kdaVar.setPivotY(gl.L(48.0f));
        kdaVar.setScaleY(((1.0f - this.F) * 0.2f) + 0.8f);
    }

    @Override // vs9
    public final boolean f(h19 h19Var) {
        vda vdaVar;
        nfa nfaVar = this.J;
        r7 r7Var = nfaVar.q0;
        if (r7Var == null) {
            return false;
        }
        nfaVar.Z0 = h19Var;
        String obj = r7Var.getSearchField().getText().toString();
        nfaVar.X0 = (obj.length() == 0 && nfaVar.Z0 == null) ? false : true;
        nfaVar.z1(false);
        int i = nfaVar.n0[0].F;
        if (i == 11) {
            zea zeaVar = nfaVar.V;
            if (zeaVar != null) {
                zeaVar.E(nfaVar.Z0, obj);
            }
            gl.t1(r7Var.getSearchField());
            return true;
        }
        if (i == 12 && (vdaVar = nfaVar.W) != null) {
            tu1 tu1Var = vdaVar.a;
            lr1 lr1Var = tu1Var.D1;
            if (lr1Var != null) {
                lr1Var.e(h19Var, true);
            }
            boolean z = (TextUtils.isEmpty(tu1Var.I3) && tu1Var.F3 == null) ? false : true;
            tu1Var.H3 = z;
            tu1Var.r0 = z;
            tu1Var.Dc(false);
            tu1Var.ed();
        }
        return true;
    }

    @Override // vs9
    public final void h(boolean z) {
        super.h(z);
        nfa nfaVar = this.J;
        hda hdaVar = nfaVar.M0;
        g(nfaVar.Y0 && (nfaVar.getSelectedTab() == 11 || nfaVar.getSelectedTab() == 12) && hdaVar.a());
        r7 r7Var = nfaVar.p0;
        if (r7Var != null) {
            int i = (a() && nfaVar.y1.getUserConfig().p()) ? R.drawable.navbar_search_tag : R.drawable.outline_header_search;
            ry8 ry8Var = r7Var.y;
            if (ry8Var != null && r7Var.E != i) {
                if (z) {
                    r7Var.E = i;
                    gl.L3(ry8Var, i);
                } else {
                    r7Var.E = i;
                    ry8Var.setImageResource(i);
                }
            }
        }
        r7 r7Var2 = nfaVar.q0;
        if (r7Var2 != null) {
            r7Var2.setSearchFieldHint(k96.M0((hdaVar != null && hdaVar.a() && nfaVar.getSelectedTab() == 11) ? 2131745676 : 2131745644, null));
        }
    }
}
