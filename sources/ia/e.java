package ia;

import aa.b0;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.t0;
import org.telegram.ui.ActionBar.l6;
import ug.x0;
import ug.y0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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

    public e(String str, String str2, String str3, String str4, b0 b0Var, String str5, String str6, String str7, int i7) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.i = b0Var;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.a = i7;
    }

    public static x0 c(Drawable drawable, y0 y0Var) {
        if (drawable == null) {
            return null;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int minimumHeight = drawable.getMinimumHeight();
        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, minimumHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, intrinsicWidth, minimumHeight);
        drawable.draw(canvas);
        y0Var.f.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        y0Var.d(0, -intrinsicWidth, 0, intrinsicWidth, 0.0f, minimumHeight);
        canvas.drawRect(0.0f, 0.0f, intrinsicWidth, minimumHeight, y0Var.f);
        y0Var.f.setXfermode(null);
        int[] iArr = y0Var.l;
        x0 x0Var = new x0(t0.b.getResources(), createBitmap);
        x0Var.b = drawable;
        int[] iArr2 = new int[iArr.length];
        x0Var.a = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return x0Var;
    }

    public static e d() {
        if (j == null) {
            j = new e();
        }
        return j;
    }

    public x0 a(x0 x0Var) {
        y0 y0Var = (y0) this.b;
        int[] iArr = y0Var.l;
        int i7 = iArr[0];
        int[] iArr2 = x0Var.a;
        return (i7 == iArr2[0] && iArr[1] == iArr2[1] && iArr[2] == iArr2[2] && iArr[3] == iArr2[3]) ? x0Var : c(x0Var.b, y0Var);
    }

    public void b() {
        int i7 = l6.z9;
        if (l6.x0(null, i7, false) != this.a) {
            this.a = l6.x0(null, i7, false);
            ((Drawable) this.f).setColorFilter(new PorterDuffColorFilter(this.a, PorterDuff.Mode.MULTIPLY));
        }
        this.g = a((x0) this.g);
        this.h = a((x0) this.h);
    }

    public Paint e() {
        if (!qp.s1(p10.s0).D3()) {
            return (Paint) this.c;
        }
        if (((Paint) this.d) == null) {
            this.d = new Paint(1);
        }
        ((Paint) this.d).setColor(l6.x0(null, l6.Ci, false));
        return (Paint) this.d;
    }

    public void f(float f10, float f11, int i7, int i10) {
        ((y0) this.b).d(0, f10, 0, i7, f11, i10);
    }

    public e() {
        y0 y0Var = new y0(l6.zk, l6.Ak, l6.Bk, l6.Ck, null);
        this.b = y0Var;
        y0 y0Var2 = new y0(l6.Tk, l6.Uk, -1, -1, null);
        this.c = y0Var.f;
        this.f = t0.b.getDrawable(R.drawable.msg_premium_liststar).mutate();
        this.g = c(t0.b.getDrawable(R.drawable.msg_settings_premium), y0Var);
        this.i = c(t0.b.getDrawable(R.drawable.msg_settings_premium), y0Var2);
        this.h = c(t0.b.getDrawable(R.drawable.msg_premium_normal), y0Var);
        this.e = t0.b.getDrawable(R.drawable.msg_premium_liststar).mutate();
        y0Var.a();
        b();
    }
}
