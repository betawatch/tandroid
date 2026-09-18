package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ oh(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        char c10 = 1;
        final int i11 = 0;
        switch (this.a) {
            case 0:
                ((vi) this.b).containerView.removeView((ci.f4) this.c);
                break;
            case 1:
                vi viVar = (vi) this.b;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.c;
                viVar.dismiss(true);
                if (o2Var != null) {
                    o2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    break;
                }
                break;
            case 2:
                vi viVar2 = (vi) this.b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = ((oi) this.c).c;
                tL_attachMenuBot.side_menu_disclaimer_needed = false;
                tL_attachMenuBot.inactive = false;
                viVar2.N1(tL_attachMenuBot.bot_id, null, false, true);
                MediaDataController.getInstance(viVar2.J1).updateAttachMenuBotsInCache();
                break;
            case 3:
                vi viVar3 = (vi) this.b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = (TLRPC.TL_attachMenuBot) this.c;
                MediaDataController.getInstance(viVar3.J1).loadAttachMenuBots(false, true);
                if (viVar3.y0 == viVar3.x0.get(tL_attachMenuBot2.bot_id)) {
                    viVar3.Q1(viVar3.j0);
                    break;
                }
                break;
            case 4:
                gj gjVar = (gj) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                gjVar.H = false;
                gjVar.I = arrayList;
                gjVar.P();
                break;
            case 5:
                gj gjVar2 = (gj) this.c;
                ((vi) this.b).Z0();
                gjVar2.L();
                gjVar2.b.X1(gjVar2, 0);
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new oh(7, (xj) this.b, ((wj) this.c).run()));
                break;
            case 7:
                ((xj) this.b).setStatus((CharSequence) this.c);
                break;
            case 8:
                nk nkVar = (nk) this.b;
                String str = (String) this.c;
                nkVar.getClass();
                ArrayList arrayList2 = new ArrayList(nkVar.X.v.c);
                if (nkVar.X.v.d.isEmpty()) {
                    arrayList2.addAll(0, nkVar.X.v.e);
                }
                Utilities.searchQueue.postRunnable(new ai.s4(nkVar, str, !nkVar.R.isEmpty(), arrayList2, 17));
                break;
            case 9:
                nk nkVar2 = (nk) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                ok okVar = nkVar2.X;
                boolean z10 = okVar.b0;
                dk dkVar = okVar.r;
                if (z10) {
                    s4.h0 adapter = dkVar.getAdapter();
                    nk nkVar3 = okVar.y;
                    if (adapter != nkVar3) {
                        dkVar.setAdapter(nkVar3);
                    }
                }
                nkVar2.s = arrayList3;
                nkVar2.l();
                break;
            case 10:
                gl glVar = (gl) this.b;
                float[] fArr = (float[]) this.c;
                glVar.getClass();
                glVar.b0(fArr[0], fArr[1]);
                break;
            case 11:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.b;
                ni niVar = (ni) this.c;
                boolean z11 = ChatAttachAlertPhotoLayout.q1;
                int currentItemTop = niVar.getCurrentItemTop();
                int listTopPadding = niVar.getListTopPadding();
                tl tlVar = chatAttachAlertPhotoLayout.E;
                if (currentItemTop > AndroidUtilities.dp(8.0f)) {
                    listTopPadding -= currentItemTop;
                }
                tlVar.scrollBy(0, listTopPadding);
                break;
            case 12:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = (ChatAttachAlertPhotoLayout) this.b;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.c;
                dm dmVar = chatAttachAlertPhotoLayout2.P;
                if (dmVar != null) {
                    dmVar.setLayoutParams(layoutParams);
                    break;
                }
                break;
            case 13:
                qm qmVar = (qm) this.b;
                ni niVar2 = (ni) this.c;
                int currentItemTop2 = niVar2.getCurrentItemTop();
                int listTopPadding2 = niVar2.getListTopPadding();
                ai.w0 w0Var = qmVar.r;
                if (currentItemTop2 > AndroidUtilities.dp(7.0f)) {
                    listTopPadding2 -= currentItemTop2;
                }
                w0Var.scrollBy(0, listTopPadding2);
                break;
            case 14:
                ho hoVar = (ho) this.b;
                hg.g gVar = (hg.g) this.c;
                jo.a(hoVar.c);
                gVar.run();
                break;
            case 15:
                ((hp) this.b).b.x((List) this.c);
                break;
            case 16:
                ((ip) this.b).b.x((List) this.c);
                break;
            case 17:
                org.telegram.ui.ActionBar.g3 g3Var = (org.telegram.ui.ActionBar.g3) this.b;
                Context context = (Context) this.c;
                g3Var.dismiss();
                nf.f.s(context, "https://t.me/BotFather?start=deletebot");
                break;
            case 18:
                mr mrVar = (mr) this.b;
                ci.d dVar = (ci.d) this.c;
                mrVar.getClass();
                dVar.setLoading(false);
                mrVar.dismiss();
                break;
            case 19:
                mr mrVar2 = (mr) this.b;
                TLObject tLObject = (TLObject) this.c;
                if (tLObject != null && (tLObject instanceof TL_phone.groupCallStreamRtmpUrl)) {
                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject;
                    mrVar2.b0 = groupcallstreamrtmpurl.url;
                    mrVar2.c0 = groupcallstreamrtmpurl.key;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(mrVar2.c0);
                    mrVar2.d0 = spannableStringBuilder;
                    p01 p01Var = new p01();
                    p01Var.a |= 256;
                    p01Var.b = 0;
                    p01Var.c = spannableStringBuilder.length();
                    mrVar2.d0.setSpan(new q01(p01Var, 0), 0, mrVar2.d0.length(), 0);
                    mrVar2.e0.N(false);
                    break;
                }
                break;
            case 20:
                qs qsVar = (qs) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                ms msVar = qsVar.b;
                ArrayList arrayList4 = qsVar.h;
                int i12 = qsVar.a;
                if (tLObject2 instanceof TL_bots.popularAppBots) {
                    TL_bots.popularAppBots popularappbots = (TL_bots.popularAppBots) tLObject2;
                    MessagesController.getInstance(i12).putUsers(popularappbots.users, false);
                    MessagesStorage.getInstance(i12).putUsersAndChats(popularappbots.users, null, false, true);
                    arrayList4.addAll(popularappbots.users);
                    String str2 = popularappbots.next_offset;
                    qsVar.g = str2;
                    qsVar.e = str2 == null;
                    long currentTimeMillis = System.currentTimeMillis();
                    qsVar.f = currentTimeMillis;
                    if (!qsVar.i) {
                        qsVar.i = true;
                        String str3 = qsVar.g;
                        if (str3 == null) {
                            str3 = "";
                        }
                        String str4 = str3;
                        ArrayList arrayList5 = new ArrayList();
                        for (int i13 = 0; i13 < arrayList4.size(); i13 = com.google.android.gms.internal.vision.e2.g(((TLRPC.User) arrayList4.get(i13)).id, arrayList5, i13, 1)) {
                        }
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i12);
                        messagesStorage.getStorageQueue().postRunnable(new org.telegram.messenger.voip.f(qsVar, messagesStorage, arrayList5, currentTimeMillis, str4, 3));
                    }
                    qsVar.c = false;
                    msVar.run();
                    break;
                } else {
                    qsVar.g = null;
                    qsVar.e = true;
                    qsVar.c = false;
                    msVar.run();
                    break;
                }
            case 21:
                pt ptVar = (pt) this.b;
                Bitmap decodeFile = BitmapFactory.decodeFile((String) this.c);
                Canvas canvas = new Canvas(Bitmap.createBitmap(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f), Bitmap.Config.ARGB_8888));
                Paint paint = new Paint(3);
                canvas.translate(r3.getWidth() / 2.0f, r3.getHeight() / 2.0f);
                float max = Math.max(r3.getWidth() / decodeFile.getWidth(), r3.getHeight() / decodeFile.getHeight());
                canvas.scale(max, max);
                canvas.drawBitmap(decodeFile, (-decodeFile.getWidth()) / 2.0f, (-decodeFile.getHeight()) / 2.0f, paint);
                AndroidUtilities.runOnUIThread(new oh(22, ptVar, decodeFile));
                break;
            case 22:
                ((pt) this.b).setImage((Bitmap) this.c);
                break;
            case 23:
                ((EditTextBoldCursor) this.b).hintLayout.draw((Canvas) this.c);
                break;
            case 24:
                bv bvVar = (bv) this.b;
                TLRPC.EmojiStatus emojiStatus = (TLRPC.EmojiStatus) this.c;
                i10 = ((org.telegram.ui.ActionBar.g3) bvVar.a).currentAccount;
                MessagesController.getInstance(i10).updateEmojiStatus(emojiStatus);
                break;
            case 25:
                MessagesController.getInstance(((dx) this.b).a.c1).updateEmojiStatus((TLRPC.EmojiStatus) this.c);
                break;
            case 26:
                dx dxVar = (dx) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                kz kzVar = dxVar.a;
                if (tLObject3 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject3;
                    MediaDataController.getInstance(kzVar.c1).putStickerSet(tL_messages_stickerSet);
                    MediaDataController.getInstance(kzVar.c1).replaceStickerSet(tL_messages_stickerSet);
                    break;
                }
                break;
            case 27:
                ay ayVar = (ay) this.b;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) this.c;
                ayVar.s.f = true;
                kz kzVar2 = ayVar.E;
                if (!kzVar2.p1.contains(Long.valueOf(tL_messages_stickerSet2.set.id))) {
                    kzVar2.p1.add(Long.valueOf(tL_messages_stickerSet2.set.id));
                }
                ayVar.a(true);
                break;
            case 28:
                final iy iyVar = (iy) this.b;
                final String str5 = (String) this.c;
                String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                kz kzVar3 = iyVar.a.F;
                if (!Arrays.equals(kzVar3.W0, currentKeyboardLanguage)) {
                    MediaDataController.getInstance(kzVar3.c1).fetchNewEmojiKeywords(currentKeyboardLanguage);
                }
                kzVar3.W0 = currentKeyboardLanguage;
                ArrayList arrayList6 = new ArrayList();
                final ArrayList arrayList7 = new ArrayList();
                final ArrayList arrayList8 = new ArrayList();
                Utilities.Callback callback = new Utilities.Callback() { // from class: org.telegram.ui.Components.hy
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList9;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList10;
                        Runnable runnable = (Runnable) obj;
                        switch (i11) {
                            case 0:
                                iy iyVar2 = iyVar;
                                MediaDataController.getInstance(iyVar2.a.F.c1).searchStickerSets(true, str5, new ai.d5(iyVar2, arrayList8, runnable, 5));
                                break;
                            default:
                                kz kzVar4 = iyVar.a.F;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(kzVar4.c1).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str5 + "").toLowerCase());
                                    int i14 = kzVar4.c1;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i14).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList11 = arrayList8;
                                    if (stickerSets != null) {
                                        for (int i15 = 0; i15 < stickerSets.size(); i15++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i15);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList10 = tL_messages_stickerSet3.documents) != null && !arrayList10.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.w1.w(" ", translitSafe, translitSafe2)) {
                                                    arrayList11.add(new cy(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i14).getFeaturedEmojiSets();
                                    if (featuredEmojiSets != null) {
                                        for (int i16 = 0; i16 < featuredEmojiSets.size(); i16++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i16);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.id))) {
                                                String translitSafe3 = AndroidUtilities.translitSafe(stickerSetCovered.set.title.toLowerCase());
                                                if (translitSafe3.startsWith(translitSafe) || org.telegram.messenger.w1.w(" ", translitSafe, translitSafe3)) {
                                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                                        arrayList9 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                                        TLRPC.TL_messages_stickerSet stickerSet3 = MediaDataController.getInstance(i14).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                                                        arrayList9 = stickerSet3 != null ? stickerSet3.documents : null;
                                                    } else {
                                                        arrayList9 = stickerSetCovered.covers;
                                                    }
                                                    if (arrayList9 != null && !arrayList9.isEmpty()) {
                                                        arrayList11.add(new cy(stickerSetCovered, arrayList9));
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
                org.telegram.ui.pf pfVar = new org.telegram.ui.pf(16, iyVar, str5);
                final char c11 = c10 == true ? 1 : 0;
                Utilities.doCallbacks(callback, pfVar, new Utilities.Callback() { // from class: org.telegram.ui.Components.hy
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList9;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList10;
                        Runnable runnable = (Runnable) obj;
                        switch (c11) {
                            case 0:
                                iy iyVar2 = iyVar;
                                MediaDataController.getInstance(iyVar2.a.F.c1).searchStickerSets(true, str5, new ai.d5(iyVar2, arrayList7, runnable, 5));
                                break;
                            default:
                                kz kzVar4 = iyVar.a.F;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(kzVar4.c1).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str5 + "").toLowerCase());
                                    int i14 = kzVar4.c1;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i14).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList11 = arrayList7;
                                    if (stickerSets != null) {
                                        for (int i15 = 0; i15 < stickerSets.size(); i15++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i15);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList10 = tL_messages_stickerSet3.documents) != null && !arrayList10.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.w1.w(" ", translitSafe, translitSafe2)) {
                                                    arrayList11.add(new cy(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
                                                    hashSet.add(Long.valueOf(tL_messages_stickerSet3.set.id));
                                                }
                                            }
                                        }
                                    }
                                    ArrayList<TLRPC.StickerSetCovered> featuredEmojiSets = MediaDataController.getInstance(i14).getFeaturedEmojiSets();
                                    if (featuredEmojiSets != null) {
                                        for (int i16 = 0; i16 < featuredEmojiSets.size(); i16++) {
                                            TLRPC.StickerSetCovered stickerSetCovered = featuredEmojiSets.get(i16);
                                            if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && stickerSet.title != null && !hashSet.contains(Long.valueOf(stickerSet.id))) {
                                                String translitSafe3 = AndroidUtilities.translitSafe(stickerSetCovered.set.title.toLowerCase());
                                                if (translitSafe3.startsWith(translitSafe) || org.telegram.messenger.w1.w(" ", translitSafe, translitSafe3)) {
                                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                                        arrayList9 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                                        TLRPC.TL_messages_stickerSet stickerSet3 = MediaDataController.getInstance(i14).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                                                        arrayList9 = stickerSet3 != null ? stickerSet3.documents : null;
                                                    } else {
                                                        arrayList9 = stickerSetCovered.covers;
                                                    }
                                                    if (arrayList9 != null && !arrayList9.isEmpty()) {
                                                        arrayList11.add(new cy(stickerSetCovered, arrayList9));
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
                }, new org.telegram.ui.pf(17, iyVar, arrayList6), new org.telegram.ui.ua(iyVar, str5, arrayList6, arrayList7, arrayList8));
                break;
            default:
                iy iyVar2 = (iy) this.b;
                ArrayList arrayList9 = (ArrayList) this.c;
                jy jyVar = iyVar2.a;
                jyVar.F.V.e(false);
                ArrayList arrayList10 = jyVar.r;
                jyVar.E = arrayList10.size() >= arrayList9.size();
                arrayList10.clear();
                arrayList10.addAll(arrayList9);
                jyVar.l();
                break;
        }
    }

    public /* synthetic */ oh(gj gjVar, vi viVar) {
        this.a = 5;
        this.c = gjVar;
        this.b = viVar;
    }
}
