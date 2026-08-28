package k1;

import java.io.File;
import java.io.FileOutputStream;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class y extends sc.c {
    public z a;
    public File b;
    public FileOutputStream c;
    public FileOutputStream d;
    public /* synthetic */ Object e;
    public final /* synthetic */ z f;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(z zVar, sc.c cVar) {
        super(cVar);
        this.f = zVar;
    }

    @Override // sc.a
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.h |= TLObject.FLAG_31;
        return this.f.j(null, this);
    }
}
