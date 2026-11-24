// default package

import android.graphics.Bitmap;
import android.os.SystemClock;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class go5 {
    public volatile Bitmap a;
    public final int b;
    public final int c;
    public final int d;

    public go5(int i, Bitmap bitmap) {
        fre.h(bitmap);
        this.a = bitmap;
        this.b = bitmap.getWidth();
        this.c = bitmap.getHeight();
        boolean z = true;
        if (i != 0 && i != 90 && i != 180 && i != 270) {
            z = false;
        }
        fre.a("Invalid rotation. Only 0, 90, 180, 270 are supported currently.", z);
        this.d = i;
    }

    public static go5 a(int i, Bitmap bitmap) {
        f1f b;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        go5 go5Var = new go5(i, bitmap);
        int height = bitmap.getHeight();
        int width = bitmap.getWidth();
        int allocationByteCount = bitmap.getAllocationByteCount();
        synchronized (z1f.class) {
            b = z1f.b(new j0f());
        }
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
        ule uleVar = ule.b;
        Task task = b.e;
        long elapsedRealtime3 = SystemClock.elapsedRealtime();
        HashMap hashMap = b.i;
        if (hashMap.get(uleVar) != null && elapsedRealtime3 - ((Long) hashMap.get(uleVar)).longValue() <= 30000) {
            return go5Var;
        }
        hashMap.put(uleVar, Long.valueOf(elapsedRealtime3));
        jb4 jb4Var = new jb4();
        jb4Var.c = nje.b;
        jb4Var.b = oke.b;
        jb4Var.d = Integer.valueOf(allocationByteCount & ConnectionsManager.DEFAULT_DATACENTER_ID);
        jb4Var.f = Integer.valueOf(height & ConnectionsManager.DEFAULT_DATACENTER_ID);
        jb4Var.e = Integer.valueOf(width & ConnectionsManager.DEFAULT_DATACENTER_ID);
        jb4Var.a = Long.valueOf(elapsedRealtime2 & Long.MAX_VALUE);
        jb4Var.g = Integer.valueOf(i & ConnectionsManager.DEFAULT_DATACENTER_ID);
        xke xkeVar = new xke(jb4Var);
        rod rodVar = new rod((byte) 7);
        rodVar.d = xkeVar;
        yjb.c(1, new ey1(b, new aec(rodVar), task.isSuccessful() ? (String) task.getResult() : r06.c.a(b.g)));
        return go5Var;
    }
}
