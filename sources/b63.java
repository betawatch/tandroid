// default package

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class b63 extends ImageView {
    public final /* synthetic */ byte a = 0;
    public Object b;
    public final /* synthetic */ ViewGroup c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b63(d63 d63Var, Context context, lj4 lj4Var) {
        super(context);
        this.c = d63Var;
        this.b = lj4Var;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                d63 d63Var = (d63) this.c;
                if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && (d63Var.n || d63Var.f)) {
                    d63Var.n = false;
                    d63Var.f = false;
                    removeCallbacks(d63Var.r);
                    removeCallbacks(d63Var.h);
                }
                super.onTouchEvent(motionEvent);
                return ((GestureDetector) ((lj4) this.b).a).onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b63(v29 v29Var, Context context) {
        super(context);
        this.c = v29Var;
    }
}
