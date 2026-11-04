package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c70 implements Runnable {
    public final /* synthetic */ Object E;
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ LaunchActivity b;
    public final /* synthetic */ Bundle c;
    public final /* synthetic */ Long d;
    public final /* synthetic */ ly e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ sf.b h;
    public final /* synthetic */ Long n;
    public final /* synthetic */ Integer r;
    public final /* synthetic */ Integer s;
    public final /* synthetic */ byte[] w;
    public final /* synthetic */ org.telegram.ui.ActionBar.d2 x;
    public final /* synthetic */ int y;

    public /* synthetic */ c70(LaunchActivity launchActivity, Bundle bundle, Long l10, int[] iArr, ly lyVar, boolean z10, sf.b bVar, Long l11, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.d2 d2Var, int i3) {
        this.b = launchActivity;
        this.c = bundle;
        this.d = l10;
        this.E = iArr;
        this.e = lyVar;
        this.f = z10;
        this.h = bVar;
        this.n = l11;
        this.r = num;
        this.s = num2;
        this.w = bArr;
        this.x = d2Var;
        this.y = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        Object obj = this.E;
        switch (i3) {
            case 0:
                ly lyVar = this.e;
                TLObject tLObject = (TLObject) obj;
                String str = LaunchActivity.E1;
                try {
                    lyVar.run();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                boolean z10 = tLObject instanceof TLRPC.TL_messages_chats;
                LaunchActivity launchActivity = this.b;
                if (z10) {
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
                    if (!tL_messages_chats.chats.isEmpty()) {
                        org.telegram.messenger.hp.s1(launchActivity.P).S3(tL_messages_chats.chats, false);
                        TLRPC.Chat chat = tL_messages_chats.chats.get(0);
                        Long l10 = this.d;
                        if (chat != null && this.f && org.telegram.messenger.t3.R(chat)) {
                            launchActivity.w0(Long.valueOf(-l10.longValue()), null, this.h, null);
                        } else if (chat != null && chat.forum) {
                            Long l11 = this.n;
                            Integer num = this.s;
                            byte[] bArr = this.w;
                            if (l11 != null) {
                                launchActivity.l0(-l10.longValue(), this.r, null, num, bArr, null, 0, -1);
                            } else {
                                launchActivity.l0(-l10.longValue(), null, null, num, bArr, null, 0, -1);
                            }
                        }
                        org.telegram.ui.ActionBar.d2 d2Var = this.x;
                        Bundle bundle = this.c;
                        if (d2Var == null || org.telegram.messenger.hp.s1(this.y).E(bundle, d2Var, null, null)) {
                            ((ActionBarLayout) launchActivity.M()).S(new wm(bundle));
                            break;
                        }
                    }
                }
                launchActivity.F0(org.telegram.ui.Components.t4.G(launchActivity, org.telegram.messenger.bd.M0(2131751455, null), org.telegram.messenger.bd.M0(2131748903, null)));
                break;
            default:
                int[] iArr = (int[]) obj;
                String str2 = LaunchActivity.E1;
                LaunchActivity launchActivity2 = this.b;
                org.telegram.ui.ActionBar.q4 M = launchActivity2.M();
                Bundle bundle2 = this.c;
                if (!((ActionBarLayout) M).S(new wm(bundle2))) {
                    TLRPC.TL_channels_getChannels tL_channels_getChannels = new TLRPC.TL_channels_getChannels();
                    TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                    Long l12 = this.d;
                    tL_inputChannel.channel_id = l12.longValue();
                    tL_channels_getChannels.id.add(tL_inputChannel);
                    iArr[0] = ConnectionsManager.getInstance(launchActivity2.P).sendRequest(tL_channels_getChannels, new org.telegram.messenger.o4(launchActivity2, this.e, this.f, l12, this.h, this.n, this.r, this.s, this.w, this.x, this.y, bundle2));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ c70(LaunchActivity launchActivity, ly lyVar, TLObject tLObject, boolean z10, Long l10, sf.b bVar, Long l11, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.d2 d2Var, int i3, Bundle bundle) {
        this.b = launchActivity;
        this.e = lyVar;
        this.E = tLObject;
        this.f = z10;
        this.d = l10;
        this.h = bVar;
        this.n = l11;
        this.r = num;
        this.s = num2;
        this.w = bArr;
        this.x = d2Var;
        this.y = i3;
        this.c = bundle;
    }
}
