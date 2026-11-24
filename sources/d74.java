// default package

import android.media.MediaFormat;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class d74 implements vcc, ze8 {
    public vcc a;
    public d74 b;

    public final void a() {
        d74 d74Var = this.b;
        if (d74Var != null) {
            d74Var.a();
        }
    }

    public final void b() {
        d74 d74Var = this.b;
        if (d74Var != null) {
            d74Var.b();
        }
    }

    @Override // vcc
    public final void c(long j, long j2, go4 go4Var, MediaFormat mediaFormat) {
        vcc vccVar = this.a;
        if (vccVar != null) {
            vccVar.c(j, j2, go4Var, mediaFormat);
        }
    }

    @Override // ze8
    public final void d(int i, Object obj) {
        if (i == 7) {
            this.a = (vcc) obj;
            return;
        }
        if (i == 8) {
            this.b = (d74) obj;
        } else {
            if (i != 10000 || obj == null) {
                return;
            }
            rjb.p();
        }
    }
}
