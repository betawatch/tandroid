// default package

import android.os.Looper;
import android.util.SparseArray;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class fjd implements OnCompleteListener, Runnable {
    public static final q79 d = new q79(Looper.getMainLooper());
    public static final SparseArray e = new SparseArray(2);
    public static final AtomicInteger f = new AtomicInteger();
    public int a;
    public jpd b;
    public Task c;

    public final void a() {
        if (this.c == null || this.b == null) {
            return;
        }
        e.delete(this.a);
        d.removeCallbacks(this);
        jpd jpdVar = this.b;
        if (jpdVar != null) {
            Task task = this.c;
            int i = jpd.d;
            jpdVar.a(task);
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        this.c = task;
        a();
    }

    @Override // java.lang.Runnable
    public final void run() {
        e.delete(this.a);
    }
}
