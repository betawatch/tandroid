package ci;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.w81;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.de1;
import org.telegram.ui.dw0;
import org.telegram.ui.hk;
import org.telegram.ui.np0;
import org.telegram.ui.r31;
import org.telegram.ui.s31;
import org.telegram.ui.sa1;
import org.telegram.ui.t31;
import org.telegram.ui.tp0;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes4.dex */
public final class i1 extends w81 {
    public final /* synthetic */ int T;
    public final /* synthetic */ Object U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i1(Object obj, Context context, int i10) {
        super(context, null);
        this.T = i10;
        this.U = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00de A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Components.w81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean i(MotionEvent motionEvent) {
        int i10;
        View E;
        int R;
        switch (this.T) {
            case 1:
                fa faVar = (fa) this.U;
                View currentView = faVar.b.getCurrentView();
                if (!(currentView instanceof y9)) {
                    return true;
                }
                if (getCurrentPosition() > 0) {
                    faVar.f1();
                    return true;
                }
                y9 y9Var = (y9) currentView;
                ArrayList arrayList = y9Var.L;
                wl0 wl0Var = y9Var.f;
                if (y9Var.a == 0 && motionEvent != null && (E = wl0Var.E(motionEvent.getX(), motionEvent.getY() - y9Var.e.getPaddingTop())) != null && (R = RecyclerView.R(E)) >= 0 && R < arrayList.size()) {
                    k9 k9Var = (k9) arrayList.get(R);
                    if (k9Var.a == 3 && !k9Var.n) {
                        boolean z10 = LocaleController.isRTL;
                        float x10 = motionEvent.getX();
                        if (!z10 ? x10 > AndroidUtilities.dp(100.0f) : x10 < y9Var.getWidth() - AndroidUtilities.dp(100.0f)) {
                            i10 = k9Var.i;
                            if (i10 != -1) {
                                faVar.M = i10;
                                if (i10 == 3) {
                                    if (!faVar.n.isEmpty() && !faVar.r.isEmpty()) {
                                        faVar.N = i10;
                                    }
                                } else if (i10 != 4) {
                                    faVar.N = i10;
                                } else if (!faVar.d.isEmpty() && !faVar.e.isEmpty()) {
                                    faVar.N = i10;
                                }
                                y9Var.f(true);
                                y9Var.e(true);
                            }
                            if (i10 != -1) {
                                faVar.f1();
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
                hk hkVar = ((wn) this.U).p1;
                return hkVar != null && hkVar.b > 0.5f;
        }
    }

    @Override // org.telegram.ui.Components.w81
    public boolean j(MotionEvent motionEvent) {
        switch (this.T) {
            case 2:
                return getCurrentPosition() != 2;
            default:
                return super.j(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.w81
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
                sa1.Y((sa1) this.U);
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override // org.telegram.ui.Components.w81, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.T) {
            case 3:
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.w81
    public void t(View view, View view2, int i10, int i11) {
        boolean z10;
        switch (this.T) {
            case 1:
                fa faVar = (fa) this.U;
                z10 = ((org.telegram.ui.ActionBar.e3) faVar).keyboardVisible;
                if (z10) {
                    faVar.f1();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.w81
    public void u() {
        switch (this.T) {
            case 2:
                if (getCurrentPosition() == 1) {
                    ((fi.k0) this.U).v.d.Y2.N(false);
                    break;
                }
                break;
            case 7:
                sa1 sa1Var = (sa1) this.U;
                sa1Var.m0(sa1Var.i0.getCurrentPosition(), true);
                sa1Var.n0(0.0f, false);
                sa1.W(sa1Var);
                break;
        }
    }

    @Override // org.telegram.ui.Components.w81
    public void v() {
        r31 r31Var;
        switch (this.T) {
            case 6:
                if ((getCurrentView() instanceof s31) && (r31Var = ((s31) getCurrentView()).n) != null) {
                    AndroidUtilities.hideKeyboard(r31Var);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.w81
    public final void w(boolean z10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        switch (this.T) {
            case 0:
                s2 s2Var = (s2) this.U;
                i1 i1Var = s2Var.f;
                r2 r2Var = s2Var.h;
                if (r2Var != null) {
                    r2Var.F = i1Var.getPositionAnimated();
                    r2Var.invalidate();
                }
                viewGroup = ((org.telegram.ui.ActionBar.e3) s2Var).containerView;
                viewGroup.invalidate();
                invalidate();
                s2.G = i1Var.getCurrentPosition();
                break;
            case 1:
                viewGroup2 = ((org.telegram.ui.ActionBar.e3) ((fa) this.U)).containerView;
                viewGroup2.invalidate();
                break;
            case 2:
                viewGroup3 = ((org.telegram.ui.ActionBar.e3) ((fi.k0) this.U)).containerView;
                viewGroup3.invalidate();
                break;
            case 3:
                wn wnVar = (wn) this.U;
                wnVar.X0.getClass();
                wnVar.X0.getClass();
                wnVar.l7();
                wnVar.q9(1);
                break;
            case 4:
                tp0 tp0Var = (tp0) this.U;
                float positionAnimated = tp0Var.I.getPositionAnimated();
                tp0Var.M.setSelected(positionAnimated);
                tp0Var.e.setProgressToGradient(1.0f - w7.q.a((positionAnimated - 0.333333f) / 0.333333f, 0.0f, 1.0f));
                tp0Var.G0();
                np0 C0 = tp0Var.C0();
                d dVar = tp0Var.Q;
                if (dVar != null && C0 != null && C0 != tp0Var.R) {
                    tp0Var.R = C0;
                    n7.z0 z0Var = C0.e;
                    dVar.g((CharSequence) z0Var.b, true, true);
                    tp0Var.Q.f((SpannableStringBuilder) z0Var.c, true);
                }
                tp0Var.D0(1);
                break;
            case 5:
                ((dw0) this.U).e();
                break;
            case 6:
                viewGroup4 = ((org.telegram.ui.ActionBar.e3) ((t31) this.U)).containerView;
                viewGroup4.invalidate();
                break;
            case 7:
                sa1 sa1Var = (sa1) this.U;
                float positionAnimated2 = sa1Var.i0.getPositionAnimated();
                sa1Var.n0(positionAnimated2, !z10);
                if (!z10) {
                    sa1Var.m0(Math.round(positionAnimated2), true);
                }
                sa1.W(sa1Var);
                sa1.Y(sa1Var);
                break;
            default:
                ((de1) this.U).e();
                break;
        }
    }

    @Override // org.telegram.ui.Components.w81
    public void z(int i10) {
        switch (this.T) {
            case 3:
                if (i10 == 0) {
                    wn wnVar = (wn) this.U;
                    if (wnVar.s1) {
                        wnVar.s1 = false;
                        wnVar.q1.h.clear();
                        break;
                    }
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(Context context, org.telegram.ui.ActionBar.d6 d6Var, wn wnVar) {
        super(context, d6Var);
        this.T = 3;
        this.U = wnVar;
    }
}
