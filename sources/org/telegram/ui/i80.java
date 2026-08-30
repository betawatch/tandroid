package org.telegram.ui;

import android.telephony.PhoneNumberUtils;
import j$.util.function.Predicate$-CC;
import java.util.function.Predicate;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i80 implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i80(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public /* synthetic */ Predicate and(Predicate predicate) {
        int i10 = this.a;
        return Predicate$-CC.$default$and(this, predicate);
    }

    public /* synthetic */ Predicate negate() {
        switch (this.a) {
        }
        return Predicate$-CC.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        int i10 = this.a;
        return Predicate$-CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                String str = (String) obj;
                return str != null && str.equals((String) this.b);
            case 1:
                return PhoneNumberUtils.compare((String) this.b, (String) obj);
            case 2:
                String str2 = (String) obj;
                return str2 != null && str2.equals((String) this.b);
            default:
                return xn.v1((xn) this.b, (TLRPC.MessageEntity) obj);
        }
    }
}
