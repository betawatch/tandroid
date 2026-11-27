// default package

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class hkb implements gp9, fn7 {
    public final int a;
    public final boolean b;
    public final HashMap c = new HashMap();
    public boolean d;

    public hkb(int i, boolean z) {
        this.a = i;
        this.b = z;
        jn7.f(i).a(this, jn7.U1);
    }

    public final synchronized void a(long j, File file, long j2, long j3) {
        fkb fkbVar = (fkb) this.c.get(Long.valueOf(j));
        if (this.d || fkbVar == null || fkbVar.e) {
            return;
        }
        e(fkbVar);
        fkbVar.b = Math.max(fkbVar.b, j2 + j3);
        xb4.G(this.a).n(file.getAbsolutePath(), this.b, fkbVar.b, 0L, null);
    }

    public final synchronized void b(long j, long j2, File file) {
        fkb fkbVar = (fkb) this.c.get(Long.valueOf(j));
        if (this.d || fkbVar == null || fkbVar.e) {
            return;
        }
        e(fkbVar);
        fkbVar.b = Math.max(fkbVar.b, j2);
        fkbVar.c = j2;
        xb4.G(this.a).n(file.getAbsolutePath(), this.b, fkbVar.b, j2, null);
    }

    public final synchronized void c(long j) {
        fkb fkbVar = (fkb) this.c.remove(Long.valueOf(j));
        if (fkbVar == null) {
            return;
        }
        fkbVar.e = true;
        if (fkbVar.d) {
            xb4.G(this.a).b(fkbVar.a.getAbsolutePath(), this.b);
        }
    }

    public final synchronized void d(boolean z) {
        if (this.d) {
            return;
        }
        this.d = true;
        jn7.f(this.a).n(this, jn7.U1);
        if (z) {
            Iterator it = this.c.values().iterator();
            while (it.hasNext()) {
                fkb fkbVar = (fkb) it.next();
                if (fkbVar.d && !fkbVar.e) {
                    xb4.G(this.a).b(fkbVar.a.getAbsolutePath(), this.b);
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
    @Override // fn7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void didReceivedNotification(int i, int i2, Object... objArr) {
        if (this.d || i != jn7.U1 || objArr.length < 6) {
            return;
        }
        String str = (String) objArr[0];
        Iterator it = this.c.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            fkb fkbVar = (fkb) it.next();
            if (!fkbVar.e && fkbVar.a.getAbsolutePath().equals(str)) {
                break;
            }
        }
    }

    public final void e(fkb fkbVar) {
        if (fkbVar.d) {
            return;
        }
        fkbVar.d = true;
        xb4.G(this.a).g0(fkbVar.a.getAbsolutePath(), this.b, false, 1L, 33554432, false);
    }
}
