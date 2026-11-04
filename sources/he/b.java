package he;

import java.util.List;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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
