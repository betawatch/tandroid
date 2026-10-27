package hi;

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
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.a7;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.j9;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class a1 extends Drawable implements a7 {
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public final ImageReceiver d;
    public final ImageReceiver e;
    public final Drawable f;
    public int h;

    public a1(Context context, TLRPC.User user, TLRPC.User user2) {
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
        int x02 = y6.x0(null, y6.L5, false);
        this.h = x02;
        mutate.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
        j9 j9Var = new j9((u6) null);
        j9Var.r(user);
        imageReceiver.setForUserOrChat(user, j9Var);
        imageReceiver.setRoundRadius(AndroidUtilities.dp(25.0f));
        j9 j9Var2 = new j9((u6) null);
        j9Var2.r(user2);
        imageReceiver2.setForUserOrChat(user2, j9Var2);
        imageReceiver2.setRoundRadius(AndroidUtilities.dp(25.0f));
    }

    @Override // org.telegram.ui.Components.a7
    public final void a(bk0 bk0Var) {
        this.e.setParentView(bk0Var);
        this.d.setParentView(bk0Var);
    }

    @Override // org.telegram.ui.Components.a7
    public final void b(ImageReceiver imageReceiver) {
        this.d.onDetachedFromWindow();
        this.e.onDetachedFromWindow();
    }

    @Override // org.telegram.ui.Components.a7
    public final void c(ImageReceiver imageReceiver) {
        this.d.onAttachedToWindow();
        this.e.onAttachedToWindow();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int i10 = y6.L5;
        int x02 = y6.x0(null, i10, false);
        Paint paint = this.b;
        paint.setColor(x02);
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
        int x03 = y6.x0(null, i10, false);
        int i11 = this.h;
        Drawable drawable = this.f;
        if (x03 != i11) {
            this.h = x03;
            drawable.setColorFilter(new PorterDuffColorFilter(x03, PorterDuff.Mode.SRC_IN));
        }
        drawable.setBounds((int) (centerX - AndroidUtilities.dp(9.0f)), (int) (dp4 - AndroidUtilities.dp(9.0f)), (int) (centerX + AndroidUtilities.dp(9.0f)), (int) (dp4 + AndroidUtilities.dp(9.0f)));
        drawable.draw(canvas);
        float centerX2 = bounds.centerX() - AndroidUtilities.dp(3.33f);
        float centerY2 = bounds.centerY() - AndroidUtilities.dp(7.0f);
        float dp5 = AndroidUtilities.dp(3.33f) + bounds.centerX();
        float centerY3 = bounds.centerY();
        Paint paint2 = this.a;
        canvas.drawLine(centerX2, centerY2, dp5, centerY3, paint2);
        canvas.drawLine(bounds.centerX() - AndroidUtilities.dp(3.33f), AndroidUtilities.dp(7.0f) + bounds.centerY(), AndroidUtilities.dp(3.33f) + bounds.centerX(), bounds.centerY(), paint2);
        float centerY4 = bounds.centerY() - AndroidUtilities.dp(25.0f);
        float dp6 = AndroidUtilities.dp(50.0f);
        float dp7 = AndroidUtilities.dp(50.0f);
        ImageReceiver imageReceiver2 = this.e;
        imageReceiver2.setImageCoords((bounds.centerX() + dp) - AndroidUtilities.dp(50.0f), centerY4, dp6, dp7);
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
