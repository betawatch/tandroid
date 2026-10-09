package e2;

import java.util.concurrent.ThreadFactory;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Wallet.WalletEngine2;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final /* synthetic */ class c0 implements ThreadFactory {
    public final /* synthetic */ int a;

    public /* synthetic */ c0(int i10) {
        this.a = i10;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread lambda$new$0;
        switch (this.a) {
            case 0:
                return new Thread(runnable, "ExoPlayer:AudioTrackReleaseThread");
            case 1:
                return new Thread(runnable, "RoundVideoFiles");
            case 2:
                return new Thread(runnable, "RoundVideoOutput");
            case 3:
                return new Thread(runnable, "Lottie-" + ck0.P0.getAndIncrement());
            case 4:
                return new Thread(runnable, "LottieLow-" + ck0.Q0.getAndIncrement());
            case 5:
                return new Thread(runnable, "GramWalletStorage");
            default:
                lambda$new$0 = WalletEngine2.lambda$new$0(runnable);
                return lambda$new$0;
        }
    }
}
