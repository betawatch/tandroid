// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class d42 extends r59 {
    public final /* synthetic */ byte f3;
    public final Paint g3;
    public final /* synthetic */ p42 h3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d42(p42 p42Var, Context context, ylb ylbVar, byte b) {
        super(context, ylbVar);
        this.f3 = b;
        switch (b) {
            case 1:
                this.h3 = p42Var;
                super(context, ylbVar);
                this.g3 = new Paint();
                break;
            default:
                this.h3 = p42Var;
                this.g3 = new Paint();
                break;
        }
    }

    @Override // r59, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        byte b = this.f3;
        Paint paint = this.g3;
        float f = 2.1474836E9f;
        p42 p42Var = this.h3;
        switch (b) {
            case 0:
                if (p42Var.n == 2 && getChildCount() > 0) {
                    for (int i = 0; i < getChildCount(); i++) {
                        if (getChildAt(i).getY() < f) {
                            f = getChildAt(i).getY();
                        }
                    }
                    paint.setColor(cmb.w0(null, cmb.g5, false));
                }
                super.dispatchDraw(canvas);
                break;
            default:
                if (p42Var.n == 1 && getChildCount() > 0) {
                    for (int i2 = 0; i2 < getChildCount(); i2++) {
                        if (getChildAt(i2).getY() < f) {
                            f = getChildAt(i2).getY();
                        }
                    }
                    paint.setColor(cmb.w0(null, cmb.g5, false));
                }
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // r59, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f3) {
            case 0:
                if (this.h3.n == 0) {
                    break;
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }
}
