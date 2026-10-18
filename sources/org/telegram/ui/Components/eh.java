package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
                this.b.f2();
                break;
            case 1:
                this.b.G0.invalidate();
                break;
            case 2:
                ti.n(this.b, valueAnimator);
                break;
            case 3:
                ti tiVar = this.b;
                tiVar.getClass();
                tiVar.O1(((Float) valueAnimator.getAnimatedValue()).floatValue());
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
                this.b.f2();
                break;
        }
    }
}
