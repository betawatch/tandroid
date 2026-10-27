package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class eh implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ti b;

    public /* synthetic */ eh(ti tiVar, int i10) {
        this.a = i10;
        this.b = tiVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                this.b.j2();
                break;
            case 1:
                this.b.G0.invalidate();
                break;
            case 2:
                ti.p(this.b, valueAnimator);
                break;
            case 3:
                ti tiVar = this.b;
                tiVar.getClass();
                tiVar.S1(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 4:
                ti tiVar2 = this.b;
                li liVar = tiVar2.B0;
                al alVar = tiVar2.w0;
                if (liVar == alVar && alVar != null) {
                    alVar.invalidate();
                    break;
                }
                break;
            default:
                this.b.j2();
                break;
        }
    }
}
