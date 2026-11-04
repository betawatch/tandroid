package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class q7 extends FrameLayout {
    public final k9[] a;
    public int b;
    public AnimatorSet c;
    public long d;
    public final /* synthetic */ z7 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q7(z7 z7Var, Context context) {
        super(context);
        this.e = z7Var;
        this.a = new k9[2];
        for (int i3 = 0; i3 < 2; i3++) {
            this.a[i3] = new k9(context);
            this.a[i3].getImageReceiver().h1 = new k2.q(this, i3, 6);
            this.a[i3].setRoundRadius(org.telegram.messenger.g0.L(4.0f));
            if (i3 == 1) {
                this.a[i3].setVisibility(8);
            }
            addView(this.a[i3], b8.mf.c(-1.0f, -1));
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        z7 z7Var = this.e;
        if (action == 0) {
            if (this.a[this.b].getImageReceiver().I()) {
                z7Var.W0(true, true);
                this.d = SystemClock.elapsedRealtime();
                return true;
            }
        } else if (action != 2 && SystemClock.elapsedRealtime() - this.d >= 400) {
            z7Var.W0(false, true);
        }
        return true;
    }
}
