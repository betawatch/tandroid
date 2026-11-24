// default package

import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class jq2 extends Drawable {
    public final /* synthetic */ byte a;
    public Object b;

    public jq2(View view) {
        this.a = (byte) 0;
        this.b = new Paint(1);
        if (view != null) {
            view.addOnAttachStateChangeListener(new wd(this, (byte) 6));
            if (view.isAttachedToWindow()) {
                view.post(new xf2(this, (byte) 7));
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        switch (this.a) {
            case 1:
                Drawable drawable = (Drawable) this.b;
                if (drawable != null) {
                    drawable.applyTheme(theme);
                    break;
                }
                break;
            default:
                super.applyTheme(theme);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void clearColorFilter() {
        switch (this.a) {
            case 1:
                Drawable drawable = (Drawable) this.b;
                if (drawable == null) {
                    super.clearColorFilter();
                    break;
                } else {
                    drawable.clearColorFilter();
                    break;
                }
            default:
                super.clearColorFilter();
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        switch (this.a) {
            case 1:
                Drawable drawable = (Drawable) this.b;
                if (drawable == null) {
                    break;
                } else {
                    break;
                }
        }
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        switch (this.a) {
            case 1:
                Drawable drawable = (Drawable) this.b;
                if (drawable == null) {
                    break;
                } else {
                    break;
                }
        }
        return super.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        switch (this.a) {
            case 1:
                Drawable drawable = (Drawable) this.b;
                if (drawable == null) {
                    break;
                } else {
                    break;
                }
        }
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        switch (this.a) {
            case 1:
                Drawable drawable = (Drawable) this.b;
                if (drawable == null) {
                    break;
                } else {
                    break;
                }
        }
        return super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final int[] getState() {
        switch (this.a) {
            case 1:
                Drawable drawable = (Drawable) this.b;
                if (drawable == null) {
                    break;
                } else {
                    break;
                }
        }
        return super.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        switch (this.a) {
            case 1:
                Drawable drawable = (Drawable) this.b;
                if (drawable == null) {
                    break;
                } else {
                    break;
                }
        }
        return super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        switch (this.a) {
            case 1:
                Drawable drawable = (Drawable) this.b;
                if (drawable != null) {
                    drawable.jumpToCurrentState();
                    break;
                }
                break;
            default:
                super.jumpToCurrentState();
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        switch (this.a) {
            case 1:
                Drawable drawable = (Drawable) this.b;
                if (drawable == null) {
                    break;
                } else {
                    break;
                }
        }
        return super.onLevelChange(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        ((Paint) this.b).setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setChangingConfigurations(int i) {
        switch (this.a) {
            case 1:
                Drawable drawable = (Drawable) this.b;
                if (drawable == null) {
                    super.setChangingConfigurations(i);
                    break;
                } else {
                    drawable.setChangingConfigurations(i);
                    break;
                }
            default:
                super.setChangingConfigurations(i);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(int i, PorterDuff.Mode mode) {
        switch (this.a) {
            case 1:
                Drawable drawable = (Drawable) this.b;
                if (drawable == null) {
                    super.setColorFilter(i, mode);
                    break;
                } else {
                    drawable.setColorFilter(i, mode);
                    break;
                }
            default:
                super.setColorFilter(i, mode);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z) {
        switch (this.a) {
            case 1:
                Drawable drawable = (Drawable) this.b;
                if (drawable != null) {
                    drawable.setFilterBitmap(z);
                    break;
                }
                break;
            default:
                super.setFilterBitmap(z);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f2) {
        switch (this.a) {
            case 1:
                Drawable drawable = (Drawable) this.b;
                if (drawable != null) {
                    drawable.setHotspot(f, f2);
                    break;
                }
                break;
            default:
                super.setHotspot(f, f2);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 1:
                Drawable drawable = (Drawable) this.b;
                if (drawable != null) {
                    drawable.setHotspotBounds(i, i2, i3, i4);
                    break;
                }
                break;
            default:
                super.setHotspotBounds(i, i2, i3, i4);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        switch (this.a) {
            case 1:
                Drawable drawable = (Drawable) this.b;
                if (drawable == null) {
                    break;
                } else {
                    break;
                }
        }
        return super.setState(iArr);
    }

    public void a() {
    }

    public void b() {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        ((Paint) this.b).setColorFilter(colorFilter);
    }

    public /* synthetic */ jq2() {
        this.a = (byte) 1;
    }
}
