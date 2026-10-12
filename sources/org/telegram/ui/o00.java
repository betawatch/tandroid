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
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class o00 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o00(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets;
        int i10 = this.a;
        int i11 = 2;
        int i12 = 1;
        int i13 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                l10 l10Var = (l10) obj2;
                h00 h00Var = new h00(l10Var.r, ((c10) obj).m);
                h00Var.y = new k00(l10Var, i12);
                h00Var.x = new k00(l10Var, i11);
                l10Var.presentFragment(h00Var);
                break;
            case 1:
                l10 l10Var2 = (l10) obj2;
                Runnable runnable = (Runnable) obj;
                l10Var2.h = false;
                l10Var2.s = false;
                l10Var2.r.flags = l10Var2.y;
                l10Var2.i0(true);
                l10Var2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 2:
                l10 l10Var3 = (l10) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList = l10Var3.L;
                l10Var3.N = false;
                if (tLObject instanceof TL_chatlists.TL_chatlists_exportedInvites) {
                    TL_chatlists.TL_chatlists_exportedInvites tL_chatlists_exportedInvites = (TL_chatlists.TL_chatlists_exportedInvites) tLObject;
                    l10Var3.getMessagesController().putChats(tL_chatlists_exportedInvites.chats, false);
                    l10Var3.getMessagesController().putUsers(tL_chatlists_exportedInvites.users, false);
                    arrayList.clear();
                    arrayList.addAll(tL_chatlists_exportedInvites.invites);
                    l10Var3.w0();
                }
                l10Var3.M = 0;
                break;
            case 3:
                l10 l10Var4 = (l10) obj2;
                org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) obj;
                MessagesController.DialogFilter dialogFilter = l10Var4.r;
                if (a2Var != null) {
                    try {
                        a2Var.dismiss();
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                l10Var4.getMessagesController().removeFilter(dialogFilter);
                l10Var4.getMessagesStorage().deleteDialogFilter(dialogFilter);
                l10Var4.finishFragment();
                break;
            case 4:
                l10 l10Var5 = (l10) obj2;
                l10Var5.getClass();
                l10Var5.m0(((TL_chatlists.TL_chatlists_exportedChatlistInvite) obj).invite);
                break;
            case 5:
                FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) obj2;
                if (((TLRPC.TL_messages_toggleDialogFilterTags) obj).enabled && !filtersSetupActivity.x) {
                    filtersSetupActivity.getMessagesController().loadRemoteFilters(true);
                    filtersSetupActivity.x = true;
                    break;
                }
                break;
            case 6:
                FiltersSetupActivity filtersSetupActivity2 = ((i20) obj2).e;
                filtersSetupActivity2.getMessagesController().suggestedFilters.remove((TLRPC.TL_dialogFilterSuggested) obj);
                filtersSetupActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
                break;
            case 7:
                ArrayList arrayList2 = (ArrayList) obj;
                ArrayList arrayList3 = ((n60) obj2).Y1;
                for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                    if (((org.telegram.ui.Components.voip.t) arrayList3.get(i14)).w != null) {
                        arrayList2.remove(((org.telegram.ui.Components.voip.t) arrayList3.get(i14)).w);
                    }
                }
                while (i13 < arrayList2.size()) {
                    ChatObject.VideoParticipant videoParticipant = (ChatObject.VideoParticipant) arrayList2.get(i13);
                    if (videoParticipant.participant.self) {
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setLocalSink(null, videoParticipant.presentation);
                        }
                    } else if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().removeRemoteSink(videoParticipant.participant, videoParticipant.presentation);
                    }
                    i13++;
                }
                break;
            case 8:
                n60 n60Var = (n60) obj2;
                n60Var.d.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShowAlert, 6, ((TLRPC.TL_error) obj).text);
                n60Var.dismiss();
                break;
            case 9:
                a6 a6Var = (a6) obj2;
                try {
                    Bitmap bitmap = ((org.telegram.ui.Components.voip.r2) obj).e.getBitmap(100, 100);
                    if (bitmap == null) {
                        break;
                    } else {
                        AndroidUtilities.runOnUIThread(new o00(10, a6Var, di.m0.b(bitmap, true)));
                        break;
                    }
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 10:
                ((n60) ((a6) obj2).b).U0.setNewColors((int[]) obj);
                break;
            case 11:
                y70.V((y70) obj2, (TLRPC.TL_error) obj);
                break;
            case 12:
                u70 u70Var = (u70) obj2;
                String str = (String) obj;
                v70 v70Var = u70Var.a;
                v70Var.e = str;
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                tL_inputStickerSetShortName.short_name = str;
                v70Var.c = v70Var.h.getConnectionsManager().sendRequest(tL_messages_getStickerSet, new to(24, u70Var, str), 66);
                break;
            case 13:
                TLObject tLObject2 = (TLObject) obj;
                v70 v70Var2 = ((u70) obj2).a;
                if (tLObject2 != null) {
                    y70.a0(v70Var2.h, (TLRPC.TL_messages_stickerSet) tLObject2);
                    break;
                } else {
                    y70.a0(v70Var2.h, null);
                    break;
                }
            case 14:
                x70 x70Var = (x70) obj2;
                String str2 = (String) obj;
                x70Var.h = str2;
                y70 y70Var = x70Var.r;
                if (y70Var.N) {
                    TLRPC.TL_messages_searchEmojiStickerSets tL_messages_searchEmojiStickerSets = new TLRPC.TL_messages_searchEmojiStickerSets();
                    tL_messages_searchEmojiStickerSets.q = str2;
                    tL_messages_searchStickerSets = tL_messages_searchEmojiStickerSets;
                } else {
                    TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets2 = new TLRPC.TL_messages_searchStickerSets();
                    tL_messages_searchStickerSets2.q = str2;
                    tL_messages_searchStickerSets = tL_messages_searchStickerSets2;
                }
                x70Var.n = y70Var.getConnectionsManager().sendRequest(tL_messages_searchStickerSets, new fa(x70Var, str2, str2, 14), 66);
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.j(20, (q80) obj2, (CacheByChatsController.KeepMediaException) obj), 150L);
                break;
            case 16:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) obj2;
                languageSelectActivity.e = (ArrayList) obj;
                languageSelectActivity.c.l();
                break;
            case 17:
                LanguageSelectActivity languageSelectActivity2 = (LanguageSelectActivity) obj2;
                String str3 = (String) obj;
                int i15 = 16;
                if (str3.trim().toLowerCase().length() == 0) {
                    AndroidUtilities.runOnUIThread(new o00(i15, languageSelectActivity2, new ArrayList()));
                    break;
                } else {
                    System.currentTimeMillis();
                    ArrayList arrayList4 = new ArrayList();
                    int size = languageSelectActivity2.h.size();
                    for (int i16 = 0; i16 < size; i16++) {
                        LocaleController.LocaleInfo localeInfo = (LocaleController.LocaleInfo) languageSelectActivity2.h.get(i16);
                        if (localeInfo.name.toLowerCase().startsWith(str3) || localeInfo.nameEnglish.toLowerCase().startsWith(str3)) {
                            arrayList4.add(localeInfo);
                        }
                    }
                    int size2 = languageSelectActivity2.f.size();
                    while (i13 < size2) {
                        LocaleController.LocaleInfo localeInfo2 = (LocaleController.LocaleInfo) languageSelectActivity2.f.get(i13);
                        if (localeInfo2.name.toLowerCase().startsWith(str3) || localeInfo2.nameEnglish.toLowerCase().startsWith(str3)) {
                            arrayList4.add(localeInfo2);
                        }
                        i13++;
                    }
                    AndroidUtilities.runOnUIThread(new o00(i15, languageSelectActivity2, arrayList4));
                    break;
                }
                break;
            case 18:
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
                    fo foVar = new fo(bundle);
                    foVar.ia = resolvedbusinesschatlinks;
                    launchActivity.q0(foVar, false, true);
                    break;
                } else {
                    launchActivity.B0(org.telegram.ui.Components.g5.M(launchActivity, LocaleController.getString(R.string.BusinessLink), LocaleController.getString(R.string.BusinessLinkInvalid)));
                    break;
                }
            case 19:
                LaunchActivity launchActivity2 = (LaunchActivity) obj2;
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) obj;
                Pattern pattern2 = LaunchActivity.B1;
                MessagesController.getInstance(launchActivity2.O).putUsers(tL_chatInviteJoinResultWebView.users, false);
                BotGuardHelper botGuardHelper = BotGuardHelper.getInstance(launchActivity2.O);
                long j10 = tL_chatInviteJoinResultWebView.bot_id;
                botGuardHelper.openGuardBotWebApp(j10, j10, tL_chatInviteJoinResultWebView.query_id);
                break;
            case 20:
                Pattern pattern3 = LaunchActivity.B1;
                String string = LocaleController.getString(R.string.AuthAnotherClient);
                StringBuilder sb2 = new StringBuilder();
                org.telegram.ui.Cells.d0.n(R.string.ErrorOccurred, "\n", sb2);
                sb2.append(((TLRPC.TL_error) obj).text);
                org.telegram.ui.Components.g5.t0((h) obj2, string, sb2.toString(), null);
                break;
            case 21:
                LaunchActivity launchActivity3 = (LaunchActivity) obj2;
                String str4 = (String) obj;
                if (!launchActivity3.q0.getFragmentStack().isEmpty()) {
                    launchActivity3.q0.getFragmentStack().get(0).presentFragment(new PremiumPreviewFragment(0, Uri.parse(str4).getQueryParameter("ref")));
                    break;
                }
                break;
            case 22:
                Pattern pattern4 = LaunchActivity.B1;
                ((LaunchActivity) obj2).j0((TL_account.Password) obj);
                break;
            case 23:
                LaunchActivity launchActivity4 = (LaunchActivity) obj2;
                Runnable runnable2 = (Runnable) obj;
                launchActivity4.q0.getView().setVisibility(4);
                if (AndroidUtilities.isTablet()) {
                    ActionBarLayout actionBarLayout = launchActivity4.r0;
                    if (actionBarLayout != null && actionBarLayout.getView() != null && launchActivity4.r0.getView().getVisibility() == 0) {
                        launchActivity4.r0.getView().setVisibility(4);
                    }
                    ActionBarLayout actionBarLayout2 = launchActivity4.s0;
                    if (actionBarLayout2 != null && actionBarLayout2.getView() != null) {
                        launchActivity4.s0.getView().setVisibility(4);
                    }
                }
                if (runnable2 != null) {
                    runnable2.run();
                    break;
                }
                break;
            case 24:
                org.telegram.ui.Components.sc scVar = (org.telegram.ui.Components.sc) obj;
                if (!((LaunchActivity) obj2).Q && LaunchActivity.E1) {
                    scVar.j();
                    break;
                }
                break;
            case 25:
                Pattern pattern5 = LaunchActivity.B1;
                ((LaunchActivity) obj2).p0((ce1) obj);
                break;
            case 26:
                LaunchActivity launchActivity5 = (LaunchActivity) obj2;
                pf.c cVar = (pf.c) obj;
                launchActivity5.P0 = null;
                launchActivity5.Q0 = null;
                launchActivity5.R0 = null;
                launchActivity5.S0 = null;
                launchActivity5.V0 = null;
                launchActivity5.T0 = null;
                if (cVar != null) {
                    cVar.b();
                    break;
                }
                break;
            case 27:
                pf.c cVar2 = (pf.c) obj2;
                org.telegram.ui.ActionBar.a2 a2Var2 = (org.telegram.ui.ActionBar.a2) obj;
                Pattern pattern6 = LaunchActivity.B1;
                if (cVar2 != null) {
                    cVar2.b();
                }
                if (a2Var2 != null) {
                    a2Var2.dismiss();
                    break;
                }
                break;
            case 28:
                jc0 jc0Var = (jc0) obj2;
                TLObject tLObject4 = (TLObject) obj;
                jc0Var.c();
                if (tLObject4 != null) {
                    jc0Var.a.j0((TL_account.Password) tLObject4);
                    break;
                }
                break;
            default:
                ((FiltersSetupActivity) obj).X(((jc0) obj2).a.O());
                break;
        }
    }
}
