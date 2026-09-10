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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class nb implements org.telegram.ui.Cells.k1 {
    public final /* synthetic */ sb a;

    public nb(sb sbVar) {
        this.a = sbVar;
    }

    @Override // org.telegram.ui.Cells.k1
    public final void C0(org.telegram.ui.Cells.t1 t1Var, float f7, float f10) {
        wb wbVar = this.a.n;
        int i10 = wb.X0;
        wbVar.P0(t1Var, 0.0f, 0.0f);
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean E1(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean G1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final void L1(org.telegram.ui.Cells.t1 t1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        nf.f.s(t1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean M0(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ CharacterStyle M1(org.telegram.ui.Cells.t1 t1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean N(org.telegram.ui.Cells.t1 t1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final void N1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        wb wbVar = this.a.n;
        org.telegram.ui.Components.zu.J(wbVar, messageObject, wbVar.F0, str2, str3, str4, str, i10, i11, -1, false);
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean O() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean O1(org.telegram.ui.Cells.t1 t1Var, MessageObject messageObject) {
        if (messageObject.isVoice() || messageObject.isRoundVideo()) {
            boolean playMessage = MediaController.getInstance().playMessage(messageObject, false);
            MediaController.getInstance().setVoiceMessagesPlaylist(null, false);
            return playMessage;
        }
        if (messageObject.isMusic()) {
            return MediaController.getInstance().setPlaylist(this.a.n.s0, messageObject, 0L);
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean P(org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final void P0(int i10, org.telegram.ui.Cells.t1 t1Var) {
        TLRPC.WebPage webPage;
        int i11;
        wb wbVar = this.a.n;
        MessageObject messageObject = t1Var.getMessageObject();
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = messageObject.currentEvent;
        if (tL_channelAdminLogEvent != null && (tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionEditMessage)) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -messageObject.getDialogId());
            bundle.putInt("message_id", messageObject.getRealId());
            eo eoVar = new eo(bundle);
            if (ChatObject.isForum(wbVar.s)) {
                long dialogId = messageObject.getDialogId();
                i11 = ((org.telegram.ui.ActionBar.p2) wbVar).currentAccount;
                mg.d.a(eoVar, MessagesStorage.TopicKey.of(dialogId, MessageObject.getTopicId(i11, messageObject.messageOwner, true)));
            }
            wbVar.presentFragment(eoVar);
            return;
        }
        if (i10 == 0) {
            TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
            if (messageMedia == null || (webPage = messageMedia.webpage) == null || webPage.cached_page == null) {
                return;
            }
            LaunchActivity launchActivity = LaunchActivity.G1;
            if (launchActivity == null || launchActivity.P() == null || LaunchActivity.G1.P().l(messageObject) == null) {
                wbVar.createArticleViewer(false).N(messageObject, null, null, null);
                return;
            }
            return;
        }
        if (i10 != 5) {
            TLRPC.MessageMedia messageMedia2 = messageObject.messageOwner.media;
            if (messageMedia2 == null || messageMedia2.webpage == null) {
                return;
            }
            nf.f.s(wbVar.getParentActivity(), messageObject.messageOwner.media.webpage.url);
            return;
        }
        TLRPC.User user = wbVar.getMessagesController().getUser(Long.valueOf(messageObject.messageOwner.media.user_id));
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
            wbVar.showDialog(new org.telegram.ui.Components.ye0(wbVar, null, user, null, file, null, str2, str3, null));
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean Q() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final void R(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
        int i11;
        wb wbVar = this.a.n;
        if (chat == null || chat == wbVar.s) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", chat.id);
        if (i10 != 0) {
            bundle.putInt("message_id", i10);
        }
        i11 = ((org.telegram.ui.ActionBar.p2) wbVar).currentAccount;
        if (MessagesController.getInstance(i11).checkCanOpenChat(bundle, wbVar)) {
            wbVar.presentFragment(new eo(bundle), true);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ int U() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.k1
    public final void V0(org.telegram.ui.Cells.t1 t1Var, CharacterStyle characterStyle, boolean z10) {
        TLRPC.WebPage webPage;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        wb wbVar = this.a.n;
        if (characterStyle == null) {
            return;
        }
        MessageObject messageObject = t1Var.getMessageObject();
        if (characterStyle instanceof org.telegram.ui.Components.y51) {
            org.telegram.ui.Components.y51 y51Var = (org.telegram.ui.Components.y51) characterStyle;
            AndroidUtilities.addToClipboard(y51Var.a.subSequence(y51Var.b, y51Var.c).toString());
            if (AndroidUtilities.shouldShowClipboardToast()) {
                Toast.makeText(wbVar.getParentActivity(), LocaleController.getString(R.string.TextCopied), 0).show();
                return;
            }
            return;
        }
        if (characterStyle instanceof org.telegram.ui.Components.c61) {
            Long parseLong = Utilities.parseLong(((org.telegram.ui.Components.c61) characterStyle).getURL());
            long longValue = parseLong.longValue();
            if (longValue > 0) {
                i13 = ((org.telegram.ui.ActionBar.p2) wbVar).currentAccount;
                TLRPC.User user = MessagesController.getInstance(i13).getUser(parseLong);
                if (user != null) {
                    i14 = ((org.telegram.ui.ActionBar.p2) wbVar).currentAccount;
                    MessagesController.getInstance(i14).openChatOrProfileWith(user, null, wbVar, 0, false);
                    return;
                }
                return;
            }
            i11 = ((org.telegram.ui.ActionBar.p2) wbVar).currentAccount;
            TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-longValue));
            if (chat != null) {
                i12 = ((org.telegram.ui.ActionBar.p2) wbVar).currentAccount;
                MessagesController.getInstance(i12).openChatOrProfileWith(null, chat, wbVar, 0, false);
                return;
            }
            return;
        }
        if (characterStyle instanceof org.telegram.ui.Components.z51) {
            String url = ((org.telegram.ui.Components.z51) characterStyle).getURL();
            if (url.startsWith("@")) {
                i10 = ((org.telegram.ui.ActionBar.p2) wbVar).currentAccount;
                MessagesController.getInstance(i10).openByUserName(url.substring(1), wbVar, 0);
                return;
            } else {
                if (url.startsWith("#")) {
                    wy wyVar = new wy(null);
                    wyVar.n2 = url;
                    wbVar.presentFragment(wyVar);
                    return;
                }
                return;
            }
        }
        String url2 = ((URLSpan) characterStyle).getURL();
        if (z10) {
            org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(1, (Context) wbVar.getParentActivity(), (org.telegram.ui.ActionBar.f6) null, false);
            h3Var.fixNavigationBar();
            h3Var.title = url2;
            h3Var.bigTitle = false;
            CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)};
            kg.j jVar = new kg.j(3, this, url2);
            h3Var.items = charSequenceArr;
            h3Var.onClickListener = jVar;
            wbVar.showDialog(h3Var);
            return;
        }
        if (characterStyle instanceof org.telegram.ui.Components.b61) {
            String url3 = ((org.telegram.ui.Components.b61) characterStyle).getURL();
            if (nf.f.f(Uri.parse(url3), false, null)) {
                nf.f.o(wbVar.getParentActivity(), url3, true);
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wbVar.getParentActivity());
            String string = LocaleController.getString(R.string.OpenUrlTitle);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
            d2Var.R = string;
            d2Var.T = LocaleController.formatString(R.string.OpenUrlAlert2, url3);
            alertDialog$Builder.k(LocaleController.getString(R.string.Open), new bi.cb(27, wbVar, url3));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            wbVar.showDialog(d2Var);
            return;
        }
        TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
        if ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
            String lowerCase = url2.toLowerCase();
            String lowerCase2 = messageObject.messageOwner.media.webpage.url.toLowerCase();
            if ((nf.f.h(lowerCase, false, false) || lowerCase.contains("t.me/iv")) && (lowerCase.contains(lowerCase2) || lowerCase2.contains(lowerCase))) {
                LaunchActivity launchActivity = LaunchActivity.G1;
                if (launchActivity == null || launchActivity.P() == null || LaunchActivity.G1.P().l(messageObject) == null) {
                    wbVar.createArticleViewer(false).N(messageObject, null, null, null);
                    return;
                }
                return;
            }
        }
        nf.f.o(wbVar.getParentActivity(), url2, true);
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean V1(org.telegram.ui.Cells.t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean W0(org.telegram.ui.Cells.t1 t1Var, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ gh.a X() {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ rv0 X1() {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean Y(org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean Y1(long j3) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final void Z1(org.telegram.ui.Cells.t1 t1Var, int i10, float f7, float f10, boolean z10) {
        MessageObject messageObject = t1Var.getMessageObject().replyMessageObject;
        long dialogId = messageObject.getDialogId();
        wb wbVar = this.a.n;
        if (dialogId == (-wbVar.s.id)) {
            for (int i11 = 0; i11 < wbVar.s0.size(); i11++) {
                MessageObject messageObject2 = (MessageObject) wbVar.s0.get(i11);
                if (messageObject2 != null && messageObject2.contentType != 1 && messageObject2.getRealId() == messageObject.getRealId()) {
                    wbVar.Z0(messageObject2);
                    return;
                }
            }
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", wbVar.s.id);
        bundle.putInt("message_id", messageObject.getRealId());
        wbVar.presentFragment(new eo(bundle));
    }

    public final void a(TLRPC.User user) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", user.id);
        sb sbVar = this.a;
        wb.p0(sbVar.n, bundle, user.id);
        ProfileActivity profileActivity = new ProfileActivity(bundle, null);
        profileActivity.N4(0);
        sbVar.n.presentFragment(profileActivity);
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean a2(org.telegram.ui.Cells.t1 t1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean b0(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user) {
        int i10;
        int i11;
        x4 b10;
        wb wbVar = this.a.n;
        if (user != null) {
            long j3 = user.id;
            i10 = ((org.telegram.ui.ActionBar.p2) wbVar).currentAccount;
            if (j3 != UserConfig.getInstance(i10).getClientUserId()) {
                d5[] d5VarArr = {d5.d, d5.h};
                TLRPC.UserFull userFull = wbVar.getMessagesController().getUserFull(user.id);
                if (userFull != null) {
                    b10 = x4.c(user, userFull, d5VarArr);
                } else {
                    i11 = ((org.telegram.ui.ActionBar.p2) wbVar).classGuid;
                    b10 = x4.b(user, i11, d5VarArr);
                }
                if (com.google.firebase.messaging.m.e(b10)) {
                    com.google.firebase.messaging.m.k().v((ViewGroup) wbVar.fragmentView, wbVar.getResourceProvider(), b10, new bi.cb(this, t1Var, user, 28));
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean c1(int i10, org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean d0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean e() {
        return true;
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
    public final /* synthetic */ boolean g1(MessageObject messageObject) {
        return org.telegram.messenger.em.a(messageObject);
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ int h0(org.telegram.ui.Cells.t1 t1Var) {
        return 0;
    }

    @Override // org.telegram.ui.Cells.k1
    public final void j() {
        wb wbVar = this.a.n;
        if (ApplicationLoader.isStandaloneBuild()) {
            LaunchActivity launchActivity = LaunchActivity.G1;
            if (launchActivity != null) {
                launchActivity.z(true);
                return;
            }
            return;
        }
        if (BuildVars.isHuaweiStoreApp()) {
            nf.f.s(wbVar.getParentActivity(), BuildVars.HUAWEI_STORE_URL);
        } else {
            nf.f.s(wbVar.getParentActivity(), BuildVars.PLAYSTORE_APP_URL);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean j2(org.telegram.ui.Cells.t1 t1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean l0() {
        return true;
    }

    @Override // org.telegram.ui.Cells.k1
    public final void l1(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        MessageObject messageObject = t1Var.getMessageObject();
        sb sbVar = this.a;
        if (sbVar.n.t0.contains(Long.valueOf(messageObject.eventId))) {
            sbVar.n.t0.remove(Long.valueOf(messageObject.eventId));
        } else {
            sbVar.n.t0.add(Long.valueOf(messageObject.eventId));
        }
        sbVar.n.X0(true);
        sbVar.n.R0();
        sbVar.n.I.l();
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean o0(org.telegram.ui.Components.y5 y5Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final void q(org.telegram.ui.Cells.t1 t1Var) {
        sb sbVar = this.a;
        wb wbVar = sbVar.n;
        if (wbVar.getParentActivity() == null) {
            return;
        }
        wbVar.showDialog(org.telegram.ui.Components.sq0.N0(sbVar.c, t1Var.getMessageObject(), null, ChatObject.isChannel(wbVar.s) && !wbVar.s.megagroup, null));
    }

    @Override // org.telegram.ui.Cells.k1
    public final void q0(org.telegram.ui.Cells.t1 t1Var, float f7, float f10) {
        wb wbVar = this.a.n;
        int i10 = wb.X0;
        wbVar.P0(t1Var, 0.0f, 0.0f);
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean t2(int i10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final void u0(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, float f7, float f10) {
        int i10;
        if (user != null) {
            long j3 = user.id;
            i10 = ((org.telegram.ui.ActionBar.p2) this.a.n).currentAccount;
            if (j3 != UserConfig.getInstance(i10).getClientUserId()) {
                a(user);
            }
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ String v(long j3) {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00fa, code lost:
    
        if (r15.exists() != false) goto L55;
     */
    @Override // org.telegram.ui.Cells.k1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w0(org.telegram.ui.Cells.t1 t1Var, float f7, float f10, boolean z10) {
        int i10;
        File file;
        wb wbVar = this.a.n;
        MessageObject messageObject = t1Var.getMessageObject();
        if (messageObject.getInputStickerSet() != null) {
            wbVar.showDialog(new org.telegram.ui.Components.hy0(wbVar.getParentActivity(), wbVar, messageObject.getInputStickerSet(), null, null, null));
            return;
        }
        File file2 = null;
        if (messageObject.isVideo() || (i10 = messageObject.type) == 1 || ((i10 == 0 && !messageObject.isWebpageDocument()) || messageObject.isGif())) {
            PhotoViewer.t1().K2(null, wbVar, null);
            PhotoViewer.t1().c2(messageObject, null, 0L, 0L, 0L, wbVar.F0);
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
                    file2 = wbVar.getFileLoader().getPathToMessage(messageObject.messageOwner);
                }
                Intent intent = new Intent("android.intent.action.VIEW");
                if (Build.VERSION.SDK_INT >= 24) {
                    intent.setFlags(1);
                    intent.setDataAndType(FileProvider.d(wbVar.getParentActivity(), ApplicationLoader.getApplicationId() + ".provider", file2), "video/mp4");
                } else {
                    intent.setDataAndType(Uri.fromFile(file2), "video/mp4");
                }
                wbVar.getParentActivity().startActivityForResult(intent, 500);
                return;
            } catch (Exception unused) {
                wb.v0(wbVar, messageObject);
                return;
            }
        }
        if (i11 == 4) {
            if (AndroidUtilities.isMapsInstalled(wbVar)) {
                id0 id0Var = new id0(0);
                id0Var.u0(messageObject);
                wbVar.presentFragment(id0Var);
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
                    File pathToMessage = wbVar.getFileLoader().getPathToMessage(messageObject.messageOwner);
                    if (pathToMessage.exists()) {
                        file = pathToMessage;
                    }
                }
                fg.a0 a0Var = wbVar.G;
                if (a0Var != null) {
                    if (a0Var.N0() < wbVar.G.B() - 1) {
                        wbVar.k0 = wbVar.G.L0();
                        org.telegram.ui.Components.fl0 fl0Var = (org.telegram.ui.Components.fl0) wbVar.E.K(wbVar.k0);
                        if (fl0Var != null) {
                            wbVar.l0 = fl0Var.a.getTop();
                        } else {
                            wbVar.k0 = -1;
                        }
                    } else {
                        wbVar.k0 = -1;
                    }
                }
                org.telegram.ui.ActionBar.i6 u10 = org.telegram.ui.ActionBar.j6.u(file, messageObject.getDocumentName(), null, true);
                if (u10 != null) {
                    wbVar.presentFragment(new ae1(u10));
                    return;
                }
                wbVar.k0 = -1;
            }
            try {
                AndroidUtilities.openForView(messageObject, wbVar.getParentActivity(), null, false);
            } catch (Exception unused2) {
                wb.v0(wbVar, messageObject);
            }
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean x0(MessageObject messageObject) {
        return true;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ org.telegram.ui.Cells.t9 x2() {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean z1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void A(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void A0() {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void B1(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void E(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final void E0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void G0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void H(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void I0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void I1(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final void K(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void K1(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void M(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void N0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void Q1() {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void S(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void X0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void Z0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void c0(int i10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void c2(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void i0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void j1() {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void k2(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void n(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final void n0(String str) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void o() {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void o2() {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void r() {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void s(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void t(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void v2() {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void z(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void z0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void C1(org.telegram.ui.Cells.t1 t1Var, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void D(org.telegram.ui.Cells.t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void F1(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void L(int i10, org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void R0(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void S1(org.telegram.ui.Cells.t1 t1Var, ai.j jVar) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void T1(org.telegram.ui.Cells.t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void e2(org.telegram.ui.Cells.t1 t1Var, long j3) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void o1(org.telegram.ui.Cells.t1 t1Var, TLRPC.Document document) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void B0(org.telegram.ui.Cells.t1 t1Var, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void f0(org.telegram.ui.Cells.t1 t1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void t1(org.telegram.ui.Cells.t1 t1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void w2(org.telegram.ui.Cells.t1 t1Var, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void U1(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void m(org.telegram.ui.Cells.t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void i(org.telegram.ui.Cells.t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void r2(org.telegram.ui.Cells.t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }
}
