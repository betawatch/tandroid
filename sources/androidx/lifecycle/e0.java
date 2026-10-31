package androidx.lifecycle;

import android.os.Handler;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class e0 implements t {
    public static final e0 r = new e0();
    public int a;
    public int b;
    public Handler e;
    public boolean c = true;
    public boolean d = true;
    public final v f = new v(this);
    public final a3.d h = new a3.d(this, 17);
    public final za.c n = new za.c(this, 5);

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
