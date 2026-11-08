package ke;

import java.util.List;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
