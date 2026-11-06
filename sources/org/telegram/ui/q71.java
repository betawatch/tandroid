package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class q71 extends org.telegram.ui.Components.oj0 {
    public final Context c;
    public final ArrayList d;
    public final boolean e;
    public final /* synthetic */ u71 f;

    public q71(Context context, u71 u71Var) {
        o71 o71Var;
        this.f = u71Var;
        int i7 = u71Var.b;
        boolean z9 = i7 == 0 && Utilities.b.nextInt(100) <= 1;
        this.e = z9;
        this.c = context;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        int i10 = currentTimeMillis - 3600;
        if (i7 == 2) {
            if (u71Var.K1 >= 0) {
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                if (u71Var.C1 instanceof oc1) {
                    tL_message.message = org.telegram.messenger.hd.M0(2131753747, null);
                } else {
                    tL_message.message = org.telegram.messenger.hd.M0(2131753739, null);
                }
                tL_message.date = currentTimeMillis - 3540;
                tL_message.dialog_id = 1L;
                tL_message.flags = org.telegram.messenger.qs.i4;
                tL_message.id = 1;
                tL_message.media = new TLRPC.TL_messageMediaEmpty();
                tL_message.out = true;
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_message.from_id = tL_peerUser;
                tL_peerUser.user_id = org.telegram.messenger.p10.i(((org.telegram.ui.ActionBar.f2) u71Var).currentAccount).e();
                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                tL_message.peer_id = tL_peerUser2;
                tL_peerUser2.user_id = org.telegram.messenger.p10.i(((org.telegram.ui.ActionBar.f2) u71Var).currentAccount).e();
                n71 n71Var = new n71(((org.telegram.ui.ActionBar.f2) u71Var).currentAccount, tL_message, true, false);
                n71Var.T = 1L;
                n71Var.Q1 = false;
                arrayList.add(n71Var);
            }
            TLRPC.TL_message tL_message2 = new TLRPC.TL_message();
            TLRPC.Chat M0 = u71Var.K1 < 0 ? u71Var.getMessagesController().M0(Long.valueOf(-u71Var.K1)) : null;
            if (M0 != null) {
                tL_message2.message = org.telegram.messenger.hd.M0(2131752456, null);
                TLRPC.TL_message tL_message3 = new TLRPC.TL_message();
                tL_message3.message = org.telegram.messenger.hd.M0(2131752454, null);
                o71 o71Var2 = new o71(((org.telegram.ui.ActionBar.f2) u71Var).currentAccount, tL_message3, true, false);
                TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                tL_message2.from_id = tL_peerChannel;
                tL_peerChannel.channel_id = M0.id;
                TLRPC.TL_peerChannel tL_peerChannel2 = new TLRPC.TL_peerChannel();
                tL_message2.peer_id = tL_peerChannel2;
                tL_peerChannel2.channel_id = M0.id;
                o71Var = o71Var2;
            } else {
                if (u71Var.K1 != 0) {
                    tL_message2.message = org.telegram.messenger.hd.M0(2131753746, null);
                } else if (u71Var.C1 instanceof oc1) {
                    tL_message2.message = org.telegram.messenger.hd.M0(2131753748, null);
                } else {
                    tL_message2.message = org.telegram.messenger.hd.M0(2131753740, null);
                }
                tL_message2.from_id = new TLRPC.TL_peerUser();
                TLRPC.TL_peerUser tL_peerUser3 = new TLRPC.TL_peerUser();
                tL_message2.peer_id = tL_peerUser3;
                tL_peerUser3.user_id = org.telegram.messenger.p10.i(((org.telegram.ui.ActionBar.f2) u71Var).currentAccount).e();
                o71Var = null;
            }
            int i11 = currentTimeMillis - 3540;
            tL_message2.date = i11;
            tL_message2.dialog_id = 1L;
            tL_message2.flags = org.telegram.messenger.qs.o4;
            tL_message2.id = 1;
            tL_message2.media = new TLRPC.TL_messageMediaEmpty();
            tL_message2.out = false;
            p71 p71Var = new p71(((org.telegram.ui.ActionBar.f2) u71Var).currentAccount, tL_message2, o71Var, true, false);
            if (o71Var != null) {
                p71Var.B0 = org.telegram.messenger.hd.M0(2131752455, null);
            }
            p71Var.T = 1L;
            p71Var.Q1 = false;
            arrayList.add(p71Var);
            if (u71Var.K1 == 0 || u71Var.r0 != null) {
                return;
            }
            TLRPC.User a22 = u71Var.getMessagesController().a2(Long.valueOf(u71Var.K1));
            TLRPC.TL_message tL_message4 = new TLRPC.TL_message();
            tL_message4.message = "";
            org.telegram.messenger.ij ijVar = new org.telegram.messenger.ij(((org.telegram.ui.ActionBar.f2) u71Var).currentAccount, tL_message4, true, false);
            ijVar.T = 1L;
            ijVar.U = 5;
            arrayList.add(ijVar);
            TLRPC.TL_message tL_message5 = new TLRPC.TL_message();
            if (a22 != null) {
                tL_message5.message = org.telegram.messenger.hd.a0(null, null, 2131752243, org.telegram.messenger.t10.j(a22, true));
            } else {
                tL_message5.message = org.telegram.messenger.hd.M0(2131752457, null);
            }
            tL_message5.date = i11;
            tL_message5.dialog_id = 1L;
            tL_message5.flags = org.telegram.messenger.qs.o4;
            tL_message5.from_id = new TLRPC.TL_peerUser();
            tL_message5.id = 1;
            tL_message5.media = new TLRPC.TL_messageMediaEmpty();
            tL_message5.out = false;
            TLRPC.TL_peerUser tL_peerUser4 = new TLRPC.TL_peerUser();
            tL_message5.peer_id = tL_peerUser4;
            tL_peerUser4.user_id = org.telegram.messenger.p10.i(((org.telegram.ui.ActionBar.f2) u71Var).currentAccount).e();
            org.telegram.messenger.ij ijVar2 = new org.telegram.messenger.ij(((org.telegram.ui.ActionBar.f2) u71Var).currentAccount, tL_message5, true, false);
            ijVar2.T = 1L;
            ijVar2.Q1 = false;
            ijVar2.U = 1;
            arrayList.add(ijVar2);
            return;
        }
        boolean z10 = z9;
        if (i7 == 1) {
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
            tL_documentAttributeFilename.file_name = org.telegram.messenger.hd.M0(2131748252, null) + ".mp3";
            tL_message6.media.document.attributes.add(tL_documentAttributeFilename);
            int i12 = currentTimeMillis + (-3540);
            tL_message6.date = i12;
            tL_message6.dialog_id = 1L;
            tL_message6.flags = org.telegram.messenger.qs.i4;
            TLRPC.TL_peerUser tL_peerUser5 = new TLRPC.TL_peerUser();
            tL_message6.from_id = tL_peerUser5;
            tL_peerUser5.user_id = org.telegram.messenger.p10.i(org.telegram.messenger.p10.s0).e();
            tL_message6.id = 1;
            tL_message6.out = true;
            TLRPC.TL_peerUser tL_peerUser6 = new TLRPC.TL_peerUser();
            tL_message6.peer_id = tL_peerUser6;
            tL_peerUser6.user_id = 0L;
            org.telegram.messenger.ij ijVar3 = new org.telegram.messenger.ij(org.telegram.messenger.p10.s0, tL_message6, true, false);
            boolean z11 = org.telegram.messenger.r2.a;
            TLRPC.TL_message tL_message7 = new TLRPC.TL_message();
            String M02 = org.telegram.messenger.hd.M0(2131748255, null);
            StringBuilder sb2 = new StringBuilder(M02);
            int indexOf = M02.indexOf(42);
            int lastIndexOf = M02.lastIndexOf(42);
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
            tL_message7.flags = org.telegram.messenger.qs.i4;
            TLRPC.TL_peerUser tL_peerUser7 = new TLRPC.TL_peerUser();
            tL_message7.from_id = tL_peerUser7;
            tL_peerUser7.user_id = org.telegram.messenger.p10.i(org.telegram.messenger.p10.s0).e();
            tL_message7.id = 1;
            tL_message7.media = new TLRPC.TL_messageMediaEmpty();
            tL_message7.out = true;
            TLRPC.TL_peerUser tL_peerUser8 = new TLRPC.TL_peerUser();
            tL_message7.peer_id = tL_peerUser8;
            tL_peerUser8.user_id = 0L;
            org.telegram.messenger.ij ijVar4 = new org.telegram.messenger.ij(org.telegram.messenger.p10.s0, tL_message7, true, false);
            ijVar4.Q1 = false;
            ijVar4.T = 1L;
            arrayList.add(ijVar4);
            TLRPC.TL_message tL_message8 = new TLRPC.TL_message();
            tL_message8.message = org.telegram.messenger.hd.M0(2131748256, null);
            tL_message8.date = i12;
            tL_message8.dialog_id = 1L;
            tL_message8.flags = org.telegram.messenger.qs.o4;
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
            tL_peerUser9.user_id = org.telegram.messenger.p10.i(org.telegram.messenger.p10.s0).e();
            org.telegram.messenger.ij ijVar5 = new org.telegram.messenger.ij(org.telegram.messenger.p10.s0, tL_message8, true, false);
            ijVar5.B0 = org.telegram.messenger.hd.M0(2131748254, null);
            ijVar4.B0 = "Test User";
            ijVar5.T = 1L;
            ijVar5.Q1 = false;
            ijVar5.C = ijVar3;
            ijVar4.C = ijVar5;
            arrayList.add(ijVar5);
            arrayList.add(ijVar3);
            TLRPC.TL_message tL_message9 = new TLRPC.TL_message();
            tL_message9.date = currentTimeMillis - 3480;
            tL_message9.dialog_id = 1L;
            tL_message9.flags = org.telegram.messenger.qs.i4;
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
            org.telegram.messenger.ij ijVar6 = new org.telegram.messenger.ij(((org.telegram.ui.ActionBar.f2) u71Var).currentAccount, tL_message9, true, false);
            ijVar6.g0 = 1;
            ijVar6.b0 = 0.3f;
            ijVar6.C0 = true;
            arrayList.add(ijVar6);
            return;
        }
        if (z10) {
            TLRPC.TL_user tL_user = new TLRPC.TL_user();
            tL_user.id = 2147483647L;
            tL_user.first_name = "Me";
            TLRPC.TL_user tL_user2 = new TLRPC.TL_user();
            tL_user2.id = 2147483646L;
            tL_user2.first_name = "Serj";
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(tL_user);
            arrayList2.add(tL_user2);
            org.telegram.messenger.qp.s1(((org.telegram.ui.ActionBar.f2) u71Var).currentAccount).Y3(arrayList2, true);
            TLRPC.TL_message tL_message10 = new TLRPC.TL_message();
            tL_message10.message = "Guess why Half-Life 3 was never released.";
            int i13 = currentTimeMillis - 2640;
            tL_message10.date = i13;
            tL_message10.dialog_id = -1L;
            tL_message10.flags = org.telegram.messenger.qs.i4;
            tL_message10.id = 2147483646;
            tL_message10.media = new TLRPC.TL_messageMediaEmpty();
            tL_message10.out = false;
            TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
            tL_message10.peer_id = tL_peerChat;
            tL_peerChat.chat_id = 1L;
            TLRPC.TL_peerUser tL_peerUser11 = new TLRPC.TL_peerUser();
            tL_message10.from_id = tL_peerUser11;
            tL_peerUser11.user_id = tL_user2.id;
            arrayList.add(new org.telegram.messenger.ij(((org.telegram.ui.ActionBar.f2) u71Var).currentAccount, tL_message10, true, false));
            TLRPC.TL_message tL_message11 = new TLRPC.TL_message();
            tL_message11.message = "No.\nAnd every unnecessary ping of the dev delays the release for 10 days.\nEvery request for ETA delays the release for 2 weeks.";
            tL_message11.date = i13;
            tL_message11.dialog_id = -1L;
            tL_message11.flags = org.telegram.messenger.qs.i4;
            tL_message11.id = 1;
            tL_message11.media = new TLRPC.TL_messageMediaEmpty();
            tL_message11.out = false;
            TLRPC.TL_peerChat tL_peerChat2 = new TLRPC.TL_peerChat();
            tL_message11.peer_id = tL_peerChat2;
            tL_peerChat2.chat_id = 1L;
            TLRPC.TL_peerUser tL_peerUser12 = new TLRPC.TL_peerUser();
            tL_message11.from_id = tL_peerUser12;
            tL_peerUser12.user_id = tL_user2.id;
            arrayList.add(new org.telegram.messenger.ij(((org.telegram.ui.ActionBar.f2) u71Var).currentAccount, tL_message11, true, false));
            TLRPC.TL_message tL_message12 = new TLRPC.TL_message();
            tL_message12.message = "Is source code for Android coming anytime soon?";
            tL_message12.date = currentTimeMillis - 3000;
            tL_message12.dialog_id = -1L;
            tL_message12.flags = org.telegram.messenger.qs.i4;
            tL_message12.id = 1;
            tL_message12.media = new TLRPC.TL_messageMediaEmpty();
            tL_message12.out = false;
            TLRPC.TL_peerChat tL_peerChat3 = new TLRPC.TL_peerChat();
            tL_message12.peer_id = tL_peerChat3;
            tL_peerChat3.chat_id = 1L;
            TLRPC.TL_peerUser tL_peerUser13 = new TLRPC.TL_peerUser();
            tL_message12.from_id = tL_peerUser13;
            tL_peerUser13.user_id = tL_user.id;
            arrayList.add(new org.telegram.messenger.ij(((org.telegram.ui.ActionBar.f2) u71Var).currentAccount, tL_message12, true, false));
            return;
        }
        TLRPC.TL_message tL_message13 = new TLRPC.TL_message();
        tL_message13.message = org.telegram.messenger.hd.M0(2131744156, null);
        int i14 = currentTimeMillis - 3540;
        tL_message13.date = i14;
        tL_message13.dialog_id = 1L;
        tL_message13.flags = org.telegram.messenger.qs.i4;
        TLRPC.TL_peerUser tL_peerUser14 = new TLRPC.TL_peerUser();
        tL_message13.from_id = tL_peerUser14;
        tL_peerUser14.user_id = org.telegram.messenger.p10.i(((org.telegram.ui.ActionBar.f2) u71Var).currentAccount).e();
        tL_message13.id = 1;
        tL_message13.media = new TLRPC.TL_messageMediaEmpty();
        tL_message13.out = true;
        TLRPC.TL_peerUser tL_peerUser15 = new TLRPC.TL_peerUser();
        tL_message13.peer_id = tL_peerUser15;
        tL_peerUser15.user_id = 0L;
        org.telegram.messenger.ij ijVar7 = new org.telegram.messenger.ij(((org.telegram.ui.ActionBar.f2) u71Var).currentAccount, tL_message13, true, false);
        TLRPC.TL_message tL_message14 = new TLRPC.TL_message();
        tL_message14.message = org.telegram.messenger.hd.M0(2131744155, null);
        tL_message14.date = currentTimeMillis - 2640;
        tL_message14.dialog_id = 1L;
        tL_message14.flags = org.telegram.messenger.qs.i4;
        TLRPC.TL_peerUser tL_peerUser16 = new TLRPC.TL_peerUser();
        tL_message14.from_id = tL_peerUser16;
        tL_peerUser16.user_id = org.telegram.messenger.p10.i(((org.telegram.ui.ActionBar.f2) u71Var).currentAccount).e();
        tL_message14.id = 1;
        tL_message14.media = new TLRPC.TL_messageMediaEmpty();
        tL_message14.out = true;
        TLRPC.TL_peerUser tL_peerUser17 = new TLRPC.TL_peerUser();
        tL_message14.peer_id = tL_peerUser17;
        tL_peerUser17.user_id = 0L;
        arrayList.add(new org.telegram.messenger.ij(((org.telegram.ui.ActionBar.f2) u71Var).currentAccount, tL_message14, true, false));
        TLRPC.TL_message tL_message15 = new TLRPC.TL_message();
        tL_message15.date = currentTimeMillis - 3470;
        tL_message15.dialog_id = 1L;
        tL_message15.flags = org.telegram.messenger.qs.i4;
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
        tL_documentAttributeAudio2.performer = org.telegram.messenger.hd.M0(2131744151, null);
        tL_documentAttributeAudio2.title = org.telegram.messenger.hd.M0(2131744150, null);
        tL_message15.media.document.attributes.add(tL_documentAttributeAudio2);
        tL_message15.out = false;
        TLRPC.TL_peerUser tL_peerUser18 = new TLRPC.TL_peerUser();
        tL_message15.peer_id = tL_peerUser18;
        tL_peerUser18.user_id = org.telegram.messenger.p10.i(((org.telegram.ui.ActionBar.f2) u71Var).currentAccount).e();
        arrayList.add(new org.telegram.messenger.ij(((org.telegram.ui.ActionBar.f2) u71Var).currentAccount, tL_message15, true, false));
        TLRPC.TL_message tL_message16 = new TLRPC.TL_message();
        tL_message16.message = org.telegram.messenger.hd.M0(2131744154, null);
        tL_message16.date = i14;
        tL_message16.dialog_id = 1L;
        tL_message16.flags = org.telegram.messenger.qs.o4;
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
        tL_peerUser19.user_id = org.telegram.messenger.p10.i(((org.telegram.ui.ActionBar.f2) u71Var).currentAccount).e();
        org.telegram.messenger.ij ijVar8 = new org.telegram.messenger.ij(((org.telegram.ui.ActionBar.f2) u71Var).currentAccount, tL_message16, true, false);
        ijVar8.B0 = org.telegram.messenger.hd.M0(2131744153, null);
        ijVar8.C = ijVar7;
        arrayList.add(ijVar8);
        TLRPC.TL_message tL_message17 = new TLRPC.TL_message();
        tL_message17.date = currentTimeMillis - 3480;
        tL_message17.dialog_id = 1L;
        tL_message17.flags = org.telegram.messenger.qs.i4;
        TLRPC.TL_peerUser tL_peerUser20 = new TLRPC.TL_peerUser();
        tL_message17.from_id = tL_peerUser20;
        tL_peerUser20.user_id = org.telegram.messenger.p10.i(((org.telegram.ui.ActionBar.f2) u71Var).currentAccount).e();
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
        org.telegram.messenger.ij ijVar9 = new org.telegram.messenger.ij(((org.telegram.ui.ActionBar.f2) u71Var).currentAccount, tL_message17, true, false);
        ijVar9.g0 = 1;
        ijVar9.b0 = 0.3f;
        ijVar9.C0 = true;
        arrayList.add(ijVar9);
        arrayList.add(ijVar7);
        TLRPC.TL_message tL_message18 = new TLRPC.TL_message();
        tL_message18.date = currentTimeMillis - 3590;
        tL_message18.dialog_id = 1L;
        tL_message18.flags = org.telegram.messenger.qs.g4;
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
        photo.date = i10;
        TLRPC.TL_photoSize tL_photoSize = new TLRPC.TL_photoSize();
        tL_photoSize.size = 0;
        tL_photoSize.w = 500;
        tL_photoSize.h = org.telegram.messenger.qs.Z4;
        tL_photoSize.type = "s";
        tL_photoSize.location = new TLRPC.TL_fileLocationUnavailable();
        tL_message18.media.photo.sizes.add(tL_photoSize);
        tL_message18.message = org.telegram.messenger.hd.M0(2131744152, null);
        tL_message18.out = false;
        TLRPC.TL_peerUser tL_peerUser22 = new TLRPC.TL_peerUser();
        tL_message18.peer_id = tL_peerUser22;
        tL_peerUser22.user_id = org.telegram.messenger.p10.i(((org.telegram.ui.ActionBar.f2) u71Var).currentAccount).e();
        org.telegram.messenger.ij ijVar10 = new org.telegram.messenger.ij(((org.telegram.ui.ActionBar.f2) u71Var).currentAccount, tL_message18, true, false);
        ijVar10.C0 = true;
        arrayList.add(ijVar10);
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        return false;
    }

    public final boolean F() {
        u71 u71Var = this.f;
        int i7 = u71Var.b;
        if (u71Var.A0 == null || i7 != 1 || u71Var.n != 3 || u71Var.w.g == 0) {
            if (u71Var.z0 == null) {
                return false;
            }
            if (i7 != 2 && (i7 != 1 || u71Var.n != 2)) {
                return false;
            }
        }
        return true;
    }

    @Override // v4.g0
    public final int b() {
        int size = this.d.size();
        return F() ? size + 1 : size;
    }

    @Override // v4.g0
    public final int d(int i7) {
        if (F()) {
            if (i7 == 0) {
                return this.f.n == 3 ? 3 : 2;
            }
            i7--;
        }
        if (i7 < 0) {
            return 4;
        }
        ArrayList arrayList = this.d;
        if (i7 < arrayList.size()) {
            return ((org.telegram.messenger.ij) arrayList.get(i7)).U;
        }
        return 4;
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        boolean z9;
        boolean z10;
        int i10 = d1Var.f;
        if (i10 == 2 || i10 == 3) {
            return;
        }
        if (F()) {
            i7--;
        }
        ArrayList arrayList = this.d;
        org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList.get(i7);
        View view = d1Var.a;
        boolean z11 = view instanceof org.telegram.ui.Cells.q1;
        u71 u71Var = this.f;
        if (!z11) {
            if (view instanceof org.telegram.ui.Cells.t0) {
                org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) view;
                t0Var.setMessageObject(ijVar);
                t0Var.setAlpha(1.0f);
                u71Var.a1();
                return;
            }
            return;
        }
        org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
        q1Var.e6 = false;
        int i11 = i7 - 1;
        int d = d(i11);
        int i12 = i7 + 1;
        int d2 = d(i12);
        if (!(ijVar.k.reply_markup instanceof TLRPC.TL_replyInlineMarkup) && d == d1Var.f) {
            org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) arrayList.get(i11);
            if (ijVar2.Q3() == ijVar.Q3() && Math.abs(ijVar2.k.date - ijVar.k.date) <= 300) {
                z9 = true;
                if (d2 == d1Var.f || i12 >= arrayList.size()) {
                    z10 = false;
                } else {
                    org.telegram.messenger.ij ijVar3 = (org.telegram.messenger.ij) arrayList.get(i12);
                    z10 = !(ijVar3.k.reply_markup instanceof TLRPC.TL_replyInlineMarkup) && ijVar3.Q3() == ijVar.Q3() && Math.abs(ijVar3.k.date - ijVar.k.date) <= 300;
                }
                q1Var.e6 = !this.e || u71Var.K1 < 0;
                q1Var.setFullyDraw(true);
                q1Var.v3(ijVar, null, z9, z10, false, false);
            }
        }
        z9 = false;
        if (d2 == d1Var.f) {
        }
        z10 = false;
        q1Var.e6 = !this.e || u71Var.K1 < 0;
        q1Var.setFullyDraw(true);
        q1Var.v3(ijVar, null, z9, z10, false, false);
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View view;
        u71 u71Var = this.f;
        if (i7 == 0) {
            org.telegram.ui.Cells.q1 q1Var = new org.telegram.ui.Cells.q1(this.c, ((org.telegram.ui.ActionBar.f2) u71Var).currentAccount, false, null, new hj(this, 2));
            q1Var.setDelegate(new qb.a(19));
            view = q1Var;
        } else {
            Context context = this.c;
            if (i7 == 1) {
                org.telegram.ui.Cells.t0 t0Var = new org.telegram.ui.Cells.t0(context, u71Var.a, false);
                t0Var.setDelegate(new sa.d(19));
                view = t0Var;
            } else if (i7 == 2) {
                if (u71Var.z0.getParent() != null) {
                    ((ViewGroup) u71Var.z0.getParent()).removeView(u71Var.z0);
                }
                rq0 rq0Var = new rq0(context, 9);
                rq0Var.addView(u71Var.z0, c8.ha.e(-1, 76, 17));
                view = rq0Var;
            } else if (i7 == 5) {
                view = new org.telegram.ui.Components.tm(u71Var.getParentActivity(), 25);
            } else {
                if (u71Var.A0.getParent() != null) {
                    ((ViewGroup) u71Var.A0.getParent()).removeView(u71Var.A0);
                }
                rq0 rq0Var2 = new rq0(context, 10);
                rq0Var2.addView(u71Var.A0, c8.ha.e(-1, 76, 17));
                view = rq0Var2;
            }
        }
        return jg.g.r(view, view, -1, -2);
    }
}
