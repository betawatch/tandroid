package m1;

import java.io.File;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class l extends kotlin.jvm.internal.k implements rd.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ b0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(b0 b0Var, int i7) {
        super(0);
        this.b = i7;
        this.c = b0Var;
    }

    @Override // rd.a
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return ((i0) this.c.j.getValue()).c;
            default:
                f0 f0Var = this.c.a;
                File canonicalFile = ((File) f0Var.c.invoke()).getCanonicalFile();
                synchronized (f0.e) {
                    String path = canonicalFile.getAbsolutePath();
                    LinkedHashSet linkedHashSet = f0.d;
                    if (linkedHashSet.contains(path)) {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + path + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                    kotlin.jvm.internal.j.d(path, "path");
                    linkedHashSet.add(path);
                }
                return new i0(canonicalFile, f0Var.a, (m0) f0Var.b.invoke(canonicalFile), new androidx.lifecycle.k0(canonicalFile, 1));
        }
    }
}
