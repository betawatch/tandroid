package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedPrefsHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
        String str = "";
        switch (this.a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.b;
                CharSequence charSequence = (CharSequence) this.c;
                int i10 = ChatActivityEnterView.n5;
                chatActivityEnterView.setFieldText(charSequence);
                chatActivityEnterView.W = null;
                break;
            case 1:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) this.b;
                rd rdVar = (rd) this.c;
                int i11 = ChatActivityEnterView.n5;
                rdVar.run();
                SharedPrefsHelper.setWebViewConfirmShown(chatActivityEnterView2.Q, chatActivityEnterView2.Q2, true);
                break;
            case 2:
                sg sgVar = (sg) this.b;
                pg pgVar = (pg) this.c;
                ChatActivityEnterView chatActivityEnterView3 = sgVar.V;
                chatActivityEnterView3.i1 = chatActivityEnterView3.h1.getAudioRightMs() - chatActivityEnterView3.h1.getAudioLeftMs();
                MediaController.getInstance().trimCurrentRecording(chatActivityEnterView3.h1.getAudioLeftMs(), chatActivityEnterView3.h1.getAudioRightMs(), pgVar);
                break;
            case 3:
                ((ti) this.b).containerView.removeView((ei.x3) this.c);
                break;
            case 4:
                ti tiVar = (ti) this.b;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.c;
                tiVar.dismiss(true);
                if (n2Var != null) {
                    n2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    break;
                }
                break;
            case 5:
                ti tiVar2 = (ti) this.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.c;
                if (!tiVar2.isDismissed() && editTextBoldCursor.isFocusable() && editTextBoldCursor.hasFocus() && editTextBoldCursor.isShown()) {
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                    break;
                }
                break;
            case 6:
                ti tiVar3 = (ti) this.b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = ((mi) this.c).c;
                tL_attachMenuBot.side_menu_disclaimer_needed = false;
                tL_attachMenuBot.inactive = false;
                tiVar3.R1(tL_attachMenuBot.bot_id, null, false, true);
                MediaDataController.getInstance(tiVar3.M1).updateAttachMenuBotsInCache();
                break;
            case 7:
                ti tiVar4 = (ti) this.b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = (TLRPC.TL_attachMenuBot) this.c;
                MediaDataController.getInstance(tiVar4.M1).loadAttachMenuBots(false, true);
                if (tiVar4.B0 == tiVar4.A0.get(tL_attachMenuBot2.bot_id)) {
                    tiVar4.U1(tiVar4.j0);
                    break;
                }
                break;
            case 8:
                fj fjVar = (fj) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                fjVar.G = false;
                fjVar.H = arrayList;
                fjVar.S();
                break;
            case 9:
                fj fjVar2 = (fj) this.b;
                ((ti) this.c).b1();
                fjVar2.O();
                fjVar2.b.b2(fjVar2, 0);
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new ee(11, (wj) this.b, ((vj) this.c).run()));
                break;
            case 11:
                ((wj) this.b).setStatus((CharSequence) this.c);
                break;
            case 12:
                mk mkVar = (mk) this.b;
                String str2 = (String) this.c;
                mkVar.getClass();
                ArrayList arrayList2 = new ArrayList(mkVar.X.v.c);
                if (mkVar.X.v.d.isEmpty()) {
                    arrayList2.addAll(0, mkVar.X.v.e);
                }
                Utilities.searchQueue.postRunnable(new ai.x9(mkVar, str2, !mkVar.R.isEmpty(), arrayList2, 17));
                break;
            case 13:
                mk mkVar2 = (mk) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                nk nkVar = mkVar2.X;
                boolean z10 = nkVar.b0;
                ck ckVar = nkVar.r;
                if (z10) {
                    s4.g0 adapter = ckVar.getAdapter();
                    mk mkVar3 = nkVar.y;
                    if (adapter != mkVar3) {
                        ckVar.setAdapter(mkVar3);
                    }
                }
                mkVar2.s = arrayList3;
                mkVar2.l();
                break;
            case 14:
                al alVar = (al) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                ti tiVar5 = alVar.b;
                tiVar5.dismiss();
                tiVar5.f0.presentFragment(org.telegram.ui.sn.W9(user.id));
                break;
            case 15:
                org.telegram.messenger.g0.q(R.string.WalletAddressCopiedBulletin, new xc((al) this.b, (org.telegram.ui.ActionBar.d6) this.c), R.raw.copy, 36);
                break;
            case 16:
                rl rlVar = (rl) this.b;
                float[] fArr = (float[]) this.c;
                rlVar.getClass();
                rlVar.e0(fArr[0], fArr[1]);
                break;
            case 17:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.b;
                li liVar = (li) this.c;
                boolean z11 = ChatAttachAlertPhotoLayout.q1;
                int currentItemTop = liVar.getCurrentItemTop();
                int listTopPadding = liVar.getListTopPadding();
                em emVar = chatAttachAlertPhotoLayout.E;
                if (currentItemTop > AndroidUtilities.dp(8.0f)) {
                    listTopPadding -= currentItemTop;
                }
                emVar.scrollBy(0, listTopPadding);
                break;
            case 18:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = (ChatAttachAlertPhotoLayout) this.b;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.c;
                om omVar = chatAttachAlertPhotoLayout2.P;
                if (omVar != null) {
                    omVar.setLayoutParams(layoutParams);
                    break;
                }
                break;
            case 19:
                bn bnVar = (bn) this.b;
                li liVar2 = (li) this.c;
                int currentItemTop2 = liVar2.getCurrentItemTop();
                int listTopPadding2 = liVar2.getListTopPadding();
                ai.u1 u1Var = bnVar.r;
                if (currentItemTop2 > AndroidUtilities.dp(7.0f)) {
                    listTopPadding2 -= currentItemTop2;
                }
                u1Var.scrollBy(0, listTopPadding2);
                break;
            case 20:
                ro roVar = (ro) this.b;
                ig.g gVar = (ig.g) this.c;
                to.a(roVar.c);
                gVar.run();
                break;
            case 21:
                ((rp) this.b).b.z((List) this.c);
                break;
            case 22:
                ((sp) this.b).b.z((List) this.c);
                break;
            case 23:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.b;
                Context context = (Context) this.c;
                f3Var.dismiss();
                pf.d.r(context, "https://t.me/BotFather?start=deletebot");
                break;
            case 24:
                org.telegram.ui.Cells.i3 i3Var = (org.telegram.ui.Cells.i3) this.b;
                TreeSet treeSet = (TreeSet) this.c;
                String charSequence2 = i3Var.getText().toString();
                if (!nr.a(charSequence2, "bot") && nr.c(charSequence2, treeSet) == null) {
                    str = "bot";
                }
                org.telegram.ui.Cells.g3 g3Var = i3Var.b;
                g3Var.setRightText(str);
                g3Var.setPadding(0, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(TextUtils.isEmpty(str) ? 21.0f : 63.0f), AndroidUtilities.dp(15.0f));
                break;
            case 25:
                xr xrVar = (xr) this.b;
                ei.d dVar = (ei.d) this.c;
                xrVar.getClass();
                dVar.setLoading(false);
                xrVar.dismiss();
                break;
            case 26:
                xr xrVar2 = (xr) this.b;
                TLObject tLObject = (TLObject) this.c;
                if (tLObject != null && (tLObject instanceof TL_phone.groupCallStreamRtmpUrl)) {
                    TL_phone.groupCallStreamRtmpUrl groupcallstreamrtmpurl = (TL_phone.groupCallStreamRtmpUrl) tLObject;
                    xrVar2.b0 = groupcallstreamrtmpurl.url;
                    xrVar2.c0 = groupcallstreamrtmpurl.key;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(xrVar2.c0);
                    xrVar2.d0 = spannableStringBuilder;
                    l11 l11Var = new l11();
                    l11Var.a |= 256;
                    l11Var.b = 0;
                    l11Var.c = spannableStringBuilder.length();
                    xrVar2.d0.setSpan(new m11(l11Var, 0), 0, xrVar2.d0.length(), 0);
                    xrVar2.e0.N(false);
                    break;
                }
                break;
            case 27:
                zs zsVar = (zs) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                ws wsVar = zsVar.b;
                ArrayList arrayList4 = zsVar.h;
                int i12 = zsVar.a;
                if (tLObject2 instanceof TL_bots.popularAppBots) {
                    TL_bots.popularAppBots popularappbots = (TL_bots.popularAppBots) tLObject2;
                    MessagesController.getInstance(i12).putUsers(popularappbots.users, false);
                    MessagesStorage.getInstance(i12).putUsersAndChats(popularappbots.users, null, false, true);
                    arrayList4.addAll(popularappbots.users);
                    String str3 = popularappbots.next_offset;
                    zsVar.g = str3;
                    zsVar.e = str3 == null;
                    long currentTimeMillis = System.currentTimeMillis();
                    zsVar.f = currentTimeMillis;
                    if (!zsVar.i) {
                        zsVar.i = true;
                        String str4 = zsVar.g;
                        String str5 = str4 == null ? "" : str4;
                        ArrayList arrayList5 = new ArrayList();
                        for (int i13 = 0; i13 < arrayList4.size(); i13 = com.google.android.gms.internal.play_billing.k3.h(((TLRPC.User) arrayList4.get(i13)).id, arrayList5, i13, 1)) {
                        }
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i12);
                        messagesStorage.getStorageQueue().postRunnable(new ai.z(zsVar, messagesStorage, arrayList5, currentTimeMillis, str5, 10));
                    }
                    zsVar.c = false;
                    wsVar.run();
                    break;
                } else {
                    zsVar.g = null;
                    zsVar.e = true;
                    zsVar.c = false;
                    wsVar.run();
                    break;
                }
            case 28:
                xt xtVar = (xt) this.b;
                Bitmap decodeFile = BitmapFactory.decodeFile((String) this.c);
                Canvas canvas = new Canvas(Bitmap.createBitmap(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f), Bitmap.Config.ARGB_8888));
                Paint paint = new Paint(3);
                canvas.translate(r2.getWidth() / 2.0f, r2.getHeight() / 2.0f);
                float max = Math.max(r2.getWidth() / decodeFile.getWidth(), r2.getHeight() / decodeFile.getHeight());
                canvas.scale(max, max);
                canvas.drawBitmap(decodeFile, (-decodeFile.getWidth()) / 2.0f, (-decodeFile.getHeight()) / 2.0f, paint);
                AndroidUtilities.runOnUIThread(new ee(29, xtVar, decodeFile));
                break;
            default:
                ((xt) this.b).setImage((Bitmap) this.c);
                break;
        }
    }
}
