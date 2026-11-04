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
import b8.kg;
import b8.oc;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class u extends ImageButton {
    public final g2.d a;
    public final kg b;
    public boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        a3.a(context);
        this.c = false;
        z2.a(this, getContext());
        g2.d dVar = new g2.d(this);
        this.a = dVar;
        dVar.x(attributeSet, i3);
        kg kgVar = new kg(this);
        this.b = kgVar;
        kgVar.t(attributeSet, i3);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        g2.d dVar = this.a;
        if (dVar != null) {
            dVar.b();
        }
        kg kgVar = this.b;
        if (kgVar != null) {
            kgVar.d();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        g2.d dVar = this.a;
        if (dVar != null) {
            return dVar.v();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        g2.d dVar = this.a;
        if (dVar != null) {
            return dVar.w();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        b3 b3Var;
        kg kgVar = this.b;
        if (kgVar == null || (b3Var = (b3) kgVar.d) == null) {
            return null;
        }
        return (ColorStateList) b3Var.c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        b3 b3Var;
        kg kgVar = this.b;
        if (kgVar == null || (b3Var = (b3) kgVar.d) == null) {
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
        g2.d dVar = this.a;
        if (dVar != null) {
            dVar.y();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        g2.d dVar = this.a;
        if (dVar != null) {
            dVar.z(i3);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        kg kgVar = this.b;
        if (kgVar != null) {
            kgVar.d();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        kg kgVar = this.b;
        if (kgVar != null && drawable != null && !this.c) {
            kgVar.b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (kgVar != null) {
            kgVar.d();
            if (this.c) {
                return;
            }
            ImageView imageView = (ImageView) kgVar.c;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(kgVar.b);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i3) {
        super.setImageLevel(i3);
        this.c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i3) {
        kg kgVar = this.b;
        ImageView imageView = (ImageView) kgVar.c;
        if (i3 != 0) {
            Drawable b10 = oc.b(imageView.getContext(), i3);
            if (b10 != null) {
                l1.a(b10);
            }
            imageView.setImageDrawable(b10);
        } else {
            imageView.setImageDrawable(null);
        }
        kgVar.d();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        kg kgVar = this.b;
        if (kgVar != null) {
            kgVar.d();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        g2.d dVar = this.a;
        if (dVar != null) {
            dVar.D(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        g2.d dVar = this.a;
        if (dVar != null) {
            dVar.E(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        kg kgVar = this.b;
        if (kgVar != null) {
            if (((b3) kgVar.d) == null) {
                kgVar.d = new b3();
            }
            b3 b3Var = (b3) kgVar.d;
            b3Var.c = colorStateList;
            b3Var.b = true;
            kgVar.d();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        kg kgVar = this.b;
        if (kgVar != null) {
            if (((b3) kgVar.d) == null) {
                kgVar.d = new b3();
            }
            b3 b3Var = (b3) kgVar.d;
            b3Var.d = mode;
            b3Var.a = true;
            kgVar.d();
        }
    }
}
