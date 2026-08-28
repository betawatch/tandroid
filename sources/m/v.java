package m;

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
import f7.t7;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class v extends ImageButton {
    public final n a;
    public final d5.w b;
    public boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        e3.a(context);
        this.c = false;
        d3.a(this, getContext());
        n nVar = new n(this);
        this.a = nVar;
        nVar.d(attributeSet, i9);
        d5.w wVar = new d5.w(this);
        this.b = wVar;
        wVar.h(attributeSet, i9);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        n nVar = this.a;
        if (nVar != null) {
            nVar.a();
        }
        d5.w wVar = this.b;
        if (wVar != null) {
            wVar.d();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        n nVar = this.a;
        if (nVar != null) {
            return nVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        n nVar = this.a;
        if (nVar != null) {
            return nVar.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        f3 f3Var;
        d5.w wVar = this.b;
        if (wVar == null || (f3Var = (f3) wVar.c) == null) {
            return null;
        }
        return (ColorStateList) f3Var.c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        f3 f3Var;
        d5.w wVar = this.b;
        if (wVar == null || (f3Var = (f3) wVar.c) == null) {
            return null;
        }
        return (PorterDuff.Mode) f3Var.d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.b.b).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        n nVar = this.a;
        if (nVar != null) {
            nVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i9) {
        super.setBackgroundResource(i9);
        n nVar = this.a;
        if (nVar != null) {
            nVar.f(i9);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        d5.w wVar = this.b;
        if (wVar != null) {
            wVar.d();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        d5.w wVar = this.b;
        if (wVar != null && drawable != null && !this.c) {
            wVar.a = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (wVar != null) {
            wVar.d();
            if (this.c) {
                return;
            }
            ImageView imageView = (ImageView) wVar.b;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(wVar.a);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i9) {
        super.setImageLevel(i9);
        this.c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i9) {
        d5.w wVar = this.b;
        ImageView imageView = (ImageView) wVar.b;
        if (i9 != 0) {
            Drawable b10 = t7.b(imageView.getContext(), i9);
            if (b10 != null) {
                m1.a(b10);
            }
            imageView.setImageDrawable(b10);
        } else {
            imageView.setImageDrawable(null);
        }
        wVar.d();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        d5.w wVar = this.b;
        if (wVar != null) {
            wVar.d();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        n nVar = this.a;
        if (nVar != null) {
            nVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        n nVar = this.a;
        if (nVar != null) {
            nVar.i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        d5.w wVar = this.b;
        if (wVar != null) {
            if (((f3) wVar.c) == null) {
                wVar.c = new f3();
            }
            f3 f3Var = (f3) wVar.c;
            f3Var.c = colorStateList;
            f3Var.b = true;
            wVar.d();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        d5.w wVar = this.b;
        if (wVar != null) {
            if (((f3) wVar.c) == null) {
                wVar.c = new f3();
            }
            f3 f3Var = (f3) wVar.c;
            f3Var.d = mode;
            f3Var.a = true;
            wVar.d();
        }
    }
}
