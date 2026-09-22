package gg;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.j2;
import org.telegram.ui.Cells.o4;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.xl0;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public class c0 extends xl0 {
    public final Context c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final f6 h;

    public c0(int i10, Context context, f6 f6Var, boolean z10, boolean z11) {
        this.e = z10;
        this.c = context;
        this.d = i10;
        this.f = z11;
        this.h = f6Var;
    }

    @Override // org.telegram.ui.Components.xl0
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override // s4.h0
    public final int h() {
        return MediaDataController.getInstance(this.d).hints.size();
    }

    @Override // s4.h0
    public void v(s4.c1 c1Var, int i10) {
        TLRPC.Chat chat;
        o4 o4Var = (o4) c1Var.a;
        int i11 = this.d;
        TLRPC.TL_topPeer tL_topPeer = MediaDataController.getInstance(i11).hints.get(i10);
        new TLRPC.TL_dialog();
        TLRPC.Peer peer = tL_topPeer.peer;
        long j3 = peer.user_id;
        TLRPC.User user = null;
        if (j3 != 0) {
            user = MessagesController.getInstance(i11).getUser(Long.valueOf(tL_topPeer.peer.user_id));
            chat = null;
        } else {
            long j10 = peer.channel_id;
            if (j10 != 0) {
                j3 = -j10;
                chat = MessagesController.getInstance(i11).getChat(Long.valueOf(tL_topPeer.peer.channel_id));
            } else {
                long j11 = peer.chat_id;
                if (j11 != 0) {
                    j3 = -j11;
                    chat = MessagesController.getInstance(i11).getChat(Long.valueOf(tL_topPeer.peer.chat_id));
                } else {
                    chat = null;
                    j3 = 0;
                }
            }
        }
        o4Var.setTag(Long.valueOf(j3));
        o4Var.a(j3, user != null ? UserObject.getFirstName(user) : chat != null ? chat.monoforum ? ng.d.i(chat, i11, false) : chat.title : "");
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        boolean z10 = this.e;
        o4 o4Var = new o4(this.c, this.h, z10);
        if (this.f && !o4Var.x) {
            o4Var.x = true;
            NotificationCenter.getInstance(o4Var.h).listen(o4Var, NotificationCenter.userIsPremiumBlockedUpadted, new j2(o4Var, 1));
        }
        o4Var.setLayoutParams(new s4.p0(AndroidUtilities.dp(80.0f), AndroidUtilities.dp(86.0f)));
        return new il0(o4Var);
    }
}
