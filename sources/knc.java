// default package

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class knc extends hl3 {
    public final /* synthetic */ lnc M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public knc(lnc lncVar, Context context) {
        super(context);
        this.M = lncVar;
    }

    @Override // hl3, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.M.y && super.onTouchEvent(motionEvent);
    }
}
