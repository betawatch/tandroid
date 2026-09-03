package k1;

import j7.t8;
import java.io.Serializable;
import java.util.Iterator;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class d extends wc.c {
    public Serializable a;
    public Iterator b;
    public /* synthetic */ Object c;
    public int d;

    @Override // wc.a
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.d |= TLObject.FLAG_31;
        return t8.a(null, null, this);
    }
}
