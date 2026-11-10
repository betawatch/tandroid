package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class r7 extends FrameLayout {
    public final k9[] a;
    public int b;
    public AnimatorSet c;
    public long d;
    public final /* synthetic */ a8 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7(a8 a8Var, Context context) {
        super(context);
        this.e = a8Var;
        this.a = new k9[2];
        for (int i7 = 0; i7 < 2; i7++) {
            this.a[i7] = new k9(context);
            this.a[i7].getImageReceiver().g1 = new l2.q(this, i7, 5);
            this.a[i7].setRoundRadius(org.telegram.messenger.g0.L(4.0f));
            if (i7 == 1) {
                this.a[i7].setVisibility(8);
            }
            addView(this.a[i7], c8.ha.c(-1.0f, -1));
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        a8 a8Var = this.e;
        if (action == 0) {
            if (this.a[this.b].getImageReceiver().I()) {
                a8Var.W0(true, true);
                this.d = SystemClock.elapsedRealtime();
                return true;
            }
        } else if (action != 2 && SystemClock.elapsedRealtime() - this.d >= 400) {
            a8Var.W0(false, true);
        }
        return true;
    }
}
