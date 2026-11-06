package org.telegram.ui;

import android.telephony.PhoneNumberUtils;
import j$.util.function.Predicate$-CC;
import java.util.function.Predicate;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i60 implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i60(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
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
                return an.A1((an) this.b, (TLRPC.MessageEntity) obj);
        }
    }
}
