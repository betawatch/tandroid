package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
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

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class be implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ be(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        String str = "";
        switch (this.a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.b;
                ci.e4 e4Var = (ci.e4) this.c;
                int i11 = ChatActivityEnterView.n5;
                chatActivityEnterView.removeView(e4Var);
                break;
            case 1:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) this.b;
                CharSequence charSequence = (CharSequence) this.c;
                int i12 = ChatActivityEnterView.n5;
                chatActivityEnterView2.setFieldText(charSequence);
                chatActivityEnterView2.W = null;
                break;
            case 2:
                ChatActivityEnterView chatActivityEnterView3 = (ChatActivityEnterView) this.b;
                td tdVar = (td) this.c;
                int i13 = ChatActivityEnterView.n5;
                tdVar.run();
                SharedPrefsHelper.setWebViewConfirmShown(chatActivityEnterView3.Q, chatActivityEnterView3.Q2, true);
                break;
            case 3:
                tg tgVar = (tg) this.b;
                qg qgVar = (qg) this.c;
                ChatActivityEnterView chatActivityEnterView4 = tgVar.V;
                chatActivityEnterView4.i1 = chatActivityEnterView4.h1.getAudioRightMs() - chatActivityEnterView4.h1.getAudioLeftMs();
                MediaController.getInstance().trimCurrentRecording(chatActivityEnterView4.h1.getAudioLeftMs(), chatActivityEnterView4.h1.getAudioRightMs(), qgVar);
                break;
            case 4:
                ((xi) this.b).containerView.removeView((ci.e4) this.c);
                break;
            case 5:
                xi xiVar = (xi) this.b;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.c;
                xiVar.dismiss(true);
                if (n2Var != null) {
                    n2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    break;
                }
                break;
            case 6:
                xi xiVar2 = (xi) this.b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = (TLRPC.TL_attachMenuBot) this.c;
                MediaDataController.getInstance(xiVar2.J1).loadAttachMenuBots(false, true);
                if (xiVar2.y0 == xiVar2.x0.get(tL_attachMenuBot.bot_id)) {
                    xiVar2.P1(xiVar2.j0);
                    break;
                }
                break;
            case 7:
                xi xiVar3 = (xi) this.b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = ((qi) this.c).c;
                tL_attachMenuBot2.side_menu_disclaimer_needed = false;
                tL_attachMenuBot2.inactive = false;
                xiVar3.M1(tL_attachMenuBot2.bot_id, null, false, true);
                MediaDataController.getInstance(xiVar3.J1).updateAttachMenuBotsInCache();
                break;
            case 8:
                jj jjVar = (jj) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                jjVar.G = false;
                jjVar.H = arrayList;
                jjVar.N();
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new be(10, (ak) this.b, ((zj) this.c).run()));
                break;
            case 10:
                ((ak) this.b).setStatus((CharSequence) this.c);
                break;
            case 11:
                qk qkVar = (qk) this.b;
                String str2 = (String) this.c;
                qkVar.getClass();
                ArrayList arrayList2 = new ArrayList(qkVar.X.v.c);
                if (qkVar.X.v.d.isEmpty()) {
                    arrayList2.addAll(0, qkVar.X.v.e);
                }
                Utilities.searchQueue.postRunnable(new ai.s4(qkVar, str2, !qkVar.R.isEmpty(), arrayList2, 18));
                break;
            case 12:
                qk qkVar2 = (qk) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                rk rkVar = qkVar2.X;
                boolean z10 = rkVar.b0;
                gk gkVar = rkVar.r;
                if (z10) {
                    s4.h0 adapter = gkVar.getAdapter();
                    qk qkVar3 = rkVar.y;
                    if (adapter != qkVar3) {
                        gkVar.setAdapter(qkVar3);
                    }
                }
                qkVar2.s = arrayList3;
                qkVar2.l();
                break;
            case 13:
                jl jlVar = (jl) this.b;
                float[] fArr = (float[]) this.c;
                jlVar.getClass();
                jlVar.b0(fArr[0], fArr[1]);
                break;
            case 14:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.b;
                pi piVar = (pi) this.c;
                boolean z11 = ChatAttachAlertPhotoLayout.q1;
                int currentItemTop = piVar.getCurrentItemTop();
                int listTopPadding = piVar.getListTopPadding();
                wl wlVar = chatAttachAlertPhotoLayout.E;
                if (currentItemTop > AndroidUtilities.dp(8.0f)) {
                    listTopPadding -= currentItemTop;
                }
                wlVar.scrollBy(0, listTopPadding);
                break;
            case 15:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = (ChatAttachAlertPhotoLayout) this.b;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.c;
                gm gmVar = chatAttachAlertPhotoLayout2.P;
                if (gmVar != null) {
                    gmVar.setLayoutParams(layoutParams);
                    break;
                }
                break;
            case 16:
                tm tmVar = (tm) this.b;
                pi piVar2 = (pi) this.c;
                int currentItemTop2 = piVar2.getCurrentItemTop();
                int listTopPadding2 = piVar2.getListTopPadding();
                ai.w0 w0Var = tmVar.r;
                if (currentItemTop2 > AndroidUtilities.dp(7.0f)) {
                    listTopPadding2 -= currentItemTop2;
                }
                w0Var.scrollBy(0, listTopPadding2);
                break;
            case 17:
                ko koVar = (ko) this.b;
                hg.h hVar = (hg.h) this.c;
                mo.a(koVar.c);
                hVar.run();
                break;
            case 18:
                ((kp) this.b).b.x((List) this.c);
                break;
            case 19:
                ((lp) this.b).b.x((List) this.c);
                break;
            case 20:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.b;
                Context context = (Context) this.c;
                f3Var.dismiss();
                nf.f.s(context, "https://t.me/BotFather?start=deletebot");
                break;
            case 21:
                org.telegram.ui.Cells.j3 j3Var = (org.telegram.ui.Cells.j3) this.b;
                Set set = (Set) this.c;
                String charSequence2 = j3Var.getText().toString();
                org.telegram.ui.Cells.h3 h3Var = j3Var.b;
                Iterator it = set.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str = "bot";
                    } else if (charSequence2.endsWith((String) it.next())) {
                    }
                }
                h3Var.setRightText(str);
                break;
            case 22:
                pr prVar = (pr) this.b;
                ci.d dVar = (ci.d) this.c;
                prVar.getClass();
                dVar.setLoading(false);
                prVar.dismiss();
                break;
            case 23:
                pr prVar2 = (pr) this.b;
                TLObject tLObject = (TLObject) this.c;
                if (tLObject != null && (tLObject instanceof TL_phone.groupCallStreamRtmpUrl)) {
                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject;
                    prVar2.b0 = groupcallstreamrtmpurl.url;
                    prVar2.c0 = groupcallstreamrtmpurl.key;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(prVar2.c0);
                    prVar2.d0 = spannableStringBuilder;
                    n11 n11Var = new n11();
                    n11Var.a |= 256;
                    n11Var.b = 0;
                    n11Var.c = spannableStringBuilder.length();
                    prVar2.d0.setSpan(new o11(n11Var, 0), 0, prVar2.d0.length(), 0);
                    prVar2.e0.N(false);
                    break;
                }
                break;
            case 24:
                ts tsVar = (ts) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                ps psVar = tsVar.b;
                ArrayList arrayList4 = tsVar.h;
                int i14 = tsVar.a;
                if (tLObject2 instanceof TL_bots.popularAppBots) {
                    TL_bots.popularAppBots popularappbots = (TL_bots.popularAppBots) tLObject2;
                    MessagesController.getInstance(i14).putUsers(popularappbots.users, false);
                    MessagesStorage.getInstance(i14).putUsersAndChats(popularappbots.users, null, false, true);
                    arrayList4.addAll(popularappbots.users);
                    String str3 = popularappbots.next_offset;
                    tsVar.g = str3;
                    tsVar.e = str3 == null;
                    long currentTimeMillis = System.currentTimeMillis();
                    tsVar.f = currentTimeMillis;
                    if (!tsVar.i) {
                        tsVar.i = true;
                        String str4 = tsVar.g;
                        String str5 = str4 == null ? "" : str4;
                        ArrayList arrayList5 = new ArrayList();
                        for (int i15 = 0; i15 < arrayList4.size(); i15 = com.google.android.gms.internal.vision.e2.g(((TLRPC.User) arrayList4.get(i15)).id, arrayList5, i15, 1)) {
                        }
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i14);
                        messagesStorage.getStorageQueue().postRunnable(new org.telegram.messenger.voip.f(tsVar, messagesStorage, arrayList5, currentTimeMillis, str5, 3));
                    }
                    tsVar.c = false;
                    psVar.run();
                    break;
                } else {
                    tsVar.g = null;
                    tsVar.e = true;
                    tsVar.c = false;
                    psVar.run();
                    break;
                }
            case 25:
                st stVar = (st) this.b;
                Bitmap decodeFile = BitmapFactory.decodeFile((String) this.c);
                Canvas canvas = new Canvas(Bitmap.createBitmap(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f), Bitmap.Config.ARGB_8888));
                Paint paint = new Paint(3);
                canvas.translate(r2.getWidth() / 2.0f, r2.getHeight() / 2.0f);
                float max = Math.max(r2.getWidth() / decodeFile.getWidth(), r2.getHeight() / decodeFile.getHeight());
                canvas.scale(max, max);
                canvas.drawBitmap(decodeFile, (-decodeFile.getWidth()) / 2.0f, (-decodeFile.getHeight()) / 2.0f, paint);
                AndroidUtilities.runOnUIThread(new be(26, stVar, decodeFile));
                break;
            case 26:
                ((st) this.b).setImage((Bitmap) this.c);
                break;
            case 27:
                ((EditTextBoldCursor) this.b).hintLayout.draw((Canvas) this.c);
                break;
            case 28:
                fv fvVar = (fv) this.b;
                TLRPC.EmojiStatus emojiStatus = (TLRPC.EmojiStatus) this.c;
                i10 = ((org.telegram.ui.ActionBar.f3) fvVar.a).currentAccount;
                MessagesController.getInstance(i10).updateEmojiStatus(emojiStatus);
                break;
            default:
                MessagesController.getInstance(((ix) this.b).a.c1).updateEmojiStatus((TLRPC.EmojiStatus) this.c);
                break;
        }
    }
}
