package k1;

import java.io.FileInputStream;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class v extends tc.c {
    public z a;
    public FileInputStream b;
    public /* synthetic */ Object c;
    public final /* synthetic */ z d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(z zVar, tc.c cVar) {
        super(cVar);
        this.d = zVar;
    }

    @Override // tc.a
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= TLObject.FLAG_31;
        return this.d.g(this);
    }
}
