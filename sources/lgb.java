// default package

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class lgb implements rl9, gk7 {
    public final int a;
    public final boolean b;
    public final HashMap c = new HashMap();
    public boolean d;

    public lgb(int i, boolean z) {
        this.a = i;
        this.b = z;
        kk7.f(i).a(this, kk7.T1);
    }

    public final synchronized void a(long j, File file, long j2, long j3) {
        jgb jgbVar = (jgb) this.c.get(Long.valueOf(j));
        if (this.d || jgbVar == null || jgbVar.e) {
            return;
        }
        e(jgbVar);
        jgbVar.b = Math.max(jgbVar.b, j2 + j3);
        ba4.G(this.a).n(file.getAbsolutePath(), this.b, jgbVar.b, 0L, null);
    }

    public final synchronized void b(long j, long j2, File file) {
        jgb jgbVar = (jgb) this.c.get(Long.valueOf(j));
        if (this.d || jgbVar == null || jgbVar.e) {
            return;
        }
        e(jgbVar);
        jgbVar.b = Math.max(jgbVar.b, j2);
        jgbVar.c = j2;
        ba4.G(this.a).n(file.getAbsolutePath(), this.b, jgbVar.b, j2, null);
    }

    public final synchronized void c(long j) {
        jgb jgbVar = (jgb) this.c.remove(Long.valueOf(j));
        if (jgbVar == null) {
            return;
        }
        jgbVar.e = true;
        if (jgbVar.d) {
            ba4.G(this.a).b(jgbVar.a.getAbsolutePath(), this.b);
        }
    }

    public final synchronized void d(boolean z) {
        if (this.d) {
            return;
        }
        this.d = true;
        kk7.f(this.a).n(this, kk7.T1);
        if (z) {
            Iterator it = this.c.values().iterator();
            while (it.hasNext()) {
                jgb jgbVar = (jgb) it.next();
                if (jgbVar.d && !jgbVar.e) {
                    ba4.G(this.a).b(jgbVar.a.getAbsolutePath(), this.b);
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
    @Override // gk7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void didReceivedNotification(int i, int i2, Object... objArr) {
        if (this.d || i != kk7.T1 || objArr.length < 6) {
            return;
        }
        String str = (String) objArr[0];
        Iterator it = this.c.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            jgb jgbVar = (jgb) it.next();
            if (!jgbVar.e && jgbVar.a.getAbsolutePath().equals(str)) {
                break;
            }
        }
    }

    public final void e(jgb jgbVar) {
        if (jgbVar.d) {
            return;
        }
        jgbVar.d = true;
        ba4.G(this.a).g0(jgbVar.a.getAbsolutePath(), this.b, false, 1L, 33554432, false);
    }
}
