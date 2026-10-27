package m;

import a8.kc;
import a8.ng;
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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public class u extends ImageButton {
    public final e2.c a;
    public final ng b;
    public boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        c3.a(context);
        this.c = false;
        b3.a(this, getContext());
        e2.c cVar = new e2.c(this);
        this.a = cVar;
        cVar.f(attributeSet, i10);
        ng ngVar = new ng(this);
        this.b = ngVar;
        ngVar.t(attributeSet, i10);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        e2.c cVar = this.a;
        if (cVar != null) {
            cVar.b();
        }
        ng ngVar = this.b;
        if (ngVar != null) {
            ngVar.b();
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
        d3 d3Var;
        ng ngVar = this.b;
        if (ngVar == null || (d3Var = (d3) ngVar.d) == null) {
            return null;
        }
        return (ColorStateList) d3Var.c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        d3 d3Var;
        ng ngVar = this.b;
        if (ngVar == null || (d3Var = (d3) ngVar.d) == null) {
            return null;
        }
        return (PorterDuff.Mode) d3Var.d;
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
        ng ngVar = this.b;
        if (ngVar != null) {
            ngVar.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        ng ngVar = this.b;
        if (ngVar != null && drawable != null && !this.c) {
            ngVar.b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (ngVar != null) {
            ngVar.b();
            if (this.c) {
                return;
            }
            ImageView imageView = (ImageView) ngVar.c;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(ngVar.b);
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
        ng ngVar = this.b;
        ImageView imageView = (ImageView) ngVar.c;
        if (i10 != 0) {
            Drawable b10 = kc.b(imageView.getContext(), i10);
            if (b10 != null) {
                l1.a(b10);
            }
            imageView.setImageDrawable(b10);
        } else {
            imageView.setImageDrawable(null);
        }
        ngVar.b();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        ng ngVar = this.b;
        if (ngVar != null) {
            ngVar.b();
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
        ng ngVar = this.b;
        if (ngVar != null) {
            if (((d3) ngVar.d) == null) {
                ngVar.d = new d3();
            }
            d3 d3Var = (d3) ngVar.d;
            d3Var.c = colorStateList;
            d3Var.b = true;
            ngVar.b();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        ng ngVar = this.b;
        if (ngVar != null) {
            if (((d3) ngVar.d) == null) {
                ngVar.d = new d3();
            }
            d3 d3Var = (d3) ngVar.d;
            d3Var.d = mode;
            d3Var.a = true;
            ngVar.b();
        }
    }
}
