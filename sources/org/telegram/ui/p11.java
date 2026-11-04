package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class p11 implements org.telegram.messenger.cs {
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

    public p11(int i3, long j10, TLRPC.ChannelParticipantsFilter channelParticipantsFilter) {
        this.a = i3;
        this.b = org.telegram.messenger.hp.s1(i3).M0(Long.valueOf(j10));
        TLRPC.ChatFull N0 = org.telegram.messenger.hp.s1(i3).N0(j10);
        this.c = channelParticipantsFilter;
        if (N0 == null) {
            if (!this.s) {
                this.s = true;
                org.telegram.messenger.hs.f(i3).c(this, org.telegram.messenger.hs.T);
            }
            org.telegram.messenger.hp.s1(i3).V2(0, j10, false);
        }
    }

    public final void a() {
        if (this.s) {
            this.s = false;
            int i3 = this.a;
            org.telegram.messenger.hs.f(i3).n(this, org.telegram.messenger.hs.T);
            if (this.n >= 0) {
                ConnectionsManager.getInstance(i3).cancelRequest(this.n, true);
                this.n = -1;
            }
            this.f = false;
        }
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
        if (org.telegram.messenger.t3.T(chat)) {
            TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
            tL_channels_getParticipants.channel = org.telegram.messenger.hp.i1(chat);
            tL_channels_getParticipants.filter = this.c;
            tL_channels_getParticipants.limit = 30;
            tL_channels_getParticipants.offset = this.r ? 0 : this.d.size();
            ConnectionsManager.getInstance(this.a).sendRequestTyped(tL_channels_getParticipants, new c3.b(1), new c5(this, 24));
        }
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.T) {
            long j10 = ((TLRPC.ChatFull) objArr[0]).id;
            TLRPC.Chat chat = this.b;
            if (j10 == chat.id && !org.telegram.messenger.t3.T(chat) && this.f) {
                this.f = false;
                b();
            }
        }
    }
}
