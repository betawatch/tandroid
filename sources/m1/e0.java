package m1;

import java.io.File;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
