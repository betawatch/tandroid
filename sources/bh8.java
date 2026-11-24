// default package

import java.util.Arrays;
import java.util.Comparator;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class bh8 implements Comparator {
    public final /* synthetic */ ih8 a;

    public bh8(ih8 ih8Var) {
        this.a = ih8Var;
    }

    public final int a(hh8 hh8Var) {
        TLRPC.Poll poll = this.a.s1;
        int size = poll.answers.size();
        for (int i = 0; i < size; i++) {
            if (Arrays.equals(poll.answers.get(i).option, hh8Var.d)) {
                return i;
            }
        }
        return 0;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int a = a((hh8) obj);
        int a2 = a((hh8) obj2);
        if (a > a2) {
            return 1;
        }
        return a < a2 ? -1 : 0;
    }
}
