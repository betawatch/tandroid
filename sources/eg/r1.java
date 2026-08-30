package eg;

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
import org.telegram.ui.ActionBar.j6;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class r1 {
    public static r1 j;
    public final q1 a;
    public final Paint b;
    public Paint c;
    public final Drawable d;
    public final Drawable e;
    public p1 f;
    public p1 g;
    public final p1 h;
    public int i;

    public r1() {
        q1 q1Var = new q1(j6.Lj, j6.Mj, j6.Nj, j6.Oj, null);
        this.a = q1Var;
        q1 q1Var2 = new q1(j6.fk, j6.gk, -1, -1, null);
        this.b = q1Var.f;
        this.e = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_premium_liststar).mutate();
        this.f = c(ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_settings_premium), q1Var);
        this.h = c(ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_settings_premium), q1Var2);
        this.g = c(ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_premium_normal), q1Var);
        this.d = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_premium_liststar).mutate();
        q1Var.a();
        b();
    }

    public static p1 c(Drawable drawable, q1 q1Var) {
        if (drawable == null) {
            return null;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int minimumHeight = drawable.getMinimumHeight();
        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, minimumHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, intrinsicWidth, minimumHeight);
        drawable.draw(canvas);
        q1Var.f.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        q1Var.d(0, -intrinsicWidth, 0, intrinsicWidth, 0.0f, minimumHeight);
        canvas.drawRect(0.0f, 0.0f, intrinsicWidth, minimumHeight, q1Var.f);
        q1Var.f.setXfermode(null);
        int[] iArr = q1Var.l;
        p1 p1Var = new p1(ApplicationLoader.applicationContext.getResources(), createBitmap);
        p1Var.b = drawable;
        int[] iArr2 = new int[iArr.length];
        p1Var.a = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return p1Var;
    }

    public static r1 d() {
        if (j == null) {
            j = new r1();
        }
        return j;
    }

    public final p1 a(p1 p1Var) {
        q1 q1Var = this.a;
        int[] iArr = q1Var.l;
        int i10 = iArr[0];
        int[] iArr2 = p1Var.a;
        return (i10 == iArr2[0] && iArr[1] == iArr2[1] && iArr[2] == iArr2[2] && iArr[3] == iArr2[3]) ? p1Var : c(p1Var.b, q1Var);
    }

    public final void b() {
        int i10 = j6.z9;
        if (j6.w0(null, i10, false) != this.i) {
            this.i = j6.w0(null, i10, false);
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
        this.c.setColor(j6.w0(null, j6.Oh, false));
        return this.c;
    }

    public final void f(float f10, float f11, int i10, int i11) {
        this.a.d(0, f10, 0, i10, f11, i11);
    }
}
