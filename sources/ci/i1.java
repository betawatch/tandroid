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
import org.telegram.ui.Components.h91;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.ee1;
import org.telegram.ui.gw0;
import org.telegram.ui.hk;
import org.telegram.ui.qp0;
import org.telegram.ui.r31;
import org.telegram.ui.s31;
import org.telegram.ui.t31;
import org.telegram.ui.wp0;
import org.telegram.ui.yn;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes4.dex */
public final class i1 extends h91 {
    public final /* synthetic */ int V;
    public final /* synthetic */ Object W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i1(Object obj, Context context, int i10) {
        super(context, null);
        this.V = i10;
        this.W = obj;
    }

    @Override // org.telegram.ui.Components.h91
    public void A(int i10) {
        switch (this.V) {
            case 3:
                if (i10 == 0) {
                    yn ynVar = (yn) this.W;
                    if (ynVar.q1) {
                        ynVar.q1 = false;
                        ynVar.o1.h.clear();
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
    @Override // org.telegram.ui.Components.h91
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean i(MotionEvent motionEvent) {
        int i10;
        View E;
        int R;
        switch (this.V) {
            case 1:
                ea eaVar = (ea) this.W;
                View currentView = eaVar.b.getCurrentView();
                if (!(currentView instanceof x9)) {
                    return true;
                }
                if (getCurrentPosition() > 0) {
                    eaVar.f1();
                    return true;
                }
                x9 x9Var = (x9) currentView;
                ArrayList arrayList = x9Var.L;
                zl0 zl0Var = x9Var.f;
                if (x9Var.a == 0 && motionEvent != null && (E = zl0Var.E(motionEvent.getX(), motionEvent.getY() - x9Var.e.getPaddingTop())) != null && (R = RecyclerView.R(E)) >= 0 && R < arrayList.size()) {
                    j9 j9Var = (j9) arrayList.get(R);
                    if (j9Var.a == 3 && !j9Var.n) {
                        boolean z10 = LocaleController.isRTL;
                        float x10 = motionEvent.getX();
                        if (!z10 ? x10 > AndroidUtilities.dp(100.0f) : x10 < x9Var.getWidth() - AndroidUtilities.dp(100.0f)) {
                            i10 = j9Var.i;
                            if (i10 != -1) {
                                eaVar.M = i10;
                                if (i10 == 3) {
                                    if (!eaVar.n.isEmpty() && !eaVar.r.isEmpty()) {
                                        eaVar.N = i10;
                                    }
                                } else if (i10 != 4) {
                                    eaVar.N = i10;
                                } else if (!eaVar.d.isEmpty() && !eaVar.e.isEmpty()) {
                                    eaVar.N = i10;
                                }
                                x9Var.f(true);
                                x9Var.e(true);
                            }
                            if (i10 != -1) {
                                eaVar.f1();
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
                hk hkVar = ((yn) this.W).n1;
                return hkVar != null && hkVar.b > 0.5f;
        }
    }

    @Override // org.telegram.ui.Components.h91
    public boolean j(MotionEvent motionEvent) {
        switch (this.V) {
            case 2:
                return getCurrentPosition() != 2;
            default:
                return super.j(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.h91
    public boolean k(MotionEvent motionEvent) {
        switch (this.V) {
            case 2:
                return false;
            case 6:
                return false;
            default:
                return super.k(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.h91, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.V) {
            case 3:
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.h91
    public void t(View view, View view2, int i10, int i11) {
        boolean z10;
        switch (this.V) {
            case 1:
                ea eaVar = (ea) this.W;
                z10 = ((org.telegram.ui.ActionBar.f3) eaVar).keyboardVisible;
                if (z10) {
                    eaVar.f1();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.h91
    public void u() {
        switch (this.V) {
            case 2:
                if (getCurrentPosition() == 1) {
                    ((fi.k0) this.W).v.d.f3.N(false);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.h91
    public void v() {
        r31 r31Var;
        switch (this.V) {
            case 6:
                if ((getCurrentView() instanceof s31) && (r31Var = ((s31) getCurrentView()).n) != null) {
                    AndroidUtilities.hideKeyboard(r31Var);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.h91
    public final void w(boolean z10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        switch (this.V) {
            case 0:
                s2 s2Var = (s2) this.W;
                i1 i1Var = s2Var.f;
                r2 r2Var = s2Var.h;
                if (r2Var != null) {
                    r2Var.F = i1Var.getPositionAnimated();
                    r2Var.invalidate();
                }
                viewGroup = ((org.telegram.ui.ActionBar.f3) s2Var).containerView;
                viewGroup.invalidate();
                invalidate();
                s2.G = i1Var.getCurrentPosition();
                break;
            case 1:
                viewGroup2 = ((org.telegram.ui.ActionBar.f3) ((ea) this.W)).containerView;
                viewGroup2.invalidate();
                break;
            case 2:
                viewGroup3 = ((org.telegram.ui.ActionBar.f3) ((fi.k0) this.W)).containerView;
                viewGroup3.invalidate();
                break;
            case 3:
                yn ynVar = (yn) this.W;
                ynVar.V0.getClass();
                ynVar.V0.getClass();
                ynVar.l7();
                break;
            case 4:
                wp0 wp0Var = (wp0) this.W;
                float positionAnimated = wp0Var.I.getPositionAnimated();
                wp0Var.M.setSelected(positionAnimated);
                wp0Var.e.setProgressToGradient(1.0f - w7.q.a((positionAnimated - 0.333333f) / 0.333333f, 0.0f, 1.0f));
                wp0Var.F0();
                qp0 C0 = wp0Var.C0();
                d dVar = wp0Var.Q;
                if (dVar != null && C0 != null && C0 != wp0Var.R) {
                    wp0Var.R = C0;
                    n7.z0 z0Var = C0.e;
                    dVar.g((CharSequence) z0Var.b, true, true);
                    wp0Var.Q.f((SpannableStringBuilder) z0Var.c, true);
                    break;
                }
                break;
            case 5:
                ((gw0) this.W).e();
                break;
            case 6:
                viewGroup4 = ((org.telegram.ui.ActionBar.f3) ((t31) this.W)).containerView;
                viewGroup4.invalidate();
                break;
            default:
                ((ee1) this.W).e();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(Context context, org.telegram.ui.ActionBar.d6 d6Var, yn ynVar) {
        super(context, d6Var);
        this.V = 3;
        this.W = ynVar;
    }
}
