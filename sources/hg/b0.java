package hg;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.i2;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.wl0;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public class b0 extends lm0 {
    public final Context c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final g6 h;

    public b0(int i10, Context context, g6 g6Var, boolean z10, boolean z11) {
        this.e = z10;
        this.c = context;
        this.d = i10;
        this.f = z11;
        this.h = g6Var;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        return true;
    }

    @Override // s4.g0
    public final int h() {
        return MediaDataController.getInstance(this.d).hints.size();
    }

    @Override // s4.g0
    public void v(s4.b1 b1Var, int i10) {
        TLRPC.Chat chat;
        m4 m4Var = (m4) b1Var.a;
        int i11 = this.d;
        TLRPC.TL_topPeer tL_topPeer = MediaDataController.getInstance(i11).hints.get(i10);
        new TLRPC.TL_dialog();
        TLRPC.Peer peer = tL_topPeer.peer;
        long j10 = peer.user_id;
        TLRPC.User user = null;
        if (j10 != 0) {
            user = MessagesController.getInstance(i11).getUser(Long.valueOf(tL_topPeer.peer.user_id));
            chat = null;
        } else {
            long j11 = peer.channel_id;
            if (j11 != 0) {
                j10 = -j11;
                chat = MessagesController.getInstance(i11).getChat(Long.valueOf(tL_topPeer.peer.channel_id));
            } else {
                long j12 = peer.chat_id;
                if (j12 != 0) {
                    j10 = -j12;
                    chat = MessagesController.getInstance(i11).getChat(Long.valueOf(tL_topPeer.peer.chat_id));
                } else {
                    j10 = 0;
                    chat = null;
                }
            }
        }
        m4Var.setTag(Long.valueOf(j10));
        m4Var.a(j10, true, user != null ? UserObject.getFirstName(user) : chat != null ? chat.monoforum ? og.d.i(chat, i11, false) : chat.title : "");
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        boolean z10 = this.e;
        m4 m4Var = new m4(this.c, this.h, z10);
        if (this.f && !m4Var.x) {
            m4Var.x = true;
            NotificationCenter.getInstance(m4Var.h).listen(m4Var, NotificationCenter.userIsPremiumBlockedUpadted, new i2(m4Var, 1));
        }
        m4Var.setLayoutParams(new s4.o0(AndroidUtilities.dp(80.0f), AndroidUtilities.dp(86.0f)));
        return new wl0(m4Var);
    }
}
