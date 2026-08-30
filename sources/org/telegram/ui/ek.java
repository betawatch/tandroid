package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ek extends org.telegram.ui.Components.l81 {
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
    @Override // org.telegram.ui.Components.l81
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
                ph.f8 f8Var = (ph.f8) this.R;
                View currentView = f8Var.b.getCurrentView();
                if (!(currentView instanceof ph.z7)) {
                    return true;
                }
                if (getCurrentPosition() > 0) {
                    f8Var.f1();
                    return true;
                }
                ph.z7 z7Var = (ph.z7) currentView;
                ArrayList arrayList = z7Var.I;
                org.telegram.ui.Components.sl0 sl0Var = z7Var.f;
                if (z7Var.a == 0 && motionEvent != null && (E = sl0Var.E(motionEvent.getX(), motionEvent.getY() - z7Var.e.getPaddingTop())) != null && (R = RecyclerView.R(E)) >= 0 && R < arrayList.size()) {
                    ph.p7 p7Var = (ph.p7) arrayList.get(R);
                    if (p7Var.a == 3 && !p7Var.n) {
                        boolean z4 = LocaleController.isRTL;
                        float x10 = motionEvent.getX();
                        if (!z4 ? x10 > AndroidUtilities.dp(100.0f) : x10 < z7Var.getWidth() - AndroidUtilities.dp(100.0f)) {
                            i10 = p7Var.i;
                            if (i10 != -1) {
                                f8Var.J = i10;
                                if (i10 == 3) {
                                    if (!f8Var.n.isEmpty() && !f8Var.r.isEmpty()) {
                                        f8Var.K = i10;
                                    }
                                } else if (i10 != 4) {
                                    f8Var.K = i10;
                                } else if (!f8Var.d.isEmpty() && !f8Var.e.isEmpty()) {
                                    f8Var.K = i10;
                                }
                                z7Var.f(true);
                                z7Var.e(true);
                            }
                            if (i10 != -1) {
                                f8Var.f1();
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

    @Override // org.telegram.ui.Components.l81
    public boolean j(MotionEvent motionEvent) {
        switch (this.Q) {
            case 8:
                return getCurrentPosition() != 2;
            default:
                return super.j(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.l81
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
                ga1.Y((ga1) this.R);
                break;
            default:
                super.onLayout(z4, i10, i11, i12, i13);
                break;
        }
    }

    @Override // org.telegram.ui.Components.l81, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.Q) {
            case 0:
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.l81
    public void t(View view, View view2, int i10, int i11) {
        boolean z4;
        switch (this.Q) {
            case 7:
                ph.f8 f8Var = (ph.f8) this.R;
                z4 = ((org.telegram.ui.ActionBar.g3) f8Var).keyboardVisible;
                if (z4) {
                    f8Var.f1();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.l81
    public void u() {
        switch (this.Q) {
            case 4:
                ga1 ga1Var = (ga1) this.R;
                ga1Var.m0(ga1Var.f0.getCurrentPosition(), true);
                ga1Var.n0(0.0f, false);
                ga1.W(ga1Var);
                break;
            case 8:
                if (getCurrentPosition() == 1) {
                    ((sh.i0) this.R).v.d.V2.N(false);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.l81
    public void v() {
        h31 h31Var;
        switch (this.Q) {
            case 3:
                if ((getCurrentView() instanceof j31) && (h31Var = ((j31) getCurrentView()).n) != null) {
                    AndroidUtilities.hideKeyboard(h31Var);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.l81
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
                gp0 gp0Var = (gp0) this.R;
                gp0Var.E.setSelected(gp0Var.y.getPositionAnimated());
                gp0Var.e.setProgressToGradient(1.0f - gp0Var.y.getPositionAnimated());
                break;
            case 2:
                ((rv0) this.R).e();
                break;
            case 3:
                viewGroup = ((org.telegram.ui.ActionBar.g3) ((k31) this.R)).containerView;
                viewGroup.invalidate();
                break;
            case 4:
                ga1 ga1Var = (ga1) this.R;
                float positionAnimated = ga1Var.f0.getPositionAnimated();
                ga1Var.n0(positionAnimated, !z4);
                if (!z4) {
                    ga1Var.m0(Math.round(positionAnimated), true);
                }
                ga1.W(ga1Var);
                ga1.Y(ga1Var);
                break;
            case 5:
                ((rd1) this.R).e();
                break;
            case 6:
                ph.y1 y1Var = (ph.y1) this.R;
                ek ekVar = y1Var.f;
                ph.x1 x1Var = y1Var.h;
                if (x1Var != null) {
                    x1Var.C = ekVar.getPositionAnimated();
                    x1Var.invalidate();
                }
                viewGroup2 = ((org.telegram.ui.ActionBar.g3) y1Var).containerView;
                viewGroup2.invalidate();
                invalidate();
                ph.y1.D = ekVar.getCurrentPosition();
                break;
            case 7:
                viewGroup3 = ((org.telegram.ui.ActionBar.g3) ((ph.f8) this.R)).containerView;
                viewGroup3.invalidate();
                break;
            default:
                viewGroup4 = ((org.telegram.ui.ActionBar.g3) ((sh.i0) this.R)).containerView;
                viewGroup4.invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.Components.l81
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
    public ek(Context context, org.telegram.ui.ActionBar.f6 f6Var, xn xnVar) {
        super(context, f6Var);
        this.Q = 0;
        this.R = xnVar;
    }
}
