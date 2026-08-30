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
import android.widget.FrameLayout;
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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class il implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ il(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        ls lsVar;
        int i10;
        s60 s60Var;
        org.telegram.ui.eb ebVar;
        int i11;
        int i12 = this.a;
        int i13 = 3;
        Object[] objArr = 0;
        final int i14 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i12) {
            case 0:
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) obj;
                am amVar = ((ChatAttachAlertPhotoLayout) obj2).M;
                if (amVar != null) {
                    amVar.setLayoutParams(layoutParams);
                    break;
                }
                break;
            case 1:
                di diVar = (di) obj;
                int currentItemTop = diVar.getCurrentItemTop();
                int listTopPadding = diVar.getListTopPadding();
                lh.e1 e1Var = ((om) obj2).r;
                if (currentItemTop > AndroidUtilities.dp(7.0f)) {
                    listTopPadding -= currentItemTop;
                }
                e1Var.scrollBy(0, listTopPadding);
                break;
            case 2:
                fo.a(((co) obj2).c);
                ((uf.g) obj).run();
                break;
            case 3:
                ((ep) obj2).b.x((List) obj);
                break;
            case 4:
                ((fp) obj2).b.x((List) obj);
                break;
            case 5:
                ((org.telegram.ui.ActionBar.g3) obj2).dismiss();
                af.g.s((Context) obj, "https://t.me/BotFather?start=deletebot");
                break;
            case 6:
                jr jrVar = (jr) obj2;
                jrVar.getClass();
                ((ph.d) obj).setLoading(false);
                jrVar.dismiss();
                break;
            case 7:
                jr jrVar2 = (jr) obj2;
                TLObject tLObject = (TLObject) obj;
                if (tLObject != null && (tLObject instanceof TL_phone.groupCallStreamRtmpUrl)) {
                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject;
                    jrVar2.Y = groupcallstreamrtmpurl.url;
                    jrVar2.Z = groupcallstreamrtmpurl.key;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(jrVar2.Z);
                    jrVar2.a0 = spannableStringBuilder;
                    s01 s01Var = new s01();
                    s01Var.a |= 256;
                    s01Var.b = 0;
                    s01Var.c = spannableStringBuilder.length();
                    jrVar2.a0.setSpan(new t01(s01Var, 0), 0, jrVar2.a0.length(), 0);
                    jrVar2.b0.N(false);
                    break;
                }
                break;
            case 8:
                os osVar = (os) obj2;
                TLObject tLObject2 = (TLObject) obj;
                ls lsVar2 = osVar.b;
                ArrayList arrayList = osVar.h;
                int i15 = osVar.a;
                if (!(tLObject2 instanceof TL_bots.popularAppBots)) {
                    osVar.g = null;
                    osVar.e = true;
                    osVar.c = false;
                    lsVar2.run();
                    break;
                } else {
                    TL_bots.popularAppBots popularappbots = (TL_bots.popularAppBots) tLObject2;
                    MessagesController.getInstance(i15).putUsers(popularappbots.users, false);
                    MessagesStorage.getInstance(i15).putUsersAndChats(popularappbots.users, null, false, true);
                    arrayList.addAll(popularappbots.users);
                    String str = popularappbots.next_offset;
                    osVar.g = str;
                    osVar.e = str == null;
                    long currentTimeMillis = System.currentTimeMillis();
                    osVar.f = currentTimeMillis;
                    if (osVar.i) {
                        lsVar = lsVar2;
                    } else {
                        osVar.i = true;
                        String str2 = osVar.g;
                        if (str2 == null) {
                            str2 = "";
                        }
                        String str3 = str2;
                        ArrayList arrayList2 = new ArrayList();
                        int i16 = 0;
                        while (i16 < arrayList.size()) {
                            i16 = android.support.v4.media.a.g(((TLRPC.User) arrayList.get(i16)).id, arrayList2, i16, 1);
                            lsVar2 = lsVar2;
                        }
                        lsVar = lsVar2;
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i15);
                        messagesStorage.getStorageQueue().postRunnable(new kh.g1(osVar, messagesStorage, arrayList2, currentTimeMillis, str3, 11));
                    }
                    osVar.c = false;
                    lsVar.run();
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
                AndroidUtilities.runOnUIThread(new il(10, (lt) obj2, decodeFile));
                break;
            case 10:
                ((lt) obj2).setImage((Bitmap) obj);
                break;
            case 11:
                ((EditTextBoldCursor) obj2).hintLayout.draw((Canvas) obj);
                break;
            case 12:
                i10 = ((org.telegram.ui.ActionBar.g3) ((vu) obj2).a).currentAccount;
                MessagesController.getInstance(i10).updateEmojiStatus((TLRPC.EmojiStatus) obj);
                break;
            case 13:
                MessagesController.getInstance(((ax) obj2).a.Z0).updateEmojiStatus((TLRPC.EmojiStatus) obj);
                break;
            case 14:
                TLObject tLObject3 = (TLObject) obj;
                kz kzVar = ((ax) obj2).a;
                if (tLObject3 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject3;
                    MediaDataController.getInstance(kzVar.Z0).putStickerSet(tL_messages_stickerSet);
                    MediaDataController.getInstance(kzVar.Z0).replaceStickerSet(tL_messages_stickerSet);
                    break;
                }
                break;
            case 15:
                zx zxVar = (zx) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                zxVar.s.f = true;
                kz kzVar2 = zxVar.B;
                if (!kzVar2.m1.contains(Long.valueOf(tL_messages_stickerSet2.set.id))) {
                    kzVar2.m1.add(Long.valueOf(tL_messages_stickerSet2.set.id));
                }
                zxVar.a(true);
                break;
            case 16:
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
            case 17:
                ArrayList arrayList6 = (ArrayList) obj;
                jy jyVar = ((iy) obj2).a;
                jyVar.C.S.e(false);
                ArrayList arrayList7 = jyVar.r;
                jyVar.B = arrayList7.size() >= arrayList6.size();
                arrayList7.clear();
                arrayList7.addAll(arrayList6);
                jyVar.l();
                break;
            case 18:
                ((oy) obj2).F((String) obj, "", true, false, false);
                break;
            case 19:
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
            case 20:
                vz vzVar = (vz) obj2;
                ph.t6 t6Var = (ph.t6) obj;
                vzVar.c();
                vzVar.h(t6Var);
                zz zzVar = vzVar.G;
                zzVar.h1 = t6Var;
                zzVar.j();
                break;
            case 21:
                ((vz) obj2).G.f1 = (yz) obj;
                break;
            case 22:
                ((c10) obj2).w0 = -1;
                ((Runnable) ((Pair) obj).first).run();
                break;
            case 23:
                ((vk) obj2).run((org.telegram.ui.ActionBar.p2) obj);
                break;
            case 24:
                w40 w40Var = (w40) obj2;
                Uri uri = (Uri) obj;
                w40Var.getClass();
                try {
                    LaunchActivity launchActivity = (LaunchActivity) w40Var.a.getParentActivity();
                    if (launchActivity != null) {
                        Bundle bundle = new Bundle();
                        if (uri != null) {
                            bundle.putParcelable("photoUri", uri);
                        }
                        org.telegram.ui.sp0 sp0Var = new org.telegram.ui.sp0(bundle);
                        sp0Var.e = false;
                        sp0Var.f = false;
                        sp0Var.c = w40Var;
                        launchActivity.p0(sp0Var);
                        break;
                    } else {
                        break;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                    w40Var.s(false, ImageLoader.loadBitmap(null, uri, 800.0f, 800.0f, true), null);
                    return;
                }
            case 25:
                w50 w50Var = (w50) obj2;
                s50 s50Var = (s50) obj;
                x50 x50Var = w50Var.E0;
                VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
                x50Var.K = videoEditedInfo;
                videoEditedInfo.startTime = -1L;
                videoEditedInfo.endTime = -1L;
                videoEditedInfo.estimatedSize = Math.max(1L, x50Var.I);
                VideoEditedInfo videoEditedInfo2 = x50Var.K;
                videoEditedInfo2.roundVideo = true;
                videoEditedInfo2.file = x50Var.E;
                videoEditedInfo2.encryptedFile = x50Var.F;
                videoEditedInfo2.key = x50Var.G;
                videoEditedInfo2.iv = x50Var.H;
                videoEditedInfo2.framerate = 25;
                videoEditedInfo2.originalWidth = 360;
                videoEditedInfo2.resultWidth = 360;
                videoEditedInfo2.originalHeight = 360;
                videoEditedInfo2.resultHeight = 360;
                videoEditedInfo2.originalPath = w50Var.a.getAbsolutePath();
                VideoEditedInfo videoEditedInfo3 = x50Var.K;
                videoEditedInfo3.notReadyYet = true;
                videoEditedInfo3.thumb = x50Var.W0;
                videoEditedInfo3.estimatedDuration = x50Var.c0;
                x50Var.W0 = null;
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, w50Var.a.getAbsolutePath(), 0, true, 0, 0, 0L);
                if (s50Var != null) {
                    photoEntry.ttl = s50Var.c;
                    photoEntry.effectId = s50Var.d;
                }
                x50Var.c.r(photoEntry, x50Var.K, s50Var == null || s50Var.a, s50Var != null ? s50Var.b : 0, 0, false, s50Var != null ? s50Var.e : 0L);
                break;
            case 26:
                Bitmap bitmap = (Bitmap) obj;
                w50 w50Var2 = (w50) ((m2.b) obj2).b;
                if ((bitmap != null && bitmap.getPixel(0, 0) != 0) || w50Var2.x0.size() <= 1) {
                    w50Var2.x0.add(bitmap);
                    break;
                } else {
                    ArrayList arrayList8 = w50Var2.x0;
                    arrayList8.add((Bitmap) kh.a2.i(1, arrayList8));
                    break;
                }
                break;
            case 27:
                s60 s60Var2 = (s60) obj2;
                TLObject tLObject4 = (TLObject) obj;
                s60Var2.getClass();
                if (tLObject4 instanceof Vector) {
                    Vector vector = (Vector) tLObject4;
                    if (!vector.objects.isEmpty()) {
                        s60Var2.c.put(Long.valueOf(s60Var2.b.admin_id), (TLRPC.User) vector.objects.get(0));
                        s60Var2.Q.l();
                        break;
                    }
                }
                break;
            case 28:
                m60 m60Var = (m60) obj2;
                if (((TLRPC.TL_error) obj) == null && (ebVar = (s60Var = m60Var.a.c).g0) != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = s60Var.b;
                    org.telegram.ui.sb sbVar = ebVar.a;
                    ArrayList arrayList9 = sbVar.p0;
                    int size = arrayList9.size();
                    int i18 = sbVar.F.h;
                    TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                    TLRPC.TL_channelAdminLogEventActionExportedInviteDelete tL_channelAdminLogEventActionExportedInviteDelete = new TLRPC.TL_channelAdminLogEventActionExportedInviteDelete();
                    tL_channelAdminLogEventActionExportedInviteDelete.invite = tL_chatInviteExported;
                    tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteDelete;
                    tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                    tL_channelAdminLogEvent.user_id = sbVar.getAccountInstance().getUserConfig().clientUserId;
                    i11 = ((org.telegram.ui.ActionBar.p2) sbVar).currentAccount;
                    if (new MessageObject(i11, tL_channelAdminLogEvent, (ArrayList<MessageObject>) sbVar.o0, (HashMap<String, ArrayList<MessageObject>>) sbVar.n0, sbVar.s, sbVar.U, true).contentType >= 0) {
                        sbVar.R0();
                        int size2 = arrayList9.size() - size;
                        if (size2 > 0) {
                            sbVar.D0.N = true;
                            org.telegram.ui.ob obVar = sbVar.F;
                            obVar.s(obVar.h, size2);
                            org.telegram.ui.sb.K0(sbVar);
                        }
                        sbVar.z0.remove(tL_chatInviteExported.link);
                        break;
                    }
                }
                break;
            default:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                ((c70) obj2).setFocusable(true);
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new q1(i13, editTextBoldCursor));
                break;
        }
    }
}
