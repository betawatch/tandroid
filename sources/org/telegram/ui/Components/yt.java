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

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
        l70 l70Var;
        org.telegram.ui.kb kbVar;
        int i11;
        ai.x7 x7Var;
        boolean z10;
        int i12 = this.a;
        int i13 = 4;
        int i14 = 2;
        boolean z11 = false;
        boolean z12 = true;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i12) {
            case 0:
                ((EditTextBoldCursor) obj2).hintLayout.draw((Canvas) obj);
                break;
            case 1:
                i10 = ((org.telegram.ui.ActionBar.f3) ((iv) obj2).a).currentAccount;
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
                jyVar.s.f = true;
                tz tzVar2 = jyVar.E;
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
                final int i15 = 0;
                final int i16 = 1;
                Utilities.doCallbacks(new Utilities.Callback() { // from class: org.telegram.ui.Components.py
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
                                MediaDataController.getInstance(syVar2.a.F.c1).searchStickerSets(true, str, new ai.y3(syVar2, arrayList3, runnable, 8));
                                break;
                            default:
                                tz tzVar4 = syVar.a.F;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(tzVar4.c1).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str + "").toLowerCase());
                                    int i17 = tzVar4.c1;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i17).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList6 = arrayList3;
                                    if (stickerSets != null) {
                                        for (int i18 = 0; i18 < stickerSets.size(); i18++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i18);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList5 = tL_messages_stickerSet3.documents) != null && !arrayList5.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.g0.w(" ", translitSafe, translitSafe2)) {
                                                    arrayList6.add(new ky(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
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
                                                if (translitSafe3.startsWith(translitSafe) || org.telegram.messenger.g0.w(" ", translitSafe, translitSafe3)) {
                                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                                        arrayList4 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                                        TLRPC.TL_messages_stickerSet stickerSet3 = MediaDataController.getInstance(i17).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
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
                }, new org.telegram.ui.ActionBar.j3(29, syVar, str), new Utilities.Callback() { // from class: org.telegram.ui.Components.py
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj3) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList4;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList5;
                        Runnable runnable = (Runnable) obj3;
                        switch (i16) {
                            case 0:
                                sy syVar2 = syVar;
                                MediaDataController.getInstance(syVar2.a.F.c1).searchStickerSets(true, str, new ai.y3(syVar2, arrayList2, runnable, 8));
                                break;
                            default:
                                tz tzVar4 = syVar.a.F;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(tzVar4.c1).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str + "").toLowerCase());
                                    int i17 = tzVar4.c1;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i17).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList6 = arrayList2;
                                    if (stickerSets != null) {
                                        for (int i18 = 0; i18 < stickerSets.size(); i18++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i18);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList5 = tL_messages_stickerSet3.documents) != null && !arrayList5.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.g0.w(" ", translitSafe, translitSafe2)) {
                                                    arrayList6.add(new ky(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
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
                                                if (translitSafe3.startsWith(translitSafe) || org.telegram.messenger.g0.w(" ", translitSafe, translitSafe3)) {
                                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                                        arrayList4 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                                        TLRPC.TL_messages_stickerSet stickerSet3 = MediaDataController.getInstance(i17).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
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
                }, new qy(i15, syVar, arrayList), new ai.d3(syVar, str, arrayList, arrayList2, arrayList3, 4));
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
                tz tzVar4 = yyVar.L;
                MessagesController.getInstance(tzVar4.c1).putUsers(tL_contacts_resolvedPeer.users, false);
                int i17 = tzVar4.c1;
                MessagesController.getInstance(i17).putChats(tL_contacts_resolvedPeer.chats, false);
                MessagesStorage.getInstance(i17).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
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
                ((qy) obj2).run((org.telegram.ui.ActionBar.n2) obj);
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
                        org.telegram.ui.xp0 xp0Var = new org.telegram.ui.xp0(bundle);
                        xp0Var.e = false;
                        xp0Var.f = false;
                        xp0Var.c = e50Var;
                        launchActivity.t0(xp0Var);
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
                m60 m60Var = f60Var.H0;
                VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
                m60Var.S = videoEditedInfo;
                videoEditedInfo.startTime = -1L;
                videoEditedInfo.endTime = -1L;
                videoEditedInfo.estimatedSize = Math.max(1L, m60Var.Q);
                VideoEditedInfo videoEditedInfo2 = m60Var.S;
                videoEditedInfo2.roundVideo = true;
                videoEditedInfo2.file = m60Var.M;
                videoEditedInfo2.encryptedFile = m60Var.N;
                videoEditedInfo2.key = m60Var.O;
                videoEditedInfo2.iv = m60Var.P;
                videoEditedInfo2.framerate = 25;
                videoEditedInfo2.originalWidth = 360;
                videoEditedInfo2.resultWidth = 360;
                videoEditedInfo2.originalHeight = 360;
                videoEditedInfo2.resultHeight = 360;
                videoEditedInfo2.originalPath = f60Var.a.getAbsolutePath();
                VideoEditedInfo videoEditedInfo3 = m60Var.S;
                videoEditedInfo3.notReadyYet = true;
                videoEditedInfo3.thumb = m60Var.j1;
                videoEditedInfo3.estimatedDuration = m60Var.k0;
                m60Var.j1 = null;
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, f60Var.a.getAbsolutePath(), 0, true, 0, 0, 0L);
                if (a60Var != null) {
                    photoEntry.ttl = a60Var.c;
                    photoEntry.effectId = a60Var.d;
                }
                m60Var.n.r(photoEntry, m60Var.S, a60Var == null || a60Var.a, a60Var != null ? a60Var.b : 0, 0, false, a60Var != null ? a60Var.e : 0L);
                break;
            case 15:
                Bitmap bitmap = (Bitmap) obj;
                f60 f60Var2 = (f60) ((org.telegram.ui.Cells.k7) obj2).b;
                if ((bitmap != null && bitmap.getPixel(0, 0) != 0) || f60Var2.A0.size() <= 1) {
                    f60Var2.A0.add(bitmap);
                    break;
                } else {
                    ArrayList arrayList6 = f60Var2.A0;
                    arrayList6.add((Bitmap) i2.d.h(1, arrayList6));
                    break;
                }
                break;
            case 16:
                l70 l70Var2 = (l70) obj2;
                TLObject tLObject2 = (TLObject) obj;
                l70Var2.getClass();
                if (tLObject2 instanceof Vector) {
                    Vector vector = (Vector) tLObject2;
                    if (!vector.objects.isEmpty()) {
                        l70Var2.c.put(Long.valueOf(l70Var2.b.admin_id), (TLRPC.User) vector.objects.get(0));
                        l70Var2.T.l();
                        break;
                    }
                }
                break;
            case 17:
                f70 f70Var = (f70) obj2;
                if (((TLRPC.TL_error) obj) == null && (kbVar = (l70Var = f70Var.a.c).j0) != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = l70Var.b;
                    org.telegram.ui.xb xbVar = kbVar.a;
                    ArrayList arrayList7 = xbVar.o0;
                    int size = arrayList7.size();
                    int i18 = xbVar.E.h;
                    TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                    TLRPC.TL_channelAdminLogEventActionExportedInviteDelete tL_channelAdminLogEventActionExportedInviteDelete = new TLRPC.TL_channelAdminLogEventActionExportedInviteDelete();
                    tL_channelAdminLogEventActionExportedInviteDelete.invite = tL_chatInviteExported;
                    tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteDelete;
                    tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                    tL_channelAdminLogEvent.user_id = xbVar.getAccountInstance().getUserConfig().clientUserId;
                    i11 = ((org.telegram.ui.ActionBar.n2) xbVar).currentAccount;
                    if (new MessageObject(i11, tL_channelAdminLogEvent, (ArrayList<MessageObject>) xbVar.n0, (HashMap<String, ArrayList<MessageObject>>) xbVar.m0, xbVar.f, xbVar.T, true).contentType >= 0) {
                        xbVar.R0();
                        int size2 = arrayList7.size() - size;
                        if (size2 > 0) {
                            xbVar.C0.N = true;
                            org.telegram.ui.tb tbVar = xbVar.E;
                            tbVar.s(tbVar.h, size2);
                            org.telegram.ui.xb.K0(xbVar);
                        }
                        xbVar.y0.remove(tL_chatInviteExported.link);
                        break;
                    }
                }
                break;
            case 18:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj2;
                ((v70) obj).setFocusable(true);
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new r1(i14, editTextBoldCursor));
                break;
            case 19:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", ((TLRPC.ChatFull) obj2).guard_bot_id);
                ((org.telegram.ui.yo) obj).presentFragment(new ProfileActivity(bundle2, null));
                break;
            case 20:
                s90 s90Var = (s90) obj2;
                if (s90Var.O0 == ((y90) obj)) {
                    s90Var.performLongClick();
                    s90Var.O0 = null;
                    s90Var.M0.d(true);
                    break;
                }
                break;
            case 21:
                ((u90) obj2).l((ba0) obj, false);
                break;
            case 22:
                wa0 wa0Var = (wa0) obj2;
                if (!((boolean[]) obj)[0] && (x7Var = wa0Var.U) != null) {
                    x7Var.run();
                }
                wa0Var.U = null;
                break;
            case 23:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) obj2;
                ((ya0) obj).setFocusable(true);
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.runOnUIThread(new r1(i13, editTextBoldCursor2));
                break;
            case 24:
                l2.f fVar = (l2.f) obj2;
                Runnable runnable = (Runnable) obj;
                fVar.getClass();
                runnable.run();
                ((HashMap) fVar.b).remove(runnable);
                break;
            case 25:
                th0 th0Var = (th0) obj2;
                TLObject tLObject3 = (TLObject) obj;
                th0Var.M = false;
                if (tLObject3 instanceof TLRPC.SearchPostsFlood) {
                    TLRPC.SearchPostsFlood searchPostsFlood = (TLRPC.SearchPostsFlood) tLObject3;
                    th0Var.d = searchPostsFlood;
                    if (!searchPostsFlood.query_is_free) {
                        th0Var.d();
                        th0Var.c.W2.N(true);
                        break;
                    } else {
                        th0Var.a(false);
                        break;
                    }
                }
                break;
            case 26:
                yh0 yh0Var = (yh0) obj2;
                ArrayList arrayList8 = (ArrayList) obj;
                ArrayList arrayList9 = yh0Var.a;
                int i19 = yh0Var.x;
                int size3 = arrayList8.size();
                yh0Var.x = size3;
                if (i19 != size3 && yh0Var.S != null) {
                    yh0Var.g();
                }
                int size4 = arrayList9.size();
                int i20 = 0;
                while (i20 < size4) {
                    vh0 vh0Var = (vh0) arrayList9.get(i20);
                    if (vh0Var.o && !vh0Var.p) {
                        arrayList8.add(vh0Var);
                    } else if (yh0.j(vh0Var.a, arrayList8) == null) {
                        yh0 yh0Var2 = vh0Var.y;
                        float f7 = yh0Var2.N;
                        RectF rectF = vh0Var.c;
                        RectF rectF2 = vh0Var.f;
                        ba0 ba0Var = vh0Var.r;
                        if (ba0Var != null) {
                            ba0Var.a();
                            vh0Var.t = z11;
                            vh0Var.s = z11;
                        }
                        vh0Var.o = z12;
                        boolean z13 = rectF.left - 1.0f <= f7 ? z12 : z11;
                        boolean z14 = rectF.right + 1.0f >= ((float) yh0Var2.getMeasuredWidth()) - f7;
                        if (z13 && z14) {
                            z14 = false;
                            z13 = false;
                        }
                        vh0Var.g.set(rectF);
                        rectF2.set(rectF);
                        if (z13) {
                            rectF2.right = rectF2.left;
                        } else if (z14) {
                            rectF2.left = rectF2.right;
                        } else {
                            int i21 = vh0Var.a;
                            if (i21 == 3 || i21 == 2) {
                                z10 = true;
                                if (yh0Var2.H == 1) {
                                    rectF2.left = rectF2.right;
                                    vh0Var.e.d(0.0f, z10);
                                    arrayList8.add(vh0Var);
                                }
                            } else {
                                z10 = true;
                            }
                            float centerX = rectF2.centerX();
                            rectF2.right = centerX;
                            rectF2.left = centerX;
                            vh0Var.e.d(0.0f, z10);
                            arrayList8.add(vh0Var);
                        }
                        z10 = true;
                        vh0Var.e.d(0.0f, z10);
                        arrayList8.add(vh0Var);
                    }
                    i20++;
                    z11 = false;
                    z12 = true;
                }
                arrayList9.clear();
                arrayList9.addAll(arrayList8);
                yh0Var.invalidate();
                break;
            case 27:
                vh0 vh0Var2 = (vh0) obj;
                xh0 xh0Var = ((yh0) obj2).F;
                int i22 = vh0Var2.a;
                RectF rectF3 = vh0Var2.d;
                ProfileActivity.e0(((org.telegram.ui.ox0) xh0Var).b, i22, rectF3.left, rectF3.top);
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
                ck0 ck0Var = (ck0) obj2;
                ArrayList arrayList10 = (ArrayList) obj;
                ArrayList arrayList11 = ck0Var.r;
                ck0Var.n.addAll(arrayList10);
                int size5 = arrayList10.size();
                int i23 = 0;
                while (i23 < size5) {
                    Object obj3 = arrayList10.get(i23);
                    i23++;
                    bk0 bk0Var = (bk0) obj3;
                    int i24 = 0;
                    while (true) {
                        if (i24 >= arrayList11.size()) {
                            arrayList11.add(bk0Var);
                        } else if (MessageObject.getObjectPeerId(((bk0) arrayList11.get(i24)).a) != MessageObject.getObjectPeerId(bk0Var.a)) {
                            i24++;
                        } else if (bk0Var.c > 0) {
                            ((bk0) arrayList11.get(i24)).c = bk0Var.c;
                        }
                    }
                }
                q0.a aVar = ck0Var.w;
                if (aVar != null) {
                    aVar.accept(arrayList10);
                }
                ck0Var.a();
                break;
        }
    }

    public /* synthetic */ yt(j71 j71Var, EditTextBoldCursor editTextBoldCursor, int i10) {
        this.a = i10;
        this.c = j71Var;
        this.b = editTextBoldCursor;
    }
}
