package org.telegram.ui;

import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SharedPrefsHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ip implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ip(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                jp jpVar = (jp) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                jpVar.getClass();
                chat.join_request = true;
                jpVar.h = true;
                jpVar.c.setChecked(true);
                break;
            case 1:
                kr krVar = (kr) this.b;
                TLRPC.Updates updates = (TLRPC.Updates) this.c;
                krVar.getClass();
                krVar.getMessagesController().loadFullChat(updates.chats.get(0).id, 0, true);
                break;
            case 2:
                zq zqVar = (zq) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                kr krVar2 = zqVar.a;
                if (org.telegram.ui.Components.wc.a(krVar2)) {
                    org.telegram.ui.Components.wc.C(krVar2, user.first_name).j();
                    break;
                }
                break;
            case 3:
                ((org.telegram.ui.Components.e0) this.b).u0.unsave((TL_aicompose.TL_aiComposeTone) this.c);
                break;
            case 4:
                org.telegram.ui.Components.q qVar = (org.telegram.ui.Components.q) this.b;
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) this.c;
                qVar.getClass();
                org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(ProfileActivity.t4(tL_aiComposeTone.author_id));
                    qVar.dismiss();
                    break;
                }
                break;
            case 5:
                boolean[] zArr = (boolean[]) this.b;
                my0 my0Var = (my0) this.c;
                if (zArr[0]) {
                    my0Var.run();
                    break;
                }
                break;
            case 6:
                org.telegram.ui.Components.ha haVar = (org.telegram.ui.Components.ha) this.b;
                TLObject tLObject = (TLObject) this.c;
                haVar.getClass();
                if ((tLObject instanceof TLRPC.TL_help_appUpdate) && !((TLRPC.TL_help_appUpdate) tLObject).can_not_skip) {
                    haVar.setVisibility(8);
                    SharedConfig.pendingAppUpdate = null;
                    SharedConfig.saveConfig();
                    break;
                }
                break;
            case 7:
                org.telegram.ui.Components.qc qcVar = (org.telegram.ui.Components.qc) this.b;
                CharSequence charSequence = (CharSequence) this.c;
                qcVar.o = true;
                ViewParent viewParent = qcVar.e;
                if (viewParent instanceof org.telegram.ui.Components.vb) {
                    org.telegram.ui.Components.wb wbVar = (org.telegram.ui.Components.wb) ((org.telegram.ui.Components.vb) viewParent);
                    wbVar.b.setText(charSequence);
                    AndroidUtilities.updateViewShow(wbVar.d, false, false, true);
                    AndroidUtilities.updateViewShow(wbVar.b, true, false, true);
                }
                qcVar.i(true);
                break;
            case 8:
                boolean[] zArr2 = (boolean[]) this.b;
                Runnable runnable = (Runnable) this.c;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    runnable.run();
                    break;
                }
                break;
            case 9:
                ((org.telegram.ui.Components.jd) this.b).removeView((fi.v3) this.c);
                break;
            case 10:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.b;
                fi.v3 v3Var = (fi.v3) this.c;
                int i10 = ChatActivityEnterView.r5;
                chatActivityEnterView.removeView(v3Var);
                break;
            case 11:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) this.b;
                CharSequence charSequence2 = (CharSequence) this.c;
                int i11 = ChatActivityEnterView.r5;
                chatActivityEnterView2.setFieldText(charSequence2);
                chatActivityEnterView2.W = null;
                break;
            case 12:
                ChatActivityEnterView chatActivityEnterView3 = (ChatActivityEnterView) this.b;
                org.telegram.ui.Components.sd sdVar = (org.telegram.ui.Components.sd) this.c;
                int i12 = ChatActivityEnterView.r5;
                sdVar.run();
                SharedPrefsHelper.setWebViewConfirmShown(chatActivityEnterView3.Q, chatActivityEnterView3.Q2, true);
                break;
            case 13:
                org.telegram.ui.Components.sg sgVar = (org.telegram.ui.Components.sg) this.b;
                org.telegram.ui.Components.pg pgVar = (org.telegram.ui.Components.pg) this.c;
                ChatActivityEnterView chatActivityEnterView4 = sgVar.b0;
                chatActivityEnterView4.i1 = chatActivityEnterView4.h1.getAudioRightMs() - chatActivityEnterView4.h1.getAudioLeftMs();
                MediaController.getInstance().trimCurrentRecording(chatActivityEnterView4.h1.getAudioLeftMs(), chatActivityEnterView4.h1.getAudioRightMs(), pgVar);
                break;
            case 14:
                ((org.telegram.ui.Components.ti) this.b).containerView.removeView((fi.v3) this.c);
                break;
            case 15:
                org.telegram.ui.Components.ti tiVar = (org.telegram.ui.Components.ti) this.b;
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) this.c;
                tiVar.dismiss(true);
                if (r2Var != null) {
                    r2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    break;
                }
                break;
            case 16:
                org.telegram.ui.Components.ti tiVar2 = (org.telegram.ui.Components.ti) this.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.c;
                if (!tiVar2.isDismissed() && editTextBoldCursor.isFocusable() && editTextBoldCursor.hasFocus() && editTextBoldCursor.isShown()) {
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                    break;
                }
                break;
            case 17:
                org.telegram.ui.Components.ti tiVar3 = (org.telegram.ui.Components.ti) this.b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = (TLRPC.TL_attachMenuBot) this.c;
                MediaDataController.getInstance(tiVar3.M1).loadAttachMenuBots(false, true);
                if (tiVar3.B0 == tiVar3.A0.get(tL_attachMenuBot.bot_id)) {
                    tiVar3.X1(tiVar3.j0);
                    break;
                }
                break;
            case 18:
                org.telegram.ui.Components.ti tiVar4 = (org.telegram.ui.Components.ti) this.b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = ((org.telegram.ui.Components.mi) this.c).c;
                tL_attachMenuBot2.side_menu_disclaimer_needed = false;
                tL_attachMenuBot2.inactive = false;
                tiVar4.U1(tL_attachMenuBot2.bot_id, null, false, true);
                MediaDataController.getInstance(tiVar4.M1).updateAttachMenuBotsInCache();
                break;
            case 19:
                org.telegram.ui.Components.fj fjVar = (org.telegram.ui.Components.fj) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                fjVar.G = false;
                fjVar.H = arrayList;
                fjVar.S();
                break;
            case 20:
                AndroidUtilities.runOnUIThread(new ip(21, (org.telegram.ui.Components.wj) this.b, ((org.telegram.ui.Components.vj) this.c).run()));
                break;
            case 21:
                ((org.telegram.ui.Components.wj) this.b).setStatus((CharSequence) this.c);
                break;
            case 22:
                org.telegram.ui.Components.mk mkVar = (org.telegram.ui.Components.mk) this.b;
                String str = (String) this.c;
                mkVar.getClass();
                ArrayList arrayList2 = new ArrayList(mkVar.X.v.c);
                if (mkVar.X.v.d.isEmpty()) {
                    arrayList2.addAll(0, mkVar.X.v.e);
                }
                Utilities.searchQueue.postRunnable(new bi.s9(mkVar, str, !mkVar.R.isEmpty(), arrayList2, 18));
                break;
            case 23:
                org.telegram.ui.Components.mk mkVar2 = (org.telegram.ui.Components.mk) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                org.telegram.ui.Components.nk nkVar = mkVar2.X;
                boolean z10 = nkVar.b0;
                org.telegram.ui.Components.ck ckVar = nkVar.r;
                if (z10) {
                    s4.h0 adapter = ckVar.getAdapter();
                    org.telegram.ui.Components.mk mkVar3 = nkVar.y;
                    if (adapter != mkVar3) {
                        ckVar.setAdapter(mkVar3);
                    }
                }
                mkVar2.s = arrayList3;
                mkVar2.l();
                break;
            case 24:
                org.telegram.ui.Components.al alVar = (org.telegram.ui.Components.al) this.b;
                TLRPC.User user2 = (TLRPC.User) this.c;
                org.telegram.ui.Components.ti tiVar5 = alVar.b;
                tiVar5.dismiss();
                tiVar5.f0.presentFragment(un.ba(user2.id));
                break;
            case 25:
                org.telegram.messenger.t.q(R.string.WalletAddressCopiedBulletin, new org.telegram.ui.Components.wc((org.telegram.ui.Components.al) this.b, (org.telegram.ui.ActionBar.u6) this.c), R.raw.copy, 36);
                break;
            case 26:
                org.telegram.ui.Components.sl slVar = (org.telegram.ui.Components.sl) this.b;
                float[] fArr = (float[]) this.c;
                slVar.getClass();
                slVar.e0(fArr[0], fArr[1]);
                break;
            case 27:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.b;
                org.telegram.ui.Components.li liVar = (org.telegram.ui.Components.li) this.c;
                boolean z11 = ChatAttachAlertPhotoLayout.q1;
                int currentItemTop = liVar.getCurrentItemTop();
                int listTopPadding = liVar.getListTopPadding();
                org.telegram.ui.Components.fm fmVar = chatAttachAlertPhotoLayout.E;
                if (currentItemTop > AndroidUtilities.dp(8.0f)) {
                    listTopPadding -= currentItemTop;
                }
                fmVar.scrollBy(0, listTopPadding);
                break;
            case 28:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = (ChatAttachAlertPhotoLayout) this.b;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.c;
                org.telegram.ui.Components.pm pmVar = chatAttachAlertPhotoLayout2.P;
                if (pmVar != null) {
                    pmVar.setLayoutParams(layoutParams);
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.cn cnVar = (org.telegram.ui.Components.cn) this.b;
                org.telegram.ui.Components.li liVar2 = (org.telegram.ui.Components.li) this.c;
                int currentItemTop2 = liVar2.getCurrentItemTop();
                int listTopPadding2 = liVar2.getListTopPadding();
                bi.r1 r1Var = cnVar.r;
                if (currentItemTop2 > AndroidUtilities.dp(7.0f)) {
                    listTopPadding2 -= currentItemTop2;
                }
                r1Var.scrollBy(0, listTopPadding2);
                break;
        }
    }
}
