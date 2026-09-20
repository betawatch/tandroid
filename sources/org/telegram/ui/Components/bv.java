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

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class bv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bv(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        z60 z60Var;
        org.telegram.ui.ib ibVar;
        int i11;
        ci.y0 y0Var;
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
                i10 = ((org.telegram.ui.ActionBar.f3) ((cv) obj2).a).currentAccount;
                MessagesController.getInstance(i10).updateEmojiStatus((TLRPC.EmojiStatus) obj);
                break;
            case 1:
                MessagesController.getInstance(((ex) obj2).a.c1).updateEmojiStatus((TLRPC.EmojiStatus) obj);
                break;
            case 2:
                TLObject tLObject = (TLObject) obj;
                kz kzVar = ((ex) obj2).a;
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
                                MediaDataController.getInstance(jyVar2.a.F.c1).searchStickerSets(true, str, new ai.d5(jyVar2, arrayList3, runnable, 5));
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
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.l0.v(" ", translitSafe, translitSafe2)) {
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
                                                if (translitSafe3.startsWith(translitSafe) || org.telegram.messenger.l0.v(" ", translitSafe, translitSafe3)) {
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
                }, new org.telegram.ui.of(16, jyVar, str), new Utilities.Callback() { // from class: org.telegram.ui.Components.iy
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
                                MediaDataController.getInstance(jyVar2.a.F.c1).searchStickerSets(true, str, new ai.d5(jyVar2, arrayList2, runnable, 5));
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
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.l0.v(" ", translitSafe, translitSafe2)) {
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
                                                if (translitSafe3.startsWith(translitSafe) || org.telegram.messenger.l0.v(" ", translitSafe, translitSafe3)) {
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
                }, new org.telegram.ui.of(17, jyVar, arrayList), new org.telegram.ui.ta(jyVar, str, arrayList, arrayList2, arrayList3));
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
                ci.n8 n8Var = (ci.n8) obj;
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
                ((org.telegram.ui.of) obj2).run((org.telegram.ui.ActionBar.n2) obj);
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
                        org.telegram.ui.oq0 oq0Var = new org.telegram.ui.oq0(bundle);
                        oq0Var.e = false;
                        oq0Var.f = false;
                        oq0Var.c = u40Var;
                        launchActivity.p0(oq0Var);
                        break;
                    } else {
                        break;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                    u40Var.s(false, ImageLoader.loadBitmap(null, uri, 800.0f, 800.0f, true), null);
                    return;
                }
            case 13:
                u50 u50Var = (u50) obj2;
                p50 p50Var = (p50) obj;
                a60 a60Var = u50Var.H0;
                VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
                a60Var.Q = videoEditedInfo;
                videoEditedInfo.startTime = -1L;
                videoEditedInfo.endTime = -1L;
                videoEditedInfo.estimatedSize = Math.max(1L, a60Var.O);
                VideoEditedInfo videoEditedInfo2 = a60Var.Q;
                videoEditedInfo2.roundVideo = true;
                videoEditedInfo2.file = a60Var.K;
                videoEditedInfo2.encryptedFile = a60Var.L;
                videoEditedInfo2.key = a60Var.M;
                videoEditedInfo2.iv = a60Var.N;
                videoEditedInfo2.framerate = 25;
                videoEditedInfo2.originalWidth = 360;
                videoEditedInfo2.resultWidth = 360;
                videoEditedInfo2.originalHeight = 360;
                videoEditedInfo2.resultHeight = 360;
                videoEditedInfo2.originalPath = u50Var.a.getAbsolutePath();
                VideoEditedInfo videoEditedInfo3 = a60Var.Q;
                videoEditedInfo3.notReadyYet = true;
                videoEditedInfo3.thumb = a60Var.c1;
                videoEditedInfo3.estimatedDuration = a60Var.i0;
                a60Var.c1 = null;
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, u50Var.a.getAbsolutePath(), 0, true, 0, 0, 0L);
                if (p50Var != null) {
                    photoEntry.ttl = p50Var.c;
                    photoEntry.effectId = p50Var.d;
                }
                a60Var.f.q(photoEntry, a60Var.Q, p50Var == null || p50Var.a, p50Var != null ? p50Var.b : 0, 0, false, p50Var != null ? p50Var.e : 0L);
                break;
            case 14:
                Bitmap bitmap = (Bitmap) obj;
                u50 u50Var2 = (u50) ((org.telegram.ui.Cells.u6) obj2).b;
                if ((bitmap != null && bitmap.getPixel(0, 0) != 0) || u50Var2.A0.size() <= 1) {
                    u50Var2.A0.add(bitmap);
                    break;
                } else {
                    ArrayList arrayList6 = u50Var2.A0;
                    arrayList6.add((Bitmap) hg.k0.g(1, arrayList6));
                    break;
                }
                break;
            case 15:
                z60 z60Var2 = (z60) obj2;
                TLObject tLObject2 = (TLObject) obj;
                z60Var2.getClass();
                if (tLObject2 instanceof Vector) {
                    Vector vector = (Vector) tLObject2;
                    if (!vector.objects.isEmpty()) {
                        z60Var2.c.put(Long.valueOf(z60Var2.b.admin_id), (TLRPC.User) vector.objects.get(0));
                        z60Var2.T.l();
                        break;
                    }
                }
                break;
            case 16:
                t60 t60Var = (t60) obj2;
                if (((TLRPC.TL_error) obj) == null && (ibVar = (z60Var = t60Var.a.c).j0) != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = z60Var.b;
                    org.telegram.ui.vb vbVar = ibVar.a;
                    ArrayList arrayList7 = vbVar.o0;
                    int size = arrayList7.size();
                    int i18 = vbVar.E.h;
                    TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                    TLRPC.TL_channelAdminLogEventActionExportedInviteDelete tL_channelAdminLogEventActionExportedInviteDelete = new TLRPC.TL_channelAdminLogEventActionExportedInviteDelete();
                    tL_channelAdminLogEventActionExportedInviteDelete.invite = tL_chatInviteExported;
                    tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteDelete;
                    tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                    tL_channelAdminLogEvent.user_id = vbVar.getAccountInstance().getUserConfig().clientUserId;
                    i11 = ((org.telegram.ui.ActionBar.n2) vbVar).currentAccount;
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
            case 17:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                ((j70) obj2).setFocusable(true);
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new q1(i14, editTextBoldCursor));
                break;
            case 18:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", ((TLRPC.ChatFull) obj2).guard_bot_id);
                ((org.telegram.ui.ip) obj).presentFragment(new ProfileActivity(bundle2, null));
                break;
            case 19:
                f90 f90Var = (f90) obj2;
                if (f90Var.O0 == ((l90) obj)) {
                    f90Var.performLongClick();
                    f90Var.O0 = null;
                    f90Var.M0.d(true);
                    break;
                }
                break;
            case 20:
                ((h90) obj2).l((o90) obj, false);
                break;
            case 21:
                ja0 ja0Var = (ja0) obj2;
                if (!((boolean[]) obj)[0] && (y0Var = ja0Var.U) != null) {
                    y0Var.run();
                }
                ja0Var.U = null;
                break;
            case 22:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) obj;
                ((la0) obj2).setFocusable(true);
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.runOnUIThread(new q1(i13, editTextBoldCursor2));
                break;
            case 23:
                l.d dVar = (l.d) obj2;
                Runnable runnable = (Runnable) obj;
                dVar.getClass();
                runnable.run();
                ((HashMap) dVar.a).remove(runnable);
                break;
            case 24:
                ih0 ih0Var = (ih0) obj2;
                TLObject tLObject3 = (TLObject) obj;
                ih0Var.M = false;
                if (tLObject3 instanceof TLRPC.SearchPostsFlood) {
                    TLRPC.SearchPostsFlood searchPostsFlood = (TLRPC.SearchPostsFlood) tLObject3;
                    ih0Var.d = searchPostsFlood;
                    if (!searchPostsFlood.query_is_free) {
                        ih0Var.d();
                        ih0Var.c.Y2.N(true);
                        break;
                    } else {
                        ih0Var.a(false);
                        break;
                    }
                }
                break;
            case 25:
                nh0 nh0Var = (nh0) obj2;
                ArrayList arrayList8 = (ArrayList) obj;
                ArrayList arrayList9 = nh0Var.a;
                int i19 = nh0Var.x;
                int size3 = arrayList8.size();
                nh0Var.x = size3;
                if (i19 != size3 && nh0Var.S != null) {
                    nh0Var.g();
                }
                int size4 = arrayList9.size();
                int i20 = 0;
                while (i20 < size4) {
                    kh0 kh0Var = (kh0) arrayList9.get(i20);
                    if (kh0Var.o && !kh0Var.p) {
                        arrayList8.add(kh0Var);
                    } else if (nh0.j(kh0Var.a, arrayList8) == null) {
                        nh0 nh0Var2 = kh0Var.y;
                        float f7 = nh0Var2.N;
                        RectF rectF = kh0Var.c;
                        RectF rectF2 = kh0Var.f;
                        o90 o90Var = kh0Var.r;
                        if (o90Var != null) {
                            o90Var.a();
                            kh0Var.t = z11;
                            kh0Var.s = z11;
                        }
                        kh0Var.o = z12;
                        boolean z13 = rectF.left - 1.0f <= f7;
                        boolean z14 = rectF.right + 1.0f >= ((float) nh0Var2.getMeasuredWidth()) - f7;
                        if (z13 && z14) {
                            z14 = false;
                            z13 = false;
                        }
                        kh0Var.g.set(rectF);
                        rectF2.set(rectF);
                        if (z13) {
                            rectF2.right = rectF2.left;
                        } else if (z14) {
                            rectF2.left = rectF2.right;
                        } else {
                            int i21 = kh0Var.a;
                            if (i21 == 3 || i21 == 2) {
                                z10 = true;
                                if (nh0Var2.H == 1) {
                                    rectF2.left = rectF2.right;
                                    kh0Var.e.d(0.0f, z10);
                                    arrayList8.add(kh0Var);
                                }
                            } else {
                                z10 = true;
                            }
                            float centerX = rectF2.centerX();
                            rectF2.right = centerX;
                            rectF2.left = centerX;
                            kh0Var.e.d(0.0f, z10);
                            arrayList8.add(kh0Var);
                        }
                        z10 = true;
                        kh0Var.e.d(0.0f, z10);
                        arrayList8.add(kh0Var);
                    }
                    i20++;
                    z11 = false;
                    z12 = true;
                }
                arrayList9.clear();
                arrayList9.addAll(arrayList8);
                nh0Var.invalidate();
                break;
            case 26:
                kh0 kh0Var2 = (kh0) obj;
                mh0 mh0Var = ((nh0) obj2).F;
                int i22 = kh0Var2.a;
                RectF rectF3 = kh0Var2.d;
                ProfileActivity.Y(((org.telegram.ui.ky0) mh0Var).b, i22, rectF3.left, rectF3.top);
                break;
            case 27:
                Object obj3 = (ViewParent) obj;
                ((org.telegram.ui.Cells.u1) obj2).invalidate();
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
                pj0 pj0Var = (pj0) obj2;
                ArrayList arrayList10 = (ArrayList) obj;
                ArrayList arrayList11 = pj0Var.r;
                pj0Var.n.addAll(arrayList10);
                int size5 = arrayList10.size();
                int i23 = 0;
                while (i23 < size5) {
                    Object obj4 = arrayList10.get(i23);
                    i23++;
                    oj0 oj0Var = (oj0) obj4;
                    int i24 = 0;
                    while (true) {
                        if (i24 >= arrayList11.size()) {
                            arrayList11.add(oj0Var);
                        } else if (MessageObject.getObjectPeerId(((oj0) arrayList11.get(i24)).a) != MessageObject.getObjectPeerId(oj0Var.a)) {
                            i24++;
                        } else if (oj0Var.c > 0) {
                            ((oj0) arrayList11.get(i24)).c = oj0Var.c;
                        }
                    }
                }
                q0.a aVar = pj0Var.w;
                if (aVar != null) {
                    aVar.accept(arrayList10);
                }
                pj0Var.a();
                break;
        }
    }
}
