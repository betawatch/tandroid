// default package

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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class jq extends ImageButton {
    public final kp a;
    public final kq b;
    public boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jq(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        yqb.a(context);
        this.c = false;
        dpb.a(getContext(), this);
        kp kpVar = new kp(this);
        this.a = kpVar;
        kpVar.g(attributeSet, i);
        kq kqVar = new kq(this);
        this.b = kqVar;
        kqVar.t(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        kp kpVar = this.a;
        if (kpVar != null) {
            kpVar.b();
        }
        kq kqVar = this.b;
        if (kqVar != null) {
            kqVar.d();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        kp kpVar = this.a;
        if (kpVar != null) {
            return kpVar.e();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        kp kpVar = this.a;
        if (kpVar != null) {
            return kpVar.f();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        s34 s34Var;
        kq kqVar = this.b;
        if (kqVar == null || (s34Var = (s34) kqVar.d) == null) {
            return null;
        }
        return (ColorStateList) s34Var.c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        s34 s34Var;
        kq kqVar = this.b;
        if (kqVar == null || (s34Var = (s34) kqVar.d) == null) {
            return null;
        }
        return (PorterDuff.Mode) s34Var.d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.b.c).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        kp kpVar = this.a;
        if (kpVar != null) {
            kpVar.h();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        kp kpVar = this.a;
        if (kpVar != null) {
            kpVar.i(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        kq kqVar = this.b;
        if (kqVar != null) {
            kqVar.d();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        kq kqVar = this.b;
        if (kqVar != null && drawable != null && !this.c) {
            kqVar.b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (kqVar != null) {
            kqVar.d();
            if (this.c) {
                return;
            }
            ImageView imageView = (ImageView) kqVar.c;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(kqVar.b);
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
        kq kqVar = this.b;
        ImageView imageView = (ImageView) kqVar.c;
        if (i != 0) {
            Drawable a = kod.a(imageView.getContext(), i);
            if (a != null) {
                vr3.a(a);
            }
            imageView.setImageDrawable(a);
        } else {
            imageView.setImageDrawable(null);
        }
        kqVar.d();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        kq kqVar = this.b;
        if (kqVar != null) {
            kqVar.d();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        kp kpVar = this.a;
        if (kpVar != null) {
            kpVar.m(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        kp kpVar = this.a;
        if (kpVar != null) {
            kpVar.n(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        kq kqVar = this.b;
        if (kqVar != null) {
            s34 s34Var = (s34) kqVar.d;
            if (s34Var == null) {
                s34Var = new s34();
                kqVar.d = s34Var;
            }
            s34Var.c = colorStateList;
            s34Var.b = true;
            kqVar.d();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        kq kqVar = this.b;
        if (kqVar != null) {
            s34 s34Var = (s34) kqVar.d;
            if (s34Var == null) {
                s34Var = new s34();
                kqVar.d = s34Var;
            }
            s34Var.d = mode;
            s34Var.a = true;
            kqVar.d();
        }
    }
}
