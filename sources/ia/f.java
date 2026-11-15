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
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.t0;
import org.telegram.ui.ActionBar.j6;
import ug.y0;
import ug.z0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class f {
    public static f j;
    public int a;
    public final Object b;
    public final Object c;
    public Object d;
    public final Object e;
    public final Object f;
    public Object g;
    public Object h;
    public final Object i;

    public f(String str, String str2, String str3, String str4, a0 a0Var, String str5, String str6, String str7, int i7) {
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

    public static y0 c(Drawable drawable, z0 z0Var) {
        if (drawable == null) {
            return null;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int minimumHeight = drawable.getMinimumHeight();
        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, minimumHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, intrinsicWidth, minimumHeight);
        drawable.draw(canvas);
        z0Var.f.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        z0Var.d(0, -intrinsicWidth, 0, intrinsicWidth, 0.0f, minimumHeight);
        canvas.drawRect(0.0f, 0.0f, intrinsicWidth, minimumHeight, z0Var.f);
        z0Var.f.setXfermode(null);
        int[] iArr = z0Var.l;
        y0 y0Var = new y0(t0.b.getResources(), createBitmap);
        y0Var.b = drawable;
        int[] iArr2 = new int[iArr.length];
        y0Var.a = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return y0Var;
    }

    public static f d() {
        if (j == null) {
            j = new f();
        }
        return j;
    }

    public y0 a(y0 y0Var) {
        z0 z0Var = (z0) this.b;
        int[] iArr = z0Var.l;
        int i7 = iArr[0];
        int[] iArr2 = y0Var.a;
        return (i7 == iArr2[0] && iArr[1] == iArr2[1] && iArr[2] == iArr2[2] && iArr[3] == iArr2[3]) ? y0Var : c(y0Var.b, z0Var);
    }

    public void b() {
        int i7 = j6.z9;
        if (j6.x0(null, i7, false) != this.a) {
            this.a = j6.x0(null, i7, false);
            ((Drawable) this.f).setColorFilter(new PorterDuffColorFilter(this.a, PorterDuff.Mode.MULTIPLY));
        }
        this.g = a((y0) this.g);
        this.h = a((y0) this.h);
    }

    public Paint e() {
        if (!np.s1(m10.t0).D3()) {
            return (Paint) this.c;
        }
        if (((Paint) this.d) == null) {
            this.d = new Paint(1);
        }
        ((Paint) this.d).setColor(j6.x0(null, j6.Fi, false));
        return (Paint) this.d;
    }

    public void f(float f10, float f11, int i7, int i10) {
        ((z0) this.b).d(0, f10, 0, i7, f11, i10);
    }

    public f() {
        z0 z0Var = new z0(j6.Ck, j6.Dk, j6.Ek, j6.Fk, null);
        this.b = z0Var;
        z0 z0Var2 = new z0(j6.Wk, j6.Xk, -1, -1, null);
        this.c = z0Var.f;
        this.f = t0.b.getDrawable(R.drawable.msg_premium_liststar).mutate();
        this.g = c(t0.b.getDrawable(R.drawable.msg_settings_premium), z0Var);
        this.i = c(t0.b.getDrawable(R.drawable.msg_settings_premium), z0Var2);
        this.h = c(t0.b.getDrawable(R.drawable.msg_premium_normal), z0Var);
        this.e = t0.b.getDrawable(R.drawable.msg_premium_liststar).mutate();
        z0Var.a();
        b();
    }
}
