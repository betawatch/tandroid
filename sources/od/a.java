package od;

import androidx.biometric.f0;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class a extends wc.c {
    public pd.g a;
    public /* synthetic */ Object b;
    public final /* synthetic */ f0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(f0 f0Var, wc.c cVar) {
        super(cVar);
        this.c = f0Var;
    }

    @Override // wc.a
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= TLObject.FLAG_31;
        return this.c.x(null, this);
    }
}
