// default package

import android.os.Bundle;
import android.os.Looper;
import j$.util.DesugarCollections;
import java.util.Map;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class dd8 {
    public byte a;
    public Object b;
    public Object c;

    public dd8() {
        this.b = DesugarCollections.synchronizedMap(new qt(0));
        this.a = (byte) 0;
    }

    public final void a(String str, y26 y26Var) {
        Map map = (Map) this.b;
        if (map.containsKey(str)) {
            u36.j(kt6.p("LifecycleCallback with tag ", str, " already added to this fragment.", new StringBuilder(str.length() + 59)));
            return;
        }
        map.put(str, y26Var);
        if (this.a > 0) {
            new q79(Looper.getMainLooper(), (byte) 4).post(new rz1((Object) this, (Object) y26Var, (Object) str, (byte) 5));
        }
    }

    public final void b(Bundle bundle) {
        this.a = (byte) 1;
        this.c = bundle;
        for (Map.Entry entry : ((Map) this.b).entrySet()) {
            ((y26) entry.getValue()).onCreate(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public final void c(Bundle bundle) {
        if (bundle != null) {
            for (Map.Entry entry : ((Map) this.b).entrySet()) {
                Bundle bundle2 = new Bundle();
                ((y26) entry.getValue()).onSaveInstanceState(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public dd8(int i) {
        this.a = i;
    }
}
