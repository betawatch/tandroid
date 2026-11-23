package hd;

import java.util.Collection;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public abstract class h extends g {
    public static int d(Iterable iterable, int i7) {
        kotlin.jvm.internal.j.e(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i7;
    }
}
