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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p61 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p61(int i9, Object obj, Object obj2) {
        this.a = i9;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i9;
        wk0 wk0Var;
        int i10 = this.a;
        int i11 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                r61 r61Var = (r61) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (bitmap != null) {
                    if (r61Var.w != null) {
                        Bitmap bitmap2 = r61Var.v;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        r61Var.v = r61Var.w;
                    }
                    r61Var.w = bitmap;
                    Bitmap bitmap3 = r61Var.w;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                    r61Var.C = bitmapShader;
                    bitmapShader.setLocalMatrix(r61Var.H);
                    r61Var.F.setShader(r61Var.C);
                    r61Var.invalidate();
                    int dp = AndroidUtilities.dp(150.0f);
                    float width = bitmap.getWidth() / bitmap.getHeight();
                    if (width > 1.0f) {
                        i9 = (int) (dp / width);
                    } else {
                        int i12 = (int) (dp * width);
                        i9 = dp;
                        dp = i12;
                    }
                    ViewGroup.LayoutParams layoutParams = r61Var.getLayoutParams();
                    if (r61Var.getVisibility() != 0 || layoutParams.width != dp || layoutParams.height != i9) {
                        layoutParams.width = dp;
                        layoutParams.height = i9;
                        r61Var.setVisibility(0);
                        r61Var.requestLayout();
                    }
                }
                r61Var.f = null;
                break;
            case 1:
                final f81 f81Var = (f81) obj2;
                f81Var.e.b.evaluateJavascript((String) obj, new ValueCallback() { // from class: org.telegram.ui.Components.e81
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(Object obj3) {
                        String str = (String) obj3;
                        f81 f81Var2 = f81.this;
                        String[] strArr = f81Var2.c;
                        strArr[0] = strArr[0].replace(f81Var2.d, "/signature/" + str.substring(1, str.length() - 1));
                        f81Var2.b.countDown();
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
                wk0 wk0Var2 = (wk0) obj2;
                if (wk0Var2 != null) {
                    wk0Var2.setOnItemClickListener((mk0) obj);
                    break;
                }
                break;
            case 6:
                org.telegram.ui.ot otVar = (org.telegram.ui.ot) obj2;
                String lowerCase = ((String) obj).trim().toLowerCase();
                int i13 = 7;
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new p61(i13, otVar, new ArrayList()));
                    break;
                } else {
                    String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = otVar.f;
                    int size = arrayList2.size();
                    while (i11 < size) {
                        Object obj3 = arrayList2.get(i11);
                        i11++;
                        org.telegram.ui.lt ltVar = (org.telegram.ui.lt) obj3;
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
                        if (lowerCase2.startsWith(lowerCase) || lowerCase2.contains(" ".concat(lowerCase)) || lowerCase3.startsWith(translitSafe) || org.telegram.messenger.l0.w(" ", translitSafe, lowerCase3) || lowerCase4.startsWith(lowerCase) || lowerCase4.contains(" ".concat(lowerCase)) || lowerCase5.startsWith(translitSafe) || org.telegram.messenger.l0.w(" ", translitSafe, lowerCase5) || str3.startsWith(lowerCase) || concat.startsWith(lowerCase)) {
                            arrayList.add(ltVar);
                        }
                    }
                    AndroidUtilities.runOnUIThread(new p61(7, otVar, arrayList));
                    break;
                }
                break;
            case 7:
                org.telegram.ui.ot otVar2 = (org.telegram.ui.ot) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                org.telegram.ui.qt qtVar = otVar2.h;
                if (qtVar.f) {
                    otVar2.e = arrayList3;
                    if (qtVar.e && (wk0Var = qtVar.a) != null) {
                        f2.r0 adapter = wk0Var.getAdapter();
                        org.telegram.ui.ot otVar3 = qtVar.d;
                        if (adapter != otVar3) {
                            qtVar.a.setAdapter(otVar3);
                            qtVar.a.setFastScrollVisible(false);
                        }
                    }
                    otVar2.l();
                    break;
                }
                break;
            case 8:
                MessagesController.getInstance(((org.telegram.ui.st) obj2).currentAccount).processUpdates((TLRPC.Updates) obj, false);
                break;
            case 9:
                org.telegram.ui.dy.c0((org.telegram.ui.dy) obj2, (String) obj);
                break;
            case 10:
                mh.c3.j(((org.telegram.ui.dy) obj2).currentAccount, ((TLRPC.TL_attachMenuBot) obj).bot_id, null);
                break;
            case 11:
                org.telegram.ui.dy dyVar = (org.telegram.ui.dy) obj2;
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) obj;
                org.telegram.ui.ActionBar.f3 f3Var = f3VarArr[0];
                if (f3Var != null) {
                    f3Var.dismiss();
                    f3VarArr[0] = null;
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.dv(dyVar, 24), 300L);
                break;
            case 12:
                ((org.telegram.ui.cy) obj).a.postOnAnimation(new org.telegram.ui.dv((org.telegram.ui.dy) obj2, 14));
                break;
            case 13:
                org.telegram.ui.dy dyVar2 = (org.telegram.ui.dy) obj2;
                dyVar2.getMessagesController().addDialogToFolder((ArrayList) obj, (dyVar2.R2 == 0 && dyVar2.T2 == 0) ? 0 : 1, -1, null, 0L);
                break;
            case 14:
                ArrayList arrayList4 = (ArrayList) obj;
                org.telegram.ui.dy dyVar3 = ((org.telegram.ui.dw) obj2).b;
                dyVar3.u3 = 2;
                dyVar3.A4(true, true);
                dyVar3.o3();
                while (i11 < arrayList4.size()) {
                    long j10 = ((TLRPC.Dialog) arrayList4.get(i11)).id;
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList4.get(i11);
                    if (dyVar3.getMessagesController().isForum(j10) || dyVar3.getMessagesController().isMonoForumWithManageRights(j10)) {
                        dyVar3.getMessagesController().markAllTopicsAsRead(j10);
                    }
                    dyVar3.getMessagesController().markMentionsAsRead(j10, 0L);
                    MessagesController messagesController = dyVar3.getMessagesController();
                    int i14 = dialog.top_message;
                    messagesController.markDialogAsRead(j10, i14, i14, dialog.last_message_date, false, 0L, 0, true, 0);
                    i11++;
                }
                break;
            case 15:
                ((org.telegram.ui.dw) obj2).d((MessagesController.DialogFilter) obj);
                break;
            case 16:
                CharSequence charSequence = (CharSequence) obj;
                org.telegram.ui.dy dyVar4 = ((org.telegram.ui.pw) obj2).a;
                dyVar4.D2 = null;
                wp0 wp0Var = dyVar4.C2;
                if (wp0Var != null && wp0Var.h) {
                    wp0Var.e(charSequence, false);
                    break;
                }
                break;
            case 17:
                org.telegram.ui.ActionBar.o2[] o2VarArr = (org.telegram.ui.ActionBar.o2[]) obj;
                ((org.telegram.ui.dx) obj2).b.removeSelfFromStack();
                if (o2VarArr[1] != null) {
                    o2VarArr[0].removeSelfFromStack();
                    o2VarArr[1].finishFragment();
                    break;
                } else {
                    o2VarArr[0].finishFragment();
                    break;
                }
            case 18:
                org.telegram.ui.py pyVar = (org.telegram.ui.py) obj2;
                org.telegram.ui.qn qnVar = pyVar.a;
                cx0 cx0Var = new cx0(qnVar.getParentActivity(), pyVar.a, ((MessageObject) obj).getInputStickerSet(), null, qnVar.U, qnVar.getResourceProvider());
                cx0Var.setCalcMandatoryInsets(qnVar.x9());
                qnVar.showDialog(cx0Var);
                break;
            case 19:
                org.telegram.ui.jz jzVar = (org.telegram.ui.jz) obj2;
                jzVar.getClass();
                ((org.telegram.ui.ActionBar.c2) obj).dismiss();
                org.telegram.ui.kz kzVar = jzVar.A;
                org.telegram.ui.lz lzVar = kzVar.c;
                Utilities.Callback callback = lzVar.x;
                if (callback != null) {
                    callback.run(lzVar.d);
                }
                kzVar.c.finishFragment();
                break;
            case 20:
                org.telegram.ui.n00 n00Var = (org.telegram.ui.n00) obj2;
                org.telegram.ui.lz lzVar2 = new org.telegram.ui.lz(n00Var.r, ((org.telegram.ui.e00) obj).m);
                lzVar2.y = new org.telegram.ui.oz(n00Var, 1);
                lzVar2.x = new org.telegram.ui.oz(n00Var, 2);
                n00Var.presentFragment(lzVar2);
                break;
            case 21:
                org.telegram.ui.n00 n00Var2 = (org.telegram.ui.n00) obj2;
                Runnable runnable = (Runnable) obj;
                n00Var2.h = false;
                n00Var2.s = false;
                n00Var2.r.flags = n00Var2.y;
                n00Var2.h0(true);
                n00Var2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 22:
                org.telegram.ui.n00 n00Var3 = (org.telegram.ui.n00) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList5 = n00Var3.H;
                n00Var3.J = false;
                if (tLObject instanceof TL_chatlists.TL_chatlists_exportedInvites) {
                    TL_chatlists.TL_chatlists_exportedInvites tL_chatlists_exportedInvites = (TL_chatlists.TL_chatlists_exportedInvites) tLObject;
                    n00Var3.getMessagesController().putChats(tL_chatlists_exportedInvites.chats, false);
                    n00Var3.getMessagesController().putUsers(tL_chatlists_exportedInvites.users, false);
                    arrayList5.clear();
                    arrayList5.addAll(tL_chatlists_exportedInvites.invites);
                    n00Var3.v0();
                }
                n00Var3.I = 0;
                break;
            case 23:
                org.telegram.ui.n00 n00Var4 = (org.telegram.ui.n00) obj2;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) obj;
                MessagesController.DialogFilter dialogFilter = n00Var4.r;
                if (c2Var != null) {
                    try {
                        c2Var.dismiss();
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                }
                n00Var4.getMessagesController().removeFilter(dialogFilter);
                n00Var4.getMessagesStorage().deleteDialogFilter(dialogFilter);
                n00Var4.finishFragment();
                break;
            case 24:
                org.telegram.ui.n00 n00Var5 = (org.telegram.ui.n00) obj2;
                n00Var5.getClass();
                n00Var5.l0(((TL_chatlists.TL_chatlists_exportedChatlistInvite) obj).invite);
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
                FiltersSetupActivity filtersSetupActivity2 = ((org.telegram.ui.l10) obj2).e;
                filtersSetupActivity2.getMessagesController().suggestedFilters.remove((TLRPC.TL_dialogFilterSuggested) obj);
                filtersSetupActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
                break;
            case 27:
                ArrayList arrayList6 = (ArrayList) obj;
                ArrayList arrayList7 = ((org.telegram.ui.o50) obj2).U1;
                for (int i15 = 0; i15 < arrayList7.size(); i15++) {
                    if (((org.telegram.ui.Components.voip.t) arrayList7.get(i15)).w != null) {
                        arrayList6.remove(((org.telegram.ui.Components.voip.t) arrayList7.get(i15)).w);
                    }
                }
                while (i11 < arrayList6.size()) {
                    ChatObject.VideoParticipant videoParticipant2 = (ChatObject.VideoParticipant) arrayList6.get(i11);
                    if (videoParticipant2.participant.self) {
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setLocalSink(null, videoParticipant2.presentation);
                        }
                    } else if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().removeRemoteSink(videoParticipant2.participant, videoParticipant2.presentation);
                    }
                    i11++;
                }
                break;
            case 28:
                org.telegram.ui.o50 o50Var = (org.telegram.ui.o50) obj2;
                o50Var.d.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShowAlert, 6, ((TLRPC.TL_error) obj).text);
                o50Var.dismiss();
                break;
            default:
                org.telegram.ui.v5 v5Var = (org.telegram.ui.v5) obj2;
                try {
                    Bitmap bitmap5 = ((org.telegram.ui.Components.voip.r2) obj).e.getBitmap(100, 100);
                    if (bitmap5 == null) {
                        break;
                    } else {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.x20(i11, v5Var, kh.o0.b(bitmap5, true)));
                        break;
                    }
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
        }
    }
}
