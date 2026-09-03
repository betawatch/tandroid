package cb;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
