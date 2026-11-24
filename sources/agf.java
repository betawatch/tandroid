// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class agf {
    public static z0f a;

    public static synchronized iff a(lef lefVar) {
        iff iffVar;
        synchronized (agf.class) {
            z0f z0fVar = a;
            if (z0fVar == null) {
                z0fVar = new z0f((byte) 3);
                a = z0fVar;
            }
            iffVar = (iff) z0fVar.c(lefVar);
        }
        return iffVar;
    }
}
