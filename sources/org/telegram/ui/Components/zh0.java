package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Build;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotchInfoUtils;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class zh0 extends FrameLayout {
    public final Paint a;
    public final Path b;
    public final yh0 c;
    public float d;
    public float e;
    public float f;
    public boolean h;
    public NotchInfoUtils.NotchInfo n;

    public zh0(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        this.b = new Path();
        paint.setColor(-16777216);
        if (Build.VERSION.SDK_INT < 31 || SharedConfig.getDevicePerformanceClass() < 1) {
            this.c = new wh0(this);
        } else {
            this.c = new xh0(this, SharedConfig.getDevicePerformanceClass() == 2 ? 1.0f : 1.5f);
        }
        setIntensity(15.0f);
        setBlurIntensity(0.0f);
        setWillNotDraw(false);
    }

    public static /* synthetic */ void a(zh0 zh0Var, Canvas canvas) {
        canvas.save();
        canvas.translate(0.0f, AndroidUtilities.dp(32.0f));
        super.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (!this.h) {
            super.draw(canvas);
        } else {
            this.c.c(new fv(this, 12), canvas);
        }
    }

    public float getAvatarEndScale() {
        float min;
        int dp;
        NotchInfoUtils.NotchInfo notchInfo = this.n;
        if (notchInfo == null) {
            return 0.8f;
        }
        if (notchInfo.isLikelyCircle) {
            min = notchInfo.bounds.width() - AndroidUtilities.dp(2.0f);
            dp = AndroidUtilities.dp(100.0f);
        } else {
            min = Math.min(notchInfo.bounds.width(), this.n.bounds.height());
            dp = AndroidUtilities.dp(100.0f);
        }
        return Math.min(0.8f, min / dp);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        NotchInfoUtils.NotchInfo info = NotchInfoUtils.getInfo(getContext());
        this.n = info;
        if ((info != null && info.gravity != 17) || getWidth() > getHeight()) {
            this.n = null;
        }
        this.c.d(i10, i11);
    }

    public void setBlurIntensity(float f10) {
        this.f = f10;
        this.c.b(f10);
        invalidate();
    }

    public void setGooeyEnabled(boolean z4) {
        if (this.h == z4) {
            return;
        }
        this.h = z4;
        invalidate();
    }

    public void setIntensity(float f10) {
        this.d = f10;
        this.c.a(f10);
        invalidate();
    }

    public void setPullProgress(float f10) {
        this.e = f10;
        invalidate();
    }
}
