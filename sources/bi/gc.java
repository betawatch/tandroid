package bi;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class gc extends ug.q1 {
    public final /* synthetic */ int r;
    public Paint[] s;
    public final /* synthetic */ int w;
    public final /* synthetic */ int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gc(Context context, int i7, int i10, int i11) {
        super(context);
        this.r = i11;
        switch (i11) {
            case 1:
                this.w = i7;
                this.x = i10;
                super(context);
                c();
                break;
            default:
                this.w = i7;
                this.x = i10;
                c();
                break;
        }
    }

    @Override // ug.q1
    public final void a() {
        int f10;
        float f11;
        int i7;
        int i10;
        switch (this.r) {
            case 0:
                ug.p1 p1Var = new ug.p1(this.w);
                this.a = p1Var;
                p1Var.O = qs.q1;
                int i11 = 0;
                p1Var.M = false;
                p1Var.G = false;
                p1Var.K = true;
                p1Var.H = true;
                p1Var.J = false;
                p1Var.m = true;
                p1Var.h = true;
                int i12 = this.x;
                if (i12 == 1) {
                    p1Var.k = org.telegram.messenger.g0.L(24.0f);
                }
                this.s = new Paint[i12 == 2 ? 40 : 20];
                while (true) {
                    Paint[] paintArr = this.s;
                    if (i11 >= paintArr.length) {
                        ug.p1 p1Var2 = this.a;
                        p1Var2.l = new fc(this, 0);
                        p1Var2.r = 17;
                        p1Var2.s = 18;
                        p1Var2.t = 19;
                        if (i12 == 2) {
                            p1Var2.N = true;
                            p1Var2.r = 9;
                            p1Var2.s = 11;
                            p1Var2.t = 13;
                            p1Var2.o = 1.6f;
                            p1Var2.x = 1400L;
                            p1Var2.y = 1600;
                            p1Var2.L = true;
                        }
                        p1Var2.Q = org.telegram.ui.ActionBar.k6.G6;
                        p1Var2.c();
                        break;
                    } else {
                        paintArr[i11] = new Paint(1);
                        if (i12 == 2) {
                            if (i11 >= 20) {
                                f11 = (i11 - 20) / 19.0f;
                                i7 = -1005568;
                                i10 = -2062336;
                            } else if (i11 % 5 == 0) {
                                f10 = -2340;
                            } else {
                                f11 = i11 / 19.0f;
                                i7 = -10645;
                                i10 = -20165;
                            }
                            f10 = i0.a.f(f11, i7, i10);
                        } else {
                            f10 = i0.a.f(i11 / (this.s.length - 1), -371690, -14281);
                        }
                        this.s[i11].setColorFilter(new PorterDuffColorFilter(f10, PorterDuff.Mode.SRC_IN));
                        i11++;
                    }
                }
            default:
                ug.p1 p1Var3 = new ug.p1(this.w);
                this.a = p1Var3;
                p1Var3.O = qs.r1;
                int i13 = 0;
                p1Var3.M = false;
                p1Var3.G = false;
                p1Var3.K = true;
                p1Var3.H = true;
                p1Var3.J = false;
                p1Var3.m = true;
                p1Var3.h = true;
                if (this.x == 1) {
                    p1Var3.k = org.telegram.messenger.g0.L(24.0f);
                }
                this.s = new Paint[20];
                while (true) {
                    Paint[] paintArr2 = this.s;
                    if (i13 >= paintArr2.length) {
                        ug.p1 p1Var4 = this.a;
                        p1Var4.l = new fc(this, 2);
                        p1Var4.r = 17;
                        p1Var4.s = 18;
                        p1Var4.t = 19;
                        p1Var4.Q = org.telegram.ui.ActionBar.k6.G6;
                        p1Var4.c();
                        break;
                    } else {
                        paintArr2[i13] = new Paint(1);
                        this.s[i13].setColorFilter(new PorterDuffColorFilter(i0.a.f(i13 / (this.s.length - 1), -13729319, -14238726), PorterDuff.Mode.SRC_IN));
                        i13++;
                    }
                }
        }
    }

    @Override // ug.q1
    public final int getStarsRectWidth() {
        switch (this.r) {
        }
        return getMeasuredWidth();
    }
}
