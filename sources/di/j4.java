package di;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class j4 extends LinearLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ f6 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j4(f6 f6Var, Context context, int i7) {
        super(context);
        this.a = i7;
        this.b = f6Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                if (this.b.X2.c(0)) {
                    break;
                }
                break;
            case 1:
                if (this.b.X2.c(1)) {
                    break;
                }
                break;
            case 2:
                if (this.b.X2.c(2)) {
                    break;
                }
                break;
            default:
                if (this.b.X2.c(3)) {
                    break;
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
