// default package

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class ir1 extends vic {
    public final /* synthetic */ byte W;
    public final /* synthetic */ Object a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ir1(byte b, Context context, Object obj) {
        super(context, null);
        this.W = b;
        this.a0 = obj;
    }

    @Override // vic
    public final void B(int i) {
        switch (this.W) {
            case 0:
                if (i == 0) {
                    zu1 zu1Var = (zu1) this.a0;
                    if (zu1Var.H1) {
                        zu1Var.H1 = false;
                        zu1Var.F1.h.clear();
                        break;
                    }
                }
                break;
        }
    }

    @Override // vic
    public final int I() {
        switch (this.W) {
            case 10:
                return 12;
            default:
                return super.I();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    @Override // vic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(MotionEvent motionEvent) {
        byte b;
        View F;
        int S;
        byte b2 = this.W;
        Object obj = this.a0;
        switch (b2) {
            case 0:
                kr1 kr1Var = ((zu1) obj).E1;
                return kr1Var != null && kr1Var.b > 0.5f;
            case 8:
                w9b w9bVar = (w9b) obj;
                View currentView = w9bVar.l1.getCurrentView();
                if (currentView instanceof r9b) {
                    if (getCurrentPosition() > 0) {
                        w9bVar.G0();
                    } else {
                        r9b r9bVar = (r9b) currentView;
                        ArrayList arrayList = r9bVar.M;
                        d79 d79Var = r9bVar.f;
                        if (r9bVar.a == 0 && motionEvent != null && (F = d79Var.F(motionEvent.getX(), motionEvent.getY() - r9bVar.e.getPaddingTop())) != null && (S = RecyclerView.S(F)) >= 0 && S < arrayList.size()) {
                            h9b h9bVar = (h9b) arrayList.get(S);
                            if (h9bVar.a == 3 && !h9bVar.n) {
                                boolean z = ob6.a0;
                                float x = motionEvent.getX();
                                if (!z ? x > hl.L(100.0f) : x < r9bVar.getWidth() - hl.L(100.0f)) {
                                    b = h9bVar.i;
                                    if (b != -1) {
                                        w9bVar.G1 = b;
                                        if (b == 3) {
                                            if (!w9bVar.r1.isEmpty() && !w9bVar.s1.isEmpty()) {
                                                w9bVar.H1 = b;
                                            }
                                        } else if (b != 4) {
                                            w9bVar.H1 = b;
                                        } else if (!w9bVar.n1.isEmpty() && !w9bVar.o1.isEmpty()) {
                                            w9bVar.H1 = b;
                                        }
                                        r9bVar.g(true);
                                        r9bVar.f(true);
                                    }
                                    if (b != -1) {
                                        return false;
                                    }
                                    w9bVar.G0();
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

    @Override // vic
    public final boolean f(MotionEvent motionEvent) {
        switch (this.W) {
            case 1:
                return getCurrentPosition() != 2;
            case 4:
                return !((lm7) this.a0).u0(false);
            default:
                return super.f(motionEvent);
        }
    }

    @Override // vic
    public final boolean i(MotionEvent motionEvent) {
        switch (this.W) {
            case 1:
                return false;
            case 4:
                return !((lm7) this.a0).u0(true);
            case 7:
                return false;
            default:
                return super.i(motionEvent);
        }
    }

    @Override // vic, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.W) {
            case 0:
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // vic
    public final void t(View view, View view2, int i, int i2) {
        switch (this.W) {
            case 8:
                w9b w9bVar = (w9b) this.a0;
                if (w9bVar.d) {
                    w9bVar.G0();
                    break;
                }
                break;
        }
    }

    @Override // vic
    public final void v() {
        switch (this.W) {
            case 1:
                if (getCurrentPosition() == 1) {
                    ((xo2) this.a0).u1.d.g3.O(false);
                    break;
                }
                break;
        }
    }

    @Override // vic
    public final void w() {
        lb9 lb9Var;
        switch (this.W) {
            case 4:
                lm7 lm7Var = (lm7) this.a0;
                if (lm7Var.M && TextUtils.isEmpty(lm7Var.Q)) {
                    lm7Var.j0();
                    break;
                }
                break;
            case 7:
                if ((getCurrentView() instanceof mb9) && (lb9Var = ((mb9) getCurrentView()).n) != null) {
                    hl.t1(lb9Var);
                    break;
                }
                break;
        }
    }

    @Override // vic
    public final void x(boolean z) {
        ir1 ir1Var;
        byte b = this.W;
        Object obj = this.a0;
        switch (b) {
            case 0:
                zu1 zu1Var = (zu1) obj;
                zu1Var.m1.getClass();
                zu1Var.m1.getClass();
                zu1Var.x5();
                break;
            case 1:
                ((xo2) obj).b.invalidate();
                break;
            case 2:
                zw3 zw3Var = (zw3) obj;
                ir1 ir1Var2 = zw3Var.p1;
                yw3 yw3Var = zw3Var.q1;
                if (yw3Var != null) {
                    yw3Var.G = ir1Var2.getPositionAnimated();
                    yw3Var.invalidate();
                }
                zw3Var.b.invalidate();
                invalidate();
                zw3.C1 = ir1Var2.getCurrentPosition();
                break;
            case 3:
                ((sk7) obj).b.invalidate();
                break;
            case 4:
                lm7 lm7Var = (lm7) obj;
                cm7 cm7Var = lm7Var.x;
                if (cm7Var != null && (ir1Var = lm7Var.w) != null && !cm7Var.Q) {
                    int currentPosition = ir1Var.getCurrentPosition();
                    float positionAnimated = lm7Var.w.getPositionAnimated();
                    float f = currentPosition;
                    float abs = Math.abs(positionAnimated - f);
                    cm7 cm7Var2 = lm7Var.x;
                    if (abs < 0.001f) {
                        cm7Var2.j(1.0f, currentPosition);
                    } else {
                        cm7Var2.j(abs, positionAnimated > f ? currentPosition + 1 : currentPosition - 1);
                    }
                }
                lm7Var.P0();
                break;
            case 5:
                h48 h48Var = (h48) obj;
                float positionAnimated2 = h48Var.J.getPositionAnimated();
                h48Var.N.setSelected(positionAnimated2);
                h48Var.e.setProgressToGradient(1.0f - ete.a((positionAnimated2 - 0.333333f) / 0.333333f, 0.0f, 1.0f));
                h48Var.K0();
                a48 F0 = h48Var.F0();
                c51 c51Var = h48Var.R;
                if (c51Var != null && F0 != null && F0 != h48Var.S) {
                    h48Var.S = F0;
                    ym4 ym4Var = F0.e;
                    c51Var.i((CharSequence) ym4Var.b, true, true);
                    h48Var.R.g((SpannableStringBuilder) ym4Var.c, true);
                    break;
                }
                break;
            case 6:
                ((ji8) obj).e();
                break;
            case 7:
                ((nb9) obj).b.invalidate();
                break;
            case 8:
                ((w9b) obj).b.invalidate();
                break;
            case 9:
                ((ktb) obj).e();
                break;
            default:
                uqc uqcVar = (uqc) obj;
                uqcVar.f1();
                wsc wscVar = uqcVar.k0;
                if (wscVar != null && wscVar.i1) {
                    wscVar.f0();
                    break;
                }
                break;
        }
    }

    @Override // vic
    public final void z(int i) {
        ltc ltcVar;
        switch (this.W) {
            case 10:
                uqc uqcVar = (uqc) this.a0;
                uqcVar.f0 = i;
                if (i != 1 && (ltcVar = uqcVar.j0) != null) {
                    ltcVar.b(false);
                }
                if (i == 1) {
                    uqcVar.s0.post(new cpc(uqcVar, (byte) 3));
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ir1(e eVar, Context context, vnb vnbVar, byte b) {
        super(context, vnbVar);
        this.W = b;
        this.a0 = eVar;
    }
}
