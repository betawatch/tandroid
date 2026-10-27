package bi;

import android.os.Bundle;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.hw0;
import org.telegram.ui.mr;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class qa implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;

    public /* synthetic */ qa(int i10, long j10, int i11) {
        this.a = i11;
        this.b = i10;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                if (U != null) {
                    long j10 = this.c;
                    if (j10 < 0) {
                        int i10 = this.b;
                        long j11 = -j10;
                        if (!ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(i10).getChat(Long.valueOf(j11)))) {
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", j11);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 3);
                            mr mrVar = new mr(bundle);
                            mrVar.y0(MessagesController.getInstance(i10).getChatFull(j11));
                            U.presentFragment(mrVar);
                            break;
                        } else {
                            U.presentFragment(new hw0(j11));
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
            case 2:
                int i11 = this.b;
                long j12 = this.c;
                try {
                    SQLitePreparedStatement executeFast = MessagesStorage.getInstance(i11).getDatabase().executeFast("REPLACE INTO search_recent VALUES(?, ?)");
                    executeFast.requery();
                    executeFast.bindLong(1, j12);
                    executeFast.bindInteger(2, (int) (System.currentTimeMillis() / 1000));
                    executeFast.step();
                    executeFast.dispose();
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                org.telegram.ui.ActionBar.r2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    U2.presentFragment(wn.da(this.b, this.c));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ qa(long j10, int i10, int i11) {
        this.a = i11;
        this.c = j10;
        this.b = i10;
    }
}
