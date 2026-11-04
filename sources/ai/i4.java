package ai;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ha;
import org.telegram.ui.Components.bf0;
import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.s80;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.vp0;
import org.telegram.ui.lr;
import org.telegram.ui.rd;
import org.telegram.ui.uw;
import org.telegram.ui.vm0;
import org.telegram.ui.wm;
import org.telegram.ui.xe0;
import org.telegram.ui.xt;
import org.telegram.ui.yt;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class i4 extends u4.t0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i4(int i3, Object obj, Object obj2) {
        this.a = i3;
        this.c = obj;
        this.b = obj2;
    }

    @Override // u4.t0
    public void a(RecyclerView recyclerView, int i3) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.a) {
            case 2:
                if (i3 == 0) {
                    ((mi.t3) this.c).v3.V();
                    break;
                }
                break;
            case 7:
                yt ytVar = (yt) this.c;
                xt[] xtVarArr = ytVar.f;
                ((u4.t0) this.b).a(recyclerView, i3);
                if (i3 != 1) {
                    kVar = ((org.telegram.ui.ActionBar.d2) ytVar).actionBar;
                    int i10 = (int) (-kVar.getTranslationY());
                    int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i10 != 0 && i10 != currentActionBarHeight) {
                        if (i10 >= currentActionBarHeight / 2) {
                            int i11 = currentActionBarHeight - i10;
                            xtVarArr[0].d.w0(0, i11, null);
                            ci.j1 j1Var = xtVarArr[0].e;
                            if (j1Var != null) {
                                j1Var.w0(0, i11, null);
                                break;
                            }
                        } else {
                            int i12 = -i10;
                            xtVarArr[0].d.w0(0, i12, null);
                            ci.j1 j1Var2 = xtVarArr[0].e;
                            if (j1Var2 != null) {
                                j1Var2.w0(0, i12, null);
                                break;
                            }
                        }
                    }
                }
                break;
            case 9:
                vm0 vm0Var = (vm0) this.c;
                org.telegram.ui.ActionBar.x4[] x4VarArr = vm0Var.n;
                ((u4.t0) this.b).a(recyclerView, i3);
                if (i3 != 1) {
                    kVar2 = ((org.telegram.ui.ActionBar.d2) vm0Var).actionBar;
                    int i13 = (int) (-kVar2.getTranslationY());
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i13 != 0 && i13 != currentActionBarHeight2) {
                        if (i13 >= currentActionBarHeight2 / 2) {
                            ((tj0) x4VarArr[0].f).w0(0, currentActionBarHeight2 - i13, null);
                            break;
                        } else {
                            ((tj0) x4VarArr[0].f).w0(0, -i13, null);
                            break;
                        }
                    }
                }
                break;
            case 11:
                ((u4.t0) this.b).a(recyclerView, i3);
                ((s80) this.c).D.getClass();
                break;
        }
    }

    @Override // u4.t0
    public final void b(RecyclerView recyclerView, int i3, int i10) {
        View F;
        int i11;
        int i12;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.a) {
            case 0:
                o4 o4Var = (o4) this.c;
                h4 h4Var = o4Var.f;
                if (o4Var.isAttachedToWindow()) {
                    if (h4Var.canScrollVertically(1)) {
                        for (int i13 = 0; i13 < h4Var.getChildCount(); i13++) {
                            if (!(h4Var.getChildAt(i13) instanceof iz)) {
                            }
                        }
                    }
                    o4Var.e.a();
                }
                ((vp0) this.b).p();
                break;
            case 1:
                bi.r rVar = (bi.r) this.b;
                float translationY = rVar.getTranslationY();
                float f10 = ((bi.j0) this.c).e0;
                if (translationY != f10) {
                    rVar.setTranslationY(f10);
                    rVar.invalidate();
                    break;
                }
                break;
            case 2:
                mi.t3 t3Var = (mi.t3) this.c;
                ((mi.r3) this.b).Y0(i10);
                t3Var.v3.G();
                mi.h1 h1Var = t3Var.T3;
                if (h1Var != null && (F = t3Var.F(h1Var)) != null) {
                    if (F.getBottom() <= 0 || F.getTop() >= t3Var.getHeight()) {
                        t3Var.T3 = null;
                        h1Var.clearFocus();
                        org.telegram.messenger.g0.v1(t3Var);
                        break;
                    }
                }
                break;
            case 3:
                l41 l41Var = ((rd) this.c).a;
                if (l41Var.canScrollVertically(1)) {
                    for (int i14 = 0; i14 < l41Var.getChildCount(); i14++) {
                        if (!(l41Var.getChildAt(i14) instanceof iz)) {
                        }
                    }
                    break;
                }
                ((cg.l0) this.b).run();
                break;
            case 4:
                wm wmVar = (wm) this.c;
                if (recyclerView.getScrollState() == 1) {
                    org.telegram.messenger.g0.v1(wmVar.m1);
                }
                int N0 = ((u4.b0) this.b).N0();
                if ((N0 == -1 ? 0 : N0) > 0 && N0 > wmVar.b4.h - 5) {
                    if (wmVar.g4 != 7) {
                        wmVar.getMediaDataController().O0();
                        break;
                    } else if (!wmVar.X6 && !wmVar.T6[0]) {
                        wmVar.X6 = true;
                        wmVar.y6.add(Integer.valueOf(wmVar.m6));
                        i11 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
                        ha a10 = ha.a(i11);
                        String str = wmVar.J3;
                        i12 = ((org.telegram.ui.ActionBar.d2) wmVar).classGuid;
                        int i15 = wmVar.d4;
                        int i16 = wmVar.m6;
                        wmVar.m6 = i16 + 1;
                        a10.e(i12, i15, i16, str);
                        break;
                    }
                }
                break;
            case 5:
                uw uwVar = (uw) this.b;
                bf0 bf0Var = (bf0) this.c;
                l41 l41Var2 = bf0Var.c;
                if (!(TextUtils.isEmpty(bf0Var.x) ? bf0Var.e : bf0Var.n).isEmpty()) {
                    if (l41Var2.canScrollVertically(1)) {
                        for (int i17 = 0; i17 < l41Var2.getChildCount(); i17++) {
                            if (!(l41Var2.getChildAt(i17) instanceof iz)) {
                            }
                        }
                    }
                    bf0Var.a(false);
                }
                if (l41Var2.J1 && !bf0Var.R && uwVar.getParentActivity() != null) {
                    org.telegram.messenger.g0.v1(uwVar.getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 6:
                if (((lr) this.c).X.J1) {
                    org.telegram.messenger.g0.v1((FrameLayout) this.b);
                    break;
                }
                break;
            case 7:
                ((u4.t0) this.b).b(recyclerView, i3, i10);
                yt ytVar = (yt) this.c;
                xt xtVar = ytVar.f[0];
                if (recyclerView == xtVar.d || recyclerView == xtVar.e) {
                    kVar = ((org.telegram.ui.ActionBar.d2) ytVar).actionBar;
                    float translationY2 = kVar.getTranslationY();
                    float f11 = translationY2 - i10;
                    if (f11 < (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) {
                        f11 = -org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    } else if (f11 > 0.0f) {
                        f11 = 0.0f;
                    }
                    if (f11 != translationY2) {
                        yt.o0(ytVar, f11);
                        break;
                    }
                }
                break;
            case 8:
                xe0 xe0Var = (xe0) this.c;
                if (xe0Var.c0 && !xe0Var.X) {
                    if (xe0Var.Y - ((kg.y) this.b).N0() < 10) {
                        xe0Var.j0(true);
                        break;
                    }
                }
                break;
            case 9:
                ((u4.t0) this.b).b(recyclerView, i3, i10);
                vm0 vm0Var = (vm0) this.c;
                if (recyclerView == ((tj0) vm0Var.n[0].f)) {
                    kVar2 = ((org.telegram.ui.ActionBar.d2) vm0Var).actionBar;
                    float translationY3 = kVar2.getTranslationY();
                    float f12 = translationY3 - i10;
                    if (f12 < (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) {
                        f12 = -org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    } else if (f12 > 0.0f) {
                        f12 = 0.0f;
                    }
                    if (f12 != translationY3) {
                        vm0.l0(vm0Var, f12);
                        break;
                    }
                }
                break;
            case 10:
                th.n nVar = (th.n) this.c;
                th.m mVar = (th.m) this.b;
                if (!mVar.h && !mVar.i) {
                    if ((nVar.c.g3.E.size() - 1) - nVar.c.f3.M0() < 5) {
                        mVar.a();
                        break;
                    }
                }
                break;
            default:
                ((u4.t0) this.b).b(recyclerView, i3, i10);
                ((s80) this.c).D.b(recyclerView, i3, i10);
                break;
        }
    }
}
