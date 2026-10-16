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
import v7.q7;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public class x extends ImageView {
    public final e2.c a;
    public final a5.a b;
    public boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        e3.a(context);
        this.c = false;
        d3.a(this, getContext());
        e2.c cVar = new e2.c(this);
        this.a = cVar;
        cVar.f(attributeSet, i10);
        a5.a aVar = new a5.a(this);
        this.b = aVar;
        aVar.u(attributeSet, i10);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        e2.c cVar = this.a;
        if (cVar != null) {
            cVar.b();
        }
        a5.a aVar = this.b;
        if (aVar != null) {
            aVar.d();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e2.c cVar = this.a;
        if (cVar != null) {
            return cVar.d();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e2.c cVar = this.a;
        if (cVar != null) {
            return cVar.e();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        f3 f3Var;
        a5.a aVar = this.b;
        if (aVar == null || (f3Var = (f3) aVar.d) == null) {
            return null;
        }
        return (ColorStateList) f3Var.c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        f3 f3Var;
        a5.a aVar = this.b;
        if (aVar == null || (f3Var = (f3) aVar.d) == null) {
            return null;
        }
        return (PorterDuff.Mode) f3Var.d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.b.c).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e2.c cVar = this.a;
        if (cVar != null) {
            cVar.g();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e2.c cVar = this.a;
        if (cVar != null) {
            cVar.h(i10);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        a5.a aVar = this.b;
        if (aVar != null) {
            aVar.d();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        a5.a aVar = this.b;
        if (aVar != null && drawable != null && !this.c) {
            aVar.b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (aVar != null) {
            aVar.d();
            if (this.c) {
                return;
            }
            ImageView imageView = (ImageView) aVar.c;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(aVar.b);
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
        a5.a aVar = this.b;
        if (aVar != null) {
            ImageView imageView = (ImageView) aVar.c;
            if (i10 != 0) {
                Drawable b10 = q7.b(imageView.getContext(), i10);
                if (b10 != null) {
                    n1.a(b10);
                }
                imageView.setImageDrawable(b10);
            } else {
                imageView.setImageDrawable(null);
            }
            aVar.d();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        a5.a aVar = this.b;
        if (aVar != null) {
            aVar.d();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e2.c cVar = this.a;
        if (cVar != null) {
            cVar.l(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e2.c cVar = this.a;
        if (cVar != null) {
            cVar.m(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        a5.a aVar = this.b;
        if (aVar != null) {
            if (((f3) aVar.d) == null) {
                aVar.d = new f3();
            }
            f3 f3Var = (f3) aVar.d;
            f3Var.c = colorStateList;
            f3Var.b = true;
            aVar.d();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        a5.a aVar = this.b;
        if (aVar != null) {
            if (((f3) aVar.d) == null) {
                aVar.d = new f3();
            }
            f3 f3Var = (f3) aVar.d;
            f3Var.d = mode;
            f3Var.a = true;
            aVar.d();
        }
    }
}
