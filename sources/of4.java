// default package

import android.graphics.Point;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class of4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rf4 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ of4(rf4 rf4Var, int i, int i2, byte b) {
        this.a = b;
        this.b = rf4Var;
        this.c = i;
        this.d = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        switch (this.a) {
            case 0:
                rf4 rf4Var = this.b;
                int i2 = this.c;
                int i3 = this.d;
                if (rf4Var.X != i2 || rf4Var.Y != i3) {
                    rf4Var.X = i2;
                    rf4Var.Y = i3;
                    int o = xea.o();
                    int i4 = 1920;
                    if (o != 1) {
                        if (o != 2) {
                            i4 = 720;
                        } else {
                            Point point = hl.q;
                            i4 = Math.min(1920, Math.max(point.x, point.y));
                        }
                    }
                    if (xea.o() == 0 && ((i = rf4Var.X) > 1280 || rf4Var.Y > 1280)) {
                        rf4Var.X = i / 2;
                        rf4Var.Y /= 2;
                    }
                    int i5 = rf4Var.X;
                    if (i5 > i4 || rf4Var.Y > i4) {
                        int i6 = rf4Var.Y;
                        if (i5 > i6) {
                            rf4Var.Y = (int) (i6 / (i4 / i5));
                            rf4Var.X = i4;
                        } else {
                            rf4Var.X = (int) (i5 / (i4 / i6));
                            rf4Var.Y = i4;
                        }
                    }
                    rf4Var.a0 = false;
                    rf4Var.d();
                    rf4Var.e0.run();
                    break;
                }
                break;
            case 1:
                rf4 rf4Var2 = this.b;
                int i7 = this.c;
                int i8 = this.d;
                rf4Var2.n = i7;
                rf4Var2.r = i8;
                break;
            default:
                rf4 rf4Var3 = this.b;
                int i9 = this.c;
                int i10 = this.d;
                yl0 yl0Var = rf4Var3.J;
                yl0Var.l = i9;
                yl0Var.m = i10;
                break;
        }
    }
}
