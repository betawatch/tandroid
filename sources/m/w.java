package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import g7.o7;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public class w extends ImageView {
    public final n a;
    public final d5.x b;
    public boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        e3.a(context);
        this.c = false;
        d3.a(this, getContext());
        n nVar = new n(this);
        this.a = nVar;
        nVar.d(attributeSet, i10);
        d5.x xVar = new d5.x(this);
        this.b = xVar;
        xVar.h(attributeSet, i10);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        n nVar = this.a;
        if (nVar != null) {
            nVar.a();
        }
        d5.x xVar = this.b;
        if (xVar != null) {
            xVar.d();
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
        d5.x xVar = this.b;
        if (xVar == null || (f3Var = (f3) xVar.c) == null) {
            return null;
        }
        return (ColorStateList) f3Var.c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        f3 f3Var;
        d5.x xVar = this.b;
        if (xVar == null || (f3Var = (f3) xVar.c) == null) {
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
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        n nVar = this.a;
        if (nVar != null) {
            nVar.f(i10);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        d5.x xVar = this.b;
        if (xVar != null) {
            xVar.d();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        d5.x xVar = this.b;
        if (xVar != null && drawable != null && !this.c) {
            xVar.a = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (xVar != null) {
            xVar.d();
            if (this.c) {
                return;
            }
            ImageView imageView = (ImageView) xVar.b;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(xVar.a);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i10) {
        super.setImageLevel(i10);
        this.c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        d5.x xVar = this.b;
        if (xVar != null) {
            ImageView imageView = (ImageView) xVar.b;
            if (i10 != 0) {
                Drawable b10 = o7.b(imageView.getContext(), i10);
                if (b10 != null) {
                    m1.a(b10);
                }
                imageView.setImageDrawable(b10);
            } else {
                imageView.setImageDrawable(null);
            }
            xVar.d();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        d5.x xVar = this.b;
        if (xVar != null) {
            xVar.d();
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
        d5.x xVar = this.b;
        if (xVar != null) {
            if (((f3) xVar.c) == null) {
                xVar.c = new f3();
            }
            f3 f3Var = (f3) xVar.c;
            f3Var.c = colorStateList;
            f3Var.b = true;
            xVar.d();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        d5.x xVar = this.b;
        if (xVar != null) {
            if (((f3) xVar.c) == null) {
                xVar.c = new f3();
            }
            f3 f3Var = (f3) xVar.c;
            f3Var.d = mode;
            f3Var.a = true;
            xVar.d();
        }
    }
}
