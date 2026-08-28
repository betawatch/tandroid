package k1;

import java.io.Serializable;
import java.util.Iterator;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class c extends sc.c {
    public Serializable a;
    public Iterator b;
    public /* synthetic */ Object c;
    public int d;

    @Override // sc.a
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.d |= TLObject.FLAG_31;
        return g7.g.a(null, null, this);
    }
}
