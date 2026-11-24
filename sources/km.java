// default package

import android.os.SystemClock;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class km {
    public final View a;
    public final Runnable b;
    public int c;
    public int d;
    public boolean e;
    public final short f;
    public final d53 g;
    public boolean h;
    public long i;
    public int j;

    /* JADX WARN: Type inference failed for: r2v1, types: [int, short] */
    public km(View view, long j, d53 d53Var) {
        this.f = (short) 200;
        d53 d53Var2 = d53.f;
        this.a = view;
        this.f = (int) j;
        this.g = d53Var;
        this.e = true;
    }

    public final int a(int i, boolean z) {
        long j = this.f;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (z || j <= 0 || this.e) {
            this.d = i;
            this.c = i;
            this.h = false;
            this.e = false;
        } else if (this.d != i) {
            this.h = true;
            this.d = i;
            this.j = this.c;
            this.i = elapsedRealtime;
        }
        if (this.h) {
            float a = pqe.a((elapsedRealtime - this.i) / j, 0.0f, 1.0f);
            if (elapsedRealtime - this.i >= 0) {
                int i2 = this.j;
                int i3 = this.d;
                d53 d53Var = this.g;
                if (d53Var == null) {
                    this.c = on2.f(a, i2, i3);
                } else {
                    this.c = on2.f(d53Var.getInterpolation(a), i2, i3);
                }
            }
            if (a >= 1.0f) {
                this.h = false;
            } else {
                View view = this.a;
                if (view != null) {
                    view.invalidate();
                }
                Runnable runnable = this.b;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return this.c;
    }

    public km(View view) {
        this.f = (short) 200;
        this.g = d53.f;
        this.a = view;
        this.e = true;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [int, short] */
    public km(View view, long j, d53 d53Var, int i) {
        this.f = (short) 200;
        d53 d53Var2 = d53.f;
        this.a = view;
        this.f = (int) j;
        this.g = d53Var;
        this.e = true;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [int, short] */
    public km(Runnable runnable, long j, d53 d53Var) {
        this.f = (short) 200;
        d53 d53Var2 = d53.f;
        this.b = runnable;
        this.f = (int) j;
        this.g = d53Var;
        this.e = true;
    }
}
