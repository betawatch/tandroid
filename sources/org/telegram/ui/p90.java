package org.telegram.ui;

import android.os.Bundle;
import java.util.regex.Pattern;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p90 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ LaunchActivity b;
    public final /* synthetic */ Bundle c;
    public final /* synthetic */ Long d;
    public final /* synthetic */ oa0 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ nf.e h;
    public final /* synthetic */ Long n;
    public final /* synthetic */ Integer r;
    public final /* synthetic */ Integer s;
    public final /* synthetic */ byte[] v;
    public final /* synthetic */ org.telegram.ui.ActionBar.o2 w;
    public final /* synthetic */ int x;
    public final /* synthetic */ Object y;

    public /* synthetic */ p90(LaunchActivity launchActivity, Bundle bundle, Long l4, int[] iArr, oa0 oa0Var, boolean z10, nf.e eVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.o2 o2Var, int i10) {
        this.b = launchActivity;
        this.c = bundle;
        this.d = l4;
        this.y = iArr;
        this.e = oa0Var;
        this.f = z10;
        this.h = eVar;
        this.n = l10;
        this.r = num;
        this.s = num2;
        this.v = bArr;
        this.w = o2Var;
        this.x = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        Object obj = this.y;
        switch (i10) {
            case 0:
                oa0 oa0Var = this.e;
                TLObject tLObject = (TLObject) obj;
                Pattern pattern = LaunchActivity.B1;
                try {
                    oa0Var.run();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                boolean z10 = tLObject instanceof TLRPC.TL_messages_chats;
                LaunchActivity launchActivity = this.b;
                if (z10) {
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
                    if (!tL_messages_chats.chats.isEmpty()) {
                        MessagesController.getInstance(launchActivity.O).putChats(tL_messages_chats.chats, false);
                        TLRPC.Chat chat = tL_messages_chats.chats.get(0);
                        Long l4 = this.d;
                        if (chat != null && this.f && ChatObject.isBoostSupported(chat)) {
                            launchActivity.s0(Long.valueOf(-l4.longValue()), null, this.h, null);
                        } else if (chat != null && chat.forum) {
                            Long l10 = this.n;
                            Integer num = this.s;
                            byte[] bArr = this.v;
                            if (l10 != null) {
                                launchActivity.k0(-l4.longValue(), this.r, null, num, bArr, null, 0, -1);
                            } else {
                                launchActivity.k0(-l4.longValue(), null, null, num, bArr, null, 0, -1);
                            }
                        }
                        org.telegram.ui.ActionBar.o2 o2Var = this.w;
                        Bundle bundle = this.c;
                        if (o2Var == null || MessagesController.getInstance(this.x).checkCanOpenChat(bundle, o2Var)) {
                            ((ActionBarLayout) launchActivity.O()).P(new bo(bundle));
                            break;
                        }
                    }
                }
                launchActivity.B0(org.telegram.ui.Components.c5.H(launchActivity, LocaleController.getString(R.string.DialogNotAvailable), LocaleController.getString(R.string.LinkNotFound)));
                break;
            default:
                int[] iArr = (int[]) obj;
                Pattern pattern2 = LaunchActivity.B1;
                LaunchActivity launchActivity2 = this.b;
                org.telegram.ui.ActionBar.e5 O = launchActivity2.O();
                Bundle bundle2 = this.c;
                if (!((ActionBarLayout) O).P(new bo(bundle2))) {
                    TLRPC.TL_channels_getChannels tL_channels_getChannels = new TLRPC.TL_channels_getChannels();
                    TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                    Long l11 = this.d;
                    tL_inputChannel.channel_id = l11.longValue();
                    tL_channels_getChannels.id.add(tL_inputChannel);
                    iArr[0] = ConnectionsManager.getInstance(launchActivity2.O).sendRequest(tL_channels_getChannels, new org.telegram.messenger.g1(launchActivity2, this.e, this.f, l11, this.h, this.n, this.r, this.s, this.v, this.w, this.x, bundle2));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ p90(LaunchActivity launchActivity, oa0 oa0Var, TLObject tLObject, boolean z10, Long l4, nf.e eVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.o2 o2Var, int i10, Bundle bundle) {
        this.b = launchActivity;
        this.e = oa0Var;
        this.y = tLObject;
        this.f = z10;
        this.d = l4;
        this.h = eVar;
        this.n = l10;
        this.r = num;
        this.s = num2;
        this.v = bArr;
        this.w = o2Var;
        this.x = i10;
        this.c = bundle;
    }
}
