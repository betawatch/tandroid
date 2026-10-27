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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kz implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kz(int i10, Object obj, Object obj2) {
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
                mz mzVar = (mz) obj2;
                mzVar.getClass();
                ((org.telegram.ui.ActionBar.e2) obj).dismiss();
                nz nzVar = mzVar.E;
                oz ozVar = nzVar.c;
                Utilities.Callback callback = ozVar.w;
                if (callback != null) {
                    callback.run(ozVar.d);
                }
                nzVar.c.finishFragment();
                break;
            case 1:
                q00 q00Var = (q00) obj2;
                oz ozVar2 = new oz(q00Var.r, ((h00) obj).m);
                ozVar2.x = new rz(q00Var, i12);
                ozVar2.w = new rz(q00Var, i11);
                q00Var.presentFragment(ozVar2);
                break;
            case 2:
                q00 q00Var2 = (q00) obj2;
                Runnable runnable = (Runnable) obj;
                q00Var2.h = false;
                q00Var2.s = false;
                q00Var2.r.flags = q00Var2.y;
                q00Var2.k0(true);
                q00Var2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 3:
                q00 q00Var3 = (q00) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList = q00Var3.L;
                q00Var3.N = false;
                if (tLObject instanceof TL_chatlists.TL_chatlists_exportedInvites) {
                    TL_chatlists.TL_chatlists_exportedInvites tL_chatlists_exportedInvites = (TL_chatlists.TL_chatlists_exportedInvites) tLObject;
                    q00Var3.getMessagesController().putChats(tL_chatlists_exportedInvites.chats, false);
                    q00Var3.getMessagesController().putUsers(tL_chatlists_exportedInvites.users, false);
                    arrayList.clear();
                    arrayList.addAll(tL_chatlists_exportedInvites.invites);
                    q00Var3.y0();
                }
                q00Var3.M = 0;
                break;
            case 4:
                q00 q00Var4 = (q00) obj2;
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) obj;
                MessagesController.DialogFilter dialogFilter = q00Var4.r;
                if (e2Var != null) {
                    try {
                        e2Var.dismiss();
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                q00Var4.getMessagesController().removeFilter(dialogFilter);
                q00Var4.getMessagesStorage().deleteDialogFilter(dialogFilter);
                q00Var4.finishFragment();
                break;
            case 5:
                q00 q00Var5 = (q00) obj2;
                q00Var5.getClass();
                q00Var5.o0(((TL_chatlists.TL_chatlists_exportedChatlistInvite) obj).invite);
                break;
            case 6:
                FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) obj2;
                if (((TLRPC.TL_messages_toggleDialogFilterTags) obj).enabled && !filtersSetupActivity.x) {
                    filtersSetupActivity.x = true;
                    filtersSetupActivity.b0(new k10(filtersSetupActivity, 3));
                    break;
                }
                break;
            case 7:
                FiltersSetupActivity filtersSetupActivity2 = ((r10) obj2).e;
                filtersSetupActivity2.getMessagesController().suggestedFilters.remove((TLRPC.TL_dialogFilterSuggested) obj);
                filtersSetupActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
                break;
            case 8:
                ArrayList arrayList2 = (ArrayList) obj;
                ArrayList arrayList3 = ((x50) obj2).Y1;
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
            case 9:
                x50 x50Var = (x50) obj2;
                x50Var.d.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShowAlert, 6, ((TLRPC.TL_error) obj).text);
                x50Var.dismiss();
                break;
            case 10:
                y5 y5Var = (y5) obj2;
                try {
                    Bitmap bitmap = ((org.telegram.ui.Components.voip.t2) obj).e.getBitmap(100, 100);
                    if (bitmap == null) {
                        break;
                    } else {
                        AndroidUtilities.runOnUIThread(new kz(11, y5Var, fi.n0.b(bitmap, true)));
                        break;
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 11:
                ((x50) ((y5) obj2).b).U0.setNewColors((int[]) obj);
                break;
            case 12:
                h70.W((h70) obj2, (TLRPC.TL_error) obj);
                break;
            case 13:
                d70 d70Var = (d70) obj2;
                String str = (String) obj;
                e70 e70Var = d70Var.a;
                e70Var.e = str;
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                tL_inputStickerSetShortName.short_name = str;
                e70Var.c = e70Var.h.getConnectionsManager().sendRequest(tL_messages_getStickerSet, new l10(i11, d70Var, str), 66);
                break;
            case 14:
                TLObject tLObject2 = (TLObject) obj;
                e70 e70Var2 = ((d70) obj2).a;
                if (tLObject2 != null) {
                    h70.b0(e70Var2.h, (TLRPC.TL_messages_stickerSet) tLObject2);
                    break;
                } else {
                    h70.b0(e70Var2.h, null);
                    break;
                }
            case 15:
                g70 g70Var = (g70) obj2;
                String str2 = (String) obj;
                g70Var.h = str2;
                h70 h70Var = g70Var.r;
                if (h70Var.N) {
                    TLRPC.TL_messages_searchEmojiStickerSets tL_messages_searchEmojiStickerSets = new TLRPC.TL_messages_searchEmojiStickerSets();
                    tL_messages_searchEmojiStickerSets.q = str2;
                    tL_messages_searchStickerSets = tL_messages_searchEmojiStickerSets;
                } else {
                    TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets2 = new TLRPC.TL_messages_searchStickerSets();
                    tL_messages_searchStickerSets2.q = str2;
                    tL_messages_searchStickerSets = tL_messages_searchStickerSets2;
                }
                g70Var.n = h70Var.getConnectionsManager().sendRequest(tL_messages_searchStickerSets, new ea(g70Var, str2, str2, 14), 66);
                break;
            case 16:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.m0(15, (z70) obj2, (CacheByChatsController.KeepMediaException) obj), 150L);
                break;
            case 17:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) obj2;
                languageSelectActivity.e = (ArrayList) obj;
                languageSelectActivity.c.l();
                break;
            case 18:
                LanguageSelectActivity languageSelectActivity2 = (LanguageSelectActivity) obj2;
                String str3 = (String) obj;
                int i15 = 17;
                if (str3.trim().toLowerCase().length() == 0) {
                    AndroidUtilities.runOnUIThread(new kz(i15, languageSelectActivity2, new ArrayList()));
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
                    AndroidUtilities.runOnUIThread(new kz(i15, languageSelectActivity2, arrayList4));
                    break;
                }
                break;
            case 19:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                TLObject tLObject3 = (TLObject) obj;
                Pattern pattern = LaunchActivity.D1;
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
                    wn wnVar = new wn(bundle);
                    wnVar.ya = resolvedbusinesschatlinks;
                    launchActivity.v0(wnVar, false, true);
                    break;
                } else {
                    launchActivity.G0(org.telegram.ui.Components.g5.M(launchActivity, LocaleController.getString(R.string.BusinessLink), LocaleController.getString(R.string.BusinessLinkInvalid)));
                    break;
                }
            case 20:
                LaunchActivity launchActivity2 = (LaunchActivity) obj2;
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) obj;
                Pattern pattern2 = LaunchActivity.D1;
                MessagesController.getInstance(launchActivity2.O).putUsers(tL_chatInviteJoinResultWebView.users, false);
                BotGuardHelper botGuardHelper = BotGuardHelper.getInstance(launchActivity2.O);
                long j10 = tL_chatInviteJoinResultWebView.bot_id;
                botGuardHelper.openGuardBotWebApp(j10, j10, tL_chatInviteJoinResultWebView.query_id);
                break;
            case 21:
                Pattern pattern3 = LaunchActivity.D1;
                String string = LocaleController.getString(R.string.AuthAnotherClient);
                StringBuilder sb2 = new StringBuilder();
                d3.p(R.string.ErrorOccurred, "\n", sb2);
                sb2.append(((TLRPC.TL_error) obj).text);
                org.telegram.ui.Components.g5.t0((g) obj2, string, sb2.toString(), null);
                break;
            case 22:
                LaunchActivity launchActivity3 = (LaunchActivity) obj2;
                String str4 = (String) obj;
                if (!launchActivity3.q0.getFragmentStack().isEmpty()) {
                    launchActivity3.q0.getFragmentStack().get(0).presentFragment(new PremiumPreviewFragment(0, Uri.parse(str4).getQueryParameter("ref")));
                    break;
                }
                break;
            case 23:
                Pattern pattern4 = LaunchActivity.D1;
                ((LaunchActivity) obj2).l0((TL_account.Password) obj);
                break;
            case 24:
                org.telegram.ui.Components.qc qcVar = (org.telegram.ui.Components.qc) obj;
                if (!((LaunchActivity) obj2).Q && LaunchActivity.G1) {
                    qcVar.j();
                    break;
                }
                break;
            case 25:
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
            case 26:
                Pattern pattern5 = LaunchActivity.D1;
                ((LaunchActivity) obj2).u0((vc1) obj);
                break;
            case 27:
                LaunchActivity launchActivity5 = (LaunchActivity) obj2;
                qf.c cVar = (qf.c) obj;
                launchActivity5.Q0 = null;
                launchActivity5.R0 = null;
                launchActivity5.S0 = null;
                launchActivity5.T0 = null;
                launchActivity5.W0 = null;
                launchActivity5.U0 = null;
                if (cVar != null) {
                    cVar.b();
                    break;
                }
                break;
            case 28:
                qf.c cVar2 = (qf.c) obj2;
                org.telegram.ui.ActionBar.e2 e2Var2 = (org.telegram.ui.ActionBar.e2) obj;
                Pattern pattern6 = LaunchActivity.D1;
                if (cVar2 != null) {
                    cVar2.b();
                }
                if (e2Var2 != null) {
                    e2Var2.dismiss();
                    break;
                }
                break;
            default:
                ob0 ob0Var = (ob0) obj2;
                TLObject tLObject4 = (TLObject) obj;
                ob0Var.c();
                if (tLObject4 != null) {
                    ob0Var.a.l0((TL_account.Password) tLObject4);
                    break;
                }
                break;
        }
    }
}
