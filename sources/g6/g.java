package g6;

import b6.m;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.api.n;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Arrays;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class g extends j {
    public static final com.google.android.gms.common.api.e k = new com.google.android.gms.common.api.e("ModuleInstall.API", new a8.j(7), new com.google.android.gms.common.api.d());

    public final Task f(n... nVarArr) {
        m.a("Please provide at least one OptionalModuleApi.", nVarArr.length > 0);
        for (n nVar : nVarArr) {
            m.i(nVar, "Requested API must not be null.");
        }
        a e6 = a.e(Arrays.asList(nVarArr), false);
        if (e6.a.isEmpty()) {
            return Tasks.forResult(new f6.a(0, true));
        }
        v e10 = w.e();
        e10.d = new y5.c[]{y6.b.c};
        e10.a = 27301;
        e10.b = false;
        e10.c = new y5.h(this, e6);
        return e(0, e10.e());
    }
}
