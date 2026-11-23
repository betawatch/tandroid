package ia;

import aa.a0;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.i10;
import org.telegram.messenger.mp;
import org.telegram.messenger.t0;
import org.telegram.ui.ActionBar.n6;
import ug.a1;
import ug.z0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class e {
    public static e j;
    public int a;
    public final Object b;
    public final Object c;
    public Object d;
    public final Object e;
    public final Object f;
    public Object g;
    public Object h;
    public final Object i;

    public e(String str, String str2, String str3, String str4, a0 a0Var, String str5, String str6, String str7, int i7) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.i = a0Var;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.a = i7;
    }

    public static z0 c(Drawable drawable, a1 a1Var) {
        if (drawable == null) {
            return null;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int minimumHeight = drawable.getMinimumHeight();
        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, minimumHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, intrinsicWidth, minimumHeight);
        drawable.draw(canvas);
        a1Var.f.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        a1Var.d(0, -intrinsicWidth, 0, intrinsicWidth, 0.0f, minimumHeight);
        canvas.drawRect(0.0f, 0.0f, intrinsicWidth, minimumHeight, a1Var.f);
        a1Var.f.setXfermode(null);
        int[] iArr = a1Var.l;
        z0 z0Var = new z0(t0.b.getResources(), createBitmap);
        z0Var.b = drawable;
        int[] iArr2 = new int[iArr.length];
        z0Var.a = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return z0Var;
    }

    public static e d() {
        if (j == null) {
            j = new e();
        }
        return j;
    }

    public z0 a(z0 z0Var) {
        a1 a1Var = (a1) this.b;
        int[] iArr = a1Var.l;
        int i7 = iArr[0];
        int[] iArr2 = z0Var.a;
        return (i7 == iArr2[0] && iArr[1] == iArr2[1] && iArr[2] == iArr2[2] && iArr[3] == iArr2[3]) ? z0Var : c(z0Var.b, a1Var);
    }

    public void b() {
        int i7 = n6.z9;
        if (n6.x0(null, i7, false) != this.a) {
            this.a = n6.x0(null, i7, false);
            ((Drawable) this.f).setColorFilter(new PorterDuffColorFilter(this.a, PorterDuff.Mode.MULTIPLY));
        }
        this.g = a((z0) this.g);
        this.h = a((z0) this.h);
    }

    public Paint e() {
        if (!mp.u1(i10.t0).K3()) {
            return (Paint) this.c;
        }
        if (((Paint) this.d) == null) {
            this.d = new Paint(1);
        }
        ((Paint) this.d).setColor(n6.x0(null, n6.Fi, false));
        return (Paint) this.d;
    }

    public void f(float f10, float f11, int i7, int i10) {
        ((a1) this.b).d(0, f10, 0, i7, f11, i10);
    }

    public e() {
        a1 a1Var = new a1(n6.Ck, n6.Dk, n6.Ek, n6.Fk, null);
        this.b = a1Var;
        a1 a1Var2 = new a1(n6.Wk, n6.Xk, -1, -1, null);
        this.c = a1Var.f;
        this.f = t0.b.getDrawable(R.drawable.msg_premium_liststar).mutate();
        this.g = c(t0.b.getDrawable(R.drawable.msg_settings_premium), a1Var);
        this.i = c(t0.b.getDrawable(R.drawable.msg_settings_premium), a1Var2);
        this.h = c(t0.b.getDrawable(R.drawable.msg_premium_normal), a1Var);
        this.e = t0.b.getDrawable(R.drawable.msg_premium_liststar).mutate();
        a1Var.a();
        b();
    }
}
