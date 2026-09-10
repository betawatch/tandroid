package hi;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.HashtagSearchController;
import org.telegram.ui.Components.a10;
import org.telegram.ui.Components.ih0;
import org.telegram.ui.Components.ma0;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.wr0;
import org.telegram.ui.eo;
import org.telegram.ui.er0;
import org.telegram.ui.fe;
import org.telegram.ui.gr0;
import org.telegram.ui.ov;
import org.telegram.ui.pv;
import org.telegram.ui.ts;
import org.telegram.ui.wy;
import org.telegram.ui.zh0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class p3 extends s4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p3(int i10, Object obj, Object obj2) {
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
                    ((z3) this.c).n3.W();
                    break;
                }
                break;
            case 5:
                pv pvVar = (pv) this.c;
                ov[] ovVarArr = pvVar.f;
                ((s4.s0) this.b).a(recyclerView, i10);
                if (i10 != 1) {
                    lVar = ((org.telegram.ui.ActionBar.p2) pvVar).actionBar;
                    int i11 = (int) (-lVar.getTranslationY());
                    int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                    if (i11 != 0 && i11 != currentActionBarHeight) {
                        if (i11 >= currentActionBarHeight / 2) {
                            int i12 = currentActionBarHeight - i11;
                            ovVarArr[0].d.v0(0, i12, null);
                            bi.y1 y1Var = ovVarArr[0].e;
                            if (y1Var != null) {
                                y1Var.v0(0, i12, null);
                                break;
                            }
                        } else {
                            int i13 = -i11;
                            ovVarArr[0].d.v0(0, i13, null);
                            bi.y1 y1Var2 = ovVarArr[0].e;
                            if (y1Var2 != null) {
                                y1Var2.v0(0, i13, null);
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
                    lVar2 = ((org.telegram.ui.ActionBar.p2) gr0Var).actionBar;
                    int i14 = (int) (-lVar2.getTranslationY());
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
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
                ((ma0) this.c).D.getClass();
                break;
        }
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        View F;
        int i12;
        int i13;
        zg.e eVar;
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        switch (this.a) {
            case 0:
                z3 z3Var = (z3) this.c;
                ((x3) this.b).K(i11);
                z3Var.n3.H();
                k1 k1Var = z3Var.L3;
                if (k1Var != null && (F = z3Var.F(k1Var)) != null) {
                    if (F.getBottom() <= 0 || F.getTop() >= z3Var.getHeight()) {
                        z3Var.L3 = null;
                        k1Var.clearFocus();
                        AndroidUtilities.hideKeyboard(z3Var);
                        break;
                    }
                }
                break;
            case 1:
                r61 r61Var = ((fe) this.c).a;
                if (r61Var.canScrollVertically(1)) {
                    for (int i14 = 0; i14 < r61Var.getChildCount(); i14++) {
                        if (!(r61Var.getChildAt(i14) instanceof a10)) {
                        }
                    }
                    break;
                }
                ((bi.s) this.b).run();
                break;
            case 2:
                eo eoVar = (eo) this.c;
                eo eoVar2 = eoVar.da;
                if (eoVar2 == null) {
                    eoVar2 = eoVar;
                }
                if (i11 != 0) {
                    eoVar.q9(1);
                }
                if (Build.VERSION.SDK_INT >= 31 && (eVar = eoVar2.F) != null) {
                    eVar.f(i10, i11);
                }
                if (recyclerView.getScrollState() == 1) {
                    AndroidUtilities.hideKeyboard(eoVar.X0);
                }
                int N0 = ((s4.c0) this.b).N0();
                if ((N0 == -1 ? 0 : N0) > 0 && N0 > eoVar.M3.h - 5) {
                    if (eoVar.R3 != 7) {
                        eoVar.getMediaDataController().loadMoreSearchMessages(true);
                        break;
                    } else if (!eoVar.G6 && !eoVar.C6[0]) {
                        eoVar.G6 = true;
                        eoVar.h6.add(Integer.valueOf(eoVar.V5));
                        i12 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
                        HashtagSearchController hashtagSearchController = HashtagSearchController.getInstance(i12);
                        String str = eoVar.u3;
                        i13 = ((org.telegram.ui.ActionBar.p2) eoVar).classGuid;
                        int i15 = eoVar.O3;
                        int i16 = eoVar.V5;
                        eoVar.V5 = i16 + 1;
                        hashtagSearchController.searchHashtag(str, i13, i15, i16);
                        break;
                    }
                }
                break;
            case 3:
                wy wyVar = (wy) this.b;
                ih0 ih0Var = (ih0) this.c;
                r61 r61Var2 = ih0Var.c;
                if (!(TextUtils.isEmpty(ih0Var.w) ? ih0Var.e : ih0Var.n).isEmpty()) {
                    if (r61Var2.canScrollVertically(1)) {
                        for (int i17 = 0; i17 < r61Var2.getChildCount(); i17++) {
                            if (!(r61Var2.getChildAt(i17) instanceof a10)) {
                            }
                        }
                    }
                    ih0Var.a(false);
                }
                if (r61Var2.K1 && !ih0Var.Q && wyVar.getParentActivity() != null) {
                    AndroidUtilities.hideKeyboard(wyVar.getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 4:
                if (((ts) this.c).W.K1) {
                    AndroidUtilities.hideKeyboard((FrameLayout) this.b);
                    break;
                }
                break;
            case 5:
                ((s4.s0) this.b).b(recyclerView, i10, i11);
                pv pvVar = (pv) this.c;
                ov ovVar = pvVar.f[0];
                if (recyclerView == ovVar.d || recyclerView == ovVar.e) {
                    lVar = ((org.telegram.ui.ActionBar.p2) pvVar).actionBar;
                    float translationY = lVar.getTranslationY();
                    float f7 = translationY - i11;
                    if (f7 < (-org.telegram.ui.ActionBar.l.getCurrentActionBarHeight())) {
                        f7 = -org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                    } else if (f7 > 0.0f) {
                        f7 = 0.0f;
                    }
                    if (f7 != translationY) {
                        pv.j0(pvVar, f7);
                        break;
                    }
                }
                break;
            case 6:
                zh0 zh0Var = (zh0) this.c;
                if (zh0Var.b0 && !zh0Var.W) {
                    if (zh0Var.X - ((fg.a0) this.b).N0() < 10) {
                        zh0Var.d0(true);
                        break;
                    }
                }
                break;
            case 7:
                ((s4.s0) this.b).b(recyclerView, i10, i11);
                gr0 gr0Var = (gr0) this.c;
                if (recyclerView == gr0Var.n[0].d) {
                    lVar2 = ((org.telegram.ui.ActionBar.p2) gr0Var).actionBar;
                    float translationY2 = lVar2.getTranslationY();
                    float f10 = translationY2 - i11;
                    if (f10 < (-org.telegram.ui.ActionBar.l.getCurrentActionBarHeight())) {
                        f10 = -org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
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
                ((ma0) this.c).D.b(recyclerView, i10, i11);
                break;
            default:
                wh.m2 m2Var = (wh.m2) this.c;
                wh.h2 h2Var = m2Var.f;
                if (m2Var.isAttachedToWindow()) {
                    if (h2Var.canScrollVertically(1)) {
                        for (int i18 = 0; i18 < h2Var.getChildCount(); i18++) {
                            if (!(h2Var.getChildAt(i18) instanceof a10)) {
                            }
                        }
                    }
                    m2Var.e.a();
                }
                ((wr0) this.b).o();
                break;
        }
    }
}
