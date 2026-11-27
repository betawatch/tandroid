// default package

import java.util.Iterator;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class ad0 extends ax2 {
    public Iterator a;
    public /* synthetic */ Object b;
    public int c;

    @Override // qf0
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.c |= TLObject.FLAG_31;
        return ord.b(null, this);
    }
}
