package hi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.k71;
import org.telegram.ui.bn;
import org.telegram.ui.dm0;
import org.telegram.ui.g81;
import org.telegram.ui.jm0;
import org.telegram.ui.my0;
import org.telegram.ui.oj;
import org.telegram.ui.oy0;
import org.telegram.ui.py0;
import org.telegram.ui.zr0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class q1 extends k71 {
    public final /* synthetic */ int W;
    public final /* synthetic */ Object a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q1(int i7, Context context, Object obj) {
        super(context, null);
        this.W = i7;
        this.a0 = obj;
    }

    @Override // org.telegram.ui.Components.k71
    public int F() {
        switch (this.W) {
            case 9:
                return 12;
            default:
                return super.F();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00de A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Components.k71
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean b(MotionEvent motionEvent) {
        int i7;
        View E;
        int R;
        switch (this.W) {
            case 1:
                k9 k9Var = (k9) this.a0;
                View currentView = k9Var.m1.getCurrentView();
                if (!(currentView instanceof f9)) {
                    return true;
                }
                if (getCurrentPosition() > 0) {
                    k9Var.N0();
                    return true;
                }
                f9 f9Var = (f9) currentView;
                ArrayList arrayList = f9Var.M;
                ek0 ek0Var = f9Var.f;
                if (f9Var.a == 0 && motionEvent != null && (E = ek0Var.E(motionEvent.getX(), motionEvent.getY() - f9Var.e.getPaddingTop())) != null && (R = RecyclerView.R(E)) >= 0 && R < arrayList.size()) {
                    t8 t8Var = (t8) arrayList.get(R);
                    if (t8Var.a == 3 && !t8Var.n) {
                        boolean z10 = gd.a0;
                        float x10 = motionEvent.getX();
                        if (!z10 ? x10 > org.telegram.messenger.g0.L(100.0f) : x10 < f9Var.getWidth() - org.telegram.messenger.g0.L(100.0f)) {
                            i7 = t8Var.i;
                            if (i7 != -1) {
                                k9Var.H1 = i7;
                                if (i7 == 3) {
                                    if (!k9Var.s1.isEmpty() && !k9Var.t1.isEmpty()) {
                                        k9Var.I1 = i7;
                                    }
                                } else if (i7 != 4) {
                                    k9Var.I1 = i7;
                                } else if (!k9Var.o1.isEmpty() && !k9Var.p1.isEmpty()) {
                                    k9Var.I1 = i7;
                                }
                                f9Var.g(true);
                                f9Var.f(true);
                            }
                            if (i7 != -1) {
                                k9Var.N0();
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

    @Override // org.telegram.ui.Components.k71
    public boolean e(MotionEvent motionEvent) {
        switch (this.W) {
            case 2:
                return getCurrentPosition() != 2;
            default:
                return super.e(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.k71
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

    @Override // org.telegram.ui.Components.k71, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.W) {
            case 3:
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.k71
    public void q(View view, View view2, int i7, int i10) {
        switch (this.W) {
            case 1:
                k9 k9Var = (k9) this.a0;
                if (k9Var.d) {
                    k9Var.N0();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.k71
    public void r() {
        switch (this.W) {
            case 2:
                if (getCurrentPosition() == 1) {
                    ((li.c0) this.a0).v1.d.g3.O(false);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.k71
    public void s() {
        my0 my0Var;
        switch (this.W) {
            case 6:
                if ((getCurrentView() instanceof oy0) && (my0Var = ((oy0) getCurrentView()).n) != null) {
                    org.telegram.messenger.g0.v1(my0Var);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.k71
    public final void t(boolean z10) {
        switch (this.W) {
            case 0:
                r2 r2Var = (r2) this.a0;
                q1 q1Var = r2Var.q1;
                q2 q2Var = r2Var.r1;
                if (q2Var != null) {
                    q2Var.G = q1Var.getPositionAnimated();
                    q2Var.invalidate();
                }
                r2Var.b.invalidate();
                invalidate();
                r2.D1 = q1Var.getCurrentPosition();
                break;
            case 1:
                ((k9) this.a0).b.invalidate();
                break;
            case 2:
                ((li.c0) this.a0).b.invalidate();
                break;
            case 3:
                bn bnVar = (bn) this.a0;
                bnVar.m1.getClass();
                bnVar.m1.getClass();
                bnVar.A7();
                break;
            case 4:
                jm0 jm0Var = (jm0) this.a0;
                float positionAnimated = jm0Var.J.getPositionAnimated();
                jm0Var.N.setSelected(positionAnimated);
                jm0Var.e.setProgressToGradient(1.0f - c8.m9.a((positionAnimated - 0.333333f) / 0.333333f, 0.0f, 1.0f));
                jm0Var.K0();
                dm0 H0 = jm0Var.H0();
                e eVar = jm0Var.R;
                if (eVar != null && H0 != null && H0 != jm0Var.S) {
                    jm0Var.S = H0;
                    j6.k kVar = H0.e;
                    eVar.i((CharSequence) kVar.b, true, true);
                    jm0Var.R.g((SpannableStringBuilder) kVar.c, true);
                    break;
                }
                break;
            case 5:
                ((zr0) this.a0).e();
                break;
            case 6:
                ((py0) this.a0).b.invalidate();
                break;
            case 7:
                ((g81) this.a0).e();
                break;
            case 8:
                ((org.telegram.ui.Wallet.e3) this.a0).b.invalidate();
                break;
            default:
                org.telegram.ui.Wallet.o6 o6Var = (org.telegram.ui.Wallet.o6) this.a0;
                o6Var.g1();
                org.telegram.ui.Wallet.s8 s8Var = o6Var.k0;
                if (s8Var != null && s8Var.i1) {
                    s8Var.f0();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.k71
    public void v(int i7) {
        org.telegram.ui.Wallet.k9 k9Var;
        switch (this.W) {
            case 9:
                org.telegram.ui.Wallet.o6 o6Var = (org.telegram.ui.Wallet.o6) this.a0;
                o6Var.f0 = i7;
                if (i7 != 1 && (k9Var = o6Var.j0) != null) {
                    k9Var.b(false);
                }
                if (i7 == 1) {
                    o6Var.s0.post(new org.telegram.ui.Wallet.r4(o6Var, 13));
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.k71
    public void x(int i7) {
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
    public /* synthetic */ q1(org.telegram.ui.ActionBar.g2 g2Var, Context context, org.telegram.ui.ActionBar.i6 i6Var, int i7) {
        super(context, i6Var);
        this.W = i7;
        this.a0 = g2Var;
    }
}
