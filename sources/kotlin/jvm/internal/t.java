package kotlin.jvm.internal;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class t {
    public static String a(g gVar) {
        String obj = gVar.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }
}
