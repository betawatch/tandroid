package fg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.k6;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class q1 {
    public static q1 j;
    public final p1 a;
    public final Paint b;
    public Paint c;
    public final Drawable d;
    public final Drawable e;
    public o1 f;
    public o1 g;
    public final o1 h;
    public int i;

    public q1() {
        p1 p1Var = new p1(k6.Lj, k6.Mj, k6.Nj, k6.Oj, null);
        this.a = p1Var;
        p1 p1Var2 = new p1(k6.fk, k6.gk, -1, -1, null);
        this.b = p1Var.f;
        this.e = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_premium_liststar).mutate();
        this.f = c(ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_settings_premium), p1Var);
        this.h = c(ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_settings_premium), p1Var2);
        this.g = c(ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_premium_normal), p1Var);
        this.d = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_premium_liststar).mutate();
        p1Var.a();
        b();
    }

    public static o1 c(Drawable drawable, p1 p1Var) {
        if (drawable == null) {
            return null;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int minimumHeight = drawable.getMinimumHeight();
        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, minimumHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, intrinsicWidth, minimumHeight);
        drawable.draw(canvas);
        p1Var.f.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        p1Var.d(0, -intrinsicWidth, 0, intrinsicWidth, 0.0f, minimumHeight);
        canvas.drawRect(0.0f, 0.0f, intrinsicWidth, minimumHeight, p1Var.f);
        p1Var.f.setXfermode(null);
        int[] iArr = p1Var.l;
        o1 o1Var = new o1(ApplicationLoader.applicationContext.getResources(), createBitmap);
        o1Var.b = drawable;
        int[] iArr2 = new int[iArr.length];
        o1Var.a = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return o1Var;
    }

    public static q1 d() {
        if (j == null) {
            j = new q1();
        }
        return j;
    }

    public final o1 a(o1 o1Var) {
        p1 p1Var = this.a;
        int[] iArr = p1Var.l;
        int i10 = iArr[0];
        int[] iArr2 = o1Var.a;
        return (i10 == iArr2[0] && iArr[1] == iArr2[1] && iArr[2] == iArr2[2] && iArr[3] == iArr2[3]) ? o1Var : c(o1Var.b, p1Var);
    }

    public final void b() {
        int i10 = k6.z9;
        if (k6.w0(null, i10, false) != this.i) {
            this.i = k6.w0(null, i10, false);
            this.e.setColorFilter(new PorterDuffColorFilter(this.i, PorterDuff.Mode.MULTIPLY));
        }
        this.f = a(this.f);
        this.g = a(this.g);
    }

    public final Paint e() {
        if (!MessagesController.getInstance(UserConfig.selectedAccount).premiumFeaturesBlocked()) {
            return this.b;
        }
        if (this.c == null) {
            this.c = new Paint(1);
        }
        this.c.setColor(k6.w0(null, k6.Oh, false));
        return this.c;
    }

    public final void f(float f10, float f11, int i10, int i11) {
        this.a.d(0, f10, 0, i10, f11, i11);
    }
}
