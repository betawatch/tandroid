package c2;

import android.content.ComponentName;
import java.util.ArrayList;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class z {
    public final t a;
    public final ArrayList b = new ArrayList();
    public final boolean c;
    public final y5.h d;
    public u e;

    public z(t tVar, boolean z4) {
        this.a = tVar;
        this.d = (y5.h) tVar.d;
        this.c = z4;
    }

    public final a0 a(String str) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            a0 a0Var = (a0) obj;
            if (a0Var.b.equals(str)) {
                return a0Var;
            }
        }
        return null;
    }

    public final String toString() {
        return "MediaRouter.RouteProviderInfo{ packageName=" + ((ComponentName) this.d.b).getPackageName() + " }";
    }
}
