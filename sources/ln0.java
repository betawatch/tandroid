// default package

import java.util.Comparator;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class ln0 implements Comparator {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Comparator b;

    public /* synthetic */ ln0(Comparator comparator, byte b) {
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
                return comparator.compare(((gy2) obj).a, ((gy2) obj2).a);
        }
    }
}
