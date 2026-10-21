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

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lt implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lt(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.jm0 jm0Var;
        TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets;
        int i10 = this.a;
        int i11 = 1;
        int i12 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                mt mtVar = (mt) obj2;
                ArrayList arrayList = (ArrayList) obj;
                ot otVar = mtVar.h;
                if (otVar.f) {
                    mtVar.e = arrayList;
                    if (otVar.e && (jm0Var = otVar.a) != null) {
                        s4.g0 adapter = jm0Var.getAdapter();
                        mt mtVar2 = otVar.d;
                        if (adapter != mtVar2) {
                            otVar.a.setAdapter(mtVar2);
                            otVar.a.setFastScrollVisible(false);
                        }
                    }
                    mtVar.l();
                    break;
                }
                break;
            case 1:
                MessagesController.getInstance(((qt) obj2).currentAccount).lambda$processUpdates$377((TLRPC.Updates) obj, false);
                break;
            case 2:
                cy.e0((cy) obj2, (String) obj);
                break;
            case 3:
                gi.d3.j(((cy) obj2).currentAccount, ((TLRPC.TL_attachMenuBot) obj).bot_id, null);
                break;
            case 4:
                cy cyVar = (cy) obj2;
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) obj;
                org.telegram.ui.ActionBar.f3 f3Var = f3VarArr[0];
                if (f3Var != null) {
                    f3Var.dismiss();
                    f3VarArr[0] = null;
                }
                AndroidUtilities.runOnUIThread(new cv(cyVar, 25), 300L);
                break;
            case 5:
                ((ay) obj).a.postOnAnimation(new cv((cy) obj2, 15));
                break;
            case 6:
                cy cyVar2 = (cy) obj2;
                cyVar2.getMessagesController().addDialogToFolder((ArrayList) obj, (cyVar2.W2 == 0 && cyVar2.Y2 == 0) ? 0 : 1, -1, null, 0L);
                break;
            case 7:
                ArrayList arrayList2 = (ArrayList) obj;
                cy cyVar3 = ((bw) obj2).b;
                cyVar3.z3 = 2;
                cyVar3.y4(true, true);
                cyVar3.m3();
                while (i12 < arrayList2.size()) {
                    long j10 = ((TLRPC.Dialog) arrayList2.get(i12)).id;
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList2.get(i12);
                    if (cyVar3.getMessagesController().isForum(j10) || cyVar3.getMessagesController().isMonoForumWithManageRights(j10)) {
                        cyVar3.getMessagesController().markAllTopicsAsRead(j10);
                    }
                    cyVar3.getMessagesController().markMentionsAsRead(j10, 0L);
                    MessagesController messagesController = cyVar3.getMessagesController();
                    int i13 = dialog.top_message;
                    messagesController.markDialogAsRead(j10, i13, i13, dialog.last_message_date, false, 0L, 0, true, 0);
                    i12++;
                }
                break;
            case 8:
                ((bw) obj2).d((MessagesController.DialogFilter) obj);
                break;
            case 9:
                CharSequence charSequence = (CharSequence) obj;
                cy cyVar4 = ((nw) obj2).a;
                cyVar4.H2 = null;
                org.telegram.ui.Components.kr0 kr0Var = cyVar4.G2;
                if (kr0Var != null && kr0Var.h) {
                    kr0Var.e(charSequence, false);
                    break;
                }
                break;
            case 10:
                org.telegram.ui.ActionBar.n2[] n2VarArr = (org.telegram.ui.ActionBar.n2[]) obj;
                ((bx) obj2).b.removeSelfFromStack();
                if (n2VarArr[1] != null) {
                    n2VarArr[0].removeSelfFromStack();
                    n2VarArr[1].finishFragment();
                    break;
                } else {
                    n2VarArr[0].finishFragment();
                    break;
                }
            case 11:
                oy oyVar = (oy) obj2;
                qn qnVar = oyVar.a;
                org.telegram.ui.Components.qy0 qy0Var = new org.telegram.ui.Components.qy0(qnVar.getParentActivity(), oyVar.a, ((MessageObject) obj).getInputStickerSet(), null, qnVar.Y, qnVar.getResourceProvider());
                qy0Var.setCalcMandatoryInsets(qnVar.C9());
                qnVar.showDialog(qy0Var);
                break;
            case 12:
                jz jzVar = (jz) obj2;
                jzVar.getClass();
                ((org.telegram.ui.ActionBar.b2) obj).dismiss();
                kz kzVar = jzVar.E;
                lz lzVar = kzVar.c;
                Utilities.Callback callback = lzVar.x;
                if (callback != null) {
                    callback.run(lzVar.d);
                }
                kzVar.c.finishFragment();
                break;
            case 13:
                n00 n00Var = (n00) obj2;
                lz lzVar2 = new lz(n00Var.r, ((e00) obj).m);
                lzVar2.y = new oz(n00Var, 1);
                lzVar2.x = new oz(n00Var, 2);
                n00Var.presentFragment(lzVar2);
                break;
            case 14:
                n00 n00Var2 = (n00) obj2;
                Runnable runnable = (Runnable) obj;
                n00Var2.h = false;
                n00Var2.s = false;
                n00Var2.r.flags = n00Var2.y;
                n00Var2.i0(true);
                n00Var2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 15:
                n00 n00Var3 = (n00) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList3 = n00Var3.L;
                n00Var3.N = false;
                if (tLObject instanceof TL_chatlists.TL_chatlists_exportedInvites) {
                    TL_chatlists.TL_chatlists_exportedInvites tL_chatlists_exportedInvites = (TL_chatlists.TL_chatlists_exportedInvites) tLObject;
                    n00Var3.getMessagesController().putChats(tL_chatlists_exportedInvites.chats, false);
                    n00Var3.getMessagesController().putUsers(tL_chatlists_exportedInvites.users, false);
                    arrayList3.clear();
                    arrayList3.addAll(tL_chatlists_exportedInvites.invites);
                    n00Var3.w0();
                }
                n00Var3.M = 0;
                break;
            case 16:
                n00 n00Var4 = (n00) obj2;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj;
                MessagesController.DialogFilter dialogFilter = n00Var4.r;
                if (b2Var != null) {
                    try {
                        b2Var.dismiss();
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                n00Var4.getMessagesController().removeFilter(dialogFilter);
                n00Var4.getMessagesStorage().deleteDialogFilter(dialogFilter);
                n00Var4.finishFragment();
                break;
            case 17:
                n00 n00Var5 = (n00) obj2;
                n00Var5.getClass();
                n00Var5.m0(((TL_chatlists.TL_chatlists_exportedChatlistInvite) obj).invite);
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
                FiltersSetupActivity filtersSetupActivity2 = ((l10) obj2).e;
                filtersSetupActivity2.getMessagesController().suggestedFilters.remove((TLRPC.TL_dialogFilterSuggested) obj);
                filtersSetupActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
                break;
            case 20:
                ArrayList arrayList4 = (ArrayList) obj;
                ArrayList arrayList5 = ((q50) obj2).Y1;
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
                q50 q50Var = (q50) obj2;
                q50Var.d.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShowAlert, 6, ((TLRPC.TL_error) obj).text);
                q50Var.dismiss();
                break;
            case 22:
                a6 a6Var = (a6) obj2;
                try {
                    Bitmap bitmap = ((org.telegram.ui.Components.voip.q2) obj).e.getBitmap(100, 100);
                    if (bitmap == null) {
                        break;
                    } else {
                        AndroidUtilities.runOnUIThread(new lt(23, a6Var, ei.n0.b(bitmap, true)));
                        break;
                    }
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 23:
                ((q50) ((a6) obj2).b).U0.setNewColors((int[]) obj);
                break;
            case 24:
                a70.V((a70) obj2, (TLRPC.TL_error) obj);
                break;
            case 25:
                w60 w60Var = (w60) obj2;
                String str = (String) obj;
                x60 x60Var = w60Var.a;
                x60Var.e = str;
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                tL_inputStickerSetShortName.short_name = str;
                x60Var.c = x60Var.h.getConnectionsManager().sendRequest(tL_messages_getStickerSet, new x40(i11, w60Var, str), 66);
                break;
            case 26:
                TLObject tLObject2 = (TLObject) obj;
                x60 x60Var2 = ((w60) obj2).a;
                if (tLObject2 != null) {
                    a70.a0(x60Var2.h, (TLRPC.TL_messages_stickerSet) tLObject2);
                    break;
                } else {
                    a70.a0(x60Var2.h, null);
                    break;
                }
            case 27:
                z60 z60Var = (z60) obj2;
                String str2 = (String) obj;
                z60Var.h = str2;
                a70 a70Var = z60Var.r;
                if (a70Var.N) {
                    TLRPC.TL_messages_searchEmojiStickerSets tL_messages_searchEmojiStickerSets = new TLRPC.TL_messages_searchEmojiStickerSets();
                    tL_messages_searchEmojiStickerSets.q = str2;
                    tL_messages_searchStickerSets = tL_messages_searchEmojiStickerSets;
                } else {
                    TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets2 = new TLRPC.TL_messages_searchStickerSets();
                    tL_messages_searchStickerSets2.q = str2;
                    tL_messages_searchStickerSets = tL_messages_searchStickerSets2;
                }
                z60Var.n = a70Var.getConnectionsManager().sendRequest(tL_messages_searchStickerSets, new ca(z60Var, str2, str2, 14), 66);
                break;
            case 28:
                AndroidUtilities.runOnUIThread(new i0(4, (s70) obj2, (CacheByChatsController.KeepMediaException) obj), 150L);
                break;
            default:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) obj2;
                languageSelectActivity.e = (ArrayList) obj;
                languageSelectActivity.c.l();
                break;
        }
    }
}
