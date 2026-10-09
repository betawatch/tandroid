package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SharedPrefsHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ea implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ea(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        switch (this.a) {
            case 0:
                ga gaVar = (ga) this.b;
                TLObject tLObject = (TLObject) this.c;
                gaVar.getClass();
                if ((tLObject instanceof TLRPC.TL_help_appUpdate) && !((TLRPC.TL_help_appUpdate) tLObject).can_not_skip) {
                    gaVar.setVisibility(8);
                    SharedConfig.pendingAppUpdate = null;
                    SharedConfig.saveConfig();
                    break;
                }
                break;
            case 1:
                tc tcVar = (tc) this.b;
                CharSequence charSequence = (CharSequence) this.c;
                tcVar.n = true;
                ViewParent viewParent = tcVar.e;
                if (viewParent instanceof yb) {
                    zb zbVar = (zb) ((yb) viewParent);
                    zbVar.b.setText(charSequence);
                    AndroidUtilities.updateViewShow(zbVar.d, false, false, true);
                    AndroidUtilities.updateViewShow(zbVar.b, true, false, true);
                }
                tcVar.i(true);
                break;
            case 2:
                boolean[] zArr = (boolean[]) this.b;
                Runnable runnable = (Runnable) this.c;
                if (!zArr[0]) {
                    zArr[0] = true;
                    runnable.run();
                    break;
                }
                break;
            case 3:
                ((od) this.b).removeView((ci.d4) this.c);
                break;
            case 4:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.b;
                ci.d4 d4Var = (ci.d4) this.c;
                int i10 = ChatActivityEnterView.n5;
                chatActivityEnterView.removeView(d4Var);
                break;
            case 5:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) this.b;
                CharSequence charSequence2 = (CharSequence) this.c;
                int i11 = ChatActivityEnterView.n5;
                chatActivityEnterView2.setFieldText(charSequence2);
                chatActivityEnterView2.W = null;
                break;
            case 6:
                ChatActivityEnterView chatActivityEnterView3 = (ChatActivityEnterView) this.b;
                vd vdVar = (vd) this.c;
                int i12 = ChatActivityEnterView.n5;
                vdVar.run();
                SharedPrefsHelper.setWebViewConfirmShown(chatActivityEnterView3.Q, chatActivityEnterView3.Q2, true);
                break;
            case 7:
                ug ugVar = (ug) this.b;
                rg rgVar = (rg) this.c;
                ChatActivityEnterView chatActivityEnterView4 = ugVar.V;
                chatActivityEnterView4.i1 = chatActivityEnterView4.h1.getAudioRightMs() - chatActivityEnterView4.h1.getAudioLeftMs();
                MediaController.getInstance().trimCurrentRecording(chatActivityEnterView4.h1.getAudioLeftMs(), chatActivityEnterView4.h1.getAudioRightMs(), rgVar);
                break;
            case 8:
                ((yi) this.b).containerView.removeView((ci.d4) this.c);
                break;
            case 9:
                yi yiVar = (yi) this.b;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.c;
                yiVar.dismiss(true);
                if (n2Var != null) {
                    n2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    break;
                }
                break;
            case 10:
                yi yiVar2 = (yi) this.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.c;
                if (!yiVar2.isDismissed() && editTextBoldCursor.isFocusable() && editTextBoldCursor.hasFocus() && editTextBoldCursor.isShown()) {
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                    break;
                }
                break;
            case 11:
                yi yiVar3 = (yi) this.b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = ((ri) this.c).c;
                tL_attachMenuBot.side_menu_disclaimer_needed = false;
                tL_attachMenuBot.inactive = false;
                yiVar3.R1(tL_attachMenuBot.bot_id, null, false, true);
                MediaDataController.getInstance(yiVar3.M1).updateAttachMenuBotsInCache();
                break;
            case 12:
                yi yiVar4 = (yi) this.b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = (TLRPC.TL_attachMenuBot) this.c;
                MediaDataController.getInstance(yiVar4.M1).loadAttachMenuBots(false, true);
                if (yiVar4.B0 == yiVar4.A0.get(tL_attachMenuBot2.bot_id)) {
                    yiVar4.U1(yiVar4.j0);
                    break;
                }
                break;
            case 13:
                kj kjVar = (kj) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                kjVar.G = false;
                kjVar.H = arrayList;
                kjVar.S();
                break;
            case 14:
                kj kjVar2 = (kj) this.b;
                ((yi) this.c).b1();
                kjVar2.O();
                kjVar2.b.b2(kjVar2, 0);
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new ea(16, (bk) this.b, ((ak) this.c).run()));
                break;
            case 16:
                ((bk) this.b).setStatus((CharSequence) this.c);
                break;
            case 17:
                rk rkVar = (rk) this.b;
                String str2 = (String) this.c;
                rkVar.getClass();
                ArrayList arrayList2 = new ArrayList(rkVar.X.v.c);
                if (rkVar.X.v.d.isEmpty()) {
                    arrayList2.addAll(0, rkVar.X.v.e);
                }
                Utilities.searchQueue.postRunnable(new ai.t4(rkVar, str2, !rkVar.R.isEmpty(), arrayList2, 18));
                break;
            case 18:
                rk rkVar2 = (rk) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                sk skVar = rkVar2.X;
                boolean z10 = skVar.b0;
                hk hkVar = skVar.r;
                if (z10) {
                    s4.i0 adapter = hkVar.getAdapter();
                    rk rkVar3 = skVar.y;
                    if (adapter != rkVar3) {
                        hkVar.setAdapter(rkVar3);
                    }
                }
                rkVar2.s = arrayList3;
                rkVar2.l();
                break;
            case 19:
                gl glVar = (gl) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                yi yiVar5 = glVar.b;
                yiVar5.dismiss();
                yiVar5.f0.presentFragment(org.telegram.ui.zn.W9(user.id));
                break;
            case 20:
                org.telegram.messenger.q.q(R.string.WalletAddressCopiedBulletin, new ad((gl) this.b, (org.telegram.ui.ActionBar.e6) this.c), R.raw.copy, 36);
                break;
            case 21:
                xl xlVar = (xl) this.b;
                float[] fArr = (float[]) this.c;
                xlVar.getClass();
                xlVar.e0(fArr[0], fArr[1]);
                break;
            case 22:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.b;
                qi qiVar = (qi) this.c;
                boolean z11 = ChatAttachAlertPhotoLayout.q1;
                int currentItemTop = qiVar.getCurrentItemTop();
                int listTopPadding = qiVar.getListTopPadding();
                km kmVar = chatAttachAlertPhotoLayout.E;
                if (currentItemTop > AndroidUtilities.dp(8.0f)) {
                    listTopPadding -= currentItemTop;
                }
                kmVar.scrollBy(0, listTopPadding);
                break;
            case 23:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = (ChatAttachAlertPhotoLayout) this.b;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.c;
                um umVar = chatAttachAlertPhotoLayout2.P;
                if (umVar != null) {
                    umVar.setLayoutParams(layoutParams);
                    break;
                }
                break;
            case 24:
                hn hnVar = (hn) this.b;
                qi qiVar2 = (qi) this.c;
                int currentItemTop2 = qiVar2.getCurrentItemTop();
                int listTopPadding2 = qiVar2.getListTopPadding();
                ai.w0 w0Var = hnVar.r;
                if (currentItemTop2 > AndroidUtilities.dp(7.0f)) {
                    listTopPadding2 -= currentItemTop2;
                }
                w0Var.scrollBy(0, listTopPadding2);
                break;
            case 25:
                xo xoVar = (xo) this.b;
                hg.h hVar = (hg.h) this.c;
                zo.a(xoVar.c);
                hVar.run();
                break;
            case 26:
                ((xp) this.b).b.z((List) this.c);
                break;
            case 27:
                ((yp) this.b).b.z((List) this.c);
                break;
            case 28:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.b;
                Context context = (Context) this.c;
                f3Var.dismiss();
                of.f.s(context, "https://t.me/BotFather?start=deletebot");
                break;
            default:
                org.telegram.ui.Cells.j3 j3Var = (org.telegram.ui.Cells.j3) this.b;
                Set set = (Set) this.c;
                String charSequence3 = j3Var.getText().toString();
                org.telegram.ui.Cells.h3 h3Var = j3Var.b;
                Iterator it = set.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str = "bot";
                    } else if (charSequence3.endsWith((String) it.next())) {
                        str = "";
                    }
                }
                h3Var.setRightText(str);
                break;
        }
    }
}
