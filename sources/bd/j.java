package bd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class j {
    public static int a(List list) {
        kotlin.jvm.internal.i.e(list, "<this>");
        return list.size() - 1;
    }

    public static List b(Object obj) {
        List singletonList = Collections.singletonList(obj);
        kotlin.jvm.internal.i.d(singletonList, "singletonList(...)");
        return singletonList;
    }

    public static List c(Object... objArr) {
        if (objArr.length <= 0) {
            return q.a;
        }
        List asList = Arrays.asList(objArr);
        kotlin.jvm.internal.i.d(asList, "asList(...)");
        return asList;
    }
}
