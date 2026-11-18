package m1;

import java.io.FileInputStream;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class c0 extends kd.c {
    public Object a;
    public FileInputStream b;
    public /* synthetic */ Object c;
    public final /* synthetic */ d0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(d0 d0Var, kd.c cVar) {
        super(cVar);
        this.d = d0Var;
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= TLObject.FLAG_31;
        return d0.a(this.d, this);
    }
}
