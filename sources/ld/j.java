package ld;

import ia.v;
import kotlin.jvm.internal.q;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class j extends tc.c {
    public q a;
    public v b;
    public /* synthetic */ Object c;
    public int d;

    @Override // tc.a
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.d |= TLObject.FLAG_31;
        return n.b(null, this);
    }
}
