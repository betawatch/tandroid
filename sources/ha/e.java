package ha;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.t0;
import org.telegram.ui.ActionBar.k6;
import vg.w0;
import vg.x0;
import z9.v;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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

    public e(String str, String str2, String str3, String str4, v vVar, String str5, String str6, String str7, int i3) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.i = vVar;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.a = i3;
    }

    public static w0 c(Drawable drawable, x0 x0Var) {
        if (drawable == null) {
            return null;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int minimumHeight = drawable.getMinimumHeight();
        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, minimumHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, intrinsicWidth, minimumHeight);
        drawable.draw(canvas);
        x0Var.f.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        x0Var.d(0, -intrinsicWidth, 0, intrinsicWidth, 0.0f, minimumHeight);
        canvas.drawRect(0.0f, 0.0f, intrinsicWidth, minimumHeight, x0Var.f);
        x0Var.f.setXfermode(null);
        int[] iArr = x0Var.l;
        w0 w0Var = new w0(t0.b.getResources(), createBitmap);
        w0Var.b = drawable;
        int[] iArr2 = new int[iArr.length];
        w0Var.a = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return w0Var;
    }

    public static e d() {
        if (j == null) {
            j = new e();
        }
        return j;
    }

    public w0 a(w0 w0Var) {
        x0 x0Var = (x0) this.b;
        int[] iArr = x0Var.l;
        int i3 = iArr[0];
        int[] iArr2 = w0Var.a;
        return (i3 == iArr2[0] && iArr[1] == iArr2[1] && iArr[2] == iArr2[2] && iArr[3] == iArr2[3]) ? w0Var : c(w0Var.b, x0Var);
    }

    public void b() {
        int i3 = k6.z9;
        if (k6.x0(null, i3, false) != this.a) {
            this.a = k6.x0(null, i3, false);
            ((Drawable) this.f).setColorFilter(new PorterDuffColorFilter(this.a, PorterDuff.Mode.MULTIPLY));
        }
        this.g = a((w0) this.g);
        this.h = a((w0) this.h);
    }

    public Paint e() {
        if (!hp.s1(h10.t0).D3()) {
            return (Paint) this.c;
        }
        if (((Paint) this.d) == null) {
            this.d = new Paint(1);
        }
        ((Paint) this.d).setColor(k6.x0(null, k6.Ci, false));
        return (Paint) this.d;
    }

    public void f(float f10, float f11, int i3, int i10) {
        ((x0) this.b).d(0, f10, 0, i3, f11, i10);
    }

    public e() {
        x0 x0Var = new x0(k6.zk, k6.Ak, k6.Bk, k6.Ck, null);
        this.b = x0Var;
        x0 x0Var2 = new x0(k6.Tk, k6.Uk, -1, -1, null);
        this.c = x0Var.f;
        this.f = t0.b.getDrawable(R.drawable.msg_premium_liststar).mutate();
        this.g = c(t0.b.getDrawable(R.drawable.msg_settings_premium), x0Var);
        this.i = c(t0.b.getDrawable(R.drawable.msg_settings_premium), x0Var2);
        this.h = c(t0.b.getDrawable(R.drawable.msg_premium_normal), x0Var);
        this.e = t0.b.getDrawable(R.drawable.msg_premium_liststar).mutate();
        x0Var.a();
        b();
    }
}
