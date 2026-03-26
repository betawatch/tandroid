package org.telegram.ui.Components.poll;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import me.vkryl.android.animator.BoolAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.CubicBezierInterpolator;

/* loaded from: classes5.dex */
public class PollAttachButton extends View {
    private final BoolAnimator animatorHasMedia;
    public final Drawable attachDrawable;
    private PollAttachedMedia attachedMedia;
    private final ImageReceiver imageReceiver;
    private final Theme.ResourcesProvider resourcesProvider;
    private final int size;

    public PollAttachButton(Context context, Theme.ResourcesProvider resourcesProvider) {
        this(context, resourcesProvider, 38);
    }

    public PollAttachButton(Context context, Theme.ResourcesProvider resourcesProvider, int i) {
        super(context);
        this.animatorHasMedia = new BoolAnimator(this, CubicBezierInterpolator.EASE_OUT_QUINT, 380L);
        this.resourcesProvider = resourcesProvider;
        this.size = i;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.imageReceiver = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(7.0f));
        Drawable mutate = context.getResources().getDrawable(R.drawable.outline_poll_attach_24).mutate();
        this.attachDrawable = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(Theme.multAlpha(Theme.getColor(Theme.key_pollCreateIcons), 0.8f), PorterDuff.Mode.SRC_IN));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int dp = AndroidUtilities.dp(24.0f);
        int i5 = (i - dp) / 2;
        int i6 = (i2 - dp) / 2;
        this.attachDrawable.setBounds(i5, i6, i5 + dp, dp + i6);
        int dp2 = AndroidUtilities.dp(this.size);
        float f = (i - dp2) / 2;
        float f2 = (i2 - dp2) / 2;
        float f3 = dp2;
        this.imageReceiver.setImageCoords(f, f2, f3, f3);
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.imageReceiver.onAttachedToWindow();
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.imageReceiver.onDetachedFromWindow();
    }

    public void setAttachedMedia(PollAttachedMedia pollAttachedMedia, boolean z) {
        this.animatorHasMedia.setValue(pollAttachedMedia != null, z);
        this.attachedMedia = pollAttachedMedia;
        if (pollAttachedMedia != null) {
            pollAttachedMedia.setupImageReceiver(this.imageReceiver);
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float floatValue = this.animatorHasMedia.getFloatValue();
        if (floatValue < 1.0f) {
            canvas.save();
            float f = 1.0f - floatValue;
            canvas.scale(f, f, width, height);
            this.attachDrawable.draw(canvas);
            canvas.restore();
        }
        if (floatValue > 0.0f) {
            canvas.save();
            canvas.scale(floatValue, floatValue, width, height);
            this.imageReceiver.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(this.imageReceiver.getImageX(), this.imageReceiver.getImageY());
            canvas.scale(floatValue, floatValue, AndroidUtilities.dp(this.size) / 2.0f, AndroidUtilities.dp(this.size) / 2.0f);
            PollAttachedMedia pollAttachedMedia = this.attachedMedia;
            if (pollAttachedMedia != null) {
                pollAttachedMedia.drawOverlay(canvas, AndroidUtilities.dp(this.size), AndroidUtilities.dp(this.size));
            }
            canvas.restore();
        }
    }
}
