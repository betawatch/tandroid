package lb;

import q6.m;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class a extends Exception {
    public final int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str, int i7) {
        super(str);
        m.f(str, "Provided message must not be empty.");
        this.a = i7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str, Throwable th2) {
        super(str, th2);
        m.f(str, "Provided message must not be empty.");
        this.a = 13;
    }
}
