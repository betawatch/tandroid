package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.ColorMatrix;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final /* synthetic */ class qc implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qc(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10;
        MessageObject threadMessage;
        ArrayList<TLRPC.Document> arrayList;
        int i11 = this.a;
        int i12 = 2;
        int i13 = 0;
        int i14 = 1;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i11) {
            case 0:
                tc tcVar = (tc) obj3;
                MessagesController.PeerColors peerColors = (MessagesController.PeerColors) obj2;
                View view = (View) obj;
                tcVar.getClass();
                if (view instanceof sc) {
                    sc scVar = (sc) view;
                    scVar.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.d6, tcVar.a));
                    tcVar.b.getClass();
                    int R = RecyclerView.R(view);
                    if (peerColors != null && R >= 0 && R < peerColors.colors.size()) {
                        scVar.a(peerColors.colors.get(R));
                        break;
                    }
                }
                break;
            case 1:
                rg.k0 k0Var = (rg.k0) obj2;
                k0Var.G1((ChannelBoostsController.CanApplyBoost) obj);
                ((me) obj3).m0.showDialog(k0Var);
                break;
            case 2:
                yn ynVar = (yn) obj3;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = new TLRPC.TL_messages_sendQuickReplyMessages();
                tL_messages_sendQuickReplyMessages.peer = ynVar.getMessagesController().getInputPeer(ynVar.R5);
                tL_messages_sendQuickReplyMessages.shortcut_id = ((hg.a2) obj2).a;
                ynVar.getConnectionsManager().sendRequest(tL_messages_sendQuickReplyMessages, null);
                jk jkVar = ynVar.W;
                if (jkVar != null) {
                    jkVar.setFieldText(null);
                    break;
                }
                break;
            case 3:
                yn ynVar2 = (yn) obj3;
                SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of((String) obj2, ynVar2.R5, ynVar2.l5, ynVar2.V3, null, false, null, null, null, true, 0, 0, null, false);
                of2.sendMessageChatArguments = ynVar2.D8();
                of2.payStars = ((Long) obj).longValue();
                of2.monoForumPeer = ynVar2.O8();
                of2.suggestionParams = ynVar2.e5;
                ynVar2.getSendMessagesHelper().sendMessage(of2);
                ynVar2.W.setFieldText("");
                ynVar2.f9(false);
                break;
            case 4:
                yn ynVar3 = (yn) obj3;
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) obj2;
                Long l4 = (Long) obj;
                if (ynVar3.P3 == 1) {
                    org.telegram.ui.Components.e5.M(ynVar3.getParentActivity(), ynVar3.R5, new c7(ynVar3, botInlineResult, l4, i12), ynVar3.ca);
                    break;
                } else {
                    ynVar3.bb(botInlineResult, true, 0, l4.longValue());
                    break;
                }
            case 5:
                yn.p1((yn) obj3, (z31[]) obj2, (org.telegram.ui.Components.b80) obj);
                break;
            case 6:
                ((yn) obj3).gb = true;
                ((org.telegram.ui.ActionBar.g6) obj2).run();
                break;
            case 7:
                yn ynVar4 = (yn) obj3;
                org.telegram.ui.ActionBar.b2[] b2VarArr = (org.telegram.ui.ActionBar.b2[]) obj2;
                TL_stats.TL_statsPollStats tL_statsPollStats = (TL_stats.TL_statsPollStats) obj;
                try {
                    b2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                b2VarArr[0] = null;
                if (tL_statsPollStats != null) {
                    if (tL_statsPollStats.votes_graph instanceof TL_stats.TL_statsGraphError) {
                        org.telegram.messenger.q.p(R.string.PollStatsWillLater, org.telegram.ui.Components.yc.a0(ynVar4), R.raw.timer_toast, 24);
                        break;
                    } else {
                        new th.g(ynVar4.getParentActivity(), ynVar4.ca, tL_statsPollStats).show();
                        break;
                    }
                }
                break;
            case 8:
                yn ynVar5 = (yn) obj3;
                MessageObject messageObject = (MessageObject) obj2;
                ynVar5.getClass();
                TLRPC.SuggestedPost tl = ((MessageSuggestionParams) obj).toTl();
                if (messageObject != null && messageObject.messageOwner != null && tl != null) {
                    ynVar5.getMessagesController().addOfferToSuggestedMessage(messageObject, tl);
                    break;
                }
                break;
            case 9:
                hg.a2 a2Var = (hg.a2) obj2;
                String str = (String) obj;
                yn ynVar6 = ((lj) obj3).b;
                if (a2Var != null) {
                    i10 = ((org.telegram.ui.ActionBar.n2) ynVar6).currentAccount;
                    hg.b2.f(i10).k(a2Var.a, str);
                }
                ynVar6.O3 = str;
                ynVar6.Y0.setTitle(str);
                break;
            case 10:
                MessageObject messageObject2 = (MessageObject) obj2;
                Long l10 = (Long) obj;
                yn ynVar7 = ((kn) obj3).a;
                if (ynVar7.f7()) {
                    SendMessagesHelper.SendMessageParams of3 = SendMessagesHelper.SendMessageParams.of(messageObject2.getDiceEmoji(), ynVar7.R5, ynVar7.l5, ynVar7.V3, null, false, null, null, null, true, 0, 0, null, false);
                    of3.sendMessageChatArguments = ynVar7.D8();
                    of3.dice_stake = l10.longValue();
                    ynVar7.getSendMessagesHelper().sendMessage(of3);
                    break;
                }
                break;
            case 11:
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) obj2;
                yn ynVar8 = ((kn) obj3).a;
                if (((Boolean) obj).booleanValue()) {
                    for (int i15 = 0; i15 < ynVar8.v0.getChildCount(); i15++) {
                        View childAt = ynVar8.v0.getChildAt(i15);
                        if (childAt instanceof org.telegram.ui.Cells.u1) {
                            org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) childAt;
                            if (u1Var2.getMessageObject() != null && u1Var2.getMessageObject().isSensitive()) {
                                u1Var2.h4();
                            }
                        }
                    }
                    break;
                } else {
                    if (u1Var.getMessageObject() != null) {
                        u1Var.getMessageObject().isSensitiveCached = Boolean.FALSE;
                    }
                    u1Var.h4();
                    break;
                }
                break;
            case 12:
                kn knVar = (kn) obj3;
                qc qcVar = (qc) obj2;
                yn ynVar9 = knVar.a;
                if (((Boolean) obj).booleanValue()) {
                    ynVar9.getMessagesController().setContentSettings(true);
                    org.telegram.ui.Components.yc.a0(ynVar9).P(R.raw.chats_infotip, AndroidUtilities.replaceArrows(AndroidUtilities.premiumText(LocaleController.getString(R.string.SensitiveContentSettingsToast), new um(knVar, 8)), true)).k(true);
                    qcVar.run(Boolean.TRUE);
                    break;
                } else {
                    org.telegram.ui.Components.yc.a0(ynVar9).M(LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText), R.raw.error).j();
                    break;
                }
            case 13:
                TLRPC.Message message = (TLRPC.Message) obj2;
                ((kn) obj3).a.getMessagesController().rejectSuggestedMessage(DialogObject.getPeerDialogId(message.peer_id), message.id, (String) obj);
                break;
            case 14:
                bo boVar = (bo) obj3;
                boVar.f.t(((dg.a) obj).b, ((TLRPC.WallPaper) obj2).settings.intensity);
                View view2 = boVar.b;
                if (view2 != null) {
                    view2.invalidate();
                    break;
                }
                break;
            case 15:
                Long l11 = (Long) obj;
                ChatActivityEnterView chatActivityEnterView = ((org.telegram.ui.Components.qf) obj3).a;
                long j3 = chatActivityEnterView.Q2;
                MessageObject messageObject3 = chatActivityEnterView.T2;
                threadMessage = chatActivityEnterView.getThreadMessage();
                SendMessagesHelper.SendMessageParams of4 = SendMessagesHelper.SendMessageParams.of((String) obj2, j3, messageObject3, threadMessage, null, false, null, null, null, true, 0, 0, null, false);
                yn ynVar10 = chatActivityEnterView.P2;
                of4.sendMessageChatArguments = ynVar10 != null ? ynVar10.D8() : null;
                of4.effect_id = chatActivityEnterView.S4;
                of4.payStars = l11.longValue();
                of4.monoForumPeer = chatActivityEnterView.getSendMonoForumPeerId();
                of4.suggestionParams = chatActivityEnterView.getSendMessageSuggestionParams();
                SendMessagesHelper.getInstance(chatActivityEnterView.Q).sendMessage(of4);
                chatActivityEnterView.setFieldText("");
                chatActivityEnterView.m0.c();
                org.telegram.ui.Components.ze zeVar = chatActivityEnterView.J0;
                chatActivityEnterView.S4 = 0L;
                zeVar.setEffect(0L);
                break;
            case 16:
                org.telegram.ui.Components.xi xiVar = (org.telegram.ui.Components.xi) obj3;
                org.telegram.ui.Components.qi qiVar = (org.telegram.ui.Components.qi) obj2;
                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                int i16 = xiVar.J1;
                tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(i16).getInputUser(qiVar.c.bot_id);
                tL_messages_toggleBotInAttachMenu.enabled = true;
                tL_messages_toggleBotInAttachMenu.write_allowed = true;
                ConnectionsManager.getInstance(i16).sendRequest(tL_messages_toggleBotInAttachMenu, new no(6, xiVar, qiVar), 66);
                break;
            case 17:
                org.telegram.ui.Components.xi xiVar2 = (org.telegram.ui.Components.xi) obj3;
                ((yn) obj2).e5 = (MessageSuggestionParams) obj;
                boolean F1 = xiVar2.F1(0, true, 0, xiVar2.r1(), xiVar2.N0);
                org.telegram.ui.Components.of ofVar = xiVar2.h0;
                if (ofVar != null) {
                    ofVar.h(!F1);
                    xiVar2.h0 = null;
                    break;
                }
                break;
            case 18:
                ((ei.r4) obj3).getWebViewContainer().G((String) obj2, (String) obj, false);
                break;
            case 19:
                org.telegram.ui.Components.jj jjVar = (org.telegram.ui.Components.jj) obj3;
                MessagesController messagesController = (MessagesController) obj2;
                Long l12 = (Long) obj;
                jjVar.i0 = false;
                TLRPC.User user = l12 != null ? messagesController.getUser(l12) : null;
                jjVar.h0 = user;
                jjVar.j0 = user == null;
                if (user != null) {
                    jjVar.M();
                    break;
                }
                break;
            case 20:
                org.telegram.ui.Components.jl jlVar = ((org.telegram.ui.Components.gl) obj3).b;
                jlVar.x0.b(((org.telegram.ui.Components.il) obj2).c, jlVar.y0, true, 0, ((Long) obj).longValue());
                jlVar.b.dismiss(true);
                break;
            case 21:
                org.telegram.ui.Components.tv tvVar = (org.telegram.ui.Components.tv) obj3;
                boolean[] zArr = (boolean[]) obj2;
                if (((TLRPC.TL_messages_stickerSet) obj) == null && !zArr[0]) {
                    zArr[0] = true;
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.sv(tvVar, i14));
                    break;
                }
                break;
            case 22:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj3;
                org.telegram.ui.Components.yw ywVar = (org.telegram.ui.Components.yw) obj2;
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    linkedHashSet.addAll(tL_emojiList.document_id);
                }
                ywVar.run();
                break;
            case 23:
                org.telegram.ui.Components.my myVar = (org.telegram.ui.Components.my) obj3;
                org.telegram.ui.Components.ny nyVar = myVar.a;
                org.telegram.ui.Components.nz nzVar = nyVar.F;
                MediaDataController.getInstance(nzVar.c1).getEmojiSuggestions(nzVar.W0, nyVar.v, false, new ai.q5(myVar, (String) obj2, (Runnable) obj, 28), null, SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(nzVar.c1).isPremium(), false, true, 25);
                break;
            case 24:
                ArrayList arrayList2 = (ArrayList) obj2;
                Runnable runnable = (Runnable) obj;
                org.telegram.ui.Components.ny nyVar2 = ((org.telegram.ui.Components.my) obj3).a;
                if (ConnectionsManager.getInstance(nyVar2.F.c1).getConnectionState() != 3) {
                    runnable.run();
                    break;
                } else {
                    org.telegram.ui.Components.ny.E(nyVar2, runnable, arrayList2, false);
                    break;
                }
            case 25:
                org.telegram.ui.Components.gz gzVar = (org.telegram.ui.Components.gz) obj3;
                Runnable runnable2 = (Runnable) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                int size = arrayList3.size();
                while (i13 < size) {
                    Object obj4 = arrayList3.get(i13);
                    i13++;
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) obj4;
                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                        arrayList = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(gzVar.w.Q.c1).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                        arrayList = stickerSet != null ? stickerSet.documents : null;
                    } else {
                        arrayList = stickerSetCovered.covers;
                    }
                    if (arrayList != null && !arrayList.isEmpty()) {
                        gzVar.n.add(new org.telegram.ui.Components.gy(stickerSetCovered, arrayList));
                    }
                }
                runnable2.run();
                break;
            case 26:
                org.telegram.ui.Components.f10 f10Var = (org.telegram.ui.Components.f10) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj;
                if (f10Var.a0 != null || (f10Var.Z instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready)) {
                    org.telegram.ui.Components.rc M = org.telegram.ui.Components.yc.a0(n2Var).M(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FolderLinkUpdatedTitle, f10Var.f0)), arrayList4.size() <= 0 ? LocaleController.formatPluralString("FolderLinkUpdatedSubtitle", f10Var.h0.size(), new Object[0]) : LocaleController.formatPluralString("FolderLinkUpdatedJoinedSubtitle", arrayList4.size(), new Object[0]), R.raw.folder_in);
                    M.j = 5000;
                    M.j();
                    break;
                } else {
                    org.telegram.ui.Components.rc M2 = org.telegram.ui.Components.yc.a0(n2Var).M(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FolderLinkAddedTitle, f10Var.f0)), LocaleController.formatPluralString("FolderLinkAddedSubtitle", arrayList4.size(), new Object[0]), R.raw.contact_check);
                    M2.j = 5000;
                    M2.j();
                    break;
                }
            case 27:
                View view3 = (View) obj3;
                org.telegram.ui.Components.d dVar = (org.telegram.ui.Components.d) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (view3.getWidth() > 0 && view3.getHeight() > 0) {
                    view3.getLocationOnScreen(new int[2]);
                    int clamp = Utilities.clamp((int) ((r2[0] / AndroidUtilities.displaySize.x) * bitmap.getWidth()), bitmap.getWidth(), 0);
                    int clamp2 = Utilities.clamp((int) ((r2[1] / ((AndroidUtilities.displaySize.y + AndroidUtilities.statusBarHeight) + AndroidUtilities.navigationBarHeight)) * bitmap.getHeight()), bitmap.getHeight(), 0);
                    int clamp3 = Utilities.clamp((int) ((view3.getWidth() / AndroidUtilities.displaySize.x) * bitmap.getWidth()), bitmap.getWidth() - clamp, 0);
                    int clamp4 = Utilities.clamp((int) ((view3.getHeight() / ((AndroidUtilities.displaySize.y + AndroidUtilities.statusBarHeight) + AndroidUtilities.navigationBarHeight)) * bitmap.getHeight()), bitmap.getHeight() - clamp2, 0);
                    if ((clamp != 0 || clamp2 != 0 || clamp3 != bitmap.getWidth() || clamp4 != bitmap.getHeight()) && clamp3 > 0 && clamp4 > 0) {
                        bitmap = Bitmap.createBitmap(bitmap, clamp, clamp2, clamp3, clamp4);
                    }
                }
                ColorMatrix colorMatrix = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, org.telegram.ui.ActionBar.i6.I.q() ? 0.04f : 0.25f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, org.telegram.ui.ActionBar.i6.I.q() ? -0.04f : -0.07f);
                Bitmap applyColorMatrix = AndroidUtilities.applyColorMatrix(bitmap, colorMatrix);
                applyColorMatrix.setHasAlpha(false);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                colorMatrix2.setSaturation(org.telegram.ui.ActionBar.i6.I.q() ? 2.0f : 3.0f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, org.telegram.ui.ActionBar.i6.I.q() ? -0.2f : -0.07f);
                Bitmap applyColorMatrix2 = AndroidUtilities.applyColorMatrix(bitmap, colorMatrix2);
                applyColorMatrix2.setHasAlpha(false);
                bitmap.recycle();
                dVar.run(applyColorMatrix, applyColorMatrix2);
                break;
            case 28:
                MessagesController messagesController2 = (MessagesController) obj3;
                org.telegram.ui.Components.yr0 yr0Var = (org.telegram.ui.Components.yr0) obj2;
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (((Boolean) obj).booleanValue()) {
                    messagesController2.setContentSettings(true);
                    if (U != null) {
                        org.telegram.ui.Components.yc.a0(U).P(R.raw.chats_infotip, AndroidUtilities.replaceArrows(AndroidUtilities.premiumText(LocaleController.getString(R.string.SensitiveContentSettingsToast), new org.telegram.ui.Components.ud(i12, U)), true)).k(true);
                    }
                    yr0Var.run(Boolean.TRUE);
                    break;
                } else if (U != null) {
                    org.telegram.ui.Components.yc.a0(U).M(LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText), R.raw.error).j();
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.qv0.j((org.telegram.ui.Components.qv0) obj3, (TL_stories.StoryItem) obj2, (ai.e9) obj);
                break;
        }
    }
}
