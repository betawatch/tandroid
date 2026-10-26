package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;
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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class so implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ so(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ys ysVar;
        int i10;
        n70 n70Var;
        org.telegram.ui.jb jbVar;
        int i11;
        int i12 = this.a;
        String str = "";
        final int i13 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i12) {
            case 0:
                vo.a(((to) obj2).c);
                ((jg.g) obj).run();
                break;
            case 1:
                ((up) obj2).b.C((List) obj);
                break;
            case 2:
                ((vp) obj2).b.C((List) obj);
                break;
            case 3:
                ((org.telegram.ui.ActionBar.k3) obj2).dismiss();
                qf.d.r((Context) obj, "https://t.me/BotFather?start=deletebot");
                break;
            case 4:
                org.telegram.ui.Cells.g3 g3Var = (org.telegram.ui.Cells.g3) obj2;
                TreeSet treeSet = (TreeSet) obj;
                String charSequence = g3Var.getText().toString();
                if (!pr.a(charSequence, "bot") && pr.c(charSequence, treeSet) == null) {
                    str = "bot";
                }
                org.telegram.ui.Cells.e3 e3Var = g3Var.d;
                e3Var.setRightText(str);
                e3Var.setPadding(0, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(TextUtils.isEmpty(str) ? 21.0f : 63.0f), AndroidUtilities.dp(15.0f));
                break;
            case 5:
                zr zrVar = (zr) obj2;
                zrVar.getClass();
                ((fi.d) obj).setLoading(false);
                zrVar.dismiss();
                break;
            case 6:
                zr zrVar2 = (zr) obj2;
                TLObject tLObject = (TLObject) obj;
                if (tLObject != null && (tLObject instanceof TL_phone.groupCallStreamRtmpUrl)) {
                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject;
                    zrVar2.b0 = groupcallstreamrtmpurl.url;
                    zrVar2.c0 = groupcallstreamrtmpurl.key;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(zrVar2.c0);
                    zrVar2.d0 = spannableStringBuilder;
                    y11 y11Var = new y11();
                    y11Var.a |= 256;
                    y11Var.b = 0;
                    y11Var.c = spannableStringBuilder.length();
                    zrVar2.d0.setSpan(new z11(y11Var, 0), 0, zrVar2.d0.length(), 0);
                    zrVar2.e0.O(false);
                    break;
                }
                break;
            case 7:
                bt btVar = (bt) obj2;
                TLObject tLObject2 = (TLObject) obj;
                ys ysVar2 = btVar.b;
                ArrayList arrayList = btVar.h;
                int i14 = btVar.a;
                if (!(tLObject2 instanceof TL_bots.popularAppBots)) {
                    btVar.g = null;
                    btVar.e = true;
                    btVar.c = false;
                    ysVar2.run();
                    break;
                } else {
                    TL_bots.popularAppBots popularappbots = (TL_bots.popularAppBots) tLObject2;
                    MessagesController.getInstance(i14).putUsers(popularappbots.users, false);
                    MessagesStorage.getInstance(i14).putUsersAndChats(popularappbots.users, null, false, true);
                    arrayList.addAll(popularappbots.users);
                    String str2 = popularappbots.next_offset;
                    btVar.g = str2;
                    btVar.e = str2 == null;
                    long currentTimeMillis = System.currentTimeMillis();
                    btVar.f = currentTimeMillis;
                    if (btVar.i) {
                        ysVar = ysVar2;
                    } else {
                        btVar.i = true;
                        String str3 = btVar.g;
                        String str4 = str3 == null ? "" : str3;
                        ArrayList arrayList2 = new ArrayList();
                        int i15 = 0;
                        while (i15 < arrayList.size()) {
                            i15 = c3.h0.j(((TLRPC.User) arrayList.get(i15)).id, arrayList2, i15, 1);
                            ysVar2 = ysVar2;
                        }
                        ysVar = ysVar2;
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i14);
                        messagesStorage.getStorageQueue().postRunnable(new bi.a0(btVar, messagesStorage, arrayList2, currentTimeMillis, str4, 11));
                    }
                    btVar.c = false;
                    ysVar.run();
                    break;
                }
            case 8:
                Bitmap decodeFile = BitmapFactory.decodeFile((String) obj);
                Canvas canvas = new Canvas(Bitmap.createBitmap(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f), Bitmap.Config.ARGB_8888));
                Paint paint = new Paint(3);
                canvas.translate(r2.getWidth() / 2.0f, r2.getHeight() / 2.0f);
                float max = Math.max(r2.getWidth() / decodeFile.getWidth(), r2.getHeight() / decodeFile.getHeight());
                canvas.scale(max, max);
                canvas.drawBitmap(decodeFile, (-decodeFile.getWidth()) / 2.0f, (-decodeFile.getHeight()) / 2.0f, paint);
                AndroidUtilities.runOnUIThread(new so(9, (zt) obj2, decodeFile));
                break;
            case 9:
                ((zt) obj2).setImage((Bitmap) obj);
                break;
            case 10:
                ((EditTextBoldCursor) obj2).hintLayout.draw((Canvas) obj);
                break;
            case 11:
                i10 = ((org.telegram.ui.ActionBar.k3) ((jv) obj2).a).currentAccount;
                MessagesController.getInstance(i10).updateEmojiStatus((TLRPC.EmojiStatus) obj);
                break;
            case 12:
                MessagesController.getInstance(((lx) obj2).a.c1).updateEmojiStatus((TLRPC.EmojiStatus) obj);
                break;
            case 13:
                TLObject tLObject3 = (TLObject) obj;
                sz szVar = ((lx) obj2).a;
                if (tLObject3 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject3;
                    MediaDataController.getInstance(szVar.c1).putStickerSet(tL_messages_stickerSet);
                    MediaDataController.getInstance(szVar.c1).replaceStickerSet(tL_messages_stickerSet);
                    break;
                }
                break;
            case 14:
                iy iyVar = (iy) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                iyVar.w.f = true;
                sz szVar2 = iyVar.G;
                if (!szVar2.p1.contains(Long.valueOf(tL_messages_stickerSet2.set.id))) {
                    szVar2.p1.add(Long.valueOf(tL_messages_stickerSet2.set.id));
                }
                iyVar.a(true);
                break;
            case 15:
                final ry ryVar = (ry) obj2;
                final String str5 = (String) obj;
                String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                sz szVar3 = ryVar.a.F;
                if (!Arrays.equals(szVar3.W0, currentKeyboardLanguage)) {
                    MediaDataController.getInstance(szVar3.c1).fetchNewEmojiKeywords(currentKeyboardLanguage);
                }
                szVar3.W0 = currentKeyboardLanguage;
                ArrayList arrayList3 = new ArrayList();
                final ArrayList arrayList4 = new ArrayList();
                final ArrayList arrayList5 = new ArrayList();
                final int i16 = r5 ? 1 : 0;
                Utilities.doCallbacks(new Utilities.Callback() { // from class: org.telegram.ui.Components.py
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj3) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList6;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList7;
                        Runnable runnable = (Runnable) obj3;
                        switch (i16) {
                            case 0:
                                ry ryVar2 = ryVar;
                                MediaDataController.getInstance(ryVar2.a.F.c1).searchStickerSets(true, str5, new bi.v3(ryVar2, arrayList5, runnable, 8));
                                break;
                            default:
                                sz szVar4 = ryVar.a.F;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(szVar4.c1).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str5 + "").toLowerCase());
                                    int i17 = szVar4.c1;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i17).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList8 = arrayList5;
                                    if (stickerSets != null) {
                                        for (int i18 = 0; i18 < stickerSets.size(); i18++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i18);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList7 = tL_messages_stickerSet3.documents) != null && !arrayList7.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.vh.u(" ", translitSafe, translitSafe2)) {
                                                    arrayList8.add(new jy(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i17).getFeaturedEmojiSets();
                                    if (featuredEmojiSets != null) {
                                        for (int i19 = 0; i19 < featuredEmojiSets.size(); i19++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i19);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.id))) {
                                                String translitSafe3 = AndroidUtilities.translitSafe(stickerSetCovered.set.title.toLowerCase());
                                                if (translitSafe3.startsWith(translitSafe) || org.telegram.messenger.vh.u(" ", translitSafe, translitSafe3)) {
                                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                                        arrayList6 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                                        TLRPC.TL_messages_stickerSet stickerSet3 = MediaDataController.getInstance(i17).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                                                        arrayList6 = stickerSet3 != null ? stickerSet3.documents : null;
                                                    } else {
                                                        arrayList6 = stickerSetCovered.covers;
                                                    }
                                                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                                                        arrayList8.add(new jy(stickerSetCovered, arrayList6));
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
                }, new oy(i13, ryVar, str5), new Utilities.Callback() { // from class: org.telegram.ui.Components.py
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj3) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList6;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList7;
                        Runnable runnable = (Runnable) obj3;
                        switch (i13) {
                            case 0:
                                ry ryVar2 = ryVar;
                                MediaDataController.getInstance(ryVar2.a.F.c1).searchStickerSets(true, str5, new bi.v3(ryVar2, arrayList4, runnable, 8));
                                break;
                            default:
                                sz szVar4 = ryVar.a.F;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(szVar4.c1).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str5 + "").toLowerCase());
                                    int i17 = szVar4.c1;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i17).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList8 = arrayList4;
                                    if (stickerSets != null) {
                                        for (int i18 = 0; i18 < stickerSets.size(); i18++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i18);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList7 = tL_messages_stickerSet3.documents) != null && !arrayList7.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.vh.u(" ", translitSafe, translitSafe2)) {
                                                    arrayList8.add(new jy(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i17).getFeaturedEmojiSets();
                                    if (featuredEmojiSets != null) {
                                        for (int i19 = 0; i19 < featuredEmojiSets.size(); i19++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i19);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.id))) {
                                                String translitSafe3 = AndroidUtilities.translitSafe(stickerSetCovered.set.title.toLowerCase());
                                                if (translitSafe3.startsWith(translitSafe) || org.telegram.messenger.vh.u(" ", translitSafe, translitSafe3)) {
                                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                                        arrayList6 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                                        TLRPC.TL_messages_stickerSet stickerSet3 = MediaDataController.getInstance(i17).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                                                        arrayList6 = stickerSet3 != null ? stickerSet3.documents : null;
                                                    } else {
                                                        arrayList6 = stickerSetCovered.covers;
                                                    }
                                                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                                                        arrayList8.add(new jy(stickerSetCovered, arrayList6));
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
                }, new oy(2, ryVar, arrayList3), new bi.b3(ryVar, str5, arrayList3, arrayList4, arrayList5, 4));
                break;
            case 16:
                ArrayList arrayList6 = (ArrayList) obj;
                sy syVar = ((ry) obj2).a;
                syVar.F.V.e(false);
                ArrayList arrayList7 = syVar.r;
                syVar.E = arrayList7.size() >= arrayList6.size();
                arrayList7.clear();
                arrayList7.addAll(arrayList6);
                syVar.l();
                break;
            case 17:
                ((xy) obj2).F((String) obj, "", true, false, false);
                break;
            case 18:
                xy xyVar = (xy) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                int i17 = xyVar.L.c1;
                MessagesController.getInstance(i17).putUsers(tL_contacts_resolvedPeer.users, false);
                MessagesController.getInstance(i17).putChats(tL_contacts_resolvedPeer.chats, false);
                MessagesStorage.getInstance(i17).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str6 = xyVar.w;
                xyVar.w = null;
                xyVar.F(str6, "", false, false, false);
                break;
            case 19:
                e00 e00Var = (e00) obj2;
                fi.v7 v7Var = (fi.v7) obj;
                e00Var.c();
                e00Var.h(v7Var);
                i00 i00Var = e00Var.J;
                i00Var.h1 = v7Var;
                i00Var.j();
                break;
            case 20:
                ((e00) obj2).J.f1 = (h00) obj;
                break;
            case 21:
                ((n10) obj2).z0 = -1;
                ((Runnable) ((Pair) obj).first).run();
                break;
            case 22:
                ((oy) obj2).run((org.telegram.ui.ActionBar.r2) obj);
                break;
            case 23:
                g50 g50Var = (g50) obj2;
                Uri uri = (Uri) obj;
                g50Var.getClass();
                try {
                    LaunchActivity launchActivity = (LaunchActivity) g50Var.a.getParentActivity();
                    if (launchActivity != null) {
                        Bundle bundle = new Bundle();
                        if (uri != null) {
                            bundle.putParcelable("photoUri", uri);
                        }
                        org.telegram.ui.dq0 dq0Var = new org.telegram.ui.dq0(bundle);
                        dq0Var.e = false;
                        dq0Var.f = false;
                        dq0Var.c = g50Var;
                        launchActivity.u0(dq0Var);
                        break;
                    } else {
                        break;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                    g50Var.r(false, ImageLoader.loadBitmap(null, uri, 800.0f, 800.0f, true), null);
                    return;
                }
            case 24:
                h60 h60Var = (h60) obj2;
                c60 c60Var = (c60) obj;
                o60 o60Var = h60Var.H0;
                VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
                o60Var.S = videoEditedInfo;
                videoEditedInfo.startTime = -1L;
                videoEditedInfo.endTime = -1L;
                videoEditedInfo.estimatedSize = Math.max(1L, o60Var.Q);
                VideoEditedInfo videoEditedInfo2 = o60Var.S;
                videoEditedInfo2.roundVideo = true;
                videoEditedInfo2.file = o60Var.M;
                videoEditedInfo2.encryptedFile = o60Var.N;
                videoEditedInfo2.key = o60Var.O;
                videoEditedInfo2.iv = o60Var.P;
                videoEditedInfo2.framerate = 25;
                videoEditedInfo2.originalWidth = 360;
                videoEditedInfo2.resultWidth = 360;
                videoEditedInfo2.originalHeight = 360;
                videoEditedInfo2.resultHeight = 360;
                videoEditedInfo2.originalPath = h60Var.a.getAbsolutePath();
                VideoEditedInfo videoEditedInfo3 = o60Var.S;
                videoEditedInfo3.notReadyYet = true;
                videoEditedInfo3.thumb = o60Var.j1;
                videoEditedInfo3.estimatedDuration = o60Var.k0;
                o60Var.j1 = null;
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, h60Var.a.getAbsolutePath(), 0, true, 0, 0, 0L);
                if (c60Var != null) {
                    photoEntry.ttl = c60Var.c;
                    photoEntry.effectId = c60Var.d;
                }
                o60Var.n.r(photoEntry, o60Var.S, c60Var == null || c60Var.a, c60Var != null ? c60Var.b : 0, 0, false, c60Var != null ? c60Var.e : 0L);
                break;
            case 25:
                Bitmap bitmap = (Bitmap) obj;
                h60 h60Var2 = (h60) ((m.g3) obj2).b;
                if ((bitmap != null && bitmap.getPixel(0, 0) != 0) || h60Var2.A0.size() <= 1) {
                    h60Var2.A0.add(bitmap);
                    break;
                } else {
                    ArrayList arrayList8 = h60Var2.A0;
                    arrayList8.add((Bitmap) ic.a.g(1, arrayList8));
                    break;
                }
                break;
            case 26:
                n70 n70Var2 = (n70) obj2;
                TLObject tLObject4 = (TLObject) obj;
                n70Var2.getClass();
                if (tLObject4 instanceof Vector) {
                    Vector vector = (Vector) tLObject4;
                    if (!vector.objects.isEmpty()) {
                        n70Var2.c.put(Long.valueOf(n70Var2.b.admin_id), (TLRPC.User) vector.objects.get(0));
                        n70Var2.T.l();
                        break;
                    }
                }
                break;
            case 27:
                h70 h70Var = (h70) obj2;
                if (((TLRPC.TL_error) obj) == null && (jbVar = (n70Var = h70Var.a.c).j0) != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = n70Var.b;
                    org.telegram.ui.wb wbVar = jbVar.a;
                    ArrayList arrayList9 = wbVar.o0;
                    int size = arrayList9.size();
                    int i18 = wbVar.E.h;
                    TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                    TLRPC.TL_channelAdminLogEventActionExportedInviteDelete tL_channelAdminLogEventActionExportedInviteDelete = new TLRPC.TL_channelAdminLogEventActionExportedInviteDelete();
                    tL_channelAdminLogEventActionExportedInviteDelete.invite = tL_chatInviteExported;
                    tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteDelete;
                    tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                    tL_channelAdminLogEvent.user_id = wbVar.getAccountInstance().getUserConfig().clientUserId;
                    i11 = ((org.telegram.ui.ActionBar.r2) wbVar).currentAccount;
                    if (new MessageObject(i11, tL_channelAdminLogEvent, (ArrayList<MessageObject>) wbVar.n0, (HashMap<String, ArrayList<MessageObject>>) wbVar.m0, wbVar.f, wbVar.T, true).contentType >= 0) {
                        wbVar.S0();
                        int size2 = arrayList9.size() - size;
                        if (size2 > 0) {
                            wbVar.C0.N = true;
                            org.telegram.ui.sb sbVar = wbVar.E;
                            sbVar.s(sbVar.h, size2);
                            org.telegram.ui.wb.L0(wbVar);
                        }
                        wbVar.y0.remove(tL_chatInviteExported.link);
                        break;
                    }
                }
                break;
            case 28:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                ((y70) obj2).setFocusable(true);
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new o70(editTextBoldCursor, i13));
                break;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", ((TLRPC.ChatFull) obj2).guard_bot_id);
                ((org.telegram.ui.ap) obj).presentFragment(new ProfileActivity(bundle2, null));
                break;
        }
    }
}
