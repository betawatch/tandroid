package ai;

import java.util.ArrayList;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
