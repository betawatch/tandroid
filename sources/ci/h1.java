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
import org.telegram.ui.Components.o91;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.a41;
import org.telegram.ui.aq0;
import org.telegram.ui.b41;
import org.telegram.ui.bb1;
import org.telegram.ui.c41;
import org.telegram.ui.lk;
import org.telegram.ui.me1;
import org.telegram.ui.mw0;
import org.telegram.ui.up0;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class h1 extends o91 {
    public final /* synthetic */ int T;
    public final /* synthetic */ Object U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h1(Object obj, Context context, int i10) {
        super(context, null);
        this.T = i10;
        this.U = obj;
    }

    @Override // org.telegram.ui.Components.o91
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
    @Override // org.telegram.ui.Components.o91
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
                    faVar.g1();
                    return true;
                }
                y9 y9Var = (y9) currentView;
                ArrayList arrayList = y9Var.L;
                qm0 qm0Var = y9Var.f;
                if (y9Var.a == 0 && motionEvent != null && (E = qm0Var.E(motionEvent.getX(), motionEvent.getY() - y9Var.e.getPaddingTop())) != null && (R = RecyclerView.R(E)) >= 0 && R < arrayList.size()) {
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
                                faVar.g1();
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
                lk lkVar = ((zn) this.U).p1;
                return lkVar != null && lkVar.b > 0.5f;
        }
    }

    @Override // org.telegram.ui.Components.o91
    public boolean j(MotionEvent motionEvent) {
        switch (this.T) {
            case 2:
                return getCurrentPosition() != 2;
            default:
                return super.j(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.o91
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
                bb1.Y((bb1) this.U);
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override // org.telegram.ui.Components.o91, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.T) {
            case 3:
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.o91
    public void t(View view, View view2, int i10, int i11) {
        boolean z10;
        switch (this.T) {
            case 1:
                fa faVar = (fa) this.U;
                z10 = ((org.telegram.ui.ActionBar.f3) faVar).keyboardVisible;
                if (z10) {
                    faVar.g1();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.o91
    public void u() {
        switch (this.T) {
            case 2:
                if (getCurrentPosition() == 1) {
                    ((fi.k0) this.U).v.d.W2.N(false);
                    break;
                }
                break;
            case 7:
                bb1 bb1Var = (bb1) this.U;
                bb1Var.m0(bb1Var.i0.getCurrentPosition(), true);
                bb1Var.n0(0.0f, false);
                bb1.W(bb1Var);
                break;
        }
    }

    @Override // org.telegram.ui.Components.o91
    public void v() {
        a41 a41Var;
        switch (this.T) {
            case 6:
                if ((getCurrentView() instanceof b41) && (a41Var = ((b41) getCurrentView()).n) != null) {
                    AndroidUtilities.hideKeyboard(a41Var);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.o91
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
                viewGroup = ((org.telegram.ui.ActionBar.f3) r2Var).containerView;
                viewGroup.invalidate();
                invalidate();
                r2.G = h1Var.getCurrentPosition();
                break;
            case 1:
                viewGroup2 = ((org.telegram.ui.ActionBar.f3) ((fa) this.U)).containerView;
                viewGroup2.invalidate();
                break;
            case 2:
                viewGroup3 = ((org.telegram.ui.ActionBar.f3) ((fi.k0) this.U)).containerView;
                viewGroup3.invalidate();
                break;
            case 3:
                zn znVar = (zn) this.U;
                znVar.X0.getClass();
                znVar.X0.getClass();
                znVar.o7();
                znVar.v9(1);
                break;
            case 4:
                aq0 aq0Var = (aq0) this.U;
                float positionAnimated = aq0Var.I.getPositionAnimated();
                aq0Var.M.setSelected(positionAnimated);
                aq0Var.e.setProgressToGradient(1.0f - w7.o.a((positionAnimated - 0.333333f) / 0.333333f, 0.0f, 1.0f));
                aq0Var.G0();
                up0 C0 = aq0Var.C0();
                d dVar = aq0Var.Q;
                if (dVar != null && C0 != null && C0 != aq0Var.R) {
                    aq0Var.R = C0;
                    n6.t tVar = C0.e;
                    dVar.g((CharSequence) tVar.b, true, true);
                    aq0Var.Q.f((SpannableStringBuilder) tVar.c, true);
                }
                aq0Var.D0(1);
                break;
            case 5:
                ((mw0) this.U).e();
                break;
            case 6:
                viewGroup4 = ((org.telegram.ui.ActionBar.f3) ((c41) this.U)).containerView;
                viewGroup4.invalidate();
                break;
            case 7:
                bb1 bb1Var = (bb1) this.U;
                float positionAnimated2 = bb1Var.i0.getPositionAnimated();
                bb1Var.n0(positionAnimated2, !z10);
                if (!z10) {
                    bb1Var.m0(Math.round(positionAnimated2), true);
                }
                bb1.W(bb1Var);
                bb1.Y(bb1Var);
                break;
            case 8:
                ((me1) this.U).e();
                break;
            case 9:
                viewGroup5 = ((org.telegram.ui.ActionBar.f3) ((org.telegram.ui.Wallet.h2) this.U)).containerView;
                viewGroup5.invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.Components.o91
    public void x(int i10) {
        switch (this.T) {
            case 10:
                org.telegram.ui.Wallet.a5 a5Var = (org.telegram.ui.Wallet.a5) this.U;
                a5Var.f0 = i10;
                if (i10 == 1) {
                    a5Var.n0.post(new org.telegram.ui.Wallet.f3(a5Var, 12));
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.o91
    public void z(int i10) {
        switch (this.T) {
            case 3:
                if (i10 == 0) {
                    zn znVar = (zn) this.U;
                    if (znVar.s1) {
                        znVar.s1 = false;
                        znVar.q1.h.clear();
                        break;
                    }
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h1(org.telegram.ui.ActionBar.n2 n2Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        super(context, e6Var);
        this.T = i10;
        this.U = n2Var;
    }
}
