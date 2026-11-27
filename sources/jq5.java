// default package

import android.graphics.Bitmap;
import android.os.SystemClock;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class jq5 {
    public volatile Bitmap a;
    public final int b;
    public final int c;
    public final int d;

    public jq5(int i, Bitmap bitmap) {
        xve.h(bitmap);
        this.a = bitmap;
        this.b = bitmap.getWidth();
        this.c = bitmap.getHeight();
        boolean z = true;
        if (i != 0 && i != 90 && i != 180 && i != 270) {
            z = false;
        }
        xve.a("Invalid rotation. Only 0, 90, 180, 270 are supported currently.", z);
        this.d = i;
    }

    public static jq5 a(int i, Bitmap bitmap) {
        w5f a;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        jq5 jq5Var = new jq5(i, bitmap);
        int height = bitmap.getHeight();
        int width = bitmap.getWidth();
        int allocationByteCount = bitmap.getAllocationByteCount();
        synchronized (q6f.class) {
            a = q6f.a(new b5f());
        }
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
        lqe lqeVar = lqe.b;
        Task task = a.e;
        long elapsedRealtime3 = SystemClock.elapsedRealtime();
        HashMap hashMap = a.i;
        if (hashMap.get(lqeVar) != null && elapsedRealtime3 - ((Long) hashMap.get(lqeVar)).longValue() <= 30000) {
            return jq5Var;
        }
        hashMap.put(lqeVar, Long.valueOf(elapsedRealtime3));
        gd4 gd4Var = new gd4();
        gd4Var.c = eoe.b;
        gd4Var.b = fpe.b;
        gd4Var.d = Integer.valueOf(allocationByteCount & ConnectionsManager.DEFAULT_DATACENTER_ID);
        gd4Var.f = Integer.valueOf(height & ConnectionsManager.DEFAULT_DATACENTER_ID);
        gd4Var.e = Integer.valueOf(width & ConnectionsManager.DEFAULT_DATACENTER_ID);
        gd4Var.a = Long.valueOf(elapsedRealtime2 & Long.MAX_VALUE);
        gd4Var.g = Integer.valueOf(i & ConnectionsManager.DEFAULT_DATACENTER_ID);
        ope opeVar = new ope(gd4Var);
        htd htdVar = new htd((byte) 7);
        htdVar.d = opeVar;
        xnb.c(1, new uy1(a, new zhc(htdVar), task.isSuccessful() ? (String) task.getResult() : v26.c.a(a.g)));
        return jq5Var;
    }
}
