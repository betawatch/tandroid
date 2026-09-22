package ii;

import ai.n8;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.HashtagSearchController;
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.nr0;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.yg0;
import org.telegram.ui.bo;
import org.telegram.ui.de;
import org.telegram.ui.er0;
import org.telegram.ui.gr0;
import org.telegram.ui.mv;
import org.telegram.ui.nv;
import org.telegram.ui.ss;
import org.telegram.ui.uy;
import org.telegram.ui.yh0;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class m3 extends s4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m3(int i10, Object obj, Object obj2) {
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
                    ((w3) this.c).n3.W();
                    break;
                }
                break;
            case 5:
                nv nvVar = (nv) this.c;
                mv[] mvVarArr = nvVar.f;
                ((s4.s0) this.b).a(recyclerView, i10);
                if (i10 != 1) {
                    kVar = ((org.telegram.ui.ActionBar.n2) nvVar).actionBar;
                    int i11 = (int) (-kVar.getTranslationY());
                    int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i11 != 0 && i11 != currentActionBarHeight) {
                        if (i11 >= currentActionBarHeight / 2) {
                            int i12 = currentActionBarHeight - i11;
                            mvVarArr[0].d.v0(0, i12, null);
                            ai.w0 w0Var = mvVarArr[0].e;
                            if (w0Var != null) {
                                w0Var.v0(0, i12, null);
                                break;
                            }
                        } else {
                            int i13 = -i11;
                            mvVarArr[0].d.v0(0, i13, null);
                            ai.w0 w0Var2 = mvVarArr[0].e;
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
                ((ca0) this.c).D.getClass();
                break;
        }
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        View F;
        int i12;
        int i13;
        ah.h hVar;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.a) {
            case 0:
                w3 w3Var = (w3) this.c;
                ((u3) this.b).u(i11);
                w3Var.n3.H();
                i1 i1Var = w3Var.L3;
                if (i1Var != null && (F = w3Var.F(i1Var)) != null) {
                    if (F.getBottom() <= 0 || F.getTop() >= w3Var.getHeight()) {
                        w3Var.L3 = null;
                        i1Var.clearFocus();
                        AndroidUtilities.hideKeyboard(w3Var);
                        break;
                    }
                }
                break;
            case 1:
                e61 e61Var = ((de) this.c).a;
                if (e61Var.canScrollVertically(1)) {
                    for (int i14 = 0; i14 < e61Var.getChildCount(); i14++) {
                        if (!(e61Var.getChildAt(i14) instanceof t00)) {
                        }
                    }
                    break;
                }
                ((n8) this.b).run();
                break;
            case 2:
                bo boVar = (bo) this.c;
                bo boVar2 = boVar.da;
                if (boVar2 == null) {
                    boVar2 = boVar;
                }
                if (i11 != 0) {
                    boVar.q9(1);
                }
                if (Build.VERSION.SDK_INT >= 31 && (hVar = boVar2.F) != null) {
                    hVar.f(i10, i11);
                }
                if (recyclerView.getScrollState() == 1) {
                    AndroidUtilities.hideKeyboard(boVar.X0);
                }
                int N0 = ((s4.c0) this.b).N0();
                if ((N0 == -1 ? 0 : N0) > 0 && N0 > boVar.M3.h - 5) {
                    if (boVar.R3 != 7) {
                        boVar.getMediaDataController().loadMoreSearchMessages(true);
                        break;
                    } else if (!boVar.G6 && !boVar.C6[0]) {
                        boVar.G6 = true;
                        boVar.h6.add(Integer.valueOf(boVar.V5));
                        i12 = ((org.telegram.ui.ActionBar.n2) boVar).currentAccount;
                        HashtagSearchController hashtagSearchController = HashtagSearchController.getInstance(i12);
                        String str = boVar.u3;
                        i13 = ((org.telegram.ui.ActionBar.n2) boVar).classGuid;
                        int i15 = boVar.O3;
                        int i16 = boVar.V5;
                        boVar.V5 = i16 + 1;
                        hashtagSearchController.searchHashtag(str, i13, i15, i16);
                        break;
                    }
                }
                break;
            case 3:
                uy uyVar = (uy) this.b;
                yg0 yg0Var = (yg0) this.c;
                e61 e61Var2 = yg0Var.c;
                if (!(TextUtils.isEmpty(yg0Var.w) ? yg0Var.e : yg0Var.n).isEmpty()) {
                    if (e61Var2.canScrollVertically(1)) {
                        for (int i17 = 0; i17 < e61Var2.getChildCount(); i17++) {
                            if (!(e61Var2.getChildAt(i17) instanceof t00)) {
                            }
                        }
                    }
                    yg0Var.a(false);
                }
                if (e61Var2.K1 && !yg0Var.Q && uyVar.getParentActivity() != null) {
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
                nv nvVar = (nv) this.c;
                mv mvVar = nvVar.f[0];
                if (recyclerView == mvVar.d || recyclerView == mvVar.e) {
                    kVar = ((org.telegram.ui.ActionBar.n2) nvVar).actionBar;
                    float translationY = kVar.getTranslationY();
                    float f7 = translationY - i11;
                    if (f7 < (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) {
                        f7 = -org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    } else if (f7 > 0.0f) {
                        f7 = 0.0f;
                    }
                    if (f7 != translationY) {
                        nv.j0(nvVar, f7);
                        break;
                    }
                }
                break;
            case 6:
                yh0 yh0Var = (yh0) this.c;
                if (yh0Var.b0 && !yh0Var.W) {
                    if (yh0Var.X - ((gg.b0) this.b).N0() < 10) {
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
                ((ca0) this.c).D.b(recyclerView, i10, i11);
                break;
            default:
                xh.n2 n2Var = (xh.n2) this.c;
                xh.i2 i2Var = n2Var.f;
                if (n2Var.isAttachedToWindow()) {
                    if (i2Var.canScrollVertically(1)) {
                        for (int i18 = 0; i18 < i2Var.getChildCount(); i18++) {
                            if (!(i2Var.getChildAt(i18) instanceof t00)) {
                            }
                        }
                    }
                    n2Var.e.a();
                }
                ((nr0) this.b).o();
                break;
        }
    }
}
