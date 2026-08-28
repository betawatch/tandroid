package eh;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import bg.c2;
import f2.d1;
import f2.m0;
import fh.s3;
import fh.y3;
import gh.f1;
import of.y;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.HashtagSearchController;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.e00;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.kg0;
import org.telegram.ui.Components.l90;
import org.telegram.ui.Components.vq0;
import org.telegram.ui.av;
import org.telegram.ui.bv;
import org.telegram.ui.cq0;
import org.telegram.ui.dy;
import org.telegram.ui.eq0;
import org.telegram.ui.hh0;
import org.telegram.ui.is;
import org.telegram.ui.qn;
import org.telegram.ui.zd;
import qh.m3;
import qh.o3;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class n extends d1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n(int i9, Object obj, Object obj2) {
        this.a = i9;
        this.c = obj;
        this.b = obj2;
    }

    @Override // f2.d1
    public void a(RecyclerView recyclerView, int i9) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.a) {
            case 0:
                ((d1) this.b).a(recyclerView, i9);
                ((l90) this.c).D.getClass();
                break;
            case 6:
                bv bvVar = (bv) this.c;
                av[] avVarArr = bvVar.f;
                ((d1) this.b).a(recyclerView, i9);
                if (i9 != 1) {
                    kVar = ((o2) bvVar).actionBar;
                    int i10 = (int) (-kVar.getTranslationY());
                    int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i10 != 0 && i10 != currentActionBarHeight) {
                        if (i10 >= currentActionBarHeight / 2) {
                            int i11 = currentActionBarHeight - i10;
                            avVarArr[0].d.v0(0, i11, null);
                            f1 f1Var = avVarArr[0].e;
                            if (f1Var != null) {
                                f1Var.v0(0, i11, null);
                                break;
                            }
                        } else {
                            int i12 = -i10;
                            avVarArr[0].d.v0(0, i12, null);
                            f1 f1Var2 = avVarArr[0].e;
                            if (f1Var2 != null) {
                                f1Var2.v0(0, i12, null);
                                break;
                            }
                        }
                    }
                }
                break;
            case 8:
                eq0 eq0Var = (eq0) this.c;
                cq0[] cq0VarArr = eq0Var.n;
                ((d1) this.b).a(recyclerView, i9);
                if (i9 != 1) {
                    kVar2 = ((o2) eq0Var).actionBar;
                    int i13 = (int) (-kVar2.getTranslationY());
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i13 != 0 && i13 != currentActionBarHeight2) {
                        if (i13 >= currentActionBarHeight2 / 2) {
                            cq0VarArr[0].d.v0(0, currentActionBarHeight2 - i13, null);
                            break;
                        } else {
                            cq0VarArr[0].d.v0(0, -i13, null);
                            break;
                        }
                    }
                }
                break;
            case 9:
                if (i9 == 0) {
                    ((o3) this.c).j3.W();
                    break;
                }
                break;
        }
    }

    @Override // f2.d1
    public final void b(RecyclerView recyclerView, int i9, int i10) {
        int i11;
        int i12;
        ig.e eVar;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        View F;
        switch (this.a) {
            case 0:
                ((d1) this.b).b(recyclerView, i9, i10);
                ((l90) this.c).D.b(recyclerView, i9, i10);
                break;
            case 1:
                y3 y3Var = (y3) this.c;
                s3 s3Var = y3Var.f;
                if (y3Var.isAttachedToWindow()) {
                    if (s3Var.canScrollVertically(1)) {
                        for (int i13 = 0; i13 < s3Var.getChildCount(); i13++) {
                            if (!(s3Var.getChildAt(i13) instanceof e00)) {
                            }
                        }
                    }
                    y3Var.e.a();
                }
                ((vq0) this.b).o();
                break;
            case 2:
                i51 i51Var = ((zd) this.c).a;
                if (i51Var.canScrollVertically(1)) {
                    for (int i14 = 0; i14 < i51Var.getChildCount(); i14++) {
                        if (!(i51Var.getChildAt(i14) instanceof e00)) {
                        }
                    }
                    break;
                }
                ((c2) this.b).run();
                break;
            case 3:
                qn qnVar = (qn) this.c;
                qn qnVar2 = qnVar.Z9;
                if (qnVar2 == null) {
                    qnVar2 = qnVar;
                }
                if (i10 != 0) {
                    qnVar.q9(1);
                }
                if (Build.VERSION.SDK_INT >= 31 && (eVar = qnVar2.B) != null) {
                    eVar.f(i9, i10);
                }
                if (recyclerView.getScrollState() == 1) {
                    AndroidUtilities.hideKeyboard(qnVar.T0);
                }
                int N0 = ((m0) this.b).N0();
                if ((N0 == -1 ? 0 : N0) > 0 && N0 > qnVar.I3.h - 5) {
                    if (qnVar.N3 != 7) {
                        qnVar.getMediaDataController().loadMoreSearchMessages(true);
                        break;
                    } else if (!qnVar.C6 && !qnVar.y6[0]) {
                        qnVar.C6 = true;
                        qnVar.d6.add(Integer.valueOf(qnVar.R5));
                        i11 = ((o2) qnVar).currentAccount;
                        HashtagSearchController hashtagSearchController = HashtagSearchController.getInstance(i11);
                        String str = qnVar.q3;
                        i12 = ((o2) qnVar).classGuid;
                        int i15 = qnVar.K3;
                        int i16 = qnVar.R5;
                        qnVar.R5 = i16 + 1;
                        hashtagSearchController.searchHashtag(str, i12, i15, i16);
                        break;
                    }
                }
                break;
            case 4:
                dy dyVar = (dy) this.b;
                kg0 kg0Var = (kg0) this.c;
                i51 i51Var2 = kg0Var.c;
                if (!(TextUtils.isEmpty(kg0Var.w) ? kg0Var.e : kg0Var.n).isEmpty()) {
                    if (i51Var2.canScrollVertically(1)) {
                        for (int i17 = 0; i17 < i51Var2.getChildCount(); i17++) {
                            if (!(i51Var2.getChildAt(i17) instanceof e00)) {
                            }
                        }
                    }
                    kg0Var.a(false);
                }
                if (i51Var2.G1 && !kg0Var.M && dyVar.getParentActivity() != null) {
                    AndroidUtilities.hideKeyboard(dyVar.getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 5:
                if (((is) this.c).S.G1) {
                    AndroidUtilities.hideKeyboard((FrameLayout) this.b);
                    break;
                }
                break;
            case 6:
                ((d1) this.b).b(recyclerView, i9, i10);
                bv bvVar = (bv) this.c;
                av avVar = bvVar.f[0];
                if (recyclerView == avVar.d || recyclerView == avVar.e) {
                    kVar = ((o2) bvVar).actionBar;
                    float translationY = kVar.getTranslationY();
                    float f10 = translationY - i10;
                    if (f10 < (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) {
                        f10 = -org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    } else if (f10 > 0.0f) {
                        f10 = 0.0f;
                    }
                    if (f10 != translationY) {
                        bv.i0(bvVar, f10);
                        break;
                    }
                }
                break;
            case 7:
                hh0 hh0Var = (hh0) this.c;
                if (hh0Var.X && !hh0Var.S) {
                    if (hh0Var.T - ((y) this.b).N0() < 10) {
                        hh0Var.c0(true);
                        break;
                    }
                }
                break;
            case 8:
                ((d1) this.b).b(recyclerView, i9, i10);
                eq0 eq0Var = (eq0) this.c;
                if (recyclerView == eq0Var.n[0].d) {
                    kVar2 = ((o2) eq0Var).actionBar;
                    float translationY2 = kVar2.getTranslationY();
                    float f11 = translationY2 - i10;
                    if (f11 < (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) {
                        f11 = -org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    } else if (f11 > 0.0f) {
                        f11 = 0.0f;
                    }
                    if (f11 != translationY2) {
                        eq0.f0(eq0Var, f11);
                        break;
                    }
                }
                break;
            default:
                o3 o3Var = (o3) this.c;
                ((m3) this.b).b1(i10);
                o3Var.j3.H();
                qh.d1 d1Var = o3Var.H3;
                if (d1Var != null && (F = o3Var.F(d1Var)) != null) {
                    if (F.getBottom() <= 0 || F.getTop() >= o3Var.getHeight()) {
                        o3Var.H3 = null;
                        d1Var.clearFocus();
                        AndroidUtilities.hideKeyboard(o3Var);
                        break;
                    }
                }
                break;
        }
    }
}
