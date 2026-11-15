package ke;

import java.util.List;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
