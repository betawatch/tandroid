package di;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.k91;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.aq0;
import org.telegram.ui.fo;
import org.telegram.ui.g41;
import org.telegram.ui.gq0;
import org.telegram.ui.h41;
import org.telegram.ui.hb1;
import org.telegram.ui.i41;
import org.telegram.ui.pk;
import org.telegram.ui.se1;
import org.telegram.ui.sw0;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class h1 extends k91 {
    public final /* synthetic */ int T;
    public final /* synthetic */ Object U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h1(Object obj, Context context, int i10) {
        super(context, null);
        this.T = i10;
        this.U = obj;
    }

    @Override // org.telegram.ui.Components.k91
    public int G() {
        switch (this.T) {
            case 10:
                return 12;
            default:
                return super.G();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00de A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Components.k91
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean i(MotionEvent motionEvent) {
        int i10;
        View E;
        int R;
        switch (this.T) {
            case 1:
                ea eaVar = (ea) this.U;
                View currentView = eaVar.b.getCurrentView();
                if (!(currentView instanceof x9)) {
                    return true;
                }
                if (getCurrentPosition() > 0) {
                    eaVar.g1();
                    return true;
                }
                x9 x9Var = (x9) currentView;
                ArrayList arrayList = x9Var.L;
                mm0 mm0Var = x9Var.f;
                if (x9Var.a == 0 && motionEvent != null && (E = mm0Var.E(motionEvent.getX(), motionEvent.getY() - x9Var.e.getPaddingTop())) != null && (R = RecyclerView.R(E)) >= 0 && R < arrayList.size()) {
                    j9 j9Var = (j9) arrayList.get(R);
                    if (j9Var.a == 3 && !j9Var.n) {
                        boolean z10 = LocaleController.isRTL;
                        float x10 = motionEvent.getX();
                        if (!z10 ? x10 > AndroidUtilities.dp(100.0f) : x10 < x9Var.getWidth() - AndroidUtilities.dp(100.0f)) {
                            i10 = j9Var.i;
                            if (i10 != -1) {
                                eaVar.M = i10;
                                if (i10 == 3) {
                                    if (!eaVar.n.isEmpty() && !eaVar.r.isEmpty()) {
                                        eaVar.N = i10;
                                    }
                                } else if (i10 != 4) {
                                    eaVar.N = i10;
                                } else if (!eaVar.d.isEmpty() && !eaVar.e.isEmpty()) {
                                    eaVar.N = i10;
                                }
                                x9Var.f(true);
                                x9Var.e(true);
                            }
                            if (i10 != -1) {
                                eaVar.g1();
                            }
                            return i10 == -1;
                        }
                    }
                }
                i10 = -1;
                if (i10 != -1) {
                }
                if (i10 != -1) {
                }
                if (i10 == -1) {
                }
                break;
            case 2:
            default:
                return super.i(motionEvent);
            case 3:
                pk pkVar = ((fo) this.U).p1;
                return pkVar != null && pkVar.b > 0.5f;
        }
    }

    @Override // org.telegram.ui.Components.k91
    public boolean j(MotionEvent motionEvent) {
        switch (this.T) {
            case 2:
                return getCurrentPosition() != 2;
            default:
                return super.j(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.k91
    public boolean k(MotionEvent motionEvent) {
        switch (this.T) {
            case 2:
                return false;
            case 6:
                return false;
            default:
                return super.k(motionEvent);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.T) {
            case 7:
                super.onLayout(z10, i10, i11, i12, i13);
                hb1.Y((hb1) this.U);
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override // org.telegram.ui.Components.k91, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.T) {
            case 3:
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.k91
    public void t(View view, View view2, int i10, int i11) {
        boolean z10;
        switch (this.T) {
            case 1:
                ea eaVar = (ea) this.U;
                z10 = ((org.telegram.ui.ActionBar.e3) eaVar).keyboardVisible;
                if (z10) {
                    eaVar.g1();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.k91
    public void u() {
        switch (this.T) {
            case 2:
                if (getCurrentPosition() == 1) {
                    ((gi.k0) this.U).v.d.W2.N(false);
                    break;
                }
                break;
            case 7:
                hb1 hb1Var = (hb1) this.U;
                hb1Var.m0(hb1Var.i0.getCurrentPosition(), true);
                hb1Var.n0(0.0f, false);
                hb1.W(hb1Var);
                break;
        }
    }

    @Override // org.telegram.ui.Components.k91
    public void v() {
        g41 g41Var;
        switch (this.T) {
            case 6:
                if ((getCurrentView() instanceof h41) && (g41Var = ((h41) getCurrentView()).n) != null) {
                    AndroidUtilities.hideKeyboard(g41Var);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.k91
    public void w(boolean z10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        ViewGroup viewGroup5;
        switch (this.T) {
            case 0:
                r2 r2Var = (r2) this.U;
                h1 h1Var = r2Var.f;
                q2 q2Var = r2Var.h;
                if (q2Var != null) {
                    q2Var.F = h1Var.getPositionAnimated();
                    q2Var.invalidate();
                }
                viewGroup = ((org.telegram.ui.ActionBar.e3) r2Var).containerView;
                viewGroup.invalidate();
                invalidate();
                r2.G = h1Var.getCurrentPosition();
                break;
            case 1:
                viewGroup2 = ((org.telegram.ui.ActionBar.e3) ((ea) this.U)).containerView;
                viewGroup2.invalidate();
                break;
            case 2:
                viewGroup3 = ((org.telegram.ui.ActionBar.e3) ((gi.k0) this.U)).containerView;
                viewGroup3.invalidate();
                break;
            case 3:
                fo foVar = (fo) this.U;
                foVar.X0.getClass();
                foVar.X0.getClass();
                foVar.o7();
                foVar.v9(1);
                break;
            case 4:
                gq0 gq0Var = (gq0) this.U;
                float positionAnimated = gq0Var.I.getPositionAnimated();
                gq0Var.M.setSelected(positionAnimated);
                gq0Var.e.setProgressToGradient(1.0f - w7.s.a((positionAnimated - 0.333333f) / 0.333333f, 0.0f, 1.0f));
                gq0Var.G0();
                aq0 C0 = gq0Var.C0();
                d dVar = gq0Var.Q;
                if (dVar != null && C0 != null && C0 != gq0Var.R) {
                    gq0Var.R = C0;
                    n6.o oVar = C0.e;
                    dVar.g((CharSequence) oVar.b, true, true);
                    gq0Var.Q.f((SpannableStringBuilder) oVar.c, true);
                }
                gq0Var.D0(1);
                break;
            case 5:
                ((sw0) this.U).e();
                break;
            case 6:
                viewGroup4 = ((org.telegram.ui.ActionBar.e3) ((i41) this.U)).containerView;
                viewGroup4.invalidate();
                break;
            case 7:
                hb1 hb1Var = (hb1) this.U;
                float positionAnimated2 = hb1Var.i0.getPositionAnimated();
                hb1Var.n0(positionAnimated2, !z10);
                if (!z10) {
                    hb1Var.m0(Math.round(positionAnimated2), true);
                }
                hb1.W(hb1Var);
                hb1.Y(hb1Var);
                break;
            case 8:
                ((se1) this.U).e();
                break;
            case 9:
                viewGroup5 = ((org.telegram.ui.ActionBar.e3) ((org.telegram.ui.Wallet.h2) this.U)).containerView;
                viewGroup5.invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.Components.k91
    public void x(int i10) {
        switch (this.T) {
            case 10:
                org.telegram.ui.Wallet.z4 z4Var = (org.telegram.ui.Wallet.z4) this.U;
                z4Var.f0 = i10;
                if (i10 == 1) {
                    z4Var.n0.post(new org.telegram.ui.Wallet.f3(z4Var, 12));
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.k91
    public void z(int i10) {
        switch (this.T) {
            case 3:
                if (i10 == 0) {
                    fo foVar = (fo) this.U;
                    if (foVar.s1) {
                        foVar.s1 = false;
                        foVar.q1.h.clear();
                        break;
                    }
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h1(org.telegram.ui.ActionBar.m2 m2Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        super(context, c6Var);
        this.T = i10;
        this.U = m2Var;
    }
}
