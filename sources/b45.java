// default package

import j$.util.function.Predicate$-CC;
import java.util.function.Predicate;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final /* synthetic */ class b45 implements Predicate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ TL_wallet.tonConnectSession b;

    public /* synthetic */ b45(TL_wallet.tonConnectSession tonconnectsession, byte b) {
        this.a = b;
        this.b = tonconnectsession;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        byte b = this.a;
        return Predicate$-CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        byte b = this.a;
        return Predicate$-CC.$default$negate(this);
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        byte b = this.a;
        return Predicate$-CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        TL_wallet.tonConnectSession tonconnectsession = (TL_wallet.tonConnectSession) obj;
        switch (this.a) {
            case 0:
                if (tonconnectsession.id == this.b.id) {
                }
                break;
            default:
                if (tonconnectsession.id == this.b.id) {
                }
                break;
        }
        return false;
    }
}
