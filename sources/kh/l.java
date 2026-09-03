package kh;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import f2.a1;
import f2.j0;
import lh.h3;
import lh.n3;
import mh.d1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.HashtagSearchController;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.ga0;
import org.telegram.ui.Components.gh0;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.or0;
import org.telegram.ui.Components.u00;
import org.telegram.ui.ee;
import org.telegram.ui.kv;
import org.telegram.ui.lv;
import org.telegram.ui.os;
import org.telegram.ui.pq0;
import org.telegram.ui.py;
import org.telegram.ui.qh0;
import org.telegram.ui.rq0;
import org.telegram.ui.xn;
import wh.e1;
import wh.p3;
import wh.r3;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.a) {
            case 0:
                ((a1) this.b).a(recyclerView, i10);
                ((ga0) this.c).D.getClass();
                break;
            case 6:
                lv lvVar = (lv) this.c;
                kv[] kvVarArr = lvVar.f;
                ((a1) this.b).a(recyclerView, i10);
                if (i10 != 1) {
                    kVar = ((p2) lvVar).actionBar;
                    int i11 = (int) (-kVar.getTranslationY());
                    int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i11 != 0 && i11 != currentActionBarHeight) {
                        if (i11 >= currentActionBarHeight / 2) {
                            int i12 = currentActionBarHeight - i11;
                            kvVarArr[0].d.v0(0, i12, null);
                            d1 d1Var = kvVarArr[0].e;
                            if (d1Var != null) {
                                d1Var.v0(0, i12, null);
                                break;
                            }
                        } else {
                            int i13 = -i11;
                            kvVarArr[0].d.v0(0, i13, null);
                            d1 d1Var2 = kvVarArr[0].e;
                            if (d1Var2 != null) {
                                d1Var2.v0(0, i13, null);
                                break;
                            }
                        }
                    }
                }
                break;
            case 8:
                rq0 rq0Var = (rq0) this.c;
                pq0[] pq0VarArr = rq0Var.n;
                ((a1) this.b).a(recyclerView, i10);
                if (i10 != 1) {
                    kVar2 = ((p2) rq0Var).actionBar;
                    int i14 = (int) (-kVar2.getTranslationY());
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i14 != 0 && i14 != currentActionBarHeight2) {
                        if (i14 >= currentActionBarHeight2 / 2) {
                            pq0VarArr[0].d.v0(0, currentActionBarHeight2 - i14, null);
                            break;
                        } else {
                            pq0VarArr[0].d.v0(0, -i14, null);
                            break;
                        }
                    }
                }
                break;
            case 9:
                if (i10 == 0) {
                    ((r3) this.c).k3.W();
                    break;
                }
                break;
        }
    }

    @Override // f2.a1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        int i13;
        og.e eVar;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        View F;
        switch (this.a) {
            case 0:
                ((a1) this.b).b(recyclerView, i10, i11);
                ((ga0) this.c).D.b(recyclerView, i10, i11);
                break;
            case 1:
                n3 n3Var = (n3) this.c;
                h3 h3Var = n3Var.f;
                if (n3Var.isAttachedToWindow()) {
                    if (h3Var.canScrollVertically(1)) {
                        for (int i14 = 0; i14 < h3Var.getChildCount(); i14++) {
                            if (!(h3Var.getChildAt(i14) instanceof u00)) {
                            }
                        }
                    }
                    n3Var.e.a();
                }
                ((or0) this.b).o();
                break;
            case 2:
                h61 h61Var = ((ee) this.c).a;
                if (h61Var.canScrollVertically(1)) {
                    for (int i15 = 0; i15 < h61Var.getChildCount(); i15++) {
                        if (!(h61Var.getChildAt(i15) instanceof u00)) {
                        }
                    }
                    break;
                }
                ((af.b) this.b).run();
                break;
            case 3:
                xn xnVar = (xn) this.c;
                xn xnVar2 = xnVar.aa;
                if (xnVar2 == null) {
                    xnVar2 = xnVar;
                }
                if (i11 != 0) {
                    xnVar.q9(1);
                }
                if (Build.VERSION.SDK_INT >= 31 && (eVar = xnVar2.C) != null) {
                    eVar.f(i10, i11);
                }
                if (recyclerView.getScrollState() == 1) {
                    AndroidUtilities.hideKeyboard(xnVar.U0);
                }
                int N0 = ((j0) this.b).N0();
                if ((N0 == -1 ? 0 : N0) > 0 && N0 > xnVar.J3.h - 5) {
                    if (xnVar.O3 != 7) {
                        xnVar.getMediaDataController().loadMoreSearchMessages(true);
                        break;
                    } else if (!xnVar.D6 && !xnVar.z6[0]) {
                        xnVar.D6 = true;
                        xnVar.e6.add(Integer.valueOf(xnVar.S5));
                        i12 = ((p2) xnVar).currentAccount;
                        HashtagSearchController hashtagSearchController = HashtagSearchController.getInstance(i12);
                        String str = xnVar.r3;
                        i13 = ((p2) xnVar).classGuid;
                        int i16 = xnVar.L3;
                        int i17 = xnVar.S5;
                        xnVar.S5 = i17 + 1;
                        hashtagSearchController.searchHashtag(str, i13, i16, i17);
                        break;
                    }
                }
                break;
            case 4:
                py pyVar = (py) this.b;
                gh0 gh0Var = (gh0) this.c;
                h61 h61Var2 = gh0Var.c;
                if (!(TextUtils.isEmpty(gh0Var.w) ? gh0Var.e : gh0Var.n).isEmpty()) {
                    if (h61Var2.canScrollVertically(1)) {
                        for (int i18 = 0; i18 < h61Var2.getChildCount(); i18++) {
                            if (!(h61Var2.getChildAt(i18) instanceof u00)) {
                            }
                        }
                    }
                    gh0Var.a(false);
                }
                if (h61Var2.H1 && !gh0Var.N && pyVar.getParentActivity() != null) {
                    AndroidUtilities.hideKeyboard(pyVar.getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 5:
                if (((os) this.c).T.H1) {
                    AndroidUtilities.hideKeyboard((FrameLayout) this.b);
                    break;
                }
                break;
            case 6:
                ((a1) this.b).b(recyclerView, i10, i11);
                lv lvVar = (lv) this.c;
                kv kvVar = lvVar.f[0];
                if (recyclerView == kvVar.d || recyclerView == kvVar.e) {
                    kVar = ((p2) lvVar).actionBar;
                    float translationY = kVar.getTranslationY();
                    float f10 = translationY - i11;
                    if (f10 < (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) {
                        f10 = -org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    } else if (f10 > 0.0f) {
                        f10 = 0.0f;
                    }
                    if (f10 != translationY) {
                        lv.j0(lvVar, f10);
                        break;
                    }
                }
                break;
            case 7:
                qh0 qh0Var = (qh0) this.c;
                if (qh0Var.Y && !qh0Var.T) {
                    if (qh0Var.U - ((org.telegram.ui.k) this.b).N0() < 10) {
                        qh0Var.d0(true);
                        break;
                    }
                }
                break;
            case 8:
                ((a1) this.b).b(recyclerView, i10, i11);
                rq0 rq0Var = (rq0) this.c;
                if (recyclerView == rq0Var.n[0].d) {
                    kVar2 = ((p2) rq0Var).actionBar;
                    float translationY2 = kVar2.getTranslationY();
                    float f11 = translationY2 - i11;
                    if (f11 < (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) {
                        f11 = -org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    } else if (f11 > 0.0f) {
                        f11 = 0.0f;
                    }
                    if (f11 != translationY2) {
                        rq0.g0(rq0Var, f11);
                        break;
                    }
                }
                break;
            default:
                r3 r3Var = (r3) this.c;
                ((p3) this.b).C(i11);
                r3Var.k3.H();
                e1 e1Var = r3Var.I3;
                if (e1Var != null && (F = r3Var.F(e1Var)) != null) {
                    if (F.getBottom() <= 0 || F.getTop() >= r3Var.getHeight()) {
                        r3Var.I3 = null;
                        e1Var.clearFocus();
                        AndroidUtilities.hideKeyboard(r3Var);
                        break;
                    }
                }
                break;
        }
    }
}
