package hd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public abstract class h {
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
            return o.a;
        }
        List asList = Arrays.asList(objArr);
        kotlin.jvm.internal.i.d(asList, "asList(...)");
        return asList;
    }
}
