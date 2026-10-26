package k1;

import java.io.FileInputStream;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class v extends nd.c {
    public z a;
    public FileInputStream b;
    public /* synthetic */ Object c;
    public final /* synthetic */ z d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(z zVar, nd.c cVar) {
        super(cVar);
        this.d = zVar;
    }

    @Override // nd.a
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= TLObject.FLAG_31;
        return this.d.f(this);
    }
}
