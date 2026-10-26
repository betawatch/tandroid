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
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.ua0;
import org.telegram.ui.Components.vs0;
import org.telegram.ui.Components.wh0;
import org.telegram.ui.cy;
import org.telegram.ui.ee;
import org.telegram.ui.jh0;
import org.telegram.ui.js;
import org.telegram.ui.un;
import org.telegram.ui.vq0;
import org.telegram.ui.yu;
import org.telegram.ui.zu;
import zh.h2;
import zh.m2;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                zu zuVar = (zu) this.c;
                yu[] yuVarArr = zuVar.f;
                ((s4.u0) this.b).a(recyclerView, i10);
                if (i10 != 1) {
                    kVar = ((r2) zuVar).actionBar;
                    int i11 = (int) (-kVar.getTranslationY());
                    int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i11 != 0 && i11 != currentActionBarHeight) {
                        if (i11 >= currentActionBarHeight / 2) {
                            int i12 = currentActionBarHeight - i11;
                            yuVarArr[0].d.w0(0, i12, null);
                            bi.r1 r1Var = yuVarArr[0].e;
                            if (r1Var != null) {
                                r1Var.w0(0, i12, null);
                                break;
                            }
                        } else {
                            int i13 = -i11;
                            yuVarArr[0].d.w0(0, i13, null);
                            bi.r1 r1Var2 = yuVarArr[0].e;
                            if (r1Var2 != null) {
                                r1Var2.w0(0, i13, null);
                                break;
                            }
                        }
                    }
                }
                break;
            case 8:
                vq0 vq0Var = (vq0) this.c;
                q5[] q5VarArr = vq0Var.n;
                ((s4.u0) this.b).a(recyclerView, i10);
                if (i10 != 1) {
                    kVar2 = ((r2) vq0Var).actionBar;
                    int i14 = (int) (-kVar2.getTranslationY());
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i14 != 0 && i14 != currentActionBarHeight2) {
                        if (i14 >= currentActionBarHeight2 / 2) {
                            ((mm0) q5VarArr[0].f).w0(0, currentActionBarHeight2 - i14, null);
                            break;
                        } else {
                            ((mm0) q5VarArr[0].f).w0(0, -i14, null);
                            break;
                        }
                    }
                }
                break;
            case 9:
                ((s4.u0) this.b).a(recyclerView, i10);
                ((ua0) this.c).D.getClass();
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
                r71 r71Var = ((ee) this.c).a;
                if (r71Var.canScrollVertically(1)) {
                    for (int i14 = 0; i14 < r71Var.getChildCount(); i14++) {
                        if (!(r71Var.getChildAt(i14) instanceof c10)) {
                        }
                    }
                    break;
                }
                ((ag.r0) this.b).run();
                break;
            case 3:
                un unVar = (un) this.c;
                if (recyclerView.getScrollState() == 1) {
                    AndroidUtilities.hideKeyboard(unVar.j1);
                }
                int N0 = ((s4.c0) this.b).N0();
                if ((N0 == -1 ? 0 : N0) > 0 && N0 > unVar.Y3.h - 5) {
                    if (unVar.d4 != 7) {
                        unVar.getMediaDataController().loadMoreSearchMessages(true);
                        break;
                    } else if (!unVar.S6 && !unVar.O6[0]) {
                        unVar.S6 = true;
                        unVar.t6.add(Integer.valueOf(unVar.h6));
                        i12 = ((r2) unVar).currentAccount;
                        HashtagSearchController hashtagSearchController = HashtagSearchController.getInstance(i12);
                        String str = unVar.G3;
                        i13 = ((r2) unVar).classGuid;
                        int i15 = unVar.a4;
                        int i16 = unVar.h6;
                        unVar.h6 = i16 + 1;
                        hashtagSearchController.searchHashtag(str, i13, i15, i16);
                        break;
                    }
                }
                break;
            case 4:
                cy cyVar = (cy) this.b;
                wh0 wh0Var = (wh0) this.c;
                r71 r71Var2 = wh0Var.c;
                if (!(TextUtils.isEmpty(wh0Var.w) ? wh0Var.e : wh0Var.n).isEmpty()) {
                    if (r71Var2.canScrollVertically(1)) {
                        for (int i17 = 0; i17 < r71Var2.getChildCount(); i17++) {
                            if (!(r71Var2.getChildAt(i17) instanceof c10)) {
                            }
                        }
                    }
                    wh0Var.a(false);
                }
                if (r71Var2.I1 && !wh0Var.Q && cyVar.getParentActivity() != null) {
                    AndroidUtilities.hideKeyboard(cyVar.getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 5:
                if (((js) this.c).W.I1) {
                    AndroidUtilities.hideKeyboard((FrameLayout) this.b);
                    break;
                }
                break;
            case 6:
                ((s4.u0) this.b).b(recyclerView, i10, i11);
                zu zuVar = (zu) this.c;
                yu yuVar = zuVar.f[0];
                if (recyclerView == yuVar.d || recyclerView == yuVar.e) {
                    kVar = ((r2) zuVar).actionBar;
                    float translationY2 = kVar.getTranslationY();
                    float f10 = translationY2 - i11;
                    if (f10 < (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) {
                        f10 = -org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    } else if (f10 > 0.0f) {
                        f10 = 0.0f;
                    }
                    if (f10 != translationY2) {
                        zu.k0(zuVar, f10);
                        break;
                    }
                }
                break;
            case 7:
                jh0 jh0Var = (jh0) this.c;
                if (jh0Var.b0 && !jh0Var.W) {
                    if (jh0Var.X - ((ig.a0) this.b).N0() < 10) {
                        jh0Var.f0(true);
                        break;
                    }
                }
                break;
            case 8:
                ((s4.u0) this.b).b(recyclerView, i10, i11);
                vq0 vq0Var = (vq0) this.c;
                if (recyclerView == ((mm0) vq0Var.n[0].f)) {
                    kVar2 = ((r2) vq0Var).actionBar;
                    float translationY3 = kVar2.getTranslationY();
                    float f11 = translationY3 - i11;
                    if (f11 < (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) {
                        f11 = -org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    } else if (f11 > 0.0f) {
                        f11 = 0.0f;
                    }
                    if (f11 != translationY3) {
                        vq0.h0(vq0Var, f11);
                        break;
                    }
                }
                break;
            case 9:
                ((s4.u0) this.b).b(recyclerView, i10, i11);
                ((ua0) this.c).D.b(recyclerView, i10, i11);
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
                ((vs0) this.b).p();
                break;
        }
    }
}
