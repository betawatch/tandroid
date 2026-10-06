package ei;

import android.os.Bundle;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.nw0;
import org.telegram.ui.rr;
import org.telegram.ui.yn;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes4.dex */
public final /* synthetic */ class c2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;

    public /* synthetic */ c2(int i10, long j3) {
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
                    U.presentFragment(yn.P9(this.c, this.b));
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
                            rr rrVar = new rr(bundle);
                            rrVar.x0(MessagesController.getInstance(i10).getChatFull(j10));
                            U2.presentFragment(rrVar);
                            break;
                        } else {
                            U2.presentFragment(new nw0(j10));
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

    public /* synthetic */ c2(long j3, int i10, int i11) {
        this.a = i11;
        this.b = j3;
        this.c = i10;
    }
}
