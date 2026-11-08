package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class s7 extends FrameLayout {
    public final l9[] a;
    public int b;
    public AnimatorSet c;
    public long d;
    public final /* synthetic */ b8 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s7(b8 b8Var, Context context) {
        super(context);
        this.e = b8Var;
        this.a = new l9[2];
        for (int i7 = 0; i7 < 2; i7++) {
            this.a[i7] = new l9(context);
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
        b8 b8Var = this.e;
        if (action == 0) {
            if (this.a[this.b].getImageReceiver().I()) {
                b8Var.W0(true, true);
                this.d = SystemClock.elapsedRealtime();
                return true;
            }
        } else if (action != 2 && SystemClock.elapsedRealtime() - this.d >= 400) {
            b8Var.W0(false, true);
        }
        return true;
    }
}
