package lh;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import dg.o;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import zf.v1;
import zf.w1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class c extends w1 {
    public Paint[] n;
    public final /* synthetic */ int r;
    public final /* synthetic */ int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, int i9, int i10) {
        super(context);
        this.r = i9;
        this.s = i10;
        b();
    }

    @Override // zf.w1
    public final void a() {
        v1 v1Var = new v1(this.r);
        this.a = v1Var;
        v1Var.N = 106;
        int i9 = 0;
        v1Var.M = false;
        v1Var.G = false;
        v1Var.K = true;
        v1Var.H = true;
        v1Var.J = false;
        v1Var.m = true;
        v1Var.h = true;
        if (this.s == 1) {
            v1Var.k = AndroidUtilities.dp(24.0f);
        }
        this.n = new Paint[20];
        while (true) {
            Paint[] paintArr = this.n;
            if (i9 >= paintArr.length) {
                v1 v1Var2 = this.a;
                v1Var2.l = new o(this, 3);
                v1Var2.r = 17;
                v1Var2.s = 18;
                v1Var2.t = 19;
                v1Var2.P = f6.G6;
                v1Var2.c();
                return;
            }
            paintArr[i9] = new Paint(1);
            this.n[i9].setColorFilter(new PorterDuffColorFilter(i0.a.d(i9 / (this.n.length - 1), -13729319, -14238726), PorterDuff.Mode.SRC_IN));
            i9++;
        }
    }

    @Override // zf.w1
    public final int getStarsRectWidth() {
        return getMeasuredWidth();
    }
}
