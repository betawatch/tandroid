package org.telegram.ui;

import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class d70 implements Runnable {
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

    public /* synthetic */ d70(LaunchActivity launchActivity, Bundle bundle, byte[] bArr, int i7, Integer num, String str, int i10, long j3, j0 j0Var, org.telegram.ui.ActionBar.f2 f2Var) {
        this.b = launchActivity;
        this.r = bundle;
        this.c = bArr;
        this.d = i7;
        this.e = num;
        this.f = str;
        this.h = i10;
        this.n = j3;
        this.s = j0Var;
        this.w = f2Var;
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
                String str = LaunchActivity.B1;
                if (tLObject instanceof TLRPC.messages_Messages) {
                    ArrayList<TLRPC.Message> arrayList = ((TLRPC.messages_Messages) tLObject).messages;
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (arrayList.get(i10) != null && arrayList.get(i10).id == this.e.intValue()) {
                            message = arrayList.get(i10);
                            LaunchActivity launchActivity = this.b;
                            long j3 = this.n;
                            if (message == null) {
                                int i11 = launchActivity.O;
                                Integer valueOf = Integer.valueOf(message.id);
                                int i12 = launchActivity.O;
                                launchActivity.z0(i11, null, valueOf, null, Long.valueOf(org.telegram.messenger.ij.b2(i12, message, org.telegram.messenger.qp.s1(i12).t2(org.telegram.messenger.ij.B0(message)), false)), num, this.c, org.telegram.messenger.qp.s1(launchActivity.O).M0(Long.valueOf(-j3)), runnable, this.f, this.d, this.h);
                                break;
                            } else {
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", -j3);
                                launchActivity.t0(y91.J0(launchActivity, bundle));
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
                final org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) obj;
                String str2 = LaunchActivity.B1;
                final LaunchActivity launchActivity3 = this.b;
                launchActivity3.getClass();
                final cn cnVar = new cn(bundle2);
                final byte[] bArr = this.c;
                final int i13 = this.d;
                final Integer num2 = this.e;
                final String str3 = this.f;
                final int i14 = this.h;
                if (bArr != null) {
                    cnVar.h8 = bArr;
                    cnVar.b8 = i13;
                } else if (num2 != null) {
                    cnVar.g8 = num2;
                    cnVar.b8 = i13;
                } else {
                    cnVar.Rb(i13, i14, str3);
                }
                if (!((ActionBarLayout) (org.telegram.messenger.g0.Q1() ? launchActivity3.q0 : launchActivity3.M())).S(cnVar)) {
                    final long j10 = this.n;
                    if (j10 < 0) {
                        TLRPC.TL_channels_getChannels tL_channels_getChannels = new TLRPC.TL_channels_getChannels();
                        TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                        tL_inputChannel.channel_id = -j10;
                        tL_channels_getChannels.id.add(tL_inputChannel);
                        j0Var.b = new v70(launchActivity3, ConnectionsManager.getInstance(launchActivity3.O).sendRequest(tL_channels_getChannels, new RequestDelegate() { // from class: org.telegram.ui.u70
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(final TLObject tLObject2, TLRPC.TL_error tL_error) {
                                String str4 = LaunchActivity.B1;
                                final LaunchActivity launchActivity4 = LaunchActivity.this;
                                launchActivity4.getClass();
                                final j0 j0Var2 = j0Var;
                                final long j11 = j10;
                                final int i15 = i13;
                                final Integer num3 = num2;
                                final byte[] bArr2 = bArr;
                                final org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                                final Bundle bundle3 = bundle2;
                                final cn cnVar2 = cnVar;
                                final String str5 = str3;
                                final int i16 = i14;
                                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.x70
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        String str6 = LaunchActivity.B1;
                                        LaunchActivity launchActivity5 = LaunchActivity.this;
                                        launchActivity5.getClass();
                                        j0Var2.c(false);
                                        TLObject tLObject3 = tLObject2;
                                        if (tLObject3 instanceof TLRPC.TL_messages_chats) {
                                            TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject3;
                                            if (!tL_messages_chats.chats.isEmpty()) {
                                                org.telegram.messenger.qp.s1(launchActivity5.O).S3(tL_messages_chats.chats, false);
                                                TLRPC.Chat chat = tL_messages_chats.chats.get(0);
                                                int i17 = i15;
                                                if (chat != null && chat.forum) {
                                                    launchActivity5.l0(-j11, Integer.valueOf(i17), null, num3, bArr2, null, 0, -1);
                                                }
                                                org.telegram.ui.ActionBar.f2 f2Var3 = f2Var2;
                                                Bundle bundle4 = bundle3;
                                                if (f2Var3 == null || org.telegram.messenger.qp.s1(launchActivity5.O).E(bundle4, f2Var3, null, null)) {
                                                    cn cnVar3 = new cn(bundle4);
                                                    cnVar2.Rb(i17, i16, str5);
                                                    ((ActionBarLayout) launchActivity5.M()).S(cnVar3);
                                                    return;
                                                }
                                                return;
                                            }
                                        }
                                        launchActivity5.F0(org.telegram.ui.Components.v4.E(launchActivity5, org.telegram.messenger.id.M0(2131751454, null), org.telegram.messenger.id.M0(2131748895, null)));
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

    public /* synthetic */ d70(LaunchActivity launchActivity, TLObject tLObject, Integer num, Integer num2, byte[] bArr, long j3, Runnable runnable, String str, int i7, int i10) {
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
