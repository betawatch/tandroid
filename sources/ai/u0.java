package ai;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import li.t3;
import li.v3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.HashtagSearchController;
import org.telegram.ui.ActionBar.q5;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.Components.c10;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.va0;
import org.telegram.ui.Components.ws0;
import org.telegram.ui.Components.xh0;
import org.telegram.ui.av;
import org.telegram.ui.bv;
import org.telegram.ui.ee;
import org.telegram.ui.ey;
import org.telegram.ui.lh0;
import org.telegram.ui.ls;
import org.telegram.ui.wn;
import org.telegram.ui.xq0;
import zh.h2;
import zh.m2;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class u0 extends s4.u0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    @Override // s4.u0
    public void a(RecyclerView recyclerView, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.a) {
            case 1:
                if (i10 == 0) {
                    ((v3) this.c).v3.V();
                    break;
                }
                break;
            case 6:
                bv bvVar = (bv) this.c;
                av[] avVarArr = bvVar.f;
                ((s4.u0) this.b).a(recyclerView, i10);
                if (i10 != 1) {
                    kVar = ((r2) bvVar).actionBar;
                    int i11 = (int) (-kVar.getTranslationY());
                    int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i11 != 0 && i11 != currentActionBarHeight) {
                        if (i11 >= currentActionBarHeight / 2) {
                            int i12 = currentActionBarHeight - i11;
                            avVarArr[0].d.w0(0, i12, null);
                            bi.r1 r1Var = avVarArr[0].e;
                            if (r1Var != null) {
                                r1Var.w0(0, i12, null);
                                break;
                            }
                        } else {
                            int i13 = -i11;
                            avVarArr[0].d.w0(0, i13, null);
                            bi.r1 r1Var2 = avVarArr[0].e;
                            if (r1Var2 != null) {
                                r1Var2.w0(0, i13, null);
                                break;
                            }
                        }
                    }
                }
                break;
            case 8:
                xq0 xq0Var = (xq0) this.c;
                q5[] q5VarArr = xq0Var.n;
                ((s4.u0) this.b).a(recyclerView, i10);
                if (i10 != 1) {
                    kVar2 = ((r2) xq0Var).actionBar;
                    int i14 = (int) (-kVar2.getTranslationY());
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i14 != 0 && i14 != currentActionBarHeight2) {
                        if (i14 >= currentActionBarHeight2 / 2) {
                            ((nm0) q5VarArr[0].f).w0(0, currentActionBarHeight2 - i14, null);
                            break;
                        } else {
                            ((nm0) q5VarArr[0].f).w0(0, -i14, null);
                            break;
                        }
                    }
                }
                break;
            case 9:
                ((s4.u0) this.b).a(recyclerView, i10);
                ((va0) this.c).D.getClass();
                break;
        }
    }

    @Override // s4.u0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        View F;
        int i12;
        int i13;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.a) {
            case 0:
                x xVar = (x) this.b;
                float translationY = xVar.getTranslationY();
                float f7 = ((z0) this.c).d0;
                if (translationY != f7) {
                    xVar.setTranslationY(f7);
                    xVar.invalidate();
                    break;
                }
                break;
            case 1:
                v3 v3Var = (v3) this.c;
                ((t3) this.b).A(i11);
                v3Var.v3.G();
                li.g1 g1Var = v3Var.T3;
                if (g1Var != null && (F = v3Var.F(g1Var)) != null) {
                    if (F.getBottom() <= 0 || F.getTop() >= v3Var.getHeight()) {
                        v3Var.T3 = null;
                        g1Var.clearFocus();
                        AndroidUtilities.hideKeyboard(v3Var);
                        break;
                    }
                }
                break;
            case 2:
                s71 s71Var = ((ee) this.c).a;
                if (s71Var.canScrollVertically(1)) {
                    for (int i14 = 0; i14 < s71Var.getChildCount(); i14++) {
                        if (!(s71Var.getChildAt(i14) instanceof c10)) {
                        }
                    }
                    break;
                }
                ((ag.r0) this.b).run();
                break;
            case 3:
                wn wnVar = (wn) this.c;
                if (recyclerView.getScrollState() == 1) {
                    AndroidUtilities.hideKeyboard(wnVar.j1);
                }
                int N0 = ((s4.c0) this.b).N0();
                if ((N0 == -1 ? 0 : N0) > 0 && N0 > wnVar.Y3.h - 5) {
                    if (wnVar.d4 != 7) {
                        wnVar.getMediaDataController().loadMoreSearchMessages(true);
                        break;
                    } else if (!wnVar.W6 && !wnVar.S6[0]) {
                        wnVar.W6 = true;
                        wnVar.x6.add(Integer.valueOf(wnVar.l6));
                        i12 = ((r2) wnVar).currentAccount;
                        HashtagSearchController hashtagSearchController = HashtagSearchController.getInstance(i12);
                        String str = wnVar.G3;
                        i13 = ((r2) wnVar).classGuid;
                        int i15 = wnVar.a4;
                        int i16 = wnVar.l6;
                        wnVar.l6 = i16 + 1;
                        hashtagSearchController.searchHashtag(str, i13, i15, i16);
                        break;
                    }
                }
                break;
            case 4:
                ey eyVar = (ey) this.b;
                xh0 xh0Var = (xh0) this.c;
                s71 s71Var2 = xh0Var.c;
                if (!(TextUtils.isEmpty(xh0Var.w) ? xh0Var.e : xh0Var.n).isEmpty()) {
                    if (s71Var2.canScrollVertically(1)) {
                        for (int i17 = 0; i17 < s71Var2.getChildCount(); i17++) {
                            if (!(s71Var2.getChildAt(i17) instanceof c10)) {
                            }
                        }
                    }
                    xh0Var.a(false);
                }
                if (s71Var2.I1 && !xh0Var.Q && eyVar.getParentActivity() != null) {
                    AndroidUtilities.hideKeyboard(eyVar.getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 5:
                if (((ls) this.c).W.I1) {
                    AndroidUtilities.hideKeyboard((FrameLayout) this.b);
                    break;
                }
                break;
            case 6:
                ((s4.u0) this.b).b(recyclerView, i10, i11);
                bv bvVar = (bv) this.c;
                av avVar = bvVar.f[0];
                if (recyclerView == avVar.d || recyclerView == avVar.e) {
                    kVar = ((r2) bvVar).actionBar;
                    float translationY2 = kVar.getTranslationY();
                    float f10 = translationY2 - i11;
                    if (f10 < (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) {
                        f10 = -org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    } else if (f10 > 0.0f) {
                        f10 = 0.0f;
                    }
                    if (f10 != translationY2) {
                        bv.k0(bvVar, f10);
                        break;
                    }
                }
                break;
            case 7:
                lh0 lh0Var = (lh0) this.c;
                if (lh0Var.b0 && !lh0Var.W) {
                    if (lh0Var.X - ((ig.a0) this.b).N0() < 10) {
                        lh0Var.f0(true);
                        break;
                    }
                }
                break;
            case 8:
                ((s4.u0) this.b).b(recyclerView, i10, i11);
                xq0 xq0Var = (xq0) this.c;
                if (recyclerView == ((nm0) xq0Var.n[0].f)) {
                    kVar2 = ((r2) xq0Var).actionBar;
                    float translationY3 = kVar2.getTranslationY();
                    float f11 = translationY3 - i11;
                    if (f11 < (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) {
                        f11 = -org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    } else if (f11 > 0.0f) {
                        f11 = 0.0f;
                    }
                    if (f11 != translationY3) {
                        xq0.h0(xq0Var, f11);
                        break;
                    }
                }
                break;
            case 9:
                ((s4.u0) this.b).b(recyclerView, i10, i11);
                ((va0) this.c).D.b(recyclerView, i10, i11);
                break;
            default:
                m2 m2Var = (m2) this.c;
                h2 h2Var = m2Var.f;
                if (m2Var.isAttachedToWindow()) {
                    if (h2Var.canScrollVertically(1)) {
                        for (int i18 = 0; i18 < h2Var.getChildCount(); i18++) {
                            if (!(h2Var.getChildAt(i18) instanceof c10)) {
                            }
                        }
                    }
                    m2Var.e.b();
                }
                ((ws0) this.b).p();
                break;
        }
    }
}
