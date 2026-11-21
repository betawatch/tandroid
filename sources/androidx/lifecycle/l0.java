package androidx.lifecycle;

import android.os.Bundle;
import java.util.Map;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final class l0 implements w4.d {
    public final m.p a;
    public boolean b;
    public Bundle c;
    public final gd.i d;

    public l0(m.p savedStateRegistry, u0 u0Var) {
        kotlin.jvm.internal.j.e(savedStateRegistry, "savedStateRegistry");
        this.a = savedStateRegistry;
        this.d = b5.a.c(new k0(u0Var, 0));
    }

    public final void a() {
        if (this.b) {
            return;
        }
        Bundle c10 = this.a.c("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (c10 != null) {
            bundle.putAll(c10);
        }
        this.c = bundle;
        this.b = true;
    }

    @Override // w4.d
    public final Bundle c() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : ((m0) this.d.getValue()).d.entrySet()) {
            String str = (String) entry.getKey();
            Bundle c10 = ((i0) entry.getValue()).e.c();
            if (!kotlin.jvm.internal.j.a(c10, Bundle.EMPTY)) {
                bundle.putBundle(str, c10);
            }
        }
        this.b = false;
        return bundle;
    }
}
