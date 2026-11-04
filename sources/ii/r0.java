package ii;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.p6;
import org.telegram.ui.Components.u8;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class r0 extends Drawable implements p6 {
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public final ImageReceiver d;
    public final ImageReceiver e;
    public final Drawable f;
    public int h;

    public r0(Context context, TLRPC.User user, TLRPC.User user2) {
        Paint paint = new Paint(1);
        this.a = paint;
        this.b = new Paint(1);
        Paint paint2 = new Paint(1);
        this.c = paint2;
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.d = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(null);
        this.e = imageReceiver2;
        new RectF();
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint2.setColor(-1);
        Drawable mutate = context.getResources().getDrawable(R.drawable.filled_location).mutate();
        this.f = mutate;
        int x02 = k6.x0(null, k6.L5, false);
        this.h = x02;
        mutate.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
        u8 u8Var = new u8((e6) null);
        u8Var.r(user);
        imageReceiver.i0(user, u8Var, null);
        imageReceiver.J0(org.telegram.messenger.g0.L(25.0f));
        u8 u8Var2 = new u8((e6) null);
        u8Var2.r(user2);
        imageReceiver2.i0(user2, u8Var2, null);
        imageReceiver2.J0(org.telegram.messenger.g0.L(25.0f));
    }

    @Override // org.telegram.ui.Components.p6
    public final void a(fh0 fh0Var) {
        this.e.H0(fh0Var);
        this.d.H0(fh0Var);
    }

    @Override // org.telegram.ui.Components.p6
    public final void b(ImageReceiver imageReceiver) {
        this.d.R();
        this.e.R();
    }

    @Override // org.telegram.ui.Components.p6
    public final void c(ImageReceiver imageReceiver) {
        this.d.P();
        this.e.P();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int i3 = k6.L5;
        int x02 = k6.x0(null, i3, false);
        Paint paint = this.b;
        paint.setColor(x02);
        float L = org.telegram.messenger.g0.L(136.0f) / 2.0f;
        float centerY = bounds.centerY() - org.telegram.messenger.g0.L(25.0f);
        float L2 = org.telegram.messenger.g0.L(50.0f);
        float L3 = org.telegram.messenger.g0.L(50.0f);
        ImageReceiver imageReceiver = this.d;
        imageReceiver.y0(bounds.centerX() - L, centerY, L2, L3);
        imageReceiver.h(canvas, null);
        float centerX = (bounds.centerX() - L) + org.telegram.messenger.g0.L(41.0f);
        float L4 = org.telegram.messenger.g0.L(16.0f) + bounds.centerY();
        canvas.drawCircle(centerX, L4, org.telegram.messenger.g0.L(14.0f), paint);
        canvas.drawCircle(centerX, L4, org.telegram.messenger.g0.L(12.0f), this.c);
        int x03 = k6.x0(null, i3, false);
        int i10 = this.h;
        Drawable drawable = this.f;
        if (x03 != i10) {
            this.h = x03;
            drawable.setColorFilter(new PorterDuffColorFilter(x03, PorterDuff.Mode.SRC_IN));
        }
        drawable.setBounds((int) (centerX - org.telegram.messenger.g0.L(9.0f)), (int) (L4 - org.telegram.messenger.g0.L(9.0f)), (int) (centerX + org.telegram.messenger.g0.L(9.0f)), (int) (L4 + org.telegram.messenger.g0.L(9.0f)));
        drawable.draw(canvas);
        float centerX2 = bounds.centerX() - org.telegram.messenger.g0.L(3.33f);
        float centerY2 = bounds.centerY() - org.telegram.messenger.g0.L(7.0f);
        float L5 = org.telegram.messenger.g0.L(3.33f) + bounds.centerX();
        float centerY3 = bounds.centerY();
        Paint paint2 = this.a;
        canvas.drawLine(centerX2, centerY2, L5, centerY3, paint2);
        canvas.drawLine(bounds.centerX() - org.telegram.messenger.g0.L(3.33f), org.telegram.messenger.g0.L(7.0f) + bounds.centerY(), org.telegram.messenger.g0.L(3.33f) + bounds.centerX(), bounds.centerY(), paint2);
        float centerY4 = bounds.centerY() - org.telegram.messenger.g0.L(25.0f);
        float L6 = org.telegram.messenger.g0.L(50.0f);
        float L7 = org.telegram.messenger.g0.L(50.0f);
        ImageReceiver imageReceiver2 = this.e;
        imageReceiver2.y0((bounds.centerX() + L) - org.telegram.messenger.g0.L(50.0f), centerY4, L6, L7);
        imageReceiver2.h(canvas, null);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i3) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
