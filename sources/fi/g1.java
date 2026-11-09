package fi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.id;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.w61;
import org.telegram.ui.bs0;
import org.telegram.ui.cn;
import org.telegram.ui.dm0;
import org.telegram.ui.h81;
import org.telegram.ui.jm0;
import org.telegram.ui.oy0;
import org.telegram.ui.pj;
import org.telegram.ui.qy0;
import org.telegram.ui.ry0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class g1 extends w61 {
    public final /* synthetic */ int V;
    public final /* synthetic */ Object W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g1(int i7, Context context, Object obj) {
        super(context, null);
        this.V = i7;
        this.W = obj;
    }

    @Override // org.telegram.ui.Components.w61
    public void A(int i7) {
        switch (this.V) {
            case 3:
                if (i7 == 0) {
                    cn cnVar = (cn) this.W;
                    if (cnVar.G1) {
                        cnVar.G1 = false;
                        cnVar.E1.h.clear();
                        break;
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.w61
    public int H() {
        switch (this.V) {
            case 9:
                return 12;
            default:
                return super.H();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00de A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Components.w61
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean b(MotionEvent motionEvent) {
        int i7;
        View E;
        int R;
        switch (this.V) {
            case 1:
                s8 s8Var = (s8) this.W;
                View currentView = s8Var.i1.getCurrentView();
                if (!(currentView instanceof n8)) {
                    return true;
                }
                if (getCurrentPosition() > 0) {
                    s8Var.M0();
                    return true;
                }
                n8 n8Var = (n8) currentView;
                ArrayList arrayList = n8Var.L;
                qj0 qj0Var = n8Var.f;
                if (n8Var.a == 0 && motionEvent != null && (E = qj0Var.E(motionEvent.getX(), motionEvent.getY() - n8Var.e.getPaddingTop())) != null && (R = RecyclerView.R(E)) >= 0 && R < arrayList.size()) {
                    b8 b8Var = (b8) arrayList.get(R);
                    if (b8Var.a == 3 && !b8Var.n) {
                        boolean z9 = id.a0;
                        float x10 = motionEvent.getX();
                        if (!z9 ? x10 > org.telegram.messenger.g0.L(100.0f) : x10 < n8Var.getWidth() - org.telegram.messenger.g0.L(100.0f)) {
                            i7 = b8Var.i;
                            if (i7 != -1) {
                                s8Var.D1 = i7;
                                if (i7 == 3) {
                                    if (!s8Var.o1.isEmpty() && !s8Var.p1.isEmpty()) {
                                        s8Var.E1 = i7;
                                    }
                                } else if (i7 != 4) {
                                    s8Var.E1 = i7;
                                } else if (!s8Var.k1.isEmpty() && !s8Var.l1.isEmpty()) {
                                    s8Var.E1 = i7;
                                }
                                n8Var.g(true);
                                n8Var.f(true);
                            }
                            if (i7 != -1) {
                                s8Var.M0();
                            }
                            return i7 == -1;
                        }
                    }
                }
                i7 = -1;
                if (i7 != -1) {
                }
                if (i7 != -1) {
                }
                if (i7 == -1) {
                }
                break;
            case 2:
            default:
                return super.b(motionEvent);
            case 3:
                pj pjVar = ((cn) this.W).D1;
                return pjVar != null && pjVar.b > 0.5f;
        }
    }

    @Override // org.telegram.ui.Components.w61
    public boolean j(MotionEvent motionEvent) {
        switch (this.V) {
            case 2:
                return getCurrentPosition() != 2;
            default:
                return super.j(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.w61
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

    @Override // org.telegram.ui.Components.w61, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.V) {
            case 3:
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.w61
    public void t(View view, View view2, int i7, int i10) {
        switch (this.V) {
            case 1:
                s8 s8Var = (s8) this.W;
                if (s8Var.d) {
                    s8Var.M0();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.w61
    public void u() {
        switch (this.V) {
            case 2:
                if (getCurrentPosition() == 1) {
                    ((ii.d0) this.W).r1.d.f3.O(false);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.w61
    public void v() {
        oy0 oy0Var;
        switch (this.V) {
            case 6:
                if ((getCurrentView() instanceof qy0) && (oy0Var = ((qy0) getCurrentView()).n) != null) {
                    org.telegram.messenger.g0.v1(oy0Var);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.w61
    public final void w(boolean z9) {
        switch (this.V) {
            case 0:
                k2 k2Var = (k2) this.W;
                g1 g1Var = k2Var.m1;
                j2 j2Var = k2Var.n1;
                if (j2Var != null) {
                    j2Var.F = g1Var.getPositionAnimated();
                    j2Var.invalidate();
                }
                k2Var.b.invalidate();
                invalidate();
                k2.y1 = g1Var.getCurrentPosition();
                break;
            case 1:
                ((s8) this.W).b.invalidate();
                break;
            case 2:
                ((ii.d0) this.W).b.invalidate();
                break;
            case 3:
                cn cnVar = (cn) this.W;
                cnVar.l1.getClass();
                cnVar.l1.getClass();
                cnVar.A7();
                break;
            case 4:
                jm0 jm0Var = (jm0) this.W;
                float positionAnimated = jm0Var.I.getPositionAnimated();
                jm0Var.M.setSelected(positionAnimated);
                jm0Var.e.setProgressToGradient(1.0f - c8.j9.a((positionAnimated - 0.333333f) / 0.333333f, 0.0f, 1.0f));
                jm0Var.K0();
                dm0 H0 = jm0Var.H0();
                d dVar = jm0Var.Q;
                if (dVar != null && H0 != null && H0 != jm0Var.R) {
                    jm0Var.R = H0;
                    j2.n nVar = H0.e;
                    dVar.i((CharSequence) nVar.b, true, true);
                    jm0Var.Q.g((SpannableStringBuilder) nVar.c, true);
                    break;
                }
                break;
            case 5:
                ((bs0) this.W).e();
                break;
            case 6:
                ((ry0) this.W).b.invalidate();
                break;
            case 7:
                ((h81) this.W).e();
                break;
            case 8:
                ((org.telegram.ui.Wallet.x2) this.W).b.invalidate();
                break;
            default:
                org.telegram.ui.Wallet.w5 w5Var = (org.telegram.ui.Wallet.w5) this.W;
                w5Var.Z0();
                org.telegram.ui.Wallet.a8 a8Var = w5Var.j0;
                if (a8Var != null && a8Var.h1) {
                    a8Var.f0();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.w61
    public void y(int i7) {
        org.telegram.ui.Wallet.r8 r8Var;
        switch (this.V) {
            case 9:
                org.telegram.ui.Wallet.w5 w5Var = (org.telegram.ui.Wallet.w5) this.W;
                w5Var.e0 = i7;
                if (i7 != 1 && (r8Var = w5Var.i0) != null) {
                    r8Var.b(false);
                }
                if (i7 == 1) {
                    w5Var.p0.post(new org.telegram.ui.Wallet.d4(w5Var, 13));
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g1(org.telegram.ui.ActionBar.f2 f2Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, int i7) {
        super(context, g6Var);
        this.V = i7;
        this.W = f2Var;
    }
}
