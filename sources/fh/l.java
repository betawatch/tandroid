package fh;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import cg.w1;
import f2.b1;
import f2.k0;
import gh.n3;
import gh.t3;
import hh.f1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.HashtagSearchController;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.h00;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.mg0;
import org.telegram.ui.Components.p90;
import org.telegram.ui.Components.wq0;
import org.telegram.ui.dq0;
import org.telegram.ui.dv;
import org.telegram.ui.ev;
import org.telegram.ui.fq0;
import org.telegram.ui.gy;
import org.telegram.ui.js;
import org.telegram.ui.kh0;
import org.telegram.ui.rn;
import org.telegram.ui.zd;
import rh.d1;
import rh.p3;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class l extends b1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    @Override // f2.b1
    public void a(RecyclerView recyclerView, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.a) {
            case 0:
                ((b1) this.b).a(recyclerView, i10);
                ((p90) this.c).D.getClass();
                break;
            case 6:
                ev evVar = (ev) this.c;
                dv[] dvVarArr = evVar.f;
                ((b1) this.b).a(recyclerView, i10);
                if (i10 != 1) {
                    kVar = ((n2) evVar).actionBar;
                    int i11 = (int) (-kVar.getTranslationY());
                    int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i11 != 0 && i11 != currentActionBarHeight) {
                        if (i11 >= currentActionBarHeight / 2) {
                            int i12 = currentActionBarHeight - i11;
                            dvVarArr[0].d.v0(0, i12, null);
                            f1 f1Var = dvVarArr[0].e;
                            if (f1Var != null) {
                                f1Var.v0(0, i12, null);
                                break;
                            }
                        } else {
                            int i13 = -i11;
                            dvVarArr[0].d.v0(0, i13, null);
                            f1 f1Var2 = dvVarArr[0].e;
                            if (f1Var2 != null) {
                                f1Var2.v0(0, i13, null);
                                break;
                            }
                        }
                    }
                }
                break;
            case 8:
                fq0 fq0Var = (fq0) this.c;
                dq0[] dq0VarArr = fq0Var.n;
                ((b1) this.b).a(recyclerView, i10);
                if (i10 != 1) {
                    kVar2 = ((n2) fq0Var).actionBar;
                    int i14 = (int) (-kVar2.getTranslationY());
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i14 != 0 && i14 != currentActionBarHeight2) {
                        if (i14 >= currentActionBarHeight2 / 2) {
                            dq0VarArr[0].d.v0(0, currentActionBarHeight2 - i14, null);
                            break;
                        } else {
                            dq0VarArr[0].d.v0(0, -i14, null);
                            break;
                        }
                    }
                }
                break;
            case 9:
                if (i10 == 0) {
                    ((p3) this.c).j3.W();
                    break;
                }
                break;
        }
    }

    @Override // f2.b1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        int i13;
        jg.e eVar;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        View F;
        switch (this.a) {
            case 0:
                ((b1) this.b).b(recyclerView, i10, i11);
                ((p90) this.c).D.b(recyclerView, i10, i11);
                break;
            case 1:
                t3 t3Var = (t3) this.c;
                n3 n3Var = t3Var.f;
                if (t3Var.isAttachedToWindow()) {
                    if (n3Var.canScrollVertically(1)) {
                        for (int i14 = 0; i14 < n3Var.getChildCount(); i14++) {
                            if (!(n3Var.getChildAt(i14) instanceof h00)) {
                            }
                        }
                    }
                    t3Var.e.a();
                }
                ((wq0) this.b).o();
                break;
            case 2:
                k51 k51Var = ((zd) this.c).a;
                if (k51Var.canScrollVertically(1)) {
                    for (int i15 = 0; i15 < k51Var.getChildCount(); i15++) {
                        if (!(k51Var.getChildAt(i15) instanceof h00)) {
                        }
                    }
                    break;
                }
                ((w1) this.b).run();
                break;
            case 3:
                rn rnVar = (rn) this.c;
                rn rnVar2 = rnVar.Z9;
                if (rnVar2 == null) {
                    rnVar2 = rnVar;
                }
                if (i11 != 0) {
                    rnVar.q9(1);
                }
                if (Build.VERSION.SDK_INT >= 31 && (eVar = rnVar2.B) != null) {
                    eVar.f(i10, i11);
                }
                if (recyclerView.getScrollState() == 1) {
                    AndroidUtilities.hideKeyboard(rnVar.T0);
                }
                int N0 = ((k0) this.b).N0();
                if ((N0 == -1 ? 0 : N0) > 0 && N0 > rnVar.I3.h - 5) {
                    if (rnVar.N3 != 7) {
                        rnVar.getMediaDataController().loadMoreSearchMessages(true);
                        break;
                    } else if (!rnVar.C6 && !rnVar.y6[0]) {
                        rnVar.C6 = true;
                        rnVar.d6.add(Integer.valueOf(rnVar.R5));
                        i12 = ((n2) rnVar).currentAccount;
                        HashtagSearchController hashtagSearchController = HashtagSearchController.getInstance(i12);
                        String str = rnVar.q3;
                        i13 = ((n2) rnVar).classGuid;
                        int i16 = rnVar.K3;
                        int i17 = rnVar.R5;
                        rnVar.R5 = i17 + 1;
                        hashtagSearchController.searchHashtag(str, i13, i16, i17);
                        break;
                    }
                }
                break;
            case 4:
                gy gyVar = (gy) this.b;
                mg0 mg0Var = (mg0) this.c;
                k51 k51Var2 = mg0Var.c;
                if (!(TextUtils.isEmpty(mg0Var.w) ? mg0Var.e : mg0Var.n).isEmpty()) {
                    if (k51Var2.canScrollVertically(1)) {
                        for (int i18 = 0; i18 < k51Var2.getChildCount(); i18++) {
                            if (!(k51Var2.getChildAt(i18) instanceof h00)) {
                            }
                        }
                    }
                    mg0Var.a(false);
                }
                if (k51Var2.G1 && !mg0Var.M && gyVar.getParentActivity() != null) {
                    AndroidUtilities.hideKeyboard(gyVar.getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 5:
                if (((js) this.c).S.G1) {
                    AndroidUtilities.hideKeyboard((FrameLayout) this.b);
                    break;
                }
                break;
            case 6:
                ((b1) this.b).b(recyclerView, i10, i11);
                ev evVar = (ev) this.c;
                dv dvVar = evVar.f[0];
                if (recyclerView == dvVar.d || recyclerView == dvVar.e) {
                    kVar = ((n2) evVar).actionBar;
                    float translationY = kVar.getTranslationY();
                    float f10 = translationY - i11;
                    if (f10 < (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) {
                        f10 = -org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    } else if (f10 > 0.0f) {
                        f10 = 0.0f;
                    }
                    if (f10 != translationY) {
                        ev.j0(evVar, f10);
                        break;
                    }
                }
                break;
            case 7:
                kh0 kh0Var = (kh0) this.c;
                if (kh0Var.X && !kh0Var.S) {
                    if (kh0Var.T - ((org.telegram.ui.j) this.b).N0() < 10) {
                        kh0Var.d0(true);
                        break;
                    }
                }
                break;
            case 8:
                ((b1) this.b).b(recyclerView, i10, i11);
                fq0 fq0Var = (fq0) this.c;
                if (recyclerView == fq0Var.n[0].d) {
                    kVar2 = ((n2) fq0Var).actionBar;
                    float translationY2 = kVar2.getTranslationY();
                    float f11 = translationY2 - i11;
                    if (f11 < (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) {
                        f11 = -org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    } else if (f11 > 0.0f) {
                        f11 = 0.0f;
                    }
                    if (f11 != translationY2) {
                        fq0.g0(fq0Var, f11);
                        break;
                    }
                }
                break;
            default:
                p3 p3Var = (p3) this.c;
                ((rh.n3) this.b).b1(i11);
                p3Var.j3.H();
                d1 d1Var = p3Var.H3;
                if (d1Var != null && (F = p3Var.F(d1Var)) != null) {
                    if (F.getBottom() <= 0 || F.getTop() >= p3Var.getHeight()) {
                        p3Var.H3 = null;
                        d1Var.clearFocus();
                        AndroidUtilities.hideKeyboard(p3Var);
                        break;
                    }
                }
                break;
        }
    }
}
