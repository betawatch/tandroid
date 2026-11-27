// default package

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class i53 extends ImageView {
    public final /* synthetic */ byte a = 1;
    public Object b;
    public final /* synthetic */ ViewGroup c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i53(k53 k53Var, Context context, kj4 kj4Var) {
        super(context);
        this.c = k53Var;
        this.b = kj4Var;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                k53 k53Var = (k53) this.c;
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (k53Var.n || k53Var.f)) {
                    k53Var.n = false;
                    k53Var.f = false;
                    removeCallbacks(k53Var.r);
                    removeCallbacks(k53Var.h);
                }
                super.onTouchEvent(motionEvent);
                return ((GestureDetector) ((kj4) this.b).b).onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i53(i49 i49Var, Context context) {
        super(context);
        this.c = i49Var;
    }
}
