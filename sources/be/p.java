package be;

import a8.j7;
import androidx.lifecycle.k0;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class p extends kd.c {
    public k0 a;
    public /* synthetic */ Object b;
    public int c;

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.c |= TLObject.FLAG_31;
        return j7.a(null, null, this);
    }
}
