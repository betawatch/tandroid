package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class nh extends k6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ ci c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nh(ci ciVar, int i7) {
        super("translation", 0);
        this.b = i7;
        switch (i7) {
            case 1:
                this.c = ciVar;
                super("openProgress", 0);
                break;
            default:
                this.c = ciVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.k6
    public final void c(Object obj, float f10) {
        float f11;
        switch (this.b) {
            case 0:
                ci ciVar = this.c;
                ciVar.X1 = f10;
                uh uhVar = ciVar.w2;
                if (uhVar != null) {
                    if ((uhVar instanceof am) || (ciVar.v2 instanceof am)) {
                        int max = Math.max(uhVar.getWidth(), ciVar.v2.getWidth());
                        if (ciVar.w2 instanceof am) {
                            ciVar.v2.setTranslationX((-max) * f10);
                            ciVar.w2.setTranslationX((1.0f - f10) * max);
                        } else {
                            ciVar.v2.setTranslationX(max * f10);
                            ciVar.w2.setTranslationX((1.0f - f10) * (-max));
                        }
                    } else {
                        uhVar.setAlpha(f10);
                        ciVar.w2.v(f10);
                        uh uhVar2 = ciVar.w2;
                        an anVar = ciVar.g2;
                        if (uhVar2 == anVar || ciVar.v2 == anVar) {
                            ciVar.P1(uhVar2 == anVar ? 1 : 0);
                        }
                        uh uhVar3 = ciVar.w2;
                        an anVar2 = ciVar.h2;
                        if (uhVar3 == anVar2 || ciVar.v2 == anVar2) {
                            ciVar.P1(uhVar3 == anVar2 ? 1 : 0);
                        }
                        ciVar.w2.setTranslationY(org.telegram.messenger.g0.L(78.0f) * f10);
                        ciVar.v2.v(1.0f - Math.min(1.0f, f10 / 0.7f));
                        ciVar.v2.m(ciVar.i4);
                    }
                    if (ciVar.q3 != null) {
                        ciVar.P1(1);
                    }
                    ciVar.b.invalidate();
                    break;
                }
                break;
            default:
                dh dhVar = this.c.v3;
                int childCount = dhVar.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    float f12 = (3 - i7) * 32.0f;
                    View childAt = dhVar.getChildAt(i7);
                    if (f10 > f12) {
                        float f13 = f10 - f12;
                        if (f13 <= 200.0f) {
                            float f14 = f13 / 200.0f;
                            f11 = wq.g.getInterpolation(f14) * 1.1f;
                            childAt.setAlpha(wq.j.getInterpolation(f14));
                        } else {
                            childAt.setAlpha(1.0f);
                            float f15 = f13 - 200.0f;
                            f11 = f15 <= 100.0f ? 1.1f - (wq.i.getInterpolation(f15 / 100.0f) * 0.1f) : 1.0f;
                        }
                    } else {
                        f11 = 0.0f;
                    }
                    if (childAt instanceof xh) {
                        ((xh) childAt).a.setAttachScale(f11);
                    }
                }
                break;
        }
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.b) {
            case 0:
                return Float.valueOf(this.c.X1);
            default:
                return Float.valueOf(0.0f);
        }
    }
}
