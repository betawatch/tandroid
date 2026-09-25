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

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vw(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c70 c70Var;
        org.telegram.ui.hb hbVar;
        int i10;
        ci.y0 y0Var;
        boolean z10;
        int indexOf;
        int L;
        int i11 = this.a;
        int i12 = 5;
        int i13 = 3;
        boolean z11 = false;
        boolean z12 = true;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i11) {
            case 0:
                MessagesController.getInstance(((fx) obj2).a.c1).updateEmojiStatus((TLRPC.EmojiStatus) obj);
                break;
            case 1:
                TLObject tLObject = (TLObject) obj;
                lz lzVar = ((fx) obj2).a;
                if (tLObject instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
                    MediaDataController.getInstance(lzVar.c1).putStickerSet(tL_messages_stickerSet);
                    MediaDataController.getInstance(lzVar.c1).replaceStickerSet(tL_messages_stickerSet);
                    break;
                }
                break;
            case 2:
                dy dyVar = (dy) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                dyVar.s.f = true;
                lz lzVar2 = dyVar.E;
                if (!lzVar2.p1.contains(Long.valueOf(tL_messages_stickerSet2.set.id))) {
                    lzVar2.p1.add(Long.valueOf(tL_messages_stickerSet2.set.id));
                }
                dyVar.a(true);
                break;
            case 3:
                final ky kyVar = (ky) obj2;
                final String str = (String) obj;
                String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                lz lzVar3 = kyVar.a.F;
                if (!Arrays.equals(lzVar3.W0, currentKeyboardLanguage)) {
                    MediaDataController.getInstance(lzVar3.c1).fetchNewEmojiKeywords(currentKeyboardLanguage);
                }
                lzVar3.W0 = currentKeyboardLanguage;
                ArrayList arrayList = new ArrayList();
                final ArrayList arrayList2 = new ArrayList();
                final ArrayList arrayList3 = new ArrayList();
                final int i14 = 0;
                final int i15 = 1;
                Utilities.doCallbacks(new Utilities.Callback() { // from class: org.telegram.ui.Components.jy
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj3) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList4;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList5;
                        Runnable runnable = (Runnable) obj3;
                        switch (i14) {
                            case 0:
                                ky kyVar2 = kyVar;
                                MediaDataController.getInstance(kyVar2.a.F.c1).searchStickerSets(true, str, new ai.c5(kyVar2, arrayList3, runnable, 7));
                                break;
                            default:
                                lz lzVar4 = kyVar.a.F;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(lzVar4.c1).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str + "").toLowerCase());
                                    int i16 = lzVar4.c1;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i16).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList6 = arrayList3;
                                    if (stickerSets != null) {
                                        for (int i17 = 0; i17 < stickerSets.size(); i17++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i17);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList5 = tL_messages_stickerSet3.documents) != null && !arrayList5.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.f0.w(" ", translitSafe, translitSafe2)) {
                                                    arrayList6.add(new ey(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
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
                                                if (translitSafe3.startsWith(translitSafe) || org.telegram.messenger.f0.w(" ", translitSafe, translitSafe3)) {
                                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                                        arrayList4 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                                        TLRPC.TL_messages_stickerSet stickerSet3 = MediaDataController.getInstance(i16).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                                                        arrayList4 = stickerSet3 != null ? stickerSet3.documents : null;
                                                    } else {
                                                        arrayList4 = stickerSetCovered.covers;
                                                    }
                                                    if (arrayList4 != null && !arrayList4.isEmpty()) {
                                                        arrayList6.add(new ey(stickerSetCovered, arrayList4));
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
                }, new org.telegram.ui.oc(23, kyVar, str), new Utilities.Callback() { // from class: org.telegram.ui.Components.jy
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj3) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList4;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList5;
                        Runnable runnable = (Runnable) obj3;
                        switch (i15) {
                            case 0:
                                ky kyVar2 = kyVar;
                                MediaDataController.getInstance(kyVar2.a.F.c1).searchStickerSets(true, str, new ai.c5(kyVar2, arrayList2, runnable, 7));
                                break;
                            default:
                                lz lzVar4 = kyVar.a.F;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(lzVar4.c1).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str + "").toLowerCase());
                                    int i16 = lzVar4.c1;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i16).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList6 = arrayList2;
                                    if (stickerSets != null) {
                                        for (int i17 = 0; i17 < stickerSets.size(); i17++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i17);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList5 = tL_messages_stickerSet3.documents) != null && !arrayList5.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.f0.w(" ", translitSafe, translitSafe2)) {
                                                    arrayList6.add(new ey(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
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
                                                if (translitSafe3.startsWith(translitSafe) || org.telegram.messenger.f0.w(" ", translitSafe, translitSafe3)) {
                                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                                        arrayList4 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                                        TLRPC.TL_messages_stickerSet stickerSet3 = MediaDataController.getInstance(i16).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                                                        arrayList4 = stickerSet3 != null ? stickerSet3.documents : null;
                                                    } else {
                                                        arrayList4 = stickerSetCovered.covers;
                                                    }
                                                    if (arrayList4 != null && !arrayList4.isEmpty()) {
                                                        arrayList6.add(new ey(stickerSetCovered, arrayList4));
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
                }, new org.telegram.ui.oc(24, kyVar, arrayList), new org.telegram.ui.sa(kyVar, str, arrayList, arrayList2, arrayList3));
                break;
            case 4:
                ArrayList arrayList4 = (ArrayList) obj;
                ly lyVar = ((ky) obj2).a;
                lyVar.F.V.e(false);
                ArrayList arrayList5 = lyVar.r;
                lyVar.E = arrayList5.size() >= arrayList4.size();
                arrayList5.clear();
                arrayList5.addAll(arrayList4);
                lyVar.l();
                break;
            case 5:
                ((qy) obj2).F((String) obj, "", true, false, false);
                break;
            case 6:
                qy qyVar = (qy) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                lz lzVar4 = qyVar.L;
                MessagesController.getInstance(lzVar4.c1).putUsers(tL_contacts_resolvedPeer.users, false);
                int i16 = lzVar4.c1;
                MessagesController.getInstance(i16).putChats(tL_contacts_resolvedPeer.chats, false);
                MessagesStorage.getInstance(i16).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str2 = qyVar.w;
                qyVar.w = null;
                qyVar.F(str2, "", false, false, false);
                break;
            case 7:
                wz wzVar = (wz) obj2;
                ci.k8 k8Var = (ci.k8) obj;
                wzVar.c();
                wzVar.h(k8Var);
                a00 a00Var = wzVar.J;
                a00Var.h1 = k8Var;
                a00Var.j();
                break;
            case 8:
                ((wz) obj2).J.f1 = (zz) obj;
                break;
            case 9:
                ((d10) obj2).z0 = -1;
                ((Runnable) ((Pair) obj).first).run();
                break;
            case 10:
                ((org.telegram.ui.oc) obj2).run((org.telegram.ui.ActionBar.m2) obj);
                break;
            case 11:
                v40 v40Var = (v40) obj2;
                Uri uri = (Uri) obj;
                v40Var.getClass();
                try {
                    LaunchActivity launchActivity = (LaunchActivity) v40Var.a.getParentActivity();
                    if (launchActivity != null) {
                        Bundle bundle = new Bundle();
                        if (uri != null) {
                            bundle.putParcelable("photoUri", uri);
                        }
                        org.telegram.ui.fq0 fq0Var = new org.telegram.ui.fq0(bundle);
                        fq0Var.e = false;
                        fq0Var.f = false;
                        fq0Var.c = v40Var;
                        launchActivity.p0(fq0Var);
                        break;
                    } else {
                        break;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                    v40Var.s(false, ImageLoader.loadBitmap(null, uri, 800.0f, 800.0f, true), null);
                    return;
                }
            case 12:
                v50 v50Var = (v50) obj2;
                q50 q50Var = (q50) obj;
                c60 c60Var = v50Var.H0;
                VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
                c60Var.S = videoEditedInfo;
                videoEditedInfo.startTime = -1L;
                videoEditedInfo.endTime = -1L;
                videoEditedInfo.estimatedSize = Math.max(1L, c60Var.Q);
                VideoEditedInfo videoEditedInfo2 = c60Var.S;
                videoEditedInfo2.roundVideo = true;
                videoEditedInfo2.file = c60Var.M;
                videoEditedInfo2.encryptedFile = c60Var.N;
                videoEditedInfo2.key = c60Var.O;
                videoEditedInfo2.iv = c60Var.P;
                videoEditedInfo2.framerate = 25;
                videoEditedInfo2.originalWidth = 360;
                videoEditedInfo2.resultWidth = 360;
                videoEditedInfo2.originalHeight = 360;
                videoEditedInfo2.resultHeight = 360;
                videoEditedInfo2.originalPath = v50Var.a.getAbsolutePath();
                VideoEditedInfo videoEditedInfo3 = c60Var.S;
                videoEditedInfo3.notReadyYet = true;
                videoEditedInfo3.thumb = c60Var.e1;
                videoEditedInfo3.estimatedDuration = c60Var.k0;
                c60Var.e1 = null;
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, v50Var.a.getAbsolutePath(), 0, true, 0, 0, 0L);
                if (q50Var != null) {
                    photoEntry.ttl = q50Var.c;
                    photoEntry.effectId = q50Var.d;
                }
                c60Var.n.q(photoEntry, c60Var.S, q50Var == null || q50Var.a, q50Var != null ? q50Var.b : 0, 0, false, q50Var != null ? q50Var.e : 0L);
                break;
            case 13:
                Bitmap bitmap = (Bitmap) obj;
                v50 v50Var2 = (v50) ((org.telegram.ui.Cells.t6) obj2).b;
                if ((bitmap != null && bitmap.getPixel(0, 0) != 0) || v50Var2.A0.size() <= 1) {
                    v50Var2.A0.add(bitmap);
                    break;
                } else {
                    ArrayList arrayList6 = v50Var2.A0;
                    arrayList6.add((Bitmap) hg.c.g(1, arrayList6));
                    break;
                }
                break;
            case 14:
                c70 c70Var2 = (c70) obj2;
                TLObject tLObject2 = (TLObject) obj;
                c70Var2.getClass();
                if (tLObject2 instanceof Vector) {
                    Vector vector = (Vector) tLObject2;
                    if (!vector.objects.isEmpty()) {
                        c70Var2.c.put(Long.valueOf(c70Var2.b.admin_id), (TLRPC.User) vector.objects.get(0));
                        c70Var2.T.l();
                        break;
                    }
                }
                break;
            case 15:
                w60 w60Var = (w60) obj2;
                if (((TLRPC.TL_error) obj) == null && (hbVar = (c70Var = w60Var.a.c).j0) != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = c70Var.b;
                    org.telegram.ui.ub ubVar = hbVar.a;
                    ArrayList arrayList7 = ubVar.o0;
                    int size = arrayList7.size();
                    int i17 = ubVar.E.h;
                    TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                    TLRPC.TL_channelAdminLogEventActionExportedInviteDelete tL_channelAdminLogEventActionExportedInviteDelete = new TLRPC.TL_channelAdminLogEventActionExportedInviteDelete();
                    tL_channelAdminLogEventActionExportedInviteDelete.invite = tL_chatInviteExported;
                    tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteDelete;
                    tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                    tL_channelAdminLogEvent.user_id = ubVar.getAccountInstance().getUserConfig().clientUserId;
                    i10 = ((org.telegram.ui.ActionBar.m2) ubVar).currentAccount;
                    if (new MessageObject(i10, tL_channelAdminLogEvent, (ArrayList<MessageObject>) ubVar.n0, (HashMap<String, ArrayList<MessageObject>>) ubVar.m0, ubVar.f, ubVar.T, true).contentType >= 0) {
                        ubVar.R0();
                        int size2 = arrayList7.size() - size;
                        if (size2 > 0) {
                            ubVar.C0.N = true;
                            org.telegram.ui.qb qbVar = ubVar.E;
                            qbVar.s(qbVar.h, size2);
                            org.telegram.ui.ub.K0(ubVar);
                        }
                        ubVar.y0.remove(tL_chatInviteExported.link);
                        break;
                    }
                }
                break;
            case 16:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                ((m70) obj2).setFocusable(true);
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new q1(i13, editTextBoldCursor));
                break;
            case 17:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", ((TLRPC.ChatFull) obj2).guard_bot_id);
                ((org.telegram.ui.fp) obj).presentFragment(new ProfileActivity(bundle2, null));
                break;
            case 18:
                i90 i90Var = (i90) obj2;
                if (i90Var.O0 == ((o90) obj)) {
                    i90Var.performLongClick();
                    i90Var.O0 = null;
                    i90Var.M0.d(true);
                    break;
                }
                break;
            case 19:
                ((k90) obj2).l((r90) obj, false);
                break;
            case 20:
                na0 na0Var = (na0) obj2;
                if (!((boolean[]) obj)[0] && (y0Var = na0Var.U) != null) {
                    y0Var.run();
                }
                na0Var.U = null;
                break;
            case 21:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) obj;
                ((pa0) obj2).setFocusable(true);
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.runOnUIThread(new q1(i12, editTextBoldCursor2));
                break;
            case 22:
                l.d dVar = (l.d) obj2;
                Runnable runnable = (Runnable) obj;
                dVar.getClass();
                runnable.run();
                ((HashMap) dVar.a).remove(runnable);
                break;
            case 23:
                jh0 jh0Var = (jh0) obj2;
                TLObject tLObject3 = (TLObject) obj;
                jh0Var.M = false;
                if (tLObject3 instanceof TLRPC.SearchPostsFlood) {
                    TLRPC.SearchPostsFlood searchPostsFlood = (TLRPC.SearchPostsFlood) tLObject3;
                    jh0Var.d = searchPostsFlood;
                    if (!searchPostsFlood.query_is_free) {
                        jh0Var.d();
                        jh0Var.c.Y2.N(true);
                        break;
                    } else {
                        jh0Var.a(false);
                        break;
                    }
                }
                break;
            case 24:
                oh0 oh0Var = (oh0) obj2;
                ArrayList arrayList8 = (ArrayList) obj;
                ArrayList arrayList9 = oh0Var.a;
                int i18 = oh0Var.x;
                int size3 = arrayList8.size();
                oh0Var.x = size3;
                if (i18 != size3 && oh0Var.S != null) {
                    oh0Var.g();
                }
                int size4 = arrayList9.size();
                int i19 = 0;
                while (i19 < size4) {
                    lh0 lh0Var = (lh0) arrayList9.get(i19);
                    if (lh0Var.o && !lh0Var.p) {
                        arrayList8.add(lh0Var);
                    } else if (oh0.j(lh0Var.a, arrayList8) == null) {
                        oh0 oh0Var2 = lh0Var.y;
                        float f7 = oh0Var2.N;
                        RectF rectF = lh0Var.c;
                        RectF rectF2 = lh0Var.f;
                        r90 r90Var = lh0Var.r;
                        if (r90Var != null) {
                            r90Var.a();
                            lh0Var.t = z11;
                            lh0Var.s = z11;
                        }
                        lh0Var.o = z12;
                        boolean z13 = rectF.left - 1.0f <= f7;
                        boolean z14 = rectF.right + 1.0f >= ((float) oh0Var2.getMeasuredWidth()) - f7;
                        if (z13 && z14) {
                            z14 = false;
                            z13 = false;
                        }
                        lh0Var.g.set(rectF);
                        rectF2.set(rectF);
                        if (z13) {
                            rectF2.right = rectF2.left;
                        } else if (z14) {
                            rectF2.left = rectF2.right;
                        } else {
                            int i20 = lh0Var.a;
                            if (i20 == 3 || i20 == 2) {
                                z10 = true;
                                if (oh0Var2.H == 1) {
                                    rectF2.left = rectF2.right;
                                    lh0Var.e.d(0.0f, z10);
                                    arrayList8.add(lh0Var);
                                }
                            } else {
                                z10 = true;
                            }
                            float centerX = rectF2.centerX();
                            rectF2.right = centerX;
                            rectF2.left = centerX;
                            lh0Var.e.d(0.0f, z10);
                            arrayList8.add(lh0Var);
                        }
                        z10 = true;
                        lh0Var.e.d(0.0f, z10);
                        arrayList8.add(lh0Var);
                    }
                    i19++;
                    z11 = false;
                    z12 = true;
                }
                arrayList9.clear();
                arrayList9.addAll(arrayList8);
                oh0Var.invalidate();
                break;
            case 25:
                lh0 lh0Var2 = (lh0) obj;
                nh0 nh0Var = ((oh0) obj2).F;
                int i21 = lh0Var2.a;
                RectF rectF3 = lh0Var2.d;
                ProfileActivity.Y(((org.telegram.ui.by0) nh0Var).b, i21, rectF3.left, rectF3.top);
                break;
            case 26:
                Object obj3 = (ViewParent) obj;
                ((org.telegram.ui.Cells.u1) obj2).invalidate();
                if (obj3 instanceof View) {
                    ((View) obj3).invalidate();
                    break;
                }
                break;
            case 27:
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
            case 28:
                qj0 qj0Var = (qj0) obj2;
                ArrayList arrayList10 = (ArrayList) obj;
                ArrayList arrayList11 = qj0Var.r;
                qj0Var.n.addAll(arrayList10);
                int size5 = arrayList10.size();
                int i22 = 0;
                while (i22 < size5) {
                    Object obj4 = arrayList10.get(i22);
                    i22++;
                    pj0 pj0Var = (pj0) obj4;
                    int i23 = 0;
                    while (true) {
                        if (i23 >= arrayList11.size()) {
                            arrayList11.add(pj0Var);
                        } else if (MessageObject.getObjectPeerId(((pj0) arrayList11.get(i23)).a) != MessageObject.getObjectPeerId(pj0Var.a)) {
                            i23++;
                        } else if (pj0Var.c > 0) {
                            ((pj0) arrayList11.get(i23)).c = pj0Var.c;
                        }
                    }
                }
                q0.a aVar = qj0Var.w;
                if (aVar != null) {
                    aVar.accept(arrayList10);
                }
                qj0Var.a();
                break;
            default:
                eo0 eo0Var = (eo0) obj2;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) obj;
                ArrayList arrayList12 = eo0Var.K;
                if (!arrayList12.isEmpty() && (indexOf = arrayList12.indexOf(tL_sponsoredPeer)) >= 0 && (L = eo0Var.L()) < eo0Var.h()) {
                    arrayList12.remove(indexOf);
                    eo0Var.u(L + 1 + indexOf);
                    int size6 = eo0Var.j0.e.size();
                    int size7 = arrayList12.size();
                    if (eo0Var.G0) {
                        size6 = Math.min(3, size6);
                    }
                    if (size7 + size6 <= 0) {
                        eo0Var.u(L);
                        break;
                    }
                }
                break;
        }
    }
}
