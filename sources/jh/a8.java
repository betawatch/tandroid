package jh;

import android.os.Bundle;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.jr;
import org.telegram.ui.pv0;
import org.telegram.ui.tn;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;

    public /* synthetic */ a8(int i10, long j10) {
        this.a = 2;
        this.c = i10;
        this.b = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    long j10 = this.b;
                    if (j10 < 0) {
                        int i10 = this.c;
                        long j11 = -j10;
                        if (!ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(i10).getChat(Long.valueOf(j11)))) {
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", j11);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 3);
                            jr jrVar = new jr(bundle);
                            jrVar.x0(MessagesController.getInstance(i10).getChatFull(j11));
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
                org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    U2.presentFragment(tn.Q9(this.c, this.b));
                    break;
                }
                break;
            default:
                SendMessagesHelper.getInstance(this.c).sendMessage(SendMessagesHelper.SendMessageParams.of("/privacy", this.b, null, null, null, false, null, null, null, true, 0, 0, null, false));
                break;
        }
    }

    public /* synthetic */ a8(long j10, int i10, int i11) {
        this.a = i11;
        this.b = j10;
        this.c = i10;
    }
}
