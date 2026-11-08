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
import org.telegram.ui.ActionBar.x4;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q41;
import org.telegram.ui.Components.up0;
import org.telegram.ui.Components.w80;
import org.telegram.ui.Components.ze0;
import org.telegram.ui.an;
import org.telegram.ui.an0;
import org.telegram.ui.au;
import org.telegram.ui.cf0;
import org.telegram.ui.nr;
import org.telegram.ui.td;
import org.telegram.ui.ww;
import org.telegram.ui.zt;
import zh.z1;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.a) {
            case 1:
                if (i7 == 0) {
                    ((t3) this.c).u3.V();
                    break;
                }
                break;
            case 6:
                au auVar = (au) this.c;
                zt[] ztVarArr = auVar.f;
                ((v4.s0) this.b).a(recyclerView, i7);
                if (i7 != 1) {
                    kVar = ((f2) auVar).actionBar;
                    int i10 = (int) (-kVar.getTranslationY());
                    int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i10 != 0 && i10 != currentActionBarHeight) {
                        if (i10 >= currentActionBarHeight / 2) {
                            int i11 = currentActionBarHeight - i10;
                            ztVarArr[0].d.w0(0, i11, null);
                            q1 q1Var = ztVarArr[0].e;
                            if (q1Var != null) {
                                q1Var.w0(0, i11, null);
                                break;
                            }
                        } else {
                            int i12 = -i10;
                            ztVarArr[0].d.w0(0, i12, null);
                            q1 q1Var2 = ztVarArr[0].e;
                            if (q1Var2 != null) {
                                q1Var2.w0(0, i12, null);
                                break;
                            }
                        }
                    }
                }
                break;
            case 8:
                an0 an0Var = (an0) this.c;
                x4[] x4VarArr = an0Var.n;
                ((v4.s0) this.b).a(recyclerView, i7);
                if (i7 != 1) {
                    kVar2 = ((f2) an0Var).actionBar;
                    int i13 = (int) (-kVar2.getTranslationY());
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i13 != 0 && i13 != currentActionBarHeight2) {
                        if (i13 >= currentActionBarHeight2 / 2) {
                            ((pj0) x4VarArr[0].f).w0(0, currentActionBarHeight2 - i13, null);
                            break;
                        } else {
                            ((pj0) x4VarArr[0].f).w0(0, -i13, null);
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
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
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
                q41 q41Var = ((td) this.c).a;
                if (q41Var.canScrollVertically(1)) {
                    for (int i13 = 0; i13 < q41Var.getChildCount(); i13++) {
                        if (!(q41Var.getChildAt(i13) instanceof mz)) {
                        }
                    }
                    break;
                }
                ((bg.m0) this.b).run();
                break;
            case 3:
                an anVar = (an) this.c;
                if (recyclerView.getScrollState() == 1) {
                    org.telegram.messenger.g0.v1(anVar.l1);
                }
                int N0 = ((v4.b0) this.b).N0();
                if ((N0 == -1 ? 0 : N0) > 0 && N0 > anVar.a4.h - 5) {
                    if (anVar.f4 != 7) {
                        anVar.getMediaDataController().O0();
                        break;
                    } else if (!anVar.W6 && !anVar.S6[0]) {
                        anVar.W6 = true;
                        anVar.x6.add(Integer.valueOf(anVar.l6));
                        i11 = ((f2) anVar).currentAccount;
                        oa a10 = oa.a(i11);
                        String str = anVar.I3;
                        i12 = ((f2) anVar).classGuid;
                        int i14 = anVar.c4;
                        int i15 = anVar.l6;
                        anVar.l6 = i15 + 1;
                        a10.e(i12, i14, i15, str);
                        break;
                    }
                }
                break;
            case 4:
                ww wwVar = (ww) this.b;
                ze0 ze0Var = (ze0) this.c;
                q41 q41Var2 = ze0Var.c;
                if (!(TextUtils.isEmpty(ze0Var.x) ? ze0Var.e : ze0Var.n).isEmpty()) {
                    if (q41Var2.canScrollVertically(1)) {
                        for (int i16 = 0; i16 < q41Var2.getChildCount(); i16++) {
                            if (!(q41Var2.getChildAt(i16) instanceof mz)) {
                            }
                        }
                    }
                    ze0Var.a(false);
                }
                if (q41Var2.I1 && !ze0Var.Q && wwVar.getParentActivity() != null) {
                    org.telegram.messenger.g0.v1(wwVar.getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 5:
                if (((nr) this.c).W.I1) {
                    org.telegram.messenger.g0.v1((FrameLayout) this.b);
                    break;
                }
                break;
            case 6:
                ((v4.s0) this.b).b(recyclerView, i7, i10);
                au auVar = (au) this.c;
                zt ztVar = auVar.f[0];
                if (recyclerView == ztVar.d || recyclerView == ztVar.e) {
                    kVar = ((f2) auVar).actionBar;
                    float translationY2 = kVar.getTranslationY();
                    float f11 = translationY2 - i10;
                    if (f11 < (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) {
                        f11 = -org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    } else if (f11 > 0.0f) {
                        f11 = 0.0f;
                    }
                    if (f11 != translationY2) {
                        au.o0(auVar, f11);
                        break;
                    }
                }
                break;
            case 7:
                cf0 cf0Var = (cf0) this.c;
                if (cf0Var.b0 && !cf0Var.W) {
                    if (cf0Var.X - ((jg.b0) this.b).N0() < 10) {
                        cf0Var.j0(true);
                        break;
                    }
                }
                break;
            case 8:
                ((v4.s0) this.b).b(recyclerView, i7, i10);
                an0 an0Var = (an0) this.c;
                if (recyclerView == ((pj0) an0Var.n[0].f)) {
                    kVar2 = ((f2) an0Var).actionBar;
                    float translationY3 = kVar2.getTranslationY();
                    float f12 = translationY3 - i10;
                    if (f12 < (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) {
                        f12 = -org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    } else if (f12 > 0.0f) {
                        f12 = 0.0f;
                    }
                    if (f12 != translationY3) {
                        an0.l0(an0Var, f12);
                        break;
                    }
                }
                break;
            case 9:
                sh.n nVar = (sh.n) this.c;
                sh.m mVar = (sh.m) this.b;
                if (!mVar.h && !mVar.i) {
                    if ((nVar.c.f3.D.size() - 1) - nVar.c.e3.M0() < 5) {
                        mVar.a();
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
                            if (!(w3Var.getChildAt(i17) instanceof mz)) {
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
