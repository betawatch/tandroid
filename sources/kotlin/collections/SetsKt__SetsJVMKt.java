package kotlin.collections;

import java.util.Collections;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
abstract class SetsKt__SetsJVMKt {
    public static final Set setOf(Object obj) {
        Set singleton = Collections.singleton(obj);
        Intrinsics.checkNotNullExpressionValue(singleton, "singleton(...)");
        return singleton;
    }
}
