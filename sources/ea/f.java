package ea;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import kg.j1;
import kg.k1;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.d20;
import org.telegram.messenger.vp;
import org.telegram.messenger.w0;
import org.telegram.ui.ActionBar.t6;
import x9.v;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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

    public f(String str, String str2, String str3, String str4, v vVar, String str5, String str6, String str7, int i10) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.i = vVar;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.a = i10;
    }

    public static j1 c(Drawable drawable, k1 k1Var) {
        if (drawable == null) {
            return null;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int minimumHeight = drawable.getMinimumHeight();
        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, minimumHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, intrinsicWidth, minimumHeight);
        drawable.draw(canvas);
        k1Var.f.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        k1Var.d(0, -intrinsicWidth, 0, intrinsicWidth, 0.0f, minimumHeight);
        canvas.drawRect(0.0f, 0.0f, intrinsicWidth, minimumHeight, k1Var.f);
        k1Var.f.setXfermode(null);
        int[] iArr = k1Var.l;
        j1 j1Var = new j1(w0.b.getResources(), createBitmap);
        j1Var.b = drawable;
        int[] iArr2 = new int[iArr.length];
        j1Var.a = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return j1Var;
    }

    public static f d() {
        if (j == null) {
            j = new f();
        }
        return j;
    }

    public j1 a(j1 j1Var) {
        k1 k1Var = (k1) this.b;
        int[] iArr = k1Var.l;
        int i10 = iArr[0];
        int[] iArr2 = j1Var.a;
        return (i10 == iArr2[0] && iArr[1] == iArr2[1] && iArr[2] == iArr2[2] && iArr[3] == iArr2[3]) ? j1Var : c(j1Var.b, k1Var);
    }

    public void b() {
        int i10 = t6.z9;
        if (t6.x0(null, i10, false) != this.a) {
            this.a = t6.x0(null, i10, false);
            ((Drawable) this.f).setColorFilter(new PorterDuffColorFilter(this.a, PorterDuff.Mode.MULTIPLY));
        }
        this.g = a((j1) this.g);
        this.h = a((j1) this.h);
    }

    public Paint e() {
        if (!vp.r1(d20.s0).A3()) {
            return (Paint) this.c;
        }
        if (((Paint) this.d) == null) {
            this.d = new Paint(1);
        }
        ((Paint) this.d).setColor(t6.x0(null, t6.Ci, false));
        return (Paint) this.d;
    }

    public void f(float f7, float f10, int i10, int i11) {
        ((k1) this.b).d(0, f7, 0, i10, f10, i11);
    }

    public f() {
        k1 k1Var = new k1(t6.zk, t6.Ak, t6.Bk, t6.Ck, null);
        this.b = k1Var;
        k1 k1Var2 = new k1(t6.Tk, t6.Uk, -1, -1, null);
        this.c = k1Var.f;
        this.f = w0.b.getDrawable(R.drawable.msg_premium_liststar).mutate();
        this.g = c(w0.b.getDrawable(R.drawable.msg_settings_premium), k1Var);
        this.i = c(w0.b.getDrawable(R.drawable.msg_settings_premium), k1Var2);
        this.h = c(w0.b.getDrawable(R.drawable.msg_premium_normal), k1Var);
        this.e = w0.b.getDrawable(R.drawable.msg_premium_liststar).mutate();
        k1Var.a();
        b();
    }
}
