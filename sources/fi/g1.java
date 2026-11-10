package fi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.id;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.v61;
import org.telegram.ui.cn;
import org.telegram.ui.cs0;
import org.telegram.ui.em0;
import org.telegram.ui.i81;
import org.telegram.ui.km0;
import org.telegram.ui.pj;
import org.telegram.ui.py0;
import org.telegram.ui.ry0;
import org.telegram.ui.sy0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class g1 extends v61 {
    public final /* synthetic */ int V;
    public final /* synthetic */ Object W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g1(int i7, Context context, Object obj) {
        super(context, null);
        this.V = i7;
        this.W = obj;
    }

    @Override // org.telegram.ui.Components.v61
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

    @Override // org.telegram.ui.Components.v61
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
    @Override // org.telegram.ui.Components.v61
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
                View currentView = s8Var.l1.getCurrentView();
                if (!(currentView instanceof n8)) {
                    return true;
                }
                if (getCurrentPosition() > 0) {
                    s8Var.M0();
                    return true;
                }
                n8 n8Var = (n8) currentView;
                ArrayList arrayList = n8Var.L;
                pj0 pj0Var = n8Var.f;
                if (n8Var.a == 0 && motionEvent != null && (E = pj0Var.E(motionEvent.getX(), motionEvent.getY() - n8Var.e.getPaddingTop())) != null && (R = RecyclerView.R(E)) >= 0 && R < arrayList.size()) {
                    b8 b8Var = (b8) arrayList.get(R);
                    if (b8Var.a == 3 && !b8Var.n) {
                        boolean z9 = id.a0;
                        float x10 = motionEvent.getX();
                        if (!z9 ? x10 > org.telegram.messenger.g0.L(100.0f) : x10 < n8Var.getWidth() - org.telegram.messenger.g0.L(100.0f)) {
                            i7 = b8Var.i;
                            if (i7 != -1) {
                                s8Var.G1 = i7;
                                if (i7 == 3) {
                                    if (!s8Var.r1.isEmpty() && !s8Var.s1.isEmpty()) {
                                        s8Var.H1 = i7;
                                    }
                                } else if (i7 != 4) {
                                    s8Var.H1 = i7;
                                } else if (!s8Var.n1.isEmpty() && !s8Var.o1.isEmpty()) {
                                    s8Var.H1 = i7;
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

    @Override // org.telegram.ui.Components.v61
    public boolean j(MotionEvent motionEvent) {
        switch (this.V) {
            case 2:
                return getCurrentPosition() != 2;
            default:
                return super.j(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.v61
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

    @Override // org.telegram.ui.Components.v61, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.V) {
            case 3:
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.v61
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

    @Override // org.telegram.ui.Components.v61
    public void u() {
        switch (this.V) {
            case 2:
                if (getCurrentPosition() == 1) {
                    ((ii.d0) this.W).u1.d.f3.O(false);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.v61
    public void v() {
        py0 py0Var;
        switch (this.V) {
            case 6:
                if ((getCurrentView() instanceof ry0) && (py0Var = ((ry0) getCurrentView()).n) != null) {
                    org.telegram.messenger.g0.v1(py0Var);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.v61
    public final void w(boolean z9) {
        switch (this.V) {
            case 0:
                k2 k2Var = (k2) this.W;
                g1 g1Var = k2Var.p1;
                j2 j2Var = k2Var.q1;
                if (j2Var != null) {
                    j2Var.F = g1Var.getPositionAnimated();
                    j2Var.invalidate();
                }
                k2Var.b.invalidate();
                invalidate();
                k2.B1 = g1Var.getCurrentPosition();
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
                km0 km0Var = (km0) this.W;
                float positionAnimated = km0Var.I.getPositionAnimated();
                km0Var.M.setSelected(positionAnimated);
                km0Var.e.setProgressToGradient(1.0f - c8.j9.a((positionAnimated - 0.333333f) / 0.333333f, 0.0f, 1.0f));
                km0Var.K0();
                em0 H0 = km0Var.H0();
                d dVar = km0Var.Q;
                if (dVar != null && H0 != null && H0 != km0Var.R) {
                    km0Var.R = H0;
                    j2.n nVar = H0.e;
                    dVar.i((CharSequence) nVar.b, true, true);
                    km0Var.Q.g((SpannableStringBuilder) nVar.c, true);
                    break;
                }
                break;
            case 5:
                ((cs0) this.W).e();
                break;
            case 6:
                ((sy0) this.W).b.invalidate();
                break;
            case 7:
                ((i81) this.W).e();
                break;
            case 8:
                ((org.telegram.ui.Wallet.x2) this.W).b.invalidate();
                break;
            default:
                org.telegram.ui.Wallet.z5 z5Var = (org.telegram.ui.Wallet.z5) this.W;
                z5Var.a1();
                org.telegram.ui.Wallet.d8 d8Var = z5Var.j0;
                if (d8Var != null && d8Var.h1) {
                    d8Var.f0();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.v61
    public void y(int i7) {
        org.telegram.ui.Wallet.u8 u8Var;
        switch (this.V) {
            case 9:
                org.telegram.ui.Wallet.z5 z5Var = (org.telegram.ui.Wallet.z5) this.W;
                z5Var.e0 = i7;
                if (i7 != 1 && (u8Var = z5Var.i0) != null) {
                    u8Var.b(false);
                }
                if (i7 == 1) {
                    z5Var.p0.post(new org.telegram.ui.Wallet.f4(z5Var, 13));
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g1(org.telegram.ui.ActionBar.f2 f2Var, Context context, org.telegram.ui.ActionBar.h6 h6Var, int i7) {
        super(context, h6Var);
        this.V = i7;
        this.W = f2Var;
    }
}
