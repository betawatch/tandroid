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
import h7.s7;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public class v extends ImageButton {
    public final n a;
    public final f5.u b;
    public boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        e3.a(context);
        this.c = false;
        d3.a(this, getContext());
        n nVar = new n(this);
        this.a = nVar;
        nVar.d(attributeSet, i10);
        f5.u uVar = new f5.u(this);
        this.b = uVar;
        uVar.h(attributeSet, i10);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        n nVar = this.a;
        if (nVar != null) {
            nVar.a();
        }
        f5.u uVar = this.b;
        if (uVar != null) {
            uVar.d();
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
        f5.u uVar = this.b;
        if (uVar == null || (f3Var = (f3) uVar.c) == null) {
            return null;
        }
        return (ColorStateList) f3Var.c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        f3 f3Var;
        f5.u uVar = this.b;
        if (uVar == null || (f3Var = (f3) uVar.c) == null) {
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
        f5.u uVar = this.b;
        if (uVar != null) {
            uVar.d();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        f5.u uVar = this.b;
        if (uVar != null && drawable != null && !this.c) {
            uVar.a = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (uVar != null) {
            uVar.d();
            if (this.c) {
                return;
            }
            ImageView imageView = (ImageView) uVar.b;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(uVar.a);
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
        f5.u uVar = this.b;
        ImageView imageView = (ImageView) uVar.b;
        if (i10 != 0) {
            Drawable b10 = s7.b(imageView.getContext(), i10);
            if (b10 != null) {
                m1.a(b10);
            }
            imageView.setImageDrawable(b10);
        } else {
            imageView.setImageDrawable(null);
        }
        uVar.d();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        f5.u uVar = this.b;
        if (uVar != null) {
            uVar.d();
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
        f5.u uVar = this.b;
        if (uVar != null) {
            if (((f3) uVar.c) == null) {
                uVar.c = new f3();
            }
            f3 f3Var = (f3) uVar.c;
            f3Var.c = colorStateList;
            f3Var.b = true;
            uVar.d();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        f5.u uVar = this.b;
        if (uVar != null) {
            if (((f3) uVar.c) == null) {
                uVar.c = new f3();
            }
            f3 f3Var = (f3) uVar.c;
            f3Var.d = mode;
            f3Var.a = true;
            uVar.d();
        }
    }
}
