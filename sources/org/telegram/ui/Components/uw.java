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
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ uw(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a70 a70Var;
        org.telegram.ui.ib ibVar;
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
                TLObject tLObject = (TLObject) obj;
                kz kzVar = ((ex) obj2).a;
                if (tLObject instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
                    MediaDataController.getInstance(kzVar.c1).putStickerSet(tL_messages_stickerSet);
                    MediaDataController.getInstance(kzVar.c1).replaceStickerSet(tL_messages_stickerSet);
                    break;
                }
                break;
            case 1:
                cy cyVar = (cy) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                cyVar.s.f = true;
                kz kzVar2 = cyVar.E;
                if (!kzVar2.p1.contains(Long.valueOf(tL_messages_stickerSet2.set.id))) {
                    kzVar2.p1.add(Long.valueOf(tL_messages_stickerSet2.set.id));
                }
                cyVar.a(true);
                break;
            case 2:
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
                final int i14 = 0;
                final int i15 = 1;
                Utilities.doCallbacks(new Utilities.Callback() { // from class: org.telegram.ui.Components.iy
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj3) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList4;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList5;
                        Runnable runnable = (Runnable) obj3;
                        switch (i14) {
                            case 0:
                                jy jyVar2 = jyVar;
                                MediaDataController.getInstance(jyVar2.a.F.c1).searchStickerSets(true, str, new ai.d5(jyVar2, arrayList3, runnable, 5));
                                break;
                            default:
                                kz kzVar4 = jyVar.a.F;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(kzVar4.c1).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str + "").toLowerCase());
                                    int i16 = kzVar4.c1;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i16).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList6 = arrayList3;
                                    if (stickerSets != null) {
                                        for (int i17 = 0; i17 < stickerSets.size(); i17++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i17);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList5 = tL_messages_stickerSet3.documents) != null && !arrayList5.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.wh.u(" ", translitSafe, translitSafe2)) {
                                                    arrayList6.add(new dy(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
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
                                                if (translitSafe3.startsWith(translitSafe) || org.telegram.messenger.wh.u(" ", translitSafe, translitSafe3)) {
                                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                                        arrayList4 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                                        TLRPC.TL_messages_stickerSet stickerSet3 = MediaDataController.getInstance(i16).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
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
                        switch (i15) {
                            case 0:
                                jy jyVar2 = jyVar;
                                MediaDataController.getInstance(jyVar2.a.F.c1).searchStickerSets(true, str, new ai.d5(jyVar2, arrayList2, runnable, 5));
                                break;
                            default:
                                kz kzVar4 = jyVar.a.F;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(kzVar4.c1).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str + "").toLowerCase());
                                    int i16 = kzVar4.c1;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i16).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList6 = arrayList2;
                                    if (stickerSets != null) {
                                        for (int i17 = 0; i17 < stickerSets.size(); i17++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i17);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList5 = tL_messages_stickerSet3.documents) != null && !arrayList5.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.wh.u(" ", translitSafe, translitSafe2)) {
                                                    arrayList6.add(new dy(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
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
                                                if (translitSafe3.startsWith(translitSafe) || org.telegram.messenger.wh.u(" ", translitSafe, translitSafe3)) {
                                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                                        arrayList4 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                                        TLRPC.TL_messages_stickerSet stickerSet3 = MediaDataController.getInstance(i16).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
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
            case 3:
                ArrayList arrayList4 = (ArrayList) obj;
                ky kyVar = ((jy) obj2).a;
                kyVar.F.V.e(false);
                ArrayList arrayList5 = kyVar.r;
                kyVar.E = arrayList5.size() >= arrayList4.size();
                arrayList5.clear();
                arrayList5.addAll(arrayList4);
                kyVar.l();
                break;
            case 4:
                ((py) obj2).F((String) obj, "", true, false, false);
                break;
            case 5:
                py pyVar = (py) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                kz kzVar4 = pyVar.L;
                MessagesController.getInstance(kzVar4.c1).putUsers(tL_contacts_resolvedPeer.users, false);
                int i16 = kzVar4.c1;
                MessagesController.getInstance(i16).putChats(tL_contacts_resolvedPeer.chats, false);
                MessagesStorage.getInstance(i16).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str2 = pyVar.w;
                pyVar.w = null;
                pyVar.F(str2, "", false, false, false);
                break;
            case 6:
                vz vzVar = (vz) obj2;
                ci.n8 n8Var = (ci.n8) obj;
                vzVar.c();
                vzVar.h(n8Var);
                zz zzVar = vzVar.J;
                zzVar.h1 = n8Var;
                zzVar.j();
                break;
            case 7:
                ((vz) obj2).J.f1 = (yz) obj;
                break;
            case 8:
                ((c10) obj2).z0 = -1;
                ((Runnable) ((Pair) obj).first).run();
                break;
            case 9:
                ((org.telegram.ui.of) obj2).run((org.telegram.ui.ActionBar.n2) obj);
                break;
            case 10:
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
            case 11:
                u50 u50Var = (u50) obj2;
                p50 p50Var = (p50) obj;
                b60 b60Var = u50Var.H0;
                VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
                b60Var.Q = videoEditedInfo;
                videoEditedInfo.startTime = -1L;
                videoEditedInfo.endTime = -1L;
                videoEditedInfo.estimatedSize = Math.max(1L, b60Var.O);
                VideoEditedInfo videoEditedInfo2 = b60Var.Q;
                videoEditedInfo2.roundVideo = true;
                videoEditedInfo2.file = b60Var.K;
                videoEditedInfo2.encryptedFile = b60Var.L;
                videoEditedInfo2.key = b60Var.M;
                videoEditedInfo2.iv = b60Var.N;
                videoEditedInfo2.framerate = 25;
                videoEditedInfo2.originalWidth = 360;
                videoEditedInfo2.resultWidth = 360;
                videoEditedInfo2.originalHeight = 360;
                videoEditedInfo2.resultHeight = 360;
                videoEditedInfo2.originalPath = u50Var.a.getAbsolutePath();
                VideoEditedInfo videoEditedInfo3 = b60Var.Q;
                videoEditedInfo3.notReadyYet = true;
                videoEditedInfo3.thumb = b60Var.c1;
                videoEditedInfo3.estimatedDuration = b60Var.i0;
                b60Var.c1 = null;
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, u50Var.a.getAbsolutePath(), 0, true, 0, 0, 0L);
                if (p50Var != null) {
                    photoEntry.ttl = p50Var.c;
                    photoEntry.effectId = p50Var.d;
                }
                b60Var.f.q(photoEntry, b60Var.Q, p50Var == null || p50Var.a, p50Var != null ? p50Var.b : 0, 0, false, p50Var != null ? p50Var.e : 0L);
                break;
            case 12:
                Bitmap bitmap = (Bitmap) obj;
                u50 u50Var2 = (u50) ((org.telegram.ui.Cells.t6) obj2).b;
                if ((bitmap != null && bitmap.getPixel(0, 0) != 0) || u50Var2.A0.size() <= 1) {
                    u50Var2.A0.add(bitmap);
                    break;
                } else {
                    ArrayList arrayList6 = u50Var2.A0;
                    arrayList6.add((Bitmap) hg.k0.g(1, arrayList6));
                    break;
                }
                break;
            case 13:
                a70 a70Var2 = (a70) obj2;
                TLObject tLObject2 = (TLObject) obj;
                a70Var2.getClass();
                if (tLObject2 instanceof Vector) {
                    Vector vector = (Vector) tLObject2;
                    if (!vector.objects.isEmpty()) {
                        a70Var2.c.put(Long.valueOf(a70Var2.b.admin_id), (TLRPC.User) vector.objects.get(0));
                        a70Var2.T.l();
                        break;
                    }
                }
                break;
            case 14:
                u60 u60Var = (u60) obj2;
                if (((TLRPC.TL_error) obj) == null && (ibVar = (a70Var = u60Var.a.c).j0) != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = a70Var.b;
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
                    i10 = ((org.telegram.ui.ActionBar.n2) vbVar).currentAccount;
                    if (new MessageObject(i10, tL_channelAdminLogEvent, (ArrayList<MessageObject>) vbVar.n0, (HashMap<String, ArrayList<MessageObject>>) vbVar.m0, vbVar.f, vbVar.T, true).contentType >= 0) {
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
            case 15:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                ((k70) obj2).setFocusable(true);
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new q1(i13, editTextBoldCursor));
                break;
            case 16:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", ((TLRPC.ChatFull) obj2).guard_bot_id);
                ((org.telegram.ui.ip) obj).presentFragment(new ProfileActivity(bundle2, null));
                break;
            case 17:
                g90 g90Var = (g90) obj2;
                if (g90Var.O0 == ((m90) obj)) {
                    g90Var.performLongClick();
                    g90Var.O0 = null;
                    g90Var.M0.d(true);
                    break;
                }
                break;
            case 18:
                ((i90) obj2).l((p90) obj, false);
                break;
            case 19:
                ka0 ka0Var = (ka0) obj2;
                if (!((boolean[]) obj)[0] && (y0Var = ka0Var.U) != null) {
                    y0Var.run();
                }
                ka0Var.U = null;
                break;
            case 20:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) obj;
                ((ma0) obj2).setFocusable(true);
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.runOnUIThread(new q1(i12, editTextBoldCursor2));
                break;
            case 21:
                l.d dVar = (l.d) obj2;
                Runnable runnable = (Runnable) obj;
                dVar.getClass();
                runnable.run();
                ((HashMap) dVar.a).remove(runnable);
                break;
            case 22:
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
            case 23:
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
                        p90 p90Var = lh0Var.r;
                        if (p90Var != null) {
                            p90Var.a();
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
            case 24:
                lh0 lh0Var2 = (lh0) obj;
                nh0 nh0Var = ((oh0) obj2).F;
                int i21 = lh0Var2.a;
                RectF rectF3 = lh0Var2.d;
                ProfileActivity.Y(((org.telegram.ui.ky0) nh0Var).b, i21, rectF3.left, rectF3.top);
                break;
            case 25:
                Object obj3 = (ViewParent) obj;
                ((org.telegram.ui.Cells.u1) obj2).invalidate();
                if (obj3 instanceof View) {
                    ((View) obj3).invalidate();
                    break;
                }
                break;
            case 26:
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
            case 27:
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
            case 28:
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
            default:
                ((eo0) obj2).T();
                xc.a0((org.telegram.ui.uy) obj).c(LocaleController.getString(R.string.AdHidden)).j();
                break;
        }
    }
}
