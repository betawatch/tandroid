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

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kd(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        switch (this.a) {
            case 0:
                ((md) this.c).removeView((ci.e4) this.b);
                break;
            case 1:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
                ci.e4 e4Var = (ci.e4) this.b;
                int i11 = ChatActivityEnterView.n5;
                chatActivityEnterView.removeView(e4Var);
                break;
            case 2:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) this.c;
                CharSequence charSequence = (CharSequence) this.b;
                int i12 = ChatActivityEnterView.n5;
                chatActivityEnterView2.setFieldText(charSequence);
                chatActivityEnterView2.W = null;
                break;
            case 3:
                ChatActivityEnterView chatActivityEnterView3 = (ChatActivityEnterView) this.c;
                td tdVar = (td) this.b;
                int i13 = ChatActivityEnterView.n5;
                tdVar.run();
                SharedPrefsHelper.setWebViewConfirmShown(chatActivityEnterView3.Q, chatActivityEnterView3.Q2, true);
                break;
            case 4:
                sg sgVar = (sg) this.c;
                pg pgVar = (pg) this.b;
                ChatActivityEnterView chatActivityEnterView4 = sgVar.V;
                chatActivityEnterView4.i1 = chatActivityEnterView4.h1.getAudioRightMs() - chatActivityEnterView4.h1.getAudioLeftMs();
                MediaController.getInstance().trimCurrentRecording(chatActivityEnterView4.h1.getAudioLeftMs(), chatActivityEnterView4.h1.getAudioRightMs(), pgVar);
                break;
            case 5:
                ((wi) this.c).containerView.removeView((ci.e4) this.b);
                break;
            case 6:
                wi wiVar = (wi) this.c;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.b;
                wiVar.dismiss(true);
                if (m2Var != null) {
                    m2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    break;
                }
                break;
            case 7:
                wi wiVar2 = (wi) this.c;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = ((pi) this.b).c;
                tL_attachMenuBot.side_menu_disclaimer_needed = false;
                tL_attachMenuBot.inactive = false;
                wiVar2.N1(tL_attachMenuBot.bot_id, null, false, true);
                MediaDataController.getInstance(wiVar2.J1).updateAttachMenuBotsInCache();
                break;
            case 8:
                wi wiVar3 = (wi) this.c;
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = (TLRPC.TL_attachMenuBot) this.b;
                MediaDataController.getInstance(wiVar3.J1).loadAttachMenuBots(false, true);
                if (wiVar3.y0 == wiVar3.x0.get(tL_attachMenuBot2.bot_id)) {
                    wiVar3.Q1(wiVar3.j0);
                    break;
                }
                break;
            case 9:
                hj hjVar = (hj) this.c;
                ArrayList arrayList = (ArrayList) this.b;
                hjVar.H = false;
                hjVar.I = arrayList;
                hjVar.P();
                break;
            case 10:
                hj hjVar2 = (hj) this.c;
                ((wi) this.b).Z0();
                hjVar2.L();
                hjVar2.b.X1(hjVar2, 0);
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new kd(12, (yj) this.c, ((xj) this.b).run()));
                break;
            case 12:
                ((yj) this.c).setStatus((CharSequence) this.b);
                break;
            case 13:
                ok okVar = (ok) this.c;
                String str = (String) this.b;
                okVar.getClass();
                ArrayList arrayList2 = new ArrayList(okVar.X.v.c);
                if (okVar.X.v.d.isEmpty()) {
                    arrayList2.addAll(0, okVar.X.v.e);
                }
                Utilities.searchQueue.postRunnable(new ai.s4(okVar, str, !okVar.R.isEmpty(), arrayList2, 18));
                break;
            case 14:
                ok okVar2 = (ok) this.c;
                ArrayList arrayList3 = (ArrayList) this.b;
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
            case 15:
                hl hlVar = (hl) this.c;
                float[] fArr = (float[]) this.b;
                hlVar.getClass();
                hlVar.b0(fArr[0], fArr[1]);
                break;
            case 16:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.c;
                oi oiVar = (oi) this.b;
                boolean z11 = ChatAttachAlertPhotoLayout.q1;
                int currentItemTop = oiVar.getCurrentItemTop();
                int listTopPadding = oiVar.getListTopPadding();
                ul ulVar = chatAttachAlertPhotoLayout.E;
                if (currentItemTop > AndroidUtilities.dp(8.0f)) {
                    listTopPadding -= currentItemTop;
                }
                ulVar.scrollBy(0, listTopPadding);
                break;
            case 17:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = (ChatAttachAlertPhotoLayout) this.c;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.b;
                em emVar = chatAttachAlertPhotoLayout2.P;
                if (emVar != null) {
                    emVar.setLayoutParams(layoutParams);
                    break;
                }
                break;
            case 18:
                rm rmVar = (rm) this.c;
                oi oiVar2 = (oi) this.b;
                int currentItemTop2 = oiVar2.getCurrentItemTop();
                int listTopPadding2 = oiVar2.getListTopPadding();
                ai.w0 w0Var = rmVar.r;
                if (currentItemTop2 > AndroidUtilities.dp(7.0f)) {
                    listTopPadding2 -= currentItemTop2;
                }
                w0Var.scrollBy(0, listTopPadding2);
                break;
            case 19:
                io ioVar = (io) this.c;
                hg.h hVar = (hg.h) this.b;
                ko.a(ioVar.c);
                hVar.run();
                break;
            case 20:
                ((ip) this.c).b.x((List) this.b);
                break;
            case 21:
                ((jp) this.c).b.x((List) this.b);
                break;
            case 22:
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.c;
                Context context = (Context) this.b;
                e3Var.dismiss();
                nf.f.s(context, "https://t.me/BotFather?start=deletebot");
                break;
            case 23:
                nr nrVar = (nr) this.c;
                ci.d dVar = (ci.d) this.b;
                nrVar.getClass();
                dVar.setLoading(false);
                nrVar.dismiss();
                break;
            case 24:
                nr nrVar2 = (nr) this.c;
                TLObject tLObject = (TLObject) this.b;
                if (tLObject != null && (tLObject instanceof TL_phone.groupCallStreamRtmpUrl)) {
                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject;
                    nrVar2.b0 = groupcallstreamrtmpurl.url;
                    nrVar2.c0 = groupcallstreamrtmpurl.key;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(nrVar2.c0);
                    nrVar2.d0 = spannableStringBuilder;
                    b11 b11Var = new b11();
                    b11Var.a |= 256;
                    b11Var.b = 0;
                    b11Var.c = spannableStringBuilder.length();
                    nrVar2.d0.setSpan(new c11(b11Var, 0), 0, nrVar2.d0.length(), 0);
                    nrVar2.e0.N(false);
                    break;
                }
                break;
            case 25:
                rs rsVar = (rs) this.c;
                TLObject tLObject2 = (TLObject) this.b;
                ns nsVar = rsVar.b;
                ArrayList arrayList4 = rsVar.h;
                int i14 = rsVar.a;
                if (tLObject2 instanceof TL_bots.popularAppBots) {
                    TL_bots.popularAppBots popularappbots = (TL_bots.popularAppBots) tLObject2;
                    MessagesController.getInstance(i14).putUsers(popularappbots.users, false);
                    MessagesStorage.getInstance(i14).putUsersAndChats(popularappbots.users, null, false, true);
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
                        for (int i15 = 0; i15 < arrayList4.size(); i15 = com.google.android.gms.internal.vision.e2.g(((TLRPC.User) arrayList4.get(i15)).id, arrayList5, i15, 1)) {
                        }
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i14);
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
            case 26:
                qt qtVar = (qt) this.c;
                Bitmap decodeFile = BitmapFactory.decodeFile((String) this.b);
                Canvas canvas = new Canvas(Bitmap.createBitmap(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f), Bitmap.Config.ARGB_8888));
                Paint paint = new Paint(3);
                canvas.translate(r2.getWidth() / 2.0f, r2.getHeight() / 2.0f);
                float max = Math.max(r2.getWidth() / decodeFile.getWidth(), r2.getHeight() / decodeFile.getHeight());
                canvas.scale(max, max);
                canvas.drawBitmap(decodeFile, (-decodeFile.getWidth()) / 2.0f, (-decodeFile.getHeight()) / 2.0f, paint);
                AndroidUtilities.runOnUIThread(new kd(27, qtVar, decodeFile));
                break;
            case 27:
                ((qt) this.c).setImage((Bitmap) this.b);
                break;
            case 28:
                ((EditTextBoldCursor) this.c).hintLayout.draw((Canvas) this.b);
                break;
            default:
                cv cvVar = (cv) this.c;
                TLRPC.EmojiStatus emojiStatus = (TLRPC.EmojiStatus) this.b;
                i10 = ((org.telegram.ui.ActionBar.e3) cvVar.a).currentAccount;
                MessagesController.getInstance(i10).updateEmojiStatus(emojiStatus);
                break;
        }
    }
}
