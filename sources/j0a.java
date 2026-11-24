// default package

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class j0a implements jm7 {
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

    public j0a(int i, long j, TLRPC.ChannelParticipantsFilter channelParticipantsFilter) {
        this.a = i;
        this.b = oc7.r1(i).L0(Long.valueOf(j));
        TLRPC.ChatFull M0 = oc7.r1(i).M0(j);
        this.c = channelParticipantsFilter;
        if (M0 == null) {
            if (!this.s) {
                this.s = true;
                nm7.f(i).b(this, nm7.T);
            }
            oc7.r1(i).a3(0, j, false);
        }
    }

    public final void a() {
        if (this.s) {
            this.s = false;
            int i = this.a;
            nm7.f(i).n(this, nm7.T);
            if (this.n >= 0) {
                ConnectionsManager.getInstance(i).cancelRequest(this.n, true);
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
        if (sd2.T(chat)) {
            TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
            tL_channels_getParticipants.channel = oc7.h1(chat);
            tL_channels_getParticipants.filter = this.c;
            tL_channels_getParticipants.limit = 30;
            byte b = 0;
            tL_channels_getParticipants.offset = this.r ? 0 : this.d.size();
            ConnectionsManager.getInstance(this.a).sendRequestTyped(tL_channels_getParticipants, new kc(b), new vh8(this, (byte) 17));
        }
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.T) {
            long j = ((TLRPC.ChatFull) objArr[0]).id;
            TLRPC.Chat chat = this.b;
            if (j == chat.id && !sd2.T(chat) && this.f) {
                this.f = false;
                b();
            }
        }
    }
}
