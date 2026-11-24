// default package

import java.util.Date;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class nce {
    public static long a(Date date) {
        return (date.getTime() / 1000) + 2082844800;
    }

    public static Date b(long j) {
        return new Date((j - 2082844800) * 1000);
    }
}
