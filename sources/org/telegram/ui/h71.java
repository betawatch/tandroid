package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class h71 extends org.telegram.ui.Components.sj0 {
    public final Context c;
    public final ArrayList d;
    public final boolean e;
    public final /* synthetic */ l71 f;

    public h71(Context context, l71 l71Var) {
        f71 f71Var;
        this.f = l71Var;
        int i3 = l71Var.b;
        boolean z10 = i3 == 0 && Utilities.b.nextInt(100) <= 1;
        this.e = z10;
        this.c = context;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        int i10 = currentTimeMillis - 3600;
        if (i3 == 2) {
            if (l71Var.L1 >= 0) {
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                if (l71Var.D1 instanceof kc1) {
                    tL_message.message = org.telegram.messenger.bd.M0(2131753747, null);
                } else {
                    tL_message.message = org.telegram.messenger.bd.M0(2131753739, null);
                }
                tL_message.date = currentTimeMillis - 3540;
                tL_message.dialog_id = 1L;
                tL_message.flags = org.telegram.messenger.hs.i4;
                tL_message.id = 1;
                tL_message.media = new TLRPC.TL_messageMediaEmpty();
                tL_message.out = true;
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_message.from_id = tL_peerUser;
                tL_peerUser.user_id = org.telegram.messenger.h10.i(((org.telegram.ui.ActionBar.d2) l71Var).currentAccount).e();
                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                tL_message.peer_id = tL_peerUser2;
                tL_peerUser2.user_id = org.telegram.messenger.h10.i(((org.telegram.ui.ActionBar.d2) l71Var).currentAccount).e();
                e71 e71Var = new e71(((org.telegram.ui.ActionBar.d2) l71Var).currentAccount, tL_message, true, false);
                e71Var.T = 1L;
                e71Var.Q1 = false;
                arrayList.add(e71Var);
            }
            TLRPC.TL_message tL_message2 = new TLRPC.TL_message();
            TLRPC.Chat M0 = l71Var.L1 < 0 ? l71Var.getMessagesController().M0(Long.valueOf(-l71Var.L1)) : null;
            if (M0 != null) {
                tL_message2.message = org.telegram.messenger.bd.M0(2131752456, null);
                TLRPC.TL_message tL_message3 = new TLRPC.TL_message();
                tL_message3.message = org.telegram.messenger.bd.M0(2131752454, null);
                f71 f71Var2 = new f71(((org.telegram.ui.ActionBar.d2) l71Var).currentAccount, tL_message3, true, false);
                TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                tL_message2.from_id = tL_peerChannel;
                tL_peerChannel.channel_id = M0.id;
                TLRPC.TL_peerChannel tL_peerChannel2 = new TLRPC.TL_peerChannel();
                tL_message2.peer_id = tL_peerChannel2;
                tL_peerChannel2.channel_id = M0.id;
                f71Var = f71Var2;
            } else {
                if (l71Var.L1 != 0) {
                    tL_message2.message = org.telegram.messenger.bd.M0(2131753746, null);
                } else if (l71Var.D1 instanceof kc1) {
                    tL_message2.message = org.telegram.messenger.bd.M0(2131753748, null);
                } else {
                    tL_message2.message = org.telegram.messenger.bd.M0(2131753740, null);
                }
                tL_message2.from_id = new TLRPC.TL_peerUser();
                TLRPC.TL_peerUser tL_peerUser3 = new TLRPC.TL_peerUser();
                tL_message2.peer_id = tL_peerUser3;
                tL_peerUser3.user_id = org.telegram.messenger.h10.i(((org.telegram.ui.ActionBar.d2) l71Var).currentAccount).e();
                f71Var = null;
            }
            int i11 = currentTimeMillis - 3540;
            tL_message2.date = i11;
            tL_message2.dialog_id = 1L;
            tL_message2.flags = org.telegram.messenger.hs.o4;
            tL_message2.id = 1;
            tL_message2.media = new TLRPC.TL_messageMediaEmpty();
            tL_message2.out = false;
            g71 g71Var = new g71(((org.telegram.ui.ActionBar.d2) l71Var).currentAccount, tL_message2, f71Var, true, false);
            if (f71Var != null) {
                g71Var.B0 = org.telegram.messenger.bd.M0(2131752455, null);
            }
            g71Var.T = 1L;
            g71Var.Q1 = false;
            arrayList.add(g71Var);
            if (l71Var.L1 == 0 || l71Var.s0 != null) {
                return;
            }
            TLRPC.User a22 = l71Var.getMessagesController().a2(Long.valueOf(l71Var.L1));
            TLRPC.TL_message tL_message4 = new TLRPC.TL_message();
            tL_message4.message = "";
            org.telegram.messenger.zi ziVar = new org.telegram.messenger.zi(((org.telegram.ui.ActionBar.d2) l71Var).currentAccount, tL_message4, true, false);
            ziVar.T = 1L;
            ziVar.U = 5;
            arrayList.add(ziVar);
            TLRPC.TL_message tL_message5 = new TLRPC.TL_message();
            if (a22 != null) {
                tL_message5.message = org.telegram.messenger.bd.a0(null, null, 2131752243, org.telegram.messenger.l10.j(a22, true));
            } else {
                tL_message5.message = org.telegram.messenger.bd.M0(2131752457, null);
            }
            tL_message5.date = i11;
            tL_message5.dialog_id = 1L;
            tL_message5.flags = org.telegram.messenger.hs.o4;
            tL_message5.from_id = new TLRPC.TL_peerUser();
            tL_message5.id = 1;
            tL_message5.media = new TLRPC.TL_messageMediaEmpty();
            tL_message5.out = false;
            TLRPC.TL_peerUser tL_peerUser4 = new TLRPC.TL_peerUser();
            tL_message5.peer_id = tL_peerUser4;
            tL_peerUser4.user_id = org.telegram.messenger.h10.i(((org.telegram.ui.ActionBar.d2) l71Var).currentAccount).e();
            org.telegram.messenger.zi ziVar2 = new org.telegram.messenger.zi(((org.telegram.ui.ActionBar.d2) l71Var).currentAccount, tL_message5, true, false);
            ziVar2.T = 1L;
            ziVar2.Q1 = false;
            ziVar2.U = 1;
            arrayList.add(ziVar2);
            return;
        }
        boolean z11 = z10;
        if (i3 == 1) {
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
            tL_documentAttributeFilename.file_name = org.telegram.messenger.bd.M0(2131748261, null) + ".mp3";
            tL_message6.media.document.attributes.add(tL_documentAttributeFilename);
            int i12 = currentTimeMillis + (-3540);
            tL_message6.date = i12;
            tL_message6.dialog_id = 1L;
            tL_message6.flags = org.telegram.messenger.hs.i4;
            TLRPC.TL_peerUser tL_peerUser5 = new TLRPC.TL_peerUser();
            tL_message6.from_id = tL_peerUser5;
            tL_peerUser5.user_id = org.telegram.messenger.h10.i(org.telegram.messenger.h10.t0).e();
            tL_message6.id = 1;
            tL_message6.out = true;
            TLRPC.TL_peerUser tL_peerUser6 = new TLRPC.TL_peerUser();
            tL_message6.peer_id = tL_peerUser6;
            tL_peerUser6.user_id = 0L;
            org.telegram.messenger.zi ziVar3 = new org.telegram.messenger.zi(org.telegram.messenger.h10.t0, tL_message6, true, false);
            boolean z12 = org.telegram.messenger.r2.a;
            TLRPC.TL_message tL_message7 = new TLRPC.TL_message();
            String M02 = org.telegram.messenger.bd.M0(2131748264, null);
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
            tL_message7.flags = org.telegram.messenger.hs.i4;
            TLRPC.TL_peerUser tL_peerUser7 = new TLRPC.TL_peerUser();
            tL_message7.from_id = tL_peerUser7;
            tL_peerUser7.user_id = org.telegram.messenger.h10.i(org.telegram.messenger.h10.t0).e();
            tL_message7.id = 1;
            tL_message7.media = new TLRPC.TL_messageMediaEmpty();
            tL_message7.out = true;
            TLRPC.TL_peerUser tL_peerUser8 = new TLRPC.TL_peerUser();
            tL_message7.peer_id = tL_peerUser8;
            tL_peerUser8.user_id = 0L;
            org.telegram.messenger.zi ziVar4 = new org.telegram.messenger.zi(org.telegram.messenger.h10.t0, tL_message7, true, false);
            ziVar4.Q1 = false;
            ziVar4.T = 1L;
            arrayList.add(ziVar4);
            TLRPC.TL_message tL_message8 = new TLRPC.TL_message();
            tL_message8.message = org.telegram.messenger.bd.M0(2131748265, null);
            tL_message8.date = i12;
            tL_message8.dialog_id = 1L;
            tL_message8.flags = org.telegram.messenger.hs.o4;
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
            tL_peerUser9.user_id = org.telegram.messenger.h10.i(org.telegram.messenger.h10.t0).e();
            org.telegram.messenger.zi ziVar5 = new org.telegram.messenger.zi(org.telegram.messenger.h10.t0, tL_message8, true, false);
            ziVar5.B0 = org.telegram.messenger.bd.M0(2131748263, null);
            ziVar4.B0 = "Test User";
            ziVar5.T = 1L;
            ziVar5.Q1 = false;
            ziVar5.C = ziVar3;
            ziVar4.C = ziVar5;
            arrayList.add(ziVar5);
            arrayList.add(ziVar3);
            TLRPC.TL_message tL_message9 = new TLRPC.TL_message();
            tL_message9.date = currentTimeMillis - 3480;
            tL_message9.dialog_id = 1L;
            tL_message9.flags = org.telegram.messenger.hs.i4;
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
            org.telegram.messenger.zi ziVar6 = new org.telegram.messenger.zi(((org.telegram.ui.ActionBar.d2) l71Var).currentAccount, tL_message9, true, false);
            ziVar6.g0 = 1;
            ziVar6.b0 = 0.3f;
            ziVar6.C0 = true;
            arrayList.add(ziVar6);
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
            org.telegram.messenger.hp.s1(((org.telegram.ui.ActionBar.d2) l71Var).currentAccount).Y3(arrayList2, true);
            TLRPC.TL_message tL_message10 = new TLRPC.TL_message();
            tL_message10.message = "Guess why Half-Life 3 was never released.";
            int i13 = currentTimeMillis - 2640;
            tL_message10.date = i13;
            tL_message10.dialog_id = -1L;
            tL_message10.flags = org.telegram.messenger.hs.i4;
            tL_message10.id = 2147483646;
            tL_message10.media = new TLRPC.TL_messageMediaEmpty();
            tL_message10.out = false;
            TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
            tL_message10.peer_id = tL_peerChat;
            tL_peerChat.chat_id = 1L;
            TLRPC.TL_peerUser tL_peerUser11 = new TLRPC.TL_peerUser();
            tL_message10.from_id = tL_peerUser11;
            tL_peerUser11.user_id = tL_user2.id;
            arrayList.add(new org.telegram.messenger.zi(((org.telegram.ui.ActionBar.d2) l71Var).currentAccount, tL_message10, true, false));
            TLRPC.TL_message tL_message11 = new TLRPC.TL_message();
            tL_message11.message = "No.\nAnd every unnecessary ping of the dev delays the release for 10 days.\nEvery request for ETA delays the release for 2 weeks.";
            tL_message11.date = i13;
            tL_message11.dialog_id = -1L;
            tL_message11.flags = org.telegram.messenger.hs.i4;
            tL_message11.id = 1;
            tL_message11.media = new TLRPC.TL_messageMediaEmpty();
            tL_message11.out = false;
            TLRPC.TL_peerChat tL_peerChat2 = new TLRPC.TL_peerChat();
            tL_message11.peer_id = tL_peerChat2;
            tL_peerChat2.chat_id = 1L;
            TLRPC.TL_peerUser tL_peerUser12 = new TLRPC.TL_peerUser();
            tL_message11.from_id = tL_peerUser12;
            tL_peerUser12.user_id = tL_user2.id;
            arrayList.add(new org.telegram.messenger.zi(((org.telegram.ui.ActionBar.d2) l71Var).currentAccount, tL_message11, true, false));
            TLRPC.TL_message tL_message12 = new TLRPC.TL_message();
            tL_message12.message = "Is source code for Android coming anytime soon?";
            tL_message12.date = currentTimeMillis - 3000;
            tL_message12.dialog_id = -1L;
            tL_message12.flags = org.telegram.messenger.hs.i4;
            tL_message12.id = 1;
            tL_message12.media = new TLRPC.TL_messageMediaEmpty();
            tL_message12.out = false;
            TLRPC.TL_peerChat tL_peerChat3 = new TLRPC.TL_peerChat();
            tL_message12.peer_id = tL_peerChat3;
            tL_peerChat3.chat_id = 1L;
            TLRPC.TL_peerUser tL_peerUser13 = new TLRPC.TL_peerUser();
            tL_message12.from_id = tL_peerUser13;
            tL_peerUser13.user_id = tL_user.id;
            arrayList.add(new org.telegram.messenger.zi(((org.telegram.ui.ActionBar.d2) l71Var).currentAccount, tL_message12, true, false));
            return;
        }
        TLRPC.TL_message tL_message13 = new TLRPC.TL_message();
        tL_message13.message = org.telegram.messenger.bd.M0(2131744165, null);
        int i14 = currentTimeMillis - 3540;
        tL_message13.date = i14;
        tL_message13.dialog_id = 1L;
        tL_message13.flags = org.telegram.messenger.hs.i4;
        TLRPC.TL_peerUser tL_peerUser14 = new TLRPC.TL_peerUser();
        tL_message13.from_id = tL_peerUser14;
        tL_peerUser14.user_id = org.telegram.messenger.h10.i(((org.telegram.ui.ActionBar.d2) l71Var).currentAccount).e();
        tL_message13.id = 1;
        tL_message13.media = new TLRPC.TL_messageMediaEmpty();
        tL_message13.out = true;
        TLRPC.TL_peerUser tL_peerUser15 = new TLRPC.TL_peerUser();
        tL_message13.peer_id = tL_peerUser15;
        tL_peerUser15.user_id = 0L;
        org.telegram.messenger.zi ziVar7 = new org.telegram.messenger.zi(((org.telegram.ui.ActionBar.d2) l71Var).currentAccount, tL_message13, true, false);
        TLRPC.TL_message tL_message14 = new TLRPC.TL_message();
        tL_message14.message = org.telegram.messenger.bd.M0(2131744164, null);
        tL_message14.date = currentTimeMillis - 2640;
        tL_message14.dialog_id = 1L;
        tL_message14.flags = org.telegram.messenger.hs.i4;
        TLRPC.TL_peerUser tL_peerUser16 = new TLRPC.TL_peerUser();
        tL_message14.from_id = tL_peerUser16;
        tL_peerUser16.user_id = org.telegram.messenger.h10.i(((org.telegram.ui.ActionBar.d2) l71Var).currentAccount).e();
        tL_message14.id = 1;
        tL_message14.media = new TLRPC.TL_messageMediaEmpty();
        tL_message14.out = true;
        TLRPC.TL_peerUser tL_peerUser17 = new TLRPC.TL_peerUser();
        tL_message14.peer_id = tL_peerUser17;
        tL_peerUser17.user_id = 0L;
        arrayList.add(new org.telegram.messenger.zi(((org.telegram.ui.ActionBar.d2) l71Var).currentAccount, tL_message14, true, false));
        TLRPC.TL_message tL_message15 = new TLRPC.TL_message();
        tL_message15.date = currentTimeMillis - 3470;
        tL_message15.dialog_id = 1L;
        tL_message15.flags = org.telegram.messenger.hs.i4;
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
        tL_documentAttributeAudio2.performer = org.telegram.messenger.bd.M0(2131744160, null);
        tL_documentAttributeAudio2.title = org.telegram.messenger.bd.M0(2131744159, null);
        tL_message15.media.document.attributes.add(tL_documentAttributeAudio2);
        tL_message15.out = false;
        TLRPC.TL_peerUser tL_peerUser18 = new TLRPC.TL_peerUser();
        tL_message15.peer_id = tL_peerUser18;
        tL_peerUser18.user_id = org.telegram.messenger.h10.i(((org.telegram.ui.ActionBar.d2) l71Var).currentAccount).e();
        arrayList.add(new org.telegram.messenger.zi(((org.telegram.ui.ActionBar.d2) l71Var).currentAccount, tL_message15, true, false));
        TLRPC.TL_message tL_message16 = new TLRPC.TL_message();
        tL_message16.message = org.telegram.messenger.bd.M0(2131744163, null);
        tL_message16.date = i14;
        tL_message16.dialog_id = 1L;
        tL_message16.flags = org.telegram.messenger.hs.o4;
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
        tL_peerUser19.user_id = org.telegram.messenger.h10.i(((org.telegram.ui.ActionBar.d2) l71Var).currentAccount).e();
        org.telegram.messenger.zi ziVar8 = new org.telegram.messenger.zi(((org.telegram.ui.ActionBar.d2) l71Var).currentAccount, tL_message16, true, false);
        ziVar8.B0 = org.telegram.messenger.bd.M0(2131744162, null);
        ziVar8.C = ziVar7;
        arrayList.add(ziVar8);
        TLRPC.TL_message tL_message17 = new TLRPC.TL_message();
        tL_message17.date = currentTimeMillis - 3480;
        tL_message17.dialog_id = 1L;
        tL_message17.flags = org.telegram.messenger.hs.i4;
        TLRPC.TL_peerUser tL_peerUser20 = new TLRPC.TL_peerUser();
        tL_message17.from_id = tL_peerUser20;
        tL_peerUser20.user_id = org.telegram.messenger.h10.i(((org.telegram.ui.ActionBar.d2) l71Var).currentAccount).e();
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
        org.telegram.messenger.zi ziVar9 = new org.telegram.messenger.zi(((org.telegram.ui.ActionBar.d2) l71Var).currentAccount, tL_message17, true, false);
        ziVar9.g0 = 1;
        ziVar9.b0 = 0.3f;
        ziVar9.C0 = true;
        arrayList.add(ziVar9);
        arrayList.add(ziVar7);
        TLRPC.TL_message tL_message18 = new TLRPC.TL_message();
        tL_message18.date = currentTimeMillis - 3590;
        tL_message18.dialog_id = 1L;
        tL_message18.flags = org.telegram.messenger.hs.g4;
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
        tL_photoSize.h = org.telegram.messenger.hs.Z4;
        tL_photoSize.type = "s";
        tL_photoSize.location = new TLRPC.TL_fileLocationUnavailable();
        tL_message18.media.photo.sizes.add(tL_photoSize);
        tL_message18.message = org.telegram.messenger.bd.M0(2131744161, null);
        tL_message18.out = false;
        TLRPC.TL_peerUser tL_peerUser22 = new TLRPC.TL_peerUser();
        tL_message18.peer_id = tL_peerUser22;
        tL_peerUser22.user_id = org.telegram.messenger.h10.i(((org.telegram.ui.ActionBar.d2) l71Var).currentAccount).e();
        org.telegram.messenger.zi ziVar10 = new org.telegram.messenger.zi(((org.telegram.ui.ActionBar.d2) l71Var).currentAccount, tL_message18, true, false);
        ziVar10.C0 = true;
        arrayList.add(ziVar10);
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        return false;
    }

    public final boolean F() {
        l71 l71Var = this.f;
        int i3 = l71Var.b;
        if (l71Var.B0 == null || i3 != 1 || l71Var.n != 3 || l71Var.w.g == 0) {
            if (l71Var.A0 == null) {
                return false;
            }
            if (i3 != 2 && (i3 != 1 || l71Var.n != 2)) {
                return false;
            }
        }
        return true;
    }

    @Override // u4.h0
    public final int b() {
        int size = this.d.size();
        return F() ? size + 1 : size;
    }

    @Override // u4.h0
    public final int d(int i3) {
        if (F()) {
            if (i3 == 0) {
                return this.f.n == 3 ? 3 : 2;
            }
            i3--;
        }
        if (i3 < 0) {
            return 4;
        }
        ArrayList arrayList = this.d;
        if (i3 < arrayList.size()) {
            return ((org.telegram.messenger.zi) arrayList.get(i3)).U;
        }
        return 4;
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        boolean z10;
        boolean z11;
        int i10 = d1Var.f;
        if (i10 == 2 || i10 == 3) {
            return;
        }
        if (F()) {
            i3--;
        }
        ArrayList arrayList = this.d;
        org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) arrayList.get(i3);
        View view = d1Var.a;
        boolean z12 = view instanceof org.telegram.ui.Cells.q1;
        l71 l71Var = this.f;
        if (!z12) {
            if (view instanceof org.telegram.ui.Cells.t0) {
                org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) view;
                t0Var.setMessageObject(ziVar);
                t0Var.setAlpha(1.0f);
                l71Var.a1();
                return;
            }
            return;
        }
        org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
        q1Var.e6 = false;
        int i11 = i3 - 1;
        int d = d(i11);
        int i12 = i3 + 1;
        int d10 = d(i12);
        if (!(ziVar.k.reply_markup instanceof TLRPC.TL_replyInlineMarkup) && d == d1Var.f) {
            org.telegram.messenger.zi ziVar2 = (org.telegram.messenger.zi) arrayList.get(i11);
            if (ziVar2.Q3() == ziVar.Q3() && Math.abs(ziVar2.k.date - ziVar.k.date) <= 300) {
                z10 = true;
                if (d10 == d1Var.f || i12 >= arrayList.size()) {
                    z11 = false;
                } else {
                    org.telegram.messenger.zi ziVar3 = (org.telegram.messenger.zi) arrayList.get(i12);
                    z11 = !(ziVar3.k.reply_markup instanceof TLRPC.TL_replyInlineMarkup) && ziVar3.Q3() == ziVar.Q3() && Math.abs(ziVar3.k.date - ziVar.k.date) <= 300;
                }
                q1Var.e6 = !this.e || l71Var.L1 < 0;
                q1Var.setFullyDraw(true);
                q1Var.u3(ziVar, null, z10, z11, false, false);
            }
        }
        z10 = false;
        if (d10 == d1Var.f) {
        }
        z11 = false;
        q1Var.e6 = !this.e || l71Var.L1 < 0;
        q1Var.setFullyDraw(true);
        q1Var.u3(ziVar, null, z10, z11, false, false);
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View view;
        l71 l71Var = this.f;
        if (i3 == 0) {
            org.telegram.ui.Cells.q1 q1Var = new org.telegram.ui.Cells.q1(this.c, ((org.telegram.ui.ActionBar.d2) l71Var).currentAccount, false, null, new dj(this, 2));
            q1Var.setDelegate(new ra.e(19));
            view = q1Var;
        } else {
            Context context = this.c;
            if (i3 == 1) {
                org.telegram.ui.Cells.t0 t0Var = new org.telegram.ui.Cells.t0(context, l71Var.a, false);
                t0Var.setDelegate(new v7.s(19));
                view = t0Var;
            } else if (i3 == 2) {
                if (l71Var.A0.getParent() != null) {
                    ((ViewGroup) l71Var.A0.getParent()).removeView(l71Var.A0);
                }
                yg0 yg0Var = new yg0(context, 11);
                yg0Var.addView(l71Var.A0, b8.mf.e(-1, 76, 17));
                view = yg0Var;
            } else if (i3 == 5) {
                view = new org.telegram.ui.Components.sm(l71Var.getParentActivity(), 26);
            } else {
                if (l71Var.B0.getParent() != null) {
                    ((ViewGroup) l71Var.B0.getParent()).removeView(l71Var.B0);
                }
                yg0 yg0Var2 = new yg0(context, 12);
                yg0Var2.addView(l71Var.B0, b8.mf.e(-1, 76, 17));
                view = yg0Var2;
            }
        }
        return k2.p1.p(view, view, -1, -2);
    }
}
