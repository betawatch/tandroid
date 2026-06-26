package org.telegram.ui.community;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.utils.DrawableUtils;
import org.telegram.ui.ActionBar.Theme;

/* loaded from: classes3.dex */
public class CommunityArrowDrawable extends Drawable {
    private int alpha = NotificationCenter.didReceiveSmsCode;
    private final Drawable arrowDrawable = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.settings_arrow).mutate();
    private int lastColor;

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        float exactCenterX = getBounds().exactCenterX();
        float exactCenterY = getBounds().exactCenterY();
        int color = Theme.getColor(Theme.key_windowBackgroundWhiteBlackText);
        int color2 = Theme.getColor(Theme.key_windowBackgroundWhite);
        if (this.lastColor != color2) {
            this.lastColor = color2;
            this.arrowDrawable.setColorFilter(new PorterDuffColorFilter(color2, PorterDuff.Mode.SRC_IN));
        }
        canvas.drawCircle(exactCenterX, exactCenterY, AndroidUtilities.dp(6.6666665f), Theme.fillingPaint(ColorUtils.setAlphaComponent(color, this.alpha)));
        DrawableUtils.setBounds(this.arrowDrawable, exactCenterX, exactCenterY, 17);
        canvas.translate(0.0f, AndroidUtilities.dp(0.66f));
        canvas.save();
        canvas.rotate(90.0f, exactCenterX, exactCenterY);
        DrawableUtils.drawWithScale(canvas, this.arrowDrawable, 0.8f);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return AndroidUtilities.dp(13.333333f);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return AndroidUtilities.dp(13.333333f);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.alpha = i;
        this.arrowDrawable.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.alpha;
    }
}
