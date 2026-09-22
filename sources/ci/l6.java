package ci;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class l6 extends FrameLayout {
    public final /* synthetic */ qb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6(qb qbVar, Context context) {
        super(context);
        this.a = qbVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.a.m2) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }
}
