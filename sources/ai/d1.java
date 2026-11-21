package ai;

import java.util.concurrent.ExecutorService;
import org.telegram.messenger.x10;
import org.telegram.ui.Dictation.DictationLid;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x10 b;
    public final /* synthetic */ int c;

    public /* synthetic */ d1(x10 x10Var, int i7, int i10) {
        this.a = i10;
        this.b = x10Var;
        this.c = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        int i10 = this.c;
        x10 x10Var = this.b;
        switch (i7) {
            case 0:
                ExecutorService executorService = DictationLid.a;
                x10Var.a(Integer.valueOf(i10));
                break;
            default:
                x10Var.a(Integer.valueOf(i10));
                break;
        }
    }
}
