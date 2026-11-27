// default package

import android.content.ComponentName;
import java.util.ArrayList;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class iw6 {
    public final bw6 a;
    public final ArrayList b = new ArrayList();
    public final boolean c;
    public final xh4 d;
    public fo4 e;

    public iw6(bw6 bw6Var, boolean z) {
        this.a = bw6Var;
        this.d = (xh4) bw6Var.d;
        this.c = z;
    }

    public final jw6 a(String str) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            jw6 jw6Var = (jw6) obj;
            if (jw6Var.b.equals(str)) {
                return jw6Var;
            }
        }
        return null;
    }

    public final String toString() {
        return "MediaRouter.RouteProviderInfo{ packageName=" + ((ComponentName) this.d.b).getPackageName() + " }";
    }
}
