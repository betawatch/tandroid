package org.telegram.ui;

import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SharedPrefsHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mp(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                np npVar = (np) this.b;
                org.telegram.ui.Components.m80 m80Var = (org.telegram.ui.Components.m80) this.c;
                npVar.x.d.L = false;
                m80Var.run();
                break;
            case 1:
                np npVar2 = (np) this.b;
                Runnable runnable = (Runnable) this.c;
                rp rpVar = npVar2.x.d;
                rpVar.L = false;
                rpVar.M = false;
                runnable.run();
                break;
            case 2:
                np npVar3 = (np) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                npVar3.getClass();
                chat.join_request = true;
                npVar3.h = true;
                npVar3.c.setChecked(true);
                break;
            case 3:
                qr qrVar = (qr) this.b;
                TLRPC.Updates updates = (TLRPC.Updates) this.c;
                qrVar.getClass();
                qrVar.getMessagesController().loadFullChat(updates.chats.get(0).id, 0, true);
                break;
            case 4:
                fr frVar = (fr) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                qr qrVar2 = frVar.a;
                if (org.telegram.ui.Components.qc.a(qrVar2)) {
                    org.telegram.ui.Components.qc.C(qrVar2, user.first_name).j();
                    break;
                }
                break;
            case 5:
                ((org.telegram.ui.Components.f0) this.b).r0.unsave((TL_aicompose.TL_aiComposeTone) this.c);
                break;
            case 6:
                org.telegram.ui.Components.r rVar = (org.telegram.ui.Components.r) this.b;
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) this.c;
                rVar.getClass();
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(ProfileActivity.m4(tL_aiComposeTone.author_id));
                    rVar.dismiss();
                    break;
                }
                break;
            case 7:
                boolean[] zArr = (boolean[]) this.b;
                sz0 sz0Var = (sz0) this.c;
                if (zArr[0]) {
                    sz0Var.run();
                    break;
                }
                break;
            case 8:
                org.telegram.ui.Components.v9 v9Var = (org.telegram.ui.Components.v9) this.b;
                TLObject tLObject = (TLObject) this.c;
                v9Var.getClass();
                if ((tLObject instanceof TLRPC.TL_help_appUpdate) && !((TLRPC.TL_help_appUpdate) tLObject).can_not_skip) {
                    v9Var.setVisibility(8);
                    SharedConfig.pendingAppUpdate = null;
                    SharedConfig.saveConfig();
                    break;
                }
                break;
            case 9:
                org.telegram.ui.Components.ic icVar = (org.telegram.ui.Components.ic) this.b;
                CharSequence charSequence = (CharSequence) this.c;
                icVar.n = true;
                ViewParent viewParent = icVar.e;
                if (viewParent instanceof org.telegram.ui.Components.ob) {
                    org.telegram.ui.Components.pb pbVar = (org.telegram.ui.Components.pb) ((org.telegram.ui.Components.ob) viewParent);
                    pbVar.b.setText(charSequence);
                    AndroidUtilities.updateViewShow(pbVar.d, false, false, true);
                    AndroidUtilities.updateViewShow(pbVar.b, true, false, true);
                }
                icVar.i(true);
                break;
            case 10:
                boolean[] zArr2 = (boolean[]) this.b;
                Runnable runnable2 = (Runnable) this.c;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    runnable2.run();
                    break;
                }
                break;
            case 11:
                ((org.telegram.ui.Components.bd) this.b).removeView((qh.e3) this.c);
                break;
            case 12:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.b;
                qh.e3 e3Var = (qh.e3) this.c;
                int i10 = ChatActivityEnterView.j5;
                chatActivityEnterView.removeView(e3Var);
                break;
            case 13:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) this.b;
                CharSequence charSequence2 = (CharSequence) this.c;
                int i11 = ChatActivityEnterView.j5;
                chatActivityEnterView2.setFieldText(charSequence2);
                chatActivityEnterView2.T = null;
                break;
            case 14:
                ChatActivityEnterView chatActivityEnterView3 = (ChatActivityEnterView) this.b;
                org.telegram.ui.Components.id idVar = (org.telegram.ui.Components.id) this.c;
                int i12 = ChatActivityEnterView.j5;
                idVar.run();
                SharedPrefsHelper.setWebViewConfirmShown(chatActivityEnterView3.N, chatActivityEnterView3.M2, true);
                break;
            case 15:
                org.telegram.ui.Components.ig igVar = (org.telegram.ui.Components.ig) this.b;
                org.telegram.ui.Components.fg fgVar = (org.telegram.ui.Components.fg) this.c;
                ChatActivityEnterView chatActivityEnterView4 = igVar.S;
                chatActivityEnterView4.f1 = chatActivityEnterView4.e1.getAudioRightMs() - chatActivityEnterView4.e1.getAudioLeftMs();
                MediaController.getInstance().trimCurrentRecording(chatActivityEnterView4.e1.getAudioLeftMs(), chatActivityEnterView4.e1.getAudioRightMs(), fgVar);
                break;
            case 16:
                ((org.telegram.ui.Components.mi) this.b).containerView.removeView((qh.e3) this.c);
                break;
            case 17:
                org.telegram.ui.Components.mi miVar = (org.telegram.ui.Components.mi) this.b;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.c;
                miVar.dismiss(true);
                if (p2Var != null) {
                    p2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    break;
                }
                break;
            case 18:
                org.telegram.ui.Components.mi miVar2 = (org.telegram.ui.Components.mi) this.b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = ((org.telegram.ui.Components.fi) this.c).c;
                tL_attachMenuBot.side_menu_disclaimer_needed = false;
                tL_attachMenuBot.inactive = false;
                miVar2.N1(tL_attachMenuBot.bot_id, null, false, true);
                MediaDataController.getInstance(miVar2.G1).updateAttachMenuBotsInCache();
                break;
            case 19:
                org.telegram.ui.Components.mi miVar3 = (org.telegram.ui.Components.mi) this.b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = (TLRPC.TL_attachMenuBot) this.c;
                MediaDataController.getInstance(miVar3.G1).loadAttachMenuBots(false, true);
                if (miVar3.v0 == miVar3.u0.get(tL_attachMenuBot2.bot_id)) {
                    miVar3.Q1(miVar3.g0);
                    break;
                }
                break;
            case 20:
                org.telegram.ui.Components.xi xiVar = (org.telegram.ui.Components.xi) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                xiVar.E = false;
                xiVar.F = arrayList;
                xiVar.P();
                break;
            case 21:
                org.telegram.ui.Components.xi xiVar2 = (org.telegram.ui.Components.xi) this.b;
                ((org.telegram.ui.Components.mi) this.c).Z0();
                xiVar2.K();
                xiVar2.b.X1(xiVar2, 0);
                break;
            case 22:
                AndroidUtilities.runOnUIThread(new mp(23, (org.telegram.ui.Components.rj) this.b, ((org.telegram.ui.Components.qj) this.c).run()));
                break;
            case 23:
                ((org.telegram.ui.Components.rj) this.b).setStatus((CharSequence) this.c);
                break;
            case 24:
                org.telegram.ui.Components.ik ikVar = (org.telegram.ui.Components.ik) this.b;
                String str = (String) this.c;
                ikVar.getClass();
                ArrayList arrayList2 = new ArrayList(ikVar.U.v.c);
                if (ikVar.U.v.d.isEmpty()) {
                    arrayList2.addAll(0, ikVar.U.v.e);
                }
                Utilities.searchQueue.postRunnable(new dg.t0(ikVar, str, !ikVar.O.isEmpty(), arrayList2, 13));
                break;
            case 25:
                org.telegram.ui.Components.ik ikVar2 = (org.telegram.ui.Components.ik) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                org.telegram.ui.Components.jk jkVar = ikVar2.U;
                boolean z4 = jkVar.V;
                org.telegram.ui.Components.xj xjVar = jkVar.r;
                if (z4) {
                    f2.p0 adapter = xjVar.getAdapter();
                    org.telegram.ui.Components.ik ikVar3 = jkVar.y;
                    if (adapter != ikVar3) {
                        xjVar.setAdapter(ikVar3);
                    }
                }
                ikVar2.s = arrayList3;
                ikVar2.l();
                break;
            case 26:
                org.telegram.ui.Components.cl clVar = (org.telegram.ui.Components.cl) this.b;
                float[] fArr = (float[]) this.c;
                clVar.getClass();
                clVar.b0(fArr[0], fArr[1]);
                break;
            case 27:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.b;
                org.telegram.ui.Components.ei eiVar = (org.telegram.ui.Components.ei) this.c;
                boolean z10 = ChatAttachAlertPhotoLayout.n1;
                int currentItemTop = eiVar.getCurrentItemTop();
                int listTopPadding = eiVar.getListTopPadding();
                org.telegram.ui.Components.ql qlVar = chatAttachAlertPhotoLayout.B;
                if (currentItemTop > AndroidUtilities.dp(8.0f)) {
                    listTopPadding -= currentItemTop;
                }
                qlVar.scrollBy(0, listTopPadding);
                break;
            case 28:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = (ChatAttachAlertPhotoLayout) this.b;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.c;
                org.telegram.ui.Components.bm bmVar = chatAttachAlertPhotoLayout2.M;
                if (bmVar != null) {
                    bmVar.setLayoutParams(layoutParams);
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.pm pmVar = (org.telegram.ui.Components.pm) this.b;
                org.telegram.ui.Components.ei eiVar2 = (org.telegram.ui.Components.ei) this.c;
                int currentItemTop2 = eiVar2.getCurrentItemTop();
                int listTopPadding2 = eiVar2.getListTopPadding();
                mh.d1 d1Var = pmVar.r;
                if (currentItemTop2 > AndroidUtilities.dp(7.0f)) {
                    listTopPadding2 -= currentItemTop2;
                }
                d1Var.scrollBy(0, listTopPadding2);
                break;
        }
    }
}
