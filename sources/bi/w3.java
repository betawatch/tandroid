package bi;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.na;
import org.telegram.ui.Components.cf0;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.wp0;
import org.telegram.ui.Components.y80;
import org.telegram.ui.an;
import org.telegram.ui.bn0;
import org.telegram.ui.bu;
import org.telegram.ui.cu;
import org.telegram.ui.pr;
import org.telegram.ui.rd;
import org.telegram.ui.yw;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class w3 extends v4.t0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w3(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.c = obj;
        this.b = obj2;
    }

    @Override // v4.t0
    public void a(RecyclerView recyclerView, int i7) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.a) {
            case 2:
                if (i7 == 0) {
                    ((oi.q3) this.c).v3.V();
                    break;
                }
                break;
            case 7:
                cu cuVar = (cu) this.c;
                bu[] buVarArr = cuVar.f;
                ((v4.t0) this.b).a(recyclerView, i7);
                if (i7 != 1) {
                    kVar = ((org.telegram.ui.ActionBar.e2) cuVar).actionBar;
                    int i10 = (int) (-kVar.getTranslationY());
                    int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i10 != 0 && i10 != currentActionBarHeight) {
                        if (i10 >= currentActionBarHeight / 2) {
                            int i11 = currentActionBarHeight - i10;
                            buVarArr[0].d.w0(0, i11, null);
                            di.c1 c1Var = buVarArr[0].e;
                            if (c1Var != null) {
                                c1Var.w0(0, i11, null);
                                break;
                            }
                        } else {
                            int i12 = -i10;
                            buVarArr[0].d.w0(0, i12, null);
                            di.c1 c1Var2 = buVarArr[0].e;
                            if (c1Var2 != null) {
                                c1Var2.w0(0, i12, null);
                                break;
                            }
                        }
                    }
                }
                break;
            case 9:
                bn0 bn0Var = (bn0) this.c;
                org.telegram.ui.ActionBar.v4[] v4VarArr = bn0Var.n;
                ((v4.t0) this.b).a(recyclerView, i7);
                if (i7 != 1) {
                    kVar2 = ((org.telegram.ui.ActionBar.e2) bn0Var).actionBar;
                    int i13 = (int) (-kVar2.getTranslationY());
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i13 != 0 && i13 != currentActionBarHeight2) {
                        if (i13 >= currentActionBarHeight2 / 2) {
                            ((uj0) v4VarArr[0].f).w0(0, currentActionBarHeight2 - i13, null);
                            break;
                        } else {
                            ((uj0) v4VarArr[0].f).w0(0, -i13, null);
                            break;
                        }
                    }
                }
                break;
            case 11:
                ((v4.t0) this.b).a(recyclerView, i7);
                ((y80) this.c).D.getClass();
                break;
        }
    }

    @Override // v4.t0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        View F;
        int i11;
        int i12;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.a) {
            case 0:
                c4 c4Var = (c4) this.c;
                v3 v3Var = c4Var.f;
                if (c4Var.isAttachedToWindow()) {
                    if (v3Var.canScrollVertically(1)) {
                        for (int i13 = 0; i13 < v3Var.getChildCount(); i13++) {
                            if (!(v3Var.getChildAt(i13) instanceof pz)) {
                            }
                        }
                    }
                    c4Var.e.a();
                }
                ((wp0) this.b).p();
                break;
            case 1:
                ci.r rVar = (ci.r) this.b;
                float translationY = rVar.getTranslationY();
                float f10 = ((ci.i0) this.c).e0;
                if (translationY != f10) {
                    rVar.setTranslationY(f10);
                    rVar.invalidate();
                    break;
                }
                break;
            case 2:
                oi.q3 q3Var = (oi.q3) this.c;
                ((oi.o3) this.b).O(i10);
                q3Var.v3.G();
                oi.e1 e1Var = q3Var.T3;
                if (e1Var != null && (F = q3Var.F(e1Var)) != null) {
                    if (F.getBottom() <= 0 || F.getTop() >= q3Var.getHeight()) {
                        q3Var.T3 = null;
                        e1Var.clearFocus();
                        org.telegram.messenger.g0.v1(q3Var);
                        break;
                    }
                }
                break;
            case 3:
                u41 u41Var = ((rd) this.c).a;
                if (u41Var.canScrollVertically(1)) {
                    for (int i14 = 0; i14 < u41Var.getChildCount(); i14++) {
                        if (!(u41Var.getChildAt(i14) instanceof pz)) {
                        }
                    }
                    break;
                }
                ((ai.v0) this.b).run();
                break;
            case 4:
                an anVar = (an) this.c;
                if (recyclerView.getScrollState() == 1) {
                    org.telegram.messenger.g0.v1(anVar.m1);
                }
                int N0 = ((v4.b0) this.b).N0();
                if ((N0 == -1 ? 0 : N0) > 0 && N0 > anVar.b4.h - 5) {
                    if (anVar.g4 != 7) {
                        anVar.getMediaDataController().O0();
                        break;
                    } else if (!anVar.X6 && !anVar.T6[0]) {
                        anVar.X6 = true;
                        anVar.y6.add(Integer.valueOf(anVar.m6));
                        i11 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
                        na a10 = na.a(i11);
                        String str = anVar.J3;
                        i12 = ((org.telegram.ui.ActionBar.e2) anVar).classGuid;
                        int i15 = anVar.d4;
                        int i16 = anVar.m6;
                        anVar.m6 = i16 + 1;
                        a10.e(i12, i15, i16, str);
                        break;
                    }
                }
                break;
            case 5:
                yw ywVar = (yw) this.b;
                cf0 cf0Var = (cf0) this.c;
                u41 u41Var2 = cf0Var.c;
                if (!(TextUtils.isEmpty(cf0Var.x) ? cf0Var.e : cf0Var.n).isEmpty()) {
                    if (u41Var2.canScrollVertically(1)) {
                        for (int i17 = 0; i17 < u41Var2.getChildCount(); i17++) {
                            if (!(u41Var2.getChildAt(i17) instanceof pz)) {
                            }
                        }
                    }
                    cf0Var.a(false);
                }
                if (u41Var2.J1 && !cf0Var.R && ywVar.getParentActivity() != null) {
                    org.telegram.messenger.g0.v1(ywVar.getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 6:
                if (((pr) this.c).X.J1) {
                    org.telegram.messenger.g0.v1((FrameLayout) this.b);
                    break;
                }
                break;
            case 7:
                ((v4.t0) this.b).b(recyclerView, i7, i10);
                cu cuVar = (cu) this.c;
                bu buVar = cuVar.f[0];
                if (recyclerView == buVar.d || recyclerView == buVar.e) {
                    kVar = ((org.telegram.ui.ActionBar.e2) cuVar).actionBar;
                    float translationY2 = kVar.getTranslationY();
                    float f11 = translationY2 - i10;
                    if (f11 < (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) {
                        f11 = -org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    } else if (f11 > 0.0f) {
                        f11 = 0.0f;
                    }
                    if (f11 != translationY2) {
                        cu.o0(cuVar, f11);
                        break;
                    }
                }
                break;
            case 8:
                org.telegram.ui.cf0 cf0Var2 = (org.telegram.ui.cf0) this.c;
                if (cf0Var2.c0 && !cf0Var2.X) {
                    if (cf0Var2.Y - ((jg.b0) this.b).N0() < 10) {
                        cf0Var2.j0(true);
                        break;
                    }
                }
                break;
            case 9:
                ((v4.t0) this.b).b(recyclerView, i7, i10);
                bn0 bn0Var = (bn0) this.c;
                if (recyclerView == ((uj0) bn0Var.n[0].f)) {
                    kVar2 = ((org.telegram.ui.ActionBar.e2) bn0Var).actionBar;
                    float translationY3 = kVar2.getTranslationY();
                    float f12 = translationY3 - i10;
                    if (f12 < (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) {
                        f12 = -org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    } else if (f12 > 0.0f) {
                        f12 = 0.0f;
                    }
                    if (f12 != translationY3) {
                        bn0.l0(bn0Var, f12);
                        break;
                    }
                }
                break;
            case 10:
                sh.n nVar = (sh.n) this.c;
                sh.m mVar = (sh.m) this.b;
                if (!mVar.h && !mVar.i) {
                    if ((nVar.c.g3.E.size() - 1) - nVar.c.f3.M0() < 5) {
                        mVar.a();
                        break;
                    }
                }
                break;
            default:
                ((v4.t0) this.b).b(recyclerView, i7, i10);
                ((y80) this.c).D.b(recyclerView, i7, i10);
                break;
        }
    }
}
