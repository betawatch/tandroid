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

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oc implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ oc(int i10, Object obj, Object obj2) {
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
                rc rcVar = (rc) obj3;
                MessagesController.PeerColors peerColors = (MessagesController.PeerColors) obj2;
                View view = (View) obj;
                rcVar.getClass();
                if (view instanceof qc) {
                    qc qcVar = (qc) view;
                    qcVar.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.d6, rcVar.a));
                    rcVar.b.getClass();
                    int R = RecyclerView.R(view);
                    if (peerColors != null && R >= 0 && R < peerColors.colors.size()) {
                        qcVar.a(peerColors.colors.get(R));
                        break;
                    }
                }
                break;
            case 1:
                rg.j0 j0Var = (rg.j0) obj2;
                j0Var.G1((ChannelBoostsController.CanApplyBoost) obj);
                ((je) obj3).w0.showDialog(j0Var);
                break;
            case 2:
                wn wnVar = (wn) obj3;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = new TLRPC.TL_messages_sendQuickReplyMessages();
                tL_messages_sendQuickReplyMessages.peer = wnVar.getMessagesController().getInputPeer(wnVar.T5);
                tL_messages_sendQuickReplyMessages.shortcut_id = ((hg.b2) obj2).a;
                wnVar.getConnectionsManager().sendRequest(tL_messages_sendQuickReplyMessages, null);
                jk jkVar = wnVar.Y;
                if (jkVar != null) {
                    jkVar.setFieldText(null);
                    break;
                }
                break;
            case 3:
                wn wnVar2 = (wn) obj3;
                SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of((String) obj2, wnVar2.T5, wnVar2.n5, wnVar2.X3, null, false, null, null, null, true, 0, 0, null, false);
                of2.sendMessageChatArguments = wnVar2.C8();
                of2.payStars = ((Long) obj).longValue();
                of2.monoForumPeer = wnVar2.N8();
                of2.suggestionParams = wnVar2.g5;
                wnVar2.getSendMessagesHelper().sendMessage(of2);
                wnVar2.Y.setFieldText("");
                wnVar2.e9(false);
                break;
            case 4:
                wn wnVar3 = (wn) obj3;
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) obj2;
                Long l4 = (Long) obj;
                if (wnVar3.R3 == 1) {
                    org.telegram.ui.Components.e5.M(wnVar3.getParentActivity(), wnVar3.T5, new b7(wnVar3, botInlineResult, l4, i12), wnVar3.ea);
                    break;
                } else {
                    wnVar3.cb(botInlineResult, true, 0, l4.longValue());
                    break;
                }
            case 5:
                wn.A0((wn) obj3, (z31[]) obj2, (org.telegram.ui.Components.y70) obj);
                break;
            case 6:
                ((wn) obj3).ib = true;
                ((org.telegram.ui.ActionBar.a6) obj2).run();
                break;
            case 7:
                wn wnVar4 = (wn) obj3;
                org.telegram.ui.ActionBar.a2[] a2VarArr = (org.telegram.ui.ActionBar.a2[]) obj2;
                TL_stats.TL_statsPollStats tL_statsPollStats = (TL_stats.TL_statsPollStats) obj;
                try {
                    a2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                a2VarArr[0] = null;
                if (tL_statsPollStats != null) {
                    if (tL_statsPollStats.votes_graph instanceof TL_stats.TL_statsGraphError) {
                        org.telegram.messenger.f0.p(R.string.PollStatsWillLater, org.telegram.ui.Components.yc.a0(wnVar4), R.raw.timer_toast, 24);
                        break;
                    } else {
                        new th.g(wnVar4.getParentActivity(), wnVar4.ea, tL_statsPollStats).show();
                        break;
                    }
                }
                break;
            case 8:
                wn wnVar5 = (wn) obj3;
                MessageObject messageObject = (MessageObject) obj2;
                wnVar5.getClass();
                TLRPC.SuggestedPost tl = ((MessageSuggestionParams) obj).toTl();
                if (messageObject != null && messageObject.messageOwner != null && tl != null) {
                    wnVar5.getMessagesController().addOfferToSuggestedMessage(messageObject, tl);
                    break;
                }
                break;
            case 9:
                hg.b2 b2Var = (hg.b2) obj2;
                String str = (String) obj;
                wn wnVar6 = ((kj) obj3).b;
                if (b2Var != null) {
                    i10 = ((org.telegram.ui.ActionBar.m2) wnVar6).currentAccount;
                    hg.c2.f(i10).k(b2Var.a, str);
                }
                wnVar6.Q3 = str;
                wnVar6.a1.setTitle(str);
                break;
            case 10:
                MessageObject messageObject2 = (MessageObject) obj2;
                Long l10 = (Long) obj;
                wn wnVar7 = ((in) obj3).a;
                if (wnVar7.f7()) {
                    SendMessagesHelper.SendMessageParams of3 = SendMessagesHelper.SendMessageParams.of(messageObject2.getDiceEmoji(), wnVar7.T5, wnVar7.n5, wnVar7.X3, null, false, null, null, null, true, 0, 0, null, false);
                    of3.sendMessageChatArguments = wnVar7.C8();
                    of3.dice_stake = l10.longValue();
                    wnVar7.getSendMessagesHelper().sendMessage(of3);
                    break;
                }
                break;
            case 11:
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) obj2;
                wn wnVar8 = ((in) obj3).a;
                if (((Boolean) obj).booleanValue()) {
                    for (int i15 = 0; i15 < wnVar8.x0.getChildCount(); i15++) {
                        View childAt = wnVar8.x0.getChildAt(i15);
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
                in inVar = (in) obj3;
                oc ocVar = (oc) obj2;
                wn wnVar9 = inVar.a;
                if (((Boolean) obj).booleanValue()) {
                    wnVar9.getMessagesController().setContentSettings(true);
                    org.telegram.ui.Components.yc.a0(wnVar9).P(R.raw.chats_infotip, AndroidUtilities.replaceArrows(AndroidUtilities.premiumText(LocaleController.getString(R.string.SensitiveContentSettingsToast), new tm(inVar, 8)), true)).k(true);
                    ocVar.run(Boolean.TRUE);
                    break;
                } else {
                    org.telegram.ui.Components.yc.a0(wnVar9).M(LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText), R.raw.error).j();
                    break;
                }
            case 13:
                TLRPC.Message message = (TLRPC.Message) obj2;
                ((in) obj3).a.getMessagesController().rejectSuggestedMessage(DialogObject.getPeerDialogId(message.peer_id), message.id, (String) obj);
                break;
            case 14:
                zn znVar = (zn) obj3;
                znVar.f.t(((dg.a) obj).b, ((TLRPC.WallPaper) obj2).settings.intensity);
                View view2 = znVar.b;
                if (view2 != null) {
                    view2.invalidate();
                    break;
                }
                break;
            case 15:
                Long l11 = (Long) obj;
                ChatActivityEnterView chatActivityEnterView = ((org.telegram.ui.Components.pf) obj3).a;
                long j3 = chatActivityEnterView.Q2;
                MessageObject messageObject3 = chatActivityEnterView.T2;
                threadMessage = chatActivityEnterView.getThreadMessage();
                SendMessagesHelper.SendMessageParams of4 = SendMessagesHelper.SendMessageParams.of((String) obj2, j3, messageObject3, threadMessage, null, false, null, null, null, true, 0, 0, null, false);
                wn wnVar10 = chatActivityEnterView.P2;
                of4.sendMessageChatArguments = wnVar10 != null ? wnVar10.C8() : null;
                of4.effect_id = chatActivityEnterView.S4;
                of4.payStars = l11.longValue();
                of4.monoForumPeer = chatActivityEnterView.getSendMonoForumPeerId();
                of4.suggestionParams = chatActivityEnterView.getSendMessageSuggestionParams();
                SendMessagesHelper.getInstance(chatActivityEnterView.Q).sendMessage(of4);
                chatActivityEnterView.setFieldText("");
                chatActivityEnterView.m0.c();
                org.telegram.ui.Components.ye yeVar = chatActivityEnterView.J0;
                chatActivityEnterView.S4 = 0L;
                yeVar.setEffect(0L);
                break;
            case 16:
                org.telegram.ui.Components.wi wiVar = (org.telegram.ui.Components.wi) obj3;
                org.telegram.ui.Components.pi piVar = (org.telegram.ui.Components.pi) obj2;
                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                int i16 = wiVar.J1;
                tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(i16).getInputUser(piVar.c.bot_id);
                tL_messages_toggleBotInAttachMenu.enabled = true;
                tL_messages_toggleBotInAttachMenu.write_allowed = true;
                ConnectionsManager.getInstance(i16).sendRequest(tL_messages_toggleBotInAttachMenu, new lo(5, wiVar, piVar), 66);
                break;
            case 17:
                org.telegram.ui.Components.wi wiVar2 = (org.telegram.ui.Components.wi) obj3;
                ((wn) obj2).g5 = (MessageSuggestionParams) obj;
                boolean G1 = wiVar2.G1(0, true, 0, wiVar2.s1(), wiVar2.N0);
                org.telegram.ui.Components.nf nfVar = wiVar2.h0;
                if (nfVar != null) {
                    nfVar.h(!G1);
                    wiVar2.h0 = null;
                    break;
                }
                break;
            case 18:
                ((ei.q4) obj3).getWebViewContainer().G((String) obj2, (String) obj, false);
                break;
            case 19:
                org.telegram.ui.Components.hj hjVar = (org.telegram.ui.Components.hj) obj3;
                MessagesController messagesController = (MessagesController) obj2;
                Long l12 = (Long) obj;
                hjVar.j0 = false;
                TLRPC.User user = l12 != null ? messagesController.getUser(l12) : null;
                hjVar.i0 = user;
                hjVar.k0 = user == null;
                if (user != null) {
                    hjVar.O();
                    break;
                }
                break;
            case 20:
                org.telegram.ui.Components.hl hlVar = ((org.telegram.ui.Components.el) obj3).b;
                hlVar.x0.b(((org.telegram.ui.Components.gl) obj2).c, hlVar.y0, true, 0, ((Long) obj).longValue());
                hlVar.b.dismiss(true);
                break;
            case 21:
                org.telegram.ui.Components.rv rvVar = (org.telegram.ui.Components.rv) obj3;
                boolean[] zArr = (boolean[]) obj2;
                if (((TLRPC.TL_messages_stickerSet) obj) == null && !zArr[0]) {
                    zArr[0] = true;
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.qv(rvVar, i14));
                    break;
                }
                break;
            case 22:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj3;
                org.telegram.ui.Components.cv cvVar = (org.telegram.ui.Components.cv) obj2;
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    linkedHashSet.addAll(tL_emojiList.document_id);
                }
                cvVar.run();
                break;
            case 23:
                org.telegram.ui.Components.ky kyVar = (org.telegram.ui.Components.ky) obj3;
                org.telegram.ui.Components.ly lyVar = kyVar.a;
                org.telegram.ui.Components.lz lzVar = lyVar.F;
                MediaDataController.getInstance(lzVar.c1).getEmojiSuggestions(lzVar.W0, lyVar.v, false, new ai.q5(kyVar, (String) obj2, (Runnable) obj, 28), null, SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(lzVar.c1).isPremium(), false, true, 25);
                break;
            case 24:
                ArrayList arrayList2 = (ArrayList) obj2;
                Runnable runnable = (Runnable) obj;
                org.telegram.ui.Components.ly lyVar2 = ((org.telegram.ui.Components.ky) obj3).a;
                if (ConnectionsManager.getInstance(lyVar2.F.c1).getConnectionState() != 3) {
                    runnable.run();
                    break;
                } else {
                    org.telegram.ui.Components.ly.E(lyVar2, runnable, arrayList2, false);
                    break;
                }
            case 25:
                org.telegram.ui.Components.ez ezVar = (org.telegram.ui.Components.ez) obj3;
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
                        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(ezVar.w.Q.c1).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                        arrayList = stickerSet != null ? stickerSet.documents : null;
                    } else {
                        arrayList = stickerSetCovered.covers;
                    }
                    if (arrayList != null && !arrayList.isEmpty()) {
                        ezVar.n.add(new org.telegram.ui.Components.ey(stickerSetCovered, arrayList));
                    }
                }
                runnable2.run();
                break;
            case 26:
                org.telegram.ui.Components.d10 d10Var = (org.telegram.ui.Components.d10) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) obj;
                if (d10Var.a0 != null || (d10Var.Z instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready)) {
                    org.telegram.ui.Components.qc M = org.telegram.ui.Components.yc.a0(m2Var).M(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FolderLinkUpdatedTitle, d10Var.f0)), arrayList4.size() <= 0 ? LocaleController.formatPluralString("FolderLinkUpdatedSubtitle", d10Var.h0.size(), new Object[0]) : LocaleController.formatPluralString("FolderLinkUpdatedJoinedSubtitle", arrayList4.size(), new Object[0]), R.raw.folder_in);
                    M.j = 5000;
                    M.j();
                    break;
                } else {
                    org.telegram.ui.Components.qc M2 = org.telegram.ui.Components.yc.a0(m2Var).M(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FolderLinkAddedTitle, d10Var.f0)), LocaleController.formatPluralString("FolderLinkAddedSubtitle", arrayList4.size(), new Object[0]), R.raw.contact_check);
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
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, org.telegram.ui.ActionBar.h6.I.q() ? 0.04f : 0.25f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, org.telegram.ui.ActionBar.h6.I.q() ? -0.04f : -0.07f);
                Bitmap applyColorMatrix = AndroidUtilities.applyColorMatrix(bitmap, colorMatrix);
                applyColorMatrix.setHasAlpha(false);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                colorMatrix2.setSaturation(org.telegram.ui.ActionBar.h6.I.q() ? 2.0f : 3.0f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, org.telegram.ui.ActionBar.h6.I.q() ? -0.2f : -0.07f);
                Bitmap applyColorMatrix2 = AndroidUtilities.applyColorMatrix(bitmap, colorMatrix2);
                applyColorMatrix2.setHasAlpha(false);
                bitmap.recycle();
                dVar.run(applyColorMatrix, applyColorMatrix2);
                break;
            case 28:
                MessagesController messagesController2 = (MessagesController) obj3;
                org.telegram.ui.Components.rr0 rr0Var = (org.telegram.ui.Components.rr0) obj2;
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (((Boolean) obj).booleanValue()) {
                    messagesController2.setContentSettings(true);
                    if (U != null) {
                        org.telegram.ui.Components.yc.a0(U).P(R.raw.chats_infotip, AndroidUtilities.replaceArrows(AndroidUtilities.premiumText(LocaleController.getString(R.string.SensitiveContentSettingsToast), new org.telegram.ui.Components.ud(i12, U)), true)).k(true);
                    }
                    rr0Var.run(Boolean.TRUE);
                    break;
                } else if (U != null) {
                    org.telegram.ui.Components.yc.a0(U).M(LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText), R.raw.error).j();
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.jv0.j((org.telegram.ui.Components.jv0) obj3, (TL_stories.StoryItem) obj2, (ai.e9) obj);
                break;
        }
    }
}
