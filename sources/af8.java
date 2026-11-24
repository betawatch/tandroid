// default package

import android.os.Looper;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class af8 {
    public final ze8 a;
    public final r74 b;
    public byte c;
    public Object d;
    public final Looper e;
    public boolean f;

    public af8(r74 r74Var, ze8 ze8Var, bqb bqbVar, int i, Looper looper) {
        this.b = r74Var;
        this.a = ze8Var;
        this.e = looper;
    }

    public final synchronized void a(boolean z) {
        notifyAll();
    }

    public final void b() {
        jte.p(!this.f);
        this.f = true;
        r74 r74Var = this.b;
        if (!r74Var.a0 && r74Var.r.getThread().isAlive()) {
            r74Var.h.c(14, this).b();
        } else {
            ncd.f("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            a(false);
        }
    }
}
