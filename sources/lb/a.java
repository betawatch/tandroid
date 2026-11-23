package lb;

import q6.m;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class a extends Exception {
    public final int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str, int i7) {
        super(str);
        m.g(str, "Provided message must not be empty.");
        this.a = i7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str, Throwable th2) {
        super(str, th2);
        m.g(str, "Provided message must not be empty.");
        this.a = 13;
    }
}
