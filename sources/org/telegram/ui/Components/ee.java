package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.SharedPrefsHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class ee implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ee(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        switch (this.a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.b;
                CharSequence charSequence = (CharSequence) this.c;
                int i11 = ChatActivityEnterView.m5;
                chatActivityEnterView.setFieldText(charSequence);
                chatActivityEnterView.W = null;
                break;
            case 1:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) this.b;
                qd qdVar = (qd) this.c;
                int i12 = ChatActivityEnterView.m5;
                qdVar.run();
                SharedPrefsHelper.setWebViewConfirmShown(chatActivityEnterView2.Q, chatActivityEnterView2.P2, true);
                break;
            case 2:
                ug ugVar = (ug) this.b;
                rg rgVar = (rg) this.c;
                ChatActivityEnterView chatActivityEnterView3 = ugVar.V;
                chatActivityEnterView3.i1 = chatActivityEnterView3.h1.getAudioRightMs() - chatActivityEnterView3.h1.getAudioLeftMs();
                MediaController.getInstance().trimCurrentRecording(chatActivityEnterView3.h1.getAudioLeftMs(), chatActivityEnterView3.h1.getAudioRightMs(), rgVar);
                break;
            case 3:
                ((yi) this.b).containerView.removeView((bi.x4) this.c);
                break;
            case 4:
                yi yiVar = (yi) this.b;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.c;
                yiVar.dismiss(true);
                if (p2Var != null) {
                    p2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    break;
                }
                break;
            case 5:
                yi yiVar2 = (yi) this.b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = ((ri) this.c).c;
                tL_attachMenuBot.side_menu_disclaimer_needed = false;
                tL_attachMenuBot.inactive = false;
                yiVar2.N1(tL_attachMenuBot.bot_id, null, false, true);
                MediaDataController.getInstance(yiVar2.J1).updateAttachMenuBotsInCache();
                break;
            case 6:
                yi yiVar3 = (yi) this.b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = (TLRPC.TL_attachMenuBot) this.c;
                MediaDataController.getInstance(yiVar3.J1).loadAttachMenuBots(false, true);
                if (yiVar3.y0 == yiVar3.x0.get(tL_attachMenuBot2.bot_id)) {
                    yiVar3.Q1(yiVar3.j0);
                    break;
                }
                break;
            case 7:
                jj jjVar = (jj) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                jjVar.H = false;
                jjVar.I = arrayList;
                jjVar.P();
                break;
            case 8:
                jj jjVar2 = (jj) this.b;
                ((yi) this.c).Z0();
                jjVar2.L();
                jjVar2.b.X1(jjVar2, 0);
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new ee(10, (ak) this.b, ((zj) this.c).run()));
                break;
            case 10:
                ((ak) this.b).setStatus((CharSequence) this.c);
                break;
            case 11:
                sk skVar = (sk) this.b;
                String str = (String) this.c;
                skVar.getClass();
                ArrayList arrayList2 = new ArrayList(skVar.X.v.c);
                if (skVar.X.v.d.isEmpty()) {
                    arrayList2.addAll(0, skVar.X.v.e);
                }
                Utilities.searchQueue.postRunnable(new bi.g2(skVar, str, true ^ skVar.R.isEmpty(), arrayList2));
                break;
            case 12:
                sk skVar2 = (sk) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                tk tkVar = skVar2.X;
                boolean z10 = tkVar.b0;
                ik ikVar = tkVar.r;
                if (z10) {
                    s4.h0 adapter = ikVar.getAdapter();
                    sk skVar3 = tkVar.y;
                    if (adapter != skVar3) {
                        ikVar.setAdapter(skVar3);
                    }
                }
                skVar2.s = arrayList3;
                skVar2.l();
                break;
            case 13:
                ll llVar = (ll) this.b;
                float[] fArr = (float[]) this.c;
                llVar.getClass();
                llVar.b0(fArr[0], fArr[1]);
                break;
            case 14:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.b;
                qi qiVar = (qi) this.c;
                boolean z11 = ChatAttachAlertPhotoLayout.q1;
                int currentItemTop = qiVar.getCurrentItemTop();
                int listTopPadding = qiVar.getListTopPadding();
                yl ylVar = chatAttachAlertPhotoLayout.E;
                if (currentItemTop > AndroidUtilities.dp(8.0f)) {
                    listTopPadding -= currentItemTop;
                }
                ylVar.scrollBy(0, listTopPadding);
                break;
            case 15:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = (ChatAttachAlertPhotoLayout) this.b;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.c;
                im imVar = chatAttachAlertPhotoLayout2.P;
                if (imVar != null) {
                    imVar.setLayoutParams(layoutParams);
                    break;
                }
                break;
            case 16:
                xm xmVar = (xm) this.b;
                qi qiVar2 = (qi) this.c;
                int currentItemTop2 = qiVar2.getCurrentItemTop();
                int listTopPadding2 = qiVar2.getListTopPadding();
                bi.y1 y1Var = xmVar.r;
                if (currentItemTop2 > AndroidUtilities.dp(7.0f)) {
                    listTopPadding2 -= currentItemTop2;
                }
                y1Var.scrollBy(0, listTopPadding2);
                break;
            case 17:
                mo moVar = (mo) this.b;
                gg.g gVar = (gg.g) this.c;
                oo.a(moVar.c);
                gVar.run();
                break;
            case 18:
                ((np) this.b).b.x((List) this.c);
                break;
            case 19:
                ((op) this.b).b.x((List) this.c);
                break;
            case 20:
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) this.b;
                Context context = (Context) this.c;
                h3Var.dismiss();
                nf.f.s(context, "https://t.me/BotFather?start=deletebot");
                break;
            case 21:
                sr srVar = (sr) this.b;
                bi.d dVar = (bi.d) this.c;
                srVar.getClass();
                dVar.setLoading(false);
                srVar.dismiss();
                break;
            case 22:
                sr srVar2 = (sr) this.b;
                TLObject tLObject = (TLObject) this.c;
                if (tLObject != null && (tLObject instanceof TL_phone.groupCallStreamRtmpUrl)) {
                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject;
                    srVar2.b0 = groupcallstreamrtmpurl.url;
                    srVar2.c0 = groupcallstreamrtmpurl.key;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(srVar2.c0);
                    srVar2.d0 = spannableStringBuilder;
                    b11 b11Var = new b11();
                    b11Var.a |= 256;
                    b11Var.b = 0;
                    b11Var.c = spannableStringBuilder.length();
                    srVar2.d0.setSpan(new c11(b11Var, 0), 0, srVar2.d0.length(), 0);
                    srVar2.e0.N(false);
                    break;
                }
                break;
            case 23:
                ws wsVar = (ws) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                ss ssVar = wsVar.b;
                ArrayList arrayList4 = wsVar.h;
                int i13 = wsVar.a;
                if (tLObject2 instanceof TL_bots.popularAppBots) {
                    TL_bots.popularAppBots popularappbots = (TL_bots.popularAppBots) tLObject2;
                    MessagesController.getInstance(i13).putUsers(popularappbots.users, false);
                    MessagesStorage.getInstance(i13).putUsersAndChats(popularappbots.users, null, false, true);
                    arrayList4.addAll(popularappbots.users);
                    String str2 = popularappbots.next_offset;
                    wsVar.g = str2;
                    wsVar.e = str2 == null;
                    long currentTimeMillis = System.currentTimeMillis();
                    wsVar.f = currentTimeMillis;
                    if (!wsVar.i) {
                        wsVar.i = true;
                        String str3 = wsVar.g;
                        if (str3 == null) {
                            str3 = "";
                        }
                        String str4 = str3;
                        ArrayList arrayList5 = new ArrayList();
                        for (int i14 = 0; i14 < arrayList4.size(); i14 = com.google.android.gms.internal.vision.e2.f(((TLRPC.User) arrayList4.get(i14)).id, arrayList5, i14, 1)) {
                        }
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i13);
                        messagesStorage.getStorageQueue().postRunnable(new org.telegram.messenger.voip.g(wsVar, messagesStorage, arrayList5, currentTimeMillis, str4, 3));
                    }
                    wsVar.c = false;
                    ssVar.run();
                    break;
                } else {
                    wsVar.g = null;
                    wsVar.e = true;
                    wsVar.c = false;
                    ssVar.run();
                    break;
                }
            case 24:
                tt ttVar = (tt) this.b;
                Bitmap decodeFile = BitmapFactory.decodeFile((String) this.c);
                Canvas canvas = new Canvas(Bitmap.createBitmap(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f), Bitmap.Config.ARGB_8888));
                Paint paint = new Paint(3);
                canvas.translate(r2.getWidth() / 2.0f, r2.getHeight() / 2.0f);
                float max = Math.max(r2.getWidth() / decodeFile.getWidth(), r2.getHeight() / decodeFile.getHeight());
                canvas.scale(max, max);
                canvas.drawBitmap(decodeFile, (-decodeFile.getWidth()) / 2.0f, (-decodeFile.getHeight()) / 2.0f, paint);
                AndroidUtilities.runOnUIThread(new ee(25, ttVar, decodeFile));
                break;
            case 25:
                ((tt) this.b).setImage((Bitmap) this.c);
                break;
            case 26:
                ((EditTextBoldCursor) this.b).hintLayout.draw((Canvas) this.c);
                break;
            case 27:
                fv fvVar = (fv) this.b;
                TLRPC.EmojiStatus emojiStatus = (TLRPC.EmojiStatus) this.c;
                i10 = ((org.telegram.ui.ActionBar.h3) fvVar.a).currentAccount;
                MessagesController.getInstance(i10).updateEmojiStatus(emojiStatus);
                break;
            case 28:
                MessagesController.getInstance(((ix) this.b).a.c1).updateEmojiStatus((TLRPC.EmojiStatus) this.c);
                break;
            default:
                ix ixVar = (ix) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                rz rzVar = ixVar.a;
                if (tLObject3 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject3;
                    MediaDataController.getInstance(rzVar.c1).putStickerSet(tL_messages_stickerSet);
                    MediaDataController.getInstance(rzVar.c1).replaceStickerSet(tL_messages_stickerSet);
                    break;
                }
                break;
        }
    }
}
