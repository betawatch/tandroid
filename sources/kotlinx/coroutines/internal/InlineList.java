package kotlinx.coroutines.internal;

import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class InlineList {
    public static Object constructor-impl(Object obj) {
        return obj;
    }

    public static /* synthetic */ Object constructor-impl$default(Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            obj = null;
        }
        return constructor-impl(obj);
    }

    public static final Object plus-FjFbRPM(Object obj, Object obj2) {
        if (obj == null) {
            return constructor-impl(obj2);
        }
        if (obj instanceof ArrayList) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
            ((ArrayList) obj).add(obj2);
            return constructor-impl(obj);
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return constructor-impl(arrayList);
    }
}
