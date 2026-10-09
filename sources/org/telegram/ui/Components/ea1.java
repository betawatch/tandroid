package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.webkit.ValueCallback;
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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.ui.FiltersSetupActivity;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ea1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ea1(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qm0 qm0Var;
        int i10 = this.a;
        int i11 = 2;
        int i12 = 6;
        int i13 = 1;
        int i14 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                final ga1 ga1Var = (ga1) obj2;
                ga1Var.e.b.evaluateJavascript((String) obj, new ValueCallback() { // from class: org.telegram.ui.Components.fa1
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(Object obj3) {
                        String str = (String) obj3;
                        ga1 ga1Var2 = ga1.this;
                        String[] strArr = ga1Var2.c;
                        strArr[0] = strArr[0].replace(ga1Var2.d, "/signature/" + str.substring(1, str.length() - 1));
                        ga1Var2.b.countDown();
                    }
                });
                break;
            case 1:
                ((org.telegram.ui.Components.voip.k) obj2).a.setOnClickListener((View.OnClickListener) obj);
                break;
            case 2:
                org.telegram.ui.Components.voip.u uVar = (org.telegram.ui.Components.voip.u) obj2;
                Bitmap bitmap = (Bitmap) obj;
                HashMap<String, Bitmap> hashMap = uVar.F.thumbs;
                ChatObject.VideoParticipant videoParticipant = uVar.w;
                boolean z10 = videoParticipant.presentation;
                TLRPC.GroupCallParticipant groupCallParticipant = videoParticipant.participant;
                hashMap.put(z10 ? groupCallParticipant.presentationEndpoint : groupCallParticipant.videoEndpoint, bitmap);
                break;
            case 3:
                org.telegram.ui.Components.voip.u uVar2 = (org.telegram.ui.Components.voip.u) obj;
                ((org.telegram.ui.Components.voip.m0) obj2).getClass();
                uVar2.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setListener(new org.telegram.ui.Components.voip.z(uVar2)).setDuration(150L).start();
                break;
            case 4:
                qm0 qm0Var2 = (qm0) obj2;
                if (qm0Var2 != null) {
                    qm0Var2.setOnItemClickListener((em0) obj);
                    break;
                }
                break;
            case 5:
                org.telegram.ui.xt xtVar = (org.telegram.ui.xt) obj2;
                String lowerCase = ((String) obj).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new ea1(i12, xtVar, new ArrayList()));
                    break;
                } else {
                    String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = xtVar.f;
                    int size = arrayList2.size();
                    while (i14 < size) {
                        Object obj3 = arrayList2.get(i14);
                        i14++;
                        org.telegram.ui.ut utVar = (org.telegram.ui.ut) obj3;
                        String str = utVar.a;
                        if (str == null) {
                            str = "";
                        }
                        String lowerCase2 = str.toLowerCase();
                        String lowerCase3 = AndroidUtilities.translitSafe(utVar.a).toLowerCase();
                        String str2 = utVar.b;
                        if (str2 == null) {
                            str2 = "";
                        }
                        String lowerCase4 = str2.toLowerCase();
                        String lowerCase5 = AndroidUtilities.translitSafe(utVar.b).toLowerCase();
                        String str3 = utVar.c;
                        if (str3 == null) {
                            str3 = "";
                        }
                        String concat = TextUtils.isEmpty(str3) ? "" : "+".concat(str3);
                        if (lowerCase2.startsWith(lowerCase) || lowerCase2.contains(" ".concat(lowerCase)) || lowerCase3.startsWith(translitSafe) || org.telegram.messenger.bi.w(" ", translitSafe, lowerCase3) || lowerCase4.startsWith(lowerCase) || lowerCase4.contains(" ".concat(lowerCase)) || lowerCase5.startsWith(translitSafe) || org.telegram.messenger.bi.w(" ", translitSafe, lowerCase5) || str3.startsWith(lowerCase) || concat.startsWith(lowerCase)) {
                            arrayList.add(utVar);
                        }
                    }
                    AndroidUtilities.runOnUIThread(new ea1(6, xtVar, arrayList));
                    break;
                }
                break;
            case 6:
                org.telegram.ui.xt xtVar2 = (org.telegram.ui.xt) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                org.telegram.ui.zt ztVar = xtVar2.h;
                if (ztVar.f) {
                    xtVar2.e = arrayList3;
                    if (ztVar.e && (qm0Var = ztVar.a) != null) {
                        s4.i0 adapter = qm0Var.getAdapter();
                        org.telegram.ui.xt xtVar3 = ztVar.d;
                        if (adapter != xtVar3) {
                            ztVar.a.setAdapter(xtVar3);
                            ztVar.a.setFastScrollVisible(false);
                        }
                    }
                    xtVar2.l();
                    break;
                }
                break;
            case 7:
                MessagesController.getInstance(((org.telegram.ui.bu) obj2).currentAccount).lambda$processUpdates$377((TLRPC.Updates) obj, false);
                break;
            case 8:
                org.telegram.ui.ty.b0((org.telegram.ui.ty) obj2, (String) obj);
                break;
            case 9:
                ei.k3.j(((org.telegram.ui.ty) obj2).currentAccount, ((TLRPC.TL_attachMenuBot) obj).bot_id, null);
                break;
            case 10:
                org.telegram.ui.ty tyVar = (org.telegram.ui.ty) obj2;
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) obj;
                org.telegram.ui.ActionBar.f3 f3Var = f3VarArr[0];
                if (f3Var != null) {
                    f3Var.dismiss();
                    f3VarArr[0] = null;
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ov(tyVar, 25), 300L);
                break;
            case 11:
                ((org.telegram.ui.sy) obj).a.postOnAnimation(new org.telegram.ui.ov((org.telegram.ui.ty) obj2, 15));
                break;
            case 12:
                org.telegram.ui.ty tyVar2 = (org.telegram.ui.ty) obj2;
                tyVar2.getMessagesController().addDialogToFolder((ArrayList) obj, (tyVar2.V2 == 0 && tyVar2.X2 == 0) ? 0 : 1, -1, null, 0L);
                break;
            case 13:
                ArrayList arrayList4 = (ArrayList) obj;
                org.telegram.ui.ty tyVar3 = ((org.telegram.ui.sw) obj2).b;
                tyVar3.y3 = 2;
                tyVar3.x4(true, true);
                tyVar3.l3();
                while (i14 < arrayList4.size()) {
                    long j3 = ((TLRPC.Dialog) arrayList4.get(i14)).id;
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList4.get(i14);
                    if (tyVar3.getMessagesController().isForum(j3) || tyVar3.getMessagesController().isMonoForumWithManageRights(j3)) {
                        tyVar3.getMessagesController().markAllTopicsAsRead(j3);
                    }
                    tyVar3.getMessagesController().markMentionsAsRead(j3, 0L);
                    MessagesController messagesController = tyVar3.getMessagesController();
                    int i15 = dialog.top_message;
                    messagesController.markDialogAsRead(j3, i15, i15, dialog.last_message_date, false, 0L, 0, true, 0);
                    i14++;
                }
                break;
            case 14:
                ((org.telegram.ui.sw) obj2).d((MessagesController.DialogFilter) obj);
                break;
            case 15:
                CharSequence charSequence = (CharSequence) obj;
                org.telegram.ui.ty tyVar4 = ((org.telegram.ui.ex) obj2).a;
                tyVar4.H2 = null;
                rr0 rr0Var = tyVar4.G2;
                if (rr0Var != null && rr0Var.h) {
                    rr0Var.e(charSequence, false);
                    break;
                }
                break;
            case 16:
                org.telegram.ui.ActionBar.n2[] n2VarArr = (org.telegram.ui.ActionBar.n2[]) obj;
                ((org.telegram.ui.sx) obj2).b.removeSelfFromStack();
                if (n2VarArr[1] != null) {
                    n2VarArr[0].removeSelfFromStack();
                    n2VarArr[1].finishFragment();
                    break;
                } else {
                    n2VarArr[0].finishFragment();
                    break;
                }
            case 17:
                org.telegram.ui.fz fzVar = (org.telegram.ui.fz) obj2;
                org.telegram.ui.zn znVar = fzVar.a;
                xy0 xy0Var = new xy0(znVar.getParentActivity(), fzVar.a, ((MessageObject) obj).getInputStickerSet(), null, znVar.Y, znVar.getResourceProvider());
                xy0Var.setCalcMandatoryInsets(znVar.C9());
                znVar.showDialog(xy0Var);
                break;
            case 18:
                org.telegram.ui.a00 a00Var = (org.telegram.ui.a00) obj2;
                a00Var.getClass();
                ((org.telegram.ui.ActionBar.b2) obj).dismiss();
                org.telegram.ui.b00 b00Var = a00Var.E;
                org.telegram.ui.c00 c00Var = b00Var.c;
                Utilities.Callback callback = c00Var.x;
                if (callback != null) {
                    callback.run(c00Var.d);
                }
                b00Var.c.finishFragment();
                break;
            case 19:
                org.telegram.ui.f10 f10Var = (org.telegram.ui.f10) obj2;
                org.telegram.ui.c00 c00Var2 = new org.telegram.ui.c00(f10Var.r, ((org.telegram.ui.w00) obj).m);
                c00Var2.y = new org.telegram.ui.f00(f10Var, i13);
                c00Var2.x = new org.telegram.ui.f00(f10Var, i11);
                f10Var.presentFragment(c00Var2);
                break;
            case 20:
                org.telegram.ui.f10 f10Var2 = (org.telegram.ui.f10) obj2;
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
            case 21:
                org.telegram.ui.f10 f10Var3 = (org.telegram.ui.f10) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList5 = f10Var3.L;
                f10Var3.N = false;
                if (tLObject instanceof TL_chatlists.TL_chatlists_exportedInvites) {
                    TL_chatlists.TL_chatlists_exportedInvites tL_chatlists_exportedInvites = (TL_chatlists.TL_chatlists_exportedInvites) tLObject;
                    f10Var3.getMessagesController().putChats(tL_chatlists_exportedInvites.chats, false);
                    f10Var3.getMessagesController().putUsers(tL_chatlists_exportedInvites.users, false);
                    arrayList5.clear();
                    arrayList5.addAll(tL_chatlists_exportedInvites.invites);
                    f10Var3.w0();
                }
                f10Var3.M = 0;
                break;
            case 22:
                org.telegram.ui.f10 f10Var4 = (org.telegram.ui.f10) obj2;
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
            case 23:
                org.telegram.ui.f10 f10Var5 = (org.telegram.ui.f10) obj2;
                f10Var5.getClass();
                f10Var5.m0(((TL_chatlists.TL_chatlists_exportedChatlistInvite) obj).invite);
                break;
            case 24:
                FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) obj2;
                if (((TLRPC.TL_messages_toggleDialogFilterTags) obj).enabled && !filtersSetupActivity.x) {
                    filtersSetupActivity.getMessagesController().loadRemoteFilters(true);
                    filtersSetupActivity.x = true;
                    break;
                }
                break;
            case 25:
                FiltersSetupActivity filtersSetupActivity2 = ((org.telegram.ui.c20) obj2).e;
                filtersSetupActivity2.getMessagesController().suggestedFilters.remove((TLRPC.TL_dialogFilterSuggested) obj);
                filtersSetupActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
                break;
            case 26:
                ArrayList arrayList6 = (ArrayList) obj;
                ArrayList arrayList7 = ((org.telegram.ui.g60) obj2).Y1;
                for (int i16 = 0; i16 < arrayList7.size(); i16++) {
                    if (((org.telegram.ui.Components.voip.u) arrayList7.get(i16)).w != null) {
                        arrayList6.remove(((org.telegram.ui.Components.voip.u) arrayList7.get(i16)).w);
                    }
                }
                while (i14 < arrayList6.size()) {
                    ChatObject.VideoParticipant videoParticipant2 = (ChatObject.VideoParticipant) arrayList6.get(i14);
                    if (videoParticipant2.participant.self) {
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setLocalSink(null, videoParticipant2.presentation);
                        }
                    } else if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().removeRemoteSink(videoParticipant2.participant, videoParticipant2.presentation);
                    }
                    i14++;
                }
                break;
            case 27:
                org.telegram.ui.g60 g60Var = (org.telegram.ui.g60) obj2;
                g60Var.d.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShowAlert, 6, ((TLRPC.TL_error) obj).text);
                g60Var.dismiss();
                break;
            case 28:
                org.telegram.ui.w5 w5Var = (org.telegram.ui.w5) obj2;
                try {
                    Bitmap bitmap2 = ((org.telegram.ui.Components.voip.s2) obj).e.getBitmap(100, 100);
                    if (bitmap2 == null) {
                        break;
                    } else {
                        AndroidUtilities.runOnUIThread(new ea1(29, w5Var, ci.m0.b(bitmap2, true)));
                        break;
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            default:
                ((org.telegram.ui.g60) ((org.telegram.ui.w5) obj2).b).U0.setNewColors((int[]) obj);
                break;
        }
    }
}
