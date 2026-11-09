package bi;

import java.util.function.ToDoubleFunction;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class j1 implements ToDoubleFunction {
    public final /* synthetic */ int a;

    public /* synthetic */ j1(int i7) {
        this.a = i7;
    }

    @Override // java.util.function.ToDoubleFunction
    public final double applyAsDouble(Object obj) {
        switch (this.a) {
        }
        return ((TLRPC.TL_topPeer) obj).rating;
    }
}
