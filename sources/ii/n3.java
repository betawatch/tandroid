package ii;

import ai.o8;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.HashtagSearchController;
import org.telegram.ui.Components.jh0;
import org.telegram.ui.Components.oa0;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.u00;
import org.telegram.ui.Components.zr0;
import org.telegram.ui.de;
import org.telegram.ui.iv;
import org.telegram.ui.jv;
import org.telegram.ui.ms;
import org.telegram.ui.qy;
import org.telegram.ui.sh0;
import org.telegram.ui.wn;
import org.telegram.ui.wq0;
import org.telegram.ui.yq0;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final class n3 extends s4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n3(int i10, Object obj, Object obj2) {
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
                    ((x3) this.c).n3.W();
                    break;
                }
                break;
            case 5:
                jv jvVar = (jv) this.c;
                iv[] ivVarArr = jvVar.f;
                ((s4.s0) this.b).a(recyclerView, i10);
                if (i10 != 1) {
                    kVar = ((org.telegram.ui.ActionBar.m2) jvVar).actionBar;
                    int i11 = (int) (-kVar.getTranslationY());
                    int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i11 != 0 && i11 != currentActionBarHeight) {
                        if (i11 >= currentActionBarHeight / 2) {
                            int i12 = currentActionBarHeight - i11;
                            ivVarArr[0].d.v0(0, i12, null);
                            ai.w0 w0Var = ivVarArr[0].e;
                            if (w0Var != null) {
                                w0Var.v0(0, i12, null);
                                break;
                            }
                        } else {
                            int i13 = -i11;
                            ivVarArr[0].d.v0(0, i13, null);
                            ai.w0 w0Var2 = ivVarArr[0].e;
                            if (w0Var2 != null) {
                                w0Var2.v0(0, i13, null);
                                break;
                            }
                        }
                    }
                }
                break;
            case 7:
                yq0 yq0Var = (yq0) this.c;
                wq0[] wq0VarArr = yq0Var.n;
                ((s4.s0) this.b).a(recyclerView, i10);
                if (i10 != 1) {
                    kVar2 = ((org.telegram.ui.ActionBar.m2) yq0Var).actionBar;
                    int i14 = (int) (-kVar2.getTranslationY());
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i14 != 0 && i14 != currentActionBarHeight2) {
                        if (i14 >= currentActionBarHeight2 / 2) {
                            wq0VarArr[0].d.v0(0, currentActionBarHeight2 - i14, null);
                            break;
                        } else {
                            wq0VarArr[0].d.v0(0, -i14, null);
                            break;
                        }
                    }
                }
                break;
            case 8:
                ((s4.s0) this.b).a(recyclerView, i10);
                ((oa0) this.c).D.getClass();
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
                x3 x3Var = (x3) this.c;
                ((v3) this.b).u(i11);
                x3Var.n3.H();
                i1 i1Var = x3Var.L3;
                if (i1Var != null && (F = x3Var.F(i1Var)) != null) {
                    if (F.getBottom() <= 0 || F.getTop() >= x3Var.getHeight()) {
                        x3Var.L3 = null;
                        i1Var.clearFocus();
                        AndroidUtilities.hideKeyboard(x3Var);
                        break;
                    }
                }
                break;
            case 1:
                r61 r61Var = ((de) this.c).a;
                if (r61Var.canScrollVertically(1)) {
                    for (int i14 = 0; i14 < r61Var.getChildCount(); i14++) {
                        if (!(r61Var.getChildAt(i14) instanceof u00)) {
                        }
                    }
                    break;
                }
                ((o8) this.b).run();
                break;
            case 2:
                wn wnVar = (wn) this.c;
                wn wnVar2 = wnVar.da;
                if (wnVar2 == null) {
                    wnVar2 = wnVar;
                }
                if (i11 != 0) {
                    wnVar.q9(1);
                }
                if (Build.VERSION.SDK_INT >= 31 && (hVar = wnVar2.F) != null) {
                    hVar.f(i10, i11);
                }
                if (recyclerView.getScrollState() == 1) {
                    AndroidUtilities.hideKeyboard(wnVar.X0);
                }
                int N0 = ((s4.c0) this.b).N0();
                if ((N0 == -1 ? 0 : N0) > 0 && N0 > wnVar.M3.h - 5) {
                    if (wnVar.R3 != 7) {
                        wnVar.getMediaDataController().loadMoreSearchMessages(true);
                        break;
                    } else if (!wnVar.G6 && !wnVar.C6[0]) {
                        wnVar.G6 = true;
                        wnVar.h6.add(Integer.valueOf(wnVar.V5));
                        i12 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
                        HashtagSearchController hashtagSearchController = HashtagSearchController.getInstance(i12);
                        String str = wnVar.u3;
                        i13 = ((org.telegram.ui.ActionBar.m2) wnVar).classGuid;
                        int i15 = wnVar.O3;
                        int i16 = wnVar.V5;
                        wnVar.V5 = i16 + 1;
                        hashtagSearchController.searchHashtag(str, i13, i15, i16);
                        break;
                    }
                }
                break;
            case 3:
                qy qyVar = (qy) this.b;
                jh0 jh0Var = (jh0) this.c;
                r61 r61Var2 = jh0Var.c;
                if (!(TextUtils.isEmpty(jh0Var.w) ? jh0Var.e : jh0Var.n).isEmpty()) {
                    if (r61Var2.canScrollVertically(1)) {
                        for (int i17 = 0; i17 < r61Var2.getChildCount(); i17++) {
                            if (!(r61Var2.getChildAt(i17) instanceof u00)) {
                            }
                        }
                    }
                    jh0Var.a(false);
                }
                if (r61Var2.K1 && !jh0Var.Q && qyVar.getParentActivity() != null) {
                    AndroidUtilities.hideKeyboard(qyVar.getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 4:
                if (((ms) this.c).W.K1) {
                    AndroidUtilities.hideKeyboard((FrameLayout) this.b);
                    break;
                }
                break;
            case 5:
                ((s4.s0) this.b).b(recyclerView, i10, i11);
                jv jvVar = (jv) this.c;
                iv ivVar = jvVar.f[0];
                if (recyclerView == ivVar.d || recyclerView == ivVar.e) {
                    kVar = ((org.telegram.ui.ActionBar.m2) jvVar).actionBar;
                    float translationY = kVar.getTranslationY();
                    float f7 = translationY - i11;
                    if (f7 < (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) {
                        f7 = -org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    } else if (f7 > 0.0f) {
                        f7 = 0.0f;
                    }
                    if (f7 != translationY) {
                        jv.j0(jvVar, f7);
                        break;
                    }
                }
                break;
            case 6:
                sh0 sh0Var = (sh0) this.c;
                if (sh0Var.b0 && !sh0Var.W) {
                    if (sh0Var.X - ((gg.b0) this.b).N0() < 10) {
                        sh0Var.d0(true);
                        break;
                    }
                }
                break;
            case 7:
                ((s4.s0) this.b).b(recyclerView, i10, i11);
                yq0 yq0Var = (yq0) this.c;
                if (recyclerView == yq0Var.n[0].d) {
                    kVar2 = ((org.telegram.ui.ActionBar.m2) yq0Var).actionBar;
                    float translationY2 = kVar2.getTranslationY();
                    float f10 = translationY2 - i11;
                    if (f10 < (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) {
                        f10 = -org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    } else if (f10 > 0.0f) {
                        f10 = 0.0f;
                    }
                    if (f10 != translationY2) {
                        yq0.g0(yq0Var, f10);
                        break;
                    }
                }
                break;
            case 8:
                ((s4.s0) this.b).b(recyclerView, i10, i11);
                ((oa0) this.c).D.b(recyclerView, i10, i11);
                break;
            default:
                xh.o2 o2Var = (xh.o2) this.c;
                xh.j2 j2Var = o2Var.f;
                if (o2Var.isAttachedToWindow()) {
                    if (j2Var.canScrollVertically(1)) {
                        for (int i18 = 0; i18 < j2Var.getChildCount(); i18++) {
                            if (!(j2Var.getChildAt(i18) instanceof u00)) {
                            }
                        }
                    }
                    o2Var.e.a();
                }
                ((zr0) this.b).o();
                break;
        }
    }
}
