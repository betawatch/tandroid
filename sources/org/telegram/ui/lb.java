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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class lb implements org.telegram.ui.Cells.j1 {
    public final /* synthetic */ qb a;

    public lb(qb qbVar) {
        this.a = qbVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00fa, code lost:
    
        if (r15.exists() != false) goto L55;
     */
    @Override // org.telegram.ui.Cells.j1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A0(org.telegram.ui.Cells.s1 s1Var, float f10, float f11, boolean z4) {
        int i10;
        File file;
        ub ubVar = this.a.n;
        MessageObject messageObject = s1Var.getMessageObject();
        if (messageObject.getInputStickerSet() != null) {
            ubVar.showDialog(new org.telegram.ui.Components.xx0(ubVar.getParentActivity(), ubVar, messageObject.getInputStickerSet(), null, null, null));
            return;
        }
        File file2 = null;
        if (messageObject.isVideo() || (i10 = messageObject.type) == 1 || ((i10 == 0 && !messageObject.isWebpageDocument()) || messageObject.isGif())) {
            PhotoViewer.t1().K2(null, ubVar, null);
            PhotoViewer.t1().c2(messageObject, null, 0L, 0L, 0L, ubVar.C0);
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
                    file2 = ubVar.getFileLoader().getPathToMessage(messageObject.messageOwner);
                }
                Intent intent = new Intent("android.intent.action.VIEW");
                if (Build.VERSION.SDK_INT >= 24) {
                    intent.setFlags(1);
                    intent.setDataAndType(FileProvider.d(ubVar.getParentActivity(), ApplicationLoader.getApplicationId() + ".provider", file2), "video/mp4");
                } else {
                    intent.setDataAndType(Uri.fromFile(file2), "video/mp4");
                }
                ubVar.getParentActivity().startActivityForResult(intent, 500);
                return;
            } catch (Exception unused) {
                ub.v0(ubVar, messageObject);
                return;
            }
        }
        if (i11 == 4) {
            if (AndroidUtilities.isMapsInstalled(ubVar)) {
                cd0 cd0Var = new cd0(0);
                cd0Var.u0(messageObject);
                ubVar.presentFragment(cd0Var);
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
                    File pathToMessage = ubVar.getFileLoader().getPathToMessage(messageObject.messageOwner);
                    if (pathToMessage.exists()) {
                        file = pathToMessage;
                    }
                }
                k kVar = ubVar.D;
                if (kVar != null) {
                    if (kVar.N0() < ubVar.D.B() - 1) {
                        ubVar.h0 = ubVar.D.L0();
                        org.telegram.ui.Components.dl0 dl0Var = (org.telegram.ui.Components.dl0) ubVar.B.K(ubVar.h0);
                        if (dl0Var != null) {
                            ubVar.i0 = dl0Var.a.getTop();
                        } else {
                            ubVar.h0 = -1;
                        }
                    } else {
                        ubVar.h0 = -1;
                    }
                }
                org.telegram.ui.ActionBar.i6 u10 = org.telegram.ui.ActionBar.j6.u(file, messageObject.getDocumentName(), null, true);
                if (u10 != null) {
                    ubVar.presentFragment(new jd1(u10));
                    return;
                }
                ubVar.h0 = -1;
            }
            try {
                AndroidUtilities.openForView(messageObject, ubVar.getParentActivity(), null, false);
            } catch (Exception unused2) {
                ub.v0(ubVar, messageObject);
            }
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean B0(MessageObject messageObject) {
        return true;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ org.telegram.ui.Cells.m9 D2() {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean F1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void G0(org.telegram.ui.Cells.s1 s1Var, float f10, float f11) {
        ub ubVar = this.a.n;
        int i10 = ub.U0;
        ubVar.P0(s1Var, 0.0f, 0.0f);
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean K1(org.telegram.ui.Cells.s1 s1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean M1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean P(org.telegram.ui.Cells.s1 s1Var, TLRPC.TodoItem todoItem, boolean z4) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean Q() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean R(org.telegram.ui.Cells.s1 s1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean R0(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void R1(org.telegram.ui.Cells.s1 s1Var, TLRPC.WebPage webPage, String str, boolean z4) {
        ze.d.s(s1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean S() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ CharacterStyle S1(org.telegram.ui.Cells.s1 s1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void T(org.telegram.ui.Cells.s1 s1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z4) {
        int i11;
        ub ubVar = this.a.n;
        if (chat == null || chat == ubVar.s) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", chat.id);
        if (i10 != 0) {
            bundle.putInt("message_id", i10);
        }
        i11 = ((org.telegram.ui.ActionBar.p2) ubVar).currentAccount;
        if (MessagesController.getInstance(i11).checkCanOpenChat(bundle, ubVar)) {
            ubVar.presentFragment(new zn(bundle), true);
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public final void T1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        ub ubVar = this.a.n;
        org.telegram.ui.Components.ou.I(ubVar, messageObject, ubVar.C0, str2, str3, str4, str, i10, i11, -1, false);
    }

    @Override // org.telegram.ui.Cells.j1
    public final void U0(int i10, org.telegram.ui.Cells.s1 s1Var) {
        TLRPC.WebPage webPage;
        int i11;
        ub ubVar = this.a.n;
        MessageObject messageObject = s1Var.getMessageObject();
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = messageObject.currentEvent;
        if (tL_channelAdminLogEvent != null && (tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionEditMessage)) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -messageObject.getDialogId());
            bundle.putInt("message_id", messageObject.getRealId());
            zn znVar = new zn(bundle);
            if (ChatObject.isForum(ubVar.s)) {
                long dialogId = messageObject.getDialogId();
                i11 = ((org.telegram.ui.ActionBar.p2) ubVar).currentAccount;
                ag.f.a(znVar, MessagesStorage.TopicKey.of(dialogId, MessageObject.getTopicId(i11, messageObject.messageOwner, true)));
            }
            ubVar.presentFragment(znVar);
            return;
        }
        if (i10 == 0) {
            TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
            if (messageMedia == null || (webPage = messageMedia.webpage) == null || webPage.cached_page == null) {
                return;
            }
            LaunchActivity launchActivity = LaunchActivity.D1;
            if (launchActivity == null || launchActivity.P() == null || LaunchActivity.D1.P().k(messageObject) == null) {
                ubVar.createArticleViewer(false).N(messageObject, null, null, null);
                return;
            }
            return;
        }
        if (i10 != 5) {
            TLRPC.MessageMedia messageMedia2 = messageObject.messageOwner.media;
            if (messageMedia2 == null || messageMedia2.webpage == null) {
                return;
            }
            ze.d.s(ubVar.getParentActivity(), messageObject.messageOwner.media.webpage.url);
            return;
        }
        TLRPC.User user = ubVar.getMessagesController().getUser(Long.valueOf(messageObject.messageOwner.media.user_id));
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
            ubVar.showDialog(new org.telegram.ui.Components.te0(ubVar, null, user, null, file, null, str2, str3, null));
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean U1(org.telegram.ui.Cells.s1 s1Var, MessageObject messageObject) {
        if (messageObject.isVoice() || messageObject.isRoundVideo()) {
            boolean playMessage = MediaController.getInstance().playMessage(messageObject, false);
            MediaController.getInstance().setVoiceMessagesPlaylist(null, false);
            return playMessage;
        }
        if (messageObject.isMusic()) {
            return MediaController.getInstance().setPlaylist(this.a.n.p0, messageObject, 0L);
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ int W() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ ug.a Z() {
        return null;
    }

    public final void a(TLRPC.User user) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", user.id);
        qb qbVar = this.a;
        ub.p0(qbVar.n, bundle, user.id);
        ProfileActivity profileActivity = new ProfileActivity(bundle, null);
        profileActivity.N4(0);
        qbVar.n.presentFragment(profileActivity);
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean a0(org.telegram.ui.Cells.s1 s1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean a2(org.telegram.ui.Cells.s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void b1(org.telegram.ui.Cells.s1 s1Var, CharacterStyle characterStyle, boolean z4) {
        TLRPC.WebPage webPage;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        ub ubVar = this.a.n;
        if (characterStyle == null) {
            return;
        }
        MessageObject messageObject = s1Var.getMessageObject();
        if (characterStyle instanceof org.telegram.ui.Components.l51) {
            org.telegram.ui.Components.l51 l51Var = (org.telegram.ui.Components.l51) characterStyle;
            AndroidUtilities.addToClipboard(l51Var.a.subSequence(l51Var.b, l51Var.c).toString());
            if (AndroidUtilities.shouldShowClipboardToast()) {
                Toast.makeText(ubVar.getParentActivity(), LocaleController.getString(R.string.TextCopied), 0).show();
                return;
            }
            return;
        }
        if (characterStyle instanceof org.telegram.ui.Components.p51) {
            Long parseLong = Utilities.parseLong(((org.telegram.ui.Components.p51) characterStyle).getURL());
            long longValue = parseLong.longValue();
            if (longValue > 0) {
                i13 = ((org.telegram.ui.ActionBar.p2) ubVar).currentAccount;
                TLRPC.User user = MessagesController.getInstance(i13).getUser(parseLong);
                if (user != null) {
                    i14 = ((org.telegram.ui.ActionBar.p2) ubVar).currentAccount;
                    MessagesController.getInstance(i14).openChatOrProfileWith(user, null, ubVar, 0, false);
                    return;
                }
                return;
            }
            i11 = ((org.telegram.ui.ActionBar.p2) ubVar).currentAccount;
            TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-longValue));
            if (chat != null) {
                i12 = ((org.telegram.ui.ActionBar.p2) ubVar).currentAccount;
                MessagesController.getInstance(i12).openChatOrProfileWith(null, chat, ubVar, 0, false);
                return;
            }
            return;
        }
        if (characterStyle instanceof org.telegram.ui.Components.m51) {
            String url = ((org.telegram.ui.Components.m51) characterStyle).getURL();
            if (url.startsWith("@")) {
                i10 = ((org.telegram.ui.ActionBar.p2) ubVar).currentAccount;
                MessagesController.getInstance(i10).openByUserName(url.substring(1), ubVar, 0);
                return;
            } else {
                if (url.startsWith("#")) {
                    qy qyVar = new qy(null);
                    qyVar.k2 = url;
                    ubVar.presentFragment(qyVar);
                    return;
                }
                return;
            }
        }
        String url2 = ((URLSpan) characterStyle).getURL();
        if (z4) {
            org.telegram.ui.ActionBar.g3 g3Var = new org.telegram.ui.ActionBar.g3(ubVar.getParentActivity(), null, false, false);
            g3Var.fixNavigationBar();
            g3Var.title = url2;
            g3Var.bigTitle = false;
            CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)};
            cg.u1 u1Var = new cg.u1(2, this, url2);
            g3Var.items = charSequenceArr;
            g3Var.onClickListener = u1Var;
            ubVar.showDialog(g3Var);
            return;
        }
        if (characterStyle instanceof org.telegram.ui.Components.o51) {
            String url3 = ((org.telegram.ui.Components.o51) characterStyle).getURL();
            if (ze.d.f(Uri.parse(url3), false, null)) {
                ze.d.o(ubVar.getParentActivity(), url3, true);
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ubVar.getParentActivity());
            String string = LocaleController.getString(R.string.OpenUrlTitle);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
            d2Var.O = string;
            d2Var.Q = LocaleController.formatString(R.string.OpenUrlAlert2, url3);
            alertDialog$Builder.k(LocaleController.getString(R.string.Open), new mg.w(10, ubVar, url3));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            ubVar.showDialog(d2Var);
            return;
        }
        TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
        if ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
            String lowerCase = url2.toLowerCase();
            String lowerCase2 = messageObject.messageOwner.media.webpage.url.toLowerCase();
            if ((ze.d.h(lowerCase, false, false) || lowerCase.contains("t.me/iv")) && (lowerCase.contains(lowerCase2) || lowerCase2.contains(lowerCase))) {
                LaunchActivity launchActivity = LaunchActivity.D1;
                if (launchActivity == null || launchActivity.P() == null || LaunchActivity.D1.P().k(messageObject) == null) {
                    ubVar.createArticleViewer(false).N(messageObject, null, null, null);
                    return;
                }
                return;
            }
        }
        ze.d.o(ubVar.getParentActivity(), url2, true);
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean c0(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user) {
        int i10;
        int i11;
        b5 b10;
        ub ubVar = this.a.n;
        if (user != null) {
            long j10 = user.id;
            i10 = ((org.telegram.ui.ActionBar.p2) ubVar).currentAccount;
            if (j10 != UserConfig.getInstance(i10).getClientUserId()) {
                h5[] h5VarArr = {h5.d, h5.h};
                TLRPC.UserFull userFull = ubVar.getMessagesController().getUserFull(user.id);
                if (userFull != null) {
                    b10 = b5.c(user, userFull, h5VarArr);
                } else {
                    i11 = ((org.telegram.ui.ActionBar.p2) ubVar).classGuid;
                    b10 = b5.b(user, i11, h5VarArr);
                }
                if (cb.m.e(b10)) {
                    cb.m.l().v((ViewGroup) ubVar.fragmentView, ubVar.getResourceProvider(), b10, new mg.w(this, s1Var, user));
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean c1(org.telegram.ui.Cells.s1 s1Var, boolean z4) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ cv0 c2() {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean e2(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean f() {
        return true;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void f2(org.telegram.ui.Cells.s1 s1Var, int i10, float f10, float f11, boolean z4) {
        MessageObject messageObject = s1Var.getMessageObject().replyMessageObject;
        long dialogId = messageObject.getDialogId();
        ub ubVar = this.a.n;
        if (dialogId == (-ubVar.s.id)) {
            for (int i11 = 0; i11 < ubVar.p0.size(); i11++) {
                MessageObject messageObject2 = (MessageObject) ubVar.p0.get(i11);
                if (messageObject2 != null && messageObject2.contentType != 1 && messageObject2.getRealId() == messageObject.getRealId()) {
                    ubVar.Z0(messageObject2);
                    return;
                }
            }
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", ubVar.s.id);
        bundle.putInt("message_id", messageObject.getRealId());
        ubVar.presentFragment(new zn(bundle));
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ String g(org.telegram.ui.Cells.s1 s1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean g0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean g2(org.telegram.ui.Cells.s1 s1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean h1(int i10, org.telegram.ui.Cells.s1 s1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void j() {
        ub ubVar = this.a.n;
        if (ApplicationLoader.isStandaloneBuild()) {
            LaunchActivity launchActivity = LaunchActivity.D1;
            if (launchActivity != null) {
                launchActivity.z(true);
                return;
            }
            return;
        }
        if (BuildVars.isHuaweiStoreApp()) {
            ze.d.s(ubVar.getParentActivity(), BuildVars.HUAWEI_STORE_URL);
        } else {
            ze.d.s(ubVar.getParentActivity(), BuildVars.PLAYSTORE_APP_URL);
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ int k0(org.telegram.ui.Cells.s1 s1Var) {
        return 0;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean m1(MessageObject messageObject) {
        return b.a(messageObject);
    }

    @Override // org.telegram.ui.Cells.j1
    public final boolean p0() {
        return true;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void q(org.telegram.ui.Cells.s1 s1Var) {
        qb qbVar = this.a;
        ub ubVar = qbVar.n;
        if (ubVar.getParentActivity() == null) {
            return;
        }
        ubVar.showDialog(org.telegram.ui.Components.lq0.N0(qbVar.c, s1Var.getMessageObject(), null, ChatObject.isChannel(ubVar.s) && !ubVar.s.megagroup, null));
    }

    @Override // org.telegram.ui.Cells.j1
    public final void r1(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        MessageObject messageObject = s1Var.getMessageObject();
        qb qbVar = this.a;
        if (qbVar.n.q0.contains(Long.valueOf(messageObject.eventId))) {
            qbVar.n.q0.remove(Long.valueOf(messageObject.eventId));
        } else {
            qbVar.n.q0.add(Long.valueOf(messageObject.eventId));
        }
        qbVar.n.X0(true);
        qbVar.n.R0();
        qbVar.n.F.l();
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean r2(org.telegram.ui.Cells.s1 s1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean t0(org.telegram.ui.Components.u5 u5Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void v0(org.telegram.ui.Cells.s1 s1Var, float f10, float f11) {
        ub ubVar = this.a.n;
        int i10 = ub.U0;
        ubVar.P0(s1Var, 0.0f, 0.0f);
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ String w(long j10) {
        return null;
    }

    @Override // org.telegram.ui.Cells.j1
    public final void y0(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user, float f10, float f11) {
        int i10;
        if (user != null) {
            long j10 = user.id;
            i10 = ((org.telegram.ui.ActionBar.p2) this.a.n).currentAccount;
            if (j10 != UserConfig.getInstance(i10).getClientUserId()) {
                a(user);
            }
        }
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ boolean z2(int i10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void A(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void B2() {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void D0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void E0() {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void F(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void H1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void I(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final void I0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void K0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final void L(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void N0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void O(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void O1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void Q1(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void S0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void U(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void V1() {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void d1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void e1(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void f0(int i10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void j2(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void l0(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void n(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void o() {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void p1() {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.Cells.j1
    public final void s0(String str) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void s2(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void t(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void u(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void v2() {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void y(org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void E(org.telegram.ui.Cells.s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void I1(org.telegram.ui.Cells.s1 s1Var, boolean z4) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void L1(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void M(org.telegram.ui.Cells.s1 s1Var, jh.f fVar) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void N(int i10, org.telegram.ui.Cells.s1 s1Var) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void W0(org.telegram.ui.Cells.s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void Y1(org.telegram.ui.Cells.s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void l2(org.telegram.ui.Cells.s1 s1Var, long j10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void u1(org.telegram.ui.Cells.s1 s1Var, TLRPC.Document document) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void C2(org.telegram.ui.Cells.s1 s1Var, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void F0(org.telegram.ui.Cells.s1 s1Var, TLObject tLObject, boolean z4) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void i0(org.telegram.ui.Cells.s1 s1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void z1(org.telegram.ui.Cells.s1 s1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void Z1(org.telegram.ui.Cells.s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void m(org.telegram.ui.Cells.s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void i(org.telegram.ui.Cells.s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override // org.telegram.ui.Cells.j1
    public final /* synthetic */ void x2(org.telegram.ui.Cells.s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
    }
}
