package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ly0;
import org.telegram.ui.z71;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class z3 extends RadialProgressView {
    public final /* synthetic */ int G = 0;
    public final Paint H;
    public final /* synthetic */ Object I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(e4 e4Var, Context context) {
        super(context, null);
        this.I = e4Var;
        Paint paint = new Paint(1);
        this.H = paint;
        paint.setColor(1426063360);
    }

    @Override // org.telegram.ui.Components.RadialProgressView, android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.G) {
            case 0:
                e4 e4Var = (e4) this.I;
                org.telegram.ui.Components.o9 o9Var = e4Var.b;
                if (o9Var.getImageReceiver().hasNotThumb() && o9Var.getAlpha() > 0.0f) {
                    int alpha = (int) (o9Var.getAlpha() * o9Var.getImageReceiver().getCurrentAlpha() * 85.0f);
                    Paint paint = this.H;
                    paint.setAlpha(alpha);
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint);
                }
                e4Var.x.setProgressColor(i0.a.k(-1, (int) (o9Var.getAlpha() * o9Var.getImageReceiver().getCurrentAlpha() * 255.0f)));
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
                z71 z71Var = (z71) this.I;
                org.telegram.ui.Components.o9 o9Var2 = z71Var.B;
                if (o9Var2 != null && o9Var2.getImageReceiver().hasNotThumb()) {
                    int currentAlpha2 = (int) (z71Var.B.getImageReceiver().getCurrentAlpha() * 85.0f);
                    Paint paint3 = this.H;
                    paint3.setAlpha(currentAlpha2);
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint3);
                }
                super.onDraw(canvas);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(z71 z71Var, Context context) {
        super(context, null);
        this.I = z71Var;
        Paint paint = new Paint(1);
        this.H = paint;
        paint.setColor(1426063360);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(ProfileActivity profileActivity, Context context) {
        super(context, null);
        this.I = profileActivity;
        Paint paint = new Paint(1);
        this.H = paint;
        paint.setColor(1426063360);
    }
}
