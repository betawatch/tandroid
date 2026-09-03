package cb;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class n extends PhantomReference {
    public final Set a;
    public final androidx.emoji2.text.n b;

    public /* synthetic */ n(a aVar, ReferenceQueue referenceQueue, Set set, androidx.emoji2.text.n nVar) {
        super(aVar, referenceQueue);
        this.a = set;
        this.b = nVar;
    }
}
