// default package

import android.content.Context;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class gta extends LinearLayout {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wua b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gta(wua wuaVar, Context context, byte b) {
        super(context);
        this.a = b;
        this.b = wuaVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        byte b = this.a;
        wua wuaVar = this.b;
        switch (b) {
            case 0:
                if (wuaVar.W2.c(0)) {
                    break;
                }
                break;
            case 1:
                if (wuaVar.W2.c(1)) {
                    break;
                }
                break;
            case 2:
                if (wuaVar.W2.c(2)) {
                    break;
                }
                break;
            default:
                if (wuaVar.W2.c(3)) {
                    break;
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
