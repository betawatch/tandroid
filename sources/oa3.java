// default package

import android.content.Context;
import android.os.Build;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class oa3 implements qd5, rd5 {
    public final e06 a;
    public final Context b;
    public final mt8 c;
    public final Set d;
    public final Executor e;

    public oa3(Context context, String str, Set set, mt8 mt8Var, Executor executor) {
        this.a = new e06(new dq2(context, str, (byte) 1));
        this.d = set;
        this.e = executor;
        this.c = mt8Var;
        this.b = context;
    }

    public final synchronized int a() {
        long currentTimeMillis = System.currentTimeMillis();
        td5 td5Var = (td5) this.a.get();
        if (!td5Var.g(currentTimeMillis)) {
            return 1;
        }
        td5Var.e();
        return 3;
    }

    public final Task b() {
        if (Build.VERSION.SDK_INT >= 24 ? kh0.j(this.b) : true) {
            return Tasks.call(this.e, new na3(this, (byte) 0));
        }
        return Tasks.forResult("");
    }

    public final void c() {
        if (this.d.size() <= 0) {
            Tasks.forResult(null);
            return;
        }
        if (Build.VERSION.SDK_INT >= 24 ? kh0.j(this.b) : true) {
            Tasks.call(this.e, new na3(this, (byte) 1));
        } else {
            Tasks.forResult(null);
        }
    }
}
