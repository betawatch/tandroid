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

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
                ((md) this.b).removeView((ci.e4) this.c);
                break;
            case 2:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.b;
                ci.e4 e4Var = (ci.e4) this.c;
                int i10 = ChatActivityEnterView.n5;
                chatActivityEnterView.removeView(e4Var);
                break;
            case 3:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) this.b;
                CharSequence charSequence = (CharSequence) this.c;
                int i11 = ChatActivityEnterView.n5;
                chatActivityEnterView2.setFieldText(charSequence);
                chatActivityEnterView2.W = null;
                break;
            case 4:
                ChatActivityEnterView chatActivityEnterView3 = (ChatActivityEnterView) this.b;
                td tdVar = (td) this.c;
                int i12 = ChatActivityEnterView.n5;
                tdVar.run();
                SharedPrefsHelper.setWebViewConfirmShown(chatActivityEnterView3.Q, chatActivityEnterView3.Q2, true);
                break;
            case 5:
                sg sgVar = (sg) this.b;
                pg pgVar = (pg) this.c;
                ChatActivityEnterView chatActivityEnterView4 = sgVar.V;
                chatActivityEnterView4.i1 = chatActivityEnterView4.h1.getAudioRightMs() - chatActivityEnterView4.h1.getAudioLeftMs();
                MediaController.getInstance().trimCurrentRecording(chatActivityEnterView4.h1.getAudioLeftMs(), chatActivityEnterView4.h1.getAudioRightMs(), pgVar);
                break;
            case 6:
                ((wi) this.b).containerView.removeView((ci.e4) this.c);
                break;
            case 7:
                wi wiVar = (wi) this.b;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.c;
                wiVar.dismiss(true);
                if (m2Var != null) {
                    m2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    break;
                }
                break;
            case 8:
                wi wiVar2 = (wi) this.b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = ((pi) this.c).c;
                tL_attachMenuBot.side_menu_disclaimer_needed = false;
                tL_attachMenuBot.inactive = false;
                wiVar2.N1(tL_attachMenuBot.bot_id, null, false, true);
                MediaDataController.getInstance(wiVar2.J1).updateAttachMenuBotsInCache();
                break;
            case 9:
                wi wiVar3 = (wi) this.b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = (TLRPC.TL_attachMenuBot) this.c;
                MediaDataController.getInstance(wiVar3.J1).loadAttachMenuBots(false, true);
                if (wiVar3.y0 == wiVar3.x0.get(tL_attachMenuBot2.bot_id)) {
                    wiVar3.Q1(wiVar3.j0);
                    break;
                }
                break;
            case 10:
                ij ijVar = (ij) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                ijVar.G = false;
                ijVar.H = arrayList;
                ijVar.P();
                break;
            case 11:
                ij ijVar2 = (ij) this.b;
                ((wi) this.c).Z0();
                ijVar2.L();
                ijVar2.b.X1(ijVar2, 0);
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new uc(13, (zj) this.b, ((yj) this.c).run()));
                break;
            case 13:
                ((zj) this.b).setStatus((CharSequence) this.c);
                break;
            case 14:
                pk pkVar = (pk) this.b;
                String str = (String) this.c;
                pkVar.getClass();
                ArrayList arrayList2 = new ArrayList(pkVar.X.v.c);
                if (pkVar.X.v.d.isEmpty()) {
                    arrayList2.addAll(0, pkVar.X.v.e);
                }
                Utilities.searchQueue.postRunnable(new ai.s4(pkVar, str, !pkVar.R.isEmpty(), arrayList2, 18));
                break;
            case 15:
                pk pkVar2 = (pk) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                qk qkVar = pkVar2.X;
                boolean z10 = qkVar.b0;
                fk fkVar = qkVar.r;
                if (z10) {
                    s4.h0 adapter = fkVar.getAdapter();
                    pk pkVar3 = qkVar.y;
                    if (adapter != pkVar3) {
                        fkVar.setAdapter(pkVar3);
                    }
                }
                pkVar2.s = arrayList3;
                pkVar2.l();
                break;
            case 16:
                il ilVar = (il) this.b;
                float[] fArr = (float[]) this.c;
                ilVar.getClass();
                ilVar.b0(fArr[0], fArr[1]);
                break;
            case 17:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.b;
                oi oiVar = (oi) this.c;
                boolean z11 = ChatAttachAlertPhotoLayout.q1;
                int currentItemTop = oiVar.getCurrentItemTop();
                int listTopPadding = oiVar.getListTopPadding();
                vl vlVar = chatAttachAlertPhotoLayout.E;
                if (currentItemTop > AndroidUtilities.dp(8.0f)) {
                    listTopPadding -= currentItemTop;
                }
                vlVar.scrollBy(0, listTopPadding);
                break;
            case 18:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = (ChatAttachAlertPhotoLayout) this.b;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.c;
                fm fmVar = chatAttachAlertPhotoLayout2.P;
                if (fmVar != null) {
                    fmVar.setLayoutParams(layoutParams);
                    break;
                }
                break;
            case 19:
                sm smVar = (sm) this.b;
                oi oiVar2 = (oi) this.c;
                int currentItemTop2 = oiVar2.getCurrentItemTop();
                int listTopPadding2 = oiVar2.getListTopPadding();
                ai.w0 w0Var = smVar.r;
                if (currentItemTop2 > AndroidUtilities.dp(7.0f)) {
                    listTopPadding2 -= currentItemTop2;
                }
                w0Var.scrollBy(0, listTopPadding2);
                break;
            case 20:
                jo joVar = (jo) this.b;
                hg.h hVar = (hg.h) this.c;
                lo.a(joVar.c);
                hVar.run();
                break;
            case 21:
                ((jp) this.b).b.x((List) this.c);
                break;
            case 22:
                ((kp) this.b).b.x((List) this.c);
                break;
            case 23:
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.b;
                Context context = (Context) this.c;
                e3Var.dismiss();
                nf.f.s(context, "https://t.me/BotFather?start=deletebot");
                break;
            case 24:
                or orVar = (or) this.b;
                ci.d dVar = (ci.d) this.c;
                orVar.getClass();
                dVar.setLoading(false);
                orVar.dismiss();
                break;
            case 25:
                or orVar2 = (or) this.b;
                TLObject tLObject = (TLObject) this.c;
                if (tLObject != null && (tLObject instanceof TL_phone.groupCallStreamRtmpUrl)) {
                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject;
                    orVar2.b0 = groupcallstreamrtmpurl.url;
                    orVar2.c0 = groupcallstreamrtmpurl.key;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(orVar2.c0);
                    orVar2.d0 = spannableStringBuilder;
                    d11 d11Var = new d11();
                    d11Var.a |= 256;
                    d11Var.b = 0;
                    d11Var.c = spannableStringBuilder.length();
                    orVar2.d0.setSpan(new e11(d11Var, 0), 0, orVar2.d0.length(), 0);
                    orVar2.e0.N(false);
                    break;
                }
                break;
            case 26:
                ss ssVar = (ss) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                os osVar = ssVar.b;
                ArrayList arrayList4 = ssVar.h;
                int i13 = ssVar.a;
                if (tLObject2 instanceof TL_bots.popularAppBots) {
                    TL_bots.popularAppBots popularappbots = (TL_bots.popularAppBots) tLObject2;
                    MessagesController.getInstance(i13).putUsers(popularappbots.users, false);
                    MessagesStorage.getInstance(i13).putUsersAndChats(popularappbots.users, null, false, true);
                    arrayList4.addAll(popularappbots.users);
                    String str2 = popularappbots.next_offset;
                    ssVar.g = str2;
                    ssVar.e = str2 == null;
                    long currentTimeMillis = System.currentTimeMillis();
                    ssVar.f = currentTimeMillis;
                    if (!ssVar.i) {
                        ssVar.i = true;
                        String str3 = ssVar.g;
                        if (str3 == null) {
                            str3 = "";
                        }
                        String str4 = str3;
                        ArrayList arrayList5 = new ArrayList();
                        for (int i14 = 0; i14 < arrayList4.size(); i14 = com.google.android.gms.internal.vision.e2.g(((TLRPC.User) arrayList4.get(i14)).id, arrayList5, i14, 1)) {
                        }
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i13);
                        messagesStorage.getStorageQueue().postRunnable(new org.telegram.messenger.voip.f(ssVar, messagesStorage, arrayList5, currentTimeMillis, str4, 3));
                    }
                    ssVar.c = false;
                    osVar.run();
                    break;
                } else {
                    ssVar.g = null;
                    ssVar.e = true;
                    ssVar.c = false;
                    osVar.run();
                    break;
                }
            case 27:
                rt rtVar = (rt) this.b;
                Bitmap decodeFile = BitmapFactory.decodeFile((String) this.c);
                Canvas canvas = new Canvas(Bitmap.createBitmap(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f), Bitmap.Config.ARGB_8888));
                Paint paint = new Paint(3);
                canvas.translate(r2.getWidth() / 2.0f, r2.getHeight() / 2.0f);
                float max = Math.max(r2.getWidth() / decodeFile.getWidth(), r2.getHeight() / decodeFile.getHeight());
                canvas.scale(max, max);
                canvas.drawBitmap(decodeFile, (-decodeFile.getWidth()) / 2.0f, (-decodeFile.getHeight()) / 2.0f, paint);
                AndroidUtilities.runOnUIThread(new uc(28, rtVar, decodeFile));
                break;
            case 28:
                ((rt) this.b).setImage((Bitmap) this.c);
                break;
            default:
                ((EditTextBoldCursor) this.b).hintLayout.draw((Canvas) this.c);
                break;
        }
    }
}
