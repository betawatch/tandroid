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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class sh0 extends FrameLayout {
    public final Paint a;
    public final Path b;
    public final rh0 c;
    public float d;
    public float e;
    public float f;
    public boolean h;
    public NotchInfoUtils.NotchInfo n;

    public sh0(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        this.b = new Path();
        paint.setColor(-16777216);
        if (Build.VERSION.SDK_INT < 31 || SharedConfig.getDevicePerformanceClass() < 1) {
            this.c = new ph0(this);
        } else {
            this.c = new qh0(this, SharedConfig.getDevicePerformanceClass() == 2 ? 1.0f : 1.5f);
        }
        setIntensity(15.0f);
        setBlurIntensity(0.0f);
        setWillNotDraw(false);
    }

    public static /* synthetic */ void a(sh0 sh0Var, Canvas canvas) {
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
            this.c.c(new kv(this, 12), canvas);
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

    public void setBlurIntensity(float f7) {
        this.f = f7;
        this.c.b(f7);
        invalidate();
    }

    public void setGooeyEnabled(boolean z10) {
        if (this.h == z10) {
            return;
        }
        this.h = z10;
        invalidate();
    }

    public void setIntensity(float f7) {
        this.d = f7;
        this.c.a(f7);
        invalidate();
    }

    public void setPullProgress(float f7) {
        this.e = f7;
        invalidate();
    }
}
