package hd;

import c8.f0;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public abstract class g extends f0 {
    public static int b(List list) {
        kotlin.jvm.internal.j.e(list, "<this>");
        return list.size() - 1;
    }

    public static List c(Object... objArr) {
        if (objArr.length <= 0) {
            return n.a;
        }
        List asList = Arrays.asList(objArr);
        kotlin.jvm.internal.j.d(asList, "asList(...)");
        return asList;
    }
}
