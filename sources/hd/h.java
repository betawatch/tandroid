package hd;

import java.util.Collection;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public abstract class h extends g {
    public static int d(Iterable iterable, int i7) {
        kotlin.jvm.internal.j.e(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i7;
    }
}
