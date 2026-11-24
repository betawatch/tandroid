// default package

import android.content.Context;
import android.os.Build;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ac3 implements of5, pf5 {
    public final e26 a;
    public final Context b;
    public final nv8 c;
    public final Set d;
    public final Executor e;

    public ac3(Context context, String str, Set set, nv8 nv8Var, Executor executor) {
        this.a = new e26(new or2(context, str, (byte) 1));
        this.d = set;
        this.e = executor;
        this.c = nv8Var;
        this.b = context;
    }

    public final synchronized int a() {
        long currentTimeMillis = System.currentTimeMillis();
        rf5 rf5Var = (rf5) this.a.get();
        if (!rf5Var.g(currentTimeMillis)) {
            return 1;
        }
        rf5Var.e();
        return 3;
    }

    public final Task b() {
        if (Build.VERSION.SDK_INT >= 24 ? ki0.j(this.b) : true) {
            return Tasks.call(this.e, new zb3(this, (byte) 0));
        }
        return Tasks.forResult("");
    }

    public final void c() {
        if (this.d.size() <= 0) {
            Tasks.forResult(null);
            return;
        }
        if (Build.VERSION.SDK_INT >= 24 ? ki0.j(this.b) : true) {
            Tasks.call(this.e, new zb3(this, (byte) 1));
        } else {
            Tasks.forResult(null);
        }
    }
}
