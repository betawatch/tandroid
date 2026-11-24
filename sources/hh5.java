// default package

import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class hh5 implements jg4 {
    public final String a;
    public final List b;
    public final boolean c;

    public hh5(String str, List list, boolean z) {
        this.a = str;
        this.b = DesugarCollections.unmodifiableList(list);
        this.c = z;
    }
}
