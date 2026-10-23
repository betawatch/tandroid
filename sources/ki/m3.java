package ki;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.HashtagSearchController;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.ks0;
import org.telegram.ui.Components.uh0;
import org.telegram.ui.Components.xa0;
import org.telegram.ui.av;
import org.telegram.ui.ce;
import org.telegram.ui.cy;
import org.telegram.ui.fs;
import org.telegram.ui.ih0;
import org.telegram.ui.mq0;
import org.telegram.ui.oq0;
import org.telegram.ui.qn;
import org.telegram.ui.zu;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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
                av avVar = (av) this.c;
                zu[] zuVarArr = avVar.f;
                ((s4.r0) this.b).a(recyclerView, i10);
                if (i10 != 1) {
                    kVar = ((org.telegram.ui.ActionBar.n2) avVar).actionBar;
                    int i11 = (int) (-kVar.getTranslationY());
                    int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i11 != 0 && i11 != currentActionBarHeight) {
                        if (i11 >= currentActionBarHeight / 2) {
                            int i12 = currentActionBarHeight - i11;
                            zuVarArr[0].d.v0(0, i12, null);
                            ai.u1 u1Var = zuVarArr[0].e;
                            if (u1Var != null) {
                                u1Var.v0(0, i12, null);
                                break;
                            }
                        } else {
                            int i13 = -i11;
                            zuVarArr[0].d.v0(0, i13, null);
                            ai.u1 u1Var2 = zuVarArr[0].e;
                            if (u1Var2 != null) {
                                u1Var2.v0(0, i13, null);
                                break;
                            }
                        }
                    }
                }
                break;
            case 7:
                oq0 oq0Var = (oq0) this.c;
                mq0[] mq0VarArr = oq0Var.n;
                ((s4.r0) this.b).a(recyclerView, i10);
                if (i10 != 1) {
                    kVar2 = ((org.telegram.ui.ActionBar.n2) oq0Var).actionBar;
                    int i14 = (int) (-kVar2.getTranslationY());
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i14 != 0 && i14 != currentActionBarHeight2) {
                        if (i14 >= currentActionBarHeight2 / 2) {
                            mq0VarArr[0].d.v0(0, currentActionBarHeight2 - i14, null);
                            break;
                        } else {
                            mq0VarArr[0].d.v0(0, -i14, null);
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
                ((u3) this.b).A(i11);
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
                c71 c71Var = ((ce) this.c).a;
                if (c71Var.canScrollVertically(1)) {
                    for (int i14 = 0; i14 < c71Var.getChildCount(); i14++) {
                        if (!(c71Var.getChildAt(i14) instanceof b10)) {
                        }
                    }
                    break;
                }
                ((ah.g) this.b).run();
                break;
            case 2:
                qn qnVar = (qn) this.c;
                qn qnVar2 = qnVar.da;
                if (qnVar2 == null) {
                    qnVar2 = qnVar;
                }
                if (i11 != 0) {
                    qnVar.v9(1);
                }
                if (Build.VERSION.SDK_INT >= 31 && (fVar = qnVar2.F) != null) {
                    fVar.f(i10, i11);
                }
                if (recyclerView.getScrollState() == 1) {
                    AndroidUtilities.hideKeyboard(qnVar.X0);
                }
                int N0 = ((s4.b0) this.b).N0();
                if ((N0 == -1 ? 0 : N0) > 0 && N0 > qnVar.M3.h - 5) {
                    if (qnVar.R3 != 7) {
                        qnVar.getMediaDataController().loadMoreSearchMessages(true);
                        break;
                    } else if (!qnVar.G6 && !qnVar.C6[0]) {
                        qnVar.G6 = true;
                        qnVar.h6.add(Integer.valueOf(qnVar.V5));
                        i12 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
                        HashtagSearchController hashtagSearchController = HashtagSearchController.getInstance(i12);
                        String str = qnVar.u3;
                        i13 = ((org.telegram.ui.ActionBar.n2) qnVar).classGuid;
                        int i15 = qnVar.O3;
                        int i16 = qnVar.V5;
                        qnVar.V5 = i16 + 1;
                        hashtagSearchController.searchHashtag(str, i13, i15, i16);
                        break;
                    }
                }
                break;
            case 3:
                cy cyVar = (cy) this.b;
                uh0 uh0Var = (uh0) this.c;
                c71 c71Var2 = uh0Var.c;
                if (!(TextUtils.isEmpty(uh0Var.w) ? uh0Var.e : uh0Var.n).isEmpty()) {
                    if (c71Var2.canScrollVertically(1)) {
                        for (int i17 = 0; i17 < c71Var2.getChildCount(); i17++) {
                            if (!(c71Var2.getChildAt(i17) instanceof b10)) {
                            }
                        }
                    }
                    uh0Var.a(false);
                }
                if (c71Var2.I1 && !uh0Var.Q && cyVar.getParentActivity() != null) {
                    AndroidUtilities.hideKeyboard(cyVar.getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 4:
                if (((fs) this.c).W.I1) {
                    AndroidUtilities.hideKeyboard((FrameLayout) this.b);
                    break;
                }
                break;
            case 5:
                ((s4.r0) this.b).b(recyclerView, i10, i11);
                av avVar = (av) this.c;
                zu zuVar = avVar.f[0];
                if (recyclerView == zuVar.d || recyclerView == zuVar.e) {
                    kVar = ((org.telegram.ui.ActionBar.n2) avVar).actionBar;
                    float translationY = kVar.getTranslationY();
                    float f7 = translationY - i11;
                    if (f7 < (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) {
                        f7 = -org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    } else if (f7 > 0.0f) {
                        f7 = 0.0f;
                    }
                    if (f7 != translationY) {
                        av.j0(avVar, f7);
                        break;
                    }
                }
                break;
            case 6:
                ih0 ih0Var = (ih0) this.c;
                if (ih0Var.b0 && !ih0Var.W) {
                    if (ih0Var.X - ((hg.a0) this.b).N0() < 10) {
                        ih0Var.d0(true);
                        break;
                    }
                }
                break;
            case 7:
                ((s4.r0) this.b).b(recyclerView, i10, i11);
                oq0 oq0Var = (oq0) this.c;
                if (recyclerView == oq0Var.n[0].d) {
                    kVar2 = ((org.telegram.ui.ActionBar.n2) oq0Var).actionBar;
                    float translationY2 = kVar2.getTranslationY();
                    float f10 = translationY2 - i11;
                    if (f10 < (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) {
                        f10 = -org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    } else if (f10 > 0.0f) {
                        f10 = 0.0f;
                    }
                    if (f10 != translationY2) {
                        oq0.g0(oq0Var, f10);
                        break;
                    }
                }
                break;
            case 8:
                ((s4.r0) this.b).b(recyclerView, i10, i11);
                ((xa0) this.c).D.b(recyclerView, i10, i11);
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
                ((ks0) this.b).o();
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
