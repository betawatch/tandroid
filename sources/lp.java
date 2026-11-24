// default package

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public class lp extends ImageView {
    public final ko a;
    public final kp b;
    public boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lp(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        xob.a(context);
        this.c = false;
        cnb.a(getContext(), this);
        ko koVar = new ko(this);
        this.a = koVar;
        koVar.g(attributeSet, i);
        kp kpVar = new kp(this);
        this.b = kpVar;
        kpVar.t(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        ko koVar = this.a;
        if (koVar != null) {
            koVar.b();
        }
        kp kpVar = this.b;
        if (kpVar != null) {
            kpVar.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        ko koVar = this.a;
        if (koVar != null) {
            return koVar.e();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        ko koVar = this.a;
        if (koVar != null) {
            return koVar.f();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        h24 h24Var;
        kp kpVar = this.b;
        if (kpVar == null || (h24Var = (h24) kpVar.d) == null) {
            return null;
        }
        return (ColorStateList) h24Var.c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        h24 h24Var;
        kp kpVar = this.b;
        if (kpVar == null || (h24Var = (h24) kpVar.d) == null) {
            return null;
        }
        return (PorterDuff.Mode) h24Var.d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.b.c).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        ko koVar = this.a;
        if (koVar != null) {
            koVar.h();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        ko koVar = this.a;
        if (koVar != null) {
            koVar.i(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        kp kpVar = this.b;
        if (kpVar != null) {
            kpVar.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        kp kpVar = this.b;
        if (kpVar != null && drawable != null && !this.c) {
            kpVar.b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (kpVar != null) {
            kpVar.b();
            if (this.c) {
                return;
            }
            ImageView imageView = (ImageView) kpVar.c;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(kpVar.b);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        kp kpVar = this.b;
        if (kpVar != null) {
            ImageView imageView = (ImageView) kpVar.c;
            if (i != 0) {
                Drawable a = hmd.a(imageView.getContext(), i);
                if (a != null) {
                    lq3.a(a);
                }
                imageView.setImageDrawable(a);
            } else {
                imageView.setImageDrawable(null);
            }
            kpVar.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        kp kpVar = this.b;
        if (kpVar != null) {
            kpVar.b();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        ko koVar = this.a;
        if (koVar != null) {
            koVar.m(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        ko koVar = this.a;
        if (koVar != null) {
            koVar.n(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        kp kpVar = this.b;
        if (kpVar != null) {
            h24 h24Var = (h24) kpVar.d;
            if (h24Var == null) {
                h24Var = new h24();
                kpVar.d = h24Var;
            }
            h24Var.c = colorStateList;
            h24Var.b = true;
            kpVar.b();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        kp kpVar = this.b;
        if (kpVar != null) {
            h24 h24Var = (h24) kpVar.d;
            if (h24Var == null) {
                h24Var = new h24();
                kpVar.d = h24Var;
            }
            h24Var.d = mode;
            h24Var.a = true;
            kpVar.b();
        }
    }
}
