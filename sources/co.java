// default package

import android.os.Build;
import java.util.HashSet;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class co {
    public static final HashSet c = new HashSet();
    public final String a;
    public final String b;

    public co(String str, String str2) {
        this.a = str;
        this.b = str2;
        c.add(this);
    }

    public boolean a() {
        return Build.VERSION.SDK_INT >= 33;
    }

    public boolean b() {
        HashSet hashSet = ao.a;
        String str = this.b;
        if (hashSet.contains(str)) {
            return true;
        }
        String str2 = Build.TYPE;
        return ("eng".equals(str2) || "userdebug".equals(str2)) && hashSet.contains(str.concat(":dev"));
    }
}
