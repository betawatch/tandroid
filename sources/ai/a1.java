package ai;

import java.util.concurrent.ExecutorService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class a1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Runnable b;

    public /* synthetic */ a1(int i7, Runnable runnable) {
        this.a = i7;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        Runnable runnable = this.b;
        switch (i7) {
            case 0:
                ExecutorService executorService = DictationLid.a;
                DictationAsr.M();
                runnable.run();
                break;
            case 1:
                org.telegram.messenger.g0.r(runnable);
                org.telegram.messenger.g0.g3(runnable);
                break;
            case 2:
                org.telegram.messenger.g0.r(runnable);
                org.telegram.messenger.g0.g3(runnable);
                break;
            case 3:
                org.telegram.messenger.g0.r(runnable);
                org.telegram.messenger.g0.g3(runnable);
                break;
            case 4:
                ConnectionsManager.lambda$cancelRequest$9(runnable);
                break;
            default:
                runnable.run();
                break;
        }
    }
}
