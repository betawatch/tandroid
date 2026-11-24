// default package

import java.util.Comparator;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class jn0 implements Comparator {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Comparator b;

    public /* synthetic */ jn0(Comparator comparator, byte b) {
        this.a = b;
        this.b = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        byte b = this.a;
        Comparator comparator = this.b;
        switch (b) {
            case 0:
                return comparator.compare(((TLRPC.TL_help_country) obj).default_name, ((TLRPC.TL_help_country) obj2).default_name);
            case 1:
                return comparator.compare(((TLRPC.TL_help_country) obj).default_name, ((TLRPC.TL_help_country) obj2).default_name);
            default:
                return comparator.compare(((mx2) obj).a, ((mx2) obj2).a);
        }
    }
}
