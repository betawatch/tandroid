package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class mc1 extends org.telegram.ui.Components.il0 {
    public final Context c;
    public final ArrayList d;
    public final boolean e;
    public final /* synthetic */ qc1 f;

    public mc1(Context context, qc1 qc1Var) {
        kc1 kc1Var;
        this.f = qc1Var;
        int i10 = qc1Var.b;
        boolean z10 = i10 == 0 && Utilities.random.nextInt(100) <= 1;
        this.e = z10;
        this.c = context;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        int i11 = currentTimeMillis - 3600;
        if (i10 == 2) {
            if (qc1Var.F1 >= 0) {
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                if (qc1Var.x1 instanceof zh1) {
                    tL_message.message = LocaleController.getString(R.string.BackgroundColorSinglePreviewLine2);
                } else {
                    tL_message.message = LocaleController.getString(R.string.BackgroundPreviewLine2);
                }
                tL_message.date = currentTimeMillis - 3540;
                tL_message.dialog_id = 1L;
                tL_message.flags = 259;
                tL_message.id = 1;
                tL_message.media = new TLRPC.TL_messageMediaEmpty();
                tL_message.out = true;
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_message.from_id = tL_peerUser;
                tL_peerUser.user_id = UserConfig.getInstance(((org.telegram.ui.ActionBar.o2) qc1Var).currentAccount).getClientUserId();
                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                tL_message.peer_id = tL_peerUser2;
                tL_peerUser2.user_id = UserConfig.getInstance(((org.telegram.ui.ActionBar.o2) qc1Var).currentAccount).getClientUserId();
                jc1 jc1Var = new jc1(((org.telegram.ui.ActionBar.o2) qc1Var).currentAccount, tL_message, true, false);
                jc1Var.eventId = 1L;
                jc1Var.resetLayout();
                arrayList.add(jc1Var);
            }
            TLRPC.TL_message tL_message2 = new TLRPC.TL_message();
            TLRPC.Chat chat = qc1Var.F1 < 0 ? qc1Var.getMessagesController().getChat(Long.valueOf(-qc1Var.F1)) : null;
            if (chat != null) {
                tL_message2.message = LocaleController.getString(R.string.ChannelBackgroundMessagePreview);
                TLRPC.TL_message tL_message3 = new TLRPC.TL_message();
                tL_message3.message = LocaleController.getString(R.string.ChannelBackgroundMessageReplyText);
                kc1 kc1Var2 = new kc1(((org.telegram.ui.ActionBar.o2) qc1Var).currentAccount, tL_message3, true, false);
                TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                tL_message2.from_id = tL_peerChannel;
                tL_peerChannel.channel_id = chat.id;
                TLRPC.TL_peerChannel tL_peerChannel2 = new TLRPC.TL_peerChannel();
                tL_message2.peer_id = tL_peerChannel2;
                tL_peerChannel2.channel_id = chat.id;
                kc1Var = kc1Var2;
            } else {
                if (qc1Var.F1 != 0) {
                    tL_message2.message = LocaleController.getString(R.string.BackgroundColorSinglePreviewLine3);
                } else if (qc1Var.x1 instanceof zh1) {
                    tL_message2.message = LocaleController.getString(R.string.BackgroundColorSinglePreviewLine1);
                } else {
                    tL_message2.message = LocaleController.getString(R.string.BackgroundPreviewLine1);
                }
                tL_message2.from_id = new TLRPC.TL_peerUser();
                TLRPC.TL_peerUser tL_peerUser3 = new TLRPC.TL_peerUser();
                tL_message2.peer_id = tL_peerUser3;
                tL_peerUser3.user_id = UserConfig.getInstance(((org.telegram.ui.ActionBar.o2) qc1Var).currentAccount).getClientUserId();
                kc1Var = null;
            }
            int i12 = currentTimeMillis - 3540;
            tL_message2.date = i12;
            tL_message2.dialog_id = 1L;
            tL_message2.flags = 265;
            tL_message2.id = 1;
            tL_message2.media = new TLRPC.TL_messageMediaEmpty();
            tL_message2.out = false;
            lc1 lc1Var = new lc1(((org.telegram.ui.ActionBar.o2) qc1Var).currentAccount, tL_message2, kc1Var, true, false);
            if (kc1Var != null) {
                lc1Var.customReplyName = LocaleController.getString(R.string.ChannelBackgroundMessageReplyName);
            }
            lc1Var.eventId = 1L;
            lc1Var.resetLayout();
            arrayList.add(lc1Var);
            if (qc1Var.F1 == 0 || qc1Var.m0 != null) {
                return;
            }
            TLRPC.User user = qc1Var.getMessagesController().getUser(Long.valueOf(qc1Var.F1));
            TLRPC.TL_message tL_message4 = new TLRPC.TL_message();
            tL_message4.message = "";
            MessageObject messageObject = new MessageObject(((org.telegram.ui.ActionBar.o2) qc1Var).currentAccount, tL_message4, true, false);
            messageObject.eventId = 1L;
            messageObject.contentType = 5;
            arrayList.add(messageObject);
            TLRPC.TL_message tL_message5 = new TLRPC.TL_message();
            if (user != null) {
                tL_message5.message = LocaleController.formatString(R.string.ChatBackgroundHint, UserObject.getFirstName(user));
            } else {
                tL_message5.message = LocaleController.getString(R.string.ChannelBackgroundHint);
            }
            tL_message5.date = i12;
            tL_message5.dialog_id = 1L;
            tL_message5.flags = 265;
            tL_message5.from_id = new TLRPC.TL_peerUser();
            tL_message5.id = 1;
            tL_message5.media = new TLRPC.TL_messageMediaEmpty();
            tL_message5.out = false;
            TLRPC.TL_peerUser tL_peerUser4 = new TLRPC.TL_peerUser();
            tL_message5.peer_id = tL_peerUser4;
            tL_peerUser4.user_id = UserConfig.getInstance(((org.telegram.ui.ActionBar.o2) qc1Var).currentAccount).getClientUserId();
            MessageObject messageObject2 = new MessageObject(((org.telegram.ui.ActionBar.o2) qc1Var).currentAccount, tL_message5, true, false);
            messageObject2.eventId = 1L;
            messageObject2.resetLayout();
            messageObject2.contentType = 1;
            arrayList.add(messageObject2);
            return;
        }
        if (i10 == 1) {
            TLRPC.TL_message tL_message6 = new TLRPC.TL_message();
            TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
            tL_message6.media = tL_messageMediaDocument;
            tL_messageMediaDocument.document = new TLRPC.TL_document();
            TLRPC.Document document = tL_message6.media.document;
            document.mime_type = "audio/mp3";
            document.file_reference = new byte[0];
            document.id = -2147483648L;
            document.size = 2621440L;
            document.dc_id = TLObject.FLAG_31;
            TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
            tL_documentAttributeFilename.file_name = LocaleController.getString(R.string.NewThemePreviewReply2) + ".mp3";
            tL_message6.media.document.attributes.add(tL_documentAttributeFilename);
            int i13 = currentTimeMillis + (-3540);
            tL_message6.date = i13;
            tL_message6.dialog_id = 1L;
            tL_message6.flags = 259;
            TLRPC.TL_peerUser tL_peerUser5 = new TLRPC.TL_peerUser();
            tL_message6.from_id = tL_peerUser5;
            tL_peerUser5.user_id = UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId();
            tL_message6.id = 1;
            tL_message6.out = true;
            TLRPC.TL_peerUser tL_peerUser6 = new TLRPC.TL_peerUser();
            tL_message6.peer_id = tL_peerUser6;
            tL_peerUser6.user_id = 0L;
            MessageObject messageObject3 = new MessageObject(UserConfig.selectedAccount, tL_message6, true, false);
            if (BuildVars.DEBUG_PRIVATE_VERSION) {
                TLRPC.TL_message tL_message7 = new TLRPC.TL_message();
                tL_message7.message = "this is very very long text\nthis is very very long text\nthis is very very long text\nthis is very very long text\nthis is very very long text\nthis is very very long text\nthis is very very long text\nthis is very very long text\nthis is very very long text\nthis is very very long text\nthis is very very long text\nthis is very very long text\nthis is very very long text\nthis is very very long text\nthis is very very long text\nthis is very very long text";
                tL_message7.date = currentTimeMillis - 2640;
                tL_message7.dialog_id = 1L;
                tL_message7.flags = 259;
                TLRPC.TL_peerUser tL_peerUser7 = new TLRPC.TL_peerUser();
                tL_message7.from_id = tL_peerUser7;
                tL_peerUser7.user_id = UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId();
                tL_message7.id = 1;
                tL_message7.media = new TLRPC.TL_messageMediaEmpty();
                tL_message7.out = true;
                TLRPC.TL_peerUser tL_peerUser8 = new TLRPC.TL_peerUser();
                tL_message7.peer_id = tL_peerUser8;
                tL_peerUser8.user_id = 0L;
                MessageObject messageObject4 = new MessageObject(UserConfig.selectedAccount, tL_message7, true, false);
                messageObject4.resetLayout();
                messageObject4.eventId = 1L;
                arrayList.add(messageObject4);
            }
            TLRPC.TL_message tL_message8 = new TLRPC.TL_message();
            String string = LocaleController.getString(R.string.NewThemePreviewLine3);
            StringBuilder sb2 = new StringBuilder(string);
            int indexOf = string.indexOf(42);
            int lastIndexOf = string.lastIndexOf(42);
            if (indexOf != -1 && lastIndexOf != -1) {
                sb2.replace(lastIndexOf, lastIndexOf + 1, "");
                sb2.replace(indexOf, indexOf + 1, "");
                TLRPC.TL_messageEntityTextUrl tL_messageEntityTextUrl = new TLRPC.TL_messageEntityTextUrl();
                tL_messageEntityTextUrl.offset = indexOf;
                tL_messageEntityTextUrl.length = (lastIndexOf - indexOf) - 1;
                tL_messageEntityTextUrl.url = "https://telegram.org";
                tL_message8.entities.add(tL_messageEntityTextUrl);
            }
            tL_message8.message = sb2.toString();
            tL_message8.date = currentTimeMillis - 2640;
            tL_message8.dialog_id = 1L;
            tL_message8.flags = 259;
            TLRPC.TL_peerUser tL_peerUser9 = new TLRPC.TL_peerUser();
            tL_message8.from_id = tL_peerUser9;
            tL_peerUser9.user_id = UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId();
            tL_message8.id = 1;
            tL_message8.media = new TLRPC.TL_messageMediaEmpty();
            tL_message8.out = true;
            TLRPC.TL_peerUser tL_peerUser10 = new TLRPC.TL_peerUser();
            tL_message8.peer_id = tL_peerUser10;
            tL_peerUser10.user_id = 0L;
            MessageObject messageObject5 = new MessageObject(UserConfig.selectedAccount, tL_message8, true, false);
            messageObject5.resetLayout();
            messageObject5.eventId = 1L;
            arrayList.add(messageObject5);
            TLRPC.TL_message tL_message9 = new TLRPC.TL_message();
            tL_message9.message = LocaleController.getString(R.string.NewThemePreviewLine1);
            tL_message9.date = i13;
            tL_message9.dialog_id = 1L;
            tL_message9.flags = 265;
            tL_message9.from_id = new TLRPC.TL_peerUser();
            tL_message9.id = 1;
            TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
            tL_message9.reply_to = tL_messageReplyHeader;
            tL_messageReplyHeader.flags |= 16;
            tL_messageReplyHeader.reply_to_msg_id = 5;
            tL_message9.media = new TLRPC.TL_messageMediaEmpty();
            tL_message9.out = false;
            TLRPC.TL_peerUser tL_peerUser11 = new TLRPC.TL_peerUser();
            tL_message9.peer_id = tL_peerUser11;
            tL_peerUser11.user_id = UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId();
            MessageObject messageObject6 = new MessageObject(UserConfig.selectedAccount, tL_message9, true, false);
            messageObject6.customReplyName = LocaleController.getString(R.string.NewThemePreviewName);
            messageObject5.customReplyName = "Test User";
            messageObject6.eventId = 1L;
            messageObject6.resetLayout();
            messageObject6.replyMessageObject = messageObject3;
            messageObject5.replyMessageObject = messageObject6;
            arrayList.add(messageObject6);
            arrayList.add(messageObject3);
            TLRPC.TL_message tL_message10 = new TLRPC.TL_message();
            tL_message10.date = currentTimeMillis - 3480;
            tL_message10.dialog_id = 1L;
            tL_message10.flags = 259;
            tL_message10.out = false;
            tL_message10.from_id = new TLRPC.TL_peerUser();
            tL_message10.id = 1;
            TLRPC.TL_messageMediaDocument tL_messageMediaDocument2 = new TLRPC.TL_messageMediaDocument();
            tL_message10.media = tL_messageMediaDocument2;
            tL_messageMediaDocument2.flags |= 3;
            tL_messageMediaDocument2.document = new TLRPC.TL_document();
            TLRPC.Document document2 = tL_message10.media.document;
            document2.mime_type = "audio/ogg";
            document2.file_reference = new byte[0];
            TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
            tL_documentAttributeAudio.flags = 1028;
            tL_documentAttributeAudio.duration = 3.0d;
            tL_documentAttributeAudio.voice = true;
            tL_documentAttributeAudio.waveform = new byte[]{0, 4, 17, -50, -93, 86, -103, -45, -12, -26, 63, -25, -3, 109, -114, -54, -4, -1, -1, -1, -1, -29, -1, -1, -25, -1, -1, -97, -43, 57, -57, -108, 1, -91, -4, -47, 21, 99, 10, 97, 43, 45, 115, -112, -77, 51, -63, 66, 40, 34, -122, -116, 48, -124, 16, 66, -120, 16, 68, 16, 33, 4, 1};
            tL_message10.media.document.attributes.add(tL_documentAttributeAudio);
            tL_message10.out = true;
            TLRPC.TL_peerUser tL_peerUser12 = new TLRPC.TL_peerUser();
            tL_message10.peer_id = tL_peerUser12;
            tL_peerUser12.user_id = 0L;
            MessageObject messageObject7 = new MessageObject(((org.telegram.ui.ActionBar.o2) qc1Var).currentAccount, tL_message10, true, false);
            messageObject7.audioProgressSec = 1;
            messageObject7.audioProgress = 0.3f;
            messageObject7.useCustomPhoto = true;
            arrayList.add(messageObject7);
            return;
        }
        if (z10) {
            TLRPC.TL_user tL_user = new TLRPC.TL_user();
            tL_user.id = 2147483647L;
            tL_user.first_name = "Me";
            TLRPC.TL_user tL_user2 = new TLRPC.TL_user();
            tL_user2.id = 2147483646L;
            tL_user2.first_name = "Serj";
            ArrayList<TLRPC.User> arrayList2 = new ArrayList<>();
            arrayList2.add(tL_user);
            arrayList2.add(tL_user2);
            MessagesController.getInstance(((org.telegram.ui.ActionBar.o2) qc1Var).currentAccount).putUsers(arrayList2, true);
            TLRPC.TL_message tL_message11 = new TLRPC.TL_message();
            tL_message11.message = "Guess why Half-Life 3 was never released.";
            int i14 = currentTimeMillis - 2640;
            tL_message11.date = i14;
            tL_message11.dialog_id = -1L;
            tL_message11.flags = 259;
            tL_message11.id = 2147483646;
            tL_message11.media = new TLRPC.TL_messageMediaEmpty();
            tL_message11.out = false;
            TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
            tL_message11.peer_id = tL_peerChat;
            tL_peerChat.chat_id = 1L;
            TLRPC.TL_peerUser tL_peerUser13 = new TLRPC.TL_peerUser();
            tL_message11.from_id = tL_peerUser13;
            tL_peerUser13.user_id = tL_user2.id;
            arrayList.add(new MessageObject(((org.telegram.ui.ActionBar.o2) qc1Var).currentAccount, tL_message11, true, false));
            TLRPC.TL_message tL_message12 = new TLRPC.TL_message();
            tL_message12.message = "No.\nAnd every unnecessary ping of the dev delays the release for 10 days.\nEvery request for ETA delays the release for 2 weeks.";
            tL_message12.date = i14;
            tL_message12.dialog_id = -1L;
            tL_message12.flags = 259;
            tL_message12.id = 1;
            tL_message12.media = new TLRPC.TL_messageMediaEmpty();
            tL_message12.out = false;
            TLRPC.TL_peerChat tL_peerChat2 = new TLRPC.TL_peerChat();
            tL_message12.peer_id = tL_peerChat2;
            tL_peerChat2.chat_id = 1L;
            TLRPC.TL_peerUser tL_peerUser14 = new TLRPC.TL_peerUser();
            tL_message12.from_id = tL_peerUser14;
            tL_peerUser14.user_id = tL_user2.id;
            arrayList.add(new MessageObject(((org.telegram.ui.ActionBar.o2) qc1Var).currentAccount, tL_message12, true, false));
            TLRPC.TL_message tL_message13 = new TLRPC.TL_message();
            tL_message13.message = "Is source code for Android coming anytime soon?";
            tL_message13.date = currentTimeMillis - 3000;
            tL_message13.dialog_id = -1L;
            tL_message13.flags = 259;
            tL_message13.id = 1;
            tL_message13.media = new TLRPC.TL_messageMediaEmpty();
            tL_message13.out = false;
            TLRPC.TL_peerChat tL_peerChat3 = new TLRPC.TL_peerChat();
            tL_message13.peer_id = tL_peerChat3;
            tL_peerChat3.chat_id = 1L;
            TLRPC.TL_peerUser tL_peerUser15 = new TLRPC.TL_peerUser();
            tL_message13.from_id = tL_peerUser15;
            tL_peerUser15.user_id = tL_user.id;
            arrayList.add(new MessageObject(((org.telegram.ui.ActionBar.o2) qc1Var).currentAccount, tL_message13, true, false));
            return;
        }
        TLRPC.TL_message tL_message14 = new TLRPC.TL_message();
        tL_message14.message = LocaleController.getString(R.string.ThemePreviewLine1);
        int i15 = currentTimeMillis - 3540;
        tL_message14.date = i15;
        tL_message14.dialog_id = 1L;
        tL_message14.flags = 259;
        TLRPC.TL_peerUser tL_peerUser16 = new TLRPC.TL_peerUser();
        tL_message14.from_id = tL_peerUser16;
        tL_peerUser16.user_id = UserConfig.getInstance(((org.telegram.ui.ActionBar.o2) qc1Var).currentAccount).getClientUserId();
        tL_message14.id = 1;
        tL_message14.media = new TLRPC.TL_messageMediaEmpty();
        tL_message14.out = true;
        TLRPC.TL_peerUser tL_peerUser17 = new TLRPC.TL_peerUser();
        tL_message14.peer_id = tL_peerUser17;
        tL_peerUser17.user_id = 0L;
        MessageObject messageObject8 = new MessageObject(((org.telegram.ui.ActionBar.o2) qc1Var).currentAccount, tL_message14, true, false);
        TLRPC.TL_message tL_message15 = new TLRPC.TL_message();
        tL_message15.message = LocaleController.getString(R.string.ThemePreviewLine2);
        tL_message15.date = currentTimeMillis - 2640;
        tL_message15.dialog_id = 1L;
        tL_message15.flags = 259;
        TLRPC.TL_peerUser tL_peerUser18 = new TLRPC.TL_peerUser();
        tL_message15.from_id = tL_peerUser18;
        tL_peerUser18.user_id = UserConfig.getInstance(((org.telegram.ui.ActionBar.o2) qc1Var).currentAccount).getClientUserId();
        tL_message15.id = 1;
        tL_message15.media = new TLRPC.TL_messageMediaEmpty();
        tL_message15.out = true;
        TLRPC.TL_peerUser tL_peerUser19 = new TLRPC.TL_peerUser();
        tL_message15.peer_id = tL_peerUser19;
        tL_peerUser19.user_id = 0L;
        arrayList.add(new MessageObject(((org.telegram.ui.ActionBar.o2) qc1Var).currentAccount, tL_message15, true, false));
        TLRPC.TL_message tL_message16 = new TLRPC.TL_message();
        tL_message16.date = currentTimeMillis - 3470;
        tL_message16.dialog_id = 1L;
        tL_message16.flags = 259;
        tL_message16.from_id = new TLRPC.TL_peerUser();
        tL_message16.id = 5;
        TLRPC.TL_messageMediaDocument tL_messageMediaDocument3 = new TLRPC.TL_messageMediaDocument();
        tL_message16.media = tL_messageMediaDocument3;
        tL_messageMediaDocument3.flags |= 3;
        tL_messageMediaDocument3.document = new TLRPC.TL_document();
        TLRPC.Document document3 = tL_message16.media.document;
        document3.mime_type = "audio/mp4";
        document3.file_reference = new byte[0];
        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio2 = new TLRPC.TL_documentAttributeAudio();
        tL_documentAttributeAudio2.duration = 243.0d;
        tL_documentAttributeAudio2.performer = LocaleController.getString(R.string.ThemePreviewSongPerformer);
        tL_documentAttributeAudio2.title = LocaleController.getString(R.string.ThemePreviewSongTitle);
        tL_message16.media.document.attributes.add(tL_documentAttributeAudio2);
        tL_message16.out = false;
        TLRPC.TL_peerUser tL_peerUser20 = new TLRPC.TL_peerUser();
        tL_message16.peer_id = tL_peerUser20;
        tL_peerUser20.user_id = UserConfig.getInstance(((org.telegram.ui.ActionBar.o2) qc1Var).currentAccount).getClientUserId();
        arrayList.add(new MessageObject(((org.telegram.ui.ActionBar.o2) qc1Var).currentAccount, tL_message16, true, false));
        TLRPC.TL_message tL_message17 = new TLRPC.TL_message();
        tL_message17.message = LocaleController.getString(R.string.ThemePreviewLine3);
        tL_message17.date = i15;
        tL_message17.dialog_id = 1L;
        tL_message17.flags = 265;
        tL_message17.from_id = new TLRPC.TL_peerUser();
        tL_message17.id = 1;
        TLRPC.TL_messageReplyHeader tL_messageReplyHeader2 = new TLRPC.TL_messageReplyHeader();
        tL_message17.reply_to = tL_messageReplyHeader2;
        tL_messageReplyHeader2.flags |= 16;
        tL_messageReplyHeader2.reply_to_msg_id = 5;
        tL_message17.media = new TLRPC.TL_messageMediaEmpty();
        tL_message17.out = false;
        TLRPC.TL_peerUser tL_peerUser21 = new TLRPC.TL_peerUser();
        tL_message17.peer_id = tL_peerUser21;
        tL_peerUser21.user_id = UserConfig.getInstance(((org.telegram.ui.ActionBar.o2) qc1Var).currentAccount).getClientUserId();
        MessageObject messageObject9 = new MessageObject(((org.telegram.ui.ActionBar.o2) qc1Var).currentAccount, tL_message17, true, false);
        messageObject9.customReplyName = LocaleController.getString(R.string.ThemePreviewLine3Reply);
        messageObject9.replyMessageObject = messageObject8;
        arrayList.add(messageObject9);
        TLRPC.TL_message tL_message18 = new TLRPC.TL_message();
        tL_message18.date = currentTimeMillis - 3480;
        tL_message18.dialog_id = 1L;
        tL_message18.flags = 259;
        TLRPC.TL_peerUser tL_peerUser22 = new TLRPC.TL_peerUser();
        tL_message18.from_id = tL_peerUser22;
        tL_peerUser22.user_id = UserConfig.getInstance(((org.telegram.ui.ActionBar.o2) qc1Var).currentAccount).getClientUserId();
        tL_message18.id = 1;
        TLRPC.TL_messageMediaDocument tL_messageMediaDocument4 = new TLRPC.TL_messageMediaDocument();
        tL_message18.media = tL_messageMediaDocument4;
        tL_messageMediaDocument4.flags |= 3;
        tL_messageMediaDocument4.document = new TLRPC.TL_document();
        TLRPC.Document document4 = tL_message18.media.document;
        document4.mime_type = "audio/ogg";
        document4.file_reference = new byte[0];
        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio3 = new TLRPC.TL_documentAttributeAudio();
        tL_documentAttributeAudio3.flags = 1028;
        tL_documentAttributeAudio3.duration = 3.0d;
        tL_documentAttributeAudio3.voice = true;
        tL_documentAttributeAudio3.waveform = new byte[]{0, 4, 17, -50, -93, 86, -103, -45, -12, -26, 63, -25, -3, 109, -114, -54, -4, -1, -1, -1, -1, -29, -1, -1, -25, -1, -1, -97, -43, 57, -57, -108, 1, -91, -4, -47, 21, 99, 10, 97, 43, 45, 115, -112, -77, 51, -63, 66, 40, 34, -122, -116, 48, -124, 16, 66, -120, 16, 68, 16, 33, 4, 1};
        tL_message18.media.document.attributes.add(tL_documentAttributeAudio3);
        tL_message18.out = true;
        TLRPC.TL_peerUser tL_peerUser23 = new TLRPC.TL_peerUser();
        tL_message18.peer_id = tL_peerUser23;
        tL_peerUser23.user_id = 0L;
        MessageObject messageObject10 = new MessageObject(((org.telegram.ui.ActionBar.o2) qc1Var).currentAccount, tL_message18, true, false);
        messageObject10.audioProgressSec = 1;
        messageObject10.audioProgress = 0.3f;
        messageObject10.useCustomPhoto = true;
        arrayList.add(messageObject10);
        arrayList.add(messageObject8);
        TLRPC.TL_message tL_message19 = new TLRPC.TL_message();
        tL_message19.date = currentTimeMillis - 3590;
        tL_message19.dialog_id = 1L;
        tL_message19.flags = 257;
        tL_message19.from_id = new TLRPC.TL_peerUser();
        tL_message19.id = 1;
        TLRPC.TL_messageMediaPhoto tL_messageMediaPhoto = new TLRPC.TL_messageMediaPhoto();
        tL_message19.media = tL_messageMediaPhoto;
        tL_messageMediaPhoto.flags |= 3;
        tL_messageMediaPhoto.photo = new TLRPC.TL_photo();
        TLRPC.Photo photo = tL_message19.media.photo;
        photo.file_reference = new byte[0];
        photo.has_stickers = false;
        photo.id = 1L;
        photo.access_hash = 0L;
        photo.date = i11;
        TLRPC.TL_photoSize tL_photoSize = new TLRPC.TL_photoSize();
        tL_photoSize.size = 0;
        tL_photoSize.w = 500;
        tL_photoSize.h = 302;
        tL_photoSize.type = "s";
        tL_photoSize.location = new TLRPC.TL_fileLocationUnavailable();
        tL_message19.media.photo.sizes.add(tL_photoSize);
        tL_message19.message = LocaleController.getString(R.string.ThemePreviewLine4);
        tL_message19.out = false;
        TLRPC.TL_peerUser tL_peerUser24 = new TLRPC.TL_peerUser();
        tL_message19.peer_id = tL_peerUser24;
        tL_peerUser24.user_id = UserConfig.getInstance(((org.telegram.ui.ActionBar.o2) qc1Var).currentAccount).getClientUserId();
        MessageObject messageObject11 = new MessageObject(((org.telegram.ui.ActionBar.o2) qc1Var).currentAccount, tL_message19, true, false);
        messageObject11.useCustomPhoto = true;
        arrayList.add(messageObject11);
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        return false;
    }

    public final boolean F() {
        qc1 qc1Var = this.f;
        int i10 = qc1Var.b;
        if (qc1Var.v0 == null || i10 != 1 || qc1Var.n != 3 || qc1Var.s.g == 0) {
            if (qc1Var.u0 == null) {
                return false;
            }
            if (i10 != 2 && (i10 != 1 || qc1Var.n != 2)) {
                return false;
            }
        }
        return true;
    }

    @Override // f2.p0
    public final int h() {
        int size = this.d.size();
        return F() ? size + 1 : size;
    }

    @Override // f2.p0
    public final int j(int i10) {
        if (F()) {
            if (i10 == 0) {
                return this.f.n == 3 ? 3 : 2;
            }
            i10--;
        }
        if (i10 < 0) {
            return 4;
        }
        ArrayList arrayList = this.d;
        if (i10 < arrayList.size()) {
            return ((MessageObject) arrayList.get(i10)).contentType;
        }
        return 4;
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        boolean z10;
        boolean z11;
        int i11 = n1Var.f;
        if (i11 == 2 || i11 == 3) {
            return;
        }
        if (F()) {
            i10--;
        }
        ArrayList arrayList = this.d;
        MessageObject messageObject = (MessageObject) arrayList.get(i10);
        View view = n1Var.a;
        boolean z12 = view instanceof org.telegram.ui.Cells.s1;
        qc1 qc1Var = this.f;
        if (!z12) {
            if (view instanceof org.telegram.ui.Cells.v0) {
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) view;
                v0Var.setMessageObject(messageObject);
                v0Var.setAlpha(1.0f);
                qc1Var.V0();
                return;
            }
            return;
        }
        org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
        s1Var.J7 = false;
        int i12 = i10 - 1;
        int j10 = j(i12);
        int i13 = i10 + 1;
        int j11 = j(i13);
        if (!(messageObject.messageOwner.reply_markup instanceof TLRPC.TL_replyInlineMarkup) && j10 == n1Var.f) {
            MessageObject messageObject2 = (MessageObject) arrayList.get(i12);
            if (messageObject2.isOutOwner() == messageObject.isOutOwner() && Math.abs(messageObject2.messageOwner.date - messageObject.messageOwner.date) <= 300) {
                z10 = true;
                if (j11 == n1Var.f || i13 >= arrayList.size()) {
                    z11 = false;
                } else {
                    MessageObject messageObject3 = (MessageObject) arrayList.get(i13);
                    z11 = !(messageObject3.messageOwner.reply_markup instanceof TLRPC.TL_replyInlineMarkup) && messageObject3.isOutOwner() == messageObject.isOutOwner() && Math.abs(messageObject3.messageOwner.date - messageObject.messageOwner.date) <= 300;
                }
                s1Var.J7 = !this.e || qc1Var.F1 < 0;
                s1Var.setFullyDraw(true);
                s1Var.X3(messageObject, null, z10, z11, false, false);
            }
        }
        z10 = false;
        if (j11 == n1Var.f) {
        }
        z11 = false;
        s1Var.J7 = !this.e || qc1Var.F1 < 0;
        s1Var.setFullyDraw(true);
        s1Var.X3(messageObject, null, z10, z11, false, false);
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        View view;
        qc1 qc1Var = this.f;
        if (i10 == 0) {
            org.telegram.ui.Cells.s1 s1Var = new org.telegram.ui.Cells.s1(this.c, ((org.telegram.ui.ActionBar.o2) qc1Var).currentAccount, false, null, new fv0(this, 5));
            s1Var.setDelegate(new x9.d(18));
            view = s1Var;
        } else {
            Context context = this.c;
            if (i10 == 1) {
                org.telegram.ui.Cells.v0 v0Var = new org.telegram.ui.Cells.v0(context, qc1Var.a, false);
                v0Var.setDelegate(new ya.a(18));
                view = v0Var;
            } else if (i10 == 2) {
                if (qc1Var.u0.getParent() != null) {
                    ((ViewGroup) qc1Var.u0.getParent()).removeView(qc1Var.u0);
                }
                n31 n31Var = new n31(context, 4);
                n31Var.addView(qc1Var.u0, i7.f6.e(-1, 76, 17));
                view = n31Var;
            } else if (i10 == 5) {
                view = new org.telegram.ui.Components.fn(qc1Var.getParentActivity(), 24);
            } else {
                if (qc1Var.v0.getParent() != null) {
                    ((ViewGroup) qc1Var.v0.getParent()).removeView(qc1Var.v0);
                }
                n31 n31Var2 = new n31(context, 5);
                n31Var2.addView(qc1Var.v0, i7.f6.e(-1, 76, 17));
                view = n31Var2;
            }
        }
        return th.m(view, view, -1, -2);
    }
}
