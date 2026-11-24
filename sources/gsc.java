// default package

import java.util.TimeZone;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public abstract class gsc {
    public static String a;
    public static fsc b;

    public static boolean a() {
        String id = TimeZone.getDefault().getID();
        return (id.startsWith("US/") || "America/Nassau".equals(id) || "America/Belize".equals(id) || "America/Cayman".equals(id) || "Pacific/Palau".equals(id)) ? false : true;
    }
}
