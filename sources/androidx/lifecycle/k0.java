package androidx.lifecycle;

import java.io.File;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class k0 extends kotlin.jvm.internal.j implements rd.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(Object obj, int i10) {
        super(0);
        this.b = i10;
        this.c = obj;
    }

    @Override // rd.a
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return j0.e((u0) this.c);
            case 1:
                File file = (File) ((k1.a0) this.c).a.invoke();
                String it = file.getAbsolutePath();
                synchronized (k1.a0.s) {
                    LinkedHashSet linkedHashSet = k1.a0.r;
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
                if (xd.j.j(name, "").equals("preferences_pb")) {
                    return file2;
                }
                throw new IllegalStateException(("File extension for file: " + file2 + " does not match required extension for Preferences file: preferences_pb").toString());
        }
    }
}
