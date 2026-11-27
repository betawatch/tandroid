// default package

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class d00 {
    public final mfb a;
    public final Handler b;
    public c74 c;
    public oz d;
    public byte f;
    public g00 h;
    public float g = 1.0f;
    public byte e = 0;

    public d00(Context context, Looper looper, c74 c74Var) {
        this.a = nze.a(new b00(context, (byte) 0));
        this.c = c74Var;
        this.b = new Handler(looper);
    }

    public final void a() {
        byte b = this.e;
        if (b == 1 || b == 0 || this.h == null) {
            return;
        }
        j00.a((AudioManager) this.a.get(), this.h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(int i) {
        if (this.e != i) {
            this.e = i;
            float f = i == 4 ? 0.2f : 1.0f;
            if (this.g != f) {
                this.g = f;
                c74 c74Var = this.c;
                if (c74Var != null) {
                    c74Var.h.h(34);
                }
            }
        }
    }

    public final int c(int i, boolean z) {
        byte b;
        e00 e00Var;
        byte b2 = 0;
        if (i == 1 || (b = this.f) != 1) {
            a();
            b(0);
            return 1;
        }
        byte b3 = this.e;
        if (z) {
            if (b3 != 2) {
                g00 g00Var = this.h;
                if (g00Var == null) {
                    if (g00Var == null) {
                        e00Var = new e00();
                        oz ozVar = oz.i;
                        e00Var.a = b;
                    } else {
                        e00 e00Var2 = new e00();
                        e00Var2.a = g00Var.a;
                        e00Var = e00Var2;
                    }
                    oz ozVar2 = this.d;
                    boolean z2 = ozVar2 != null && ozVar2.a == 1;
                    ozVar2.getClass();
                    this.h = new g00(e00Var.a, new a00(this, b2), this.b, ozVar2, z2, true);
                }
                int i2 = j00.i((AudioManager) this.a.get(), this.h);
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
