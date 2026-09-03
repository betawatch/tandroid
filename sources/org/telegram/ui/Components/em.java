package org.telegram.ui.Components;

import android.content.Context;
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
import java.util.List;
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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class em implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ em(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        ks ksVar;
        int i10;
        t60 t60Var;
        org.telegram.ui.gb gbVar;
        int i11;
        int i12 = this.a;
        int i13 = 3;
        Object[] objArr = 0;
        final int i14 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i12) {
            case 0:
                di diVar = (di) obj;
                int currentItemTop = diVar.getCurrentItemTop();
                int listTopPadding = diVar.getListTopPadding();
                lh.e1 e1Var = ((nm) obj2).r;
                if (currentItemTop > AndroidUtilities.dp(7.0f)) {
                    listTopPadding -= currentItemTop;
                }
                e1Var.scrollBy(0, listTopPadding);
                break;
            case 1:
                eo.a(((bo) obj2).c);
                ((uf.g) obj).run();
                break;
            case 2:
                ((dp) obj2).b.x((List) obj);
                break;
            case 3:
                ((ep) obj2).b.x((List) obj);
                break;
            case 4:
                ((org.telegram.ui.ActionBar.g3) obj2).dismiss();
                ze.d.s((Context) obj, "https://t.me/BotFather?start=deletebot");
                break;
            case 5:
                ir irVar = (ir) obj2;
                irVar.getClass();
                ((ph.d) obj).setLoading(false);
                irVar.dismiss();
                break;
            case 6:
                ir irVar2 = (ir) obj2;
                TLObject tLObject = (TLObject) obj;
                if (tLObject != null && (tLObject instanceof TL_phone.groupCallStreamRtmpUrl)) {
                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject;
                    irVar2.Y = groupcallstreamrtmpurl.url;
                    irVar2.Z = groupcallstreamrtmpurl.key;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(irVar2.Z);
                    irVar2.a0 = spannableStringBuilder;
                    s01 s01Var = new s01();
                    s01Var.a |= 256;
                    s01Var.b = 0;
                    s01Var.c = spannableStringBuilder.length();
                    irVar2.a0.setSpan(new t01(s01Var, 0), 0, irVar2.a0.length(), 0);
                    irVar2.b0.N(false);
                    break;
                }
                break;
            case 7:
                ns nsVar = (ns) obj2;
                TLObject tLObject2 = (TLObject) obj;
                ks ksVar2 = nsVar.b;
                ArrayList arrayList = nsVar.h;
                int i15 = nsVar.a;
                if (!(tLObject2 instanceof TL_bots.popularAppBots)) {
                    nsVar.g = null;
                    nsVar.e = true;
                    nsVar.c = false;
                    ksVar2.run();
                    break;
                } else {
                    TL_bots.popularAppBots popularappbots = (TL_bots.popularAppBots) tLObject2;
                    MessagesController.getInstance(i15).putUsers(popularappbots.users, false);
                    MessagesStorage.getInstance(i15).putUsersAndChats(popularappbots.users, null, false, true);
                    arrayList.addAll(popularappbots.users);
                    String str = popularappbots.next_offset;
                    nsVar.g = str;
                    nsVar.e = str == null;
                    long currentTimeMillis = System.currentTimeMillis();
                    nsVar.f = currentTimeMillis;
                    if (nsVar.i) {
                        ksVar = ksVar2;
                    } else {
                        nsVar.i = true;
                        String str2 = nsVar.g;
                        if (str2 == null) {
                            str2 = "";
                        }
                        String str3 = str2;
                        ArrayList arrayList2 = new ArrayList();
                        int i16 = 0;
                        while (i16 < arrayList.size()) {
                            i16 = android.support.v4.media.a.g(((TLRPC.User) arrayList.get(i16)).id, arrayList2, i16, 1);
                            ksVar2 = ksVar2;
                        }
                        ksVar = ksVar2;
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i15);
                        messagesStorage.getStorageQueue().postRunnable(new kh.g1(nsVar, messagesStorage, arrayList2, currentTimeMillis, str3, 11));
                    }
                    nsVar.c = false;
                    ksVar.run();
                    break;
                }
            case 8:
                Bitmap decodeFile = BitmapFactory.decodeFile((String) obj);
                Canvas canvas = new Canvas(Bitmap.createBitmap(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f), Bitmap.Config.ARGB_8888));
                Paint paint = new Paint(3);
                canvas.translate(r3.getWidth() / 2.0f, r3.getHeight() / 2.0f);
                float max = Math.max(r3.getWidth() / decodeFile.getWidth(), r3.getHeight() / decodeFile.getHeight());
                canvas.scale(max, max);
                canvas.drawBitmap(decodeFile, (-decodeFile.getWidth()) / 2.0f, (-decodeFile.getHeight()) / 2.0f, paint);
                AndroidUtilities.runOnUIThread(new em(9, (kt) obj2, decodeFile));
                break;
            case 9:
                ((kt) obj2).setImage((Bitmap) obj);
                break;
            case 10:
                ((EditTextBoldCursor) obj2).hintLayout.draw((Canvas) obj);
                break;
            case 11:
                i10 = ((org.telegram.ui.ActionBar.g3) ((uu) obj2).a).currentAccount;
                MessagesController.getInstance(i10).updateEmojiStatus((TLRPC.EmojiStatus) obj);
                break;
            case 12:
                MessagesController.getInstance(((ax) obj2).a.Z0).updateEmojiStatus((TLRPC.EmojiStatus) obj);
                break;
            case 13:
                TLObject tLObject3 = (TLObject) obj;
                kz kzVar = ((ax) obj2).a;
                if (tLObject3 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject3;
                    MediaDataController.getInstance(kzVar.Z0).putStickerSet(tL_messages_stickerSet);
                    MediaDataController.getInstance(kzVar.Z0).replaceStickerSet(tL_messages_stickerSet);
                    break;
                }
                break;
            case 14:
                zx zxVar = (zx) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                zxVar.s.f = true;
                kz kzVar2 = zxVar.B;
                if (!kzVar2.m1.contains(Long.valueOf(tL_messages_stickerSet2.set.id))) {
                    kzVar2.m1.add(Long.valueOf(tL_messages_stickerSet2.set.id));
                }
                zxVar.a(true);
                break;
            case 15:
                final iy iyVar = (iy) obj2;
                final String str4 = (String) obj;
                String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                kz kzVar3 = iyVar.a.C;
                if (!Arrays.equals(kzVar3.T0, currentKeyboardLanguage)) {
                    MediaDataController.getInstance(kzVar3.Z0).fetchNewEmojiKeywords(currentKeyboardLanguage);
                }
                kzVar3.T0 = currentKeyboardLanguage;
                ArrayList arrayList3 = new ArrayList();
                final ArrayList arrayList4 = new ArrayList();
                final ArrayList arrayList5 = new ArrayList();
                final Object[] objArr2 = objArr == true ? 1 : 0;
                Utilities.doCallbacks(new Utilities.Callback() { // from class: org.telegram.ui.Components.hy
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj3) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList6;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList7;
                        Runnable runnable = (Runnable) obj3;
                        switch (objArr2) {
                            case 0:
                                iy iyVar2 = iyVar;
                                MediaDataController.getInstance(iyVar2.a.C.Z0).searchStickerSets(true, str4, new kh.h(iyVar2, arrayList5, runnable, 9));
                                break;
                            default:
                                kz kzVar4 = iyVar.a.C;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(kzVar4.Z0).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str4 + "").toLowerCase());
                                    int i17 = kzVar4.Z0;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i17).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList8 = arrayList5;
                                    if (stickerSets != null) {
                                        for (int i18 = 0; i18 < stickerSets.size(); i18++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i18);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList7 = tL_messages_stickerSet3.documents) != null && !arrayList7.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.y3.w(" ", translitSafe, translitSafe2)) {
                                                    arrayList8.add(new ay(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
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
                                                if (translitSafe3.startsWith(translitSafe) || org.telegram.messenger.y3.w(" ", translitSafe, translitSafe3)) {
                                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                                        arrayList6 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                                        TLRPC.TL_messages_stickerSet stickerSet3 = MediaDataController.getInstance(i17).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                                                        arrayList6 = stickerSet3 != null ? stickerSet3.documents : null;
                                                    } else {
                                                        arrayList6 = stickerSetCovered.covers;
                                                    }
                                                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                                                        arrayList8.add(new ay(stickerSetCovered, arrayList6));
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
                }, new vk(i13, iyVar, str4), new Utilities.Callback() { // from class: org.telegram.ui.Components.hy
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj3) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList6;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList7;
                        Runnable runnable = (Runnable) obj3;
                        switch (i14) {
                            case 0:
                                iy iyVar2 = iyVar;
                                MediaDataController.getInstance(iyVar2.a.C.Z0).searchStickerSets(true, str4, new kh.h(iyVar2, arrayList4, runnable, 9));
                                break;
                            default:
                                kz kzVar4 = iyVar.a.C;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(kzVar4.Z0).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str4 + "").toLowerCase());
                                    int i17 = kzVar4.Z0;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i17).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList8 = arrayList4;
                                    if (stickerSets != null) {
                                        for (int i18 = 0; i18 < stickerSets.size(); i18++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i18);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList7 = tL_messages_stickerSet3.documents) != null && !arrayList7.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.y3.w(" ", translitSafe, translitSafe2)) {
                                                    arrayList8.add(new ay(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
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
                                                if (translitSafe3.startsWith(translitSafe) || org.telegram.messenger.y3.w(" ", translitSafe, translitSafe3)) {
                                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                                        arrayList6 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                                        TLRPC.TL_messages_stickerSet stickerSet3 = MediaDataController.getInstance(i17).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                                                        arrayList6 = stickerSet3 != null ? stickerSet3.documents : null;
                                                    } else {
                                                        arrayList6 = stickerSetCovered.covers;
                                                    }
                                                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                                                        arrayList8.add(new ay(stickerSetCovered, arrayList6));
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
                }, new vk(4, iyVar, arrayList3), new lh.g2(iyVar, str4, arrayList3, arrayList4, arrayList5, 4));
                break;
            case 16:
                ArrayList arrayList6 = (ArrayList) obj;
                jy jyVar = ((iy) obj2).a;
                jyVar.C.S.e(false);
                ArrayList arrayList7 = jyVar.r;
                jyVar.B = arrayList7.size() >= arrayList6.size();
                arrayList7.clear();
                arrayList7.addAll(arrayList6);
                jyVar.l();
                break;
            case 17:
                ((oy) obj2).F((String) obj, "", true, false, false);
                break;
            case 18:
                oy oyVar = (oy) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                kz kzVar4 = oyVar.I;
                MessagesController.getInstance(kzVar4.Z0).putUsers(tL_contacts_resolvedPeer.users, false);
                int i17 = kzVar4.Z0;
                MessagesController.getInstance(i17).putChats(tL_contacts_resolvedPeer.chats, false);
                MessagesStorage.getInstance(i17).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str5 = oyVar.w;
                oyVar.w = null;
                oyVar.F(str5, "", false, false, false);
                break;
            case 19:
                vz vzVar = (vz) obj2;
                ph.s6 s6Var = (ph.s6) obj;
                vzVar.c();
                vzVar.h(s6Var);
                a00 a00Var = vzVar.G;
                a00Var.h1 = s6Var;
                a00Var.j();
                break;
            case 20:
                ((vz) obj2).G.f1 = (yz) obj;
                break;
            case 21:
                ((d10) obj2).w0 = -1;
                ((Runnable) ((Pair) obj).first).run();
                break;
            case 22:
                ((vk) obj2).run((org.telegram.ui.ActionBar.p2) obj);
                break;
            case 23:
                x40 x40Var = (x40) obj2;
                Uri uri = (Uri) obj;
                x40Var.getClass();
                try {
                    LaunchActivity launchActivity = (LaunchActivity) x40Var.a.getParentActivity();
                    if (launchActivity != null) {
                        Bundle bundle = new Bundle();
                        if (uri != null) {
                            bundle.putParcelable("photoUri", uri);
                        }
                        org.telegram.ui.zp0 zp0Var = new org.telegram.ui.zp0(bundle);
                        zp0Var.e = false;
                        zp0Var.f = false;
                        zp0Var.c = x40Var;
                        launchActivity.p0(zp0Var);
                        break;
                    } else {
                        break;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                    x40Var.s(false, ImageLoader.loadBitmap(null, uri, 800.0f, 800.0f, true), null);
                    return;
                }
            case 24:
                x50 x50Var = (x50) obj2;
                t50 t50Var = (t50) obj;
                y50 y50Var = x50Var.E0;
                VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
                y50Var.K = videoEditedInfo;
                videoEditedInfo.startTime = -1L;
                videoEditedInfo.endTime = -1L;
                videoEditedInfo.estimatedSize = Math.max(1L, y50Var.I);
                VideoEditedInfo videoEditedInfo2 = y50Var.K;
                videoEditedInfo2.roundVideo = true;
                videoEditedInfo2.file = y50Var.E;
                videoEditedInfo2.encryptedFile = y50Var.F;
                videoEditedInfo2.key = y50Var.G;
                videoEditedInfo2.iv = y50Var.H;
                videoEditedInfo2.framerate = 25;
                videoEditedInfo2.originalWidth = 360;
                videoEditedInfo2.resultWidth = 360;
                videoEditedInfo2.originalHeight = 360;
                videoEditedInfo2.resultHeight = 360;
                videoEditedInfo2.originalPath = x50Var.a.getAbsolutePath();
                VideoEditedInfo videoEditedInfo3 = y50Var.K;
                videoEditedInfo3.notReadyYet = true;
                videoEditedInfo3.thumb = y50Var.W0;
                videoEditedInfo3.estimatedDuration = y50Var.c0;
                y50Var.W0 = null;
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, x50Var.a.getAbsolutePath(), 0, true, 0, 0, 0L);
                if (t50Var != null) {
                    photoEntry.ttl = t50Var.c;
                    photoEntry.effectId = t50Var.d;
                }
                y50Var.c.r(photoEntry, y50Var.K, t50Var == null || t50Var.a, t50Var != null ? t50Var.b : 0, 0, false, t50Var != null ? t50Var.e : 0L);
                break;
            case 25:
                Bitmap bitmap = (Bitmap) obj;
                x50 x50Var2 = (x50) ((m2.b) obj2).b;
                if ((bitmap != null && bitmap.getPixel(0, 0) != 0) || x50Var2.x0.size() <= 1) {
                    x50Var2.x0.add(bitmap);
                    break;
                } else {
                    ArrayList arrayList8 = x50Var2.x0;
                    arrayList8.add((Bitmap) kf.k0.i(1, arrayList8));
                    break;
                }
                break;
            case 26:
                t60 t60Var2 = (t60) obj2;
                TLObject tLObject4 = (TLObject) obj;
                t60Var2.getClass();
                if (tLObject4 instanceof Vector) {
                    Vector vector = (Vector) tLObject4;
                    if (!vector.objects.isEmpty()) {
                        t60Var2.c.put(Long.valueOf(t60Var2.b.admin_id), (TLRPC.User) vector.objects.get(0));
                        t60Var2.Q.l();
                        break;
                    }
                }
                break;
            case 27:
                n60 n60Var = (n60) obj2;
                if (((TLRPC.TL_error) obj) == null && (gbVar = (t60Var = n60Var.a.c).g0) != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = t60Var.b;
                    org.telegram.ui.ub ubVar = gbVar.a;
                    ArrayList arrayList9 = ubVar.p0;
                    int size = arrayList9.size();
                    int i18 = ubVar.F.h;
                    TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                    TLRPC.TL_channelAdminLogEventActionExportedInviteDelete tL_channelAdminLogEventActionExportedInviteDelete = new TLRPC.TL_channelAdminLogEventActionExportedInviteDelete();
                    tL_channelAdminLogEventActionExportedInviteDelete.invite = tL_chatInviteExported;
                    tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteDelete;
                    tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                    tL_channelAdminLogEvent.user_id = ubVar.getAccountInstance().getUserConfig().clientUserId;
                    i11 = ((org.telegram.ui.ActionBar.p2) ubVar).currentAccount;
                    if (new MessageObject(i11, tL_channelAdminLogEvent, (ArrayList<MessageObject>) ubVar.o0, (HashMap<String, ArrayList<MessageObject>>) ubVar.n0, ubVar.s, ubVar.U, true).contentType >= 0) {
                        ubVar.R0();
                        int size2 = arrayList9.size() - size;
                        if (size2 > 0) {
                            ubVar.D0.N = true;
                            org.telegram.ui.qb qbVar = ubVar.F;
                            qbVar.s(qbVar.h, size2);
                            org.telegram.ui.ub.K0(ubVar);
                        }
                        ubVar.z0.remove(tL_chatInviteExported.link);
                        break;
                    }
                }
                break;
            case 28:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                ((d70) obj2).setFocusable(true);
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new q1(i13, editTextBoldCursor));
                break;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", ((TLRPC.ChatFull) obj2).guard_bot_id);
                ((org.telegram.ui.fp) obj).presentFragment(new ProfileActivity(bundle2, null));
                break;
        }
    }
}
