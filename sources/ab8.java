// default package

import android.os.Bundle;
import android.os.Looper;
import j$.util.DesugarCollections;
import java.util.Map;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class ab8 {
    public byte a;
    public Object b;
    public Object c;

    public ab8() {
        this.b = DesugarCollections.synchronizedMap(new ps(0));
        this.a = (byte) 0;
    }

    public final void a(String str, y06 y06Var) {
        Map map = (Map) this.b;
        if (map.containsKey(str)) {
            w26.j(ls6.o("LifecycleCallback with tag ", str, " already added to this fragment.", new StringBuilder(str.length() + 59)));
            return;
        }
        map.put(str, y06Var);
        if (this.a > 0) {
            new o59(Looper.getMainLooper(), (byte) 4).post(new ey1((Object) this, (Object) y06Var, (Object) str, (byte) 5));
        }
    }

    public final void b(Bundle bundle) {
        this.a = (byte) 1;
        this.c = bundle;
        for (Map.Entry entry : ((Map) this.b).entrySet()) {
            ((y06) entry.getValue()).onCreate(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public final void c(Bundle bundle) {
        if (bundle != null) {
            for (Map.Entry entry : ((Map) this.b).entrySet()) {
                Bundle bundle2 = new Bundle();
                ((y06) entry.getValue()).onSaveInstanceState(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ab8(int i) {
        this.a = i;
    }
}
