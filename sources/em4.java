// default package

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageButton;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class em4 extends ImageButton {
    public final /* synthetic */ jm4 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public em4(jm4 jm4Var, Context context) {
        super(context);
        this.a = jm4Var;
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.a.N) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
