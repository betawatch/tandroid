package db;

import android.util.Log;
import b8.ib;
import b8.kc;
import com.google.android.gms.tasks.Task;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class t implements fb.b {
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
    public Object a(ua.e eVar, hd.c cVar) {
        v vVar;
        int i3;
        ua.e eVar2;
        ?? r9;
        if (cVar instanceof v) {
            vVar = (v) cVar;
            int i10 = vVar.d;
            if ((i10 & TLObject.FLAG_31) != 0) {
                vVar.d = i10 - TLObject.FLAG_31;
                Object obj = vVar.b;
                gd.a aVar = gd.a.a;
                i3 = vVar.d;
                String str = "";
                if (i3 != 0) {
                    ib.b(obj);
                    ua.d dVar = (ua.d) eVar;
                    Task f10 = dVar.f();
                    try {
                        kotlin.jvm.internal.j.d(f10, "getToken(...)");
                        vVar.a = dVar;
                        vVar.d = 1;
                        Object a10 = kc.a(f10, vVar);
                        if (a10 != aVar) {
                            obj = a10;
                            eVar = dVar;
                        }
                    } catch (Exception e10) {
                        e = e10;
                        eVar = dVar;
                        Log.w("FirebaseSessions", "Error getting authentication token.", e);
                        eVar2 = eVar;
                        r9 = "";
                        Task e11 = ((ua.d) eVar2).e();
                        kotlin.jvm.internal.j.d(e11, "getId(...)");
                        vVar.a = r9;
                        vVar.d = 2;
                        obj = kc.a(e11, vVar);
                        eVar = r9;
                    }
                    return aVar;
                }
                if (i3 != 1) {
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ?? r92 = (String) vVar.a;
                    ib.b(obj);
                    eVar = r92;
                    String str2 = (String) obj;
                    ?? r93 = eVar;
                    if (str2 != null) {
                        str = str2;
                        r93 = eVar;
                    }
                    return new w(str, r93);
                }
                ua.e eVar3 = (ua.e) vVar.a;
                ib.b(obj);
                eVar = eVar3;
                String str3 = ((ua.a) obj).a;
                kotlin.jvm.internal.j.b(str3);
                eVar2 = eVar;
                r9 = str3;
                Task e112 = ((ua.d) eVar2).e();
                kotlin.jvm.internal.j.d(e112, "getId(...)");
                vVar.a = r9;
                vVar.d = 2;
                obj = kc.a(e112, vVar);
                eVar = r9;
            }
        }
        vVar = new v(this, cVar);
        Object obj2 = vVar.b;
        gd.a aVar2 = gd.a.a;
        i3 = vVar.d;
        String str4 = "";
        if (i3 != 0) {
        }
        String str32 = ((ua.a) obj2).a;
        kotlin.jvm.internal.j.b(str32);
        eVar2 = eVar;
        r9 = str32;
        Task e1122 = ((ua.d) eVar2).e();
        kotlin.jvm.internal.j.d(e1122, "getId(...)");
        vVar.a = r9;
        vVar.d = 2;
        obj2 = kc.a(e1122, vVar);
        eVar = r9;
    }

    @Override // cd.a
    public Object get() {
        switch (this.a) {
            case 0:
                return i1.a;
            default:
                return j1.a;
        }
    }
}
