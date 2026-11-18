package hi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.g71;
import org.telegram.ui.as0;
import org.telegram.ui.bn;
import org.telegram.ui.fm0;
import org.telegram.ui.i81;
import org.telegram.ui.lm0;
import org.telegram.ui.ny0;
import org.telegram.ui.oj;
import org.telegram.ui.py0;
import org.telegram.ui.qy0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class i1 extends g71 {
    public final /* synthetic */ int W;
    public final /* synthetic */ Object a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i1(int i7, Context context, Object obj) {
        super(context, null);
        this.W = i7;
        this.a0 = obj;
    }

    @Override // org.telegram.ui.Components.g71
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
    @Override // org.telegram.ui.Components.g71
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
                    q8Var.N0();
                    return true;
                }
                l8 l8Var = (l8) currentView;
                ArrayList arrayList = l8Var.M;
                ck0 ck0Var = l8Var.f;
                if (l8Var.a == 0 && motionEvent != null && (E = ck0Var.E(motionEvent.getX(), motionEvent.getY() - l8Var.e.getPaddingTop())) != null && (R = RecyclerView.R(E)) >= 0 && R < arrayList.size()) {
                    z7 z7Var = (z7) arrayList.get(R);
                    if (z7Var.a == 3 && !z7Var.n) {
                        boolean z10 = gd.a0;
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
                                q8Var.N0();
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

    @Override // org.telegram.ui.Components.g71
    public boolean e(MotionEvent motionEvent) {
        switch (this.W) {
            case 2:
                return getCurrentPosition() != 2;
            default:
                return super.e(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.g71
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

    @Override // org.telegram.ui.Components.g71, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.W) {
            case 3:
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // org.telegram.ui.Components.g71
    public void p(View view, View view2, int i7, int i10) {
        switch (this.W) {
            case 1:
                q8 q8Var = (q8) this.a0;
                if (q8Var.d) {
                    q8Var.N0();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.g71
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

    @Override // org.telegram.ui.Components.g71
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

    @Override // org.telegram.ui.Components.g71
    public final void s(boolean z10) {
        switch (this.W) {
            case 0:
                j2 j2Var = (j2) this.a0;
                i1 i1Var = j2Var.q1;
                i2 i2Var = j2Var.r1;
                if (i2Var != null) {
                    i2Var.G = i1Var.getPositionAnimated();
                    i2Var.invalidate();
                }
                j2Var.b.invalidate();
                invalidate();
                j2.C1 = i1Var.getCurrentPosition();
                break;
            case 1:
                ((q8) this.a0).b.invalidate();
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
                d dVar = lm0Var.R;
                if (dVar != null && H0 != null && H0 != lm0Var.S) {
                    lm0Var.S = H0;
                    ji.j jVar = H0.e;
                    dVar.i((CharSequence) jVar.b, true, true);
                    lm0Var.R.g((SpannableStringBuilder) jVar.c, true);
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

    @Override // org.telegram.ui.Components.g71
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

    @Override // org.telegram.ui.Components.g71
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
    public /* synthetic */ i1(org.telegram.ui.ActionBar.h2 h2Var, Context context, org.telegram.ui.ActionBar.i6 i6Var, int i7) {
        super(context, i6Var);
        this.W = i7;
        this.a0 = h2Var;
    }
}
