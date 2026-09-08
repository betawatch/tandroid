package androidx.lifecycle;

import android.os.Bundle;
import java.util.Map;
import v7.s7;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class l0 implements t4.d {
    public final m.p a;
    public boolean b;
    public Bundle c;
    public final gd.g d;

    public l0(m.p savedStateRegistry, u0 u0Var) {
        kotlin.jvm.internal.i.e(savedStateRegistry, "savedStateRegistry");
        this.a = savedStateRegistry;
        this.d = s7.a(new k0(u0Var, 0));
    }

    @Override // t4.d
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : ((m0) this.d.a()).d.entrySet()) {
            String str = (String) entry.getKey();
            Bundle a2 = ((i0) entry.getValue()).e.a();
            if (!kotlin.jvm.internal.i.a(a2, Bundle.EMPTY)) {
                bundle.putBundle(str, a2);
            }
        }
        this.b = false;
        return bundle;
    }

    public final void b() {
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
}
