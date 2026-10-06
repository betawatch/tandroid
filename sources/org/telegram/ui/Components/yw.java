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

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class yw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yw(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f70 f70Var;
        org.telegram.ui.jb jbVar;
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
                nz nzVar = ((ix) obj2).a;
                if (tLObject instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
                    MediaDataController.getInstance(nzVar.c1).putStickerSet(tL_messages_stickerSet);
                    MediaDataController.getInstance(nzVar.c1).replaceStickerSet(tL_messages_stickerSet);
                    break;
                }
                break;
            case 1:
                fy fyVar = (fy) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                fyVar.s.f = true;
                nz nzVar2 = fyVar.E;
                if (!nzVar2.p1.contains(Long.valueOf(tL_messages_stickerSet2.set.id))) {
                    nzVar2.p1.add(Long.valueOf(tL_messages_stickerSet2.set.id));
                }
                fyVar.a(true);
                break;
            case 2:
                final my myVar = (my) obj2;
                final String str = (String) obj;
                String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                nz nzVar3 = myVar.a.F;
                if (!Arrays.equals(nzVar3.W0, currentKeyboardLanguage)) {
                    MediaDataController.getInstance(nzVar3.c1).fetchNewEmojiKeywords(currentKeyboardLanguage);
                }
                nzVar3.W0 = currentKeyboardLanguage;
                ArrayList arrayList = new ArrayList();
                final ArrayList arrayList2 = new ArrayList();
                final ArrayList arrayList3 = new ArrayList();
                final int i14 = 0;
                final int i15 = 1;
                Utilities.doCallbacks(new Utilities.Callback() { // from class: org.telegram.ui.Components.ly
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj3) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList4;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList5;
                        Runnable runnable = (Runnable) obj3;
                        switch (i14) {
                            case 0:
                                my myVar2 = myVar;
                                MediaDataController.getInstance(myVar2.a.F.c1).searchStickerSets(true, str, new ai.c5(myVar2, arrayList3, runnable, 7));
                                break;
                            default:
                                nz nzVar4 = myVar.a.F;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(nzVar4.c1).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str + "").toLowerCase());
                                    int i16 = nzVar4.c1;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i16).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList6 = arrayList3;
                                    if (stickerSets != null) {
                                        for (int i17 = 0; i17 < stickerSets.size(); i17++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i17);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList5 = tL_messages_stickerSet3.documents) != null && !arrayList5.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.bi.u(" ", translitSafe, translitSafe2)) {
                                                    arrayList6.add(new gy(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
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
                                                if (translitSafe3.startsWith(translitSafe) || org.telegram.messenger.bi.u(" ", translitSafe, translitSafe3)) {
                                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                                        arrayList4 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                                        TLRPC.TL_messages_stickerSet stickerSet3 = MediaDataController.getInstance(i16).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                                                        arrayList4 = stickerSet3 != null ? stickerSet3.documents : null;
                                                    } else {
                                                        arrayList4 = stickerSetCovered.covers;
                                                    }
                                                    if (arrayList4 != null && !arrayList4.isEmpty()) {
                                                        arrayList6.add(new gy(stickerSetCovered, arrayList4));
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
                }, new org.telegram.ui.qc(23, myVar, str), new Utilities.Callback() { // from class: org.telegram.ui.Components.ly
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj3) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList4;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList5;
                        Runnable runnable = (Runnable) obj3;
                        switch (i15) {
                            case 0:
                                my myVar2 = myVar;
                                MediaDataController.getInstance(myVar2.a.F.c1).searchStickerSets(true, str, new ai.c5(myVar2, arrayList2, runnable, 7));
                                break;
                            default:
                                nz nzVar4 = myVar.a.F;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(nzVar4.c1).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str + "").toLowerCase());
                                    int i16 = nzVar4.c1;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i16).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList6 = arrayList2;
                                    if (stickerSets != null) {
                                        for (int i17 = 0; i17 < stickerSets.size(); i17++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i17);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList5 = tL_messages_stickerSet3.documents) != null && !arrayList5.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.bi.u(" ", translitSafe, translitSafe2)) {
                                                    arrayList6.add(new gy(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
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
                                                if (translitSafe3.startsWith(translitSafe) || org.telegram.messenger.bi.u(" ", translitSafe, translitSafe3)) {
                                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                                        arrayList4 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                                        TLRPC.TL_messages_stickerSet stickerSet3 = MediaDataController.getInstance(i16).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                                                        arrayList4 = stickerSet3 != null ? stickerSet3.documents : null;
                                                    } else {
                                                        arrayList4 = stickerSetCovered.covers;
                                                    }
                                                    if (arrayList4 != null && !arrayList4.isEmpty()) {
                                                        arrayList6.add(new gy(stickerSetCovered, arrayList4));
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
                }, new org.telegram.ui.qc(24, myVar, arrayList), new org.telegram.ui.ua(myVar, str, arrayList, arrayList2, arrayList3));
                break;
            case 3:
                ArrayList arrayList4 = (ArrayList) obj;
                ny nyVar = ((my) obj2).a;
                nyVar.F.V.e(false);
                ArrayList arrayList5 = nyVar.r;
                nyVar.E = arrayList5.size() >= arrayList4.size();
                arrayList5.clear();
                arrayList5.addAll(arrayList4);
                nyVar.l();
                break;
            case 4:
                ((sy) obj2).F((String) obj, "", true, false, false);
                break;
            case 5:
                sy syVar = (sy) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                int i16 = syVar.L.c1;
                MessagesController.getInstance(i16).putUsers(tL_contacts_resolvedPeer.users, false);
                MessagesController.getInstance(i16).putChats(tL_contacts_resolvedPeer.chats, false);
                MessagesStorage.getInstance(i16).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str2 = syVar.w;
                syVar.w = null;
                syVar.F(str2, "", false, false, false);
                break;
            case 6:
                yz yzVar = (yz) obj2;
                ci.j8 j8Var = (ci.j8) obj;
                yzVar.c();
                yzVar.h(j8Var);
                c00 c00Var = yzVar.J;
                c00Var.h1 = j8Var;
                c00Var.j();
                break;
            case 7:
                ((yz) obj2).J.f1 = (b00) obj;
                break;
            case 8:
                ((f10) obj2).z0 = -1;
                ((Runnable) ((Pair) obj).first).run();
                break;
            case 9:
                ((org.telegram.ui.qc) obj2).run((org.telegram.ui.ActionBar.n2) obj);
                break;
            case 10:
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
                        org.telegram.ui.iq0 iq0Var = new org.telegram.ui.iq0(bundle);
                        iq0Var.e = false;
                        iq0Var.f = false;
                        iq0Var.c = y40Var;
                        launchActivity.p0(iq0Var);
                        break;
                    } else {
                        break;
                    }
                } catch (Exception e7) {
                    FileLog.e(e7);
                    y40Var.s(false, ImageLoader.loadBitmap(null, uri, 800.0f, 800.0f, true), null);
                    return;
                }
            case 11:
                y50 y50Var = (y50) obj2;
                t50 t50Var = (t50) obj;
                f60 f60Var = y50Var.H0;
                VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
                f60Var.S = videoEditedInfo;
                videoEditedInfo.startTime = -1L;
                videoEditedInfo.endTime = -1L;
                videoEditedInfo.estimatedSize = Math.max(1L, f60Var.Q);
                VideoEditedInfo videoEditedInfo2 = f60Var.S;
                videoEditedInfo2.roundVideo = true;
                videoEditedInfo2.file = f60Var.M;
                videoEditedInfo2.encryptedFile = f60Var.N;
                videoEditedInfo2.key = f60Var.O;
                videoEditedInfo2.iv = f60Var.P;
                videoEditedInfo2.framerate = 25;
                videoEditedInfo2.originalWidth = 360;
                videoEditedInfo2.resultWidth = 360;
                videoEditedInfo2.originalHeight = 360;
                videoEditedInfo2.resultHeight = 360;
                videoEditedInfo2.originalPath = y50Var.a.getAbsolutePath();
                VideoEditedInfo videoEditedInfo3 = f60Var.S;
                videoEditedInfo3.notReadyYet = true;
                videoEditedInfo3.thumb = f60Var.e1;
                videoEditedInfo3.estimatedDuration = f60Var.k0;
                f60Var.e1 = null;
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, y50Var.a.getAbsolutePath(), 0, true, 0, 0, 0L);
                if (t50Var != null) {
                    photoEntry.ttl = t50Var.c;
                    photoEntry.effectId = t50Var.d;
                }
                f60Var.n.q(photoEntry, f60Var.S, t50Var == null || t50Var.a, t50Var != null ? t50Var.b : 0, 0, false, t50Var != null ? t50Var.e : 0L);
                break;
            case 12:
                Bitmap bitmap = (Bitmap) obj;
                y50 y50Var2 = (y50) ((org.telegram.ui.Cells.t6) obj2).b;
                if ((bitmap != null && bitmap.getPixel(0, 0) != 0) || y50Var2.A0.size() <= 1) {
                    y50Var2.A0.add(bitmap);
                    break;
                } else {
                    ArrayList arrayList6 = y50Var2.A0;
                    arrayList6.add((Bitmap) hg.c.g(1, arrayList6));
                    break;
                }
            case 13:
                f70 f70Var2 = (f70) obj2;
                TLObject tLObject2 = (TLObject) obj;
                f70Var2.getClass();
                if (tLObject2 instanceof Vector) {
                    Vector vector = (Vector) tLObject2;
                    if (!vector.objects.isEmpty()) {
                        f70Var2.c.put(Long.valueOf(f70Var2.b.admin_id), (TLRPC.User) vector.objects.get(0));
                        f70Var2.T.l();
                        break;
                    }
                }
                break;
            case 14:
                z60 z60Var = (z60) obj2;
                if (((TLRPC.TL_error) obj) == null && (jbVar = (f70Var = z60Var.a.c).j0) != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = f70Var.b;
                    org.telegram.ui.wb wbVar = jbVar.a;
                    ArrayList arrayList7 = wbVar.o0;
                    int size = arrayList7.size();
                    int i17 = wbVar.E.h;
                    TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                    TLRPC.TL_channelAdminLogEventActionExportedInviteDelete tL_channelAdminLogEventActionExportedInviteDelete = new TLRPC.TL_channelAdminLogEventActionExportedInviteDelete();
                    tL_channelAdminLogEventActionExportedInviteDelete.invite = tL_chatInviteExported;
                    tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteDelete;
                    tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                    tL_channelAdminLogEvent.user_id = wbVar.getAccountInstance().getUserConfig().clientUserId;
                    i10 = ((org.telegram.ui.ActionBar.n2) wbVar).currentAccount;
                    if (new MessageObject(i10, tL_channelAdminLogEvent, (ArrayList<MessageObject>) wbVar.n0, (HashMap<String, ArrayList<MessageObject>>) wbVar.m0, wbVar.f, wbVar.T, true).contentType >= 0) {
                        wbVar.R0();
                        int size2 = arrayList7.size() - size;
                        if (size2 > 0) {
                            wbVar.C0.N = true;
                            org.telegram.ui.sb sbVar = wbVar.E;
                            sbVar.s(sbVar.h, size2);
                            org.telegram.ui.wb.K0(wbVar);
                        }
                        wbVar.y0.remove(tL_chatInviteExported.link);
                        break;
                    }
                }
                break;
            case 15:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                ((p70) obj2).setFocusable(true);
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new q1(i13, editTextBoldCursor));
                break;
            case 16:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", ((TLRPC.ChatFull) obj2).guard_bot_id);
                ((org.telegram.ui.hp) obj).presentFragment(new ProfileActivity(bundle2, null));
                break;
            case 17:
                l90 l90Var = (l90) obj2;
                if (l90Var.O0 == ((r90) obj)) {
                    l90Var.performLongClick();
                    l90Var.O0 = null;
                    l90Var.M0.d(true);
                    break;
                }
                break;
            case 18:
                ((n90) obj2).l((u90) obj, false);
                break;
            case 19:
                pa0 pa0Var = (pa0) obj2;
                if (!((boolean[]) obj)[0] && (y0Var = pa0Var.U) != null) {
                    y0Var.run();
                }
                pa0Var.U = null;
                break;
            case 20:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) obj;
                ((ra0) obj2).setFocusable(true);
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.runOnUIThread(new q1(i12, editTextBoldCursor2));
                break;
            case 21:
                pb.c cVar = (pb.c) obj2;
                Runnable runnable = (Runnable) obj;
                cVar.getClass();
                runnable.run();
                cVar.a.remove(runnable);
                break;
            case 22:
                lh0 lh0Var = (lh0) obj2;
                TLObject tLObject3 = (TLObject) obj;
                lh0Var.M = false;
                if (tLObject3 instanceof TLRPC.SearchPostsFlood) {
                    TLRPC.SearchPostsFlood searchPostsFlood = (TLRPC.SearchPostsFlood) tLObject3;
                    lh0Var.d = searchPostsFlood;
                    if (!searchPostsFlood.query_is_free) {
                        lh0Var.d();
                        lh0Var.c.f3.N(true);
                        break;
                    } else {
                        lh0Var.a(false);
                        break;
                    }
                }
                break;
            case 23:
                qh0 qh0Var = (qh0) obj2;
                ArrayList arrayList8 = (ArrayList) obj;
                ArrayList arrayList9 = qh0Var.a;
                int i18 = qh0Var.x;
                int size3 = arrayList8.size();
                qh0Var.x = size3;
                if (i18 != size3 && qh0Var.S != null) {
                    qh0Var.g();
                }
                int size4 = arrayList9.size();
                int i19 = 0;
                while (i19 < size4) {
                    nh0 nh0Var = (nh0) arrayList9.get(i19);
                    if (nh0Var.o && !nh0Var.p) {
                        arrayList8.add(nh0Var);
                    } else if (qh0.j(nh0Var.a, arrayList8) == null) {
                        qh0 qh0Var2 = nh0Var.y;
                        float f7 = qh0Var2.N;
                        RectF rectF = nh0Var.c;
                        RectF rectF2 = nh0Var.f;
                        u90 u90Var = nh0Var.r;
                        if (u90Var != null) {
                            u90Var.a();
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
                            int i20 = nh0Var.a;
                            if (i20 == 3 || i20 == 2) {
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
                    i19++;
                    z11 = false;
                    z12 = true;
                }
                arrayList9.clear();
                arrayList9.addAll(arrayList8);
                qh0Var.invalidate();
                break;
            case 24:
                nh0 nh0Var2 = (nh0) obj;
                ph0 ph0Var = ((qh0) obj2).F;
                int i21 = nh0Var2.a;
                RectF rectF3 = nh0Var2.d;
                ProfileActivity.X(((org.telegram.ui.ey0) ph0Var).b, i21, rectF3.left, rectF3.top);
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
                sj0 sj0Var = (sj0) obj2;
                ArrayList arrayList10 = (ArrayList) obj;
                ArrayList arrayList11 = sj0Var.r;
                sj0Var.n.addAll(arrayList10);
                int size5 = arrayList10.size();
                int i22 = 0;
                while (i22 < size5) {
                    Object obj4 = arrayList10.get(i22);
                    i22++;
                    rj0 rj0Var = (rj0) obj4;
                    int i23 = 0;
                    while (true) {
                        if (i23 >= arrayList11.size()) {
                            arrayList11.add(rj0Var);
                        } else if (MessageObject.getObjectPeerId(((rj0) arrayList11.get(i23)).a) != MessageObject.getObjectPeerId(rj0Var.a)) {
                            i23++;
                        } else if (rj0Var.c > 0) {
                            ((rj0) arrayList11.get(i23)).c = rj0Var.c;
                        }
                    }
                }
                q0.a aVar = sj0Var.w;
                if (aVar != null) {
                    aVar.accept(arrayList10);
                }
                sj0Var.a();
                break;
            case 28:
                jo0 jo0Var = (jo0) obj2;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) obj;
                ArrayList arrayList12 = jo0Var.K;
                if (!arrayList12.isEmpty() && (indexOf = arrayList12.indexOf(tL_sponsoredPeer)) >= 0 && (L = jo0Var.L()) < jo0Var.h()) {
                    arrayList12.remove(indexOf);
                    jo0Var.u(L + 1 + indexOf);
                    int size6 = jo0Var.j0.e.size();
                    int size7 = arrayList12.size();
                    if (jo0Var.G0) {
                        size6 = Math.min(3, size6);
                    }
                    if (size7 + size6 <= 0) {
                        jo0Var.u(L);
                        break;
                    }
                }
                break;
            default:
                ((jo0) obj2).T();
                yc.a0((org.telegram.ui.uy) obj).c(LocaleController.getString(R.string.AdHidden)).j();
                break;
        }
    }
}
