// default package

import android.os.AsyncTask;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class m8d {
    public sa6 a;
    public boolean b = false;
    public boolean c = false;
    public boolean d = true;
    public boolean e = false;
    public Executor f;
    public volatile ox g;
    public volatile ox h;
    public final Semaphore i;
    public final Set j;

    public m8d(SignInHubActivity signInHubActivity, Set set) {
        signInHubActivity.getApplicationContext();
        this.i = new Semaphore(0);
        this.j = set;
    }

    public final void a() {
        if (this.h != null || this.g == null) {
            return;
        }
        this.g.getClass();
        if (this.f == null) {
            this.f = AsyncTask.THREAD_POOL_EXECUTOR;
        }
        ox oxVar = this.g;
        Executor executor = this.f;
        if (oxVar.b == 1) {
            oxVar.b = 2;
            executor.execute(oxVar.a);
            return;
        }
        int F = ik8.F(oxVar.b);
        if (F == 1) {
            grb.i("Cannot execute task: the task is already running.");
        } else if (F != 2) {
            grb.i("We should never reach this state");
        } else {
            grb.i("Cannot execute task: the task has already been executed (a task can be executed only once)");
        }
    }

    public final boolean b() {
        if (this.g == null) {
            return false;
        }
        boolean z = this.b;
        if (!z) {
            if (z) {
                c();
            } else {
                this.e = true;
            }
        }
        ox oxVar = this.h;
        ox oxVar2 = this.g;
        if (oxVar != null) {
            oxVar2.getClass();
            this.g = null;
            return false;
        }
        oxVar2.getClass();
        ox oxVar3 = this.g;
        oxVar3.c.set(true);
        boolean cancel = oxVar3.a.cancel(false);
        if (cancel) {
            this.h = this.g;
        }
        this.g = null;
        return cancel;
    }

    public final void c() {
        b();
        this.g = new ox(this);
        a();
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
