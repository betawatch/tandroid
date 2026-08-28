package androidx.mediarouter.app;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.Log;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class MediaRouteVolumeSlider extends m.d0 {
    public final float b;
    public boolean c;
    public Drawable d;
    public int e;
    public int f;

    public MediaRouteVolumeSlider(Context context) {
        this(context, null);
    }

    public final void a(int i9, int i10) {
        if (this.e != i9) {
            if (Color.alpha(i9) != 255) {
                Log.e("MediaRouteVolumeSlider", "Volume slider progress and thumb color cannot be translucent: #" + Integer.toHexString(i9));
            }
            this.e = i9;
        }
        if (this.f != i10) {
            if (Color.alpha(i10) != 255) {
                Log.e("MediaRouteVolumeSlider", "Volume slider background color cannot be translucent: #" + Integer.toHexString(i10));
            }
            this.f = i10;
        }
    }

    public final void b(boolean z10) {
        if (this.c == z10) {
            return;
        }
        this.c = z10;
        super.setThumb(z10 ? null : this.d);
    }

    @Override // m.d0, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int i9 = isEnabled() ? 255 : (int) (this.b * 255.0f);
        Drawable drawable = this.d;
        int i10 = this.e;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        drawable.setColorFilter(i10, mode);
        this.d.setAlpha(i9);
        Drawable progressDrawable = getProgressDrawable();
        if (progressDrawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) getProgressDrawable();
            Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.progress);
            layerDrawable.findDrawableByLayerId(R.id.background).setColorFilter(this.f, mode);
            progressDrawable = findDrawableByLayerId;
        }
        progressDrawable.setColorFilter(this.e, mode);
        progressDrawable.setAlpha(i9);
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

    public MediaRouteVolumeSlider(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        this.b = f7.d0.c(context);
    }
}
