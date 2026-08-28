package androidx.lifecycle;

import java.io.File;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class k0 extends kotlin.jvm.internal.j implements zc.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(Object obj, int i9) {
        super(0);
        this.b = i9;
        this.c = obj;
    }

    @Override // zc.a
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return j0.e((u0) this.c);
            case 1:
                File file = (File) ((k1.z) this.c).a.invoke();
                String it = file.getAbsolutePath();
                synchronized (k1.z.s) {
                    LinkedHashSet linkedHashSet = k1.z.r;
                    if (linkedHashSet.contains(it)) {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + file + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                    kotlin.jvm.internal.i.d(it, "it");
                    linkedHashSet.add(it);
                }
                return file;
            default:
                File file2 = (File) ((m1.b) this.c).invoke();
                String name = file2.getName();
                kotlin.jvm.internal.i.d(name, "getName(...)");
                if (fd.j.j(name, "").equals("preferences_pb")) {
                    return file2;
                }
                throw new IllegalStateException(("File extension for file: " + file2 + " does not match required extension for Preferences file: preferences_pb").toString());
        }
    }
}
