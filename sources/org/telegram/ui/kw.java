package org.telegram.ui;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotGuardHelper;
import org.telegram.messenger.CacheByChatsController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kw(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets;
        int i10 = this.a;
        int i11 = 14;
        int i12 = 24;
        int i13 = 2;
        int i14 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                ((ty) obj).a.postOnAnimation(new pv((uy) obj2, i11));
                break;
            case 1:
                uy uyVar = (uy) obj2;
                uyVar.getMessagesController().addDialogToFolder((ArrayList) obj, (uyVar.V2 == 0 && uyVar.X2 == 0) ? 0 : 1, -1, null, 0L);
                break;
            case 2:
                ArrayList arrayList = (ArrayList) obj;
                uy uyVar2 = ((tw) obj2).b;
                uyVar2.y3 = 2;
                uyVar2.A4(true, true);
                uyVar2.o3();
                while (i14 < arrayList.size()) {
                    long j3 = ((TLRPC.Dialog) arrayList.get(i14)).id;
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(i14);
                    if (uyVar2.getMessagesController().isForum(j3) || uyVar2.getMessagesController().isMonoForumWithManageRights(j3)) {
                        uyVar2.getMessagesController().markAllTopicsAsRead(j3);
                    }
                    uyVar2.getMessagesController().markMentionsAsRead(j3, 0L);
                    MessagesController messagesController = uyVar2.getMessagesController();
                    int i15 = dialog.top_message;
                    messagesController.markDialogAsRead(j3, i15, i15, dialog.last_message_date, false, 0L, 0, true, 0);
                    i14++;
                }
                break;
            case 3:
                ((tw) obj2).d((MessagesController.DialogFilter) obj);
                break;
            case 4:
                CharSequence charSequence = (CharSequence) obj;
                uy uyVar3 = ((fx) obj2).a;
                uyVar3.H2 = null;
                org.telegram.ui.Components.mq0 mq0Var = uyVar3.G2;
                if (mq0Var != null && mq0Var.h) {
                    mq0Var.e(charSequence, false);
                    break;
                }
                break;
            case 5:
                org.telegram.ui.ActionBar.n2[] n2VarArr = (org.telegram.ui.ActionBar.n2[]) obj;
                ((tx) obj2).b.removeSelfFromStack();
                if (n2VarArr[1] != null) {
                    n2VarArr[0].removeSelfFromStack();
                    n2VarArr[1].finishFragment();
                    break;
                } else {
                    n2VarArr[0].finishFragment();
                    break;
                }
            case 6:
                gz gzVar = (gz) obj2;
                bo boVar = gzVar.a;
                org.telegram.ui.Components.vx0 vx0Var = new org.telegram.ui.Components.vx0(boVar.getParentActivity(), gzVar.a, ((MessageObject) obj).getInputStickerSet(), null, boVar.Y, boVar.getResourceProvider());
                vx0Var.setCalcMandatoryInsets(boVar.x9());
                boVar.showDialog(vx0Var);
                break;
            case 7:
                a00 a00Var = (a00) obj2;
                a00Var.getClass();
                ((org.telegram.ui.ActionBar.b2) obj).dismiss();
                b00 b00Var = a00Var.E;
                c00 c00Var = b00Var.c;
                Utilities.Callback callback = c00Var.x;
                if (callback != null) {
                    callback.run(c00Var.d);
                }
                b00Var.c.finishFragment();
                break;
            case 8:
                f10 f10Var = (f10) obj2;
                c00 c00Var2 = new c00(f10Var.r, ((w00) obj).m);
                c00Var2.y = new f00(f10Var, 1);
                c00Var2.x = new f00(f10Var, 2);
                f10Var.presentFragment(c00Var2);
                break;
            case 9:
                f10 f10Var2 = (f10) obj2;
                Runnable runnable = (Runnable) obj;
                f10Var2.h = false;
                f10Var2.s = false;
                f10Var2.r.flags = f10Var2.y;
                f10Var2.i0(true);
                f10Var2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 10:
                f10 f10Var3 = (f10) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList2 = f10Var3.L;
                f10Var3.N = false;
                if (tLObject instanceof TL_chatlists.TL_chatlists_exportedInvites) {
                    TL_chatlists.TL_chatlists_exportedInvites tL_chatlists_exportedInvites = (TL_chatlists.TL_chatlists_exportedInvites) tLObject;
                    f10Var3.getMessagesController().putChats(tL_chatlists_exportedInvites.chats, false);
                    f10Var3.getMessagesController().putUsers(tL_chatlists_exportedInvites.users, false);
                    arrayList2.clear();
                    arrayList2.addAll(tL_chatlists_exportedInvites.invites);
                    f10Var3.w0();
                }
                f10Var3.M = 0;
                break;
            case 11:
                f10 f10Var4 = (f10) obj2;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj;
                MessagesController.DialogFilter dialogFilter = f10Var4.r;
                if (b2Var != null) {
                    try {
                        b2Var.dismiss();
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                f10Var4.getMessagesController().removeFilter(dialogFilter);
                f10Var4.getMessagesStorage().deleteDialogFilter(dialogFilter);
                f10Var4.finishFragment();
                break;
            case 12:
                f10 f10Var5 = (f10) obj2;
                f10Var5.getClass();
                f10Var5.m0(((TL_chatlists.TL_chatlists_exportedChatlistInvite) obj).invite);
                break;
            case 13:
                FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) obj2;
                if (((TLRPC.TL_messages_toggleDialogFilterTags) obj).enabled && !filtersSetupActivity.x) {
                    filtersSetupActivity.getMessagesController().loadRemoteFilters(true);
                    filtersSetupActivity.x = true;
                    break;
                }
                break;
            case 14:
                FiltersSetupActivity filtersSetupActivity2 = ((e20) obj2).e;
                filtersSetupActivity2.getMessagesController().suggestedFilters.remove((TLRPC.TL_dialogFilterSuggested) obj);
                filtersSetupActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
                break;
            case 15:
                ArrayList arrayList3 = (ArrayList) obj;
                ArrayList arrayList4 = ((i60) obj2).Y1;
                for (int i16 = 0; i16 < arrayList4.size(); i16++) {
                    if (((org.telegram.ui.Components.voip.u) arrayList4.get(i16)).w != null) {
                        arrayList3.remove(((org.telegram.ui.Components.voip.u) arrayList4.get(i16)).w);
                    }
                }
                while (i14 < arrayList3.size()) {
                    ChatObject.VideoParticipant videoParticipant = (ChatObject.VideoParticipant) arrayList3.get(i14);
                    if (videoParticipant.participant.self) {
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setLocalSink(null, videoParticipant.presentation);
                        }
                    } else if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().removeRemoteSink(videoParticipant.participant, videoParticipant.presentation);
                    }
                    i14++;
                }
                break;
            case 16:
                i60 i60Var = (i60) obj2;
                i60Var.d.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShowAlert, 6, ((TLRPC.TL_error) obj).text);
                i60Var.dismiss();
                break;
            case 17:
                w5 w5Var = (w5) obj2;
                try {
                    Bitmap bitmap = ((org.telegram.ui.Components.voip.s2) obj).e.getBitmap(100, 100);
                    if (bitmap == null) {
                        break;
                    } else {
                        AndroidUtilities.runOnUIThread(new kw(18, w5Var, ci.n0.b(bitmap, true)));
                        break;
                    }
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 18:
                ((i60) ((w5) obj2).b).U0.setNewColors((int[]) obj);
                break;
            case 19:
                t70.V((t70) obj2, (TLRPC.TL_error) obj);
                break;
            case 20:
                p70 p70Var = (p70) obj2;
                String str = (String) obj;
                q70 q70Var = p70Var.a;
                q70Var.e = str;
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                tL_inputStickerSetShortName.short_name = str;
                q70Var.c = q70Var.h.getConnectionsManager().sendRequest(tL_messages_getStickerSet, new qo(i12, p70Var, str), 66);
                break;
            case 21:
                TLObject tLObject2 = (TLObject) obj;
                q70 q70Var2 = ((p70) obj2).a;
                if (tLObject2 != null) {
                    t70.a0(q70Var2.h, (TLRPC.TL_messages_stickerSet) tLObject2);
                    break;
                } else {
                    t70.a0(q70Var2.h, null);
                    break;
                }
            case 22:
                s70 s70Var = (s70) obj2;
                String str2 = (String) obj;
                s70Var.h = str2;
                t70 t70Var = s70Var.r;
                if (t70Var.N) {
                    TLRPC.TL_messages_searchEmojiStickerSets tL_messages_searchEmojiStickerSets = new TLRPC.TL_messages_searchEmojiStickerSets();
                    tL_messages_searchEmojiStickerSets.q = str2;
                    tL_messages_searchStickerSets = tL_messages_searchEmojiStickerSets;
                } else {
                    TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets2 = new TLRPC.TL_messages_searchStickerSets();
                    tL_messages_searchStickerSets2.q = str2;
                    tL_messages_searchStickerSets = tL_messages_searchStickerSets2;
                }
                s70Var.n = t70Var.getConnectionsManager().sendRequest(tL_messages_searchStickerSets, new aa(s70Var, str2, str2, i11), 66);
                break;
            case 23:
                AndroidUtilities.runOnUIThread(new l4(i13, (m80) obj2, (CacheByChatsController.KeepMediaException) obj), 150L);
                break;
            case 24:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) obj2;
                languageSelectActivity.e = (ArrayList) obj;
                languageSelectActivity.c.l();
                break;
            case 25:
                LanguageSelectActivity languageSelectActivity2 = (LanguageSelectActivity) obj2;
                String str3 = (String) obj;
                if (str3.trim().toLowerCase().length() == 0) {
                    AndroidUtilities.runOnUIThread(new kw(i12, languageSelectActivity2, new ArrayList()));
                    break;
                } else {
                    System.currentTimeMillis();
                    ArrayList arrayList5 = new ArrayList();
                    int size = languageSelectActivity2.h.size();
                    for (int i17 = 0; i17 < size; i17++) {
                        LocaleController.LocaleInfo localeInfo = (LocaleController.LocaleInfo) languageSelectActivity2.h.get(i17);
                        if (localeInfo.name.toLowerCase().startsWith(str3) || localeInfo.nameEnglish.toLowerCase().startsWith(str3)) {
                            arrayList5.add(localeInfo);
                        }
                    }
                    int size2 = languageSelectActivity2.f.size();
                    while (i14 < size2) {
                        LocaleController.LocaleInfo localeInfo2 = (LocaleController.LocaleInfo) languageSelectActivity2.f.get(i14);
                        if (localeInfo2.name.toLowerCase().startsWith(str3) || localeInfo2.nameEnglish.toLowerCase().startsWith(str3)) {
                            arrayList5.add(localeInfo2);
                        }
                        i14++;
                    }
                    AndroidUtilities.runOnUIThread(new kw(i12, languageSelectActivity2, arrayList5));
                    break;
                }
                break;
            case 26:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                TLObject tLObject3 = (TLObject) obj;
                Pattern pattern = LaunchActivity.B1;
                if (tLObject3 instanceof TL_account.resolvedBusinessChatLinks) {
                    TL_account.resolvedBusinessChatLinks resolvedbusinesschatlinks = (TL_account.resolvedBusinessChatLinks) tLObject3;
                    MessagesController.getInstance(launchActivity.O).putUsers(resolvedbusinesschatlinks.users, false);
                    MessagesController.getInstance(launchActivity.O).putChats(resolvedbusinesschatlinks.chats, false);
                    MessagesStorage.getInstance(launchActivity.O).putUsersAndChats(resolvedbusinesschatlinks.users, resolvedbusinesschatlinks.chats, true, true);
                    Bundle bundle = new Bundle();
                    TLRPC.Peer peer = resolvedbusinesschatlinks.peer;
                    if (peer instanceof TLRPC.TL_peerUser) {
                        bundle.putLong("user_id", peer.user_id);
                    } else if ((peer instanceof TLRPC.TL_peerChat) || (peer instanceof TLRPC.TL_peerChannel)) {
                        bundle.putLong("chat_id", peer.channel_id);
                    }
                    bo boVar2 = new bo(bundle);
                    boVar2.ia = resolvedbusinesschatlinks;
                    launchActivity.q0(boVar2, false, true);
                    break;
                } else {
                    launchActivity.B0(org.telegram.ui.Components.c5.N(launchActivity, LocaleController.getString(R.string.BusinessLink), LocaleController.getString(R.string.BusinessLinkInvalid)));
                    break;
                }
            case 27:
                LaunchActivity launchActivity2 = (LaunchActivity) obj2;
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) obj;
                Pattern pattern2 = LaunchActivity.B1;
                MessagesController.getInstance(launchActivity2.O).putUsers(tL_chatInviteJoinResultWebView.users, false);
                BotGuardHelper botGuardHelper = BotGuardHelper.getInstance(launchActivity2.O);
                long j10 = tL_chatInviteJoinResultWebView.bot_id;
                botGuardHelper.openGuardBotWebApp(j10, j10, tL_chatInviteJoinResultWebView.query_id);
                break;
            case 28:
                Pattern pattern3 = LaunchActivity.B1;
                String string = LocaleController.getString(R.string.AuthAnotherClient);
                StringBuilder sb2 = new StringBuilder();
                org.telegram.messenger.vl.m(R.string.ErrorOccurred, "\n", sb2);
                sb2.append(((TLRPC.TL_error) obj).text);
                org.telegram.ui.Components.c5.u0((h) obj2, string, sb2.toString(), null);
                break;
            default:
                LaunchActivity launchActivity3 = (LaunchActivity) obj2;
                String str4 = (String) obj;
                if (!launchActivity3.q0.getFragmentStack().isEmpty()) {
                    launchActivity3.q0.getFragmentStack().get(0).presentFragment(new PremiumPreviewFragment(0, Uri.parse(str4).getQueryParameter("ref")));
                    break;
                }
                break;
        }
    }
}
