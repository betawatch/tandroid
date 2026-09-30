package k1;

import java.io.File;
import java.io.FileOutputStream;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public final class z extends kd.c {
    public a0 a;
    public File b;
    public FileOutputStream c;
    public FileOutputStream d;
    public /* synthetic */ Object e;
    public final /* synthetic */ a0 f;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(a0 a0Var, kd.c cVar) {
        super(cVar);
        this.f = a0Var;
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.h |= TLObject.FLAG_31;
        return this.f.j(null, this);
    }
}
