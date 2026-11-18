package androidx.mediarouter.app;

import a8.c7;
import android.R;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.Log;
import org.telegram.messenger.ks;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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

    public final void a(int i7, int i10) {
        if (this.e != i7) {
            if (Color.alpha(i7) != 255) {
                Log.e("MediaRouteVolumeSlider", "Volume slider progress and thumb color cannot be translucent: #" + Integer.toHexString(i7));
            }
            this.e = i7;
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

    @Override // m.c0, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int i7 = isEnabled() ? ks.e4 : (int) (this.b * 255.0f);
        Drawable drawable = this.d;
        int i10 = this.e;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        drawable.setColorFilter(i10, mode);
        this.d.setAlpha(i7);
        Drawable progressDrawable = getProgressDrawable();
        if (progressDrawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) getProgressDrawable();
            Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.progress);
            layerDrawable.findDrawableByLayerId(R.id.background).setColorFilter(this.f, mode);
            progressDrawable = findDrawableByLayerId;
        }
        progressDrawable.setColorFilter(this.e, mode);
        progressDrawable.setAlpha(i7);
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

    public MediaRouteVolumeSlider(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.b = c7.c(context);
    }
}
