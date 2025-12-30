package org.telegram.ui.Components.glass;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.math.MathUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundColorProviderThemed;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceColor;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceRenderNode;

/* loaded from: classes5.dex */
public abstract class GlassTabsView extends FrameLayout {
    private final BlurredBackgroundSourceColor lensBackgroundSourceColor;
    private final BlurredBackgroundSourceRenderNode lensBackgroundSourceNode;
    private final Rect lensBounds;
    private final Rect lensBoundsForeground;
    private int lensColorBackground;
    private int lensColorForeground;
    public final BlurredBackgroundDrawable lensDrawable;
    private final Paint lensPaint;
    private float lensVisibility;
    public final LinearLayout linearLayout;

    public GlassTabsView(Context context) {
        super(context);
        BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory;
        this.lensBounds = new Rect();
        this.lensBoundsForeground = new Rect();
        this.lensPaint = new Paint(1);
        setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.linearLayout = linearLayout;
        linearLayout.setOrientation(0);
        addView(linearLayout, LayoutHelper.createFrame(-1, -1.0f));
        BlurredBackgroundSourceColor blurredBackgroundSourceColor = new BlurredBackgroundSourceColor();
        this.lensBackgroundSourceColor = blurredBackgroundSourceColor;
        Theme.ResourcesProvider resourcesProvider = null;
        if (Build.VERSION.SDK_INT >= 31) {
            BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNode = new BlurredBackgroundSourceRenderNode(blurredBackgroundSourceColor);
            this.lensBackgroundSourceNode = blurredBackgroundSourceRenderNode;
            blurredBackgroundSourceRenderNode.setBlur(AndroidUtilities.dp(4.0f));
            blurredBackgroundDrawableViewFactory = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceRenderNode);
            blurredBackgroundDrawableViewFactory.setLiquidGlassEffectAllowed(LiteMode.isEnabled(262144));
        } else {
            this.lensBackgroundSourceNode = null;
            blurredBackgroundDrawableViewFactory = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceColor);
        }
        BlurredBackgroundDrawable create = blurredBackgroundDrawableViewFactory.create();
        this.lensDrawable = create;
        create.setColorProvider(new BlurredBackgroundColorProviderThemed(resourcesProvider, Theme.key_windowBackgroundWhite) { // from class: org.telegram.ui.Components.glass.GlassTabsView.1
            @Override // org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundColorProviderThemed, org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundColorProvider
            public int getBackgroundColor() {
                return 0;
            }

            @Override // org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundColorProviderThemed, org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundColorProvider
            public int getShadowColor() {
                return 0;
            }
        });
    }

    protected void setLensColor(int i, int i2) {
        this.lensColorBackground = i;
        this.lensColorForeground = i2;
        this.lensPaint.setColor(i);
    }

    protected void setLensBounds(int i, int i2, int i3, int i4) {
        this.lensBounds.set(i, i2, i3, i4);
        checkBounds();
    }

    protected void setLensVisibility(float f) {
        this.lensVisibility = f;
        this.lensDrawable.setAlpha(MathUtils.clamp((int) (f * 255.0f), 0, NotificationCenter.cameraInitied));
        checkBounds();
    }

    private void checkBounds() {
        int dp = AndroidUtilities.dp(this.lensVisibility * 7.0f);
        this.lensBoundsForeground.set(this.lensBounds);
        int i = -dp;
        this.lensBoundsForeground.inset(i, i);
        this.lensDrawable.setBounds(this.lensBoundsForeground);
        this.lensDrawable.setRadius(Math.min(this.lensBoundsForeground.width(), this.lensBoundsForeground.height()) / 2.0f);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNode;
        if (Build.VERSION.SDK_INT >= 31 && (blurredBackgroundSourceRenderNode = this.lensBackgroundSourceNode) != null && !blurredBackgroundSourceRenderNode.inRecording()) {
            RecordingCanvas beginRecording = this.lensBackgroundSourceNode.beginRecording(getMeasuredWidth(), getMeasuredHeight());
            Drawable background = getBackground();
            if (background != null) {
                background.draw(beginRecording);
            }
            beginRecording.drawColor(this.lensColorForeground);
            super.dispatchDraw(beginRecording);
            this.lensBackgroundSourceNode.endRecording();
        }
        drawLens(canvas);
        super.dispatchDraw(canvas);
    }

    private void drawLens(Canvas canvas) {
        if (this.lensDrawable.getAlpha() != 255) {
            float min = Math.min(this.lensBounds.width() / 2.0f, this.lensBounds.height() / 2.0f);
            Rect rect = this.lensBounds;
            canvas.drawRoundRect(rect.left, rect.top, rect.right, rect.bottom, min, min, this.lensPaint);
        }
        if (this.lensDrawable.getAlpha() != 0) {
            this.lensDrawable.draw(canvas);
        }
    }
}
