package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k41 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k41(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        rl0 rl0Var;
        int i11 = this.a;
        ArrayList arrayList = null;
        int i12 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i11) {
            case 0:
                ((TranslateController) obj).setHideTranslateDialog(((org.telegram.ui.yk) obj2).b, false);
                break;
            case 1:
                UndoView undoView = (UndoView) obj2;
                TLObject tLObject = (TLObject) obj;
                if (!(tLObject instanceof TLRPC.PaymentReceipt)) {
                    int i13 = UndoView.b0;
                    undoView.getClass();
                    break;
                } else {
                    undoView.s.presentFragment(new org.telegram.ui.lo0((TLRPC.PaymentReceipt) tLObject));
                    break;
                }
            case 2:
                ((i51) obj2).D.onClick((org.telegram.ui.Cells.q8) obj);
                break;
            case 3:
                i71 i71Var = (i71) obj2;
                j3.t1 t1Var = (j3.t1) obj;
                Throwable cause = t1Var.getCause();
                if (!(cause instanceof d4.l) || (!cause.toString().contains("av1") && !cause.toString().contains("av01"))) {
                    TextureView textureView = i71Var.n;
                    if (textureView != null && ((!i71Var.B && (cause instanceof d4.p)) || (cause instanceof i5.m))) {
                        i71Var.B = true;
                        if (i71Var.d != null) {
                            ViewGroup viewGroup = (ViewGroup) textureView.getParent();
                            if (viewGroup != null) {
                                int indexOfChild = viewGroup.indexOfChild(i71Var.n);
                                viewGroup.removeView(i71Var.n);
                                viewGroup.addView(i71Var.n, indexOfChild);
                            }
                            DispatchQueue dispatchQueue = i71Var.b;
                            if (dispatchQueue == null) {
                                j3.f0 f0Var = i71Var.d;
                                TextureView textureView2 = i71Var.n;
                                f0Var.j0();
                                if (textureView2 != null && textureView2 == f0Var.T) {
                                    f0Var.j0();
                                    f0Var.U();
                                    f0Var.Z(null);
                                    f0Var.T(0, 0);
                                }
                                i71Var.d.c0(i71Var.n);
                                ArrayList arrayList2 = i71Var.K;
                                if (arrayList2 != null) {
                                    i71Var.F(arrayList2, i71Var.L);
                                } else if (i71Var.R) {
                                    i71Var.G(i71Var.N, i71Var.P, i71Var.O, i71Var.Q);
                                } else {
                                    i71Var.D(i71Var.N, i71Var.P);
                                }
                                i71Var.C();
                                break;
                            } else {
                                dispatchQueue.postRunnable(new z61(i71Var, i12));
                                break;
                            }
                        }
                    } else {
                        i71Var.G.onError(i71Var, t1Var);
                        break;
                    }
                } else {
                    FileLog.e(t1Var);
                    FileLog.e("av1 codec failed, we think this codec is not supported");
                    MessagesController.getGlobalMainSettings().edit().putBoolean("unsupport_video/av01", true).commit();
                    HashMap hashMap = i71.i0;
                    if (hashMap != null) {
                        hashMap.clear();
                    }
                    ArrayList arrayList3 = i71Var.K;
                    if (arrayList3 != null) {
                        int i14 = 0;
                        while (i14 < arrayList3.size()) {
                            e71 e71Var = (e71) arrayList3.get(i14);
                            int i15 = 0;
                            while (true) {
                                ArrayList arrayList4 = e71Var.d;
                                if (i15 < arrayList4.size()) {
                                    g71 g71Var = (g71) arrayList4.get(i15);
                                    if (!TextUtils.isEmpty(g71Var.m) && !i71.Y(g71Var.m)) {
                                        arrayList4.remove(i15);
                                        i15--;
                                    }
                                    i15++;
                                } else {
                                    if (arrayList4.isEmpty()) {
                                        arrayList3.remove(i14);
                                        i14--;
                                    }
                                    i14++;
                                }
                            }
                        }
                        arrayList = arrayList3;
                    }
                    i71Var.K = arrayList;
                    if (arrayList != null) {
                        i71Var.F(arrayList, i71Var.L);
                        break;
                    }
                }
                break;
            case 4:
                ((h71) obj2).f.H.onVisualizerUpdate(true, true, (float[]) obj);
                break;
            case 5:
                p71 p71Var = (p71) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (bitmap != null) {
                    if (p71Var.w != null) {
                        Bitmap bitmap2 = p71Var.v;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        p71Var.v = p71Var.w;
                    }
                    p71Var.w = bitmap;
                    Bitmap bitmap3 = p71Var.w;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                    p71Var.D = bitmapShader;
                    bitmapShader.setLocalMatrix(p71Var.I);
                    p71Var.G.setShader(p71Var.D);
                    p71Var.invalidate();
                    int dp = AndroidUtilities.dp(150.0f);
                    float width = bitmap.getWidth() / bitmap.getHeight();
                    if (width > 1.0f) {
                        i10 = (int) (dp / width);
                    } else {
                        int i16 = (int) (dp * width);
                        i10 = dp;
                        dp = i16;
                    }
                    ViewGroup.LayoutParams layoutParams = p71Var.getLayoutParams();
                    if (p71Var.getVisibility() != 0 || layoutParams.width != dp || layoutParams.height != i10) {
                        layoutParams.width = dp;
                        layoutParams.height = i10;
                        p71Var.setVisibility(0);
                        p71Var.requestLayout();
                    }
                }
                p71Var.f = null;
                break;
            case 6:
                final d91 d91Var = (d91) obj2;
                d91Var.e.b.evaluateJavascript((String) obj, new ValueCallback() { // from class: org.telegram.ui.Components.c91
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(Object obj3) {
                        String str = (String) obj3;
                        d91 d91Var2 = d91.this;
                        String[] strArr = d91Var2.c;
                        strArr[0] = strArr[0].replace(d91Var2.d, "/signature/" + str.substring(1, str.length() - 1));
                        d91Var2.b.countDown();
                    }
                });
                break;
            case 7:
                ((org.telegram.ui.Components.voip.k) obj2).a.setOnClickListener((View.OnClickListener) obj);
                break;
            case 8:
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) obj2;
                Bitmap bitmap4 = (Bitmap) obj;
                HashMap<String, Bitmap> hashMap2 = tVar.C.thumbs;
                ChatObject.VideoParticipant videoParticipant = tVar.w;
                boolean z4 = videoParticipant.presentation;
                TLRPC.GroupCallParticipant groupCallParticipant = videoParticipant.participant;
                hashMap2.put(z4 ? groupCallParticipant.presentationEndpoint : groupCallParticipant.videoEndpoint, bitmap4);
                break;
            case 9:
                org.telegram.ui.Components.voip.t tVar2 = (org.telegram.ui.Components.voip.t) obj;
                ((org.telegram.ui.Components.voip.k0) obj2).getClass();
                tVar2.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setListener(new org.telegram.ui.Components.voip.x(tVar2)).setDuration(150L).start();
                break;
            case 10:
                rl0 rl0Var2 = (rl0) obj2;
                if (rl0Var2 != null) {
                    rl0Var2.setOnItemClickListener((hl0) obj);
                    break;
                }
                break;
            case 11:
                org.telegram.ui.yt ytVar = (org.telegram.ui.yt) obj2;
                String lowerCase = ((String) obj).trim().toLowerCase();
                int i17 = 12;
                if (lowerCase.length() != 0) {
                    String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = ytVar.f;
                    int size = arrayList6.size();
                    while (i12 < size) {
                        Object obj3 = arrayList6.get(i12);
                        i12++;
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
                        if (lowerCase2.startsWith(lowerCase) || lowerCase2.contains(" ".concat(lowerCase)) || lowerCase3.startsWith(translitSafe) || org.telegram.messenger.y3.w(" ", translitSafe, lowerCase3) || lowerCase4.startsWith(lowerCase) || lowerCase4.contains(" ".concat(lowerCase)) || lowerCase5.startsWith(translitSafe) || org.telegram.messenger.y3.w(" ", translitSafe, lowerCase5) || str3.startsWith(lowerCase) || concat.startsWith(lowerCase)) {
                            arrayList5.add(utVar);
                        }
                    }
                    AndroidUtilities.runOnUIThread(new k41(12, ytVar, arrayList5));
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(new k41(i17, ytVar, new ArrayList()));
                    break;
                }
                break;
            case 12:
                org.telegram.ui.yt ytVar2 = (org.telegram.ui.yt) obj2;
                ArrayList arrayList7 = (ArrayList) obj;
                org.telegram.ui.au auVar = ytVar2.h;
                if (auVar.f) {
                    ytVar2.e = arrayList7;
                    if (auVar.e && (rl0Var = auVar.a) != null) {
                        f2.o0 adapter = rl0Var.getAdapter();
                        org.telegram.ui.yt ytVar3 = auVar.d;
                        if (adapter != ytVar3) {
                            auVar.a.setAdapter(ytVar3);
                            auVar.a.setFastScrollVisible(false);
                        }
                    }
                    ytVar2.l();
                    break;
                }
                break;
            case 13:
                MessagesController.getInstance(((org.telegram.ui.cu) obj2).currentAccount).processUpdates((TLRPC.Updates) obj, false);
                break;
            case 14:
                org.telegram.ui.qy.d0((org.telegram.ui.qy) obj2, (String) obj);
                break;
            case 15:
                rh.p2.j(((org.telegram.ui.qy) obj2).currentAccount, ((TLRPC.TL_attachMenuBot) obj).bot_id, null);
                break;
            case 16:
                org.telegram.ui.qy qyVar = (org.telegram.ui.qy) obj2;
                org.telegram.ui.ActionBar.g3[] g3VarArr = (org.telegram.ui.ActionBar.g3[]) obj;
                org.telegram.ui.ActionBar.g3 g3Var = g3VarArr[0];
                if (g3Var != null) {
                    g3Var.dismiss();
                    g3VarArr[0] = null;
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ov(qyVar, 24), 300L);
                break;
            case 17:
                ((org.telegram.ui.py) obj).a.postOnAnimation(new org.telegram.ui.ov((org.telegram.ui.qy) obj2, 14));
                break;
            case 18:
                org.telegram.ui.qy qyVar2 = (org.telegram.ui.qy) obj2;
                qyVar2.getMessagesController().addDialogToFolder((ArrayList) obj, (qyVar2.S2 == 0 && qyVar2.U2 == 0) ? 0 : 1, -1, null, 0L);
                break;
            case 19:
                ArrayList arrayList8 = (ArrayList) obj;
                org.telegram.ui.qy qyVar3 = ((org.telegram.ui.qw) obj2).b;
                qyVar3.v3 = 2;
                qyVar3.A4(true, true);
                qyVar3.o3();
                while (i12 < arrayList8.size()) {
                    long j10 = ((TLRPC.Dialog) arrayList8.get(i12)).id;
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList8.get(i12);
                    if (qyVar3.getMessagesController().isForum(j10) || qyVar3.getMessagesController().isMonoForumWithManageRights(j10)) {
                        qyVar3.getMessagesController().markAllTopicsAsRead(j10);
                    }
                    qyVar3.getMessagesController().markMentionsAsRead(j10, 0L);
                    MessagesController messagesController = qyVar3.getMessagesController();
                    int i18 = dialog.top_message;
                    messagesController.markDialogAsRead(j10, i18, i18, dialog.last_message_date, false, 0L, 0, true, 0);
                    i12++;
                }
                break;
            case 20:
                ((org.telegram.ui.qw) obj2).d((MessagesController.DialogFilter) obj);
                break;
            case 21:
                CharSequence charSequence = (CharSequence) obj;
                org.telegram.ui.qy qyVar4 = ((org.telegram.ui.cx) obj2).a;
                qyVar4.E2 = null;
                qq0 qq0Var = qyVar4.D2;
                if (qq0Var != null && qq0Var.h) {
                    qq0Var.e(charSequence, false);
                    break;
                }
                break;
            case 22:
                org.telegram.ui.ActionBar.p2[] p2VarArr = (org.telegram.ui.ActionBar.p2[]) obj;
                ((org.telegram.ui.qx) obj2).b.removeSelfFromStack();
                if (p2VarArr[1] == null) {
                    p2VarArr[0].finishFragment();
                    break;
                } else {
                    p2VarArr[0].removeSelfFromStack();
                    p2VarArr[1].finishFragment();
                    break;
                }
            case 23:
                org.telegram.ui.dz dzVar = (org.telegram.ui.dz) obj2;
                org.telegram.ui.zn znVar = dzVar.a;
                xx0 xx0Var = new xx0(znVar.getParentActivity(), dzVar.a, ((MessageObject) obj).getInputStickerSet(), null, znVar.V, znVar.getResourceProvider());
                xx0Var.setCalcMandatoryInsets(znVar.x9());
                znVar.showDialog(xx0Var);
                break;
            case 24:
                org.telegram.ui.yz yzVar = (org.telegram.ui.yz) obj2;
                yzVar.getClass();
                ((org.telegram.ui.ActionBar.d2) obj).dismiss();
                org.telegram.ui.zz zzVar = yzVar.B;
                org.telegram.ui.a00 a00Var = zzVar.c;
                Utilities.Callback callback = a00Var.x;
                if (callback != null) {
                    callback.run(a00Var.d);
                }
                zzVar.c.finishFragment();
                break;
            case 25:
                org.telegram.ui.c10 c10Var = (org.telegram.ui.c10) obj2;
                org.telegram.ui.a00 a00Var2 = new org.telegram.ui.a00(c10Var.r, ((org.telegram.ui.t00) obj).m);
                a00Var2.y = new org.telegram.ui.d00(c10Var, 1);
                a00Var2.x = new org.telegram.ui.d00(c10Var, 2);
                c10Var.presentFragment(a00Var2);
                break;
            case 26:
                org.telegram.ui.c10 c10Var2 = (org.telegram.ui.c10) obj2;
                Runnable runnable = (Runnable) obj;
                c10Var2.h = false;
                c10Var2.s = false;
                c10Var2.r.flags = c10Var2.y;
                c10Var2.i0(true);
                c10Var2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 27:
                org.telegram.ui.c10 c10Var3 = (org.telegram.ui.c10) obj2;
                TLObject tLObject2 = (TLObject) obj;
                ArrayList arrayList9 = c10Var3.I;
                c10Var3.K = false;
                if (tLObject2 instanceof TL_chatlists.TL_chatlists_exportedInvites) {
                    TL_chatlists.TL_chatlists_exportedInvites tL_chatlists_exportedInvites = (TL_chatlists.TL_chatlists_exportedInvites) tLObject2;
                    c10Var3.getMessagesController().putChats(tL_chatlists_exportedInvites.chats, false);
                    c10Var3.getMessagesController().putUsers(tL_chatlists_exportedInvites.users, false);
                    arrayList9.clear();
                    arrayList9.addAll(tL_chatlists_exportedInvites.invites);
                    c10Var3.w0();
                }
                c10Var3.J = 0;
                break;
            case 28:
                org.telegram.ui.c10 c10Var4 = (org.telegram.ui.c10) obj2;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj;
                MessagesController.DialogFilter dialogFilter = c10Var4.r;
                if (d2Var != null) {
                    try {
                        d2Var.dismiss();
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                c10Var4.getMessagesController().removeFilter(dialogFilter);
                c10Var4.getMessagesStorage().deleteDialogFilter(dialogFilter);
                c10Var4.finishFragment();
                break;
            default:
                org.telegram.ui.c10 c10Var5 = (org.telegram.ui.c10) obj2;
                c10Var5.getClass();
                c10Var5.m0(((TL_chatlists.TL_chatlists_exportedChatlistInvite) obj).invite);
                break;
        }
    }
}
