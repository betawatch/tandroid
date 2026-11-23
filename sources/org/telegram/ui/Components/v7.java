package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class v7 extends FrameLayout {
    public final p9[] a;
    public int b;
    public AnimatorSet c;
    public long d;
    public final /* synthetic */ e8 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v7(e8 e8Var, Context context) {
        super(context);
        this.e = e8Var;
        this.a = new p9[2];
        for (int i7 = 0; i7 < 2; i7++) {
            this.a[i7] = new p9(context);
            this.a[i7].getImageReceiver().h1 = new ai.n1(this, i7, 7);
            this.a[i7].setRoundRadius(org.telegram.messenger.g0.L(4.0f));
            if (i7 == 1) {
                this.a[i7].setVisibility(8);
            }
            addView(this.a[i7], c8.na.c(-1.0f, -1));
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        e8 e8Var = this.e;
        if (action == 0) {
            if (this.a[this.b].getImageReceiver().J()) {
                e8Var.X0(true, true);
                this.d = SystemClock.elapsedRealtime();
                return true;
            }
        } else if (action != 2 && SystemClock.elapsedRealtime() - this.d >= 400) {
            e8Var.X0(false, true);
        }
        return true;
    }
}
