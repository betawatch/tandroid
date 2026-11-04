package l1;

import java.io.Serializable;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class w extends hd.c {
    public Object a;
    public Object b;
    public Serializable c;
    public kotlin.jvm.internal.r d;
    public boolean e;
    public int f;
    public /* synthetic */ Object h;
    public final /* synthetic */ b0 n;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(b0 b0Var, hd.c cVar) {
        super(cVar);
        this.n = b0Var;
    }

    @Override // hd.a
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.r |= TLObject.FLAG_31;
        return b0.f(this.n, false, this);
    }
}
