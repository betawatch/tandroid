package ai;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import bi.q1;
import fi.w3;
import li.r3;
import li.t3;
import org.telegram.messenger.oa;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.y4;
import org.telegram.ui.Components.lz;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.up0;
import org.telegram.ui.Components.w80;
import org.telegram.ui.Components.ze0;
import org.telegram.ui.cn;
import org.telegram.ui.cu;
import org.telegram.ui.dn0;
import org.telegram.ui.du;
import org.telegram.ui.ff0;
import org.telegram.ui.qr;
import org.telegram.ui.td;
import org.telegram.ui.zw;
import zh.z1;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class o0 extends v4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o0(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.c = obj;
        this.b = obj2;
    }

    @Override // v4.s0
    public void a(RecyclerView recyclerView, int i7) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        switch (this.a) {
            case 1:
                if (i7 == 0) {
                    ((t3) this.c).u3.V();
                    break;
                }
                break;
            case 6:
                du duVar = (du) this.c;
                cu[] cuVarArr = duVar.f;
                ((v4.s0) this.b).a(recyclerView, i7);
                if (i7 != 1) {
                    lVar = ((f2) duVar).actionBar;
                    int i10 = (int) (-lVar.getTranslationY());
                    int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                    if (i10 != 0 && i10 != currentActionBarHeight) {
                        if (i10 >= currentActionBarHeight / 2) {
                            int i11 = currentActionBarHeight - i10;
                            cuVarArr[0].d.w0(0, i11, null);
                            q1 q1Var = cuVarArr[0].e;
                            if (q1Var != null) {
                                q1Var.w0(0, i11, null);
                                break;
                            }
                        } else {
                            int i12 = -i10;
                            cuVarArr[0].d.w0(0, i12, null);
                            q1 q1Var2 = cuVarArr[0].e;
                            if (q1Var2 != null) {
                                q1Var2.w0(0, i12, null);
                                break;
                            }
                        }
                    }
                }
                break;
            case 8:
                dn0 dn0Var = (dn0) this.c;
                y4[] y4VarArr = dn0Var.n;
                ((v4.s0) this.b).a(recyclerView, i7);
                if (i7 != 1) {
                    lVar2 = ((f2) dn0Var).actionBar;
                    int i13 = (int) (-lVar2.getTranslationY());
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                    if (i13 != 0 && i13 != currentActionBarHeight2) {
                        if (i13 >= currentActionBarHeight2 / 2) {
                            ((pj0) y4VarArr[0].f).w0(0, currentActionBarHeight2 - i13, null);
                            break;
                        } else {
                            ((pj0) y4VarArr[0].f).w0(0, -i13, null);
                            break;
                        }
                    }
                }
                break;
            case 10:
                ((v4.s0) this.b).a(recyclerView, i7);
                ((w80) this.c).D.getClass();
                break;
        }
    }

    @Override // v4.s0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        View F;
        int i11;
        int i12;
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        switch (this.a) {
            case 0:
                w wVar = (w) this.b;
                float translationY = wVar.getTranslationY();
                float f10 = ((s0) this.c).d0;
                if (translationY != f10) {
                    wVar.setTranslationY(f10);
                    wVar.invalidate();
                    break;
                }
                break;
            case 1:
                t3 t3Var = (t3) this.c;
                ((r3) this.b).y(i10);
                t3Var.u3.G();
                li.g1 g1Var = t3Var.S3;
                if (g1Var != null && (F = t3Var.F(g1Var)) != null) {
                    if (F.getBottom() <= 0 || F.getTop() >= t3Var.getHeight()) {
                        t3Var.S3 = null;
                        g1Var.clearFocus();
                        org.telegram.messenger.g0.v1(t3Var);
                        break;
                    }
                }
                break;
            case 2:
                r41 r41Var = ((td) this.c).a;
                if (r41Var.canScrollVertically(1)) {
                    for (int i13 = 0; i13 < r41Var.getChildCount(); i13++) {
                        if (!(r41Var.getChildAt(i13) instanceof lz)) {
                        }
                    }
                    break;
                }
                ((bg.m0) this.b).run();
                break;
            case 3:
                cn cnVar = (cn) this.c;
                if (recyclerView.getScrollState() == 1) {
                    org.telegram.messenger.g0.v1(cnVar.l1);
                }
                int N0 = ((v4.b0) this.b).N0();
                if ((N0 == -1 ? 0 : N0) > 0 && N0 > cnVar.a4.h - 5) {
                    if (cnVar.f4 != 7) {
                        cnVar.getMediaDataController().O0();
                        break;
                    } else if (!cnVar.W6 && !cnVar.S6[0]) {
                        cnVar.W6 = true;
                        cnVar.x6.add(Integer.valueOf(cnVar.l6));
                        i11 = ((f2) cnVar).currentAccount;
                        oa a10 = oa.a(i11);
                        String str = cnVar.I3;
                        i12 = ((f2) cnVar).classGuid;
                        int i14 = cnVar.c4;
                        int i15 = cnVar.l6;
                        cnVar.l6 = i15 + 1;
                        a10.e(i12, i14, i15, str);
                        break;
                    }
                }
                break;
            case 4:
                zw zwVar = (zw) this.b;
                ze0 ze0Var = (ze0) this.c;
                r41 r41Var2 = ze0Var.c;
                if (!(TextUtils.isEmpty(ze0Var.x) ? ze0Var.e : ze0Var.n).isEmpty()) {
                    if (r41Var2.canScrollVertically(1)) {
                        for (int i16 = 0; i16 < r41Var2.getChildCount(); i16++) {
                            if (!(r41Var2.getChildAt(i16) instanceof lz)) {
                            }
                        }
                    }
                    ze0Var.a(false);
                }
                if (r41Var2.I1 && !ze0Var.Q && zwVar.getParentActivity() != null) {
                    org.telegram.messenger.g0.v1(zwVar.getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 5:
                if (((qr) this.c).W.I1) {
                    org.telegram.messenger.g0.v1((FrameLayout) this.b);
                    break;
                }
                break;
            case 6:
                ((v4.s0) this.b).b(recyclerView, i7, i10);
                du duVar = (du) this.c;
                cu cuVar = duVar.f[0];
                if (recyclerView == cuVar.d || recyclerView == cuVar.e) {
                    lVar = ((f2) duVar).actionBar;
                    float translationY2 = lVar.getTranslationY();
                    float f11 = translationY2 - i10;
                    if (f11 < (-org.telegram.ui.ActionBar.l.getCurrentActionBarHeight())) {
                        f11 = -org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                    } else if (f11 > 0.0f) {
                        f11 = 0.0f;
                    }
                    if (f11 != translationY2) {
                        du.o0(duVar, f11);
                        break;
                    }
                }
                break;
            case 7:
                ff0 ff0Var = (ff0) this.c;
                if (ff0Var.b0 && !ff0Var.W) {
                    if (ff0Var.X - ((jg.b0) this.b).N0() < 10) {
                        ff0Var.j0(true);
                        break;
                    }
                }
                break;
            case 8:
                ((v4.s0) this.b).b(recyclerView, i7, i10);
                dn0 dn0Var = (dn0) this.c;
                if (recyclerView == ((pj0) dn0Var.n[0].f)) {
                    lVar2 = ((f2) dn0Var).actionBar;
                    float translationY3 = lVar2.getTranslationY();
                    float f12 = translationY3 - i10;
                    if (f12 < (-org.telegram.ui.ActionBar.l.getCurrentActionBarHeight())) {
                        f12 = -org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                    } else if (f12 > 0.0f) {
                        f12 = 0.0f;
                    }
                    if (f12 != translationY3) {
                        dn0.l0(dn0Var, f12);
                        break;
                    }
                }
                break;
            case 9:
                sh.o oVar = (sh.o) this.c;
                sh.n nVar = (sh.n) this.b;
                if (!nVar.h && !nVar.i) {
                    if ((oVar.c.f3.D.size() - 1) - oVar.c.e3.M0() < 5) {
                        nVar.a();
                        break;
                    }
                }
                break;
            case 10:
                ((v4.s0) this.b).b(recyclerView, i7, i10);
                ((w80) this.c).D.b(recyclerView, i7, i10);
                break;
            default:
                z1 z1Var = (z1) this.c;
                w3 w3Var = z1Var.f;
                if (z1Var.isAttachedToWindow()) {
                    if (w3Var.canScrollVertically(1)) {
                        for (int i17 = 0; i17 < w3Var.getChildCount(); i17++) {
                            if (!(w3Var.getChildAt(i17) instanceof lz)) {
                            }
                        }
                    }
                    z1Var.e.a();
                }
                ((up0) this.b).p();
                break;
        }
    }
}
