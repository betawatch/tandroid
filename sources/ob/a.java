package ob;

import o6.l;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class a extends Exception {
    public final int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str, int i10) {
        super(str);
        l.g(str, "Provided message must not be empty.");
        this.a = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str, Throwable th2) {
        super(str, th2);
        l.g(str, "Provided message must not be empty.");
        this.a = 13;
    }
}
