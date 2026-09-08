package androidx.mediarouter.app;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.Log;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public class MediaRouteVolumeSlider extends m.c0 {
    public final float b;
    public boolean c;
    public Drawable d;
    public int e;
    public int f;

    public MediaRouteVolumeSlider(Context context) {
        this(context, null);
    }

    public final void a(int i10, int i11) {
        if (this.e != i10) {
            if (Color.alpha(i10) != 255) {
                Log.e("MediaRouteVolumeSlider", "Volume slider progress and thumb color cannot be translucent: #" + Integer.toHexString(i10));
            }
            this.e = i10;
        }
        if (this.f != i11) {
            if (Color.alpha(i11) != 255) {
                Log.e("MediaRouteVolumeSlider", "Volume slider background color cannot be translucent: #" + Integer.toHexString(i11));
            }
            this.f = i11;
        }
    }

    public final void b(boolean z10) {
        if (this.c == z10) {
            return;
        }
        this.c = z10;
        super.setThumb(z10 ? null : this.d);
    }

    @Override // m.c0, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int i10 = isEnabled() ? 255 : (int) (this.b * 255.0f);
        Drawable drawable = this.d;
        int i11 = this.e;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        drawable.setColorFilter(i11, mode);
        this.d.setAlpha(i10);
        Drawable progressDrawable = getProgressDrawable();
        if (progressDrawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) getProgressDrawable();
            Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.progress);
            layerDrawable.findDrawableByLayerId(R.id.background).setColorFilter(this.f, mode);
            progressDrawable = findDrawableByLayerId;
        }
        progressDrawable.setColorFilter(this.e, mode);
        progressDrawable.setAlpha(i10);
    }

    @Override // android.widget.AbsSeekBar
    public final void setThumb(Drawable drawable) {
        this.d = drawable;
        if (this.c) {
            drawable = null;
        }
        super.setThumb(drawable);
    }

    public MediaRouteVolumeSlider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, org.telegram.messenger.beta.R.attr.seekBarStyle);
    }

    public MediaRouteVolumeSlider(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.b = v7.d0.c(context);
    }
}
