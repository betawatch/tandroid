package ag;

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
import org.telegram.ui.ActionBar.g6;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class j2 {
    public static j2 j;
    public final i2 a;
    public final Paint b;
    public Paint c;
    public final Drawable d;
    public final Drawable e;
    public h2 f;
    public h2 g;
    public final h2 h;
    public int i;

    public j2() {
        i2 i2Var = new i2(g6.Lj, g6.Mj, g6.Nj, g6.Oj, null);
        this.a = i2Var;
        i2 i2Var2 = new i2(g6.fk, g6.gk, -1, -1, null);
        this.b = i2Var.f;
        this.e = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_premium_liststar).mutate();
        this.f = c(ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_settings_premium), i2Var);
        this.h = c(ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_settings_premium), i2Var2);
        this.g = c(ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_premium_normal), i2Var);
        this.d = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_premium_liststar).mutate();
        i2Var.a();
        b();
    }

    public static h2 c(Drawable drawable, i2 i2Var) {
        if (drawable == null) {
            return null;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int minimumHeight = drawable.getMinimumHeight();
        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, minimumHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, intrinsicWidth, minimumHeight);
        drawable.draw(canvas);
        i2Var.f.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        i2Var.d(0, -intrinsicWidth, 0, intrinsicWidth, 0.0f, minimumHeight);
        canvas.drawRect(0.0f, 0.0f, intrinsicWidth, minimumHeight, i2Var.f);
        i2Var.f.setXfermode(null);
        int[] iArr = i2Var.l;
        h2 h2Var = new h2(ApplicationLoader.applicationContext.getResources(), createBitmap);
        h2Var.b = drawable;
        int[] iArr2 = new int[iArr.length];
        h2Var.a = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return h2Var;
    }

    public static j2 d() {
        if (j == null) {
            j = new j2();
        }
        return j;
    }

    public final h2 a(h2 h2Var) {
        i2 i2Var = this.a;
        int[] iArr = i2Var.l;
        int i10 = iArr[0];
        int[] iArr2 = h2Var.a;
        return (i10 == iArr2[0] && iArr[1] == iArr2[1] && iArr[2] == iArr2[2] && iArr[3] == iArr2[3]) ? h2Var : c(h2Var.b, i2Var);
    }

    public final void b() {
        int i10 = g6.z9;
        if (g6.w0(null, i10, false) != this.i) {
            this.i = g6.w0(null, i10, false);
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
        this.c.setColor(g6.w0(null, g6.Oh, false));
        return this.c;
    }

    public final void f(float f10, float f11, int i10, int i11) {
        this.a.d(0, f10, 0, i10, f11, i11);
    }
}
