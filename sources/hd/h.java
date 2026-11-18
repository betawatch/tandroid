package hd;

import java.util.Collection;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public abstract class h extends g {
    public static int d(Iterable iterable, int i7) {
        kotlin.jvm.internal.j.e(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i7;
    }
}
