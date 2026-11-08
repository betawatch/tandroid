package androidx.lifecycle;

import java.io.File;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class k0 extends kotlin.jvm.internal.k implements rd.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(Object obj, int i7) {
        super(0);
        this.b = i7;
        this.c = obj;
    }

    @Override // rd.a
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return j0.e((u0) this.c);
            case 1:
                Object obj = m1.f0.e;
                File file = (File) this.c;
                synchronized (obj) {
                    m1.f0.d.remove(file.getAbsolutePath());
                }
                return gd.k.a;
            case 2:
                ((zd.l0) this.c).dispose();
                return gd.k.a;
            default:
                File file2 = (File) ((o1.a) this.c).invoke();
                String name = file2.getName();
                kotlin.jvm.internal.j.d(name, "getName(...)");
                if (xd.d.m(name, "").equals("preferences_pb")) {
                    File absoluteFile = file2.getAbsoluteFile();
                    kotlin.jvm.internal.j.d(absoluteFile, "file.absoluteFile");
                    return absoluteFile;
                }
                throw new IllegalStateException(("File extension for file: " + file2 + " does not match required extension for Preferences file: preferences_pb").toString());
        }
    }
}
