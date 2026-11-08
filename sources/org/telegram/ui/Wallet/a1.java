package org.telegram.ui.Wallet;

import j$.util.function.Predicate$-CC;
import java.util.function.Predicate;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a1 implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ TL_wallet.tonConnectSession b;

    public /* synthetic */ a1(TL_wallet.tonConnectSession tonconnectsession, int i7) {
        this.a = i7;
        this.b = tonconnectsession;
    }

    public /* synthetic */ Predicate and(Predicate predicate) {
        int i7 = this.a;
        return Predicate$-CC.$default$and(this, predicate);
    }

    public /* synthetic */ Predicate negate() {
        switch (this.a) {
        }
        return Predicate$-CC.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        int i7 = this.a;
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
