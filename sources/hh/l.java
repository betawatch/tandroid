package hh;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import f2.a1;
import f2.j0;
import ih.h3;
import ih.n3;
import jh.e1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.HashtagSearchController;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.gr0;
import org.telegram.ui.Components.p00;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.ug0;
import org.telegram.ui.Components.z90;
import org.telegram.ui.bv;
import org.telegram.ui.cq0;
import org.telegram.ui.cv;
import org.telegram.ui.eq0;
import org.telegram.ui.fy;
import org.telegram.ui.hh0;
import org.telegram.ui.hs;
import org.telegram.ui.tn;
import org.telegram.ui.xd;
import th.d1;
import th.p3;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class l extends a1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    @Override // f2.a1
    public void a(RecyclerView recyclerView, int i10) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        switch (this.a) {
            case 0:
                ((a1) this.b).a(recyclerView, i10);
                ((z90) this.c).D.getClass();
                break;
            case 6:
                cv cvVar = (cv) this.c;
                bv[] bvVarArr = cvVar.f;
                ((a1) this.b).a(recyclerView, i10);
                if (i10 != 1) {
                    lVar = ((o2) cvVar).actionBar;
                    int i11 = (int) (-lVar.getTranslationY());
                    int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                    if (i11 != 0 && i11 != currentActionBarHeight) {
                        if (i11 >= currentActionBarHeight / 2) {
                            int i12 = currentActionBarHeight - i11;
                            bvVarArr[0].d.v0(0, i12, null);
                            e1 e1Var = bvVarArr[0].e;
                            if (e1Var != null) {
                                e1Var.v0(0, i12, null);
                                break;
                            }
                        } else {
                            int i13 = -i11;
                            bvVarArr[0].d.v0(0, i13, null);
                            e1 e1Var2 = bvVarArr[0].e;
                            if (e1Var2 != null) {
                                e1Var2.v0(0, i13, null);
                                break;
                            }
                        }
                    }
                }
                break;
            case 8:
                eq0 eq0Var = (eq0) this.c;
                cq0[] cq0VarArr = eq0Var.n;
                ((a1) this.b).a(recyclerView, i10);
                if (i10 != 1) {
                    lVar2 = ((o2) eq0Var).actionBar;
                    int i14 = (int) (-lVar2.getTranslationY());
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                    if (i14 != 0 && i14 != currentActionBarHeight2) {
                        if (i14 >= currentActionBarHeight2 / 2) {
                            cq0VarArr[0].d.v0(0, currentActionBarHeight2 - i14, null);
                            break;
                        } else {
                            cq0VarArr[0].d.v0(0, -i14, null);
                            break;
                        }
                    }
                }
                break;
            case 9:
                if (i10 == 0) {
                    ((p3) this.c).j3.W();
                    break;
                }
                break;
        }
    }

    @Override // f2.a1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        int i13;
        lg.e eVar;
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        View F;
        switch (this.a) {
            case 0:
                ((a1) this.b).b(recyclerView, i10, i11);
                ((z90) this.c).D.b(recyclerView, i10, i11);
                break;
            case 1:
                n3 n3Var = (n3) this.c;
                h3 h3Var = n3Var.f;
                if (n3Var.isAttachedToWindow()) {
                    if (h3Var.canScrollVertically(1)) {
                        for (int i14 = 0; i14 < h3Var.getChildCount(); i14++) {
                            if (!(h3Var.getChildAt(i14) instanceof p00)) {
                            }
                        }
                    }
                    n3Var.e.a();
                }
                ((gr0) this.b).o();
                break;
            case 2:
                u51 u51Var = ((xd) this.c).a;
                if (u51Var.canScrollVertically(1)) {
                    for (int i15 = 0; i15 < u51Var.getChildCount(); i15++) {
                        if (!(u51Var.getChildAt(i15) instanceof p00)) {
                        }
                    }
                    break;
                }
                ((bg.f) this.b).run();
                break;
            case 3:
                tn tnVar = (tn) this.c;
                tn tnVar2 = tnVar.Z9;
                if (tnVar2 == null) {
                    tnVar2 = tnVar;
                }
                if (i11 != 0) {
                    tnVar.q9(1);
                }
                if (Build.VERSION.SDK_INT >= 31 && (eVar = tnVar2.B) != null) {
                    eVar.f(i10, i11);
                }
                if (recyclerView.getScrollState() == 1) {
                    AndroidUtilities.hideKeyboard(tnVar.T0);
                }
                int N0 = ((j0) this.b).N0();
                if ((N0 == -1 ? 0 : N0) > 0 && N0 > tnVar.I3.h - 5) {
                    if (tnVar.N3 != 7) {
                        tnVar.getMediaDataController().loadMoreSearchMessages(true);
                        break;
                    } else if (!tnVar.C6 && !tnVar.y6[0]) {
                        tnVar.C6 = true;
                        tnVar.d6.add(Integer.valueOf(tnVar.R5));
                        i12 = ((o2) tnVar).currentAccount;
                        HashtagSearchController hashtagSearchController = HashtagSearchController.getInstance(i12);
                        String str = tnVar.q3;
                        i13 = ((o2) tnVar).classGuid;
                        int i16 = tnVar.K3;
                        int i17 = tnVar.R5;
                        tnVar.R5 = i17 + 1;
                        hashtagSearchController.searchHashtag(str, i13, i16, i17);
                        break;
                    }
                }
                break;
            case 4:
                fy fyVar = (fy) this.b;
                ug0 ug0Var = (ug0) this.c;
                u51 u51Var2 = ug0Var.c;
                if (!(TextUtils.isEmpty(ug0Var.w) ? ug0Var.e : ug0Var.n).isEmpty()) {
                    if (u51Var2.canScrollVertically(1)) {
                        for (int i18 = 0; i18 < u51Var2.getChildCount(); i18++) {
                            if (!(u51Var2.getChildAt(i18) instanceof p00)) {
                            }
                        }
                    }
                    ug0Var.a(false);
                }
                if (u51Var2.G1 && !ug0Var.M && fyVar.getParentActivity() != null) {
                    AndroidUtilities.hideKeyboard(fyVar.getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 5:
                if (((hs) this.c).S.G1) {
                    AndroidUtilities.hideKeyboard((FrameLayout) this.b);
                    break;
                }
                break;
            case 6:
                ((a1) this.b).b(recyclerView, i10, i11);
                cv cvVar = (cv) this.c;
                bv bvVar = cvVar.f[0];
                if (recyclerView == bvVar.d || recyclerView == bvVar.e) {
                    lVar = ((o2) cvVar).actionBar;
                    float translationY = lVar.getTranslationY();
                    float f9 = translationY - i11;
                    if (f9 < (-org.telegram.ui.ActionBar.l.getCurrentActionBarHeight())) {
                        f9 = -org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                    } else if (f9 > 0.0f) {
                        f9 = 0.0f;
                    }
                    if (f9 != translationY) {
                        cv.j0(cvVar, f9);
                        break;
                    }
                }
                break;
            case 7:
                hh0 hh0Var = (hh0) this.c;
                if (hh0Var.X && !hh0Var.S) {
                    if (hh0Var.T - ((org.telegram.ui.k) this.b).N0() < 10) {
                        hh0Var.d0(true);
                        break;
                    }
                }
                break;
            case 8:
                ((a1) this.b).b(recyclerView, i10, i11);
                eq0 eq0Var = (eq0) this.c;
                if (recyclerView == eq0Var.n[0].d) {
                    lVar2 = ((o2) eq0Var).actionBar;
                    float translationY2 = lVar2.getTranslationY();
                    float f10 = translationY2 - i11;
                    if (f10 < (-org.telegram.ui.ActionBar.l.getCurrentActionBarHeight())) {
                        f10 = -org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                    } else if (f10 > 0.0f) {
                        f10 = 0.0f;
                    }
                    if (f10 != translationY2) {
                        eq0.g0(eq0Var, f10);
                        break;
                    }
                }
                break;
            default:
                p3 p3Var = (p3) this.c;
                ((th.n3) this.b).K0(i11);
                p3Var.j3.H();
                d1 d1Var = p3Var.H3;
                if (d1Var != null && (F = p3Var.F(d1Var)) != null) {
                    if (F.getBottom() <= 0 || F.getTop() >= p3Var.getHeight()) {
                        p3Var.H3 = null;
                        d1Var.clearFocus();
                        AndroidUtilities.hideKeyboard(p3Var);
                        break;
                    }
                }
                break;
        }
    }
}
