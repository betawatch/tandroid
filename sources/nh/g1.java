package nh;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.z71;
import org.telegram.ui.bk;
import org.telegram.ui.fd1;
import org.telegram.ui.iv0;
import org.telegram.ui.t91;
import org.telegram.ui.tn;
import org.telegram.ui.v21;
import org.telegram.ui.x21;
import org.telegram.ui.y21;
import org.telegram.ui.yo0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class g1 extends z71 {
    public final /* synthetic */ int P;
    public final /* synthetic */ Object Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g1(Object obj, Context context, int i10) {
        super(context, null);
        this.P = i10;
        this.Q = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00de A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Components.z71
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean i(MotionEvent motionEvent) {
        int i10;
        View E;
        int R;
        switch (this.P) {
            case 1:
                e9 e9Var = (e9) this.Q;
                View currentView = e9Var.b.getCurrentView();
                if (!(currentView instanceof y8)) {
                    return true;
                }
                if (getCurrentPosition() > 0) {
                    e9Var.f1();
                    return true;
                }
                y8 y8Var = (y8) currentView;
                ArrayList arrayList = y8Var.H;
                jl0 jl0Var = y8Var.f;
                if (y8Var.a == 0 && motionEvent != null && (E = jl0Var.E(motionEvent.getX(), motionEvent.getY() - y8Var.e.getPaddingTop())) != null && (R = RecyclerView.R(E)) >= 0 && R < arrayList.size()) {
                    m8 m8Var = (m8) arrayList.get(R);
                    if (m8Var.a == 3 && !m8Var.n) {
                        boolean z10 = LocaleController.isRTL;
                        float x4 = motionEvent.getX();
                        if (!z10 ? x4 > AndroidUtilities.dp(100.0f) : x4 < y8Var.getWidth() - AndroidUtilities.dp(100.0f)) {
                            i10 = m8Var.i;
                            if (i10 != -1) {
                                e9Var.I = i10;
                                if (i10 == 3) {
                                    if (!e9Var.n.isEmpty() && !e9Var.r.isEmpty()) {
                                        e9Var.J = i10;
                                    }
                                } else if (i10 != 4) {
                                    e9Var.J = i10;
                                } else if (!e9Var.d.isEmpty() && !e9Var.e.isEmpty()) {
                                    e9Var.J = i10;
                                }
                                y8Var.f(true);
                                y8Var.e(true);
                            }
                            if (i10 != -1) {
                                e9Var.f1();
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
                bk bkVar = ((tn) this.Q).l1;
                return bkVar != null && bkVar.b > 0.5f;
            default:
                return super.i(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.z71
    public boolean j(MotionEvent motionEvent) {
        switch (this.P) {
            case 8:
                return getCurrentPosition() != 2;
            default:
                return super.j(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.z71
    public boolean k(MotionEvent motionEvent) {
        switch (this.P) {
            case 5:
                return false;
            case 8:
                return false;
            default:
                return super.k(motionEvent);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.P) {
            case 6:
                super.onLayout(z10, i10, i11, i12, i13);
                t91.Y((t91) this.Q);
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override // org.telegram.ui.Components.z71, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.P) {
            case 2:
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.z71
    public void t(View view, View view2, int i10, int i11) {
        boolean z10;
        switch (this.P) {
            case 1:
                e9 e9Var = (e9) this.Q;
                z10 = ((org.telegram.ui.ActionBar.f3) e9Var).keyboardVisible;
                if (z10) {
                    e9Var.f1();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.z71
    public void u() {
        switch (this.P) {
            case 6:
                t91 t91Var = (t91) this.Q;
                t91Var.m0(t91Var.e0.getCurrentPosition(), true);
                t91Var.n0(0.0f, false);
                t91.W(t91Var);
                break;
            case 8:
                if (getCurrentPosition() == 1) {
                    ((qh.i0) this.Q).v.d.U2.N(false);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.z71
    public void v() {
        v21 v21Var;
        switch (this.P) {
            case 5:
                if ((getCurrentView() instanceof x21) && (v21Var = ((x21) getCurrentView()).n) != null) {
                    AndroidUtilities.hideKeyboard(v21Var);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.z71
    public final void w(boolean z10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        switch (this.P) {
            case 0:
                k2 k2Var = (k2) this.Q;
                g1 g1Var = k2Var.f;
                j2 j2Var = k2Var.h;
                if (j2Var != null) {
                    j2Var.B = g1Var.getPositionAnimated();
                    j2Var.invalidate();
                }
                viewGroup = ((org.telegram.ui.ActionBar.f3) k2Var).containerView;
                viewGroup.invalidate();
                invalidate();
                k2.C = g1Var.getCurrentPosition();
                break;
            case 1:
                viewGroup2 = ((org.telegram.ui.ActionBar.f3) ((e9) this.Q)).containerView;
                viewGroup2.invalidate();
                break;
            case 2:
                tn tnVar = (tn) this.Q;
                tnVar.T0.getClass();
                tnVar.T0.getClass();
                tnVar.l7();
                tnVar.q9(1);
                break;
            case 3:
                yo0 yo0Var = (yo0) this.Q;
                yo0Var.D.setSelected(yo0Var.y.getPositionAnimated());
                yo0Var.e.setProgressToGradient(1.0f - yo0Var.y.getPositionAnimated());
                break;
            case 4:
                ((iv0) this.Q).e();
                break;
            case 5:
                viewGroup3 = ((org.telegram.ui.ActionBar.f3) ((y21) this.Q)).containerView;
                viewGroup3.invalidate();
                break;
            case 6:
                t91 t91Var = (t91) this.Q;
                float positionAnimated = t91Var.e0.getPositionAnimated();
                t91Var.n0(positionAnimated, !z10);
                if (!z10) {
                    t91Var.m0(Math.round(positionAnimated), true);
                }
                t91.W(t91Var);
                t91.Y(t91Var);
                break;
            case 7:
                ((fd1) this.Q).e();
                break;
            default:
                viewGroup4 = ((org.telegram.ui.ActionBar.f3) ((qh.i0) this.Q)).containerView;
                viewGroup4.invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.Components.z71
    public void z(int i10) {
        switch (this.P) {
            case 2:
                if (i10 == 0) {
                    tn tnVar = (tn) this.Q;
                    if (tnVar.o1) {
                        tnVar.o1 = false;
                        tnVar.m1.h.clear();
                        break;
                    }
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(Context context, org.telegram.ui.ActionBar.c6 c6Var, tn tnVar) {
        super(context, c6Var);
        this.P = 2;
        this.Q = tnVar;
    }
}
