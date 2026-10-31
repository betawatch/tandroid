package bi;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.oa;
import org.telegram.ui.Components.cg0;
import org.telegram.ui.Components.ii;
import org.telegram.ui.Components.o90;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.vq0;
import org.telegram.ui.Components.zz;
import org.telegram.ui.ay;
import org.telegram.ui.cv;
import org.telegram.ui.dv;
import org.telegram.ui.fe;
import org.telegram.ui.kg0;
import org.telegram.ui.ns;
import org.telegram.ui.oo0;
import org.telegram.ui.un;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class t3 extends s4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t3(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    @Override // s4.s0
    public void a(RecyclerView recyclerView, int i10) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        switch (this.a) {
            case 0:
                if (i10 == 0) {
                    ((d4) this.c).u3.V();
                    break;
                }
                break;
            case 2:
                ((s4.s0) this.b).a(recyclerView, i10);
                ((o90) this.c).D.getClass();
                break;
            case 7:
                dv dvVar = (dv) this.c;
                cv[] cvVarArr = dvVar.f;
                ((s4.s0) this.b).a(recyclerView, i10);
                if (i10 != 1) {
                    lVar = ((org.telegram.ui.ActionBar.k2) dvVar).actionBar;
                    int i11 = (int) (-lVar.getTranslationY());
                    int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                    if (i11 != 0 && i11 != currentActionBarHeight) {
                        if (i11 >= currentActionBarHeight / 2) {
                            int i12 = currentActionBarHeight - i11;
                            cvVarArr[0].d.w0(0, i12, null);
                            ag.b1 b1Var = cvVarArr[0].e;
                            if (b1Var != null) {
                                b1Var.w0(0, i12, null);
                                break;
                            }
                        } else {
                            int i13 = -i11;
                            cvVarArr[0].d.w0(0, i13, null);
                            ag.b1 b1Var2 = cvVarArr[0].e;
                            if (b1Var2 != null) {
                                b1Var2.w0(0, i13, null);
                                break;
                            }
                        }
                    }
                }
                break;
            case 9:
                oo0 oo0Var = (oo0) this.c;
                org.telegram.ui.ActionBar.h5[] h5VarArr = oo0Var.n;
                ((s4.s0) this.b).a(recyclerView, i10);
                if (i10 != 1) {
                    lVar2 = ((org.telegram.ui.ActionBar.k2) oo0Var).actionBar;
                    int i14 = (int) (-lVar2.getTranslationY());
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                    if (i14 != 0 && i14 != currentActionBarHeight2) {
                        if (i14 >= currentActionBarHeight2 / 2) {
                            ((tk0) h5VarArr[0].f).w0(0, currentActionBarHeight2 - i14, null);
                            break;
                        } else {
                            ((tk0) h5VarArr[0].f).w0(0, -i14, null);
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        View F;
        int i12;
        int i13;
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        switch (this.a) {
            case 0:
                d4 d4Var = (d4) this.c;
                ((b4) this.b).E(i11);
                d4Var.u3.G();
                n1 n1Var = d4Var.S3;
                if (n1Var != null && (F = d4Var.F(n1Var)) != null) {
                    if (F.getBottom() <= 0 || F.getTop() >= d4Var.getHeight()) {
                        d4Var.S3 = null;
                        n1Var.clearFocus();
                        org.telegram.messenger.i0.v1(d4Var);
                        break;
                    }
                }
                break;
            case 1:
                ih.r rVar = (ih.r) this.c;
                ih.q qVar = (ih.q) this.b;
                if (!qVar.h && !qVar.i) {
                    if ((rVar.c.f3.D.size() - 1) - rVar.c.e3.M0() < 5) {
                        qVar.a();
                        break;
                    }
                }
                break;
            case 2:
                ((s4.s0) this.b).b(recyclerView, i10, i11);
                ((o90) this.c).D.b(recyclerView, i10, i11);
                break;
            case 3:
                u51 u51Var = ((fe) this.c).a;
                if (u51Var.canScrollVertically(1)) {
                    for (int i14 = 0; i14 < u51Var.getChildCount(); i14++) {
                        if (!(u51Var.getChildAt(i14) instanceof zz)) {
                        }
                    }
                    break;
                }
                ((ag.d3) this.b).run();
                break;
            case 4:
                un unVar = (un) this.c;
                if (recyclerView.getScrollState() == 1) {
                    org.telegram.messenger.i0.v1(unVar.l1);
                }
                int N0 = ((s4.a0) this.b).N0();
                if ((N0 == -1 ? 0 : N0) > 0 && N0 > unVar.a4.h - 5) {
                    if (unVar.f4 != 7) {
                        unVar.getMediaDataController().O0();
                        break;
                    } else if (!unVar.W6 && !unVar.S6[0]) {
                        unVar.W6 = true;
                        unVar.x6.add(Integer.valueOf(unVar.l6));
                        i12 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
                        oa a2 = oa.a(i12);
                        String str = unVar.I3;
                        i13 = ((org.telegram.ui.ActionBar.k2) unVar).classGuid;
                        int i15 = unVar.c4;
                        int i16 = unVar.l6;
                        unVar.l6 = i16 + 1;
                        a2.e(i13, i15, str, i16);
                        break;
                    }
                }
                break;
            case 5:
                ay ayVar = (ay) this.b;
                cg0 cg0Var = (cg0) this.c;
                u51 u51Var2 = cg0Var.c;
                if (!(TextUtils.isEmpty(cg0Var.x) ? cg0Var.e : cg0Var.n).isEmpty()) {
                    if (u51Var2.canScrollVertically(1)) {
                        for (int i17 = 0; i17 < u51Var2.getChildCount(); i17++) {
                            if (!(u51Var2.getChildAt(i17) instanceof zz)) {
                            }
                        }
                    }
                    cg0Var.a(false);
                }
                if (u51Var2.I1 && !cg0Var.Q && ayVar.getParentActivity() != null) {
                    org.telegram.messenger.i0.v1(ayVar.getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 6:
                if (((ns) this.c).W.I1) {
                    org.telegram.messenger.i0.v1((FrameLayout) this.b);
                    break;
                }
                break;
            case 7:
                ((s4.s0) this.b).b(recyclerView, i10, i11);
                dv dvVar = (dv) this.c;
                cv cvVar = dvVar.f[0];
                if (recyclerView == cvVar.d || recyclerView == cvVar.e) {
                    lVar = ((org.telegram.ui.ActionBar.k2) dvVar).actionBar;
                    float translationY = lVar.getTranslationY();
                    float f7 = translationY - i11;
                    if (f7 < (-org.telegram.ui.ActionBar.l.getCurrentActionBarHeight())) {
                        f7 = -org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                    } else if (f7 > 0.0f) {
                        f7 = 0.0f;
                    }
                    if (f7 != translationY) {
                        dv.n0(dvVar, f7);
                        break;
                    }
                }
                break;
            case 8:
                kg0 kg0Var = (kg0) this.c;
                if (kg0Var.b0 && !kg0Var.W) {
                    if (kg0Var.X - ((dh.f) this.b).N0() < 10) {
                        kg0Var.i0(true);
                        break;
                    }
                }
                break;
            case 9:
                ((s4.s0) this.b).b(recyclerView, i10, i11);
                oo0 oo0Var = (oo0) this.c;
                if (recyclerView == ((tk0) oo0Var.n[0].f)) {
                    lVar2 = ((org.telegram.ui.ActionBar.k2) oo0Var).actionBar;
                    float translationY2 = lVar2.getTranslationY();
                    float f10 = translationY2 - i11;
                    if (f10 < (-org.telegram.ui.ActionBar.l.getCurrentActionBarHeight())) {
                        f10 = -org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                    } else if (f10 > 0.0f) {
                        f10 = 0.0f;
                    }
                    if (f10 != translationY2) {
                        oo0.k0(oo0Var, f10);
                        break;
                    }
                }
                break;
            case 10:
                ph.f2 f2Var = (ph.f2) this.c;
                ii iiVar = f2Var.f;
                if (f2Var.isAttachedToWindow()) {
                    if (iiVar.canScrollVertically(1)) {
                        for (int i18 = 0; i18 < iiVar.getChildCount(); i18++) {
                            if (!(iiVar.getChildAt(i18) instanceof zz)) {
                            }
                        }
                    }
                    f2Var.e.b();
                }
                ((vq0) this.b).p();
                break;
            default:
                qh.q qVar2 = (qh.q) this.b;
                float translationY3 = qVar2.getTranslationY();
                float f11 = ((qh.i0) this.c).d0;
                if (translationY3 != f11) {
                    qVar2.setTranslationY(f11);
                    qVar2.invalidate();
                    break;
                }
                break;
        }
    }
}
