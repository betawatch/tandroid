package ki;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.HashtagSearchController;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.is0;
import org.telegram.ui.Components.th0;
import org.telegram.ui.Components.xa0;
import org.telegram.ui.av;
import org.telegram.ui.bv;
import org.telegram.ui.ee;
import org.telegram.ui.ey;
import org.telegram.ui.hs;
import org.telegram.ui.kh0;
import org.telegram.ui.nq0;
import org.telegram.ui.pq0;
import org.telegram.ui.sn;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
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
                    ((w3) this.c).l3.V();
                    break;
                }
                break;
            case 5:
                bv bvVar = (bv) this.c;
                av[] avVarArr = bvVar.f;
                ((s4.r0) this.b).a(recyclerView, i10);
                if (i10 != 1) {
                    kVar = ((org.telegram.ui.ActionBar.n2) bvVar).actionBar;
                    int i11 = (int) (-kVar.getTranslationY());
                    int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i11 != 0 && i11 != currentActionBarHeight) {
                        if (i11 >= currentActionBarHeight / 2) {
                            int i12 = currentActionBarHeight - i11;
                            avVarArr[0].d.v0(0, i12, null);
                            ai.u1 u1Var = avVarArr[0].e;
                            if (u1Var != null) {
                                u1Var.v0(0, i12, null);
                                break;
                            }
                        } else {
                            int i13 = -i11;
                            avVarArr[0].d.v0(0, i13, null);
                            ai.u1 u1Var2 = avVarArr[0].e;
                            if (u1Var2 != null) {
                                u1Var2.v0(0, i13, null);
                                break;
                            }
                        }
                    }
                }
                break;
            case 7:
                pq0 pq0Var = (pq0) this.c;
                nq0[] nq0VarArr = pq0Var.n;
                ((s4.r0) this.b).a(recyclerView, i10);
                if (i10 != 1) {
                    kVar2 = ((org.telegram.ui.ActionBar.n2) pq0Var).actionBar;
                    int i14 = (int) (-kVar2.getTranslationY());
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i14 != 0 && i14 != currentActionBarHeight2) {
                        if (i14 >= currentActionBarHeight2 / 2) {
                            nq0VarArr[0].d.v0(0, currentActionBarHeight2 - i14, null);
                            break;
                        } else {
                            nq0VarArr[0].d.v0(0, -i14, null);
                            break;
                        }
                    }
                }
                break;
            case 8:
                ((s4.r0) this.b).a(recyclerView, i10);
                ((xa0) this.c).D.getClass();
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
                ((u3) this.b).w(i11);
                w3Var.l3.G();
                h1 h1Var = w3Var.J3;
                if (h1Var != null && (F = w3Var.F(h1Var)) != null) {
                    if (F.getBottom() <= 0 || F.getTop() >= w3Var.getHeight()) {
                        w3Var.J3 = null;
                        h1Var.clearFocus();
                        AndroidUtilities.hideKeyboard(w3Var);
                        break;
                    }
                }
                break;
            case 1:
                a71 a71Var = ((ee) this.c).a;
                if (a71Var.canScrollVertically(1)) {
                    for (int i14 = 0; i14 < a71Var.getChildCount(); i14++) {
                        if (!(a71Var.getChildAt(i14) instanceof b10)) {
                        }
                    }
                    break;
                }
                ((ah.g) this.b).run();
                break;
            case 2:
                sn snVar = (sn) this.c;
                sn snVar2 = snVar.da;
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
                    AndroidUtilities.hideKeyboard(snVar.X0);
                }
                int N0 = ((s4.b0) this.b).N0();
                if ((N0 == -1 ? 0 : N0) > 0 && N0 > snVar.M3.h - 5) {
                    if (snVar.R3 != 7) {
                        snVar.getMediaDataController().loadMoreSearchMessages(true);
                        break;
                    } else if (!snVar.G6 && !snVar.C6[0]) {
                        snVar.G6 = true;
                        snVar.h6.add(Integer.valueOf(snVar.V5));
                        i12 = ((org.telegram.ui.ActionBar.n2) snVar).currentAccount;
                        HashtagSearchController hashtagSearchController = HashtagSearchController.getInstance(i12);
                        String str = snVar.u3;
                        i13 = ((org.telegram.ui.ActionBar.n2) snVar).classGuid;
                        int i15 = snVar.O3;
                        int i16 = snVar.V5;
                        snVar.V5 = i16 + 1;
                        hashtagSearchController.searchHashtag(str, i13, i15, i16);
                        break;
                    }
                }
                break;
            case 3:
                ey eyVar = (ey) this.b;
                th0 th0Var = (th0) this.c;
                a71 a71Var2 = th0Var.c;
                if (!(TextUtils.isEmpty(th0Var.w) ? th0Var.e : th0Var.n).isEmpty()) {
                    if (a71Var2.canScrollVertically(1)) {
                        for (int i17 = 0; i17 < a71Var2.getChildCount(); i17++) {
                            if (!(a71Var2.getChildAt(i17) instanceof b10)) {
                            }
                        }
                    }
                    th0Var.a(false);
                }
                if (a71Var2.I1 && !th0Var.Q && eyVar.getParentActivity() != null) {
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
                bv bvVar = (bv) this.c;
                av avVar = bvVar.f[0];
                if (recyclerView == avVar.d || recyclerView == avVar.e) {
                    kVar = ((org.telegram.ui.ActionBar.n2) bvVar).actionBar;
                    float translationY = kVar.getTranslationY();
                    float f7 = translationY - i11;
                    if (f7 < (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) {
                        f7 = -org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    } else if (f7 > 0.0f) {
                        f7 = 0.0f;
                    }
                    if (f7 != translationY) {
                        bv.j0(bvVar, f7);
                        break;
                    }
                }
                break;
            case 6:
                kh0 kh0Var = (kh0) this.c;
                if (kh0Var.b0 && !kh0Var.W) {
                    if (kh0Var.X - ((hg.a0) this.b).N0() < 10) {
                        kh0Var.d0(true);
                        break;
                    }
                }
                break;
            case 7:
                ((s4.r0) this.b).b(recyclerView, i10, i11);
                pq0 pq0Var = (pq0) this.c;
                if (recyclerView == pq0Var.n[0].d) {
                    kVar2 = ((org.telegram.ui.ActionBar.n2) pq0Var).actionBar;
                    float translationY2 = kVar2.getTranslationY();
                    float f10 = translationY2 - i11;
                    if (f10 < (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) {
                        f10 = -org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    } else if (f10 > 0.0f) {
                        f10 = 0.0f;
                    }
                    if (f10 != translationY2) {
                        pq0.g0(pq0Var, f10);
                        break;
                    }
                }
                break;
            case 8:
                ((s4.r0) this.b).b(recyclerView, i10, i11);
                ((xa0) this.c).D.b(recyclerView, i10, i11);
                break;
            case 9:
                yh.m2 m2Var = (yh.m2) this.c;
                yh.h2 h2Var = m2Var.f;
                if (m2Var.isAttachedToWindow()) {
                    if (h2Var.canScrollVertically(1)) {
                        for (int i18 = 0; i18 < h2Var.getChildCount(); i18++) {
                            if (!(h2Var.getChildAt(i18) instanceof b10)) {
                            }
                        }
                    }
                    m2Var.e.a();
                }
                ((is0) this.b).o();
                break;
            default:
                zh.w wVar = (zh.w) this.b;
                float translationY3 = wVar.getTranslationY();
                float f11 = ((zh.m0) this.c).W;
                if (translationY3 != f11) {
                    wVar.setTranslationY(f11);
                    wVar.invalidate();
                    break;
                }
                break;
        }
    }
}
