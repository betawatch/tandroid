package db;

import a5.m;
import android.graphics.Bitmap;
import android.os.SystemClock;
import com.google.android.gms.common.api.internal.q1;
import com.google.android.gms.tasks.Task;
import g5.b;
import g7.c7;
import g7.d7;
import g7.ha;
import g7.i7;
import g7.ka;
import g7.ma;
import g7.x6;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import m.t3;
import org.telegram.tgnet.ConnectionsManager;
import x5.i;
import x5.l;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class a {
    public volatile Bitmap a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public a(Bitmap bitmap, int i9) {
        l.h(bitmap);
        this.a = bitmap;
        this.b = bitmap.getWidth();
        this.c = bitmap.getHeight();
        boolean z10 = true;
        if (i9 != 0 && i9 != 90 && i9 != 180 && i9 != 270) {
            z10 = false;
        }
        l.a("Invalid rotation. Only 0, 90, 180, 270 are supported currently.", z10);
        this.d = i9;
        this.e = -1;
    }

    public static a a(Bitmap bitmap, int i9) {
        ka a2;
        Task task;
        a aVar;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        a aVar2 = new a(bitmap, i9);
        int height = bitmap.getHeight();
        int width = bitmap.getWidth();
        int allocationByteCount = bitmap.getAllocationByteCount();
        synchronized (ma.class) {
            byte b10 = (byte) (((byte) 1) | 2);
            if (b10 != 3) {
                StringBuilder sb2 = new StringBuilder();
                if ((b10 & 1) == 0) {
                    sb2.append(" enableFirelog");
                }
                if ((b10 & 2) == 0) {
                    sb2.append(" firelogEventType");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
            }
            a2 = ma.a(new ha());
        }
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
        i7 i7Var = i7.b;
        Task task2 = a2.e;
        long elapsedRealtime3 = SystemClock.elapsedRealtime();
        HashMap hashMap = a2.i;
        if (hashMap.get(i7Var) == null) {
            task = task2;
            aVar = aVar2;
        } else {
            task = task2;
            aVar = aVar2;
            if (elapsedRealtime3 - ((Long) hashMap.get(i7Var)).longValue() <= TimeUnit.SECONDS.toMillis(30L)) {
                return aVar;
            }
        }
        hashMap.put(i7Var, Long.valueOf(elapsedRealtime3));
        t3 t3Var = new t3();
        t3Var.c = x6.b;
        t3Var.b = c7.b;
        t3Var.d = Integer.valueOf(allocationByteCount & ConnectionsManager.DEFAULT_DATACENTER_ID);
        t3Var.f = Integer.valueOf(height & ConnectionsManager.DEFAULT_DATACENTER_ID);
        t3Var.e = Integer.valueOf(width & ConnectionsManager.DEFAULT_DATACENTER_ID);
        t3Var.a = Long.valueOf(Long.MAX_VALUE & elapsedRealtime2);
        t3Var.h = Integer.valueOf(i9 & ConnectionsManager.DEFAULT_DATACENTER_ID);
        d7 d7Var = new d7(t3Var);
        m mVar = new m(19, false);
        mVar.d = d7Var;
        ya.m.a.execute(new q1(a2, new b(mVar), task.isSuccessful() ? (String) task.getResult() : i.c.a(a2.g)));
        return aVar;
    }
}
