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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public class mp extends ImageView {
    public final lo a;
    public final lp b;
    public boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mp(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        xsb.a(context);
        this.c = false;
        brb.a(getContext(), this);
        lo loVar = new lo(this);
        this.a = loVar;
        loVar.g(attributeSet, i);
        lp lpVar = new lp(this);
        this.b = lpVar;
        lpVar.t(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        lo loVar = this.a;
        if (loVar != null) {
            loVar.b();
        }
        lp lpVar = this.b;
        if (lpVar != null) {
            lpVar.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        lo loVar = this.a;
        if (loVar != null) {
            return loVar.e();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        lo loVar = this.a;
        if (loVar != null) {
            return loVar.f();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        c34 c34Var;
        lp lpVar = this.b;
        if (lpVar == null || (c34Var = (c34) lpVar.d) == null) {
            return null;
        }
        return (ColorStateList) c34Var.c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        c34 c34Var;
        lp lpVar = this.b;
        if (lpVar == null || (c34Var = (c34) lpVar.d) == null) {
            return null;
        }
        return (PorterDuff.Mode) c34Var.d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.b.c).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        lo loVar = this.a;
        if (loVar != null) {
            loVar.h();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        lo loVar = this.a;
        if (loVar != null) {
            loVar.i(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        lp lpVar = this.b;
        if (lpVar != null) {
            lpVar.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        lp lpVar = this.b;
        if (lpVar != null && drawable != null && !this.c) {
            lpVar.b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (lpVar != null) {
            lpVar.b();
            if (this.c) {
                return;
            }
            ImageView imageView = (ImageView) lpVar.c;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(lpVar.b);
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
        lp lpVar = this.b;
        if (lpVar != null) {
            ImageView imageView = (ImageView) lpVar.c;
            if (i != 0) {
                Drawable a = yqd.a(imageView.getContext(), i);
                if (a != null) {
                    cr3.a(a);
                }
                imageView.setImageDrawable(a);
            } else {
                imageView.setImageDrawable(null);
            }
            lpVar.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        lp lpVar = this.b;
        if (lpVar != null) {
            lpVar.b();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        lo loVar = this.a;
        if (loVar != null) {
            loVar.m(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        lo loVar = this.a;
        if (loVar != null) {
            loVar.n(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        lp lpVar = this.b;
        if (lpVar != null) {
            c34 c34Var = (c34) lpVar.d;
            if (c34Var == null) {
                c34Var = new c34();
                lpVar.d = c34Var;
            }
            c34Var.c = colorStateList;
            c34Var.b = true;
            lpVar.b();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        lp lpVar = this.b;
        if (lpVar != null) {
            c34 c34Var = (c34) lpVar.d;
            if (c34Var == null) {
                c34Var = new c34();
                lpVar.d = c34Var;
            }
            c34Var.d = mode;
            c34Var.a = true;
            lpVar.b();
        }
    }
}
