package j$.util;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class e extends RuntimeException {
    public static void a(String str, Serializable serializable) {
        throw new e("Unsupported " + str + " :" + serializable);
    }
}
