package org.telegram.messenger;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class k00 {
    public final String c;
    public int d;
    public final /* synthetic */ l00 e;
    public long b = -1;
    public final long a = System.currentTimeMillis();

    public k00(l00 l00Var, String str) {
        this.e = l00Var;
        this.c = str;
        l00Var.a++;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.c);
        sb2.append(": ");
        sb2.append(this.b < 0 ? "not done" : a1.g.q(new StringBuilder(), this.b - this.a, "ms"));
        return sb2.toString();
    }
}
