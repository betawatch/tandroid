package gh;

import android.os.Bundle;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.jr;
import org.telegram.ui.pv0;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class d8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;

    public /* synthetic */ d8(int i9, long j10) {
        this.a = 1;
        this.b = i9;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    long j10 = this.c;
                    if (j10 < 0) {
                        int i9 = this.b;
                        long j11 = -j10;
                        if (!ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(i9).getChat(Long.valueOf(j11)))) {
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", j11);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 3);
                            jr jrVar = new jr(bundle);
                            jrVar.w0(MessagesController.getInstance(i9).getChatFull(j11));
                            U.presentFragment(jrVar);
                            break;
                        } else {
                            U.presentFragment(new pv0(j11));
                            break;
                        }
                    } else {
                        U.presentFragment(new PrivacyControlActivity(10, false));
                        break;
                    }
                }
                break;
            case 1:
                SendMessagesHelper.getInstance(this.b).sendMessage(SendMessagesHelper.SendMessageParams.of("/privacy", this.c, null, null, null, false, null, null, null, true, 0, 0, null, false));
                break;
            default:
                org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    U2.presentFragment(qn.Q9(this.b, this.c));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ d8(long j10, int i9, int i10) {
        this.a = i10;
        this.c = j10;
        this.b = i9;
    }
}
