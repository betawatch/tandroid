package org.telegram.ui;

import android.graphics.Bitmap;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
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

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cu implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cu(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets;
        int i10 = this.a;
        int i11 = 6;
        int i12 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                MessagesController.getInstance(((du) obj2).currentAccount).processUpdates((TLRPC.Updates) obj, false);
                break;
            case 1:
                uy.d0((uy) obj2, (String) obj);
                break;
            case 2:
                ei.l3.j(((uy) obj2).currentAccount, ((TLRPC.TL_attachMenuBot) obj).bot_id, null);
                break;
            case 3:
                uy uyVar = (uy) obj2;
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) obj;
                org.telegram.ui.ActionBar.f3 f3Var = f3VarArr[0];
                if (f3Var != null) {
                    f3Var.dismiss();
                    f3VarArr[0] = null;
                }
                AndroidUtilities.runOnUIThread(new pv(uyVar, 23), 300L);
                break;
            case 4:
                uy uyVar2 = (uy) obj2;
                uyVar2.getMessagesController().addDialogToFolder((ArrayList) obj, (uyVar2.V2 == 0 && uyVar2.X2 == 0) ? 0 : 1, -1, null, 0L);
                break;
            case 5:
                CharSequence charSequence = (CharSequence) obj;
                uy uyVar3 = ((dx) obj2).a;
                uyVar3.H2 = null;
                org.telegram.ui.Components.fr0 fr0Var = uyVar3.G2;
                if (fr0Var != null && fr0Var.h) {
                    fr0Var.e(charSequence, false);
                    break;
                }
                break;
            case 6:
                org.telegram.ui.ActionBar.n2[] n2VarArr = (org.telegram.ui.ActionBar.n2[]) obj;
                ((rx) obj2).b.removeSelfFromStack();
                if (n2VarArr[1] != null) {
                    n2VarArr[0].removeSelfFromStack();
                    n2VarArr[1].finishFragment();
                    break;
                } else {
                    n2VarArr[0].finishFragment();
                    break;
                }
            case 7:
                ArrayList arrayList = (ArrayList) obj;
                uy uyVar4 = ((ly) obj2).b;
                uyVar4.y3 = 2;
                uyVar4.J4(true, true);
                uyVar4.x3();
                while (i12 < arrayList.size()) {
                    long j3 = ((TLRPC.Dialog) arrayList.get(i12)).id;
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(i12);
                    if (uyVar4.getMessagesController().isForum(j3) || uyVar4.getMessagesController().isMonoForumWithManageRights(j3)) {
                        uyVar4.getMessagesController().markAllTopicsAsRead(j3);
                    }
                    uyVar4.getMessagesController().markMentionsAsRead(j3, 0L);
                    MessagesController messagesController = uyVar4.getMessagesController();
                    int i13 = dialog.top_message;
                    messagesController.markDialogAsRead(j3, i13, i13, dialog.last_message_date, false, 0L, 0, true, 0);
                    i12++;
                }
                break;
            case 8:
                ((ly) obj2).d((MessagesController.DialogFilter) obj);
                break;
            case 9:
                gz gzVar = (gz) obj2;
                yn ynVar = gzVar.a;
                org.telegram.ui.Components.ry0 ry0Var = new org.telegram.ui.Components.ry0(ynVar.getParentActivity(), gzVar.a, ((MessageObject) obj).getInputStickerSet(), null, ynVar.W, ynVar.getResourceProvider());
                ry0Var.setCalcMandatoryInsets(ynVar.w9());
                ynVar.showDialog(ry0Var);
                break;
            case 10:
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
            case 11:
                f10 f10Var = (f10) obj2;
                c00 c00Var2 = new c00(f10Var.r, ((w00) obj).m);
                c00Var2.y = new f00(f10Var, 1);
                c00Var2.x = new f00(f10Var, 2);
                f10Var.presentFragment(c00Var2);
                break;
            case 12:
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
            case 13:
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
            case 14:
                f10 f10Var4 = (f10) obj2;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj;
                MessagesController.DialogFilter dialogFilter = f10Var4.r;
                if (b2Var != null) {
                    try {
                        b2Var.dismiss();
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                }
                f10Var4.getMessagesController().removeFilter(dialogFilter);
                f10Var4.getMessagesStorage().deleteDialogFilter(dialogFilter);
                f10Var4.finishFragment();
                break;
            case 15:
                f10 f10Var5 = (f10) obj2;
                f10Var5.getClass();
                f10Var5.m0(((TL_chatlists.TL_chatlists_exportedChatlistInvite) obj).invite);
                break;
            case 16:
                FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) obj2;
                if (((TLRPC.TL_messages_toggleDialogFilterTags) obj).enabled && !filtersSetupActivity.x) {
                    filtersSetupActivity.getMessagesController().loadRemoteFilters(true);
                    filtersSetupActivity.x = true;
                    break;
                }
                break;
            case 17:
                FiltersSetupActivity filtersSetupActivity2 = ((d20) obj2).e;
                filtersSetupActivity2.getMessagesController().suggestedFilters.remove((TLRPC.TL_dialogFilterSuggested) obj);
                filtersSetupActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
                break;
            case 18:
                ArrayList arrayList3 = (ArrayList) obj;
                ArrayList arrayList4 = ((h60) obj2).Y1;
                for (int i14 = 0; i14 < arrayList4.size(); i14++) {
                    if (((org.telegram.ui.Components.voip.u) arrayList4.get(i14)).w != null) {
                        arrayList3.remove(((org.telegram.ui.Components.voip.u) arrayList4.get(i14)).w);
                    }
                }
                while (i12 < arrayList3.size()) {
                    ChatObject.VideoParticipant videoParticipant = (ChatObject.VideoParticipant) arrayList3.get(i12);
                    if (videoParticipant.participant.self) {
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setLocalSink(null, videoParticipant.presentation);
                        }
                    } else if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().removeRemoteSink(videoParticipant.participant, videoParticipant.presentation);
                    }
                    i12++;
                }
                break;
            case 19:
                h60 h60Var = (h60) obj2;
                h60Var.d.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShowAlert, 6, ((TLRPC.TL_error) obj).text);
                h60Var.dismiss();
                break;
            case 20:
                x5 x5Var = (x5) obj2;
                try {
                    Bitmap bitmap = ((org.telegram.ui.Components.voip.t2) obj).e.getBitmap(100, 100);
                    if (bitmap == null) {
                        break;
                    } else {
                        AndroidUtilities.runOnUIThread(new cu(21, x5Var, ci.n0.b(bitmap, true)));
                        break;
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 21:
                ((h60) ((x5) obj2).b).U0.setNewColors((int[]) obj);
                break;
            case 22:
                s70.T((s70) obj2, (TLRPC.TL_error) obj);
                break;
            case 23:
                o70 o70Var = (o70) obj2;
                String str = (String) obj;
                p70 p70Var = o70Var.a;
                p70Var.e = str;
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                tL_inputStickerSetShortName.short_name = str;
                p70Var.c = p70Var.h.getConnectionsManager().sendRequest(tL_messages_getStickerSet, new no(24, o70Var, str), 66);
                break;
            case 24:
                TLObject tLObject2 = (TLObject) obj;
                p70 p70Var2 = ((o70) obj2).a;
                if (tLObject2 != null) {
                    s70.Z(p70Var2.h, (TLRPC.TL_messages_stickerSet) tLObject2);
                    break;
                } else {
                    s70.Z(p70Var2.h, null);
                    break;
                }
            case 25:
                r70 r70Var = (r70) obj2;
                String str2 = (String) obj;
                r70Var.h = str2;
                s70 s70Var = r70Var.r;
                if (s70Var.N) {
                    TLRPC.TL_messages_searchEmojiStickerSets tL_messages_searchEmojiStickerSets = new TLRPC.TL_messages_searchEmojiStickerSets();
                    tL_messages_searchEmojiStickerSets.q = str2;
                    tL_messages_searchStickerSets = tL_messages_searchEmojiStickerSets;
                } else {
                    TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets2 = new TLRPC.TL_messages_searchStickerSets();
                    tL_messages_searchStickerSets2.q = str2;
                    tL_messages_searchStickerSets = tL_messages_searchStickerSets2;
                }
                r70Var.n = s70Var.getConnectionsManager().sendRequest(tL_messages_searchStickerSets, new ca(r70Var, str2, str2, 14), 66);
                break;
            case 26:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.g6(i11, (l80) obj2, (CacheByChatsController.KeepMediaException) obj), 150L);
                break;
            case 27:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) obj2;
                languageSelectActivity.e = (ArrayList) obj;
                languageSelectActivity.c.l();
                break;
            case 28:
                LanguageSelectActivity languageSelectActivity2 = (LanguageSelectActivity) obj2;
                String str3 = (String) obj;
                int i15 = 27;
                if (str3.trim().toLowerCase().length() == 0) {
                    AndroidUtilities.runOnUIThread(new cu(i15, languageSelectActivity2, new ArrayList()));
                    break;
                } else {
                    System.currentTimeMillis();
                    ArrayList arrayList5 = new ArrayList();
                    int size = languageSelectActivity2.h.size();
                    for (int i16 = 0; i16 < size; i16++) {
                        LocaleController.LocaleInfo localeInfo = (LocaleController.LocaleInfo) languageSelectActivity2.h.get(i16);
                        if (localeInfo.name.toLowerCase().startsWith(str3) || localeInfo.nameEnglish.toLowerCase().startsWith(str3)) {
                            arrayList5.add(localeInfo);
                        }
                    }
                    int size2 = languageSelectActivity2.f.size();
                    while (i12 < size2) {
                        LocaleController.LocaleInfo localeInfo2 = (LocaleController.LocaleInfo) languageSelectActivity2.f.get(i12);
                        if (localeInfo2.name.toLowerCase().startsWith(str3) || localeInfo2.nameEnglish.toLowerCase().startsWith(str3)) {
                            arrayList5.add(localeInfo2);
                        }
                        i12++;
                    }
                    AndroidUtilities.runOnUIThread(new cu(i15, languageSelectActivity2, arrayList5));
                    break;
                }
                break;
            default:
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
                    yn ynVar2 = new yn(bundle);
                    ynVar2.ga = resolvedbusinesschatlinks;
                    launchActivity.q0(ynVar2, false, true);
                    break;
                } else {
                    launchActivity.B0(org.telegram.ui.Components.e5.N(launchActivity, LocaleController.getString(R.string.BusinessLink), LocaleController.getString(R.string.BusinessLinkInvalid)));
                    break;
                }
        }
    }
}
