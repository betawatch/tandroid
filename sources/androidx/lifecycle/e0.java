package androidx.lifecycle;

import android.os.Handler;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class e0 implements t {
    public static final e0 r = new e0();
    public int a;
    public int b;
    public Handler e;
    public boolean c = true;
    public boolean d = true;
    public final v f = new v(this);
    public final a3.f h = new a3.f(this, 11);
    public final cb.c n = new cb.c(this, 9);

    public final void a() {
        int i7 = this.b + 1;
        this.b = i7;
        if (i7 == 1) {
            if (this.c) {
                this.f.e(m.ON_RESUME);
                this.c = false;
            } else {
                Handler handler = this.e;
                kotlin.jvm.internal.j.b(handler);
                handler.removeCallbacks(this.h);
            }
        }
    }

    @Override // androidx.lifecycle.t
    public final o m() {
        return this.f;
    }
}
