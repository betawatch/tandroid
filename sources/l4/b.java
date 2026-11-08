package l4;

import java.util.Set;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
