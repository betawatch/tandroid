package org.telegram.ui;

import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CacheByChatsController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
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
        int i11 = 24;
        int i12 = 14;
        int i13 = 6;
        int i14 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                MessagesController.getInstance(((du) obj2).currentAccount).processUpdates((TLRPC.Updates) obj, false);
                break;
            case 1:
                uy.e0((uy) obj2, (String) obj);
                break;
            case 2:
                ei.k3.j(((uy) obj2).currentAccount, ((TLRPC.TL_attachMenuBot) obj).bot_id, null);
                break;
            case 3:
                uy uyVar = (uy) obj2;
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) obj;
                org.telegram.ui.ActionBar.f3 f3Var = f3VarArr[0];
                if (f3Var != null) {
                    f3Var.dismiss();
                    f3VarArr[0] = null;
                }
                AndroidUtilities.runOnUIThread(new qv(uyVar, i11), 300L);
                break;
            case 4:
                ((ty) obj).a.postOnAnimation(new qv((uy) obj2, i12));
                break;
            case 5:
                uy uyVar2 = (uy) obj2;
                uyVar2.getMessagesController().addDialogToFolder((ArrayList) obj, (uyVar2.V2 == 0 && uyVar2.X2 == 0) ? 0 : 1, -1, null, 0L);
                break;
            case 6:
                ArrayList arrayList = (ArrayList) obj;
                uy uyVar3 = ((tw) obj2).b;
                uyVar3.y3 = 2;
                uyVar3.A4(true, true);
                uyVar3.o3();
                while (i14 < arrayList.size()) {
                    long j3 = ((TLRPC.Dialog) arrayList.get(i14)).id;
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(i14);
                    if (uyVar3.getMessagesController().isForum(j3) || uyVar3.getMessagesController().isMonoForumWithManageRights(j3)) {
                        uyVar3.getMessagesController().markAllTopicsAsRead(j3);
                    }
                    uyVar3.getMessagesController().markMentionsAsRead(j3, 0L);
                    MessagesController messagesController = uyVar3.getMessagesController();
                    int i15 = dialog.top_message;
                    messagesController.markDialogAsRead(j3, i15, i15, dialog.last_message_date, false, 0L, 0, true, 0);
                    i14++;
                }
                break;
            case 7:
                ((tw) obj2).d((MessagesController.DialogFilter) obj);
                break;
            case 8:
                CharSequence charSequence = (CharSequence) obj;
                uy uyVar4 = ((fx) obj2).a;
                uyVar4.H2 = null;
                org.telegram.ui.Components.ar0 ar0Var = uyVar4.G2;
                if (ar0Var != null && ar0Var.h) {
                    ar0Var.e(charSequence, false);
                    break;
                }
                break;
            case 9:
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
            case 10:
                gz gzVar = (gz) obj2;
                zn znVar = gzVar.a;
                org.telegram.ui.Components.hy0 hy0Var = new org.telegram.ui.Components.hy0(znVar.getParentActivity(), gzVar.a, ((MessageObject) obj).getInputStickerSet(), null, znVar.Y, znVar.getResourceProvider());
                hy0Var.setCalcMandatoryInsets(znVar.x9());
                znVar.showDialog(hy0Var);
                break;
            case 11:
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
            case 12:
                f10 f10Var = (f10) obj2;
                c00 c00Var2 = new c00(f10Var.r, ((w00) obj).m);
                c00Var2.y = new f00(f10Var, 1);
                c00Var2.x = new f00(f10Var, 2);
                f10Var.presentFragment(c00Var2);
                break;
            case 13:
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
            case 14:
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
            case 15:
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
            case 16:
                f10 f10Var5 = (f10) obj2;
                f10Var5.getClass();
                f10Var5.m0(((TL_chatlists.TL_chatlists_exportedChatlistInvite) obj).invite);
                break;
            case 17:
                FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) obj2;
                if (((TLRPC.TL_messages_toggleDialogFilterTags) obj).enabled && !filtersSetupActivity.x) {
                    filtersSetupActivity.getMessagesController().loadRemoteFilters(true);
                    filtersSetupActivity.x = true;
                    break;
                }
                break;
            case 18:
                FiltersSetupActivity filtersSetupActivity2 = ((e20) obj2).e;
                filtersSetupActivity2.getMessagesController().suggestedFilters.remove((TLRPC.TL_dialogFilterSuggested) obj);
                filtersSetupActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
                break;
            case 19:
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
            case 20:
                i60 i60Var = (i60) obj2;
                i60Var.d.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShowAlert, 6, ((TLRPC.TL_error) obj).text);
                i60Var.dismiss();
                break;
            case 21:
                w5 w5Var = (w5) obj2;
                try {
                    Bitmap bitmap = ((org.telegram.ui.Components.voip.s2) obj).e.getBitmap(100, 100);
                    if (bitmap == null) {
                        break;
                    } else {
                        AndroidUtilities.runOnUIThread(new cu(22, w5Var, ci.n0.b(bitmap, true)));
                        break;
                    }
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 22:
                ((i60) ((w5) obj2).b).U0.setNewColors((int[]) obj);
                break;
            case 23:
                t70.V((t70) obj2, (TLRPC.TL_error) obj);
                break;
            case 24:
                p70 p70Var = (p70) obj2;
                String str = (String) obj;
                q70 q70Var = p70Var.a;
                q70Var.e = str;
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                tL_inputStickerSetShortName.short_name = str;
                q70Var.c = q70Var.h.getConnectionsManager().sendRequest(tL_messages_getStickerSet, new oo(i11, p70Var, str), 66);
                break;
            case 25:
                TLObject tLObject2 = (TLObject) obj;
                q70 q70Var2 = ((p70) obj2).a;
                if (tLObject2 != null) {
                    t70.a0(q70Var2.h, (TLRPC.TL_messages_stickerSet) tLObject2);
                    break;
                } else {
                    t70.a0(q70Var2.h, null);
                    break;
                }
            case 26:
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
                s70Var.n = t70Var.getConnectionsManager().sendRequest(tL_messages_searchStickerSets, new ba(s70Var, str2, str2, i12), 66);
                break;
            case 27:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.h6(i13, (m80) obj2, (CacheByChatsController.KeepMediaException) obj), 150L);
                break;
            case 28:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) obj2;
                languageSelectActivity.e = (ArrayList) obj;
                languageSelectActivity.c.l();
                break;
            default:
                LanguageSelectActivity languageSelectActivity2 = (LanguageSelectActivity) obj2;
                String str3 = (String) obj;
                int i17 = 28;
                if (str3.trim().toLowerCase().length() == 0) {
                    AndroidUtilities.runOnUIThread(new cu(i17, languageSelectActivity2, new ArrayList()));
                    break;
                } else {
                    System.currentTimeMillis();
                    ArrayList arrayList5 = new ArrayList();
                    int size = languageSelectActivity2.h.size();
                    for (int i18 = 0; i18 < size; i18++) {
                        LocaleController.LocaleInfo localeInfo = (LocaleController.LocaleInfo) languageSelectActivity2.h.get(i18);
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
                    AndroidUtilities.runOnUIThread(new cu(i17, languageSelectActivity2, arrayList5));
                    break;
                }
                break;
        }
    }
}
