package l1;

import b8.ib;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class i1 implements fd.g {
    public static final i1 a = new i1();

    /* JADX WARN: Removed duplicated region for block: B:13:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0071 -> B:10:0x0074). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(FileOutputStream fileOutputStream, hd.c cVar) {
        o0 o0Var;
        int i3;
        long j10;
        o0 o0Var2;
        if (cVar instanceof o0) {
            o0Var = (o0) cVar;
            int i10 = o0Var.d;
            if ((i10 & TLObject.FLAG_31) != 0) {
                o0Var.d = i10 - TLObject.FLAG_31;
                Object obj = o0Var.c;
                gd.a aVar = gd.a.a;
                i3 = o0Var.d;
                if (i3 == 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j10 = o0Var.b;
                    fileOutputStream = o0Var.a;
                    ib.b(obj);
                    o0Var2 = o0Var;
                    j10 *= 2;
                    if (j10 <= 60000) {
                        FileLock lock = fileOutputStream.getChannel().lock(0L, Long.MAX_VALUE, false);
                        kotlin.jvm.internal.j.d(lock, "lockFileStream.getChanne…LUE, /* shared= */ false)");
                        return lock;
                    }
                    try {
                    } catch (IOException e10) {
                        String message = e10.getMessage();
                        if (message == null || !ud.d.e(message, "Resource deadlock would occur")) {
                            throw e10;
                        }
                        o0Var2.a = fileOutputStream;
                        o0Var2.b = j10;
                        o0Var2.d = 1;
                        if (wd.b0.f(j10, o0Var2) == aVar) {
                            return aVar;
                        }
                    }
                    FileLock lock2 = fileOutputStream.getChannel().lock(0L, Long.MAX_VALUE, false);
                    kotlin.jvm.internal.j.d(lock2, "lockFileStream.getChanne…LUE, /* shared= */ false)");
                    return lock2;
                }
                ib.b(obj);
                j10 = 10;
                o0Var2 = o0Var;
                if (j10 <= 60000) {
                }
            }
        }
        o0Var = new o0(cVar);
        Object obj2 = o0Var.c;
        gd.a aVar2 = gd.a.a;
        i3 = o0Var.d;
        if (i3 == 0) {
        }
    }
}
