package od;

import androidx.biometric.e0;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class a extends wc.c {
    public pd.g a;
    public /* synthetic */ Object b;
    public final /* synthetic */ e0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(e0 e0Var, wc.c cVar) {
        super(cVar);
        this.c = e0Var;
    }

    @Override // wc.a
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= TLObject.FLAG_31;
        return this.c.z(null, this);
    }
}
