package l4;

import java.util.Set;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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

    public static int a(int i7, int i10, String str, String str2) {
        if (str.isEmpty() || i7 == -1) {
            return i7;
        }
        if (str.equals(str2)) {
            return i7 + i10;
        }
        return -1;
    }
}
