// default package

import java.util.Arrays;
import java.util.Comparator;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class ni8 implements Comparator {
    public final /* synthetic */ ui8 a;

    public ni8(ui8 ui8Var) {
        this.a = ui8Var;
    }

    public final int a(ti8 ti8Var) {
        TLRPC.Poll poll = this.a.s1;
        int size = poll.answers.size();
        for (int i = 0; i < size; i++) {
            if (Arrays.equals(poll.answers.get(i).option, ti8Var.d)) {
                return i;
            }
        }
        return 0;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int a = a((ti8) obj);
        int a2 = a((ti8) obj2);
        if (a > a2) {
            return 1;
        }
        return a < a2 ? -1 : 0;
    }
}
