// default package

import android.content.Context;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class gpa extends LinearLayout {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vqa b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gpa(vqa vqaVar, Context context, byte b) {
        super(context);
        this.a = b;
        this.b = vqaVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        byte b = this.a;
        vqa vqaVar = this.b;
        switch (b) {
            case 0:
                if (vqaVar.W2.c(0)) {
                    break;
                }
                break;
            case 1:
                if (vqaVar.W2.c(1)) {
                    break;
                }
                break;
            case 2:
                if (vqaVar.W2.c(2)) {
                    break;
                }
                break;
            default:
                if (vqaVar.W2.c(3)) {
                    break;
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
