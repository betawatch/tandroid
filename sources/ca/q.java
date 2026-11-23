package ca;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class q {
    public ArrayList a;
    public int b;

    public synchronized List a() {
        return DesugarCollections.unmodifiableList(new ArrayList(this.a));
    }
}
