// default package

import android.content.Context;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
