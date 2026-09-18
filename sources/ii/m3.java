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
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.or0;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.ai0;
import org.telegram.ui.bo;
import org.telegram.ui.fe;
import org.telegram.ui.gr0;
import org.telegram.ui.ir0;
import org.telegram.ui.ov;
import org.telegram.ui.pv;
import org.telegram.ui.us;
import org.telegram.ui.wy;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
                pv pvVar = (pv) this.c;
                ov[] ovVarArr = pvVar.f;
                ((s4.s0) this.b).a(recyclerView, i10);
                if (i10 != 1) {
                    kVar = ((org.telegram.ui.ActionBar.o2) pvVar).actionBar;
                    int i11 = (int) (-kVar.getTranslationY());
                    int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i11 != 0 && i11 != currentActionBarHeight) {
                        if (i11 >= currentActionBarHeight / 2) {
                            int i12 = currentActionBarHeight - i11;
                            ovVarArr[0].d.w0(0, i12, null);
                            ai.w0 w0Var = ovVarArr[0].e;
                            if (w0Var != null) {
                                w0Var.w0(0, i12, null);
                                break;
                            }
                        } else {
                            int i13 = -i11;
                            ovVarArr[0].d.w0(0, i13, null);
                            ai.w0 w0Var2 = ovVarArr[0].e;
                            if (w0Var2 != null) {
                                w0Var2.w0(0, i13, null);
                                break;
                            }
                        }
                    }
                }
                break;
            case 7:
                ir0 ir0Var = (ir0) this.c;
                gr0[] gr0VarArr = ir0Var.n;
                ((s4.s0) this.b).a(recyclerView, i10);
                if (i10 != 1) {
                    kVar2 = ((org.telegram.ui.ActionBar.o2) ir0Var).actionBar;
                    int i14 = (int) (-kVar2.getTranslationY());
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i14 != 0 && i14 != currentActionBarHeight2) {
                        if (i14 >= currentActionBarHeight2 / 2) {
                            gr0VarArr[0].d.w0(0, currentActionBarHeight2 - i14, null);
                            break;
                        } else {
                            gr0VarArr[0].d.w0(0, -i14, null);
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
        View G;
        int i12;
        int i13;
        ah.i iVar;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.a) {
            case 0:
                w3 w3Var = (w3) this.c;
                ((u3) this.b).u(i11);
                w3Var.n3.H();
                i1 i1Var = w3Var.L3;
                if (i1Var != null && (G = w3Var.G(i1Var)) != null) {
                    if (G.getBottom() <= 0 || G.getTop() >= w3Var.getHeight()) {
                        w3Var.L3 = null;
                        i1Var.clearFocus();
                        AndroidUtilities.hideKeyboard(w3Var);
                        break;
                    }
                }
                break;
            case 1:
                f61 f61Var = ((fe) this.c).a;
                if (f61Var.canScrollVertically(1)) {
                    for (int i14 = 0; i14 < f61Var.getChildCount(); i14++) {
                        if (!(f61Var.getChildAt(i14) instanceof t00)) {
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
                if (Build.VERSION.SDK_INT >= 31 && (iVar = boVar2.F) != null) {
                    iVar.f(i10, i11);
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
                        i12 = ((org.telegram.ui.ActionBar.o2) boVar).currentAccount;
                        HashtagSearchController hashtagSearchController = HashtagSearchController.getInstance(i12);
                        String str = boVar.u3;
                        i13 = ((org.telegram.ui.ActionBar.o2) boVar).classGuid;
                        int i15 = boVar.O3;
                        int i16 = boVar.V5;
                        boVar.V5 = i16 + 1;
                        hashtagSearchController.searchHashtag(str, i13, i15, i16);
                        break;
                    }
                }
                break;
            case 3:
                wy wyVar = (wy) this.b;
                zg0 zg0Var = (zg0) this.c;
                f61 f61Var2 = zg0Var.c;
                if (!(TextUtils.isEmpty(zg0Var.w) ? zg0Var.e : zg0Var.n).isEmpty()) {
                    if (f61Var2.canScrollVertically(1)) {
                        for (int i17 = 0; i17 < f61Var2.getChildCount(); i17++) {
                            if (!(f61Var2.getChildAt(i17) instanceof t00)) {
                            }
                        }
                    }
                    zg0Var.a(false);
                }
                if (f61Var2.K1 && !zg0Var.Q && wyVar.getParentActivity() != null) {
                    AndroidUtilities.hideKeyboard(wyVar.getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 4:
                if (((us) this.c).W.K1) {
                    AndroidUtilities.hideKeyboard((FrameLayout) this.b);
                    break;
                }
                break;
            case 5:
                ((s4.s0) this.b).b(recyclerView, i10, i11);
                pv pvVar = (pv) this.c;
                ov ovVar = pvVar.f[0];
                if (recyclerView == ovVar.d || recyclerView == ovVar.e) {
                    kVar = ((org.telegram.ui.ActionBar.o2) pvVar).actionBar;
                    float translationY = kVar.getTranslationY();
                    float f7 = translationY - i11;
                    if (f7 < (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) {
                        f7 = -org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    } else if (f7 > 0.0f) {
                        f7 = 0.0f;
                    }
                    if (f7 != translationY) {
                        pv.j0(pvVar, f7);
                        break;
                    }
                }
                break;
            case 6:
                ai0 ai0Var = (ai0) this.c;
                if (ai0Var.b0 && !ai0Var.W) {
                    if (ai0Var.X - ((gg.b0) this.b).N0() < 10) {
                        ai0Var.d0(true);
                        break;
                    }
                }
                break;
            case 7:
                ((s4.s0) this.b).b(recyclerView, i10, i11);
                ir0 ir0Var = (ir0) this.c;
                if (recyclerView == ir0Var.n[0].d) {
                    kVar2 = ((org.telegram.ui.ActionBar.o2) ir0Var).actionBar;
                    float translationY2 = kVar2.getTranslationY();
                    float f10 = translationY2 - i11;
                    if (f10 < (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) {
                        f10 = -org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    } else if (f10 > 0.0f) {
                        f10 = 0.0f;
                    }
                    if (f10 != translationY2) {
                        ir0.g0(ir0Var, f10);
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
                ((or0) this.b).o();
                break;
        }
    }
}
