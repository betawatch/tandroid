package bi;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ma;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.eq0;
import org.telegram.ui.Components.j90;
import org.telegram.ui.Components.mf0;
import org.telegram.ui.Components.wz;
import org.telegram.ui.bn;
import org.telegram.ui.cx;
import org.telegram.ui.du;
import org.telegram.ui.eu;
import org.telegram.ui.ff0;
import org.telegram.ui.fn0;
import org.telegram.ui.qr;
import org.telegram.ui.rd;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class e6 extends v4.u0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e6(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.c = obj;
        this.b = obj2;
    }

    @Override // v4.u0
    public void a(RecyclerView recyclerView, int i7) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.a) {
            case 2:
                if (i7 == 0) {
                    ((oi.s3) this.c).v3.V();
                    break;
                }
                break;
            case 7:
                eu euVar = (eu) this.c;
                du[] duVarArr = euVar.f;
                ((v4.u0) this.b).a(recyclerView, i7);
                if (i7 != 1) {
                    kVar = ((org.telegram.ui.ActionBar.h2) euVar).actionBar;
                    int i10 = (int) (-kVar.getTranslationY());
                    int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i10 != 0 && i10 != currentActionBarHeight) {
                        if (i10 >= currentActionBarHeight / 2) {
                            int i11 = currentActionBarHeight - i10;
                            duVarArr[0].d.w0(0, i11, null);
                            di.b1 b1Var = duVarArr[0].e;
                            if (b1Var != null) {
                                b1Var.w0(0, i11, null);
                                break;
                            }
                        } else {
                            int i12 = -i10;
                            duVarArr[0].d.w0(0, i12, null);
                            di.b1 b1Var2 = duVarArr[0].e;
                            if (b1Var2 != null) {
                                b1Var2.w0(0, i12, null);
                                break;
                            }
                        }
                    }
                }
                break;
            case 9:
                fn0 fn0Var = (fn0) this.c;
                org.telegram.ui.ActionBar.z4[] z4VarArr = fn0Var.n;
                ((v4.u0) this.b).a(recyclerView, i7);
                if (i7 != 1) {
                    kVar2 = ((org.telegram.ui.ActionBar.h2) fn0Var).actionBar;
                    int i13 = (int) (-kVar2.getTranslationY());
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i13 != 0 && i13 != currentActionBarHeight2) {
                        if (i13 >= currentActionBarHeight2 / 2) {
                            ((ck0) z4VarArr[0].f).w0(0, currentActionBarHeight2 - i13, null);
                            break;
                        } else {
                            ((ck0) z4VarArr[0].f).w0(0, -i13, null);
                            break;
                        }
                    }
                }
                break;
            case 11:
                ((v4.u0) this.b).a(recyclerView, i7);
                ((j90) this.c).D.getClass();
                break;
        }
    }

    @Override // v4.u0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        View F;
        int i11;
        int i12;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        switch (this.a) {
            case 0:
                k6 k6Var = (k6) this.c;
                d6 d6Var = k6Var.f;
                if (k6Var.isAttachedToWindow()) {
                    if (d6Var.canScrollVertically(1)) {
                        for (int i13 = 0; i13 < d6Var.getChildCount(); i13++) {
                            if (!(d6Var.getChildAt(i13) instanceof wz)) {
                            }
                        }
                    }
                    k6Var.e.a();
                }
                ((eq0) this.b).p();
                break;
            case 1:
                ci.r rVar = (ci.r) this.b;
                float translationY = rVar.getTranslationY();
                float f10 = ((ci.j0) this.c).e0;
                if (translationY != f10) {
                    rVar.setTranslationY(f10);
                    rVar.invalidate();
                    break;
                }
                break;
            case 2:
                oi.s3 s3Var = (oi.s3) this.c;
                ((oi.q3) this.b).b0(i10);
                s3Var.v3.G();
                oi.e1 e1Var = s3Var.T3;
                if (e1Var != null && (F = s3Var.F(e1Var)) != null) {
                    if (F.getBottom() <= 0 || F.getTop() >= s3Var.getHeight()) {
                        s3Var.T3 = null;
                        e1Var.clearFocus();
                        org.telegram.messenger.g0.v1(s3Var);
                        break;
                    }
                }
                break;
            case 3:
                e51 e51Var = ((rd) this.c).a;
                if (e51Var.canScrollVertically(1)) {
                    for (int i14 = 0; i14 < e51Var.getChildCount(); i14++) {
                        if (!(e51Var.getChildAt(i14) instanceof wz)) {
                        }
                    }
                    break;
                }
                ((ai.w0) this.b).run();
                break;
            case 4:
                bn bnVar = (bn) this.c;
                if (recyclerView.getScrollState() == 1) {
                    org.telegram.messenger.g0.v1(bnVar.m1);
                }
                int N0 = ((v4.c0) this.b).N0();
                if ((N0 == -1 ? 0 : N0) > 0 && N0 > bnVar.b4.h - 5) {
                    if (bnVar.g4 != 7) {
                        bnVar.getMediaDataController().R0();
                        break;
                    } else if (!bnVar.Y6 && !bnVar.U6[0]) {
                        bnVar.Y6 = true;
                        bnVar.z6.add(Integer.valueOf(bnVar.n6));
                        i11 = ((org.telegram.ui.ActionBar.h2) bnVar).currentAccount;
                        ma a10 = ma.a(i11);
                        String str = bnVar.J3;
                        i12 = ((org.telegram.ui.ActionBar.h2) bnVar).classGuid;
                        int i15 = bnVar.d4;
                        int i16 = bnVar.n6;
                        bnVar.n6 = i16 + 1;
                        a10.e(i12, i15, i16, str);
                        break;
                    }
                }
                break;
            case 5:
                cx cxVar = (cx) this.b;
                mf0 mf0Var = (mf0) this.c;
                e51 e51Var2 = mf0Var.c;
                if (!(TextUtils.isEmpty(mf0Var.x) ? mf0Var.e : mf0Var.n).isEmpty()) {
                    if (e51Var2.canScrollVertically(1)) {
                        for (int i17 = 0; i17 < e51Var2.getChildCount(); i17++) {
                            if (!(e51Var2.getChildAt(i17) instanceof wz)) {
                            }
                        }
                    }
                    mf0Var.a(false);
                }
                if (e51Var2.J1 && !mf0Var.R && cxVar.getParentActivity() != null) {
                    org.telegram.messenger.g0.v1(cxVar.getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 6:
                if (((qr) this.c).X.J1) {
                    org.telegram.messenger.g0.v1((FrameLayout) this.b);
                    break;
                }
                break;
            case 7:
                ((v4.u0) this.b).b(recyclerView, i7, i10);
                eu euVar = (eu) this.c;
                du duVar = euVar.f[0];
                if (recyclerView == duVar.d || recyclerView == duVar.e) {
                    kVar = ((org.telegram.ui.ActionBar.h2) euVar).actionBar;
                    float translationY2 = kVar.getTranslationY();
                    float f11 = translationY2 - i10;
                    if (f11 < (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) {
                        f11 = -org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    } else if (f11 > 0.0f) {
                        f11 = 0.0f;
                    }
                    if (f11 != translationY2) {
                        eu.o0(euVar, f11);
                        break;
                    }
                }
                break;
            case 8:
                ff0 ff0Var = (ff0) this.c;
                if (ff0Var.c0 && !ff0Var.X) {
                    if (ff0Var.Y - ((jg.b0) this.b).N0() < 10) {
                        ff0Var.j0(true);
                        break;
                    }
                }
                break;
            case 9:
                ((v4.u0) this.b).b(recyclerView, i7, i10);
                fn0 fn0Var = (fn0) this.c;
                if (recyclerView == ((ck0) fn0Var.n[0].f)) {
                    kVar2 = ((org.telegram.ui.ActionBar.h2) fn0Var).actionBar;
                    float translationY3 = kVar2.getTranslationY();
                    float f12 = translationY3 - i10;
                    if (f12 < (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) {
                        f12 = -org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    } else if (f12 > 0.0f) {
                        f12 = 0.0f;
                    }
                    if (f12 != translationY3) {
                        fn0.l0(fn0Var, f12);
                        break;
                    }
                }
                break;
            case 10:
                sh.o oVar = (sh.o) this.c;
                sh.n nVar = (sh.n) this.b;
                if (!nVar.h && !nVar.i) {
                    if ((oVar.c.g3.E.size() - 1) - oVar.c.f3.M0() < 5) {
                        nVar.a();
                        break;
                    }
                }
                break;
            default:
                ((v4.u0) this.b).b(recyclerView, i7, i10);
                ((j90) this.c).D.b(recyclerView, i7, i10);
                break;
        }
    }
}
