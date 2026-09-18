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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mw(int i10, Object obj, Object obj2) {
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
                ((vy) obj).a.postOnAnimation(new rv((wy) obj2, i11));
                break;
            case 1:
                wy wyVar = (wy) obj2;
                wyVar.getMessagesController().addDialogToFolder((ArrayList) obj, (wyVar.V2 == 0 && wyVar.X2 == 0) ? 0 : 1, -1, null, 0L);
                break;
            case 2:
                ArrayList arrayList = (ArrayList) obj;
                wy wyVar2 = ((vw) obj2).b;
                wyVar2.y3 = 2;
                wyVar2.A4(true, true);
                wyVar2.o3();
                while (i14 < arrayList.size()) {
                    long j3 = ((TLRPC.Dialog) arrayList.get(i14)).id;
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(i14);
                    if (wyVar2.getMessagesController().isForum(j3) || wyVar2.getMessagesController().isMonoForumWithManageRights(j3)) {
                        wyVar2.getMessagesController().markAllTopicsAsRead(j3);
                    }
                    wyVar2.getMessagesController().markMentionsAsRead(j3, 0L);
                    MessagesController messagesController = wyVar2.getMessagesController();
                    int i15 = dialog.top_message;
                    messagesController.markDialogAsRead(j3, i15, i15, dialog.last_message_date, false, 0L, 0, true, 0);
                    i14++;
                }
                break;
            case 3:
                ((vw) obj2).d((MessagesController.DialogFilter) obj);
                break;
            case 4:
                CharSequence charSequence = (CharSequence) obj;
                wy wyVar3 = ((hx) obj2).a;
                wyVar3.H2 = null;
                org.telegram.ui.Components.nq0 nq0Var = wyVar3.G2;
                if (nq0Var != null && nq0Var.h) {
                    nq0Var.e(charSequence, false);
                    break;
                }
                break;
            case 5:
                org.telegram.ui.ActionBar.o2[] o2VarArr = (org.telegram.ui.ActionBar.o2[]) obj;
                ((vx) obj2).b.removeSelfFromStack();
                if (o2VarArr[1] != null) {
                    o2VarArr[0].removeSelfFromStack();
                    o2VarArr[1].finishFragment();
                    break;
                } else {
                    o2VarArr[0].finishFragment();
                    break;
                }
            case 6:
                iz izVar = (iz) obj2;
                bo boVar = izVar.a;
                org.telegram.ui.Components.wx0 wx0Var = new org.telegram.ui.Components.wx0(boVar.getParentActivity(), izVar.a, ((MessageObject) obj).getInputStickerSet(), null, boVar.Y, boVar.getResourceProvider());
                wx0Var.setCalcMandatoryInsets(boVar.x9());
                boVar.showDialog(wx0Var);
                break;
            case 7:
                c00 c00Var = (c00) obj2;
                c00Var.getClass();
                ((org.telegram.ui.ActionBar.c2) obj).dismiss();
                d00 d00Var = c00Var.E;
                e00 e00Var = d00Var.c;
                Utilities.Callback callback = e00Var.x;
                if (callback != null) {
                    callback.run(e00Var.d);
                }
                d00Var.c.finishFragment();
                break;
            case 8:
                h10 h10Var = (h10) obj2;
                e00 e00Var2 = new e00(h10Var.r, ((y00) obj).m);
                e00Var2.y = new h00(h10Var, 1);
                e00Var2.x = new h00(h10Var, 2);
                h10Var.presentFragment(e00Var2);
                break;
            case 9:
                h10 h10Var2 = (h10) obj2;
                Runnable runnable = (Runnable) obj;
                h10Var2.h = false;
                h10Var2.s = false;
                h10Var2.r.flags = h10Var2.y;
                h10Var2.i0(true);
                h10Var2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 10:
                h10 h10Var3 = (h10) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList2 = h10Var3.L;
                h10Var3.N = false;
                if (tLObject instanceof TL_chatlists.TL_chatlists_exportedInvites) {
                    TL_chatlists.TL_chatlists_exportedInvites tL_chatlists_exportedInvites = (TL_chatlists.TL_chatlists_exportedInvites) tLObject;
                    h10Var3.getMessagesController().putChats(tL_chatlists_exportedInvites.chats, false);
                    h10Var3.getMessagesController().putUsers(tL_chatlists_exportedInvites.users, false);
                    arrayList2.clear();
                    arrayList2.addAll(tL_chatlists_exportedInvites.invites);
                    h10Var3.w0();
                }
                h10Var3.M = 0;
                break;
            case 11:
                h10 h10Var4 = (h10) obj2;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) obj;
                MessagesController.DialogFilter dialogFilter = h10Var4.r;
                if (c2Var != null) {
                    try {
                        c2Var.dismiss();
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                h10Var4.getMessagesController().removeFilter(dialogFilter);
                h10Var4.getMessagesStorage().deleteDialogFilter(dialogFilter);
                h10Var4.finishFragment();
                break;
            case 12:
                h10 h10Var5 = (h10) obj2;
                h10Var5.getClass();
                h10Var5.m0(((TL_chatlists.TL_chatlists_exportedChatlistInvite) obj).invite);
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
                FiltersSetupActivity filtersSetupActivity2 = ((g20) obj2).e;
                filtersSetupActivity2.getMessagesController().suggestedFilters.remove((TLRPC.TL_dialogFilterSuggested) obj);
                filtersSetupActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
                break;
            case 15:
                ArrayList arrayList3 = (ArrayList) obj;
                ArrayList arrayList4 = ((k60) obj2).Y1;
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
                k60 k60Var = (k60) obj2;
                k60Var.d.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShowAlert, 6, ((TLRPC.TL_error) obj).text);
                k60Var.dismiss();
                break;
            case 17:
                w5 w5Var = (w5) obj2;
                try {
                    Bitmap bitmap = ((org.telegram.ui.Components.voip.s2) obj).e.getBitmap(100, 100);
                    if (bitmap == null) {
                        break;
                    } else {
                        AndroidUtilities.runOnUIThread(new mw(18, w5Var, ci.n0.b(bitmap, true)));
                        break;
                    }
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 18:
                ((k60) ((w5) obj2).b).U0.setNewColors((int[]) obj);
                break;
            case 19:
                v70.V((v70) obj2, (TLRPC.TL_error) obj);
                break;
            case 20:
                r70 r70Var = (r70) obj2;
                String str = (String) obj;
                s70 s70Var = r70Var.a;
                s70Var.e = str;
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                tL_inputStickerSetShortName.short_name = str;
                s70Var.c = s70Var.h.getConnectionsManager().sendRequest(tL_messages_getStickerSet, new qo(i12, r70Var, str), 66);
                break;
            case 21:
                TLObject tLObject2 = (TLObject) obj;
                s70 s70Var2 = ((r70) obj2).a;
                if (tLObject2 != null) {
                    v70.a0(s70Var2.h, (TLRPC.TL_messages_stickerSet) tLObject2);
                    break;
                } else {
                    v70.a0(s70Var2.h, null);
                    break;
                }
            case 22:
                u70 u70Var = (u70) obj2;
                String str2 = (String) obj;
                u70Var.h = str2;
                v70 v70Var = u70Var.r;
                if (v70Var.N) {
                    TLRPC.TL_messages_searchEmojiStickerSets tL_messages_searchEmojiStickerSets = new TLRPC.TL_messages_searchEmojiStickerSets();
                    tL_messages_searchEmojiStickerSets.q = str2;
                    tL_messages_searchStickerSets = tL_messages_searchEmojiStickerSets;
                } else {
                    TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets2 = new TLRPC.TL_messages_searchStickerSets();
                    tL_messages_searchStickerSets2.q = str2;
                    tL_messages_searchStickerSets = tL_messages_searchStickerSets2;
                }
                u70Var.n = v70Var.getConnectionsManager().sendRequest(tL_messages_searchStickerSets, new ca(u70Var, str2, str2, i11), 66);
                break;
            case 23:
                AndroidUtilities.runOnUIThread(new l4(i13, (o80) obj2, (CacheByChatsController.KeepMediaException) obj), 150L);
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
                    AndroidUtilities.runOnUIThread(new mw(i12, languageSelectActivity2, new ArrayList()));
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
                    AndroidUtilities.runOnUIThread(new mw(i12, languageSelectActivity2, arrayList5));
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
                org.telegram.messenger.wl.l(R.string.ErrorOccurred, "\n", sb2);
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
