package androidx.lifecycle;

import android.os.Bundle;
import java.util.Map;
import k7.p7;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class l0 implements g2.d {
    public final g2.e a;
    public boolean b;
    public Bundle c;
    public final sc.g d;

    public l0(g2.e savedStateRegistry, u0 u0Var) {
        kotlin.jvm.internal.j.e(savedStateRegistry, "savedStateRegistry");
        this.a = savedStateRegistry;
        this.d = p7.a(new k0(u0Var, 0));
    }

    @Override // g2.d
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : ((m0) this.d.a()).d.entrySet()) {
            String str = (String) entry.getKey();
            Bundle a2 = ((i0) entry.getValue()).e.a();
            if (!kotlin.jvm.internal.j.a(a2, Bundle.EMPTY)) {
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
        Bundle c3 = this.a.c("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (c3 != null) {
            bundle.putAll(c3);
        }
        this.c = bundle;
        this.b = true;
    }
}
