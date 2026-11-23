package org.telegram.ui;

import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class b70 implements Runnable {
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

    public /* synthetic */ b70(LaunchActivity launchActivity, Bundle bundle, byte[] bArr, int i7, Integer num, String str, int i10, long j3, j0 j0Var, org.telegram.ui.ActionBar.g2 g2Var) {
        this.b = launchActivity;
        this.r = bundle;
        this.c = bArr;
        this.d = i7;
        this.e = num;
        this.f = str;
        this.h = i10;
        this.n = j3;
        this.s = j0Var;
        this.w = g2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0111  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        TLRPC.Message message;
        int i7 = this.a;
        Object obj = this.w;
        Object obj2 = this.s;
        Object obj3 = this.r;
        switch (i7) {
            case 0:
                TLObject tLObject = (TLObject) obj3;
                Integer num = (Integer) obj2;
                Runnable runnable = (Runnable) obj;
                String str = LaunchActivity.C1;
                if (tLObject instanceof TLRPC.messages_Messages) {
                    ArrayList<TLRPC.Message> arrayList = ((TLRPC.messages_Messages) tLObject).messages;
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (arrayList.get(i10) != null && arrayList.get(i10).id == this.e.intValue()) {
                            message = arrayList.get(i10);
                            LaunchActivity launchActivity = this.b;
                            long j3 = this.n;
                            if (message == null) {
                                int i11 = launchActivity.P;
                                Integer valueOf = Integer.valueOf(message.id);
                                int i12 = launchActivity.P;
                                launchActivity.z0(i11, null, valueOf, null, Long.valueOf(org.telegram.messenger.fj.b2(i12, message, org.telegram.messenger.mp.u1(i12).y2(org.telegram.messenger.fj.B0(message)), false)), num, this.c, org.telegram.messenger.mp.u1(launchActivity.P).O0(Long.valueOf(-j3)), runnable, this.f, this.d, this.h);
                                break;
                            } else {
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", -j3);
                                launchActivity.t0(w91.J0(launchActivity, bundle));
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
                long j32 = this.n;
                if (message == null) {
                }
                break;
            default:
                final Bundle bundle2 = (Bundle) obj3;
                final j0 j0Var = (j0) obj2;
                final org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) obj;
                String str2 = LaunchActivity.C1;
                final LaunchActivity launchActivity3 = this.b;
                launchActivity3.getClass();
                final bn bnVar = new bn(bundle2);
                final byte[] bArr = this.c;
                final int i13 = this.d;
                final Integer num2 = this.e;
                final String str3 = this.f;
                final int i14 = this.h;
                if (bArr != null) {
                    bnVar.j8 = bArr;
                    bnVar.d8 = i13;
                } else if (num2 != null) {
                    bnVar.i8 = num2;
                    bnVar.d8 = i13;
                } else {
                    bnVar.Sb(i13, i14, str3);
                }
                if (!((ActionBarLayout) (org.telegram.messenger.g0.Q1() ? launchActivity3.r0 : launchActivity3.M())).S(bnVar)) {
                    final long j10 = this.n;
                    if (j10 < 0) {
                        TLRPC.TL_channels_getChannels tL_channels_getChannels = new TLRPC.TL_channels_getChannels();
                        TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                        tL_inputChannel.channel_id = -j10;
                        tL_channels_getChannels.id.add(tL_inputChannel);
                        j0Var.b = new t70(launchActivity3, ConnectionsManager.getInstance(launchActivity3.P).sendRequest(tL_channels_getChannels, new RequestDelegate() { // from class: org.telegram.ui.s70
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(final TLObject tLObject2, TLRPC.TL_error tL_error) {
                                String str4 = LaunchActivity.C1;
                                final LaunchActivity launchActivity4 = LaunchActivity.this;
                                launchActivity4.getClass();
                                final j0 j0Var2 = j0Var;
                                final long j11 = j10;
                                final int i15 = i13;
                                final Integer num3 = num2;
                                final byte[] bArr2 = bArr;
                                final org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                                final Bundle bundle3 = bundle2;
                                final bn bnVar2 = bnVar;
                                final String str5 = str3;
                                final int i16 = i14;
                                org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.ui.v70
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        String str6 = LaunchActivity.C1;
                                        LaunchActivity launchActivity5 = LaunchActivity.this;
                                        launchActivity5.getClass();
                                        j0Var2.c(false);
                                        TLObject tLObject3 = tLObject2;
                                        if (tLObject3 instanceof TLRPC.TL_messages_chats) {
                                            TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject3;
                                            if (!tL_messages_chats.chats.isEmpty()) {
                                                org.telegram.messenger.mp.u1(launchActivity5.P).Z3(tL_messages_chats.chats, false);
                                                TLRPC.Chat chat = tL_messages_chats.chats.get(0);
                                                int i17 = i15;
                                                if (chat != null && chat.forum) {
                                                    launchActivity5.l0(-j11, Integer.valueOf(i17), null, num3, bArr2, null, 0, -1);
                                                }
                                                org.telegram.ui.ActionBar.g2 g2Var3 = g2Var2;
                                                Bundle bundle4 = bundle3;
                                                if (g2Var3 == null || org.telegram.messenger.mp.u1(launchActivity5.P).E(bundle4, g2Var3, null, null)) {
                                                    bn bnVar3 = new bn(bundle4);
                                                    bnVar2.Sb(i17, i16, str5);
                                                    ((ActionBarLayout) launchActivity5.M()).S(bnVar3);
                                                    return;
                                                }
                                                return;
                                            }
                                        }
                                        launchActivity5.F0(org.telegram.ui.Components.b5.E(launchActivity5, org.telegram.messenger.gd.N0(2131751442, null), org.telegram.messenger.gd.N0(2131748702, null)));
                                    }
                                });
                            }
                        }), 0);
                        break;
                    }
                }
                j0Var.c(false);
                break;
        }
    }

    public /* synthetic */ b70(LaunchActivity launchActivity, TLObject tLObject, Integer num, Integer num2, byte[] bArr, long j3, Runnable runnable, String str, int i7, int i10) {
        this.b = launchActivity;
        this.r = tLObject;
        this.e = num;
        this.s = num2;
        this.c = bArr;
        this.n = j3;
        this.w = runnable;
        this.f = str;
        this.d = i7;
        this.h = i10;
    }
}
