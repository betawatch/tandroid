package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
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

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yt implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yt(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        m70 m70Var;
        org.telegram.ui.ib ibVar;
        int i11;
        ai.y7 y7Var;
        boolean z10;
        int i12 = this.a;
        int i13 = 3;
        boolean z11 = false;
        boolean z12 = true;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i12) {
            case 0:
                ((EditTextBoldCursor) obj2).hintLayout.draw((Canvas) obj);
                break;
            case 1:
                i10 = ((org.telegram.ui.ActionBar.h3) ((iv) obj2).a).currentAccount;
                MessagesController.getInstance(i10).updateEmojiStatus((TLRPC.EmojiStatus) obj);
                break;
            case 2:
                MessagesController.getInstance(((lx) obj2).a.c1).updateEmojiStatus((TLRPC.EmojiStatus) obj);
                break;
            case 3:
                TLObject tLObject = (TLObject) obj;
                tz tzVar = ((lx) obj2).a;
                if (tLObject instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
                    MediaDataController.getInstance(tzVar.c1).putStickerSet(tL_messages_stickerSet);
                    MediaDataController.getInstance(tzVar.c1).replaceStickerSet(tL_messages_stickerSet);
                    break;
                }
                break;
            case 4:
                jy jyVar = (jy) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                jyVar.w.f = true;
                tz tzVar2 = jyVar.G;
                if (!tzVar2.p1.contains(Long.valueOf(tL_messages_stickerSet2.set.id))) {
                    tzVar2.p1.add(Long.valueOf(tL_messages_stickerSet2.set.id));
                }
                jyVar.a(true);
                break;
            case 5:
                final sy syVar = (sy) obj2;
                final String str = (String) obj;
                String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                tz tzVar3 = syVar.a.F;
                if (!Arrays.equals(tzVar3.W0, currentKeyboardLanguage)) {
                    MediaDataController.getInstance(tzVar3.c1).fetchNewEmojiKeywords(currentKeyboardLanguage);
                }
                tzVar3.W0 = currentKeyboardLanguage;
                ArrayList arrayList = new ArrayList();
                final ArrayList arrayList2 = new ArrayList();
                final ArrayList arrayList3 = new ArrayList();
                final int i14 = 0;
                final int i15 = 1;
                Utilities.doCallbacks(new Utilities.Callback() { // from class: org.telegram.ui.Components.py
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj3) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList4;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList5;
                        Runnable runnable = (Runnable) obj3;
                        switch (i14) {
                            case 0:
                                sy syVar2 = syVar;
                                MediaDataController.getInstance(syVar2.a.F.c1).searchStickerSets(true, str, new ai.a4(syVar2, arrayList3, runnable, 8));
                                break;
                            default:
                                tz tzVar4 = syVar.a.F;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(tzVar4.c1).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str + "").toLowerCase());
                                    int i16 = tzVar4.c1;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i16).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList6 = arrayList3;
                                    if (stickerSets != null) {
                                        for (int i17 = 0; i17 < stickerSets.size(); i17++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i17);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList5 = tL_messages_stickerSet3.documents) != null && !arrayList5.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.v0.w(" ", translitSafe, translitSafe2)) {
                                                    arrayList6.add(new ky(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
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
                                                if (translitSafe3.startsWith(translitSafe) || org.telegram.messenger.v0.w(" ", translitSafe, translitSafe3)) {
                                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                                        arrayList4 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                                        TLRPC.TL_messages_stickerSet stickerSet3 = MediaDataController.getInstance(i16).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                                                        arrayList4 = stickerSet3 != null ? stickerSet3.documents : null;
                                                    } else {
                                                        arrayList4 = stickerSetCovered.covers;
                                                    }
                                                    if (arrayList4 != null && !arrayList4.isEmpty()) {
                                                        arrayList6.add(new ky(stickerSetCovered, arrayList4));
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
                }, new org.telegram.ui.ActionBar.m3(29, syVar, str), new Utilities.Callback() { // from class: org.telegram.ui.Components.py
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj3) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList4;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList5;
                        Runnable runnable = (Runnable) obj3;
                        switch (i15) {
                            case 0:
                                sy syVar2 = syVar;
                                MediaDataController.getInstance(syVar2.a.F.c1).searchStickerSets(true, str, new ai.a4(syVar2, arrayList2, runnable, 8));
                                break;
                            default:
                                tz tzVar4 = syVar.a.F;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(tzVar4.c1).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str + "").toLowerCase());
                                    int i16 = tzVar4.c1;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i16).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList6 = arrayList2;
                                    if (stickerSets != null) {
                                        for (int i17 = 0; i17 < stickerSets.size(); i17++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i17);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList5 = tL_messages_stickerSet3.documents) != null && !arrayList5.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.v0.w(" ", translitSafe, translitSafe2)) {
                                                    arrayList6.add(new ky(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
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
                                                if (translitSafe3.startsWith(translitSafe) || org.telegram.messenger.v0.w(" ", translitSafe, translitSafe3)) {
                                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                                        arrayList4 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                                        TLRPC.TL_messages_stickerSet stickerSet3 = MediaDataController.getInstance(i16).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                                                        arrayList4 = stickerSet3 != null ? stickerSet3.documents : null;
                                                    } else {
                                                        arrayList4 = stickerSetCovered.covers;
                                                    }
                                                    if (arrayList4 != null && !arrayList4.isEmpty()) {
                                                        arrayList6.add(new ky(stickerSetCovered, arrayList4));
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
                }, new qy(i14, syVar, arrayList), new ai.f3(syVar, str, arrayList, arrayList2, arrayList3, 4));
                break;
            case 6:
                ArrayList arrayList4 = (ArrayList) obj;
                ty tyVar = ((sy) obj2).a;
                tyVar.F.V.e(false);
                ArrayList arrayList5 = tyVar.r;
                tyVar.E = arrayList5.size() >= arrayList4.size();
                arrayList5.clear();
                arrayList5.addAll(arrayList4);
                tyVar.l();
                break;
            case 7:
                ((yy) obj2).F((String) obj, "", true, false, false);
                break;
            case 8:
                yy yyVar = (yy) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                int i16 = yyVar.L.c1;
                MessagesController.getInstance(i16).putUsers(tL_contacts_resolvedPeer.users, false);
                MessagesController.getInstance(i16).putChats(tL_contacts_resolvedPeer.chats, false);
                MessagesStorage.getInstance(i16).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str2 = yyVar.w;
                yyVar.w = null;
                yyVar.F(str2, "", false, false, false);
                break;
            case 9:
                e00 e00Var = (e00) obj2;
                ei.z7 z7Var = (ei.z7) obj;
                e00Var.c();
                e00Var.h(z7Var);
                i00 i00Var = e00Var.J;
                i00Var.h1 = z7Var;
                i00Var.j();
                break;
            case 10:
                ((e00) obj2).J.f1 = (h00) obj;
                break;
            case 11:
                ((k10) obj2).z0 = -1;
                ((Runnable) ((Pair) obj).first).run();
                break;
            case 12:
                ((qy) obj2).run((org.telegram.ui.ActionBar.o2) obj);
                break;
            case 13:
                e50 e50Var = (e50) obj2;
                Uri uri = (Uri) obj;
                e50Var.getClass();
                try {
                    LaunchActivity launchActivity = (LaunchActivity) e50Var.a.getParentActivity();
                    if (launchActivity != null) {
                        Bundle bundle = new Bundle();
                        if (uri != null) {
                            bundle.putParcelable("photoUri", uri);
                        }
                        org.telegram.ui.yp0 yp0Var = new org.telegram.ui.yp0(bundle);
                        yp0Var.e = false;
                        yp0Var.f = false;
                        yp0Var.c = e50Var;
                        launchActivity.u0(yp0Var);
                        break;
                    } else {
                        break;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                    e50Var.r(false, ImageLoader.loadBitmap(null, uri, 800.0f, 800.0f, true), null);
                    return;
                }
            case 14:
                f60 f60Var = (f60) obj2;
                a60 a60Var = (a60) obj;
                n60 n60Var = f60Var.H0;
                VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
                n60Var.S = videoEditedInfo;
                videoEditedInfo.startTime = -1L;
                videoEditedInfo.endTime = -1L;
                videoEditedInfo.estimatedSize = Math.max(1L, n60Var.Q);
                VideoEditedInfo videoEditedInfo2 = n60Var.S;
                videoEditedInfo2.roundVideo = true;
                videoEditedInfo2.file = n60Var.M;
                videoEditedInfo2.encryptedFile = n60Var.N;
                videoEditedInfo2.key = n60Var.O;
                videoEditedInfo2.iv = n60Var.P;
                videoEditedInfo2.framerate = 25;
                videoEditedInfo2.originalWidth = 360;
                videoEditedInfo2.resultWidth = 360;
                videoEditedInfo2.originalHeight = 360;
                videoEditedInfo2.resultHeight = 360;
                videoEditedInfo2.originalPath = f60Var.a.getAbsolutePath();
                VideoEditedInfo videoEditedInfo3 = n60Var.S;
                videoEditedInfo3.notReadyYet = true;
                videoEditedInfo3.thumb = n60Var.j1;
                videoEditedInfo3.estimatedDuration = n60Var.k0;
                n60Var.j1 = null;
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, f60Var.a.getAbsolutePath(), 0, true, 0, 0, 0L);
                if (a60Var != null) {
                    photoEntry.ttl = a60Var.c;
                    photoEntry.effectId = a60Var.d;
                }
                n60Var.n.s(photoEntry, n60Var.S, a60Var == null || a60Var.a, a60Var != null ? a60Var.b : 0, 0, false, a60Var != null ? a60Var.e : 0L);
                break;
            case 15:
                Bitmap bitmap = (Bitmap) obj;
                f60 f60Var2 = (f60) ((org.telegram.ui.Cells.u5) obj2).b;
                if ((bitmap != null && bitmap.getPixel(0, 0) != 0) || f60Var2.A0.size() <= 1) {
                    f60Var2.A0.add(bitmap);
                    break;
                } else {
                    ArrayList arrayList6 = f60Var2.A0;
                    arrayList6.add((Bitmap) i2.o1.i(1, arrayList6));
                    break;
                }
                break;
            case 16:
                m70 m70Var2 = (m70) obj2;
                TLObject tLObject2 = (TLObject) obj;
                m70Var2.getClass();
                if (tLObject2 instanceof Vector) {
                    Vector vector = (Vector) tLObject2;
                    if (!vector.objects.isEmpty()) {
                        m70Var2.c.put(Long.valueOf(m70Var2.b.admin_id), (TLRPC.User) vector.objects.get(0));
                        m70Var2.T.l();
                        break;
                    }
                }
                break;
            case 17:
                g70 g70Var = (g70) obj2;
                if (((TLRPC.TL_error) obj) == null && (ibVar = (m70Var = g70Var.a.c).j0) != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = m70Var.b;
                    org.telegram.ui.vb vbVar = ibVar.a;
                    ArrayList arrayList7 = vbVar.o0;
                    int size = arrayList7.size();
                    int i17 = vbVar.E.h;
                    TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                    TLRPC.TL_channelAdminLogEventActionExportedInviteDelete tL_channelAdminLogEventActionExportedInviteDelete = new TLRPC.TL_channelAdminLogEventActionExportedInviteDelete();
                    tL_channelAdminLogEventActionExportedInviteDelete.invite = tL_chatInviteExported;
                    tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteDelete;
                    tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                    tL_channelAdminLogEvent.user_id = vbVar.getAccountInstance().getUserConfig().clientUserId;
                    i11 = ((org.telegram.ui.ActionBar.o2) vbVar).currentAccount;
                    if (new MessageObject(i11, tL_channelAdminLogEvent, (ArrayList<MessageObject>) vbVar.n0, (HashMap<String, ArrayList<MessageObject>>) vbVar.m0, vbVar.f, vbVar.T, true).contentType >= 0) {
                        vbVar.R0();
                        int size2 = arrayList7.size() - size;
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
            case 18:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj2;
                ((x70) obj).setFocusable(true);
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new n70(editTextBoldCursor, 1));
                break;
            case 19:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", ((TLRPC.ChatFull) obj2).guard_bot_id);
                ((org.telegram.ui.yo) obj).presentFragment(new ProfileActivity(bundle2, null));
                break;
            case 20:
                t90 t90Var = (t90) obj2;
                if (t90Var.O0 == ((z90) obj)) {
                    t90Var.performLongClick();
                    t90Var.O0 = null;
                    t90Var.M0.d(true);
                    break;
                }
                break;
            case 21:
                ((v90) obj2).l((ca0) obj, false);
                break;
            case 22:
                xa0 xa0Var = (xa0) obj2;
                if (!((boolean[]) obj)[0] && (y7Var = xa0Var.U) != null) {
                    y7Var.run();
                }
                xa0Var.U = null;
                break;
            case 23:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) obj2;
                ((za0) obj).setFocusable(true);
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.runOnUIThread(new n70(editTextBoldCursor2, i13));
                break;
            case 24:
                l2.f fVar = (l2.f) obj2;
                Runnable runnable = (Runnable) obj;
                fVar.getClass();
                runnable.run();
                ((HashMap) fVar.b).remove(runnable);
                break;
            case 25:
                xh0 xh0Var = (xh0) obj2;
                TLObject tLObject3 = (TLObject) obj;
                xh0Var.M = false;
                if (tLObject3 instanceof TLRPC.SearchPostsFlood) {
                    TLRPC.SearchPostsFlood searchPostsFlood = (TLRPC.SearchPostsFlood) tLObject3;
                    xh0Var.d = searchPostsFlood;
                    if (!searchPostsFlood.query_is_free) {
                        xh0Var.d();
                        xh0Var.c.Z2.N(true);
                        break;
                    } else {
                        xh0Var.a(false);
                        break;
                    }
                }
                break;
            case 26:
                ci0 ci0Var = (ci0) obj2;
                ArrayList arrayList8 = (ArrayList) obj;
                ArrayList arrayList9 = ci0Var.a;
                int i18 = ci0Var.x;
                int size3 = arrayList8.size();
                ci0Var.x = size3;
                if (i18 != size3 && ci0Var.S != null) {
                    ci0Var.g();
                }
                int size4 = arrayList9.size();
                int i19 = 0;
                while (i19 < size4) {
                    zh0 zh0Var = (zh0) arrayList9.get(i19);
                    if (zh0Var.o && !zh0Var.p) {
                        arrayList8.add(zh0Var);
                    } else if (ci0.j(zh0Var.a, arrayList8) == null) {
                        ci0 ci0Var2 = zh0Var.y;
                        float f7 = ci0Var2.N;
                        RectF rectF = zh0Var.c;
                        RectF rectF2 = zh0Var.f;
                        ca0 ca0Var = zh0Var.r;
                        if (ca0Var != null) {
                            ca0Var.a();
                            zh0Var.t = z11;
                            zh0Var.s = z11;
                        }
                        zh0Var.o = z12;
                        boolean z13 = rectF.left - 1.0f <= f7 ? z12 : z11;
                        boolean z14 = rectF.right + 1.0f >= ((float) ci0Var2.getMeasuredWidth()) - f7;
                        if (z13 && z14) {
                            z14 = false;
                            z13 = false;
                        }
                        zh0Var.g.set(rectF);
                        rectF2.set(rectF);
                        if (z13) {
                            rectF2.right = rectF2.left;
                        } else if (z14) {
                            rectF2.left = rectF2.right;
                        } else {
                            int i20 = zh0Var.a;
                            if (i20 == 3 || i20 == 2) {
                                z10 = true;
                                if (ci0Var2.H == 1) {
                                    rectF2.left = rectF2.right;
                                    zh0Var.e.d(0.0f, z10);
                                    arrayList8.add(zh0Var);
                                }
                            } else {
                                z10 = true;
                            }
                            float centerX = rectF2.centerX();
                            rectF2.right = centerX;
                            rectF2.left = centerX;
                            zh0Var.e.d(0.0f, z10);
                            arrayList8.add(zh0Var);
                        }
                        z10 = true;
                        zh0Var.e.d(0.0f, z10);
                        arrayList8.add(zh0Var);
                    }
                    i19++;
                    z11 = false;
                    z12 = true;
                }
                arrayList9.clear();
                arrayList9.addAll(arrayList8);
                ci0Var.invalidate();
                break;
            case 27:
                zh0 zh0Var2 = (zh0) obj;
                bi0 bi0Var = ((ci0) obj2).F;
                int i21 = zh0Var2.a;
                RectF rectF3 = zh0Var2.d;
                ProfileActivity.d0(((org.telegram.ui.qx0) bi0Var).b, i21, rectF3.left, rectF3.top);
                break;
            case 28:
                RLottieNative rLottieNative = (RLottieNative) obj2;
                RLottieNative rLottieNative2 = (RLottieNative) obj;
                if (rLottieNative != null) {
                    rLottieNative.d();
                }
                if (rLottieNative2 != null) {
                    rLottieNative2.d();
                    break;
                }
                break;
            default:
                gk0 gk0Var = (gk0) obj2;
                ArrayList arrayList10 = (ArrayList) obj;
                ArrayList arrayList11 = gk0Var.r;
                gk0Var.n.addAll(arrayList10);
                int size5 = arrayList10.size();
                int i22 = 0;
                while (i22 < size5) {
                    Object obj3 = arrayList10.get(i22);
                    i22++;
                    fk0 fk0Var = (fk0) obj3;
                    int i23 = 0;
                    while (true) {
                        if (i23 >= arrayList11.size()) {
                            arrayList11.add(fk0Var);
                        } else if (MessageObject.getObjectPeerId(((fk0) arrayList11.get(i23)).a) != MessageObject.getObjectPeerId(fk0Var.a)) {
                            i23++;
                        } else if (fk0Var.c > 0) {
                            ((fk0) arrayList11.get(i23)).c = fk0Var.c;
                        }
                    }
                }
                q0.a aVar = gk0Var.w;
                if (aVar != null) {
                    aVar.accept(arrayList10);
                }
                gk0Var.a();
                break;
        }
    }

    public /* synthetic */ yt(s71 s71Var, EditTextBoldCursor editTextBoldCursor, int i10) {
        this.a = i10;
        this.c = s71Var;
        this.b = editTextBoldCursor;
    }
}
