package j$.util;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes4.dex */
public final class g extends RuntimeException {
    public static void a(Object obj, String str) {
        throw new g("Unsupported " + str + " :" + obj);
    }
}
