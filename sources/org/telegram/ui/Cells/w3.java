package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ly0;
import org.telegram.ui.x71;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class w3 extends RadialProgressView {
    public final /* synthetic */ int G = 0;
    public final Paint H;
    public final /* synthetic */ Object I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(b4 b4Var, Context context) {
        super(context, null);
        this.I = b4Var;
        Paint paint = new Paint(1);
        this.H = paint;
        paint.setColor(1426063360);
    }

    @Override // org.telegram.ui.Components.RadialProgressView, android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.G) {
            case 0:
                b4 b4Var = (b4) this.I;
                org.telegram.ui.Components.n9 n9Var = b4Var.b;
                if (n9Var.getImageReceiver().hasNotThumb() && n9Var.getAlpha() > 0.0f) {
                    int alpha = (int) (n9Var.getAlpha() * n9Var.getImageReceiver().getCurrentAlpha() * 85.0f);
                    Paint paint = this.H;
                    paint.setAlpha(alpha);
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint);
                }
                b4Var.x.setProgressColor(i0.b.k(-1, (int) (n9Var.getAlpha() * n9Var.getImageReceiver().getCurrentAlpha() * 255.0f)));
                super.onDraw(canvas);
                break;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) this.I;
                ly0 ly0Var = profileActivity.a0;
                if (ly0Var != null && ly0Var.getImageReceiver().hasNotThumb()) {
                    int currentAlpha = (int) (profileActivity.a0.getImageReceiver().getCurrentAlpha() * 85.0f);
                    Paint paint2 = this.H;
                    paint2.setAlpha(currentAlpha);
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint2);
                }
                super.onDraw(canvas);
                break;
            default:
                x71 x71Var = (x71) this.I;
                org.telegram.ui.Components.n9 n9Var2 = x71Var.B;
                if (n9Var2 != null && n9Var2.getImageReceiver().hasNotThumb()) {
                    int currentAlpha2 = (int) (x71Var.B.getImageReceiver().getCurrentAlpha() * 85.0f);
                    Paint paint3 = this.H;
                    paint3.setAlpha(currentAlpha2);
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint3);
                }
                super.onDraw(canvas);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(x71 x71Var, Context context) {
        super(context, null);
        this.I = x71Var;
        Paint paint = new Paint(1);
        this.H = paint;
        paint.setColor(1426063360);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(ProfileActivity profileActivity, Context context) {
        super(context, null);
        this.I = profileActivity;
        Paint paint = new Paint(1);
        this.H = paint;
        paint.setColor(1426063360);
    }
}
