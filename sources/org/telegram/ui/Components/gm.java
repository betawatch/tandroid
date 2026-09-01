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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gm(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        ns nsVar;
        int i10;
        u60 u60Var;
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
                ei eiVar = (ei) obj;
                int currentItemTop = eiVar.getCurrentItemTop();
                int listTopPadding = eiVar.getListTopPadding();
                mh.d1 d1Var = ((qm) obj2).r;
                if (currentItemTop > AndroidUtilities.dp(7.0f)) {
                    listTopPadding -= currentItemTop;
                }
                d1Var.scrollBy(0, listTopPadding);
                break;
            case 1:
                ho.a(((fo) obj2).c);
                ((vf.g) obj).run();
                break;
            case 2:
                ((gp) obj2).b.x((List) obj);
                break;
            case 3:
                ((hp) obj2).b.x((List) obj);
                break;
            case 4:
                ((org.telegram.ui.ActionBar.h3) obj2).dismiss();
                af.g.s((Context) obj, "https://t.me/BotFather?start=deletebot");
                break;
            case 5:
                lr lrVar = (lr) obj2;
                lrVar.getClass();
                ((qh.d) obj).setLoading(false);
                lrVar.dismiss();
                break;
            case 6:
                lr lrVar2 = (lr) obj2;
                TLObject tLObject = (TLObject) obj;
                if (tLObject != null && (tLObject instanceof TL_phone.groupCallStreamRtmpUrl)) {
                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject;
                    lrVar2.Y = groupcallstreamrtmpurl.url;
                    lrVar2.Z = groupcallstreamrtmpurl.key;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(lrVar2.Z);
                    lrVar2.a0 = spannableStringBuilder;
                    t01 t01Var = new t01();
                    t01Var.a |= 256;
                    t01Var.b = 0;
                    t01Var.c = spannableStringBuilder.length();
                    lrVar2.a0.setSpan(new u01(t01Var, 0), 0, lrVar2.a0.length(), 0);
                    lrVar2.b0.N(false);
                    break;
                }
                break;
            case 7:
                qs qsVar = (qs) obj2;
                TLObject tLObject2 = (TLObject) obj;
                ns nsVar2 = qsVar.b;
                ArrayList arrayList = qsVar.h;
                int i15 = qsVar.a;
                if (!(tLObject2 instanceof TL_bots.popularAppBots)) {
                    qsVar.g = null;
                    qsVar.e = true;
                    qsVar.c = false;
                    nsVar2.run();
                    break;
                } else {
                    TL_bots.popularAppBots popularappbots = (TL_bots.popularAppBots) tLObject2;
                    MessagesController.getInstance(i15).putUsers(popularappbots.users, false);
                    MessagesStorage.getInstance(i15).putUsersAndChats(popularappbots.users, null, false, true);
                    arrayList.addAll(popularappbots.users);
                    String str = popularappbots.next_offset;
                    qsVar.g = str;
                    qsVar.e = str == null;
                    long currentTimeMillis = System.currentTimeMillis();
                    qsVar.f = currentTimeMillis;
                    if (qsVar.i) {
                        nsVar = nsVar2;
                    } else {
                        qsVar.i = true;
                        String str2 = qsVar.g;
                        if (str2 == null) {
                            str2 = "";
                        }
                        String str3 = str2;
                        ArrayList arrayList2 = new ArrayList();
                        int i16 = 0;
                        while (i16 < arrayList.size()) {
                            i16 = android.support.v4.media.a.g(((TLRPC.User) arrayList.get(i16)).id, arrayList2, i16, 1);
                            nsVar2 = nsVar2;
                        }
                        nsVar = nsVar2;
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i15);
                        messagesStorage.getStorageQueue().postRunnable(new lh.g1(qsVar, messagesStorage, arrayList2, currentTimeMillis, str3, 11));
                    }
                    qsVar.c = false;
                    nsVar.run();
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
                AndroidUtilities.runOnUIThread(new gm(9, (nt) obj2, decodeFile));
                break;
            case 9:
                ((nt) obj2).setImage((Bitmap) obj);
                break;
            case 10:
                ((EditTextBoldCursor) obj2).hintLayout.draw((Canvas) obj);
                break;
            case 11:
                i10 = ((org.telegram.ui.ActionBar.h3) ((xu) obj2).a).currentAccount;
                MessagesController.getInstance(i10).updateEmojiStatus((TLRPC.EmojiStatus) obj);
                break;
            case 12:
                MessagesController.getInstance(((cx) obj2).a.Z0).updateEmojiStatus((TLRPC.EmojiStatus) obj);
                break;
            case 13:
                TLObject tLObject3 = (TLObject) obj;
                mz mzVar = ((cx) obj2).a;
                if (tLObject3 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject3;
                    MediaDataController.getInstance(mzVar.Z0).putStickerSet(tL_messages_stickerSet);
                    MediaDataController.getInstance(mzVar.Z0).replaceStickerSet(tL_messages_stickerSet);
                    break;
                }
                break;
            case 14:
                cy cyVar = (cy) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                cyVar.s.f = true;
                mz mzVar2 = cyVar.B;
                if (!mzVar2.m1.contains(Long.valueOf(tL_messages_stickerSet2.set.id))) {
                    mzVar2.m1.add(Long.valueOf(tL_messages_stickerSet2.set.id));
                }
                cyVar.a(true);
                break;
            case 15:
                final ky kyVar = (ky) obj2;
                final String str4 = (String) obj;
                String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                mz mzVar3 = kyVar.a.C;
                if (!Arrays.equals(mzVar3.T0, currentKeyboardLanguage)) {
                    MediaDataController.getInstance(mzVar3.Z0).fetchNewEmojiKeywords(currentKeyboardLanguage);
                }
                mzVar3.T0 = currentKeyboardLanguage;
                ArrayList arrayList3 = new ArrayList();
                final ArrayList arrayList4 = new ArrayList();
                final ArrayList arrayList5 = new ArrayList();
                final Object[] objArr2 = objArr == true ? 1 : 0;
                Utilities.doCallbacks(new Utilities.Callback() { // from class: org.telegram.ui.Components.jy
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj3) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList6;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList7;
                        Runnable runnable = (Runnable) obj3;
                        switch (objArr2) {
                            case 0:
                                ky kyVar2 = kyVar;
                                MediaDataController.getInstance(kyVar2.a.C.Z0).searchStickerSets(true, str4, new lh.h(kyVar2, arrayList5, runnable, 9));
                                break;
                            default:
                                mz mzVar4 = kyVar.a.C;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(mzVar4.Z0).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str4 + "").toLowerCase());
                                    int i17 = mzVar4.Z0;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i17).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList8 = arrayList5;
                                    if (stickerSets != null) {
                                        for (int i18 = 0; i18 < stickerSets.size(); i18++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i18);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList7 = tL_messages_stickerSet3.documents) != null && !arrayList7.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.y3.w(" ", translitSafe, translitSafe2)) {
                                                    arrayList8.add(new dy(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
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
                                                        arrayList8.add(new dy(stickerSetCovered, arrayList6));
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
                }, new xk(i13, kyVar, str4), new Utilities.Callback() { // from class: org.telegram.ui.Components.jy
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj3) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList6;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList7;
                        Runnable runnable = (Runnable) obj3;
                        switch (i14) {
                            case 0:
                                ky kyVar2 = kyVar;
                                MediaDataController.getInstance(kyVar2.a.C.Z0).searchStickerSets(true, str4, new lh.h(kyVar2, arrayList4, runnable, 9));
                                break;
                            default:
                                mz mzVar4 = kyVar.a.C;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(mzVar4.Z0).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str4 + "").toLowerCase());
                                    int i17 = mzVar4.Z0;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i17).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList8 = arrayList4;
                                    if (stickerSets != null) {
                                        for (int i18 = 0; i18 < stickerSets.size(); i18++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i18);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList7 = tL_messages_stickerSet3.documents) != null && !arrayList7.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.y3.w(" ", translitSafe, translitSafe2)) {
                                                    arrayList8.add(new dy(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
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
                                                        arrayList8.add(new dy(stickerSetCovered, arrayList6));
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
                }, new xk(4, kyVar, arrayList3), new mh.f2(kyVar, str4, arrayList3, arrayList4, arrayList5, 4));
                break;
            case 16:
                ArrayList arrayList6 = (ArrayList) obj;
                ly lyVar = ((ky) obj2).a;
                lyVar.C.S.e(false);
                ArrayList arrayList7 = lyVar.r;
                lyVar.B = arrayList7.size() >= arrayList6.size();
                arrayList7.clear();
                arrayList7.addAll(arrayList6);
                lyVar.l();
                break;
            case 17:
                ((qy) obj2).F((String) obj, "", true, false, false);
                break;
            case 18:
                qy qyVar = (qy) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                mz mzVar4 = qyVar.I;
                MessagesController.getInstance(mzVar4.Z0).putUsers(tL_contacts_resolvedPeer.users, false);
                int i17 = mzVar4.Z0;
                MessagesController.getInstance(i17).putChats(tL_contacts_resolvedPeer.chats, false);
                MessagesStorage.getInstance(i17).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str5 = qyVar.w;
                qyVar.w = null;
                qyVar.F(str5, "", false, false, false);
                break;
            case 19:
                xz xzVar = (xz) obj2;
                qh.r6 r6Var = (qh.r6) obj;
                xzVar.c();
                xzVar.h(r6Var);
                b00 b00Var = xzVar.G;
                b00Var.h1 = r6Var;
                b00Var.j();
                break;
            case 20:
                ((xz) obj2).G.f1 = (a00) obj;
                break;
            case 21:
                ((d10) obj2).w0 = -1;
                ((Runnable) ((Pair) obj).first).run();
                break;
            case 22:
                ((xk) obj2).run((org.telegram.ui.ActionBar.p2) obj);
                break;
            case 23:
                y40 y40Var = (y40) obj2;
                Uri uri = (Uri) obj;
                y40Var.getClass();
                try {
                    LaunchActivity launchActivity = (LaunchActivity) y40Var.a.getParentActivity();
                    if (launchActivity != null) {
                        Bundle bundle = new Bundle();
                        if (uri != null) {
                            bundle.putParcelable("photoUri", uri);
                        }
                        org.telegram.ui.up0 up0Var = new org.telegram.ui.up0(bundle);
                        up0Var.e = false;
                        up0Var.f = false;
                        up0Var.c = y40Var;
                        launchActivity.p0(up0Var);
                        break;
                    } else {
                        break;
                    }
                } catch (Exception e6) {
                    FileLog.e(e6);
                    y40Var.s(false, ImageLoader.loadBitmap(null, uri, 800.0f, 800.0f, true), null);
                    return;
                }
            case 24:
                y50 y50Var = (y50) obj2;
                u50 u50Var = (u50) obj;
                z50 z50Var = y50Var.E0;
                VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
                z50Var.K = videoEditedInfo;
                videoEditedInfo.startTime = -1L;
                videoEditedInfo.endTime = -1L;
                videoEditedInfo.estimatedSize = Math.max(1L, z50Var.I);
                VideoEditedInfo videoEditedInfo2 = z50Var.K;
                videoEditedInfo2.roundVideo = true;
                videoEditedInfo2.file = z50Var.E;
                videoEditedInfo2.encryptedFile = z50Var.F;
                videoEditedInfo2.key = z50Var.G;
                videoEditedInfo2.iv = z50Var.H;
                videoEditedInfo2.framerate = 25;
                videoEditedInfo2.originalWidth = 360;
                videoEditedInfo2.resultWidth = 360;
                videoEditedInfo2.originalHeight = 360;
                videoEditedInfo2.resultHeight = 360;
                videoEditedInfo2.originalPath = y50Var.a.getAbsolutePath();
                VideoEditedInfo videoEditedInfo3 = z50Var.K;
                videoEditedInfo3.notReadyYet = true;
                videoEditedInfo3.thumb = z50Var.W0;
                videoEditedInfo3.estimatedDuration = z50Var.c0;
                z50Var.W0 = null;
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, y50Var.a.getAbsolutePath(), 0, true, 0, 0, 0L);
                if (u50Var != null) {
                    photoEntry.ttl = u50Var.c;
                    photoEntry.effectId = u50Var.d;
                }
                z50Var.c.r(photoEntry, z50Var.K, u50Var == null || u50Var.a, u50Var != null ? u50Var.b : 0, 0, false, u50Var != null ? u50Var.e : 0L);
                break;
            case 25:
                Bitmap bitmap = (Bitmap) obj;
                y50 y50Var2 = (y50) ((m2.b) obj2).b;
                if ((bitmap != null && bitmap.getPixel(0, 0) != 0) || y50Var2.x0.size() <= 1) {
                    y50Var2.x0.add(bitmap);
                    break;
                } else {
                    ArrayList arrayList8 = y50Var2.x0;
                    arrayList8.add((Bitmap) l.d.i(1, arrayList8));
                    break;
                }
                break;
            case 26:
                u60 u60Var2 = (u60) obj2;
                TLObject tLObject4 = (TLObject) obj;
                u60Var2.getClass();
                if (tLObject4 instanceof Vector) {
                    Vector vector = (Vector) tLObject4;
                    if (!vector.objects.isEmpty()) {
                        u60Var2.c.put(Long.valueOf(u60Var2.b.admin_id), (TLRPC.User) vector.objects.get(0));
                        u60Var2.Q.l();
                        break;
                    }
                }
                break;
            case 27:
                o60 o60Var = (o60) obj2;
                if (((TLRPC.TL_error) obj) == null && (ebVar = (u60Var = o60Var.a.c).g0) != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = u60Var.b;
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
            case 28:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                ((e70) obj2).setFocusable(true);
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new q1(i13, editTextBoldCursor));
                break;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", ((TLRPC.ChatFull) obj2).guard_bot_id);
                ((org.telegram.ui.ep) obj).presentFragment(new ProfileActivity(bundle2, null));
                break;
        }
    }
}
