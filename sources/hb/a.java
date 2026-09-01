package hb;

import android.graphics.Bitmap;
import android.os.SystemClock;
import androidx.biometric.e;
import b6.j;
import b6.m;
import cb.o;
import com.google.android.gms.common.api.internal.s1;
import com.google.android.gms.tasks.Task;
import f7.b;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import k7.d7;
import k7.e7;
import k7.ha;
import k7.j7;
import k7.ka;
import k7.ma;
import k7.y6;
import m.r3;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class a {
    public volatile Bitmap a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public a(Bitmap bitmap, int i10) {
        m.h(bitmap);
        this.a = bitmap;
        this.b = bitmap.getWidth();
        this.c = bitmap.getHeight();
        boolean z4 = true;
        if (i10 != 0 && i10 != 90 && i10 != 180 && i10 != 270) {
            z4 = false;
        }
        m.a("Invalid rotation. Only 0, 90, 180, 270 are supported currently.", z4);
        this.d = i10;
        this.e = -1;
    }

    public static a a(Bitmap bitmap, int i10) {
        ka a2;
        Task task;
        a aVar;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        a aVar2 = new a(bitmap, i10);
        int height = bitmap.getHeight();
        int width = bitmap.getWidth();
        int allocationByteCount = bitmap.getAllocationByteCount();
        synchronized (ma.class) {
            byte b10 = (byte) (((byte) 1) | 2);
            if (b10 != 3) {
                StringBuilder sb = new StringBuilder();
                if ((b10 & 1) == 0) {
                    sb.append(" enableFirelog");
                }
                if ((b10 & 2) == 0) {
                    sb.append(" firelogEventType");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
            }
            a2 = ma.a(new ha());
        }
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
        j7 j7Var = j7.b;
        Task task2 = a2.e;
        long elapsedRealtime3 = SystemClock.elapsedRealtime();
        HashMap hashMap = a2.i;
        if (hashMap.get(j7Var) == null) {
            task = task2;
            aVar = aVar2;
        } else {
            task = task2;
            aVar = aVar2;
            if (elapsedRealtime3 - ((Long) hashMap.get(j7Var)).longValue() <= TimeUnit.SECONDS.toMillis(30L)) {
                return aVar;
            }
        }
        hashMap.put(j7Var, Long.valueOf(elapsedRealtime3));
        r3 r3Var = new r3();
        r3Var.c = y6.b;
        r3Var.b = d7.b;
        r3Var.d = Integer.valueOf(allocationByteCount & ConnectionsManager.DEFAULT_DATACENTER_ID);
        r3Var.f = Integer.valueOf(height & ConnectionsManager.DEFAULT_DATACENTER_ID);
        r3Var.e = Integer.valueOf(width & ConnectionsManager.DEFAULT_DATACENTER_ID);
        r3Var.a = Long.valueOf(Long.MAX_VALUE & elapsedRealtime2);
        r3Var.h = Integer.valueOf(i10 & ConnectionsManager.DEFAULT_DATACENTER_ID);
        e7 e7Var = new e7(r3Var);
        e eVar = new e(27, false);
        eVar.d = e7Var;
        o.a.execute(new s1(a2, new b(eVar), task.isSuccessful() ? (String) task.getResult() : j.c.a(a2.g)));
        return aVar;
    }
}
