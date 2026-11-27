// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class i32 extends d79 {
    public final /* synthetic */ byte f3;
    public final Paint g3;
    public final /* synthetic */ u32 h3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i32(u32 u32Var, Context context, vnb vnbVar, byte b) {
        super(context, vnbVar);
        this.f3 = b;
        switch (b) {
            case 1:
                this.h3 = u32Var;
                super(context, vnbVar);
                this.g3 = new Paint();
                break;
            default:
                this.h3 = u32Var;
                this.g3 = new Paint();
                break;
        }
    }

    @Override // d79, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        byte b = this.f3;
        Paint paint = this.g3;
        float f = 2.1474836E9f;
        u32 u32Var = this.h3;
        switch (b) {
            case 0:
                if (u32Var.n == 2 && getChildCount() > 0) {
                    for (int i = 0; i < getChildCount(); i++) {
                        if (getChildAt(i).getY() < f) {
                            f = getChildAt(i).getY();
                        }
                    }
                    paint.setColor(aob.w0(null, aob.h5, false));
                }
                super.dispatchDraw(canvas);
                break;
            default:
                if (u32Var.n == 1 && getChildCount() > 0) {
                    for (int i2 = 0; i2 < getChildCount(); i2++) {
                        if (getChildAt(i2).getY() < f) {
                            f = getChildAt(i2).getY();
                        }
                    }
                    paint.setColor(aob.w0(null, aob.h5, false));
                }
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // d79, androidx.recyclerview.widget.RecyclerView, android.view.View
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
