// default package

import android.graphics.Bitmap;
import android.os.SystemClock;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class gq5 {
    public volatile Bitmap a;
    public final int b;
    public final int c;
    public final int d;

    public gq5(int i, Bitmap bitmap) {
        ite.h(bitmap);
        this.a = bitmap;
        this.b = bitmap.getWidth();
        this.c = bitmap.getHeight();
        boolean z = true;
        if (i != 0 && i != 90 && i != 180 && i != 270) {
            z = false;
        }
        ite.a("Invalid rotation. Only 0, 90, 180, 270 are supported currently.", z);
        this.d = i;
    }

    public static gq5 a(int i, Bitmap bitmap) {
        h3f b;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        gq5 gq5Var = new gq5(i, bitmap);
        int height = bitmap.getHeight();
        int width = bitmap.getWidth();
        int allocationByteCount = bitmap.getAllocationByteCount();
        synchronized (b4f.class) {
            b = b4f.b(new l2f());
        }
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
        wne wneVar = wne.b;
        Task task = b.e;
        long elapsedRealtime3 = SystemClock.elapsedRealtime();
        HashMap hashMap = b.i;
        if (hashMap.get(wneVar) != null && elapsedRealtime3 - ((Long) hashMap.get(wneVar)).longValue() <= 30000) {
            return gq5Var;
        }
        hashMap.put(wneVar, Long.valueOf(elapsedRealtime3));
        jd4 jd4Var = new jd4();
        jd4Var.c = ple.b;
        jd4Var.b = qme.b;
        jd4Var.d = Integer.valueOf(allocationByteCount & ConnectionsManager.DEFAULT_DATACENTER_ID);
        jd4Var.f = Integer.valueOf(height & ConnectionsManager.DEFAULT_DATACENTER_ID);
        jd4Var.e = Integer.valueOf(width & ConnectionsManager.DEFAULT_DATACENTER_ID);
        jd4Var.a = Long.valueOf(elapsedRealtime2 & Long.MAX_VALUE);
        jd4Var.g = Integer.valueOf(i & ConnectionsManager.DEFAULT_DATACENTER_ID);
        zme zmeVar = new zme(jd4Var);
        uqd uqdVar = new uqd((byte) 7);
        uqdVar.d = zmeVar;
        mlb.c(1, new rz1(b, new rhb(uqdVar), task.isSuccessful() ? (String) task.getResult() : r26.c.a(b.g)));
        return gq5Var;
    }
}
