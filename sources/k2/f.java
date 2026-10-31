package k2;

import bi.t6;
import j$.util.DesugarArrays;
import j$.util.function.Function$-CC;
import java.util.function.Function;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.nt;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements Function {
    public final /* synthetic */ int a;

    public /* synthetic */ f(int i10) {
        this.a = i10;
    }

    public /* synthetic */ Function andThen(Function function) {
        int i10 = this.a;
        return Function$-CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        long j10;
        int[] array;
        switch (this.a) {
            case 1:
                String str = (String) obj;
                Pattern pattern = Utilities.a;
                try {
                    j10 = Long.parseLong(str);
                } catch (Exception unused) {
                    j10 = 0;
                }
                break;
            case 2:
                array = DesugarArrays.stream(((String) obj).split(",")).mapToInt(new t6(3)).toArray();
                break;
            case 9:
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) obj;
                if (channelParticipant != null) {
                    break;
                }
                break;
        }
        return ((nt) obj).a;
    }

    public /* synthetic */ Function compose(Function function) {
        int i10 = this.a;
        return Function$-CC.$default$compose(this, function);
    }
}
