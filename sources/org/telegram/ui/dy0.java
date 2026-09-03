package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.location.Location;
import android.os.Bundle;
import android.text.SpannableString;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.messenger.video.MediaCodecVideoConvertor;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dy0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ dy0(int i10, Object obj, Object obj2, Object obj3, String str) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = str;
        this.b = obj3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
    
        if (r1 == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void a() {
        vf.p1 p1Var = (vf.p1) this.c;
        MessagesStorage messagesStorage = (MessagesStorage) this.d;
        vf.o1 o1Var = (vf.o1) this.b;
        TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = (TLRPC.TL_messages_sendQuickReplyMessages) this.e;
        ArrayList arrayList = new ArrayList();
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                sQLiteCursor = messagesStorage.getDatabase().queryFinalized("SELECT id FROM quick_replies_messages WHERE topic_id = ?", Integer.valueOf(o1Var.a));
                while (sQLiteCursor.next()) {
                    arrayList.add(Integer.valueOf(sQLiteCursor.intValue(0)));
                }
            } catch (Exception e6) {
                FileLog.e(e6);
            }
            sQLiteCursor.dispose();
            AndroidUtilities.runOnUIThread(new dy0(p1Var, arrayList, o1Var, tL_messages_sendQuickReplyMessages, 26));
        } catch (Throwable th2) {
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            throw th2;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int indexOf;
        int i10;
        int i11;
        boolean z4;
        char c3;
        String formatPluralString;
        float f10;
        long j10;
        VideoEditedInfo.Part part;
        long j11;
        long j12;
        ArrayList<VideoEditedInfo.Part> arrayList;
        ArrayList arrayList2;
        int i12 = this.a;
        int i13 = 0;
        Object obj = this.e;
        Object obj2 = this.b;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i12) {
            case 0:
                ProfileActivity.n0((ProfileActivity) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (String) obj);
                break;
            case 1:
                TLObject tLObject = (TLObject) obj2;
                UserConfig userConfig = (UserConfig) obj3;
                TLRPC.Photo photo = (TLRPC.Photo) obj;
                ProfileActivity profileActivity = ((vz0) obj4).b;
                profileActivity.k0.Z0--;
                if (tLObject instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
                    profileActivity.getMessagesController().putUsers(tL_photos_photo.users, false);
                    TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(userConfig.clientUserId));
                    TLRPC.Photo photo2 = tL_photos_photo.photo;
                    if (photo2 instanceof TLRPC.TL_photo) {
                        ArrayList arrayList3 = profileActivity.k0.S0;
                        if (!arrayList3.isEmpty() && (indexOf = arrayList3.indexOf(photo)) >= 0) {
                            arrayList3.set(indexOf, photo2);
                        }
                        if (user != null) {
                            user.photo.photo_id = tL_photos_photo.photo.id;
                            userConfig.setCurrentUser(user);
                            userConfig.saveConfig(true);
                            break;
                        }
                    }
                }
                break;
            case 2:
                TLObject tLObject2 = (TLObject) obj2;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                ProfileActivity profileActivity2 = ((g01) obj4).c.e;
                profileActivity2.M4(null);
                if (!(tLObject2 instanceof TL_fragment.TL_collectibleInfo)) {
                    org.telegram.ui.Components.qc.b0(tL_error);
                    break;
                } else {
                    TLObject user2 = profileActivity2.b1 != 0 ? profileActivity2.getMessagesController().getUser(Long.valueOf(profileActivity2.b1)) : profileActivity2.getMessagesController().getChat(Long.valueOf(profileActivity2.c1));
                    if (profileActivity2.getParentActivity() != null) {
                        e20.a(profileActivity2.getParentActivity(), 0, tL_username.username, user2, (TL_fragment.TL_collectibleInfo) tLObject2, profileActivity2.w0);
                        break;
                    }
                }
                break;
            case 3:
                SessionsActivity sessionsActivity = (SessionsActivity) obj4;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj3;
                TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) obj;
                sessionsActivity.getClass();
                try {
                    d2Var.dismiss();
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
                if (tL_error2 == null) {
                    sessionsActivity.e.remove(tL_webAuthorization);
                    sessionsActivity.m0();
                    h81 h81Var = sessionsActivity.a;
                    if (h81Var != null) {
                        h81Var.l();
                        break;
                    }
                }
                break;
            case 4:
                SessionsActivity sessionsActivity2 = (SessionsActivity) obj4;
                org.telegram.ui.ActionBar.d2 d2Var2 = (org.telegram.ui.ActionBar.d2) obj2;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj3;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) obj;
                sessionsActivity2.getClass();
                try {
                    d2Var2.dismiss();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                if (tL_error3 == null) {
                    sessionsActivity2.e.remove(tL_authorization);
                    sessionsActivity2.f.remove(tL_authorization);
                    sessionsActivity2.m0();
                    h81 h81Var2 = sessionsActivity2.a;
                    if (h81Var2 != null) {
                        h81Var2.l();
                        break;
                    }
                }
                break;
            case 5:
                g81 g81Var = (g81) obj4;
                g81Var.a = (TLObject) obj2;
                g81Var.b = (TLRPC.TL_error) obj3;
                ((m9) obj).run();
                break;
            case 6:
                v81.b0((v81) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (String) obj);
                break;
            case 7:
                y91 y91Var = (y91) obj4;
                xf.b bVar = (xf.b) obj3;
                String str = (String) obj;
                ma1 ma1Var = (ma1) obj2;
                na1 na1Var = y91Var.w;
                if (bVar != null) {
                    na1Var.S.put(str, bVar);
                }
                if (bVar != null && !ma1Var.b && (i10 = ma1Var.a) >= 0) {
                    View m9 = na1Var.R.m(i10);
                    if (m9 instanceof y91) {
                        y91Var.r.e = bVar;
                        y91 y91Var2 = (y91) m9;
                        y91Var2.b.q0.d(false, false);
                        y91Var2.g(false);
                    }
                }
                na1.Z(na1Var);
                break;
            case 8:
                z91 z91Var = (z91) obj4;
                z91Var.k = false;
                z91Var.d = (xf.b) obj3;
                z91Var.g = (String) obj;
                x91 x91Var = (x91) ((Utilities.Callback0Return) obj2).run();
                if (x91Var != null) {
                    x91Var.e(z91Var, true);
                    break;
                }
                break;
            case 9:
                TLObject tLObject3 = (TLObject) obj2;
                String str2 = (String) obj;
                org.telegram.ui.ActionBar.d2 d2Var3 = (org.telegram.ui.ActionBar.d2) obj3;
                oe1 oe1Var = ((ke1) obj4).a;
                if (tLObject3 != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject3;
                    for (int i14 = 0; i14 < updates.updates.size(); i14++) {
                        if (updates.updates.get(i14) instanceof TL_update.TL_updateMessageID) {
                            TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) updates.updates.get(i14);
                            TLRPC.TL_messageActionTopicCreate tL_messageActionTopicCreate = new TLRPC.TL_messageActionTopicCreate();
                            tL_messageActionTopicCreate.title = str2;
                            TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                            tL_messageService.action = tL_messageActionTopicCreate;
                            tL_messageService.peer_id = oe1Var.getMessagesController().getPeer(oe1Var.a);
                            tL_messageService.dialog_id = oe1Var.a;
                            tL_messageService.id = tL_updateMessageID.id;
                            tL_messageService.date = (int) (System.currentTimeMillis() / 1000);
                            ArrayList arrayList4 = new ArrayList();
                            i11 = ((org.telegram.ui.ActionBar.p2) oe1Var).currentAccount;
                            arrayList4.add(new MessageObject(i11, tL_messageService, false, false));
                            TLRPC.Chat chat = oe1Var.getMessagesController().getChat(Long.valueOf(-oe1Var.a));
                            TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
                            tL_forumTopic.id = tL_updateMessageID.id;
                            long j13 = oe1Var.b;
                            if (j13 != 0) {
                                tL_forumTopic.icon_emoji_id = j13;
                                z4 = true;
                                tL_forumTopic.flags |= 1;
                            } else {
                                z4 = true;
                            }
                            tL_forumTopic.my = z4;
                            tL_forumTopic.flags |= 2;
                            tL_forumTopic.topicStartMessage = tL_messageService;
                            tL_forumTopic.title = str2;
                            tL_forumTopic.top_message = tL_messageService.id;
                            tL_forumTopic.topMessage = tL_messageService;
                            tL_forumTopic.from_id = oe1Var.getMessagesController().getPeer(oe1Var.getUserConfig().clientUserId);
                            tL_forumTopic.notify_settings = new TLRPC.TL_peerNotifySettings();
                            tL_forumTopic.icon_color = oe1Var.B;
                            xn xnVar = oe1Var.y;
                            if (xnVar != null) {
                                xnVar.La();
                                xnVar.Pa();
                                xnVar.pb(arrayList4, chat, tL_messageService.id, 1, 1, tL_forumTopic);
                                xnVar.c = true;
                                xnVar.r8();
                                xnVar.Nc(true);
                                xnVar.X0.n(true);
                                xnVar.Tc();
                                xnVar.O1.setCurrentTopic(xnVar.b());
                                xnVar.Qc(true);
                                xnVar.hc(true);
                                xnVar.e9(true);
                                xnVar.A6(true, true);
                                xnVar.Ea();
                                oe1Var.getMessagesController().getTopicsController().onTopicCreated(oe1Var.a, tL_forumTopic, true);
                                oe1Var.finishFragment();
                            } else {
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", -oe1Var.a);
                                bundle.putInt("message_id", 1);
                                bundle.putInt("unread_count", 0);
                                bundle.putBoolean("historyPreloaded", false);
                                xn xnVar2 = new xn(bundle);
                                xnVar2.pb(arrayList4, chat, tL_messageService.id, 1, 1, tL_forumTopic);
                                xnVar2.c = true;
                                oe1Var.getMessagesController().getTopicsController().onTopicCreated(oe1Var.a, tL_forumTopic, true);
                                oe1Var.presentFragment(xnVar2);
                            }
                        }
                    }
                }
                d2Var3.dismiss();
                break;
            case 10:
                TwoStepVerificationActivity.e0((TwoStepVerificationActivity) obj4, (byte[]) obj3, (TLObject) obj2, (byte[]) obj);
                break;
            case 11:
                vg1 vg1Var = (vg1) obj4;
                String str3 = (String) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj3;
                if (((TLObject) obj2) instanceof TLRPC.TL_boolTrue) {
                    vg1Var.u0(new h21(28, vg1Var, str3));
                    break;
                } else if (tL_error4 != null && !tL_error4.text.startsWith("CODE_INVALID")) {
                    if (tL_error4.text.startsWith("FLOOD_WAIT")) {
                        int intValue = Utilities.parseInt((CharSequence) tL_error4.text).intValue();
                        if (intValue < 60) {
                            c3 = 0;
                            formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
                        } else {
                            c3 = 0;
                            formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
                        }
                        String string = LocaleController.getString(R.string.TwoStepVerificationTitle);
                        int i15 = R.string.FloodWaitTime;
                        Object[] objArr = new Object[1];
                        objArr[c3] = formatPluralString;
                        vg1Var.G0(string, LocaleController.formatString("FloodWaitTime", i15, objArr));
                        break;
                    } else {
                        vg1Var.G0(LocaleController.getString(R.string.TwoStepVerificationTitle), tL_error4.text);
                        break;
                    }
                } else {
                    vg1Var.y0();
                    break;
                }
                break;
            case 12:
                org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) obj4;
                String str4 = (String) obj;
                String str5 = (String) obj3;
                if (((TLObject) obj2) instanceof TLRPC.TL_boolTrue) {
                    Context context = a1Var.getContext();
                    String userName = UserObject.getUserName(a1Var.R);
                    final lh.h hVar = new lh.h(a1Var, str4, str5, 12);
                    HashMap hashMap = sh.h0.g;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                    String string2 = LocaleController.getString(R.string.BotDownloadFileTitle);
                    org.telegram.ui.ActionBar.d2 d2Var4 = alertDialog$Builder.a;
                    d2Var4.O = string2;
                    d2Var4.Q = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotDownloadFileText, userName));
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    linearLayout.setOrientation(0);
                    ImageView imageView = new ImageView(context);
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    imageView.setBackground(org.telegram.ui.ActionBar.k6.K(AndroidUtilities.dp(44.0f), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Oh, false)));
                    imageView.setImageResource(R.drawable.msg_round_file_s);
                    linearLayout.addView(imageView, k7.c6.t(44, 44, 19, 0, 0, 10, 0));
                    LinearLayout linearLayout2 = new LinearLayout(context);
                    linearLayout2.setOrientation(1);
                    TextView g10 = org.telegram.messenger.y3.g(context, 1, 15.0f);
                    g10.setTypeface(AndroidUtilities.bold());
                    g10.setText(str5);
                    g10.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.n5, false));
                    linearLayout2.addView(g10, k7.c6.k(0.0f, 0.0f, 0.0f, 3.0f, -1, -2));
                    org.telegram.ui.Components.k6 k6Var = new org.telegram.ui.Components.k6(context, true, true, true);
                    k6Var.setTextSize(AndroidUtilities.dp(12.0f));
                    SpannableString spannableString = new SpannableString("l");
                    org.telegram.ui.Components.l90 l90Var = new org.telegram.ui.Components.l90(AndroidUtilities.dp(55.0f), k6Var);
                    int i16 = org.telegram.ui.ActionBar.k6.Ed;
                    l90Var.a(org.telegram.ui.ActionBar.k6.l1(0.35f, org.telegram.ui.ActionBar.k6.w0(null, i16, false)), org.telegram.ui.ActionBar.k6.l1(0.075f, org.telegram.ui.ActionBar.k6.w0(null, i16, false)));
                    spannableString.setSpan(l90Var, 0, 1, 33);
                    k6Var.setText(spannableString);
                    qh.c4 c4Var = new qh.c4(k6Var, 9);
                    HashMap hashMap2 = sh.h0.h;
                    if (hashMap2.containsKey(str4)) {
                        Pair pair = (Pair) hashMap2.get(str4);
                        c4Var.run((String) pair.first, (Long) pair.second);
                    } else {
                        new sh.b0(str4, c4Var).execute(str4);
                    }
                    k6Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i16, false));
                    linearLayout2.addView(k6Var, k7.c6.n(-1, 15));
                    linearLayout.addView(linearLayout2, k7.c6.t(-1, -2, 23, 0, 0, 0, 2));
                    alertDialog$Builder.n(linearLayout);
                    final int i17 = 1;
                    final boolean[] zArr = new boolean[1];
                    final int i18 = 0;
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.c2() { // from class: sh.a0
                        @Override // org.telegram.ui.ActionBar.c2
                        public final void j(org.telegram.ui.ActionBar.d2 d2Var5, int i19) {
                            switch (i18) {
                                case 0:
                                    boolean[] zArr2 = zArr;
                                    if (!zArr2[0]) {
                                        hVar.run(Boolean.FALSE);
                                        zArr2[0] = true;
                                        break;
                                    }
                                    break;
                                default:
                                    boolean[] zArr3 = zArr;
                                    if (!zArr3[0]) {
                                        hVar.run(Boolean.TRUE);
                                        zArr3[0] = true;
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    alertDialog$Builder.k(LocaleController.getString(R.string.BotDownloadFileDownload), new org.telegram.ui.ActionBar.c2() { // from class: sh.a0
                        @Override // org.telegram.ui.ActionBar.c2
                        public final void j(org.telegram.ui.ActionBar.d2 d2Var5, int i19) {
                            switch (i17) {
                                case 0:
                                    boolean[] zArr2 = zArr;
                                    if (!zArr2[0]) {
                                        hVar.run(Boolean.FALSE);
                                        zArr2[0] = true;
                                        break;
                                    }
                                    break;
                                default:
                                    boolean[] zArr3 = zArr;
                                    if (!zArr3[0]) {
                                        hVar.run(Boolean.TRUE);
                                        zArr3[0] = true;
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    d2Var4.setOnDismissListener(new hg.g(15, zArr, hVar));
                    d2Var4.show();
                    break;
                } else {
                    a1Var.v("file_download_requested", org.telegram.ui.web.a1.x("cancelled", "status"));
                    break;
                }
            case 13:
                qh.i5 i5Var = (qh.i5) obj4;
                Bitmap[] bitmapArr = (Bitmap[]) obj3;
                qh.r6 r6Var = (qh.r6) obj2;
                boolean[] zArr2 = (boolean[]) obj;
                org.telegram.ui.Components.ba baVar = i5Var.D;
                Bitmap bitmap = i5Var.a;
                if (bitmap != null && !bitmap.isRecycled()) {
                    i5Var.a.recycle();
                }
                Bitmap bitmap2 = bitmapArr[0];
                i5Var.a = bitmap2;
                if (r6Var != null && !r6Var.c && r6Var.K && bitmap2 != null) {
                    r6Var.k0 = bitmap2.getWidth();
                    r6Var.l0 = i5Var.a.getHeight();
                    r6Var.A();
                }
                if (zArr2[0] && r6Var != null && baVar != null && i5Var.a != null) {
                    baVar.e();
                    baVar.f(r6Var.b(i5Var.a, 0.2f), false);
                    qh.f8 f8Var = i5Var.v;
                    if (f8Var != null) {
                        f8Var.run();
                    }
                }
                i5Var.r();
                i5Var.invalidate();
                break;
            case 14:
                qh.r6 r6Var2 = (qh.r6) obj4;
                String str6 = (String) obj;
                int[][] iArr = (int[][]) obj3;
                Utilities.Callback callback = (Utilities.Callback) obj2;
                r6Var2.getClass();
                VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
                videoEditedInfo.isStory = true;
                videoEditedInfo.fromCamera = r6Var2.c1;
                videoEditedInfo.originalWidth = r6Var2.k0;
                videoEditedInfo.originalHeight = r6Var2.l0;
                videoEditedInfo.resultWidth = r6Var2.i0;
                videoEditedInfo.resultHeight = r6Var2.j0;
                File file = r6Var2.P0;
                videoEditedInfo.paintPath = file == null ? null : file.getPath();
                File file2 = r6Var2.W0;
                videoEditedInfo.messagePath = file2 == null ? null : file2.getPath();
                File file3 = r6Var2.X0;
                videoEditedInfo.messageVideoMaskPath = file3 == null ? null : file3.getPath();
                File file4 = r6Var2.Y0;
                videoEditedInfo.backgroundPath = file4 == null ? null : file4.getPath();
                int extractRealEncoderBitrate = MediaController.extractRealEncoderBitrate(videoEditedInfo.resultWidth, videoEditedInfo.resultHeight, videoEditedInfo.bitrate, true);
                if (!r6Var2.K || str6 == null || r6Var2.v()) {
                    File file5 = r6Var2.Z0;
                    if (file5 != null) {
                        videoEditedInfo.originalPath = file5.getAbsolutePath();
                    } else {
                        videoEditedInfo.originalPath = str6;
                    }
                    videoEditedInfo.isPhoto = true;
                    videoEditedInfo.collage = r6Var2.S;
                    if (r6Var2.v()) {
                        boolean z10 = false;
                        for (int i19 = 0; i19 < r6Var2.T.size(); i19++) {
                            qh.r6 r6Var3 = (qh.r6) r6Var2.T.get(i19);
                            if (r6Var3.K) {
                                r6Var3.k0 = Math.max(r6Var3.k0, iArr[i19][1]);
                                r6Var3.l0 = Math.max(r6Var3.l0, iArr[i19][2]);
                                r6Var3.h0 = Math.max(r6Var3.h0, iArr[i19][4]);
                                z10 = true;
                            }
                        }
                        f10 = 8.0f;
                        ArrayList<VideoEditedInfo.Part> parts = VideoEditedInfo.Part.toParts(r6Var2);
                        videoEditedInfo.collageParts = parts;
                        if (z10) {
                            int size = parts.size();
                            VideoEditedInfo.Part part2 = null;
                            long j14 = 0;
                            int i20 = 0;
                            while (i20 < size) {
                                VideoEditedInfo.Part part3 = parts.get(i20);
                                i20++;
                                VideoEditedInfo.Part part4 = part3;
                                if (part4.isVideo) {
                                    long j15 = part4.duration;
                                    if (j15 > j14) {
                                        j14 = j15;
                                        part2 = part4;
                                    }
                                }
                            }
                            if (part2 != null) {
                                float f11 = part2.duration;
                                float f12 = part2.right;
                                float f13 = part2.left;
                                long j16 = (long) ((f12 - f13) * f11);
                                r6Var2.h0 = j16;
                                videoEditedInfo.originalDuration = j16;
                                videoEditedInfo.estimatedDuration = j16;
                                j10 = -(part2.offset + ((long) (f13 * f11)));
                                part2.offset = j10;
                                ArrayList<VideoEditedInfo.Part> arrayList5 = videoEditedInfo.collageParts;
                                int size2 = arrayList5.size();
                                int i21 = 0;
                                while (i21 < size2) {
                                    VideoEditedInfo.Part part5 = arrayList5.get(i21);
                                    i21++;
                                    VideoEditedInfo.Part part6 = part5;
                                    if (!part6.isVideo || part6 == part2) {
                                        part = part2;
                                    } else {
                                        part = part2;
                                        part6.offset += j10;
                                    }
                                    part2 = part;
                                }
                                videoEditedInfo.startTime = -1L;
                                videoEditedInfo.endTime = -1L;
                                videoEditedInfo.muted = true;
                                videoEditedInfo.originalBitrate = -1;
                                videoEditedInfo.volume = 1.0f;
                                videoEditedInfo.bitrate = -1;
                                videoEditedInfo.framerate = 30;
                                videoEditedInfo.estimatedSize = (long) (((r6Var2.h0 / 1000.0f) * extractRealEncoderBitrate) / f10);
                                videoEditedInfo.filterState = null;
                            }
                        } else {
                            long j17 = r6Var2.S0;
                            r6Var2.h0 = j17;
                            videoEditedInfo.originalDuration = j17;
                            videoEditedInfo.estimatedDuration = j17;
                        }
                    } else {
                        f10 = 8.0f;
                        if (r6Var2.o0 != null) {
                            long j18 = (long) ((r6Var2.t0 - r6Var2.s0) * r6Var2.q0);
                            r6Var2.h0 = j18;
                            videoEditedInfo.originalDuration = j18;
                            videoEditedInfo.estimatedDuration = j18;
                        } else if (r6Var2.y != null) {
                            long j19 = (long) ((r6Var2.F - r6Var2.E) * r6Var2.C);
                            r6Var2.h0 = j19;
                            videoEditedInfo.originalDuration = j19;
                            videoEditedInfo.estimatedDuration = j19;
                        } else {
                            long j20 = r6Var2.S0;
                            r6Var2.h0 = j20;
                            videoEditedInfo.originalDuration = j20;
                            videoEditedInfo.estimatedDuration = j20;
                        }
                    }
                    j10 = 0;
                    videoEditedInfo.startTime = -1L;
                    videoEditedInfo.endTime = -1L;
                    videoEditedInfo.muted = true;
                    videoEditedInfo.originalBitrate = -1;
                    videoEditedInfo.volume = 1.0f;
                    videoEditedInfo.bitrate = -1;
                    videoEditedInfo.framerate = 30;
                    videoEditedInfo.estimatedSize = (long) (((r6Var2.h0 / 1000.0f) * extractRealEncoderBitrate) / f10);
                    videoEditedInfo.filterState = null;
                } else {
                    videoEditedInfo.originalPath = str6;
                    videoEditedInfo.isPhoto = false;
                    videoEditedInfo.framerate = Math.min(59, iArr[0][7]);
                    int videoBitrate = MediaController.getVideoBitrate(str6);
                    if (videoBitrate == -1) {
                        videoBitrate = iArr[0][3];
                    }
                    videoEditedInfo.originalBitrate = videoBitrate;
                    if (videoBitrate >= 1000000 || (arrayList2 = r6Var2.T0) == null || arrayList2.isEmpty()) {
                        int i22 = videoEditedInfo.originalBitrate;
                        if (i22 < 500000) {
                            videoEditedInfo.bitrate = 2500000;
                            videoEditedInfo.originalBitrate = -1;
                        } else {
                            videoEditedInfo.bitrate = Utilities.clamp(i22, 3000000, 500000);
                        }
                    } else {
                        videoEditedInfo.bitrate = 2000000;
                        videoEditedInfo.originalBitrate = -1;
                    }
                    StringBuilder sb = new StringBuilder("story bitrate, original = ");
                    sb.append(videoEditedInfo.originalBitrate);
                    sb.append(" => ");
                    l.d.t(videoEditedInfo.bitrate, sb);
                    int i23 = iArr[0][4];
                    long j21 = i23;
                    r6Var2.h0 = j21;
                    videoEditedInfo.originalDuration = j21 * 1000;
                    float f14 = j21;
                    long j22 = ((long) (r6Var2.Z * f14)) * 1000;
                    videoEditedInfo.startTime = j22;
                    long j23 = ((long) (r6Var2.a0 * f14)) * 1000;
                    videoEditedInfo.endTime = j23;
                    videoEditedInfo.estimatedDuration = j23 - j22;
                    videoEditedInfo.volume = r6Var2.P;
                    videoEditedInfo.muted = r6Var2.Y;
                    videoEditedInfo.estimatedSize = (long) android.support.v4.media.a.d(i23 / 1000.0f, extractRealEncoderBitrate, 8.0f, r3[5]);
                    videoEditedInfo.estimatedSize = Math.max(r6Var2.L.length(), videoEditedInfo.estimatedSize);
                    videoEditedInfo.filterState = r6Var2.a1;
                    File file6 = r6Var2.Q0;
                    videoEditedInfo.blurPath = file6 != null ? file6.getPath() : null;
                    j10 = 0;
                }
                videoEditedInfo.account = r6Var2.a;
                videoEditedInfo.wallpaperPeerId = r6Var2.z0;
                videoEditedInfo.isDark = r6Var2.y0;
                videoEditedInfo.avatarStartTime = -1L;
                MediaController.CropState cropState = r6Var2.m0;
                if (cropState != null) {
                    videoEditedInfo.cropState = cropState.clone();
                } else {
                    videoEditedInfo.cropState = new MediaController.CropState();
                }
                videoEditedInfo.cropState.useMatrix = new Matrix();
                videoEditedInfo.cropState.useMatrix.set(r6Var2.n0);
                videoEditedInfo.mediaEntities = r6Var2.T0;
                videoEditedInfo.gradientTopColor = Integer.valueOf(r6Var2.A0);
                videoEditedInfo.gradientBottomColor = Integer.valueOf(r6Var2.B0);
                videoEditedInfo.forceFragmenting = true;
                videoEditedInfo.hdrInfo = r6Var2.d1;
                videoEditedInfo.mixedSoundInfos.clear();
                if (r6Var2.v() && !r6Var2.Y) {
                    ArrayList<VideoEditedInfo.Part> arrayList6 = videoEditedInfo.collageParts;
                    int size3 = arrayList6.size();
                    int i24 = 0;
                    while (i24 < size3) {
                        VideoEditedInfo.Part part7 = arrayList6.get(i24);
                        i24++;
                        VideoEditedInfo.Part part8 = part7;
                        if (!part8.isVideo || part8.volume <= 0.0f || part8.muted) {
                            arrayList = arrayList6;
                        } else {
                            MediaCodecVideoConvertor.MixedSoundInfo mixedSoundInfo = new MediaCodecVideoConvertor.MixedSoundInfo(part8.path);
                            mixedSoundInfo.volume = part8.volume;
                            float f15 = part8.left;
                            float f16 = part8.duration;
                            arrayList = arrayList6;
                            mixedSoundInfo.audioOffset = ((long) (f15 * f16)) * 1000;
                            mixedSoundInfo.startTime = part8.offset * 1000;
                            mixedSoundInfo.duration = ((long) ((part8.right - f15) * f16)) * 1000;
                            videoEditedInfo.mixedSoundInfos.add(mixedSoundInfo);
                        }
                        arrayList6 = arrayList;
                    }
                }
                File file7 = r6Var2.o0;
                if (file7 != null) {
                    MediaCodecVideoConvertor.MixedSoundInfo mixedSoundInfo2 = new MediaCodecVideoConvertor.MixedSoundInfo(file7.getAbsolutePath());
                    mixedSoundInfo2.volume = r6Var2.u0;
                    float f17 = r6Var2.s0;
                    float f18 = r6Var2.q0;
                    long j24 = ((long) (f17 * f18)) * 1000;
                    mixedSoundInfo2.audioOffset = j24;
                    if (r6Var2.K) {
                        mixedSoundInfo2.startTime = ((long) (r6Var2.r0 - (r6Var2.Z * r6Var2.h0))) * 1000;
                        j12 = 0;
                    } else {
                        j12 = 0;
                        mixedSoundInfo2.startTime = 0L;
                    }
                    long j25 = mixedSoundInfo2.startTime + j10;
                    mixedSoundInfo2.startTime = j25;
                    if (j25 < j12) {
                        mixedSoundInfo2.audioOffset = j24 - j25;
                        mixedSoundInfo2.startTime = j12;
                    }
                    mixedSoundInfo2.duration = ((long) ((r6Var2.t0 - f17) * f18)) * 1000;
                    videoEditedInfo.mixedSoundInfos.add(mixedSoundInfo2);
                }
                String str7 = r6Var2.y;
                if (str7 != null) {
                    MediaCodecVideoConvertor.MixedSoundInfo mixedSoundInfo3 = new MediaCodecVideoConvertor.MixedSoundInfo(str7);
                    mixedSoundInfo3.volume = r6Var2.G;
                    float f19 = r6Var2.E;
                    float f20 = r6Var2.C;
                    long j26 = ((long) (f19 * f20)) * 1000;
                    mixedSoundInfo3.audioOffset = j26;
                    if (r6Var2.K) {
                        mixedSoundInfo3.startTime = ((long) (r6Var2.D - (r6Var2.Z * r6Var2.h0))) * 1000;
                        j11 = 0;
                    } else {
                        j11 = 0;
                        mixedSoundInfo3.startTime = 0L;
                    }
                    long j27 = mixedSoundInfo3.startTime + j10;
                    mixedSoundInfo3.startTime = j27;
                    if (j27 < j11) {
                        mixedSoundInfo3.audioOffset = j26 - j27;
                        mixedSoundInfo3.startTime = j11;
                    }
                    mixedSoundInfo3.duration = ((long) ((r6Var2.F - f19) * f20)) * 1000;
                    videoEditedInfo.mixedSoundInfos.add(mixedSoundInfo3);
                }
                callback.run(videoEditedInfo);
                break;
            case 15:
                sf.f fVar = (sf.f) obj4;
                ((ArrayDeque) fVar.b).addLast(new sf.e((mh.m5) obj3, (sf.b) obj2, (RequestTimeDelegate) obj));
                fVar.D();
                break;
            case 16:
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) obj3;
                sh.j1 j1Var = (sh.j1) obj;
                ((qh.d) obj4).setLoading(false);
                if (((TLObject) obj2) instanceof TLRPC.TL_boolTrue) {
                    h3Var.dismiss();
                    j1Var.run(Boolean.FALSE);
                    break;
                }
                break;
            case 17:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj4;
                AndroidUtilities.addToClipboard(connectedbotstarref.url);
                new org.telegram.ui.Components.qc(((org.telegram.ui.ActionBar.h3) obj3).topBulletinContainer, (org.telegram.ui.ActionBar.g6) obj2).M(LocaleController.getString(R.string.AffiliateProgramLinkCopiedTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AffiliateProgramLinkCopiedText, sh.j.G0(connectedbotstarref.commission_permille), UserObject.getUserName((TLRPC.User) obj))), R.raw.copy).j();
                break;
            case 18:
                sh.d3.x0((sh.d3) obj4, (Context) obj3, (TLRPC.User) obj2, (TL_payments.connectedBotStarRef) obj);
                break;
            case 19:
                boolean[] zArr3 = (boolean[]) obj4;
                org.telegram.ui.web.s sVar = (org.telegram.ui.web.s) obj3;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj;
                if (((TLObject) obj2) instanceof TLRPC.TL_boolTrue) {
                    userFull.bot_can_manage_emoji_status = true;
                    if (!zArr3[0]) {
                        zArr3[0] = true;
                        sVar.run(Boolean.TRUE, "allowed");
                        break;
                    }
                } else if (!zArr3[0]) {
                    zArr3[0] = true;
                    sVar.run(Boolean.TRUE, "cancelled");
                    break;
                }
                break;
            case 20:
                uf.c cVar = (uf.c) obj4;
                Location location = (Location) obj3;
                String str8 = (String) obj;
                ArrayList arrayList7 = (ArrayList) obj2;
                ArrayList arrayList8 = cVar.r;
                cVar.n = false;
                if (location == null) {
                    cVar.C = 0;
                    cVar.h = false;
                    cVar.s.clear();
                    cVar.G = false;
                    cVar.x = str8;
                }
                arrayList8.clear();
                arrayList8.addAll(arrayList7);
                cVar.l();
                break;
            case 21:
                uf.c cVar2 = (uf.c) obj4;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj3;
                String str9 = (String) obj;
                TLObject tLObject4 = (TLObject) obj2;
                ArrayList arrayList9 = cVar2.s;
                if (tL_error5 == null) {
                    cVar2.C = 0;
                    cVar2.h = false;
                    arrayList9.clear();
                    cVar2.G = false;
                    cVar2.x = str9;
                    TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject4;
                    int size4 = messages_botresults.results.size();
                    while (i13 < size4) {
                        TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i13);
                        if ("venue".equals(botInlineResult.type)) {
                            TLRPC.BotInlineMessage botInlineMessage = botInlineResult.send_message;
                            if (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaVenue) {
                                TLRPC.TL_botInlineMessageMediaVenue tL_botInlineMessageMediaVenue = (TLRPC.TL_botInlineMessageMediaVenue) botInlineMessage;
                                TLRPC.TL_messageMediaVenue tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
                                tL_messageMediaVenue.geo = tL_botInlineMessageMediaVenue.geo;
                                tL_messageMediaVenue.address = tL_botInlineMessageMediaVenue.address;
                                tL_messageMediaVenue.title = tL_botInlineMessageMediaVenue.title;
                                tL_messageMediaVenue.icon = android.support.v4.media.a.r(new StringBuilder("https://ss3.4sqi.net/img/categories_v2/"), tL_botInlineMessageMediaVenue.venue_type, "_64.png");
                                tL_messageMediaVenue.venue_type = tL_botInlineMessageMediaVenue.venue_type;
                                tL_messageMediaVenue.venue_id = tL_botInlineMessageMediaVenue.venue_id;
                                tL_messageMediaVenue.provider = tL_botInlineMessageMediaVenue.provider;
                                tL_messageMediaVenue.query_id = messages_botresults.query_id;
                                tL_messageMediaVenue.result_id = botInlineResult.id;
                                arrayList9.add(tL_messageMediaVenue);
                            }
                        }
                        i13++;
                    }
                }
                uf.b bVar2 = cVar2.y;
                if (bVar2 != null) {
                    bVar2.a(arrayList9);
                }
                cVar2.l();
                break;
            case 22:
                AndroidUtilities.runOnUIThread(new dy0((uf.k) obj4, (Runnable) obj2, (ArrayList) obj, f2.q.c((cg.a) obj3, true), 23));
                break;
            case 23:
                uf.k kVar = (uf.k) obj4;
                Runnable runnable = (Runnable) obj3;
                ArrayList arrayList10 = (ArrayList) obj2;
                f2.m mVar = (f2.m) obj;
                if (kVar.W) {
                    kVar.W = false;
                    if (runnable != null) {
                        runnable.run();
                    }
                    kVar.J = arrayList10;
                    mVar.b(kVar);
                    if (kVar.X) {
                        kVar.X = false;
                        kVar.W(runnable);
                        break;
                    }
                }
                break;
            case 24:
                vf.t tVar = (vf.t) obj4;
                TLObject tLObject5 = (TLObject) obj2;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) obj3;
                Runnable runnable2 = (Runnable) obj;
                ArrayList arrayList11 = tVar.b;
                if (tLObject5 instanceof TL_account.TL_businessChatLink) {
                    TL_account.TL_businessChatLink tL_businessChatLink2 = (TL_account.TL_businessChatLink) tLObject5;
                    int indexOf2 = arrayList11.indexOf(tL_businessChatLink);
                    if (indexOf2 != -1) {
                        arrayList11.set(indexOf2, tL_businessChatLink2);
                        NotificationCenter.getInstance(tVar.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                        tVar.f();
                        break;
                    }
                }
                break;
            case 25:
                a();
                break;
            case 26:
                vf.p1 p1Var = (vf.p1) obj4;
                ArrayList<Integer> arrayList12 = (ArrayList) obj3;
                vf.o1 o1Var = (vf.o1) obj2;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = (TLRPC.TL_messages_sendQuickReplyMessages) obj;
                int i25 = p1Var.a;
                if (arrayList12.isEmpty() || arrayList12.size() < o1Var.a()) {
                    TLRPC.TL_messages_getQuickReplyMessages tL_messages_getQuickReplyMessages = new TLRPC.TL_messages_getQuickReplyMessages();
                    tL_messages_getQuickReplyMessages.shortcut_id = o1Var.a;
                    ConnectionsManager.getInstance(i25).sendRequest(tL_messages_getQuickReplyMessages, new hg.y(p1Var, arrayList12, tL_messages_sendQuickReplyMessages, 27));
                    break;
                } else {
                    tL_messages_sendQuickReplyMessages.id = arrayList12;
                    while (i13 < arrayList12.size()) {
                        tL_messages_sendQuickReplyMessages.random_id.add(Long.valueOf(Utilities.random.nextLong()));
                        i13++;
                    }
                    ConnectionsManager.getInstance(i25).sendRequest(tL_messages_sendQuickReplyMessages, null);
                    break;
                }
                break;
            default:
                ((wh.q) obj4).r.U4((wh.a) obj3, (TL_iv.PageBlock) obj2);
                ((org.telegram.ui.Components.q70) obj).u();
                break;
        }
    }

    public /* synthetic */ dy0(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = obj3;
        this.e = obj4;
    }

    public /* synthetic */ dy0(Object obj, Object obj2, Object obj3, Object obj4, boolean z4, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public /* synthetic */ dy0(Object obj, TLObject tLObject, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = tLObject;
        this.e = obj2;
        this.d = obj3;
    }

    public /* synthetic */ dy0(TLObject tLObject, boolean[] zArr, org.telegram.ui.web.s sVar, TLRPC.UserFull userFull) {
        this.a = 19;
        this.b = tLObject;
        this.c = zArr;
        this.d = sVar;
        this.e = userFull;
    }

    public /* synthetic */ dy0(qh.r6 r6Var, String str, int[][] iArr, Utilities.Callback callback) {
        this.a = 14;
        this.c = r6Var;
        this.e = str;
        this.d = iArr;
        this.b = callback;
    }
}
