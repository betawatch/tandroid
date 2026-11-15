package hi;

import java.util.TimeZone;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public abstract class qb {
    public static String a;
    public static pb b;

    public static boolean a() {
        String id2 = TimeZone.getDefault().getID();
        return (id2.startsWith("US/") || "America/Nassau".equals(id2) || "America/Belize".equals(id2) || "America/Cayman".equals(id2) || "Pacific/Palau".equals(id2)) ? false : true;
    }
}
