package aa;

import java.io.IOException;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;

    public /* synthetic */ b(c cVar, int i10) {
        this.a = i10;
        this.b = cVar;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006e  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ba.b R;
        ba.b i10;
        int i11;
        switch (this.a) {
            case 0:
                this.b.b();
                return;
            case 1:
                c cVar = this.b;
                synchronized (c.m) {
                    try {
                        u8.g gVar = cVar.a;
                        gVar.a();
                        ze.b i12 = ze.b.i(gVar.a);
                        try {
                            R = cVar.c.R();
                            if (i12 != null) {
                                i12.S();
                            }
                        } catch (Throwable th2) {
                            if (i12 != null) {
                                i12.S();
                            }
                            throw th2;
                        }
                    } finally {
                    }
                }
                try {
                    int i13 = R.b;
                    if (!(i13 == 5)) {
                        if (!(i13 == 3)) {
                            if (cVar.d.a(R)) {
                                i10 = cVar.c(R);
                                cVar.f(i10);
                                cVar.m(R, i10);
                                if (i10.b == 4) {
                                    cVar.l(i10.a);
                                }
                                i11 = i10.b;
                                if (i11 != 5) {
                                    cVar.j(new e());
                                    return;
                                } else if (i11 == 2 || i11 == 1) {
                                    cVar.j(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                                    return;
                                } else {
                                    cVar.k(i10);
                                    return;
                                }
                            }
                            return;
                        }
                    }
                    i10 = cVar.i(R);
                    cVar.f(i10);
                    cVar.m(R, i10);
                    if (i10.b == 4) {
                    }
                    i11 = i10.b;
                    if (i11 != 5) {
                    }
                } catch (e e10) {
                    cVar.j(e10);
                    return;
                }
            default:
                this.b.b();
                return;
        }
    }
}
