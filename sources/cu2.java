// default package

import java.text.Collator;
import java.util.Comparator;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class cu2 implements Comparator {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Collator b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cu2(Object obj, Collator collator, byte b) {
        this.a = b;
        this.c = obj;
        this.b = collator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        byte b = this.a;
        Collator collator = this.b;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                qu2 qu2Var = (qu2) obj3;
                return collator.compare(l7c.k(qu2Var.getMessagesController().V1(Long.valueOf(((TLRPC.TL_contact) obj).user_id)), true), l7c.k(qu2Var.getMessagesController().V1(Long.valueOf(((TLRPC.TL_contact) obj2).user_id)), true));
            default:
                vf6 vf6Var = (vf6) obj3;
                return collator.compare(l7c.k((TLRPC.User) vf6Var.f(((TLRPC.TL_contact) obj).user_id), true), l7c.k((TLRPC.User) vf6Var.f(((TLRPC.TL_contact) obj2).user_id), true));
        }
    }
}
