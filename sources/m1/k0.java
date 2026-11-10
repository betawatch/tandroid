package m1;

import c8.mb;
import java.io.FileOutputStream;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class k0 extends d0 {
    /* JADX WARN: Removed duplicated region for block: B:26:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj, kd.c cVar) {
        j0 j0Var;
        int i7;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        if (cVar instanceof j0) {
            j0Var = (j0) cVar;
            int i10 = j0Var.e;
            if ((i10 & TLObject.FLAG_31) != 0) {
                j0Var.e = i10 - TLObject.FLAG_31;
                Object obj2 = j0Var.c;
                jd.a aVar = jd.a.a;
                i7 = j0Var.e;
                gd.k kVar = gd.k.a;
                if (i7 != 0) {
                    af.b.c(obj2);
                    if (this.c.get()) {
                        throw new IllegalStateException("This scope has already been closed.");
                    }
                    FileOutputStream fileOutputStream3 = new FileOutputStream(this.a);
                    try {
                        y0 y0Var = this.b;
                        g1 g1Var = new g1(fileOutputStream3);
                        j0Var.a = fileOutputStream3;
                        j0Var.b = fileOutputStream3;
                        j0Var.e = 1;
                        y0Var.c(obj, g1Var);
                        if (kVar == aVar) {
                            return aVar;
                        }
                        fileOutputStream2 = fileOutputStream3;
                        fileOutputStream = fileOutputStream2;
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream = fileOutputStream3;
                        throw th;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fileOutputStream2 = j0Var.b;
                    fileOutputStream = j0Var.a;
                    try {
                        af.b.c(obj2);
                    } catch (Throwable th3) {
                        th = th3;
                        try {
                            throw th;
                        } catch (Throwable th4) {
                            mb.a(fileOutputStream, th);
                            throw th4;
                        }
                    }
                }
                fileOutputStream2.getFD().sync();
                mb.a(fileOutputStream, null);
                return kVar;
            }
        }
        j0Var = new j0(this, cVar);
        Object obj22 = j0Var.c;
        jd.a aVar2 = jd.a.a;
        i7 = j0Var.e;
        gd.k kVar2 = gd.k.a;
        if (i7 != 0) {
        }
        fileOutputStream2.getFD().sync();
        mb.a(fileOutputStream, null);
        return kVar2;
    }
}
