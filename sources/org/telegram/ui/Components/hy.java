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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class hy implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hy(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a70 a70Var;
        org.telegram.ui.jb jbVar;
        int i10;
        bi.c1 c1Var;
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
                iy iyVar = (iy) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                iyVar.s.f = true;
                rz rzVar = iyVar.E;
                if (!rzVar.p1.contains(Long.valueOf(tL_messages_stickerSet.set.id))) {
                    rzVar.p1.add(Long.valueOf(tL_messages_stickerSet.set.id));
                }
                iyVar.a(true);
                break;
            case 1:
                final qy qyVar = (qy) obj2;
                final String str = (String) obj;
                String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                rz rzVar2 = qyVar.a.F;
                if (!Arrays.equals(rzVar2.W0, currentKeyboardLanguage)) {
                    MediaDataController.getInstance(rzVar2.c1).fetchNewEmojiKeywords(currentKeyboardLanguage);
                }
                rzVar2.W0 = currentKeyboardLanguage;
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
                                qy qyVar2 = qyVar;
                                MediaDataController.getInstance(qyVar2.a.F.c1).searchStickerSets(true, str, new h7(qyVar2, arrayList3, runnable, 2));
                                break;
                            default:
                                rz rzVar3 = qyVar.a.F;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(rzVar3.c1).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str + "").toLowerCase());
                                    int i16 = rzVar3.c1;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i16).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList6 = arrayList3;
                                    if (stickerSets != null) {
                                        for (int i17 = 0; i17 < stickerSets.size(); i17++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickerSets.get(i17);
                                            if (tL_messages_stickerSet2 != null && (stickerSet2 = tL_messages_stickerSet2.set) != null && stickerSet2.title != null && (arrayList5 = tL_messages_stickerSet2.documents) != null && !arrayList5.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet2.set.id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet2.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.a2.w(" ", translitSafe, translitSafe2)) {
                                                    arrayList6.add(new jy(tL_messages_stickerSet2, tL_messages_stickerSet2.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet2.set.id));
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
                                                if (translitSafe3.startsWith(translitSafe) || org.telegram.messenger.a2.w(" ", translitSafe, translitSafe3)) {
                                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                                        arrayList4 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                                        TLRPC.TL_messages_stickerSet stickerSet3 = MediaDataController.getInstance(i16).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                                                        arrayList4 = stickerSet3 != null ? stickerSet3.documents : null;
                                                    } else {
                                                        arrayList4 = stickerSetCovered.covers;
                                                    }
                                                    if (arrayList4 != null && !arrayList4.isEmpty()) {
                                                        arrayList6.add(new jy(stickerSetCovered, arrayList4));
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
                }, new org.telegram.ui.pf(16, qyVar, str), new Utilities.Callback() { // from class: org.telegram.ui.Components.py
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj3) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList4;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList5;
                        Runnable runnable = (Runnable) obj3;
                        switch (i15) {
                            case 0:
                                qy qyVar2 = qyVar;
                                MediaDataController.getInstance(qyVar2.a.F.c1).searchStickerSets(true, str, new h7(qyVar2, arrayList2, runnable, 2));
                                break;
                            default:
                                rz rzVar3 = qyVar.a.F;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(rzVar3.c1).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str + "").toLowerCase());
                                    int i16 = rzVar3.c1;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i16).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList6 = arrayList2;
                                    if (stickerSets != null) {
                                        for (int i17 = 0; i17 < stickerSets.size(); i17++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickerSets.get(i17);
                                            if (tL_messages_stickerSet2 != null && (stickerSet2 = tL_messages_stickerSet2.set) != null && stickerSet2.title != null && (arrayList5 = tL_messages_stickerSet2.documents) != null && !arrayList5.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet2.set.id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet2.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.a2.w(" ", translitSafe, translitSafe2)) {
                                                    arrayList6.add(new jy(tL_messages_stickerSet2, tL_messages_stickerSet2.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet2.set.id));
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
                                                if (translitSafe3.startsWith(translitSafe) || org.telegram.messenger.a2.w(" ", translitSafe, translitSafe3)) {
                                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                                        arrayList4 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                                        TLRPC.TL_messages_stickerSet stickerSet3 = MediaDataController.getInstance(i16).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                                                        arrayList4 = stickerSet3 != null ? stickerSet3.documents : null;
                                                    } else {
                                                        arrayList4 = stickerSetCovered.covers;
                                                    }
                                                    if (arrayList4 != null && !arrayList4.isEmpty()) {
                                                        arrayList6.add(new jy(stickerSetCovered, arrayList4));
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
                }, new org.telegram.ui.pf(17, qyVar, arrayList), new org.telegram.ui.ua(qyVar, str, arrayList, arrayList2, arrayList3));
                break;
            case 2:
                ArrayList arrayList4 = (ArrayList) obj;
                ry ryVar = ((qy) obj2).a;
                ryVar.F.V.e(false);
                ArrayList arrayList5 = ryVar.r;
                ryVar.E = arrayList5.size() >= arrayList4.size();
                arrayList5.clear();
                arrayList5.addAll(arrayList4);
                ryVar.l();
                break;
            case 3:
                ((wy) obj2).F((String) obj, "", true, false, false);
                break;
            case 4:
                wy wyVar = (wy) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                rz rzVar3 = wyVar.L;
                MessagesController.getInstance(rzVar3.c1).putUsers(tL_contacts_resolvedPeer.users, false);
                int i16 = rzVar3.c1;
                MessagesController.getInstance(i16).putChats(tL_contacts_resolvedPeer.chats, false);
                MessagesStorage.getInstance(i16).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str2 = wyVar.w;
                wyVar.w = null;
                wyVar.F(str2, "", false, false, false);
                break;
            case 5:
                c00 c00Var = (c00) obj2;
                bi.q9 q9Var = (bi.q9) obj;
                c00Var.c();
                c00Var.h(q9Var);
                g00 g00Var = c00Var.J;
                g00Var.h1 = q9Var;
                g00Var.j();
                break;
            case 6:
                ((c00) obj2).J.f1 = (f00) obj;
                break;
            case 7:
                ((k10) obj2).z0 = -1;
                ((Runnable) ((Pair) obj).first).run();
                break;
            case 8:
                ((org.telegram.ui.pf) obj2).run((org.telegram.ui.ActionBar.p2) obj);
                break;
            case 9:
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
                        org.telegram.ui.nq0 nq0Var = new org.telegram.ui.nq0(bundle);
                        nq0Var.e = false;
                        nq0Var.f = false;
                        nq0Var.c = e50Var;
                        launchActivity.p0(nq0Var);
                        break;
                    } else {
                        break;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                    e50Var.s(false, ImageLoader.loadBitmap(null, uri, 800.0f, 800.0f, true), null);
                    return;
                }
            case 10:
                e60 e60Var = (e60) obj2;
                a60 a60Var = (a60) obj;
                f60 f60Var = e60Var.H0;
                VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
                f60Var.N = videoEditedInfo;
                videoEditedInfo.startTime = -1L;
                videoEditedInfo.endTime = -1L;
                videoEditedInfo.estimatedSize = Math.max(1L, f60Var.L);
                VideoEditedInfo videoEditedInfo2 = f60Var.N;
                videoEditedInfo2.roundVideo = true;
                videoEditedInfo2.file = f60Var.H;
                videoEditedInfo2.encryptedFile = f60Var.I;
                videoEditedInfo2.key = f60Var.J;
                videoEditedInfo2.iv = f60Var.K;
                videoEditedInfo2.framerate = 25;
                videoEditedInfo2.originalWidth = 360;
                videoEditedInfo2.resultWidth = 360;
                videoEditedInfo2.originalHeight = 360;
                videoEditedInfo2.resultHeight = 360;
                videoEditedInfo2.originalPath = e60Var.a.getAbsolutePath();
                VideoEditedInfo videoEditedInfo3 = f60Var.N;
                videoEditedInfo3.notReadyYet = true;
                videoEditedInfo3.thumb = f60Var.Z0;
                videoEditedInfo3.estimatedDuration = f60Var.f0;
                f60Var.Z0 = null;
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, e60Var.a.getAbsolutePath(), 0, true, 0, 0, 0L);
                if (a60Var != null) {
                    photoEntry.ttl = a60Var.c;
                    photoEntry.effectId = a60Var.d;
                }
                f60Var.c.q(photoEntry, f60Var.N, a60Var == null || a60Var.a, a60Var != null ? a60Var.b : 0, 0, false, a60Var != null ? a60Var.e : 0L);
                break;
            case 11:
                Bitmap bitmap = (Bitmap) obj;
                e60 e60Var2 = (e60) ((org.telegram.ui.Cells.l9) obj2).b;
                if ((bitmap != null && bitmap.getPixel(0, 0) != 0) || e60Var2.A0.size() <= 1) {
                    e60Var2.A0.add(bitmap);
                    break;
                } else {
                    ArrayList arrayList6 = e60Var2.A0;
                    arrayList6.add((Bitmap) hc.b.i(1, arrayList6));
                    break;
                }
                break;
            case 12:
                a70 a70Var2 = (a70) obj2;
                TLObject tLObject = (TLObject) obj;
                a70Var2.getClass();
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    if (!vector.objects.isEmpty()) {
                        a70Var2.c.put(Long.valueOf(a70Var2.b.admin_id), (TLRPC.User) vector.objects.get(0));
                        a70Var2.T.l();
                        break;
                    }
                }
                break;
            case 13:
                u60 u60Var = (u60) obj2;
                if (((TLRPC.TL_error) obj) == null && (jbVar = (a70Var = u60Var.a.c).j0) != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = a70Var.b;
                    org.telegram.ui.wb wbVar = jbVar.a;
                    ArrayList arrayList7 = wbVar.s0;
                    int size = arrayList7.size();
                    int i17 = wbVar.I.h;
                    TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                    TLRPC.TL_channelAdminLogEventActionExportedInviteDelete tL_channelAdminLogEventActionExportedInviteDelete = new TLRPC.TL_channelAdminLogEventActionExportedInviteDelete();
                    tL_channelAdminLogEventActionExportedInviteDelete.invite = tL_chatInviteExported;
                    tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteDelete;
                    tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                    tL_channelAdminLogEvent.user_id = wbVar.getAccountInstance().getUserConfig().clientUserId;
                    i10 = ((org.telegram.ui.ActionBar.p2) wbVar).currentAccount;
                    if (new MessageObject(i10, tL_channelAdminLogEvent, (ArrayList<MessageObject>) wbVar.r0, (HashMap<String, ArrayList<MessageObject>>) wbVar.q0, wbVar.s, wbVar.X, true).contentType >= 0) {
                        wbVar.R0();
                        int size2 = arrayList7.size() - size;
                        if (size2 > 0) {
                            wbVar.G0.N = true;
                            org.telegram.ui.sb sbVar = wbVar.I;
                            sbVar.s(sbVar.h, size2);
                            org.telegram.ui.wb.K0(wbVar);
                        }
                        wbVar.C0.remove(tL_chatInviteExported.link);
                        break;
                    }
                }
                break;
            case 14:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                ((k70) obj2).setFocusable(true);
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new s1(i13, editTextBoldCursor));
                break;
            case 15:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", ((TLRPC.ChatFull) obj2).guard_bot_id);
                ((org.telegram.ui.mp) obj).presentFragment(new ProfileActivity(bundle2, null));
                break;
            case 16:
                h90 h90Var = (h90) obj2;
                if (h90Var.O0 == ((n90) obj)) {
                    h90Var.performLongClick();
                    h90Var.O0 = null;
                    h90Var.M0.d(true);
                    break;
                }
                break;
            case 17:
                ((j90) obj2).l((q90) obj, false);
                break;
            case 18:
                la0 la0Var = (la0) obj2;
                if (!((boolean[]) obj)[0] && (c1Var = la0Var.U) != null) {
                    c1Var.run();
                }
                la0Var.U = null;
                break;
            case 19:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) obj;
                ((na0) obj2).setFocusable(true);
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.runOnUIThread(new s1(i12, editTextBoldCursor2));
                break;
            case 20:
                m.g3 g3Var = (m.g3) obj2;
                Runnable runnable = (Runnable) obj;
                g3Var.getClass();
                runnable.run();
                ((HashMap) g3Var.b).remove(runnable);
                break;
            case 21:
                ih0 ih0Var = (ih0) obj2;
                TLObject tLObject2 = (TLObject) obj;
                ih0Var.M = false;
                if (tLObject2 instanceof TLRPC.SearchPostsFlood) {
                    TLRPC.SearchPostsFlood searchPostsFlood = (TLRPC.SearchPostsFlood) tLObject2;
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
            case 22:
                nh0 nh0Var = (nh0) obj2;
                ArrayList arrayList8 = (ArrayList) obj;
                ArrayList arrayList9 = nh0Var.a;
                int i18 = nh0Var.x;
                int size3 = arrayList8.size();
                nh0Var.x = size3;
                if (i18 != size3 && nh0Var.S != null) {
                    nh0Var.g();
                }
                int size4 = arrayList9.size();
                int i19 = 0;
                while (i19 < size4) {
                    kh0 kh0Var = (kh0) arrayList9.get(i19);
                    if (kh0Var.o && !kh0Var.p) {
                        arrayList8.add(kh0Var);
                    } else if (nh0.j(kh0Var.a, arrayList8) == null) {
                        nh0 nh0Var2 = kh0Var.y;
                        float f7 = nh0Var2.N;
                        RectF rectF = kh0Var.c;
                        RectF rectF2 = kh0Var.f;
                        q90 q90Var = kh0Var.r;
                        if (q90Var != null) {
                            q90Var.a();
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
                            int i20 = kh0Var.a;
                            if (i20 == 3 || i20 == 2) {
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
                    i19++;
                    z11 = false;
                    z12 = true;
                }
                arrayList9.clear();
                arrayList9.addAll(arrayList8);
                nh0Var.invalidate();
                break;
            case 23:
                kh0 kh0Var2 = (kh0) obj;
                mh0 mh0Var = ((nh0) obj2).F;
                int i21 = kh0Var2.a;
                RectF rectF3 = kh0Var2.d;
                ProfileActivity.Y(((org.telegram.ui.ny0) mh0Var).b, i21, rectF3.left, rectF3.top);
                break;
            case 24:
                Object obj3 = (ViewParent) obj;
                ((org.telegram.ui.Cells.t1) obj2).invalidate();
                if (obj3 instanceof View) {
                    ((View) obj3).invalidate();
                    break;
                }
                break;
            case 25:
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
            case 26:
                pj0 pj0Var = (pj0) obj2;
                ArrayList arrayList10 = (ArrayList) obj;
                ArrayList arrayList11 = pj0Var.r;
                pj0Var.n.addAll(arrayList10);
                int size5 = arrayList10.size();
                int i22 = 0;
                while (i22 < size5) {
                    Object obj4 = arrayList10.get(i22);
                    i22++;
                    oj0 oj0Var = (oj0) obj4;
                    int i23 = 0;
                    while (true) {
                        if (i23 >= arrayList11.size()) {
                            arrayList11.add(oj0Var);
                        } else if (MessageObject.getObjectPeerId(((oj0) arrayList11.get(i23)).a) != MessageObject.getObjectPeerId(oj0Var.a)) {
                            i23++;
                        } else if (oj0Var.c > 0) {
                            ((oj0) arrayList11.get(i23)).c = oj0Var.c;
                        }
                    }
                }
                q0.a aVar = pj0Var.w;
                if (aVar != null) {
                    aVar.accept(arrayList10);
                }
                pj0Var.a();
                break;
            case 27:
                ao0 ao0Var = (ao0) obj2;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) obj;
                ArrayList arrayList12 = ao0Var.K;
                if (!arrayList12.isEmpty() && (indexOf = arrayList12.indexOf(tL_sponsoredPeer)) >= 0 && (L = ao0Var.L()) < ao0Var.h()) {
                    arrayList12.remove(indexOf);
                    ao0Var.u(L + 1 + indexOf);
                    int size6 = ao0Var.j0.e.size();
                    int size7 = arrayList12.size();
                    if (ao0Var.G0) {
                        size6 = Math.min(3, size6);
                    }
                    if (size7 + size6 <= 0) {
                        ao0Var.u(L);
                        break;
                    }
                }
                break;
            case 28:
                ((ao0) obj2).T();
                wc.a0((org.telegram.ui.wy) obj).c(LocaleController.getString(R.string.AdHidden)).j();
                break;
            default:
                ((lo0) obj2).sendAccessibilityEvent((View) obj, 4);
                break;
        }
    }
}
