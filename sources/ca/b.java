package ca;

import java.io.IOException;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
        da.b Y;
        da.b i10;
        int i11;
        switch (this.a) {
            case 0:
                this.b.b();
                return;
            case 1:
                c cVar = this.b;
                synchronized (c.m) {
                    try {
                        w8.g gVar = cVar.a;
                        gVar.a();
                        af.c p10 = af.c.p(gVar.a);
                        try {
                            Y = cVar.c.Y();
                            if (p10 != null) {
                                p10.a0();
                            }
                        } catch (Throwable th2) {
                            if (p10 != null) {
                                p10.a0();
                            }
                            throw th2;
                        }
                    } finally {
                    }
                }
                try {
                    int i12 = Y.b;
                    if (!(i12 == 5)) {
                        if (!(i12 == 3)) {
                            if (cVar.d.a(Y)) {
                                i10 = cVar.c(Y);
                                cVar.f(i10);
                                cVar.m(Y, i10);
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
                    i10 = cVar.i(Y);
                    cVar.f(i10);
                    cVar.m(Y, i10);
                    if (i10.b == 4) {
                    }
                    i11 = i10.b;
                    if (i11 != 5) {
                    }
                } catch (e e) {
                    cVar.j(e);
                    return;
                }
            default:
                this.b.b();
                return;
        }
    }
}
