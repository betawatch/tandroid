package ei;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.c91;
import org.telegram.ui.Components.im0;
import org.telegram.ui.ad1;
import org.telegram.ui.ek;
import org.telegram.ui.ep0;
import org.telegram.ui.kp0;
import org.telegram.ui.o21;
import org.telegram.ui.p21;
import org.telegram.ui.q21;
import org.telegram.ui.r91;
import org.telegram.ui.sn;
import org.telegram.ui.sv0;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class h1 extends c91 {
    public final /* synthetic */ int T;
    public final /* synthetic */ Object U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h1(Object obj, Context context, int i10) {
        super(context, null);
        this.T = i10;
        this.U = obj;
    }

    @Override // org.telegram.ui.Components.c91
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
    @Override // org.telegram.ui.Components.c91
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean i(MotionEvent motionEvent) {
        int i10;
        View E;
        int R;
        switch (this.T) {
            case 1:
                r9 r9Var = (r9) this.U;
                View currentView = r9Var.b.getCurrentView();
                if (!(currentView instanceof k9)) {
                    return true;
                }
                if (getCurrentPosition() > 0) {
                    r9Var.g1();
                    return true;
                }
                k9 k9Var = (k9) currentView;
                ArrayList arrayList = k9Var.L;
                im0 im0Var = k9Var.f;
                if (k9Var.a == 0 && motionEvent != null && (E = im0Var.E(motionEvent.getX(), motionEvent.getY() - k9Var.e.getPaddingTop())) != null && (R = RecyclerView.R(E)) >= 0 && R < arrayList.size()) {
                    y8 y8Var = (y8) arrayList.get(R);
                    if (y8Var.a == 3 && !y8Var.n) {
                        boolean z10 = LocaleController.isRTL;
                        float x10 = motionEvent.getX();
                        if (!z10 ? x10 > AndroidUtilities.dp(100.0f) : x10 < k9Var.getWidth() - AndroidUtilities.dp(100.0f)) {
                            i10 = y8Var.i;
                            if (i10 != -1) {
                                r9Var.M = i10;
                                if (i10 == 3) {
                                    if (!r9Var.n.isEmpty() && !r9Var.r.isEmpty()) {
                                        r9Var.N = i10;
                                    }
                                } else if (i10 != 4) {
                                    r9Var.N = i10;
                                } else if (!r9Var.d.isEmpty() && !r9Var.e.isEmpty()) {
                                    r9Var.N = i10;
                                }
                                k9Var.f(true);
                                k9Var.e(true);
                            }
                            if (i10 != -1) {
                                r9Var.g1();
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
                ek ekVar = ((sn) this.U).p1;
                return ekVar != null && ekVar.b > 0.5f;
        }
    }

    @Override // org.telegram.ui.Components.c91
    public boolean j(MotionEvent motionEvent) {
        switch (this.T) {
            case 2:
                return getCurrentPosition() != 2;
            default:
                return super.j(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.c91
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
                r91.Y((r91) this.U);
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override // org.telegram.ui.Components.c91, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.T) {
            case 3:
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.c91
    public void t(View view, View view2, int i10, int i11) {
        boolean z10;
        switch (this.T) {
            case 1:
                r9 r9Var = (r9) this.U;
                z10 = ((org.telegram.ui.ActionBar.f3) r9Var).keyboardVisible;
                if (z10) {
                    r9Var.g1();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.c91
    public void u() {
        switch (this.T) {
            case 2:
                if (getCurrentPosition() == 1) {
                    ((hi.k0) this.U).v.d.W2.N(false);
                    break;
                }
                break;
            case 7:
                r91 r91Var = (r91) this.U;
                r91Var.m0(r91Var.i0.getCurrentPosition(), true);
                r91Var.n0(0.0f, false);
                r91.W(r91Var);
                break;
        }
    }

    @Override // org.telegram.ui.Components.c91
    public void v() {
        o21 o21Var;
        switch (this.T) {
            case 6:
                if ((getCurrentView() instanceof p21) && (o21Var = ((p21) getCurrentView()).n) != null) {
                    AndroidUtilities.hideKeyboard(o21Var);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.c91
    public final void w(boolean z10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        ViewGroup viewGroup5;
        switch (this.T) {
            case 0:
                n2 n2Var = (n2) this.U;
                h1 h1Var = n2Var.f;
                m2 m2Var = n2Var.h;
                if (m2Var != null) {
                    m2Var.F = h1Var.getPositionAnimated();
                    m2Var.invalidate();
                }
                viewGroup = ((org.telegram.ui.ActionBar.f3) n2Var).containerView;
                viewGroup.invalidate();
                invalidate();
                n2.G = h1Var.getCurrentPosition();
                break;
            case 1:
                viewGroup2 = ((org.telegram.ui.ActionBar.f3) ((r9) this.U)).containerView;
                viewGroup2.invalidate();
                break;
            case 2:
                viewGroup3 = ((org.telegram.ui.ActionBar.f3) ((hi.k0) this.U)).containerView;
                viewGroup3.invalidate();
                break;
            case 3:
                sn snVar = (sn) this.U;
                snVar.X0.getClass();
                snVar.X0.getClass();
                snVar.o7();
                snVar.v9(1);
                break;
            case 4:
                kp0 kp0Var = (kp0) this.U;
                float positionAnimated = kp0Var.I.getPositionAnimated();
                kp0Var.M.setSelected(positionAnimated);
                kp0Var.e.setProgressToGradient(1.0f - w7.r.a((positionAnimated - 0.333333f) / 0.333333f, 0.0f, 1.0f));
                kp0Var.G0();
                ep0 C0 = kp0Var.C0();
                d dVar = kp0Var.Q;
                if (dVar != null && C0 != null && C0 != kp0Var.R) {
                    kp0Var.R = C0;
                    n2.e eVar = C0.e;
                    dVar.g((CharSequence) eVar.b, true, true);
                    kp0Var.Q.f((SpannableStringBuilder) eVar.c, true);
                }
                kp0Var.D0(1);
                break;
            case 5:
                ((sv0) this.U).e();
                break;
            case 6:
                viewGroup4 = ((org.telegram.ui.ActionBar.f3) ((q21) this.U)).containerView;
                viewGroup4.invalidate();
                break;
            case 7:
                r91 r91Var = (r91) this.U;
                float positionAnimated2 = r91Var.i0.getPositionAnimated();
                r91Var.n0(positionAnimated2, !z10);
                if (!z10) {
                    r91Var.m0(Math.round(positionAnimated2), true);
                }
                r91.W(r91Var);
                r91.Y(r91Var);
                break;
            case 8:
                ((ad1) this.U).e();
                break;
            case 9:
                viewGroup5 = ((org.telegram.ui.ActionBar.f3) ((org.telegram.ui.Wallet.j2) this.U)).containerView;
                viewGroup5.invalidate();
                break;
            default:
                org.telegram.ui.Wallet.n5 n5Var = (org.telegram.ui.Wallet.n5) this.U;
                n5Var.S0();
                org.telegram.ui.Wallet.t7 t7Var = n5Var.i0;
                if (t7Var != null && t7Var.h1) {
                    t7Var.f0();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.c91
    public void x(int i10) {
        org.telegram.ui.Wallet.n8 n8Var;
        switch (this.T) {
            case 10:
                org.telegram.ui.Wallet.n5 n5Var = (org.telegram.ui.Wallet.n5) this.U;
                n5Var.d0 = i10;
                if (i10 != 1 && (n8Var = n5Var.h0) != null) {
                    n8Var.b(false);
                }
                if (i10 == 1) {
                    n5Var.o0.post(new org.telegram.ui.Wallet.o3(n5Var, 12));
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.c91
    public void z(int i10) {
        switch (this.T) {
            case 3:
                if (i10 == 0) {
                    sn snVar = (sn) this.U;
                    if (snVar.s1) {
                        snVar.s1 = false;
                        snVar.q1.h.clear();
                        break;
                    }
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h1(org.telegram.ui.ActionBar.n2 n2Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        super(context, d6Var);
        this.T = i10;
        this.U = n2Var;
    }
}
