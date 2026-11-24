// default package

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class hs1 extends wgc {
    public final /* synthetic */ byte W;
    public final /* synthetic */ Object a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hs1(byte b, Context context, Object obj) {
        super(context, null);
        this.W = b;
        this.a0 = obj;
    }

    @Override // wgc
    public final void A(int i) {
        switch (this.W) {
            case 0:
                if (i == 0) {
                    yv1 yv1Var = (yv1) this.a0;
                    if (yv1Var.H1) {
                        yv1Var.H1 = false;
                        yv1Var.F1.h.clear();
                        break;
                    }
                }
                break;
        }
    }

    @Override // wgc
    public final int H() {
        switch (this.W) {
            case 9:
                return 12;
            default:
                return super.H();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    @Override // wgc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(MotionEvent motionEvent) {
        byte b;
        View E;
        int R;
        byte b2 = this.W;
        Object obj = this.a0;
        switch (b2) {
            case 0:
                js1 js1Var = ((yv1) obj).E1;
                return js1Var != null && js1Var.b > 0.5f;
            case 7:
                a8b a8bVar = (a8b) obj;
                View currentView = a8bVar.l1.getCurrentView();
                if (currentView instanceof v7b) {
                    if (getCurrentPosition() > 0) {
                        a8bVar.F0();
                    } else {
                        v7b v7bVar = (v7b) currentView;
                        ArrayList arrayList = v7bVar.M;
                        r59 r59Var = v7bVar.f;
                        if (v7bVar.a == 0 && motionEvent != null && (E = r59Var.E(motionEvent.getX(), motionEvent.getY() - v7bVar.e.getPaddingTop())) != null && (R = RecyclerView.R(E)) >= 0 && R < arrayList.size()) {
                            k7b k7bVar = (k7b) arrayList.get(R);
                            if (k7bVar.a == 3 && !k7bVar.n) {
                                boolean z = jb6.a0;
                                float x = motionEvent.getX();
                                if (!z ? x > gm.L(100.0f) : x < v7bVar.getWidth() - gm.L(100.0f)) {
                                    b = k7bVar.i;
                                    if (b != -1) {
                                        a8bVar.G1 = b;
                                        if (b == 3) {
                                            if (!a8bVar.r1.isEmpty() && !a8bVar.s1.isEmpty()) {
                                                a8bVar.H1 = b;
                                            }
                                        } else if (b != 4) {
                                            a8bVar.H1 = b;
                                        } else if (!a8bVar.n1.isEmpty() && !a8bVar.o1.isEmpty()) {
                                            a8bVar.H1 = b;
                                        }
                                        v7bVar.g(true);
                                        v7bVar.f(true);
                                    }
                                    if (b != -1) {
                                        return false;
                                    }
                                    a8bVar.F0();
                                }
                            }
                        }
                        b = -1;
                        if (b != -1) {
                        }
                        if (b != -1) {
                        }
                    }
                }
                return true;
            default:
                return super.c(motionEvent);
        }
    }

    @Override // wgc
    public final boolean d(MotionEvent motionEvent) {
        switch (this.W) {
            case 1:
                return getCurrentPosition() != 2;
            default:
                return super.d(motionEvent);
        }
    }

    @Override // wgc
    public final boolean h(MotionEvent motionEvent) {
        switch (this.W) {
            case 1:
            case 6:
                return false;
            default:
                return super.h(motionEvent);
        }
    }

    @Override // wgc, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.W) {
            case 0:
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // wgc
    public final void s(View view, View view2, int i, int i2) {
        switch (this.W) {
            case 7:
                a8b a8bVar = (a8b) this.a0;
                if (a8bVar.d) {
                    a8bVar.F0();
                    break;
                }
                break;
        }
    }

    @Override // wgc
    public final void t() {
        switch (this.W) {
            case 1:
                if (getCurrentPosition() == 1) {
                    ((pp2) this.a0).u1.d.g3.O(false);
                    break;
                }
                break;
        }
    }

    @Override // wgc
    public final void v() {
        ba9 ba9Var;
        switch (this.W) {
            case 6:
                if ((getCurrentView() instanceof ca9) && (ba9Var = ((ca9) getCurrentView()).n) != null) {
                    gm.t1(ba9Var);
                    break;
                }
                break;
        }
    }

    @Override // wgc
    public final void w(boolean z) {
        byte b = this.W;
        Object obj = this.a0;
        switch (b) {
            case 0:
                yv1 yv1Var = (yv1) obj;
                yv1Var.m1.getClass();
                yv1Var.m1.getClass();
                yv1Var.y5();
                break;
            case 1:
                ((pp2) obj).b.invalidate();
                break;
            case 2:
                px3 px3Var = (px3) obj;
                hs1 hs1Var = px3Var.p1;
                ox3 ox3Var = px3Var.q1;
                if (ox3Var != null) {
                    ox3Var.G = hs1Var.getPositionAnimated();
                    ox3Var.invalidate();
                }
                px3Var.b.invalidate();
                invalidate();
                px3.C1 = hs1Var.getCurrentPosition();
                break;
            case 3:
                ((mk7) obj).b.invalidate();
                break;
            case 4:
                d38 d38Var = (d38) obj;
                float positionAnimated = d38Var.J.getPositionAnimated();
                d38Var.N.setSelected(positionAnimated);
                d38Var.e.setProgressToGradient(1.0f - pqe.a((positionAnimated - 0.333333f) / 0.333333f, 0.0f, 1.0f));
                d38Var.K0();
                w28 F0 = d38Var.F0();
                b61 b61Var = d38Var.R;
                if (b61Var != null && F0 != null && F0 != d38Var.S) {
                    d38Var.S = F0;
                    mj4 mj4Var = F0.e;
                    b61Var.i((CharSequence) mj4Var.b, true, true);
                    d38Var.R.g((SpannableStringBuilder) mj4Var.c, true);
                    break;
                }
                break;
            case 5:
                ((xg8) obj).e();
                break;
            case 6:
                ((da9) obj).b.invalidate();
                break;
            case 7:
                ((a8b) obj).b.invalidate();
                break;
            case 8:
                ((krb) obj).e();
                break;
            default:
                goc gocVar = (goc) obj;
                gocVar.g1();
                mqc mqcVar = gocVar.k0;
                if (mqcVar != null && mqcVar.i1) {
                    mqcVar.f0();
                    break;
                }
                break;
        }
    }

    @Override // wgc
    public final void y(int i) {
        brc brcVar;
        switch (this.W) {
            case 9:
                goc gocVar = (goc) this.a0;
                gocVar.f0 = i;
                if (i != 1 && (brcVar = gocVar.j0) != null) {
                    brcVar.b(false);
                }
                if (i == 1) {
                    gocVar.s0.post(new pmc(gocVar, (byte) 13));
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hs1(d dVar, Context context, ylb ylbVar, byte b) {
        super(context, ylbVar);
        this.W = b;
        this.a0 = dVar;
    }
}
