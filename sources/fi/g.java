package fi;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class g {
    public static final g b = new g(-1);
    public final int a;

    public g(int i10) {
        if (i10 != -1 && i10 <= 0) {
            throw new IllegalArgumentException("height must be positive or -1");
        }
        this.a = i10;
    }
}
