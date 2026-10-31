package org.telegram.ui;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class b80 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ LaunchActivity b;
    public final /* synthetic */ byte[] c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Integer e;
    public final /* synthetic */ String f;
    public final /* synthetic */ int h;
    public final /* synthetic */ long n;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object w;

    public /* synthetic */ b80(LaunchActivity launchActivity, Bundle bundle, byte[] bArr, int i10, Integer num, String str, int i11, long j10, k0 k0Var, org.telegram.ui.ActionBar.k2 k2Var) {
        this.b = launchActivity;
        this.r = bundle;
        this.c = bArr;
        this.d = i10;
        this.e = num;
        this.f = str;
        this.h = i11;
        this.n = j10;
        this.s = k0Var;
        this.w = k2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0111  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        TLRPC.Message message;
        int i10 = this.a;
        Object obj = this.w;
        Object obj2 = this.s;
        Object obj3 = this.r;
        switch (i10) {
            case 0:
                TLObject tLObject = (TLObject) obj3;
                Integer num = (Integer) obj2;
                Runnable runnable = (Runnable) obj;
                Pattern pattern = LaunchActivity.D1;
                if (tLObject instanceof TLRPC.messages_Messages) {
                    ArrayList<TLRPC.Message> arrayList = ((TLRPC.messages_Messages) tLObject).messages;
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        if (arrayList.get(i11) != null && arrayList.get(i11).id == this.e.intValue()) {
                            message = arrayList.get(i11);
                            LaunchActivity launchActivity = this.b;
                            long j10 = this.n;
                            if (message == null) {
                                int i12 = launchActivity.O;
                                Integer valueOf = Integer.valueOf(message.id);
                                int i13 = launchActivity.O;
                                launchActivity.z0(i12, null, valueOf, null, Long.valueOf(org.telegram.messenger.jj.c2(i13, message, org.telegram.messenger.vp.r1(i13).s2(org.telegram.messenger.jj.B0(message)), false)), num, this.c, org.telegram.messenger.vp.r1(launchActivity.O).L0(Long.valueOf(-j10)), runnable, this.f, this.d, this.h);
                                break;
                            } else {
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", -j10);
                                launchActivity.t0(pb1.I0(launchActivity, bundle));
                                if (runnable != null) {
                                    runnable.run();
                                    break;
                                }
                            }
                        }
                    }
                }
                message = null;
                LaunchActivity launchActivity2 = this.b;
                long j102 = this.n;
                if (message == null) {
                }
                break;
            default:
                final Bundle bundle2 = (Bundle) obj3;
                final k0 k0Var = (k0) obj2;
                final org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) obj;
                Pattern pattern2 = LaunchActivity.D1;
                final LaunchActivity launchActivity3 = this.b;
                launchActivity3.getClass();
                final un unVar = new un(bundle2);
                final byte[] bArr = this.c;
                final int i14 = this.d;
                final Integer num2 = this.e;
                final String str = this.f;
                final int i15 = this.h;
                if (bArr != null) {
                    unVar.h8 = bArr;
                    unVar.b8 = i14;
                } else if (num2 != null) {
                    unVar.g8 = num2;
                    unVar.b8 = i14;
                } else {
                    unVar.Eb(i14, i15, str);
                }
                if (!((ActionBarLayout) (org.telegram.messenger.i0.Q1() ? launchActivity3.s0 : launchActivity3.M())).R(unVar)) {
                    final long j11 = this.n;
                    if (j11 < 0) {
                        TLRPC.TL_channels_getChannels tL_channels_getChannels = new TLRPC.TL_channels_getChannels();
                        TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                        tL_inputChannel.channel_id = -j11;
                        tL_channels_getChannels.id.add(tL_inputChannel);
                        k0Var.b = new t80(launchActivity3, ConnectionsManager.getInstance(launchActivity3.O).sendRequest(tL_channels_getChannels, new RequestDelegate() { // from class: org.telegram.ui.s80
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(final TLObject tLObject2, TLRPC.TL_error tL_error) {
                                Pattern pattern3 = LaunchActivity.D1;
                                final LaunchActivity launchActivity4 = LaunchActivity.this;
                                launchActivity4.getClass();
                                final k0 k0Var2 = k0Var;
                                final long j12 = j11;
                                final int i16 = i14;
                                final Integer num3 = num2;
                                final byte[] bArr2 = bArr;
                                final org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                                final Bundle bundle3 = bundle2;
                                final un unVar2 = unVar;
                                final String str2 = str;
                                final int i17 = i15;
                                org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.w80
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        Pattern pattern4 = LaunchActivity.D1;
                                        LaunchActivity launchActivity5 = LaunchActivity.this;
                                        launchActivity5.getClass();
                                        k0Var2.c(false);
                                        TLObject tLObject3 = tLObject2;
                                        if (tLObject3 instanceof TLRPC.TL_messages_chats) {
                                            TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject3;
                                            if (!tL_messages_chats.chats.isEmpty()) {
                                                org.telegram.messenger.vp.r1(launchActivity5.O).P3(tL_messages_chats.chats, false);
                                                TLRPC.Chat chat = tL_messages_chats.chats.get(0);
                                                int i18 = i16;
                                                if (chat != null && chat.forum) {
                                                    launchActivity5.l0(-j12, Integer.valueOf(i18), null, num3, bArr2, null, 0, -1);
                                                }
                                                org.telegram.ui.ActionBar.k2 k2Var3 = k2Var2;
                                                Bundle bundle4 = bundle3;
                                                if (k2Var3 == null || org.telegram.messenger.vp.r1(launchActivity5.O).E(bundle4, k2Var3, null, null)) {
                                                    un unVar3 = new un(bundle4);
                                                    unVar2.Eb(i18, i17, str2);
                                                    ((ActionBarLayout) launchActivity5.M()).R(unVar3);
                                                    return;
                                                }
                                                return;
                                            }
                                        }
                                        launchActivity5.F0(org.telegram.ui.Components.s4.G(launchActivity5, org.telegram.messenger.cd.L0(2131751455, null), org.telegram.messenger.cd.L0(2131748905, null)));
                                    }
                                });
                            }
                        }), 0);
                        break;
                    }
                }
                k0Var.c(false);
                break;
        }
    }

    public /* synthetic */ b80(LaunchActivity launchActivity, TLObject tLObject, Integer num, Integer num2, byte[] bArr, long j10, Runnable runnable, String str, int i10, int i11) {
        this.b = launchActivity;
        this.r = tLObject;
        this.e = num;
        this.s = num2;
        this.c = bArr;
        this.n = j10;
        this.w = runnable;
        this.f = str;
        this.d = i10;
        this.h = i11;
    }
}
