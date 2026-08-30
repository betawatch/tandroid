package jh;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import f2.i0;
import f2.z0;
import kh.h3;
import kh.n3;
import lh.e1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.HashtagSearchController;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.ea0;
import org.telegram.ui.Components.eh0;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.or0;
import org.telegram.ui.Components.t00;
import org.telegram.ui.ee;
import org.telegram.ui.iq0;
import org.telegram.ui.jv;
import org.telegram.ui.kq0;
import org.telegram.ui.kv;
import org.telegram.ui.ns;
import org.telegram.ui.oy;
import org.telegram.ui.ph0;
import org.telegram.ui.xn;
import vh.d1;
import vh.p3;
import vh.r3;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
                ((ea0) this.c).D.getClass();
                break;
            case 6:
                kv kvVar = (kv) this.c;
                jv[] jvVarArr = kvVar.f;
                ((z0) this.b).a(recyclerView, i10);
                if (i10 != 1) {
                    kVar = ((p2) kvVar).actionBar;
                    int i11 = (int) (-kVar.getTranslationY());
                    int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i11 != 0 && i11 != currentActionBarHeight) {
                        if (i11 >= currentActionBarHeight / 2) {
                            int i12 = currentActionBarHeight - i11;
                            jvVarArr[0].d.v0(0, i12, null);
                            e1 e1Var = jvVarArr[0].e;
                            if (e1Var != null) {
                                e1Var.v0(0, i12, null);
                                break;
                            }
                        } else {
                            int i13 = -i11;
                            jvVarArr[0].d.v0(0, i13, null);
                            e1 e1Var2 = jvVarArr[0].e;
                            if (e1Var2 != null) {
                                e1Var2.v0(0, i13, null);
                                break;
                            }
                        }
                    }
                }
                break;
            case 8:
                kq0 kq0Var = (kq0) this.c;
                iq0[] iq0VarArr = kq0Var.n;
                ((z0) this.b).a(recyclerView, i10);
                if (i10 != 1) {
                    kVar2 = ((p2) kq0Var).actionBar;
                    int i14 = (int) (-kVar2.getTranslationY());
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i14 != 0 && i14 != currentActionBarHeight2) {
                        if (i14 >= currentActionBarHeight2 / 2) {
                            iq0VarArr[0].d.v0(0, currentActionBarHeight2 - i14, null);
                            break;
                        } else {
                            iq0VarArr[0].d.v0(0, -i14, null);
                            break;
                        }
                    }
                }
                break;
            case 9:
                if (i10 == 0) {
                    ((r3) this.c).k3.W();
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
                ((ea0) this.c).D.b(recyclerView, i10, i11);
                break;
            case 1:
                n3 n3Var = (n3) this.c;
                h3 h3Var = n3Var.f;
                if (n3Var.isAttachedToWindow()) {
                    if (h3Var.canScrollVertically(1)) {
                        for (int i14 = 0; i14 < h3Var.getChildCount(); i14++) {
                            if (!(h3Var.getChildAt(i14) instanceof t00)) {
                            }
                        }
                    }
                    n3Var.e.a();
                }
                ((or0) this.b).o();
                break;
            case 2:
                g61 g61Var = ((ee) this.c).a;
                if (g61Var.canScrollVertically(1)) {
                    for (int i15 = 0; i15 < g61Var.getChildCount(); i15++) {
                        if (!(g61Var.getChildAt(i15) instanceof t00)) {
                        }
                    }
                    break;
                }
                ((af.b) this.b).run();
                break;
            case 3:
                xn xnVar = (xn) this.c;
                xn xnVar2 = xnVar.aa;
                if (xnVar2 == null) {
                    xnVar2 = xnVar;
                }
                if (i11 != 0) {
                    xnVar.q9(1);
                }
                if (Build.VERSION.SDK_INT >= 31 && (eVar = xnVar2.C) != null) {
                    eVar.f(i10, i11);
                }
                if (recyclerView.getScrollState() == 1) {
                    AndroidUtilities.hideKeyboard(xnVar.U0);
                }
                int N0 = ((i0) this.b).N0();
                if ((N0 == -1 ? 0 : N0) > 0 && N0 > xnVar.J3.h - 5) {
                    if (xnVar.O3 != 7) {
                        xnVar.getMediaDataController().loadMoreSearchMessages(true);
                        break;
                    } else if (!xnVar.D6 && !xnVar.z6[0]) {
                        xnVar.D6 = true;
                        xnVar.e6.add(Integer.valueOf(xnVar.S5));
                        i12 = ((p2) xnVar).currentAccount;
                        HashtagSearchController hashtagSearchController = HashtagSearchController.getInstance(i12);
                        String str = xnVar.r3;
                        i13 = ((p2) xnVar).classGuid;
                        int i16 = xnVar.L3;
                        int i17 = xnVar.S5;
                        xnVar.S5 = i17 + 1;
                        hashtagSearchController.searchHashtag(str, i13, i16, i17);
                        break;
                    }
                }
                break;
            case 4:
                oy oyVar = (oy) this.b;
                eh0 eh0Var = (eh0) this.c;
                g61 g61Var2 = eh0Var.c;
                if (!(TextUtils.isEmpty(eh0Var.w) ? eh0Var.e : eh0Var.n).isEmpty()) {
                    if (g61Var2.canScrollVertically(1)) {
                        for (int i18 = 0; i18 < g61Var2.getChildCount(); i18++) {
                            if (!(g61Var2.getChildAt(i18) instanceof t00)) {
                            }
                        }
                    }
                    eh0Var.a(false);
                }
                if (g61Var2.H1 && !eh0Var.N && oyVar.getParentActivity() != null) {
                    AndroidUtilities.hideKeyboard(oyVar.getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 5:
                if (((ns) this.c).T.H1) {
                    AndroidUtilities.hideKeyboard((FrameLayout) this.b);
                    break;
                }
                break;
            case 6:
                ((z0) this.b).b(recyclerView, i10, i11);
                kv kvVar = (kv) this.c;
                jv jvVar = kvVar.f[0];
                if (recyclerView == jvVar.d || recyclerView == jvVar.e) {
                    kVar = ((p2) kvVar).actionBar;
                    float translationY = kVar.getTranslationY();
                    float f10 = translationY - i11;
                    if (f10 < (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) {
                        f10 = -org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    } else if (f10 > 0.0f) {
                        f10 = 0.0f;
                    }
                    if (f10 != translationY) {
                        kv.j0(kvVar, f10);
                        break;
                    }
                }
                break;
            case 7:
                ph0 ph0Var = (ph0) this.c;
                if (ph0Var.Y && !ph0Var.T) {
                    if (ph0Var.U - ((org.telegram.ui.k) this.b).N0() < 10) {
                        ph0Var.d0(true);
                        break;
                    }
                }
                break;
            case 8:
                ((z0) this.b).b(recyclerView, i10, i11);
                kq0 kq0Var = (kq0) this.c;
                if (recyclerView == kq0Var.n[0].d) {
                    kVar2 = ((p2) kq0Var).actionBar;
                    float translationY2 = kVar2.getTranslationY();
                    float f11 = translationY2 - i11;
                    if (f11 < (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) {
                        f11 = -org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    } else if (f11 > 0.0f) {
                        f11 = 0.0f;
                    }
                    if (f11 != translationY2) {
                        kq0.g0(kq0Var, f11);
                        break;
                    }
                }
                break;
            default:
                r3 r3Var = (r3) this.c;
                ((p3) this.b).x(i11);
                r3Var.k3.H();
                d1 d1Var = r3Var.I3;
                if (d1Var != null && (F = r3Var.F(d1Var)) != null) {
                    if (F.getBottom() <= 0 || F.getTop() >= r3Var.getHeight()) {
                        r3Var.I3 = null;
                        d1Var.clearFocus();
                        AndroidUtilities.hideKeyboard(r3Var);
                        break;
                    }
                }
                break;
        }
    }
}
