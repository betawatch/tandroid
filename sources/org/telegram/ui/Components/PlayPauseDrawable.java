package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ActionBar.Theme;

/* loaded from: classes5.dex */
public class PlayPauseDrawable extends Drawable {
    private int alpha = NotificationCenter.didReceiveSmsCode;
    float duration = 300.0f;
    private long lastUpdateTime;
    private final Paint paint;
    private View parent;
    private boolean pause;
    private float progress;
    private final int size;

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    public PlayPauseDrawable(int i) {
        this.size = AndroidUtilities.dp(i);
        Paint paint = new Paint(1);
        this.paint = paint;
        paint.setColor(-1);
    }

    public void setColor(int i) {
        this.paint.setColor(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0067  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void draw(Canvas canvas) {
        int i;
        Canvas canvas2;
        float f;
        float interpolation;
        PathAnimator pathAnimator;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        long j = currentAnimationTimeMillis - this.lastUpdateTime;
        this.lastUpdateTime = currentAnimationTimeMillis;
        if (j > 18) {
            j = 16;
        }
        boolean z = this.pause;
        if (z) {
            float f2 = this.progress;
            if (f2 < 1.0f) {
                float f3 = f2 + (j / this.duration);
                this.progress = f3;
                if (f3 >= 1.0f) {
                    this.progress = 1.0f;
                } else {
                    View view = this.parent;
                    if (view != null) {
                        view.invalidate();
                    }
                    invalidateSelf();
                }
                Rect bounds = getBounds();
                i = this.alpha;
                if (i != 255) {
                    canvas.save();
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                    canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i, 31);
                }
                canvas2.translate(bounds.centerX() + (AndroidUtilities.dp(1.0f) * (1.0f - this.progress)), bounds.centerY());
                f = this.progress * 500.0f;
                if (f >= 100.0f) {
                    interpolation = CubicBezierInterpolator.EASE_BOTH.getInterpolation(f / 100.0f) * (-5.0f);
                } else {
                    interpolation = f < 484.0f ? (CubicBezierInterpolator.EASE_BOTH.getInterpolation((f - 100.0f) / 384.0f) * 95.0f) - 5.0f : 90.0f;
                }
                canvas2.scale((this.size * 1.45f) / AndroidUtilities.dp(28.0f), (this.size * 1.5f) / AndroidUtilities.dp(28.0f));
                canvas2.rotate(interpolation);
                pathAnimator = Theme.playPauseAnimator;
                if (pathAnimator != null) {
                    pathAnimator.draw(canvas2, this.paint, f);
                    canvas2.scale(1.0f, -1.0f);
                    Theme.playPauseAnimator.draw(canvas2, this.paint, f);
                }
                canvas2.restore();
            }
        }
        if (!z) {
            float f4 = this.progress;
            if (f4 > 0.0f) {
                float f5 = f4 - (j / this.duration);
                this.progress = f5;
                if (f5 <= 0.0f) {
                    this.progress = 0.0f;
                } else {
                    View view2 = this.parent;
                    if (view2 != null) {
                        view2.invalidate();
                    }
                    invalidateSelf();
                }
            }
        }
        Rect bounds2 = getBounds();
        i = this.alpha;
        if (i != 255) {
        }
        canvas2.translate(bounds2.centerX() + (AndroidUtilities.dp(1.0f) * (1.0f - this.progress)), bounds2.centerY());
        f = this.progress * 500.0f;
        if (f >= 100.0f) {
        }
        canvas2.scale((this.size * 1.45f) / AndroidUtilities.dp(28.0f), (this.size * 1.5f) / AndroidUtilities.dp(28.0f));
        canvas2.rotate(interpolation);
        pathAnimator = Theme.playPauseAnimator;
        if (pathAnimator != null) {
        }
        canvas2.restore();
    }

    public void setPause(boolean z) {
        setPause(z, true);
    }

    public void setPause(boolean z, boolean z2) {
        if (this.pause != z) {
            this.pause = z;
            if (!z2) {
                this.progress = z ? 1.0f : 0.0f;
            }
            this.lastUpdateTime = AnimationUtils.currentAnimationTimeMillis();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.alpha = i;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.paint.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.size;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.size;
    }

    public void setParent(View view) {
        this.parent = view;
    }

    public void setDuration(int i) {
        this.duration = i;
    }
}
