package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class p7 extends FrameLayout {
    public final i9[] a;
    public int b;
    public AnimatorSet c;
    public long d;
    public final /* synthetic */ y7 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p7(y7 y7Var, Context context) {
        super(context);
        this.e = y7Var;
        this.a = new i9[2];
        for (int i7 = 0; i7 < 2; i7++) {
            this.a[i7] = new i9(context);
            this.a[i7].getImageReceiver().h1 = new ai.s1(this, i7, 8);
            this.a[i7].setRoundRadius(org.telegram.messenger.g0.L(4.0f));
            if (i7 == 1) {
                this.a[i7].setVisibility(8);
            }
            addView(this.a[i7], c8.ja.c(-1.0f, -1));
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        y7 y7Var = this.e;
        if (action == 0) {
            if (this.a[this.b].getImageReceiver().I()) {
                y7Var.W0(true, true);
                this.d = SystemClock.elapsedRealtime();
                return true;
            }
        } else if (action != 2 && SystemClock.elapsedRealtime() - this.d >= 400) {
            y7Var.W0(false, true);
        }
        return true;
    }
}
