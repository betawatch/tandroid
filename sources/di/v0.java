package di;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.pr;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class v0 extends View {
    public final Paint a;
    public final TextPaint b;
    public final StaticLayout c;
    public final float d;
    public final float e;
    public final Path f;
    public bi.oa h;
    public boolean n;
    public final org.telegram.ui.Components.e6 r;

    public v0(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        TextPaint textPaint = new TextPaint(1);
        this.b = textPaint;
        this.f = new Path();
        org.telegram.ui.Components.e6 e6Var = new org.telegram.ui.Components.e6(this);
        this.r = e6Var;
        paint.setColor(-869783512);
        paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(6.0f)));
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint.setColor(-1);
        StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(LocaleController.getString("StoryDraftSaved"), textPaint, AndroidUtilities.displaySize.x, TextUtils.TruncateAt.END), textPaint, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.c = staticLayout;
        this.d = staticLayout.getLineCount() > 0 ? staticLayout.getLineWidth(0) : 0.0f;
        this.e = staticLayout.getLineCount() > 0 ? staticLayout.getLineLeft(0) : 0.0f;
        e6Var.d(0.0f, true);
    }

    public final void a(boolean z10) {
        bi.oa oaVar;
        if (!z10 && (oaVar = this.h) != null) {
            AndroidUtilities.cancelRunOnUIThread(oaVar);
            this.h = null;
        }
        this.n = z10;
        invalidate();
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float e7 = this.r.e(this.n);
        if (e7 <= 0.0f) {
            return;
        }
        canvas.save();
        canvas.translate(0.0f, (this.n ? pr.k.getInterpolation(e7) : 1.0f) * AndroidUtilities.dp(12.0f));
        float interpolation = pr.h.getInterpolation(e7);
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        float dp = AndroidUtilities.dp(22.0f) + this.d;
        float min = (measuredWidth / 2.0f) - Math.min(AndroidUtilities.dp(135.0f), 0.35f * measuredWidth);
        float max = Math.max(AndroidUtilities.dp(8.0f), min - (dp / 2.0f));
        Path path = this.f;
        path.rewind();
        path.moveTo(max, 0.0f);
        float f7 = dp + max;
        path.lineTo(f7, 0.0f);
        path.lineTo(f7, measuredHeight - AndroidUtilities.dp(18.0f));
        path.lineTo(AndroidUtilities.dp(7.0f) + min, measuredHeight - AndroidUtilities.dp(18.0f));
        path.lineTo(AndroidUtilities.dp(1.0f) + min, measuredHeight - AndroidUtilities.dp(12.0f));
        path.lineTo(min - AndroidUtilities.dp(1.0f), measuredHeight - AndroidUtilities.dp(12.0f));
        path.lineTo(min - AndroidUtilities.dp(7.0f), measuredHeight - AndroidUtilities.dp(18.0f));
        path.lineTo(max, measuredHeight - AndroidUtilities.dp(18.0f));
        path.close();
        Paint paint = this.a;
        paint.setAlpha((int) (204.0f * interpolation));
        canvas.drawPath(path, paint);
        canvas.save();
        StaticLayout staticLayout = this.c;
        canvas.translate((max + AndroidUtilities.dp(11.0f)) - this.e, ((measuredHeight - AndroidUtilities.dp(18.0f)) - staticLayout.getHeight()) / 2.0f);
        this.b.setAlpha((int) (interpolation * 255.0f));
        staticLayout.draw(canvas);
        canvas.restore();
        canvas.restore();
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(50.0f));
    }
}
