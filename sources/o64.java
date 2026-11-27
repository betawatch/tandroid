// default package

import android.media.MediaFormat;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class o64 implements sec, lg8 {
    public sec a;
    public o64 b;

    public final void a() {
        o64 o64Var = this.b;
        if (o64Var != null) {
            o64Var.a();
        }
    }

    @Override // sec
    public final void b(long j, long j2, ko4 ko4Var, MediaFormat mediaFormat) {
        sec secVar = this.a;
        if (secVar != null) {
            secVar.b(j, j2, ko4Var, mediaFormat);
        }
    }

    public final void c() {
        o64 o64Var = this.b;
        if (o64Var != null) {
            o64Var.c();
        }
    }

    @Override // lg8
    public final void d(int i, Object obj) {
        if (i == 7) {
            this.a = (sec) obj;
            return;
        }
        if (i == 8) {
            this.b = (o64) obj;
        } else {
            if (i != 10000 || obj == null) {
                return;
            }
            grb.o();
        }
    }
}
