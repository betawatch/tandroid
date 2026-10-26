package bi;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class ec extends tg.x1 {
    public Paint[] r;
    public final /* synthetic */ int s;
    public final /* synthetic */ int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ec(Context context, int i10, int i11) {
        super(context);
        this.s = i10;
        this.v = i11;
        c();
    }

    @Override // tg.x1
    public final void a() {
        int f7;
        float f10;
        int i10;
        int i11;
        tg.w1 w1Var = new tg.w1(this.s);
        this.a = w1Var;
        w1Var.O = 105;
        int i12 = 0;
        w1Var.M = false;
        w1Var.G = false;
        w1Var.K = true;
        w1Var.H = true;
        w1Var.J = false;
        w1Var.m = true;
        w1Var.h = true;
        int i13 = this.v;
        if (i13 == 1) {
            w1Var.k = AndroidUtilities.dp(24.0f);
        }
        this.r = new Paint[i13 == 2 ? 40 : 20];
        while (true) {
            Paint[] paintArr = this.r;
            if (i12 >= paintArr.length) {
                break;
            }
            paintArr[i12] = new Paint(1);
            if (i13 == 2) {
                if (i12 >= 20) {
                    f10 = (i12 - 20) / 19.0f;
                    i10 = -1005568;
                    i11 = -2062336;
                } else if (i12 % 5 == 0) {
                    f7 = -2340;
                } else {
                    f10 = i12 / 19.0f;
                    i10 = -10645;
                    i11 = -20165;
                }
                f7 = i0.a.f(f10, i10, i11);
            } else {
                f7 = i0.a.f(i12 / (this.r.length - 1), -371690, -14281);
            }
            this.r[i12].setColorFilter(new PorterDuffColorFilter(f7, PorterDuff.Mode.SRC_IN));
            i12++;
        }
        tg.w1 w1Var2 = this.a;
        w1Var2.l = new dc(this, 0);
        w1Var2.r = 17;
        w1Var2.s = 18;
        w1Var2.t = 19;
        if (i13 == 2) {
            w1Var2.N = true;
            w1Var2.r = 9;
            w1Var2.s = 11;
            w1Var2.t = 13;
            w1Var2.o = 1.6f;
            w1Var2.x = 1400L;
            w1Var2.y = 1600;
            w1Var2.L = true;
        }
        w1Var2.Q = org.telegram.ui.ActionBar.y6.G6;
        w1Var2.c();
    }

    @Override // tg.x1
    public final int getStarsRectWidth() {
        return getMeasuredWidth();
    }
}
