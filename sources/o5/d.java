package o5;

import android.os.AsyncTask;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class d {
    public w1.a a;
    public boolean b = false;
    public boolean c = false;
    public boolean d = true;
    public boolean e = false;
    public Executor f;
    public volatile x1.a g;
    public volatile x1.a h;
    public final Semaphore i;
    public final Set j;

    public d(SignInHubActivity signInHubActivity, Set set) {
        signInHubActivity.getApplicationContext();
        this.i = new Semaphore(0);
        this.j = set;
    }

    public final void a() {
        if (this.g != null) {
            boolean z4 = this.b;
            if (!z4) {
                if (z4) {
                    c();
                } else {
                    this.e = true;
                }
            }
            if (this.h != null) {
                this.g.getClass();
                this.g = null;
                return;
            }
            this.g.getClass();
            x1.a aVar = this.g;
            aVar.c.set(true);
            if (aVar.a.cancel(false)) {
                this.h = this.g;
            }
            this.g = null;
        }
    }

    public final void b() {
        if (this.h != null || this.g == null) {
            return;
        }
        this.g.getClass();
        if (this.f == null) {
            this.f = AsyncTask.THREAD_POOL_EXECUTOR;
        }
        x1.a aVar = this.g;
        Executor executor = this.f;
        if (aVar.b == 1) {
            aVar.b = 2;
            executor.execute(aVar.a);
            return;
        }
        int b10 = m1.j.b(aVar.b);
        if (b10 == 1) {
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (b10 == 2) {
            throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
        }
        throw new IllegalStateException("We should never reach this state");
    }

    public final void c() {
        a();
        this.g = new x1.a(this);
        b();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        Class<?> cls = getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(cls)));
        sb.append(" id=0}");
        return sb.toString();
    }
}
