package org.telegram.messenger;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public class l00 {
    public final String c;
    public int d;
    public final /* synthetic */ m00 e;
    public long b = -1;
    public final long a = System.currentTimeMillis();

    public l00(m00 m00Var, String str) {
        this.e = m00Var;
        this.c = str;
        m00Var.a++;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.c);
        sb2.append(": ");
        sb2.append(this.b < 0 ? "not done" : a1.g.q(new StringBuilder(), this.b - this.a, "ms"));
        return sb2.toString();
    }
}
