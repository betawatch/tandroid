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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pc implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pc(int i10, Object obj, Object obj2) {
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
                sc scVar = (sc) obj3;
                MessagesController.PeerColors peerColors = (MessagesController.PeerColors) obj2;
                View view = (View) obj;
                scVar.getClass();
                if (view instanceof rc) {
                    rc rcVar = (rc) view;
                    rcVar.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.d6, scVar.a));
                    scVar.b.getClass();
                    int R = RecyclerView.R(view);
                    if (peerColors != null && R >= 0 && R < peerColors.colors.size()) {
                        rcVar.a(peerColors.colors.get(R));
                        break;
                    }
                }
                break;
            case 1:
                rg.j0 j0Var = (rg.j0) obj2;
                j0Var.H1((ChannelBoostsController.CanApplyBoost) obj);
                ((ke) obj3).w0.showDialog(j0Var);
                break;
            case 2:
                zn znVar = (zn) obj3;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = new TLRPC.TL_messages_sendQuickReplyMessages();
                tL_messages_sendQuickReplyMessages.peer = znVar.getMessagesController().getInputPeer(znVar.T5);
                tL_messages_sendQuickReplyMessages.shortcut_id = ((hg.b2) obj2).a;
                znVar.getConnectionsManager().sendRequest(tL_messages_sendQuickReplyMessages, null);
                ok okVar = znVar.Y;
                if (okVar != null) {
                    okVar.setFieldText(null);
                    break;
                }
                break;
            case 3:
                zn znVar2 = (zn) obj3;
                SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of((String) obj2, znVar2.T5, znVar2.n5, znVar2.X3, null, false, null, null, null, true, 0, 0, null, false);
                of2.sendMessageChatArguments = znVar2.H8();
                of2.payStars = ((Long) obj).longValue();
                of2.monoForumPeer = znVar2.S8();
                of2.suggestionParams = znVar2.g5;
                znVar2.getSendMessagesHelper().sendMessage(of2);
                znVar2.Y.setFieldText("");
                znVar2.j9(false);
                break;
            case 4:
                zn znVar3 = (zn) obj3;
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) obj2;
                Long l4 = (Long) obj;
                if (znVar3.R3 == 1) {
                    org.telegram.ui.Components.g5.L(znVar3.getParentActivity(), znVar3.T5, new a7(znVar3, botInlineResult, l4, i12), znVar3.ea);
                    break;
                } else {
                    znVar3.gb(botInlineResult, true, 0, l4.longValue());
                    break;
                }
            case 5:
                zn.k1((zn) obj3, (h41[]) obj2, (org.telegram.ui.Components.p80) obj);
                break;
            case 6:
                ((zn) obj3).jb = true;
                ((org.telegram.ui.ActionBar.p) obj2).run();
                break;
            case 7:
                zn znVar4 = (zn) obj3;
                org.telegram.ui.ActionBar.b2[] b2VarArr = (org.telegram.ui.ActionBar.b2[]) obj2;
                TL_stats.TL_statsPollStats tL_statsPollStats = (TL_stats.TL_statsPollStats) obj;
                try {
                    b2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                b2VarArr[0] = null;
                if (tL_statsPollStats != null) {
                    if (tL_statsPollStats.votes_graph instanceof TL_stats.TL_statsGraphError) {
                        org.telegram.messenger.q.q(R.string.PollStatsWillLater, org.telegram.ui.Components.ad.a0(znVar4), R.raw.timer_toast, 24);
                        break;
                    } else {
                        new th.g(znVar4.getParentActivity(), znVar4.ea, tL_statsPollStats).show();
                        break;
                    }
                }
                break;
            case 8:
                zn znVar5 = (zn) obj3;
                MessageObject messageObject = (MessageObject) obj2;
                znVar5.getClass();
                TLRPC.SuggestedPost tl = ((MessageSuggestionParams) obj).toTl();
                if (messageObject != null && messageObject.messageOwner != null && tl != null) {
                    znVar5.getMessagesController().addOfferToSuggestedMessage(messageObject, tl);
                    break;
                }
                break;
            case 9:
                hg.b2 b2Var = (hg.b2) obj2;
                String str = (String) obj;
                zn znVar6 = ((oj) obj3).b;
                if (b2Var != null) {
                    i10 = ((org.telegram.ui.ActionBar.n2) znVar6).currentAccount;
                    hg.c2.f(i10).k(b2Var.a, str);
                }
                znVar6.Q3 = str;
                znVar6.a1.setTitle(str);
                break;
            case 10:
                MessageObject messageObject2 = (MessageObject) obj2;
                Long l10 = (Long) obj;
                zn znVar7 = ((ln) obj3).a;
                if (znVar7.i7()) {
                    SendMessagesHelper.SendMessageParams of3 = SendMessagesHelper.SendMessageParams.of(messageObject2.getDiceEmoji(), znVar7.T5, znVar7.n5, znVar7.X3, null, false, null, null, null, true, 0, 0, null, false);
                    of3.sendMessageChatArguments = znVar7.H8();
                    of3.dice_stake = l10.longValue();
                    znVar7.getSendMessagesHelper().sendMessage(of3);
                    break;
                }
                break;
            case 11:
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) obj2;
                zn znVar8 = ((ln) obj3).a;
                if (((Boolean) obj).booleanValue()) {
                    for (int i15 = 0; i15 < znVar8.x0.getChildCount(); i15++) {
                        View childAt = znVar8.x0.getChildAt(i15);
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
                ln lnVar = (ln) obj3;
                pc pcVar = (pc) obj2;
                zn znVar9 = lnVar.a;
                if (((Boolean) obj).booleanValue()) {
                    znVar9.getMessagesController().setContentSettings(true);
                    org.telegram.ui.Components.ad.a0(znVar9).P(R.raw.chats_infotip, AndroidUtilities.replaceArrows(AndroidUtilities.premiumText(LocaleController.getString(R.string.SensitiveContentSettingsToast), new wm(lnVar, 8)), true)).k(true);
                    pcVar.run(Boolean.TRUE);
                    break;
                } else {
                    org.telegram.ui.Components.ad.a0(znVar9).M(LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText), R.raw.error).j();
                    break;
                }
            case 13:
                TLRPC.Message message = (TLRPC.Message) obj2;
                ((ln) obj3).a.getMessagesController().rejectSuggestedMessage(DialogObject.getPeerDialogId(message.peer_id), message.id, (String) obj);
                break;
            case 14:
                co coVar = (co) obj3;
                coVar.f.t(((dg.a) obj).b, ((TLRPC.WallPaper) obj2).settings.intensity);
                View view2 = coVar.b;
                if (view2 != null) {
                    view2.invalidate();
                    break;
                }
                break;
            case 15:
                Long l11 = (Long) obj;
                ChatActivityEnterView chatActivityEnterView = ((org.telegram.ui.Components.rf) obj3).a;
                long j3 = chatActivityEnterView.Q2;
                MessageObject messageObject3 = chatActivityEnterView.T2;
                threadMessage = chatActivityEnterView.getThreadMessage();
                SendMessagesHelper.SendMessageParams of4 = SendMessagesHelper.SendMessageParams.of((String) obj2, j3, messageObject3, threadMessage, null, false, null, null, null, true, 0, 0, null, false);
                zn znVar10 = chatActivityEnterView.P2;
                of4.sendMessageChatArguments = znVar10 != null ? znVar10.H8() : null;
                of4.effect_id = chatActivityEnterView.S4;
                of4.payStars = l11.longValue();
                of4.monoForumPeer = chatActivityEnterView.getSendMonoForumPeerId();
                of4.suggestionParams = chatActivityEnterView.getSendMessageSuggestionParams();
                SendMessagesHelper.getInstance(chatActivityEnterView.Q).sendMessage(of4);
                chatActivityEnterView.setFieldText("");
                chatActivityEnterView.m0.c();
                org.telegram.ui.Components.af afVar = chatActivityEnterView.J0;
                chatActivityEnterView.S4 = 0L;
                afVar.setEffect(0L);
                break;
            case 16:
                org.telegram.ui.Components.yi yiVar = (org.telegram.ui.Components.yi) obj3;
                org.telegram.ui.Components.ri riVar = (org.telegram.ui.Components.ri) obj2;
                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                int i16 = yiVar.M1;
                tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(i16).getInputUser(riVar.c.bot_id);
                tL_messages_toggleBotInAttachMenu.enabled = true;
                tL_messages_toggleBotInAttachMenu.write_allowed = true;
                ConnectionsManager.getInstance(i16).sendRequest(tL_messages_toggleBotInAttachMenu, new oo(5, yiVar, riVar), 66);
                break;
            case 17:
                org.telegram.ui.Components.yi yiVar2 = (org.telegram.ui.Components.yi) obj3;
                ((zn) obj2).g5 = (MessageSuggestionParams) obj;
                boolean J1 = yiVar2.J1(0, true, 0, yiVar2.u1(), yiVar2.Q0);
                org.telegram.ui.Components.pf pfVar = yiVar2.h0;
                if (pfVar != null) {
                    pfVar.h(!J1);
                    yiVar2.h0 = null;
                    break;
                }
                break;
            case 18:
                ((ei.p4) obj3).getWebViewContainer().F((String) obj2, (String) obj, false);
                break;
            case 19:
                org.telegram.ui.Components.kj kjVar = (org.telegram.ui.Components.kj) obj3;
                MessagesController messagesController = (MessagesController) obj2;
                Long l12 = (Long) obj;
                kjVar.i0 = false;
                TLRPC.User user = l12 != null ? messagesController.getUser(l12) : null;
                kjVar.h0 = user;
                kjVar.j0 = user == null;
                if (user != null) {
                    kjVar.R();
                    break;
                }
                break;
            case 20:
                org.telegram.ui.Components.xl xlVar = ((org.telegram.ui.Components.ul) obj3).b;
                xlVar.x0.b(((org.telegram.ui.Components.wl) obj2).c, xlVar.y0, true, 0, ((Long) obj).longValue());
                xlVar.b.dismiss(true);
                break;
            case 21:
                org.telegram.ui.Components.fw fwVar = (org.telegram.ui.Components.fw) obj3;
                boolean[] zArr = (boolean[]) obj2;
                if (((TLRPC.TL_messages_stickerSet) obj) == null && !zArr[0]) {
                    zArr[0] = true;
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ew(fwVar, i14));
                    break;
                }
                break;
            case 22:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj3;
                org.telegram.ui.Components.zr zrVar = (org.telegram.ui.Components.zr) obj2;
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    linkedHashSet.addAll(tL_emojiList.document_id);
                }
                zrVar.run();
                break;
            case 23:
                org.telegram.ui.Components.yy yyVar = (org.telegram.ui.Components.yy) obj3;
                org.telegram.ui.Components.zy zyVar = yyVar.a;
                org.telegram.ui.Components.a00 a00Var = zyVar.F;
                MediaDataController.getInstance(a00Var.c1).getEmojiSuggestions(a00Var.W0, zyVar.v, false, new ai.r5(yyVar, (String) obj2, (Runnable) obj, 29), null, SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(a00Var.c1).isPremium(), false, true, 25);
                break;
            case 24:
                ArrayList arrayList2 = (ArrayList) obj2;
                Runnable runnable = (Runnable) obj;
                org.telegram.ui.Components.zy zyVar2 = ((org.telegram.ui.Components.yy) obj3).a;
                if (ConnectionsManager.getInstance(zyVar2.F.c1).getConnectionState() != 3) {
                    runnable.run();
                    break;
                } else {
                    org.telegram.ui.Components.zy.E(zyVar2, runnable, arrayList2, false);
                    break;
                }
            case 25:
                org.telegram.ui.Components.tz tzVar = (org.telegram.ui.Components.tz) obj3;
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
                        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(tzVar.w.Q.c1).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                        arrayList = stickerSet != null ? stickerSet.documents : null;
                    } else {
                        arrayList = stickerSetCovered.covers;
                    }
                    if (arrayList != null && !arrayList.isEmpty()) {
                        tzVar.n.add(new org.telegram.ui.Components.sy(stickerSetCovered, arrayList));
                    }
                }
                runnable2.run();
                break;
            case 26:
                org.telegram.ui.Components.s10 s10Var = (org.telegram.ui.Components.s10) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj;
                if (s10Var.a0 != null || (s10Var.Z instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready)) {
                    org.telegram.ui.Components.tc M = org.telegram.ui.Components.ad.a0(n2Var).M(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FolderLinkUpdatedTitle, s10Var.f0)), arrayList4.size() <= 0 ? LocaleController.formatPluralString("FolderLinkUpdatedSubtitle", s10Var.h0.size(), new Object[0]) : LocaleController.formatPluralString("FolderLinkUpdatedJoinedSubtitle", arrayList4.size(), new Object[0]), R.raw.folder_in);
                    M.j = 5000;
                    M.j();
                    break;
                } else {
                    org.telegram.ui.Components.tc M2 = org.telegram.ui.Components.ad.a0(n2Var).M(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FolderLinkAddedTitle, s10Var.f0)), LocaleController.formatPluralString("FolderLinkAddedSubtitle", arrayList4.size(), new Object[0]), R.raw.contact_check);
                    M2.j = 5000;
                    M2.j();
                    break;
                }
                break;
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
                org.telegram.ui.Components.ks0 ks0Var = (org.telegram.ui.Components.ks0) obj2;
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (((Boolean) obj).booleanValue()) {
                    messagesController2.setContentSettings(true);
                    if (U != null) {
                        org.telegram.ui.Components.ad.a0(U).P(R.raw.chats_infotip, AndroidUtilities.replaceArrows(AndroidUtilities.premiumText(LocaleController.getString(R.string.SensitiveContentSettingsToast), new org.telegram.ui.Components.wd(i12, U)), true)).k(true);
                    }
                    ks0Var.run(Boolean.TRUE);
                    break;
                } else if (U != null) {
                    org.telegram.ui.Components.ad.a0(U).M(LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText), R.raw.error).j();
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.bw0.j((org.telegram.ui.Components.bw0) obj3, (TL_stories.StoryItem) obj2, (ai.f9) obj);
                break;
        }
    }
}
