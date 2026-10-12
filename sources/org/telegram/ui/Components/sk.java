package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Pair;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class sk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sk(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        int i10;
        int i11 = this.a;
        String str = "";
        char c10 = 1;
        final int i12 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i11) {
            case 0:
                vi viVar = ((dl) obj2).b;
                viVar.dismiss();
                viVar.f0.presentFragment(org.telegram.ui.fo.W9(((TLRPC.User) obj).id));
                break;
            case 1:
                org.telegram.messenger.q.r(R.string.WalletAddressCopiedBulletin, new zc((dl) obj2, (org.telegram.ui.ActionBar.c6) obj), R.raw.copy, 36);
                break;
            case 2:
                ul ulVar = (ul) obj2;
                float[] fArr = (float[]) obj;
                ulVar.getClass();
                ulVar.e0(fArr[0], fArr[1]);
                break;
            case 3:
                ni niVar = (ni) obj;
                boolean z11 = ChatAttachAlertPhotoLayout.q1;
                int currentItemTop = niVar.getCurrentItemTop();
                int listTopPadding = niVar.getListTopPadding();
                hm hmVar = ((ChatAttachAlertPhotoLayout) obj2).E;
                if (currentItemTop > AndroidUtilities.dp(8.0f)) {
                    listTopPadding -= currentItemTop;
                }
                hmVar.scrollBy(0, listTopPadding);
                break;
            case 4:
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) obj;
                rm rmVar = ((ChatAttachAlertPhotoLayout) obj2).P;
                if (rmVar != null) {
                    rmVar.setLayoutParams(layoutParams);
                    break;
                }
                break;
            case 5:
                ni niVar2 = (ni) obj;
                int currentItemTop2 = niVar2.getCurrentItemTop();
                int listTopPadding2 = niVar2.getListTopPadding();
                bi.o0 o0Var = ((en) obj2).r;
                if (currentItemTop2 > AndroidUtilities.dp(7.0f)) {
                    listTopPadding2 -= currentItemTop2;
                }
                o0Var.scrollBy(0, listTopPadding2);
                break;
            case 6:
                wo.a(((uo) obj2).c);
                ((ig.g) obj).run();
                break;
            case 7:
                ((up) obj2).b.z((List) obj);
                break;
            case 8:
                ((vp) obj2).b.z((List) obj);
                break;
            case 9:
                ((org.telegram.ui.ActionBar.e3) obj2).dismiss();
                pf.d.s((Context) obj, "https://t.me/BotFather?start=deletebot");
                break;
            case 10:
                org.telegram.ui.Cells.j3 j3Var = (org.telegram.ui.Cells.j3) obj2;
                TreeSet treeSet = (TreeSet) obj;
                String charSequence = j3Var.getText().toString();
                if (!qr.a(charSequence, "bot") && qr.c(charSequence, treeSet) == null) {
                    str = "bot";
                }
                org.telegram.ui.Cells.h3 h3Var = j3Var.b;
                h3Var.setRightText(str);
                h3Var.setPadding(0, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(TextUtils.isEmpty(str) ? 21.0f : 63.0f), AndroidUtilities.dp(15.0f));
                break;
            case 11:
                as asVar = (as) obj2;
                asVar.getClass();
                ((di.d) obj).setLoading(false);
                asVar.dismiss();
                break;
            case 12:
                as asVar2 = (as) obj2;
                TLObject tLObject = (TLObject) obj;
                if (tLObject != null && (tLObject instanceof TL_phone.groupCallStreamRtmpUrl)) {
                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject;
                    asVar2.b0 = groupcallstreamrtmpurl.url;
                    asVar2.c0 = groupcallstreamrtmpurl.key;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(asVar2.c0);
                    asVar2.d0 = spannableStringBuilder;
                    p11 p11Var = new p11();
                    p11Var.a |= 256;
                    p11Var.b = 0;
                    p11Var.c = spannableStringBuilder.length();
                    asVar2.d0.setSpan(new q11(p11Var, 0), 0, asVar2.d0.length(), 0);
                    asVar2.e0.N(false);
                    break;
                }
                break;
            case 13:
                dt dtVar = (dt) obj2;
                TLObject tLObject2 = (TLObject) obj;
                zs zsVar = dtVar.b;
                ArrayList arrayList = dtVar.h;
                int i13 = dtVar.a;
                if (tLObject2 instanceof TL_bots.popularAppBots) {
                    TL_bots.popularAppBots popularappbots = (TL_bots.popularAppBots) tLObject2;
                    MessagesController.getInstance(i13).putUsers(popularappbots.users, false);
                    MessagesStorage.getInstance(i13).putUsersAndChats(popularappbots.users, null, false, true);
                    arrayList.addAll(popularappbots.users);
                    String str2 = popularappbots.next_offset;
                    dtVar.g = str2;
                    dtVar.e = str2 == null;
                    long currentTimeMillis = System.currentTimeMillis();
                    dtVar.f = currentTimeMillis;
                    if (dtVar.i) {
                        z10 = false;
                    } else {
                        dtVar.i = true;
                        String str3 = dtVar.g;
                        String str4 = str3 == null ? "" : str3;
                        ArrayList arrayList2 = new ArrayList();
                        for (int i14 = 0; i14 < arrayList.size(); i14 = com.google.android.gms.internal.play_billing.k3.h(((TLRPC.User) arrayList.get(i14)).id, arrayList2, i14, 1)) {
                        }
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i13);
                        messagesStorage.getStorageQueue().postRunnable(new org.telegram.messenger.voip.f(dtVar, messagesStorage, arrayList2, currentTimeMillis, str4, 3));
                        z10 = false;
                    }
                    dtVar.c = z10;
                    zsVar.run();
                    break;
                } else {
                    dtVar.g = null;
                    dtVar.e = true;
                    dtVar.c = false;
                    zsVar.run();
                    break;
                }
            case 14:
                Bitmap decodeFile = BitmapFactory.decodeFile((String) obj);
                Canvas canvas = new Canvas(Bitmap.createBitmap(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f), Bitmap.Config.ARGB_8888));
                Paint paint = new Paint(3);
                canvas.translate(r2.getWidth() / 2.0f, r2.getHeight() / 2.0f);
                float max = Math.max(r2.getWidth() / decodeFile.getWidth(), r2.getHeight() / decodeFile.getHeight());
                canvas.scale(max, max);
                canvas.drawBitmap(decodeFile, (-decodeFile.getWidth()) / 2.0f, (-decodeFile.getHeight()) / 2.0f, paint);
                AndroidUtilities.runOnUIThread(new sk(15, (cu) obj2, decodeFile));
                break;
            case 15:
                ((cu) obj2).setImage((Bitmap) obj);
                break;
            case 16:
                ((EditTextBoldCursor) obj2).hintLayout.draw((Canvas) obj);
                break;
            case 17:
                i10 = ((org.telegram.ui.ActionBar.e3) ((nv) obj2).a).currentAccount;
                MessagesController.getInstance(i10).updateEmojiStatus((TLRPC.EmojiStatus) obj);
                break;
            case 18:
                MessagesController.getInstance(((px) obj2).a.c1).updateEmojiStatus((TLRPC.EmojiStatus) obj);
                break;
            case 19:
                TLObject tLObject3 = (TLObject) obj;
                wz wzVar = ((px) obj2).a;
                if (tLObject3 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject3;
                    MediaDataController.getInstance(wzVar.c1).putStickerSet(tL_messages_stickerSet);
                    MediaDataController.getInstance(wzVar.c1).replaceStickerSet(tL_messages_stickerSet);
                    break;
                }
                break;
            case 20:
                ny nyVar = (ny) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                nyVar.s.f = true;
                wz wzVar2 = nyVar.E;
                if (!wzVar2.p1.contains(Long.valueOf(tL_messages_stickerSet2.set.id))) {
                    wzVar2.p1.add(Long.valueOf(tL_messages_stickerSet2.set.id));
                }
                nyVar.a(true);
                break;
            case 21:
                final uy uyVar = (uy) obj2;
                final String str5 = (String) obj;
                String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                wz wzVar3 = uyVar.a.F;
                if (!Arrays.equals(wzVar3.W0, currentKeyboardLanguage)) {
                    MediaDataController.getInstance(wzVar3.c1).fetchNewEmojiKeywords(currentKeyboardLanguage);
                }
                wzVar3.W0 = currentKeyboardLanguage;
                ArrayList arrayList3 = new ArrayList();
                final ArrayList arrayList4 = new ArrayList();
                final ArrayList arrayList5 = new ArrayList();
                Utilities.Callback callback = new Utilities.Callback() { // from class: org.telegram.ui.Components.ty
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj3) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList6;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList7;
                        Runnable runnable = (Runnable) obj3;
                        switch (i12) {
                            case 0:
                                uy uyVar2 = uyVar;
                                MediaDataController.getInstance(uyVar2.a.F.c1).searchStickerSets(true, str5, new bi.q4(uyVar2, arrayList5, runnable, 7));
                                break;
                            default:
                                wz wzVar4 = uyVar.a.F;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(wzVar4.c1).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str5 + "").toLowerCase());
                                    int i15 = wzVar4.c1;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i15).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList8 = arrayList5;
                                    if (stickerSets != null) {
                                        for (int i16 = 0; i16 < stickerSets.size(); i16++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i16);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList7 = tL_messages_stickerSet3.documents) != null && !arrayList7.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.yh.v(" ", translitSafe, translitSafe2)) {
                                                    arrayList8.add(new oy(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i15).getFeaturedEmojiSets();
                                    if (featuredEmojiSets != null) {
                                        for (int i17 = 0; i17 < featuredEmojiSets.size(); i17++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i17);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.id))) {
                                                String translitSafe3 = AndroidUtilities.translitSafe(stickerSetCovered.set.title.toLowerCase());
                                                if (translitSafe3.startsWith(translitSafe) || org.telegram.messenger.yh.v(" ", translitSafe, translitSafe3)) {
                                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                                        arrayList6 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                                        TLRPC.TL_messages_stickerSet stickerSet3 = MediaDataController.getInstance(i15).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                                                        arrayList6 = stickerSet3 != null ? stickerSet3.documents : null;
                                                    } else {
                                                        arrayList6 = stickerSetCovered.covers;
                                                    }
                                                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                                                        arrayList8.add(new oy(stickerSetCovered, arrayList6));
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
                };
                org.telegram.ui.vc vcVar = new org.telegram.ui.vc(23, uyVar, str5);
                final char c11 = c10 == true ? 1 : 0;
                Utilities.doCallbacks(callback, vcVar, new Utilities.Callback() { // from class: org.telegram.ui.Components.ty
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj3) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList6;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList7;
                        Runnable runnable = (Runnable) obj3;
                        switch (c11) {
                            case 0:
                                uy uyVar2 = uyVar;
                                MediaDataController.getInstance(uyVar2.a.F.c1).searchStickerSets(true, str5, new bi.q4(uyVar2, arrayList4, runnable, 7));
                                break;
                            default:
                                wz wzVar4 = uyVar.a.F;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(wzVar4.c1).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str5 + "").toLowerCase());
                                    int i15 = wzVar4.c1;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i15).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList8 = arrayList4;
                                    if (stickerSets != null) {
                                        for (int i16 = 0; i16 < stickerSets.size(); i16++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i16);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList7 = tL_messages_stickerSet3.documents) != null && !arrayList7.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.yh.v(" ", translitSafe, translitSafe2)) {
                                                    arrayList8.add(new oy(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i15).getFeaturedEmojiSets();
                                    if (featuredEmojiSets != null) {
                                        for (int i17 = 0; i17 < featuredEmojiSets.size(); i17++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i17);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.id))) {
                                                String translitSafe3 = AndroidUtilities.translitSafe(stickerSetCovered.set.title.toLowerCase());
                                                if (translitSafe3.startsWith(translitSafe) || org.telegram.messenger.yh.v(" ", translitSafe, translitSafe3)) {
                                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                                        arrayList6 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                                        TLRPC.TL_messages_stickerSet stickerSet3 = MediaDataController.getInstance(i15).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                                                        arrayList6 = stickerSet3 != null ? stickerSet3.documents : null;
                                                    } else {
                                                        arrayList6 = stickerSetCovered.covers;
                                                    }
                                                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                                                        arrayList8.add(new oy(stickerSetCovered, arrayList6));
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
                }, new org.telegram.ui.vc(24, uyVar, arrayList3), new org.telegram.ui.xa(uyVar, str5, arrayList3, arrayList4, arrayList5));
                break;
            case 22:
                ArrayList arrayList6 = (ArrayList) obj;
                vy vyVar = ((uy) obj2).a;
                vyVar.F.V.e(false);
                ArrayList arrayList7 = vyVar.r;
                vyVar.E = arrayList7.size() >= arrayList6.size();
                arrayList7.clear();
                arrayList7.addAll(arrayList6);
                vyVar.l();
                break;
            case 23:
                ((az) obj2).F((String) obj, "", true, false, false);
                break;
            case 24:
                az azVar = (az) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                wz wzVar4 = azVar.L;
                MessagesController.getInstance(wzVar4.c1).putUsers(tL_contacts_resolvedPeer.users, false);
                int i15 = wzVar4.c1;
                MessagesController.getInstance(i15).putChats(tL_contacts_resolvedPeer.chats, false);
                MessagesStorage.getInstance(i15).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str6 = azVar.w;
                azVar.w = null;
                azVar.F(str6, "", false, false, false);
                break;
            case 25:
                h00 h00Var = (h00) obj2;
                di.j8 j8Var = (di.j8) obj;
                h00Var.c();
                h00Var.h(j8Var);
                l00 l00Var = h00Var.J;
                l00Var.h1 = j8Var;
                l00Var.j();
                break;
            case 26:
                ((h00) obj2).J.f1 = (k00) obj;
                break;
            case 27:
                ((o10) obj2).z0 = -1;
                ((Runnable) ((Pair) obj).first).run();
                break;
            case 28:
                ((org.telegram.ui.vc) obj2).run((org.telegram.ui.ActionBar.m2) obj);
                break;
            default:
                i50 i50Var = (i50) obj2;
                Uri uri = (Uri) obj;
                i50Var.getClass();
                try {
                    LaunchActivity launchActivity = (LaunchActivity) i50Var.a.getParentActivity();
                    if (launchActivity == null) {
                        break;
                    } else {
                        Bundle bundle = new Bundle();
                        if (uri != null) {
                            bundle.putParcelable("photoUri", uri);
                        }
                        org.telegram.ui.tq0 tq0Var = new org.telegram.ui.tq0(bundle);
                        tq0Var.e = false;
                        tq0Var.f = false;
                        tq0Var.c = i50Var;
                        launchActivity.p0(tq0Var);
                        break;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                    i50Var.r(false, ImageLoader.loadBitmap(null, uri, 800.0f, 800.0f, true), null);
                }
        }
    }
}
