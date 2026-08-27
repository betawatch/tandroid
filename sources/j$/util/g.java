package j$.util;

/* loaded from: classes2.dex */
public final class g extends RuntimeException {
    public static void a(Object obj, String str) {
        throw new g("Unsupported " + str + " :" + obj);
    }
}
