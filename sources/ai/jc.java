package ai;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class jc extends sg.w1 {
    public Paint[] n;
    public final /* synthetic */ int r;
    public final /* synthetic */ int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jc(Context context, int i10, int i11) {
        super(context);
        this.r = i10;
        this.s = i11;
        c();
    }

    @Override // sg.w1
    public final void a() {
        int f7;
        float f10;
        int i10;
        int i11;
        sg.v1 v1Var = new sg.v1(this.r);
        this.a = v1Var;
        v1Var.O = 105;
        int i12 = 0;
        v1Var.M = false;
        v1Var.G = false;
        v1Var.K = true;
        v1Var.H = true;
        v1Var.J = false;
        v1Var.m = true;
        v1Var.h = true;
        int i13 = this.s;
        if (i13 == 1) {
            v1Var.k = AndroidUtilities.dp(24.0f);
        }
        this.n = new Paint[i13 == 2 ? 40 : 20];
        while (true) {
            Paint[] paintArr = this.n;
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
                f7 = i0.b.f(f10, i10, i11);
            } else {
                f7 = i0.b.f(i12 / (this.n.length - 1), -371690, -14281);
            }
            this.n[i12].setColorFilter(new PorterDuffColorFilter(f7, PorterDuff.Mode.SRC_IN));
            i12++;
        }
        sg.v1 v1Var2 = this.a;
        v1Var2.l = new ic(this, 0);
        v1Var2.r = 17;
        v1Var2.s = 18;
        v1Var2.t = 19;
        if (i13 == 2) {
            v1Var2.N = true;
            v1Var2.r = 9;
            v1Var2.s = 11;
            v1Var2.t = 13;
            v1Var2.o = 1.6f;
            v1Var2.x = 1400L;
            v1Var2.y = 1600;
            v1Var2.L = true;
        }
        v1Var2.Q = org.telegram.ui.ActionBar.h6.G6;
        v1Var2.c();
    }

    @Override // sg.w1
    public final int getStarsRectWidth() {
        return getMeasuredWidth();
    }
}
