package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class ei extends p6 {
    public final /* synthetic */ int b;
    public final /* synthetic */ ti c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ei(ti tiVar, int i7) {
        super("translation", 0);
        this.b = i7;
        switch (i7) {
            case 1:
                this.c = tiVar;
                super("openProgress", 0);
                break;
            default:
                this.c = tiVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.p6
    public final void c(Object obj, float f10) {
        float f11;
        switch (this.b) {
            case 0:
                ti tiVar = this.c;
                tiVar.Y1 = f10;
                li liVar = tiVar.x2;
                if (liVar != null) {
                    if ((liVar instanceof pm) || (tiVar.w2 instanceof pm)) {
                        int max = Math.max(liVar.getWidth(), tiVar.w2.getWidth());
                        if (tiVar.x2 instanceof pm) {
                            tiVar.w2.setTranslationX((-max) * f10);
                            tiVar.x2.setTranslationX((1.0f - f10) * max);
                        } else {
                            tiVar.w2.setTranslationX(max * f10);
                            tiVar.x2.setTranslationX((1.0f - f10) * (-max));
                        }
                    } else {
                        liVar.setAlpha(f10);
                        tiVar.x2.v(f10);
                        li liVar2 = tiVar.x2;
                        qn qnVar = tiVar.h2;
                        if (liVar2 == qnVar || tiVar.w2 == qnVar) {
                            tiVar.Q1(liVar2 == qnVar ? 1 : 0);
                        }
                        li liVar3 = tiVar.x2;
                        qn qnVar2 = tiVar.i2;
                        if (liVar3 == qnVar2 || tiVar.w2 == qnVar2) {
                            tiVar.Q1(liVar3 == qnVar2 ? 1 : 0);
                        }
                        tiVar.x2.setTranslationY(org.telegram.messenger.g0.L(78.0f) * f10);
                        tiVar.w2.v(1.0f - Math.min(1.0f, f10 / 0.7f));
                        tiVar.w2.m(tiVar.j4);
                    }
                    if (tiVar.r3 != null) {
                        tiVar.Q1(1);
                    }
                    tiVar.b.invalidate();
                    break;
                }
                break;
            default:
                uh uhVar = this.c.w3;
                int childCount = uhVar.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    float f12 = (3 - i7) * 32.0f;
                    View childAt = uhVar.getChildAt(i7);
                    if (f10 > f12) {
                        float f13 = f10 - f12;
                        if (f13 <= 200.0f) {
                            float f14 = f13 / 200.0f;
                            f11 = kr.g.getInterpolation(f14) * 1.1f;
                            childAt.setAlpha(kr.j.getInterpolation(f14));
                        } else {
                            childAt.setAlpha(1.0f);
                            float f15 = f13 - 200.0f;
                            f11 = f15 <= 100.0f ? 1.1f - (kr.i.getInterpolation(f15 / 100.0f) * 0.1f) : 1.0f;
                        }
                    } else {
                        f11 = 0.0f;
                    }
                    if (childAt instanceof oi) {
                        ((oi) childAt).a.setAttachScale(f11);
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
