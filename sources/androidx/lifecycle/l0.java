package androidx.lifecycle;

import android.os.Bundle;
import b8.hb;
import java.util.Map;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class l0 implements v4.d {
    public final m.p a;
    public boolean b;
    public Bundle c;
    public final dd.i d;

    public l0(m.p savedStateRegistry, u0 u0Var) {
        kotlin.jvm.internal.j.e(savedStateRegistry, "savedStateRegistry");
        this.a = savedStateRegistry;
        this.d = hb.b(new k0(u0Var, 0));
    }

    public final void a() {
        if (this.b) {
            return;
        }
        Bundle c2 = this.a.c("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (c2 != null) {
            bundle.putAll(c2);
        }
        this.c = bundle;
        this.b = true;
    }

    @Override // v4.d
    public final Bundle c() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : ((m0) this.d.getValue()).d.entrySet()) {
            String str = (String) entry.getKey();
            Bundle c2 = ((i0) entry.getValue()).e.c();
            if (!kotlin.jvm.internal.j.a(c2, Bundle.EMPTY)) {
                bundle.putBundle(str, c2);
            }
        }
        this.b = false;
        return bundle;
    }
}
