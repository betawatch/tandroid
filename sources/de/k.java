package de;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class k extends ld.c {
    public kotlin.jvm.internal.p a;
    public j b;
    public /* synthetic */ Object c;
    public int d;

    @Override // ld.a
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.d |= TLObject.FLAG_31;
        return p.b(null, this);
    }
}
