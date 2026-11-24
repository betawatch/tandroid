// default package

import java.util.concurrent.ExecutorService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
                gl.d3(runnable);
                break;
            case 5:
                gl.r(runnable);
                gl.d3(runnable);
                break;
            default:
                gl.r(runnable);
                gl.d3(runnable);
                break;
        }
    }
}
