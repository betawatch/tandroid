package ji;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.HashtagSearchController;
import org.telegram.ui.Components.db0;
import org.telegram.ui.Components.f10;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.ns0;
import org.telegram.ui.Components.zh0;
import org.telegram.ui.ei0;
import org.telegram.ui.fo;
import org.telegram.ui.ke;
import org.telegram.ui.kr0;
import org.telegram.ui.mr0;
import org.telegram.ui.rv;
import org.telegram.ui.sv;
import org.telegram.ui.ws;
import org.telegram.ui.yy;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class n3 extends s4.r0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n3(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    @Override // s4.r0
    public void a(RecyclerView recyclerView, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.a) {
            case 0:
                if (i10 == 0) {
                    ((x3) this.c).l3.V();
                    break;
                }
                break;
            case 5:
                sv svVar = (sv) this.c;
                rv[] rvVarArr = svVar.f;
                ((s4.r0) this.b).a(recyclerView, i10);
                if (i10 != 1) {
                    kVar = ((org.telegram.ui.ActionBar.m2) svVar).actionBar;
                    int i11 = (int) (-kVar.getTranslationY());
                    int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i11 != 0 && i11 != currentActionBarHeight) {
                        if (i11 >= currentActionBarHeight / 2) {
                            int i12 = currentActionBarHeight - i11;
                            rvVarArr[0].d.v0(0, i12, null);
                            bi.o0 o0Var = rvVarArr[0].e;
                            if (o0Var != null) {
                                o0Var.v0(0, i12, null);
                                break;
                            }
                        } else {
                            int i13 = -i11;
                            rvVarArr[0].d.v0(0, i13, null);
                            bi.o0 o0Var2 = rvVarArr[0].e;
                            if (o0Var2 != null) {
                                o0Var2.v0(0, i13, null);
                                break;
                            }
                        }
                    }
                }
                break;
            case 7:
                mr0 mr0Var = (mr0) this.c;
                kr0[] kr0VarArr = mr0Var.n;
                ((s4.r0) this.b).a(recyclerView, i10);
                if (i10 != 1) {
                    kVar2 = ((org.telegram.ui.ActionBar.m2) mr0Var).actionBar;
                    int i14 = (int) (-kVar2.getTranslationY());
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i14 != 0 && i14 != currentActionBarHeight2) {
                        if (i14 >= currentActionBarHeight2 / 2) {
                            kr0VarArr[0].d.v0(0, currentActionBarHeight2 - i14, null);
                            break;
                        } else {
                            kr0VarArr[0].d.v0(0, -i14, null);
                            break;
                        }
                    }
                }
                break;
            case 8:
                ((s4.r0) this.b).a(recyclerView, i10);
                ((db0) this.c).D.getClass();
                break;
        }
    }

    @Override // s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        View F;
        int i12;
        int i13;
        bh.f fVar;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.a) {
            case 0:
                x3 x3Var = (x3) this.c;
                ((v3) this.b).G(i11);
                x3Var.l3.G();
                h1 h1Var = x3Var.J3;
                if (h1Var != null && (F = x3Var.F(h1Var)) != null) {
                    if (F.getBottom() <= 0 || F.getTop() >= x3Var.getHeight()) {
                        x3Var.J3 = null;
                        h1Var.clearFocus();
                        AndroidUtilities.hideKeyboard(x3Var);
                        break;
                    }
                }
                break;
            case 1:
                h71 h71Var = ((ke) this.c).a;
                if (h71Var.canScrollVertically(1)) {
                    for (int i14 = 0; i14 < h71Var.getChildCount(); i14++) {
                        if (!(h71Var.getChildAt(i14) instanceof f10)) {
                        }
                    }
                    break;
                }
                ((ah.g) this.b).run();
                break;
            case 2:
                fo foVar = (fo) this.c;
                fo foVar2 = foVar.da;
                if (foVar2 == null) {
                    foVar2 = foVar;
                }
                if (i11 != 0) {
                    foVar.v9(1);
                }
                if (Build.VERSION.SDK_INT >= 31 && (fVar = foVar2.F) != null) {
                    fVar.f(i10, i11);
                }
                if (recyclerView.getScrollState() == 1) {
                    AndroidUtilities.hideKeyboard(foVar.X0);
                }
                int N0 = ((s4.b0) this.b).N0();
                if ((N0 == -1 ? 0 : N0) > 0 && N0 > foVar.M3.h - 5) {
                    if (foVar.R3 != 7) {
                        foVar.getMediaDataController().loadMoreSearchMessages(true);
                        break;
                    } else if (!foVar.G6 && !foVar.C6[0]) {
                        foVar.G6 = true;
                        foVar.h6.add(Integer.valueOf(foVar.V5));
                        i12 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
                        HashtagSearchController hashtagSearchController = HashtagSearchController.getInstance(i12);
                        String str = foVar.u3;
                        i13 = ((org.telegram.ui.ActionBar.m2) foVar).classGuid;
                        int i15 = foVar.O3;
                        int i16 = foVar.V5;
                        foVar.V5 = i16 + 1;
                        hashtagSearchController.searchHashtag(str, i13, i15, i16);
                        break;
                    }
                }
                break;
            case 3:
                yy yyVar = (yy) this.b;
                zh0 zh0Var = (zh0) this.c;
                h71 h71Var2 = zh0Var.c;
                if (!(TextUtils.isEmpty(zh0Var.w) ? zh0Var.e : zh0Var.n).isEmpty()) {
                    if (h71Var2.canScrollVertically(1)) {
                        for (int i17 = 0; i17 < h71Var2.getChildCount(); i17++) {
                            if (!(h71Var2.getChildAt(i17) instanceof f10)) {
                            }
                        }
                    }
                    zh0Var.a(false);
                }
                if (h71Var2.I1 && !zh0Var.Q && yyVar.getParentActivity() != null) {
                    AndroidUtilities.hideKeyboard(yyVar.getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 4:
                if (((ws) this.c).W.I1) {
                    AndroidUtilities.hideKeyboard((FrameLayout) this.b);
                    break;
                }
                break;
            case 5:
                ((s4.r0) this.b).b(recyclerView, i10, i11);
                sv svVar = (sv) this.c;
                rv rvVar = svVar.f[0];
                if (recyclerView == rvVar.d || recyclerView == rvVar.e) {
                    kVar = ((org.telegram.ui.ActionBar.m2) svVar).actionBar;
                    float translationY = kVar.getTranslationY();
                    float f7 = translationY - i11;
                    if (f7 < (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) {
                        f7 = -org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    } else if (f7 > 0.0f) {
                        f7 = 0.0f;
                    }
                    if (f7 != translationY) {
                        sv.j0(svVar, f7);
                        break;
                    }
                }
                break;
            case 6:
                ei0 ei0Var = (ei0) this.c;
                if (ei0Var.b0 && !ei0Var.W) {
                    if (ei0Var.X - ((hg.a0) this.b).N0() < 10) {
                        ei0Var.d0(true);
                        break;
                    }
                }
                break;
            case 7:
                ((s4.r0) this.b).b(recyclerView, i10, i11);
                mr0 mr0Var = (mr0) this.c;
                if (recyclerView == mr0Var.n[0].d) {
                    kVar2 = ((org.telegram.ui.ActionBar.m2) mr0Var).actionBar;
                    float translationY2 = kVar2.getTranslationY();
                    float f10 = translationY2 - i11;
                    if (f10 < (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) {
                        f10 = -org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    } else if (f10 > 0.0f) {
                        f10 = 0.0f;
                    }
                    if (f10 != translationY2) {
                        mr0.g0(mr0Var, f10);
                        break;
                    }
                }
                break;
            case 8:
                ((s4.r0) this.b).b(recyclerView, i10, i11);
                ((db0) this.c).D.b(recyclerView, i10, i11);
                break;
            default:
                yh.m2 m2Var = (yh.m2) this.c;
                yh.h2 h2Var = m2Var.f;
                if (m2Var.isAttachedToWindow()) {
                    if (h2Var.canScrollVertically(1)) {
                        for (int i18 = 0; i18 < h2Var.getChildCount(); i18++) {
                            if (!(h2Var.getChildAt(i18) instanceof f10)) {
                            }
                        }
                    }
                    m2Var.e.a();
                }
                ((ns0) this.b).o();
                break;
        }
    }
}
