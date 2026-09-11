package ji;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.HashtagSearchController;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.nr0;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.yg0;
import org.telegram.ui.co;
import org.telegram.ui.ee;
import org.telegram.ui.er0;
import org.telegram.ui.gr0;
import org.telegram.ui.nv;
import org.telegram.ui.ov;
import org.telegram.ui.ss;
import org.telegram.ui.uy;
import org.telegram.ui.yh0;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final class l3 extends s4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l3(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    @Override // s4.s0
    public void a(RecyclerView recyclerView, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.a) {
            case 0:
                if (i10 == 0) {
                    ((v3) this.c).n3.W();
                    break;
                }
                break;
            case 5:
                ov ovVar = (ov) this.c;
                nv[] nvVarArr = ovVar.f;
                ((s4.s0) this.b).a(recyclerView, i10);
                if (i10 != 1) {
                    kVar = ((org.telegram.ui.ActionBar.n2) ovVar).actionBar;
                    int i11 = (int) (-kVar.getTranslationY());
                    int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i11 != 0 && i11 != currentActionBarHeight) {
                        if (i11 >= currentActionBarHeight / 2) {
                            int i12 = currentActionBarHeight - i11;
                            nvVarArr[0].d.v0(0, i12, null);
                            bi.o0 o0Var = nvVarArr[0].e;
                            if (o0Var != null) {
                                o0Var.v0(0, i12, null);
                                break;
                            }
                        } else {
                            int i13 = -i11;
                            nvVarArr[0].d.v0(0, i13, null);
                            bi.o0 o0Var2 = nvVarArr[0].e;
                            if (o0Var2 != null) {
                                o0Var2.v0(0, i13, null);
                                break;
                            }
                        }
                    }
                }
                break;
            case 7:
                gr0 gr0Var = (gr0) this.c;
                er0[] er0VarArr = gr0Var.n;
                ((s4.s0) this.b).a(recyclerView, i10);
                if (i10 != 1) {
                    kVar2 = ((org.telegram.ui.ActionBar.n2) gr0Var).actionBar;
                    int i14 = (int) (-kVar2.getTranslationY());
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i14 != 0 && i14 != currentActionBarHeight2) {
                        if (i14 >= currentActionBarHeight2 / 2) {
                            er0VarArr[0].d.v0(0, currentActionBarHeight2 - i14, null);
                            break;
                        } else {
                            er0VarArr[0].d.v0(0, -i14, null);
                            break;
                        }
                    }
                }
                break;
            case 8:
                ((s4.s0) this.b).a(recyclerView, i10);
                ((da0) this.c).D.getClass();
                break;
        }
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        View F;
        int i12;
        int i13;
        bh.f fVar;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.a) {
            case 0:
                v3 v3Var = (v3) this.c;
                ((t3) this.b).o(i11);
                v3Var.n3.H();
                h1 h1Var = v3Var.L3;
                if (h1Var != null && (F = v3Var.F(h1Var)) != null) {
                    if (F.getBottom() <= 0 || F.getTop() >= v3Var.getHeight()) {
                        v3Var.L3 = null;
                        h1Var.clearFocus();
                        AndroidUtilities.hideKeyboard(v3Var);
                        break;
                    }
                }
                break;
            case 1:
                d61 d61Var = ((ee) this.c).a;
                if (d61Var.canScrollVertically(1)) {
                    for (int i14 = 0; i14 < d61Var.getChildCount(); i14++) {
                        if (!(d61Var.getChildAt(i14) instanceof t00)) {
                        }
                    }
                    break;
                }
                ((ah.g) this.b).run();
                break;
            case 2:
                co coVar = (co) this.c;
                co coVar2 = coVar.da;
                if (coVar2 == null) {
                    coVar2 = coVar;
                }
                if (i11 != 0) {
                    coVar.q9(1);
                }
                if (Build.VERSION.SDK_INT >= 31 && (fVar = coVar2.F) != null) {
                    fVar.f(i10, i11);
                }
                if (recyclerView.getScrollState() == 1) {
                    AndroidUtilities.hideKeyboard(coVar.X0);
                }
                int N0 = ((s4.c0) this.b).N0();
                if ((N0 == -1 ? 0 : N0) > 0 && N0 > coVar.M3.h - 5) {
                    if (coVar.R3 != 7) {
                        coVar.getMediaDataController().loadMoreSearchMessages(true);
                        break;
                    } else if (!coVar.G6 && !coVar.C6[0]) {
                        coVar.G6 = true;
                        coVar.h6.add(Integer.valueOf(coVar.V5));
                        i12 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
                        HashtagSearchController hashtagSearchController = HashtagSearchController.getInstance(i12);
                        String str = coVar.u3;
                        i13 = ((org.telegram.ui.ActionBar.n2) coVar).classGuid;
                        int i15 = coVar.O3;
                        int i16 = coVar.V5;
                        coVar.V5 = i16 + 1;
                        hashtagSearchController.searchHashtag(str, i13, i15, i16);
                        break;
                    }
                }
                break;
            case 3:
                uy uyVar = (uy) this.b;
                yg0 yg0Var = (yg0) this.c;
                d61 d61Var2 = yg0Var.c;
                if (!(TextUtils.isEmpty(yg0Var.w) ? yg0Var.e : yg0Var.n).isEmpty()) {
                    if (d61Var2.canScrollVertically(1)) {
                        for (int i17 = 0; i17 < d61Var2.getChildCount(); i17++) {
                            if (!(d61Var2.getChildAt(i17) instanceof t00)) {
                            }
                        }
                    }
                    yg0Var.a(false);
                }
                if (d61Var2.K1 && !yg0Var.Q && uyVar.getParentActivity() != null) {
                    AndroidUtilities.hideKeyboard(uyVar.getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 4:
                if (((ss) this.c).W.K1) {
                    AndroidUtilities.hideKeyboard((FrameLayout) this.b);
                    break;
                }
                break;
            case 5:
                ((s4.s0) this.b).b(recyclerView, i10, i11);
                ov ovVar = (ov) this.c;
                nv nvVar = ovVar.f[0];
                if (recyclerView == nvVar.d || recyclerView == nvVar.e) {
                    kVar = ((org.telegram.ui.ActionBar.n2) ovVar).actionBar;
                    float translationY = kVar.getTranslationY();
                    float f7 = translationY - i11;
                    if (f7 < (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) {
                        f7 = -org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    } else if (f7 > 0.0f) {
                        f7 = 0.0f;
                    }
                    if (f7 != translationY) {
                        ov.j0(ovVar, f7);
                        break;
                    }
                }
                break;
            case 6:
                yh0 yh0Var = (yh0) this.c;
                if (yh0Var.b0 && !yh0Var.W) {
                    if (yh0Var.X - ((hg.b0) this.b).N0() < 10) {
                        yh0Var.d0(true);
                        break;
                    }
                }
                break;
            case 7:
                ((s4.s0) this.b).b(recyclerView, i10, i11);
                gr0 gr0Var = (gr0) this.c;
                if (recyclerView == gr0Var.n[0].d) {
                    kVar2 = ((org.telegram.ui.ActionBar.n2) gr0Var).actionBar;
                    float translationY2 = kVar2.getTranslationY();
                    float f10 = translationY2 - i11;
                    if (f10 < (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) {
                        f10 = -org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    } else if (f10 > 0.0f) {
                        f10 = 0.0f;
                    }
                    if (f10 != translationY2) {
                        gr0.g0(gr0Var, f10);
                        break;
                    }
                }
                break;
            case 8:
                ((s4.s0) this.b).b(recyclerView, i10, i11);
                ((da0) this.c).D.b(recyclerView, i10, i11);
                break;
            default:
                yh.m2 m2Var = (yh.m2) this.c;
                yh.h2 h2Var = m2Var.f;
                if (m2Var.isAttachedToWindow()) {
                    if (h2Var.canScrollVertically(1)) {
                        for (int i18 = 0; i18 < h2Var.getChildCount(); i18++) {
                            if (!(h2Var.getChildAt(i18) instanceof t00)) {
                            }
                        }
                    }
                    m2Var.e.a();
                }
                ((nr0) this.b).o();
                break;
        }
    }
}
