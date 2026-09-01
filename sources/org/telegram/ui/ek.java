package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class ek extends org.telegram.ui.Components.m81 {
    public final /* synthetic */ int Q;
    public final /* synthetic */ Object R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ek(Object obj, Context context, int i10) {
        super(context, null);
        this.Q = i10;
        this.R = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ca A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Components.m81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean i(MotionEvent motionEvent) {
        int i10;
        View E;
        int R;
        switch (this.Q) {
            case 0:
                hk hkVar = ((xn) this.R).m1;
                return hkVar != null && hkVar.b > 0.5f;
            case 7:
                qh.d8 d8Var = (qh.d8) this.R;
                View currentView = d8Var.b.getCurrentView();
                if (!(currentView instanceof qh.x7)) {
                    return true;
                }
                if (getCurrentPosition() > 0) {
                    d8Var.f1();
                    return true;
                }
                qh.x7 x7Var = (qh.x7) currentView;
                ArrayList arrayList = x7Var.I;
                org.telegram.ui.Components.tl0 tl0Var = x7Var.f;
                if (x7Var.a == 0 && motionEvent != null && (E = tl0Var.E(motionEvent.getX(), motionEvent.getY() - x7Var.e.getPaddingTop())) != null && (R = RecyclerView.R(E)) >= 0 && R < arrayList.size()) {
                    qh.n7 n7Var = (qh.n7) arrayList.get(R);
                    if (n7Var.a == 3 && !n7Var.n) {
                        boolean z4 = LocaleController.isRTL;
                        float x10 = motionEvent.getX();
                        if (!z4 ? x10 > AndroidUtilities.dp(100.0f) : x10 < x7Var.getWidth() - AndroidUtilities.dp(100.0f)) {
                            i10 = n7Var.i;
                            if (i10 != -1) {
                                d8Var.J = i10;
                                if (i10 == 3) {
                                    if (!d8Var.n.isEmpty() && !d8Var.r.isEmpty()) {
                                        d8Var.K = i10;
                                    }
                                } else if (i10 != 4) {
                                    d8Var.K = i10;
                                } else if (!d8Var.d.isEmpty() && !d8Var.e.isEmpty()) {
                                    d8Var.K = i10;
                                }
                                x7Var.f(true);
                                x7Var.e(true);
                            }
                            if (i10 != -1) {
                                d8Var.f1();
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
            default:
                return super.i(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.m81
    public boolean j(MotionEvent motionEvent) {
        switch (this.Q) {
            case 8:
                return getCurrentPosition() != 2;
            default:
                return super.j(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.m81
    public boolean k(MotionEvent motionEvent) {
        switch (this.Q) {
            case 3:
                return false;
            case 8:
                return false;
            default:
                return super.k(motionEvent);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        switch (this.Q) {
            case 4:
                super.onLayout(z4, i10, i11, i12, i13);
                ha1.Y((ha1) this.R);
                break;
            default:
                super.onLayout(z4, i10, i11, i12, i13);
                break;
        }
    }

    @Override // org.telegram.ui.Components.m81, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.Q) {
            case 0:
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.m81
    public void t(View view, View view2, int i10, int i11) {
        boolean z4;
        switch (this.Q) {
            case 7:
                qh.d8 d8Var = (qh.d8) this.R;
                z4 = ((org.telegram.ui.ActionBar.h3) d8Var).keyboardVisible;
                if (z4) {
                    d8Var.f1();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.m81
    public void u() {
        switch (this.Q) {
            case 4:
                ha1 ha1Var = (ha1) this.R;
                ha1Var.m0(ha1Var.f0.getCurrentPosition(), true);
                ha1Var.n0(0.0f, false);
                ha1.W(ha1Var);
                break;
            case 8:
                if (getCurrentPosition() == 1) {
                    ((th.i0) this.R).v.d.V2.N(false);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.m81
    public void v() {
        j31 j31Var;
        switch (this.Q) {
            case 3:
                if ((getCurrentView() instanceof l31) && (j31Var = ((l31) getCurrentView()).n) != null) {
                    AndroidUtilities.hideKeyboard(j31Var);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.m81
    public final void w(boolean z4) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        switch (this.Q) {
            case 0:
                xn xnVar = (xn) this.R;
                xnVar.U0.getClass();
                xnVar.U0.getClass();
                xnVar.l7();
                xnVar.q9(1);
                break;
            case 1:
                ip0 ip0Var = (ip0) this.R;
                ip0Var.E.setSelected(ip0Var.y.getPositionAnimated());
                ip0Var.e.setProgressToGradient(1.0f - ip0Var.y.getPositionAnimated());
                break;
            case 2:
                ((tv0) this.R).e();
                break;
            case 3:
                viewGroup = ((org.telegram.ui.ActionBar.h3) ((m31) this.R)).containerView;
                viewGroup.invalidate();
                break;
            case 4:
                ha1 ha1Var = (ha1) this.R;
                float positionAnimated = ha1Var.f0.getPositionAnimated();
                ha1Var.n0(positionAnimated, !z4);
                if (!z4) {
                    ha1Var.m0(Math.round(positionAnimated), true);
                }
                ha1.W(ha1Var);
                ha1.Y(ha1Var);
                break;
            case 5:
                ((ud1) this.R).e();
                break;
            case 6:
                qh.y1 y1Var = (qh.y1) this.R;
                ek ekVar = y1Var.f;
                qh.x1 x1Var = y1Var.h;
                if (x1Var != null) {
                    x1Var.C = ekVar.getPositionAnimated();
                    x1Var.invalidate();
                }
                viewGroup2 = ((org.telegram.ui.ActionBar.h3) y1Var).containerView;
                viewGroup2.invalidate();
                invalidate();
                qh.y1.D = ekVar.getCurrentPosition();
                break;
            case 7:
                viewGroup3 = ((org.telegram.ui.ActionBar.h3) ((qh.d8) this.R)).containerView;
                viewGroup3.invalidate();
                break;
            default:
                viewGroup4 = ((org.telegram.ui.ActionBar.h3) ((th.i0) this.R)).containerView;
                viewGroup4.invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.Components.m81
    public void z(int i10) {
        switch (this.Q) {
            case 0:
                if (i10 == 0) {
                    xn xnVar = (xn) this.R;
                    if (xnVar.p1) {
                        xnVar.p1 = false;
                        xnVar.n1.h.clear();
                        break;
                    }
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ek(Context context, org.telegram.ui.ActionBar.g6 g6Var, xn xnVar) {
        super(context, g6Var);
        this.Q = 0;
        this.R = xnVar;
    }
}
