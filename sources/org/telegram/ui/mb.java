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

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class mb implements org.telegram.ui.Cells.k1 {
    public final /* synthetic */ rb a;

    public mb(rb rbVar) {
        this.a = rbVar;
    }

    @Override // org.telegram.ui.Cells.k1
    public final void A0(org.telegram.ui.Cells.t1 t1Var, float f7, float f10) {
        vb vbVar = this.a.n;
        int i10 = vb.Q0;
        vbVar.P0(t1Var, 0.0f, 0.0f);
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean B1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final void G1(org.telegram.ui.Cells.t1 t1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        pf.d.r(t1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ CharacterStyle H1(org.telegram.ui.Cells.t1 t1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public final void I1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        vb vbVar = this.a.n;
        org.telegram.ui.Components.cv.I(vbVar, messageObject, vbVar.B0, str2, str3, str4, str, i10, i11, -1, false);
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean J0(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean J1(org.telegram.ui.Cells.t1 t1Var, MessageObject messageObject) {
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

    @Override // org.telegram.ui.Cells.k1
    public final void M0(int i10, org.telegram.ui.Cells.t1 t1Var) {
        TLRPC.WebPage webPage;
        int i11;
        vb vbVar = this.a.n;
        MessageObject messageObject = t1Var.getMessageObject();
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = messageObject.currentEvent;
        if (tL_channelAdminLogEvent != null && (tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionEditMessage)) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -messageObject.getDialogId());
            bundle.putInt("message_id", messageObject.getRealId());
            sn snVar = new sn(bundle);
            if (ChatObject.isForum(vbVar.f)) {
                long dialogId = messageObject.getDialogId();
                i11 = ((org.telegram.ui.ActionBar.o2) vbVar).currentAccount;
                og.d.a(snVar, MessagesStorage.TopicKey.of(dialogId, MessageObject.getTopicId(i11, messageObject.messageOwner, true)));
            }
            vbVar.presentFragment(snVar);
            return;
        }
        if (i10 == 0) {
            TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
            if (messageMedia == null || (webPage = messageMedia.webpage) == null || webPage.cached_page == null) {
                return;
            }
            LaunchActivity launchActivity = LaunchActivity.J1;
            if (launchActivity == null || launchActivity.P() == null || LaunchActivity.J1.P().l(messageObject) == null) {
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
            pf.d.r(vbVar.getParentActivity(), messageObject.messageOwner.media.webpage.url);
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
            vbVar.showDialog(new org.telegram.ui.Components.mf0(vbVar, null, user, null, file, null, str2, str3, null));
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean N(org.telegram.ui.Cells.t1 t1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean O1(org.telegram.ui.Cells.t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean P() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ yu0 P1() {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean Q(org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean Q1(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean R() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final void R0(org.telegram.ui.Cells.t1 t1Var, CharacterStyle characterStyle, boolean z10) {
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
        MessageObject messageObject = t1Var.getMessageObject();
        if (characterStyle instanceof org.telegram.ui.Components.p61) {
            org.telegram.ui.Components.p61 p61Var = (org.telegram.ui.Components.p61) characterStyle;
            AndroidUtilities.addToClipboard(p61Var.a.subSequence(p61Var.b, p61Var.c).toString());
            if (AndroidUtilities.shouldShowClipboardToast()) {
                Toast.makeText(vbVar.getParentActivity(), LocaleController.getString(R.string.TextCopied), 0).show();
                return;
            }
            return;
        }
        if (characterStyle instanceof org.telegram.ui.Components.t61) {
            Long parseLong = Utilities.parseLong(((org.telegram.ui.Components.t61) characterStyle).getURL());
            long longValue = parseLong.longValue();
            if (longValue > 0) {
                i13 = ((org.telegram.ui.ActionBar.o2) vbVar).currentAccount;
                TLRPC.User user = MessagesController.getInstance(i13).getUser(parseLong);
                if (user != null) {
                    i14 = ((org.telegram.ui.ActionBar.o2) vbVar).currentAccount;
                    MessagesController.getInstance(i14).openChatOrProfileWith(user, null, vbVar, 0, false);
                    return;
                }
                return;
            }
            i11 = ((org.telegram.ui.ActionBar.o2) vbVar).currentAccount;
            TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-longValue));
            if (chat != null) {
                i12 = ((org.telegram.ui.ActionBar.o2) vbVar).currentAccount;
                MessagesController.getInstance(i12).openChatOrProfileWith(null, chat, vbVar, 0, false);
                return;
            }
            return;
        }
        if (characterStyle instanceof org.telegram.ui.Components.q61) {
            String url = ((org.telegram.ui.Components.q61) characterStyle).getURL();
            if (url.startsWith("@")) {
                i10 = ((org.telegram.ui.ActionBar.o2) vbVar).currentAccount;
                MessagesController.getInstance(i10).openByUserName(url.substring(1), vbVar, 0);
                return;
            } else {
                if (url.startsWith("#")) {
                    ey eyVar = new ey(null);
                    eyVar.n2 = url;
                    vbVar.presentFragment(eyVar);
                    return;
                }
                return;
            }
        }
        String url2 = ((URLSpan) characterStyle).getURL();
        if (z10) {
            org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(1, (Context) vbVar.getParentActivity(), (org.telegram.ui.ActionBar.g6) null, false);
            h3Var.fixNavigationBar();
            h3Var.title = url2;
            h3Var.bigTitle = false;
            CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)};
            mg.j jVar = new mg.j(2, this, url2);
            h3Var.items = charSequenceArr;
            h3Var.onClickListener = jVar;
            vbVar.showDialog(h3Var);
            return;
        }
        if (characterStyle instanceof org.telegram.ui.Components.s61) {
            String url3 = ((org.telegram.ui.Components.s61) characterStyle).getURL();
            if (pf.d.e(Uri.parse(url3), false, null)) {
                pf.d.n(vbVar.getParentActivity(), url3, true);
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vbVar.getParentActivity());
            String string = LocaleController.getString(R.string.OpenUrlTitle);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
            c2Var.R = string;
            c2Var.T = LocaleController.formatString(R.string.OpenUrlAlert2, url3);
            alertDialog$Builder.k(LocaleController.getString(R.string.Open), new m4.w0(8, vbVar, url3));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            vbVar.showDialog(c2Var);
            return;
        }
        TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
        if ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
            String lowerCase = url2.toLowerCase();
            String lowerCase2 = messageObject.messageOwner.media.webpage.url.toLowerCase();
            if ((pf.d.g(lowerCase, false, false) || lowerCase.contains("t.me/iv")) && (lowerCase.contains(lowerCase2) || lowerCase2.contains(lowerCase))) {
                LaunchActivity launchActivity = LaunchActivity.J1;
                if (launchActivity == null || launchActivity.P() == null || LaunchActivity.J1.P().l(messageObject) == null) {
                    vbVar.createArticleViewer(false).N(messageObject, null, null, null);
                    return;
                }
                return;
            }
        }
        pf.d.n(vbVar.getParentActivity(), url2, true);
    }

    @Override // org.telegram.ui.Cells.k1
    public final void R1(org.telegram.ui.Cells.t1 t1Var, int i10, float f7, float f10, boolean z10) {
        MessageObject messageObject = t1Var.getMessageObject().replyMessageObject;
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
        vbVar.presentFragment(new sn(bundle));
    }

    @Override // org.telegram.ui.Cells.k1
    public final void S(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
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
        i11 = ((org.telegram.ui.ActionBar.o2) vbVar).currentAccount;
        if (MessagesController.getInstance(i11).checkCanOpenChat(bundle, vbVar)) {
            vbVar.presentFragment(new sn(bundle), true);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean S0(org.telegram.ui.Cells.t1 t1Var, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean S1(org.telegram.ui.Cells.t1 t1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ int V() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ ih.a W() {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean Z(org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean Z0(int i10, org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    public final void a(TLRPC.User user) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", user.id);
        rb rbVar = this.a;
        vb.p0(rbVar.n, bundle, user.id);
        ProfileActivity profileActivity = new ProfileActivity(bundle, null);
        profileActivity.Q4(0);
        rbVar.n.presentFragment(profileActivity);
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean b2(org.telegram.ui.Cells.t1 t1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean c0(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user) {
        int i10;
        int i11;
        b5 b10;
        vb vbVar = this.a.n;
        if (user != null) {
            long j10 = user.id;
            i10 = ((org.telegram.ui.ActionBar.o2) vbVar).currentAccount;
            if (j10 != UserConfig.getInstance(i10).getClientUserId()) {
                h5[] h5VarArr = {h5.d, h5.h};
                TLRPC.UserFull userFull = vbVar.getMessagesController().getUserFull(user.id);
                if (userFull != null) {
                    b10 = b5.c(user, userFull, h5VarArr);
                } else {
                    i11 = ((org.telegram.ui.ActionBar.o2) vbVar).classGuid;
                    b10 = b5.b(user, i11, h5VarArr);
                }
                if (c2.b.g(b10)) {
                    c2.b.m().y((ViewGroup) vbVar.fragmentView, vbVar.getResourceProvider(), b10, new m4.w0(this, t1Var, user));
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean d1(MessageObject messageObject) {
        return org.telegram.ui.Cells.b1.a(messageObject);
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean e0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean f() {
        return true;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ String g(org.telegram.ui.Cells.t1 t1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ int h0(org.telegram.ui.Cells.t1 t1Var) {
        return 0;
    }

    @Override // org.telegram.ui.Cells.k1
    public final void h1(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        MessageObject messageObject = t1Var.getMessageObject();
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

    @Override // org.telegram.ui.Cells.k1
    public final void j() {
        vb vbVar = this.a.n;
        if (ApplicationLoader.isStandaloneBuild()) {
            LaunchActivity launchActivity = LaunchActivity.J1;
            if (launchActivity != null) {
                launchActivity.z(true);
                return;
            }
            return;
        }
        if (BuildVars.isHuaweiStoreApp()) {
            pf.d.r(vbVar.getParentActivity(), BuildVars.HUAWEI_STORE_URL);
        } else {
            pf.d.r(vbVar.getParentActivity(), BuildVars.PLAYSTORE_APP_URL);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean l0() {
        return true;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean l2(int i10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean o0(org.telegram.ui.Components.a6 a6Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final void p(org.telegram.ui.Cells.t1 t1Var) {
        rb rbVar = this.a;
        vb vbVar = rbVar.n;
        if (vbVar.getParentActivity() == null) {
            return;
        }
        vbVar.showDialog(org.telegram.ui.Components.ir0.S0(rbVar.c, t1Var.getMessageObject(), null, ChatObject.isChannel(vbVar.f) && !vbVar.f.megagroup, null));
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ org.telegram.ui.Cells.p9 p2() {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public final void q0(org.telegram.ui.Cells.t1 t1Var, float f7, float f10) {
        vb vbVar = this.a.n;
        int i10 = vb.Q0;
        vbVar.P0(t1Var, 0.0f, 0.0f);
    }

    @Override // org.telegram.ui.Cells.k1
    public final void u0(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, float f7, float f10) {
        int i10;
        if (user != null) {
            long j10 = user.id;
            i10 = ((org.telegram.ui.ActionBar.o2) this.a.n).currentAccount;
            if (j10 != UserConfig.getInstance(i10).getClientUserId()) {
                a(user);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00fa, code lost:
    
        if (r15.exists() != false) goto L55;
     */
    @Override // org.telegram.ui.Cells.k1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v0(org.telegram.ui.Cells.t1 t1Var, float f7, float f10, boolean z10) {
        int i10;
        File file;
        vb vbVar = this.a.n;
        MessageObject messageObject = t1Var.getMessageObject();
        if (messageObject.getInputStickerSet() != null) {
            vbVar.showDialog(new org.telegram.ui.Components.ty0(vbVar.getParentActivity(), vbVar, messageObject.getInputStickerSet(), null, null, null));
            return;
        }
        File file2 = null;
        if (messageObject.isVideo() || (i10 = messageObject.type) == 1 || ((i10 == 0 && !messageObject.isWebpageDocument()) || messageObject.isGif())) {
            PhotoViewer.u1().M2(null, vbVar, null);
            PhotoViewer.u1().h2(messageObject, null, 0L, 0L, 0L, vbVar.B0);
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
                sc0 sc0Var = new sc0(0);
                sc0Var.u0(messageObject);
                vbVar.presentFragment(sc0Var);
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
                hg.a0 a0Var = vbVar.x;
                if (a0Var != null) {
                    if (a0Var.N0() < vbVar.x.B() - 1) {
                        vbVar.g0 = vbVar.x.L0();
                        org.telegram.ui.Components.wl0 wl0Var = (org.telegram.ui.Components.wl0) vbVar.v.K(vbVar.g0);
                        if (wl0Var != null) {
                            vbVar.h0 = wl0Var.a.getTop();
                        } else {
                            vbVar.g0 = -1;
                        }
                    } else {
                        vbVar.g0 = -1;
                    }
                }
                org.telegram.ui.ActionBar.j6 u10 = org.telegram.ui.ActionBar.k6.u(file, messageObject.getDocumentName(), null, true);
                if (u10 != null) {
                    vbVar.presentFragment(new qc1(u10));
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

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean v1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ String w(long j10) {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean w0(MessageObject messageObject) {
        return true;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean z1(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void A(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void B(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final void C0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void D1(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void E0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void F(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void F1(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void G(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void G0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final void I(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void K0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void L1() {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void M(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void T(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void T0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void U1(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void V0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void c2(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void d0(int i10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void f1() {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void g2() {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void i0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void m(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void n() {
    }

    @Override // org.telegram.ui.Cells.k1
    public final void n0(String str) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void n2() {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void q() {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void s(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void t(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void w1(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void x0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void y0() {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void A1(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void D(org.telegram.ui.Cells.t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void K(int i10, org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void K1(org.telegram.ui.Cells.t1 t1Var, ah.t tVar) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void M1(org.telegram.ui.Cells.t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void O0(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void W1(org.telegram.ui.Cells.t1 t1Var, long j10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void k1(org.telegram.ui.Cells.t1 t1Var, TLRPC.Document document) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void x1(org.telegram.ui.Cells.t1 t1Var, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void f0(org.telegram.ui.Cells.t1 t1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void o2(org.telegram.ui.Cells.t1 t1Var, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void p1(org.telegram.ui.Cells.t1 t1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void z0(org.telegram.ui.Cells.t1 t1Var, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void N1(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void l(org.telegram.ui.Cells.t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void i(org.telegram.ui.Cells.t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void i2(org.telegram.ui.Cells.t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }
}
