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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g90 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ LaunchActivity b;
    public final /* synthetic */ Bundle c;
    public final /* synthetic */ Long d;
    public final /* synthetic */ kz e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ qf.c h;
    public final /* synthetic */ Long n;
    public final /* synthetic */ Integer r;
    public final /* synthetic */ Integer s;
    public final /* synthetic */ byte[] v;
    public final /* synthetic */ org.telegram.ui.ActionBar.r2 w;
    public final /* synthetic */ int x;
    public final /* synthetic */ Object y;

    public /* synthetic */ g90(LaunchActivity launchActivity, Bundle bundle, Long l4, int[] iArr, kz kzVar, boolean z10, qf.c cVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.r2 r2Var, int i10) {
        this.b = launchActivity;
        this.c = bundle;
        this.d = l4;
        this.y = iArr;
        this.e = kzVar;
        this.f = z10;
        this.h = cVar;
        this.n = l10;
        this.r = num;
        this.s = num2;
        this.v = bArr;
        this.w = r2Var;
        this.x = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        Object obj = this.y;
        switch (i10) {
            case 0:
                kz kzVar = this.e;
                TLObject tLObject = (TLObject) obj;
                Pattern pattern = LaunchActivity.D1;
                try {
                    kzVar.run();
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
                            launchActivity.x0(Long.valueOf(-l4.longValue()), null, this.h, null);
                        } else if (chat != null && chat.forum) {
                            Long l10 = this.n;
                            Integer num = this.s;
                            byte[] bArr = this.v;
                            if (l10 != null) {
                                launchActivity.m0(-l4.longValue(), this.r, null, num, bArr, null, 0, -1);
                            } else {
                                launchActivity.m0(-l4.longValue(), null, null, num, bArr, null, 0, -1);
                            }
                        }
                        org.telegram.ui.ActionBar.r2 r2Var = this.w;
                        Bundle bundle = this.c;
                        if (r2Var == null || MessagesController.getInstance(this.x).checkCanOpenChat(bundle, r2Var)) {
                            ((ActionBarLayout) launchActivity.O()).R(new wn(bundle));
                            break;
                        }
                    }
                }
                launchActivity.G0(org.telegram.ui.Components.g5.G(launchActivity, LocaleController.getString(R.string.DialogNotAvailable), LocaleController.getString(R.string.LinkNotFound)));
                break;
            default:
                int[] iArr = (int[]) obj;
                Pattern pattern2 = LaunchActivity.D1;
                LaunchActivity launchActivity2 = this.b;
                org.telegram.ui.ActionBar.j5 O = launchActivity2.O();
                Bundle bundle2 = this.c;
                if (!((ActionBarLayout) O).R(new wn(bundle2))) {
                    TLRPC.TL_channels_getChannels tL_channels_getChannels = new TLRPC.TL_channels_getChannels();
                    TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                    Long l11 = this.d;
                    tL_inputChannel.channel_id = l11.longValue();
                    tL_channels_getChannels.id.add(tL_inputChannel);
                    iArr[0] = ConnectionsManager.getInstance(launchActivity2.O).sendRequest(tL_channels_getChannels, new org.telegram.messenger.m1(launchActivity2, this.e, this.f, l11, this.h, this.n, this.r, this.s, this.v, this.w, this.x, bundle2));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ g90(LaunchActivity launchActivity, kz kzVar, TLObject tLObject, boolean z10, Long l4, qf.c cVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.r2 r2Var, int i10, Bundle bundle) {
        this.b = launchActivity;
        this.e = kzVar;
        this.y = tLObject;
        this.f = z10;
        this.d = l4;
        this.h = cVar;
        this.n = l10;
        this.r = num;
        this.s = num2;
        this.v = bArr;
        this.w = r2Var;
        this.x = i10;
        this.c = bundle;
    }
}
