package ke;

import java.util.List;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
