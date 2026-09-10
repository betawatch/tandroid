package bi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.v81;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.bq0;
import org.telegram.ui.eo;
import org.telegram.ui.f41;
import org.telegram.ui.fb1;
import org.telegram.ui.g41;
import org.telegram.ui.h41;
import org.telegram.ui.mk;
import org.telegram.ui.ow0;
import org.telegram.ui.pe1;
import org.telegram.ui.up0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class p1 extends v81 {
    public final /* synthetic */ int T;
    public final /* synthetic */ Object U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p1(Object obj, Context context, int i10) {
        super(context, null);
        this.T = i10;
        this.U = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00de A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Components.v81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean i(MotionEvent motionEvent) {
        int i10;
        View E;
        int R;
        switch (this.T) {
            case 1:
                rb rbVar = (rb) this.U;
                View currentView = rbVar.b.getCurrentView();
                if (!(currentView instanceof kb)) {
                    return true;
                }
                if (getCurrentPosition() > 0) {
                    rbVar.f1();
                    return true;
                }
                kb kbVar = (kb) currentView;
                ArrayList arrayList = kbVar.L;
                vl0 vl0Var = kbVar.f;
                if (kbVar.a == 0 && motionEvent != null && (E = vl0Var.E(motionEvent.getX(), motionEvent.getY() - kbVar.e.getPaddingTop())) != null && (R = RecyclerView.R(E)) >= 0 && R < arrayList.size()) {
                    pa paVar = (pa) arrayList.get(R);
                    if (paVar.a == 3 && !paVar.n) {
                        boolean z10 = LocaleController.isRTL;
                        float x10 = motionEvent.getX();
                        if (!z10 ? x10 > AndroidUtilities.dp(100.0f) : x10 < kbVar.getWidth() - AndroidUtilities.dp(100.0f)) {
                            i10 = paVar.i;
                            if (i10 != -1) {
                                rbVar.M = i10;
                                if (i10 == 3) {
                                    if (!rbVar.n.isEmpty() && !rbVar.r.isEmpty()) {
                                        rbVar.N = i10;
                                    }
                                } else if (i10 != 4) {
                                    rbVar.N = i10;
                                } else if (!rbVar.d.isEmpty() && !rbVar.e.isEmpty()) {
                                    rbVar.N = i10;
                                }
                                kbVar.f(true);
                                kbVar.e(true);
                            }
                            if (i10 != -1) {
                                rbVar.f1();
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
                mk mkVar = ((eo) this.U).p1;
                return mkVar != null && mkVar.b > 0.5f;
        }
    }

    @Override // org.telegram.ui.Components.v81
    public boolean j(MotionEvent motionEvent) {
        switch (this.T) {
            case 2:
                return getCurrentPosition() != 2;
            default:
                return super.j(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.v81
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
                fb1.Y((fb1) this.U);
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override // org.telegram.ui.Components.v81, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.T) {
            case 3:
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.v81
    public void t(View view, View view2, int i10, int i11) {
        boolean z10;
        switch (this.T) {
            case 1:
                rb rbVar = (rb) this.U;
                z10 = ((org.telegram.ui.ActionBar.h3) rbVar).keyboardVisible;
                if (z10) {
                    rbVar.f1();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.v81
    public void u() {
        switch (this.T) {
            case 2:
                if (getCurrentPosition() == 1) {
                    ((ei.k0) this.U).v.d.Y2.N(false);
                    break;
                }
                break;
            case 7:
                fb1 fb1Var = (fb1) this.U;
                fb1Var.m0(fb1Var.i0.getCurrentPosition(), true);
                fb1Var.n0(0.0f, false);
                fb1.W(fb1Var);
                break;
        }
    }

    @Override // org.telegram.ui.Components.v81
    public void v() {
        f41 f41Var;
        switch (this.T) {
            case 6:
                if ((getCurrentView() instanceof g41) && (f41Var = ((g41) getCurrentView()).n) != null) {
                    AndroidUtilities.hideKeyboard(f41Var);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.v81
    public final void w(boolean z10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        switch (this.T) {
            case 0:
                f3 f3Var = (f3) this.U;
                p1 p1Var = f3Var.f;
                e3 e3Var = f3Var.h;
                if (e3Var != null) {
                    e3Var.F = p1Var.getPositionAnimated();
                    e3Var.invalidate();
                }
                viewGroup = ((org.telegram.ui.ActionBar.h3) f3Var).containerView;
                viewGroup.invalidate();
                invalidate();
                f3.G = p1Var.getCurrentPosition();
                break;
            case 1:
                viewGroup2 = ((org.telegram.ui.ActionBar.h3) ((rb) this.U)).containerView;
                viewGroup2.invalidate();
                break;
            case 2:
                viewGroup3 = ((org.telegram.ui.ActionBar.h3) ((ei.k0) this.U)).containerView;
                viewGroup3.invalidate();
                break;
            case 3:
                eo eoVar = (eo) this.U;
                eoVar.X0.getClass();
                eoVar.X0.getClass();
                eoVar.l7();
                eoVar.q9(1);
                break;
            case 4:
                bq0 bq0Var = (bq0) this.U;
                float positionAnimated = bq0Var.I.getPositionAnimated();
                bq0Var.M.setSelected(positionAnimated);
                bq0Var.e.setProgressToGradient(1.0f - w7.q.a((positionAnimated - 0.333333f) / 0.333333f, 0.0f, 1.0f));
                bq0Var.G0();
                up0 C0 = bq0Var.C0();
                d dVar = bq0Var.Q;
                if (dVar != null && C0 != null && C0 != bq0Var.R) {
                    bq0Var.R = C0;
                    og.u0 u0Var = C0.e;
                    dVar.g((CharSequence) u0Var.b, true, true);
                    bq0Var.Q.f((SpannableStringBuilder) u0Var.c, true);
                }
                bq0Var.D0(1);
                break;
            case 5:
                ((ow0) this.U).e();
                break;
            case 6:
                viewGroup4 = ((org.telegram.ui.ActionBar.h3) ((h41) this.U)).containerView;
                viewGroup4.invalidate();
                break;
            case 7:
                fb1 fb1Var = (fb1) this.U;
                float positionAnimated2 = fb1Var.i0.getPositionAnimated();
                fb1Var.n0(positionAnimated2, !z10);
                if (!z10) {
                    fb1Var.m0(Math.round(positionAnimated2), true);
                }
                fb1.W(fb1Var);
                fb1.Y(fb1Var);
                break;
            default:
                ((pe1) this.U).e();
                break;
        }
    }

    @Override // org.telegram.ui.Components.v81
    public void z(int i10) {
        switch (this.T) {
            case 3:
                if (i10 == 0) {
                    eo eoVar = (eo) this.U;
                    if (eoVar.s1) {
                        eoVar.s1 = false;
                        eoVar.q1.h.clear();
                        break;
                    }
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(Context context, org.telegram.ui.ActionBar.f6 f6Var, eo eoVar) {
        super(context, f6Var);
        this.T = 3;
        this.U = eoVar;
    }
}
