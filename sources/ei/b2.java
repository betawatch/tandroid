package ei;

import android.os.Bundle;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.sr;
import org.telegram.ui.tw0;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes4.dex */
public final /* synthetic */ class b2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;

    public /* synthetic */ b2(int i10, long j3) {
        this.a = 0;
        this.c = i10;
        this.b = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                SendMessagesHelper.getInstance(this.c).sendMessage(SendMessagesHelper.SendMessageParams.of("/privacy", this.b, null, null, null, false, null, null, null, true, 0, 0, null, false));
                break;
            case 1:
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(zn.Q9(this.c, this.b));
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    long j3 = this.b;
                    if (j3 < 0) {
                        int i10 = this.c;
                        long j10 = -j3;
                        if (!ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(i10).getChat(Long.valueOf(j10)))) {
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", j10);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 3);
                            sr srVar = new sr(bundle);
                            srVar.x0(MessagesController.getInstance(i10).getChatFull(j10));
                            U2.presentFragment(srVar);
                            break;
                        } else {
                            U2.presentFragment(new tw0(j10));
                            break;
                        }
                    } else {
                        U2.presentFragment(new PrivacyControlActivity(10, false));
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ b2(long j3, int i10, int i11) {
        this.a = i11;
        this.b = j3;
        this.c = i10;
    }
}
