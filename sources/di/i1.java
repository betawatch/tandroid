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
import org.telegram.ui.Components.i81;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.bb1;
import org.telegram.ui.bq0;
import org.telegram.ui.c41;
import org.telegram.ui.co;
import org.telegram.ui.d41;
import org.telegram.ui.e41;
import org.telegram.ui.kk;
import org.telegram.ui.le1;
import org.telegram.ui.lw0;
import org.telegram.ui.vp0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class i1 extends i81 {
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
    @Override // org.telegram.ui.Components.i81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean i(MotionEvent motionEvent) {
        int i10;
        View E;
        int R;
        switch (this.T) {
            case 1:
                ia iaVar = (ia) this.U;
                View currentView = iaVar.b.getCurrentView();
                if (!(currentView instanceof ba)) {
                    return true;
                }
                if (getCurrentPosition() > 0) {
                    iaVar.f1();
                    return true;
                }
                ba baVar = (ba) currentView;
                ArrayList arrayList = baVar.L;
                ll0 ll0Var = baVar.f;
                if (baVar.a == 0 && motionEvent != null && (E = ll0Var.E(motionEvent.getX(), motionEvent.getY() - baVar.e.getPaddingTop())) != null && (R = RecyclerView.R(E)) >= 0 && R < arrayList.size()) {
                    m9 m9Var = (m9) arrayList.get(R);
                    if (m9Var.a == 3 && !m9Var.n) {
                        boolean z10 = LocaleController.isRTL;
                        float x10 = motionEvent.getX();
                        if (!z10 ? x10 > AndroidUtilities.dp(100.0f) : x10 < baVar.getWidth() - AndroidUtilities.dp(100.0f)) {
                            i10 = m9Var.i;
                            if (i10 != -1) {
                                iaVar.M = i10;
                                if (i10 == 3) {
                                    if (!iaVar.n.isEmpty() && !iaVar.r.isEmpty()) {
                                        iaVar.N = i10;
                                    }
                                } else if (i10 != 4) {
                                    iaVar.N = i10;
                                } else if (!iaVar.d.isEmpty() && !iaVar.e.isEmpty()) {
                                    iaVar.N = i10;
                                }
                                baVar.f(true);
                                baVar.e(true);
                            }
                            if (i10 != -1) {
                                iaVar.f1();
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
                kk kkVar = ((co) this.U).p1;
                return kkVar != null && kkVar.b > 0.5f;
        }
    }

    @Override // org.telegram.ui.Components.i81
    public boolean j(MotionEvent motionEvent) {
        switch (this.T) {
            case 2:
                return getCurrentPosition() != 2;
            default:
                return super.j(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.i81
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

    @Override // org.telegram.ui.Components.i81, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.T) {
            case 3:
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.i81
    public void t(View view, View view2, int i10, int i11) {
        boolean z10;
        switch (this.T) {
            case 1:
                ia iaVar = (ia) this.U;
                z10 = ((org.telegram.ui.ActionBar.f3) iaVar).keyboardVisible;
                if (z10) {
                    iaVar.f1();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.i81
    public void u() {
        switch (this.T) {
            case 2:
                if (getCurrentPosition() == 1) {
                    ((gi.k0) this.U).v.d.Y2.N(false);
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

    @Override // org.telegram.ui.Components.i81
    public void v() {
        c41 c41Var;
        switch (this.T) {
            case 6:
                if ((getCurrentView() instanceof d41) && (c41Var = ((d41) getCurrentView()).n) != null) {
                    AndroidUtilities.hideKeyboard(c41Var);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.i81
    public final void w(boolean z10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        switch (this.T) {
            case 0:
                t2 t2Var = (t2) this.U;
                i1 i1Var = t2Var.f;
                s2 s2Var = t2Var.h;
                if (s2Var != null) {
                    s2Var.F = i1Var.getPositionAnimated();
                    s2Var.invalidate();
                }
                viewGroup = ((org.telegram.ui.ActionBar.f3) t2Var).containerView;
                viewGroup.invalidate();
                invalidate();
                t2.G = i1Var.getCurrentPosition();
                break;
            case 1:
                viewGroup2 = ((org.telegram.ui.ActionBar.f3) ((ia) this.U)).containerView;
                viewGroup2.invalidate();
                break;
            case 2:
                viewGroup3 = ((org.telegram.ui.ActionBar.f3) ((gi.k0) this.U)).containerView;
                viewGroup3.invalidate();
                break;
            case 3:
                co coVar = (co) this.U;
                coVar.X0.getClass();
                coVar.X0.getClass();
                coVar.l7();
                coVar.q9(1);
                break;
            case 4:
                bq0 bq0Var = (bq0) this.U;
                float positionAnimated = bq0Var.I.getPositionAnimated();
                bq0Var.M.setSelected(positionAnimated);
                bq0Var.e.setProgressToGradient(1.0f - w7.p.a((positionAnimated - 0.333333f) / 0.333333f, 0.0f, 1.0f));
                bq0Var.G0();
                vp0 C0 = bq0Var.C0();
                d dVar = bq0Var.Q;
                if (dVar != null && C0 != null && C0 != bq0Var.R) {
                    bq0Var.R = C0;
                    n7.z0 z0Var = C0.e;
                    dVar.g((CharSequence) z0Var.b, true, true);
                    bq0Var.Q.f((SpannableStringBuilder) z0Var.c, true);
                }
                bq0Var.D0(1);
                break;
            case 5:
                ((lw0) this.U).e();
                break;
            case 6:
                viewGroup4 = ((org.telegram.ui.ActionBar.f3) ((e41) this.U)).containerView;
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
            default:
                ((le1) this.U).e();
                break;
        }
    }

    @Override // org.telegram.ui.Components.i81
    public void z(int i10) {
        switch (this.T) {
            case 3:
                if (i10 == 0) {
                    co coVar = (co) this.U;
                    if (coVar.s1) {
                        coVar.s1 = false;
                        coVar.q1.h.clear();
                        break;
                    }
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(Context context, org.telegram.ui.ActionBar.f6 f6Var, co coVar) {
        super(context, f6Var);
        this.T = 3;
        this.U = coVar;
    }
}
