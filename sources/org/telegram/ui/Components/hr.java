package org.telegram.ui.Components;

import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public abstract class hr extends Drawable {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ hr() {
        this.a = 1;
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
    public void clearColorFilter() {
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
    public Drawable getCurrent() {
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
    public int getMinimumHeight() {
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
    public int getMinimumWidth() {
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
    public boolean getPadding(Rect rect) {
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
    public int[] getState() {
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
    public Region getTransparentRegion() {
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
    public void jumpToCurrentState() {
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
    public boolean onLevelChange(int i10) {
        switch (this.a) {
            case 1:
                Drawable drawable = (Drawable) this.b;
                if (drawable == null) {
                    break;
                } else {
                    break;
                }
        }
        return super.onLevelChange(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        ((Paint) this.b).setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i10) {
        switch (this.a) {
            case 1:
                Drawable drawable = (Drawable) this.b;
                if (drawable == null) {
                    super.setChangingConfigurations(i10);
                    break;
                } else {
                    drawable.setChangingConfigurations(i10);
                    break;
                }
            default:
                super.setChangingConfigurations(i10);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(int i10, PorterDuff.Mode mode) {
        switch (this.a) {
            case 1:
                Drawable drawable = (Drawable) this.b;
                if (drawable == null) {
                    super.setColorFilter(i10, mode);
                    break;
                } else {
                    drawable.setColorFilter(i10, mode);
                    break;
                }
            default:
                super.setColorFilter(i10, mode);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z10) {
        switch (this.a) {
            case 1:
                Drawable drawable = (Drawable) this.b;
                if (drawable != null) {
                    drawable.setFilterBitmap(z10);
                    break;
                }
                break;
            default:
                super.setFilterBitmap(z10);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f7, float f10) {
        switch (this.a) {
            case 1:
                Drawable drawable = (Drawable) this.b;
                if (drawable != null) {
                    drawable.setHotspot(f7, f10);
                    break;
                }
                break;
            default:
                super.setHotspot(f7, f10);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 1:
                Drawable drawable = (Drawable) this.b;
                if (drawable != null) {
                    drawable.setHotspotBounds(i10, i11, i12, i13);
                    break;
                }
                break;
            default:
                super.setHotspotBounds(i10, i11, i12, i13);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
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

    public hr(View view) {
        this.a = 0;
        this.b = new Paint(1);
        if (view != null) {
            view.addOnAttachStateChangeListener(new ai.v2(this, 7));
            if (view.isAttachedToWindow()) {
                view.post(new nq(this, 1));
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
