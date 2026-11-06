package bi;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class w extends fi.d {
    public final /* synthetic */ int k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(int i7, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z9) {
        super(context, f6Var, z9);
        this.k0 = i7;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.k0) {
            case 3:
                if (this.c0) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return false;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // fi.d
    public boolean j() {
        switch (this.k0) {
            case 0:
                return false;
            case 1:
            default:
                return super.j();
            case 2:
                return false;
        }
    }
}
