package c2;

import android.content.ComponentName;
import java.util.ArrayList;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class y {
    public final s a;
    public final ArrayList b = new ArrayList();
    public final boolean c;
    public final k5.i d;
    public t e;

    public y(s sVar, boolean z10) {
        this.a = sVar;
        this.d = (k5.i) sVar.d;
        this.c = z10;
    }

    public final z a(String str) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            z zVar = (z) obj;
            if (zVar.b.equals(str)) {
                return zVar;
            }
        }
        return null;
    }

    public final String toString() {
        return "MediaRouter.RouteProviderInfo{ packageName=" + ((ComponentName) this.d.b).getPackageName() + " }";
    }
}
