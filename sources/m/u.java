package m;

import a8.xa;
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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public class u extends ImageButton {
    public final h2.c a;
    public final xa b;
    public boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        a3.a(context);
        this.c = false;
        z2.a(this, getContext());
        h2.c cVar = new h2.c(this);
        this.a = cVar;
        cVar.x(attributeSet, i7);
        xa xaVar = new xa(this);
        this.b = xaVar;
        xaVar.r(attributeSet, i7);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        h2.c cVar = this.a;
        if (cVar != null) {
            cVar.b();
        }
        xa xaVar = this.b;
        if (xaVar != null) {
            xaVar.b();
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
        b3 b3Var;
        xa xaVar = this.b;
        if (xaVar == null || (b3Var = (b3) xaVar.d) == null) {
            return null;
        }
        return (ColorStateList) b3Var.c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        b3 b3Var;
        xa xaVar = this.b;
        if (xaVar == null || (b3Var = (b3) xaVar.d) == null) {
            return null;
        }
        return (PorterDuff.Mode) b3Var.d;
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
        xa xaVar = this.b;
        if (xaVar != null) {
            xaVar.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        xa xaVar = this.b;
        if (xaVar != null && drawable != null && !this.c) {
            xaVar.b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (xaVar != null) {
            xaVar.b();
            if (this.c) {
                return;
            }
            ImageView imageView = (ImageView) xaVar.c;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(xaVar.b);
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
        xa xaVar = this.b;
        ImageView imageView = (ImageView) xaVar.c;
        if (i7 != 0) {
            Drawable b10 = b5.a.b(imageView.getContext(), i7);
            if (b10 != null) {
                l1.a(b10);
            }
            imageView.setImageDrawable(b10);
        } else {
            imageView.setImageDrawable(null);
        }
        xaVar.b();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        xa xaVar = this.b;
        if (xaVar != null) {
            xaVar.b();
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
        xa xaVar = this.b;
        if (xaVar != null) {
            if (((b3) xaVar.d) == null) {
                xaVar.d = new b3();
            }
            b3 b3Var = (b3) xaVar.d;
            b3Var.c = colorStateList;
            b3Var.b = true;
            xaVar.b();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        xa xaVar = this.b;
        if (xaVar != null) {
            if (((b3) xaVar.d) == null) {
                xaVar.d = new b3();
            }
            b3 b3Var = (b3) xaVar.d;
            b3Var.d = mode;
            b3Var.a = true;
            xaVar.b();
        }
    }
}
