package b5;

import android.os.Build;
import java.util.HashSet;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public abstract class c implements e {
    public static final HashSet c = new HashSet();
    public final String a;
    public final String b;

    public c(String str, String str2) {
        this.a = str;
        this.b = str2;
        c.add(this);
    }

    public abstract boolean a();

    public boolean b() {
        HashSet hashSet = a.a;
        String str = this.b;
        if (hashSet.contains(str)) {
            return true;
        }
        String str2 = Build.TYPE;
        if (!"eng".equals(str2) && !"userdebug".equals(str2)) {
            return false;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(":dev");
        return hashSet.contains(sb2.toString());
    }
}
