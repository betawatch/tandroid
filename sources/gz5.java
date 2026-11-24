// default package

import android.telephony.PhoneNumberUtils;
import j$.util.function.Predicate$-CC;
import java.util.function.Predicate;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class gz5 implements Predicate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;

    public /* synthetic */ gz5(String str, byte b) {
        this.a = b;
        this.b = str;
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
        byte b = this.a;
        String str = this.b;
        String str2 = (String) obj;
        switch (b) {
            case 0:
                return str2 != null && str2.equals(str);
            case 1:
                return PhoneNumberUtils.compare(str, str2);
            default:
                return str2 != null && str2.equals(str);
        }
    }
}
