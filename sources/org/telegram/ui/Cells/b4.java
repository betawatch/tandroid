package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.c31;
import org.telegram.ui.qu0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class b4 extends RadialProgressView {
    public final /* synthetic */ int O = 0;
    public final Paint P;
    public final /* synthetic */ Object Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(f4 f4Var, Context context) {
        super(context, null);
        this.Q = f4Var;
        Paint paint = new Paint(1);
        this.P = paint;
        paint.setColor(1426063360);
    }

    @Override // org.telegram.ui.Components.RadialProgressView, android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.O) {
            case 0:
                f4 f4Var = (f4) this.Q;
                org.telegram.ui.Components.k9 k9Var = f4Var.b;
                if (k9Var.getImageReceiver().L() && k9Var.getAlpha() > 0.0f) {
                    int alpha = (int) (k9Var.getAlpha() * k9Var.getImageReceiver().i1 * 85.0f);
                    Paint paint = this.P;
                    paint.setAlpha(alpha);
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint);
                }
                f4Var.y.setProgressColor(i0.a.o(-1, (int) (k9Var.getAlpha() * k9Var.getImageReceiver().i1 * 255.0f)));
                super.onDraw(canvas);
                break;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) this.Q;
                qu0 qu0Var = profileActivity.f0;
                if (qu0Var != null && qu0Var.getImageReceiver().L()) {
                    int i3 = (int) (profileActivity.f0.getImageReceiver().i1 * 85.0f);
                    Paint paint2 = this.P;
                    paint2.setAlpha(i3);
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint2);
                }
                super.onDraw(canvas);
                break;
            default:
                c31 c31Var = (c31) this.Q;
                org.telegram.ui.Components.k9 k9Var2 = c31Var.H;
                if (k9Var2 != null && k9Var2.getImageReceiver().L()) {
                    int i10 = (int) (c31Var.H.getImageReceiver().i1 * 85.0f);
                    Paint paint3 = this.P;
                    paint3.setAlpha(i10);
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint3);
                }
                super.onDraw(canvas);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(c31 c31Var, Context context) {
        super(context, null);
        this.Q = c31Var;
        Paint paint = new Paint(1);
        this.P = paint;
        paint.setColor(1426063360);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(ProfileActivity profileActivity, Context context) {
        super(context, null);
        this.Q = profileActivity;
        Paint paint = new Paint(1);
        this.P = paint;
        paint.setColor(1426063360);
    }
}
