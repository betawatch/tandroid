// default package

import android.content.Context;
import android.view.MotionEvent;
import android.widget.EditText;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class n36 extends EditText {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n36(Context context, byte b) {
        super(context);
        this.a = b;
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                if (motionEvent.getAction() == 1) {
                    setCursorVisible(true);
                }
                break;
            default:
                if (motionEvent.getAction() == 1) {
                    setCursorVisible(true);
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }
}
