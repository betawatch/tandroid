package ii;

import ai.n8;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.HashtagSearchController;
import org.telegram.ui.Components.jh0;
import org.telegram.ui.Components.la0;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.zr0;
import org.telegram.ui.ee;
import org.telegram.ui.fr0;
import org.telegram.ui.hr0;
import org.telegram.ui.nv;
import org.telegram.ui.ov;
import org.telegram.ui.ss;
import org.telegram.ui.uy;
import org.telegram.ui.zh0;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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
                ov ovVar = (ov) this.c;
                nv[] nvVarArr = ovVar.f;
                ((s4.s0) this.b).a(recyclerView, i10);
                if (i10 != 1) {
                    kVar = ((org.telegram.ui.ActionBar.n2) ovVar).actionBar;
                    int i11 = (int) (-kVar.getTranslationY());
                    int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i11 != 0 && i11 != currentActionBarHeight) {
                        if (i11 >= currentActionBarHeight / 2) {
                            int i12 = currentActionBarHeight - i11;
                            nvVarArr[0].d.w0(0, i12, null);
                            ai.w0 w0Var = nvVarArr[0].e;
                            if (w0Var != null) {
                                w0Var.w0(0, i12, null);
                                break;
                            }
                        } else {
                            int i13 = -i11;
                            nvVarArr[0].d.w0(0, i13, null);
                            ai.w0 w0Var2 = nvVarArr[0].e;
                            if (w0Var2 != null) {
                                w0Var2.w0(0, i13, null);
                                break;
                            }
                        }
                    }
                }
                break;
            case 7:
                hr0 hr0Var = (hr0) this.c;
                fr0[] fr0VarArr = hr0Var.n;
                ((s4.s0) this.b).a(recyclerView, i10);
                if (i10 != 1) {
                    kVar2 = ((org.telegram.ui.ActionBar.n2) hr0Var).actionBar;
                    int i14 = (int) (-kVar2.getTranslationY());
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i14 != 0 && i14 != currentActionBarHeight2) {
                        if (i14 >= currentActionBarHeight2 / 2) {
                            fr0VarArr[0].d.w0(0, currentActionBarHeight2 - i14, null);
                            break;
                        } else {
                            fr0VarArr[0].d.w0(0, -i14, null);
                            break;
                        }
                    }
                }
                break;
            case 8:
                ((s4.s0) this.b).a(recyclerView, i10);
                ((la0) this.c).D.getClass();
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
                t61 t61Var = ((ee) this.c).a;
                if (t61Var.canScrollVertically(1)) {
                    for (int i14 = 0; i14 < t61Var.getChildCount(); i14++) {
                        if (!(t61Var.getChildAt(i14) instanceof t00)) {
                        }
                    }
                    break;
                }
                ((n8) this.b).run();
                break;
            case 2:
                zn znVar = (zn) this.c;
                zn znVar2 = znVar.da;
                if (znVar2 == null) {
                    znVar2 = znVar;
                }
                if (i11 != 0) {
                    znVar.q9(1);
                }
                if (Build.VERSION.SDK_INT >= 31 && (iVar = znVar2.F) != null) {
                    iVar.f(i10, i11);
                }
                if (recyclerView.getScrollState() == 1) {
                    AndroidUtilities.hideKeyboard(znVar.X0);
                }
                int N0 = ((s4.c0) this.b).N0();
                if ((N0 == -1 ? 0 : N0) > 0 && N0 > znVar.M3.h - 5) {
                    if (znVar.R3 != 7) {
                        znVar.getMediaDataController().loadMoreSearchMessages(true);
                        break;
                    } else if (!znVar.G6 && !znVar.C6[0]) {
                        znVar.G6 = true;
                        znVar.h6.add(Integer.valueOf(znVar.V5));
                        i12 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
                        HashtagSearchController hashtagSearchController = HashtagSearchController.getInstance(i12);
                        String str = znVar.u3;
                        i13 = ((org.telegram.ui.ActionBar.n2) znVar).classGuid;
                        int i15 = znVar.O3;
                        int i16 = znVar.V5;
                        znVar.V5 = i16 + 1;
                        hashtagSearchController.searchHashtag(str, i13, i15, i16);
                        break;
                    }
                }
                break;
            case 3:
                uy uyVar = (uy) this.b;
                jh0 jh0Var = (jh0) this.c;
                t61 t61Var2 = jh0Var.c;
                if (!(TextUtils.isEmpty(jh0Var.w) ? jh0Var.e : jh0Var.n).isEmpty()) {
                    if (t61Var2.canScrollVertically(1)) {
                        for (int i17 = 0; i17 < t61Var2.getChildCount(); i17++) {
                            if (!(t61Var2.getChildAt(i17) instanceof t00)) {
                            }
                        }
                    }
                    jh0Var.a(false);
                }
                if (t61Var2.K1 && !jh0Var.Q && uyVar.getParentActivity() != null) {
                    AndroidUtilities.hideKeyboard(uyVar.getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 4:
                if (((ss) this.c).W.K1) {
                    AndroidUtilities.hideKeyboard((FrameLayout) this.b);
                    break;
                }
                break;
            case 5:
                ((s4.s0) this.b).b(recyclerView, i10, i11);
                ov ovVar = (ov) this.c;
                nv nvVar = ovVar.f[0];
                if (recyclerView == nvVar.d || recyclerView == nvVar.e) {
                    kVar = ((org.telegram.ui.ActionBar.n2) ovVar).actionBar;
                    float translationY = kVar.getTranslationY();
                    float f7 = translationY - i11;
                    if (f7 < (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) {
                        f7 = -org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    } else if (f7 > 0.0f) {
                        f7 = 0.0f;
                    }
                    if (f7 != translationY) {
                        ov.j0(ovVar, f7);
                        break;
                    }
                }
                break;
            case 6:
                zh0 zh0Var = (zh0) this.c;
                if (zh0Var.b0 && !zh0Var.W) {
                    if (zh0Var.X - ((gg.b0) this.b).N0() < 10) {
                        zh0Var.d0(true);
                        break;
                    }
                }
                break;
            case 7:
                ((s4.s0) this.b).b(recyclerView, i10, i11);
                hr0 hr0Var = (hr0) this.c;
                if (recyclerView == hr0Var.n[0].d) {
                    kVar2 = ((org.telegram.ui.ActionBar.n2) hr0Var).actionBar;
                    float translationY2 = kVar2.getTranslationY();
                    float f10 = translationY2 - i11;
                    if (f10 < (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) {
                        f10 = -org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    } else if (f10 > 0.0f) {
                        f10 = 0.0f;
                    }
                    if (f10 != translationY2) {
                        hr0.g0(hr0Var, f10);
                        break;
                    }
                }
                break;
            case 8:
                ((s4.s0) this.b).b(recyclerView, i10, i11);
                ((la0) this.c).D.b(recyclerView, i10, i11);
                break;
            default:
                xh.o2 o2Var = (xh.o2) this.c;
                xh.j2 j2Var = o2Var.f;
                if (o2Var.isAttachedToWindow()) {
                    if (j2Var.canScrollVertically(1)) {
                        for (int i18 = 0; i18 < j2Var.getChildCount(); i18++) {
                            if (!(j2Var.getChildAt(i18) instanceof t00)) {
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
