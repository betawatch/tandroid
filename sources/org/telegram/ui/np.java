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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class np implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ np(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                op opVar = (op) this.b;
                org.telegram.ui.Components.k80 k80Var = (org.telegram.ui.Components.k80) this.c;
                opVar.x.d.M = false;
                k80Var.run();
                break;
            case 1:
                op opVar2 = (op) this.b;
                org.telegram.ui.Components.l80 l80Var = (org.telegram.ui.Components.l80) this.c;
                opVar2.x.d.L = false;
                l80Var.run();
                break;
            case 2:
                op opVar3 = (op) this.b;
                Runnable runnable = (Runnable) this.c;
                sp spVar = opVar3.x.d;
                spVar.L = false;
                spVar.M = false;
                runnable.run();
                break;
            case 3:
                op opVar4 = (op) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                opVar4.getClass();
                chat.join_request = true;
                opVar4.h = true;
                opVar4.c.setChecked(true);
                break;
            case 4:
                rr rrVar = (rr) this.b;
                TLRPC.Updates updates = (TLRPC.Updates) this.c;
                rrVar.getClass();
                rrVar.getMessagesController().loadFullChat(updates.chats.get(0).id, 0, true);
                break;
            case 5:
                gr grVar = (gr) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                rr rrVar2 = grVar.a;
                if (org.telegram.ui.Components.qc.a(rrVar2)) {
                    org.telegram.ui.Components.qc.C(rrVar2, user.first_name).j();
                    break;
                }
                break;
            case 6:
                ((org.telegram.ui.Components.f0) this.b).r0.unsave((TL_aicompose.TL_aiComposeTone) this.c);
                break;
            case 7:
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
            case 8:
                boolean[] zArr = (boolean[]) this.b;
                sz0 sz0Var = (sz0) this.c;
                if (zArr[0]) {
                    sz0Var.run();
                    break;
                }
                break;
            case 9:
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
            case 10:
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
            case 11:
                boolean[] zArr2 = (boolean[]) this.b;
                Runnable runnable2 = (Runnable) this.c;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    runnable2.run();
                    break;
                }
                break;
            case 12:
                ((org.telegram.ui.Components.bd) this.b).removeView((ph.f3) this.c);
                break;
            case 13:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.b;
                ph.f3 f3Var = (ph.f3) this.c;
                int i10 = ChatActivityEnterView.j5;
                chatActivityEnterView.removeView(f3Var);
                break;
            case 14:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) this.b;
                CharSequence charSequence2 = (CharSequence) this.c;
                int i11 = ChatActivityEnterView.j5;
                chatActivityEnterView2.setFieldText(charSequence2);
                chatActivityEnterView2.T = null;
                break;
            case 15:
                ChatActivityEnterView chatActivityEnterView3 = (ChatActivityEnterView) this.b;
                org.telegram.ui.Components.id idVar = (org.telegram.ui.Components.id) this.c;
                int i12 = ChatActivityEnterView.j5;
                idVar.run();
                SharedPrefsHelper.setWebViewConfirmShown(chatActivityEnterView3.N, chatActivityEnterView3.M2, true);
                break;
            case 16:
                org.telegram.ui.Components.ig igVar = (org.telegram.ui.Components.ig) this.b;
                org.telegram.ui.Components.fg fgVar = (org.telegram.ui.Components.fg) this.c;
                ChatActivityEnterView chatActivityEnterView4 = igVar.S;
                chatActivityEnterView4.f1 = chatActivityEnterView4.e1.getAudioRightMs() - chatActivityEnterView4.e1.getAudioLeftMs();
                MediaController.getInstance().trimCurrentRecording(chatActivityEnterView4.e1.getAudioLeftMs(), chatActivityEnterView4.e1.getAudioRightMs(), fgVar);
                break;
            case 17:
                ((org.telegram.ui.Components.li) this.b).containerView.removeView((ph.f3) this.c);
                break;
            case 18:
                org.telegram.ui.Components.li liVar = (org.telegram.ui.Components.li) this.b;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.c;
                liVar.dismiss(true);
                if (p2Var != null) {
                    p2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    break;
                }
                break;
            case 19:
                org.telegram.ui.Components.li liVar2 = (org.telegram.ui.Components.li) this.b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = ((org.telegram.ui.Components.ei) this.c).c;
                tL_attachMenuBot.side_menu_disclaimer_needed = false;
                tL_attachMenuBot.inactive = false;
                liVar2.N1(tL_attachMenuBot.bot_id, null, false, true);
                MediaDataController.getInstance(liVar2.G1).updateAttachMenuBotsInCache();
                break;
            case 20:
                org.telegram.ui.Components.li liVar3 = (org.telegram.ui.Components.li) this.b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = (TLRPC.TL_attachMenuBot) this.c;
                MediaDataController.getInstance(liVar3.G1).loadAttachMenuBots(false, true);
                if (liVar3.v0 == liVar3.u0.get(tL_attachMenuBot2.bot_id)) {
                    liVar3.Q1(liVar3.g0);
                    break;
                }
                break;
            case 21:
                org.telegram.ui.Components.wi wiVar = (org.telegram.ui.Components.wi) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                wiVar.E = false;
                wiVar.F = arrayList;
                wiVar.P();
                break;
            case 22:
                org.telegram.ui.Components.wi wiVar2 = (org.telegram.ui.Components.wi) this.b;
                ((org.telegram.ui.Components.li) this.c).Z0();
                wiVar2.K();
                wiVar2.b.X1(wiVar2, 0);
                break;
            case 23:
                AndroidUtilities.runOnUIThread(new np(24, (org.telegram.ui.Components.pj) this.b, ((org.telegram.ui.Components.oj) this.c).run()));
                break;
            case 24:
                ((org.telegram.ui.Components.pj) this.b).setStatus((CharSequence) this.c);
                break;
            case 25:
                org.telegram.ui.Components.gk gkVar = (org.telegram.ui.Components.gk) this.b;
                String str = (String) this.c;
                gkVar.getClass();
                ArrayList arrayList2 = new ArrayList(gkVar.U.v.c);
                if (gkVar.U.v.d.isEmpty()) {
                    arrayList2.addAll(0, gkVar.U.v.e);
                }
                Utilities.searchQueue.postRunnable(new cg.u0(gkVar, str, !gkVar.O.isEmpty(), arrayList2, 13));
                break;
            case 26:
                org.telegram.ui.Components.gk gkVar2 = (org.telegram.ui.Components.gk) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                org.telegram.ui.Components.hk hkVar = gkVar2.U;
                boolean z4 = hkVar.V;
                org.telegram.ui.Components.vj vjVar = hkVar.r;
                if (z4) {
                    f2.o0 adapter = vjVar.getAdapter();
                    org.telegram.ui.Components.gk gkVar3 = hkVar.y;
                    if (adapter != gkVar3) {
                        vjVar.setAdapter(gkVar3);
                    }
                }
                gkVar2.s = arrayList3;
                gkVar2.l();
                break;
            case 27:
                org.telegram.ui.Components.al alVar = (org.telegram.ui.Components.al) this.b;
                float[] fArr = (float[]) this.c;
                alVar.getClass();
                alVar.b0(fArr[0], fArr[1]);
                break;
            case 28:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.b;
                org.telegram.ui.Components.di diVar = (org.telegram.ui.Components.di) this.c;
                boolean z10 = ChatAttachAlertPhotoLayout.n1;
                int currentItemTop = diVar.getCurrentItemTop();
                int listTopPadding = diVar.getListTopPadding();
                org.telegram.ui.Components.ol olVar = chatAttachAlertPhotoLayout.B;
                if (currentItemTop > AndroidUtilities.dp(8.0f)) {
                    listTopPadding -= currentItemTop;
                }
                olVar.scrollBy(0, listTopPadding);
                break;
            default:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = (ChatAttachAlertPhotoLayout) this.b;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.c;
                org.telegram.ui.Components.zl zlVar = chatAttachAlertPhotoLayout2.M;
                if (zlVar != null) {
                    zlVar.setLayoutParams(layoutParams);
                    break;
                }
                break;
        }
    }
}
