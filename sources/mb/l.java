package mb;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class l extends PhantomReference {
    public final Set a;
    public final androidx.emoji2.text.o b;

    public /* synthetic */ l(a aVar, ReferenceQueue referenceQueue, Set set, androidx.emoji2.text.o oVar) {
        super(aVar, referenceQueue);
        this.a = set;
        this.b = oVar;
    }
}
