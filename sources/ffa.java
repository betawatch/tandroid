// default package

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ffa implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ eja b;

    public /* synthetic */ ffa(eja ejaVar, byte b) {
        this.a = b;
        this.b = ejaVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        eja ejaVar = this.b;
        switch (b) {
            case 0:
                sla slaVar = ejaVar.J;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = slaVar.b;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.d();
                }
                if (ejaVar.K(ejaVar.getClosestTab(), new pq8(ejaVar, (byte) 14))) {
                    slaVar.U(null, null);
                    break;
                }
                break;
            case 1:
                ejaVar.E(true);
                break;
            case 2:
                fga fgaVar = ejaVar.c0;
                cga cgaVar = ejaVar.b0;
                if (ejaVar.t0.getAlpha() >= 0.1f) {
                    if (cgaVar != null && cgaVar.g()) {
                        cgaVar.i();
                    }
                    if (fgaVar != null && fgaVar.f) {
                        dja t1 = ejaVar.t1(ejaVar.s1(ejaVar.getClosestTab()));
                        zha P = ejaVar.P(t1.a);
                        if (P != null) {
                            fgaVar.setReorderingAlbums(false);
                            jga jgaVar = P.h;
                            for (int i = 0; i < jgaVar.getChildCount(); i++) {
                                View childAt = jgaVar.getChildAt(i);
                                if (childAt instanceof jja) {
                                    ((jja) childAt).l(false, true);
                                }
                            }
                            cja cjaVar = t1.c;
                            if (cjaVar != null && cjaVar.y) {
                                cjaVar.y = false;
                                break;
                            }
                        }
                    }
                }
                break;
            case 3:
                e eVar = ejaVar.y1;
                eVar.getMessagesController().Y3.edit().putBoolean("story_keep", true).apply();
                sbb.C(eVar.getParentActivity(), eVar.getCurrentAccount()).Q(null);
                break;
            default:
                int closestTab = ejaVar.getClosestTab();
                fu5 I = fu5.I(ejaVar.y1, view);
                I.J = false;
                if (ejaVar.K(closestTab, new ve9(I, (byte) 9))) {
                    if (closestTab == 13 || closestTab == 11) {
                        I.b0(0.0f, -hl.L(52.0f));
                    } else {
                        I.e0 = true;
                    }
                    I.s = (short) 0;
                    I.a0();
                    break;
                }
                break;
        }
    }
}
