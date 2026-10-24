package ki;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.HashtagSearchController;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.ns0;
import org.telegram.ui.Components.xh0;
import org.telegram.ui.Components.ya0;
import org.telegram.ui.bv;
import org.telegram.ui.ce;
import org.telegram.ui.cv;
import org.telegram.ui.ey;
import org.telegram.ui.hs;
import org.telegram.ui.mh0;
import org.telegram.ui.pq0;
import org.telegram.ui.rq0;
import org.telegram.ui.sn;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class m3 extends s4.r0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m3(int i10, Object obj, Object obj2) {
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
                    ((w3) this.c).o3.V();
                    break;
                }
                break;
            case 5:
                cv cvVar = (cv) this.c;
                bv[] bvVarArr = cvVar.f;
                ((s4.r0) this.b).a(recyclerView, i10);
                if (i10 != 1) {
                    kVar = ((org.telegram.ui.ActionBar.o2) cvVar).actionBar;
                    int i11 = (int) (-kVar.getTranslationY());
                    int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i11 != 0 && i11 != currentActionBarHeight) {
                        if (i11 >= currentActionBarHeight / 2) {
                            int i12 = currentActionBarHeight - i11;
                            bvVarArr[0].d.v0(0, i12, null);
                            ai.u1 u1Var = bvVarArr[0].e;
                            if (u1Var != null) {
                                u1Var.v0(0, i12, null);
                                break;
                            }
                        } else {
                            int i13 = -i11;
                            bvVarArr[0].d.v0(0, i13, null);
                            ai.u1 u1Var2 = bvVarArr[0].e;
                            if (u1Var2 != null) {
                                u1Var2.v0(0, i13, null);
                                break;
                            }
                        }
                    }
                }
                break;
            case 7:
                rq0 rq0Var = (rq0) this.c;
                pq0[] pq0VarArr = rq0Var.n;
                ((s4.r0) this.b).a(recyclerView, i10);
                if (i10 != 1) {
                    kVar2 = ((org.telegram.ui.ActionBar.o2) rq0Var).actionBar;
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
            case 8:
                ((s4.r0) this.b).a(recyclerView, i10);
                ((ya0) this.c).D.getClass();
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
                w3 w3Var = (w3) this.c;
                ((u3) this.b).z(i11);
                w3Var.o3.G();
                h1 h1Var = w3Var.M3;
                if (h1Var != null && (F = w3Var.F(h1Var)) != null) {
                    if (F.getBottom() <= 0 || F.getTop() >= w3Var.getHeight()) {
                        w3Var.M3 = null;
                        h1Var.clearFocus();
                        AndroidUtilities.hideKeyboard(w3Var);
                        break;
                    }
                }
                break;
            case 1:
                j71 j71Var = ((ce) this.c).a;
                if (j71Var.canScrollVertically(1)) {
                    for (int i14 = 0; i14 < j71Var.getChildCount(); i14++) {
                        if (!(j71Var.getChildAt(i14) instanceof b10)) {
                        }
                    }
                    break;
                }
                ((ah.g) this.b).run();
                break;
            case 2:
                sn snVar = (sn) this.c;
                sn snVar2 = snVar.pa;
                if (snVar2 == null) {
                    snVar2 = snVar;
                }
                if (i11 != 0) {
                    snVar.v9(1);
                }
                if (Build.VERSION.SDK_INT >= 31 && (fVar = snVar2.F) != null) {
                    fVar.f(i10, i11);
                }
                if (recyclerView.getScrollState() == 1) {
                    AndroidUtilities.hideKeyboard(snVar.j1);
                }
                int N0 = ((s4.b0) this.b).N0();
                if ((N0 == -1 ? 0 : N0) > 0 && N0 > snVar.Y3.h - 5) {
                    if (snVar.d4 != 7) {
                        snVar.getMediaDataController().loadMoreSearchMessages(true);
                        break;
                    } else if (!snVar.S6 && !snVar.O6[0]) {
                        snVar.S6 = true;
                        snVar.t6.add(Integer.valueOf(snVar.h6));
                        i12 = ((org.telegram.ui.ActionBar.o2) snVar).currentAccount;
                        HashtagSearchController hashtagSearchController = HashtagSearchController.getInstance(i12);
                        String str = snVar.G3;
                        i13 = ((org.telegram.ui.ActionBar.o2) snVar).classGuid;
                        int i15 = snVar.a4;
                        int i16 = snVar.h6;
                        snVar.h6 = i16 + 1;
                        hashtagSearchController.searchHashtag(str, i13, i15, i16);
                        break;
                    }
                }
                break;
            case 3:
                ey eyVar = (ey) this.b;
                xh0 xh0Var = (xh0) this.c;
                j71 j71Var2 = xh0Var.c;
                if (!(TextUtils.isEmpty(xh0Var.w) ? xh0Var.e : xh0Var.n).isEmpty()) {
                    if (j71Var2.canScrollVertically(1)) {
                        for (int i17 = 0; i17 < j71Var2.getChildCount(); i17++) {
                            if (!(j71Var2.getChildAt(i17) instanceof b10)) {
                            }
                        }
                    }
                    xh0Var.a(false);
                }
                if (j71Var2.I1 && !xh0Var.Q && eyVar.getParentActivity() != null) {
                    AndroidUtilities.hideKeyboard(eyVar.getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 4:
                if (((hs) this.c).W.I1) {
                    AndroidUtilities.hideKeyboard((FrameLayout) this.b);
                    break;
                }
                break;
            case 5:
                ((s4.r0) this.b).b(recyclerView, i10, i11);
                cv cvVar = (cv) this.c;
                bv bvVar = cvVar.f[0];
                if (recyclerView == bvVar.d || recyclerView == bvVar.e) {
                    kVar = ((org.telegram.ui.ActionBar.o2) cvVar).actionBar;
                    float translationY = kVar.getTranslationY();
                    float f7 = translationY - i11;
                    if (f7 < (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) {
                        f7 = -org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    } else if (f7 > 0.0f) {
                        f7 = 0.0f;
                    }
                    if (f7 != translationY) {
                        cv.j0(cvVar, f7);
                        break;
                    }
                }
                break;
            case 6:
                mh0 mh0Var = (mh0) this.c;
                if (mh0Var.b0 && !mh0Var.W) {
                    if (mh0Var.X - ((hg.a0) this.b).N0() < 10) {
                        mh0Var.e0(true);
                        break;
                    }
                }
                break;
            case 7:
                ((s4.r0) this.b).b(recyclerView, i10, i11);
                rq0 rq0Var = (rq0) this.c;
                if (recyclerView == rq0Var.n[0].d) {
                    kVar2 = ((org.telegram.ui.ActionBar.o2) rq0Var).actionBar;
                    float translationY2 = kVar2.getTranslationY();
                    float f10 = translationY2 - i11;
                    if (f10 < (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) {
                        f10 = -org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    } else if (f10 > 0.0f) {
                        f10 = 0.0f;
                    }
                    if (f10 != translationY2) {
                        rq0.g0(rq0Var, f10);
                        break;
                    }
                }
                break;
            case 8:
                ((s4.r0) this.b).b(recyclerView, i10, i11);
                ((ya0) this.c).D.b(recyclerView, i10, i11);
                break;
            case 9:
                yh.l2 l2Var = (yh.l2) this.c;
                yh.g2 g2Var = l2Var.f;
                if (l2Var.isAttachedToWindow()) {
                    if (g2Var.canScrollVertically(1)) {
                        for (int i18 = 0; i18 < g2Var.getChildCount(); i18++) {
                            if (!(g2Var.getChildAt(i18) instanceof b10)) {
                            }
                        }
                    }
                    l2Var.e.a();
                }
                ((ns0) this.b).o();
                break;
            default:
                zh.q qVar = (zh.q) this.b;
                float translationY3 = qVar.getTranslationY();
                float f11 = ((zh.n0) this.c).d0;
                if (translationY3 != f11) {
                    qVar.setTranslationY(f11);
                    qVar.invalidate();
                    break;
                }
                break;
        }
    }
}
