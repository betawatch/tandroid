// default package

import java.util.concurrent.ExecutorService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class ks2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Runnable b;

    public /* synthetic */ ks2(Runnable runnable, byte b) {
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
                DictationAsr.O();
                runnable.run();
                break;
            case 3:
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 4:
                gl.r(runnable);
                gl.c3(runnable);
                break;
            case 5:
                gl.r(runnable);
                gl.c3(runnable);
                break;
            default:
                gl.r(runnable);
                gl.c3(runnable);
                break;
        }
    }
}
