package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.az0;
import org.telegram.ui.f81;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class d4 extends RadialProgressView {
    public final /* synthetic */ int N = 0;
    public final Paint O;
    public final /* synthetic */ Object P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(i4 i4Var, Context context) {
        super(context, null);
        this.P = i4Var;
        Paint paint = new Paint(1);
        this.O = paint;
        paint.setColor(1426063360);
    }

    @Override // org.telegram.ui.Components.RadialProgressView, android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.N) {
            case 0:
                i4 i4Var = (i4) this.P;
                org.telegram.ui.Components.y9 y9Var = i4Var.b;
                if (y9Var.getImageReceiver().hasNotThumb() && y9Var.getAlpha() > 0.0f) {
                    int alpha = (int) (y9Var.getAlpha() * y9Var.getImageReceiver().getCurrentAlpha() * 85.0f);
                    Paint paint = this.O;
                    paint.setAlpha(alpha);
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint);
                }
                i4Var.x.setProgressColor(i0.a.o(-1, (int) (y9Var.getAlpha() * y9Var.getImageReceiver().getCurrentAlpha() * 255.0f)));
                super.onDraw(canvas);
                break;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) this.P;
                az0 az0Var = profileActivity.e0;
                if (az0Var != null && az0Var.getImageReceiver().hasNotThumb()) {
                    int currentAlpha = (int) (profileActivity.e0.getImageReceiver().getCurrentAlpha() * 85.0f);
                    Paint paint2 = this.O;
                    paint2.setAlpha(currentAlpha);
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint2);
                }
                super.onDraw(canvas);
                break;
            default:
                f81 f81Var = (f81) this.P;
                org.telegram.ui.Components.y9 y9Var2 = f81Var.G;
                if (y9Var2 != null && y9Var2.getImageReceiver().hasNotThumb()) {
                    int currentAlpha2 = (int) (f81Var.G.getImageReceiver().getCurrentAlpha() * 85.0f);
                    Paint paint3 = this.O;
                    paint3.setAlpha(currentAlpha2);
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint3);
                }
                super.onDraw(canvas);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(f81 f81Var, Context context) {
        super(context, null);
        this.P = f81Var;
        Paint paint = new Paint(1);
        this.O = paint;
        paint.setColor(1426063360);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(ProfileActivity profileActivity, Context context) {
        super(context, null);
        this.P = profileActivity;
        Paint paint = new Paint(1);
        this.O = paint;
        paint.setColor(1426063360);
    }
}
