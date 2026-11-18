package m1;

import java.io.FileInputStream;
import java.nio.channels.FileLock;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class s0 extends kd.c {
    public ie.d a;
    public FileInputStream b;
    public FileLock c;
    public boolean d;
    public /* synthetic */ Object e;
    public final /* synthetic */ t0 f;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(t0 t0Var, kd.c cVar) {
        super(cVar);
        this.f = t0Var;
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.h |= TLObject.FLAG_31;
        return this.f.a(null, this);
    }
}
