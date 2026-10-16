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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vm(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        p70 p70Var;
        org.telegram.ui.mb mbVar;
        int i11;
        int i12 = this.a;
        String str = "";
        int i13 = 2;
        char c10 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i12) {
            case 0:
                ni niVar = (ni) obj;
                int currentItemTop = niVar.getCurrentItemTop();
                int listTopPadding = niVar.getListTopPadding();
                bi.o0 o0Var = ((en) obj2).r;
                if (currentItemTop > AndroidUtilities.dp(7.0f)) {
                    listTopPadding -= currentItemTop;
                }
                o0Var.scrollBy(0, listTopPadding);
                break;
            case 1:
                wo.a(((uo) obj2).c);
                ((ig.g) obj).run();
                break;
            case 2:
                ((up) obj2).b.z((List) obj);
                break;
            case 3:
                ((vp) obj2).b.z((List) obj);
                break;
            case 4:
                ((org.telegram.ui.ActionBar.e3) obj2).dismiss();
                pf.d.r((Context) obj, "https://t.me/BotFather?start=deletebot");
                break;
            case 5:
                org.telegram.ui.Cells.j3 j3Var = (org.telegram.ui.Cells.j3) obj2;
                TreeSet treeSet = (TreeSet) obj;
                String charSequence = j3Var.getText().toString();
                if (!qr.a(charSequence, "bot") && qr.c(charSequence, treeSet) == null) {
                    str = "bot";
                }
                org.telegram.ui.Cells.h3 h3Var = j3Var.b;
                h3Var.setRightText(str);
                h3Var.setPadding(0, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(TextUtils.isEmpty(str) ? 21.0f : 63.0f), AndroidUtilities.dp(15.0f));
                break;
            case 6:
                as asVar = (as) obj2;
                asVar.getClass();
                ((di.d) obj).setLoading(false);
                asVar.dismiss();
                break;
            case 7:
                as asVar2 = (as) obj2;
                TLObject tLObject = (TLObject) obj;
                if (tLObject != null && (tLObject instanceof TL_phone.groupCallStreamRtmpUrl)) {
                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject;
                    asVar2.b0 = groupcallstreamrtmpurl.url;
                    asVar2.c0 = groupcallstreamrtmpurl.key;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(asVar2.c0);
                    asVar2.d0 = spannableStringBuilder;
                    q11 q11Var = new q11();
                    q11Var.a |= 256;
                    q11Var.b = 0;
                    q11Var.c = spannableStringBuilder.length();
                    asVar2.d0.setSpan(new r11(q11Var, 0), 0, asVar2.d0.length(), 0);
                    asVar2.e0.N(false);
                    break;
                }
                break;
            case 8:
                dt dtVar = (dt) obj2;
                TLObject tLObject2 = (TLObject) obj;
                zs zsVar = dtVar.b;
                ArrayList arrayList = dtVar.h;
                int i14 = dtVar.a;
                if (tLObject2 instanceof TL_bots.popularAppBots) {
                    TL_bots.popularAppBots popularappbots = (TL_bots.popularAppBots) tLObject2;
                    MessagesController.getInstance(i14).putUsers(popularappbots.users, false);
                    MessagesStorage.getInstance(i14).putUsersAndChats(popularappbots.users, null, false, true);
                    arrayList.addAll(popularappbots.users);
                    String str2 = popularappbots.next_offset;
                    dtVar.g = str2;
                    dtVar.e = str2 == null;
                    long currentTimeMillis = System.currentTimeMillis();
                    dtVar.f = currentTimeMillis;
                    if (!dtVar.i) {
                        dtVar.i = true;
                        String str3 = dtVar.g;
                        String str4 = str3 == null ? "" : str3;
                        ArrayList arrayList2 = new ArrayList();
                        for (int i15 = 0; i15 < arrayList.size(); i15 = com.google.android.gms.internal.play_billing.k3.h(((TLRPC.User) arrayList.get(i15)).id, arrayList2, i15, 1)) {
                        }
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i14);
                        messagesStorage.getStorageQueue().postRunnable(new org.telegram.messenger.voip.f(dtVar, messagesStorage, arrayList2, currentTimeMillis, str4, 3));
                    }
                    dtVar.c = false;
                    zsVar.run();
                    break;
                } else {
                    dtVar.g = null;
                    dtVar.e = true;
                    dtVar.c = false;
                    zsVar.run();
                    break;
                }
            case 9:
                Bitmap decodeFile = BitmapFactory.decodeFile((String) obj);
                Canvas canvas = new Canvas(Bitmap.createBitmap(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f), Bitmap.Config.ARGB_8888));
                Paint paint = new Paint(3);
                canvas.translate(r2.getWidth() / 2.0f, r2.getHeight() / 2.0f);
                float max = Math.max(r2.getWidth() / decodeFile.getWidth(), r2.getHeight() / decodeFile.getHeight());
                canvas.scale(max, max);
                canvas.drawBitmap(decodeFile, (-decodeFile.getWidth()) / 2.0f, (-decodeFile.getHeight()) / 2.0f, paint);
                AndroidUtilities.runOnUIThread(new vm(10, (cu) obj2, decodeFile));
                break;
            case 10:
                ((cu) obj2).setImage((Bitmap) obj);
                break;
            case 11:
                ((EditTextBoldCursor) obj2).hintLayout.draw((Canvas) obj);
                break;
            case 12:
                i10 = ((org.telegram.ui.ActionBar.e3) ((nv) obj2).a).currentAccount;
                MessagesController.getInstance(i10).updateEmojiStatus((TLRPC.EmojiStatus) obj);
                break;
            case 13:
                MessagesController.getInstance(((px) obj2).a.c1).updateEmojiStatus((TLRPC.EmojiStatus) obj);
                break;
            case 14:
                TLObject tLObject3 = (TLObject) obj;
                wz wzVar = ((px) obj2).a;
                if (tLObject3 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject3;
                    MediaDataController.getInstance(wzVar.c1).putStickerSet(tL_messages_stickerSet);
                    MediaDataController.getInstance(wzVar.c1).replaceStickerSet(tL_messages_stickerSet);
                    break;
                }
                break;
            case 15:
                ny nyVar = (ny) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                nyVar.s.f = true;
                wz wzVar2 = nyVar.E;
                if (!wzVar2.p1.contains(Long.valueOf(tL_messages_stickerSet2.set.id))) {
                    wzVar2.p1.add(Long.valueOf(tL_messages_stickerSet2.set.id));
                }
                nyVar.a(true);
                break;
            case 16:
                final uy uyVar = (uy) obj2;
                final String str5 = (String) obj;
                String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                wz wzVar3 = uyVar.a.F;
                if (!Arrays.equals(wzVar3.W0, currentKeyboardLanguage)) {
                    MediaDataController.getInstance(wzVar3.c1).fetchNewEmojiKeywords(currentKeyboardLanguage);
                }
                wzVar3.W0 = currentKeyboardLanguage;
                ArrayList arrayList3 = new ArrayList();
                final ArrayList arrayList4 = new ArrayList();
                final ArrayList arrayList5 = new ArrayList();
                Utilities.Callback callback = new Utilities.Callback() { // from class: org.telegram.ui.Components.ty
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj3) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList6;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList7;
                        Runnable runnable = (Runnable) obj3;
                        switch (r4) {
                            case 0:
                                uy uyVar2 = uyVar;
                                MediaDataController.getInstance(uyVar2.a.F.c1).searchStickerSets(true, str5, new bi.q4(uyVar2, arrayList5, runnable, 7));
                                break;
                            default:
                                wz wzVar4 = uyVar.a.F;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(wzVar4.c1).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str5 + "").toLowerCase());
                                    int i16 = wzVar4.c1;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i16).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList8 = arrayList5;
                                    if (stickerSets != null) {
                                        for (int i17 = 0; i17 < stickerSets.size(); i17++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i17);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList7 = tL_messages_stickerSet3.documents) != null && !arrayList7.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.g0.w(" ", translitSafe, translitSafe2)) {
                                                    arrayList8.add(new oy(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i16).getFeaturedEmojiSets();
                                    if (featuredEmojiSets != null) {
                                        for (int i18 = 0; i18 < featuredEmojiSets.size(); i18++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i18);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.id))) {
                                                String translitSafe3 = AndroidUtilities.translitSafe(stickerSetCovered.set.title.toLowerCase());
                                                if (translitSafe3.startsWith(translitSafe) || org.telegram.messenger.g0.w(" ", translitSafe, translitSafe3)) {
                                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                                        arrayList6 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                                        TLRPC.TL_messages_stickerSet stickerSet3 = MediaDataController.getInstance(i16).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                                                        arrayList6 = stickerSet3 != null ? stickerSet3.documents : null;
                                                    } else {
                                                        arrayList6 = stickerSetCovered.covers;
                                                    }
                                                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                                                        arrayList8.add(new oy(stickerSetCovered, arrayList6));
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
                };
                org.telegram.ui.uc ucVar = new org.telegram.ui.uc(23, uyVar, str5);
                final char c11 = c10 == true ? 1 : 0;
                Utilities.doCallbacks(callback, ucVar, new Utilities.Callback() { // from class: org.telegram.ui.Components.ty
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj3) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList6;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList7;
                        Runnable runnable = (Runnable) obj3;
                        switch (c11) {
                            case 0:
                                uy uyVar2 = uyVar;
                                MediaDataController.getInstance(uyVar2.a.F.c1).searchStickerSets(true, str5, new bi.q4(uyVar2, arrayList4, runnable, 7));
                                break;
                            default:
                                wz wzVar4 = uyVar.a.F;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(wzVar4.c1).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str5 + "").toLowerCase());
                                    int i16 = wzVar4.c1;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i16).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList8 = arrayList4;
                                    if (stickerSets != null) {
                                        for (int i17 = 0; i17 < stickerSets.size(); i17++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i17);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList7 = tL_messages_stickerSet3.documents) != null && !arrayList7.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.g0.w(" ", translitSafe, translitSafe2)) {
                                                    arrayList8.add(new oy(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i16).getFeaturedEmojiSets();
                                    if (featuredEmojiSets != null) {
                                        for (int i18 = 0; i18 < featuredEmojiSets.size(); i18++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i18);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.id))) {
                                                String translitSafe3 = AndroidUtilities.translitSafe(stickerSetCovered.set.title.toLowerCase());
                                                if (translitSafe3.startsWith(translitSafe) || org.telegram.messenger.g0.w(" ", translitSafe, translitSafe3)) {
                                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                                        arrayList6 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                                        TLRPC.TL_messages_stickerSet stickerSet3 = MediaDataController.getInstance(i16).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                                                        arrayList6 = stickerSet3 != null ? stickerSet3.documents : null;
                                                    } else {
                                                        arrayList6 = stickerSetCovered.covers;
                                                    }
                                                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                                                        arrayList8.add(new oy(stickerSetCovered, arrayList6));
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
                }, new org.telegram.ui.uc(24, uyVar, arrayList3), new org.telegram.ui.xa(uyVar, str5, arrayList3, arrayList4, arrayList5));
                break;
            case 17:
                ArrayList arrayList6 = (ArrayList) obj;
                vy vyVar = ((uy) obj2).a;
                vyVar.F.V.e(false);
                ArrayList arrayList7 = vyVar.r;
                vyVar.E = arrayList7.size() >= arrayList6.size();
                arrayList7.clear();
                arrayList7.addAll(arrayList6);
                vyVar.l();
                break;
            case 18:
                ((az) obj2).F((String) obj, "", true, false, false);
                break;
            case 19:
                az azVar = (az) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                wz wzVar4 = azVar.L;
                MessagesController.getInstance(wzVar4.c1).putUsers(tL_contacts_resolvedPeer.users, false);
                int i16 = wzVar4.c1;
                MessagesController.getInstance(i16).putChats(tL_contacts_resolvedPeer.chats, false);
                MessagesStorage.getInstance(i16).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str6 = azVar.w;
                azVar.w = null;
                azVar.F(str6, "", false, false, false);
                break;
            case 20:
                h00 h00Var = (h00) obj2;
                di.j8 j8Var = (di.j8) obj;
                h00Var.c();
                h00Var.h(j8Var);
                l00 l00Var = h00Var.J;
                l00Var.h1 = j8Var;
                l00Var.j();
                break;
            case 21:
                ((h00) obj2).J.f1 = (k00) obj;
                break;
            case 22:
                ((o10) obj2).z0 = -1;
                ((Runnable) ((Pair) obj).first).run();
                break;
            case 23:
                ((org.telegram.ui.uc) obj2).run((org.telegram.ui.ActionBar.m2) obj);
                break;
            case 24:
                i50 i50Var = (i50) obj2;
                Uri uri = (Uri) obj;
                i50Var.getClass();
                try {
                    LaunchActivity launchActivity = (LaunchActivity) i50Var.a.getParentActivity();
                    if (launchActivity == null) {
                        break;
                    } else {
                        Bundle bundle = new Bundle();
                        if (uri != null) {
                            bundle.putParcelable("photoUri", uri);
                        }
                        org.telegram.ui.rq0 rq0Var = new org.telegram.ui.rq0(bundle);
                        rq0Var.e = false;
                        rq0Var.f = false;
                        rq0Var.c = i50Var;
                        launchActivity.p0(rq0Var);
                        break;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                    i50Var.r(false, ImageLoader.loadBitmap(null, uri, 800.0f, 800.0f, true), null);
                    return;
                }
            case 25:
                i60 i60Var = (i60) obj2;
                e60 e60Var = (e60) obj;
                p60 p60Var = i60Var.H0;
                VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
                p60Var.S = videoEditedInfo;
                videoEditedInfo.startTime = -1L;
                videoEditedInfo.endTime = -1L;
                videoEditedInfo.estimatedSize = Math.max(1L, p60Var.Q);
                VideoEditedInfo videoEditedInfo2 = p60Var.S;
                videoEditedInfo2.roundVideo = true;
                videoEditedInfo2.file = p60Var.M;
                videoEditedInfo2.encryptedFile = p60Var.N;
                videoEditedInfo2.key = p60Var.O;
                videoEditedInfo2.iv = p60Var.P;
                videoEditedInfo2.framerate = 25;
                videoEditedInfo2.originalWidth = 360;
                videoEditedInfo2.resultWidth = 360;
                videoEditedInfo2.originalHeight = 360;
                videoEditedInfo2.resultHeight = 360;
                videoEditedInfo2.originalPath = i60Var.a.getAbsolutePath();
                VideoEditedInfo videoEditedInfo3 = p60Var.S;
                videoEditedInfo3.notReadyYet = true;
                videoEditedInfo3.thumb = p60Var.j1;
                videoEditedInfo3.estimatedDuration = p60Var.k0;
                p60Var.j1 = null;
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, i60Var.a.getAbsolutePath(), 0, true, 0, 0, 0L);
                if (e60Var != null) {
                    photoEntry.ttl = e60Var.c;
                    photoEntry.effectId = e60Var.d;
                }
                p60Var.n.s(photoEntry, p60Var.S, e60Var == null || e60Var.a, e60Var != null ? e60Var.b : 0, 0, false, e60Var != null ? e60Var.e : 0L);
                break;
            case 26:
                Bitmap bitmap = (Bitmap) obj;
                i60 i60Var2 = (i60) ((org.telegram.ui.Cells.l7) obj2).b;
                if ((bitmap == null || bitmap.getPixel(0, 0) == 0) && i60Var2.A0.size() > 1) {
                    ArrayList arrayList8 = i60Var2.A0;
                    arrayList8.add((Bitmap) i2.d.h(1, arrayList8));
                    break;
                } else {
                    i60Var2.A0.add(bitmap);
                    break;
                }
                break;
            case 27:
                p70 p70Var2 = (p70) obj2;
                TLObject tLObject4 = (TLObject) obj;
                p70Var2.getClass();
                if (tLObject4 instanceof Vector) {
                    Vector vector = (Vector) tLObject4;
                    if (!vector.objects.isEmpty()) {
                        p70Var2.c.put(Long.valueOf(p70Var2.b.admin_id), (TLRPC.User) vector.objects.get(0));
                        p70Var2.T.l();
                        break;
                    }
                }
                break;
            case 28:
                j70 j70Var = (j70) obj2;
                if (((TLRPC.TL_error) obj) == null && (mbVar = (p70Var = j70Var.a.c).j0) != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = p70Var.b;
                    org.telegram.ui.ac acVar = mbVar.a;
                    ArrayList arrayList9 = acVar.o0;
                    int size = arrayList9.size();
                    int i17 = acVar.E.h;
                    TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                    TLRPC.TL_channelAdminLogEventActionExportedInviteDelete tL_channelAdminLogEventActionExportedInviteDelete = new TLRPC.TL_channelAdminLogEventActionExportedInviteDelete();
                    tL_channelAdminLogEventActionExportedInviteDelete.invite = tL_chatInviteExported;
                    tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteDelete;
                    tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                    tL_channelAdminLogEvent.user_id = acVar.getAccountInstance().getUserConfig().clientUserId;
                    i11 = ((org.telegram.ui.ActionBar.m2) acVar).currentAccount;
                    if (new MessageObject(i11, tL_channelAdminLogEvent, (ArrayList<MessageObject>) acVar.n0, (HashMap<String, ArrayList<MessageObject>>) acVar.m0, acVar.f, acVar.T, true).contentType >= 0) {
                        acVar.R0();
                        int size2 = arrayList9.size() - size;
                        if (size2 > 0) {
                            acVar.C0.N = true;
                            org.telegram.ui.wb wbVar = acVar.E;
                            wbVar.s(wbVar.h, size2);
                            org.telegram.ui.ac.K0(acVar);
                        }
                        acVar.y0.remove(tL_chatInviteExported.link);
                        break;
                    }
                }
                break;
            default:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                ((z70) obj2).setFocusable(true);
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new r1(i13, editTextBoldCursor));
                break;
        }
    }
}
