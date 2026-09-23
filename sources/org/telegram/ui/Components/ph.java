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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class ph implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ph(int i10, Object obj, Object obj2) {
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
                ((wi) this.b).containerView.removeView((ci.e4) this.c);
                break;
            case 1:
                wi wiVar = (wi) this.b;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.c;
                wiVar.dismiss(true);
                if (n2Var != null) {
                    n2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    break;
                }
                break;
            case 2:
                wi wiVar2 = (wi) this.b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = ((pi) this.c).c;
                tL_attachMenuBot.side_menu_disclaimer_needed = false;
                tL_attachMenuBot.inactive = false;
                wiVar2.N1(tL_attachMenuBot.bot_id, null, false, true);
                MediaDataController.getInstance(wiVar2.J1).updateAttachMenuBotsInCache();
                break;
            case 3:
                wi wiVar3 = (wi) this.b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = (TLRPC.TL_attachMenuBot) this.c;
                MediaDataController.getInstance(wiVar3.J1).loadAttachMenuBots(false, true);
                if (wiVar3.y0 == wiVar3.x0.get(tL_attachMenuBot2.bot_id)) {
                    wiVar3.Q1(wiVar3.j0);
                    break;
                }
                break;
            case 4:
                hj hjVar = (hj) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                hjVar.H = false;
                hjVar.I = arrayList;
                hjVar.P();
                break;
            case 5:
                hj hjVar2 = (hj) this.c;
                ((wi) this.b).Z0();
                hjVar2.L();
                hjVar2.b.X1(hjVar2, 0);
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new ph(7, (yj) this.b, ((xj) this.c).run()));
                break;
            case 7:
                ((yj) this.b).setStatus((CharSequence) this.c);
                break;
            case 8:
                ok okVar = (ok) this.b;
                String str = (String) this.c;
                okVar.getClass();
                ArrayList arrayList2 = new ArrayList(okVar.X.v.c);
                if (okVar.X.v.d.isEmpty()) {
                    arrayList2.addAll(0, okVar.X.v.e);
                }
                Utilities.searchQueue.postRunnable(new ai.s4(okVar, str, !okVar.R.isEmpty(), arrayList2, 17));
                break;
            case 9:
                ok okVar2 = (ok) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                pk pkVar = okVar2.X;
                boolean z10 = pkVar.b0;
                ek ekVar = pkVar.r;
                if (z10) {
                    s4.h0 adapter = ekVar.getAdapter();
                    ok okVar3 = pkVar.y;
                    if (adapter != okVar3) {
                        ekVar.setAdapter(okVar3);
                    }
                }
                okVar2.s = arrayList3;
                okVar2.l();
                break;
            case 10:
                hl hlVar = (hl) this.b;
                float[] fArr = (float[]) this.c;
                hlVar.getClass();
                hlVar.b0(fArr[0], fArr[1]);
                break;
            case 11:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.b;
                oi oiVar = (oi) this.c;
                boolean z11 = ChatAttachAlertPhotoLayout.q1;
                int currentItemTop = oiVar.getCurrentItemTop();
                int listTopPadding = oiVar.getListTopPadding();
                ul ulVar = chatAttachAlertPhotoLayout.E;
                if (currentItemTop > AndroidUtilities.dp(8.0f)) {
                    listTopPadding -= currentItemTop;
                }
                ulVar.scrollBy(0, listTopPadding);
                break;
            case 12:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = (ChatAttachAlertPhotoLayout) this.b;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.c;
                em emVar = chatAttachAlertPhotoLayout2.P;
                if (emVar != null) {
                    emVar.setLayoutParams(layoutParams);
                    break;
                }
                break;
            case 13:
                rm rmVar = (rm) this.b;
                oi oiVar2 = (oi) this.c;
                int currentItemTop2 = oiVar2.getCurrentItemTop();
                int listTopPadding2 = oiVar2.getListTopPadding();
                ai.w0 w0Var = rmVar.r;
                if (currentItemTop2 > AndroidUtilities.dp(7.0f)) {
                    listTopPadding2 -= currentItemTop2;
                }
                w0Var.scrollBy(0, listTopPadding2);
                break;
            case 14:
                io ioVar = (io) this.b;
                hg.h hVar = (hg.h) this.c;
                ko.a(ioVar.c);
                hVar.run();
                break;
            case 15:
                ((ip) this.b).b.x((List) this.c);
                break;
            case 16:
                ((jp) this.b).b.x((List) this.c);
                break;
            case 17:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.b;
                Context context = (Context) this.c;
                f3Var.dismiss();
                nf.f.s(context, "https://t.me/BotFather?start=deletebot");
                break;
            case 18:
                nr nrVar = (nr) this.b;
                ci.d dVar = (ci.d) this.c;
                nrVar.getClass();
                dVar.setLoading(false);
                nrVar.dismiss();
                break;
            case 19:
                nr nrVar2 = (nr) this.b;
                TLObject tLObject = (TLObject) this.c;
                if (tLObject != null && (tLObject instanceof TL_phone.groupCallStreamRtmpUrl)) {
                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject;
                    nrVar2.b0 = groupcallstreamrtmpurl.url;
                    nrVar2.c0 = groupcallstreamrtmpurl.key;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(nrVar2.c0);
                    nrVar2.d0 = spannableStringBuilder;
                    n01 n01Var = new n01();
                    n01Var.a |= 256;
                    n01Var.b = 0;
                    n01Var.c = spannableStringBuilder.length();
                    nrVar2.d0.setSpan(new o01(n01Var, 0), 0, nrVar2.d0.length(), 0);
                    nrVar2.e0.N(false);
                    break;
                }
                break;
            case 20:
                rs rsVar = (rs) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                ns nsVar = rsVar.b;
                ArrayList arrayList4 = rsVar.h;
                int i12 = rsVar.a;
                if (tLObject2 instanceof TL_bots.popularAppBots) {
                    TL_bots.popularAppBots popularappbots = (TL_bots.popularAppBots) tLObject2;
                    MessagesController.getInstance(i12).putUsers(popularappbots.users, false);
                    MessagesStorage.getInstance(i12).putUsersAndChats(popularappbots.users, null, false, true);
                    arrayList4.addAll(popularappbots.users);
                    String str2 = popularappbots.next_offset;
                    rsVar.g = str2;
                    rsVar.e = str2 == null;
                    long currentTimeMillis = System.currentTimeMillis();
                    rsVar.f = currentTimeMillis;
                    if (!rsVar.i) {
                        rsVar.i = true;
                        String str3 = rsVar.g;
                        if (str3 == null) {
                            str3 = "";
                        }
                        String str4 = str3;
                        ArrayList arrayList5 = new ArrayList();
                        for (int i13 = 0; i13 < arrayList4.size(); i13 = com.google.android.gms.internal.vision.e2.g(((TLRPC.User) arrayList4.get(i13)).id, arrayList5, i13, 1)) {
                        }
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i12);
                        messagesStorage.getStorageQueue().postRunnable(new org.telegram.messenger.voip.f(rsVar, messagesStorage, arrayList5, currentTimeMillis, str4, 3));
                    }
                    rsVar.c = false;
                    nsVar.run();
                    break;
                } else {
                    rsVar.g = null;
                    rsVar.e = true;
                    rsVar.c = false;
                    nsVar.run();
                    break;
                }
            case 21:
                qt qtVar = (qt) this.b;
                Bitmap decodeFile = BitmapFactory.decodeFile((String) this.c);
                Canvas canvas = new Canvas(Bitmap.createBitmap(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f), Bitmap.Config.ARGB_8888));
                Paint paint = new Paint(3);
                canvas.translate(r3.getWidth() / 2.0f, r3.getHeight() / 2.0f);
                float max = Math.max(r3.getWidth() / decodeFile.getWidth(), r3.getHeight() / decodeFile.getHeight());
                canvas.scale(max, max);
                canvas.drawBitmap(decodeFile, (-decodeFile.getWidth()) / 2.0f, (-decodeFile.getHeight()) / 2.0f, paint);
                AndroidUtilities.runOnUIThread(new ph(22, qtVar, decodeFile));
                break;
            case 22:
                ((qt) this.b).setImage((Bitmap) this.c);
                break;
            case 23:
                ((EditTextBoldCursor) this.b).hintLayout.draw((Canvas) this.c);
                break;
            case 24:
                cv cvVar = (cv) this.b;
                TLRPC.EmojiStatus emojiStatus = (TLRPC.EmojiStatus) this.c;
                i10 = ((org.telegram.ui.ActionBar.f3) cvVar.a).currentAccount;
                MessagesController.getInstance(i10).updateEmojiStatus(emojiStatus);
                break;
            case 25:
                MessagesController.getInstance(((ex) this.b).a.c1).updateEmojiStatus((TLRPC.EmojiStatus) this.c);
                break;
            case 26:
                ex exVar = (ex) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                lz lzVar = exVar.a;
                if (tLObject3 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject3;
                    MediaDataController.getInstance(lzVar.c1).putStickerSet(tL_messages_stickerSet);
                    MediaDataController.getInstance(lzVar.c1).replaceStickerSet(tL_messages_stickerSet);
                    break;
                }
                break;
            case 27:
                cy cyVar = (cy) this.b;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) this.c;
                cyVar.s.f = true;
                lz lzVar2 = cyVar.E;
                if (!lzVar2.p1.contains(Long.valueOf(tL_messages_stickerSet2.set.id))) {
                    lzVar2.p1.add(Long.valueOf(tL_messages_stickerSet2.set.id));
                }
                cyVar.a(true);
                break;
            case 28:
                final jy jyVar = (jy) this.b;
                final String str5 = (String) this.c;
                String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                lz lzVar3 = jyVar.a.F;
                if (!Arrays.equals(lzVar3.W0, currentKeyboardLanguage)) {
                    MediaDataController.getInstance(lzVar3.c1).fetchNewEmojiKeywords(currentKeyboardLanguage);
                }
                lzVar3.W0 = currentKeyboardLanguage;
                ArrayList arrayList6 = new ArrayList();
                final ArrayList arrayList7 = new ArrayList();
                final ArrayList arrayList8 = new ArrayList();
                Utilities.Callback callback = new Utilities.Callback() { // from class: org.telegram.ui.Components.iy
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList9;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList10;
                        Runnable runnable = (Runnable) obj;
                        switch (i11) {
                            case 0:
                                jy jyVar2 = jyVar;
                                MediaDataController.getInstance(jyVar2.a.F.c1).searchStickerSets(true, str5, new ai.c5(jyVar2, arrayList8, runnable, 7));
                                break;
                            default:
                                lz lzVar4 = jyVar.a.F;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(lzVar4.c1).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str5 + "").toLowerCase());
                                    int i14 = lzVar4.c1;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i14).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList11 = arrayList8;
                                    if (stickerSets != null) {
                                        for (int i15 = 0; i15 < stickerSets.size(); i15++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i15);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList10 = tL_messages_stickerSet3.documents) != null && !arrayList10.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.z0.w(" ", translitSafe, translitSafe2)) {
                                                    arrayList11.add(new dy(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
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
                                                if (translitSafe3.startsWith(translitSafe) || org.telegram.messenger.z0.w(" ", translitSafe, translitSafe3)) {
                                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                                        arrayList9 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                                        TLRPC.TL_messages_stickerSet stickerSet3 = MediaDataController.getInstance(i14).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                                                        arrayList9 = stickerSet3 != null ? stickerSet3.documents : null;
                                                    } else {
                                                        arrayList9 = stickerSetCovered.covers;
                                                    }
                                                    if (arrayList9 != null && !arrayList9.isEmpty()) {
                                                        arrayList11.add(new dy(stickerSetCovered, arrayList9));
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
                org.telegram.ui.oc ocVar = new org.telegram.ui.oc(23, jyVar, str5);
                final char c11 = c10 == true ? 1 : 0;
                Utilities.doCallbacks(callback, ocVar, new Utilities.Callback() { // from class: org.telegram.ui.Components.iy
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        TLRPC.StickerSet stickerSet;
                        ArrayList<TLRPC.Document> arrayList9;
                        TLRPC.StickerSet stickerSet2;
                        ArrayList<TLRPC.Document> arrayList10;
                        Runnable runnable = (Runnable) obj;
                        switch (c11) {
                            case 0:
                                jy jyVar2 = jyVar;
                                MediaDataController.getInstance(jyVar2.a.F.c1).searchStickerSets(true, str5, new ai.c5(jyVar2, arrayList7, runnable, 7));
                                break;
                            default:
                                lz lzVar4 = jyVar.a.F;
                                if (SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(lzVar4.c1).isPremium()) {
                                    String translitSafe = AndroidUtilities.translitSafe((str5 + "").toLowerCase());
                                    int i14 = lzVar4.c1;
                                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i14).getStickerSets(5);
                                    HashSet hashSet = new HashSet();
                                    ArrayList arrayList11 = arrayList7;
                                    if (stickerSets != null) {
                                        for (int i15 = 0; i15 < stickerSets.size(); i15++) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = stickerSets.get(i15);
                                            if (tL_messages_stickerSet3 != null && (stickerSet2 = tL_messages_stickerSet3.set) != null && stickerSet2.title != null && (arrayList10 = tL_messages_stickerSet3.documents) != null && !arrayList10.isEmpty() && !hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.id))) {
                                                String translitSafe2 = AndroidUtilities.translitSafe(tL_messages_stickerSet3.set.title.toLowerCase());
                                                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.z0.w(" ", translitSafe, translitSafe2)) {
                                                    arrayList11.add(new dy(tL_messages_stickerSet3, tL_messages_stickerSet3.documents));
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
                                                if (translitSafe3.startsWith(translitSafe) || org.telegram.messenger.z0.w(" ", translitSafe, translitSafe3)) {
                                                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                                                        arrayList9 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                                                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                                                        TLRPC.TL_messages_stickerSet stickerSet3 = MediaDataController.getInstance(i14).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                                                        arrayList9 = stickerSet3 != null ? stickerSet3.documents : null;
                                                    } else {
                                                        arrayList9 = stickerSetCovered.covers;
                                                    }
                                                    if (arrayList9 != null && !arrayList9.isEmpty()) {
                                                        arrayList11.add(new dy(stickerSetCovered, arrayList9));
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
                }, new org.telegram.ui.oc(24, jyVar, arrayList6), new org.telegram.ui.sa(jyVar, str5, arrayList6, arrayList7, arrayList8));
                break;
            default:
                jy jyVar2 = (jy) this.b;
                ArrayList arrayList9 = (ArrayList) this.c;
                ky kyVar = jyVar2.a;
                kyVar.F.V.e(false);
                ArrayList arrayList10 = kyVar.r;
                kyVar.E = arrayList10.size() >= arrayList9.size();
                arrayList10.clear();
                arrayList10.addAll(arrayList9);
                kyVar.l();
                break;
        }
    }

    public /* synthetic */ ph(hj hjVar, wi wiVar) {
        this.a = 5;
        this.c = hjVar;
        this.b = wiVar;
    }
}
