// default package

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class e89 implements Runnable {
    public int a;
    public int b;
    public OverScroller c;
    public Interpolator d;
    public boolean e;
    public boolean f;
    public final /* synthetic */ RecyclerView h;

    public e89(RecyclerView recyclerView) {
        this.h = recyclerView;
        if3 if3Var = RecyclerView.S0;
        this.d = if3Var;
        this.e = false;
        this.f = false;
        this.c = new OverScroller(recyclerView.getContext(), if3Var);
    }

    public final void a() {
        if (this.e) {
            this.f = true;
            return;
        }
        RecyclerView recyclerView = this.h;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = ihc.a;
        recyclerView.postOnAnimation(this);
    }

    public final void b(int i, int i2, int i3, Interpolator interpolator) {
        RecyclerView recyclerView = this.h;
        if (i3 == Integer.MIN_VALUE) {
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            boolean z = abs > abs2;
            float width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z) {
                abs = abs2;
            }
            i3 = Math.min((int) (((abs / width) + 1.0f) * 300.0f), 2000);
        }
        int i4 = i3;
        if (interpolator == null) {
            interpolator = RecyclerView.S0;
        }
        if (this.d != interpolator) {
            this.d = interpolator;
            this.c = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.b = 0;
        this.a = 0;
        recyclerView.setScrollState(2);
        this.c.startScroll(0, 0, i, i2, i4);
        a();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        boolean awakenScrollBars;
        RecyclerView recyclerView = this.h;
        int[] iArr = recyclerView.K0;
        if (recyclerView.y == null) {
            recyclerView.P0 = true;
            recyclerView.removeCallbacks(this);
            this.c.abortAnimation();
            return;
        }
        this.f = false;
        this.e = true;
        recyclerView.q();
        OverScroller overScroller = this.c;
        recyclerView.Q0 = true;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i5 = currX - this.a;
            int i6 = currY - this.b;
            this.a = currX;
            this.b = currY;
            int[] iArr2 = recyclerView.K0;
            iArr2[0] = 0;
            iArr2[1] = 0;
            if (recyclerView.w(i5, i6, 1, iArr2, null)) {
                i = i5 - iArr[0];
                i2 = i6 - iArr[1];
            } else {
                i = i5;
                i2 = i6;
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.p(i, i2);
            }
            if (recyclerView.x != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                recyclerView.w0(i, i2, iArr);
                i3 = iArr[0];
                i4 = iArr[1];
                i -= i3;
                i2 -= i4;
                b89 b89Var = recyclerView.y.e;
                if (b89Var != null && !b89Var.d && b89Var.e) {
                    int b = recyclerView.v0.b();
                    if (b == 0) {
                        b89Var.h();
                    } else if (b89Var.a >= b) {
                        b89Var.a = b - 1;
                        b89Var.c(i3, i4);
                    } else {
                        b89Var.c(i3, i4);
                    }
                }
            } else {
                i3 = 0;
                i4 = 0;
            }
            if (!recyclerView.E.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.K0;
            iArr3[0] = 0;
            iArr3[1] = 0;
            recyclerView.x(i3, i4, i, i2, null, 1, iArr3);
            int i7 = i - iArr[0];
            int i8 = i2 - iArr[1];
            if (i3 != 0 || i4 != 0) {
                recyclerView.y(i3, i4);
            }
            awakenScrollBars = recyclerView.awakenScrollBars();
            if (!awakenScrollBars) {
                recyclerView.invalidate();
            }
            boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i7 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i8 != 0));
            b89 b89Var2 = recyclerView.y.e;
            if ((b89Var2 == null || !b89Var2.d) && z) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    int i9 = i7 < 0 ? -currVelocity : i7 > 0 ? currVelocity : 0;
                    if (i8 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i8 <= 0) {
                        currVelocity = 0;
                    }
                    Integer num = recyclerView.J0;
                    if (num == null || num.intValue() != 0) {
                        if (i9 < 0) {
                            recyclerView.A();
                            if (recyclerView.W.isFinished()) {
                                recyclerView.W.onAbsorb(-i9);
                            }
                        } else if (i9 > 0) {
                            recyclerView.B();
                            if (recyclerView.b0.isFinished()) {
                                recyclerView.b0.onAbsorb(i9);
                            }
                        }
                        if (currVelocity < 0) {
                            recyclerView.C();
                            if (recyclerView.a0.isFinished()) {
                                recyclerView.a0.onAbsorb(-currVelocity);
                            }
                        } else if (currVelocity > 0) {
                            recyclerView.z();
                            if (recyclerView.c0.isFinished()) {
                                recyclerView.c0.onAbsorb(currVelocity);
                            }
                        }
                        if (i9 != 0 || currVelocity != 0) {
                            WeakHashMap weakHashMap = ihc.a;
                            recyclerView.postInvalidateOnAnimation();
                        }
                    }
                }
                pn pnVar = recyclerView.u0;
                int[] iArr4 = pnVar.a;
                if (iArr4 != null) {
                    Arrays.fill(iArr4, -1);
                }
                pnVar.d = 0;
            } else {
                a();
                cu4 cu4Var = recyclerView.t0;
                if (cu4Var != null) {
                    cu4Var.a(recyclerView, i3, i4);
                }
            }
        }
        recyclerView.Q0 = false;
        b89 b89Var3 = recyclerView.y.e;
        if (b89Var3 != null && b89Var3.d) {
            b89Var3.c(0, 0);
        }
        this.e = false;
        if (!this.f) {
            recyclerView.setScrollState(0);
            recyclerView.D0(1);
        } else {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap2 = ihc.a;
            recyclerView.postOnAnimation(this);
        }
    }
}
