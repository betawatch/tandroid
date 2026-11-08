package m1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class h1 implements id.g {
    public static final h1 a = new h1();

    /* JADX WARN: Removed duplicated region for block: B:13:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0071 -> B:10:0x0074). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(FileOutputStream fileOutputStream, kd.c cVar) {
        o0 o0Var;
        int i7;
        long j3;
        o0 o0Var2;
        if (cVar instanceof o0) {
            o0Var = (o0) cVar;
            int i10 = o0Var.d;
            if ((i10 & TLObject.FLAG_31) != 0) {
                o0Var.d = i10 - TLObject.FLAG_31;
                Object obj = o0Var.c;
                jd.a aVar = jd.a.a;
                i7 = o0Var.d;
                if (i7 == 0) {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j3 = o0Var.b;
                    fileOutputStream = o0Var.a;
                    af.b.c(obj);
                    o0Var2 = o0Var;
                    j3 *= 2;
                    if (j3 <= 60000) {
                        FileLock lock = fileOutputStream.getChannel().lock(0L, Long.MAX_VALUE, false);
                        kotlin.jvm.internal.j.d(lock, "lockFileStream.getChanne…LUE, /* shared= */ false)");
                        return lock;
                    }
                    try {
                    } catch (IOException e10) {
                        String message = e10.getMessage();
                        if (message == null || !xd.d.e(message, "Resource deadlock would occur")) {
                            throw e10;
                        }
                        o0Var2.a = fileOutputStream;
                        o0Var2.b = j3;
                        o0Var2.d = 1;
                        if (zd.b0.f(j3, o0Var2) == aVar) {
                            return aVar;
                        }
                    }
                    FileLock lock2 = fileOutputStream.getChannel().lock(0L, Long.MAX_VALUE, false);
                    kotlin.jvm.internal.j.d(lock2, "lockFileStream.getChanne…LUE, /* shared= */ false)");
                    return lock2;
                }
                af.b.c(obj);
                j3 = 10;
                o0Var2 = o0Var;
                if (j3 <= 60000) {
                }
            }
        }
        o0Var = new o0(cVar);
        Object obj2 = o0Var.c;
        jd.a aVar2 = jd.a.a;
        i7 = o0Var.d;
        if (i7 == 0) {
        }
    }
}
