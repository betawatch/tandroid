// default package

import android.animation.ValueAnimator;
import android.widget.LinearLayout;
import org.telegram.messenger.Intro;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class lv implements eec {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lv(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // eec
    public final void a(int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                pv pvVar = (pv) obj;
                pvVar.x = i;
                pvVar.d.invalidate();
                break;
            case 1:
                ((wp5) obj).I = i;
                break;
            case 2:
                sr7 sr7Var = (sr7) obj;
                LinearLayout linearLayout = sr7Var.d;
                eec eecVar = sr7Var.c;
                if (eecVar != null) {
                    eecVar.a(i);
                }
                int i2 = 0;
                while (i2 < linearLayout.getChildCount()) {
                    linearLayout.getChildAt(i2).setSelected(i2 == i);
                    i2++;
                }
                break;
            case 3:
            case 4:
                break;
            default:
                ((qmb) obj).c0.invalidate();
                break;
        }
    }

    @Override // eec
    public final void b(float f, int i, int i2) {
        float f2;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                pv pvVar = (pv) obj;
                float measuredWidth = pvVar.b.getMeasuredWidth();
                if (measuredWidth != 0.0f) {
                    pvVar.w = b00.b(pvVar.x, measuredWidth, (i * measuredWidth) + i2, measuredWidth);
                    pvVar.d.invalidate();
                    break;
                }
                break;
            case 1:
                wp5 wp5Var = (wp5) obj;
                qw0 qw0Var = wp5Var.e;
                qw0Var.b = f;
                qw0Var.c = i;
                qw0Var.invalidate();
                float measuredWidth2 = wp5Var.d.getMeasuredWidth();
                if (measuredWidth2 != 0.0f) {
                    Intro.setScrollOffset((((i * measuredWidth2) + i2) - (wp5Var.I * measuredWidth2)) / measuredWidth2);
                    break;
                }
                break;
            case 2:
                sr7 sr7Var = (sr7) obj;
                sr7Var.h = i;
                sr7Var.n = f;
                if (sr7Var.d.getChildAt(i) != null) {
                    sr7Var.d(i, (int) (r0.getChildAt(i).getWidth() * f));
                    sr7Var.invalidate();
                    eec eecVar = sr7Var.c;
                    if (eecVar != null) {
                        eecVar.b(f, i, i2);
                        break;
                    }
                }
                break;
            case 3:
                kp8 kp8Var = (kp8) obj;
                if (!kp8Var.a && Math.abs(i - kp8Var.x) == 1) {
                    int i3 = kp8Var.x;
                    if (i > i3) {
                        kp8Var.i(0, 1, 1);
                    } else if (i < i3) {
                        kp8Var.i(1, 0, 0);
                        kp8Var.i(2, 0, -1);
                    }
                }
                int i4 = kp8Var.x;
                int i5 = kp8Var.y;
                kp8Var.x = i;
                kp8Var.y = i2;
                if (i4 != i || i5 != i2) {
                    kp8Var.I = true;
                    kp8Var.postInvalidateOnAnimation();
                    break;
                }
                break;
            case 4:
                n0a n0aVar = (n0a) obj;
                if (n0aVar.x) {
                    h0a h0aVar = n0aVar.h;
                    h0aVar.d.abortAnimation();
                    if (Math.abs(f) <= 1.0f) {
                        ValueAnimator valueAnimator = h0aVar.N;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            h0aVar.N = null;
                        }
                        float f3 = (h0aVar.s / 2.0f) + ((-h0aVar.getMeasuredWidth()) / 2.0f) + ((r4 + h0aVar.n) * i);
                        if (f > 0.0f) {
                            f2 = (h0aVar.s / 2.0f) + ((-h0aVar.getMeasuredWidth()) / 2.0f) + ((i + 1) * (r4 + h0aVar.n));
                        } else {
                            f2 = (h0aVar.s / 2.0f) + ((-h0aVar.getMeasuredWidth()) / 2.0f) + ((i - 1) * (r4 + h0aVar.n));
                            f = -f;
                        }
                        if (f == 0.0f) {
                            h0aVar.e = f3;
                        } else {
                            h0aVar.e = gl.R1(f3, f2, f);
                        }
                        h0aVar.M = false;
                        h0aVar.invalidate();
                        break;
                    }
                }
                break;
        }
    }

    @Override // eec
    public final void c(int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 1:
                wp5 wp5Var = (wp5) obj;
                if (i != 1) {
                    if (i == 0 || i == 2) {
                        if (wp5Var.L) {
                            wp5Var.L = false;
                        }
                        if (wp5Var.x != wp5Var.d.getCurrentItem()) {
                            wp5Var.x = wp5Var.d.getCurrentItem();
                            break;
                        }
                    }
                } else {
                    wp5Var.L = true;
                    wp5Var.d.getCurrentItem();
                    wp5Var.d.getMeasuredWidth();
                    break;
                }
                break;
            case 2:
                sr7 sr7Var = (sr7) obj;
                if (i == 0) {
                    sr7Var.d(sr7Var.e.getCurrentItem(), 0);
                }
                eec eecVar = sr7Var.c;
                if (eecVar != null) {
                    eecVar.c(i);
                    break;
                }
                break;
            case 4:
                n0a n0aVar = (n0a) obj;
                if (i == 1) {
                    n0aVar.x = true;
                    break;
                }
                break;
        }
    }

    private final void d(int i) {
    }

    private final void e(int i) {
    }

    private final void f(int i) {
    }

    private final void h(int i) {
    }

    private final void i(int i) {
    }

    private final void g(float f, int i, int i2) {
    }
}
