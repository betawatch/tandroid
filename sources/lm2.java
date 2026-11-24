// default package

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class lm2 {
    public static List a(Object obj) {
        List singletonList = Collections.singletonList(obj);
        singletonList.getClass();
        return singletonList;
    }

    public static List b(Object... objArr) {
        if (objArr.length <= 0) {
            return n34.a;
        }
        List asList = Arrays.asList(objArr);
        asList.getClass();
        return asList;
    }
}
