package di;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.ks;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class ua extends ug.u1 {
    public final /* synthetic */ int r;
    public Paint[] s;
    public final /* synthetic */ int w;
    public final /* synthetic */ int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ua(Context context, int i7, int i10, int i11) {
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

    @Override // ug.u1
    public final void a() {
        int f10;
        float f11;
        int i7;
        int i10;
        switch (this.r) {
            case 0:
                ug.t1 t1Var = new ug.t1(this.w);
                this.a = t1Var;
                t1Var.O = ks.q1;
                int i11 = 0;
                t1Var.M = false;
                t1Var.G = false;
                t1Var.K = true;
                t1Var.H = true;
                t1Var.J = false;
                t1Var.m = true;
                t1Var.h = true;
                int i12 = this.x;
                if (i12 == 1) {
                    t1Var.k = org.telegram.messenger.g0.L(24.0f);
                }
                this.s = new Paint[i12 == 2 ? 40 : 20];
                while (true) {
                    Paint[] paintArr = this.s;
                    if (i11 >= paintArr.length) {
                        ug.t1 t1Var2 = this.a;
                        t1Var2.l = new ta(this, 0);
                        t1Var2.r = 17;
                        t1Var2.s = 18;
                        t1Var2.t = 19;
                        if (i12 == 2) {
                            t1Var2.N = true;
                            t1Var2.r = 9;
                            t1Var2.s = 11;
                            t1Var2.t = 13;
                            t1Var2.o = 1.6f;
                            t1Var2.x = 1400L;
                            t1Var2.y = 1600;
                            t1Var2.L = true;
                        }
                        t1Var2.Q = org.telegram.ui.ActionBar.n6.G6;
                        t1Var2.c();
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
                ug.t1 t1Var3 = new ug.t1(this.w);
                this.a = t1Var3;
                t1Var3.O = ks.r1;
                int i13 = 0;
                t1Var3.M = false;
                t1Var3.G = false;
                t1Var3.K = true;
                t1Var3.H = true;
                t1Var3.J = false;
                t1Var3.m = true;
                t1Var3.h = true;
                if (this.x == 1) {
                    t1Var3.k = org.telegram.messenger.g0.L(24.0f);
                }
                this.s = new Paint[20];
                while (true) {
                    Paint[] paintArr2 = this.s;
                    if (i13 >= paintArr2.length) {
                        ug.t1 t1Var4 = this.a;
                        t1Var4.l = new ta(this, 2);
                        t1Var4.r = 17;
                        t1Var4.s = 18;
                        t1Var4.t = 19;
                        t1Var4.Q = org.telegram.ui.ActionBar.n6.G6;
                        t1Var4.c();
                        break;
                    } else {
                        paintArr2[i13] = new Paint(1);
                        this.s[i13].setColorFilter(new PorterDuffColorFilter(i0.a.f(i13 / (this.s.length - 1), -13729319, -14238726), PorterDuff.Mode.SRC_IN));
                        i13++;
                    }
                }
        }
    }

    @Override // ug.u1
    public final int getStarsRectWidth() {
        switch (this.r) {
        }
        return getMeasuredWidth();
    }
}
