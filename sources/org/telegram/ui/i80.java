package org.telegram.ui;

import android.os.Bundle;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class i80 implements Runnable {
    public final /* synthetic */ Object D;
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ LaunchActivity b;
    public final /* synthetic */ Bundle c;
    public final /* synthetic */ Long d;
    public final /* synthetic */ f70 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ gf.e h;
    public final /* synthetic */ Long n;
    public final /* synthetic */ Integer r;
    public final /* synthetic */ Integer s;
    public final /* synthetic */ byte[] w;
    public final /* synthetic */ org.telegram.ui.ActionBar.k2 x;
    public final /* synthetic */ int y;

    public /* synthetic */ i80(LaunchActivity launchActivity, Bundle bundle, Long l4, int[] iArr, f70 f70Var, boolean z10, gf.e eVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.k2 k2Var, int i10) {
        this.b = launchActivity;
        this.c = bundle;
        this.d = l4;
        this.D = iArr;
        this.e = f70Var;
        this.f = z10;
        this.h = eVar;
        this.n = l10;
        this.r = num;
        this.s = num2;
        this.w = bArr;
        this.x = k2Var;
        this.y = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        Object obj = this.D;
        switch (i10) {
            case 0:
                f70 f70Var = this.e;
                TLObject tLObject = (TLObject) obj;
                Pattern pattern = LaunchActivity.D1;
                try {
                    f70Var.run();
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
                boolean z10 = tLObject instanceof TLRPC.TL_messages_chats;
                LaunchActivity launchActivity = this.b;
                if (z10) {
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
                    if (!tL_messages_chats.chats.isEmpty()) {
                        org.telegram.messenger.vp.r1(launchActivity.O).P3(tL_messages_chats.chats, false);
                        TLRPC.Chat chat = tL_messages_chats.chats.get(0);
                        Long l4 = this.d;
                        if (chat != null && this.f && org.telegram.messenger.w3.R(chat)) {
                            launchActivity.w0(Long.valueOf(-l4.longValue()), null, this.h, null);
                        } else if (chat != null && chat.forum) {
                            Long l10 = this.n;
                            Integer num = this.s;
                            byte[] bArr = this.w;
                            if (l10 != null) {
                                launchActivity.l0(-l4.longValue(), this.r, null, num, bArr, null, 0, -1);
                            } else {
                                launchActivity.l0(-l4.longValue(), null, null, num, bArr, null, 0, -1);
                            }
                        }
                        org.telegram.ui.ActionBar.k2 k2Var = this.x;
                        Bundle bundle = this.c;
                        if (k2Var == null || org.telegram.messenger.vp.r1(this.y).E(bundle, k2Var, null, null)) {
                            ((ActionBarLayout) launchActivity.M()).R(new un(bundle));
                            break;
                        }
                    }
                }
                launchActivity.F0(org.telegram.ui.Components.s4.G(launchActivity, org.telegram.messenger.cd.L0(2131751455, null), org.telegram.messenger.cd.L0(2131748905, null)));
                break;
            default:
                int[] iArr = (int[]) obj;
                Pattern pattern2 = LaunchActivity.D1;
                LaunchActivity launchActivity2 = this.b;
                org.telegram.ui.ActionBar.z4 M = launchActivity2.M();
                Bundle bundle2 = this.c;
                if (!((ActionBarLayout) M).R(new un(bundle2))) {
                    TLRPC.TL_channels_getChannels tL_channels_getChannels = new TLRPC.TL_channels_getChannels();
                    TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                    Long l11 = this.d;
                    tL_inputChannel.channel_id = l11.longValue();
                    tL_channels_getChannels.id.add(tL_inputChannel);
                    iArr[0] = ConnectionsManager.getInstance(launchActivity2.O).sendRequest(tL_channels_getChannels, new org.telegram.messenger.r4(launchActivity2, this.e, this.f, l11, this.h, this.n, this.r, this.s, this.w, this.x, this.y, bundle2));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ i80(LaunchActivity launchActivity, f70 f70Var, TLObject tLObject, boolean z10, Long l4, gf.e eVar, Long l10, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.k2 k2Var, int i10, Bundle bundle) {
        this.b = launchActivity;
        this.e = f70Var;
        this.D = tLObject;
        this.f = z10;
        this.d = l4;
        this.h = eVar;
        this.n = l10;
        this.r = num;
        this.s = num2;
        this.w = bArr;
        this.x = k2Var;
        this.y = i10;
        this.c = bundle;
    }
}
