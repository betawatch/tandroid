package c2;

import android.content.ComponentName;
import java.util.ArrayList;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class a0 {
    public final t a;
    public final ArrayList b = new ArrayList();
    public final boolean c;
    public final o5.i d;
    public u e;

    public a0(t tVar, boolean z4) {
        this.a = tVar;
        this.d = (o5.i) tVar.d;
        this.c = z4;
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
