package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
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
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xq(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        f60 f60Var;
        org.telegram.ui.cb cbVar;
        int i11;
        hh.t5 t5Var;
        int i12 = this.a;
        int i13 = 4;
        int i14 = 5;
        int i15 = 3;
        Object[] objArr = 0;
        final int i16 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i12) {
            case 0:
                ar arVar = (ar) obj2;
                arVar.getClass();
                ((lh.d) obj).setLoading(false);
                arVar.dismiss();
                break;
            case 1:
                ar arVar2 = (ar) obj2;
                TLObject tLObject = (TLObject) obj;
                if (tLObject != null && (tLObject instanceof TL_phone.groupCallStreamRtmpUrl)) {
                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject;
                    arVar2.X = groupcallstreamrtmpurl.url;
                    arVar2.Y = groupcallstreamrtmpurl.key;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(arVar2.Y);
                    arVar2.Z = spannableStringBuilder;
                    xz0 xz0Var = new xz0();
                    xz0Var.a |= 256;
                    xz0Var.b = 0;
                    xz0Var.c = spannableStringBuilder.length();
                    arVar2.Z.setSpan(new yz0(xz0Var, 0), 0, arVar2.Z.length(), 0);
                    arVar2.a0.N(false);
                    break;
                }
                break;
            case 2:
                es esVar = (es) obj2;
                TLObject tLObject2 = (TLObject) obj;
                bs bsVar = esVar.b;
                ArrayList arrayList = esVar.h;
                int i17 = esVar.a;
                if (tLObject2 instanceof TL_bots.popularAppBots) {
                    TL_bots.popularAppBots popularappbots = (TL_bots.popularAppBots) tLObject2;
                    MessagesController.getInstance(i17).putUsers(popularappbots.users, false);
                    MessagesStorage.getInstance(i17).putUsersAndChats(popularappbots.users, null, false, true);
                    arrayList.addAll(popularappbots.users);
                    String str = popularappbots.next_offset;
                    esVar.g = str;
                    esVar.e = str == null;
                    long currentTimeMillis = System.currentTimeMillis();
                    esVar.f = currentTimeMillis;
                    if (!esVar.i) {
                        esVar.i = true;
                        String str2 = esVar.g;
                        if (str2 == null) {
                            str2 = "";
                        }
                        String str3 = str2;
                        ArrayList arrayList2 = new ArrayList();
                        for (int i18 = 0; i18 < arrayList.size(); i18 = com.google.android.recaptcha.internal.a.f(((TLRPC.User) arrayList.get(i18)).id, arrayList2, i18, 1)) {
                        }
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i17);
                        messagesStorage.getStorageQueue().postRunnable(new gh.k1(esVar, messagesStorage, arrayList2, currentTimeMillis, str3, 11));
                    }
                    esVar.c = false;
                    bsVar.run();
                    break;
                } else {
                    esVar.g = null;
                    esVar.e = true;
                    esVar.c = false;
                    bsVar.run();
                    break;
                }
            case 3:
                Bitmap decodeFile = BitmapFactory.decodeFile((String) obj);
                Canvas canvas = new Canvas(Bitmap.createBitmap(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f), Bitmap.Config.ARGB_8888));
                Paint paint = new Paint(3);
                canvas.translate(r3.getWidth() / 2.0f, r3.getHeight() / 2.0f);
                float max = Math.max(r3.getWidth() / decodeFile.getWidth(), r3.getHeight() / decodeFile.getHeight());
                canvas.scale(max, max);
                canvas.drawBitmap(decodeFile, (-decodeFile.getWidth()) / 2.0f, (-decodeFile.getHeight()) / 2.0f, paint);
                AndroidUtilities.runOnUIThread(new xq(i13, (at) obj2, decodeFile));
                break;
            case 4:
                ((at) obj2).setImage((Bitmap) obj);
                break;
            case 5:
                ((EditTextBoldCursor) obj2).hintLayout.draw((Canvas) obj);
                break;
            case 6:
                i10 = ((org.telegram.ui.ActionBar.e3) ((lu) obj2).a).currentAccount;
                MessagesController.getInstance(i10).updateEmojiStatus((TLRPC.EmojiStatus) obj);
                break;
            case 7:
                MessagesController.getInstance(((pw) obj2).a.Y0).updateEmojiStatus((TLRPC.EmojiStatus) obj);
                break;
            case 8:
                TLObject tLObject3 = (TLObject) obj;
                yy yyVar = ((pw) obj2).a;
                if (tLObject3 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject3;
                    MediaDataController.getInstance(yyVar.Y0).putStickerSet(tL_messages_stickerSet);
                    MediaDataController.getInstance(yyVar.Y0).replaceStickerSet(tL_messages_stickerSet);
                    break;
                }
                break;
            case 9:
                ox oxVar = (ox) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                oxVar.s.f = true;
                yy yyVar2 = oxVar.A;
                if (!yyVar2.l1.contains(Long.valueOf(tL_messages_stickerSet2.set.id))) {
                    yyVar2.l1.add(Long.valueOf(tL_messages_stickerSet2.set.id));
                }
                oxVar.a(true);
                break;
            case 10:
                final vx vxVar = (vx) obj2;
                final String str4 = (String) obj;
                String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                yy yyVar3 = vxVar.a.B;
                if (!Arrays.equals(yyVar3.S0, currentKeyboardLanguage)) {
                    MediaDataController.getInstance(yyVar3.Y0).fetchNewEmojiKeywords(currentKeyboardLanguage);
                }
                yyVar3.S0 = currentKeyboardLanguage;
                ArrayList arrayList3 = new ArrayList();
                final ArrayList arrayList4 = new ArrayList();
                final ArrayList arrayList5 = new ArrayList();
                final Object[] objArr2 = objArr == true ? 1 : 0;
                Utilities.doCallbacks(new Utilities.Callback() { // from class: org.telegram.ui.Components.ux
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj3) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList6;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList7;
                        Runnable runnable = (Runnable) obj3;
                        switch (objArr2) {
                            case 0:
                                vx vxVar2 = vxVar;
                                MediaDataController.getInstance(vxVar2.a.B.Y0).searchStickerSets(true, str4, new gh.i(vxVar2, arrayList5, runnable, 9));
                                break;
                            default:
                                yy yyVar4 = vxVar.a.B;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(yyVar4.Y0).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str4 + "").toLowerCase());
                                    int i19 = yyVar4.Y0;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i19).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList8 = arrayList5;
                                    if (stickerSets != null) {
                                        for (int i20 = 0; i20 < stickerSets.size(); i20++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i20);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList7 = tL_messages_stickerSet3.documents) != null && !arrayList7.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.y1.x(" ", translitSafe, translitSafe2)) {
                                                    arrayList8.add(new px(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i19).getFeaturedEmojiSets();
                                    if (featuredEmojiSets != null) {
                                        for (int i21 = 0; i21 < featuredEmojiSets.size(); i21++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i21);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.id))) {
                                                String translitSafe3 = AndroidUtilities.translitSafe(stickerSetCovered.set.title.toLowerCase());
                                                if (translitSafe3.startsWith(translitSafe) || org.telegram.messenger.y1.x(" ", translitSafe, translitSafe3)) {
                                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                                        arrayList6 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                                        TLRPC.TL_messages_stickerSet stickerSet3 = MediaDataController.getInstance(i19).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                                                        arrayList6 = stickerSet3 != null ? stickerSet3.documents : null;
                                                    } else {
                                                        arrayList6 = stickerSetCovered.covers;
                                                    }
                                                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                                                        arrayList8.add(new px(stickerSetCovered, arrayList6));
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
                }, new org.telegram.ui.df(18, vxVar, str4), new Utilities.Callback() { // from class: org.telegram.ui.Components.ux
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj3) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList6;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList7;
                        Runnable runnable = (Runnable) obj3;
                        switch (i16) {
                            case 0:
                                vx vxVar2 = vxVar;
                                MediaDataController.getInstance(vxVar2.a.B.Y0).searchStickerSets(true, str4, new gh.i(vxVar2, arrayList4, runnable, 9));
                                break;
                            default:
                                yy yyVar4 = vxVar.a.B;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(yyVar4.Y0).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str4 + "").toLowerCase());
                                    int i19 = yyVar4.Y0;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i19).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList8 = arrayList4;
                                    if (stickerSets != null) {
                                        for (int i20 = 0; i20 < stickerSets.size(); i20++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i20);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList7 = tL_messages_stickerSet3.documents) != null && !arrayList7.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.y1.x(" ", translitSafe, translitSafe2)) {
                                                    arrayList8.add(new px(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i19).getFeaturedEmojiSets();
                                    if (featuredEmojiSets != null) {
                                        for (int i21 = 0; i21 < featuredEmojiSets.size(); i21++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i21);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.id))) {
                                                String translitSafe3 = AndroidUtilities.translitSafe(stickerSetCovered.set.title.toLowerCase());
                                                if (translitSafe3.startsWith(translitSafe) || org.telegram.messenger.y1.x(" ", translitSafe, translitSafe3)) {
                                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                                        arrayList6 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                                        TLRPC.TL_messages_stickerSet stickerSet3 = MediaDataController.getInstance(i19).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                                                        arrayList6 = stickerSet3 != null ? stickerSet3.documents : null;
                                                    } else {
                                                        arrayList6 = stickerSetCovered.covers;
                                                    }
                                                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                                                        arrayList8.add(new px(stickerSetCovered, arrayList6));
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
                }, new org.telegram.ui.df(19, vxVar, arrayList3), new hh.i2(vxVar, str4, arrayList3, arrayList4, arrayList5, 4));
                break;
            case 11:
                ArrayList arrayList6 = (ArrayList) obj;
                wx wxVar = ((vx) obj2).a;
                wxVar.B.R.e(false);
                ArrayList arrayList7 = wxVar.r;
                wxVar.A = arrayList7.size() >= arrayList6.size();
                arrayList7.clear();
                arrayList7.addAll(arrayList6);
                wxVar.l();
                break;
            case 12:
                ((cy) obj2).F((String) obj, "", true, false, false);
                break;
            case 13:
                cy cyVar = (cy) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                yy yyVar4 = cyVar.H;
                MessagesController.getInstance(yyVar4.Y0).putUsers(tL_contacts_resolvedPeer.users, false);
                int i19 = yyVar4.Y0;
                MessagesController.getInstance(i19).putChats(tL_contacts_resolvedPeer.chats, false);
                MessagesStorage.getInstance(i19).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str5 = cyVar.w;
                cyVar.w = null;
                cyVar.F(str5, "", false, false, false);
                break;
            case 14:
                jz jzVar = (jz) obj2;
                lh.y7 y7Var = (lh.y7) obj;
                jzVar.c();
                jzVar.h(y7Var);
                nz nzVar = jzVar.F;
                nzVar.h1 = y7Var;
                nzVar.j();
                break;
            case 15:
                ((jz) obj2).F.f1 = (mz) obj;
                break;
            case 16:
                ((q00) obj2).v0 = -1;
                ((Runnable) ((Pair) obj).first).run();
                break;
            case 17:
                ((org.telegram.ui.df) obj2).run((org.telegram.ui.ActionBar.n2) obj);
                break;
            case 18:
                j40 j40Var = (j40) obj2;
                Uri uri = (Uri) obj;
                j40Var.getClass();
                try {
                    LaunchActivity launchActivity = (LaunchActivity) j40Var.a.getParentActivity();
                    if (launchActivity == null) {
                        break;
                    } else {
                        Bundle bundle = new Bundle();
                        if (uri != null) {
                            bundle.putParcelable("photoUri", uri);
                        }
                        org.telegram.ui.mp0 mp0Var = new org.telegram.ui.mp0(bundle);
                        mp0Var.e = false;
                        mp0Var.f = false;
                        mp0Var.c = j40Var;
                        launchActivity.p0(mp0Var);
                        break;
                    }
                } catch (Exception e9) {
                    FileLog.e(e9);
                    j40Var.s(false, ImageLoader.loadBitmap(null, uri, 800.0f, 800.0f, true), null);
                    return;
                }
            case 19:
                j50 j50Var = (j50) obj2;
                e50 e50Var = (e50) obj;
                k50 k50Var = j50Var.D0;
                VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
                k50Var.J = videoEditedInfo;
                videoEditedInfo.startTime = -1L;
                videoEditedInfo.endTime = -1L;
                videoEditedInfo.estimatedSize = Math.max(1L, k50Var.H);
                VideoEditedInfo videoEditedInfo2 = k50Var.J;
                videoEditedInfo2.roundVideo = true;
                videoEditedInfo2.file = k50Var.D;
                videoEditedInfo2.encryptedFile = k50Var.E;
                videoEditedInfo2.key = k50Var.F;
                videoEditedInfo2.iv = k50Var.G;
                videoEditedInfo2.framerate = 25;
                videoEditedInfo2.originalWidth = 360;
                videoEditedInfo2.resultWidth = 360;
                videoEditedInfo2.originalHeight = 360;
                videoEditedInfo2.resultHeight = 360;
                videoEditedInfo2.originalPath = j50Var.a.getAbsolutePath();
                VideoEditedInfo videoEditedInfo3 = k50Var.J;
                videoEditedInfo3.notReadyYet = true;
                videoEditedInfo3.thumb = k50Var.V0;
                videoEditedInfo3.estimatedDuration = k50Var.b0;
                k50Var.V0 = null;
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, j50Var.a.getAbsolutePath(), 0, true, 0, 0, 0L);
                if (e50Var != null) {
                    photoEntry.ttl = e50Var.c;
                    photoEntry.effectId = e50Var.d;
                }
                k50Var.c.s(photoEntry, k50Var.J, e50Var == null || e50Var.a, e50Var != null ? e50Var.b : 0, 0, false, e50Var != null ? e50Var.e : 0L);
                break;
            case 20:
                Bitmap bitmap = (Bitmap) obj;
                j50 j50Var2 = (j50) ((m.i3) obj2).b;
                if ((bitmap == null || bitmap.getPixel(0, 0) == 0) && j50Var2.w0.size() > 1) {
                    ArrayList arrayList8 = j50Var2.w0;
                    arrayList8.add((Bitmap) i0.a.i(1, arrayList8));
                    break;
                } else {
                    j50Var2.w0.add(bitmap);
                    break;
                }
                break;
            case 21:
                f60 f60Var2 = (f60) obj2;
                TLObject tLObject4 = (TLObject) obj;
                f60Var2.getClass();
                if (tLObject4 instanceof Vector) {
                    Vector vector = (Vector) tLObject4;
                    if (!vector.objects.isEmpty()) {
                        f60Var2.c.put(Long.valueOf(f60Var2.b.admin_id), (TLRPC.User) vector.objects.get(0));
                        f60Var2.P.l();
                        break;
                    }
                }
                break;
            case 22:
                z50 z50Var = (z50) obj2;
                if (((TLRPC.TL_error) obj) == null && (cbVar = (f60Var = z50Var.a.c).f0) != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = f60Var.b;
                    org.telegram.ui.qb qbVar = cbVar.a;
                    ArrayList arrayList9 = qbVar.o0;
                    int size = arrayList9.size();
                    int i20 = qbVar.E.h;
                    TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                    TLRPC.TL_channelAdminLogEventActionExportedInviteDelete tL_channelAdminLogEventActionExportedInviteDelete = new TLRPC.TL_channelAdminLogEventActionExportedInviteDelete();
                    tL_channelAdminLogEventActionExportedInviteDelete.invite = tL_chatInviteExported;
                    tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteDelete;
                    tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                    tL_channelAdminLogEvent.user_id = qbVar.getAccountInstance().getUserConfig().clientUserId;
                    i11 = ((org.telegram.ui.ActionBar.n2) qbVar).currentAccount;
                    if (new MessageObject(i11, tL_channelAdminLogEvent, (ArrayList<MessageObject>) qbVar.n0, (HashMap<String, ArrayList<MessageObject>>) qbVar.m0, qbVar.s, qbVar.T, true).contentType >= 0) {
                        qbVar.R0();
                        int size2 = arrayList9.size() - size;
                        if (size2 > 0) {
                            qbVar.C0.N = true;
                            org.telegram.ui.mb mbVar = qbVar.E;
                            mbVar.s(mbVar.h, size2);
                            org.telegram.ui.qb.K0(qbVar);
                        }
                        qbVar.y0.remove(tL_chatInviteExported.link);
                        break;
                    }
                }
                break;
            case 23:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                ((p60) obj2).setFocusable(true);
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new p1(i15, editTextBoldCursor));
                break;
            case 24:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", ((TLRPC.ChatFull) obj2).guard_bot_id);
                ((org.telegram.ui.xo) obj).presentFragment(new ProfileActivity(bundle2, null));
                break;
            case 25:
                k80 k80Var = (k80) obj2;
                if (k80Var.K0 == ((q80) obj)) {
                    k80Var.performLongClick();
                    k80Var.K0 = null;
                    k80Var.I0.d(true);
                    break;
                }
                break;
            case 26:
                ((m80) obj2).l((t80) obj, false);
                break;
            case 27:
                o90 o90Var = (o90) obj2;
                if (!((boolean[]) obj)[0] && (t5Var = o90Var.Q) != null) {
                    t5Var.run();
                }
                o90Var.Q = null;
                break;
            case 28:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) obj;
                ((q90) obj2).setFocusable(true);
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.runOnUIThread(new p1(i14, editTextBoldCursor2));
                break;
            default:
                m5.o oVar = (m5.o) obj2;
                Runnable runnable = (Runnable) obj;
                oVar.getClass();
                runnable.run();
                ((HashMap) oVar.b).remove(runnable);
                break;
        }
    }
}
