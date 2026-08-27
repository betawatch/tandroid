package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.style.CharacterStyle;
import android.text.style.URLSpan;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class hb implements org.telegram.ui.Cells.j1 {
    public final /* synthetic */ mb a;

    public hb(mb mbVar) {
        this.a = mbVar;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean A0(MessageObject messageObject) {
        return true;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void E1(org.telegram.ui.Cells.s1 s1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        we.e.s(s1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.j1
    public final void F0(org.telegram.ui.Cells.s1 s1Var, float f10, float f11) {
        qb qbVar = this.a.n;
        int i10 = qb.T0;
        qbVar.P0(s1Var, 0.0f, 0.0f);
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ CharacterStyle F1(org.telegram.ui.Cells.s1 s1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void G1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        qb qbVar = this.a.n;
        org.telegram.ui.Components.fu.J(qbVar, messageObject, qbVar.B0, str2, str3, str4, str, i10, i11, -1, false);
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean H1(org.telegram.ui.Cells.s1 s1Var, MessageObject messageObject) {
        if (messageObject.isVoice() || messageObject.isRoundVideo()) {
            boolean playMessage = MediaController.getInstance().playMessage(messageObject, false);
            MediaController.getInstance().setVoiceMessagesPlaylist(null, false);
            return playMessage;
        }
        if (messageObject.isMusic()) {
            return MediaController.getInstance().setPlaylist(this.a.n.o0, messageObject, 0L);
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean L0(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean M1(org.telegram.ui.Cells.s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void O0(int i10, org.telegram.ui.Cells.s1 s1Var) {
        TLRPC.WebPage webPage;
        int i11;
        qb qbVar = this.a.n;
        MessageObject messageObject = s1Var.getMessageObject();
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = messageObject.currentEvent;
        if (tL_channelAdminLogEvent != null && (tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionEditMessage)) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -messageObject.getDialogId());
            bundle.putInt("message_id", messageObject.getRealId());
            rn rnVar = new rn(bundle);
            if (ChatObject.isForum(qbVar.s)) {
                long dialogId = messageObject.getDialogId();
                i11 = ((org.telegram.ui.ActionBar.n2) qbVar).currentAccount;
                wf.c.a(rnVar, MessagesStorage.TopicKey.of(dialogId, MessageObject.getTopicId(i11, messageObject.messageOwner, true)));
            }
            qbVar.presentFragment(rnVar);
            return;
        }
        if (i10 == 0) {
            TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
            if (messageMedia == null || (webPage = messageMedia.webpage) == null || webPage.cached_page == null) {
                return;
            }
            LaunchActivity launchActivity = LaunchActivity.C1;
            if (launchActivity == null || launchActivity.P() == null || LaunchActivity.C1.P().l(messageObject) == null) {
                qbVar.createArticleViewer(false).N(messageObject, null, null, null);
                return;
            }
            return;
        }
        if (i10 != 5) {
            TLRPC.MessageMedia messageMedia2 = messageObject.messageOwner.media;
            if (messageMedia2 == null || messageMedia2.webpage == null) {
                return;
            }
            we.e.s(qbVar.getParentActivity(), messageObject.messageOwner.media.webpage.url);
            return;
        }
        TLRPC.User user = qbVar.getMessagesController().getUser(Long.valueOf(messageObject.messageOwner.media.user_id));
        TLRPC.MessageMedia messageMedia3 = messageObject.messageOwner.media;
        String str = messageMedia3.vcard;
        String str2 = messageMedia3.first_name;
        String str3 = messageMedia3.last_name;
        try {
            File sharingDirectory = AndroidUtilities.getSharingDirectory();
            sharingDirectory.mkdirs();
            File file = new File(sharingDirectory, "vcard.vcf");
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            bufferedWriter.write(str);
            bufferedWriter.close();
            qbVar.showDialog(new org.telegram.ui.Components.be0(qbVar, null, user, null, file, null, str2, str3, null));
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ ou0 O1() {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean Q1(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void R0(org.telegram.ui.Cells.s1 s1Var, CharacterStyle characterStyle, boolean z10) {
        TLRPC.WebPage webPage;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        qb qbVar = this.a.n;
        if (characterStyle == null) {
            return;
        }
        MessageObject messageObject = s1Var.getMessageObject();
        if (characterStyle instanceof org.telegram.ui.Components.q41) {
            org.telegram.ui.Components.q41 q41Var = (org.telegram.ui.Components.q41) characterStyle;
            AndroidUtilities.addToClipboard(q41Var.a.subSequence(q41Var.b, q41Var.c).toString());
            if (AndroidUtilities.shouldShowClipboardToast()) {
                Toast.makeText(qbVar.getParentActivity(), LocaleController.getString(R.string.TextCopied), 0).show();
                return;
            }
            return;
        }
        if (characterStyle instanceof org.telegram.ui.Components.u41) {
            Long parseLong = Utilities.parseLong(((org.telegram.ui.Components.u41) characterStyle).getURL());
            long longValue = parseLong.longValue();
            if (longValue > 0) {
                i13 = ((org.telegram.ui.ActionBar.n2) qbVar).currentAccount;
                TLRPC.User user = MessagesController.getInstance(i13).getUser(parseLong);
                if (user != null) {
                    i14 = ((org.telegram.ui.ActionBar.n2) qbVar).currentAccount;
                    MessagesController.getInstance(i14).openChatOrProfileWith(user, null, qbVar, 0, false);
                    return;
                }
                return;
            }
            i11 = ((org.telegram.ui.ActionBar.n2) qbVar).currentAccount;
            TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-longValue));
            if (chat != null) {
                i12 = ((org.telegram.ui.ActionBar.n2) qbVar).currentAccount;
                MessagesController.getInstance(i12).openChatOrProfileWith(null, chat, qbVar, 0, false);
                return;
            }
            return;
        }
        int i15 = 1;
        if (characterStyle instanceof org.telegram.ui.Components.r41) {
            String url = ((org.telegram.ui.Components.r41) characterStyle).getURL();
            if (url.startsWith("@")) {
                i10 = ((org.telegram.ui.ActionBar.n2) qbVar).currentAccount;
                MessagesController.getInstance(i10).openByUserName(url.substring(1), qbVar, 0);
                return;
            } else {
                if (url.startsWith("#")) {
                    gy gyVar = new gy(null);
                    gyVar.j2 = url;
                    qbVar.presentFragment(gyVar);
                    return;
                }
                return;
            }
        }
        String url2 = ((URLSpan) characterStyle).getURL();
        if (z10) {
            org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(qbVar.getParentActivity(), null, false, false);
            e3Var.fixNavigationBar();
            e3Var.title = url2;
            e3Var.bigTitle = false;
            CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)};
            w wVar = new w(i15, this, url2);
            e3Var.items = charSequenceArr;
            e3Var.onClickListener = wVar;
            qbVar.showDialog(e3Var);
            return;
        }
        if (characterStyle instanceof org.telegram.ui.Components.t41) {
            String url3 = ((org.telegram.ui.Components.t41) characterStyle).getURL();
            if (we.e.f(Uri.parse(url3), false, null)) {
                we.e.o(qbVar.getParentActivity(), url3, true);
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qbVar.getParentActivity());
            String string = LocaleController.getString(R.string.OpenUrlTitle);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
            b2Var.N = string;
            b2Var.P = LocaleController.formatString(R.string.OpenUrlAlert2, url3);
            alertDialog$Builder.k(LocaleController.getString(R.string.Open), new jh.z1(11, qbVar, url3));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            qbVar.showDialog(b2Var);
            return;
        }
        TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
        if ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
            String lowerCase = url2.toLowerCase();
            String lowerCase2 = messageObject.messageOwner.media.webpage.url.toLowerCase();
            if ((we.e.h(lowerCase, false, false) || lowerCase.contains("t.me/iv")) && (lowerCase.contains(lowerCase2) || lowerCase2.contains(lowerCase))) {
                LaunchActivity launchActivity = LaunchActivity.C1;
                if (launchActivity == null || launchActivity.P() == null || LaunchActivity.C1.P().l(messageObject) == null) {
                    qbVar.createArticleViewer(false).N(messageObject, null, null, null);
                    return;
                }
                return;
            }
        }
        we.e.o(qbVar.getParentActivity(), url2, true);
    }

    @Override // org.telegram.ui.Cells.j1
    public final void R1(org.telegram.ui.Cells.s1 s1Var, int i10, float f10, float f11, boolean z10) {
        MessageObject messageObject = s1Var.getMessageObject().replyMessageObject;
        long dialogId = messageObject.getDialogId();
        qb qbVar = this.a.n;
        if (dialogId == (-qbVar.s.id)) {
            for (int i11 = 0; i11 < qbVar.o0.size(); i11++) {
                MessageObject messageObject2 = (MessageObject) qbVar.o0.get(i11);
                if (messageObject2 != null && messageObject2.contentType != 1 && messageObject2.getRealId() == messageObject.getRealId()) {
                    qbVar.Z0(messageObject2);
                    return;
                }
            }
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", qbVar.s.id);
        bundle.putInt("message_id", messageObject.getRealId());
        qbVar.presentFragment(new rn(bundle));
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean S0(org.telegram.ui.Cells.s1 s1Var, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean U(org.telegram.ui.Cells.s1 s1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean V() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean V1(org.telegram.ui.Cells.s1 s1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean W(org.telegram.ui.Cells.s1 s1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean X() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void Y(org.telegram.ui.Cells.s1 s1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z10) {
        int i11;
        qb qbVar = this.a.n;
        if (chat == null || chat == qbVar.s) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", chat.id);
        if (i10 != 0) {
            bundle.putInt("message_id", i10);
        }
        i11 = ((org.telegram.ui.ActionBar.n2) qbVar).currentAccount;
        if (MessagesController.getInstance(i11).checkCanOpenChat(bundle, qbVar)) {
            qbVar.presentFragment(new rn(bundle), true);
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean Y0(int i10, org.telegram.ui.Cells.s1 s1Var) {
        return false;
    }

    public final void a(TLRPC.User user) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", user.id);
        mb mbVar = this.a;
        qb.p0(mbVar.n, bundle, user.id);
        ProfileActivity profileActivity = new ProfileActivity(bundle, null);
        profileActivity.N4(0);
        mbVar.n.presentFragment(profileActivity);
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean a1(MessageObject messageObject) {
        return org.telegram.messenger.rl.a(messageObject);
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ int b0() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean c2(org.telegram.ui.Cells.s1 s1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean d() {
        return true;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ qg.a d0() {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean e0(org.telegram.ui.Cells.s1 s1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void e1(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        MessageObject messageObject = s1Var.getMessageObject();
        mb mbVar = this.a;
        if (mbVar.n.p0.contains(Long.valueOf(messageObject.eventId))) {
            mbVar.n.p0.remove(Long.valueOf(messageObject.eventId));
        } else {
            mbVar.n.p0.add(Long.valueOf(messageObject.eventId));
        }
        mbVar.n.X0(true);
        mbVar.n.R0();
        mbVar.n.E.l();
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean f() {
        return true;
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean f0(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user) {
        int i10;
        int i11;
        x4 b10;
        qb qbVar = this.a.n;
        if (user != null) {
            long j10 = user.id;
            i10 = ((org.telegram.ui.ActionBar.n2) qbVar).currentAccount;
            if (j10 != UserConfig.getInstance(i10).getClientUserId()) {
                d5[] d5VarArr = {d5.d, d5.h};
                TLRPC.UserFull userFull = qbVar.getMessagesController().getUserFull(user.id);
                if (userFull != null) {
                    b10 = x4.c(user, userFull, d5VarArr);
                } else {
                    i11 = ((org.telegram.ui.ActionBar.n2) qbVar).classGuid;
                    b10 = x4.b(user, i11, d5VarArr);
                }
                if (com.google.firebase.messaging.l.e(b10)) {
                    com.google.firebase.messaging.l.i().s((ViewGroup) qbVar.fragmentView, qbVar.getResourceProvider(), b10, new jh.z1(this, s1Var, user));
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ String h(org.telegram.ui.Cells.s1 s1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean j0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void k() {
        qb qbVar = this.a.n;
        if (ApplicationLoader.isStandaloneBuild()) {
            LaunchActivity launchActivity = LaunchActivity.C1;
            if (launchActivity != null) {
                launchActivity.z(true);
                return;
            }
            return;
        }
        if (BuildVars.isHuaweiStoreApp()) {
            we.e.s(qbVar.getParentActivity(), BuildVars.HUAWEI_STORE_URL);
        } else {
            we.e.s(qbVar.getParentActivity(), BuildVars.PLAYSTORE_APP_URL);
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean k2(int i10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ int l0(org.telegram.ui.Cells.s1 s1Var) {
        return 0;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ org.telegram.ui.Cells.k9 o2() {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean p0() {
        return true;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean s0(org.telegram.ui.Components.t5 t5Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean s1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void t(org.telegram.ui.Cells.s1 s1Var) {
        mb mbVar = this.a;
        qb qbVar = mbVar.n;
        if (qbVar.getParentActivity() == null) {
            return;
        }
        qbVar.showDialog(org.telegram.ui.Components.sp0.N0(mbVar.c, s1Var.getMessageObject(), null, ChatObject.isChannel(qbVar.s) && !qbVar.s.megagroup, null));
    }

    @Override // org.telegram.ui.Cells.j1
    public final void t0(org.telegram.ui.Cells.s1 s1Var, float f10, float f11) {
        qb qbVar = this.a.n;
        int i10 = qb.T0;
        qbVar.P0(s1Var, 0.0f, 0.0f);
    }

    @Override // org.telegram.ui.Cells.j1
    public final void v0(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user, float f10, float f11) {
        int i10;
        if (user != null) {
            long j10 = user.id;
            i10 = ((org.telegram.ui.ActionBar.n2) this.a.n).currentAccount;
            if (j10 != UserConfig.getInstance(i10).getClientUserId()) {
                a(user);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00fa, code lost:
    
        if (r15.exists() != false) goto L55;
     */
    @Override // org.telegram.ui.Cells.j1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x0(org.telegram.ui.Cells.s1 s1Var, float f10, float f11, boolean z10) {
        int i10;
        File file;
        qb qbVar = this.a.n;
        MessageObject messageObject = s1Var.getMessageObject();
        if (messageObject.getInputStickerSet() != null) {
            qbVar.showDialog(new org.telegram.ui.Components.ex0(qbVar.getParentActivity(), qbVar, messageObject.getInputStickerSet(), null, null, null));
            return;
        }
        File file2 = null;
        if (messageObject.isVideo() || (i10 = messageObject.type) == 1 || ((i10 == 0 && !messageObject.isWebpageDocument()) || messageObject.isGif())) {
            PhotoViewer.t1().K2(null, qbVar, null);
            PhotoViewer.t1().c2(messageObject, null, 0L, 0L, 0L, qbVar.B0);
            return;
        }
        int i11 = messageObject.type;
        if (i11 == 3) {
            try {
                String str = messageObject.messageOwner.attachPath;
                if (str != null && str.length() != 0) {
                    file2 = new File(messageObject.messageOwner.attachPath);
                }
                if (file2 == null || !file2.exists()) {
                    file2 = qbVar.getFileLoader().getPathToMessage(messageObject.messageOwner);
                }
                Intent intent = new Intent("android.intent.action.VIEW");
                if (Build.VERSION.SDK_INT >= 24) {
                    intent.setFlags(1);
                    intent.setDataAndType(FileProvider.d(qbVar.getParentActivity(), ApplicationLoader.getApplicationId() + ".provider", file2), "video/mp4");
                } else {
                    intent.setDataAndType(Uri.fromFile(file2), "video/mp4");
                }
                qbVar.getParentActivity().startActivityForResult(intent, 500);
                return;
            } catch (Exception unused) {
                qb.v0(qbVar, messageObject);
                return;
            }
        }
        if (i11 == 4) {
            if (AndroidUtilities.isMapsInstalled(qbVar)) {
                tc0 tc0Var = new tc0(0);
                tc0Var.u0(messageObject);
                qbVar.presentFragment(tc0Var);
                return;
            }
            return;
        }
        if (i11 == 9 || i11 == 0) {
            if (messageObject.getDocumentName().toLowerCase().endsWith("attheme")) {
                String str2 = messageObject.messageOwner.attachPath;
                if (str2 != null && str2.length() != 0) {
                    file = new File(messageObject.messageOwner.attachPath);
                }
                file = null;
                if (file == null) {
                    File pathToMessage = qbVar.getFileLoader().getPathToMessage(messageObject.messageOwner);
                    if (pathToMessage.exists()) {
                        file = pathToMessage;
                    }
                }
                j jVar = qbVar.C;
                if (jVar != null) {
                    if (jVar.N0() < qbVar.C.B() - 1) {
                        qbVar.g0 = qbVar.C.L0();
                        org.telegram.ui.Components.lk0 lk0Var = (org.telegram.ui.Components.lk0) qbVar.A.K(qbVar.g0);
                        if (lk0Var != null) {
                            qbVar.h0 = lk0Var.a.getTop();
                        } else {
                            qbVar.g0 = -1;
                        }
                    } else {
                        qbVar.g0 = -1;
                    }
                }
                org.telegram.ui.ActionBar.f6 u10 = org.telegram.ui.ActionBar.g6.u(file, messageObject.getDocumentName(), null, true);
                if (u10 != null) {
                    qbVar.presentFragment(new nc1(u10));
                    return;
                }
                qbVar.g0 = -1;
            }
            try {
                AndroidUtilities.openForView(messageObject, qbVar.getParentActivity(), null, false);
            } catch (Exception unused2) {
                qb.v0(qbVar, messageObject);
            }
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean x1(org.telegram.ui.Cells.s1 s1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ String z(long j10) {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean z1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void B0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void B1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void C0() {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void D(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void D1(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final void G0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void H(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void H0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void I1() {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void J0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void M(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void M0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void O(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final void Q(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void T(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void U0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void W0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void Z(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void Z1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void d1() {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void d2(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void h2() {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void i0(int i10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void m0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void m2() {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void p(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void q() {
    }

    @Override // org.telegram.ui.Cells.j1
    public final void r0(String str) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void u() {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void u1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void v(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void x(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void K1(org.telegram.ui.Cells.s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void L(org.telegram.ui.Cells.s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void Q0(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void R(int i10, org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void a2(org.telegram.ui.Cells.s1 s1Var, fh.f fVar) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void b2(org.telegram.ui.Cells.s1 s1Var, long j10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void h1(org.telegram.ui.Cells.s1 s1Var, TLRPC.Document document) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void v1(org.telegram.ui.Cells.s1 s1Var, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void y1(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void E0(org.telegram.ui.Cells.s1 s1Var, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void k0(org.telegram.ui.Cells.s1 s1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void m1(org.telegram.ui.Cells.s1 s1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void n2(org.telegram.ui.Cells.s1 s1Var, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void L1(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void o(org.telegram.ui.Cells.s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void i2(org.telegram.ui.Cells.s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void j(org.telegram.ui.Cells.s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }
}
