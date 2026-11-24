// default package

import java.util.Comparator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class hq2 {
    public static final fq2 a = new fq2();
    public static final gq2 b = new gq2(-1);
    public static final gq2 c = new gq2(1);

    public hq2 a(int i, int i2) {
        return fq2.f(Integer.compare(i, i2));
    }

    public hq2 b(Object obj, Object obj2, Comparator comparator) {
        return fq2.f(comparator.compare(obj, obj2));
    }

    public hq2 c(boolean z, boolean z2) {
        return fq2.f(Boolean.compare(z, z2));
    }

    public hq2 d(boolean z, boolean z2) {
        return fq2.f(Boolean.compare(z2, z));
    }

    public int e() {
        return 0;
    }
}
