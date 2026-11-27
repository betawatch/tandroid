// default package

import java.util.Iterator;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class ad0 extends ax2 {
    public Iterator a;
    public /* synthetic */ Object b;
    public int c;

    @Override // qf0
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.c |= TLObject.FLAG_31;
        return ord.b(null, this);
    }
}
