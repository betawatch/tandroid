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
import org.telegram.ui.Components.i81;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.a41;
import org.telegram.ui.aq0;
import org.telegram.ui.b41;
import org.telegram.ui.bo;
import org.telegram.ui.c41;
import org.telegram.ui.kk;
import org.telegram.ui.le1;
import org.telegram.ui.mw0;
import org.telegram.ui.up0;
import org.telegram.ui.za1;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
                    n9 n9Var = (n9) arrayList.get(R);
                    if (n9Var.a == 3 && !n9Var.n) {
                        boolean z10 = LocaleController.isRTL;
                        float x10 = motionEvent.getX();
                        if (!z10 ? x10 > AndroidUtilities.dp(100.0f) : x10 < baVar.getWidth() - AndroidUtilities.dp(100.0f)) {
                            i10 = n9Var.i;
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
                kk kkVar = ((bo) this.U).p1;
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
                za1.Y((za1) this.U);
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
                    ((fi.k0) this.U).v.d.Y2.N(false);
                    break;
                }
                break;
            case 7:
                za1 za1Var = (za1) this.U;
                za1Var.m0(za1Var.i0.getCurrentPosition(), true);
                za1Var.n0(0.0f, false);
                za1.W(za1Var);
                break;
        }
    }

    @Override // org.telegram.ui.Components.i81
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
                viewGroup3 = ((org.telegram.ui.ActionBar.f3) ((fi.k0) this.U)).containerView;
                viewGroup3.invalidate();
                break;
            case 3:
                bo boVar = (bo) this.U;
                boVar.X0.getClass();
                boVar.X0.getClass();
                boVar.l7();
                boVar.q9(1);
                break;
            case 4:
                aq0 aq0Var = (aq0) this.U;
                float positionAnimated = aq0Var.I.getPositionAnimated();
                aq0Var.M.setSelected(positionAnimated);
                aq0Var.e.setProgressToGradient(1.0f - w7.p.a((positionAnimated - 0.333333f) / 0.333333f, 0.0f, 1.0f));
                aq0Var.G0();
                up0 C0 = aq0Var.C0();
                d dVar = aq0Var.Q;
                if (dVar != null && C0 != null && C0 != aq0Var.R) {
                    aq0Var.R = C0;
                    n7.a1 a1Var = C0.e;
                    dVar.g((CharSequence) a1Var.b, true, true);
                    aq0Var.Q.f((SpannableStringBuilder) a1Var.c, true);
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
                za1 za1Var = (za1) this.U;
                float positionAnimated2 = za1Var.i0.getPositionAnimated();
                za1Var.n0(positionAnimated2, !z10);
                if (!z10) {
                    za1Var.m0(Math.round(positionAnimated2), true);
                }
                za1.W(za1Var);
                za1.Y(za1Var);
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
                    bo boVar = (bo) this.U;
                    if (boVar.s1) {
                        boVar.s1 = false;
                        boVar.q1.h.clear();
                        break;
                    }
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(Context context, org.telegram.ui.ActionBar.e6 e6Var, bo boVar) {
        super(context, e6Var);
        this.T = 3;
        this.U = boVar;
    }
}
