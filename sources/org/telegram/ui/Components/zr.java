package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zr implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zr(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        t70 t70Var;
        org.telegram.ui.ib ibVar;
        int i11;
        ci.x0 x0Var;
        int i12 = this.a;
        int i13 = 2;
        int i14 = 4;
        final int i15 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i12) {
            case 0:
                ds dsVar = (ds) obj2;
                dsVar.getClass();
                ((ci.d) obj).setLoading(false);
                dsVar.dismiss();
                break;
            case 1:
                ds dsVar2 = (ds) obj2;
                TLObject tLObject = (TLObject) obj;
                if (tLObject != null && (tLObject instanceof TL_phone.groupCallStreamRtmpUrl)) {
                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject;
                    dsVar2.b0 = groupcallstreamrtmpurl.url;
                    dsVar2.c0 = groupcallstreamrtmpurl.key;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(dsVar2.c0);
                    dsVar2.d0 = spannableStringBuilder;
                    t11 t11Var = new t11();
                    t11Var.a |= 256;
                    t11Var.b = 0;
                    t11Var.c = spannableStringBuilder.length();
                    dsVar2.d0.setSpan(new u11(t11Var, 0), 0, dsVar2.d0.length(), 0);
                    dsVar2.e0.N(false);
                    break;
                }
                break;
            case 2:
                gt gtVar = (gt) obj2;
                TLObject tLObject2 = (TLObject) obj;
                ct ctVar = gtVar.b;
                ArrayList arrayList = gtVar.h;
                int i16 = gtVar.a;
                if (tLObject2 instanceof TL_bots.popularAppBots) {
                    TL_bots.popularAppBots popularappbots = (TL_bots.popularAppBots) tLObject2;
                    MessagesController.getInstance(i16).putUsers(popularappbots.users, false);
                    MessagesStorage.getInstance(i16).putUsersAndChats(popularappbots.users, null, false, true);
                    arrayList.addAll(popularappbots.users);
                    String str = popularappbots.next_offset;
                    gtVar.g = str;
                    gtVar.e = str == null;
                    long currentTimeMillis = System.currentTimeMillis();
                    gtVar.f = currentTimeMillis;
                    if (!gtVar.i) {
                        gtVar.i = true;
                        String str2 = gtVar.g;
                        if (str2 == null) {
                            str2 = "";
                        }
                        String str3 = str2;
                        ArrayList arrayList2 = new ArrayList();
                        for (int i17 = 0; i17 < arrayList.size(); i17 = com.google.android.gms.internal.vision.e2.g(((TLRPC.User) arrayList.get(i17)).id, arrayList2, i17, 1)) {
                        }
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i16);
                        messagesStorage.getStorageQueue().postRunnable(new org.telegram.messenger.voip.f(gtVar, messagesStorage, arrayList2, currentTimeMillis, str3, 3));
                    }
                    gtVar.c = false;
                    ctVar.run();
                    break;
                } else {
                    gtVar.g = null;
                    gtVar.e = true;
                    gtVar.c = false;
                    ctVar.run();
                    break;
                }
            case 3:
                Bitmap decodeFile = BitmapFactory.decodeFile((String) obj);
                Canvas canvas = new Canvas(Bitmap.createBitmap(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f), Bitmap.Config.ARGB_8888));
                Paint paint = new Paint(3);
                canvas.translate(r3.getWidth() / 2.0f, r3.getHeight() / 2.0f);
                float max = Math.max(r3.getWidth() / decodeFile.getWidth(), r3.getHeight() / decodeFile.getHeight());
                canvas.scale(max, max);
                canvas.drawBitmap(decodeFile, (-decodeFile.getWidth()) / 2.0f, (-decodeFile.getHeight()) / 2.0f, paint);
                AndroidUtilities.runOnUIThread(new zr(i14, (fu) obj2, decodeFile));
                break;
            case 4:
                ((fu) obj2).setImage((Bitmap) obj);
                break;
            case 5:
                ((EditTextBoldCursor) obj2).hintLayout.draw((Canvas) obj);
                break;
            case 6:
                i10 = ((org.telegram.ui.ActionBar.f3) ((rv) obj2).a).currentAccount;
                MessagesController.getInstance(i10).updateEmojiStatus((TLRPC.EmojiStatus) obj);
                break;
            case 7:
                MessagesController.getInstance(((tx) obj2).a.c1).updateEmojiStatus((TLRPC.EmojiStatus) obj);
                break;
            case 8:
                TLObject tLObject3 = (TLObject) obj;
                a00 a00Var = ((tx) obj2).a;
                if (tLObject3 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject3;
                    MediaDataController.getInstance(a00Var.c1).putStickerSet(tL_messages_stickerSet);
                    MediaDataController.getInstance(a00Var.c1).replaceStickerSet(tL_messages_stickerSet);
                    break;
                }
                break;
            case 9:
                ry ryVar = (ry) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                ryVar.s.f = true;
                a00 a00Var2 = ryVar.E;
                if (!a00Var2.p1.contains(Long.valueOf(tL_messages_stickerSet2.set.id))) {
                    a00Var2.p1.add(Long.valueOf(tL_messages_stickerSet2.set.id));
                }
                ryVar.a(true);
                break;
            case 10:
                final yy yyVar = (yy) obj2;
                final String str4 = (String) obj;
                String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                a00 a00Var3 = yyVar.a.F;
                if (!Arrays.equals(a00Var3.W0, currentKeyboardLanguage)) {
                    MediaDataController.getInstance(a00Var3.c1).fetchNewEmojiKeywords(currentKeyboardLanguage);
                }
                a00Var3.W0 = currentKeyboardLanguage;
                ArrayList arrayList3 = new ArrayList();
                final ArrayList arrayList4 = new ArrayList();
                final ArrayList arrayList5 = new ArrayList();
                final int i18 = r6 ? 1 : 0;
                Utilities.doCallbacks(new Utilities.Callback() { // from class: org.telegram.ui.Components.xy
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj3) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList6;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList7;
                        Runnable runnable = (Runnable) obj3;
                        switch (i18) {
                            case 0:
                                yy yyVar2 = yyVar;
                                MediaDataController.getInstance(yyVar2.a.F.c1).searchStickerSets(true, str4, new ai.d5(yyVar2, arrayList5, runnable, 7));
                                break;
                            default:
                                a00 a00Var4 = yyVar.a.F;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(a00Var4.c1).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str4 + "").toLowerCase());
                                    int i19 = a00Var4.c1;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i19).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList8 = arrayList5;
                                    if (stickerSets != null) {
                                        for (int i20 = 0; i20 < stickerSets.size(); i20++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i20);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList7 = tL_messages_stickerSet3.documents) != null && !arrayList7.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.bi.w(" ", translitSafe, translitSafe2)) {
                                                    arrayList8.add(new sy(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i19).getFeaturedEmojiSets();
                                    if (featuredEmojiSets != null) {
                                        for (int i21 = 0; i21 < featuredEmojiSets.size(); i21++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i21);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.id))) {
                                                String translitSafe3 = AndroidUtilities.translitSafe(stickerSetCovered.set.title.toLowerCase());
                                                if (translitSafe3.startsWith(translitSafe) || org.telegram.messenger.bi.w(" ", translitSafe, translitSafe3)) {
                                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                                        arrayList6 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                                        TLRPC.TL_messages_stickerSet stickerSet3 = MediaDataController.getInstance(i19).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                                                        arrayList6 = stickerSet3 != null ? stickerSet3.documents : null;
                                                    } else {
                                                        arrayList6 = stickerSetCovered.covers;
                                                    }
                                                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                                                        arrayList8.add(new sy(stickerSetCovered, arrayList6));
                                                        hashSet.add(Long.valueOf(stickerSetCovered.set.id));
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                runnable.run();
                                break;
                        }
                    }
                }, new org.telegram.ui.pc(23, yyVar, str4), new Utilities.Callback() { // from class: org.telegram.ui.Components.xy
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj3) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList6;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList7;
                        Runnable runnable = (Runnable) obj3;
                        switch (i15) {
                            case 0:
                                yy yyVar2 = yyVar;
                                MediaDataController.getInstance(yyVar2.a.F.c1).searchStickerSets(true, str4, new ai.d5(yyVar2, arrayList4, runnable, 7));
                                break;
                            default:
                                a00 a00Var4 = yyVar.a.F;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(a00Var4.c1).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str4 + "").toLowerCase());
                                    int i19 = a00Var4.c1;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i19).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList8 = arrayList4;
                                    if (stickerSets != null) {
                                        for (int i20 = 0; i20 < stickerSets.size(); i20++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i20);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList7 = tL_messages_stickerSet3.documents) != null && !arrayList7.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.bi.w(" ", translitSafe, translitSafe2)) {
                                                    arrayList8.add(new sy(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i19).getFeaturedEmojiSets();
                                    if (featuredEmojiSets != null) {
                                        for (int i21 = 0; i21 < featuredEmojiSets.size(); i21++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i21);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.id))) {
                                                String translitSafe3 = AndroidUtilities.translitSafe(stickerSetCovered.set.title.toLowerCase());
                                                if (translitSafe3.startsWith(translitSafe) || org.telegram.messenger.bi.w(" ", translitSafe, translitSafe3)) {
                                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                                        arrayList6 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                                        TLRPC.TL_messages_stickerSet stickerSet3 = MediaDataController.getInstance(i19).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                                                        arrayList6 = stickerSet3 != null ? stickerSet3.documents : null;
                                                    } else {
                                                        arrayList6 = stickerSetCovered.covers;
                                                    }
                                                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                                                        arrayList8.add(new sy(stickerSetCovered, arrayList6));
                                                        hashSet.add(Long.valueOf(stickerSetCovered.set.id));
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                runnable.run();
                                break;
                        }
                    }
                }, new org.telegram.ui.pc(24, yyVar, arrayList3), new org.telegram.ui.ta(yyVar, str4, arrayList3, arrayList4, arrayList5));
                break;
            case 11:
                ArrayList arrayList6 = (ArrayList) obj;
                zy zyVar = ((yy) obj2).a;
                zyVar.F.V.e(false);
                ArrayList arrayList7 = zyVar.r;
                zyVar.E = arrayList7.size() >= arrayList6.size();
                arrayList7.clear();
                arrayList7.addAll(arrayList6);
                zyVar.l();
                break;
            case 12:
                ((ez) obj2).F((String) obj, "", true, false, false);
                break;
            case 13:
                ez ezVar = (ez) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                a00 a00Var4 = ezVar.L;
                MessagesController.getInstance(a00Var4.c1).putUsers(tL_contacts_resolvedPeer.users, false);
                int i19 = a00Var4.c1;
                MessagesController.getInstance(i19).putChats(tL_contacts_resolvedPeer.chats, false);
                MessagesStorage.getInstance(i19).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str5 = ezVar.w;
                ezVar.w = null;
                ezVar.F(str5, "", false, false, false);
                break;
            case 14:
                l00 l00Var = (l00) obj2;
                ci.k8 k8Var = (ci.k8) obj;
                l00Var.c();
                l00Var.h(k8Var);
                p00 p00Var = l00Var.J;
                p00Var.h1 = k8Var;
                p00Var.j();
                break;
            case 15:
                ((l00) obj2).J.f1 = (o00) obj;
                break;
            case 16:
                ((s10) obj2).z0 = -1;
                ((Runnable) ((Pair) obj).first).run();
                break;
            case 17:
                ((org.telegram.ui.pc) obj2).run((org.telegram.ui.ActionBar.n2) obj);
                break;
            case 18:
                m50 m50Var = (m50) obj2;
                Uri uri = (Uri) obj;
                m50Var.getClass();
                try {
                    LaunchActivity launchActivity = (LaunchActivity) m50Var.a.getParentActivity();
                    if (launchActivity == null) {
                        break;
                    } else {
                        Bundle bundle = new Bundle();
                        if (uri != null) {
                            bundle.putParcelable("photoUri", uri);
                        }
                        org.telegram.ui.nq0 nq0Var = new org.telegram.ui.nq0(bundle);
                        nq0Var.e = false;
                        nq0Var.f = false;
                        nq0Var.c = m50Var;
                        launchActivity.p0(nq0Var);
                        break;
                    }
                } catch (Exception e7) {
                    FileLog.e(e7);
                    m50Var.r(false, ImageLoader.loadBitmap(null, uri, 800.0f, 800.0f, true), null);
                    return;
                }
            case 19:
                l60 l60Var = (l60) obj2;
                h60 h60Var = (h60) obj;
                t60 t60Var = l60Var.H0;
                VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
                t60Var.S = videoEditedInfo;
                videoEditedInfo.startTime = -1L;
                videoEditedInfo.endTime = -1L;
                videoEditedInfo.estimatedSize = Math.max(1L, t60Var.Q);
                VideoEditedInfo videoEditedInfo2 = t60Var.S;
                videoEditedInfo2.roundVideo = true;
                videoEditedInfo2.file = t60Var.M;
                videoEditedInfo2.encryptedFile = t60Var.N;
                videoEditedInfo2.key = t60Var.O;
                videoEditedInfo2.iv = t60Var.P;
                videoEditedInfo2.framerate = 25;
                videoEditedInfo2.originalWidth = 360;
                videoEditedInfo2.resultWidth = 360;
                videoEditedInfo2.originalHeight = 360;
                videoEditedInfo2.resultHeight = 360;
                videoEditedInfo2.originalPath = l60Var.a.getAbsolutePath();
                VideoEditedInfo videoEditedInfo3 = t60Var.S;
                videoEditedInfo3.notReadyYet = true;
                videoEditedInfo3.thumb = t60Var.j1;
                videoEditedInfo3.estimatedDuration = t60Var.k0;
                t60Var.j1 = null;
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, l60Var.a.getAbsolutePath(), 0, true, 0, 0, 0L);
                if (h60Var != null) {
                    photoEntry.ttl = h60Var.c;
                    photoEntry.effectId = h60Var.d;
                }
                t60Var.n.r(photoEntry, t60Var.S, h60Var == null || h60Var.a, h60Var != null ? h60Var.b : 0, 0, false, h60Var != null ? h60Var.e : 0L);
                break;
            case 20:
                Bitmap bitmap = (Bitmap) obj;
                l60 l60Var2 = (l60) ((org.telegram.ui.Cells.t6) obj2).b;
                if ((bitmap == null || bitmap.getPixel(0, 0) == 0) && l60Var2.A0.size() > 1) {
                    ArrayList arrayList8 = l60Var2.A0;
                    arrayList8.add((Bitmap) hg.c.g(1, arrayList8));
                    break;
                } else {
                    l60Var2.A0.add(bitmap);
                    break;
                }
                break;
            case 21:
                t70 t70Var2 = (t70) obj2;
                TLObject tLObject4 = (TLObject) obj;
                t70Var2.getClass();
                if (tLObject4 instanceof Vector) {
                    Vector vector = (Vector) tLObject4;
                    if (!vector.objects.isEmpty()) {
                        t70Var2.c.put(Long.valueOf(t70Var2.b.admin_id), (TLRPC.User) vector.objects.get(0));
                        t70Var2.T.l();
                        break;
                    }
                }
                break;
            case 22:
                n70 n70Var = (n70) obj2;
                if (((TLRPC.TL_error) obj) == null && (ibVar = (t70Var = n70Var.a.c).j0) != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = t70Var.b;
                    org.telegram.ui.vb vbVar = ibVar.a;
                    ArrayList arrayList9 = vbVar.o0;
                    int size = arrayList9.size();
                    int i20 = vbVar.E.h;
                    TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                    TLRPC.TL_channelAdminLogEventActionExportedInviteDelete tL_channelAdminLogEventActionExportedInviteDelete = new TLRPC.TL_channelAdminLogEventActionExportedInviteDelete();
                    tL_channelAdminLogEventActionExportedInviteDelete.invite = tL_chatInviteExported;
                    tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteDelete;
                    tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                    tL_channelAdminLogEvent.user_id = vbVar.getAccountInstance().getUserConfig().clientUserId;
                    i11 = ((org.telegram.ui.ActionBar.n2) vbVar).currentAccount;
                    if (new MessageObject(i11, tL_channelAdminLogEvent, (ArrayList<MessageObject>) vbVar.n0, (HashMap<String, ArrayList<MessageObject>>) vbVar.m0, vbVar.f, vbVar.T, true).contentType >= 0) {
                        vbVar.R0();
                        int size2 = arrayList9.size() - size;
                        if (size2 > 0) {
                            vbVar.C0.N = true;
                            org.telegram.ui.rb rbVar = vbVar.E;
                            rbVar.s(rbVar.h, size2);
                            org.telegram.ui.vb.K0(vbVar);
                        }
                        vbVar.y0.remove(tL_chatInviteExported.link);
                        break;
                    }
                }
                break;
            case 23:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                ((d80) obj2).setFocusable(true);
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new r1(i13, editTextBoldCursor));
                break;
            case 24:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", ((TLRPC.ChatFull) obj2).guard_bot_id);
                ((org.telegram.ui.ip) obj).presentFragment(new ProfileActivity(bundle2, null));
                break;
            case 25:
                z90 z90Var = (z90) obj2;
                if (z90Var.O0 == ((fa0) obj)) {
                    z90Var.performLongClick();
                    z90Var.O0 = null;
                    z90Var.M0.d(true);
                    break;
                }
                break;
            case 26:
                ((ba0) obj2).l((ia0) obj, false);
                break;
            case 27:
                db0 db0Var = (db0) obj2;
                if (!((boolean[]) obj)[0] && (x0Var = db0Var.U) != null) {
                    x0Var.run();
                }
                db0Var.U = null;
                break;
            case 28:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) obj;
                ((fb0) obj2).setFocusable(true);
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.runOnUIThread(new r1(i14, editTextBoldCursor2));
                break;
            default:
                yh0 yh0Var = (yh0) obj2;
                Runnable runnable = (Runnable) obj;
                yh0Var.getClass();
                runnable.run();
                yh0Var.a.remove(runnable);
                break;
        }
    }
}
