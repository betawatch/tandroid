package ii;

import ai.o8;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.HashtagSearchController;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.nr0;
import org.telegram.ui.Components.u00;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.ar0;
import org.telegram.ui.de;
import org.telegram.ui.jv;
import org.telegram.ui.kv;
import org.telegram.ui.ns;
import org.telegram.ui.ry;
import org.telegram.ui.th0;
import org.telegram.ui.xn;
import org.telegram.ui.yq0;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
                kv kvVar = (kv) this.c;
                jv[] jvVarArr = kvVar.f;
                ((s4.s0) this.b).a(recyclerView, i10);
                if (i10 != 1) {
                    kVar = ((org.telegram.ui.ActionBar.n2) kvVar).actionBar;
                    int i11 = (int) (-kVar.getTranslationY());
                    int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i11 != 0 && i11 != currentActionBarHeight) {
                        if (i11 >= currentActionBarHeight / 2) {
                            int i12 = currentActionBarHeight - i11;
                            jvVarArr[0].d.v0(0, i12, null);
                            ai.w0 w0Var = jvVarArr[0].e;
                            if (w0Var != null) {
                                w0Var.v0(0, i12, null);
                                break;
                            }
                        } else {
                            int i13 = -i11;
                            jvVarArr[0].d.v0(0, i13, null);
                            ai.w0 w0Var2 = jvVarArr[0].e;
                            if (w0Var2 != null) {
                                w0Var2.v0(0, i13, null);
                                break;
                            }
                        }
                    }
                }
                break;
            case 7:
                ar0 ar0Var = (ar0) this.c;
                yq0[] yq0VarArr = ar0Var.n;
                ((s4.s0) this.b).a(recyclerView, i10);
                if (i10 != 1) {
                    kVar2 = ((org.telegram.ui.ActionBar.n2) ar0Var).actionBar;
                    int i14 = (int) (-kVar2.getTranslationY());
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i14 != 0 && i14 != currentActionBarHeight2) {
                        if (i14 >= currentActionBarHeight2 / 2) {
                            yq0VarArr[0].d.v0(0, currentActionBarHeight2 - i14, null);
                            break;
                        } else {
                            yq0VarArr[0].d.v0(0, -i14, null);
                            break;
                        }
                    }
                }
                break;
            case 8:
                ((s4.s0) this.b).a(recyclerView, i10);
                ((da0) this.c).D.getClass();
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
                d61 d61Var = ((de) this.c).a;
                if (d61Var.canScrollVertically(1)) {
                    for (int i14 = 0; i14 < d61Var.getChildCount(); i14++) {
                        if (!(d61Var.getChildAt(i14) instanceof u00)) {
                        }
                    }
                    break;
                }
                ((o8) this.b).run();
                break;
            case 2:
                xn xnVar = (xn) this.c;
                xn xnVar2 = xnVar.da;
                if (xnVar2 == null) {
                    xnVar2 = xnVar;
                }
                if (i11 != 0) {
                    xnVar.q9(1);
                }
                if (Build.VERSION.SDK_INT >= 31 && (hVar = xnVar2.F) != null) {
                    hVar.f(i10, i11);
                }
                if (recyclerView.getScrollState() == 1) {
                    AndroidUtilities.hideKeyboard(xnVar.X0);
                }
                int N0 = ((s4.c0) this.b).N0();
                if ((N0 == -1 ? 0 : N0) > 0 && N0 > xnVar.M3.h - 5) {
                    if (xnVar.R3 != 7) {
                        xnVar.getMediaDataController().loadMoreSearchMessages(true);
                        break;
                    } else if (!xnVar.G6 && !xnVar.C6[0]) {
                        xnVar.G6 = true;
                        xnVar.h6.add(Integer.valueOf(xnVar.V5));
                        i12 = ((org.telegram.ui.ActionBar.n2) xnVar).currentAccount;
                        HashtagSearchController hashtagSearchController = HashtagSearchController.getInstance(i12);
                        String str = xnVar.u3;
                        i13 = ((org.telegram.ui.ActionBar.n2) xnVar).classGuid;
                        int i15 = xnVar.O3;
                        int i16 = xnVar.V5;
                        xnVar.V5 = i16 + 1;
                        hashtagSearchController.searchHashtag(str, i13, i15, i16);
                        break;
                    }
                }
                break;
            case 3:
                ry ryVar = (ry) this.b;
                zg0 zg0Var = (zg0) this.c;
                d61 d61Var2 = zg0Var.c;
                if (!(TextUtils.isEmpty(zg0Var.w) ? zg0Var.e : zg0Var.n).isEmpty()) {
                    if (d61Var2.canScrollVertically(1)) {
                        for (int i17 = 0; i17 < d61Var2.getChildCount(); i17++) {
                            if (!(d61Var2.getChildAt(i17) instanceof u00)) {
                            }
                        }
                    }
                    zg0Var.a(false);
                }
                if (d61Var2.K1 && !zg0Var.Q && ryVar.getParentActivity() != null) {
                    AndroidUtilities.hideKeyboard(ryVar.getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 4:
                if (((ns) this.c).W.K1) {
                    AndroidUtilities.hideKeyboard((FrameLayout) this.b);
                    break;
                }
                break;
            case 5:
                ((s4.s0) this.b).b(recyclerView, i10, i11);
                kv kvVar = (kv) this.c;
                jv jvVar = kvVar.f[0];
                if (recyclerView == jvVar.d || recyclerView == jvVar.e) {
                    kVar = ((org.telegram.ui.ActionBar.n2) kvVar).actionBar;
                    float translationY = kVar.getTranslationY();
                    float f7 = translationY - i11;
                    if (f7 < (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) {
                        f7 = -org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    } else if (f7 > 0.0f) {
                        f7 = 0.0f;
                    }
                    if (f7 != translationY) {
                        kv.j0(kvVar, f7);
                        break;
                    }
                }
                break;
            case 6:
                th0 th0Var = (th0) this.c;
                if (th0Var.b0 && !th0Var.W) {
                    if (th0Var.X - ((gg.b0) this.b).N0() < 10) {
                        th0Var.d0(true);
                        break;
                    }
                }
                break;
            case 7:
                ((s4.s0) this.b).b(recyclerView, i10, i11);
                ar0 ar0Var = (ar0) this.c;
                if (recyclerView == ar0Var.n[0].d) {
                    kVar2 = ((org.telegram.ui.ActionBar.n2) ar0Var).actionBar;
                    float translationY2 = kVar2.getTranslationY();
                    float f10 = translationY2 - i11;
                    if (f10 < (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) {
                        f10 = -org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    } else if (f10 > 0.0f) {
                        f10 = 0.0f;
                    }
                    if (f10 != translationY2) {
                        ar0.g0(ar0Var, f10);
                        break;
                    }
                }
                break;
            case 8:
                ((s4.s0) this.b).b(recyclerView, i10, i11);
                ((da0) this.c).D.b(recyclerView, i10, i11);
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
                ((nr0) this.b).o();
                break;
        }
    }
}
