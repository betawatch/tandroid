package gi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import b8.be;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.ui.Components.n61;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.by0;
import org.telegram.ui.cm0;
import org.telegram.ui.dy0;
import org.telegram.ui.ey0;
import org.telegram.ui.jj;
import org.telegram.ui.pr0;
import org.telegram.ui.w71;
import org.telegram.ui.wl0;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class g1 extends n61 {
    public final /* synthetic */ int W;
    public final /* synthetic */ Object a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g1(int i3, Context context, Object obj) {
        super(context, null);
        this.W = i3;
        this.a0 = obj;
    }

    @Override // org.telegram.ui.Components.n61
    public int G() {
        switch (this.W) {
            case 9:
                return 12;
            default:
                return super.G();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00de A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Components.n61
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean c(MotionEvent motionEvent) {
        int i3;
        View E;
        int R;
        switch (this.W) {
            case 1:
                t8 t8Var = (t8) this.a0;
                View currentView = t8Var.j1.getCurrentView();
                if (!(currentView instanceof o8)) {
                    return true;
                }
                if (getCurrentPosition() > 0) {
                    t8Var.M0();
                    return true;
                }
                o8 o8Var = (o8) currentView;
                ArrayList arrayList = o8Var.M;
                tj0 tj0Var = o8Var.f;
                if (o8Var.a == 0 && motionEvent != null && (E = tj0Var.E(motionEvent.getX(), motionEvent.getY() - o8Var.e.getPaddingTop())) != null && (R = RecyclerView.R(E)) >= 0 && R < arrayList.size()) {
                    a8 a8Var = (a8) arrayList.get(R);
                    if (a8Var.a == 3 && !a8Var.n) {
                        boolean z10 = bd.a0;
                        float x10 = motionEvent.getX();
                        if (!z10 ? x10 > org.telegram.messenger.g0.L(100.0f) : x10 < o8Var.getWidth() - org.telegram.messenger.g0.L(100.0f)) {
                            i3 = a8Var.i;
                            if (i3 != -1) {
                                t8Var.E1 = i3;
                                if (i3 == 3) {
                                    if (!t8Var.p1.isEmpty() && !t8Var.q1.isEmpty()) {
                                        t8Var.F1 = i3;
                                    }
                                } else if (i3 != 4) {
                                    t8Var.F1 = i3;
                                } else if (!t8Var.l1.isEmpty() && !t8Var.m1.isEmpty()) {
                                    t8Var.F1 = i3;
                                }
                                o8Var.g(true);
                                o8Var.f(true);
                            }
                            if (i3 != -1) {
                                t8Var.M0();
                            }
                            return i3 == -1;
                        }
                    }
                }
                i3 = -1;
                if (i3 != -1) {
                }
                if (i3 != -1) {
                }
                if (i3 == -1) {
                }
                break;
            case 2:
            default:
                return super.c(motionEvent);
            case 3:
                jj jjVar = ((wm) this.a0).E1;
                return jjVar != null && jjVar.b > 0.5f;
        }
    }

    @Override // org.telegram.ui.Components.n61
    public boolean e(MotionEvent motionEvent) {
        switch (this.W) {
            case 2:
                return getCurrentPosition() != 2;
            default:
                return super.e(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.n61
    public boolean f(MotionEvent motionEvent) {
        switch (this.W) {
            case 2:
                return false;
            case 6:
                return false;
            default:
                return super.f(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.n61, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.W) {
            case 3:
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.n61
    public void r(View view, View view2, int i3, int i10) {
        switch (this.W) {
            case 1:
                t8 t8Var = (t8) this.a0;
                if (t8Var.d) {
                    t8Var.M0();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.n61
    public void s() {
        switch (this.W) {
            case 2:
                if (getCurrentPosition() == 1) {
                    ((ji.b0) this.a0).s1.d.g3.O(false);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.n61
    public void t() {
        by0 by0Var;
        switch (this.W) {
            case 6:
                if ((getCurrentView() instanceof dy0) && (by0Var = ((dy0) getCurrentView()).n) != null) {
                    org.telegram.messenger.g0.v1(by0Var);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.n61
    public final void u(boolean z10) {
        switch (this.W) {
            case 0:
                i2 i2Var = (i2) this.a0;
                g1 g1Var = i2Var.n1;
                h2 h2Var = i2Var.o1;
                if (h2Var != null) {
                    h2Var.G = g1Var.getPositionAnimated();
                    h2Var.invalidate();
                }
                i2Var.b.invalidate();
                invalidate();
                i2.z1 = g1Var.getCurrentPosition();
                break;
            case 1:
                ((t8) this.a0).b.invalidate();
                break;
            case 2:
                ((ji.b0) this.a0).b.invalidate();
                break;
            case 3:
                wm wmVar = (wm) this.a0;
                wmVar.m1.getClass();
                wmVar.m1.getClass();
                wmVar.z7();
                break;
            case 4:
                cm0 cm0Var = (cm0) this.a0;
                float positionAnimated = cm0Var.J.getPositionAnimated();
                cm0Var.N.setSelected(positionAnimated);
                cm0Var.e.setProgressToGradient(1.0f - be.a((positionAnimated - 0.333333f) / 0.333333f, 0.0f, 1.0f));
                cm0Var.K0();
                wl0 H0 = cm0Var.H0();
                d dVar = cm0Var.R;
                if (dVar != null && H0 != null && H0 != cm0Var.S) {
                    cm0Var.S = H0;
                    mi.h0 h0Var = H0.e;
                    dVar.i((CharSequence) h0Var.b, true, true);
                    cm0Var.R.g((SpannableStringBuilder) h0Var.c, true);
                    break;
                }
                break;
            case 5:
                ((pr0) this.a0).e();
                break;
            case 6:
                ((ey0) this.a0).b.invalidate();
                break;
            case 7:
                ((w71) this.a0).e();
                break;
            case 8:
                ((org.telegram.ui.Wallet.x2) this.a0).b.invalidate();
                break;
            default:
                org.telegram.ui.Wallet.w5 w5Var = (org.telegram.ui.Wallet.w5) this.a0;
                w5Var.Z0();
                org.telegram.ui.Wallet.b8 b8Var = w5Var.k0;
                if (b8Var != null && b8Var.i1) {
                    b8Var.f0();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.n61
    public void x(int i3) {
        org.telegram.ui.Wallet.s8 s8Var;
        switch (this.W) {
            case 9:
                org.telegram.ui.Wallet.w5 w5Var = (org.telegram.ui.Wallet.w5) this.a0;
                w5Var.f0 = i3;
                if (i3 != 1 && (s8Var = w5Var.j0) != null) {
                    s8Var.b(false);
                }
                if (i3 == 1) {
                    w5Var.q0.post(new org.telegram.ui.Wallet.d4(w5Var, 13));
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.n61
    public void z(int i3) {
        switch (this.W) {
            case 3:
                if (i3 == 0) {
                    wm wmVar = (wm) this.a0;
                    if (wmVar.H1) {
                        wmVar.H1 = false;
                        wmVar.F1.h.clear();
                        break;
                    }
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g1(org.telegram.ui.ActionBar.d2 d2Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i3) {
        super(context, e6Var);
        this.W = i3;
        this.a0 = d2Var;
    }
}
