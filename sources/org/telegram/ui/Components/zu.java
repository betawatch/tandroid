package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.view.ViewParent;
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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class zu implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zu(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        r60 r60Var;
        org.telegram.ui.hb hbVar;
        int i11;
        di.y0 y0Var;
        boolean z10;
        int i12 = this.a;
        int i13 = 5;
        int i14 = 3;
        boolean z11 = false;
        boolean z12 = true;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i12) {
            case 0:
                i10 = ((org.telegram.ui.ActionBar.f3) ((av) obj2).a).currentAccount;
                MessagesController.getInstance(i10).updateEmojiStatus((TLRPC.EmojiStatus) obj);
                break;
            case 1:
                MessagesController.getInstance(((dx) obj2).a.c1).updateEmojiStatus((TLRPC.EmojiStatus) obj);
                break;
            case 2:
                TLObject tLObject = (TLObject) obj;
                kz kzVar = ((dx) obj2).a;
                if (tLObject instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
                    MediaDataController.getInstance(kzVar.c1).putStickerSet(tL_messages_stickerSet);
                    MediaDataController.getInstance(kzVar.c1).replaceStickerSet(tL_messages_stickerSet);
                    break;
                }
                break;
            case 3:
                cy cyVar = (cy) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                cyVar.s.f = true;
                kz kzVar2 = cyVar.E;
                if (!kzVar2.p1.contains(Long.valueOf(tL_messages_stickerSet2.set.id))) {
                    kzVar2.p1.add(Long.valueOf(tL_messages_stickerSet2.set.id));
                }
                cyVar.a(true);
                break;
            case 4:
                final jy jyVar = (jy) obj2;
                final String str = (String) obj;
                String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                kz kzVar3 = jyVar.a.F;
                if (!Arrays.equals(kzVar3.W0, currentKeyboardLanguage)) {
                    MediaDataController.getInstance(kzVar3.c1).fetchNewEmojiKeywords(currentKeyboardLanguage);
                }
                kzVar3.W0 = currentKeyboardLanguage;
                ArrayList arrayList = new ArrayList();
                final ArrayList arrayList2 = new ArrayList();
                final ArrayList arrayList3 = new ArrayList();
                final int i15 = 0;
                final int i16 = 1;
                Utilities.doCallbacks(new Utilities.Callback() { // from class: org.telegram.ui.Components.iy
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj3) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList4;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList5;
                        Runnable runnable = (Runnable) obj3;
                        switch (i15) {
                            case 0:
                                jy jyVar2 = jyVar;
                                MediaDataController.getInstance(jyVar2.a.F.c1).searchStickerSets(true, str, new bi.o4(jyVar2, arrayList3, runnable, 5));
                                break;
                            default:
                                kz kzVar4 = jyVar.a.F;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(kzVar4.c1).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str + "").toLowerCase());
                                    int i17 = kzVar4.c1;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i17).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList6 = arrayList3;
                                    if (stickerSets != null) {
                                        for (int i18 = 0; i18 < stickerSets.size(); i18++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i18);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList5 = tL_messages_stickerSet3.documents) != null && !arrayList5.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.w1.w(" ", translitSafe, translitSafe2)) {
                                                    arrayList6.add(new dy(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
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
                                                if (translitSafe3.startsWith(translitSafe) || org.telegram.messenger.w1.w(" ", translitSafe, translitSafe3)) {
                                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                                        arrayList4 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                                        TLRPC.TL_messages_stickerSet stickerSet3 = MediaDataController.getInstance(i17).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                                                        arrayList4 = stickerSet3 != null ? stickerSet3.documents : null;
                                                    } else {
                                                        arrayList4 = stickerSetCovered.covers;
                                                    }
                                                    if (arrayList4 != null && !arrayList4.isEmpty()) {
                                                        arrayList6.add(new dy(stickerSetCovered, arrayList4));
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
                }, new org.telegram.ui.nf(16, jyVar, str), new Utilities.Callback() { // from class: org.telegram.ui.Components.iy
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj3) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList4;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList5;
                        Runnable runnable = (Runnable) obj3;
                        switch (i16) {
                            case 0:
                                jy jyVar2 = jyVar;
                                MediaDataController.getInstance(jyVar2.a.F.c1).searchStickerSets(true, str, new bi.o4(jyVar2, arrayList2, runnable, 5));
                                break;
                            default:
                                kz kzVar4 = jyVar.a.F;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(kzVar4.c1).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str + "").toLowerCase());
                                    int i17 = kzVar4.c1;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i17).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList6 = arrayList2;
                                    if (stickerSets != null) {
                                        for (int i18 = 0; i18 < stickerSets.size(); i18++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i18);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList5 = tL_messages_stickerSet3.documents) != null && !arrayList5.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.w1.w(" ", translitSafe, translitSafe2)) {
                                                    arrayList6.add(new dy(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
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
                                                if (translitSafe3.startsWith(translitSafe) || org.telegram.messenger.w1.w(" ", translitSafe, translitSafe3)) {
                                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                                        arrayList4 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                                        TLRPC.TL_messages_stickerSet stickerSet3 = MediaDataController.getInstance(i17).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                                                        arrayList4 = stickerSet3 != null ? stickerSet3.documents : null;
                                                    } else {
                                                        arrayList4 = stickerSetCovered.covers;
                                                    }
                                                    if (arrayList4 != null && !arrayList4.isEmpty()) {
                                                        arrayList6.add(new dy(stickerSetCovered, arrayList4));
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
                }, new org.telegram.ui.nf(17, jyVar, arrayList), new org.telegram.ui.ta(jyVar, str, arrayList, arrayList2, arrayList3));
                break;
            case 5:
                ArrayList arrayList4 = (ArrayList) obj;
                ky kyVar = ((jy) obj2).a;
                kyVar.F.V.e(false);
                ArrayList arrayList5 = kyVar.r;
                kyVar.E = arrayList5.size() >= arrayList4.size();
                arrayList5.clear();
                arrayList5.addAll(arrayList4);
                kyVar.l();
                break;
            case 6:
                ((py) obj2).F((String) obj, "", true, false, false);
                break;
            case 7:
                py pyVar = (py) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                kz kzVar4 = pyVar.L;
                MessagesController.getInstance(kzVar4.c1).putUsers(tL_contacts_resolvedPeer.users, false);
                int i17 = kzVar4.c1;
                MessagesController.getInstance(i17).putChats(tL_contacts_resolvedPeer.chats, false);
                MessagesStorage.getInstance(i17).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str2 = pyVar.w;
                pyVar.w = null;
                pyVar.F(str2, "", false, false, false);
                break;
            case 8:
                vz vzVar = (vz) obj2;
                di.n8 n8Var = (di.n8) obj;
                vzVar.c();
                vzVar.h(n8Var);
                zz zzVar = vzVar.J;
                zzVar.h1 = n8Var;
                zzVar.j();
                break;
            case 9:
                ((vz) obj2).J.f1 = (yz) obj;
                break;
            case 10:
                ((c10) obj2).z0 = -1;
                ((Runnable) ((Pair) obj).first).run();
                break;
            case 11:
                ((org.telegram.ui.nf) obj2).run((org.telegram.ui.ActionBar.n2) obj);
                break;
            case 12:
                u40 u40Var = (u40) obj2;
                Uri uri = (Uri) obj;
                u40Var.getClass();
                try {
                    LaunchActivity launchActivity = (LaunchActivity) u40Var.a.getParentActivity();
                    if (launchActivity != null) {
                        Bundle bundle = new Bundle();
                        if (uri != null) {
                            bundle.putParcelable("photoUri", uri);
                        }
                        org.telegram.ui.nq0 nq0Var = new org.telegram.ui.nq0(bundle);
                        nq0Var.e = false;
                        nq0Var.f = false;
                        nq0Var.c = u40Var;
                        launchActivity.p0(nq0Var);
                        break;
                    } else {
                        break;
                    }
                } catch (Exception e7) {
                    FileLog.e(e7);
                    u40Var.s(false, ImageLoader.loadBitmap(null, uri, 800.0f, 800.0f, true), null);
                    return;
                }
            case 13:
                v50 v50Var = (v50) obj2;
                q50 q50Var = (q50) obj;
                w50 w50Var = v50Var.H0;
                VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
                w50Var.N = videoEditedInfo;
                videoEditedInfo.startTime = -1L;
                videoEditedInfo.endTime = -1L;
                videoEditedInfo.estimatedSize = Math.max(1L, w50Var.L);
                VideoEditedInfo videoEditedInfo2 = w50Var.N;
                videoEditedInfo2.roundVideo = true;
                videoEditedInfo2.file = w50Var.H;
                videoEditedInfo2.encryptedFile = w50Var.I;
                videoEditedInfo2.key = w50Var.J;
                videoEditedInfo2.iv = w50Var.K;
                videoEditedInfo2.framerate = 25;
                videoEditedInfo2.originalWidth = 360;
                videoEditedInfo2.resultWidth = 360;
                videoEditedInfo2.originalHeight = 360;
                videoEditedInfo2.resultHeight = 360;
                videoEditedInfo2.originalPath = v50Var.a.getAbsolutePath();
                VideoEditedInfo videoEditedInfo3 = w50Var.N;
                videoEditedInfo3.notReadyYet = true;
                videoEditedInfo3.thumb = w50Var.Z0;
                videoEditedInfo3.estimatedDuration = w50Var.f0;
                w50Var.Z0 = null;
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, v50Var.a.getAbsolutePath(), 0, true, 0, 0, 0L);
                if (q50Var != null) {
                    photoEntry.ttl = q50Var.c;
                    photoEntry.effectId = q50Var.d;
                }
                w50Var.c.q(photoEntry, w50Var.N, q50Var == null || q50Var.a, q50Var != null ? q50Var.b : 0, 0, false, q50Var != null ? q50Var.e : 0L);
                break;
            case 14:
                Bitmap bitmap = (Bitmap) obj;
                v50 v50Var2 = (v50) ((org.telegram.ui.Cells.l7) obj2).b;
                if ((bitmap != null && bitmap.getPixel(0, 0) != 0) || v50Var2.A0.size() <= 1) {
                    v50Var2.A0.add(bitmap);
                    break;
                } else {
                    ArrayList arrayList6 = v50Var2.A0;
                    arrayList6.add((Bitmap) i2.g.h(1, arrayList6));
                    break;
                }
                break;
            case 15:
                r60 r60Var2 = (r60) obj2;
                TLObject tLObject2 = (TLObject) obj;
                r60Var2.getClass();
                if (tLObject2 instanceof Vector) {
                    Vector vector = (Vector) tLObject2;
                    if (!vector.objects.isEmpty()) {
                        r60Var2.c.put(Long.valueOf(r60Var2.b.admin_id), (TLRPC.User) vector.objects.get(0));
                        r60Var2.T.l();
                        break;
                    }
                }
                break;
            case 16:
                l60 l60Var = (l60) obj2;
                if (((TLRPC.TL_error) obj) == null && (hbVar = (r60Var = l60Var.a.c).j0) != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = r60Var.b;
                    org.telegram.ui.ub ubVar = hbVar.a;
                    ArrayList arrayList7 = ubVar.s0;
                    int size = arrayList7.size();
                    int i18 = ubVar.I.h;
                    TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                    TLRPC.TL_channelAdminLogEventActionExportedInviteDelete tL_channelAdminLogEventActionExportedInviteDelete = new TLRPC.TL_channelAdminLogEventActionExportedInviteDelete();
                    tL_channelAdminLogEventActionExportedInviteDelete.invite = tL_chatInviteExported;
                    tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteDelete;
                    tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                    tL_channelAdminLogEvent.user_id = ubVar.getAccountInstance().getUserConfig().clientUserId;
                    i11 = ((org.telegram.ui.ActionBar.n2) ubVar).currentAccount;
                    if (new MessageObject(i11, tL_channelAdminLogEvent, (ArrayList<MessageObject>) ubVar.r0, (HashMap<String, ArrayList<MessageObject>>) ubVar.q0, ubVar.s, ubVar.X, true).contentType >= 0) {
                        ubVar.R0();
                        int size2 = arrayList7.size() - size;
                        if (size2 > 0) {
                            ubVar.G0.N = true;
                            org.telegram.ui.qb qbVar = ubVar.I;
                            qbVar.s(qbVar.h, size2);
                            org.telegram.ui.ub.K0(ubVar);
                        }
                        ubVar.C0.remove(tL_chatInviteExported.link);
                        break;
                    }
                }
                break;
            case 17:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                ((b70) obj2).setFocusable(true);
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new r1(i14, editTextBoldCursor));
                break;
            case 18:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", ((TLRPC.ChatFull) obj2).guard_bot_id);
                ((org.telegram.ui.lp) obj).presentFragment(new ProfileActivity(bundle2, null));
                break;
            case 19:
                y80 y80Var = (y80) obj2;
                if (y80Var.O0 == ((e90) obj)) {
                    y80Var.performLongClick();
                    y80Var.O0 = null;
                    y80Var.M0.d(true);
                    break;
                }
                break;
            case 20:
                ((a90) obj2).l((h90) obj, false);
                break;
            case 21:
                ca0 ca0Var = (ca0) obj2;
                if (!((boolean[]) obj)[0] && (y0Var = ca0Var.U) != null) {
                    y0Var.run();
                }
                ca0Var.U = null;
                break;
            case 22:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) obj;
                ((ea0) obj2).setFocusable(true);
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.runOnUIThread(new r1(i13, editTextBoldCursor2));
                break;
            case 23:
                k2.g0 g0Var = (k2.g0) obj2;
                Runnable runnable = (Runnable) obj;
                g0Var.getClass();
                runnable.run();
                ((HashMap) g0Var.b).remove(runnable);
                break;
            case 24:
                yg0 yg0Var = (yg0) obj2;
                TLObject tLObject3 = (TLObject) obj;
                yg0Var.M = false;
                if (tLObject3 instanceof TLRPC.SearchPostsFlood) {
                    TLRPC.SearchPostsFlood searchPostsFlood = (TLRPC.SearchPostsFlood) tLObject3;
                    yg0Var.d = searchPostsFlood;
                    if (!searchPostsFlood.query_is_free) {
                        yg0Var.d();
                        yg0Var.c.Y2.N(true);
                        break;
                    } else {
                        yg0Var.a(false);
                        break;
                    }
                }
                break;
            case 25:
                dh0 dh0Var = (dh0) obj2;
                ArrayList arrayList8 = (ArrayList) obj;
                ArrayList arrayList9 = dh0Var.a;
                int i19 = dh0Var.x;
                int size3 = arrayList8.size();
                dh0Var.x = size3;
                if (i19 != size3 && dh0Var.S != null) {
                    dh0Var.g();
                }
                int size4 = arrayList9.size();
                int i20 = 0;
                while (i20 < size4) {
                    ah0 ah0Var = (ah0) arrayList9.get(i20);
                    if (ah0Var.o && !ah0Var.p) {
                        arrayList8.add(ah0Var);
                    } else if (dh0.j(ah0Var.a, arrayList8) == null) {
                        dh0 dh0Var2 = ah0Var.y;
                        float f7 = dh0Var2.N;
                        RectF rectF = ah0Var.c;
                        RectF rectF2 = ah0Var.f;
                        h90 h90Var = ah0Var.r;
                        if (h90Var != null) {
                            h90Var.a();
                            ah0Var.t = z11;
                            ah0Var.s = z11;
                        }
                        ah0Var.o = z12;
                        boolean z13 = rectF.left - 1.0f <= f7;
                        boolean z14 = rectF.right + 1.0f >= ((float) dh0Var2.getMeasuredWidth()) - f7;
                        if (z13 && z14) {
                            z14 = false;
                            z13 = false;
                        }
                        ah0Var.g.set(rectF);
                        rectF2.set(rectF);
                        if (z13) {
                            rectF2.right = rectF2.left;
                        } else if (z14) {
                            rectF2.left = rectF2.right;
                        } else {
                            int i21 = ah0Var.a;
                            if (i21 == 3 || i21 == 2) {
                                z10 = true;
                                if (dh0Var2.H == 1) {
                                    rectF2.left = rectF2.right;
                                    ah0Var.e.d(0.0f, z10);
                                    arrayList8.add(ah0Var);
                                }
                            } else {
                                z10 = true;
                            }
                            float centerX = rectF2.centerX();
                            rectF2.right = centerX;
                            rectF2.left = centerX;
                            ah0Var.e.d(0.0f, z10);
                            arrayList8.add(ah0Var);
                        }
                        z10 = true;
                        ah0Var.e.d(0.0f, z10);
                        arrayList8.add(ah0Var);
                    }
                    i20++;
                    z11 = false;
                    z12 = true;
                }
                arrayList9.clear();
                arrayList9.addAll(arrayList8);
                dh0Var.invalidate();
                break;
            case 26:
                ah0 ah0Var2 = (ah0) obj;
                ch0 ch0Var = ((dh0) obj2).F;
                int i22 = ah0Var2.a;
                RectF rectF3 = ah0Var2.d;
                ProfileActivity.Y(((org.telegram.ui.ky0) ch0Var).b, i22, rectF3.left, rectF3.top);
                break;
            case 27:
                Object obj3 = (ViewParent) obj;
                ((org.telegram.ui.Cells.t1) obj2).invalidate();
                if (obj3 instanceof View) {
                    ((View) obj3).invalidate();
                    break;
                }
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
                fj0 fj0Var = (fj0) obj2;
                ArrayList arrayList10 = (ArrayList) obj;
                ArrayList arrayList11 = fj0Var.r;
                fj0Var.n.addAll(arrayList10);
                int size5 = arrayList10.size();
                int i23 = 0;
                while (i23 < size5) {
                    Object obj4 = arrayList10.get(i23);
                    i23++;
                    ej0 ej0Var = (ej0) obj4;
                    int i24 = 0;
                    while (true) {
                        if (i24 >= arrayList11.size()) {
                            arrayList11.add(ej0Var);
                        } else if (MessageObject.getObjectPeerId(((ej0) arrayList11.get(i24)).a) != MessageObject.getObjectPeerId(ej0Var.a)) {
                            i24++;
                        } else if (ej0Var.c > 0) {
                            ((ej0) arrayList11.get(i24)).c = ej0Var.c;
                        }
                    }
                }
                q0.a aVar = fj0Var.w;
                if (aVar != null) {
                    aVar.accept(arrayList10);
                }
                fj0Var.a();
                break;
        }
    }
}
