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
import j7.s7;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public class u extends ImageButton {
    public final m a;
    public final x5.k b;
    public boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        d3.a(context);
        this.c = false;
        c3.a(this, getContext());
        m mVar = new m(this);
        this.a = mVar;
        mVar.d(attributeSet, i10);
        x5.k kVar = new x5.k(this);
        this.b = kVar;
        kVar.c(attributeSet, i10);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        m mVar = this.a;
        if (mVar != null) {
            mVar.a();
        }
        x5.k kVar = this.b;
        if (kVar != null) {
            kVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        m mVar = this.a;
        if (mVar != null) {
            return mVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        m mVar = this.a;
        if (mVar != null) {
            return mVar.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        e3 e3Var;
        x5.k kVar = this.b;
        if (kVar == null || (e3Var = (e3) kVar.c) == null) {
            return null;
        }
        return (ColorStateList) e3Var.c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        e3 e3Var;
        x5.k kVar = this.b;
        if (kVar == null || (e3Var = (e3) kVar.c) == null) {
            return null;
        }
        return (PorterDuff.Mode) e3Var.d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.b.b).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        m mVar = this.a;
        if (mVar != null) {
            mVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        m mVar = this.a;
        if (mVar != null) {
            mVar.f(i10);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        x5.k kVar = this.b;
        if (kVar != null) {
            kVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        x5.k kVar = this.b;
        if (kVar != null && drawable != null && !this.c) {
            kVar.a = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (kVar != null) {
            kVar.a();
            if (this.c) {
                return;
            }
            ImageView imageView = (ImageView) kVar.b;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(kVar.a);
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
        x5.k kVar = this.b;
        ImageView imageView = (ImageView) kVar.b;
        if (i10 != 0) {
            Drawable b10 = s7.b(imageView.getContext(), i10);
            if (b10 != null) {
                l1.a(b10);
            }
            imageView.setImageDrawable(b10);
        } else {
            imageView.setImageDrawable(null);
        }
        kVar.a();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        x5.k kVar = this.b;
        if (kVar != null) {
            kVar.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        m mVar = this.a;
        if (mVar != null) {
            mVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        m mVar = this.a;
        if (mVar != null) {
            mVar.i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        x5.k kVar = this.b;
        if (kVar != null) {
            if (((e3) kVar.c) == null) {
                kVar.c = new e3();
            }
            e3 e3Var = (e3) kVar.c;
            e3Var.c = colorStateList;
            e3Var.b = true;
            kVar.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        x5.k kVar = this.b;
        if (kVar != null) {
            if (((e3) kVar.c) == null) {
                kVar.c = new e3();
            }
            e3 e3Var = (e3) kVar.c;
            e3Var.d = mode;
            e3Var.a = true;
            kVar.a();
        }
    }
}
