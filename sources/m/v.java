package m;

import a8.wa;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public class v extends ImageButton {
    public final h2.c a;
    public final wa b;
    public boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        b3.a(context);
        this.c = false;
        a3.a(this, getContext());
        h2.c cVar = new h2.c(this);
        this.a = cVar;
        cVar.x(attributeSet, i7);
        wa waVar = new wa(this);
        this.b = waVar;
        waVar.s(attributeSet, i7);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        h2.c cVar = this.a;
        if (cVar != null) {
            cVar.b();
        }
        wa waVar = this.b;
        if (waVar != null) {
            waVar.c();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        h2.c cVar = this.a;
        if (cVar != null) {
            return cVar.v();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        h2.c cVar = this.a;
        if (cVar != null) {
            return cVar.w();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        c3 c3Var;
        wa waVar = this.b;
        if (waVar == null || (c3Var = (c3) waVar.d) == null) {
            return null;
        }
        return (ColorStateList) c3Var.c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        c3 c3Var;
        wa waVar = this.b;
        if (waVar == null || (c3Var = (c3) waVar.d) == null) {
            return null;
        }
        return (PorterDuff.Mode) c3Var.d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.b.c).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        h2.c cVar = this.a;
        if (cVar != null) {
            cVar.y();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        h2.c cVar = this.a;
        if (cVar != null) {
            cVar.z(i7);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        wa waVar = this.b;
        if (waVar != null) {
            waVar.c();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        wa waVar = this.b;
        if (waVar != null && drawable != null && !this.c) {
            waVar.b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (waVar != null) {
            waVar.c();
            if (this.c) {
                return;
            }
            ImageView imageView = (ImageView) waVar.c;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(waVar.b);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i7) {
        super.setImageLevel(i7);
        this.c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i7) {
        wa waVar = this.b;
        ImageView imageView = (ImageView) waVar.c;
        if (i7 != 0) {
            Drawable b10 = b5.a.b(imageView.getContext(), i7);
            if (b10 != null) {
                m1.a(b10);
            }
            imageView.setImageDrawable(b10);
        } else {
            imageView.setImageDrawable(null);
        }
        waVar.c();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        wa waVar = this.b;
        if (waVar != null) {
            waVar.c();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        h2.c cVar = this.a;
        if (cVar != null) {
            cVar.D(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        h2.c cVar = this.a;
        if (cVar != null) {
            cVar.E(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        wa waVar = this.b;
        if (waVar != null) {
            if (((c3) waVar.d) == null) {
                waVar.d = new c3();
            }
            c3 c3Var = (c3) waVar.d;
            c3Var.c = colorStateList;
            c3Var.b = true;
            waVar.c();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        wa waVar = this.b;
        if (waVar != null) {
            if (((c3) waVar.d) == null) {
                waVar.d = new c3();
            }
            c3 c3Var = (c3) waVar.d;
            c3Var.d = mode;
            c3Var.a = true;
            waVar.c();
        }
    }
}
