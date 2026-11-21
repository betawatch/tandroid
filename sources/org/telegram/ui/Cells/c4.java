package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.o31;
import org.telegram.ui.zu0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class c4 extends RadialProgressView {
    public final /* synthetic */ int O = 0;
    public final Paint P;
    public final /* synthetic */ Object Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4(g4 g4Var, Context context) {
        super(context, null);
        this.Q = g4Var;
        Paint paint = new Paint(1);
        this.P = paint;
        paint.setColor(1426063360);
    }

    @Override // org.telegram.ui.Components.RadialProgressView, android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.O) {
            case 0:
                g4 g4Var = (g4) this.Q;
                org.telegram.ui.Components.q9 q9Var = g4Var.b;
                if (q9Var.getImageReceiver().L() && q9Var.getAlpha() > 0.0f) {
                    int alpha = (int) (q9Var.getAlpha() * q9Var.getImageReceiver().i1 * 85.0f);
                    Paint paint = this.P;
                    paint.setAlpha(alpha);
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint);
                }
                g4Var.y.setProgressColor(i0.a.o(-1, (int) (q9Var.getAlpha() * q9Var.getImageReceiver().i1 * 255.0f)));
                super.onDraw(canvas);
                break;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) this.Q;
                zu0 zu0Var = profileActivity.f0;
                if (zu0Var != null && zu0Var.getImageReceiver().L()) {
                    int i7 = (int) (profileActivity.f0.getImageReceiver().i1 * 85.0f);
                    Paint paint2 = this.P;
                    paint2.setAlpha(i7);
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint2);
                }
                super.onDraw(canvas);
                break;
            default:
                o31 o31Var = (o31) this.Q;
                org.telegram.ui.Components.q9 q9Var2 = o31Var.H;
                if (q9Var2 != null && q9Var2.getImageReceiver().L()) {
                    int i10 = (int) (o31Var.H.getImageReceiver().i1 * 85.0f);
                    Paint paint3 = this.P;
                    paint3.setAlpha(i10);
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint3);
                }
                super.onDraw(canvas);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4(o31 o31Var, Context context) {
        super(context, null);
        this.Q = o31Var;
        Paint paint = new Paint(1);
        this.P = paint;
        paint.setColor(1426063360);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4(ProfileActivity profileActivity, Context context) {
        super(context, null);
        this.Q = profileActivity;
        Paint paint = new Paint(1);
        this.P = paint;
        paint.setColor(1426063360);
    }
}
