package ac;

import a8.wa;
import android.os.SystemClock;
import android.support.v4.media.session.a0;
import c8.db;
import c8.de;
import c8.eb;
import c8.tf;
import java.io.File;
import vi.g;
import vi.h;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements tf {
    public final long a;
    public final Object b;
    public final Object c;

    public /* synthetic */ e(f fVar, eb ebVar, long j3) {
        this.b = fVar;
        this.c = ebVar;
        this.a = j3;
    }

    @Override // c8.tf
    public wa zza() {
        f fVar = (f) this.b;
        eb ebVar = (eb) this.c;
        ga.d dVar = new ga.d(1);
        dVar.d = db.b;
        a0 a0Var = new a0(18, false);
        a0Var.d = fVar.e.a();
        a0Var.b = ebVar;
        a0Var.c = Long.valueOf((SystemClock.elapsedRealtime() - this.a) & Long.MAX_VALUE);
        dVar.f = new de(a0Var);
        return new wa(dVar, 0);
    }

    public e(File file, long j3, byte[] bArr) {
        this.b = file;
        this.a = j3;
        this.c = bArr == null ? null : (byte[]) bArr.clone();
    }

    public e(long j3, g gVar, h hVar) {
        this.c = hVar;
        this.a = j3;
        this.b = gVar;
    }
}
