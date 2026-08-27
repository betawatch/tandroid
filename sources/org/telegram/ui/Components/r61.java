package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r61 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ r61(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        zk0 zk0Var;
        int i11 = this.a;
        int i12 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i11) {
            case 0:
                t61 t61Var = (t61) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (bitmap != null) {
                    if (t61Var.w != null) {
                        Bitmap bitmap2 = t61Var.v;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        t61Var.v = t61Var.w;
                    }
                    t61Var.w = bitmap;
                    Bitmap bitmap3 = t61Var.w;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                    t61Var.C = bitmapShader;
                    bitmapShader.setLocalMatrix(t61Var.H);
                    t61Var.F.setShader(t61Var.C);
                    t61Var.invalidate();
                    int dp = AndroidUtilities.dp(150.0f);
                    float width = bitmap.getWidth() / bitmap.getHeight();
                    if (width > 1.0f) {
                        i10 = (int) (dp / width);
                    } else {
                        int i13 = (int) (dp * width);
                        i10 = dp;
                        dp = i13;
                    }
                    ViewGroup.LayoutParams layoutParams = t61Var.getLayoutParams();
                    if (t61Var.getVisibility() != 0 || layoutParams.width != dp || layoutParams.height != i10) {
                        layoutParams.width = dp;
                        layoutParams.height = i10;
                        t61Var.setVisibility(0);
                        t61Var.requestLayout();
                    }
                }
                t61Var.f = null;
                break;
            case 1:
                final h81 h81Var = (h81) obj2;
                h81Var.e.b.evaluateJavascript((String) obj, new ValueCallback() { // from class: org.telegram.ui.Components.g81
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(Object obj3) {
                        String str = (String) obj3;
                        h81 h81Var2 = h81.this;
                        String[] strArr = h81Var2.c;
                        strArr[0] = strArr[0].replace(h81Var2.d, "/signature/" + str.substring(1, str.length() - 1));
                        h81Var2.b.countDown();
                    }
                });
                break;
            case 2:
                ((org.telegram.ui.Components.voip.k) obj2).a.setOnClickListener((View.OnClickListener) obj);
                break;
            case 3:
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) obj2;
                Bitmap bitmap4 = (Bitmap) obj;
                HashMap<String, Bitmap> hashMap = tVar.B.thumbs;
                ChatObject.VideoParticipant videoParticipant = tVar.w;
                boolean z10 = videoParticipant.presentation;
                TLRPC.GroupCallParticipant groupCallParticipant = videoParticipant.participant;
                hashMap.put(z10 ? groupCallParticipant.presentationEndpoint : groupCallParticipant.videoEndpoint, bitmap4);
                break;
            case 4:
                org.telegram.ui.Components.voip.t tVar2 = (org.telegram.ui.Components.voip.t) obj;
                ((org.telegram.ui.Components.voip.k0) obj2).getClass();
                tVar2.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setListener(new org.telegram.ui.Components.voip.x(tVar2)).setDuration(150L).start();
                break;
            case 5:
                zk0 zk0Var2 = (zk0) obj2;
                if (zk0Var2 != null) {
                    zk0Var2.setOnItemClickListener((pk0) obj);
                    break;
                }
                break;
            case 6:
                org.telegram.ui.rt rtVar = (org.telegram.ui.rt) obj2;
                String lowerCase = ((String) obj).trim().toLowerCase();
                int i14 = 7;
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new r61(i14, rtVar, new ArrayList()));
                    break;
                } else {
                    String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = rtVar.f;
                    int size = arrayList2.size();
                    while (i12 < size) {
                        Object obj3 = arrayList2.get(i12);
                        i12++;
                        org.telegram.ui.nt ntVar = (org.telegram.ui.nt) obj3;
                        String str = ntVar.a;
                        if (str == null) {
                            str = "";
                        }
                        String lowerCase2 = str.toLowerCase();
                        String lowerCase3 = AndroidUtilities.translitSafe(ntVar.a).toLowerCase();
                        String str2 = ntVar.b;
                        if (str2 == null) {
                            str2 = "";
                        }
                        String lowerCase4 = str2.toLowerCase();
                        String lowerCase5 = AndroidUtilities.translitSafe(ntVar.b).toLowerCase();
                        String str3 = ntVar.c;
                        if (str3 == null) {
                            str3 = "";
                        }
                        String concat = TextUtils.isEmpty(str3) ? "" : "+".concat(str3);
                        if (lowerCase2.startsWith(lowerCase) || lowerCase2.contains(" ".concat(lowerCase)) || lowerCase3.startsWith(translitSafe) || org.telegram.messenger.y1.x(" ", translitSafe, lowerCase3) || lowerCase4.startsWith(lowerCase) || lowerCase4.contains(" ".concat(lowerCase)) || lowerCase5.startsWith(translitSafe) || org.telegram.messenger.y1.x(" ", translitSafe, lowerCase5) || str3.startsWith(lowerCase) || concat.startsWith(lowerCase)) {
                            arrayList.add(ntVar);
                        }
                    }
                    AndroidUtilities.runOnUIThread(new r61(7, rtVar, arrayList));
                    break;
                }
                break;
            case 7:
                org.telegram.ui.rt rtVar2 = (org.telegram.ui.rt) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                org.telegram.ui.tt ttVar = rtVar2.h;
                if (ttVar.f) {
                    rtVar2.e = arrayList3;
                    if (ttVar.e && (zk0Var = ttVar.a) != null) {
                        f2.q0 adapter = zk0Var.getAdapter();
                        org.telegram.ui.rt rtVar3 = ttVar.d;
                        if (adapter != rtVar3) {
                            ttVar.a.setAdapter(rtVar3);
                            ttVar.a.setFastScrollVisible(false);
                        }
                    }
                    rtVar2.l();
                    break;
                }
                break;
            case 8:
                MessagesController.getInstance(((org.telegram.ui.vt) obj2).currentAccount).processUpdates((TLRPC.Updates) obj, false);
                break;
            case 9:
                org.telegram.ui.gy.d0((org.telegram.ui.gy) obj2, (String) obj);
                break;
            case 10:
                nh.b3.j(((org.telegram.ui.gy) obj2).currentAccount, ((TLRPC.TL_attachMenuBot) obj).bot_id, null);
                break;
            case 11:
                org.telegram.ui.gy gyVar = (org.telegram.ui.gy) obj2;
                org.telegram.ui.ActionBar.e3[] e3VarArr = (org.telegram.ui.ActionBar.e3[]) obj;
                org.telegram.ui.ActionBar.e3 e3Var = e3VarArr[0];
                if (e3Var != null) {
                    e3Var.dismiss();
                    e3VarArr[0] = null;
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.gv(gyVar, 24), 300L);
                break;
            case 12:
                ((org.telegram.ui.fy) obj).a.postOnAnimation(new org.telegram.ui.gv((org.telegram.ui.gy) obj2, 14));
                break;
            case 13:
                org.telegram.ui.gy gyVar2 = (org.telegram.ui.gy) obj2;
                gyVar2.getMessagesController().addDialogToFolder((ArrayList) obj, (gyVar2.R2 == 0 && gyVar2.T2 == 0) ? 0 : 1, -1, null, 0L);
                break;
            case 14:
                ArrayList arrayList4 = (ArrayList) obj;
                org.telegram.ui.gy gyVar3 = ((org.telegram.ui.gw) obj2).b;
                gyVar3.u3 = 2;
                gyVar3.A4(true, true);
                gyVar3.o3();
                while (i12 < arrayList4.size()) {
                    long j10 = ((TLRPC.Dialog) arrayList4.get(i12)).id;
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList4.get(i12);
                    if (gyVar3.getMessagesController().isForum(j10) || gyVar3.getMessagesController().isMonoForumWithManageRights(j10)) {
                        gyVar3.getMessagesController().markAllTopicsAsRead(j10);
                    }
                    gyVar3.getMessagesController().markMentionsAsRead(j10, 0L);
                    MessagesController messagesController = gyVar3.getMessagesController();
                    int i15 = dialog.top_message;
                    messagesController.markDialogAsRead(j10, i15, i15, dialog.last_message_date, false, 0L, 0, true, 0);
                    i12++;
                }
                break;
            case 15:
                ((org.telegram.ui.gw) obj2).d((MessagesController.DialogFilter) obj);
                break;
            case 16:
                CharSequence charSequence = (CharSequence) obj;
                org.telegram.ui.gy gyVar4 = ((org.telegram.ui.sw) obj2).a;
                gyVar4.D2 = null;
                xp0 xp0Var = gyVar4.C2;
                if (xp0Var != null && xp0Var.h) {
                    xp0Var.e(charSequence, false);
                    break;
                }
                break;
            case 17:
                org.telegram.ui.ActionBar.n2[] n2VarArr = (org.telegram.ui.ActionBar.n2[]) obj;
                ((org.telegram.ui.gx) obj2).b.removeSelfFromStack();
                if (n2VarArr[1] != null) {
                    n2VarArr[0].removeSelfFromStack();
                    n2VarArr[1].finishFragment();
                    break;
                } else {
                    n2VarArr[0].finishFragment();
                    break;
                }
            case 18:
                org.telegram.ui.sy syVar = (org.telegram.ui.sy) obj2;
                org.telegram.ui.rn rnVar = syVar.a;
                ex0 ex0Var = new ex0(rnVar.getParentActivity(), syVar.a, ((MessageObject) obj).getInputStickerSet(), null, rnVar.U, rnVar.getResourceProvider());
                ex0Var.setCalcMandatoryInsets(rnVar.x9());
                rnVar.showDialog(ex0Var);
                break;
            case 19:
                org.telegram.ui.mz mzVar = (org.telegram.ui.mz) obj2;
                mzVar.getClass();
                ((org.telegram.ui.ActionBar.b2) obj).dismiss();
                org.telegram.ui.nz nzVar = mzVar.A;
                org.telegram.ui.oz ozVar = nzVar.c;
                Utilities.Callback callback = ozVar.x;
                if (callback != null) {
                    callback.run(ozVar.d);
                }
                nzVar.c.finishFragment();
                break;
            case 20:
                org.telegram.ui.q00 q00Var = (org.telegram.ui.q00) obj2;
                org.telegram.ui.oz ozVar2 = new org.telegram.ui.oz(q00Var.r, ((org.telegram.ui.h00) obj).m);
                ozVar2.y = new org.telegram.ui.rz(q00Var, 1);
                ozVar2.x = new org.telegram.ui.rz(q00Var, 2);
                q00Var.presentFragment(ozVar2);
                break;
            case 21:
                org.telegram.ui.q00 q00Var2 = (org.telegram.ui.q00) obj2;
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
            case 22:
                org.telegram.ui.q00 q00Var3 = (org.telegram.ui.q00) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList5 = q00Var3.H;
                q00Var3.J = false;
                if (tLObject instanceof TL_chatlists.TL_chatlists_exportedInvites) {
                    TL_chatlists.TL_chatlists_exportedInvites tL_chatlists_exportedInvites = (TL_chatlists.TL_chatlists_exportedInvites) tLObject;
                    q00Var3.getMessagesController().putChats(tL_chatlists_exportedInvites.chats, false);
                    q00Var3.getMessagesController().putUsers(tL_chatlists_exportedInvites.users, false);
                    arrayList5.clear();
                    arrayList5.addAll(tL_chatlists_exportedInvites.invites);
                    q00Var3.w0();
                }
                q00Var3.I = 0;
                break;
            case 23:
                org.telegram.ui.q00 q00Var4 = (org.telegram.ui.q00) obj2;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj;
                MessagesController.DialogFilter dialogFilter = q00Var4.r;
                if (b2Var != null) {
                    try {
                        b2Var.dismiss();
                    } catch (Exception e9) {
                        FileLog.e(e9);
                    }
                }
                q00Var4.getMessagesController().removeFilter(dialogFilter);
                q00Var4.getMessagesStorage().deleteDialogFilter(dialogFilter);
                q00Var4.finishFragment();
                break;
            case 24:
                org.telegram.ui.q00 q00Var5 = (org.telegram.ui.q00) obj2;
                q00Var5.getClass();
                q00Var5.m0(((TL_chatlists.TL_chatlists_exportedChatlistInvite) obj).invite);
                break;
            case 25:
                FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) obj2;
                if (((TLRPC.TL_messages_toggleDialogFilterTags) obj).enabled && !filtersSetupActivity.x) {
                    filtersSetupActivity.getMessagesController().loadRemoteFilters(true);
                    filtersSetupActivity.x = true;
                    break;
                }
                break;
            case 26:
                FiltersSetupActivity filtersSetupActivity2 = ((org.telegram.ui.o10) obj2).e;
                filtersSetupActivity2.getMessagesController().suggestedFilters.remove((TLRPC.TL_dialogFilterSuggested) obj);
                filtersSetupActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
                break;
            case 27:
                ArrayList arrayList6 = (ArrayList) obj;
                ArrayList arrayList7 = ((org.telegram.ui.s50) obj2).U1;
                for (int i16 = 0; i16 < arrayList7.size(); i16++) {
                    if (((org.telegram.ui.Components.voip.t) arrayList7.get(i16)).w != null) {
                        arrayList6.remove(((org.telegram.ui.Components.voip.t) arrayList7.get(i16)).w);
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
            case 28:
                org.telegram.ui.s50 s50Var = (org.telegram.ui.s50) obj2;
                s50Var.d.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShowAlert, 6, ((TLRPC.TL_error) obj).text);
                s50Var.dismiss();
                break;
            default:
                org.telegram.ui.w5 w5Var = (org.telegram.ui.w5) obj2;
                try {
                    Bitmap bitmap5 = ((org.telegram.ui.Components.voip.r2) obj).e.getBitmap(100, 100);
                    if (bitmap5 == null) {
                        break;
                    } else {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.a30(i12, w5Var, lh.n0.b(bitmap5, true)));
                        break;
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
        }
    }
}
