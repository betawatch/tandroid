package ai;

import java.util.ArrayList;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class s {
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

    public s(String str, String[] strArr, long j3) {
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
