package androidx.lifecycle;

import android.os.Handler;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes.dex */
public final class e0 implements t {
    public static final e0 r = new e0();
    public int a;
    public int b;
    public Handler e;
    public boolean c = true;
    public boolean d = true;
    public final v f = new v(this);
    public final androidx.fragment.app.a0 h = new androidx.fragment.app.a0(this, 1);
    public final xa.c n = new xa.c(this, 5);

    public final void a() {
        int i10 = this.b + 1;
        this.b = i10;
        if (i10 == 1) {
            if (this.c) {
                this.f.e(m.ON_RESUME);
                this.c = false;
            } else {
                Handler handler = this.e;
                kotlin.jvm.internal.i.b(handler);
                handler.removeCallbacks(this.h);
            }
        }
    }

    @Override // androidx.lifecycle.t
    public final o m() {
        return this.f;
    }
}
