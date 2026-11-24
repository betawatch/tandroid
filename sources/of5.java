// default package

import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class of5 {
    public final nf5 a;
    public final HashMap b;
    public final ArrayList c;
    public String d;

    public of5(nf5 nf5Var, String str, Uri uri, int i) {
        this.a = nf5Var;
        HashMap hashMap = new HashMap();
        this.b = hashMap;
        hashMap.put(str, uri);
        this.d = str;
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        if (i != -1) {
            arrayList.add(Integer.valueOf(i));
        }
    }

    public final ym5 a() {
        return ym5.q(this.b.keySet());
    }

    public final Uri b() {
        Uri uri = (Uri) this.b.get(this.d);
        uri.getClass();
        return uri;
    }
}
