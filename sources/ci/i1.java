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
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.x81;
import org.telegram.ui.a41;
import org.telegram.ui.b41;
import org.telegram.ui.cq0;
import org.telegram.ui.jk;
import org.telegram.ui.ke1;
import org.telegram.ui.mw0;
import org.telegram.ui.wp0;
import org.telegram.ui.z31;
import org.telegram.ui.za1;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes4.dex */
public final class i1 extends x81 {
    public final /* synthetic */ int U;
    public final /* synthetic */ Object V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i1(Object obj, Context context, int i10) {
        super(context, null);
        this.U = i10;
        this.V = obj;
    }

    @Override // org.telegram.ui.Components.x81
    public void A(int i10) {
        switch (this.U) {
            case 3:
                if (i10 == 0) {
                    zn znVar = (zn) this.V;
                    if (znVar.s1) {
                        znVar.s1 = false;
                        znVar.q1.h.clear();
                        break;
                    }
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00de A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Components.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean i(MotionEvent motionEvent) {
        int i10;
        View F;
        int S;
        switch (this.U) {
            case 1:
                ia iaVar = (ia) this.V;
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
                wl0 wl0Var = baVar.f;
                if (baVar.a == 0 && motionEvent != null && (F = wl0Var.F(motionEvent.getX(), motionEvent.getY() - baVar.e.getPaddingTop())) != null && (S = RecyclerView.S(F)) >= 0 && S < arrayList.size()) {
                    n9 n9Var = (n9) arrayList.get(S);
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
                jk jkVar = ((zn) this.V).p1;
                return jkVar != null && jkVar.b > 0.5f;
        }
    }

    @Override // org.telegram.ui.Components.x81
    public boolean j(MotionEvent motionEvent) {
        switch (this.U) {
            case 2:
                return getCurrentPosition() != 2;
            default:
                return super.j(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.x81
    public boolean k(MotionEvent motionEvent) {
        switch (this.U) {
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
        switch (this.U) {
            case 7:
                super.onLayout(z10, i10, i11, i12, i13);
                za1.Y((za1) this.V);
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override // org.telegram.ui.Components.x81, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.U) {
            case 3:
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.x81
    public void t(View view, View view2, int i10, int i11) {
        boolean z10;
        switch (this.U) {
            case 1:
                ia iaVar = (ia) this.V;
                z10 = ((org.telegram.ui.ActionBar.f3) iaVar).keyboardVisible;
                if (z10) {
                    iaVar.f1();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.x81
    public void u() {
        switch (this.U) {
            case 2:
                if (getCurrentPosition() == 1) {
                    ((fi.k0) this.V).v.d.Y2.N(false);
                    break;
                }
                break;
            case 7:
                za1 za1Var = (za1) this.V;
                za1Var.m0(za1Var.i0.getCurrentPosition(), true);
                za1Var.n0(0.0f, false);
                za1.W(za1Var);
                break;
        }
    }

    @Override // org.telegram.ui.Components.x81
    public void v() {
        z31 z31Var;
        switch (this.U) {
            case 6:
                if ((getCurrentView() instanceof a41) && (z31Var = ((a41) getCurrentView()).n) != null) {
                    AndroidUtilities.hideKeyboard(z31Var);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.x81
    public final void w(boolean z10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        switch (this.U) {
            case 0:
                t2 t2Var = (t2) this.V;
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
                viewGroup2 = ((org.telegram.ui.ActionBar.f3) ((ia) this.V)).containerView;
                viewGroup2.invalidate();
                break;
            case 2:
                viewGroup3 = ((org.telegram.ui.ActionBar.f3) ((fi.k0) this.V)).containerView;
                viewGroup3.invalidate();
                break;
            case 3:
                zn znVar = (zn) this.V;
                znVar.X0.getClass();
                znVar.X0.getClass();
                znVar.l7();
                znVar.q9(1);
                break;
            case 4:
                cq0 cq0Var = (cq0) this.V;
                float positionAnimated = cq0Var.I.getPositionAnimated();
                cq0Var.M.setSelected(positionAnimated);
                cq0Var.e.setProgressToGradient(1.0f - w7.q.a((positionAnimated - 0.333333f) / 0.333333f, 0.0f, 1.0f));
                cq0Var.G0();
                wp0 C0 = cq0Var.C0();
                d dVar = cq0Var.Q;
                if (dVar != null && C0 != null && C0 != cq0Var.R) {
                    cq0Var.R = C0;
                    n7.z0 z0Var = C0.e;
                    dVar.g((CharSequence) z0Var.b, true, true);
                    cq0Var.Q.f((SpannableStringBuilder) z0Var.c, true);
                }
                cq0Var.D0(1);
                break;
            case 5:
                ((mw0) this.V).e();
                break;
            case 6:
                viewGroup4 = ((org.telegram.ui.ActionBar.f3) ((b41) this.V)).containerView;
                viewGroup4.invalidate();
                break;
            case 7:
                za1 za1Var = (za1) this.V;
                float positionAnimated2 = za1Var.i0.getPositionAnimated();
                za1Var.n0(positionAnimated2, !z10);
                if (!z10) {
                    za1Var.m0(Math.round(positionAnimated2), true);
                }
                za1.W(za1Var);
                za1.Y(za1Var);
                break;
            default:
                ((ke1) this.V).e();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(Context context, org.telegram.ui.ActionBar.e6 e6Var, zn znVar) {
        super(context, e6Var);
        this.U = 3;
        this.V = znVar;
    }
}
