package org.telegram.ui.iv;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.CubicBezierInterpolator;

/* loaded from: classes3.dex */
class RichBlockInset {
    private ValueAnimator animator;
    private long boundRowId = Long.MIN_VALUE;
    private int currentPx = -1;

    interface Applier {
        void apply(int i);
    }

    RichBlockInset() {
    }

    void apply(BlockRow blockRow, Applier applier) {
        apply(blockRow, applier, true);
    }

    void apply(BlockRow blockRow, final Applier applier, boolean z) {
        int i;
        int insetFor = RichBlockChrome.insetFor(blockRow);
        long j = blockRow != null ? blockRow.id : Long.MIN_VALUE;
        boolean z2 = j == this.boundRowId && this.currentPx >= 0;
        this.boundRowId = j;
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.animator = null;
        }
        if (z && z2 && (i = this.currentPx) != insetFor) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i, insetFor);
            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.iv.RichBlockInset$$ExternalSyntheticLambda0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    RichBlockInset.this.lambda$apply$0(applier, valueAnimator2);
                }
            });
            ofInt.setInterpolator(CubicBezierInterpolator.DEFAULT);
            ofInt.setDuration(200L);
            this.animator = ofInt;
            ofInt.start();
            return;
        }
        this.currentPx = insetFor;
        applier.apply(insetFor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$apply$0(Applier applier, ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.currentPx = intValue;
        applier.apply(intValue);
    }
}
