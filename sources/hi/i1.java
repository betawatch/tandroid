package hi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.j71;
import org.telegram.ui.as0;
import org.telegram.ui.bn;
import org.telegram.ui.fm0;
import org.telegram.ui.i81;
import org.telegram.ui.lm0;
import org.telegram.ui.ny0;
import org.telegram.ui.oj;
import org.telegram.ui.py0;
import org.telegram.ui.qy0;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final class i1 extends j71 {
    public final /* synthetic */ int W;
    public final /* synthetic */ Object a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i1(int i7, Context context, Object obj) {
        super(context, null);
        this.W = i7;
        this.a0 = obj;
    }

    @Override // org.telegram.ui.Components.j71
    public int D() {
        switch (this.W) {
            case 9:
                return 12;
            default:
                return super.D();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00de A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Components.j71
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean b(MotionEvent motionEvent) {
        int i7;
        View E;
        int R;
        switch (this.W) {
            case 1:
                p8 p8Var = (p8) this.a0;
                View currentView = p8Var.m1.getCurrentView();
                if (!(currentView instanceof k8)) {
                    return true;
                }
                if (getCurrentPosition() > 0) {
                    p8Var.N0();
                    return true;
                }
                k8 k8Var = (k8) currentView;
                ArrayList arrayList = k8Var.M;
                ek0 ek0Var = k8Var.f;
                if (k8Var.a == 0 && motionEvent != null && (E = ek0Var.E(motionEvent.getX(), motionEvent.getY() - k8Var.e.getPaddingTop())) != null && (R = RecyclerView.R(E)) >= 0 && R < arrayList.size()) {
                    y7 y7Var = (y7) arrayList.get(R);
                    if (y7Var.a == 3 && !y7Var.n) {
                        boolean z10 = hd.a0;
                        float x10 = motionEvent.getX();
                        if (!z10 ? x10 > org.telegram.messenger.g0.L(100.0f) : x10 < k8Var.getWidth() - org.telegram.messenger.g0.L(100.0f)) {
                            i7 = y7Var.i;
                            if (i7 != -1) {
                                p8Var.H1 = i7;
                                if (i7 == 3) {
                                    if (!p8Var.s1.isEmpty() && !p8Var.t1.isEmpty()) {
                                        p8Var.I1 = i7;
                                    }
                                } else if (i7 != 4) {
                                    p8Var.I1 = i7;
                                } else if (!p8Var.o1.isEmpty() && !p8Var.p1.isEmpty()) {
                                    p8Var.I1 = i7;
                                }
                                k8Var.g(true);
                                k8Var.f(true);
                            }
                            if (i7 != -1) {
                                p8Var.N0();
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
                oj ojVar = ((bn) this.a0).E1;
                return ojVar != null && ojVar.b > 0.5f;
        }
    }

    @Override // org.telegram.ui.Components.j71
    public boolean e(MotionEvent motionEvent) {
        switch (this.W) {
            case 2:
                return getCurrentPosition() != 2;
            default:
                return super.e(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.j71
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

    @Override // org.telegram.ui.Components.j71, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.W) {
            case 3:
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.j71
    public void p(View view, View view2, int i7, int i10) {
        switch (this.W) {
            case 1:
                p8 p8Var = (p8) this.a0;
                if (p8Var.d) {
                    p8Var.N0();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.j71
    public void q() {
        switch (this.W) {
            case 2:
                if (getCurrentPosition() == 1) {
                    ((li.d0) this.a0).v1.d.g3.O(false);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.j71
    public void r() {
        ny0 ny0Var;
        switch (this.W) {
            case 6:
                if ((getCurrentView() instanceof py0) && (ny0Var = ((py0) getCurrentView()).n) != null) {
                    org.telegram.messenger.g0.v1(ny0Var);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.j71
    public final void s(boolean z10) {
        switch (this.W) {
            case 0:
                i2 i2Var = (i2) this.a0;
                i1 i1Var = i2Var.q1;
                h2 h2Var = i2Var.r1;
                if (h2Var != null) {
                    h2Var.G = i1Var.getPositionAnimated();
                    h2Var.invalidate();
                }
                i2Var.b.invalidate();
                invalidate();
                i2.C1 = i1Var.getCurrentPosition();
                break;
            case 1:
                ((p8) this.a0).b.invalidate();
                break;
            case 2:
                ((li.d0) this.a0).b.invalidate();
                break;
            case 3:
                bn bnVar = (bn) this.a0;
                bnVar.m1.getClass();
                bnVar.m1.getClass();
                bnVar.A7();
                break;
            case 4:
                lm0 lm0Var = (lm0) this.a0;
                float positionAnimated = lm0Var.J.getPositionAnimated();
                lm0Var.N.setSelected(positionAnimated);
                lm0Var.e.setProgressToGradient(1.0f - c8.l9.a((positionAnimated - 0.333333f) / 0.333333f, 0.0f, 1.0f));
                lm0Var.K0();
                fm0 H0 = lm0Var.H0();
                e eVar = lm0Var.R;
                if (eVar != null && H0 != null && H0 != lm0Var.S) {
                    lm0Var.S = H0;
                    ji.l lVar = H0.e;
                    eVar.i((CharSequence) lVar.b, true, true);
                    lm0Var.R.g((SpannableStringBuilder) lVar.c, true);
                    break;
                }
                break;
            case 5:
                ((as0) this.a0).e();
                break;
            case 6:
                ((qy0) this.a0).b.invalidate();
                break;
            case 7:
                ((i81) this.a0).e();
                break;
            case 8:
                ((org.telegram.ui.Wallet.d3) this.a0).b.invalidate();
                break;
            default:
                org.telegram.ui.Wallet.n6 n6Var = (org.telegram.ui.Wallet.n6) this.a0;
                n6Var.g1();
                org.telegram.ui.Wallet.r8 r8Var = n6Var.k0;
                if (r8Var != null && r8Var.i1) {
                    r8Var.f0();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.j71
    public void u(int i7) {
        org.telegram.ui.Wallet.j9 j9Var;
        switch (this.W) {
            case 9:
                org.telegram.ui.Wallet.n6 n6Var = (org.telegram.ui.Wallet.n6) this.a0;
                n6Var.f0 = i7;
                if (i7 != 1 && (j9Var = n6Var.j0) != null) {
                    j9Var.b(false);
                }
                if (i7 == 1) {
                    n6Var.s0.post(new org.telegram.ui.Wallet.q4(n6Var, 13));
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.j71
    public void w(int i7) {
        switch (this.W) {
            case 3:
                if (i7 == 0) {
                    bn bnVar = (bn) this.a0;
                    if (bnVar.H1) {
                        bnVar.H1 = false;
                        bnVar.F1.h.clear();
                        break;
                    }
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i1(org.telegram.ui.ActionBar.g2 g2Var, Context context, org.telegram.ui.ActionBar.h6 h6Var, int i7) {
        super(context, h6Var);
        this.W = i7;
        this.a0 = g2Var;
    }
}
