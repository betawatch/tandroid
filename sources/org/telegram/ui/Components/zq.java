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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zq(int i9, Object obj, Object obj2) {
        this.a = i9;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        int i9;
        a60 a60Var;
        org.telegram.ui.bb bbVar;
        int i10;
        gh.u5 u5Var;
        int i11 = this.a;
        int i12 = 4;
        int i13 = 5;
        int i14 = 3;
        Object[] objArr = 0;
        final int i15 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i11) {
            case 0:
                cr crVar = (cr) obj2;
                crVar.getClass();
                ((kh.d) obj).setLoading(false);
                crVar.dismiss();
                break;
            case 1:
                cr crVar2 = (cr) obj2;
                TLObject tLObject = (TLObject) obj;
                if (tLObject != null && (tLObject instanceof TL_phone.groupCallStreamRtmpUrl)) {
                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject;
                    crVar2.X = groupcallstreamrtmpurl.url;
                    crVar2.Y = groupcallstreamrtmpurl.key;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(crVar2.Y);
                    crVar2.Z = spannableStringBuilder;
                    vz0 vz0Var = new vz0();
                    vz0Var.a |= 256;
                    vz0Var.b = 0;
                    vz0Var.c = spannableStringBuilder.length();
                    crVar2.Z.setSpan(new wz0(vz0Var, 0), 0, crVar2.Z.length(), 0);
                    crVar2.a0.N(false);
                    break;
                }
                break;
            case 2:
                gs gsVar = (gs) obj2;
                TLObject tLObject2 = (TLObject) obj;
                ds dsVar = gsVar.b;
                ArrayList arrayList = gsVar.h;
                int i16 = gsVar.a;
                if (tLObject2 instanceof TL_bots.popularAppBots) {
                    TL_bots.popularAppBots popularappbots = (TL_bots.popularAppBots) tLObject2;
                    MessagesController.getInstance(i16).putUsers(popularappbots.users, false);
                    MessagesStorage.getInstance(i16).putUsersAndChats(popularappbots.users, null, false, true);
                    arrayList.addAll(popularappbots.users);
                    String str = popularappbots.next_offset;
                    gsVar.g = str;
                    gsVar.e = str == null;
                    long currentTimeMillis = System.currentTimeMillis();
                    gsVar.f = currentTimeMillis;
                    if (!gsVar.i) {
                        gsVar.i = true;
                        String str2 = gsVar.g;
                        if (str2 == null) {
                            str2 = "";
                        }
                        String str3 = str2;
                        ArrayList arrayList2 = new ArrayList();
                        for (int i17 = 0; i17 < arrayList.size(); i17 = aa.d.g(((TLRPC.User) arrayList.get(i17)).id, arrayList2, i17, 1)) {
                        }
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i16);
                        messagesStorage.getStorageQueue().postRunnable(new fh.m1(gsVar, messagesStorage, arrayList2, currentTimeMillis, str3, 11));
                    }
                    gsVar.c = false;
                    dsVar.run();
                    break;
                } else {
                    gsVar.g = null;
                    gsVar.e = true;
                    gsVar.c = false;
                    dsVar.run();
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
                AndroidUtilities.runOnUIThread(new zq(i12, (bt) obj2, decodeFile));
                break;
            case 4:
                ((bt) obj2).setImage((Bitmap) obj);
                break;
            case 5:
                ((EditTextBoldCursor) obj2).hintLayout.draw((Canvas) obj);
                break;
            case 6:
                i9 = ((org.telegram.ui.ActionBar.f3) ((mu) obj2).a).currentAccount;
                MessagesController.getInstance(i9).updateEmojiStatus((TLRPC.EmojiStatus) obj);
                break;
            case 7:
                MessagesController.getInstance(((pw) obj2).a.Y0).updateEmojiStatus((TLRPC.EmojiStatus) obj);
                break;
            case 8:
                TLObject tLObject3 = (TLObject) obj;
                wy wyVar = ((pw) obj2).a;
                if (tLObject3 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject3;
                    MediaDataController.getInstance(wyVar.Y0).putStickerSet(tL_messages_stickerSet);
                    MediaDataController.getInstance(wyVar.Y0).replaceStickerSet(tL_messages_stickerSet);
                    break;
                }
                break;
            case 9:
                nx nxVar = (nx) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                nxVar.s.f = true;
                wy wyVar2 = nxVar.A;
                if (!wyVar2.l1.contains(Long.valueOf(tL_messages_stickerSet2.set.id))) {
                    wyVar2.l1.add(Long.valueOf(tL_messages_stickerSet2.set.id));
                }
                nxVar.a(true);
                break;
            case 10:
                final ux uxVar = (ux) obj2;
                final String str4 = (String) obj;
                String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                wy wyVar3 = uxVar.a.B;
                if (!Arrays.equals(wyVar3.S0, currentKeyboardLanguage)) {
                    MediaDataController.getInstance(wyVar3.Y0).fetchNewEmojiKeywords(currentKeyboardLanguage);
                }
                wyVar3.S0 = currentKeyboardLanguage;
                ArrayList arrayList3 = new ArrayList();
                final ArrayList arrayList4 = new ArrayList();
                final ArrayList arrayList5 = new ArrayList();
                final Object[] objArr2 = objArr == true ? 1 : 0;
                Utilities.doCallbacks(new Utilities.Callback() { // from class: org.telegram.ui.Components.tx
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj3) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList6;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList7;
                        Runnable runnable = (Runnable) obj3;
                        switch (objArr2) {
                            case 0:
                                ux uxVar2 = uxVar;
                                MediaDataController.getInstance(uxVar2.a.B.Y0).searchStickerSets(true, str4, new fh.i(uxVar2, arrayList5, runnable, 9));
                                break;
                            default:
                                wy wyVar4 = uxVar.a.B;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(wyVar4.Y0).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str4 + "").toLowerCase());
                                    int i18 = wyVar4.Y0;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i18).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList8 = arrayList5;
                                    if (stickerSets != null) {
                                        for (int i19 = 0; i19 < stickerSets.size(); i19++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i19);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList7 = tL_messages_stickerSet3.documents) != null && !arrayList7.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.l0.w(" ", translitSafe, translitSafe2)) {
                                                    arrayList8.add(new ox(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i18).getFeaturedEmojiSets();
                                    if (featuredEmojiSets != null) {
                                        for (int i20 = 0; i20 < featuredEmojiSets.size(); i20++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i20);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.id))) {
                                                String translitSafe3 = AndroidUtilities.translitSafe(stickerSetCovered.set.title.toLowerCase());
                                                if (translitSafe3.startsWith(translitSafe) || org.telegram.messenger.l0.w(" ", translitSafe, translitSafe3)) {
                                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                                        arrayList6 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                                        TLRPC.TL_messages_stickerSet stickerSet3 = MediaDataController.getInstance(i18).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                                                        arrayList6 = stickerSet3 != null ? stickerSet3.documents : null;
                                                    } else {
                                                        arrayList6 = stickerSetCovered.covers;
                                                    }
                                                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                                                        arrayList8.add(new ox(stickerSetCovered, arrayList6));
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
                }, new org.telegram.ui.df(18, uxVar, str4), new Utilities.Callback() { // from class: org.telegram.ui.Components.tx
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj3) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList6;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList7;
                        Runnable runnable = (Runnable) obj3;
                        switch (i15) {
                            case 0:
                                ux uxVar2 = uxVar;
                                MediaDataController.getInstance(uxVar2.a.B.Y0).searchStickerSets(true, str4, new fh.i(uxVar2, arrayList4, runnable, 9));
                                break;
                            default:
                                wy wyVar4 = uxVar.a.B;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(wyVar4.Y0).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str4 + "").toLowerCase());
                                    int i18 = wyVar4.Y0;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i18).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList8 = arrayList4;
                                    if (stickerSets != null) {
                                        for (int i19 = 0; i19 < stickerSets.size(); i19++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i19);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList7 = tL_messages_stickerSet3.documents) != null && !arrayList7.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.l0.w(" ", translitSafe, translitSafe2)) {
                                                    arrayList8.add(new ox(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i18).getFeaturedEmojiSets();
                                    if (featuredEmojiSets != null) {
                                        for (int i20 = 0; i20 < featuredEmojiSets.size(); i20++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i20);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.id))) {
                                                String translitSafe3 = AndroidUtilities.translitSafe(stickerSetCovered.set.title.toLowerCase());
                                                if (translitSafe3.startsWith(translitSafe) || org.telegram.messenger.l0.w(" ", translitSafe, translitSafe3)) {
                                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                                        arrayList6 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                                        TLRPC.TL_messages_stickerSet stickerSet3 = MediaDataController.getInstance(i18).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                                                        arrayList6 = stickerSet3 != null ? stickerSet3.documents : null;
                                                    } else {
                                                        arrayList6 = stickerSetCovered.covers;
                                                    }
                                                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                                                        arrayList8.add(new ox(stickerSetCovered, arrayList6));
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
                }, new org.telegram.ui.df(19, uxVar, arrayList3), new gh.i2(uxVar, str4, arrayList3, arrayList4, arrayList5, 4));
                break;
            case 11:
                ArrayList arrayList6 = (ArrayList) obj;
                vx vxVar = ((ux) obj2).a;
                vxVar.B.R.e(false);
                ArrayList arrayList7 = vxVar.r;
                vxVar.A = arrayList7.size() >= arrayList6.size();
                arrayList7.clear();
                arrayList7.addAll(arrayList6);
                vxVar.l();
                break;
            case 12:
                ((ay) obj2).F((String) obj, "", true, false, false);
                break;
            case 13:
                ay ayVar = (ay) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                wy wyVar4 = ayVar.H;
                MessagesController.getInstance(wyVar4.Y0).putUsers(tL_contacts_resolvedPeer.users, false);
                int i18 = wyVar4.Y0;
                MessagesController.getInstance(i18).putChats(tL_contacts_resolvedPeer.chats, false);
                MessagesStorage.getInstance(i18).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str5 = ayVar.w;
                ayVar.w = null;
                ayVar.F(str5, "", false, false, false);
                break;
            case 14:
                hz hzVar = (hz) obj2;
                kh.z7 z7Var = (kh.z7) obj;
                hzVar.c();
                hzVar.h(z7Var);
                lz lzVar = hzVar.F;
                lzVar.h1 = z7Var;
                lzVar.j();
                break;
            case 15:
                ((hz) obj2).F.f1 = (kz) obj;
                break;
            case 16:
                ((n00) obj2).v0 = -1;
                ((Runnable) ((Pair) obj).first).run();
                break;
            case 17:
                ((org.telegram.ui.df) obj2).run((org.telegram.ui.ActionBar.o2) obj);
                break;
            case 18:
                e40 e40Var = (e40) obj2;
                Uri uri = (Uri) obj;
                e40Var.getClass();
                try {
                    LaunchActivity launchActivity = (LaunchActivity) e40Var.a.getParentActivity();
                    if (launchActivity == null) {
                        break;
                    } else {
                        Bundle bundle = new Bundle();
                        if (uri != null) {
                            bundle.putParcelable("photoUri", uri);
                        }
                        org.telegram.ui.lp0 lp0Var = new org.telegram.ui.lp0(bundle);
                        lp0Var.e = false;
                        lp0Var.f = false;
                        lp0Var.c = e40Var;
                        launchActivity.p0(lp0Var);
                        break;
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                    e40Var.s(false, ImageLoader.loadBitmap(null, uri, 800.0f, 800.0f, true), null);
                    return;
                }
            case 19:
                e50 e50Var = (e50) obj2;
                z40 z40Var = (z40) obj;
                f50 f50Var = e50Var.D0;
                VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
                f50Var.J = videoEditedInfo;
                videoEditedInfo.startTime = -1L;
                videoEditedInfo.endTime = -1L;
                videoEditedInfo.estimatedSize = Math.max(1L, f50Var.H);
                VideoEditedInfo videoEditedInfo2 = f50Var.J;
                videoEditedInfo2.roundVideo = true;
                videoEditedInfo2.file = f50Var.D;
                videoEditedInfo2.encryptedFile = f50Var.E;
                videoEditedInfo2.key = f50Var.F;
                videoEditedInfo2.iv = f50Var.G;
                videoEditedInfo2.framerate = 25;
                videoEditedInfo2.originalWidth = 360;
                videoEditedInfo2.resultWidth = 360;
                videoEditedInfo2.originalHeight = 360;
                videoEditedInfo2.resultHeight = 360;
                videoEditedInfo2.originalPath = e50Var.a.getAbsolutePath();
                VideoEditedInfo videoEditedInfo3 = f50Var.J;
                videoEditedInfo3.notReadyYet = true;
                videoEditedInfo3.thumb = f50Var.V0;
                videoEditedInfo3.estimatedDuration = f50Var.b0;
                f50Var.V0 = null;
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, e50Var.a.getAbsolutePath(), 0, true, 0, 0, 0L);
                if (z40Var != null) {
                    photoEntry.ttl = z40Var.c;
                    photoEntry.effectId = z40Var.d;
                }
                f50Var.c.r(photoEntry, f50Var.J, z40Var == null || z40Var.a, z40Var != null ? z40Var.b : 0, 0, false, z40Var != null ? z40Var.e : 0L);
                break;
            case 20:
                Bitmap bitmap = (Bitmap) obj;
                e50 e50Var2 = (e50) ((m.i3) obj2).b;
                if ((bitmap == null || bitmap.getPixel(0, 0) == 0) && e50Var2.w0.size() > 1) {
                    ArrayList arrayList8 = e50Var2.w0;
                    arrayList8.add((Bitmap) j3.r0.j(1, arrayList8));
                    break;
                } else {
                    e50Var2.w0.add(bitmap);
                    break;
                }
                break;
            case 21:
                a60 a60Var2 = (a60) obj2;
                TLObject tLObject4 = (TLObject) obj;
                a60Var2.getClass();
                if (tLObject4 instanceof Vector) {
                    Vector vector = (Vector) tLObject4;
                    if (!vector.objects.isEmpty()) {
                        a60Var2.c.put(Long.valueOf(a60Var2.b.admin_id), (TLRPC.User) vector.objects.get(0));
                        a60Var2.P.l();
                        break;
                    }
                }
                break;
            case 22:
                u50 u50Var = (u50) obj2;
                if (((TLRPC.TL_error) obj) == null && (bbVar = (a60Var = u50Var.a.c).f0) != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = a60Var.b;
                    org.telegram.ui.pb pbVar = bbVar.a;
                    ArrayList arrayList9 = pbVar.o0;
                    int size = arrayList9.size();
                    int i19 = pbVar.E.h;
                    TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = new TLRPC.TL_channelAdminLogEvent();
                    TLRPC.TL_channelAdminLogEventActionExportedInviteDelete tL_channelAdminLogEventActionExportedInviteDelete = new TLRPC.TL_channelAdminLogEventActionExportedInviteDelete();
                    tL_channelAdminLogEventActionExportedInviteDelete.invite = tL_chatInviteExported;
                    tL_channelAdminLogEvent.action = tL_channelAdminLogEventActionExportedInviteDelete;
                    tL_channelAdminLogEvent.date = (int) (System.currentTimeMillis() / 1000);
                    tL_channelAdminLogEvent.user_id = pbVar.getAccountInstance().getUserConfig().clientUserId;
                    i10 = ((org.telegram.ui.ActionBar.o2) pbVar).currentAccount;
                    if (new MessageObject(i10, tL_channelAdminLogEvent, (ArrayList<MessageObject>) pbVar.n0, (HashMap<String, ArrayList<MessageObject>>) pbVar.m0, pbVar.s, pbVar.T, true).contentType >= 0) {
                        pbVar.R0();
                        int size2 = arrayList9.size() - size;
                        if (size2 > 0) {
                            pbVar.C0.N = true;
                            org.telegram.ui.lb lbVar = pbVar.E;
                            lbVar.s(lbVar.h, size2);
                            org.telegram.ui.pb.K0(pbVar);
                        }
                        pbVar.y0.remove(tL_chatInviteExported.link);
                        break;
                    }
                }
                break;
            case 23:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                ((k60) obj2).setFocusable(true);
                editTextBoldCursor.requestFocus();
                AndroidUtilities.runOnUIThread(new p1(i14, editTextBoldCursor));
                break;
            case 24:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", ((TLRPC.ChatFull) obj2).guard_bot_id);
                ((org.telegram.ui.vo) obj).presentFragment(new ProfileActivity(bundle2, null));
                break;
            case 25:
                g80 g80Var = (g80) obj2;
                if (g80Var.K0 == ((m80) obj)) {
                    g80Var.performLongClick();
                    g80Var.K0 = null;
                    g80Var.I0.d(true);
                    break;
                }
                break;
            case 26:
                ((i80) obj2).l((p80) obj, false);
                break;
            case 27:
                k90 k90Var = (k90) obj2;
                if (!((boolean[]) obj)[0] && (u5Var = k90Var.Q) != null) {
                    u5Var.run();
                }
                k90Var.Q = null;
                break;
            case 28:
                EditTextBoldCursor editTextBoldCursor2 = (EditTextBoldCursor) obj;
                ((m90) obj2).setFocusable(true);
                editTextBoldCursor2.requestFocus();
                AndroidUtilities.runOnUIThread(new p1(i13, editTextBoldCursor2));
                break;
            default:
                i8.i0 i0Var = (i8.i0) obj2;
                Runnable runnable = (Runnable) obj;
                i0Var.getClass();
                runnable.run();
                i0Var.a.remove(runnable);
                break;
        }
    }
}
