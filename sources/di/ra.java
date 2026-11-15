package di;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.ns;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class ra extends ug.s1 {
    public final /* synthetic */ int r;
    public Paint[] s;
    public final /* synthetic */ int w;
    public final /* synthetic */ int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ra(Context context, int i7, int i10, int i11) {
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

    @Override // ug.s1
    public final void a() {
        int f10;
        float f11;
        int i7;
        int i10;
        switch (this.r) {
            case 0:
                ug.r1 r1Var = new ug.r1(this.w);
                this.a = r1Var;
                r1Var.O = ns.q1;
                int i11 = 0;
                r1Var.M = false;
                r1Var.G = false;
                r1Var.K = true;
                r1Var.H = true;
                r1Var.J = false;
                r1Var.m = true;
                r1Var.h = true;
                int i12 = this.x;
                if (i12 == 1) {
                    r1Var.k = org.telegram.messenger.g0.L(24.0f);
                }
                this.s = new Paint[i12 == 2 ? 40 : 20];
                while (true) {
                    Paint[] paintArr = this.s;
                    if (i11 >= paintArr.length) {
                        ug.r1 r1Var2 = this.a;
                        r1Var2.l = new qa(this, 0);
                        r1Var2.r = 17;
                        r1Var2.s = 18;
                        r1Var2.t = 19;
                        if (i12 == 2) {
                            r1Var2.N = true;
                            r1Var2.r = 9;
                            r1Var2.s = 11;
                            r1Var2.t = 13;
                            r1Var2.o = 1.6f;
                            r1Var2.x = 1400L;
                            r1Var2.y = 1600;
                            r1Var2.L = true;
                        }
                        r1Var2.Q = org.telegram.ui.ActionBar.j6.G6;
                        r1Var2.c();
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
                ug.r1 r1Var3 = new ug.r1(this.w);
                this.a = r1Var3;
                r1Var3.O = ns.r1;
                int i13 = 0;
                r1Var3.M = false;
                r1Var3.G = false;
                r1Var3.K = true;
                r1Var3.H = true;
                r1Var3.J = false;
                r1Var3.m = true;
                r1Var3.h = true;
                if (this.x == 1) {
                    r1Var3.k = org.telegram.messenger.g0.L(24.0f);
                }
                this.s = new Paint[20];
                while (true) {
                    Paint[] paintArr2 = this.s;
                    if (i13 >= paintArr2.length) {
                        ug.r1 r1Var4 = this.a;
                        r1Var4.l = new qa(this, 2);
                        r1Var4.r = 17;
                        r1Var4.s = 18;
                        r1Var4.t = 19;
                        r1Var4.Q = org.telegram.ui.ActionBar.j6.G6;
                        r1Var4.c();
                        break;
                    } else {
                        paintArr2[i13] = new Paint(1);
                        this.s[i13].setColorFilter(new PorterDuffColorFilter(i0.a.f(i13 / (this.s.length - 1), -13729319, -14238726), PorterDuff.Mode.SRC_IN));
                        i13++;
                    }
                }
        }
    }

    @Override // ug.s1
    public final int getStarsRectWidth() {
        switch (this.r) {
        }
        return getMeasuredWidth();
    }
}
