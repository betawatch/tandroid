package org.telegram.ui.Components.voip;

import android.graphics.Bitmap;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.x3;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.ui.Components.iq0;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.nx0;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.c70;
import org.telegram.ui.ev;
import org.telegram.ui.ey;
import org.telegram.ui.fw;
import org.telegram.ui.fx;
import org.telegram.ui.fy;
import org.telegram.ui.g00;
import org.telegram.ui.lt;
import org.telegram.ui.lz;
import org.telegram.ui.mz;
import org.telegram.ui.n10;
import org.telegram.ui.nz;
import org.telegram.ui.p00;
import org.telegram.ui.pt;
import org.telegram.ui.qz;
import org.telegram.ui.r50;
import org.telegram.ui.rt;
import org.telegram.ui.rw;
import org.telegram.ui.ry;
import org.telegram.ui.tn;
import org.telegram.ui.tt;
import org.telegram.ui.w5;
import org.telegram.ui.y60;
import org.telegram.ui.z60;
import org.telegram.ui.zg;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jl0 jl0Var;
        int i10 = this.a;
        int i11 = 27;
        int i12 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                u uVar = (u) obj2;
                Bitmap bitmap = (Bitmap) obj;
                HashMap<String, Bitmap> hashMap = uVar.B.thumbs;
                ChatObject.VideoParticipant videoParticipant = uVar.w;
                boolean z10 = videoParticipant.presentation;
                TLRPC.GroupCallParticipant groupCallParticipant = videoParticipant.participant;
                hashMap.put(z10 ? groupCallParticipant.presentationEndpoint : groupCallParticipant.videoEndpoint, bitmap);
                break;
            case 1:
                u uVar2 = (u) obj2;
                ((l0) obj).getClass();
                uVar2.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setListener(new y(uVar2)).setDuration(150L).start();
                break;
            case 2:
                jl0 jl0Var2 = (jl0) obj2;
                if (jl0Var2 != null) {
                    jl0Var2.setOnItemClickListener((zk0) obj);
                    break;
                }
                break;
            case 3:
                pt ptVar = (pt) obj2;
                String lowerCase = ((String) obj).trim().toLowerCase();
                int i13 = 4;
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new o(i13, ptVar, new ArrayList()));
                    break;
                } else {
                    String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = ptVar.f;
                    int size = arrayList2.size();
                    while (i12 < size) {
                        Object obj3 = arrayList2.get(i12);
                        i12++;
                        lt ltVar = (lt) obj3;
                        String str = ltVar.a;
                        if (str == null) {
                            str = "";
                        }
                        String lowerCase2 = str.toLowerCase();
                        String lowerCase3 = AndroidUtilities.translitSafe(ltVar.a).toLowerCase();
                        String str2 = ltVar.b;
                        if (str2 == null) {
                            str2 = "";
                        }
                        String lowerCase4 = str2.toLowerCase();
                        String lowerCase5 = AndroidUtilities.translitSafe(ltVar.b).toLowerCase();
                        String str3 = ltVar.c;
                        if (str3 == null) {
                            str3 = "";
                        }
                        String concat = TextUtils.isEmpty(str3) ? "" : "+".concat(str3);
                        if (lowerCase2.startsWith(lowerCase) || lowerCase2.contains(" ".concat(lowerCase)) || lowerCase3.startsWith(translitSafe) || x3.w(" ", translitSafe, lowerCase3) || lowerCase4.startsWith(lowerCase) || lowerCase4.contains(" ".concat(lowerCase)) || lowerCase5.startsWith(translitSafe) || x3.w(" ", translitSafe, lowerCase5) || str3.startsWith(lowerCase) || concat.startsWith(lowerCase)) {
                            arrayList.add(ltVar);
                        }
                    }
                    AndroidUtilities.runOnUIThread(new o(4, ptVar, arrayList));
                    break;
                }
                break;
            case 4:
                pt ptVar2 = (pt) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                rt rtVar = ptVar2.h;
                if (rtVar.f) {
                    ptVar2.e = arrayList3;
                    if (rtVar.e && (jl0Var = rtVar.a) != null) {
                        f2.p0 adapter = jl0Var.getAdapter();
                        pt ptVar3 = rtVar.d;
                        if (adapter != ptVar3) {
                            rtVar.a.setAdapter(ptVar3);
                            rtVar.a.setFastScrollVisible(false);
                        }
                    }
                    ptVar2.l();
                    break;
                }
                break;
            case 5:
                MessagesController.getInstance(((tt) obj2).currentAccount).processUpdates((TLRPC.Updates) obj, false);
                break;
            case 6:
                fy.d0((fy) obj2, (String) obj);
                break;
            case 7:
                ph.p2.j(((fy) obj2).currentAccount, ((TLRPC.TL_attachMenuBot) obj).bot_id, null);
                break;
            case 8:
                fy fyVar = (fy) obj2;
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) obj;
                org.telegram.ui.ActionBar.f3 f3Var = f3VarArr[0];
                if (f3Var != null) {
                    f3Var.dismiss();
                    f3VarArr[0] = null;
                }
                AndroidUtilities.runOnUIThread(new ev(fyVar, 24), 300L);
                break;
            case 9:
                ((ey) obj).a.postOnAnimation(new ev((fy) obj2, 14));
                break;
            case 10:
                fy fyVar2 = (fy) obj2;
                fyVar2.getMessagesController().addDialogToFolder((ArrayList) obj, (fyVar2.R2 == 0 && fyVar2.T2 == 0) ? 0 : 1, -1, null, 0L);
                break;
            case 11:
                ArrayList arrayList4 = (ArrayList) obj;
                fy fyVar3 = ((fw) obj2).b;
                fyVar3.u3 = 2;
                fyVar3.A4(true, true);
                fyVar3.o3();
                while (i12 < arrayList4.size()) {
                    long j10 = ((TLRPC.Dialog) arrayList4.get(i12)).id;
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList4.get(i12);
                    if (fyVar3.getMessagesController().isForum(j10) || fyVar3.getMessagesController().isMonoForumWithManageRights(j10)) {
                        fyVar3.getMessagesController().markAllTopicsAsRead(j10);
                    }
                    fyVar3.getMessagesController().markMentionsAsRead(j10, 0L);
                    MessagesController messagesController = fyVar3.getMessagesController();
                    int i14 = dialog.top_message;
                    messagesController.markDialogAsRead(j10, i14, i14, dialog.last_message_date, false, 0L, 0, true, 0);
                    i12++;
                }
                break;
            case 12:
                ((fw) obj2).d((MessagesController.DialogFilter) obj);
                break;
            case 13:
                CharSequence charSequence = (CharSequence) obj;
                fy fyVar4 = ((rw) obj2).a;
                fyVar4.D2 = null;
                iq0 iq0Var = fyVar4.C2;
                if (iq0Var != null && iq0Var.h) {
                    iq0Var.e(charSequence, false);
                    break;
                }
                break;
            case 14:
                org.telegram.ui.ActionBar.o2[] o2VarArr = (org.telegram.ui.ActionBar.o2[]) obj;
                ((fx) obj2).b.removeSelfFromStack();
                if (o2VarArr[1] != null) {
                    o2VarArr[0].removeSelfFromStack();
                    o2VarArr[1].finishFragment();
                    break;
                } else {
                    o2VarArr[0].finishFragment();
                    break;
                }
            case 15:
                ry ryVar = (ry) obj2;
                tn tnVar = ryVar.a;
                nx0 nx0Var = new nx0(tnVar.getParentActivity(), ryVar.a, ((MessageObject) obj).getInputStickerSet(), null, tnVar.U, tnVar.getResourceProvider());
                nx0Var.setCalcMandatoryInsets(tnVar.x9());
                tnVar.showDialog(nx0Var);
                break;
            case 16:
                lz lzVar = (lz) obj2;
                lzVar.getClass();
                ((org.telegram.ui.ActionBar.c2) obj).dismiss();
                mz mzVar = lzVar.A;
                nz nzVar = mzVar.c;
                Utilities.Callback callback = nzVar.x;
                if (callback != null) {
                    callback.run(nzVar.d);
                }
                mzVar.c.finishFragment();
                break;
            case 17:
                p00 p00Var = (p00) obj2;
                nz nzVar2 = new nz(p00Var.r, ((g00) obj).m);
                nzVar2.y = new qz(p00Var, 1);
                nzVar2.x = new qz(p00Var, 2);
                p00Var.presentFragment(nzVar2);
                break;
            case 18:
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
            case 19:
                p00 p00Var3 = (p00) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList5 = p00Var3.H;
                p00Var3.J = false;
                if (tLObject instanceof TL_chatlists.TL_chatlists_exportedInvites) {
                    TL_chatlists.TL_chatlists_exportedInvites tL_chatlists_exportedInvites = (TL_chatlists.TL_chatlists_exportedInvites) tLObject;
                    p00Var3.getMessagesController().putChats(tL_chatlists_exportedInvites.chats, false);
                    p00Var3.getMessagesController().putUsers(tL_chatlists_exportedInvites.users, false);
                    arrayList5.clear();
                    arrayList5.addAll(tL_chatlists_exportedInvites.invites);
                    p00Var3.w0();
                }
                p00Var3.I = 0;
                break;
            case 20:
                p00 p00Var4 = (p00) obj2;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) obj;
                MessagesController.DialogFilter dialogFilter = p00Var4.r;
                if (c2Var != null) {
                    try {
                        c2Var.dismiss();
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                }
                p00Var4.getMessagesController().removeFilter(dialogFilter);
                p00Var4.getMessagesStorage().deleteDialogFilter(dialogFilter);
                p00Var4.finishFragment();
                break;
            case 21:
                p00 p00Var5 = (p00) obj2;
                p00Var5.getClass();
                p00Var5.m0(((TL_chatlists.TL_chatlists_exportedChatlistInvite) obj).invite);
                break;
            case 22:
                FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) obj2;
                if (((TLRPC.TL_messages_toggleDialogFilterTags) obj).enabled && !filtersSetupActivity.x) {
                    filtersSetupActivity.getMessagesController().loadRemoteFilters(true);
                    filtersSetupActivity.x = true;
                    break;
                }
                break;
            case 23:
                FiltersSetupActivity filtersSetupActivity2 = ((n10) obj2).e;
                filtersSetupActivity2.getMessagesController().suggestedFilters.remove((TLRPC.TL_dialogFilterSuggested) obj);
                filtersSetupActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
                break;
            case 24:
                ArrayList arrayList6 = (ArrayList) obj;
                ArrayList arrayList7 = ((r50) obj2).U1;
                for (int i15 = 0; i15 < arrayList7.size(); i15++) {
                    if (((u) arrayList7.get(i15)).w != null) {
                        arrayList6.remove(((u) arrayList7.get(i15)).w);
                    }
                }
                while (i12 < arrayList6.size()) {
                    ChatObject.VideoParticipant videoParticipant2 = (ChatObject.VideoParticipant) arrayList6.get(i12);
                    if (videoParticipant2.participant.self) {
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setLocalSink(null, videoParticipant2.presentation);
                        }
                    } else if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().removeRemoteSink(videoParticipant2.participant, videoParticipant2.presentation);
                    }
                    i12++;
                }
                break;
            case 25:
                r50 r50Var = (r50) obj2;
                r50Var.d.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShowAlert, 6, ((TLRPC.TL_error) obj).text);
                r50Var.dismiss();
                break;
            case 26:
                w5 w5Var = (w5) obj2;
                try {
                    Bitmap bitmap2 = ((u2) obj).e.getBitmap(100, 100);
                    if (bitmap2 == null) {
                        break;
                    } else {
                        AndroidUtilities.runOnUIThread(new o(i11, w5Var, nh.n0.b(bitmap2, true)));
                        break;
                    }
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
            case 27:
                ((r50) ((w5) obj2).b).Q0.setNewColors((int[]) obj);
                break;
            case 28:
                c70.V((c70) obj2, (TLRPC.TL_error) obj);
                break;
            default:
                y60 y60Var = (y60) obj2;
                String str4 = (String) obj;
                z60 z60Var = y60Var.a;
                z60Var.e = str4;
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                tL_inputStickerSetShortName.short_name = str4;
                z60Var.c = z60Var.h.getConnectionsManager().sendRequest(tL_messages_getStickerSet, new zg(i11, y60Var, str4), 66);
                break;
        }
    }

    public /* synthetic */ o(l0 l0Var, u uVar) {
        this.a = 1;
        this.c = l0Var;
        this.b = uVar;
    }
}
