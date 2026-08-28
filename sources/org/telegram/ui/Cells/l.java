package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class l extends FrameLayout {
    public final org.telegram.ui.Components.i6 a;
    public final Paint b;
    public final ff.q c;
    public final Drawable d;
    public final int e;
    public int f;

    public l(Context context, int i9) {
        super(context);
        Paint paint = new Paint(1);
        this.b = paint;
        this.c = new ff.q(new ia(this, 1));
        this.e = i9;
        this.d = context.getResources().getDrawable(R.drawable.filled_gift_sell_24).mutate();
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(false, false, false, false);
        this.a = i6Var;
        i6Var.G = AndroidUtilities.displaySize.x;
        i6Var.setCallback(this);
        i6Var.u(AndroidUtilities.bold());
        i6Var.t(AndroidUtilities.dp(14.0f));
        i6Var.r(-1);
        i6Var.b = 3;
        paint.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(72.0f), 0.0f, new int[]{-13460514, -10042885}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
    }

    public final void a(int i9) {
        this.f = i9;
        if (isAttachedToWindow()) {
            long max = Math.max(0, i9 - ConnectionsManager.getInstance(this.e).getCurrentTime());
            this.c.a(max);
            b(max);
        }
    }

    public final void b(long j10) {
        org.telegram.ui.Components.i6 i6Var = this.a;
        if (j10 == 0) {
            i6Var.q(LocaleController.getString(R.string.Gift2AuctionPriceView), true, true);
        } else {
            i6Var.q(j10 > 3600 ? AndroidUtilities.formatDuration((int) j10, false) : AndroidUtilities.formatDurationNoHours((int) j10, false), isAttachedToWindow(), true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(14.0f);
        org.telegram.ui.Components.i6 i6Var = this.a;
        int d = measuredWidth - ((int) i6Var.d());
        int dp = d - AndroidUtilities.dp(30.0f);
        canvas.save();
        canvas.translate(dp, 0.0f);
        canvas.drawRoundRect(0.0f, 0.0f, getWidth() - dp, getHeight(), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), this.b);
        canvas.restore();
        i6Var.setBounds(d, 0, getMeasuredWidth() - AndroidUtilities.dp(8.0f), getMeasuredHeight() - AndroidUtilities.dp(1.0f));
        i6Var.draw(canvas);
        int dp2 = AndroidUtilities.dp(-22.0f) + d;
        int dp3 = AndroidUtilities.dp(5.0f);
        int dp4 = AndroidUtilities.dp(-4.0f) + d;
        int dp5 = AndroidUtilities.dp(23.0f);
        Drawable drawable = this.d;
        drawable.setBounds(dp2, dp3, dp4, dp5);
        drawable.draw(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(this.f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.c.b();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(172), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(28), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.a || super.verifyDrawable(drawable);
    }
}
