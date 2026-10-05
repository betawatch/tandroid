package i4;

import java.util.Set;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final class b {
    public String a;
    public String b;
    public Set c;
    public String d;
    public String e;
    public int f;
    public boolean g;
    public int h;
    public boolean i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public float o;
    public int p;
    public boolean q;

    public static int a(int i10, int i11, String str, String str2) {
        if (str.isEmpty() || i10 == -1) {
            return i10;
        }
        if (str.equals(str2)) {
            return i10 + i11;
        }
        return -1;
    }
}
