package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.m31;
import org.telegram.ui.yu0;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class b4 extends RadialProgressView {
    public final /* synthetic */ int N = 0;
    public final Paint O;
    public final /* synthetic */ Object P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(f4 f4Var, Context context) {
        super(context, null);
        this.P = f4Var;
        Paint paint = new Paint(1);
        this.O = paint;
        paint.setColor(1426063360);
    }

    @Override // org.telegram.ui.Components.RadialProgressView, android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.N) {
            case 0:
                f4 f4Var = (f4) this.P;
                org.telegram.ui.Components.l9 l9Var = f4Var.b;
                if (l9Var.getImageReceiver().L() && l9Var.getAlpha() > 0.0f) {
                    int alpha = (int) (l9Var.getAlpha() * l9Var.getImageReceiver().h1 * 85.0f);
                    Paint paint = this.O;
                    paint.setAlpha(alpha);
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint);
                }
                f4Var.y.setProgressColor(i0.a.o(-1, (int) (l9Var.getAlpha() * l9Var.getImageReceiver().h1 * 255.0f)));
                super.onDraw(canvas);
                break;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) this.P;
                yu0 yu0Var = profileActivity.e0;
                if (yu0Var != null && yu0Var.getImageReceiver().L()) {
                    int i7 = (int) (profileActivity.e0.getImageReceiver().h1 * 85.0f);
                    Paint paint2 = this.O;
                    paint2.setAlpha(i7);
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint2);
                }
                super.onDraw(canvas);
                break;
            default:
                m31 m31Var = (m31) this.P;
                org.telegram.ui.Components.l9 l9Var2 = m31Var.G;
                if (l9Var2 != null && l9Var2.getImageReceiver().L()) {
                    int i10 = (int) (m31Var.G.getImageReceiver().h1 * 85.0f);
                    Paint paint3 = this.O;
                    paint3.setAlpha(i10);
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint3);
                }
                super.onDraw(canvas);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(m31 m31Var, Context context) {
        super(context, null);
        this.P = m31Var;
        Paint paint = new Paint(1);
        this.O = paint;
        paint.setColor(1426063360);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(ProfileActivity profileActivity, Context context) {
        super(context, null);
        this.P = profileActivity;
        Paint paint = new Paint(1);
        this.O = paint;
        paint.setColor(1426063360);
    }
}
