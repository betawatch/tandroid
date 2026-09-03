package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
                qh.c8 c8Var = (qh.c8) this.R;
                View currentView = c8Var.b.getCurrentView();
                if (!(currentView instanceof qh.w7)) {
                    return true;
                }
                if (getCurrentPosition() > 0) {
                    c8Var.f1();
                    return true;
                }
                qh.w7 w7Var = (qh.w7) currentView;
                ArrayList arrayList = w7Var.I;
                org.telegram.ui.Components.sl0 sl0Var = w7Var.f;
                if (w7Var.a == 0 && motionEvent != null && (E = sl0Var.E(motionEvent.getX(), motionEvent.getY() - w7Var.e.getPaddingTop())) != null && (R = RecyclerView.R(E)) >= 0 && R < arrayList.size()) {
                    qh.m7 m7Var = (qh.m7) arrayList.get(R);
                    if (m7Var.a == 3 && !m7Var.n) {
                        boolean z4 = LocaleController.isRTL;
                        float x10 = motionEvent.getX();
                        if (!z4 ? x10 > AndroidUtilities.dp(100.0f) : x10 < w7Var.getWidth() - AndroidUtilities.dp(100.0f)) {
                            i10 = m7Var.i;
                            if (i10 != -1) {
                                c8Var.J = i10;
                                if (i10 == 3) {
                                    if (!c8Var.n.isEmpty() && !c8Var.r.isEmpty()) {
                                        c8Var.K = i10;
                                    }
                                } else if (i10 != 4) {
                                    c8Var.K = i10;
                                } else if (!c8Var.d.isEmpty() && !c8Var.e.isEmpty()) {
                                    c8Var.K = i10;
                                }
                                w7Var.f(true);
                                w7Var.e(true);
                            }
                            if (i10 != -1) {
                                c8Var.f1();
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
                na1.Y((na1) this.R);
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
                qh.c8 c8Var = (qh.c8) this.R;
                z4 = ((org.telegram.ui.ActionBar.h3) c8Var).keyboardVisible;
                if (z4) {
                    c8Var.f1();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.l81
    public void u() {
        switch (this.Q) {
            case 4:
                na1 na1Var = (na1) this.R;
                na1Var.m0(na1Var.f0.getCurrentPosition(), true);
                na1Var.n0(0.0f, false);
                na1.W(na1Var);
                break;
            case 8:
                if (getCurrentPosition() == 1) {
                    ((th.i0) this.R).v.d.V2.N(false);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.l81
    public void v() {
        o31 o31Var;
        switch (this.Q) {
            case 3:
                if ((getCurrentView() instanceof p31) && (o31Var = ((p31) getCurrentView()).n) != null) {
                    AndroidUtilities.hideKeyboard(o31Var);
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
                np0 np0Var = (np0) this.R;
                float positionAnimated = np0Var.F.getPositionAnimated();
                np0Var.J.setSelected(positionAnimated);
                np0Var.e.setProgressToGradient(1.0f - k7.o.a((positionAnimated - 0.333333f) / 0.333333f, 0.0f, 1.0f));
                np0Var.G0();
                hp0 C0 = np0Var.C0();
                qh.d dVar = np0Var.N;
                if (dVar != null && C0 != null && C0 != np0Var.O) {
                    np0Var.O = C0;
                    n7.qa qaVar = C0.e;
                    dVar.g((CharSequence) qaVar.b, true, true);
                    np0Var.N.f((SpannableStringBuilder) qaVar.c, true);
                }
                np0Var.D0(1);
                break;
            case 2:
                ((yv0) this.R).e();
                break;
            case 3:
                viewGroup = ((org.telegram.ui.ActionBar.h3) ((q31) this.R)).containerView;
                viewGroup.invalidate();
                break;
            case 4:
                na1 na1Var = (na1) this.R;
                float positionAnimated2 = na1Var.f0.getPositionAnimated();
                na1Var.n0(positionAnimated2, !z4);
                if (!z4) {
                    na1Var.m0(Math.round(positionAnimated2), true);
                }
                na1.W(na1Var);
                na1.Y(na1Var);
                break;
            case 5:
                ((zd1) this.R).e();
                break;
            case 6:
                qh.x1 x1Var = (qh.x1) this.R;
                ek ekVar = x1Var.f;
                qh.w1 w1Var = x1Var.h;
                if (w1Var != null) {
                    w1Var.C = ekVar.getPositionAnimated();
                    w1Var.invalidate();
                }
                viewGroup2 = ((org.telegram.ui.ActionBar.h3) x1Var).containerView;
                viewGroup2.invalidate();
                invalidate();
                qh.x1.D = ekVar.getCurrentPosition();
                break;
            case 7:
                viewGroup3 = ((org.telegram.ui.ActionBar.h3) ((qh.c8) this.R)).containerView;
                viewGroup3.invalidate();
                break;
            default:
                viewGroup4 = ((org.telegram.ui.ActionBar.h3) ((th.i0) this.R)).containerView;
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
    public ek(Context context, org.telegram.ui.ActionBar.g6 g6Var, xn xnVar) {
        super(context, g6Var);
        this.Q = 0;
        this.R = xnVar;
    }
}
