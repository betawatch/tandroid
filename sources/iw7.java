// default package

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class iw7 extends dv3 {
    public final /* synthetic */ byte h2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iw7(Context context, byte b) {
        super(context);
        this.h2 = b;
    }

    @Override // vu3, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        byte b = this.h2;
        return false;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.h2) {
            case 0:
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }
}
