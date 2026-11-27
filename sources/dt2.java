// default package

import java.util.concurrent.ExecutorService;
import org.telegram.messenger.voip.OpusDred;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class dt2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Runnable b;

    public /* synthetic */ dt2(Runnable runnable, byte b) {
        this.a = b;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Runnable runnable = this.b;
        switch (b) {
            case 0:
                ConnectionsManager.lambda$cancelRequest$9(runnable);
                break;
            case 1:
                runnable.run();
                break;
            case 2:
                ExecutorService executorService = DictationLid.a;
                DictationAsr.Q();
                runnable.run();
                break;
            case 3:
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 4:
                OpusDred.lambda$whenReadyForGroupCall$2(runnable);
                break;
            case 5:
                hl.r(runnable);
                hl.c3(runnable);
                break;
            case 6:
                hl.r(runnable);
                hl.c3(runnable);
                break;
            default:
                hl.r(runnable);
                hl.c3(runnable);
                break;
        }
    }
}
