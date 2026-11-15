package hi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.w61;
import org.telegram.ui.an;
import org.telegram.ui.cm0;
import org.telegram.ui.e81;
import org.telegram.ui.im0;
import org.telegram.ui.jy0;
import org.telegram.ui.ly0;
import org.telegram.ui.my0;
import org.telegram.ui.nj;
import org.telegram.ui.xr0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class i1 extends w61 {
    public final /* synthetic */ int W;
    public final /* synthetic */ Object a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i1(int i7, Context context, Object obj) {
        super(context, null);
        this.W = i7;
        this.a0 = obj;
    }

    @Override // org.telegram.ui.Components.w61
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
    @Override // org.telegram.ui.Components.w61
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean b(MotionEvent motionEvent) {
        int i7;
        View E;
        int R;
        switch (this.W) {
            case 1:
                q8 q8Var = (q8) this.a0;
                View currentView = q8Var.m1.getCurrentView();
                if (!(currentView instanceof l8)) {
                    return true;
                }
                if (getCurrentPosition() > 0) {
                    q8Var.M0();
                    return true;
                }
                l8 l8Var = (l8) currentView;
                ArrayList arrayList = l8Var.M;
                uj0 uj0Var = l8Var.f;
                if (l8Var.a == 0 && motionEvent != null && (E = uj0Var.E(motionEvent.getX(), motionEvent.getY() - l8Var.e.getPaddingTop())) != null && (R = RecyclerView.R(E)) >= 0 && R < arrayList.size()) {
                    z7 z7Var = (z7) arrayList.get(R);
                    if (z7Var.a == 3 && !z7Var.n) {
                        boolean z10 = hd.a0;
                        float x10 = motionEvent.getX();
                        if (!z10 ? x10 > org.telegram.messenger.g0.L(100.0f) : x10 < l8Var.getWidth() - org.telegram.messenger.g0.L(100.0f)) {
                            i7 = z7Var.i;
                            if (i7 != -1) {
                                q8Var.H1 = i7;
                                if (i7 == 3) {
                                    if (!q8Var.s1.isEmpty() && !q8Var.t1.isEmpty()) {
                                        q8Var.I1 = i7;
                                    }
                                } else if (i7 != 4) {
                                    q8Var.I1 = i7;
                                } else if (!q8Var.o1.isEmpty() && !q8Var.p1.isEmpty()) {
                                    q8Var.I1 = i7;
                                }
                                l8Var.g(true);
                                l8Var.f(true);
                            }
                            if (i7 != -1) {
                                q8Var.M0();
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
                nj njVar = ((an) this.a0).E1;
                return njVar != null && njVar.b > 0.5f;
        }
    }

    @Override // org.telegram.ui.Components.w61
    public boolean e(MotionEvent motionEvent) {
        switch (this.W) {
            case 2:
                return getCurrentPosition() != 2;
            default:
                return super.e(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.w61
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

    @Override // org.telegram.ui.Components.w61, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.W) {
            case 3:
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.w61
    public void q(View view, View view2, int i7, int i10) {
        switch (this.W) {
            case 1:
                q8 q8Var = (q8) this.a0;
                if (q8Var.d) {
                    q8Var.M0();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.w61
    public void r() {
        switch (this.W) {
            case 2:
                if (getCurrentPosition() == 1) {
                    ((li.d0) this.a0).v1.d.g3.O(false);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.w61
    public void s() {
        jy0 jy0Var;
        switch (this.W) {
            case 6:
                if ((getCurrentView() instanceof ly0) && (jy0Var = ((ly0) getCurrentView()).n) != null) {
                    org.telegram.messenger.g0.v1(jy0Var);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.w61
    public final void t(boolean z10) {
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
                ((q8) this.a0).b.invalidate();
                break;
            case 2:
                ((li.d0) this.a0).b.invalidate();
                break;
            case 3:
                an anVar = (an) this.a0;
                anVar.m1.getClass();
                anVar.m1.getClass();
                anVar.A7();
                break;
            case 4:
                im0 im0Var = (im0) this.a0;
                float positionAnimated = im0Var.J.getPositionAnimated();
                im0Var.N.setSelected(positionAnimated);
                im0Var.e.setProgressToGradient(1.0f - c8.i9.a((positionAnimated - 0.333333f) / 0.333333f, 0.0f, 1.0f));
                im0Var.K0();
                cm0 H0 = im0Var.H0();
                d dVar = im0Var.R;
                if (dVar != null && H0 != null && H0 != im0Var.S) {
                    im0Var.S = H0;
                    ji.j jVar = H0.e;
                    dVar.i((CharSequence) jVar.b, true, true);
                    im0Var.R.g((SpannableStringBuilder) jVar.c, true);
                    break;
                }
                break;
            case 5:
                ((xr0) this.a0).e();
                break;
            case 6:
                ((my0) this.a0).b.invalidate();
                break;
            case 7:
                ((e81) this.a0).e();
                break;
            case 8:
                ((org.telegram.ui.Wallet.w2) this.a0).b.invalidate();
                break;
            default:
                org.telegram.ui.Wallet.y5 y5Var = (org.telegram.ui.Wallet.y5) this.a0;
                y5Var.a1();
                org.telegram.ui.Wallet.c8 c8Var = y5Var.k0;
                if (c8Var != null && c8Var.i1) {
                    c8Var.f0();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.w61
    public void v(int i7) {
        org.telegram.ui.Wallet.u8 u8Var;
        switch (this.W) {
            case 9:
                org.telegram.ui.Wallet.y5 y5Var = (org.telegram.ui.Wallet.y5) this.a0;
                y5Var.f0 = i7;
                if (i7 != 1 && (u8Var = y5Var.j0) != null) {
                    u8Var.b(false);
                }
                if (i7 == 1) {
                    y5Var.q0.post(new org.telegram.ui.Wallet.e4(y5Var, 13));
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.w61
    public void x(int i7) {
        switch (this.W) {
            case 3:
                if (i7 == 0) {
                    an anVar = (an) this.a0;
                    if (anVar.H1) {
                        anVar.H1 = false;
                        anVar.F1.h.clear();
                        break;
                    }
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i1(org.telegram.ui.ActionBar.e2 e2Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i7) {
        super(context, e6Var);
        this.W = i7;
        this.a0 = e2Var;
    }
}
