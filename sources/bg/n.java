package bg;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.MotionEvent;
import org.telegram.messenger.i0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class n {
    public i a;
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
    public l[] n;

    public final boolean a(int i10, int i11, int i12) {
        l lVar;
        Rect rect = this.i;
        Rect rect2 = this.h;
        l[] lVarArr = this.n;
        if (i12 != 0) {
            if (i12 == 1 && (lVar = lVarArr[0]) != null && lVar.a != 4) {
                if (rect2.contains(i10, i11) && lVarArr[0].a != 1) {
                    l lVar2 = new l(this, 1);
                    lVarArr[1] = lVar2;
                    lVar2.c = this.k;
                    lVar2.b = i10;
                    lVar2.a();
                    ValueAnimator valueAnimator = this.g;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        return true;
                    }
                } else if (rect.contains(i10, i11) && lVarArr[0].a != 2) {
                    l lVar3 = new l(this, 2);
                    lVarArr[1] = lVar3;
                    lVar3.d = this.l;
                    lVar3.b = i10;
                    lVar3.a();
                    ValueAnimator valueAnimator2 = this.g;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                }
                return true;
            }
            return false;
        }
        if (rect2.contains(i10, i11)) {
            l lVar4 = lVarArr[0];
            if (lVar4 != null) {
                lVarArr[1] = lVar4;
            }
            l lVar5 = new l(this, 1);
            lVarArr[0] = lVar5;
            lVar5.c = this.k;
            lVar5.b = i10;
            lVar5.a();
            ValueAnimator valueAnimator3 = this.g;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
                return true;
            }
        } else if (rect.contains(i10, i11)) {
            l lVar6 = lVarArr[0];
            if (lVar6 != null) {
                lVarArr[1] = lVar6;
            }
            l lVar7 = new l(this, 2);
            lVarArr[0] = lVar7;
            lVar7.d = this.l;
            lVar7.b = i10;
            lVar7.a();
            ValueAnimator valueAnimator4 = this.g;
            if (valueAnimator4 != null) {
                valueAnimator4.cancel();
                return true;
            }
        } else {
            if (!this.j.contains(i10, i11)) {
                if (i11 < rect2.bottom && i11 > rect2.top) {
                    this.c = true;
                    this.d = i10;
                    this.e = i11;
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
            l lVar8 = new l(this, 4);
            lVarArr[0] = lVar8;
            lVar8.d = this.l;
            lVar8.c = this.k;
            lVar8.b = i10;
            lVar8.a();
            ValueAnimator valueAnimator6 = this.g;
            if (valueAnimator6 != null) {
                valueAnimator6.cancel();
                return true;
            }
        }
        return true;
    }

    public final boolean b(int i10, int i11) {
        l lVar;
        boolean z10;
        if (this.c || (lVar = this.n[i11]) == null) {
            return false;
        }
        int i12 = lVar.a;
        float f7 = lVar.c;
        float f10 = lVar.d;
        int i13 = lVar.b;
        if (i12 == 1) {
            float f11 = f7 - ((i13 - i10) / this.b);
            this.k = f11;
            if (f11 < 0.0f) {
                this.k = 0.0f;
            }
            float f12 = this.l;
            float f13 = f12 - this.k;
            float f14 = this.m;
            if (f13 < f14) {
                this.k = f12 - f14;
            }
            z10 = true;
        } else {
            z10 = false;
        }
        if (i12 == 2) {
            float f15 = f10 - ((i13 - i10) / this.b);
            this.l = f15;
            if (f15 > 1.0f) {
                this.l = 1.0f;
            }
            float f16 = this.l;
            float f17 = this.k;
            float f18 = f16 - f17;
            float f19 = this.m;
            if (f18 < f19) {
                this.l = f17 + f19;
            }
            z10 = true;
        }
        if (i12 == 4) {
            float f20 = (i13 - i10) / this.b;
            float f21 = f7 - f20;
            this.k = f21;
            this.l = f10 - f20;
            if (f21 < 0.0f) {
                this.k = 0.0f;
                this.l = f10 - f7;
            }
            if (this.l > 1.0f) {
                this.l = 1.0f;
                this.k = 1.0f - (f10 - f7);
            }
            z10 = true;
        }
        if (z10) {
            this.a.A(true, false, false);
        }
        return true;
    }

    public final boolean c(int i10, MotionEvent motionEvent) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        float f7;
        float f10;
        l[] lVarArr = this.n;
        if (i10 != 0) {
            l lVar = lVarArr[1];
            if (lVar != null && (valueAnimator = lVar.e) != null) {
                valueAnimator.cancel();
            }
            lVarArr[1] = null;
            return false;
        }
        if (!this.c) {
            l lVar2 = lVarArr[0];
            if (lVar2 != null && (valueAnimator2 = lVar2.e) != null) {
                valueAnimator2.cancel();
            }
            lVarArr[0] = null;
            l lVar3 = lVarArr[1];
            if (lVar3 != null) {
                lVarArr[0] = lVar3;
                lVarArr[1] = null;
            }
            return false;
        }
        this.c = false;
        float x10 = this.d - motionEvent.getX();
        float y3 = this.e - motionEvent.getY();
        if (motionEvent.getAction() == 1 && System.currentTimeMillis() - this.f < 300) {
            if (Math.sqrt((y3 * y3) + (x10 * x10)) < i0.L(10.0f)) {
                float f11 = (this.d - i.k1) / this.b;
                float f12 = this.l;
                float f13 = this.k;
                float f14 = f12 - f13;
                float f15 = f14 / 2.0f;
                float f16 = f11 - f15;
                float f17 = f11 + f15;
                if (f16 < 0.0f) {
                    f7 = f14;
                    f10 = 0.0f;
                } else {
                    if (f17 > 1.0f) {
                        f16 = 1.0f - f14;
                        f7 = 1.0f;
                    } else {
                        f7 = f17;
                    }
                    f10 = f16;
                }
                this.g = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.a.a(f10, f7, true);
                this.g.addUpdateListener(new j(this, f13, f10, f12, f7, 0));
                this.g.setInterpolator(i.C1);
                this.g.start();
                return true;
            }
        }
        return true;
    }
}
