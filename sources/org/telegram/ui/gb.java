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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class gb implements org.telegram.ui.Cells.k1 {
    public final /* synthetic */ lb a;

    public gb(lb lbVar) {
        this.a = lbVar;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ String C(long j10) {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public final void D1(org.telegram.ui.Cells.t1 t1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        ve.e.s(t1Var.getContext(), str);
    }

    @Override // org.telegram.ui.Cells.k1
    public final void E0(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
        pb pbVar = this.a.n;
        int i9 = pb.T0;
        pbVar.P0(t1Var, 0.0f, 0.0f);
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ CharacterStyle E1(org.telegram.ui.Cells.t1 t1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public final void F1(MessageObject messageObject, String str, String str2, String str3, String str4, int i9, int i10) {
        pb pbVar = this.a.n;
        org.telegram.ui.Components.gu.I(pbVar, messageObject, pbVar.B0, str2, str3, str4, str, i9, i10, -1, false);
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean G1(org.telegram.ui.Cells.t1 t1Var, MessageObject messageObject) {
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
    public final /* synthetic */ boolean K0(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final void O0(int i9, org.telegram.ui.Cells.t1 t1Var) {
        TLRPC.WebPage webPage;
        int i10;
        pb pbVar = this.a.n;
        MessageObject messageObject = t1Var.getMessageObject();
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = messageObject.currentEvent;
        if (tL_channelAdminLogEvent != null && (tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionEditMessage)) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -messageObject.getDialogId());
            bundle.putInt("message_id", messageObject.getRealId());
            qn qnVar = new qn(bundle);
            if (ChatObject.isForum(pbVar.s)) {
                long dialogId = messageObject.getDialogId();
                i10 = ((org.telegram.ui.ActionBar.o2) pbVar).currentAccount;
                vf.c.a(qnVar, MessagesStorage.TopicKey.of(dialogId, MessageObject.getTopicId(i10, messageObject.messageOwner, true)));
            }
            pbVar.presentFragment(qnVar);
            return;
        }
        if (i9 == 0) {
            TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
            if (messageMedia == null || (webPage = messageMedia.webpage) == null || webPage.cached_page == null) {
                return;
            }
            LaunchActivity launchActivity = LaunchActivity.C1;
            if (launchActivity == null || launchActivity.P() == null || LaunchActivity.C1.P().l(messageObject) == null) {
                pbVar.createArticleViewer(false).N(messageObject, null, null, null);
                return;
            }
            return;
        }
        if (i9 != 5) {
            TLRPC.MessageMedia messageMedia2 = messageObject.messageOwner.media;
            if (messageMedia2 == null || messageMedia2.webpage == null) {
                return;
            }
            ve.e.s(pbVar.getParentActivity(), messageObject.messageOwner.media.webpage.url);
            return;
        }
        TLRPC.User user = pbVar.getMessagesController().getUser(Long.valueOf(messageObject.messageOwner.media.user_id));
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
            pbVar.showDialog(new org.telegram.ui.Components.wd0(pbVar, null, user, null, file, null, str2, str3, null));
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean O1(org.telegram.ui.Cells.t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ nu0 P1() {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public final void R0(org.telegram.ui.Cells.t1 t1Var, CharacterStyle characterStyle, boolean z10) {
        TLRPC.WebPage webPage;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        pb pbVar = this.a.n;
        if (characterStyle == null) {
            return;
        }
        MessageObject messageObject = t1Var.getMessageObject();
        if (characterStyle instanceof org.telegram.ui.Components.o41) {
            org.telegram.ui.Components.o41 o41Var = (org.telegram.ui.Components.o41) characterStyle;
            AndroidUtilities.addToClipboard(o41Var.a.subSequence(o41Var.b, o41Var.c).toString());
            if (AndroidUtilities.shouldShowClipboardToast()) {
                Toast.makeText(pbVar.getParentActivity(), LocaleController.getString(R.string.TextCopied), 0).show();
                return;
            }
            return;
        }
        if (characterStyle instanceof org.telegram.ui.Components.s41) {
            Long parseLong = Utilities.parseLong(((org.telegram.ui.Components.s41) characterStyle).getURL());
            long longValue = parseLong.longValue();
            if (longValue > 0) {
                i12 = ((org.telegram.ui.ActionBar.o2) pbVar).currentAccount;
                TLRPC.User user = MessagesController.getInstance(i12).getUser(parseLong);
                if (user != null) {
                    i13 = ((org.telegram.ui.ActionBar.o2) pbVar).currentAccount;
                    MessagesController.getInstance(i13).openChatOrProfileWith(user, null, pbVar, 0, false);
                    return;
                }
                return;
            }
            i10 = ((org.telegram.ui.ActionBar.o2) pbVar).currentAccount;
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-longValue));
            if (chat != null) {
                i11 = ((org.telegram.ui.ActionBar.o2) pbVar).currentAccount;
                MessagesController.getInstance(i11).openChatOrProfileWith(null, chat, pbVar, 0, false);
                return;
            }
            return;
        }
        int i14 = 1;
        if (characterStyle instanceof org.telegram.ui.Components.p41) {
            String url = ((org.telegram.ui.Components.p41) characterStyle).getURL();
            if (url.startsWith("@")) {
                i9 = ((org.telegram.ui.ActionBar.o2) pbVar).currentAccount;
                MessagesController.getInstance(i9).openByUserName(url.substring(1), pbVar, 0);
                return;
            } else {
                if (url.startsWith("#")) {
                    dy dyVar = new dy(null);
                    dyVar.j2 = url;
                    pbVar.presentFragment(dyVar);
                    return;
                }
                return;
            }
        }
        String url2 = ((URLSpan) characterStyle).getURL();
        if (z10) {
            org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(pbVar.getParentActivity(), null, false, false);
            f3Var.fixNavigationBar();
            f3Var.title = url2;
            f3Var.bigTitle = false;
            CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Open), LocaleController.getString(R.string.Copy)};
            v vVar = new v(i14, this, url2);
            f3Var.items = charSequenceArr;
            f3Var.onClickListener = vVar;
            pbVar.showDialog(f3Var);
            return;
        }
        if (characterStyle instanceof org.telegram.ui.Components.r41) {
            String url3 = ((org.telegram.ui.Components.r41) characterStyle).getURL();
            if (ve.e.f(Uri.parse(url3), false, null)) {
                ve.e.o(pbVar.getParentActivity(), url3, true);
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(pbVar.getParentActivity());
            String string = LocaleController.getString(R.string.OpenUrlTitle);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
            c2Var.N = string;
            c2Var.P = LocaleController.formatString(R.string.OpenUrlAlert2, url3);
            alertDialog$Builder.k(LocaleController.getString(R.string.Open), new ih.v3(11, pbVar, url3));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            pbVar.showDialog(c2Var);
            return;
        }
        TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
        if ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
            String lowerCase = url2.toLowerCase();
            String lowerCase2 = messageObject.messageOwner.media.webpage.url.toLowerCase();
            if ((ve.e.h(lowerCase, false, false) || lowerCase.contains("t.me/iv")) && (lowerCase.contains(lowerCase2) || lowerCase2.contains(lowerCase))) {
                LaunchActivity launchActivity = LaunchActivity.C1;
                if (launchActivity == null || launchActivity.P() == null || LaunchActivity.C1.P().l(messageObject) == null) {
                    pbVar.createArticleViewer(false).N(messageObject, null, null, null);
                    return;
                }
                return;
            }
        }
        ve.e.o(pbVar.getParentActivity(), url2, true);
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean R1(long j10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean S0(org.telegram.ui.Cells.t1 t1Var, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final void S1(org.telegram.ui.Cells.t1 t1Var, int i9, float f10, float f11, boolean z10) {
        MessageObject messageObject = t1Var.getMessageObject().replyMessageObject;
        long dialogId = messageObject.getDialogId();
        pb pbVar = this.a.n;
        if (dialogId == (-pbVar.s.id)) {
            for (int i10 = 0; i10 < pbVar.o0.size(); i10++) {
                MessageObject messageObject2 = (MessageObject) pbVar.o0.get(i10);
                if (messageObject2 != null && messageObject2.contentType != 1 && messageObject2.getRealId() == messageObject.getRealId()) {
                    pbVar.Z0(messageObject2);
                    return;
                }
            }
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", pbVar.s.id);
        bundle.putInt("message_id", messageObject.getRealId());
        pbVar.presentFragment(new qn(bundle));
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean V(org.telegram.ui.Cells.t1 t1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean W() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean W1(org.telegram.ui.Cells.t1 t1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean X(org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean Y() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean Y0(int i9, org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final void Z(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat, int i9, float f10, float f11, boolean z10) {
        int i10;
        pb pbVar = this.a.n;
        if (chat == null || chat == pbVar.s) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", chat.id);
        if (i9 != 0) {
            bundle.putInt("message_id", i9);
        }
        i10 = ((org.telegram.ui.ActionBar.o2) pbVar).currentAccount;
        if (MessagesController.getInstance(i10).checkCanOpenChat(bundle, pbVar)) {
            pbVar.presentFragment(new qn(bundle), true);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean Z0(MessageObject messageObject) {
        return org.telegram.messenger.ll.a(messageObject);
    }

    public final void a(TLRPC.User user) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", user.id);
        lb lbVar = this.a;
        pb.o0(lbVar.n, bundle, user.id);
        ProfileActivity profileActivity = new ProfileActivity(bundle, null);
        profileActivity.N4(0);
        lbVar.n.presentFragment(profileActivity);
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ int b0() {
        return 0;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ pg.a d0() {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean e0(org.telegram.ui.Cells.t1 t1Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final void e1(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        MessageObject messageObject = t1Var.getMessageObject();
        lb lbVar = this.a;
        if (lbVar.n.p0.contains(Long.valueOf(messageObject.eventId))) {
            lbVar.n.p0.remove(Long.valueOf(messageObject.eventId));
        } else {
            lbVar.n.p0.add(Long.valueOf(messageObject.eventId));
        }
        lbVar.n.X0(true);
        lbVar.n.R0();
        lbVar.n.E.l();
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean f() {
        return true;
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean f0(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user) {
        int i9;
        int i10;
        w4 b10;
        pb pbVar = this.a.n;
        if (user != null) {
            long j10 = user.id;
            i9 = ((org.telegram.ui.ActionBar.o2) pbVar).currentAccount;
            if (j10 != UserConfig.getInstance(i9).getClientUserId()) {
                c5[] c5VarArr = {c5.d, c5.h};
                TLRPC.UserFull userFull = pbVar.getMessagesController().getUserFull(user.id);
                if (userFull != null) {
                    b10 = w4.c(user, userFull, c5VarArr);
                } else {
                    i10 = ((org.telegram.ui.ActionBar.o2) pbVar).classGuid;
                    b10 = w4.b(user, i10, c5VarArr);
                }
                if (com.google.firebase.messaging.l.e(b10)) {
                    com.google.firebase.messaging.l.i().s((ViewGroup) pbVar.fragmentView, pbVar.getResourceProvider(), b10, new ih.v3(this, t1Var, user));
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean f2(org.telegram.ui.Cells.t1 t1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1, org.telegram.ui.Cells.t0
    public final boolean h() {
        return true;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ String i(org.telegram.ui.Cells.t1 t1Var) {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean j0() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ int l0(org.telegram.ui.Cells.t1 t1Var) {
        return 0;
    }

    @Override // org.telegram.ui.Cells.k1
    public final void m() {
        pb pbVar = this.a.n;
        if (ApplicationLoader.isStandaloneBuild()) {
            LaunchActivity launchActivity = LaunchActivity.C1;
            if (launchActivity != null) {
                launchActivity.z(true);
                return;
            }
            return;
        }
        if (BuildVars.isHuaweiStoreApp()) {
            ve.e.s(pbVar.getParentActivity(), BuildVars.HUAWEI_STORE_URL);
        } else {
            ve.e.s(pbVar.getParentActivity(), BuildVars.PLAYSTORE_APP_URL);
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean n2(int i9) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final boolean o0() {
        return true;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ org.telegram.ui.Cells.o9 q2() {
        return null;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean r0(org.telegram.ui.Components.t5 t5Var) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean r1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final void s0(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
        pb pbVar = this.a.n;
        int i9 = pb.T0;
        pbVar.P0(t1Var, 0.0f, 0.0f);
    }

    @Override // org.telegram.ui.Cells.k1
    public final void u0(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, float f10, float f11) {
        int i9;
        if (user != null) {
            long j10 = user.id;
            i9 = ((org.telegram.ui.ActionBar.o2) this.a.n).currentAccount;
            if (j10 != UserConfig.getInstance(i9).getClientUserId()) {
                a(user);
            }
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final void v(org.telegram.ui.Cells.t1 t1Var) {
        lb lbVar = this.a;
        pb pbVar = lbVar.n;
        if (pbVar.getParentActivity() == null) {
            return;
        }
        pbVar.showDialog(org.telegram.ui.Components.rp0.N0(lbVar.c, t1Var.getMessageObject(), null, ChatObject.isChannel(pbVar.s) && !pbVar.s.megagroup, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00fa, code lost:
    
        if (r15.exists() != false) goto L55;
     */
    @Override // org.telegram.ui.Cells.k1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w0(org.telegram.ui.Cells.t1 t1Var, float f10, float f11, boolean z10) {
        int i9;
        File file;
        pb pbVar = this.a.n;
        MessageObject messageObject = t1Var.getMessageObject();
        if (messageObject.getInputStickerSet() != null) {
            pbVar.showDialog(new org.telegram.ui.Components.cx0(pbVar.getParentActivity(), pbVar, messageObject.getInputStickerSet(), null, null, null));
            return;
        }
        File file2 = null;
        if (messageObject.isVideo() || (i9 = messageObject.type) == 1 || ((i9 == 0 && !messageObject.isWebpageDocument()) || messageObject.isGif())) {
            PhotoViewer.t1().K2(null, pbVar, null);
            PhotoViewer.t1().c2(messageObject, null, 0L, 0L, 0L, pbVar.B0);
            return;
        }
        int i10 = messageObject.type;
        if (i10 == 3) {
            try {
                String str = messageObject.messageOwner.attachPath;
                if (str != null && str.length() != 0) {
                    file2 = new File(messageObject.messageOwner.attachPath);
                }
                if (file2 == null || !file2.exists()) {
                    file2 = pbVar.getFileLoader().getPathToMessage(messageObject.messageOwner);
                }
                Intent intent = new Intent("android.intent.action.VIEW");
                if (Build.VERSION.SDK_INT >= 24) {
                    intent.setFlags(1);
                    intent.setDataAndType(FileProvider.d(pbVar.getParentActivity(), ApplicationLoader.getApplicationId() + ".provider", file2), "video/mp4");
                } else {
                    intent.setDataAndType(Uri.fromFile(file2), "video/mp4");
                }
                pbVar.getParentActivity().startActivityForResult(intent, 500);
                return;
            } catch (Exception unused) {
                pb.u0(pbVar, messageObject);
                return;
            }
        }
        if (i10 == 4) {
            if (AndroidUtilities.isMapsInstalled(pbVar)) {
                pc0 pc0Var = new pc0(0);
                pc0Var.t0(messageObject);
                pbVar.presentFragment(pc0Var);
                return;
            }
            return;
        }
        if (i10 == 9 || i10 == 0) {
            if (messageObject.getDocumentName().toLowerCase().endsWith("attheme")) {
                String str2 = messageObject.messageOwner.attachPath;
                if (str2 != null && str2.length() != 0) {
                    file = new File(messageObject.messageOwner.attachPath);
                }
                file = null;
                if (file == null) {
                    File pathToMessage = pbVar.getFileLoader().getPathToMessage(messageObject.messageOwner);
                    if (pathToMessage.exists()) {
                        file = pathToMessage;
                    }
                }
                of.y yVar = pbVar.C;
                if (yVar != null) {
                    if (yVar.N0() < pbVar.C.B() - 1) {
                        pbVar.g0 = pbVar.C.L0();
                        org.telegram.ui.Components.ik0 ik0Var = (org.telegram.ui.Components.ik0) pbVar.A.K(pbVar.g0);
                        if (ik0Var != null) {
                            pbVar.h0 = ik0Var.a.getTop();
                        } else {
                            pbVar.g0 = -1;
                        }
                    } else {
                        pbVar.g0 = -1;
                    }
                }
                org.telegram.ui.ActionBar.e6 u10 = org.telegram.ui.ActionBar.f6.u(file, messageObject.getDocumentName(), null, true);
                if (u10 != null) {
                    pbVar.presentFragment(new oc1(u10));
                    return;
                }
                pbVar.g0 = -1;
            }
            try {
                AndroidUtilities.openForView(messageObject, pbVar.getParentActivity(), null, false);
            } catch (Exception unused2) {
                pb.u0(pbVar, messageObject);
            }
        }
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean x1(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean z0(MessageObject messageObject) {
        return true;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ boolean z1() {
        return false;
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void A0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void A1(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void B0() {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void C1(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void F(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final void F0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void G0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void I0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void I1() {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void J(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void M0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void N(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void P(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final void R(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void U(MessageObject messageObject) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void U0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void W0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void a0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void b2(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void d1() {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void g2(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void i0(int i9) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void k2() {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void m0(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void o2() {
    }

    @Override // org.telegram.ui.Cells.k1
    public final void q0(String str) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void r(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void s1(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void w() {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void x(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void z(org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void L1(org.telegram.ui.Cells.t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void M(org.telegram.ui.Cells.t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void Q0(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void S(int i9, org.telegram.ui.Cells.t1 t1Var) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void e2(org.telegram.ui.Cells.t1 t1Var, long j10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void g1(org.telegram.ui.Cells.t1 t1Var, TLRPC.Document document) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void t1(org.telegram.ui.Cells.t1 t1Var, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void w1(org.telegram.ui.Cells.t1 t1Var, eh.f fVar) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void y1(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void D0(org.telegram.ui.Cells.t1 t1Var, TLObject tLObject, boolean z10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void k0(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void l1(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void p2(org.telegram.ui.Cells.t1 t1Var, int i9, int i10) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void M1(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void q(org.telegram.ui.Cells.t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i9) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void l(org.telegram.ui.Cells.t1 t1Var, ArrayList arrayList, int i9, int i10, int i11) {
    }

    @Override // org.telegram.ui.Cells.k1
    public final /* synthetic */ void l2(org.telegram.ui.Cells.t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }
}
