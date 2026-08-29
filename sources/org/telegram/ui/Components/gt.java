package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
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
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gt implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gt(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        n60 n60Var;
        org.telegram.ui.ab abVar;
        int i11;
        jh.r5 r5Var;
        boolean z10;
        int i12 = this.a;
        int i13 = 5;
        int i14 = 3;
        boolean z11 = false;
        boolean z12 = true;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i12) {
            case 0:
                Bitmap decodeFile = BitmapFactory.decodeFile((String) obj);
                Canvas canvas = new Canvas(Bitmap.createBitmap(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f), Bitmap.Config.ARGB_8888));
                Paint paint = new Paint(3);
                canvas.translate(r2.getWidth() / 2.0f, r2.getHeight() / 2.0f);
                float max = Math.max(r2.getWidth() / decodeFile.getWidth(), r2.getHeight() / decodeFile.getHeight());
                canvas.scale(max, max);
                canvas.drawBitmap(decodeFile, (-decodeFile.getWidth()) / 2.0f, (-decodeFile.getHeight()) / 2.0f, paint);
                AndroidUtilities.runOnUIThread(new gt(1, (ht) obj2, decodeFile));
                break;
            case 1:
                ((ht) obj2).setImage((Bitmap) obj);
                break;
            case 2:
                ((EditTextBoldCursor) obj2).hintLayout.draw((Canvas) obj);
                break;
            case 3:
                i10 = ((org.telegram.ui.ActionBar.f3) ((su) obj2).a).currentAccount;
                MessagesController.getInstance(i10).updateEmojiStatus((TLRPC.EmojiStatus) obj);
                break;
            case 4:
                MessagesController.getInstance(((ww) obj2).a.Y0).updateEmojiStatus((TLRPC.EmojiStatus) obj);
                break;
            case 5:
                TLObject tLObject = (TLObject) obj;
                fz fzVar = ((ww) obj2).a;
                if (tLObject instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
                    MediaDataController.getInstance(fzVar.Y0).putStickerSet(tL_messages_stickerSet);
                    MediaDataController.getInstance(fzVar.Y0).replaceStickerSet(tL_messages_stickerSet);
                    break;
                }
                break;
            case 6:
                vx vxVar = (vx) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                vxVar.s.f = true;
                fz fzVar2 = vxVar.A;
                if (!fzVar2.l1.contains(Long.valueOf(tL_messages_stickerSet2.set.id))) {
                    fzVar2.l1.add(Long.valueOf(tL_messages_stickerSet2.set.id));
                }
                vxVar.a(true);
                break;
            case 7:
                final dy dyVar = (dy) obj2;
                final String str = (String) obj;
                String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                fz fzVar3 = dyVar.a.B;
                if (!Arrays.equals(fzVar3.S0, currentKeyboardLanguage)) {
                    MediaDataController.getInstance(fzVar3.Y0).fetchNewEmojiKeywords(currentKeyboardLanguage);
                }
                fzVar3.S0 = currentKeyboardLanguage;
                ArrayList arrayList = new ArrayList();
                final ArrayList arrayList2 = new ArrayList();
                final ArrayList arrayList3 = new ArrayList();
                final int i15 = 0;
                final int i16 = 1;
                Utilities.doCallbacks(new Utilities.Callback() { // from class: org.telegram.ui.Components.cy
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj3) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList4;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList5;
                        Runnable runnable = (Runnable) obj3;
                        switch (i15) {
                            case 0:
                                dy dyVar2 = dyVar;
                                MediaDataController.getInstance(dyVar2.a.B.Y0).searchStickerSets(true, str, new ih.i(dyVar2, arrayList3, runnable, 9));
                                break;
                            default:
                                fz fzVar4 = dyVar.a.B;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(fzVar4.Y0).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str + "").toLowerCase());
                                    int i17 = fzVar4.Y0;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i17).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList6 = arrayList3;
                                    if (stickerSets != null) {
                                        for (int i18 = 0; i18 < stickerSets.size(); i18++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i18);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList5 = tL_messages_stickerSet3.documents) != null && !arrayList5.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.x3.w(" ", translitSafe, translitSafe2)) {
                                                    arrayList6.add(new wx(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
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
                                                if (translitSafe3.startsWith(translitSafe) || org.telegram.messenger.x3.w(" ", translitSafe, translitSafe3)) {
                                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                                        arrayList4 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                                        TLRPC.TL_messages_stickerSet stickerSet3 = MediaDataController.getInstance(i17).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                                                        arrayList4 = stickerSet3 != null ? stickerSet3.documents : null;
                                                    } else {
                                                        arrayList4 = stickerSetCovered.covers;
                                                    }
                                                    if (arrayList4 != null && !arrayList4.isEmpty()) {
                                                        arrayList6.add(new wx(stickerSetCovered, arrayList4));
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
                }, new org.telegram.ui.tm(11, dyVar, str), new Utilities.Callback() { // from class: org.telegram.ui.Components.cy
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj3) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList4;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList5;
                        Runnable runnable = (Runnable) obj3;
                        switch (i16) {
                            case 0:
                                dy dyVar2 = dyVar;
                                MediaDataController.getInstance(dyVar2.a.B.Y0).searchStickerSets(true, str, new ih.i(dyVar2, arrayList2, runnable, 9));
                                break;
                            default:
                                fz fzVar4 = dyVar.a.B;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(fzVar4.Y0).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str + "").toLowerCase());
                                    int i17 = fzVar4.Y0;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i17).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList6 = arrayList2;
                                    if (stickerSets != null) {
                                        for (int i18 = 0; i18 < stickerSets.size(); i18++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i18);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList5 = tL_messages_stickerSet3.documents) != null && !arrayList5.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.x3.w(" ", translitSafe, translitSafe2)) {
                                                    arrayList6.add(new wx(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
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
                                                if (translitSafe3.startsWith(translitSafe) || org.telegram.messenger.x3.w(" ", translitSafe, translitSafe3)) {
                                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                                        arrayList4 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                                        TLRPC.TL_messages_stickerSet stickerSet3 = MediaDataController.getInstance(i17).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                                                        arrayList4 = stickerSet3 != null ? stickerSet3.documents : null;
                                                    } else {
                                                        arrayList4 = stickerSetCovered.covers;
                                                    }
                                                    if (arrayList4 != null && !arrayList4.isEmpty()) {
                                                        arrayList6.add(new wx(stickerSetCovered, arrayList4));
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
                }, new org.telegram.ui.tm(12, dyVar, arrayList), new jh.g2(dyVar, str, arrayList, arrayList2, arrayList3, 4));
                break;
            case 8:
                ArrayList arrayList4 = (ArrayList) obj;
                ey eyVar = ((dy) obj2).a;
                eyVar.B.R.e(false);
                ArrayList arrayList5 = eyVar.r;
                eyVar.A = arrayList5.size() >= arrayList4.size();
                arrayList5.clear();
                arrayList5.addAll(arrayList4);
                eyVar.l();
                break;
            case 9:
                ((jy) obj2).F((String) obj, "", true, false, false);
                break;
            case 10:
                jy jyVar = (jy) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                fz fzVar4 = jyVar.H;
                MessagesController.getInstance(fzVar4.Y0).putUsers(tL_contacts_resolvedPeer.users, false);
                int i17 = fzVar4.Y0;
                MessagesController.getInstance(i17).putChats(tL_contacts_resolvedPeer.chats, false);
                MessagesStorage.getInstance(i17).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str2 = jyVar.w;
                jyVar.w = null;
                jyVar.F(str2, "", false, false, false);
                break;
            case 11:
                qz qzVar = (qz) obj2;
                nh.n7 n7Var = (nh.n7) obj;
                qzVar.c();
                qzVar.h(n7Var);
                uz uzVar = qzVar.F;
                uzVar.h1 = n7Var;
                uzVar.j();
                break;
            case 12:
                ((qz) obj2).F.f1 = (tz) obj;
                break;
            case 13:
                ((y00) obj2).v0 = -1;
                ((Runnable) ((Pair) obj).first).run();
                break;
            case 14:
                ((org.telegram.ui.tm) obj2).run((org.telegram.ui.ActionBar.o2) obj);
                break;
            case 15:
                s40 s40Var = (s40) obj2;
                Uri uri = (Uri) obj;
                s40Var.getClass();
                try {
                    LaunchActivity launchActivity = (LaunchActivity) s40Var.a.getParentActivity();
                    if (launchActivity != null) {
                        Bundle bundle = new Bundle();
                        if (uri != null) {
                            bundle.putParcelable("photoUri", uri);
                        }
                        org.telegram.ui.kp0 kp0Var = new org.telegram.ui.kp0(bundle);
                        kp0Var.e = false;
                        kp0Var.f = false;
                        kp0Var.c = s40Var;
                        launchActivity.p0(kp0Var);
                        break;
                    } else {
                        break;
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                    s40Var.s(false, ImageLoader.loadBitmap(null, uri, 800.0f, 800.0f, true), null);
                    return;
                }
            case 16:
                r50 r50Var = (r50) obj2;
                n50 n50Var = (n50) obj;
                s50 s50Var = r50Var.D0;
                VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
                s50Var.J = videoEditedInfo;
                videoEditedInfo.startTime = -1L;
                videoEditedInfo.endTime = -1L;
                videoEditedInfo.estimatedSize = Math.max(1L, s50Var.H);
                VideoEditedInfo videoEditedInfo2 = s50Var.J;
                videoEditedInfo2.roundVideo = true;
                videoEditedInfo2.file = s50Var.D;
                videoEditedInfo2.encryptedFile = s50Var.E;
                videoEditedInfo2.key = s50Var.F;
                videoEditedInfo2.iv = s50Var.G;
                videoEditedInfo2.framerate = 25;
                videoEditedInfo2.originalWidth = 360;
                videoEditedInfo2.resultWidth = 360;
                videoEditedInfo2.originalHeight = 360;
                videoEditedInfo2.resultHeight = 360;
                videoEditedInfo2.originalPath = r50Var.a.getAbsolutePath();
                VideoEditedInfo videoEditedInfo3 = s50Var.J;
                videoEditedInfo3.notReadyYet = true;
                videoEditedInfo3.thumb = s50Var.V0;
                videoEditedInfo3.estimatedDuration = s50Var.b0;
                s50Var.V0 = null;
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, r50Var.a.getAbsolutePath(), 0, true, 0, 0, 0L);
                if (n50Var != null) {
                    photoEntry.ttl = n50Var.c;
                    photoEntry.effectId = n50Var.d;
                }
                s50Var.c.r(photoEntry, s50Var.J, n50Var == null || n50Var.a, n50Var != null ? n50Var.b : 0, 0, false, n50Var != null ? n50Var.e : 0L);
                break;
            case 17:
                Bitmap bitmap = (Bitmap) obj;
                r50 r50Var2 = (r50) ((lh.m7) obj2).b;
                if ((bitmap != null && bitmap.getPixel(0, 0) != 0) || r50Var2.w0.size() <= 1) {
                    r50Var2.w0.add(bitmap);
                    break;
                } else {
                    ArrayList arrayList6 = r50Var2.w0;
                    arrayList6.add((Bitmap) j7.l1.i(1, arrayList6));
                    break;
                }
                break;
            case 18:
                n60 n60Var2 = (n60) obj2;
                TLObject tLObject2 = (TLObject) obj;
                n60Var2.getClass();
                if (tLObject2 instanceof Vector) {
                    Vector vector = (Vector) tLObject2;
                    if (!vector.objects.isEmpty()) {
                        n60Var2.c.put(Long.valueOf(n60Var2.b.admin_id), (TLRPC.User) vector.objects.get(0));
                        n60Var2.P.l();
                        break;
                    }
                }
                break;
            case 19:
                h60 h60Var = (h60) obj2;
                if (((TLRPC.TL_error) obj) == null && (abVar = (n60Var = h60Var.a.c).f0) != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = n60Var.b;
                    org.telegram.ui.ob obVar = abVar.a;
                    ArrayList arrayList7 = obVar.o0;
                    int size = arrayList7.size();
                    int i18 = obVar.E.h;
                    TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                    TLRPC.TL_channelAdminLogEventActionExportedInviteDelete tL_channelAdminLogEventActionExportedInviteDelete = new TLRPC.TL_channelAdminLogEventActionExportedInviteDelete();
                    tL_channelAdminLogEventActionExportedInviteDelete.invite = tL_chatInviteExported;
                    tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteDelete;
                    tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                    tL_channelAdminLogEvent.user_id = obVar.getAccountInstance().getUserConfig().clientUserId;
                    i11 = ((org.telegram.ui.ActionBar.o2) obVar).currentAccount;
                    if (new MessageObject(i11, tL_channelAdminLogEvent, (ArrayList<MessageObject>) obVar.n0, (HashMap<String, ArrayList<MessageObject>>) obVar.m0, obVar.s, obVar.T, true).contentType >= 0) {
                        obVar.R0();
                        int size2 = arrayList7.size() - size;
                        if (size2 > 0) {
                            obVar.C0.N = true;
                            org.telegram.ui.kb kbVar = obVar.E;
                            kbVar.s(kbVar.h, size2);
                            org.telegram.ui.ob.K0(obVar);
                        }
                        obVar.y0.remove(tL_chatInviteExported.link);
                        break;
                    }
                }
                break;
            case 20:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                ((x60) obj2).setFocusable(true);
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new s1(i14, editTextBoldCursor));
                break;
            case 21:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", ((TLRPC.ChatFull) obj2).guard_bot_id);
                ((org.telegram.ui.yo) obj).presentFragment(new ProfileActivity(bundle2, null));
                break;
            case 22:
                t80 t80Var = (t80) obj2;
                if (t80Var.K0 == ((z80) obj)) {
                    t80Var.performLongClick();
                    t80Var.K0 = null;
                    t80Var.I0.d(true);
                    break;
                }
                break;
            case 23:
                ((v80) obj2).l((c90) obj, false);
                break;
            case 24:
                y90 y90Var = (y90) obj2;
                if (!((boolean[]) obj)[0] && (r5Var = y90Var.Q) != null) {
                    r5Var.run();
                }
                y90Var.Q = null;
                break;
            case 25:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) obj;
                ((aa0) obj2).setFocusable(true);
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.runOnUIThread(new s1(i13, editTextBoldCursor2));
                break;
            case 26:
                k8.i0 i0Var = (k8.i0) obj2;
                Runnable runnable = (Runnable) obj;
                i0Var.getClass();
                runnable.run();
                i0Var.a.remove(runnable);
                break;
            case 27:
                ug0 ug0Var = (ug0) obj2;
                TLObject tLObject3 = (TLObject) obj;
                ug0Var.I = false;
                if (tLObject3 instanceof TLRPC.SearchPostsFlood) {
                    TLRPC.SearchPostsFlood searchPostsFlood = (TLRPC.SearchPostsFlood) tLObject3;
                    ug0Var.d = searchPostsFlood;
                    if (!searchPostsFlood.query_is_free) {
                        ug0Var.d();
                        ug0Var.c.U2.N(true);
                        break;
                    } else {
                        ug0Var.a(false);
                        break;
                    }
                }
                break;
            case 28:
                zg0 zg0Var = (zg0) obj2;
                ArrayList arrayList8 = (ArrayList) obj;
                ArrayList arrayList9 = zg0Var.a;
                int i19 = zg0Var.x;
                int size3 = arrayList8.size();
                zg0Var.x = size3;
                if (i19 != size3 && zg0Var.O != null) {
                    zg0Var.g();
                }
                int size4 = arrayList9.size();
                int i20 = 0;
                while (i20 < size4) {
                    wg0 wg0Var = (wg0) arrayList9.get(i20);
                    if (wg0Var.o && !wg0Var.p) {
                        arrayList8.add(wg0Var);
                    } else if (zg0.j(wg0Var.a, arrayList8) == null) {
                        zg0 zg0Var2 = wg0Var.y;
                        float f9 = zg0Var2.J;
                        RectF rectF = wg0Var.c;
                        RectF rectF2 = wg0Var.f;
                        c90 c90Var = wg0Var.r;
                        if (c90Var != null) {
                            c90Var.a();
                            wg0Var.t = z11;
                            wg0Var.s = z11;
                        }
                        wg0Var.o = z12;
                        boolean z13 = rectF.left - 1.0f <= f9;
                        boolean z14 = rectF.right + 1.0f >= ((float) zg0Var2.getMeasuredWidth()) - f9;
                        if (z13 && z14) {
                            z14 = false;
                            z13 = false;
                        }
                        wg0Var.g.set(rectF);
                        rectF2.set(rectF);
                        if (z13) {
                            rectF2.right = rectF2.left;
                        } else if (z14) {
                            rectF2.left = rectF2.right;
                        } else {
                            int i21 = wg0Var.a;
                            if (i21 == 3 || i21 == 2) {
                                z10 = true;
                                if (zg0Var2.D == 1) {
                                    rectF2.left = rectF2.right;
                                    wg0Var.e.d(0.0f, z10);
                                    arrayList8.add(wg0Var);
                                }
                            } else {
                                z10 = true;
                            }
                            float centerX = rectF2.centerX();
                            rectF2.right = centerX;
                            rectF2.left = centerX;
                            wg0Var.e.d(0.0f, z10);
                            arrayList8.add(wg0Var);
                        }
                        z10 = true;
                        wg0Var.e.d(0.0f, z10);
                        arrayList8.add(wg0Var);
                    }
                    i20++;
                    z11 = false;
                    z12 = true;
                }
                arrayList9.clear();
                arrayList9.addAll(arrayList8);
                zg0Var.invalidate();
                break;
            default:
                wg0 wg0Var2 = (wg0) obj;
                yg0 yg0Var = ((zg0) obj2).B;
                int i22 = wg0Var2.a;
                RectF rectF3 = wg0Var2.d;
                ProfileActivity.Y(((org.telegram.ui.ex0) yg0Var).b, i22, rectF3.left, rectF3.top);
                break;
        }
    }
}
