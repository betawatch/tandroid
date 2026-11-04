package androidx.lifecycle;

import java.io.File;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class k0 extends kotlin.jvm.internal.k implements od.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(Object obj, int i3) {
        super(0);
        this.b = i3;
        this.c = obj;
    }

    @Override // od.a
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return j0.e((u0) this.c);
            case 1:
                Object obj = l1.f0.e;
                File file = (File) this.c;
                synchronized (obj) {
                    l1.f0.d.remove(file.getAbsolutePath());
                }
                return dd.k.a;
            case 2:
                ((wd.l0) this.c).dispose();
                return dd.k.a;
            default:
                File file2 = (File) ((n1.a) this.c).invoke();
                String name = file2.getName();
                kotlin.jvm.internal.j.d(name, "getName(...)");
                if (ud.d.m(name, "").equals("preferences_pb")) {
                    File absoluteFile = file2.getAbsoluteFile();
                    kotlin.jvm.internal.j.d(absoluteFile, "file.absoluteFile");
                    return absoluteFile;
                }
                throw new IllegalStateException(("File extension for file: " + file2 + " does not match required extension for Preferences file: preferences_pb").toString());
        }
    }
}
