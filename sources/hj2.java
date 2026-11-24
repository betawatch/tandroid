// default package

import j$.util.DesugarCollections;
import java.lang.ref.ReferenceQueue;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class hj2 {
    public final ReferenceQueue a = new ReferenceQueue();
    public final Set b = DesugarCollections.synchronizedSet(new HashSet());
}
