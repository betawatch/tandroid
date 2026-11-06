package ke;

import java.util.List;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class b extends c {
    public final List a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(List missingFields, String str, b bVar) {
        super(str, bVar);
        j.e(missingFields, "missingFields");
        this.a = missingFields;
    }
}
