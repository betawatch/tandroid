package l1;

import b8.he;
import b8.ib;
import java.io.FileOutputStream;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class k0 extends d0 {
    /* JADX WARN: Removed duplicated region for block: B:26:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj, hd.c cVar) {
        j0 j0Var;
        int i3;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        if (cVar instanceof j0) {
            j0Var = (j0) cVar;
            int i10 = j0Var.e;
            if ((i10 & TLObject.FLAG_31) != 0) {
                j0Var.e = i10 - TLObject.FLAG_31;
                Object obj2 = j0Var.c;
                gd.a aVar = gd.a.a;
                i3 = j0Var.e;
                dd.k kVar = dd.k.a;
                if (i3 != 0) {
                    ib.b(obj2);
                    if (this.c.get()) {
                        throw new IllegalStateException("This scope has already been closed.");
                    }
                    FileOutputStream fileOutputStream3 = new FileOutputStream(this.a);
                    try {
                        z0 z0Var = this.b;
                        h1 h1Var = new h1(fileOutputStream3);
                        j0Var.a = fileOutputStream3;
                        j0Var.b = fileOutputStream3;
                        j0Var.e = 1;
                        z0Var.b(obj, h1Var);
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
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fileOutputStream2 = j0Var.b;
                    fileOutputStream = j0Var.a;
                    try {
                        ib.b(obj2);
                    } catch (Throwable th3) {
                        th = th3;
                        try {
                            throw th;
                        } catch (Throwable th4) {
                            he.a(fileOutputStream, th);
                            throw th4;
                        }
                    }
                }
                fileOutputStream2.getFD().sync();
                he.a(fileOutputStream, null);
                return kVar;
            }
        }
        j0Var = new j0(this, cVar);
        Object obj22 = j0Var.c;
        gd.a aVar2 = gd.a.a;
        i3 = j0Var.e;
        dd.k kVar2 = dd.k.a;
        if (i3 != 0) {
        }
        fileOutputStream2.getFD().sync();
        he.a(fileOutputStream, null);
        return kVar2;
    }
}
