// default package

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
