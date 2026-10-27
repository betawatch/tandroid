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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class nb implements org.telegram.ui.Cells.j1 {
    public final /* synthetic */ sb a;

    public nb(sb sbVar) {
        this.a = sbVar;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean C0(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean C1(org.telegram.ui.Cells.s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void E0(int i10, org.telegram.ui.Cells.s1 s1Var) {
        TLRPC.WebPage webPage;
        int i11;
        wb wbVar = this.a.n;
        MessageObject messageObject = s1Var.getMessageObject();
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = messageObject.currentEvent;
        if (tL_channelAdminLogEvent != null && (tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionEditMessage)) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -messageObject.getDialogId());
            bundle.putInt("message_id", messageObject.getRealId());
            wn wnVar = new wn(bundle);
            if (ChatObject.isForum(wbVar.f)) {
                long dialogId = messageObject.getDialogId();
                i11 = ((org.telegram.ui.ActionBar.r2) wbVar).currentAccount;
                pg.d.a(wnVar, MessagesStorage.TopicKey.of(dialogId, MessageObject.getTopicId(i11, messageObject.messageOwner, true)));
            }
            wbVar.presentFragment(wnVar);
            return;
        }
        if (i10 == 0) {
            TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
            if (messageMedia == null || (webPage = messageMedia.webpage) == null || webPage.cached_page == null) {
                return;
            }
            LaunchActivity launchActivity = LaunchActivity.I1;
            if (launchActivity == null || launchActivity.P() == null || LaunchActivity.I1.P().l(messageObject) == null) {
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
            qf.d.r(wbVar.getParentActivity(), messageObject.messageOwner.media.webpage.url);
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
            wbVar.showDialog(new org.telegram.ui.Components.kf0(wbVar, null, user, null, file, null, str2, str3, null));
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ ev0 E1() {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean G1(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void H1(org.telegram.ui.Cells.s1 s1Var, int i10, float f7, float f10, boolean z10) {
        MessageObject messageObject = s1Var.getMessageObject().replyMessageObject;
        long dialogId = messageObject.getDialogId();
        wb wbVar = this.a.n;
        if (dialogId == (-wbVar.f.id)) {
            for (int i11 = 0; i11 < wbVar.o0.size(); i11++) {
                MessageObject messageObject2 = (MessageObject) wbVar.o0.get(i11);
                if (messageObject2 != null && messageObject2.contentType != 1 && messageObject2.getRealId() == messageObject.getRealId()) {
                    wbVar.Z0(messageObject2);
                    return;
                }
            }
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", wbVar.f.id);
        bundle.putInt("message_id", messageObject.getRealId());
        wbVar.presentFragment(new wn(bundle));
    }

    @Override // org.telegram.ui.Cells.j1
    public final void I0(org.telegram.ui.Cells.s1 s1Var, CharacterStyle characterStyle, boolean z10) {
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
        MessageObject messageObject = s1Var.getMessageObject();
        if (characterStyle instanceof org.telegram.ui.Components.x61) {
            org.telegram.ui.Components.x61 x61Var = (org.telegram.ui.Components.x61) characterStyle;
            AndroidUtilities.addToClipboard(x61Var.a.subSequence(x61Var.b, x61Var.c).toString());
            if (AndroidUtilities.shouldShowClipboardToast()) {
                Toast.makeText(wbVar.getParentActivity(), LocaleController.getString(R.string.TextCopied), 0).show();
                return;
            }
            return;
        }
        if (characterStyle instanceof org.telegram.ui.Components.b71) {
            Long parseLong = Utilities.parseLong(((org.telegram.ui.Components.b71) characterStyle).getURL());
            long longValue = parseLong.longValue();
            if (longValue > 0) {
                i13 = ((org.telegram.ui.ActionBar.r2) wbVar).currentAccount;
                TLRPC.User user = MessagesController.getInstance(i13).getUser(parseLong);
                if (user != null) {
                    i14 = ((org.telegram.ui.ActionBar.r2) wbVar).currentAccount;
                    MessagesController.getInstance(i14).openChatOrProfileWith(user, null, wbVar, 0, false);
                    return;
                }
                return;
            }
            i11 = ((org.telegram.ui.ActionBar.r2) wbVar).currentAccount;
            TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-longValue));
            if (chat != null) {
                i12 = ((org.telegram.ui.ActionBar.r2) wbVar).currentAccount;
                MessagesController.getInstance(i12).openChatOrProfileWith(null, chat, wbVar, 0, false);
                return;
            }
            return;
        }
        if (characterStyle instanceof org.telegram.ui.Components.y61) {
            String url = ((org.telegram.ui.Components.y61) characterStyle).getURL();
            if (url.startsWith("@")) {
                i10 = ((org.telegram.ui.ActionBar.r2) wbVar).currentAccount;
                MessagesController.getInstance(i10).openByUserName(url.substring(1), wbVar, 0);
                return;
            } else {
                if (url.startsWith("#")) {
                    ey eyVar = new ey(null);
                    eyVar.n2 = url;
                    wbVar.presentFragment(eyVar);
                    return;
                }
                return;
            }
        }
        String url2 = ((URLSpan) characterStyle).getURL();
        if (z10) {
            org.telegram.ui.ActionBar.k3 k3Var = new org.telegram.ui.ActionBar.k3(1, (Context) wbVar.getParentActivity(), (org.telegram.ui.ActionBar.u6) null, false);
            k3Var.fixNavigationBar();
            k3Var.title = url2;
            k3Var.bigTitle = false;
            CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)};
            ng.j jVar = new ng.j(2, this, url2);
            k3Var.items = charSequenceArr;
            k3Var.onClickListener = jVar;
            wbVar.showDialog(k3Var);
            return;
        }
        if (characterStyle instanceof org.telegram.ui.Components.a71) {
            String url3 = ((org.telegram.ui.Components.a71) characterStyle).getURL();
            if (qf.d.e(Uri.parse(url3), false, null)) {
                qf.d.n(wbVar.getParentActivity(), url3, true);
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wbVar.getParentActivity());
            String string = LocaleController.getString(R.string.OpenUrlTitle);
            org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
            e2Var.R = string;
            e2Var.T = LocaleController.formatString(R.string.OpenUrlAlert2, url3);
            alertDialog$Builder.k(LocaleController.getString(R.string.Open), new m4.s0(10, wbVar, url3));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            wbVar.showDialog(e2Var);
            return;
        }
        TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
        if ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
            String lowerCase = url2.toLowerCase();
            String lowerCase2 = messageObject.messageOwner.media.webpage.url.toLowerCase();
            if ((qf.d.g(lowerCase, false, false) || lowerCase.contains("t.me/iv")) && (lowerCase.contains(lowerCase2) || lowerCase2.contains(lowerCase))) {
                LaunchActivity launchActivity = LaunchActivity.I1;
                if (launchActivity == null || launchActivity.P() == null || LaunchActivity.I1.P().l(messageObject) == null) {
                    wbVar.createArticleViewer(false).N(messageObject, null, null, null);
                    return;
                }
                return;
            }
        }
        qf.d.n(wbVar.getParentActivity(), url2, true);
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean I1(org.telegram.ui.Cells.s1 s1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean J0(org.telegram.ui.Cells.s1 s1Var, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean L(org.telegram.ui.Cells.s1 s1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean M() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean N(org.telegram.ui.Cells.s1 s1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean O() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean O0(int i10, org.telegram.ui.Cells.s1 s1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void P(org.telegram.ui.Cells.s1 s1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
        int i11;
        wb wbVar = this.a.n;
        if (chat == null || chat == wbVar.f) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", chat.id);
        if (i10 != 0) {
            bundle.putInt("message_id", i10);
        }
        i11 = ((org.telegram.ui.ActionBar.r2) wbVar).currentAccount;
        if (MessagesController.getInstance(i11).checkCanOpenChat(bundle, wbVar)) {
            wbVar.presentFragment(new wn(bundle), true);
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean Q1(org.telegram.ui.Cells.s1 s1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ int S() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean S0(MessageObject messageObject) {
        return d3.a(messageObject);
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ jh.a V() {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean W(org.telegram.ui.Cells.s1 s1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void W0(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        MessageObject messageObject = s1Var.getMessageObject();
        sb sbVar = this.a;
        if (sbVar.n.p0.contains(Long.valueOf(messageObject.eventId))) {
            sbVar.n.p0.remove(Long.valueOf(messageObject.eventId));
        } else {
            sbVar.n.p0.add(Long.valueOf(messageObject.eventId));
        }
        sbVar.n.X0(true);
        sbVar.n.S0();
        sbVar.n.E.l();
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean X(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user) {
        int i10;
        int i11;
        a5 b10;
        wb wbVar = this.a.n;
        if (user != null) {
            long j10 = user.id;
            i10 = ((org.telegram.ui.ActionBar.r2) wbVar).currentAccount;
            if (j10 != UserConfig.getInstance(i10).getClientUserId()) {
                g5[] g5VarArr = {g5.d, g5.h};
                TLRPC.UserFull userFull = wbVar.getMessagesController().getUserFull(user.id);
                if (userFull != null) {
                    b10 = a5.c(user, userFull, g5VarArr);
                } else {
                    i11 = ((org.telegram.ui.ActionBar.r2) wbVar).classGuid;
                    b10 = a5.b(user, i11, g5VarArr);
                }
                if (c2.b.g(b10)) {
                    c2.b.m().y((ViewGroup) wbVar.fragmentView, wbVar.getResourceProvider(), b10, new m4.s0(this, s1Var, user));
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean X1(int i10) {
        return false;
    }

    public final void a(TLRPC.User user) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", user.id);
        sb sbVar = this.a;
        wb.q0(sbVar.n, bundle, user.id);
        ProfileActivity profileActivity = new ProfileActivity(bundle, null);
        profileActivity.X4(0);
        sbVar.n.presentFragment(profileActivity);
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean a0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ org.telegram.ui.Cells.t9 b2() {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean c() {
        return true;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ int c0(org.telegram.ui.Cells.s1 s1Var) {
        return 0;
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean d() {
        return true;
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean e0() {
        return true;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ String h(org.telegram.ui.Cells.s1 s1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean h0(org.telegram.ui.Components.c6 c6Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void j() {
        wb wbVar = this.a.n;
        if (ApplicationLoader.isStandaloneBuild()) {
            LaunchActivity launchActivity = LaunchActivity.I1;
            if (launchActivity != null) {
                launchActivity.z(true);
                return;
            }
            return;
        }
        if (BuildVars.isHuaweiStoreApp()) {
            qf.d.r(wbVar.getParentActivity(), BuildVars.HUAWEI_STORE_URL);
        } else {
            qf.d.r(wbVar.getParentActivity(), BuildVars.PLAYSTORE_APP_URL);
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public final void j0(org.telegram.ui.Cells.s1 s1Var, float f7, float f10) {
        wb wbVar = this.a.n;
        int i10 = wb.Q0;
        wbVar.Q0(s1Var, 0.0f, 0.0f);
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean k1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void m0(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user, float f7, float f10) {
        int i10;
        if (user != null) {
            long j10 = user.id;
            i10 = ((org.telegram.ui.ActionBar.r2) this.a.n).currentAccount;
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
    public final void o0(org.telegram.ui.Cells.s1 s1Var, float f7, float f10, boolean z10) {
        int i10;
        File file;
        wb wbVar = this.a.n;
        MessageObject messageObject = s1Var.getMessageObject();
        if (messageObject.getInputStickerSet() != null) {
            wbVar.showDialog(new org.telegram.ui.Components.dz0(wbVar.getParentActivity(), wbVar, messageObject.getInputStickerSet(), null, null, null));
            return;
        }
        File file2 = null;
        if (messageObject.isVideo() || (i10 = messageObject.type) == 1 || ((i10 == 0 && !messageObject.isWebpageDocument()) || messageObject.isGif())) {
            PhotoViewer.v1().N2(null, wbVar, null);
            PhotoViewer.v1().i2(messageObject, null, 0L, 0L, 0L, wbVar.B0);
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
                wb.w0(wbVar, messageObject);
                return;
            }
        }
        if (i11 == 4) {
            if (AndroidUtilities.isMapsInstalled(wbVar)) {
                rc0 rc0Var = new rc0(0);
                rc0Var.v0(messageObject);
                wbVar.presentFragment(rc0Var);
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
                ig.a0 a0Var = wbVar.x;
                if (a0Var != null) {
                    if (a0Var.N0() < wbVar.x.B() - 1) {
                        wbVar.g0 = wbVar.x.L0();
                        org.telegram.ui.Components.wl0 wl0Var = (org.telegram.ui.Components.wl0) wbVar.v.K(wbVar.g0);
                        if (wl0Var != null) {
                            wbVar.h0 = wl0Var.a.getTop();
                        } else {
                            wbVar.g0 = -1;
                        }
                    } else {
                        wbVar.g0 = -1;
                    }
                }
                org.telegram.ui.ActionBar.x6 u10 = org.telegram.ui.ActionBar.y6.u(file, messageObject.getDocumentName(), null, true);
                if (u10 != null) {
                    wbVar.presentFragment(new vc1(u10));
                    return;
                }
                wbVar.g0 = -1;
            }
            try {
                AndroidUtilities.openForView(messageObject, wbVar.getParentActivity(), null, false);
            } catch (Exception unused2) {
                wb.w0(wbVar, messageObject);
            }
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public final void p(org.telegram.ui.Cells.s1 s1Var) {
        sb sbVar = this.a;
        wb wbVar = sbVar.n;
        if (wbVar.getParentActivity() == null) {
            return;
        }
        wbVar.showDialog(org.telegram.ui.Components.nr0.P0(sbVar.c, s1Var.getMessageObject(), null, ChatObject.isChannel(wbVar.f) && !wbVar.f.megagroup, null));
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean p1(org.telegram.ui.Cells.s1 s1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean q0(MessageObject messageObject) {
        return true;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean r1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ String u(long j10) {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void u0(org.telegram.ui.Cells.s1 s1Var, float f7, float f10) {
        wb wbVar = this.a.n;
        int i10 = wb.Q0;
        wbVar.Q0(s1Var, 0.0f, 0.0f);
    }

    @Override // org.telegram.ui.Cells.j1
    public final void v1(org.telegram.ui.Cells.s1 s1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        qf.d.r(s1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ CharacterStyle w1(org.telegram.ui.Cells.s1 s1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void x1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        wb wbVar = this.a.n;
        org.telegram.ui.Components.dv.I(wbVar, messageObject, wbVar.B0, str2, str3, str4, str, i10, i11, -1, false);
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean y1(org.telegram.ui.Cells.s1 s1Var, MessageObject messageObject) {
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
    public final /* synthetic */ void U0() {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void V1() {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void Z1() {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void n() {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void q() {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void s0() {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void z1() {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void A0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void D(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void D0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void F(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final void I(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void K(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void K0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void K1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void L0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void Q(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void R1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void Z(int i10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void d0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final void g0(String str) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void m(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void m1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void r(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void r0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void s(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void s1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void u1(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void v(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void w0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void x(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void A1(org.telegram.ui.Cells.s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void C(org.telegram.ui.Cells.s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void F0(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void J(int i10, org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void M1(org.telegram.ui.Cells.s1 s1Var, long j10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void Z0(org.telegram.ui.Cells.s1 s1Var, TLRPC.Document document) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void n0(org.telegram.ui.Cells.s1 s1Var, bh.n nVar) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void n1(org.telegram.ui.Cells.s1 s1Var, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void q1(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void a2(org.telegram.ui.Cells.s1 s1Var, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void b0(org.telegram.ui.Cells.s1 s1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void f1(org.telegram.ui.Cells.s1 s1Var, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final void l1(org.telegram.ui.Cells.s1 s1Var, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void t0(org.telegram.ui.Cells.s1 s1Var, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final void y0(org.telegram.ui.Cells.s1 s1Var, boolean z10, boolean z11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void B1(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void l(org.telegram.ui.Cells.s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void W1(org.telegram.ui.Cells.s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void i(org.telegram.ui.Cells.s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }
}
