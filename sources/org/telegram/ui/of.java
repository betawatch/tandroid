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
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
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

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class of implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ of(int i10, Object obj, Object obj2) {
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
        int i12 = 3;
        int i13 = 2;
        int i14 = 0;
        int i15 = 1;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i11) {
            case 0:
                zn znVar = (zn) obj3;
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) obj2;
                Long l4 = (Long) obj;
                if (znVar.R3 == 1) {
                    org.telegram.ui.Components.d5.M(znVar.getParentActivity(), znVar.T5, new b7(znVar, botInlineResult, l4, i13), znVar.ea);
                    break;
                } else {
                    znVar.cb(botInlineResult, true, 0, l4.longValue());
                    break;
                }
            case 1:
                zn.B0((zn) obj3, (i41[]) obj2, (org.telegram.ui.Components.y70) obj);
                break;
            case 2:
                zn znVar2 = (zn) obj3;
                org.telegram.ui.ActionBar.b2[] b2VarArr = (org.telegram.ui.ActionBar.b2[]) obj2;
                TL_stats.TL_statsPollStats tL_statsPollStats = (TL_stats.TL_statsPollStats) obj;
                try {
                    b2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                b2VarArr[0] = null;
                if (tL_statsPollStats != null) {
                    if (tL_statsPollStats.votes_graph instanceof TL_stats.TL_statsGraphError) {
                        org.telegram.messenger.l0.o(R.string.PollStatsWillLater, org.telegram.ui.Components.xc.a0(znVar2), R.raw.timer_toast, 24);
                        break;
                    } else {
                        new th.g(znVar2.getParentActivity(), znVar2.ea, tL_statsPollStats).show();
                        break;
                    }
                }
                break;
            case 3:
                zn znVar3 = (zn) obj3;
                MessageObject messageObject = (MessageObject) obj2;
                znVar3.getClass();
                TLRPC.SuggestedPost tl = ((MessageSuggestionParams) obj).toTl();
                if (messageObject != null && messageObject.messageOwner != null && tl != null) {
                    znVar3.getMessagesController().addOfferToSuggestedMessage(messageObject, tl);
                    break;
                }
                break;
            case 4:
                hg.a2 a2Var = (hg.a2) obj2;
                String str = (String) obj;
                zn znVar4 = ((nj) obj3).b;
                if (a2Var != null) {
                    i10 = ((org.telegram.ui.ActionBar.n2) znVar4).currentAccount;
                    hg.b2.f(i10).k(a2Var.a, str);
                }
                znVar4.Q3 = str;
                znVar4.a1.setTitle(str);
                break;
            case 5:
                MessageObject messageObject2 = (MessageObject) obj2;
                Long l10 = (Long) obj;
                zn znVar5 = ((ln) obj3).a;
                if (znVar5.f7()) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(messageObject2.getDiceEmoji(), znVar5.T5, znVar5.n5, znVar5.X3, null, false, null, null, null, true, 0, 0, null, false);
                    of2.sendMessageChatArguments = znVar5.C8();
                    of2.dice_stake = l10.longValue();
                    znVar5.getSendMessagesHelper().sendMessage(of2);
                    break;
                }
                break;
            case 6:
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) obj2;
                zn znVar6 = ((ln) obj3).a;
                if (((Boolean) obj).booleanValue()) {
                    while (i14 < znVar6.x0.getChildCount()) {
                        View childAt = znVar6.x0.getChildAt(i14);
                        if (childAt instanceof org.telegram.ui.Cells.u1) {
                            org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) childAt;
                            if (u1Var2.getMessageObject() != null && u1Var2.getMessageObject().isSensitive()) {
                                u1Var2.h4();
                            }
                        }
                        i14++;
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
            case 7:
                ln lnVar = (ln) obj3;
                of ofVar = (of) obj2;
                zn znVar7 = lnVar.a;
                if (((Boolean) obj).booleanValue()) {
                    znVar7.getMessagesController().setContentSettings(true);
                    org.telegram.ui.Components.xc.a0(znVar7).P(R.raw.chats_infotip, AndroidUtilities.replaceArrows(AndroidUtilities.premiumText(LocaleController.getString(R.string.SensitiveContentSettingsToast), new wm(lnVar, 8)), true)).k(true);
                    ofVar.run(Boolean.TRUE);
                    break;
                } else {
                    org.telegram.ui.Components.xc.a0(znVar7).M(LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText), R.raw.error).j();
                    break;
                }
            case 8:
                TLRPC.Message message = (TLRPC.Message) obj2;
                ((ln) obj3).a.getMessagesController().rejectSuggestedMessage(DialogObject.getPeerDialogId(message.peer_id), message.id, (String) obj);
                break;
            case 9:
                co coVar = (co) obj3;
                coVar.f.t(((dg.a) obj).b, ((TLRPC.WallPaper) obj2).settings.intensity);
                View view = coVar.b;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 10:
                Long l11 = (Long) obj;
                ChatActivityEnterView chatActivityEnterView = ((org.telegram.ui.Components.of) obj3).a;
                long j3 = chatActivityEnterView.Q2;
                MessageObject messageObject3 = chatActivityEnterView.T2;
                threadMessage = chatActivityEnterView.getThreadMessage();
                SendMessagesHelper.SendMessageParams of3 = SendMessagesHelper.SendMessageParams.of((String) obj2, j3, messageObject3, threadMessage, null, false, null, null, null, true, 0, 0, null, false);
                zn znVar8 = chatActivityEnterView.P2;
                of3.sendMessageChatArguments = znVar8 != null ? znVar8.C8() : null;
                of3.effect_id = chatActivityEnterView.S4;
                of3.payStars = l11.longValue();
                of3.monoForumPeer = chatActivityEnterView.getSendMonoForumPeerId();
                of3.suggestionParams = chatActivityEnterView.getSendMessageSuggestionParams();
                SendMessagesHelper.getInstance(chatActivityEnterView.Q).sendMessage(of3);
                chatActivityEnterView.setFieldText("");
                chatActivityEnterView.m0.c();
                org.telegram.ui.Components.xe xeVar = chatActivityEnterView.J0;
                chatActivityEnterView.S4 = 0L;
                xeVar.setEffect(0L);
                break;
            case 11:
                org.telegram.ui.Components.vi viVar = (org.telegram.ui.Components.vi) obj2;
                ((zn) obj3).g5 = (MessageSuggestionParams) obj;
                boolean G1 = viVar.G1(0, true, 0, viVar.s1(), viVar.N0);
                org.telegram.ui.Components.mf mfVar = viVar.h0;
                if (mfVar != null) {
                    mfVar.h(!G1);
                    viVar.h0 = null;
                    break;
                }
                break;
            case 12:
                ((ei.q4) obj3).getWebViewContainer().G((String) obj2, (String) obj, false);
                break;
            case 13:
                org.telegram.ui.Components.gl glVar = ((org.telegram.ui.Components.dl) obj3).b;
                glVar.x0.b(((org.telegram.ui.Components.fl) obj2).c, glVar.y0, true, 0, ((Long) obj).longValue());
                glVar.b.dismiss(true);
                break;
            case 14:
                org.telegram.ui.Components.qv qvVar = (org.telegram.ui.Components.qv) obj3;
                boolean[] zArr = (boolean[]) obj2;
                if (((TLRPC.TL_messages_stickerSet) obj) == null && !zArr[0]) {
                    zArr[0] = true;
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.pv(qvVar, i15));
                    break;
                }
                break;
            case 15:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj3;
                org.telegram.ui.Components.bv bvVar = (org.telegram.ui.Components.bv) obj2;
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    linkedHashSet.addAll(tL_emojiList.document_id);
                }
                bvVar.run();
                break;
            case 16:
                org.telegram.ui.Components.jy jyVar = (org.telegram.ui.Components.jy) obj3;
                org.telegram.ui.Components.ky kyVar = jyVar.a;
                org.telegram.ui.Components.kz kzVar = kyVar.F;
                MediaDataController.getInstance(kzVar.c1).getEmojiSuggestions(kzVar.W0, kyVar.v, false, new ai.r5(jyVar, (String) obj2, (Runnable) obj, 28), null, SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(kzVar.c1).isPremium(), false, true, 25);
                break;
            case 17:
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
            case 18:
                org.telegram.ui.Components.dz dzVar = (org.telegram.ui.Components.dz) obj3;
                Runnable runnable2 = (Runnable) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                int size = arrayList3.size();
                while (i14 < size) {
                    Object obj4 = arrayList3.get(i14);
                    i14++;
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) obj4;
                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                        arrayList = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(dzVar.w.Q.c1).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                        arrayList = stickerSet != null ? stickerSet.documents : null;
                    } else {
                        arrayList = stickerSetCovered.covers;
                    }
                    if (arrayList != null && !arrayList.isEmpty()) {
                        dzVar.n.add(new org.telegram.ui.Components.dy(stickerSetCovered, arrayList));
                    }
                }
                runnable2.run();
                break;
            case 19:
                org.telegram.ui.Components.c10 c10Var = (org.telegram.ui.Components.c10) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj;
                if (c10Var.a0 != null || (c10Var.Z instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready)) {
                    org.telegram.ui.Components.pc M = org.telegram.ui.Components.xc.a0(n2Var).M(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FolderLinkUpdatedTitle, c10Var.f0)), arrayList4.size() <= 0 ? LocaleController.formatPluralString("FolderLinkUpdatedSubtitle", c10Var.h0.size(), new Object[0]) : LocaleController.formatPluralString("FolderLinkUpdatedJoinedSubtitle", arrayList4.size(), new Object[0]), R.raw.folder_in);
                    M.j = 5000;
                    M.j();
                    break;
                } else {
                    org.telegram.ui.Components.pc M2 = org.telegram.ui.Components.xc.a0(n2Var).M(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FolderLinkAddedTitle, c10Var.f0)), LocaleController.formatPluralString("FolderLinkAddedSubtitle", arrayList4.size(), new Object[0]), R.raw.contact_check);
                    M2.j = 5000;
                    M2.j();
                    break;
                }
            case 20:
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
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, org.telegram.ui.ActionBar.j6.I.q() ? 0.04f : 0.25f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, org.telegram.ui.ActionBar.j6.I.q() ? -0.04f : -0.07f);
                Bitmap applyColorMatrix = AndroidUtilities.applyColorMatrix(bitmap, colorMatrix);
                applyColorMatrix.setHasAlpha(false);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                colorMatrix2.setSaturation(org.telegram.ui.ActionBar.j6.I.q() ? 2.0f : 3.0f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, org.telegram.ui.ActionBar.j6.I.q() ? -0.2f : -0.07f);
                Bitmap applyColorMatrix2 = AndroidUtilities.applyColorMatrix(bitmap, colorMatrix2);
                applyColorMatrix2.setHasAlpha(false);
                bitmap.recycle();
                dVar.run(applyColorMatrix, applyColorMatrix2);
                break;
            case 21:
                MessagesController messagesController = (MessagesController) obj3;
                org.telegram.ui.Components.tr0 tr0Var = (org.telegram.ui.Components.tr0) obj2;
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (((Boolean) obj).booleanValue()) {
                    messagesController.setContentSettings(true);
                    if (U != null) {
                        org.telegram.ui.Components.xc.a0(U).P(R.raw.chats_infotip, AndroidUtilities.replaceArrows(AndroidUtilities.premiumText(LocaleController.getString(R.string.SensitiveContentSettingsToast), new org.telegram.ui.Components.td(i13, U)), true)).k(true);
                    }
                    tr0Var.run(Boolean.TRUE);
                    break;
                } else if (U != null) {
                    org.telegram.ui.Components.xc.a0(U).M(LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText), R.raw.error).j();
                    break;
                }
                break;
            case 22:
                org.telegram.ui.Components.lv0.j((org.telegram.ui.Components.lv0) obj3, (TL_stories.StoryItem) obj2, (ai.e9) obj);
                break;
            case 23:
                st stVar = (st) obj3;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) obj2;
                Long l12 = (Long) obj;
                stVar.getClass();
                Bundle bundle = new Bundle();
                if (l12.longValue() >= 0) {
                    bundle.putLong("user_id", l12.longValue());
                } else {
                    bundle.putLong("chat_id", -l12.longValue());
                }
                n2Var2.presentFragment(new ProfileActivity(bundle, null));
                stVar.p();
                break;
            case 24:
                ot otVar = (ot) obj3;
                Boolean bool = (Boolean) obj;
                otVar.getClass();
                ((Utilities.Callback) obj2).run(bool);
                if (bool.booleanValue()) {
                    otVar.a.p();
                    break;
                }
                break;
            case 25:
                uy uyVar = (uy) obj3;
                Activity activity = (Activity) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    uyVar.showDialog(new ik0(activity, !org.telegram.ui.Components.oe0.c(), new hw(activity, 0)));
                    break;
                }
                break;
            case 26:
                zp0 zp0Var = (zp0) obj2;
                Integer num = (Integer) obj;
                f10 f10Var = ((c10) obj3).e;
                if (f10Var.getUserConfig().isPremium()) {
                    int intValue = num.intValue();
                    f10Var.E = intValue;
                    zp0Var.a(intValue, true);
                    t00 t00Var = f10Var.I;
                    if (t00Var != null) {
                        t00Var.d(!f10Var.getUserConfig().isPremium() ? -1 : f10Var.E, true);
                    }
                    f10Var.i0(true);
                    break;
                } else {
                    f10Var.showDialog(new rg.x0((org.telegram.ui.ActionBar.n2) f10Var, 35, true));
                    break;
                }
            case 27:
                r50 r50Var = (r50) obj3;
                s50 s50Var = (s50) obj2;
                Bitmap bitmap2 = (Bitmap) obj;
                if (s50Var != null) {
                    r50Var.getClass();
                    s50Var.setVisibility(0);
                }
                r50Var.c = bitmap2;
                Paint paint = new Paint(1);
                r50Var.d = paint;
                Bitmap bitmap3 = r50Var.c;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                r50Var.e = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix3 = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix3, org.telegram.ui.ActionBar.j6.I.q() ? 0.05f : 0.25f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix3, org.telegram.ui.ActionBar.j6.I.q() ? -0.02f : -0.04f);
                r50Var.d.setColorFilter(new ColorMatrixColorFilter(colorMatrix3));
                break;
            case 28:
                hc0 hc0Var = (hc0) obj3;
                TLRPC.User[] userArr = (TLRPC.User[]) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                hc0Var.a();
                if (user != null) {
                    long j10 = userArr[0].id;
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("user_id", user.id);
                    hc0Var.n(new gc0(bundle2, user, userArr, j10), false);
                    break;
                }
                break;
            default:
                uj0 uj0Var = (uj0) obj3;
                String str2 = (String) obj2;
                List<TLRPC.User> list = (List) obj;
                HashSet hashSet = new HashSet();
                ArrayList arrayList5 = uj0Var.f0;
                arrayList5.clear();
                if (list != null) {
                    for (TLRPC.User user2 : list) {
                        if (user2 != null && !hashSet.contains(Long.valueOf(user2.id)) && uj0Var.R(user2)) {
                            arrayList5.add(user2);
                            hashSet.add(Long.valueOf(user2.id));
                        }
                    }
                }
                Boolean bool2 = uj0Var.r0;
                if (bool2 == null || !bool2.booleanValue()) {
                    uj0Var.U(true, true);
                    break;
                } else {
                    pj0 pj0Var = new pj0(i14, uj0Var, hashSet);
                    MessagesController messagesController2 = MessagesController.getInstance(UserConfig.selectedAccount);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                    if (str2 == null || str2.isEmpty()) {
                        AndroidUtilities.runOnUIThread(new rg.q1(pj0Var, 6));
                    } else {
                        TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
                        tL_contacts_search.q = str2;
                        tL_contacts_search.limit = 50;
                        i14 = connectionsManager.sendRequest(tL_contacts_search, new bj1(i12, messagesController2, pj0Var));
                    }
                    uj0Var.m0 = i14;
                    break;
                }
                break;
        }
    }

    public /* synthetic */ of(org.telegram.ui.Components.vi viVar, zn znVar) {
        this.a = 11;
        this.c = viVar;
        this.b = znVar;
    }
}
