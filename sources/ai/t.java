package ai;

import java.util.ArrayList;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class t {
    public final String a;
    public final String[] b;
    public volatile long c;
    public volatile long d;
    public int e;
    public boolean g;
    public boolean h;
    public volatile float i;
    public final ArrayList f = new ArrayList();
    public final ArrayList j = new ArrayList();

    public t(String str, String[] strArr, long j3) {
        this.a = str;
        this.b = strArr;
        this.c = j3;
    }

    public final String a() {
        return a8.p0.s(new StringBuilder(), this.a, ".tzf");
    }

    public final boolean b(String str) {
        for (String str2 : this.b) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }
}
