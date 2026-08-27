package g8;

import android.os.Looper;
import android.util.SparseArray;
import c2.t0;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class t implements OnCompleteListener, Runnable {
    public static final t0 d = new t0(Looper.getMainLooper());
    public static final SparseArray e = new SparseArray(2);
    public static final AtomicInteger f = new AtomicInteger();
    public int a;
    public u b;
    public Task c;

    public final void a() {
        if (this.c == null || this.b == null) {
            return;
        }
        e.delete(this.a);
        d.removeCallbacks(this);
        u uVar = this.b;
        if (uVar != null) {
            Task task = this.c;
            int i10 = u.d;
            uVar.a(task);
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
