package kh;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.n71;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.dd1;
import org.telegram.ui.iv0;
import org.telegram.ui.qn;
import org.telegram.ui.s91;
import org.telegram.ui.v21;
import org.telegram.ui.x21;
import org.telegram.ui.y21;
import org.telegram.ui.yj;
import org.telegram.ui.zo0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class j1 extends n71 {
    public final /* synthetic */ int P;
    public final /* synthetic */ Object Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j1(Object obj, Context context, int i9) {
        super(context, null);
        this.P = i9;
        this.Q = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00de A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Components.n71
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean i(MotionEvent motionEvent) {
        int i9;
        View E;
        int R;
        switch (this.P) {
            case 1:
                t9 t9Var = (t9) this.Q;
                View currentView = t9Var.b.getCurrentView();
                if (!(currentView instanceof n9)) {
                    return true;
                }
                if (getCurrentPosition() > 0) {
                    t9Var.f1();
                    return true;
                }
                n9 n9Var = (n9) currentView;
                ArrayList arrayList = n9Var.H;
                wk0 wk0Var = n9Var.f;
                if (n9Var.a == 0 && motionEvent != null && (E = wk0Var.E(motionEvent.getX(), motionEvent.getY() - n9Var.e.getPaddingTop())) != null && (R = RecyclerView.R(E)) >= 0 && R < arrayList.size()) {
                    a9 a9Var = (a9) arrayList.get(R);
                    if (a9Var.a == 3 && !a9Var.n) {
                        boolean z10 = LocaleController.isRTL;
                        float x10 = motionEvent.getX();
                        if (!z10 ? x10 > AndroidUtilities.dp(100.0f) : x10 < n9Var.getWidth() - AndroidUtilities.dp(100.0f)) {
                            i9 = a9Var.i;
                            if (i9 != -1) {
                                t9Var.I = i9;
                                if (i9 == 3) {
                                    if (!t9Var.n.isEmpty() && !t9Var.r.isEmpty()) {
                                        t9Var.J = i9;
                                    }
                                } else if (i9 != 4) {
                                    t9Var.J = i9;
                                } else if (!t9Var.d.isEmpty() && !t9Var.e.isEmpty()) {
                                    t9Var.J = i9;
                                }
                                n9Var.f(true);
                                n9Var.e(true);
                            }
                            if (i9 != -1) {
                                t9Var.f1();
                            }
                            return i9 == -1;
                        }
                    }
                }
                i9 = -1;
                if (i9 != -1) {
                }
                if (i9 != -1) {
                }
                if (i9 == -1) {
                }
                break;
            case 2:
            default:
                return super.i(motionEvent);
            case 3:
                yj yjVar = ((qn) this.Q).l1;
                return yjVar != null && yjVar.b > 0.5f;
        }
    }

    @Override // org.telegram.ui.Components.n71
    public boolean j(MotionEvent motionEvent) {
        switch (this.P) {
            case 2:
                return getCurrentPosition() != 2;
            default:
                return super.j(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.n71
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
    public void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        switch (this.P) {
            case 7:
                super.onLayout(z10, i9, i10, i11, i12);
                s91.X((s91) this.Q);
                break;
            default:
                super.onLayout(z10, i9, i10, i11, i12);
                break;
        }
    }

    @Override // org.telegram.ui.Components.n71, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.P) {
            case 3:
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.n71
    public void t(View view, View view2, int i9, int i10) {
        boolean z10;
        switch (this.P) {
            case 1:
                t9 t9Var = (t9) this.Q;
                z10 = ((org.telegram.ui.ActionBar.f3) t9Var).keyboardVisible;
                if (z10) {
                    t9Var.f1();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.n71
    public void u() {
        switch (this.P) {
            case 2:
                if (getCurrentPosition() == 1) {
                    ((nh.j0) this.Q).v.d.U2.N(false);
                    break;
                }
                break;
            case 7:
                s91 s91Var = (s91) this.Q;
                s91Var.l0(s91Var.e0.getCurrentPosition(), true);
                s91Var.m0(0.0f, false);
                s91.V(s91Var);
                break;
        }
    }

    @Override // org.telegram.ui.Components.n71
    public void v() {
        v21 v21Var;
        switch (this.P) {
            case 6:
                if ((getCurrentView() instanceof x21) && (v21Var = ((x21) getCurrentView()).n) != null) {
                    AndroidUtilities.hideKeyboard(v21Var);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.n71
    public final void w(boolean z10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        switch (this.P) {
            case 0:
                n2 n2Var = (n2) this.Q;
                j1 j1Var = n2Var.f;
                m2 m2Var = n2Var.h;
                if (m2Var != null) {
                    m2Var.B = j1Var.getPositionAnimated();
                    m2Var.invalidate();
                }
                viewGroup = ((org.telegram.ui.ActionBar.f3) n2Var).containerView;
                viewGroup.invalidate();
                invalidate();
                n2.C = j1Var.getCurrentPosition();
                break;
            case 1:
                viewGroup2 = ((org.telegram.ui.ActionBar.f3) ((t9) this.Q)).containerView;
                viewGroup2.invalidate();
                break;
            case 2:
                viewGroup3 = ((org.telegram.ui.ActionBar.f3) ((nh.j0) this.Q)).containerView;
                viewGroup3.invalidate();
                break;
            case 3:
                qn qnVar = (qn) this.Q;
                qnVar.T0.getClass();
                qnVar.T0.getClass();
                qnVar.l7();
                qnVar.q9(1);
                break;
            case 4:
                zo0 zo0Var = (zo0) this.Q;
                zo0Var.D.setSelected(zo0Var.y.getPositionAnimated());
                zo0Var.e.setProgressToGradient(1.0f - zo0Var.y.getPositionAnimated());
                break;
            case 5:
                ((iv0) this.Q).e();
                break;
            case 6:
                viewGroup4 = ((org.telegram.ui.ActionBar.f3) ((y21) this.Q)).containerView;
                viewGroup4.invalidate();
                break;
            case 7:
                s91 s91Var = (s91) this.Q;
                float positionAnimated = s91Var.e0.getPositionAnimated();
                s91Var.m0(positionAnimated, !z10);
                if (!z10) {
                    s91Var.l0(Math.round(positionAnimated), true);
                }
                s91.V(s91Var);
                s91.X(s91Var);
                break;
            default:
                ((dd1) this.Q).e();
                break;
        }
    }

    @Override // org.telegram.ui.Components.n71
    public void z(int i9) {
        switch (this.P) {
            case 3:
                if (i9 == 0) {
                    qn qnVar = (qn) this.Q;
                    if (qnVar.o1) {
                        qnVar.o1 = false;
                        qnVar.m1.h.clear();
                        break;
                    }
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(Context context, org.telegram.ui.ActionBar.b6 b6Var, qn qnVar) {
        super(context, b6Var);
        this.P = 3;
        this.Q = qnVar;
    }
}
