package g6;

import b6.m;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.api.n;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Arrays;
import o5.i;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class g extends j {
    public static final com.google.android.gms.common.api.e k = new com.google.android.gms.common.api.e("ModuleInstall.API", new a8.j(7), new com.google.android.gms.common.api.d());

    public final Task f(n... nVarArr) {
        m.a("Please provide at least one OptionalModuleApi.", nVarArr.length > 0);
        for (n nVar : nVarArr) {
            m.i(nVar, "Requested API must not be null.");
        }
        a e = a.e(Arrays.asList(nVarArr), false);
        if (e.a.isEmpty()) {
            return Tasks.forResult(new f6.a(0, true));
        }
        v e6 = w.e();
        e6.d = new y5.c[]{y6.b.c};
        e6.a = 27301;
        e6.b = false;
        e6.c = new i(this, e);
        return e(0, e6.e());
    }
}
