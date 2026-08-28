package f2;

import android.os.Build;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class p1 implements Runnable {
    public int a;
    public int b;
    public OverScroller c;
    public Interpolator d;
    public boolean e;
    public boolean f;
    public final /* synthetic */ RecyclerView h;

    public p1(RecyclerView recyclerView) {
        this.h = recyclerView;
        c0 c0Var = RecyclerView.P0;
        this.d = c0Var;
        this.e = false;
        this.f = false;
        this.c = new OverScroller(recyclerView.getContext(), c0Var);
    }

    public final void a() {
        if (this.e) {
            this.f = true;
            return;
        }
        RecyclerView recyclerView = this.h;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = r0.j0.a;
        recyclerView.postOnAnimation(this);
    }

    public final void b(int i9, int i10, int i11, Interpolator interpolator) {
        int i12;
        RecyclerView recyclerView = this.h;
        if (i11 == Integer.MIN_VALUE) {
            int abs = Math.abs(i9);
            int abs2 = Math.abs(i10);
            boolean z10 = abs > abs2;
            int sqrt = (int) Math.sqrt(0);
            int sqrt2 = (int) Math.sqrt((i10 * i10) + (i9 * i9));
            int width = z10 ? recyclerView.getWidth() : recyclerView.getHeight();
            int i13 = width / 2;
            float f10 = width;
            float f11 = i13;
            float sin = (((float) Math.sin((Math.min(1.0f, (sqrt2 * 1.0f) / f10) - 0.5f) * 0.47123894f)) * f11) + f11;
            if (sqrt > 0) {
                i12 = Math.round(Math.abs(sin / sqrt) * 1000.0f) * 4;
            } else {
                if (!z10) {
                    abs = abs2;
                }
                i12 = (int) (((abs / f10) + 1.0f) * 300.0f);
            }
            i11 = Math.min(i12, 2000);
        }
        int i14 = i11;
        if (interpolator == null) {
            interpolator = RecyclerView.P0;
        }
        if (this.d != interpolator) {
            this.d = interpolator;
            this.c = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.b = 0;
        this.a = 0;
        recyclerView.setScrollState(2);
        this.c.startScroll(0, 0, i9, i10, i14);
        if (Build.VERSION.SDK_INT < 23) {
            this.c.computeScrollOffset();
        }
        a();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i9;
        int i10;
        int i11;
        int i12;
        boolean awakenScrollBars;
        RecyclerView recyclerView = this.h;
        int[] iArr = recyclerView.E0;
        if (recyclerView.x == null) {
            recyclerView.J0 = true;
            recyclerView.removeCallbacks(this);
            this.c.abortAnimation();
            return;
        }
        this.f = false;
        this.e = true;
        recyclerView.p();
        OverScroller overScroller = this.c;
        recyclerView.K0 = true;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i13 = currX - this.a;
            int i14 = currY - this.b;
            this.a = currX;
            this.b = currY;
            int[] iArr2 = recyclerView.E0;
            iArr2[0] = 0;
            iArr2[1] = 0;
            if (recyclerView.v(i13, i14, 1, iArr2, null)) {
                i9 = i13 - iArr[0];
                i10 = i14 - iArr[1];
            } else {
                i9 = i13;
                i10 = i14;
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.o(i9, i10);
            }
            if (recyclerView.w != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                recyclerView.t0(i9, i10, iArr);
                i11 = iArr[0];
                i12 = iArr[1];
                i9 -= i11;
                i10 -= i12;
                m1 m1Var = recyclerView.x.e;
                if (m1Var != null && !m1Var.d && m1Var.e) {
                    int b10 = recyclerView.p0.b();
                    if (b10 == 0) {
                        m1Var.h();
                    } else if (m1Var.a >= b10) {
                        m1Var.a = b10 - 1;
                        m1Var.c(i11, i12);
                    } else {
                        m1Var.c(i11, i12);
                    }
                }
            } else {
                i11 = 0;
                i12 = 0;
            }
            if (!recyclerView.y.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.E0;
            iArr3[0] = 0;
            iArr3[1] = 0;
            recyclerView.w(i11, i12, i9, i10, null, 1, iArr3);
            int i15 = i9 - iArr[0];
            int i16 = i10 - iArr[1];
            if (i11 != 0 || i12 != 0) {
                recyclerView.x(i11, i12);
            }
            awakenScrollBars = recyclerView.awakenScrollBars();
            if (!awakenScrollBars) {
                recyclerView.invalidate();
            }
            boolean z10 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i15 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i16 != 0));
            m1 m1Var2 = recyclerView.x.e;
            if ((m1Var2 == null || !m1Var2.d) && z10) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    int i17 = i15 < 0 ? -currVelocity : i15 > 0 ? currVelocity : 0;
                    if (i16 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i16 <= 0) {
                        currVelocity = 0;
                    }
                    if (i17 < 0) {
                        recyclerView.z();
                        if (recyclerView.R.isFinished()) {
                            recyclerView.R.onAbsorb(-i17);
                        }
                    } else if (i17 > 0) {
                        recyclerView.A();
                        if (recyclerView.T.isFinished()) {
                            recyclerView.T.onAbsorb(i17);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.B();
                        if (recyclerView.S.isFinished()) {
                            recyclerView.S.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.y();
                        if (recyclerView.U.isFinished()) {
                            recyclerView.U.onAbsorb(currVelocity);
                        }
                    }
                    if (i17 != 0 || currVelocity != 0) {
                        WeakHashMap weakHashMap = r0.j0.a;
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                if (RecyclerView.O0) {
                    androidx.datastore.preferences.protobuf.i iVar = recyclerView.o0;
                    int[] iArr4 = (int[]) iVar.d;
                    if (iArr4 != null) {
                        Arrays.fill(iArr4, -1);
                    }
                    iVar.c = 0;
                }
            } else {
                a();
                u uVar = recyclerView.n0;
                if (uVar != null) {
                    uVar.a(recyclerView, i11, i12);
                }
            }
        }
        recyclerView.K0 = false;
        m1 m1Var3 = recyclerView.x.e;
        if (m1Var3 != null && m1Var3.d) {
            m1Var3.c(0, 0);
        }
        this.e = false;
        if (!this.f) {
            recyclerView.setScrollState(0);
            recyclerView.A0(1);
        } else {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap2 = r0.j0.a;
            recyclerView.postOnAnimation(this);
        }
    }
}
