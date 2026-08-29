package c2;

import android.content.ComponentName;
import java.util.ArrayList;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class a0 {
    public final t a;
    public final ArrayList b = new ArrayList();
    public final boolean c;
    public final m5.i d;
    public u e;

    public a0(t tVar, boolean z10) {
        this.a = tVar;
        this.d = (m5.i) tVar.d;
        this.c = z10;
    }

    public final b0 a(String str) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            b0 b0Var = (b0) obj;
            if (b0Var.b.equals(str)) {
                return b0Var;
            }
        }
        return null;
    }

    public final String toString() {
        return "MediaRouter.RouteProviderInfo{ packageName=" + ((ComponentName) this.d.b).getPackageName() + " }";
    }
}
