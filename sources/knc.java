// default package

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
