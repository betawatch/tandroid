// default package

import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class b06 implements Runnable {
    public final /* synthetic */ byte a = 1;
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

    public /* synthetic */ b06(LaunchActivity launchActivity, Bundle bundle, byte[] bArr, int i, Integer num, String str, int i2, long j, vu vuVar, d dVar) {
        this.b = launchActivity;
        this.r = bundle;
        this.c = bArr;
        this.d = i;
        this.e = num;
        this.f = str;
        this.h = i2;
        this.n = j;
        this.s = vuVar;
        this.w = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0111  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        TLRPC.Message message;
        byte b = this.a;
        Object obj = this.w;
        Object obj2 = this.s;
        Object obj3 = this.r;
        switch (b) {
            case 0:
                TLObject tLObject = (TLObject) obj3;
                Integer num = (Integer) obj2;
                Runnable runnable = (Runnable) obj;
                String str = LaunchActivity.C1;
                if (tLObject instanceof TLRPC.messages_Messages) {
                    ArrayList<TLRPC.Message> arrayList = ((TLRPC.messages_Messages) tLObject).messages;
                    for (int i = 0; i < arrayList.size(); i++) {
                        if (arrayList.get(i) != null && arrayList.get(i).id == this.e.intValue()) {
                            message = arrayList.get(i);
                            LaunchActivity launchActivity = this.b;
                            long j = this.n;
                            if (message == null) {
                                int i2 = launchActivity.P;
                                Integer valueOf = Integer.valueOf(message.id);
                                int i3 = launchActivity.P;
                                launchActivity.z0(i2, null, valueOf, null, Long.valueOf(k47.b2(i3, message, oc7.r1(i3).s2(k47.B0(message)), false)), num, this.c, oc7.r1(launchActivity.P).L0(Long.valueOf(-j)), runnable, this.f, this.d, this.h);
                                break;
                            } else {
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", -j);
                                launchActivity.t0(sxb.G0(launchActivity, bundle));
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
                long j2 = this.n;
                if (message == null) {
                }
                break;
            default:
                final Bundle bundle2 = (Bundle) obj3;
                final vu vuVar = (vu) obj2;
                final d dVar = (d) obj;
                String str2 = LaunchActivity.C1;
                final LaunchActivity launchActivity3 = this.b;
                launchActivity3.getClass();
                final yv1 yv1Var = new yv1(bundle2);
                final byte[] bArr = this.c;
                final int i4 = this.d;
                final Integer num2 = this.e;
                final String str3 = this.f;
                final int i5 = this.h;
                if (bArr != null) {
                    yv1Var.j8 = bArr;
                    yv1Var.d8 = i4;
                } else if (num2 != null) {
                    yv1Var.i8 = num2;
                    yv1Var.d8 = i4;
                } else {
                    yv1Var.Kb(i4, i5, str3);
                }
                if (!((ActionBarLayout) (gm.O1() ? launchActivity3.r0 : launchActivity3.N())).S(yv1Var)) {
                    final long j3 = this.n;
                    if (j3 < 0) {
                        TLRPC.TL_channels_getChannels tL_channels_getChannels = new TLRPC.TL_channels_getChannels();
                        TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                        tL_inputChannel.channel_id = -j3;
                        tL_channels_getChannels.id.add(tL_inputChannel);
                        vuVar.b = new bm3(launchActivity3, ConnectionsManager.getInstance(launchActivity3.P).sendRequest(tL_channels_getChannels, new RequestDelegate() { // from class: v06
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(final TLObject tLObject2, TLRPC.TL_error tL_error) {
                                String str4 = LaunchActivity.C1;
                                final LaunchActivity launchActivity4 = LaunchActivity.this;
                                launchActivity4.getClass();
                                final vu vuVar2 = vuVar;
                                final long j4 = j3;
                                final int i6 = i4;
                                final Integer num3 = num2;
                                final byte[] bArr2 = bArr;
                                final d dVar2 = dVar;
                                final Bundle bundle3 = bundle2;
                                final yv1 yv1Var2 = yv1Var;
                                final String str5 = str3;
                                final int i7 = i5;
                                gm.c3(new Runnable() { // from class: x06
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        String str6 = LaunchActivity.C1;
                                        LaunchActivity launchActivity5 = LaunchActivity.this;
                                        launchActivity5.getClass();
                                        vuVar2.c(false);
                                        TLObject tLObject3 = tLObject2;
                                        if (tLObject3 instanceof TLRPC.TL_messages_chats) {
                                            TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject3;
                                            if (!tL_messages_chats.chats.isEmpty()) {
                                                oc7.r1(launchActivity5.P).X3(tL_messages_chats.chats, false);
                                                TLRPC.Chat chat = tL_messages_chats.chats.get(0);
                                                int i8 = i6;
                                                if (chat != null && chat.forum) {
                                                    launchActivity5.l0(-j4, Integer.valueOf(i8), null, num3, bArr2, null, 0, -1);
                                                }
                                                d dVar3 = dVar2;
                                                Bundle bundle4 = bundle3;
                                                if (dVar3 == null || oc7.r1(launchActivity5.P).A(bundle4, dVar3, null, null)) {
                                                    yv1 yv1Var3 = new yv1(bundle4);
                                                    yv1Var2.Kb(i8, i7, str5);
                                                    ((ActionBarLayout) launchActivity5.N()).S(yv1Var3);
                                                    return;
                                                }
                                                return;
                                            }
                                        }
                                        launchActivity5.F0(ik.E(launchActivity5, jb6.M0(2131751391, null), jb6.M0(2131748652, null)));
                                    }
                                });
                            }
                        }), (byte) 18);
                        break;
                    }
                }
                vuVar.c(false);
                break;
        }
    }

    public /* synthetic */ b06(LaunchActivity launchActivity, TLObject tLObject, Integer num, Integer num2, byte[] bArr, long j, Runnable runnable, String str, int i, int i2) {
        this.b = launchActivity;
        this.r = tLObject;
        this.e = num;
        this.s = num2;
        this.c = bArr;
        this.n = j;
        this.w = runnable;
        this.f = str;
        this.d = i;
        this.h = i2;
    }
}
