package jg;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.MotionEvent;
import di.o7;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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

    public final boolean a(int i10, int i11, int i12) {
        h hVar;
        Rect rect = this.i;
        Rect rect2 = this.h;
        h[] hVarArr = this.n;
        if (i12 != 0) {
            if (i12 == 1 && (hVar = hVarArr[0]) != null && hVar.a != 4) {
                if (rect2.contains(i10, i11) && hVarArr[0].a != 1) {
                    h hVar2 = new h(this, 1);
                    hVarArr[1] = hVar2;
                    hVar2.c = this.k;
                    hVar2.b = i10;
                    hVar2.a();
                    ValueAnimator valueAnimator = this.g;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        return true;
                    }
                } else if (rect.contains(i10, i11) && hVarArr[0].a != 2) {
                    h hVar3 = new h(this, 2);
                    hVarArr[1] = hVar3;
                    hVar3.d = this.l;
                    hVar3.b = i10;
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
        if (rect2.contains(i10, i11)) {
            h hVar4 = hVarArr[0];
            if (hVar4 != null) {
                hVarArr[1] = hVar4;
            }
            h hVar5 = new h(this, 1);
            hVarArr[0] = hVar5;
            hVar5.c = this.k;
            hVar5.b = i10;
            hVar5.a();
            ValueAnimator valueAnimator3 = this.g;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
                return true;
            }
        } else if (rect.contains(i10, i11)) {
            h hVar6 = hVarArr[0];
            if (hVar6 != null) {
                hVarArr[1] = hVar6;
            }
            h hVar7 = new h(this, 2);
            hVarArr[0] = hVar7;
            hVar7.d = this.l;
            hVar7.b = i10;
            hVar7.a();
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
            h hVar8 = new h(this, 4);
            hVarArr[0] = hVar8;
            hVar8.d = this.l;
            hVar8.c = this.k;
            hVar8.b = i10;
            hVar8.a();
            ValueAnimator valueAnimator6 = this.g;
            if (valueAnimator6 != null) {
                valueAnimator6.cancel();
                return true;
            }
        }
        return true;
    }

    public final boolean b(int i10, int i11) {
        h hVar;
        boolean z10;
        if (this.c || (hVar = this.n[i11]) == null) {
            return false;
        }
        int i12 = hVar.a;
        float f7 = hVar.c;
        float f10 = hVar.d;
        int i13 = hVar.b;
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
        h[] hVarArr = this.n;
        if (i10 != 0) {
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
        float y3 = this.e - motionEvent.getY();
        if (motionEvent.getAction() == 1 && System.currentTimeMillis() - this.f < 300) {
            if (Math.sqrt((y3 * y3) + (x10 * x10)) < AndroidUtilities.dp(10.0f)) {
                float f11 = (this.d - g.k1) / this.b;
                float f12 = this.l;
                float f13 = this.k;
                float f14 = f12 - f13;
                float f15 = f14 / 2.0f;
                float f16 = f11 - f15;
                float f17 = f11 + f15;
                if (f16 < 0.0f) {
                    f7 = f14;
                    f10 = 0.0f;
                } else if (f17 > 1.0f) {
                    f10 = 1.0f - f14;
                    f7 = 1.0f;
                } else {
                    f7 = f17;
                    f10 = f16;
                }
                this.g = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.a.a(f10, f7, true);
                this.g.addUpdateListener(new o7(this, f13, f10, f12, f7, 1));
                this.g.setInterpolator(g.C1);
                this.g.start();
                return true;
            }
        }
        return true;
    }
}
