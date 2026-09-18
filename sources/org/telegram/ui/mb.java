package org.telegram.ui;

import android.content.Context;
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

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class mb implements org.telegram.ui.Cells.l1 {
    public final /* synthetic */ rb a;

    public mb(rb rbVar) {
        this.a = rbVar;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean A1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void B0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
        vb vbVar = this.a.n;
        int i10 = vb.Q0;
        vbVar.P0(u1Var, 0.0f, 0.0f);
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean G1(org.telegram.ui.Cells.u1 u1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean I1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean M0(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void N1(org.telegram.ui.Cells.u1 u1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        nf.f.s(u1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean O(org.telegram.ui.Cells.u1 u1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ CharacterStyle O1(org.telegram.ui.Cells.u1 u1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean P() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void P0(int i10, org.telegram.ui.Cells.u1 u1Var) {
        TLRPC.WebPage webPage;
        int i11;
        vb vbVar = this.a.n;
        MessageObject messageObject = u1Var.getMessageObject();
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = messageObject.currentEvent;
        if (tL_channelAdminLogEvent != null && (tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionEditMessage)) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -messageObject.getDialogId());
            bundle.putInt("message_id", messageObject.getRealId());
            zn znVar = new zn(bundle);
            if (ChatObject.isForum(vbVar.f)) {
                long dialogId = messageObject.getDialogId();
                i11 = ((org.telegram.ui.ActionBar.n2) vbVar).currentAccount;
                ng.d.a(znVar, MessagesStorage.TopicKey.of(dialogId, MessageObject.getTopicId(i11, messageObject.messageOwner, true)));
            }
            vbVar.presentFragment(znVar);
            return;
        }
        if (i10 == 0) {
            TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
            if (messageMedia == null || (webPage = messageMedia.webpage) == null || webPage.cached_page == null) {
                return;
            }
            LaunchActivity launchActivity = LaunchActivity.G1;
            if (launchActivity == null || launchActivity.P() == null || LaunchActivity.G1.P().l(messageObject) == null) {
                vbVar.createArticleViewer(false).N(messageObject, null, null, null);
                return;
            }
            return;
        }
        if (i10 != 5) {
            TLRPC.MessageMedia messageMedia2 = messageObject.messageOwner.media;
            if (messageMedia2 == null || messageMedia2.webpage == null) {
                return;
            }
            nf.f.s(vbVar.getParentActivity(), messageObject.messageOwner.media.webpage.url);
            return;
        }
        TLRPC.User user = vbVar.getMessagesController().getUser(Long.valueOf(messageObject.messageOwner.media.user_id));
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
            vbVar.showDialog(new org.telegram.ui.Components.ye0(vbVar, null, user, null, file, null, str2, str3, null));
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final void P1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        vb vbVar = this.a.n;
        org.telegram.ui.Components.vu.J(vbVar, messageObject, vbVar.B0, str2, str3, str4, str, i10, i11, -1, false);
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean Q(org.telegram.ui.Cells.u1 u1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean Q1(org.telegram.ui.Cells.u1 u1Var, MessageObject messageObject) {
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

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean R() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void S(org.telegram.ui.Cells.u1 u1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
        int i11;
        vb vbVar = this.a.n;
        if (chat == null || chat == vbVar.f) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", chat.id);
        if (i10 != 0) {
            bundle.putInt("message_id", i10);
        }
        i11 = ((org.telegram.ui.ActionBar.n2) vbVar).currentAccount;
        if (MessagesController.getInstance(i11).checkCanOpenChat(bundle, vbVar)) {
            vbVar.presentFragment(new zn(bundle), true);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ int V() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void V0(org.telegram.ui.Cells.u1 u1Var, CharacterStyle characterStyle, boolean z10) {
        TLRPC.WebPage webPage;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        vb vbVar = this.a.n;
        if (characterStyle == null) {
            return;
        }
        MessageObject messageObject = u1Var.getMessageObject();
        if (characterStyle instanceof org.telegram.ui.Components.a61) {
            org.telegram.ui.Components.a61 a61Var = (org.telegram.ui.Components.a61) characterStyle;
            AndroidUtilities.addToClipboard(a61Var.a.subSequence(a61Var.b, a61Var.c).toString());
            if (AndroidUtilities.shouldShowClipboardToast()) {
                Toast.makeText(vbVar.getParentActivity(), LocaleController.getString(R.string.TextCopied), 0).show();
                return;
            }
            return;
        }
        if (characterStyle instanceof org.telegram.ui.Components.e61) {
            Long parseLong = Utilities.parseLong(((org.telegram.ui.Components.e61) characterStyle).getURL());
            long longValue = parseLong.longValue();
            if (longValue > 0) {
                i13 = ((org.telegram.ui.ActionBar.n2) vbVar).currentAccount;
                TLRPC.User user = MessagesController.getInstance(i13).getUser(parseLong);
                if (user != null) {
                    i14 = ((org.telegram.ui.ActionBar.n2) vbVar).currentAccount;
                    MessagesController.getInstance(i14).openChatOrProfileWith(user, null, vbVar, 0, false);
                    return;
                }
                return;
            }
            i11 = ((org.telegram.ui.ActionBar.n2) vbVar).currentAccount;
            TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-longValue));
            if (chat != null) {
                i12 = ((org.telegram.ui.ActionBar.n2) vbVar).currentAccount;
                MessagesController.getInstance(i12).openChatOrProfileWith(null, chat, vbVar, 0, false);
                return;
            }
            return;
        }
        if (characterStyle instanceof org.telegram.ui.Components.b61) {
            String url = ((org.telegram.ui.Components.b61) characterStyle).getURL();
            if (url.startsWith("@")) {
                i10 = ((org.telegram.ui.ActionBar.n2) vbVar).currentAccount;
                MessagesController.getInstance(i10).openByUserName(url.substring(1), vbVar, 0);
                return;
            } else {
                if (url.startsWith("#")) {
                    uy uyVar = new uy(null);
                    uyVar.n2 = url;
                    vbVar.presentFragment(uyVar);
                    return;
                }
                return;
            }
        }
        String url2 = ((URLSpan) characterStyle).getURL();
        int i15 = 2;
        if (z10) {
            org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, (Context) vbVar.getParentActivity(), (org.telegram.ui.ActionBar.e6) null, false);
            f3Var.fixNavigationBar();
            f3Var.title = url2;
            f3Var.bigTitle = false;
            CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)};
            lg.j jVar = new lg.j(i15, this, url2);
            f3Var.items = charSequenceArr;
            f3Var.onClickListener = jVar;
            vbVar.showDialog(f3Var);
            return;
        }
        if (characterStyle instanceof org.telegram.ui.Components.d61) {
            String url3 = ((org.telegram.ui.Components.d61) characterStyle).getURL();
            if (nf.f.f(Uri.parse(url3), false, null)) {
                nf.f.o(vbVar.getParentActivity(), url3, true);
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vbVar.getParentActivity());
            String string = LocaleController.getString(R.string.OpenUrlTitle);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
            b2Var.R = string;
            b2Var.T = LocaleController.formatString(R.string.OpenUrlAlert2, url3);
            alertDialog$Builder.k(LocaleController.getString(R.string.Open), new l4(i15, vbVar, url3));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            vbVar.showDialog(b2Var);
            return;
        }
        TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
        if ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
            String lowerCase = url2.toLowerCase();
            String lowerCase2 = messageObject.messageOwner.media.webpage.url.toLowerCase();
            if ((nf.f.h(lowerCase, false, false) || lowerCase.contains("t.me/iv")) && (lowerCase.contains(lowerCase2) || lowerCase2.contains(lowerCase))) {
                LaunchActivity launchActivity = LaunchActivity.G1;
                if (launchActivity == null || launchActivity.P() == null || LaunchActivity.G1.P().l(messageObject) == null) {
                    vbVar.createArticleViewer(false).N(messageObject, null, null, null);
                    return;
                }
                return;
            }
        }
        nf.f.o(vbVar.getParentActivity(), url2, true);
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean V1(org.telegram.ui.Cells.u1 u1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean W0(org.telegram.ui.Cells.u1 u1Var, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ hh.a Y() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ pv0 Y1() {
        return null;
    }

    public final void a(TLRPC.User user) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", user.id);
        rb rbVar = this.a;
        vb.p0(rbVar.n, bundle, user.id);
        ProfileActivity profileActivity = new ProfileActivity(bundle, null);
        profileActivity.N4(0);
        rbVar.n.presentFragment(profileActivity);
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean a0(org.telegram.ui.Cells.u1 u1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean a2(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean b0(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user) {
        int i10;
        int i11;
        x4 b10;
        vb vbVar = this.a.n;
        if (user != null) {
            long j3 = user.id;
            i10 = ((org.telegram.ui.ActionBar.n2) vbVar).currentAccount;
            if (j3 != UserConfig.getInstance(i10).getClientUserId()) {
                d5[] d5VarArr = {d5.d, d5.h};
                TLRPC.UserFull userFull = vbVar.getMessagesController().getUserFull(user.id);
                if (userFull != null) {
                    b10 = x4.c(user, userFull, d5VarArr);
                } else {
                    i11 = ((org.telegram.ui.ActionBar.n2) vbVar).classGuid;
                    b10 = x4.b(user, i11, d5VarArr);
                }
                if (com.google.firebase.messaging.m.e(b10)) {
                    com.google.firebase.messaging.m.k().v((ViewGroup) vbVar.fragmentView, vbVar.getResourceProvider(), b10, new l4(this, u1Var, user));
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void b2(org.telegram.ui.Cells.u1 u1Var, int i10, float f7, float f10, boolean z10) {
        MessageObject messageObject = u1Var.getMessageObject().replyMessageObject;
        long dialogId = messageObject.getDialogId();
        vb vbVar = this.a.n;
        if (dialogId == (-vbVar.f.id)) {
            for (int i11 = 0; i11 < vbVar.o0.size(); i11++) {
                MessageObject messageObject2 = (MessageObject) vbVar.o0.get(i11);
                if (messageObject2 != null && messageObject2.contentType != 1 && messageObject2.getRealId() == messageObject.getRealId()) {
                    vbVar.Y0(messageObject2);
                    return;
                }
            }
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", vbVar.f.id);
        bundle.putInt("message_id", messageObject.getRealId());
        vbVar.presentFragment(new zn(bundle));
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean c1(int i10, org.telegram.ui.Cells.u1 u1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean c2(org.telegram.ui.Cells.u1 u1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean e0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean f() {
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ String h(org.telegram.ui.Cells.u1 u1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ int h0(org.telegram.ui.Cells.u1 u1Var) {
        return 0;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean h1(MessageObject messageObject) {
        return org.telegram.ui.Cells.c1.a(messageObject);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void k() {
        vb vbVar = this.a.n;
        if (ApplicationLoader.isStandaloneBuild()) {
            LaunchActivity launchActivity = LaunchActivity.G1;
            if (launchActivity != null) {
                launchActivity.z(true);
                return;
            }
            return;
        }
        if (BuildVars.isHuaweiStoreApp()) {
            nf.f.s(vbVar.getParentActivity(), BuildVars.HUAWEI_STORE_URL);
        } else {
            nf.f.s(vbVar.getParentActivity(), BuildVars.PLAYSTORE_APP_URL);
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final boolean l0() {
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean l2(org.telegram.ui.Cells.u1 u1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void m1(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        MessageObject messageObject = u1Var.getMessageObject();
        rb rbVar = this.a;
        if (rbVar.n.p0.contains(Long.valueOf(messageObject.eventId))) {
            rbVar.n.p0.remove(Long.valueOf(messageObject.eventId));
        } else {
            rbVar.n.p0.add(Long.valueOf(messageObject.eventId));
        }
        rbVar.n.W0(true);
        rbVar.n.R0();
        rbVar.n.E.l();
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean o0(org.telegram.ui.Components.z5 z5Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final void q0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
        vb vbVar = this.a.n;
        int i10 = vb.Q0;
        vbVar.P0(u1Var, 0.0f, 0.0f);
    }

    @Override // org.telegram.ui.Cells.l1
    public final void r(org.telegram.ui.Cells.u1 u1Var) {
        rb rbVar = this.a;
        vb vbVar = rbVar.n;
        if (vbVar.getParentActivity() == null) {
            return;
        }
        vbVar.showDialog(org.telegram.ui.Components.vq0.N0(rbVar.c, u1Var.getMessageObject(), null, ChatObject.isChannel(vbVar.f) && !vbVar.f.megagroup, null));
    }

    @Override // org.telegram.ui.Cells.l1
    public final void t0(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user, float f7, float f10) {
        int i10;
        if (user != null) {
            long j3 = user.id;
            i10 = ((org.telegram.ui.ActionBar.n2) this.a.n).currentAccount;
            if (j3 != UserConfig.getInstance(i10).getClientUserId()) {
                a(user);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00fa, code lost:
    
        if (r15.exists() != false) goto L55;
     */
    @Override // org.telegram.ui.Cells.l1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10, boolean z10) {
        int i10;
        File file;
        vb vbVar = this.a.n;
        MessageObject messageObject = u1Var.getMessageObject();
        if (messageObject.getInputStickerSet() != null) {
            vbVar.showDialog(new org.telegram.ui.Components.hy0(vbVar.getParentActivity(), vbVar, messageObject.getInputStickerSet(), null, null, null));
            return;
        }
        File file2 = null;
        if (messageObject.isVideo() || (i10 = messageObject.type) == 1 || ((i10 == 0 && !messageObject.isWebpageDocument()) || messageObject.isGif())) {
            PhotoViewer.t1().J2(null, vbVar, null);
            PhotoViewer.t1().c2(messageObject, null, 0L, 0L, 0L, vbVar.B0);
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
                    file2 = vbVar.getFileLoader().getPathToMessage(messageObject.messageOwner);
                }
                Intent intent = new Intent("android.intent.action.VIEW");
                if (Build.VERSION.SDK_INT >= 24) {
                    intent.setFlags(1);
                    intent.setDataAndType(FileProvider.d(vbVar.getParentActivity(), ApplicationLoader.getApplicationId() + ".provider", file2), "video/mp4");
                } else {
                    intent.setDataAndType(Uri.fromFile(file2), "video/mp4");
                }
                vbVar.getParentActivity().startActivityForResult(intent, 500);
                return;
            } catch (Exception unused) {
                vb.v0(vbVar, messageObject);
                return;
            }
        }
        if (i11 == 4) {
            if (AndroidUtilities.isMapsInstalled(vbVar)) {
                jd0 jd0Var = new jd0(0);
                jd0Var.u0(messageObject);
                vbVar.presentFragment(jd0Var);
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
                    File pathToMessage = vbVar.getFileLoader().getPathToMessage(messageObject.messageOwner);
                    if (pathToMessage.exists()) {
                        file = pathToMessage;
                    }
                }
                gg.b0 b0Var = vbVar.x;
                if (b0Var != null) {
                    if (b0Var.N0() < vbVar.x.B() - 1) {
                        vbVar.g0 = vbVar.x.L0();
                        org.telegram.ui.Components.gl0 gl0Var = (org.telegram.ui.Components.gl0) vbVar.v.L(vbVar.g0);
                        if (gl0Var != null) {
                            vbVar.h0 = gl0Var.a.getTop();
                        } else {
                            vbVar.g0 = -1;
                        }
                    } else {
                        vbVar.g0 = -1;
                    }
                }
                org.telegram.ui.ActionBar.i6 u10 = org.telegram.ui.ActionBar.j6.u(file, messageObject.getDocumentName(), null, true);
                if (u10 != null) {
                    vbVar.presentFragment(new vd1(u10));
                    return;
                }
                vbVar.g0 = -1;
            }
            try {
                AndroidUtilities.openForView(messageObject, vbVar.getParentActivity(), null, false);
            } catch (Exception unused2) {
                vb.v0(vbVar, messageObject);
            }
        }
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean v2(int i10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ String w(long j3) {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ boolean w0(MessageObject messageObject) {
        return true;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ org.telegram.ui.Cells.r9 z2() {
        return null;
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void A(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void C1(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final void D0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void F(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void F0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void I(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void I0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void K1(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final void L(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void M1(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void N(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void N0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void R1() {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void T(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void X0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void Z0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void d0(int i10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void e2(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void i0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void k1() {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void m2(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final void n0(String str) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void o(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void p() {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void q2() {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void t(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void u(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void x2() {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void y0(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void z(org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void z0() {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void D1(org.telegram.ui.Cells.u1 u1Var, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void E(org.telegram.ui.Cells.u1 u1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void H1(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void M(int i10, org.telegram.ui.Cells.u1 u1Var) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void R0(org.telegram.ui.Cells.u1 u1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void T1(org.telegram.ui.Cells.u1 u1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void g2(org.telegram.ui.Cells.u1 u1Var, long j3) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void i(org.telegram.ui.Cells.u1 u1Var, bi.f fVar) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void p1(org.telegram.ui.Cells.u1 u1Var, TLRPC.Document document) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void A0(org.telegram.ui.Cells.u1 u1Var, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void f0(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void u1(org.telegram.ui.Cells.u1 u1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void y2(org.telegram.ui.Cells.u1 u1Var, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void U1(org.telegram.ui.Cells.u1 u1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void n(org.telegram.ui.Cells.u1 u1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void j(org.telegram.ui.Cells.u1 u1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override // org.telegram.ui.Cells.l1
    public final /* synthetic */ void t2(org.telegram.ui.Cells.u1 u1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }
}
