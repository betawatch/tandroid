package hh;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class q3 extends LinearLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ i5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q3(i5 i5Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = i5Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                if (this.b.U0.c(0)) {
                    break;
                }
                break;
            case 1:
                if (this.b.U0.c(1)) {
                    break;
                }
                break;
            case 2:
                if (this.b.U0.c(2)) {
                    break;
                }
                break;
            default:
                if (this.b.U0.c(3)) {
                    break;
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
