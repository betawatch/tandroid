package ai;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class kc extends sg.x1 {
    public Paint[] n;
    public final /* synthetic */ int r;
    public final /* synthetic */ int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kc(Context context, int i10, int i11) {
        super(context);
        this.r = i10;
        this.s = i11;
        c();
    }

    @Override // sg.x1
    public final void a() {
        int f7;
        float f10;
        int i10;
        int i11;
        sg.w1 w1Var = new sg.w1(this.r);
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
        int i13 = this.s;
        if (i13 == 1) {
            w1Var.k = AndroidUtilities.dp(24.0f);
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
                f7 = i0.a.f(f10, i10, i11);
            } else {
                f7 = i0.a.f(i12 / (this.n.length - 1), -371690, -14281);
            }
            this.n[i12].setColorFilter(new PorterDuffColorFilter(f7, PorterDuff.Mode.SRC_IN));
            i12++;
        }
        sg.w1 w1Var2 = this.a;
        w1Var2.l = new jc(this, 0);
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
        w1Var2.Q = org.telegram.ui.ActionBar.h6.G6;
        w1Var2.c();
    }

    @Override // sg.x1
    public final int getStarsRectWidth() {
        return getMeasuredWidth();
    }
}
