package k1;

import java.io.File;
import java.io.FileOutputStream;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class c0 extends wc.c {
    public d0 a;
    public File b;
    public FileOutputStream c;
    public FileOutputStream d;
    public /* synthetic */ Object e;
    public final /* synthetic */ d0 f;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(d0 d0Var, wc.c cVar) {
        super(cVar);
        this.f = d0Var;
    }

    @Override // wc.a
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.h |= TLObject.FLAG_31;
        return this.f.j(null, this);
    }
}
