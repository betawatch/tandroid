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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class df implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ df(int i9, Object obj, Object obj2) {
        this.a = i9;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i9;
        MessageObject threadMessage;
        ArrayList<TLRPC.Document> arrayList;
        int i10 = this.a;
        int i11 = 2;
        int i12 = 0;
        int i13 = 1;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i10) {
            case 0:
                qn qnVar = (qn) obj3;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = new TLRPC.TL_messages_sendQuickReplyMessages();
                tL_messages_sendQuickReplyMessages.peer = qnVar.getMessagesController().getInputPeer(qnVar.P5);
                tL_messages_sendQuickReplyMessages.shortcut_id = ((pf.q1) obj2).a;
                qnVar.getConnectionsManager().sendRequest(tL_messages_sendQuickReplyMessages, null);
                ak akVar = qnVar.U;
                if (akVar != null) {
                    akVar.setFieldText(null);
                    break;
                }
                break;
            case 1:
                qn qnVar2 = (qn) obj3;
                SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of((String) obj2, qnVar2.P5, qnVar2.j5, qnVar2.T3, null, false, null, null, null, true, 0, 0, null, false);
                of2.sendMessageChatArguments = qnVar2.C8();
                of2.payStars = ((Long) obj).longValue();
                of2.monoForumPeer = qnVar2.N8();
                of2.suggestionParams = qnVar2.c5;
                qnVar2.getSendMessagesHelper().sendMessage(of2);
                qnVar2.U.setFieldText("");
                qnVar2.e9(false);
                break;
            case 2:
                qn qnVar3 = (qn) obj3;
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) obj2;
                Long l10 = (Long) obj;
                if (qnVar3.N3 != 1) {
                    qnVar3.cb(botInlineResult, true, 0, l10.longValue());
                    break;
                } else {
                    org.telegram.ui.Components.y4.M(qnVar3.getParentActivity(), qnVar3.P5, new a7(qnVar3, botInlineResult, l10, i11), qnVar3.aa);
                    break;
                }
            case 3:
                qn.q1((qn) obj3, (d31[]) obj2, (org.telegram.ui.Components.x60) obj);
                break;
            case 4:
                qn qnVar4 = (qn) obj3;
                org.telegram.ui.ActionBar.c2[] c2VarArr = (org.telegram.ui.ActionBar.c2[]) obj2;
                TL_stats.TL_statsPollStats tL_statsPollStats = (TL_stats.TL_statsPollStats) obj;
                try {
                    c2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                c2VarArr[0] = null;
                if (tL_statsPollStats != null) {
                    if (!(tL_statsPollStats.votes_graph instanceof TL_stats.TL_statsGraphError)) {
                        new bh.k(qnVar4.getParentActivity(), qnVar4.aa, tL_statsPollStats).show();
                        break;
                    } else {
                        org.telegram.messenger.l0.p(R.string.PollStatsWillLater, org.telegram.ui.Components.oc.a0(qnVar4), R.raw.timer_toast, 24);
                        break;
                    }
                }
                break;
            case 5:
                qn qnVar5 = (qn) obj3;
                MessageObject messageObject = (MessageObject) obj2;
                qnVar5.getClass();
                TLRPC.SuggestedPost tl = ((MessageSuggestionParams) obj).toTl();
                if (messageObject != null && messageObject.messageOwner != null && tl != null) {
                    qnVar5.getMessagesController().addOfferToSuggestedMessage(messageObject, tl);
                    break;
                }
                break;
            case 6:
                pf.q1 q1Var = (pf.q1) obj2;
                String str = (String) obj;
                qn qnVar6 = ((bj) obj3).b;
                if (q1Var != null) {
                    i9 = ((org.telegram.ui.ActionBar.o2) qnVar6).currentAccount;
                    pf.r1.f(i9).k(q1Var.a, str);
                }
                qnVar6.M3 = str;
                qnVar6.W0.setTitle(str);
                break;
            case 7:
                MessageObject messageObject2 = (MessageObject) obj2;
                Long l11 = (Long) obj;
                qn qnVar7 = ((cn) obj3).a;
                if (qnVar7.f7()) {
                    SendMessagesHelper.SendMessageParams of3 = SendMessagesHelper.SendMessageParams.of(messageObject2.getDiceEmoji(), qnVar7.P5, qnVar7.j5, qnVar7.T3, null, false, null, null, null, true, 0, 0, null, false);
                    of3.sendMessageChatArguments = qnVar7.C8();
                    of3.dice_stake = l11.longValue();
                    qnVar7.getSendMessagesHelper().sendMessage(of3);
                    break;
                }
                break;
            case 8:
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) obj2;
                qn qnVar8 = ((cn) obj3).a;
                if (!((Boolean) obj).booleanValue()) {
                    if (t1Var.getMessageObject() != null) {
                        t1Var.getMessageObject().isSensitiveCached = Boolean.FALSE;
                    }
                    t1Var.h4();
                    break;
                } else {
                    while (i12 < qnVar8.t0.getChildCount()) {
                        View childAt = qnVar8.t0.getChildAt(i12);
                        if (childAt instanceof org.telegram.ui.Cells.t1) {
                            org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) childAt;
                            if (t1Var2.getMessageObject() != null && t1Var2.getMessageObject().isSensitive()) {
                                t1Var2.h4();
                            }
                        }
                        i12++;
                    }
                    break;
                }
                break;
            case 9:
                cn cnVar = (cn) obj3;
                df dfVar = (df) obj2;
                qn qnVar9 = cnVar.a;
                if (!((Boolean) obj).booleanValue()) {
                    org.telegram.ui.Components.oc.a0(qnVar9).M(LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText), R.raw.error).j();
                    break;
                } else {
                    qnVar9.getMessagesController().setContentSettings(true);
                    org.telegram.ui.Components.oc.a0(qnVar9).P(R.raw.chats_infotip, AndroidUtilities.replaceArrows(AndroidUtilities.premiumText(LocaleController.getString(R.string.SensitiveContentSettingsToast), new nm(cnVar, 8)), true)).k(true);
                    dfVar.run(Boolean.TRUE);
                    break;
                }
            case 10:
                TLRPC.Message message = (TLRPC.Message) obj2;
                ((cn) obj3).a.getMessagesController().rejectSuggestedMessage(DialogObject.getPeerDialogId(message.peer_id), message.id, (String) obj);
                break;
            case 11:
                tn tnVar = (tn) obj3;
                tnVar.f.t(((lf.a) obj).b, ((TLRPC.WallPaper) obj2).settings.intensity);
                View view = tnVar.b;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 12:
                Long l12 = (Long) obj;
                ChatActivityEnterView chatActivityEnterView = ((org.telegram.ui.Components.ef) obj3).a;
                long j10 = chatActivityEnterView.L2;
                MessageObject messageObject3 = chatActivityEnterView.O2;
                threadMessage = chatActivityEnterView.getThreadMessage();
                SendMessagesHelper.SendMessageParams of4 = SendMessagesHelper.SendMessageParams.of((String) obj2, j10, messageObject3, threadMessage, null, false, null, null, null, true, 0, 0, null, false);
                qn qnVar10 = chatActivityEnterView.K2;
                of4.sendMessageChatArguments = qnVar10 != null ? qnVar10.C8() : null;
                of4.effect_id = chatActivityEnterView.N4;
                of4.payStars = l12.longValue();
                of4.monoForumPeer = chatActivityEnterView.getSendMonoForumPeerId();
                of4.suggestionParams = chatActivityEnterView.getSendMessageSuggestionParams();
                SendMessagesHelper.getInstance(chatActivityEnterView.M).sendMessage(of4);
                chatActivityEnterView.setFieldText("");
                chatActivityEnterView.i0.c();
                org.telegram.ui.Components.oe oeVar = chatActivityEnterView.F0;
                chatActivityEnterView.N4 = 0L;
                oeVar.setEffect(0L);
                break;
            case 13:
                org.telegram.ui.Components.ki kiVar = (org.telegram.ui.Components.ki) obj2;
                ((qn) obj3).c5 = (MessageSuggestionParams) obj;
                boolean G1 = kiVar.G1(0, true, 0, kiVar.s1(), kiVar.J0);
                org.telegram.ui.Components.cf cfVar = kiVar.d0;
                if (cfVar != null) {
                    cfVar.h(!G1);
                    kiVar.d0 = null;
                    break;
                }
                break;
            case 14:
                ((mh.g4) obj3).getWebViewContainer().C((String) obj2, (String) obj, false);
                break;
            case 15:
                org.telegram.ui.Components.xk xkVar = ((org.telegram.ui.Components.uk) obj3).b;
                xkVar.t0.d(((org.telegram.ui.Components.wk) obj2).c, xkVar.u0, true, 0, ((Long) obj).longValue());
                xkVar.b.dismiss(true);
                break;
            case 16:
                org.telegram.ui.Components.av avVar = (org.telegram.ui.Components.av) obj3;
                boolean[] zArr = (boolean[]) obj2;
                if (((TLRPC.TL_messages_stickerSet) obj) == null && !zArr[0]) {
                    zArr[0] = true;
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.zu(avVar, i13));
                    break;
                }
                break;
            case 17:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj3;
                org.telegram.ui.Components.zq zqVar = (org.telegram.ui.Components.zq) obj2;
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    linkedHashSet.addAll(tL_emojiList.document_id);
                }
                zqVar.run();
                break;
            case 18:
                org.telegram.ui.Components.ux uxVar = (org.telegram.ui.Components.ux) obj3;
                org.telegram.ui.Components.vx vxVar = uxVar.a;
                org.telegram.ui.Components.wy wyVar = vxVar.B;
                MediaDataController.getInstance(wyVar.Y0).getEmojiSuggestions(wyVar.S0, vxVar.v, false, new androidx.car.app.utils.a(27, uxVar, (Runnable) obj, (String) obj2), null, SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(wyVar.Y0).isPremium(), false, true, 25);
                break;
            case 19:
                ArrayList arrayList2 = (ArrayList) obj2;
                Runnable runnable = (Runnable) obj;
                org.telegram.ui.Components.vx vxVar2 = ((org.telegram.ui.Components.ux) obj3).a;
                if (ConnectionsManager.getInstance(vxVar2.B.Y0).getConnectionState() == 3) {
                    org.telegram.ui.Components.vx.E(vxVar2, runnable, arrayList2, false);
                    break;
                } else {
                    runnable.run();
                    break;
                }
            case 20:
                org.telegram.ui.Components.py pyVar = (org.telegram.ui.Components.py) obj3;
                Runnable runnable2 = (Runnable) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                int size = arrayList3.size();
                while (i12 < size) {
                    Object obj4 = arrayList3.get(i12);
                    i12++;
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) obj4;
                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                        arrayList = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(pyVar.w.M.Y0).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                        arrayList = stickerSet != null ? stickerSet.documents : null;
                    } else {
                        arrayList = stickerSetCovered.covers;
                    }
                    if (arrayList != null && !arrayList.isEmpty()) {
                        pyVar.n.add(new org.telegram.ui.Components.ox(stickerSetCovered, arrayList));
                    }
                }
                runnable2.run();
                break;
            case 21:
                org.telegram.ui.Components.n00 n00Var = (org.telegram.ui.Components.n00) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj;
                if (n00Var.W == null && !(n00Var.V instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready)) {
                    org.telegram.ui.Components.gc M = org.telegram.ui.Components.oc.a0(o2Var).M(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FolderLinkAddedTitle, n00Var.b0)), LocaleController.formatPluralString("FolderLinkAddedSubtitle", arrayList4.size(), new Object[0]), R.raw.contact_check);
                    M.j = 5000;
                    M.j();
                    break;
                } else {
                    org.telegram.ui.Components.gc M2 = org.telegram.ui.Components.oc.a0(o2Var).M(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FolderLinkUpdatedTitle, n00Var.b0)), arrayList4.size() <= 0 ? LocaleController.formatPluralString("FolderLinkUpdatedSubtitle", n00Var.d0.size(), new Object[0]) : LocaleController.formatPluralString("FolderLinkUpdatedJoinedSubtitle", arrayList4.size(), new Object[0]), R.raw.folder_in);
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
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, org.telegram.ui.ActionBar.f6.I.q() ? 0.04f : 0.25f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, org.telegram.ui.ActionBar.f6.I.q() ? -0.04f : -0.07f);
                Bitmap applyColorMatrix = AndroidUtilities.applyColorMatrix(bitmap, colorMatrix);
                applyColorMatrix.setHasAlpha(false);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                colorMatrix2.setSaturation(org.telegram.ui.ActionBar.f6.I.q() ? 2.0f : 3.0f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, org.telegram.ui.ActionBar.f6.I.q() ? -0.2f : -0.07f);
                Bitmap applyColorMatrix2 = AndroidUtilities.applyColorMatrix(bitmap, colorMatrix2);
                applyColorMatrix2.setHasAlpha(false);
                bitmap.recycle();
                dVar.run(applyColorMatrix, applyColorMatrix2);
                break;
            case 23:
                MessagesController messagesController = (MessagesController) obj3;
                org.telegram.ui.Components.oq0 oq0Var = (org.telegram.ui.Components.oq0) obj2;
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (!((Boolean) obj).booleanValue()) {
                    if (U != null) {
                        org.telegram.ui.Components.oc.a0(U).M(LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText), R.raw.error).j();
                        break;
                    }
                } else {
                    messagesController.setContentSettings(true);
                    if (U != null) {
                        org.telegram.ui.Components.oc.a0(U).P(R.raw.chats_infotip, AndroidUtilities.replaceArrows(AndroidUtilities.premiumText(LocaleController.getString(R.string.SensitiveContentSettingsToast), new org.telegram.ui.Components.id(i11, U)), true)).k(true);
                    }
                    oq0Var.run(Boolean.TRUE);
                    break;
                }
                break;
            case 24:
                org.telegram.ui.Components.eu0.j((org.telegram.ui.Components.eu0) obj3, (TL_stories.StoryItem) obj2, (ih.o6) obj);
                break;
            case 25:
                ht htVar = (ht) obj3;
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) obj2;
                Long l13 = (Long) obj;
                htVar.getClass();
                Bundle bundle = new Bundle();
                if (l13.longValue() >= 0) {
                    bundle.putLong("user_id", l13.longValue());
                } else {
                    bundle.putLong("chat_id", -l13.longValue());
                }
                o2Var2.presentFragment(new ProfileActivity(bundle, null));
                htVar.p();
                break;
            case 26:
                dt dtVar = (dt) obj3;
                Boolean bool = (Boolean) obj;
                dtVar.getClass();
                ((Utilities.Callback) obj2).run(bool);
                if (bool.booleanValue()) {
                    dtVar.a.p();
                    break;
                }
                break;
            case 27:
                dy dyVar = (dy) obj3;
                Activity activity = (Activity) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    dyVar.showDialog(new qj0(activity, !org.telegram.ui.Components.kd0.c(), new sv(activity, 0)));
                    break;
                }
                break;
            case 28:
                xo0 xo0Var = (xo0) obj2;
                Integer num = (Integer) obj;
                n00 n00Var2 = ((k00) obj3).e;
                if (!n00Var2.getUserConfig().isPremium()) {
                    n00Var2.showDialog(new zf.x0((org.telegram.ui.ActionBar.o2) n00Var2, 35, true));
                    break;
                } else {
                    int intValue = num.intValue();
                    n00Var2.A = intValue;
                    xo0Var.a(intValue, true);
                    b00 b00Var = n00Var2.E;
                    if (b00Var != null) {
                        b00Var.d(!n00Var2.getUserConfig().isPremium() ? -1 : n00Var2.A, true);
                    }
                    n00Var2.h0(true);
                    break;
                }
            default:
                y40 y40Var = (y40) obj3;
                fh.l2 l2Var = (fh.l2) obj2;
                Bitmap bitmap2 = (Bitmap) obj;
                if (l2Var != null) {
                    y40Var.getClass();
                    l2Var.setVisibility(0);
                }
                y40Var.c = bitmap2;
                Paint paint = new Paint(1);
                y40Var.d = paint;
                Bitmap bitmap3 = y40Var.c;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                y40Var.e = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix3 = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix3, org.telegram.ui.ActionBar.f6.I.q() ? 0.05f : 0.25f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix3, org.telegram.ui.ActionBar.f6.I.q() ? -0.02f : -0.04f);
                y40Var.d.setColorFilter(new ColorMatrixColorFilter(colorMatrix3));
                break;
        }
    }

    public /* synthetic */ df(org.telegram.ui.Components.ki kiVar, qn qnVar) {
        this.a = 13;
        this.c = kiVar;
        this.b = qnVar;
    }
}
