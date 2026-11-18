package ca;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class q {
    public ArrayList a;
    public int b;

    public synchronized List a() {
        return DesugarCollections.unmodifiableList(new ArrayList(this.a));
    }
}
