package ci;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class bb extends vg.t1 {
    public final /* synthetic */ int r;
    public Paint[] s;
    public final /* synthetic */ int w;
    public final /* synthetic */ int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bb(Context context, int i3, int i10, int i11) {
        super(context);
        this.r = i11;
        switch (i11) {
            case 1:
                this.w = i3;
                this.x = i10;
                super(context);
                c();
                break;
            default:
                this.w = i3;
                this.x = i10;
                c();
                break;
        }
    }

    @Override // vg.t1
    public final void a() {
        int f10;
        float f11;
        int i3;
        int i10;
        switch (this.r) {
            case 0:
                vg.s1 s1Var = new vg.s1(this.w);
                this.a = s1Var;
                s1Var.O = hs.q1;
                int i11 = 0;
                s1Var.M = false;
                s1Var.G = false;
                s1Var.K = true;
                s1Var.H = true;
                s1Var.J = false;
                s1Var.m = true;
                s1Var.h = true;
                int i12 = this.x;
                if (i12 == 1) {
                    s1Var.k = org.telegram.messenger.g0.L(24.0f);
                }
                this.s = new Paint[i12 == 2 ? 40 : 20];
                while (true) {
                    Paint[] paintArr = this.s;
                    if (i11 >= paintArr.length) {
                        vg.s1 s1Var2 = this.a;
                        s1Var2.l = new ab(this, 0);
                        s1Var2.r = 17;
                        s1Var2.s = 18;
                        s1Var2.t = 19;
                        if (i12 == 2) {
                            s1Var2.N = true;
                            s1Var2.r = 9;
                            s1Var2.s = 11;
                            s1Var2.t = 13;
                            s1Var2.o = 1.6f;
                            s1Var2.x = 1400L;
                            s1Var2.y = 1600;
                            s1Var2.L = true;
                        }
                        s1Var2.Q = org.telegram.ui.ActionBar.k6.G6;
                        s1Var2.c();
                        break;
                    } else {
                        paintArr[i11] = new Paint(1);
                        if (i12 == 2) {
                            if (i11 >= 20) {
                                f11 = (i11 - 20) / 19.0f;
                                i3 = -1005568;
                                i10 = -2062336;
                            } else if (i11 % 5 == 0) {
                                f10 = -2340;
                            } else {
                                f11 = i11 / 19.0f;
                                i3 = -10645;
                                i10 = -20165;
                            }
                            f10 = i0.a.f(f11, i3, i10);
                        } else {
                            f10 = i0.a.f(i11 / (this.s.length - 1), -371690, -14281);
                        }
                        this.s[i11].setColorFilter(new PorterDuffColorFilter(f10, PorterDuff.Mode.SRC_IN));
                        i11++;
                    }
                }
            default:
                vg.s1 s1Var3 = new vg.s1(this.w);
                this.a = s1Var3;
                s1Var3.O = hs.r1;
                int i13 = 0;
                s1Var3.M = false;
                s1Var3.G = false;
                s1Var3.K = true;
                s1Var3.H = true;
                s1Var3.J = false;
                s1Var3.m = true;
                s1Var3.h = true;
                if (this.x == 1) {
                    s1Var3.k = org.telegram.messenger.g0.L(24.0f);
                }
                this.s = new Paint[20];
                while (true) {
                    Paint[] paintArr2 = this.s;
                    if (i13 >= paintArr2.length) {
                        vg.s1 s1Var4 = this.a;
                        s1Var4.l = new ab(this, 2);
                        s1Var4.r = 17;
                        s1Var4.s = 18;
                        s1Var4.t = 19;
                        s1Var4.Q = org.telegram.ui.ActionBar.k6.G6;
                        s1Var4.c();
                        break;
                    } else {
                        paintArr2[i13] = new Paint(1);
                        this.s[i13].setColorFilter(new PorterDuffColorFilter(i0.a.f(i13 / (this.s.length - 1), -13729319, -14238726), PorterDuff.Mode.SRC_IN));
                        i13++;
                    }
                }
        }
    }

    @Override // vg.t1
    public final int getStarsRectWidth() {
        switch (this.r) {
        }
        return getMeasuredWidth();
    }
}
