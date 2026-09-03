package jh;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import f2.i0;
import f2.z0;
import kh.g3;
import kh.m3;
import lh.e1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.HashtagSearchController;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.fa0;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.or0;
import org.telegram.ui.Components.u00;
import org.telegram.ui.ge;
import org.telegram.ui.lv;
import org.telegram.ui.mv;
import org.telegram.ui.pq0;
import org.telegram.ui.ps;
import org.telegram.ui.qy;
import org.telegram.ui.rh0;
import org.telegram.ui.rq0;
import org.telegram.ui.zn;
import vh.q3;
import vh.s3;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class l extends z0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    @Override // f2.z0
    public void a(RecyclerView recyclerView, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.a) {
            case 0:
                ((z0) this.b).a(recyclerView, i10);
                ((fa0) this.c).D.getClass();
                break;
            case 6:
                mv mvVar = (mv) this.c;
                lv[] lvVarArr = mvVar.f;
                ((z0) this.b).a(recyclerView, i10);
                if (i10 != 1) {
                    kVar = ((p2) mvVar).actionBar;
                    int i11 = (int) (-kVar.getTranslationY());
                    int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i11 != 0 && i11 != currentActionBarHeight) {
                        if (i11 >= currentActionBarHeight / 2) {
                            int i12 = currentActionBarHeight - i11;
                            lvVarArr[0].d.v0(0, i12, null);
                            e1 e1Var = lvVarArr[0].e;
                            if (e1Var != null) {
                                e1Var.v0(0, i12, null);
                                break;
                            }
                        } else {
                            int i13 = -i11;
                            lvVarArr[0].d.v0(0, i13, null);
                            e1 e1Var2 = lvVarArr[0].e;
                            if (e1Var2 != null) {
                                e1Var2.v0(0, i13, null);
                                break;
                            }
                        }
                    }
                }
                break;
            case 8:
                rq0 rq0Var = (rq0) this.c;
                pq0[] pq0VarArr = rq0Var.n;
                ((z0) this.b).a(recyclerView, i10);
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
                    ((s3) this.c).k3.W();
                    break;
                }
                break;
        }
    }

    @Override // f2.z0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        int i13;
        ng.e eVar;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        View F;
        switch (this.a) {
            case 0:
                ((z0) this.b).b(recyclerView, i10, i11);
                ((fa0) this.c).D.b(recyclerView, i10, i11);
                break;
            case 1:
                m3 m3Var = (m3) this.c;
                g3 g3Var = m3Var.f;
                if (m3Var.isAttachedToWindow()) {
                    if (g3Var.canScrollVertically(1)) {
                        for (int i14 = 0; i14 < g3Var.getChildCount(); i14++) {
                            if (!(g3Var.getChildAt(i14) instanceof u00)) {
                            }
                        }
                    }
                    m3Var.e.a();
                }
                ((or0) this.b).o();
                break;
            case 2:
                g61 g61Var = ((ge) this.c).a;
                if (g61Var.canScrollVertically(1)) {
                    for (int i15 = 0; i15 < g61Var.getChildCount(); i15++) {
                        if (!(g61Var.getChildAt(i15) instanceof u00)) {
                        }
                    }
                    break;
                }
                ((ah.b) this.b).run();
                break;
            case 3:
                zn znVar = (zn) this.c;
                zn znVar2 = znVar.aa;
                if (znVar2 == null) {
                    znVar2 = znVar;
                }
                if (i11 != 0) {
                    znVar.q9(1);
                }
                if (Build.VERSION.SDK_INT >= 31 && (eVar = znVar2.C) != null) {
                    eVar.f(i10, i11);
                }
                if (recyclerView.getScrollState() == 1) {
                    AndroidUtilities.hideKeyboard(znVar.U0);
                }
                int N0 = ((i0) this.b).N0();
                if ((N0 == -1 ? 0 : N0) > 0 && N0 > znVar.J3.h - 5) {
                    if (znVar.O3 != 7) {
                        znVar.getMediaDataController().loadMoreSearchMessages(true);
                        break;
                    } else if (!znVar.D6 && !znVar.z6[0]) {
                        znVar.D6 = true;
                        znVar.e6.add(Integer.valueOf(znVar.S5));
                        i12 = ((p2) znVar).currentAccount;
                        HashtagSearchController hashtagSearchController = HashtagSearchController.getInstance(i12);
                        String str = znVar.r3;
                        i13 = ((p2) znVar).classGuid;
                        int i16 = znVar.L3;
                        int i17 = znVar.S5;
                        znVar.S5 = i17 + 1;
                        hashtagSearchController.searchHashtag(str, i13, i16, i17);
                        break;
                    }
                }
                break;
            case 4:
                qy qyVar = (qy) this.b;
                fh0 fh0Var = (fh0) this.c;
                g61 g61Var2 = fh0Var.c;
                if (!(TextUtils.isEmpty(fh0Var.w) ? fh0Var.e : fh0Var.n).isEmpty()) {
                    if (g61Var2.canScrollVertically(1)) {
                        for (int i18 = 0; i18 < g61Var2.getChildCount(); i18++) {
                            if (!(g61Var2.getChildAt(i18) instanceof u00)) {
                            }
                        }
                    }
                    fh0Var.a(false);
                }
                if (g61Var2.H1 && !fh0Var.N && qyVar.getParentActivity() != null) {
                    AndroidUtilities.hideKeyboard(qyVar.getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 5:
                if (((ps) this.c).T.H1) {
                    AndroidUtilities.hideKeyboard((FrameLayout) this.b);
                    break;
                }
                break;
            case 6:
                ((z0) this.b).b(recyclerView, i10, i11);
                mv mvVar = (mv) this.c;
                lv lvVar = mvVar.f[0];
                if (recyclerView == lvVar.d || recyclerView == lvVar.e) {
                    kVar = ((p2) mvVar).actionBar;
                    float translationY = kVar.getTranslationY();
                    float f10 = translationY - i11;
                    if (f10 < (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) {
                        f10 = -org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    } else if (f10 > 0.0f) {
                        f10 = 0.0f;
                    }
                    if (f10 != translationY) {
                        mv.j0(mvVar, f10);
                        break;
                    }
                }
                break;
            case 7:
                rh0 rh0Var = (rh0) this.c;
                if (rh0Var.Y && !rh0Var.T) {
                    if (rh0Var.U - ((org.telegram.ui.k) this.b).N0() < 10) {
                        rh0Var.d0(true);
                        break;
                    }
                }
                break;
            case 8:
                ((z0) this.b).b(recyclerView, i10, i11);
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
                s3 s3Var = (s3) this.c;
                ((q3) this.b).y(i11);
                s3Var.k3.H();
                vh.e1 e1Var = s3Var.I3;
                if (e1Var != null && (F = s3Var.F(e1Var)) != null) {
                    if (F.getBottom() <= 0 || F.getTop() >= s3Var.getHeight()) {
                        s3Var.I3 = null;
                        e1Var.clearFocus();
                        AndroidUtilities.hideKeyboard(s3Var);
                        break;
                    }
                }
                break;
        }
    }
}
