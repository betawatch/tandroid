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

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ot implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ot(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.mm0 mm0Var;
        TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets;
        int i10 = this.a;
        int i11 = 1;
        int i12 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                pt ptVar = (pt) obj2;
                ArrayList arrayList = (ArrayList) obj;
                rt rtVar = ptVar.h;
                if (rtVar.f) {
                    ptVar.e = arrayList;
                    if (rtVar.e && (mm0Var = rtVar.a) != null) {
                        s4.g0 adapter = mm0Var.getAdapter();
                        pt ptVar2 = rtVar.d;
                        if (adapter != ptVar2) {
                            rtVar.a.setAdapter(ptVar2);
                            rtVar.a.setFastScrollVisible(false);
                        }
                    }
                    ptVar.l();
                    break;
                }
                break;
            case 1:
                MessagesController.getInstance(((tt) obj2).currentAccount).lambda$processUpdates$377((TLRPC.Updates) obj, false);
                break;
            case 2:
                ey.b0((ey) obj2, (String) obj);
                break;
            case 3:
                gi.d3.j(((ey) obj2).currentAccount, ((TLRPC.TL_attachMenuBot) obj).bot_id, null);
                break;
            case 4:
                ey eyVar = (ey) obj2;
                org.telegram.ui.ActionBar.h3[] h3VarArr = (org.telegram.ui.ActionBar.h3[]) obj;
                org.telegram.ui.ActionBar.h3 h3Var = h3VarArr[0];
                if (h3Var != null) {
                    h3Var.dismiss();
                    h3VarArr[0] = null;
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
                org.telegram.ui.Components.nr0 nr0Var = eyVar4.G2;
                if (nr0Var != null && nr0Var.h) {
                    nr0Var.e(charSequence, false);
                    break;
                }
                break;
            case 10:
                org.telegram.ui.ActionBar.o2[] o2VarArr = (org.telegram.ui.ActionBar.o2[]) obj;
                ((dx) obj2).b.removeSelfFromStack();
                if (o2VarArr[1] != null) {
                    o2VarArr[0].removeSelfFromStack();
                    o2VarArr[1].finishFragment();
                    break;
                } else {
                    o2VarArr[0].finishFragment();
                    break;
                }
            case 11:
                qy qyVar = (qy) obj2;
                sn snVar = qyVar.a;
                org.telegram.ui.Components.ty0 ty0Var = new org.telegram.ui.Components.ty0(snVar.getParentActivity(), qyVar.a, ((MessageObject) obj).getInputStickerSet(), null, snVar.Y, snVar.getResourceProvider());
                ty0Var.setCalcMandatoryInsets(snVar.C9());
                snVar.showDialog(ty0Var);
                break;
            case 12:
                mz mzVar = (mz) obj2;
                mzVar.getClass();
                ((org.telegram.ui.ActionBar.c2) obj).dismiss();
                nz nzVar = mzVar.E;
                oz ozVar = nzVar.c;
                Utilities.Callback callback = ozVar.y;
                if (callback != null) {
                    callback.run(ozVar.d);
                }
                nzVar.c.finishFragment();
                break;
            case 13:
                q00 q00Var = (q00) obj2;
                oz ozVar2 = new oz(q00Var.r, ((h00) obj).m);
                ozVar2.E = new rz(q00Var, 1);
                ozVar2.y = new rz(q00Var, 2);
                q00Var.presentFragment(ozVar2);
                break;
            case 14:
                q00 q00Var2 = (q00) obj2;
                Runnable runnable = (Runnable) obj;
                q00Var2.h = false;
                q00Var2.s = false;
                q00Var2.r.flags = q00Var2.y;
                q00Var2.i0(true);
                q00Var2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 15:
                q00 q00Var3 = (q00) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList3 = q00Var3.L;
                q00Var3.N = false;
                if (tLObject instanceof TL_chatlists.TL_chatlists_exportedInvites) {
                    TL_chatlists.TL_chatlists_exportedInvites tL_chatlists_exportedInvites = (TL_chatlists.TL_chatlists_exportedInvites) tLObject;
                    q00Var3.getMessagesController().putChats(tL_chatlists_exportedInvites.chats, false);
                    q00Var3.getMessagesController().putUsers(tL_chatlists_exportedInvites.users, false);
                    arrayList3.clear();
                    arrayList3.addAll(tL_chatlists_exportedInvites.invites);
                    q00Var3.w0();
                }
                q00Var3.M = 0;
                break;
            case 16:
                q00 q00Var4 = (q00) obj2;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) obj;
                MessagesController.DialogFilter dialogFilter = q00Var4.r;
                if (c2Var != null) {
                    try {
                        c2Var.dismiss();
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                q00Var4.getMessagesController().removeFilter(dialogFilter);
                q00Var4.getMessagesStorage().deleteDialogFilter(dialogFilter);
                q00Var4.finishFragment();
                break;
            case 17:
                q00 q00Var5 = (q00) obj2;
                q00Var5.getClass();
                q00Var5.m0(((TL_chatlists.TL_chatlists_exportedChatlistInvite) obj).invite);
                break;
            case 18:
                FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) obj2;
                if (((TLRPC.TL_messages_toggleDialogFilterTags) obj).enabled && !filtersSetupActivity.x) {
                    filtersSetupActivity.x = true;
                    filtersSetupActivity.a0(new j10(filtersSetupActivity, 3));
                    break;
                }
                break;
            case 19:
                FiltersSetupActivity filtersSetupActivity2 = ((p10) obj2).e;
                filtersSetupActivity2.getMessagesController().suggestedFilters.remove((TLRPC.TL_dialogFilterSuggested) obj);
                filtersSetupActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
                break;
            case 20:
                ArrayList arrayList4 = (ArrayList) obj;
                ArrayList arrayList5 = ((u50) obj2).Y1;
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
                u50 u50Var = (u50) obj2;
                u50Var.d.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShowAlert, 6, ((TLRPC.TL_error) obj).text);
                u50Var.dismiss();
                break;
            case 22:
                z5 z5Var = (z5) obj2;
                try {
                    Bitmap bitmap = ((org.telegram.ui.Components.voip.q2) obj).e.getBitmap(100, 100);
                    if (bitmap == null) {
                        break;
                    } else {
                        AndroidUtilities.runOnUIThread(new ot(23, z5Var, ei.n0.b(bitmap, true)));
                        break;
                    }
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 23:
                ((u50) ((z5) obj2).b).U0.setNewColors((int[]) obj);
                break;
            case 24:
                e70.V((e70) obj2, (TLRPC.TL_error) obj);
                break;
            case 25:
                a70 a70Var = (a70) obj2;
                String str = (String) obj;
                b70 b70Var = a70Var.a;
                b70Var.e = str;
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                tL_inputStickerSetShortName.short_name = str;
                b70Var.c = b70Var.h.getConnectionsManager().sendRequest(tL_messages_getStickerSet, new a50(i11, a70Var, str), 66);
                break;
            case 26:
                TLObject tLObject2 = (TLObject) obj;
                b70 b70Var2 = ((a70) obj2).a;
                if (tLObject2 != null) {
                    e70.a0(b70Var2.h, (TLRPC.TL_messages_stickerSet) tLObject2);
                    break;
                } else {
                    e70.a0(b70Var2.h, null);
                    break;
                }
            case 27:
                d70 d70Var = (d70) obj2;
                String str2 = (String) obj;
                d70Var.h = str2;
                e70 e70Var = d70Var.r;
                if (e70Var.N) {
                    TLRPC.TL_messages_searchEmojiStickerSets tL_messages_searchEmojiStickerSets = new TLRPC.TL_messages_searchEmojiStickerSets();
                    tL_messages_searchEmojiStickerSets.q = str2;
                    tL_messages_searchStickerSets = tL_messages_searchEmojiStickerSets;
                } else {
                    TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets2 = new TLRPC.TL_messages_searchStickerSets();
                    tL_messages_searchStickerSets2.q = str2;
                    tL_messages_searchStickerSets = tL_messages_searchStickerSets2;
                }
                d70Var.n = e70Var.getConnectionsManager().sendRequest(tL_messages_searchStickerSets, new ca(d70Var, str2, str2, 14), 66);
                break;
            case 28:
                AndroidUtilities.runOnUIThread(new h0(4, (y70) obj2, (CacheByChatsController.KeepMediaException) obj), 150L);
                break;
            default:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) obj2;
                languageSelectActivity.e = (ArrayList) obj;
                languageSelectActivity.c.l();
                break;
        }
    }
}
