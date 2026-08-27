package lh;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.p71;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.ak;
import org.telegram.ui.ap0;
import org.telegram.ui.dd1;
import org.telegram.ui.jv0;
import org.telegram.ui.q91;
import org.telegram.ui.rn;
import org.telegram.ui.u21;
import org.telegram.ui.w21;
import org.telegram.ui.x21;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class h1 extends p71 {
    public final /* synthetic */ int P;
    public final /* synthetic */ Object Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h1(Object obj, Context context, int i10) {
        super(context, null);
        this.P = i10;
        this.Q = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00de A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Components.p71
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean i(MotionEvent motionEvent) {
        int i10;
        View E;
        int R;
        switch (this.P) {
            case 1:
                q9 q9Var = (q9) this.Q;
                View currentView = q9Var.b.getCurrentView();
                if (!(currentView instanceof k9)) {
                    return true;
                }
                if (getCurrentPosition() > 0) {
                    q9Var.f1();
                    return true;
                }
                k9 k9Var = (k9) currentView;
                ArrayList arrayList = k9Var.H;
                zk0 zk0Var = k9Var.f;
                if (k9Var.a == 0 && motionEvent != null && (E = zk0Var.E(motionEvent.getX(), motionEvent.getY() - k9Var.e.getPaddingTop())) != null && (R = RecyclerView.R(E)) >= 0 && R < arrayList.size()) {
                    x8 x8Var = (x8) arrayList.get(R);
                    if (x8Var.a == 3 && !x8Var.n) {
                        boolean z10 = LocaleController.isRTL;
                        float x8 = motionEvent.getX();
                        if (!z10 ? x8 > AndroidUtilities.dp(100.0f) : x8 < k9Var.getWidth() - AndroidUtilities.dp(100.0f)) {
                            i10 = x8Var.i;
                            if (i10 != -1) {
                                q9Var.I = i10;
                                if (i10 == 3) {
                                    if (!q9Var.n.isEmpty() && !q9Var.r.isEmpty()) {
                                        q9Var.J = i10;
                                    }
                                } else if (i10 != 4) {
                                    q9Var.J = i10;
                                } else if (!q9Var.d.isEmpty() && !q9Var.e.isEmpty()) {
                                    q9Var.J = i10;
                                }
                                k9Var.f(true);
                                k9Var.e(true);
                            }
                            if (i10 != -1) {
                                q9Var.f1();
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
                ak akVar = ((rn) this.Q).l1;
                return akVar != null && akVar.b > 0.5f;
        }
    }

    @Override // org.telegram.ui.Components.p71
    public boolean j(MotionEvent motionEvent) {
        switch (this.P) {
            case 2:
                return getCurrentPosition() != 2;
            default:
                return super.j(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.p71
    public boolean k(MotionEvent motionEvent) {
        switch (this.P) {
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
        switch (this.P) {
            case 7:
                super.onLayout(z10, i10, i11, i12, i13);
                q91.Y((q91) this.Q);
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override // org.telegram.ui.Components.p71, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.P) {
            case 3:
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.p71
    public void t(View view, View view2, int i10, int i11) {
        boolean z10;
        switch (this.P) {
            case 1:
                q9 q9Var = (q9) this.Q;
                z10 = ((org.telegram.ui.ActionBar.e3) q9Var).keyboardVisible;
                if (z10) {
                    q9Var.f1();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.p71
    public void u() {
        switch (this.P) {
            case 2:
                if (getCurrentPosition() == 1) {
                    ((oh.j0) this.Q).v.d.U2.N(false);
                    break;
                }
                break;
            case 7:
                q91 q91Var = (q91) this.Q;
                q91Var.m0(q91Var.e0.getCurrentPosition(), true);
                q91Var.n0(0.0f, false);
                q91.W(q91Var);
                break;
        }
    }

    @Override // org.telegram.ui.Components.p71
    public void v() {
        u21 u21Var;
        switch (this.P) {
            case 6:
                if ((getCurrentView() instanceof w21) && (u21Var = ((w21) getCurrentView()).n) != null) {
                    AndroidUtilities.hideKeyboard(u21Var);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.p71
    public final void w(boolean z10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        switch (this.P) {
            case 0:
                l2 l2Var = (l2) this.Q;
                h1 h1Var = l2Var.f;
                k2 k2Var = l2Var.h;
                if (k2Var != null) {
                    k2Var.B = h1Var.getPositionAnimated();
                    k2Var.invalidate();
                }
                viewGroup = ((org.telegram.ui.ActionBar.e3) l2Var).containerView;
                viewGroup.invalidate();
                invalidate();
                l2.C = h1Var.getCurrentPosition();
                break;
            case 1:
                viewGroup2 = ((org.telegram.ui.ActionBar.e3) ((q9) this.Q)).containerView;
                viewGroup2.invalidate();
                break;
            case 2:
                viewGroup3 = ((org.telegram.ui.ActionBar.e3) ((oh.j0) this.Q)).containerView;
                viewGroup3.invalidate();
                break;
            case 3:
                rn rnVar = (rn) this.Q;
                rnVar.T0.getClass();
                rnVar.T0.getClass();
                rnVar.l7();
                rnVar.q9(1);
                break;
            case 4:
                ap0 ap0Var = (ap0) this.Q;
                ap0Var.D.setSelected(ap0Var.y.getPositionAnimated());
                ap0Var.e.setProgressToGradient(1.0f - ap0Var.y.getPositionAnimated());
                break;
            case 5:
                ((jv0) this.Q).e();
                break;
            case 6:
                viewGroup4 = ((org.telegram.ui.ActionBar.e3) ((x21) this.Q)).containerView;
                viewGroup4.invalidate();
                break;
            case 7:
                q91 q91Var = (q91) this.Q;
                float positionAnimated = q91Var.e0.getPositionAnimated();
                q91Var.n0(positionAnimated, !z10);
                if (!z10) {
                    q91Var.m0(Math.round(positionAnimated), true);
                }
                q91.W(q91Var);
                q91.Y(q91Var);
                break;
            default:
                ((dd1) this.Q).e();
                break;
        }
    }

    @Override // org.telegram.ui.Components.p71
    public void z(int i10) {
        switch (this.P) {
            case 3:
                if (i10 == 0) {
                    rn rnVar = (rn) this.Q;
                    if (rnVar.o1) {
                        rnVar.o1 = false;
                        rnVar.m1.h.clear();
                        break;
                    }
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(Context context, org.telegram.ui.ActionBar.c6 c6Var, rn rnVar) {
        super(context, c6Var);
        this.P = 3;
        this.Q = rnVar;
    }
}
