package org.telegram.ui;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class l90 implements Runnable {
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
    public final /* synthetic */ Object v;

    public /* synthetic */ l90(LaunchActivity launchActivity, Bundle bundle, byte[] bArr, int i10, Integer num, String str, int i11, long j3, i0 i0Var, org.telegram.ui.ActionBar.n2 n2Var) {
        this.b = launchActivity;
        this.r = bundle;
        this.c = bArr;
        this.d = i10;
        this.e = num;
        this.f = str;
        this.h = i11;
        this.n = j3;
        this.s = i0Var;
        this.v = n2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010b  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        TLRPC.Message message;
        int i10 = this.a;
        Object obj = this.v;
        Object obj2 = this.s;
        Object obj3 = this.r;
        switch (i10) {
            case 0:
                TLObject tLObject = (TLObject) obj3;
                Integer num = (Integer) obj2;
                Runnable runnable = (Runnable) obj;
                Pattern pattern = LaunchActivity.B1;
                if (tLObject instanceof TLRPC.messages_Messages) {
                    ArrayList<TLRPC.Message> arrayList = ((TLRPC.messages_Messages) tLObject).messages;
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        if (arrayList.get(i11) != null && arrayList.get(i11).id == this.e.intValue()) {
                            message = arrayList.get(i11);
                            LaunchActivity launchActivity = this.b;
                            long j3 = this.n;
                            if (message == null) {
                                int i12 = launchActivity.O;
                                Integer valueOf = Integer.valueOf(message.id);
                                int i13 = launchActivity.O;
                                launchActivity.v0(i12, null, valueOf, null, Long.valueOf(MessageObject.getTopicId(i13, message, MessagesController.getInstance(i13).isForum(message))), num, this.c, MessagesController.getInstance(launchActivity.O).getChat(Long.valueOf(-j3)), runnable, this.f, this.d, this.h);
                                break;
                            } else {
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", -j3);
                                launchActivity.p0(eg1.F0(launchActivity, bundle));
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
                final i0 i0Var = (i0) obj2;
                final org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj;
                Pattern pattern2 = LaunchActivity.B1;
                final LaunchActivity launchActivity3 = this.b;
                launchActivity3.getClass();
                final co coVar = new co(bundle2);
                final byte[] bArr = this.c;
                final int i14 = this.d;
                final Integer num2 = this.e;
                final String str = this.f;
                final int i15 = this.h;
                if (bArr != null) {
                    coVar.R7 = bArr;
                    coVar.L7 = i14;
                } else if (num2 != null) {
                    coVar.Q7 = num2;
                    coVar.L7 = i14;
                } else {
                    coVar.mb(i14, i15, str);
                }
                if (!((ActionBarLayout) (AndroidUtilities.isTablet() ? launchActivity3.s0 : launchActivity3.O())).P(coVar)) {
                    final long j10 = this.n;
                    if (j10 < 0) {
                        TLRPC.TL_channels_getChannels tL_channels_getChannels = new TLRPC.TL_channels_getChannels();
                        TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                        tL_inputChannel.channel_id = -j10;
                        tL_channels_getChannels.id.add(tL_inputChannel);
                        i0Var.b = new v80(launchActivity3, ConnectionsManager.getInstance(launchActivity3.O).sendRequest(tL_channels_getChannels, new RequestDelegate() { // from class: org.telegram.ui.z90
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(final TLObject tLObject2, TLRPC.TL_error tL_error) {
                                Pattern pattern3 = LaunchActivity.B1;
                                final LaunchActivity launchActivity4 = LaunchActivity.this;
                                launchActivity4.getClass();
                                final i0 i0Var2 = i0Var;
                                final long j11 = j10;
                                final int i16 = i14;
                                final Integer num3 = num2;
                                final byte[] bArr2 = bArr;
                                final org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                                final Bundle bundle3 = bundle2;
                                final co coVar2 = coVar;
                                final String str2 = str;
                                final int i17 = i15;
                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ca0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        Pattern pattern4 = LaunchActivity.B1;
                                        LaunchActivity launchActivity5 = LaunchActivity.this;
                                        launchActivity5.getClass();
                                        i0Var2.c(false);
                                        TLObject tLObject3 = tLObject2;
                                        if (tLObject3 instanceof TLRPC.TL_messages_chats) {
                                            TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject3;
                                            if (!tL_messages_chats.chats.isEmpty()) {
                                                MessagesController.getInstance(launchActivity5.O).putChats(tL_messages_chats.chats, false);
                                                TLRPC.Chat chat = tL_messages_chats.chats.get(0);
                                                int i18 = i16;
                                                if (chat != null && chat.forum) {
                                                    launchActivity5.k0(-j11, Integer.valueOf(i18), null, num3, bArr2, null, 0, -1);
                                                }
                                                org.telegram.ui.ActionBar.n2 n2Var3 = n2Var2;
                                                Bundle bundle4 = bundle3;
                                                if (n2Var3 == null || MessagesController.getInstance(launchActivity5.O).checkCanOpenChat(bundle4, n2Var3)) {
                                                    co coVar3 = new co(bundle4);
                                                    coVar2.mb(i18, i17, str2);
                                                    ((ActionBarLayout) launchActivity5.O()).P(coVar3);
                                                    return;
                                                }
                                                return;
                                            }
                                        }
                                        launchActivity5.B0(org.telegram.ui.Components.e5.H(launchActivity5, LocaleController.getString(R.string.DialogNotAvailable), LocaleController.getString(R.string.LinkNotFound)));
                                    }
                                });
                            }
                        }), 1);
                        break;
                    }
                }
                i0Var.c(false);
                break;
        }
    }

    public /* synthetic */ l90(LaunchActivity launchActivity, TLObject tLObject, Integer num, Integer num2, byte[] bArr, long j3, Runnable runnable, String str, int i10, int i11) {
        this.b = launchActivity;
        this.r = tLObject;
        this.e = num;
        this.s = num2;
        this.c = bArr;
        this.n = j3;
        this.v = runnable;
        this.f = str;
        this.d = i10;
        this.h = i11;
    }
}
