package c2;

import android.content.ComponentName;
import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class z {
    public final s a;
    public final ArrayList b = new ArrayList();
    public final boolean c;
    public final android.support.v4.media.c d;
    public t e;

    public z(s sVar, boolean z10) {
        this.a = sVar;
        this.d = (android.support.v4.media.c) sVar.d;
        this.c = z10;
    }

    public final a0 a(String str) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
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
