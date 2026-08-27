package org.telegram.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.Shader;
import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.AndroidUtilities;
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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class df implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ df(int i10, Object obj, Object obj2) {
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
                rn rnVar = (rn) obj3;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = new TLRPC.TL_messages_sendQuickReplyMessages();
                tL_messages_sendQuickReplyMessages.peer = rnVar.getMessagesController().getInputPeer(rnVar.P5);
                tL_messages_sendQuickReplyMessages.shortcut_id = ((qf.p1) obj2).a;
                rnVar.getConnectionsManager().sendRequest(tL_messages_sendQuickReplyMessages, null);
                ck ckVar = rnVar.U;
                if (ckVar != null) {
                    ckVar.setFieldText(null);
                    break;
                }
                break;
            case 1:
                rn rnVar2 = (rn) obj3;
                SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of((String) obj2, rnVar2.P5, rnVar2.j5, rnVar2.T3, null, false, null, null, null, true, 0, 0, null, false);
                of2.sendMessageChatArguments = rnVar2.C8();
                of2.payStars = ((Long) obj).longValue();
                of2.monoForumPeer = rnVar2.N8();
                of2.suggestionParams = rnVar2.c5;
                rnVar2.getSendMessagesHelper().sendMessage(of2);
                rnVar2.U.setFieldText("");
                rnVar2.e9(false);
                break;
            case 2:
                rn rnVar3 = (rn) obj3;
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) obj2;
                Long l10 = (Long) obj;
                if (rnVar3.N3 != 1) {
                    rnVar3.cb(botInlineResult, true, 0, l10.longValue());
                    break;
                } else {
                    org.telegram.ui.Components.y4.M(rnVar3.getParentActivity(), rnVar3.P5, new b7(rnVar3, botInlineResult, l10, i12), rnVar3.aa);
                    break;
                }
            case 3:
                rn.q1((rn) obj3, (c31[]) obj2, (org.telegram.ui.Components.b70) obj);
                break;
            case 4:
                rn rnVar4 = (rn) obj3;
                org.telegram.ui.ActionBar.b2[] b2VarArr = (org.telegram.ui.ActionBar.b2[]) obj2;
                TL_stats.TL_statsPollStats tL_statsPollStats = (TL_stats.TL_statsPollStats) obj;
                try {
                    b2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                b2VarArr[0] = null;
                if (tL_statsPollStats != null) {
                    if (!(tL_statsPollStats.votes_graph instanceof TL_stats.TL_statsGraphError)) {
                        new ch.i(rnVar4.getParentActivity(), rnVar4.aa, tL_statsPollStats).show();
                        break;
                    } else {
                        org.telegram.messenger.y1.q(R.string.PollStatsWillLater, org.telegram.ui.Components.mc.a0(rnVar4), R.raw.timer_toast, 24);
                        break;
                    }
                }
                break;
            case 5:
                rn rnVar5 = (rn) obj3;
                MessageObject messageObject = (MessageObject) obj2;
                rnVar5.getClass();
                TLRPC.SuggestedPost tl = ((MessageSuggestionParams) obj).toTl();
                if (messageObject != null && messageObject.messageOwner != null && tl != null) {
                    rnVar5.getMessagesController().addOfferToSuggestedMessage(messageObject, tl);
                    break;
                }
                break;
            case 6:
                qf.p1 p1Var = (qf.p1) obj2;
                String str = (String) obj;
                rn rnVar6 = ((dj) obj3).b;
                if (p1Var != null) {
                    i10 = ((org.telegram.ui.ActionBar.n2) rnVar6).currentAccount;
                    qf.q1.f(i10).k(p1Var.a, str);
                }
                rnVar6.M3 = str;
                rnVar6.W0.setTitle(str);
                break;
            case 7:
                MessageObject messageObject2 = (MessageObject) obj2;
                Long l11 = (Long) obj;
                rn rnVar7 = ((dn) obj3).a;
                if (rnVar7.f7()) {
                    SendMessagesHelper.SendMessageParams of3 = SendMessagesHelper.SendMessageParams.of(messageObject2.getDiceEmoji(), rnVar7.P5, rnVar7.j5, rnVar7.T3, null, false, null, null, null, true, 0, 0, null, false);
                    of3.sendMessageChatArguments = rnVar7.C8();
                    of3.dice_stake = l11.longValue();
                    rnVar7.getSendMessagesHelper().sendMessage(of3);
                    break;
                }
                break;
            case 8:
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) obj2;
                rn rnVar8 = ((dn) obj3).a;
                if (!((Boolean) obj).booleanValue()) {
                    if (s1Var.getMessageObject() != null) {
                        s1Var.getMessageObject().isSensitiveCached = Boolean.FALSE;
                    }
                    s1Var.g4();
                    break;
                } else {
                    while (i13 < rnVar8.t0.getChildCount()) {
                        View childAt = rnVar8.t0.getChildAt(i13);
                        if (childAt instanceof org.telegram.ui.Cells.s1) {
                            org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) childAt;
                            if (s1Var2.getMessageObject() != null && s1Var2.getMessageObject().isSensitive()) {
                                s1Var2.g4();
                            }
                        }
                        i13++;
                    }
                    break;
                }
                break;
            case 9:
                dn dnVar = (dn) obj3;
                df dfVar = (df) obj2;
                rn rnVar9 = dnVar.a;
                if (!((Boolean) obj).booleanValue()) {
                    org.telegram.ui.Components.mc.a0(rnVar9).M(LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText), R.raw.error).j();
                    break;
                } else {
                    rnVar9.getMessagesController().setContentSettings(true);
                    org.telegram.ui.Components.mc.a0(rnVar9).P(R.raw.chats_infotip, AndroidUtilities.replaceArrows(AndroidUtilities.premiumText(LocaleController.getString(R.string.SensitiveContentSettingsToast), new om(dnVar, 8)), true)).k(true);
                    dfVar.run(Boolean.TRUE);
                    break;
                }
            case 10:
                TLRPC.Message message = (TLRPC.Message) obj2;
                ((dn) obj3).a.getMessagesController().rejectSuggestedMessage(DialogObject.getPeerDialogId(message.peer_id), message.id, (String) obj);
                break;
            case 11:
                un unVar = (un) obj3;
                unVar.f.t(((mf.a) obj).b, ((TLRPC.WallPaper) obj2).settings.intensity);
                View view = unVar.b;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 12:
                Long l12 = (Long) obj;
                ChatActivityEnterView chatActivityEnterView = ((org.telegram.ui.Components.af) obj3).a;
                long j10 = chatActivityEnterView.L2;
                MessageObject messageObject3 = chatActivityEnterView.O2;
                threadMessage = chatActivityEnterView.getThreadMessage();
                SendMessagesHelper.SendMessageParams of4 = SendMessagesHelper.SendMessageParams.of((String) obj2, j10, messageObject3, threadMessage, null, false, null, null, null, true, 0, 0, null, false);
                rn rnVar10 = chatActivityEnterView.K2;
                of4.sendMessageChatArguments = rnVar10 != null ? rnVar10.C8() : null;
                of4.effect_id = chatActivityEnterView.N4;
                of4.payStars = l12.longValue();
                of4.monoForumPeer = chatActivityEnterView.getSendMonoForumPeerId();
                of4.suggestionParams = chatActivityEnterView.getSendMessageSuggestionParams();
                SendMessagesHelper.getInstance(chatActivityEnterView.M).sendMessage(of4);
                chatActivityEnterView.setFieldText("");
                chatActivityEnterView.i0.c();
                org.telegram.ui.Components.ke keVar = chatActivityEnterView.F0;
                chatActivityEnterView.N4 = 0L;
                keVar.setEffect(0L);
                break;
            case 13:
                org.telegram.ui.Components.gi giVar = (org.telegram.ui.Components.gi) obj2;
                ((rn) obj3).c5 = (MessageSuggestionParams) obj;
                boolean G1 = giVar.G1(0, true, 0, giVar.s1(), giVar.J0);
                org.telegram.ui.Components.ye yeVar = giVar.d0;
                if (yeVar != null) {
                    yeVar.h(!G1);
                    giVar.d0 = null;
                    break;
                }
                break;
            case 14:
                ((nh.e4) obj3).getWebViewContainer().C((String) obj2, (String) obj, false);
                break;
            case 15:
                org.telegram.ui.Components.tk tkVar = ((org.telegram.ui.Components.qk) obj3).b;
                tkVar.t0.d(((org.telegram.ui.Components.sk) obj2).c, tkVar.u0, true, 0, ((Long) obj).longValue());
                tkVar.b.dismiss(true);
                break;
            case 16:
                org.telegram.ui.Components.zu zuVar = (org.telegram.ui.Components.zu) obj3;
                boolean[] zArr = (boolean[]) obj2;
                if (((TLRPC.TL_messages_stickerSet) obj) == null && !zArr[0]) {
                    zArr[0] = true;
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.yu(zuVar, i14));
                    break;
                }
                break;
            case 17:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj3;
                org.telegram.ui.Components.xq xqVar = (org.telegram.ui.Components.xq) obj2;
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    linkedHashSet.addAll(tL_emojiList.document_id);
                }
                xqVar.run();
                break;
            case 18:
                org.telegram.ui.Components.vx vxVar = (org.telegram.ui.Components.vx) obj3;
                org.telegram.ui.Components.wx wxVar = vxVar.a;
                org.telegram.ui.Components.yy yyVar = wxVar.B;
                MediaDataController.getInstance(yyVar.Y0).getEmojiSuggestions(yyVar.S0, wxVar.v, false, new ag.l0(vxVar, (String) obj2, (Runnable) obj, 27), null, SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(yyVar.Y0).isPremium(), false, true, 25);
                break;
            case 19:
                ArrayList arrayList2 = (ArrayList) obj2;
                Runnable runnable = (Runnable) obj;
                org.telegram.ui.Components.wx wxVar2 = ((org.telegram.ui.Components.vx) obj3).a;
                if (ConnectionsManager.getInstance(wxVar2.B.Y0).getConnectionState() == 3) {
                    org.telegram.ui.Components.wx.E(wxVar2, runnable, arrayList2, false);
                    break;
                } else {
                    runnable.run();
                    break;
                }
            case 20:
                org.telegram.ui.Components.ry ryVar = (org.telegram.ui.Components.ry) obj3;
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
                        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(ryVar.w.M.Y0).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                        arrayList = stickerSet != null ? stickerSet.documents : null;
                    } else {
                        arrayList = stickerSetCovered.covers;
                    }
                    if (arrayList != null && !arrayList.isEmpty()) {
                        ryVar.n.add(new org.telegram.ui.Components.px(stickerSetCovered, arrayList));
                    }
                }
                runnable2.run();
                break;
            case 21:
                org.telegram.ui.Components.q00 q00Var = (org.telegram.ui.Components.q00) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj;
                if (q00Var.W == null && !(q00Var.V instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready)) {
                    org.telegram.ui.Components.ec M = org.telegram.ui.Components.mc.a0(n2Var).M(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FolderLinkAddedTitle, q00Var.b0)), LocaleController.formatPluralString("FolderLinkAddedSubtitle", arrayList4.size(), new Object[0]), R.raw.contact_check);
                    M.j = 5000;
                    M.j();
                    break;
                } else {
                    org.telegram.ui.Components.ec M2 = org.telegram.ui.Components.mc.a0(n2Var).M(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FolderLinkUpdatedTitle, q00Var.b0)), arrayList4.size() <= 0 ? LocaleController.formatPluralString("FolderLinkUpdatedSubtitle", q00Var.d0.size(), new Object[0]) : LocaleController.formatPluralString("FolderLinkUpdatedJoinedSubtitle", arrayList4.size(), new Object[0]), R.raw.folder_in);
                    M2.j = 5000;
                    M2.j();
                    break;
                }
                break;
            case 22:
                View view2 = (View) obj3;
                org.telegram.ui.Components.d dVar = (org.telegram.ui.Components.d) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (view2.getWidth() > 0 && view2.getHeight() > 0) {
                    view2.getLocationOnScreen(new int[2]);
                    int clamp = Utilities.clamp((int) ((r2[0] / AndroidUtilities.displaySize.x) * bitmap.getWidth()), bitmap.getWidth(), 0);
                    int clamp2 = Utilities.clamp((int) ((r2[1] / ((AndroidUtilities.displaySize.y + AndroidUtilities.statusBarHeight) + AndroidUtilities.navigationBarHeight)) * bitmap.getHeight()), bitmap.getHeight(), 0);
                    int clamp3 = Utilities.clamp((int) ((view2.getWidth() / AndroidUtilities.displaySize.x) * bitmap.getWidth()), bitmap.getWidth() - clamp, 0);
                    int clamp4 = Utilities.clamp((int) ((view2.getHeight() / ((AndroidUtilities.displaySize.y + AndroidUtilities.statusBarHeight) + AndroidUtilities.navigationBarHeight)) * bitmap.getHeight()), bitmap.getHeight() - clamp2, 0);
                    if ((clamp != 0 || clamp2 != 0 || clamp3 != bitmap.getWidth() || clamp4 != bitmap.getHeight()) && clamp3 > 0 && clamp4 > 0) {
                        bitmap = Bitmap.createBitmap(bitmap, clamp, clamp2, clamp3, clamp4);
                    }
                }
                ColorMatrix colorMatrix = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, org.telegram.ui.ActionBar.g6.I.q() ? 0.04f : 0.25f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, org.telegram.ui.ActionBar.g6.I.q() ? -0.04f : -0.07f);
                Bitmap applyColorMatrix = AndroidUtilities.applyColorMatrix(bitmap, colorMatrix);
                applyColorMatrix.setHasAlpha(false);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                colorMatrix2.setSaturation(org.telegram.ui.ActionBar.g6.I.q() ? 2.0f : 3.0f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, org.telegram.ui.ActionBar.g6.I.q() ? -0.2f : -0.07f);
                Bitmap applyColorMatrix2 = AndroidUtilities.applyColorMatrix(bitmap, colorMatrix2);
                applyColorMatrix2.setHasAlpha(false);
                bitmap.recycle();
                dVar.run(applyColorMatrix, applyColorMatrix2);
                break;
            case 23:
                MessagesController messagesController = (MessagesController) obj3;
                org.telegram.ui.Components.pq0 pq0Var = (org.telegram.ui.Components.pq0) obj2;
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (!((Boolean) obj).booleanValue()) {
                    if (U != null) {
                        org.telegram.ui.Components.mc.a0(U).M(LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText), R.raw.error).j();
                        break;
                    }
                } else {
                    messagesController.setContentSettings(true);
                    if (U != null) {
                        org.telegram.ui.Components.mc.a0(U).P(R.raw.chats_infotip, AndroidUtilities.replaceArrows(AndroidUtilities.premiumText(LocaleController.getString(R.string.SensitiveContentSettingsToast), new org.telegram.ui.Components.fd(i12, U)), true)).k(true);
                    }
                    pq0Var.run(Boolean.TRUE);
                    break;
                }
                break;
            case 24:
                org.telegram.ui.Components.hu0.j((org.telegram.ui.Components.hu0) obj3, (TL_stories.StoryItem) obj2, (jh.k6) obj);
                break;
            case 25:
                kt ktVar = (kt) obj3;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) obj2;
                Long l13 = (Long) obj;
                ktVar.getClass();
                Bundle bundle = new Bundle();
                if (l13.longValue() >= 0) {
                    bundle.putLong("user_id", l13.longValue());
                } else {
                    bundle.putLong("chat_id", -l13.longValue());
                }
                n2Var2.presentFragment(new ProfileActivity(bundle, null));
                ktVar.p();
                break;
            case 26:
                ft ftVar = (ft) obj3;
                Boolean bool = (Boolean) obj;
                ftVar.getClass();
                ((Utilities.Callback) obj2).run(bool);
                if (bool.booleanValue()) {
                    ftVar.a.p();
                    break;
                }
                break;
            case 27:
                gy gyVar = (gy) obj3;
                Activity activity = (Activity) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    gyVar.showDialog(new rj0(activity, !org.telegram.ui.Components.pd0.c(), new vv(activity, 0)));
                    break;
                }
                break;
            case 28:
                yo0 yo0Var = (yo0) obj2;
                Integer num = (Integer) obj;
                q00 q00Var2 = ((n00) obj3).e;
                if (!q00Var2.getUserConfig().isPremium()) {
                    q00Var2.showDialog(new ag.g2((org.telegram.ui.ActionBar.n2) q00Var2, 35, true));
                    break;
                } else {
                    int intValue = num.intValue();
                    q00Var2.A = intValue;
                    yo0Var.a(intValue, true);
                    e00 e00Var = q00Var2.E;
                    if (e00Var != null) {
                        e00Var.d(!q00Var2.getUserConfig().isPremium() ? -1 : q00Var2.A, true);
                    }
                    q00Var2.i0(true);
                    break;
                }
            default:
                b50 b50Var = (b50) obj3;
                ag.s0 s0Var = (ag.s0) obj2;
                Bitmap bitmap2 = (Bitmap) obj;
                if (s0Var != null) {
                    b50Var.getClass();
                    s0Var.setVisibility(0);
                }
                b50Var.c = bitmap2;
                Paint paint = new Paint(1);
                b50Var.d = paint;
                Bitmap bitmap3 = b50Var.c;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                b50Var.e = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix3 = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix3, org.telegram.ui.ActionBar.g6.I.q() ? 0.05f : 0.25f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix3, org.telegram.ui.ActionBar.g6.I.q() ? -0.02f : -0.04f);
                b50Var.d.setColorFilter(new ColorMatrixColorFilter(colorMatrix3));
                break;
        }
    }

    public /* synthetic */ df(org.telegram.ui.Components.gi giVar, rn rnVar) {
        this.a = 13;
        this.c = giVar;
        this.b = rnVar;
    }
}
