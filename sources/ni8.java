// default package

import java.util.Arrays;
import java.util.Comparator;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
