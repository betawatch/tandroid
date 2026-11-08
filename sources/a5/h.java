package a5;

import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.view.View;
import bi.m6;
import org.telegram.ui.Components.gp;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public abstract class h extends Drawable {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ h() {
        this.a = 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        switch (this.a) {
            case 0:
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
    public void clearColorFilter() {
        switch (this.a) {
            case 0:
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
    public Drawable getCurrent() {
        switch (this.a) {
            case 0:
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
    public int getMinimumHeight() {
        switch (this.a) {
            case 0:
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
    public int getMinimumWidth() {
        switch (this.a) {
            case 0:
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
    public boolean getPadding(Rect rect) {
        switch (this.a) {
            case 0:
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
    public int[] getState() {
        switch (this.a) {
            case 0:
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
    public Region getTransparentRegion() {
        switch (this.a) {
            case 0:
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
    public void jumpToCurrentState() {
        switch (this.a) {
            case 0:
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
    public boolean onLevelChange(int i7) {
        switch (this.a) {
            case 0:
                Drawable drawable = (Drawable) this.b;
                if (drawable == null) {
                    break;
                } else {
                    break;
                }
        }
        return super.onLevelChange(i7);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i7) {
        ((Paint) this.b).setAlpha(i7);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i7) {
        switch (this.a) {
            case 0:
                Drawable drawable = (Drawable) this.b;
                if (drawable == null) {
                    super.setChangingConfigurations(i7);
                    break;
                } else {
                    drawable.setChangingConfigurations(i7);
                    break;
                }
            default:
                super.setChangingConfigurations(i7);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(int i7, PorterDuff.Mode mode) {
        switch (this.a) {
            case 0:
                Drawable drawable = (Drawable) this.b;
                if (drawable == null) {
                    super.setColorFilter(i7, mode);
                    break;
                } else {
                    drawable.setColorFilter(i7, mode);
                    break;
                }
            default:
                super.setColorFilter(i7, mode);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z9) {
        switch (this.a) {
            case 0:
                Drawable drawable = (Drawable) this.b;
                if (drawable != null) {
                    drawable.setFilterBitmap(z9);
                    break;
                }
                break;
            default:
                super.setFilterBitmap(z9);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f10, float f11) {
        switch (this.a) {
            case 0:
                Drawable drawable = (Drawable) this.b;
                if (drawable != null) {
                    drawable.setHotspot(f10, f11);
                    break;
                }
                break;
            default:
                super.setHotspot(f10, f11);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i7, int i10, int i11, int i12) {
        switch (this.a) {
            case 0:
                Drawable drawable = (Drawable) this.b;
                if (drawable != null) {
                    drawable.setHotspotBounds(i7, i10, i11, i12);
                    break;
                }
                break;
            default:
                super.setHotspotBounds(i7, i10, i11, i12);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        switch (this.a) {
            case 0:
                Drawable drawable = (Drawable) this.b;
                if (drawable == null) {
                    break;
                } else {
                    break;
                }
        }
        return super.setState(iArr);
    }

    public h(View view) {
        this.a = 1;
        this.b = new Paint(1);
        if (view != null) {
            view.addOnAttachStateChangeListener(new m6(this, 9));
            if (view.isAttachedToWindow()) {
                view.post(new gp(this, 1));
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        ((Paint) this.b).setColorFilter(colorFilter);
    }

    public void a() {
    }

    public void b() {
    }
}
