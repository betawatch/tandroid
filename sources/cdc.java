// default package

import android.content.Context;
import android.os.Build;
import android.view.Surface;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class cdc {
    public final Context a;
    public boolean b;
    public zcc c;
    public boolean d;
    public Surface e;
    public float f;
    public float g;
    public float h = 1.0f;
    public int i = 0;
    public long j;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    public long p;
    public long q;

    public cdc(Context context) {
        this.a = context;
    }

    public final void a() {
        Surface surface;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.e) == null || this.i == Integer.MIN_VALUE || this.g == 0.0f || !surface.isValid()) {
            return;
        }
        this.g = 0.0f;
        via.w(this.e, 0.0f);
    }

    public final void b() {
        this.o = -1L;
        this.l = -1L;
        this.n = -9223372036854775807L;
        this.j = 0L;
        this.k = 0L;
    }

    public final void c(boolean z) {
        Surface surface;
        float f;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.e) == null || this.i == Integer.MIN_VALUE || !surface.isValid()) {
            return;
        }
        if (this.d) {
            float f2 = this.f;
            if (f2 != -1.0f) {
                f = f2 * this.h;
                if (z && this.g == f) {
                    return;
                }
                this.g = f;
                via.w(this.e, f);
            }
        }
        f = 0.0f;
        if (z) {
        }
        this.g = f;
        via.w(this.e, f);
    }
}
