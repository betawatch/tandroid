package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class k61 implements NotificationCenter.NotificationCenterDelegate {
    public final int a;
    public final TLRPC.Chat b;
    public TLRPC.ChannelParticipantsFilter c;
    public boolean f;
    public boolean h;
    public boolean r;
    public boolean s;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public int n = -1;

    public k61(int i9, long j10, TLRPC.ChannelParticipantsFilter channelParticipantsFilter) {
        this.a = i9;
        this.b = MessagesController.getInstance(i9).getChat(Long.valueOf(j10));
        TLRPC.ChatFull chatFull = MessagesController.getInstance(i9).getChatFull(j10);
        this.c = channelParticipantsFilter;
        if (chatFull == null) {
            if (!this.s) {
                this.s = true;
                NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.chatInfoDidLoad);
            }
            MessagesController.getInstance(i9).loadFullChat(j10, 0, false);
        }
    }

    public final void a() {
        if (this.s) {
            return;
        }
        this.s = false;
        int i9 = this.a;
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.chatInfoDidLoad);
        if (this.n >= 0) {
            ConnectionsManager.getInstance(i9).cancelRequest(this.n, true);
            this.n = -1;
        }
        this.f = false;
    }

    public final void b() {
        if (this.f || this.h) {
            return;
        }
        TLRPC.ChannelParticipantsFilter channelParticipantsFilter = this.c;
        if ((channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) && TextUtils.isEmpty(channelParticipantsFilter.q)) {
            return;
        }
        this.f = true;
        TLRPC.Chat chat = this.b;
        if (ChatObject.isChannel(chat)) {
            TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
            tL_channels_getParticipants.channel = MessagesController.getInputChannel(chat);
            tL_channels_getParticipants.filter = this.c;
            tL_channels_getParticipants.limit = 30;
            tL_channels_getParticipants.offset = this.r ? 0 : this.d.size();
            ConnectionsManager.getInstance(this.a).sendRequestTyped(tL_channels_getParticipants, new org.telegram.messenger.a(), new a5(this, 24));
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.chatInfoDidLoad) {
            long j10 = ((TLRPC.ChatFull) objArr[0]).id;
            TLRPC.Chat chat = this.b;
            if (j10 == chat.id && !ChatObject.isChannel(chat) && this.f) {
                this.f = false;
                b();
            }
        }
    }
}
