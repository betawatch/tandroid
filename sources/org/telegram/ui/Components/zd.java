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

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class zd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zd(int i10, Object obj, Object obj2) {
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
                ci.f4 f4Var = (ci.f4) this.c;
                int i11 = ChatActivityEnterView.m5;
                chatActivityEnterView.removeView(f4Var);
                break;
            case 1:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) this.b;
                CharSequence charSequence = (CharSequence) this.c;
                int i12 = ChatActivityEnterView.m5;
                chatActivityEnterView2.setFieldText(charSequence);
                chatActivityEnterView2.W = null;
                break;
            case 2:
                ChatActivityEnterView chatActivityEnterView3 = (ChatActivityEnterView) this.b;
                rd rdVar = (rd) this.c;
                int i13 = ChatActivityEnterView.m5;
                rdVar.run();
                SharedPrefsHelper.setWebViewConfirmShown(chatActivityEnterView3.Q, chatActivityEnterView3.P2, true);
                break;
            case 3:
                rg rgVar = (rg) this.b;
                og ogVar = (og) this.c;
                ChatActivityEnterView chatActivityEnterView4 = rgVar.V;
                chatActivityEnterView4.i1 = chatActivityEnterView4.h1.getAudioRightMs() - chatActivityEnterView4.h1.getAudioLeftMs();
                MediaController.getInstance().trimCurrentRecording(chatActivityEnterView4.h1.getAudioLeftMs(), chatActivityEnterView4.h1.getAudioRightMs(), ogVar);
                break;
            case 4:
                ((vi) this.b).containerView.removeView((ci.f4) this.c);
                break;
            case 5:
                vi viVar = (vi) this.b;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.c;
                viVar.dismiss(true);
                if (n2Var != null) {
                    n2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    break;
                }
                break;
            case 6:
                vi viVar2 = (vi) this.b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = ((oi) this.c).c;
                tL_attachMenuBot.side_menu_disclaimer_needed = false;
                tL_attachMenuBot.inactive = false;
                viVar2.N1(tL_attachMenuBot.bot_id, null, false, true);
                MediaDataController.getInstance(viVar2.J1).updateAttachMenuBotsInCache();
                break;
            case 7:
                vi viVar3 = (vi) this.b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = (TLRPC.TL_attachMenuBot) this.c;
                MediaDataController.getInstance(viVar3.J1).loadAttachMenuBots(false, true);
                if (viVar3.y0 == viVar3.x0.get(tL_attachMenuBot2.bot_id)) {
                    viVar3.Q1(viVar3.j0);
                    break;
                }
                break;
            case 8:
                gj gjVar = (gj) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                gjVar.H = false;
                gjVar.I = arrayList;
                gjVar.P();
                break;
            case 9:
                gj gjVar2 = (gj) this.b;
                ((vi) this.c).Z0();
                gjVar2.L();
                gjVar2.b.X1(gjVar2, 0);
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new zd(11, (xj) this.b, ((wj) this.c).run()));
                break;
            case 11:
                ((xj) this.b).setStatus((CharSequence) this.c);
                break;
            case 12:
                nk nkVar = (nk) this.b;
                String str = (String) this.c;
                nkVar.getClass();
                ArrayList arrayList2 = new ArrayList(nkVar.X.v.c);
                if (nkVar.X.v.d.isEmpty()) {
                    arrayList2.addAll(0, nkVar.X.v.e);
                }
                Utilities.searchQueue.postRunnable(new ai.s4(nkVar, str, !nkVar.R.isEmpty(), arrayList2, 18));
                break;
            case 13:
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
            case 14:
                gl glVar = (gl) this.b;
                float[] fArr = (float[]) this.c;
                glVar.getClass();
                glVar.b0(fArr[0], fArr[1]);
                break;
            case 15:
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
            case 16:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = (ChatAttachAlertPhotoLayout) this.b;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.c;
                dm dmVar = chatAttachAlertPhotoLayout2.P;
                if (dmVar != null) {
                    dmVar.setLayoutParams(layoutParams);
                    break;
                }
                break;
            case 17:
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
            case 18:
                ho hoVar = (ho) this.b;
                hg.g gVar = (hg.g) this.c;
                jo.a(hoVar.c);
                gVar.run();
                break;
            case 19:
                ((hp) this.b).b.x((List) this.c);
                break;
            case 20:
                ((ip) this.b).b.x((List) this.c);
                break;
            case 21:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.b;
                Context context = (Context) this.c;
                f3Var.dismiss();
                nf.f.s(context, "https://t.me/BotFather?start=deletebot");
                break;
            case 22:
                mr mrVar = (mr) this.b;
                ci.d dVar = (ci.d) this.c;
                mrVar.getClass();
                dVar.setLoading(false);
                mrVar.dismiss();
                break;
            case 23:
                mr mrVar2 = (mr) this.b;
                TLObject tLObject = (TLObject) this.c;
                if (tLObject != null && (tLObject instanceof TL_phone.groupCallStreamRtmpUrl)) {
                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject;
                    mrVar2.b0 = groupcallstreamrtmpurl.url;
                    mrVar2.c0 = groupcallstreamrtmpurl.key;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(mrVar2.c0);
                    mrVar2.d0 = spannableStringBuilder;
                    d11 d11Var = new d11();
                    d11Var.a |= 256;
                    d11Var.b = 0;
                    d11Var.c = spannableStringBuilder.length();
                    mrVar2.d0.setSpan(new e11(d11Var, 0), 0, mrVar2.d0.length(), 0);
                    mrVar2.e0.N(false);
                    break;
                }
                break;
            case 24:
                qs qsVar = (qs) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                ms msVar = qsVar.b;
                ArrayList arrayList4 = qsVar.h;
                int i14 = qsVar.a;
                if (tLObject2 instanceof TL_bots.popularAppBots) {
                    TL_bots.popularAppBots popularappbots = (TL_bots.popularAppBots) tLObject2;
                    MessagesController.getInstance(i14).putUsers(popularappbots.users, false);
                    MessagesStorage.getInstance(i14).putUsersAndChats(popularappbots.users, null, false, true);
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
                        for (int i15 = 0; i15 < arrayList4.size(); i15 = com.google.android.gms.internal.vision.e2.g(((TLRPC.User) arrayList4.get(i15)).id, arrayList5, i15, 1)) {
                        }
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i14);
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
            case 25:
                pt ptVar = (pt) this.b;
                Bitmap decodeFile = BitmapFactory.decodeFile((String) this.c);
                Canvas canvas = new Canvas(Bitmap.createBitmap(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f), Bitmap.Config.ARGB_8888));
                Paint paint = new Paint(3);
                canvas.translate(r2.getWidth() / 2.0f, r2.getHeight() / 2.0f);
                float max = Math.max(r2.getWidth() / decodeFile.getWidth(), r2.getHeight() / decodeFile.getHeight());
                canvas.scale(max, max);
                canvas.drawBitmap(decodeFile, (-decodeFile.getWidth()) / 2.0f, (-decodeFile.getHeight()) / 2.0f, paint);
                AndroidUtilities.runOnUIThread(new zd(26, ptVar, decodeFile));
                break;
            case 26:
                ((pt) this.b).setImage((Bitmap) this.c);
                break;
            case 27:
                ((EditTextBoldCursor) this.b).hintLayout.draw((Canvas) this.c);
                break;
            case 28:
                bv bvVar = (bv) this.b;
                TLRPC.EmojiStatus emojiStatus = (TLRPC.EmojiStatus) this.c;
                i10 = ((org.telegram.ui.ActionBar.f3) bvVar.a).currentAccount;
                MessagesController.getInstance(i10).updateEmojiStatus(emojiStatus);
                break;
            default:
                MessagesController.getInstance(((ex) this.b).a.c1).updateEmojiStatus((TLRPC.EmojiStatus) this.c);
                break;
        }
    }
}
