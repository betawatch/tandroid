package ii;

import ai.p8;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.HashtagSearchController;
import org.telegram.ui.Components.di0;
import org.telegram.ui.Components.eb0;
import org.telegram.ui.Components.j10;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.rs0;
import org.telegram.ui.ee;
import org.telegram.ui.er0;
import org.telegram.ui.gr0;
import org.telegram.ui.lv;
import org.telegram.ui.mv;
import org.telegram.ui.qs;
import org.telegram.ui.ty;
import org.telegram.ui.zh0;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class n3 extends s4.t0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n3(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    @Override // s4.t0
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
                mv mvVar = (mv) this.c;
                lv[] lvVarArr = mvVar.f;
                ((s4.t0) this.b).a(recyclerView, i10);
                if (i10 != 1) {
                    kVar = ((org.telegram.ui.ActionBar.n2) mvVar).actionBar;
                    int i11 = (int) (-kVar.getTranslationY());
                    int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i11 != 0 && i11 != currentActionBarHeight) {
                        if (i11 >= currentActionBarHeight / 2) {
                            int i12 = currentActionBarHeight - i11;
                            lvVarArr[0].d.v0(0, i12, null);
                            ai.w0 w0Var = lvVarArr[0].e;
                            if (w0Var != null) {
                                w0Var.v0(0, i12, null);
                                break;
                            }
                        } else {
                            int i13 = -i11;
                            lvVarArr[0].d.v0(0, i13, null);
                            ai.w0 w0Var2 = lvVarArr[0].e;
                            if (w0Var2 != null) {
                                w0Var2.v0(0, i13, null);
                                break;
                            }
                        }
                    }
                }
                break;
            case 7:
                gr0 gr0Var = (gr0) this.c;
                er0[] er0VarArr = gr0Var.n;
                ((s4.t0) this.b).a(recyclerView, i10);
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
                ((s4.t0) this.b).a(recyclerView, i10);
                ((eb0) this.c).D.getClass();
                break;
        }
    }

    @Override // s4.t0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        View F;
        int i12;
        int i13;
        ah.h hVar;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.a) {
            case 0:
                x3 x3Var = (x3) this.c;
                ((v3) this.b).t(i11);
                x3Var.l3.G();
                i1 i1Var = x3Var.J3;
                if (i1Var != null && (F = x3Var.F(i1Var)) != null) {
                    if (F.getBottom() <= 0 || F.getTop() >= x3Var.getHeight()) {
                        x3Var.J3 = null;
                        i1Var.clearFocus();
                        AndroidUtilities.hideKeyboard(x3Var);
                        break;
                    }
                }
                break;
            case 1:
                k71 k71Var = ((ee) this.c).a;
                if (k71Var.canScrollVertically(1)) {
                    for (int i14 = 0; i14 < k71Var.getChildCount(); i14++) {
                        if (!(k71Var.getChildAt(i14) instanceof j10)) {
                        }
                    }
                    break;
                }
                ((p8) this.b).run();
                break;
            case 2:
                zn znVar = (zn) this.c;
                zn znVar2 = znVar.da;
                if (znVar2 == null) {
                    znVar2 = znVar;
                }
                if (i11 != 0) {
                    znVar.v9(1);
                }
                if (Build.VERSION.SDK_INT >= 31 && (hVar = znVar2.F) != null) {
                    hVar.f(i10, i11);
                }
                if (recyclerView.getScrollState() == 1) {
                    AndroidUtilities.hideKeyboard(znVar.X0);
                }
                int N0 = ((s4.d0) this.b).N0();
                if ((N0 == -1 ? 0 : N0) > 0 && N0 > znVar.M3.h - 5) {
                    if (znVar.R3 != 7) {
                        znVar.getMediaDataController().loadMoreSearchMessages(true);
                        break;
                    } else if (!znVar.G6 && !znVar.C6[0]) {
                        znVar.G6 = true;
                        znVar.h6.add(Integer.valueOf(znVar.V5));
                        i12 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
                        HashtagSearchController hashtagSearchController = HashtagSearchController.getInstance(i12);
                        String str = znVar.u3;
                        i13 = ((org.telegram.ui.ActionBar.n2) znVar).classGuid;
                        int i15 = znVar.O3;
                        int i16 = znVar.V5;
                        znVar.V5 = i16 + 1;
                        hashtagSearchController.searchHashtag(str, i13, i15, i16);
                        break;
                    }
                }
                break;
            case 3:
                ty tyVar = (ty) this.b;
                di0 di0Var = (di0) this.c;
                k71 k71Var2 = di0Var.c;
                if (!(TextUtils.isEmpty(di0Var.w) ? di0Var.e : di0Var.n).isEmpty()) {
                    if (k71Var2.canScrollVertically(1)) {
                        for (int i17 = 0; i17 < k71Var2.getChildCount(); i17++) {
                            if (!(k71Var2.getChildAt(i17) instanceof j10)) {
                            }
                        }
                    }
                    di0Var.a(false);
                }
                if (k71Var2.I1 && !di0Var.Q && tyVar.getParentActivity() != null) {
                    AndroidUtilities.hideKeyboard(tyVar.getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 4:
                if (((qs) this.c).W.I1) {
                    AndroidUtilities.hideKeyboard((FrameLayout) this.b);
                    break;
                }
                break;
            case 5:
                ((s4.t0) this.b).b(recyclerView, i10, i11);
                mv mvVar = (mv) this.c;
                lv lvVar = mvVar.f[0];
                if (recyclerView == lvVar.d || recyclerView == lvVar.e) {
                    kVar = ((org.telegram.ui.ActionBar.n2) mvVar).actionBar;
                    float translationY = kVar.getTranslationY();
                    float f7 = translationY - i11;
                    if (f7 < (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) {
                        f7 = -org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    } else if (f7 > 0.0f) {
                        f7 = 0.0f;
                    }
                    if (f7 != translationY) {
                        mv.j0(mvVar, f7);
                        break;
                    }
                }
                break;
            case 6:
                zh0 zh0Var = (zh0) this.c;
                if (zh0Var.b0 && !zh0Var.W) {
                    if (zh0Var.X - ((gg.a0) this.b).N0() < 10) {
                        zh0Var.d0(true);
                        break;
                    }
                }
                break;
            case 7:
                ((s4.t0) this.b).b(recyclerView, i10, i11);
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
                ((s4.t0) this.b).b(recyclerView, i10, i11);
                ((eb0) this.c).D.b(recyclerView, i10, i11);
                break;
            default:
                xh.o2 o2Var = (xh.o2) this.c;
                xh.j2 j2Var = o2Var.f;
                if (o2Var.isAttachedToWindow()) {
                    if (j2Var.canScrollVertically(1)) {
                        for (int i18 = 0; i18 < j2Var.getChildCount(); i18++) {
                            if (!(j2Var.getChildAt(i18) instanceof j10)) {
                            }
                        }
                    }
                    o2Var.e.a();
                }
                ((rs0) this.b).o();
                break;
        }
    }
}
