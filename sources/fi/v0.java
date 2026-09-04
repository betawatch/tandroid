package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.y6;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class v0 extends Drawable implements y6 {
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public final ImageReceiver d;
    public final ImageReceiver e;
    public final Drawable f;

    public v0(Context context, TLRPC.User user, TLRPC.User user2) {
        Paint paint = new Paint(1);
        this.a = paint;
        this.b = new Paint(1);
        Paint paint2 = new Paint(1);
        this.c = paint2;
        ImageReceiver imageReceiver = new ImageReceiver();
        this.d = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver();
        this.e = imageReceiver2;
        new RectF();
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint2.setColor(-1);
        Drawable mutate = context.getResources().getDrawable(R.drawable.filled_location).mutate();
        this.f = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(j6.w0(null, j6.L5, false), PorterDuff.Mode.SRC_IN));
        i9 i9Var = new i9((f6) null);
        i9Var.r(user);
        imageReceiver.setForUserOrChat(user, i9Var);
        imageReceiver.setRoundRadius(AndroidUtilities.dp(25.0f));
        i9 i9Var2 = new i9((f6) null);
        i9Var2.r(user2);
        imageReceiver2.setForUserOrChat(user2, i9Var2);
        imageReceiver2.setRoundRadius(AndroidUtilities.dp(25.0f));
    }

    @Override // org.telegram.ui.Components.y6
    public final void a(aj0 aj0Var) {
        this.e.setParentView(aj0Var);
        this.d.setParentView(aj0Var);
    }

    @Override // org.telegram.ui.Components.y6
    public final void b(ImageReceiver imageReceiver) {
        this.d.onDetachedFromWindow();
        this.e.onDetachedFromWindow();
    }

    @Override // org.telegram.ui.Components.y6
    public final void c(ImageReceiver imageReceiver) {
        this.d.onAttachedToWindow();
        this.e.onAttachedToWindow();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int w02 = j6.w0(null, j6.L5, false);
        Paint paint = this.b;
        paint.setColor(w02);
        float dp = AndroidUtilities.dp(136.0f) / 2.0f;
        float centerY = bounds.centerY() - AndroidUtilities.dp(25.0f);
        float dp2 = AndroidUtilities.dp(50.0f);
        float dp3 = AndroidUtilities.dp(50.0f);
        ImageReceiver imageReceiver = this.d;
        imageReceiver.setImageCoords(bounds.centerX() - dp, centerY, dp2, dp3);
        imageReceiver.draw(canvas);
        float centerX = (bounds.centerX() - dp) + AndroidUtilities.dp(41.0f);
        float dp4 = AndroidUtilities.dp(16.0f) + bounds.centerY();
        canvas.drawCircle(centerX, dp4, AndroidUtilities.dp(14.0f), paint);
        canvas.drawCircle(centerX, dp4, AndroidUtilities.dp(12.0f), this.c);
        int dp5 = (int) (dp4 + AndroidUtilities.dp(9.0f));
        Drawable drawable = this.f;
        drawable.setBounds((int) (centerX - AndroidUtilities.dp(9.0f)), (int) (dp4 - AndroidUtilities.dp(9.0f)), (int) (centerX + AndroidUtilities.dp(9.0f)), dp5);
        drawable.draw(canvas);
        float centerX2 = bounds.centerX() - AndroidUtilities.dp(3.33f);
        float centerY2 = bounds.centerY() - AndroidUtilities.dp(7.0f);
        float dp6 = AndroidUtilities.dp(3.33f) + bounds.centerX();
        float centerY3 = bounds.centerY();
        Paint paint2 = this.a;
        canvas.drawLine(centerX2, centerY2, dp6, centerY3, paint2);
        canvas.drawLine(bounds.centerX() - AndroidUtilities.dp(3.33f), AndroidUtilities.dp(7.0f) + bounds.centerY(), AndroidUtilities.dp(3.33f) + bounds.centerX(), bounds.centerY(), paint2);
        float centerY4 = bounds.centerY() - AndroidUtilities.dp(25.0f);
        float dp7 = AndroidUtilities.dp(50.0f);
        float dp8 = AndroidUtilities.dp(50.0f);
        ImageReceiver imageReceiver2 = this.e;
        imageReceiver2.setImageCoords((bounds.centerX() + dp) - AndroidUtilities.dp(50.0f), centerY4, dp7, dp8);
        imageReceiver2.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
