package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class oh extends l6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ di c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oh(di diVar, int i7) {
        super("translation", 0);
        this.b = i7;
        switch (i7) {
            case 1:
                this.c = diVar;
                super("openProgress", 0);
                break;
            default:
                this.c = diVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.l6
    public final void c(Object obj, float f10) {
        float f11;
        switch (this.b) {
            case 0:
                di diVar = this.c;
                diVar.U1 = f10;
                vh vhVar = diVar.t2;
                if (vhVar != null) {
                    if ((vhVar instanceof bm) || (diVar.s2 instanceof bm)) {
                        int max = Math.max(vhVar.getWidth(), diVar.s2.getWidth());
                        if (diVar.t2 instanceof bm) {
                            diVar.s2.setTranslationX((-max) * f10);
                            diVar.t2.setTranslationX((1.0f - f10) * max);
                        } else {
                            diVar.s2.setTranslationX(max * f10);
                            diVar.t2.setTranslationX((1.0f - f10) * (-max));
                        }
                    } else {
                        vhVar.setAlpha(f10);
                        diVar.t2.v(f10);
                        vh vhVar2 = diVar.t2;
                        bn bnVar = diVar.d2;
                        if (vhVar2 == bnVar || diVar.s2 == bnVar) {
                            diVar.P1(vhVar2 == bnVar ? 1 : 0);
                        }
                        vh vhVar3 = diVar.t2;
                        bn bnVar2 = diVar.e2;
                        if (vhVar3 == bnVar2 || diVar.s2 == bnVar2) {
                            diVar.P1(vhVar3 == bnVar2 ? 1 : 0);
                        }
                        diVar.t2.setTranslationY(org.telegram.messenger.g0.L(78.0f) * f10);
                        diVar.s2.v(1.0f - Math.min(1.0f, f10 / 0.7f));
                        diVar.s2.m(diVar.f4);
                    }
                    if (diVar.n3 != null) {
                        diVar.P1(1);
                    }
                    diVar.b.invalidate();
                    break;
                }
                break;
            default:
                eh ehVar = this.c.s3;
                int childCount = ehVar.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    float f12 = (3 - i7) * 32.0f;
                    View childAt = ehVar.getChildAt(i7);
                    if (f10 > f12) {
                        float f13 = f10 - f12;
                        if (f13 <= 200.0f) {
                            float f14 = f13 / 200.0f;
                            f11 = xq.g.getInterpolation(f14) * 1.1f;
                            childAt.setAlpha(xq.j.getInterpolation(f14));
                        } else {
                            childAt.setAlpha(1.0f);
                            float f15 = f13 - 200.0f;
                            f11 = f15 <= 100.0f ? 1.1f - (xq.i.getInterpolation(f15 / 100.0f) * 0.1f) : 1.0f;
                        }
                    } else {
                        f11 = 0.0f;
                    }
                    if (childAt instanceof yh) {
                        ((yh) childAt).a.setAttachScale(f11);
                    }
                }
                break;
        }
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.b) {
            case 0:
                return Float.valueOf(this.c.U1);
            default:
                return Float.valueOf(0.0f);
        }
    }
}
