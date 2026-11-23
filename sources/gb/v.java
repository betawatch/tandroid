package gb;

import android.util.Log;
import com.google.android.gms.tasks.Task;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class v implements ib.b {
    public final /* synthetic */ int a;

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(1:(6:11|12|13|(1:15)|16|17)(2:20|21))(2:22|23))(6:30|31|32|33|(1:35)|28)|24|25|26))|43|6|7|(0)(0)|24|25|26|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008e, code lost:
    
        if (r10 != r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0046, code lost:
    
        r10 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0033, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0098, code lost:
    
        android.util.Log.w("FirebaseSessions", "Error getting Firebase installation id .", r10);
        r9 = r9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v19, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(va.d dVar, kd.c cVar) {
        x xVar;
        int i7;
        va.d dVar2;
        ?? r92;
        if (cVar instanceof x) {
            xVar = (x) cVar;
            int i10 = xVar.d;
            if ((i10 & TLObject.FLAG_31) != 0) {
                xVar.d = i10 - TLObject.FLAG_31;
                Object obj = xVar.b;
                jd.a aVar = jd.a.a;
                i7 = xVar.d;
                String str = "";
                if (i7 != 0) {
                    c8.z.b(obj);
                    va.c cVar2 = (va.c) dVar;
                    Task f10 = cVar2.f();
                    try {
                        kotlin.jvm.internal.j.d(f10, "getToken(...)");
                        xVar.a = cVar2;
                        xVar.d = 1;
                        Object a10 = c8.z0.a(f10, xVar);
                        if (a10 != aVar) {
                            obj = a10;
                            dVar = cVar2;
                        }
                    } catch (Exception e10) {
                        e = e10;
                        dVar = cVar2;
                        Log.w("FirebaseSessions", "Error getting authentication token.", e);
                        dVar2 = dVar;
                        r92 = "";
                        Task e11 = ((va.c) dVar2).e();
                        kotlin.jvm.internal.j.d(e11, "getId(...)");
                        xVar.a = r92;
                        xVar.d = 2;
                        obj = c8.z0.a(e11, xVar);
                        dVar = r92;
                    }
                    return aVar;
                }
                if (i7 != 1) {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ?? r93 = (String) xVar.a;
                    c8.z.b(obj);
                    dVar = r93;
                    String str2 = (String) obj;
                    ?? r94 = dVar;
                    if (str2 != null) {
                        str = str2;
                        r94 = dVar;
                    }
                    return new y(str, r94);
                }
                va.d dVar3 = (va.d) xVar.a;
                c8.z.b(obj);
                dVar = dVar3;
                String str3 = ((va.a) obj).a;
                kotlin.jvm.internal.j.b(str3);
                dVar2 = dVar;
                r92 = str3;
                Task e112 = ((va.c) dVar2).e();
                kotlin.jvm.internal.j.d(e112, "getId(...)");
                xVar.a = r92;
                xVar.d = 2;
                obj = c8.z0.a(e112, xVar);
                dVar = r92;
            }
        }
        xVar = new x(this, cVar);
        Object obj2 = xVar.b;
        jd.a aVar2 = jd.a.a;
        i7 = xVar.d;
        String str4 = "";
        if (i7 != 0) {
        }
        String str32 = ((va.a) obj2).a;
        kotlin.jvm.internal.j.b(str32);
        dVar2 = dVar;
        r92 = str32;
        Task e1122 = ((va.c) dVar2).e();
        kotlin.jvm.internal.j.d(e1122, "getId(...)");
        xVar.a = r92;
        xVar.d = 2;
        obj2 = c8.z0.a(e1122, xVar);
        dVar = r92;
    }

    @Override // fd.a
    public Object get() {
        switch (this.a) {
            case 0:
                return i1.a;
            default:
                return j1.a;
        }
    }
}
