package hh;

import android.os.Bundle;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.lr;
import org.telegram.ui.qv0;
import org.telegram.ui.rn;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class c8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;

    public /* synthetic */ c8(int i10, long j10) {
        this.a = 1;
        this.b = i10;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    long j10 = this.c;
                    if (j10 < 0) {
                        int i10 = this.b;
                        long j11 = -j10;
                        if (!ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(i10).getChat(Long.valueOf(j11)))) {
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", j11);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 3);
                            lr lrVar = new lr(bundle);
                            lrVar.x0(MessagesController.getInstance(i10).getChatFull(j11));
                            U.presentFragment(lrVar);
                            break;
                        } else {
                            U.presentFragment(new qv0(j11));
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
                org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    U2.presentFragment(rn.Q9(this.b, this.c));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ c8(long j10, int i10, int i11) {
        this.a = i11;
        this.c = j10;
        this.b = i10;
    }
}
