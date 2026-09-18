package ai;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.dd0;
import org.telegram.ui.Components.gh0;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class m7 implements z4.e {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m7(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // z4.e
    public final void a(int i10) {
        switch (this.a) {
            case 2:
                dd0 dd0Var = (dd0) this.b;
                z4.e eVar = dd0Var.c;
                if (eVar != null) {
                    eVar.a(i10);
                }
                int i11 = 0;
                while (i11 < dd0Var.d.getChildCount()) {
                    dd0Var.d.getChildAt(i11).setSelected(i11 == i10);
                    i11++;
                }
                break;
        }
    }

    @Override // z4.e
    public final void b(float f7, int i10, int i11) {
        float f10;
        switch (this.a) {
            case 0:
                r7 r7Var = (r7) this.b;
                if (r7Var.w) {
                    k7 k7Var = r7Var.h;
                    k7Var.d.abortAnimation();
                    if (Math.abs(f7) <= 1.0f) {
                        ValueAnimator valueAnimator = k7Var.M;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            k7Var.M = null;
                        }
                        float f11 = (k7Var.s / 2.0f) + ((-k7Var.getMeasuredWidth()) / 2.0f) + ((r2 + k7Var.n) * i10);
                        if (f7 > 0.0f) {
                            f10 = (k7Var.s / 2.0f) + ((-k7Var.getMeasuredWidth()) / 2.0f) + ((i10 + 1) * (r4 + k7Var.n));
                        } else {
                            f10 = (k7Var.s / 2.0f) + ((-k7Var.getMeasuredWidth()) / 2.0f) + ((i10 - 1) * (r4 + k7Var.n));
                            f7 = -f7;
                        }
                        if (f7 == 0.0f) {
                            k7Var.e = f11;
                        } else {
                            k7Var.e = AndroidUtilities.lerp(f11, f10, f7);
                        }
                        k7Var.L = false;
                        k7Var.invalidate();
                        break;
                    }
                }
                break;
            case 1:
                ((ki.i) this.b).e++;
                break;
            case 2:
                dd0 dd0Var = (dd0) this.b;
                dd0Var.h = i10;
                dd0Var.n = f7;
                if (dd0Var.d.getChildAt(i10) != null) {
                    dd0.a(dd0Var, i10, (int) (dd0Var.d.getChildAt(i10).getWidth() * f7));
                    dd0Var.invalidate();
                    z4.e eVar = dd0Var.c;
                    if (eVar != null) {
                        eVar.b(f7, i10, i11);
                        break;
                    }
                }
                break;
            default:
                gh0 gh0Var = (gh0) this.b;
                if (!gh0Var.a && Math.abs(i10 - gh0Var.w) == 1) {
                    int i12 = gh0Var.w;
                    if (i10 > i12) {
                        gh0.a(gh0Var, 0, 1, 1);
                    } else if (i10 < i12) {
                        gh0.a(gh0Var, 1, 0, 0);
                        gh0.a(gh0Var, 2, 0, -1);
                    }
                }
                int i13 = gh0Var.w;
                int i14 = gh0Var.x;
                gh0Var.w = i10;
                gh0Var.x = i11;
                if (i13 != i10 || i14 != i11) {
                    gh0Var.H = true;
                    gh0Var.postInvalidateOnAnimation();
                    break;
                }
                break;
        }
    }

    @Override // z4.e
    public final void c(int i10) {
        switch (this.a) {
            case 0:
                r7 r7Var = (r7) this.b;
                if (i10 == 1) {
                    r7Var.w = true;
                    break;
                }
                break;
            case 2:
                dd0 dd0Var = (dd0) this.b;
                if (i10 == 0) {
                    dd0.a(dd0Var, dd0Var.e.getCurrentItem(), 0);
                }
                z4.e eVar = dd0Var.c;
                if (eVar != null) {
                    eVar.c(i10);
                    break;
                }
                break;
        }
    }

    private final void d(int i10) {
    }

    private final void e(int i10) {
    }

    private final void f(int i10) {
    }

    private final void g(int i10) {
    }

    private final void h(int i10) {
    }
}
