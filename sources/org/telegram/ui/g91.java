package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class g91 extends org.telegram.ui.Components.tk0 {
    public final Context c;
    public final ArrayList d;
    public final boolean e;
    public final /* synthetic */ k91 f;

    public g91(Context context, k91 k91Var) {
        e91 e91Var;
        this.f = k91Var;
        int i10 = k91Var.b;
        boolean z10 = i10 == 0 && Utilities.b.nextInt(100) <= 1;
        this.e = z10;
        this.c = context;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        int i11 = currentTimeMillis - 3600;
        if (i10 == 2) {
            if (k91Var.K1 >= 0) {
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                if (k91Var.C1 instanceof ke1) {
                    tL_message.message = org.telegram.messenger.dd.L0(2131753747, null);
                } else {
                    tL_message.message = org.telegram.messenger.dd.L0(2131753739, null);
                }
                tL_message.date = currentTimeMillis - 3540;
                tL_message.dialog_id = 1L;
                tL_message.flags = org.telegram.messenger.at.i4;
                tL_message.id = 1;
                tL_message.media = new TLRPC.TL_messageMediaEmpty();
                tL_message.out = true;
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_message.from_id = tL_peerUser;
                tL_peerUser.user_id = org.telegram.messenger.e20.i(((org.telegram.ui.ActionBar.k2) k91Var).currentAccount).e();
                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                tL_message.peer_id = tL_peerUser2;
                tL_peerUser2.user_id = org.telegram.messenger.e20.i(((org.telegram.ui.ActionBar.k2) k91Var).currentAccount).e();
                d91 d91Var = new d91(((org.telegram.ui.ActionBar.k2) k91Var).currentAccount, tL_message, true, false);
                d91Var.T = 1L;
                d91Var.Q1 = false;
                arrayList.add(d91Var);
            }
            TLRPC.TL_message tL_message2 = new TLRPC.TL_message();
            TLRPC.Chat L0 = k91Var.K1 < 0 ? k91Var.getMessagesController().L0(Long.valueOf(-k91Var.K1)) : null;
            if (L0 != null) {
                tL_message2.message = org.telegram.messenger.dd.L0(2131752456, null);
                TLRPC.TL_message tL_message3 = new TLRPC.TL_message();
                tL_message3.message = org.telegram.messenger.dd.L0(2131752454, null);
                e91 e91Var2 = new e91(((org.telegram.ui.ActionBar.k2) k91Var).currentAccount, tL_message3, true, false);
                TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                tL_message2.from_id = tL_peerChannel;
                tL_peerChannel.channel_id = L0.id;
                TLRPC.TL_peerChannel tL_peerChannel2 = new TLRPC.TL_peerChannel();
                tL_message2.peer_id = tL_peerChannel2;
                tL_peerChannel2.channel_id = L0.id;
                e91Var = e91Var2;
            } else {
                if (k91Var.K1 != 0) {
                    tL_message2.message = org.telegram.messenger.dd.L0(2131753746, null);
                } else if (k91Var.C1 instanceof ke1) {
                    tL_message2.message = org.telegram.messenger.dd.L0(2131753748, null);
                } else {
                    tL_message2.message = org.telegram.messenger.dd.L0(2131753740, null);
                }
                tL_message2.from_id = new TLRPC.TL_peerUser();
                TLRPC.TL_peerUser tL_peerUser3 = new TLRPC.TL_peerUser();
                tL_message2.peer_id = tL_peerUser3;
                tL_peerUser3.user_id = org.telegram.messenger.e20.i(((org.telegram.ui.ActionBar.k2) k91Var).currentAccount).e();
                e91Var = null;
            }
            int i12 = currentTimeMillis - 3540;
            tL_message2.date = i12;
            tL_message2.dialog_id = 1L;
            tL_message2.flags = org.telegram.messenger.at.o4;
            tL_message2.id = 1;
            tL_message2.media = new TLRPC.TL_messageMediaEmpty();
            tL_message2.out = false;
            f91 f91Var = new f91(((org.telegram.ui.ActionBar.k2) k91Var).currentAccount, tL_message2, e91Var, true, false);
            if (e91Var != null) {
                f91Var.B0 = org.telegram.messenger.dd.L0(2131752455, null);
            }
            f91Var.T = 1L;
            f91Var.Q1 = false;
            arrayList.add(f91Var);
            if (k91Var.K1 == 0 || k91Var.r0 != null) {
                return;
            }
            TLRPC.User Z1 = k91Var.getMessagesController().Z1(Long.valueOf(k91Var.K1));
            TLRPC.TL_message tL_message4 = new TLRPC.TL_message();
            tL_message4.message = "";
            org.telegram.messenger.kj kjVar = new org.telegram.messenger.kj(((org.telegram.ui.ActionBar.k2) k91Var).currentAccount, tL_message4, true, false);
            kjVar.T = 1L;
            kjVar.U = 5;
            arrayList.add(kjVar);
            TLRPC.TL_message tL_message5 = new TLRPC.TL_message();
            if (Z1 != null) {
                tL_message5.message = org.telegram.messenger.dd.a0(null, null, 2131752243, org.telegram.messenger.i20.j(Z1, true));
            } else {
                tL_message5.message = org.telegram.messenger.dd.L0(2131752457, null);
            }
            tL_message5.date = i12;
            tL_message5.dialog_id = 1L;
            tL_message5.flags = org.telegram.messenger.at.o4;
            tL_message5.from_id = new TLRPC.TL_peerUser();
            tL_message5.id = 1;
            tL_message5.media = new TLRPC.TL_messageMediaEmpty();
            tL_message5.out = false;
            TLRPC.TL_peerUser tL_peerUser4 = new TLRPC.TL_peerUser();
            tL_message5.peer_id = tL_peerUser4;
            tL_peerUser4.user_id = org.telegram.messenger.e20.i(((org.telegram.ui.ActionBar.k2) k91Var).currentAccount).e();
            org.telegram.messenger.kj kjVar2 = new org.telegram.messenger.kj(((org.telegram.ui.ActionBar.k2) k91Var).currentAccount, tL_message5, true, false);
            kjVar2.T = 1L;
            kjVar2.Q1 = false;
            kjVar2.U = 1;
            arrayList.add(kjVar2);
            return;
        }
        boolean z11 = z10;
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
            tL_documentAttributeFilename.file_name = org.telegram.messenger.dd.L0(2131748270, null) + ".mp3";
            tL_message6.media.document.attributes.add(tL_documentAttributeFilename);
            int i13 = currentTimeMillis + (-3540);
            tL_message6.date = i13;
            tL_message6.dialog_id = 1L;
            tL_message6.flags = org.telegram.messenger.at.i4;
            TLRPC.TL_peerUser tL_peerUser5 = new TLRPC.TL_peerUser();
            tL_message6.from_id = tL_peerUser5;
            tL_peerUser5.user_id = org.telegram.messenger.e20.i(org.telegram.messenger.e20.s0).e();
            tL_message6.id = 1;
            tL_message6.out = true;
            TLRPC.TL_peerUser tL_peerUser6 = new TLRPC.TL_peerUser();
            tL_message6.peer_id = tL_peerUser6;
            tL_peerUser6.user_id = 0L;
            org.telegram.messenger.kj kjVar3 = new org.telegram.messenger.kj(org.telegram.messenger.e20.s0, tL_message6, true, false);
            boolean z12 = org.telegram.messenger.v2.a;
            TLRPC.TL_message tL_message7 = new TLRPC.TL_message();
            String L02 = org.telegram.messenger.dd.L0(2131748273, null);
            StringBuilder sb2 = new StringBuilder(L02);
            int indexOf = L02.indexOf(42);
            int lastIndexOf = L02.lastIndexOf(42);
            if (indexOf != -1 && lastIndexOf != -1) {
                sb2.replace(lastIndexOf, lastIndexOf + 1, "");
                sb2.replace(indexOf, indexOf + 1, "");
                TLRPC.TL_messageEntityTextUrl tL_messageEntityTextUrl = new TLRPC.TL_messageEntityTextUrl();
                tL_messageEntityTextUrl.offset = indexOf;
                tL_messageEntityTextUrl.length = (lastIndexOf - indexOf) - 1;
                tL_messageEntityTextUrl.url = "https://telegram.org";
                tL_message7.entities.add(tL_messageEntityTextUrl);
            }
            tL_message7.message = sb2.toString();
            tL_message7.date = currentTimeMillis - 2640;
            tL_message7.dialog_id = 1L;
            tL_message7.flags = org.telegram.messenger.at.i4;
            TLRPC.TL_peerUser tL_peerUser7 = new TLRPC.TL_peerUser();
            tL_message7.from_id = tL_peerUser7;
            tL_peerUser7.user_id = org.telegram.messenger.e20.i(org.telegram.messenger.e20.s0).e();
            tL_message7.id = 1;
            tL_message7.media = new TLRPC.TL_messageMediaEmpty();
            tL_message7.out = true;
            TLRPC.TL_peerUser tL_peerUser8 = new TLRPC.TL_peerUser();
            tL_message7.peer_id = tL_peerUser8;
            tL_peerUser8.user_id = 0L;
            org.telegram.messenger.kj kjVar4 = new org.telegram.messenger.kj(org.telegram.messenger.e20.s0, tL_message7, true, false);
            kjVar4.Q1 = false;
            kjVar4.T = 1L;
            arrayList.add(kjVar4);
            TLRPC.TL_message tL_message8 = new TLRPC.TL_message();
            tL_message8.message = org.telegram.messenger.dd.L0(2131748274, null);
            tL_message8.date = i13;
            tL_message8.dialog_id = 1L;
            tL_message8.flags = org.telegram.messenger.at.o4;
            tL_message8.from_id = new TLRPC.TL_peerUser();
            tL_message8.id = 1;
            TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
            tL_message8.reply_to = tL_messageReplyHeader;
            tL_messageReplyHeader.flags |= 16;
            tL_messageReplyHeader.reply_to_msg_id = 5;
            tL_message8.media = new TLRPC.TL_messageMediaEmpty();
            tL_message8.out = false;
            TLRPC.TL_peerUser tL_peerUser9 = new TLRPC.TL_peerUser();
            tL_message8.peer_id = tL_peerUser9;
            tL_peerUser9.user_id = org.telegram.messenger.e20.i(org.telegram.messenger.e20.s0).e();
            org.telegram.messenger.kj kjVar5 = new org.telegram.messenger.kj(org.telegram.messenger.e20.s0, tL_message8, true, false);
            kjVar5.B0 = org.telegram.messenger.dd.L0(2131748272, null);
            kjVar4.B0 = "Test User";
            kjVar5.T = 1L;
            kjVar5.Q1 = false;
            kjVar5.C = kjVar3;
            kjVar4.C = kjVar5;
            arrayList.add(kjVar5);
            arrayList.add(kjVar3);
            TLRPC.TL_message tL_message9 = new TLRPC.TL_message();
            tL_message9.date = currentTimeMillis - 3480;
            tL_message9.dialog_id = 1L;
            tL_message9.flags = org.telegram.messenger.at.i4;
            tL_message9.out = false;
            tL_message9.from_id = new TLRPC.TL_peerUser();
            tL_message9.id = 1;
            TLRPC.TL_messageMediaDocument tL_messageMediaDocument2 = new TLRPC.TL_messageMediaDocument();
            tL_message9.media = tL_messageMediaDocument2;
            tL_messageMediaDocument2.flags |= 3;
            tL_messageMediaDocument2.document = new TLRPC.TL_document();
            TLRPC.Document document2 = tL_message9.media.document;
            document2.mime_type = "audio/ogg";
            document2.file_reference = new byte[0];
            TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
            tL_documentAttributeAudio.flags = 1028;
            tL_documentAttributeAudio.duration = 3.0d;
            tL_documentAttributeAudio.voice = true;
            tL_documentAttributeAudio.waveform = new byte[]{0, 4, 17, -50, -93, 86, -103, -45, -12, -26, 63, -25, -3, 109, -114, -54, -4, -1, -1, -1, -1, -29, -1, -1, -25, -1, -1, -97, -43, 57, -57, -108, 1, -91, -4, -47, 21, 99, 10, 97, 43, 45, 115, -112, -77, 51, -63, 66, 40, 34, -122, -116, 48, -124, 16, 66, -120, 16, 68, 16, 33, 4, 1};
            tL_message9.media.document.attributes.add(tL_documentAttributeAudio);
            tL_message9.out = true;
            TLRPC.TL_peerUser tL_peerUser10 = new TLRPC.TL_peerUser();
            tL_message9.peer_id = tL_peerUser10;
            tL_peerUser10.user_id = 0L;
            org.telegram.messenger.kj kjVar6 = new org.telegram.messenger.kj(((org.telegram.ui.ActionBar.k2) k91Var).currentAccount, tL_message9, true, false);
            kjVar6.g0 = 1;
            kjVar6.b0 = 0.3f;
            kjVar6.C0 = true;
            arrayList.add(kjVar6);
            return;
        }
        if (z11) {
            TLRPC.TL_user tL_user = new TLRPC.TL_user();
            tL_user.id = 2147483647L;
            tL_user.first_name = "Me";
            TLRPC.TL_user tL_user2 = new TLRPC.TL_user();
            tL_user2.id = 2147483646L;
            tL_user2.first_name = "Serj";
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(tL_user);
            arrayList2.add(tL_user2);
            org.telegram.messenger.wp.r1(((org.telegram.ui.ActionBar.k2) k91Var).currentAccount).V3(arrayList2, true);
            TLRPC.TL_message tL_message10 = new TLRPC.TL_message();
            tL_message10.message = "Guess why Half-Life 3 was never released.";
            int i14 = currentTimeMillis - 2640;
            tL_message10.date = i14;
            tL_message10.dialog_id = -1L;
            tL_message10.flags = org.telegram.messenger.at.i4;
            tL_message10.id = 2147483646;
            tL_message10.media = new TLRPC.TL_messageMediaEmpty();
            tL_message10.out = false;
            TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
            tL_message10.peer_id = tL_peerChat;
            tL_peerChat.chat_id = 1L;
            TLRPC.TL_peerUser tL_peerUser11 = new TLRPC.TL_peerUser();
            tL_message10.from_id = tL_peerUser11;
            tL_peerUser11.user_id = tL_user2.id;
            arrayList.add(new org.telegram.messenger.kj(((org.telegram.ui.ActionBar.k2) k91Var).currentAccount, tL_message10, true, false));
            TLRPC.TL_message tL_message11 = new TLRPC.TL_message();
            tL_message11.message = "No.\nAnd every unnecessary ping of the dev delays the release for 10 days.\nEvery request for ETA delays the release for 2 weeks.";
            tL_message11.date = i14;
            tL_message11.dialog_id = -1L;
            tL_message11.flags = org.telegram.messenger.at.i4;
            tL_message11.id = 1;
            tL_message11.media = new TLRPC.TL_messageMediaEmpty();
            tL_message11.out = false;
            TLRPC.TL_peerChat tL_peerChat2 = new TLRPC.TL_peerChat();
            tL_message11.peer_id = tL_peerChat2;
            tL_peerChat2.chat_id = 1L;
            TLRPC.TL_peerUser tL_peerUser12 = new TLRPC.TL_peerUser();
            tL_message11.from_id = tL_peerUser12;
            tL_peerUser12.user_id = tL_user2.id;
            arrayList.add(new org.telegram.messenger.kj(((org.telegram.ui.ActionBar.k2) k91Var).currentAccount, tL_message11, true, false));
            TLRPC.TL_message tL_message12 = new TLRPC.TL_message();
            tL_message12.message = "Is source code for Android coming anytime soon?";
            tL_message12.date = currentTimeMillis - 3000;
            tL_message12.dialog_id = -1L;
            tL_message12.flags = org.telegram.messenger.at.i4;
            tL_message12.id = 1;
            tL_message12.media = new TLRPC.TL_messageMediaEmpty();
            tL_message12.out = false;
            TLRPC.TL_peerChat tL_peerChat3 = new TLRPC.TL_peerChat();
            tL_message12.peer_id = tL_peerChat3;
            tL_peerChat3.chat_id = 1L;
            TLRPC.TL_peerUser tL_peerUser13 = new TLRPC.TL_peerUser();
            tL_message12.from_id = tL_peerUser13;
            tL_peerUser13.user_id = tL_user.id;
            arrayList.add(new org.telegram.messenger.kj(((org.telegram.ui.ActionBar.k2) k91Var).currentAccount, tL_message12, true, false));
            return;
        }
        TLRPC.TL_message tL_message13 = new TLRPC.TL_message();
        tL_message13.message = org.telegram.messenger.dd.L0(2131744180, null);
        int i15 = currentTimeMillis - 3540;
        tL_message13.date = i15;
        tL_message13.dialog_id = 1L;
        tL_message13.flags = org.telegram.messenger.at.i4;
        TLRPC.TL_peerUser tL_peerUser14 = new TLRPC.TL_peerUser();
        tL_message13.from_id = tL_peerUser14;
        tL_peerUser14.user_id = org.telegram.messenger.e20.i(((org.telegram.ui.ActionBar.k2) k91Var).currentAccount).e();
        tL_message13.id = 1;
        tL_message13.media = new TLRPC.TL_messageMediaEmpty();
        tL_message13.out = true;
        TLRPC.TL_peerUser tL_peerUser15 = new TLRPC.TL_peerUser();
        tL_message13.peer_id = tL_peerUser15;
        tL_peerUser15.user_id = 0L;
        org.telegram.messenger.kj kjVar7 = new org.telegram.messenger.kj(((org.telegram.ui.ActionBar.k2) k91Var).currentAccount, tL_message13, true, false);
        TLRPC.TL_message tL_message14 = new TLRPC.TL_message();
        tL_message14.message = org.telegram.messenger.dd.L0(2131744179, null);
        tL_message14.date = currentTimeMillis - 2640;
        tL_message14.dialog_id = 1L;
        tL_message14.flags = org.telegram.messenger.at.i4;
        TLRPC.TL_peerUser tL_peerUser16 = new TLRPC.TL_peerUser();
        tL_message14.from_id = tL_peerUser16;
        tL_peerUser16.user_id = org.telegram.messenger.e20.i(((org.telegram.ui.ActionBar.k2) k91Var).currentAccount).e();
        tL_message14.id = 1;
        tL_message14.media = new TLRPC.TL_messageMediaEmpty();
        tL_message14.out = true;
        TLRPC.TL_peerUser tL_peerUser17 = new TLRPC.TL_peerUser();
        tL_message14.peer_id = tL_peerUser17;
        tL_peerUser17.user_id = 0L;
        arrayList.add(new org.telegram.messenger.kj(((org.telegram.ui.ActionBar.k2) k91Var).currentAccount, tL_message14, true, false));
        TLRPC.TL_message tL_message15 = new TLRPC.TL_message();
        tL_message15.date = currentTimeMillis - 3470;
        tL_message15.dialog_id = 1L;
        tL_message15.flags = org.telegram.messenger.at.i4;
        tL_message15.from_id = new TLRPC.TL_peerUser();
        tL_message15.id = 5;
        TLRPC.TL_messageMediaDocument tL_messageMediaDocument3 = new TLRPC.TL_messageMediaDocument();
        tL_message15.media = tL_messageMediaDocument3;
        tL_messageMediaDocument3.flags |= 3;
        tL_messageMediaDocument3.document = new TLRPC.TL_document();
        TLRPC.Document document3 = tL_message15.media.document;
        document3.mime_type = "audio/mp4";
        document3.file_reference = new byte[0];
        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio2 = new TLRPC.TL_documentAttributeAudio();
        tL_documentAttributeAudio2.duration = 243.0d;
        tL_documentAttributeAudio2.performer = org.telegram.messenger.dd.L0(2131744175, null);
        tL_documentAttributeAudio2.title = org.telegram.messenger.dd.L0(2131744174, null);
        tL_message15.media.document.attributes.add(tL_documentAttributeAudio2);
        tL_message15.out = false;
        TLRPC.TL_peerUser tL_peerUser18 = new TLRPC.TL_peerUser();
        tL_message15.peer_id = tL_peerUser18;
        tL_peerUser18.user_id = org.telegram.messenger.e20.i(((org.telegram.ui.ActionBar.k2) k91Var).currentAccount).e();
        arrayList.add(new org.telegram.messenger.kj(((org.telegram.ui.ActionBar.k2) k91Var).currentAccount, tL_message15, true, false));
        TLRPC.TL_message tL_message16 = new TLRPC.TL_message();
        tL_message16.message = org.telegram.messenger.dd.L0(2131744178, null);
        tL_message16.date = i15;
        tL_message16.dialog_id = 1L;
        tL_message16.flags = org.telegram.messenger.at.o4;
        tL_message16.from_id = new TLRPC.TL_peerUser();
        tL_message16.id = 1;
        TLRPC.TL_messageReplyHeader tL_messageReplyHeader2 = new TLRPC.TL_messageReplyHeader();
        tL_message16.reply_to = tL_messageReplyHeader2;
        tL_messageReplyHeader2.flags |= 16;
        tL_messageReplyHeader2.reply_to_msg_id = 5;
        tL_message16.media = new TLRPC.TL_messageMediaEmpty();
        tL_message16.out = false;
        TLRPC.TL_peerUser tL_peerUser19 = new TLRPC.TL_peerUser();
        tL_message16.peer_id = tL_peerUser19;
        tL_peerUser19.user_id = org.telegram.messenger.e20.i(((org.telegram.ui.ActionBar.k2) k91Var).currentAccount).e();
        org.telegram.messenger.kj kjVar8 = new org.telegram.messenger.kj(((org.telegram.ui.ActionBar.k2) k91Var).currentAccount, tL_message16, true, false);
        kjVar8.B0 = org.telegram.messenger.dd.L0(2131744177, null);
        kjVar8.C = kjVar7;
        arrayList.add(kjVar8);
        TLRPC.TL_message tL_message17 = new TLRPC.TL_message();
        tL_message17.date = currentTimeMillis - 3480;
        tL_message17.dialog_id = 1L;
        tL_message17.flags = org.telegram.messenger.at.i4;
        TLRPC.TL_peerUser tL_peerUser20 = new TLRPC.TL_peerUser();
        tL_message17.from_id = tL_peerUser20;
        tL_peerUser20.user_id = org.telegram.messenger.e20.i(((org.telegram.ui.ActionBar.k2) k91Var).currentAccount).e();
        tL_message17.id = 1;
        TLRPC.TL_messageMediaDocument tL_messageMediaDocument4 = new TLRPC.TL_messageMediaDocument();
        tL_message17.media = tL_messageMediaDocument4;
        tL_messageMediaDocument4.flags |= 3;
        tL_messageMediaDocument4.document = new TLRPC.TL_document();
        TLRPC.Document document4 = tL_message17.media.document;
        document4.mime_type = "audio/ogg";
        document4.file_reference = new byte[0];
        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio3 = new TLRPC.TL_documentAttributeAudio();
        tL_documentAttributeAudio3.flags = 1028;
        tL_documentAttributeAudio3.duration = 3.0d;
        tL_documentAttributeAudio3.voice = true;
        tL_documentAttributeAudio3.waveform = new byte[]{0, 4, 17, -50, -93, 86, -103, -45, -12, -26, 63, -25, -3, 109, -114, -54, -4, -1, -1, -1, -1, -29, -1, -1, -25, -1, -1, -97, -43, 57, -57, -108, 1, -91, -4, -47, 21, 99, 10, 97, 43, 45, 115, -112, -77, 51, -63, 66, 40, 34, -122, -116, 48, -124, 16, 66, -120, 16, 68, 16, 33, 4, 1};
        tL_message17.media.document.attributes.add(tL_documentAttributeAudio3);
        tL_message17.out = true;
        TLRPC.TL_peerUser tL_peerUser21 = new TLRPC.TL_peerUser();
        tL_message17.peer_id = tL_peerUser21;
        tL_peerUser21.user_id = 0L;
        org.telegram.messenger.kj kjVar9 = new org.telegram.messenger.kj(((org.telegram.ui.ActionBar.k2) k91Var).currentAccount, tL_message17, true, false);
        kjVar9.g0 = 1;
        kjVar9.b0 = 0.3f;
        kjVar9.C0 = true;
        arrayList.add(kjVar9);
        arrayList.add(kjVar7);
        TLRPC.TL_message tL_message18 = new TLRPC.TL_message();
        tL_message18.date = currentTimeMillis - 3590;
        tL_message18.dialog_id = 1L;
        tL_message18.flags = org.telegram.messenger.at.g4;
        tL_message18.from_id = new TLRPC.TL_peerUser();
        tL_message18.id = 1;
        TLRPC.TL_messageMediaPhoto tL_messageMediaPhoto = new TLRPC.TL_messageMediaPhoto();
        tL_message18.media = tL_messageMediaPhoto;
        tL_messageMediaPhoto.flags |= 3;
        tL_messageMediaPhoto.photo = new TLRPC.TL_photo();
        TLRPC.Photo photo = tL_message18.media.photo;
        photo.file_reference = new byte[0];
        photo.has_stickers = false;
        photo.id = 1L;
        photo.access_hash = 0L;
        photo.date = i11;
        TLRPC.TL_photoSize tL_photoSize = new TLRPC.TL_photoSize();
        tL_photoSize.size = 0;
        tL_photoSize.w = 500;
        tL_photoSize.h = org.telegram.messenger.at.Z4;
        tL_photoSize.type = "s";
        tL_photoSize.location = new TLRPC.TL_fileLocationUnavailable();
        tL_message18.media.photo.sizes.add(tL_photoSize);
        tL_message18.message = org.telegram.messenger.dd.L0(2131744176, null);
        tL_message18.out = false;
        TLRPC.TL_peerUser tL_peerUser22 = new TLRPC.TL_peerUser();
        tL_message18.peer_id = tL_peerUser22;
        tL_peerUser22.user_id = org.telegram.messenger.e20.i(((org.telegram.ui.ActionBar.k2) k91Var).currentAccount).e();
        org.telegram.messenger.kj kjVar10 = new org.telegram.messenger.kj(((org.telegram.ui.ActionBar.k2) k91Var).currentAccount, tL_message18, true, false);
        kjVar10.C0 = true;
        arrayList.add(kjVar10);
    }

    @Override // org.telegram.ui.Components.tk0
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    public final boolean F() {
        k91 k91Var = this.f;
        int i10 = k91Var.b;
        if (k91Var.A0 == null || i10 != 1 || k91Var.n != 3 || k91Var.w.g == 0) {
            if (k91Var.z0 == null) {
                return false;
            }
            if (i10 != 2 && (i10 != 1 || k91Var.n != 2)) {
                return false;
            }
        }
        return true;
    }

    @Override // s4.g0
    public final int b() {
        int size = this.d.size();
        return F() ? size + 1 : size;
    }

    @Override // s4.g0
    public final int d(int i10) {
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
            return ((org.telegram.messenger.kj) arrayList.get(i10)).U;
        }
        return 4;
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        boolean z10;
        boolean z11;
        int i11 = c1Var.f;
        if (i11 == 2 || i11 == 3) {
            return;
        }
        if (F()) {
            i10--;
        }
        ArrayList arrayList = this.d;
        org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) arrayList.get(i10);
        View view = c1Var.a;
        boolean z12 = view instanceof org.telegram.ui.Cells.q1;
        k91 k91Var = this.f;
        if (!z12) {
            if (view instanceof org.telegram.ui.Cells.s0) {
                org.telegram.ui.Cells.s0 s0Var = (org.telegram.ui.Cells.s0) view;
                s0Var.setMessageObject(kjVar);
                s0Var.setAlpha(1.0f);
                k91Var.a1();
                return;
            }
            return;
        }
        org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
        q1Var.d6 = false;
        int i12 = i10 - 1;
        int d = d(i12);
        int i13 = i10 + 1;
        int d10 = d(i13);
        if (!(kjVar.k.reply_markup instanceof TLRPC.TL_replyInlineMarkup) && d == c1Var.f) {
            org.telegram.messenger.kj kjVar2 = (org.telegram.messenger.kj) arrayList.get(i12);
            if (kjVar2.P3() == kjVar.P3() && Math.abs(kjVar2.k.date - kjVar.k.date) <= 300) {
                z10 = true;
                if (d10 == c1Var.f || i13 >= arrayList.size()) {
                    z11 = false;
                } else {
                    org.telegram.messenger.kj kjVar3 = (org.telegram.messenger.kj) arrayList.get(i13);
                    z11 = !(kjVar3.k.reply_markup instanceof TLRPC.TL_replyInlineMarkup) && kjVar3.P3() == kjVar.P3() && Math.abs(kjVar3.k.date - kjVar.k.date) <= 300;
                }
                q1Var.d6 = !this.e || k91Var.K1 < 0;
                q1Var.setFullyDraw(true);
                q1Var.s3(kjVar, null, z10, z11, false, false);
            }
        }
        z10 = false;
        if (d10 == c1Var.f) {
        }
        z11 = false;
        q1Var.d6 = !this.e || k91Var.K1 < 0;
        q1Var.setFullyDraw(true);
        q1Var.s3(kjVar, null, z10, z11, false, false);
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View view;
        k91 k91Var = this.f;
        if (i10 == 0) {
            org.telegram.ui.Cells.q1 q1Var = new org.telegram.ui.Cells.q1(this.c, ((org.telegram.ui.ActionBar.k2) k91Var).currentAccount, false, null, new bk(this, 2));
            q1Var.setDelegate(new jb.b(16));
            view = q1Var;
        } else {
            Context context = this.c;
            if (i10 == 1) {
                org.telegram.ui.Cells.s0 s0Var = new org.telegram.ui.Cells.s0(context, k91Var.a, false);
                s0Var.setDelegate(new kb.a(16));
                view = s0Var;
            } else if (i10 == 2) {
                if (k91Var.z0.getParent() != null) {
                    ((ViewGroup) k91Var.z0.getParent()).removeView(k91Var.z0);
                }
                bg0 bg0Var = new bg0(context, 12);
                bg0Var.addView(k91Var.z0, w7.b6.e(-1, 76, 17));
                view = bg0Var;
            } else if (i10 == 5) {
                view = new org.telegram.ui.Components.bn(k91Var.getParentActivity(), 22);
            } else {
                if (k91Var.A0.getParent() != null) {
                    ((ViewGroup) k91Var.A0.getParent()).removeView(k91Var.A0);
                }
                bg0 bg0Var2 = new bg0(context, 13);
                bg0Var2.addView(k91Var.A0, w7.b6.e(-1, 76, 17));
                view = bg0Var2;
            }
        }
        return sc.e.o(view, view, -1, -2);
    }
}
