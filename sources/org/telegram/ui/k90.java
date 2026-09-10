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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class k90 implements Runnable {
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

    public /* synthetic */ k90(LaunchActivity launchActivity, Bundle bundle, byte[] bArr, int i10, Integer num, String str, int i11, long j3, j0 j0Var, org.telegram.ui.ActionBar.p2 p2Var) {
        this.b = launchActivity;
        this.r = bundle;
        this.c = bArr;
        this.d = i10;
        this.e = num;
        this.f = str;
        this.h = i11;
        this.n = j3;
        this.s = j0Var;
        this.v = p2Var;
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
                                launchActivity.p0(ig1.F0(launchActivity, bundle));
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
                final org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj;
                Pattern pattern2 = LaunchActivity.B1;
                final LaunchActivity launchActivity3 = this.b;
                launchActivity3.getClass();
                final eo eoVar = new eo(bundle2);
                final byte[] bArr = this.c;
                final int i14 = this.d;
                final Integer num2 = this.e;
                final String str = this.f;
                final int i15 = this.h;
                if (bArr != null) {
                    eoVar.R7 = bArr;
                    eoVar.L7 = i14;
                } else if (num2 != null) {
                    eoVar.Q7 = num2;
                    eoVar.L7 = i14;
                } else {
                    eoVar.mb(i14, i15, str);
                }
                if (!((ActionBarLayout) (AndroidUtilities.isTablet() ? launchActivity3.s0 : launchActivity3.O())).P(eoVar)) {
                    final long j10 = this.n;
                    if (j10 < 0) {
                        TLRPC.TL_channels_getChannels tL_channels_getChannels = new TLRPC.TL_channels_getChannels();
                        TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                        tL_inputChannel.channel_id = -j10;
                        tL_channels_getChannels.id.add(tL_inputChannel);
                        j0Var.b = new u80(launchActivity3, ConnectionsManager.getInstance(launchActivity3.O).sendRequest(tL_channels_getChannels, new RequestDelegate() { // from class: org.telegram.ui.y90
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(final TLObject tLObject2, TLRPC.TL_error tL_error) {
                                Pattern pattern3 = LaunchActivity.B1;
                                final LaunchActivity launchActivity4 = LaunchActivity.this;
                                launchActivity4.getClass();
                                final j0 j0Var2 = j0Var;
                                final long j11 = j10;
                                final int i16 = i14;
                                final Integer num3 = num2;
                                final byte[] bArr2 = bArr;
                                final org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                                final Bundle bundle3 = bundle2;
                                final eo eoVar2 = eoVar;
                                final String str2 = str;
                                final int i17 = i15;
                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.ba0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        Pattern pattern4 = LaunchActivity.B1;
                                        LaunchActivity launchActivity5 = LaunchActivity.this;
                                        launchActivity5.getClass();
                                        j0Var2.c(false);
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
                                                org.telegram.ui.ActionBar.p2 p2Var3 = p2Var2;
                                                Bundle bundle4 = bundle3;
                                                if (p2Var3 == null || MessagesController.getInstance(launchActivity5.O).checkCanOpenChat(bundle4, p2Var3)) {
                                                    eo eoVar3 = new eo(bundle4);
                                                    eoVar2.mb(i18, i17, str2);
                                                    ((ActionBarLayout) launchActivity5.O()).P(eoVar3);
                                                    return;
                                                }
                                                return;
                                            }
                                        }
                                        launchActivity5.B0(org.telegram.ui.Components.d5.H(launchActivity5, LocaleController.getString(R.string.DialogNotAvailable), LocaleController.getString(R.string.LinkNotFound)));
                                    }
                                });
                            }
                        }), 1);
                        break;
                    }
                }
                j0Var.c(false);
                break;
        }
    }

    public /* synthetic */ k90(LaunchActivity launchActivity, TLObject tLObject, Integer num, Integer num2, byte[] bArr, long j3, Runnable runnable, String str, int i10, int i11) {
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
