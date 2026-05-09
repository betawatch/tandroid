package androidx.car.app.utils;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class CollectionUtils {
    public static List emptyIfNull(List list) {
        return list != null ? list : Collections.emptyList();
    }

    public static List unmodifiableCopy(List list) {
        return list == null ? Collections.emptyList() : DesugarCollections.unmodifiableList(new ArrayList(list));
    }
}
