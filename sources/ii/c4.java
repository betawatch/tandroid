package ii;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes4.dex */
public final class c4 {
    public String a;
    public boolean b;
    public String c;
    public HashMap d;
    public final ArrayList e = new ArrayList();

    public final String a(String str) {
        HashMap hashMap = this.d;
        if (hashMap == null) {
            return null;
        }
        return (String) hashMap.get(str);
    }

    public final boolean b(String str) {
        HashMap hashMap = this.d;
        return hashMap != null && hashMap.containsKey(str);
    }
}
