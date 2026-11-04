package mg;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.MotionEvent;
import gi.k6;
import org.telegram.messenger.g0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class j {
    public g a;
    public float b;
    public boolean c;
    public float d;
    public float e;
    public long f;
    public ValueAnimator g;
    public Rect h;
    public Rect i;
    public Rect j;
    public float k;
    public float l;
    public float m;
    public h[] n;

    public final boolean a(int i3, int i10, int i11) {
        h hVar;
        Rect rect = this.i;
        Rect rect2 = this.h;
        h[] hVarArr = this.n;
        if (i11 != 0) {
            if (i11 == 1 && (hVar = hVarArr[0]) != null && hVar.a != 4) {
                if (rect2.contains(i3, i10) && hVarArr[0].a != 1) {
                    h hVar2 = new h(this, 1);
                    hVarArr[1] = hVar2;
                    hVar2.c = this.k;
                    hVar2.b = i3;
                    hVar2.a();
                    ValueAnimator valueAnimator = this.g;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        return true;
                    }
                } else if (rect.contains(i3, i10) && hVarArr[0].a != 2) {
                    h hVar3 = new h(this, 2);
                    hVarArr[1] = hVar3;
                    hVar3.d = this.l;
                    hVar3.b = i3;
                    hVar3.a();
                    ValueAnimator valueAnimator2 = this.g;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                }
                return true;
            }
            return false;
        }
        if (rect2.contains(i3, i10)) {
            h hVar4 = hVarArr[0];
            if (hVar4 != null) {
                hVarArr[1] = hVar4;
            }
            h hVar5 = new h(this, 1);
            hVarArr[0] = hVar5;
            hVar5.c = this.k;
            hVar5.b = i3;
            hVar5.a();
            ValueAnimator valueAnimator3 = this.g;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
                return true;
            }
        } else if (rect.contains(i3, i10)) {
            h hVar6 = hVarArr[0];
            if (hVar6 != null) {
                hVarArr[1] = hVar6;
            }
            h hVar7 = new h(this, 2);
            hVarArr[0] = hVar7;
            hVar7.d = this.l;
            hVar7.b = i3;
            hVar7.a();
            ValueAnimator valueAnimator4 = this.g;
            if (valueAnimator4 != null) {
                valueAnimator4.cancel();
                return true;
            }
        } else {
            if (!this.j.contains(i3, i10)) {
                if (i10 < rect2.bottom && i10 > rect2.top) {
                    this.c = true;
                    this.d = i3;
                    this.e = i10;
                    this.f = System.currentTimeMillis();
                    ValueAnimator valueAnimator5 = this.g;
                    if (valueAnimator5 != null) {
                        if (valueAnimator5.isRunning()) {
                            this.a.a(this.k, this.l, true);
                        }
                        this.g.cancel();
                        return true;
                    }
                }
                return false;
            }
            h hVar8 = new h(this, 4);
            hVarArr[0] = hVar8;
            hVar8.d = this.l;
            hVar8.c = this.k;
            hVar8.b = i3;
            hVar8.a();
            ValueAnimator valueAnimator6 = this.g;
            if (valueAnimator6 != null) {
                valueAnimator6.cancel();
                return true;
            }
        }
        return true;
    }

    public final boolean b(int i3, int i10) {
        h hVar;
        boolean z10;
        if (this.c || (hVar = this.n[i10]) == null) {
            return false;
        }
        int i11 = hVar.a;
        float f10 = hVar.c;
        float f11 = hVar.d;
        int i12 = hVar.b;
        if (i11 == 1) {
            float f12 = f10 - ((i12 - i3) / this.b);
            this.k = f12;
            if (f12 < 0.0f) {
                this.k = 0.0f;
            }
            float f13 = this.l;
            float f14 = f13 - this.k;
            float f15 = this.m;
            if (f14 < f15) {
                this.k = f13 - f15;
            }
            z10 = true;
        } else {
            z10 = false;
        }
        if (i11 == 2) {
            float f16 = f11 - ((i12 - i3) / this.b);
            this.l = f16;
            if (f16 > 1.0f) {
                this.l = 1.0f;
            }
            float f17 = this.l;
            float f18 = this.k;
            float f19 = f17 - f18;
            float f20 = this.m;
            if (f19 < f20) {
                this.l = f18 + f20;
            }
            z10 = true;
        }
        if (i11 == 4) {
            float f21 = (i12 - i3) / this.b;
            float f22 = f10 - f21;
            this.k = f22;
            this.l = f11 - f21;
            if (f22 < 0.0f) {
                this.k = 0.0f;
                this.l = f11 - f10;
            }
            if (this.l > 1.0f) {
                this.l = 1.0f;
                this.k = 1.0f - (f11 - f10);
            }
            z10 = true;
        }
        if (z10) {
            this.a.A(true, false, false);
        }
        return true;
    }

    public final boolean c(int i3, MotionEvent motionEvent) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        float f10;
        float f11;
        h[] hVarArr = this.n;
        if (i3 != 0) {
            h hVar = hVarArr[1];
            if (hVar != null && (valueAnimator = hVar.e) != null) {
                valueAnimator.cancel();
            }
            hVarArr[1] = null;
            return false;
        }
        if (!this.c) {
            h hVar2 = hVarArr[0];
            if (hVar2 != null && (valueAnimator2 = hVar2.e) != null) {
                valueAnimator2.cancel();
            }
            hVarArr[0] = null;
            h hVar3 = hVarArr[1];
            if (hVar3 != null) {
                hVarArr[0] = hVar3;
                hVarArr[1] = null;
            }
            return false;
        }
        this.c = false;
        float x10 = this.d - motionEvent.getX();
        float y9 = this.e - motionEvent.getY();
        if (motionEvent.getAction() == 1 && System.currentTimeMillis() - this.f < 300) {
            if (Math.sqrt((y9 * y9) + (x10 * x10)) < g0.L(10.0f)) {
                float f12 = (this.d - g.l1) / this.b;
                float f13 = this.l;
                float f14 = this.k;
                float f15 = f13 - f14;
                float f16 = f15 / 2.0f;
                float f17 = f12 - f16;
                float f18 = f12 + f16;
                if (f17 < 0.0f) {
                    f10 = f15;
                    f11 = 0.0f;
                } else {
                    if (f18 > 1.0f) {
                        f17 = 1.0f - f15;
                        f10 = 1.0f;
                    } else {
                        f10 = f18;
                    }
                    f11 = f17;
                }
                this.g = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.a.a(f11, f10, true);
                this.g.addUpdateListener(new k6(this, f14, f11, f13, f10, 1));
                this.g.setInterpolator(g.D1);
                this.g.start();
                return true;
            }
        }
        return true;
    }
}
