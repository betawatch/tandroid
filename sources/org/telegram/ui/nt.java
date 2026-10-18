package org.telegram.ui;

import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CacheByChatsController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nt implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nt(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.im0 im0Var;
        TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets;
        int i10 = this.a;
        int i11 = 1;
        int i12 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                ot otVar = (ot) obj2;
                ArrayList arrayList = (ArrayList) obj;
                qt qtVar = otVar.h;
                if (qtVar.f) {
                    otVar.e = arrayList;
                    if (qtVar.e && (im0Var = qtVar.a) != null) {
                        s4.g0 adapter = im0Var.getAdapter();
                        ot otVar2 = qtVar.d;
                        if (adapter != otVar2) {
                            qtVar.a.setAdapter(otVar2);
                            qtVar.a.setFastScrollVisible(false);
                        }
                    }
                    otVar.l();
                    break;
                }
                break;
            case 1:
                MessagesController.getInstance(((st) obj2).currentAccount).lambda$processUpdates$377((TLRPC.Updates) obj, false);
                break;
            case 2:
                ey.e0((ey) obj2, (String) obj);
                break;
            case 3:
                gi.d3.j(((ey) obj2).currentAccount, ((TLRPC.TL_attachMenuBot) obj).bot_id, null);
                break;
            case 4:
                ey eyVar = (ey) obj2;
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) obj;
                org.telegram.ui.ActionBar.f3 f3Var = f3VarArr[0];
                if (f3Var != null) {
                    f3Var.dismiss();
                    f3VarArr[0] = null;
                }
                AndroidUtilities.runOnUIThread(new ev(eyVar, 25), 300L);
                break;
            case 5:
                ((dy) obj).a.postOnAnimation(new ev((ey) obj2, 15));
                break;
            case 6:
                ey eyVar2 = (ey) obj2;
                eyVar2.getMessagesController().addDialogToFolder((ArrayList) obj, (eyVar2.W2 == 0 && eyVar2.Y2 == 0) ? 0 : 1, -1, null, 0L);
                break;
            case 7:
                ArrayList arrayList2 = (ArrayList) obj;
                ey eyVar3 = ((dw) obj2).b;
                eyVar3.z3 = 2;
                eyVar3.y4(true, true);
                eyVar3.m3();
                while (i12 < arrayList2.size()) {
                    long j10 = ((TLRPC.Dialog) arrayList2.get(i12)).id;
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList2.get(i12);
                    if (eyVar3.getMessagesController().isForum(j10) || eyVar3.getMessagesController().isMonoForumWithManageRights(j10)) {
                        eyVar3.getMessagesController().markAllTopicsAsRead(j10);
                    }
                    eyVar3.getMessagesController().markMentionsAsRead(j10, 0L);
                    MessagesController messagesController = eyVar3.getMessagesController();
                    int i13 = dialog.top_message;
                    messagesController.markDialogAsRead(j10, i13, i13, dialog.last_message_date, false, 0L, 0, true, 0);
                    i12++;
                }
                break;
            case 8:
                ((dw) obj2).d((MessagesController.DialogFilter) obj);
                break;
            case 9:
                CharSequence charSequence = (CharSequence) obj;
                ey eyVar4 = ((pw) obj2).a;
                eyVar4.H2 = null;
                org.telegram.ui.Components.ir0 ir0Var = eyVar4.G2;
                if (ir0Var != null && ir0Var.h) {
                    ir0Var.e(charSequence, false);
                    break;
                }
                break;
            case 10:
                org.telegram.ui.ActionBar.n2[] n2VarArr = (org.telegram.ui.ActionBar.n2[]) obj;
                ((dx) obj2).b.removeSelfFromStack();
                if (n2VarArr[1] != null) {
                    n2VarArr[0].removeSelfFromStack();
                    n2VarArr[1].finishFragment();
                    break;
                } else {
                    n2VarArr[0].finishFragment();
                    break;
                }
            case 11:
                qy qyVar = (qy) obj2;
                sn snVar = qyVar.a;
                org.telegram.ui.Components.oy0 oy0Var = new org.telegram.ui.Components.oy0(snVar.getParentActivity(), qyVar.a, ((MessageObject) obj).getInputStickerSet(), null, snVar.Y, snVar.getResourceProvider());
                oy0Var.setCalcMandatoryInsets(snVar.C9());
                snVar.showDialog(oy0Var);
                break;
            case 12:
                lz lzVar = (lz) obj2;
                lzVar.getClass();
                ((org.telegram.ui.ActionBar.b2) obj).dismiss();
                mz mzVar = lzVar.E;
                nz nzVar = mzVar.c;
                Utilities.Callback callback = nzVar.x;
                if (callback != null) {
                    callback.run(nzVar.d);
                }
                mzVar.c.finishFragment();
                break;
            case 13:
                p00 p00Var = (p00) obj2;
                nz nzVar2 = new nz(p00Var.r, ((g00) obj).m);
                nzVar2.y = new qz(p00Var, 1);
                nzVar2.x = new qz(p00Var, 2);
                p00Var.presentFragment(nzVar2);
                break;
            case 14:
                p00 p00Var2 = (p00) obj2;
                Runnable runnable = (Runnable) obj;
                p00Var2.h = false;
                p00Var2.s = false;
                p00Var2.r.flags = p00Var2.y;
                p00Var2.i0(true);
                p00Var2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 15:
                p00 p00Var3 = (p00) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList3 = p00Var3.L;
                p00Var3.N = false;
                if (tLObject instanceof TL_chatlists.TL_chatlists_exportedInvites) {
                    TL_chatlists.TL_chatlists_exportedInvites tL_chatlists_exportedInvites = (TL_chatlists.TL_chatlists_exportedInvites) tLObject;
                    p00Var3.getMessagesController().putChats(tL_chatlists_exportedInvites.chats, false);
                    p00Var3.getMessagesController().putUsers(tL_chatlists_exportedInvites.users, false);
                    arrayList3.clear();
                    arrayList3.addAll(tL_chatlists_exportedInvites.invites);
                    p00Var3.w0();
                }
                p00Var3.M = 0;
                break;
            case 16:
                p00 p00Var4 = (p00) obj2;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj;
                MessagesController.DialogFilter dialogFilter = p00Var4.r;
                if (b2Var != null) {
                    try {
                        b2Var.dismiss();
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                p00Var4.getMessagesController().removeFilter(dialogFilter);
                p00Var4.getMessagesStorage().deleteDialogFilter(dialogFilter);
                p00Var4.finishFragment();
                break;
            case 17:
                p00 p00Var5 = (p00) obj2;
                p00Var5.getClass();
                p00Var5.m0(((TL_chatlists.TL_chatlists_exportedChatlistInvite) obj).invite);
                break;
            case 18:
                FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) obj2;
                if (((TLRPC.TL_messages_toggleDialogFilterTags) obj).enabled && !filtersSetupActivity.x) {
                    filtersSetupActivity.getMessagesController().loadRemoteFilters(true);
                    filtersSetupActivity.x = true;
                    break;
                }
                break;
            case 19:
                FiltersSetupActivity filtersSetupActivity2 = ((n10) obj2).e;
                filtersSetupActivity2.getMessagesController().suggestedFilters.remove((TLRPC.TL_dialogFilterSuggested) obj);
                filtersSetupActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
                break;
            case 20:
                ArrayList arrayList4 = (ArrayList) obj;
                ArrayList arrayList5 = ((s50) obj2).Y1;
                for (int i14 = 0; i14 < arrayList5.size(); i14++) {
                    if (((org.telegram.ui.Components.voip.t) arrayList5.get(i14)).w != null) {
                        arrayList4.remove(((org.telegram.ui.Components.voip.t) arrayList5.get(i14)).w);
                    }
                }
                while (i12 < arrayList4.size()) {
                    ChatObject.VideoParticipant videoParticipant = (ChatObject.VideoParticipant) arrayList4.get(i12);
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
            case 21:
                s50 s50Var = (s50) obj2;
                s50Var.d.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShowAlert, 6, ((TLRPC.TL_error) obj).text);
                s50Var.dismiss();
                break;
            case 22:
                a6 a6Var = (a6) obj2;
                try {
                    Bitmap bitmap = ((org.telegram.ui.Components.voip.q2) obj).e.getBitmap(100, 100);
                    if (bitmap == null) {
                        break;
                    } else {
                        AndroidUtilities.runOnUIThread(new nt(23, a6Var, ei.n0.b(bitmap, true)));
                        break;
                    }
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 23:
                ((s50) ((a6) obj2).b).U0.setNewColors((int[]) obj);
                break;
            case 24:
                c70.V((c70) obj2, (TLRPC.TL_error) obj);
                break;
            case 25:
                y60 y60Var = (y60) obj2;
                String str = (String) obj;
                z60 z60Var = y60Var.a;
                z60Var.e = str;
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                tL_inputStickerSetShortName.short_name = str;
                z60Var.c = z60Var.h.getConnectionsManager().sendRequest(tL_messages_getStickerSet, new z40(i11, y60Var, str), 66);
                break;
            case 26:
                TLObject tLObject2 = (TLObject) obj;
                z60 z60Var2 = ((y60) obj2).a;
                if (tLObject2 != null) {
                    c70.a0(z60Var2.h, (TLRPC.TL_messages_stickerSet) tLObject2);
                    break;
                } else {
                    c70.a0(z60Var2.h, null);
                    break;
                }
            case 27:
                b70 b70Var = (b70) obj2;
                String str2 = (String) obj;
                b70Var.h = str2;
                c70 c70Var = b70Var.r;
                if (c70Var.N) {
                    TLRPC.TL_messages_searchEmojiStickerSets tL_messages_searchEmojiStickerSets = new TLRPC.TL_messages_searchEmojiStickerSets();
                    tL_messages_searchEmojiStickerSets.q = str2;
                    tL_messages_searchStickerSets = tL_messages_searchEmojiStickerSets;
                } else {
                    TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets2 = new TLRPC.TL_messages_searchStickerSets();
                    tL_messages_searchStickerSets2.q = str2;
                    tL_messages_searchStickerSets = tL_messages_searchStickerSets2;
                }
                b70Var.n = c70Var.getConnectionsManager().sendRequest(tL_messages_searchStickerSets, new ea(b70Var, str2, str2, 14), 66);
                break;
            case 28:
                AndroidUtilities.runOnUIThread(new i0(4, (u70) obj2, (CacheByChatsController.KeepMediaException) obj), 150L);
                break;
            default:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) obj2;
                languageSelectActivity.e = (ArrayList) obj;
                languageSelectActivity.c.l();
                break;
        }
    }
}
