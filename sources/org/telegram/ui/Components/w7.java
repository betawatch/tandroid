package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class w7 extends FrameLayout {
    public final q9[] a;
    public int b;
    public AnimatorSet c;
    public long d;
    public final /* synthetic */ f8 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7(f8 f8Var, Context context) {
        super(context);
        this.e = f8Var;
        this.a = new q9[2];
        for (int i7 = 0; i7 < 2; i7++) {
            this.a[i7] = new q9(context);
            this.a[i7].getImageReceiver().h1 = new ai.v1(this, i7, 8);
            this.a[i7].setRoundRadius(org.telegram.messenger.g0.L(4.0f));
            if (i7 == 1) {
                this.a[i7].setVisibility(8);
            }
            addView(this.a[i7], c8.ma.c(-1.0f, -1));
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        f8 f8Var = this.e;
        if (action == 0) {
            if (this.a[this.b].getImageReceiver().I()) {
                f8Var.X0(true, true);
                this.d = SystemClock.elapsedRealtime();
                return true;
            }
        } else if (action != 2 && SystemClock.elapsedRealtime() - this.d >= 400) {
            f8Var.X0(false, true);
        }
        return true;
    }
}
