package ob;

import android.graphics.Bitmap;
import android.os.SystemClock;
import c5.w;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import jb.m;
import m.p3;
import m5.e;
import n6.i;
import n6.l;
import org.telegram.tgnet.ConnectionsManager;
import q5.d;
import w7.c7;
import w7.d7;
import w7.ga;
import w7.i7;
import w7.ja;
import w7.la;
import w7.x6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class a {
    public volatile Bitmap a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public a(Bitmap bitmap, int i10) {
        l.g(bitmap);
        this.a = bitmap;
        this.b = bitmap.getWidth();
        this.c = bitmap.getHeight();
        boolean z10 = true;
        if (i10 != 0 && i10 != 90 && i10 != 180 && i10 != 270) {
            z10 = false;
        }
        l.a("Invalid rotation. Only 0, 90, 180, 270 are supported currently.", z10);
        this.d = i10;
        this.e = -1;
    }

    public static a a(Bitmap bitmap, int i10) {
        ja a2;
        Task task;
        a aVar;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        a aVar2 = new a(bitmap, i10);
        int height = bitmap.getHeight();
        int width = bitmap.getWidth();
        int allocationByteCount = bitmap.getAllocationByteCount();
        synchronized (la.class) {
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
            a2 = la.a(new ga());
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
        p3 p3Var = new p3();
        p3Var.c = x6.b;
        p3Var.b = c7.b;
        p3Var.d = Integer.valueOf(allocationByteCount & ConnectionsManager.DEFAULT_DATACENTER_ID);
        p3Var.f = Integer.valueOf(height & ConnectionsManager.DEFAULT_DATACENTER_ID);
        p3Var.e = Integer.valueOf(width & ConnectionsManager.DEFAULT_DATACENTER_ID);
        p3Var.a = Long.valueOf(Long.MAX_VALUE & elapsedRealtime2);
        p3Var.h = Integer.valueOf(i10 & ConnectionsManager.DEFAULT_DATACENTER_ID);
        d7 d7Var = new d7(p3Var);
        d dVar = new d(17, false);
        dVar.d = d7Var;
        m.a.execute(new w(a2, new e(dVar), task.isSuccessful() ? (String) task.getResult() : i.c.a(a2.g)));
        return aVar;
    }
}
