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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class uc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ uc(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean[] zArr = (boolean[]) this.b;
                Runnable runnable = (Runnable) this.c;
                if (!zArr[0]) {
                    zArr[0] = true;
                    runnable.run();
                    break;
                }
                break;
            case 1:
                ((ld) this.b).removeView((di.f4) this.c);
                break;
            case 2:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.b;
                di.f4 f4Var = (di.f4) this.c;
                int i10 = ChatActivityEnterView.m5;
                chatActivityEnterView.removeView(f4Var);
                break;
            case 3:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) this.b;
                CharSequence charSequence = (CharSequence) this.c;
                int i11 = ChatActivityEnterView.m5;
                chatActivityEnterView2.setFieldText(charSequence);
                chatActivityEnterView2.W = null;
                break;
            case 4:
                ChatActivityEnterView chatActivityEnterView3 = (ChatActivityEnterView) this.b;
                sd sdVar = (sd) this.c;
                int i12 = ChatActivityEnterView.m5;
                sdVar.run();
                SharedPrefsHelper.setWebViewConfirmShown(chatActivityEnterView3.Q, chatActivityEnterView3.P2, true);
                break;
            case 5:
                sg sgVar = (sg) this.b;
                pg pgVar = (pg) this.c;
                ChatActivityEnterView chatActivityEnterView4 = sgVar.V;
                chatActivityEnterView4.i1 = chatActivityEnterView4.h1.getAudioRightMs() - chatActivityEnterView4.h1.getAudioLeftMs();
                MediaController.getInstance().trimCurrentRecording(chatActivityEnterView4.h1.getAudioLeftMs(), chatActivityEnterView4.h1.getAudioRightMs(), pgVar);
                break;
            case 6:
                ((vi) this.b).containerView.removeView((di.f4) this.c);
                break;
            case 7:
                vi viVar = (vi) this.b;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.c;
                viVar.dismiss(true);
                if (n2Var != null) {
                    n2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    break;
                }
                break;
            case 8:
                vi viVar2 = (vi) this.b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = ((oi) this.c).c;
                tL_attachMenuBot.side_menu_disclaimer_needed = false;
                tL_attachMenuBot.inactive = false;
                viVar2.N1(tL_attachMenuBot.bot_id, null, false, true);
                MediaDataController.getInstance(viVar2.J1).updateAttachMenuBotsInCache();
                break;
            case 9:
                vi viVar3 = (vi) this.b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = (TLRPC.TL_attachMenuBot) this.c;
                MediaDataController.getInstance(viVar3.J1).loadAttachMenuBots(false, true);
                if (viVar3.y0 == viVar3.x0.get(tL_attachMenuBot2.bot_id)) {
                    viVar3.Q1(viVar3.j0);
                    break;
                }
                break;
            case 10:
                gj gjVar = (gj) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                gjVar.H = false;
                gjVar.I = arrayList;
                gjVar.P();
                break;
            case 11:
                gj gjVar2 = (gj) this.b;
                ((vi) this.c).Z0();
                gjVar2.L();
                gjVar2.b.X1(gjVar2, 0);
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new uc(13, (xj) this.b, ((wj) this.c).run()));
                break;
            case 13:
                ((xj) this.b).setStatus((CharSequence) this.c);
                break;
            case 14:
                nk nkVar = (nk) this.b;
                String str = (String) this.c;
                nkVar.getClass();
                ArrayList arrayList2 = new ArrayList(nkVar.X.v.c);
                if (nkVar.X.v.d.isEmpty()) {
                    arrayList2.addAll(0, nkVar.X.v.e);
                }
                Utilities.searchQueue.postRunnable(new bi.e4(nkVar, str, !nkVar.R.isEmpty(), arrayList2, 17));
                break;
            case 15:
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
            case 16:
                gl glVar = (gl) this.b;
                float[] fArr = (float[]) this.c;
                glVar.getClass();
                glVar.b0(fArr[0], fArr[1]);
                break;
            case 17:
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
            case 18:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = (ChatAttachAlertPhotoLayout) this.b;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.c;
                dm dmVar = chatAttachAlertPhotoLayout2.P;
                if (dmVar != null) {
                    dmVar.setLayoutParams(layoutParams);
                    break;
                }
                break;
            case 19:
                qm qmVar = (qm) this.b;
                ni niVar2 = (ni) this.c;
                int currentItemTop2 = niVar2.getCurrentItemTop();
                int listTopPadding2 = niVar2.getListTopPadding();
                bi.o0 o0Var = qmVar.r;
                if (currentItemTop2 > AndroidUtilities.dp(7.0f)) {
                    listTopPadding2 -= currentItemTop2;
                }
                o0Var.scrollBy(0, listTopPadding2);
                break;
            case 20:
                go goVar = (go) this.b;
                ig.g gVar = (ig.g) this.c;
                io.a(goVar.c);
                gVar.run();
                break;
            case 21:
                ((gp) this.b).b.x((List) this.c);
                break;
            case 22:
                ((hp) this.b).b.x((List) this.c);
                break;
            case 23:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.b;
                Context context = (Context) this.c;
                f3Var.dismiss();
                of.f.s(context, "https://t.me/BotFather?start=deletebot");
                break;
            case 24:
                lr lrVar = (lr) this.b;
                di.d dVar = (di.d) this.c;
                lrVar.getClass();
                dVar.setLoading(false);
                lrVar.dismiss();
                break;
            case 25:
                lr lrVar2 = (lr) this.b;
                TLObject tLObject = (TLObject) this.c;
                if (tLObject != null && (tLObject instanceof TL_phone.groupCallStreamRtmpUrl)) {
                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject;
                    lrVar2.b0 = groupcallstreamrtmpurl.url;
                    lrVar2.c0 = groupcallstreamrtmpurl.key;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(lrVar2.c0);
                    lrVar2.d0 = spannableStringBuilder;
                    n01 n01Var = new n01();
                    n01Var.a |= 256;
                    n01Var.b = 0;
                    n01Var.c = spannableStringBuilder.length();
                    lrVar2.d0.setSpan(new o01(n01Var, 0), 0, lrVar2.d0.length(), 0);
                    lrVar2.e0.N(false);
                    break;
                }
                break;
            case 26:
                ps psVar = (ps) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                ls lsVar = psVar.b;
                ArrayList arrayList4 = psVar.h;
                int i13 = psVar.a;
                if (tLObject2 instanceof TL_bots.popularAppBots) {
                    TL_bots.popularAppBots popularappbots = (TL_bots.popularAppBots) tLObject2;
                    MessagesController.getInstance(i13).putUsers(popularappbots.users, false);
                    MessagesStorage.getInstance(i13).putUsersAndChats(popularappbots.users, null, false, true);
                    arrayList4.addAll(popularappbots.users);
                    String str2 = popularappbots.next_offset;
                    psVar.g = str2;
                    psVar.e = str2 == null;
                    long currentTimeMillis = System.currentTimeMillis();
                    psVar.f = currentTimeMillis;
                    if (!psVar.i) {
                        psVar.i = true;
                        String str3 = psVar.g;
                        if (str3 == null) {
                            str3 = "";
                        }
                        String str4 = str3;
                        ArrayList arrayList5 = new ArrayList();
                        for (int i14 = 0; i14 < arrayList4.size(); i14 = com.google.android.gms.internal.vision.e2.g(((TLRPC.User) arrayList4.get(i14)).id, arrayList5, i14, 1)) {
                        }
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i13);
                        messagesStorage.getStorageQueue().postRunnable(new org.telegram.messenger.voip.f(psVar, messagesStorage, arrayList5, currentTimeMillis, str4, 3));
                    }
                    psVar.c = false;
                    lsVar.run();
                    break;
                } else {
                    psVar.g = null;
                    psVar.e = true;
                    psVar.c = false;
                    lsVar.run();
                    break;
                }
            case 27:
                nt ntVar = (nt) this.b;
                Bitmap decodeFile = BitmapFactory.decodeFile((String) this.c);
                Canvas canvas = new Canvas(Bitmap.createBitmap(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f), Bitmap.Config.ARGB_8888));
                Paint paint = new Paint(3);
                canvas.translate(r2.getWidth() / 2.0f, r2.getHeight() / 2.0f);
                float max = Math.max(r2.getWidth() / decodeFile.getWidth(), r2.getHeight() / decodeFile.getHeight());
                canvas.scale(max, max);
                canvas.drawBitmap(decodeFile, (-decodeFile.getWidth()) / 2.0f, (-decodeFile.getHeight()) / 2.0f, paint);
                AndroidUtilities.runOnUIThread(new uc(28, ntVar, decodeFile));
                break;
            case 28:
                ((nt) this.b).setImage((Bitmap) this.c);
                break;
            default:
                ((EditTextBoldCursor) this.b).hintLayout.draw((Canvas) this.c);
                break;
        }
    }
}
