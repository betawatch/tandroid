package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l70 implements Runnable {
    public final /* synthetic */ Object D;
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ LaunchActivity b;
    public final /* synthetic */ Bundle c;
    public final /* synthetic */ Long d;
    public final /* synthetic */ f10 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ vf.b h;
    public final /* synthetic */ Long n;
    public final /* synthetic */ Integer r;
    public final /* synthetic */ Integer s;
    public final /* synthetic */ byte[] w;
    public final /* synthetic */ org.telegram.ui.ActionBar.f2 x;
    public final /* synthetic */ int y;

    public /* synthetic */ l70(LaunchActivity launchActivity, Bundle bundle, Long l10, int[] iArr, f10 f10Var, boolean z9, vf.b bVar, Long l11, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.f2 f2Var, int i7) {
        this.b = launchActivity;
        this.c = bundle;
        this.d = l10;
        this.D = iArr;
        this.e = f10Var;
        this.f = z9;
        this.h = bVar;
        this.n = l11;
        this.r = num;
        this.s = num2;
        this.w = bArr;
        this.x = f2Var;
        this.y = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        Object obj = this.D;
        switch (i7) {
            case 0:
                f10 f10Var = this.e;
                TLObject tLObject = (TLObject) obj;
                String str = LaunchActivity.B1;
                try {
                    f10Var.run();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                boolean z9 = tLObject instanceof TLRPC.TL_messages_chats;
                LaunchActivity launchActivity = this.b;
                if (z9) {
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
                    if (!tL_messages_chats.chats.isEmpty()) {
                        org.telegram.messenger.qp.s1(launchActivity.O).S3(tL_messages_chats.chats, false);
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
                        org.telegram.ui.ActionBar.f2 f2Var = this.x;
                        Bundle bundle = this.c;
                        if (f2Var == null || org.telegram.messenger.qp.s1(this.y).E(bundle, f2Var, null, null)) {
                            ((ActionBarLayout) launchActivity.M()).S(new cn(bundle));
                            break;
                        }
                    }
                }
                launchActivity.F0(org.telegram.ui.Components.u4.E(launchActivity, org.telegram.messenger.id.M0(2131751454, null), org.telegram.messenger.id.M0(2131748895, null)));
                break;
            default:
                int[] iArr = (int[]) obj;
                String str2 = LaunchActivity.B1;
                LaunchActivity launchActivity2 = this.b;
                org.telegram.ui.ActionBar.r4 M = launchActivity2.M();
                Bundle bundle2 = this.c;
                if (!((ActionBarLayout) M).S(new cn(bundle2))) {
                    TLRPC.TL_channels_getChannels tL_channels_getChannels = new TLRPC.TL_channels_getChannels();
                    TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                    Long l12 = this.d;
                    tL_inputChannel.channel_id = l12.longValue();
                    tL_channels_getChannels.id.add(tL_inputChannel);
                    iArr[0] = ConnectionsManager.getInstance(launchActivity2.O).sendRequest(tL_channels_getChannels, new org.telegram.messenger.o4(launchActivity2, this.e, this.f, l12, this.h, this.n, this.r, this.s, this.w, this.x, this.y, bundle2));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ l70(LaunchActivity launchActivity, f10 f10Var, TLObject tLObject, boolean z9, Long l10, vf.b bVar, Long l11, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.f2 f2Var, int i7, Bundle bundle) {
        this.b = launchActivity;
        this.e = f10Var;
        this.D = tLObject;
        this.f = z9;
        this.d = l10;
        this.h = bVar;
        this.n = l11;
        this.r = num;
        this.s = num2;
        this.w = bArr;
        this.x = f2Var;
        this.y = i7;
        this.c = bundle;
    }
}
