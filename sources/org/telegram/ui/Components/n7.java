package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class n7 extends FrameLayout {
    public final g9[] a;
    public int b;
    public AnimatorSet c;
    public long d;
    public final /* synthetic */ w7 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n7(w7 w7Var, Context context) {
        super(context);
        this.e = w7Var;
        this.a = new g9[2];
        for (int i10 = 0; i10 < 2; i10++) {
            this.a[i10] = new g9(context);
            this.a[i10].getImageReceiver().g1 = new i2.q(this, i10, 7);
            this.a[i10].setRoundRadius(org.telegram.messenger.i0.L(4.0f));
            if (i10 == 1) {
                this.a[i10].setVisibility(8);
            }
            addView(this.a[i10], w7.b6.c(-1.0f, -1));
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        w7 w7Var = this.e;
        if (action == 0) {
            if (this.a[this.b].getImageReceiver().I()) {
                w7Var.W0(true, true);
                this.d = SystemClock.elapsedRealtime();
                return true;
            }
        } else if (action != 2 && SystemClock.elapsedRealtime() - this.d >= 400) {
            w7Var.W0(false, true);
        }
        return true;
    }
}
