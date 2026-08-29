package fb;

import ab.q;
import android.graphics.Bitmap;
import android.os.SystemClock;
import androidx.biometric.e;
import com.google.android.gms.common.api.internal.q1;
import com.google.android.gms.tasks.Task;
import i7.d7;
import i7.e7;
import i7.ha;
import i7.j7;
import i7.ka;
import i7.ma;
import i7.y6;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import m.s3;
import org.telegram.tgnet.ConnectionsManager;
import z5.i;
import z5.l;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class a {
    public volatile Bitmap a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public a(Bitmap bitmap, int i10) {
        l.h(bitmap);
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
        s3 s3Var = new s3();
        s3Var.c = y6.b;
        s3Var.b = d7.b;
        s3Var.d = Integer.valueOf(allocationByteCount & ConnectionsManager.DEFAULT_DATACENTER_ID);
        s3Var.f = Integer.valueOf(height & ConnectionsManager.DEFAULT_DATACENTER_ID);
        s3Var.e = Integer.valueOf(width & ConnectionsManager.DEFAULT_DATACENTER_ID);
        s3Var.a = Long.valueOf(Long.MAX_VALUE & elapsedRealtime2);
        s3Var.h = Integer.valueOf(i10 & ConnectionsManager.DEFAULT_DATACENTER_ID);
        e7 e7Var = new e7(s3Var);
        e eVar = new e(19, false);
        eVar.d = e7Var;
        q.a.execute(new q1(a2, new g9.l(eVar), task.isSuccessful() ? (String) task.getResult() : i.c.a(a2.g)));
        return aVar;
    }
}
