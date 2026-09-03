package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import java.io.File;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.json.JSONObject;
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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dy0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ dy0(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = obj3;
        this.e = obj4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b9, code lost:
    
        if (r8 == null) goto L32;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int indexOf;
        int i10;
        int i11;
        boolean z4;
        char c3;
        String formatPluralString;
        org.telegram.ui.web.c1 c1Var;
        long j10;
        VideoEditedInfo.Part part;
        int i12;
        long j11;
        long j12;
        ArrayList<VideoEditedInfo.Part> arrayList;
        ArrayList arrayList2;
        int i13 = this.a;
        char c10 = 2;
        r8 = null;
        SQLiteCursor sQLiteCursor = null;
        int i14 = 0;
        Object obj = this.e;
        Object obj2 = this.b;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i13) {
            case 0:
                ProfileActivity.n0((ProfileActivity) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (String) obj);
                return;
            case 1:
                TLObject tLObject = (TLObject) obj2;
                UserConfig userConfig = (UserConfig) obj3;
                TLRPC.Photo photo = (TLRPC.Photo) obj;
                ProfileActivity profileActivity = ((vz0) obj4).b;
                dz0 dz0Var = profileActivity.k0;
                dz0Var.Z0--;
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
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 2:
                TLObject tLObject2 = (TLObject) obj2;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                ProfileActivity profileActivity2 = ((g01) obj4).c.e;
                profileActivity2.M4(null);
                if (!(tLObject2 instanceof TL_fragment.TL_collectibleInfo)) {
                    org.telegram.ui.Components.qc.b0(tL_error);
                    return;
                }
                TLObject user2 = profileActivity2.b1 != 0 ? profileActivity2.getMessagesController().getUser(Long.valueOf(profileActivity2.b1)) : profileActivity2.getMessagesController().getChat(Long.valueOf(profileActivity2.c1));
                if (profileActivity2.getParentActivity() == null) {
                    return;
                }
                f20.a(profileActivity2.getParentActivity(), 0, tL_username.username, user2, (TL_fragment.TL_collectibleInfo) tLObject2, profileActivity2.w0);
                return;
            case 3:
                SessionsActivity sessionsActivity = (SessionsActivity) obj4;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj3;
                TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) obj;
                sessionsActivity.getClass();
                try {
                    d2Var.dismiss();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                if (tL_error2 == null) {
                    sessionsActivity.e.remove(tL_webAuthorization);
                    sessionsActivity.m0();
                    i81 i81Var = sessionsActivity.a;
                    if (i81Var != null) {
                        i81Var.l();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                SessionsActivity sessionsActivity2 = (SessionsActivity) obj4;
                org.telegram.ui.ActionBar.d2 d2Var2 = (org.telegram.ui.ActionBar.d2) obj2;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj3;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) obj;
                sessionsActivity2.getClass();
                try {
                    d2Var2.dismiss();
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
                if (tL_error3 == null) {
                    sessionsActivity2.e.remove(tL_authorization);
                    sessionsActivity2.f.remove(tL_authorization);
                    sessionsActivity2.m0();
                    i81 i81Var2 = sessionsActivity2.a;
                    if (i81Var2 != null) {
                        i81Var2.l();
                        return;
                    }
                    return;
                }
                return;
            case 5:
                h81 h81Var = (h81) obj4;
                h81Var.a = (TLObject) obj2;
                h81Var.b = (TLRPC.TL_error) obj3;
                ((o9) obj).run();
                return;
            case 6:
                w81.b0((w81) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (String) obj);
                return;
            case 7:
                z91 z91Var = (z91) obj4;
                wf.b bVar = (wf.b) obj3;
                String str = (String) obj;
                na1 na1Var = (na1) obj2;
                oa1 oa1Var = z91Var.w;
                if (bVar != null) {
                    oa1Var.S.put(str, bVar);
                }
                if (bVar != null && !na1Var.b && (i10 = na1Var.a) >= 0) {
                    View m9 = oa1Var.R.m(i10);
                    if (m9 instanceof z91) {
                        z91Var.r.e = bVar;
                        z91 z91Var2 = (z91) m9;
                        z91Var2.b.q0.d(false, false);
                        z91Var2.g(false);
                    }
                }
                oa1.Z(oa1Var);
                return;
            case 8:
                aa1 aa1Var = (aa1) obj4;
                aa1Var.k = false;
                aa1Var.d = (wf.b) obj3;
                aa1Var.g = (String) obj;
                y91 y91Var = (y91) ((Utilities.Callback0Return) obj2).run();
                if (y91Var != null) {
                    y91Var.e(aa1Var, true);
                    return;
                }
                return;
            case 9:
                TLObject tLObject3 = (TLObject) obj2;
                String str2 = (String) obj;
                org.telegram.ui.ActionBar.d2 d2Var3 = (org.telegram.ui.ActionBar.d2) obj3;
                ne1 ne1Var = ((je1) obj4).a;
                if (tLObject3 != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject3;
                    for (int i15 = 0; i15 < updates.updates.size(); i15++) {
                        if (updates.updates.get(i15) instanceof TL_update.TL_updateMessageID) {
                            TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) updates.updates.get(i15);
                            TLRPC.TL_messageActionTopicCreate tL_messageActionTopicCreate = new TLRPC.TL_messageActionTopicCreate();
                            tL_messageActionTopicCreate.title = str2;
                            TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                            tL_messageService.action = tL_messageActionTopicCreate;
                            tL_messageService.peer_id = ne1Var.getMessagesController().getPeer(ne1Var.a);
                            tL_messageService.dialog_id = ne1Var.a;
                            tL_messageService.id = tL_updateMessageID.id;
                            tL_messageService.date = (int) (System.currentTimeMillis() / 1000);
                            ArrayList arrayList4 = new ArrayList();
                            i11 = ((org.telegram.ui.ActionBar.p2) ne1Var).currentAccount;
                            arrayList4.add(new MessageObject(i11, tL_messageService, false, false));
                            TLRPC.Chat chat = ne1Var.getMessagesController().getChat(Long.valueOf(-ne1Var.a));
                            TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
                            tL_forumTopic.id = tL_updateMessageID.id;
                            long j13 = ne1Var.b;
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
                            tL_forumTopic.from_id = ne1Var.getMessagesController().getPeer(ne1Var.getUserConfig().clientUserId);
                            tL_forumTopic.notify_settings = new TLRPC.TL_peerNotifySettings();
                            tL_forumTopic.icon_color = ne1Var.B;
                            zn znVar = ne1Var.y;
                            if (znVar != null) {
                                znVar.La();
                                znVar.Pa();
                                znVar.pb(arrayList4, chat, tL_messageService.id, 1, 1, tL_forumTopic);
                                znVar.c = true;
                                znVar.r8();
                                znVar.Nc(true);
                                znVar.X0.n(true);
                                znVar.Tc();
                                znVar.O1.setCurrentTopic(znVar.d());
                                znVar.Qc(true);
                                znVar.hc(true);
                                znVar.e9(true);
                                znVar.A6(true, true);
                                znVar.Ea();
                                ne1Var.getMessagesController().getTopicsController().onTopicCreated(ne1Var.a, tL_forumTopic, true);
                                ne1Var.finishFragment();
                            } else {
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", -ne1Var.a);
                                bundle.putInt("message_id", 1);
                                bundle.putInt("unread_count", 0);
                                bundle.putBoolean("historyPreloaded", false);
                                zn znVar2 = new zn(bundle);
                                znVar2.pb(arrayList4, chat, tL_messageService.id, 1, 1, tL_forumTopic);
                                znVar2.c = true;
                                ne1Var.getMessagesController().getTopicsController().onTopicCreated(ne1Var.a, tL_forumTopic, true);
                                ne1Var.presentFragment(znVar2);
                            }
                        }
                    }
                }
                d2Var3.dismiss();
                return;
            case 10:
                TwoStepVerificationActivity.e0((TwoStepVerificationActivity) obj4, (byte[]) obj3, (TLObject) obj2, (byte[]) obj);
                return;
            case 11:
                wg1 wg1Var = (wg1) obj4;
                String str3 = (String) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj3;
                if (((TLObject) obj2) instanceof TLRPC.TL_boolTrue) {
                    wg1Var.u0(new b11(29, wg1Var, str3));
                    return;
                }
                if (tL_error4 == null || tL_error4.text.startsWith("CODE_INVALID")) {
                    wg1Var.y0();
                    return;
                }
                if (!tL_error4.text.startsWith("FLOOD_WAIT")) {
                    wg1Var.G0(LocaleController.getString(R.string.TwoStepVerificationTitle), tL_error4.text);
                    return;
                }
                int intValue = Utilities.parseInt((CharSequence) tL_error4.text).intValue();
                if (intValue < 60) {
                    c3 = 0;
                    formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
                } else {
                    c3 = 0;
                    formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
                }
                String string = LocaleController.getString(R.string.TwoStepVerificationTitle);
                int i16 = R.string.FloodWaitTime;
                Object[] objArr = new Object[1];
                objArr[c3] = formatPluralString;
                wg1Var.G0(string, LocaleController.formatString("FloodWaitTime", i16, objArr));
                return;
            case 12:
                org.telegram.ui.web.y0 y0Var = (org.telegram.ui.web.y0) obj4;
                nh.j7 j7Var = (nh.j7) obj3;
                String str4 = (String) obj;
                JSONObject jSONObject = (JSONObject) obj2;
                if (y0Var.c && ((c1Var = y0Var.N) == null || !c1Var.p(j7Var))) {
                    FileLog.d("notifyEvent " + str4 + " dropped after document change");
                    return;
                }
                y0Var.d("window.Telegram.WebView.receiveEvent('" + str4 + "', " + jSONObject + ");");
                return;
            case 13:
                ph.k5 k5Var = (ph.k5) obj4;
                Bitmap[] bitmapArr = (Bitmap[]) obj3;
                ph.t6 t6Var = (ph.t6) obj2;
                boolean[] zArr = (boolean[]) obj;
                org.telegram.ui.Components.ba baVar = k5Var.D;
                Bitmap bitmap = k5Var.a;
                if (bitmap != null && !bitmap.isRecycled()) {
                    k5Var.a.recycle();
                }
                Bitmap bitmap2 = bitmapArr[0];
                k5Var.a = bitmap2;
                if (t6Var != null && !t6Var.c && t6Var.K && bitmap2 != null) {
                    t6Var.k0 = bitmap2.getWidth();
                    t6Var.l0 = k5Var.a.getHeight();
                    t6Var.A();
                }
                if (zArr[0] && t6Var != null && baVar != null && k5Var.a != null) {
                    baVar.e();
                    baVar.f(t6Var.b(k5Var.a, 0.2f), false);
                    ph.g8 g8Var = k5Var.v;
                    if (g8Var != null) {
                        g8Var.run();
                    }
                }
                k5Var.r();
                k5Var.invalidate();
                return;
            case 14:
                ph.t6 t6Var2 = (ph.t6) obj4;
                String str5 = (String) obj;
                int[][] iArr = (int[][]) obj3;
                Utilities.Callback callback = (Utilities.Callback) obj2;
                t6Var2.getClass();
                VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
                videoEditedInfo.isStory = true;
                videoEditedInfo.fromCamera = t6Var2.c1;
                videoEditedInfo.originalWidth = t6Var2.k0;
                videoEditedInfo.originalHeight = t6Var2.l0;
                videoEditedInfo.resultWidth = t6Var2.i0;
                videoEditedInfo.resultHeight = t6Var2.j0;
                File file = t6Var2.P0;
                videoEditedInfo.paintPath = file == null ? null : file.getPath();
                File file2 = t6Var2.W0;
                videoEditedInfo.messagePath = file2 == null ? null : file2.getPath();
                File file3 = t6Var2.X0;
                videoEditedInfo.messageVideoMaskPath = file3 == null ? null : file3.getPath();
                File file4 = t6Var2.Y0;
                videoEditedInfo.backgroundPath = file4 == null ? null : file4.getPath();
                int extractRealEncoderBitrate = MediaController.extractRealEncoderBitrate(videoEditedInfo.resultWidth, videoEditedInfo.resultHeight, videoEditedInfo.bitrate, true);
                if (!t6Var2.K || str5 == null || t6Var2.v()) {
                    File file5 = t6Var2.Z0;
                    if (file5 != null) {
                        videoEditedInfo.originalPath = file5.getAbsolutePath();
                    } else {
                        videoEditedInfo.originalPath = str5;
                    }
                    videoEditedInfo.isPhoto = true;
                    videoEditedInfo.collage = t6Var2.S;
                    if (t6Var2.v()) {
                        int i17 = 0;
                        boolean z10 = false;
                        while (i17 < t6Var2.T.size()) {
                            ph.t6 t6Var3 = (ph.t6) t6Var2.T.get(i17);
                            if (t6Var3.K) {
                                t6Var3.k0 = Math.max(t6Var3.k0, iArr[i17][1]);
                                t6Var3.l0 = Math.max(t6Var3.l0, iArr[i17][c10]);
                                t6Var3.h0 = Math.max(t6Var3.h0, iArr[i17][4]);
                                z10 = true;
                            }
                            i17++;
                            c10 = 2;
                        }
                        ArrayList<VideoEditedInfo.Part> parts = VideoEditedInfo.Part.toParts(t6Var2);
                        videoEditedInfo.collageParts = parts;
                        if (z10) {
                            int size = parts.size();
                            long j14 = 0;
                            int i18 = 0;
                            VideoEditedInfo.Part part2 = null;
                            while (i18 < size) {
                                VideoEditedInfo.Part part3 = parts.get(i18);
                                i18++;
                                VideoEditedInfo.Part part4 = part3;
                                if (part4.isVideo) {
                                    i12 = size;
                                    long j15 = part4.duration;
                                    if (j15 > j14) {
                                        j14 = j15;
                                        part2 = part4;
                                    }
                                } else {
                                    i12 = size;
                                }
                                size = i12;
                            }
                            if (part2 != null) {
                                float f10 = part2.duration;
                                float f11 = part2.right;
                                float f12 = part2.left;
                                long j16 = (long) ((f11 - f12) * f10);
                                t6Var2.h0 = j16;
                                videoEditedInfo.originalDuration = j16;
                                videoEditedInfo.estimatedDuration = j16;
                                j10 = -(part2.offset + ((long) (f12 * f10)));
                                part2.offset = j10;
                                ArrayList<VideoEditedInfo.Part> arrayList5 = videoEditedInfo.collageParts;
                                int size2 = arrayList5.size();
                                int i19 = 0;
                                while (i19 < size2) {
                                    VideoEditedInfo.Part part5 = arrayList5.get(i19);
                                    i19++;
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
                                videoEditedInfo.estimatedSize = (long) (((t6Var2.h0 / 1000.0f) * extractRealEncoderBitrate) / 8.0f);
                                videoEditedInfo.filterState = null;
                            }
                        } else {
                            long j17 = t6Var2.S0;
                            t6Var2.h0 = j17;
                            videoEditedInfo.originalDuration = j17;
                            videoEditedInfo.estimatedDuration = j17;
                        }
                    } else if (t6Var2.o0 != null) {
                        long j18 = (long) ((t6Var2.t0 - t6Var2.s0) * t6Var2.q0);
                        t6Var2.h0 = j18;
                        videoEditedInfo.originalDuration = j18;
                        videoEditedInfo.estimatedDuration = j18;
                    } else if (t6Var2.y != null) {
                        long j19 = (long) ((t6Var2.F - t6Var2.E) * t6Var2.C);
                        t6Var2.h0 = j19;
                        videoEditedInfo.originalDuration = j19;
                        videoEditedInfo.estimatedDuration = j19;
                    } else {
                        long j20 = t6Var2.S0;
                        t6Var2.h0 = j20;
                        videoEditedInfo.originalDuration = j20;
                        videoEditedInfo.estimatedDuration = j20;
                    }
                    j10 = 0;
                    videoEditedInfo.startTime = -1L;
                    videoEditedInfo.endTime = -1L;
                    videoEditedInfo.muted = true;
                    videoEditedInfo.originalBitrate = -1;
                    videoEditedInfo.volume = 1.0f;
                    videoEditedInfo.bitrate = -1;
                    videoEditedInfo.framerate = 30;
                    videoEditedInfo.estimatedSize = (long) (((t6Var2.h0 / 1000.0f) * extractRealEncoderBitrate) / 8.0f);
                    videoEditedInfo.filterState = null;
                } else {
                    videoEditedInfo.originalPath = str5;
                    videoEditedInfo.isPhoto = false;
                    videoEditedInfo.framerate = Math.min(59, iArr[0][7]);
                    int videoBitrate = MediaController.getVideoBitrate(str5);
                    if (videoBitrate == -1) {
                        videoBitrate = iArr[0][3];
                    }
                    videoEditedInfo.originalBitrate = videoBitrate;
                    if (videoBitrate >= 1000000 || (arrayList2 = t6Var2.T0) == null || arrayList2.isEmpty()) {
                        int i20 = videoEditedInfo.originalBitrate;
                        if (i20 < 500000) {
                            videoEditedInfo.bitrate = 2500000;
                            videoEditedInfo.originalBitrate = -1;
                        } else {
                            videoEditedInfo.bitrate = Utilities.clamp(i20, 3000000, 500000);
                        }
                    } else {
                        videoEditedInfo.bitrate = 2000000;
                        videoEditedInfo.originalBitrate = -1;
                    }
                    StringBuilder sb = new StringBuilder("story bitrate, original = ");
                    sb.append(videoEditedInfo.originalBitrate);
                    sb.append(" => ");
                    kf.k0.t(videoEditedInfo.bitrate, sb);
                    int i21 = iArr[0][4];
                    long j21 = i21;
                    t6Var2.h0 = j21;
                    videoEditedInfo.originalDuration = j21 * 1000;
                    float f13 = j21;
                    long j22 = ((long) (t6Var2.Z * f13)) * 1000;
                    videoEditedInfo.startTime = j22;
                    long j23 = ((long) (t6Var2.a0 * f13)) * 1000;
                    videoEditedInfo.endTime = j23;
                    videoEditedInfo.estimatedDuration = j23 - j22;
                    videoEditedInfo.volume = t6Var2.P;
                    videoEditedInfo.muted = t6Var2.Y;
                    videoEditedInfo.estimatedSize = (long) android.support.v4.media.a.d(i21 / 1000.0f, extractRealEncoderBitrate, 8.0f, r3[5]);
                    videoEditedInfo.estimatedSize = Math.max(t6Var2.L.length(), videoEditedInfo.estimatedSize);
                    videoEditedInfo.filterState = t6Var2.a1;
                    File file6 = t6Var2.Q0;
                    videoEditedInfo.blurPath = file6 != null ? file6.getPath() : null;
                    j10 = 0;
                }
                videoEditedInfo.account = t6Var2.a;
                videoEditedInfo.wallpaperPeerId = t6Var2.z0;
                videoEditedInfo.isDark = t6Var2.y0;
                videoEditedInfo.avatarStartTime = -1L;
                MediaController.CropState cropState = t6Var2.m0;
                if (cropState != null) {
                    videoEditedInfo.cropState = cropState.clone();
                } else {
                    videoEditedInfo.cropState = new MediaController.CropState();
                }
                videoEditedInfo.cropState.useMatrix = new Matrix();
                videoEditedInfo.cropState.useMatrix.set(t6Var2.n0);
                videoEditedInfo.mediaEntities = t6Var2.T0;
                videoEditedInfo.gradientTopColor = Integer.valueOf(t6Var2.A0);
                videoEditedInfo.gradientBottomColor = Integer.valueOf(t6Var2.B0);
                videoEditedInfo.forceFragmenting = true;
                videoEditedInfo.hdrInfo = t6Var2.d1;
                videoEditedInfo.mixedSoundInfos.clear();
                if (t6Var2.v() && !t6Var2.Y) {
                    ArrayList<VideoEditedInfo.Part> arrayList6 = videoEditedInfo.collageParts;
                    int size3 = arrayList6.size();
                    int i22 = 0;
                    while (i22 < size3) {
                        VideoEditedInfo.Part part7 = arrayList6.get(i22);
                        i22++;
                        VideoEditedInfo.Part part8 = part7;
                        if (!part8.isVideo || part8.volume <= 0.0f || part8.muted) {
                            arrayList = arrayList6;
                        } else {
                            MediaCodecVideoConvertor.MixedSoundInfo mixedSoundInfo = new MediaCodecVideoConvertor.MixedSoundInfo(part8.path);
                            mixedSoundInfo.volume = part8.volume;
                            float f14 = part8.left;
                            arrayList = arrayList6;
                            float f15 = part8.duration;
                            mixedSoundInfo.audioOffset = ((long) (f14 * f15)) * 1000;
                            mixedSoundInfo.startTime = part8.offset * 1000;
                            mixedSoundInfo.duration = ((long) ((part8.right - f14) * f15)) * 1000;
                            videoEditedInfo.mixedSoundInfos.add(mixedSoundInfo);
                        }
                        arrayList6 = arrayList;
                    }
                }
                File file7 = t6Var2.o0;
                if (file7 != null) {
                    MediaCodecVideoConvertor.MixedSoundInfo mixedSoundInfo2 = new MediaCodecVideoConvertor.MixedSoundInfo(file7.getAbsolutePath());
                    mixedSoundInfo2.volume = t6Var2.u0;
                    float f16 = t6Var2.s0;
                    float f17 = t6Var2.q0;
                    long j24 = ((long) (f16 * f17)) * 1000;
                    mixedSoundInfo2.audioOffset = j24;
                    if (t6Var2.K) {
                        mixedSoundInfo2.startTime = ((long) (t6Var2.r0 - (t6Var2.Z * t6Var2.h0))) * 1000;
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
                    mixedSoundInfo2.duration = ((long) ((t6Var2.t0 - f16) * f17)) * 1000;
                    videoEditedInfo.mixedSoundInfos.add(mixedSoundInfo2);
                }
                String str6 = t6Var2.y;
                if (str6 != null) {
                    MediaCodecVideoConvertor.MixedSoundInfo mixedSoundInfo3 = new MediaCodecVideoConvertor.MixedSoundInfo(str6);
                    mixedSoundInfo3.volume = t6Var2.G;
                    float f18 = t6Var2.E;
                    float f19 = t6Var2.C;
                    long j26 = ((long) (f18 * f19)) * 1000;
                    mixedSoundInfo3.audioOffset = j26;
                    if (t6Var2.K) {
                        mixedSoundInfo3.startTime = ((long) (t6Var2.D - (t6Var2.Z * t6Var2.h0))) * 1000;
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
                    mixedSoundInfo3.duration = ((long) ((t6Var2.F - f18) * f19)) * 1000;
                    videoEditedInfo.mixedSoundInfos.add(mixedSoundInfo3);
                }
                callback.run(videoEditedInfo);
                return;
            case 15:
                rf.f fVar = (rf.f) obj4;
                ((ArrayDeque) fVar.b).addLast(new rf.e((lh.m5) obj3, (rf.b) obj2, (RequestTimeDelegate) obj));
                fVar.D();
                return;
            case 16:
                org.telegram.ui.ActionBar.g3 g3Var = (org.telegram.ui.ActionBar.g3) obj3;
                rh.j1 j1Var = (rh.j1) obj;
                ((ph.d) obj4).setLoading(false);
                if (((TLObject) obj2) instanceof TLRPC.TL_boolTrue) {
                    g3Var.dismiss();
                    j1Var.run(Boolean.FALSE);
                    return;
                }
                return;
            case 17:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj4;
                AndroidUtilities.addToClipboard(connectedbotstarref.url);
                new org.telegram.ui.Components.qc(((org.telegram.ui.ActionBar.g3) obj3).topBulletinContainer, (org.telegram.ui.ActionBar.f6) obj2).M(LocaleController.getString(R.string.AffiliateProgramLinkCopiedTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AffiliateProgramLinkCopiedText, rh.j.G0(connectedbotstarref.commission_permille), UserObject.getUserName((TLRPC.User) obj))), R.raw.copy).j();
                return;
            case 18:
                rh.d3.x0((rh.d3) obj4, (Context) obj3, (TLRPC.User) obj2, (TL_payments.connectedBotStarRef) obj);
                return;
            case 19:
                boolean[] zArr2 = (boolean[]) obj4;
                org.telegram.ui.web.r rVar = (org.telegram.ui.web.r) obj3;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj;
                if (!(((TLObject) obj2) instanceof TLRPC.TL_boolTrue)) {
                    if (zArr2[0]) {
                        return;
                    }
                    zArr2[0] = true;
                    rVar.run(Boolean.TRUE, "cancelled");
                    return;
                }
                userFull.bot_can_manage_emoji_status = true;
                if (zArr2[0]) {
                    return;
                }
                zArr2[0] = true;
                rVar.run(Boolean.TRUE, "allowed");
                return;
            case 20:
                tf.c cVar = (tf.c) obj4;
                Location location = (Location) obj3;
                String str7 = (String) obj;
                ArrayList arrayList7 = (ArrayList) obj2;
                ArrayList arrayList8 = cVar.r;
                cVar.n = false;
                if (location == null) {
                    cVar.C = 0;
                    cVar.h = false;
                    cVar.s.clear();
                    cVar.G = false;
                    cVar.x = str7;
                }
                arrayList8.clear();
                arrayList8.addAll(arrayList7);
                cVar.l();
                return;
            case 21:
                tf.c cVar2 = (tf.c) obj4;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj3;
                String str8 = (String) obj;
                TLObject tLObject4 = (TLObject) obj2;
                ArrayList arrayList9 = cVar2.s;
                if (tL_error5 == null) {
                    cVar2.C = 0;
                    cVar2.h = false;
                    arrayList9.clear();
                    cVar2.G = false;
                    cVar2.x = str8;
                    TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject4;
                    int size4 = messages_botresults.results.size();
                    while (i14 < size4) {
                        TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i14);
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
                        i14++;
                    }
                }
                tf.b bVar2 = cVar2.y;
                if (bVar2 != null) {
                    bVar2.a(arrayList9);
                }
                cVar2.l();
                return;
            case 22:
                AndroidUtilities.runOnUIThread(new dy0((tf.k) obj4, (Runnable) obj2, (ArrayList) obj, f2.q.c((bg.a) obj3, true), 23));
                return;
            case 23:
                tf.k kVar = (tf.k) obj4;
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
                        return;
                    }
                    return;
                }
                return;
            case 24:
                uf.t tVar = (uf.t) obj4;
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
                        return;
                    }
                    return;
                }
                return;
            case 25:
                uf.p1 p1Var = (uf.p1) obj4;
                MessagesStorage messagesStorage = (MessagesStorage) obj3;
                uf.o1 o1Var = (uf.o1) obj2;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = (TLRPC.TL_messages_sendQuickReplyMessages) obj;
                ArrayList arrayList12 = new ArrayList();
                try {
                    try {
                        sQLiteCursor = messagesStorage.getDatabase().queryFinalized("SELECT id FROM quick_replies_messages WHERE topic_id = ?", Integer.valueOf(o1Var.a));
                        while (sQLiteCursor.next()) {
                            arrayList12.add(Integer.valueOf(sQLiteCursor.intValue(0)));
                        }
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        break;
                    }
                    sQLiteCursor.dispose();
                    AndroidUtilities.runOnUIThread(new dy0(p1Var, arrayList12, o1Var, tL_messages_sendQuickReplyMessages, 26));
                    return;
                } catch (Throwable th2) {
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                    throw th2;
                }
            case 26:
                uf.p1 p1Var2 = (uf.p1) obj4;
                ArrayList<Integer> arrayList13 = (ArrayList) obj3;
                uf.o1 o1Var2 = (uf.o1) obj2;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages2 = (TLRPC.TL_messages_sendQuickReplyMessages) obj;
                int i23 = p1Var2.a;
                if (arrayList13.isEmpty() || arrayList13.size() < o1Var2.a()) {
                    TLRPC.TL_messages_getQuickReplyMessages tL_messages_getQuickReplyMessages = new TLRPC.TL_messages_getQuickReplyMessages();
                    tL_messages_getQuickReplyMessages.shortcut_id = o1Var2.a;
                    ConnectionsManager.getInstance(i23).sendRequest(tL_messages_getQuickReplyMessages, new gg.y(p1Var2, arrayList13, tL_messages_sendQuickReplyMessages2, 26));
                    return;
                } else {
                    tL_messages_sendQuickReplyMessages2.id = arrayList13;
                    while (i14 < arrayList13.size()) {
                        tL_messages_sendQuickReplyMessages2.random_id.add(Long.valueOf(Utilities.random.nextLong()));
                        i14++;
                    }
                    ConnectionsManager.getInstance(i23).sendRequest(tL_messages_sendQuickReplyMessages2, null);
                    return;
                }
            default:
                ((vh.q) obj4).r.U4((vh.a) obj3, (TL_iv.PageBlock) obj2);
                ((org.telegram.ui.Components.p70) obj).u();
                return;
        }
    }

    public /* synthetic */ dy0(Object obj, Object obj2, Object obj3, Object obj4, boolean z4, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public /* synthetic */ dy0(Object obj, Object obj2, String str, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = str;
        this.b = obj3;
    }

    public /* synthetic */ dy0(Object obj, TLObject tLObject, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = tLObject;
        this.e = obj2;
        this.d = obj3;
    }

    public /* synthetic */ dy0(TLObject tLObject, boolean[] zArr, org.telegram.ui.web.r rVar, TLRPC.UserFull userFull) {
        this.a = 19;
        this.b = tLObject;
        this.c = zArr;
        this.d = rVar;
        this.e = userFull;
    }

    public /* synthetic */ dy0(ph.t6 t6Var, String str, int[][] iArr, Utilities.Callback callback) {
        this.a = 14;
        this.c = t6Var;
        this.e = str;
        this.d = iArr;
        this.b = callback;
    }
}
