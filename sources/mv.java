// default package

import android.animation.ValueAnimator;
import android.widget.LinearLayout;
import org.telegram.messenger.Intro;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class mv implements dic {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mv(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // dic
    public final void a(int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                qv qvVar = (qv) obj;
                qvVar.x = i;
                qvVar.d.invalidate();
                break;
            case 1:
                ((yr5) obj).I = i;
                break;
            case 2:
                yu7 yu7Var = (yu7) obj;
                LinearLayout linearLayout = yu7Var.d;
                dic dicVar = yu7Var.c;
                if (dicVar != null) {
                    dicVar.a(i);
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
                ((pqb) obj).c0.invalidate();
                break;
        }
    }

    @Override // dic
    public final void b(float f, int i, int i2) {
        float f2;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                qv qvVar = (qv) obj;
                float measuredWidth = qvVar.b.getMeasuredWidth();
                if (measuredWidth != 0.0f) {
                    qvVar.w = c00.c(qvVar.x, measuredWidth, (i * measuredWidth) + i2, measuredWidth);
                    qvVar.d.invalidate();
                    break;
                }
                break;
            case 1:
                yr5 yr5Var = (yr5) obj;
                zw0 zw0Var = yr5Var.e;
                zw0Var.b = f;
                zw0Var.c = i;
                zw0Var.invalidate();
                float measuredWidth2 = yr5Var.d.getMeasuredWidth();
                if (measuredWidth2 != 0.0f) {
                    Intro.setScrollOffset((((i * measuredWidth2) + i2) - (yr5Var.I * measuredWidth2)) / measuredWidth2);
                    break;
                }
                break;
            case 2:
                yu7 yu7Var = (yu7) obj;
                yu7Var.h = i;
                yu7Var.n = f;
                if (yu7Var.d.getChildAt(i) != null) {
                    yu7Var.d(i, (int) (r0.getChildAt(i).getWidth() * f));
                    yu7Var.invalidate();
                    dic dicVar = yu7Var.c;
                    if (dicVar != null) {
                        dicVar.b(f, i, i2);
                        break;
                    }
                }
                break;
            case 3:
                ws8 ws8Var = (ws8) obj;
                if (!ws8Var.a && Math.abs(i - ws8Var.x) == 1) {
                    int i3 = ws8Var.x;
                    if (i > i3) {
                        ws8Var.i(0, 1, 1);
                    } else if (i < i3) {
                        ws8Var.i(1, 0, 0);
                        ws8Var.i(2, 0, -1);
                    }
                }
                int i4 = ws8Var.x;
                int i5 = ws8Var.y;
                ws8Var.x = i;
                ws8Var.y = i2;
                if (i4 != i || i5 != i2) {
                    ws8Var.I = true;
                    ws8Var.postInvalidateOnAnimation();
                    break;
                }
                break;
            case 4:
                g4a g4aVar = (g4a) obj;
                if (g4aVar.x) {
                    a4a a4aVar = g4aVar.h;
                    a4aVar.d.abortAnimation();
                    if (Math.abs(f) <= 1.0f) {
                        ValueAnimator valueAnimator = a4aVar.N;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            a4aVar.N = null;
                        }
                        float f3 = (a4aVar.s / 2.0f) + ((-a4aVar.getMeasuredWidth()) / 2.0f) + ((r4 + a4aVar.n) * i);
                        if (f > 0.0f) {
                            f2 = (a4aVar.s / 2.0f) + ((-a4aVar.getMeasuredWidth()) / 2.0f) + ((i + 1) * (r4 + a4aVar.n));
                        } else {
                            f2 = (a4aVar.s / 2.0f) + ((-a4aVar.getMeasuredWidth()) / 2.0f) + ((i - 1) * (r4 + a4aVar.n));
                            f = -f;
                        }
                        if (f == 0.0f) {
                            a4aVar.e = f3;
                        } else {
                            a4aVar.e = hl.R1(f3, f2, f);
                        }
                        a4aVar.M = false;
                        a4aVar.invalidate();
                        break;
                    }
                }
                break;
        }
    }

    @Override // dic
    public final void c(int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 1:
                yr5 yr5Var = (yr5) obj;
                if (i != 1) {
                    if (i == 0 || i == 2) {
                        if (yr5Var.L) {
                            yr5Var.L = false;
                        }
                        if (yr5Var.x != yr5Var.d.getCurrentItem()) {
                            yr5Var.x = yr5Var.d.getCurrentItem();
                            break;
                        }
                    }
                } else {
                    yr5Var.L = true;
                    yr5Var.d.getCurrentItem();
                    yr5Var.d.getMeasuredWidth();
                    break;
                }
                break;
            case 2:
                yu7 yu7Var = (yu7) obj;
                if (i == 0) {
                    yu7Var.d(yu7Var.e.getCurrentItem(), 0);
                }
                dic dicVar = yu7Var.c;
                if (dicVar != null) {
                    dicVar.c(i);
                    break;
                }
                break;
            case 4:
                g4a g4aVar = (g4a) obj;
                if (i == 1) {
                    g4aVar.x = true;
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
