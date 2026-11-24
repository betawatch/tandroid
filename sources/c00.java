// default package

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class c00 {
    public final qbb a;
    public final Handler b;
    public i64 c;
    public nz d;
    public byte f;
    public f00 h;
    public float g = 1.0f;
    public byte e = 0;

    public c00(Context context, Looper looper, i64 i64Var) {
        this.a = vue.a(new a00(context, (byte) 0));
        this.c = i64Var;
        this.b = new Handler(looper);
    }

    public final void a() {
        byte b = this.e;
        if (b == 1 || b == 0 || this.h == null) {
            return;
        }
        i00.a((AudioManager) this.a.get(), this.h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(int i) {
        if (this.e != i) {
            this.e = i;
            float f = i == 4 ? 0.2f : 1.0f;
            if (this.g != f) {
                this.g = f;
                i64 i64Var = this.c;
                if (i64Var != null) {
                    i64Var.h.h(34);
                }
            }
        }
    }

    public final int c(int i, boolean z) {
        byte b;
        d00 d00Var;
        byte b2 = 0;
        if (i == 1 || (b = this.f) != 1) {
            a();
            b(0);
            return 1;
        }
        byte b3 = this.e;
        if (z) {
            if (b3 != 2) {
                f00 f00Var = this.h;
                if (f00Var == null) {
                    if (f00Var == null) {
                        d00Var = new d00();
                        nz nzVar = nz.i;
                        d00Var.a = b;
                    } else {
                        d00 d00Var2 = new d00();
                        d00Var2.a = f00Var.a;
                        d00Var = d00Var2;
                    }
                    nz nzVar2 = this.d;
                    boolean z2 = nzVar2 != null && nzVar2.a == 1;
                    nzVar2.getClass();
                    this.h = new f00(d00Var.a, new zz(this, b2), this.b, nzVar2, z2, true);
                }
                int i2 = i00.i((AudioManager) this.a.get(), this.h);
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
