package hd;

import c8.f0;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
