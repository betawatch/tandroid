package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class vh extends j6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ ki c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vh(ki kiVar, int i7) {
        super("translation", 0);
        this.b = i7;
        switch (i7) {
            case 1:
                this.c = kiVar;
                super("openProgress", 0);
                break;
            default:
                this.c = kiVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.j6
    public final void c(Object obj, float f10) {
        float f11;
        switch (this.b) {
            case 0:
                ki kiVar = this.c;
                kiVar.Y1 = f10;
                ci ciVar = kiVar.x2;
                if (ciVar != null) {
                    if ((ciVar instanceof im) || (kiVar.w2 instanceof im)) {
                        int max = Math.max(ciVar.getWidth(), kiVar.w2.getWidth());
                        if (kiVar.x2 instanceof im) {
                            kiVar.w2.setTranslationX((-max) * f10);
                            kiVar.x2.setTranslationX((1.0f - f10) * max);
                        } else {
                            kiVar.w2.setTranslationX(max * f10);
                            kiVar.x2.setTranslationX((1.0f - f10) * (-max));
                        }
                    } else {
                        ciVar.setAlpha(f10);
                        kiVar.x2.v(f10);
                        ci ciVar2 = kiVar.x2;
                        jn jnVar = kiVar.h2;
                        if (ciVar2 == jnVar || kiVar.w2 == jnVar) {
                            kiVar.P1(ciVar2 == jnVar ? 1 : 0);
                        }
                        ci ciVar3 = kiVar.x2;
                        jn jnVar2 = kiVar.i2;
                        if (ciVar3 == jnVar2 || kiVar.w2 == jnVar2) {
                            kiVar.P1(ciVar3 == jnVar2 ? 1 : 0);
                        }
                        kiVar.x2.setTranslationY(org.telegram.messenger.g0.L(78.0f) * f10);
                        kiVar.w2.v(1.0f - Math.min(1.0f, f10 / 0.7f));
                        kiVar.w2.m(kiVar.j4);
                    }
                    if (kiVar.r3 != null) {
                        kiVar.P1(1);
                    }
                    kiVar.b.invalidate();
                    break;
                }
                break;
            default:
                lh lhVar = this.c.w3;
                int childCount = lhVar.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    float f12 = (3 - i7) * 32.0f;
                    View childAt = lhVar.getChildAt(i7);
                    if (f10 > f12) {
                        float f13 = f10 - f12;
                        if (f13 <= 200.0f) {
                            float f14 = f13 / 200.0f;
                            f11 = er.g.getInterpolation(f14) * 1.1f;
                            childAt.setAlpha(er.j.getInterpolation(f14));
                        } else {
                            childAt.setAlpha(1.0f);
                            float f15 = f13 - 200.0f;
                            f11 = f15 <= 100.0f ? 1.1f - (er.i.getInterpolation(f15 / 100.0f) * 0.1f) : 1.0f;
                        }
                    } else {
                        f11 = 0.0f;
                    }
                    if (childAt instanceof fi) {
                        ((fi) childAt).a.setAttachScale(f11);
                    }
                }
                break;
        }
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.b) {
            case 0:
                return Float.valueOf(this.c.Y1);
            default:
                return Float.valueOf(0.0f);
        }
    }
}
