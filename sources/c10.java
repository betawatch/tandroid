// default package

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class c10 {
    public final sdb a;
    public final Handler b;
    public r74 c;
    public o00 d;
    public byte f;
    public f10 h;
    public float g = 1.0f;
    public byte e = 0;

    public c10(Context context, Looper looper, r74 r74Var) {
        this.a = xwe.a(new a10(context, (byte) 0));
        this.c = r74Var;
        this.b = new Handler(looper);
    }

    public final void a() {
        byte b = this.e;
        if (b == 1 || b == 0 || this.h == null) {
            return;
        }
        i10.a((AudioManager) this.a.get(), this.h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(int i) {
        if (this.e != i) {
            this.e = i;
            float f = i == 4 ? 0.2f : 1.0f;
            if (this.g != f) {
                this.g = f;
                r74 r74Var = this.c;
                if (r74Var != null) {
                    r74Var.h.h(34);
                }
            }
        }
    }

    public final int c(int i, boolean z) {
        byte b;
        d10 d10Var;
        byte b2 = 0;
        if (i == 1 || (b = this.f) != 1) {
            a();
            b(0);
            return 1;
        }
        byte b3 = this.e;
        if (z) {
            if (b3 != 2) {
                f10 f10Var = this.h;
                if (f10Var == null) {
                    if (f10Var == null) {
                        d10Var = new d10();
                        o00 o00Var = o00.i;
                        d10Var.a = b;
                    } else {
                        d10 d10Var2 = new d10();
                        d10Var2.a = f10Var.a;
                        d10Var = d10Var2;
                    }
                    o00 o00Var2 = this.d;
                    boolean z2 = o00Var2 != null && o00Var2.a == 1;
                    o00Var2.getClass();
                    this.h = new f10(d10Var.a, new z00(this, b2), this.b, o00Var2, z2, true);
                }
                int i2 = i10.i((AudioManager) this.a.get(), this.h);
                if (i2 == 1 || i2 == 2) {
                    b(2);
                    return 1;
                }
                b(1);
                return -1;
            }
        } else {
            if (b3 == 1) {
                return -1;
            }
            if (b3 == 3) {
                return 0;
            }
        }
        return 1;
    }
}
