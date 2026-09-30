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

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dv(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        e70 e70Var;
        org.telegram.ui.hb hbVar;
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
                i10 = ((org.telegram.ui.ActionBar.e3) ((ev) obj2).a).currentAccount;
                MessagesController.getInstance(i10).updateEmojiStatus((TLRPC.EmojiStatus) obj);
                break;
            case 1:
                MessagesController.getInstance(((gx) obj2).a.c1).updateEmojiStatus((TLRPC.EmojiStatus) obj);
                break;
            case 2:
                TLObject tLObject = (TLObject) obj;
                mz mzVar = ((gx) obj2).a;
                if (tLObject instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
                    MediaDataController.getInstance(mzVar.c1).putStickerSet(tL_messages_stickerSet);
                    MediaDataController.getInstance(mzVar.c1).replaceStickerSet(tL_messages_stickerSet);
                    break;
                }
                break;
            case 3:
                ey eyVar = (ey) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                eyVar.s.f = true;
                mz mzVar2 = eyVar.E;
                if (!mzVar2.p1.contains(Long.valueOf(tL_messages_stickerSet2.set.id))) {
                    mzVar2.p1.add(Long.valueOf(tL_messages_stickerSet2.set.id));
                }
                eyVar.a(true);
                break;
            case 4:
                final ly lyVar = (ly) obj2;
                final String str = (String) obj;
                String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                mz mzVar3 = lyVar.a.F;
                if (!Arrays.equals(mzVar3.W0, currentKeyboardLanguage)) {
                    MediaDataController.getInstance(mzVar3.c1).fetchNewEmojiKeywords(currentKeyboardLanguage);
                }
                mzVar3.W0 = currentKeyboardLanguage;
                ArrayList arrayList = new ArrayList();
                final ArrayList arrayList2 = new ArrayList();
                final ArrayList arrayList3 = new ArrayList();
                final int i15 = 0;
                final int i16 = 1;
                Utilities.doCallbacks(new Utilities.Callback() { // from class: org.telegram.ui.Components.ky
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj3) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList4;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList5;
                        Runnable runnable = (Runnable) obj3;
                        switch (i15) {
                            case 0:
                                ly lyVar2 = lyVar;
                                MediaDataController.getInstance(lyVar2.a.F.c1).searchStickerSets(true, str, new ai.c5(lyVar2, arrayList3, runnable, 7));
                                break;
                            default:
                                mz mzVar4 = lyVar.a.F;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(mzVar4.c1).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str + "").toLowerCase());
                                    int i17 = mzVar4.c1;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i17).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList6 = arrayList3;
                                    if (stickerSets != null) {
                                        for (int i18 = 0; i18 < stickerSets.size(); i18++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i18);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList5 = tL_messages_stickerSet3.documents) != null && !arrayList5.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.f0.w(" ", translitSafe, translitSafe2)) {
                                                    arrayList6.add(new fy(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
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
                                                if (translitSafe3.startsWith(translitSafe) || org.telegram.messenger.f0.w(" ", translitSafe, translitSafe3)) {
                                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                                        arrayList4 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                                        TLRPC.TL_messages_stickerSet stickerSet3 = MediaDataController.getInstance(i17).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                                                        arrayList4 = stickerSet3 != null ? stickerSet3.documents : null;
                                                    } else {
                                                        arrayList4 = stickerSetCovered.covers;
                                                    }
                                                    if (arrayList4 != null && !arrayList4.isEmpty()) {
                                                        arrayList6.add(new fy(stickerSetCovered, arrayList4));
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
                }, new org.telegram.ui.oc(23, lyVar, str), new Utilities.Callback() { // from class: org.telegram.ui.Components.ky
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj3) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList4;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList5;
                        Runnable runnable = (Runnable) obj3;
                        switch (i16) {
                            case 0:
                                ly lyVar2 = lyVar;
                                MediaDataController.getInstance(lyVar2.a.F.c1).searchStickerSets(true, str, new ai.c5(lyVar2, arrayList2, runnable, 7));
                                break;
                            default:
                                mz mzVar4 = lyVar.a.F;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(mzVar4.c1).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str + "").toLowerCase());
                                    int i17 = mzVar4.c1;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i17).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList6 = arrayList2;
                                    if (stickerSets != null) {
                                        for (int i18 = 0; i18 < stickerSets.size(); i18++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i18);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList5 = tL_messages_stickerSet3.documents) != null && !arrayList5.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.f0.w(" ", translitSafe, translitSafe2)) {
                                                    arrayList6.add(new fy(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
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
                                                if (translitSafe3.startsWith(translitSafe) || org.telegram.messenger.f0.w(" ", translitSafe, translitSafe3)) {
                                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                                        arrayList4 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                                        TLRPC.TL_messages_stickerSet stickerSet3 = MediaDataController.getInstance(i17).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                                                        arrayList4 = stickerSet3 != null ? stickerSet3.documents : null;
                                                    } else {
                                                        arrayList4 = stickerSetCovered.covers;
                                                    }
                                                    if (arrayList4 != null && !arrayList4.isEmpty()) {
                                                        arrayList6.add(new fy(stickerSetCovered, arrayList4));
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
                }, new org.telegram.ui.oc(24, lyVar, arrayList), new org.telegram.ui.sa(lyVar, str, arrayList, arrayList2, arrayList3));
                break;
            case 5:
                ArrayList arrayList4 = (ArrayList) obj;
                my myVar = ((ly) obj2).a;
                myVar.F.V.e(false);
                ArrayList arrayList5 = myVar.r;
                myVar.E = arrayList5.size() >= arrayList4.size();
                arrayList5.clear();
                arrayList5.addAll(arrayList4);
                myVar.l();
                break;
            case 6:
                ((ry) obj2).F((String) obj, "", true, false, false);
                break;
            case 7:
                ry ryVar = (ry) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                mz mzVar4 = ryVar.L;
                MessagesController.getInstance(mzVar4.c1).putUsers(tL_contacts_resolvedPeer.users, false);
                int i17 = mzVar4.c1;
                MessagesController.getInstance(i17).putChats(tL_contacts_resolvedPeer.chats, false);
                MessagesStorage.getInstance(i17).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str2 = ryVar.w;
                ryVar.w = null;
                ryVar.F(str2, "", false, false, false);
                break;
            case 8:
                xz xzVar = (xz) obj2;
                ci.k8 k8Var = (ci.k8) obj;
                xzVar.c();
                xzVar.h(k8Var);
                b00 b00Var = xzVar.J;
                b00Var.h1 = k8Var;
                b00Var.j();
                break;
            case 9:
                ((xz) obj2).J.f1 = (a00) obj;
                break;
            case 10:
                ((e10) obj2).z0 = -1;
                ((Runnable) ((Pair) obj).first).run();
                break;
            case 11:
                ((org.telegram.ui.oc) obj2).run((org.telegram.ui.ActionBar.m2) obj);
                break;
            case 12:
                x40 x40Var = (x40) obj2;
                Uri uri = (Uri) obj;
                x40Var.getClass();
                try {
                    LaunchActivity launchActivity = (LaunchActivity) x40Var.a.getParentActivity();
                    if (launchActivity != null) {
                        Bundle bundle = new Bundle();
                        if (uri != null) {
                            bundle.putParcelable("photoUri", uri);
                        }
                        org.telegram.ui.fq0 fq0Var = new org.telegram.ui.fq0(bundle);
                        fq0Var.e = false;
                        fq0Var.f = false;
                        fq0Var.c = x40Var;
                        launchActivity.p0(fq0Var);
                        break;
                    } else {
                        break;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                    x40Var.s(false, ImageLoader.loadBitmap(null, uri, 800.0f, 800.0f, true), null);
                    return;
                }
            case 13:
                x50 x50Var = (x50) obj2;
                s50 s50Var = (s50) obj;
                e60 e60Var = x50Var.H0;
                VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
                e60Var.S = videoEditedInfo;
                videoEditedInfo.startTime = -1L;
                videoEditedInfo.endTime = -1L;
                videoEditedInfo.estimatedSize = Math.max(1L, e60Var.Q);
                VideoEditedInfo videoEditedInfo2 = e60Var.S;
                videoEditedInfo2.roundVideo = true;
                videoEditedInfo2.file = e60Var.M;
                videoEditedInfo2.encryptedFile = e60Var.N;
                videoEditedInfo2.key = e60Var.O;
                videoEditedInfo2.iv = e60Var.P;
                videoEditedInfo2.framerate = 25;
                videoEditedInfo2.originalWidth = 360;
                videoEditedInfo2.resultWidth = 360;
                videoEditedInfo2.originalHeight = 360;
                videoEditedInfo2.resultHeight = 360;
                videoEditedInfo2.originalPath = x50Var.a.getAbsolutePath();
                VideoEditedInfo videoEditedInfo3 = e60Var.S;
                videoEditedInfo3.notReadyYet = true;
                videoEditedInfo3.thumb = e60Var.e1;
                videoEditedInfo3.estimatedDuration = e60Var.k0;
                e60Var.e1 = null;
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, x50Var.a.getAbsolutePath(), 0, true, 0, 0, 0L);
                if (s50Var != null) {
                    photoEntry.ttl = s50Var.c;
                    photoEntry.effectId = s50Var.d;
                }
                e60Var.n.q(photoEntry, e60Var.S, s50Var == null || s50Var.a, s50Var != null ? s50Var.b : 0, 0, false, s50Var != null ? s50Var.e : 0L);
                break;
            case 14:
                Bitmap bitmap = (Bitmap) obj;
                x50 x50Var2 = (x50) ((org.telegram.ui.Cells.t6) obj2).b;
                if ((bitmap != null && bitmap.getPixel(0, 0) != 0) || x50Var2.A0.size() <= 1) {
                    x50Var2.A0.add(bitmap);
                    break;
                } else {
                    ArrayList arrayList6 = x50Var2.A0;
                    arrayList6.add((Bitmap) hg.c.g(1, arrayList6));
                    break;
                }
                break;
            case 15:
                e70 e70Var2 = (e70) obj2;
                TLObject tLObject2 = (TLObject) obj;
                e70Var2.getClass();
                if (tLObject2 instanceof Vector) {
                    Vector vector = (Vector) tLObject2;
                    if (!vector.objects.isEmpty()) {
                        e70Var2.c.put(Long.valueOf(e70Var2.b.admin_id), (TLRPC.User) vector.objects.get(0));
                        e70Var2.T.l();
                        break;
                    }
                }
                break;
            case 16:
                y60 y60Var = (y60) obj2;
                if (((TLRPC.TL_error) obj) == null && (hbVar = (e70Var = y60Var.a.c).j0) != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = e70Var.b;
                    org.telegram.ui.ub ubVar = hbVar.a;
                    ArrayList arrayList7 = ubVar.o0;
                    int size = arrayList7.size();
                    int i18 = ubVar.E.h;
                    TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                    TLRPC.TL_channelAdminLogEventActionExportedInviteDelete tL_channelAdminLogEventActionExportedInviteDelete = new TLRPC.TL_channelAdminLogEventActionExportedInviteDelete();
                    tL_channelAdminLogEventActionExportedInviteDelete.invite = tL_chatInviteExported;
                    tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteDelete;
                    tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                    tL_channelAdminLogEvent.user_id = ubVar.getAccountInstance().getUserConfig().clientUserId;
                    i11 = ((org.telegram.ui.ActionBar.m2) ubVar).currentAccount;
                    if (new MessageObject(i11, tL_channelAdminLogEvent, (ArrayList<MessageObject>) ubVar.n0, (HashMap<String, ArrayList<MessageObject>>) ubVar.m0, ubVar.f, ubVar.T, true).contentType >= 0) {
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
            case 17:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                ((o70) obj2).setFocusable(true);
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new q1(i14, editTextBoldCursor));
                break;
            case 18:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", ((TLRPC.ChatFull) obj2).guard_bot_id);
                ((org.telegram.ui.fp) obj).presentFragment(new ProfileActivity(bundle2, null));
                break;
            case 19:
                k90 k90Var = (k90) obj2;
                if (k90Var.O0 == ((q90) obj)) {
                    k90Var.performLongClick();
                    k90Var.O0 = null;
                    k90Var.M0.d(true);
                    break;
                }
                break;
            case 20:
                ((m90) obj2).l((t90) obj, false);
                break;
            case 21:
                pa0 pa0Var = (pa0) obj2;
                if (!((boolean[]) obj)[0] && (y0Var = pa0Var.U) != null) {
                    y0Var.run();
                }
                pa0Var.U = null;
                break;
            case 22:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) obj;
                ((ra0) obj2).setFocusable(true);
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
                lh0 lh0Var = (lh0) obj2;
                TLObject tLObject3 = (TLObject) obj;
                lh0Var.M = false;
                if (tLObject3 instanceof TLRPC.SearchPostsFlood) {
                    TLRPC.SearchPostsFlood searchPostsFlood = (TLRPC.SearchPostsFlood) tLObject3;
                    lh0Var.d = searchPostsFlood;
                    if (!searchPostsFlood.query_is_free) {
                        lh0Var.d();
                        lh0Var.c.Y2.N(true);
                        break;
                    } else {
                        lh0Var.a(false);
                        break;
                    }
                }
                break;
            case 25:
                qh0 qh0Var = (qh0) obj2;
                ArrayList arrayList8 = (ArrayList) obj;
                ArrayList arrayList9 = qh0Var.a;
                int i19 = qh0Var.x;
                int size3 = arrayList8.size();
                qh0Var.x = size3;
                if (i19 != size3 && qh0Var.S != null) {
                    qh0Var.g();
                }
                int size4 = arrayList9.size();
                int i20 = 0;
                while (i20 < size4) {
                    nh0 nh0Var = (nh0) arrayList9.get(i20);
                    if (nh0Var.o && !nh0Var.p) {
                        arrayList8.add(nh0Var);
                    } else if (qh0.j(nh0Var.a, arrayList8) == null) {
                        qh0 qh0Var2 = nh0Var.y;
                        float f7 = qh0Var2.N;
                        RectF rectF = nh0Var.c;
                        RectF rectF2 = nh0Var.f;
                        t90 t90Var = nh0Var.r;
                        if (t90Var != null) {
                            t90Var.a();
                            nh0Var.t = z11;
                            nh0Var.s = z11;
                        }
                        nh0Var.o = z12;
                        boolean z13 = rectF.left - 1.0f <= f7;
                        boolean z14 = rectF.right + 1.0f >= ((float) qh0Var2.getMeasuredWidth()) - f7;
                        if (z13 && z14) {
                            z14 = false;
                            z13 = false;
                        }
                        nh0Var.g.set(rectF);
                        rectF2.set(rectF);
                        if (z13) {
                            rectF2.right = rectF2.left;
                        } else if (z14) {
                            rectF2.left = rectF2.right;
                        } else {
                            int i21 = nh0Var.a;
                            if (i21 == 3 || i21 == 2) {
                                z10 = true;
                                if (qh0Var2.H == 1) {
                                    rectF2.left = rectF2.right;
                                    nh0Var.e.d(0.0f, z10);
                                    arrayList8.add(nh0Var);
                                }
                            } else {
                                z10 = true;
                            }
                            float centerX = rectF2.centerX();
                            rectF2.right = centerX;
                            rectF2.left = centerX;
                            nh0Var.e.d(0.0f, z10);
                            arrayList8.add(nh0Var);
                        }
                        z10 = true;
                        nh0Var.e.d(0.0f, z10);
                        arrayList8.add(nh0Var);
                    }
                    i20++;
                    z11 = false;
                    z12 = true;
                }
                arrayList9.clear();
                arrayList9.addAll(arrayList8);
                qh0Var.invalidate();
                break;
            case 26:
                nh0 nh0Var2 = (nh0) obj;
                ph0 ph0Var = ((qh0) obj2).F;
                int i22 = nh0Var2.a;
                RectF rectF3 = nh0Var2.d;
                ProfileActivity.Y(((org.telegram.ui.by0) ph0Var).b, i22, rectF3.left, rectF3.top);
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
                sj0 sj0Var = (sj0) obj2;
                ArrayList arrayList10 = (ArrayList) obj;
                ArrayList arrayList11 = sj0Var.r;
                sj0Var.n.addAll(arrayList10);
                int size5 = arrayList10.size();
                int i23 = 0;
                while (i23 < size5) {
                    Object obj4 = arrayList10.get(i23);
                    i23++;
                    rj0 rj0Var = (rj0) obj4;
                    int i24 = 0;
                    while (true) {
                        if (i24 >= arrayList11.size()) {
                            arrayList11.add(rj0Var);
                        } else if (MessageObject.getObjectPeerId(((rj0) arrayList11.get(i24)).a) != MessageObject.getObjectPeerId(rj0Var.a)) {
                            i24++;
                        } else if (rj0Var.c > 0) {
                            ((rj0) arrayList11.get(i24)).c = rj0Var.c;
                        }
                    }
                }
                q0.a aVar = sj0Var.w;
                if (aVar != null) {
                    aVar.accept(arrayList10);
                }
                sj0Var.a();
                break;
        }
    }
}
