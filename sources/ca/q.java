package ca;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class q {
    public ArrayList a;
    public int b;

    public synchronized List a() {
        return DesugarCollections.unmodifiableList(new ArrayList(this.a));
    }
}
