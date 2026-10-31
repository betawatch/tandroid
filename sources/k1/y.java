package k1;

import java.io.File;
import java.io.FileOutputStream;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class y extends ed.c {
    public z a;
    public File b;
    public FileOutputStream c;
    public FileOutputStream d;
    public /* synthetic */ Object e;
    public final /* synthetic */ z f;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(z zVar, ed.c cVar) {
        super(cVar);
        this.f = zVar;
    }

    @Override // ed.a
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.h |= TLObject.FLAG_31;
        return this.f.j(this, null);
    }
}
