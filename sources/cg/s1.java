package cg;

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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class s1 {
    public static s1 j;
    public final r1 a;
    public final Paint b;
    public Paint c;
    public final Drawable d;
    public final Drawable e;
    public q1 f;
    public q1 g;
    public final q1 h;
    public int i;

    public s1() {
        r1 r1Var = new r1(g6.Lj, g6.Mj, g6.Nj, g6.Oj, null);
        this.a = r1Var;
        r1 r1Var2 = new r1(g6.fk, g6.gk, -1, -1, null);
        this.b = r1Var.f;
        this.e = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_premium_liststar).mutate();
        this.f = c(ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_settings_premium), r1Var);
        this.h = c(ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_settings_premium), r1Var2);
        this.g = c(ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_premium_normal), r1Var);
        this.d = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_premium_liststar).mutate();
        r1Var.a();
        b();
    }

    public static q1 c(Drawable drawable, r1 r1Var) {
        if (drawable == null) {
            return null;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int minimumHeight = drawable.getMinimumHeight();
        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, minimumHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, intrinsicWidth, minimumHeight);
        drawable.draw(canvas);
        r1Var.f.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        r1Var.d(0, -intrinsicWidth, 0, intrinsicWidth, 0.0f, minimumHeight);
        canvas.drawRect(0.0f, 0.0f, intrinsicWidth, minimumHeight, r1Var.f);
        r1Var.f.setXfermode(null);
        int[] iArr = r1Var.l;
        q1 q1Var = new q1(ApplicationLoader.applicationContext.getResources(), createBitmap);
        q1Var.b = drawable;
        int[] iArr2 = new int[iArr.length];
        q1Var.a = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return q1Var;
    }

    public static s1 d() {
        if (j == null) {
            j = new s1();
        }
        return j;
    }

    public final q1 a(q1 q1Var) {
        r1 r1Var = this.a;
        int[] iArr = r1Var.l;
        int i10 = iArr[0];
        int[] iArr2 = q1Var.a;
        return (i10 == iArr2[0] && iArr[1] == iArr2[1] && iArr[2] == iArr2[2] && iArr[3] == iArr2[3]) ? q1Var : c(q1Var.b, r1Var);
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

    public final void f(float f9, float f10, int i10, int i11) {
        this.a.d(0, f9, 0, i10, f10, i11);
    }
}
