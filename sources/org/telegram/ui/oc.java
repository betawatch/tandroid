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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
                xn xnVar = (xn) obj3;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = new TLRPC.TL_messages_sendQuickReplyMessages();
                tL_messages_sendQuickReplyMessages.peer = xnVar.getMessagesController().getInputPeer(xnVar.T5);
                tL_messages_sendQuickReplyMessages.shortcut_id = ((hg.b2) obj2).a;
                xnVar.getConnectionsManager().sendRequest(tL_messages_sendQuickReplyMessages, null);
                jk jkVar = xnVar.Y;
                if (jkVar != null) {
                    jkVar.setFieldText(null);
                    break;
                }
                break;
            case 3:
                xn xnVar2 = (xn) obj3;
                SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of((String) obj2, xnVar2.T5, xnVar2.n5, xnVar2.X3, null, false, null, null, null, true, 0, 0, null, false);
                of2.sendMessageChatArguments = xnVar2.C8();
                of2.payStars = ((Long) obj).longValue();
                of2.monoForumPeer = xnVar2.N8();
                of2.suggestionParams = xnVar2.g5;
                xnVar2.getSendMessagesHelper().sendMessage(of2);
                xnVar2.Y.setFieldText("");
                xnVar2.e9(false);
                break;
            case 4:
                xn xnVar3 = (xn) obj3;
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) obj2;
                Long l4 = (Long) obj;
                if (xnVar3.R3 == 1) {
                    org.telegram.ui.Components.e5.M(xnVar3.getParentActivity(), xnVar3.T5, new b7(xnVar3, botInlineResult, l4, i12), xnVar3.ea);
                    break;
                } else {
                    xnVar3.cb(botInlineResult, true, 0, l4.longValue());
                    break;
                }
            case 5:
                xn.q1((xn) obj3, (a41[]) obj2, (org.telegram.ui.Components.o70) obj);
                break;
            case 6:
                ((xn) obj3).ib = true;
                ((m4) obj2).run();
                break;
            case 7:
                xn xnVar4 = (xn) obj3;
                org.telegram.ui.ActionBar.b2[] b2VarArr = (org.telegram.ui.ActionBar.b2[]) obj2;
                TL_stats.TL_statsPollStats tL_statsPollStats = (TL_stats.TL_statsPollStats) obj;
                try {
                    b2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                b2VarArr[0] = null;
                if (tL_statsPollStats != null) {
                    if (tL_statsPollStats.votes_graph instanceof TL_stats.TL_statsGraphError) {
                        org.telegram.messenger.z0.o(R.string.PollStatsWillLater, org.telegram.ui.Components.xc.a0(xnVar4), R.raw.timer_toast, 24);
                        break;
                    } else {
                        new th.g(xnVar4.getParentActivity(), xnVar4.ea, tL_statsPollStats).show();
                        break;
                    }
                }
                break;
            case 8:
                xn xnVar5 = (xn) obj3;
                MessageObject messageObject = (MessageObject) obj2;
                xnVar5.getClass();
                TLRPC.SuggestedPost tl = ((MessageSuggestionParams) obj).toTl();
                if (messageObject != null && messageObject.messageOwner != null && tl != null) {
                    xnVar5.getMessagesController().addOfferToSuggestedMessage(messageObject, tl);
                    break;
                }
                break;
            case 9:
                hg.b2 b2Var = (hg.b2) obj2;
                String str = (String) obj;
                xn xnVar6 = ((kj) obj3).b;
                if (b2Var != null) {
                    i10 = ((org.telegram.ui.ActionBar.n2) xnVar6).currentAccount;
                    hg.c2.f(i10).k(b2Var.a, str);
                }
                xnVar6.Q3 = str;
                xnVar6.a1.setTitle(str);
                break;
            case 10:
                MessageObject messageObject2 = (MessageObject) obj2;
                Long l10 = (Long) obj;
                xn xnVar7 = ((jn) obj3).a;
                if (xnVar7.f7()) {
                    SendMessagesHelper.SendMessageParams of3 = SendMessagesHelper.SendMessageParams.of(messageObject2.getDiceEmoji(), xnVar7.T5, xnVar7.n5, xnVar7.X3, null, false, null, null, null, true, 0, 0, null, false);
                    of3.sendMessageChatArguments = xnVar7.C8();
                    of3.dice_stake = l10.longValue();
                    xnVar7.getSendMessagesHelper().sendMessage(of3);
                    break;
                }
                break;
            case 11:
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) obj2;
                xn xnVar8 = ((jn) obj3).a;
                if (((Boolean) obj).booleanValue()) {
                    for (int i15 = 0; i15 < xnVar8.x0.getChildCount(); i15++) {
                        View childAt = xnVar8.x0.getChildAt(i15);
                        if (childAt instanceof org.telegram.ui.Cells.t1) {
                            org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) childAt;
                            if (t1Var2.getMessageObject() != null && t1Var2.getMessageObject().isSensitive()) {
                                t1Var2.h4();
                            }
                        }
                    }
                    break;
                } else {
                    if (t1Var.getMessageObject() != null) {
                        t1Var.getMessageObject().isSensitiveCached = Boolean.FALSE;
                    }
                    t1Var.h4();
                    break;
                }
                break;
            case 12:
                jn jnVar = (jn) obj3;
                oc ocVar = (oc) obj2;
                xn xnVar9 = jnVar.a;
                if (((Boolean) obj).booleanValue()) {
                    xnVar9.getMessagesController().setContentSettings(true);
                    org.telegram.ui.Components.xc.a0(xnVar9).P(R.raw.chats_infotip, AndroidUtilities.replaceArrows(AndroidUtilities.premiumText(LocaleController.getString(R.string.SensitiveContentSettingsToast), new um(jnVar, 8)), true)).k(true);
                    ocVar.run(Boolean.TRUE);
                    break;
                } else {
                    org.telegram.ui.Components.xc.a0(xnVar9).M(LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText), R.raw.error).j();
                    break;
                }
            case 13:
                TLRPC.Message message = (TLRPC.Message) obj2;
                ((jn) obj3).a.getMessagesController().rejectSuggestedMessage(DialogObject.getPeerDialogId(message.peer_id), message.id, (String) obj);
                break;
            case 14:
                ao aoVar = (ao) obj3;
                aoVar.f.t(((dg.a) obj).b, ((TLRPC.WallPaper) obj2).settings.intensity);
                View view2 = aoVar.b;
                if (view2 != null) {
                    view2.invalidate();
                    break;
                }
                break;
            case 15:
                Long l11 = (Long) obj;
                ChatActivityEnterView chatActivityEnterView = ((org.telegram.ui.Components.of) obj3).a;
                long j3 = chatActivityEnterView.P2;
                MessageObject messageObject3 = chatActivityEnterView.S2;
                threadMessage = chatActivityEnterView.getThreadMessage();
                SendMessagesHelper.SendMessageParams of4 = SendMessagesHelper.SendMessageParams.of((String) obj2, j3, messageObject3, threadMessage, null, false, null, null, null, true, 0, 0, null, false);
                xn xnVar10 = chatActivityEnterView.O2;
                of4.sendMessageChatArguments = xnVar10 != null ? xnVar10.C8() : null;
                of4.effect_id = chatActivityEnterView.S4;
                of4.payStars = l11.longValue();
                of4.monoForumPeer = chatActivityEnterView.getSendMonoForumPeerId();
                of4.suggestionParams = chatActivityEnterView.getSendMessageSuggestionParams();
                SendMessagesHelper.getInstance(chatActivityEnterView.Q).sendMessage(of4);
                chatActivityEnterView.setFieldText("");
                chatActivityEnterView.m0.c();
                org.telegram.ui.Components.xe xeVar = chatActivityEnterView.J0;
                chatActivityEnterView.S4 = 0L;
                xeVar.setEffect(0L);
                break;
            case 16:
                org.telegram.ui.Components.wi wiVar = (org.telegram.ui.Components.wi) obj3;
                org.telegram.ui.Components.pi piVar = (org.telegram.ui.Components.pi) obj2;
                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                int i16 = wiVar.J1;
                tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(i16).getInputUser(piVar.c.bot_id);
                tL_messages_toggleBotInAttachMenu.enabled = true;
                tL_messages_toggleBotInAttachMenu.write_allowed = true;
                ConnectionsManager.getInstance(i16).sendRequest(tL_messages_toggleBotInAttachMenu, new mo(5, wiVar, piVar), 66);
                break;
            case 17:
                org.telegram.ui.Components.wi wiVar2 = (org.telegram.ui.Components.wi) obj3;
                ((xn) obj2).g5 = (MessageSuggestionParams) obj;
                boolean G1 = wiVar2.G1(0, true, 0, wiVar2.s1(), wiVar2.N0);
                org.telegram.ui.Components.mf mfVar = wiVar2.h0;
                if (mfVar != null) {
                    mfVar.h(!G1);
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
                org.telegram.ui.Components.qv qvVar = (org.telegram.ui.Components.qv) obj3;
                boolean[] zArr = (boolean[]) obj2;
                if (((TLRPC.TL_messages_stickerSet) obj) == null && !zArr[0]) {
                    zArr[0] = true;
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.pv(qvVar, i14));
                    break;
                }
                break;
            case 22:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj3;
                org.telegram.ui.Components.ph phVar = (org.telegram.ui.Components.ph) obj2;
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    linkedHashSet.addAll(tL_emojiList.document_id);
                }
                phVar.run();
                break;
            case 23:
                org.telegram.ui.Components.jy jyVar = (org.telegram.ui.Components.jy) obj3;
                org.telegram.ui.Components.ky kyVar = jyVar.a;
                org.telegram.ui.Components.lz lzVar = kyVar.F;
                MediaDataController.getInstance(lzVar.c1).getEmojiSuggestions(lzVar.W0, kyVar.v, false, new ai.q5(jyVar, (String) obj2, (Runnable) obj, 28), null, SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(lzVar.c1).isPremium(), false, true, 25);
                break;
            case 24:
                ArrayList arrayList2 = (ArrayList) obj2;
                Runnable runnable = (Runnable) obj;
                org.telegram.ui.Components.ky kyVar2 = ((org.telegram.ui.Components.jy) obj3).a;
                if (ConnectionsManager.getInstance(kyVar2.F.c1).getConnectionState() != 3) {
                    runnable.run();
                    break;
                } else {
                    org.telegram.ui.Components.ky.E(kyVar2, runnable, arrayList2, false);
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
                        ezVar.n.add(new org.telegram.ui.Components.dy(stickerSetCovered, arrayList));
                    }
                }
                runnable2.run();
                break;
            case 26:
                org.telegram.ui.Components.d10 d10Var = (org.telegram.ui.Components.d10) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj;
                if (d10Var.a0 != null || (d10Var.Z instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready)) {
                    org.telegram.ui.Components.qc M = org.telegram.ui.Components.xc.a0(n2Var).M(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FolderLinkUpdatedTitle, d10Var.f0)), arrayList4.size() <= 0 ? LocaleController.formatPluralString("FolderLinkUpdatedSubtitle", d10Var.h0.size(), new Object[0]) : LocaleController.formatPluralString("FolderLinkUpdatedJoinedSubtitle", arrayList4.size(), new Object[0]), R.raw.folder_in);
                    M.j = 5000;
                    M.j();
                    break;
                } else {
                    org.telegram.ui.Components.qc M2 = org.telegram.ui.Components.xc.a0(n2Var).M(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FolderLinkAddedTitle, d10Var.f0)), LocaleController.formatPluralString("FolderLinkAddedSubtitle", arrayList4.size(), new Object[0]), R.raw.contact_check);
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
                org.telegram.ui.Components.gr0 gr0Var = (org.telegram.ui.Components.gr0) obj2;
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (((Boolean) obj).booleanValue()) {
                    messagesController2.setContentSettings(true);
                    if (U != null) {
                        org.telegram.ui.Components.xc.a0(U).P(R.raw.chats_infotip, AndroidUtilities.replaceArrows(AndroidUtilities.premiumText(LocaleController.getString(R.string.SensitiveContentSettingsToast), new org.telegram.ui.Components.td(i12, U)), true)).k(true);
                    }
                    gr0Var.run(Boolean.TRUE);
                    break;
                } else if (U != null) {
                    org.telegram.ui.Components.xc.a0(U).M(LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText), R.raw.error).j();
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.yu0.j((org.telegram.ui.Components.yu0) obj3, (TL_stories.StoryItem) obj2, (ai.e9) obj);
                break;
        }
    }
}
