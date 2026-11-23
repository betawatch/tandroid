package m1;

import java.io.File;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class e0 extends kotlin.jvm.internal.k implements rd.l {
    public static final e0 b = new e0(1);

    @Override // rd.l
    public final Object invoke(Object obj) {
        File it = (File) obj;
        kotlin.jvm.internal.j.e(it, "it");
        String absolutePath = it.getCanonicalFile().getAbsolutePath();
        kotlin.jvm.internal.j.d(absolutePath, "file.canonicalFile.absolutePath");
        return new d1(absolutePath);
    }
}
