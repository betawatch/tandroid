// default package

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class mib implements rn9, jm7 {
    public final int a;
    public final boolean b;
    public final HashMap c = new HashMap();
    public boolean d;

    public mib(int i, boolean z) {
        this.a = i;
        this.b = z;
        nm7.f(i).a(this, nm7.U1);
    }

    public final synchronized void a(long j, File file, long j2, long j3) {
        kib kibVar = (kib) this.c.get(Long.valueOf(j));
        if (this.d || kibVar == null || kibVar.e) {
            return;
        }
        e(kibVar);
        kibVar.b = Math.max(kibVar.b, j2 + j3);
        bc4.G(this.a).n(file.getAbsolutePath(), this.b, kibVar.b, 0L, null);
    }

    public final synchronized void b(long j, long j2, File file) {
        kib kibVar = (kib) this.c.get(Long.valueOf(j));
        if (this.d || kibVar == null || kibVar.e) {
            return;
        }
        e(kibVar);
        kibVar.b = Math.max(kibVar.b, j2);
        kibVar.c = j2;
        bc4.G(this.a).n(file.getAbsolutePath(), this.b, kibVar.b, j2, null);
    }

    public final synchronized void c(long j) {
        kib kibVar = (kib) this.c.remove(Long.valueOf(j));
        if (kibVar == null) {
            return;
        }
        kibVar.e = true;
        if (kibVar.d) {
            bc4.G(this.a).b(kibVar.a.getAbsolutePath(), this.b);
        }
    }

    public final synchronized void d(boolean z) {
        if (this.d) {
            return;
        }
        this.d = true;
        nm7.f(this.a).n(this, nm7.U1);
        if (z) {
            Iterator it = this.c.values().iterator();
            while (it.hasNext()) {
                kib kibVar = (kib) it.next();
                if (kibVar.d && !kibVar.e) {
                    bc4.G(this.a).b(kibVar.a.getAbsolutePath(), this.b);
                }
                it.remove();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:
    
        r0.f = (org.telegram.tgnet.TLRPC.InputFile) r6[1];
        r0.g = (org.telegram.tgnet.TLRPC.InputEncryptedFile) r6[2];
        r0.h = (byte[]) r6[3];
        r0.i = (byte[]) r6[4];
        r0.c = java.lang.Math.max(r0.c, ((java.lang.Long) r6[5]).longValue());
     */
    @Override // jm7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void didReceivedNotification(int i, int i2, Object... objArr) {
        if (this.d || i != nm7.U1 || objArr.length < 6) {
            return;
        }
        String str = (String) objArr[0];
        Iterator it = this.c.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            kib kibVar = (kib) it.next();
            if (!kibVar.e && kibVar.a.getAbsolutePath().equals(str)) {
                break;
            }
        }
    }

    public final void e(kib kibVar) {
        if (kibVar.d) {
            return;
        }
        kibVar.d = true;
        bc4.G(this.a).g0(kibVar.a.getAbsolutePath(), this.b, false, 1L, 33554432, false);
    }
}
