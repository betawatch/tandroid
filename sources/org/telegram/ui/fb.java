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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class fb implements org.telegram.ui.Cells.j1 {
    public final /* synthetic */ kb a;

    public fb(kb kbVar) {
        this.a = kbVar;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean A1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void B0(org.telegram.ui.Cells.s1 s1Var, float f9, float f10) {
        ob obVar = this.a.n;
        int i10 = ob.T0;
        obVar.P0(s1Var, 0.0f, 0.0f);
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean H1(org.telegram.ui.Cells.s1 s1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean J1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean M0(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean O(org.telegram.ui.Cells.s1 s1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void O1(org.telegram.ui.Cells.s1 s1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        ye.d.s(s1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean P() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void P0(int i10, org.telegram.ui.Cells.s1 s1Var) {
        TLRPC.WebPage webPage;
        int i11;
        ob obVar = this.a.n;
        MessageObject messageObject = s1Var.getMessageObject();
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = messageObject.currentEvent;
        if (tL_channelAdminLogEvent != null && (tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionEditMessage)) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -messageObject.getDialogId());
            bundle.putInt("message_id", messageObject.getRealId());
            tn tnVar = new tn(bundle);
            if (ChatObject.isForum(obVar.s)) {
                long dialogId = messageObject.getDialogId();
                i11 = ((org.telegram.ui.ActionBar.o2) obVar).currentAccount;
                yf.d.a(tnVar, MessagesStorage.TopicKey.of(dialogId, MessageObject.getTopicId(i11, messageObject.messageOwner, true)));
            }
            obVar.presentFragment(tnVar);
            return;
        }
        if (i10 == 0) {
            TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
            if (messageMedia == null || (webPage = messageMedia.webpage) == null || webPage.cached_page == null) {
                return;
            }
            LaunchActivity launchActivity = LaunchActivity.C1;
            if (launchActivity == null || launchActivity.P() == null || LaunchActivity.C1.P().k(messageObject) == null) {
                obVar.createArticleViewer(false).N(messageObject, null, null, null);
                return;
            }
            return;
        }
        if (i10 != 5) {
            TLRPC.MessageMedia messageMedia2 = messageObject.messageOwner.media;
            if (messageMedia2 == null || messageMedia2.webpage == null) {
                return;
            }
            ye.d.s(obVar.getParentActivity(), messageObject.messageOwner.media.webpage.url);
            return;
        }
        TLRPC.User user = obVar.getMessagesController().getUser(Long.valueOf(messageObject.messageOwner.media.user_id));
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
            obVar.showDialog(new org.telegram.ui.Components.ke0(obVar, null, user, null, file, null, str2, str3, null));
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ CharacterStyle P1(org.telegram.ui.Cells.s1 s1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean Q(org.telegram.ui.Cells.s1 s1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void Q1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        ob obVar = this.a.n;
        org.telegram.ui.Components.mu.I(obVar, messageObject, obVar.B0, str2, str3, str4, str, i10, i11, -1, false);
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean R() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean R1(org.telegram.ui.Cells.s1 s1Var, MessageObject messageObject) {
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
    public final void S(org.telegram.ui.Cells.s1 s1Var, TLRPC.Chat chat, int i10, float f9, float f10, boolean z10) {
        int i11;
        ob obVar = this.a.n;
        if (chat == null || chat == obVar.s) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", chat.id);
        if (i10 != 0) {
            bundle.putInt("message_id", i10);
        }
        i11 = ((org.telegram.ui.ActionBar.o2) obVar).currentAccount;
        if (MessagesController.getInstance(i11).checkCanOpenChat(bundle, obVar)) {
            obVar.presentFragment(new tn(bundle), true);
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ int V() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void V0(org.telegram.ui.Cells.s1 s1Var, CharacterStyle characterStyle, boolean z10) {
        TLRPC.WebPage webPage;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        ob obVar = this.a.n;
        if (characterStyle == null) {
            return;
        }
        MessageObject messageObject = s1Var.getMessageObject();
        if (characterStyle instanceof org.telegram.ui.Components.z41) {
            org.telegram.ui.Components.z41 z41Var = (org.telegram.ui.Components.z41) characterStyle;
            AndroidUtilities.addToClipboard(z41Var.a.subSequence(z41Var.b, z41Var.c).toString());
            if (AndroidUtilities.shouldShowClipboardToast()) {
                Toast.makeText(obVar.getParentActivity(), LocaleController.getString(R.string.TextCopied), 0).show();
                return;
            }
            return;
        }
        if (characterStyle instanceof org.telegram.ui.Components.d51) {
            Long parseLong = Utilities.parseLong(((org.telegram.ui.Components.d51) characterStyle).getURL());
            long longValue = parseLong.longValue();
            if (longValue > 0) {
                i13 = ((org.telegram.ui.ActionBar.o2) obVar).currentAccount;
                TLRPC.User user = MessagesController.getInstance(i13).getUser(parseLong);
                if (user != null) {
                    i14 = ((org.telegram.ui.ActionBar.o2) obVar).currentAccount;
                    MessagesController.getInstance(i14).openChatOrProfileWith(user, null, obVar, 0, false);
                    return;
                }
                return;
            }
            i11 = ((org.telegram.ui.ActionBar.o2) obVar).currentAccount;
            TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-longValue));
            if (chat != null) {
                i12 = ((org.telegram.ui.ActionBar.o2) obVar).currentAccount;
                MessagesController.getInstance(i12).openChatOrProfileWith(null, chat, obVar, 0, false);
                return;
            }
            return;
        }
        if (characterStyle instanceof org.telegram.ui.Components.a51) {
            String url = ((org.telegram.ui.Components.a51) characterStyle).getURL();
            if (url.startsWith("@")) {
                i10 = ((org.telegram.ui.ActionBar.o2) obVar).currentAccount;
                MessagesController.getInstance(i10).openByUserName(url.substring(1), obVar, 0);
                return;
            } else {
                if (url.startsWith("#")) {
                    fy fyVar = new fy(null);
                    fyVar.j2 = url;
                    obVar.presentFragment(fyVar);
                    return;
                }
                return;
            }
        }
        String url2 = ((URLSpan) characterStyle).getURL();
        if (z10) {
            org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(obVar.getParentActivity(), null, false, false);
            f3Var.fixNavigationBar();
            f3Var.title = url2;
            f3Var.bigTitle = false;
            CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)};
            ag.y1 y1Var = new ag.y1(2, this, url2);
            f3Var.items = charSequenceArr;
            f3Var.onClickListener = y1Var;
            obVar.showDialog(f3Var);
            return;
        }
        if (characterStyle instanceof org.telegram.ui.Components.c51) {
            String url3 = ((org.telegram.ui.Components.c51) characterStyle).getURL();
            if (ye.d.f(Uri.parse(url3), false, null)) {
                ye.d.o(obVar.getParentActivity(), url3, true);
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(obVar.getParentActivity());
            String string = LocaleController.getString(R.string.OpenUrlTitle);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
            c2Var.N = string;
            c2Var.P = LocaleController.formatString(R.string.OpenUrlAlert2, url3);
            alertDialog$Builder.k(LocaleController.getString(R.string.Open), new kg.w(11, obVar, url3));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            obVar.showDialog(c2Var);
            return;
        }
        TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
        if ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
            String lowerCase = url2.toLowerCase();
            String lowerCase2 = messageObject.messageOwner.media.webpage.url.toLowerCase();
            if ((ye.d.h(lowerCase, false, false) || lowerCase.contains("t.me/iv")) && (lowerCase.contains(lowerCase2) || lowerCase2.contains(lowerCase))) {
                LaunchActivity launchActivity = LaunchActivity.C1;
                if (launchActivity == null || launchActivity.P() == null || LaunchActivity.C1.P().k(messageObject) == null) {
                    obVar.createArticleViewer(false).N(messageObject, null, null, null);
                    return;
                }
                return;
            }
        }
        ye.d.o(obVar.getParentActivity(), url2, true);
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean W0(org.telegram.ui.Cells.s1 s1Var, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean W1(org.telegram.ui.Cells.s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ sg.a X() {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean Y(org.telegram.ui.Cells.s1 s1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ lu0 Y1() {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean Z(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user) {
        int i10;
        int i11;
        x4 b10;
        ob obVar = this.a.n;
        if (user != null) {
            long j10 = user.id;
            i10 = ((org.telegram.ui.ActionBar.o2) obVar).currentAccount;
            if (j10 != UserConfig.getInstance(i10).getClientUserId()) {
                d5[] d5VarArr = {d5.d, d5.h};
                TLRPC.UserFull userFull = obVar.getMessagesController().getUserFull(user.id);
                if (userFull != null) {
                    b10 = x4.c(user, userFull, d5VarArr);
                } else {
                    i11 = ((org.telegram.ui.ActionBar.o2) obVar).classGuid;
                    b10 = x4.b(user, i11, d5VarArr);
                }
                if (ab.m.e(b10)) {
                    ab.m.i().s((ViewGroup) obVar.fragmentView, obVar.getResourceProvider(), b10, new kg.w(this, s1Var, user));
                    return true;
                }
            }
        }
        return false;
    }

    public final void a(TLRPC.User user) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", user.id);
        kb kbVar = this.a;
        ob.p0(kbVar.n, bundle, user.id);
        ProfileActivity profileActivity = new ProfileActivity(bundle, null);
        profileActivity.N4(0);
        kbVar.n.presentFragment(profileActivity);
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean a2(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void b2(org.telegram.ui.Cells.s1 s1Var, int i10, float f9, float f10, boolean z10) {
        MessageObject messageObject = s1Var.getMessageObject().replyMessageObject;
        long dialogId = messageObject.getDialogId();
        ob obVar = this.a.n;
        if (dialogId == (-obVar.s.id)) {
            for (int i11 = 0; i11 < obVar.o0.size(); i11++) {
                MessageObject messageObject2 = (MessageObject) obVar.o0.get(i11);
                if (messageObject2 != null && messageObject2.contentType != 1 && messageObject2.getRealId() == messageObject.getRealId()) {
                    obVar.Z0(messageObject2);
                    return;
                }
            }
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", obVar.s.id);
        bundle.putInt("message_id", messageObject.getRealId());
        obVar.presentFragment(new tn(bundle));
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean c() {
        return true;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean c1(int i10, org.telegram.ui.Cells.s1 s1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean c2(org.telegram.ui.Cells.s1 s1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean d0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean f() {
        return true;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ int f0(org.telegram.ui.Cells.s1 s1Var) {
        return 0;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ String g(org.telegram.ui.Cells.s1 s1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean h1(MessageObject messageObject) {
        return b.a(messageObject);
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean j0() {
        return true;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void k() {
        ob obVar = this.a.n;
        if (ApplicationLoader.isStandaloneBuild()) {
            LaunchActivity launchActivity = LaunchActivity.C1;
            if (launchActivity != null) {
                launchActivity.z(true);
                return;
            }
            return;
        }
        if (BuildVars.isHuaweiStoreApp()) {
            ye.d.s(obVar.getParentActivity(), BuildVars.HUAWEI_STORE_URL);
        } else {
            ye.d.s(obVar.getParentActivity(), BuildVars.PLAYSTORE_APP_URL);
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public final void m1(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        MessageObject messageObject = s1Var.getMessageObject();
        kb kbVar = this.a;
        if (kbVar.n.p0.contains(Long.valueOf(messageObject.eventId))) {
            kbVar.n.p0.remove(Long.valueOf(messageObject.eventId));
        } else {
            kbVar.n.p0.add(Long.valueOf(messageObject.eventId));
        }
        kbVar.n.X0(true);
        kbVar.n.R0();
        kbVar.n.E.l();
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean m2(org.telegram.ui.Cells.s1 s1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean n0(org.telegram.ui.Components.y5 y5Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void p0(org.telegram.ui.Cells.s1 s1Var, float f9, float f10) {
        ob obVar = this.a.n;
        int i10 = ob.T0;
        obVar.P0(s1Var, 0.0f, 0.0f);
    }

    @Override // org.telegram.ui.Cells.j1
    public final void s(org.telegram.ui.Cells.s1 s1Var) {
        kb kbVar = this.a;
        ob obVar = kbVar.n;
        if (obVar.getParentActivity() == null) {
            return;
        }
        obVar.showDialog(org.telegram.ui.Components.dq0.N0(kbVar.c, s1Var.getMessageObject(), null, ChatObject.isChannel(obVar.s) && !obVar.s.megagroup, null));
    }

    @Override // org.telegram.ui.Cells.j1
    public final void t0(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user, float f9, float f10) {
        int i10;
        if (user != null) {
            long j10 = user.id;
            i10 = ((org.telegram.ui.ActionBar.o2) this.a.n).currentAccount;
            if (j10 != UserConfig.getInstance(i10).getClientUserId()) {
                a(user);
            }
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean u2(int i10) {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00fa, code lost:
    
        if (r15.exists() != false) goto L55;
     */
    @Override // org.telegram.ui.Cells.j1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v0(org.telegram.ui.Cells.s1 s1Var, float f9, float f10, boolean z10) {
        int i10;
        File file;
        ob obVar = this.a.n;
        MessageObject messageObject = s1Var.getMessageObject();
        if (messageObject.getInputStickerSet() != null) {
            obVar.showDialog(new org.telegram.ui.Components.nx0(obVar.getParentActivity(), obVar, messageObject.getInputStickerSet(), null, null, null));
            return;
        }
        File file2 = null;
        if (messageObject.isVideo() || (i10 = messageObject.type) == 1 || ((i10 == 0 && !messageObject.isWebpageDocument()) || messageObject.isGif())) {
            PhotoViewer.t1().K2(null, obVar, null);
            PhotoViewer.t1().c2(messageObject, null, 0L, 0L, 0L, obVar.B0);
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
                    file2 = obVar.getFileLoader().getPathToMessage(messageObject.messageOwner);
                }
                Intent intent = new Intent("android.intent.action.VIEW");
                if (Build.VERSION.SDK_INT >= 24) {
                    intent.setFlags(1);
                    intent.setDataAndType(FileProvider.d(obVar.getParentActivity(), ApplicationLoader.getApplicationId() + ".provider", file2), "video/mp4");
                } else {
                    intent.setDataAndType(Uri.fromFile(file2), "video/mp4");
                }
                obVar.getParentActivity().startActivityForResult(intent, 500);
                return;
            } catch (Exception unused) {
                ob.v0(obVar, messageObject);
                return;
            }
        }
        if (i11 == 4) {
            if (AndroidUtilities.isMapsInstalled(obVar)) {
                rc0 rc0Var = new rc0(0);
                rc0Var.u0(messageObject);
                obVar.presentFragment(rc0Var);
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
                    File pathToMessage = obVar.getFileLoader().getPathToMessage(messageObject.messageOwner);
                    if (pathToMessage.exists()) {
                        file = pathToMessage;
                    }
                }
                k kVar = obVar.C;
                if (kVar != null) {
                    if (kVar.N0() < obVar.C.B() - 1) {
                        obVar.g0 = obVar.C.L0();
                        org.telegram.ui.Components.vk0 vk0Var = (org.telegram.ui.Components.vk0) obVar.A.K(obVar.g0);
                        if (vk0Var != null) {
                            obVar.h0 = vk0Var.a.getTop();
                        } else {
                            obVar.g0 = -1;
                        }
                    } else {
                        obVar.g0 = -1;
                    }
                }
                org.telegram.ui.ActionBar.f6 u10 = org.telegram.ui.ActionBar.g6.u(file, messageObject.getDocumentName(), null, true);
                if (u10 != null) {
                    obVar.presentFragment(new qc1(u10));
                    return;
                }
                obVar.g0 = -1;
            }
            try {
                AndroidUtilities.openForView(messageObject, obVar.getParentActivity(), null, false);
            } catch (Exception unused2) {
                ob.v0(obVar, messageObject);
            }
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean w0(MessageObject messageObject) {
        return true;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ String y(long j10) {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ org.telegram.ui.Cells.l9 y2() {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void A(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void C(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void C1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final void D0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void F(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void F0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void H(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void J0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final void K(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void L1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void N(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void N0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void N1(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void S1() {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void T(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void X0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void Y0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void c0(int i10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void e2(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void g0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void k1() {
    }

    @Override // org.telegram.ui.Cells.j1
    public final void m0(String str) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void n2(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void o(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void p() {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void q2() {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void t() {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void u(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void w(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void w2() {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void y0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void z0() {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void E(org.telegram.ui.Cells.s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void F1(org.telegram.ui.Cells.s1 s1Var, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void I1(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void L(int i10, org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void R0(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void U1(org.telegram.ui.Cells.s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void g2(org.telegram.ui.Cells.s1 s1Var, long j10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void j2(org.telegram.ui.Cells.s1 s1Var, hh.f fVar) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void p1(org.telegram.ui.Cells.s1 s1Var, TLRPC.Document document) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void A0(org.telegram.ui.Cells.s1 s1Var, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void e0(org.telegram.ui.Cells.s1 s1Var, float f9, float f10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void u1(org.telegram.ui.Cells.s1 s1Var, float f9, float f10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void x2(org.telegram.ui.Cells.s1 s1Var, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void V1(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void n(org.telegram.ui.Cells.s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void j(org.telegram.ui.Cells.s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void s2(org.telegram.ui.Cells.s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f9, float f10) {
    }
}
