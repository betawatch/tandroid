// default package

import android.media.MediaFormat;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
