package fi;

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
import org.telegram.ui.fo;
import org.telegram.ui.yr;
import org.telegram.ui.zw0;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class a2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;

    public /* synthetic */ a2(int i10, long j10, int i11) {
        this.a = i11;
        this.b = i10;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                SendMessagesHelper.getInstance(this.b).sendMessage(SendMessagesHelper.SendMessageParams.of("/privacy", this.c, null, null, null, false, null, null, null, true, 0, 0, null, false));
                break;
            case 1:
                int i10 = this.b;
                long j10 = this.c;
                try {
                    SQLitePreparedStatement executeFast = MessagesStorage.getInstance(i10).getDatabase().executeFast("REPLACE INTO search_recent VALUES(?, ?)");
                    executeFast.requery();
                    executeFast.bindLong(1, j10);
                    executeFast.bindInteger(2, (int) (System.currentTimeMillis() / 1000));
                    executeFast.step();
                    executeFast.dispose();
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 2:
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(fo.V9(this.b, this.c));
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.m2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    long j11 = this.c;
                    if (j11 < 0) {
                        int i11 = this.b;
                        long j12 = -j11;
                        if (!ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(i11).getChat(Long.valueOf(j12)))) {
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", j12);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 3);
                            yr yrVar = new yr(bundle);
                            yrVar.x0(MessagesController.getInstance(i11).getChatFull(j12));
                            U2.presentFragment(yrVar);
                            break;
                        } else {
                            U2.presentFragment(new zw0(j12));
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

    public /* synthetic */ a2(long j10, int i10, int i11) {
        this.a = i11;
        this.c = j10;
        this.b = i10;
    }
}
