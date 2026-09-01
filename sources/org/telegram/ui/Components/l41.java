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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l41 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l41(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        tl0 tl0Var;
        int i11 = this.a;
        ArrayList arrayList = null;
        int i12 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i11) {
            case 0:
                ((TranslateController) obj).setHideTranslateDialog(((org.telegram.ui.wk) obj2).b, false);
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
                ((j51) obj2).D.onClick((org.telegram.ui.Cells.r8) obj);
                break;
            case 3:
                k71 k71Var = (k71) obj2;
                j3.t1 t1Var = (j3.t1) obj;
                Throwable cause = t1Var.getCause();
                if (!(cause instanceof d4.l) || (!cause.toString().contains("av1") && !cause.toString().contains("av01"))) {
                    TextureView textureView = k71Var.n;
                    if (textureView != null && ((!k71Var.B && (cause instanceof d4.p)) || (cause instanceof i5.m))) {
                        k71Var.B = true;
                        if (k71Var.d != null) {
                            ViewGroup viewGroup = (ViewGroup) textureView.getParent();
                            if (viewGroup != null) {
                                int indexOfChild = viewGroup.indexOfChild(k71Var.n);
                                viewGroup.removeView(k71Var.n);
                                viewGroup.addView(k71Var.n, indexOfChild);
                            }
                            DispatchQueue dispatchQueue = k71Var.b;
                            if (dispatchQueue == null) {
                                j3.f0 f0Var = k71Var.d;
                                TextureView textureView2 = k71Var.n;
                                f0Var.j0();
                                if (textureView2 != null && textureView2 == f0Var.T) {
                                    f0Var.j0();
                                    f0Var.U();
                                    f0Var.Z(null);
                                    f0Var.T(0, 0);
                                }
                                k71Var.d.c0(k71Var.n);
                                ArrayList arrayList2 = k71Var.K;
                                if (arrayList2 != null) {
                                    k71Var.F(arrayList2, k71Var.L);
                                } else if (k71Var.R) {
                                    k71Var.G(k71Var.N, k71Var.P, k71Var.O, k71Var.Q);
                                } else {
                                    k71Var.D(k71Var.N, k71Var.P);
                                }
                                k71Var.C();
                                break;
                            } else {
                                dispatchQueue.postRunnable(new b71(k71Var, i12));
                                break;
                            }
                        }
                    } else {
                        k71Var.G.onError(k71Var, t1Var);
                        break;
                    }
                } else {
                    FileLog.e(t1Var);
                    FileLog.e("av1 codec failed, we think this codec is not supported");
                    MessagesController.getGlobalMainSettings().edit().putBoolean("unsupport_video/av01", true).commit();
                    HashMap hashMap = k71.i0;
                    if (hashMap != null) {
                        hashMap.clear();
                    }
                    ArrayList arrayList3 = k71Var.K;
                    if (arrayList3 != null) {
                        int i14 = 0;
                        while (i14 < arrayList3.size()) {
                            g71 g71Var = (g71) arrayList3.get(i14);
                            int i15 = 0;
                            while (true) {
                                ArrayList arrayList4 = g71Var.d;
                                if (i15 < arrayList4.size()) {
                                    i71 i71Var = (i71) arrayList4.get(i15);
                                    if (!TextUtils.isEmpty(i71Var.m) && !k71.Y(i71Var.m)) {
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
                    k71Var.K = arrayList;
                    if (arrayList != null) {
                        k71Var.F(arrayList, k71Var.L);
                        break;
                    }
                }
                break;
            case 4:
                ((j71) obj2).f.H.onVisualizerUpdate(true, true, (float[]) obj);
                break;
            case 5:
                r71 r71Var = (r71) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (bitmap != null) {
                    if (r71Var.w != null) {
                        Bitmap bitmap2 = r71Var.v;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        r71Var.v = r71Var.w;
                    }
                    r71Var.w = bitmap;
                    Bitmap bitmap3 = r71Var.w;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                    r71Var.D = bitmapShader;
                    bitmapShader.setLocalMatrix(r71Var.I);
                    r71Var.G.setShader(r71Var.D);
                    r71Var.invalidate();
                    int dp = AndroidUtilities.dp(150.0f);
                    float width = bitmap.getWidth() / bitmap.getHeight();
                    if (width > 1.0f) {
                        i10 = (int) (dp / width);
                    } else {
                        int i16 = (int) (dp * width);
                        i10 = dp;
                        dp = i16;
                    }
                    ViewGroup.LayoutParams layoutParams = r71Var.getLayoutParams();
                    if (r71Var.getVisibility() != 0 || layoutParams.width != dp || layoutParams.height != i10) {
                        layoutParams.width = dp;
                        layoutParams.height = i10;
                        r71Var.setVisibility(0);
                        r71Var.requestLayout();
                    }
                }
                r71Var.f = null;
                break;
            case 6:
                final e91 e91Var = (e91) obj2;
                e91Var.e.b.evaluateJavascript((String) obj, new ValueCallback() { // from class: org.telegram.ui.Components.d91
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(Object obj3) {
                        String str = (String) obj3;
                        e91 e91Var2 = e91.this;
                        String[] strArr = e91Var2.c;
                        strArr[0] = strArr[0].replace(e91Var2.d, "/signature/" + str.substring(1, str.length() - 1));
                        e91Var2.b.countDown();
                    }
                });
                break;
            case 7:
                ((org.telegram.ui.Components.voip.k) obj2).a.setOnClickListener((View.OnClickListener) obj);
                break;
            case 8:
                org.telegram.ui.Components.voip.u uVar = (org.telegram.ui.Components.voip.u) obj2;
                Bitmap bitmap4 = (Bitmap) obj;
                HashMap<String, Bitmap> hashMap2 = uVar.C.thumbs;
                ChatObject.VideoParticipant videoParticipant = uVar.w;
                boolean z4 = videoParticipant.presentation;
                TLRPC.GroupCallParticipant groupCallParticipant = videoParticipant.participant;
                hashMap2.put(z4 ? groupCallParticipant.presentationEndpoint : groupCallParticipant.videoEndpoint, bitmap4);
                break;
            case 9:
                org.telegram.ui.Components.voip.u uVar2 = (org.telegram.ui.Components.voip.u) obj;
                ((org.telegram.ui.Components.voip.l0) obj2).getClass();
                uVar2.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setListener(new org.telegram.ui.Components.voip.y(uVar2)).setDuration(150L).start();
                break;
            case 10:
                tl0 tl0Var2 = (tl0) obj2;
                if (tl0Var2 != null) {
                    tl0Var2.setOnItemClickListener((jl0) obj);
                    break;
                }
                break;
            case 11:
                org.telegram.ui.xt xtVar = (org.telegram.ui.xt) obj2;
                String lowerCase = ((String) obj).trim().toLowerCase();
                int i17 = 12;
                if (lowerCase.length() != 0) {
                    String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = xtVar.f;
                    int size = arrayList6.size();
                    while (i12 < size) {
                        Object obj3 = arrayList6.get(i12);
                        i12++;
                        org.telegram.ui.tt ttVar = (org.telegram.ui.tt) obj3;
                        String str = ttVar.a;
                        if (str == null) {
                            str = "";
                        }
                        String lowerCase2 = str.toLowerCase();
                        String lowerCase3 = AndroidUtilities.translitSafe(ttVar.a).toLowerCase();
                        String str2 = ttVar.b;
                        if (str2 == null) {
                            str2 = "";
                        }
                        String lowerCase4 = str2.toLowerCase();
                        String lowerCase5 = AndroidUtilities.translitSafe(ttVar.b).toLowerCase();
                        String str3 = ttVar.c;
                        if (str3 == null) {
                            str3 = "";
                        }
                        String concat = TextUtils.isEmpty(str3) ? "" : "+".concat(str3);
                        if (lowerCase2.startsWith(lowerCase) || lowerCase2.contains(" ".concat(lowerCase)) || lowerCase3.startsWith(translitSafe) || org.telegram.messenger.y3.w(" ", translitSafe, lowerCase3) || lowerCase4.startsWith(lowerCase) || lowerCase4.contains(" ".concat(lowerCase)) || lowerCase5.startsWith(translitSafe) || org.telegram.messenger.y3.w(" ", translitSafe, lowerCase5) || str3.startsWith(lowerCase) || concat.startsWith(lowerCase)) {
                            arrayList5.add(ttVar);
                        }
                    }
                    AndroidUtilities.runOnUIThread(new l41(12, xtVar, arrayList5));
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(new l41(i17, xtVar, new ArrayList()));
                    break;
                }
                break;
            case 12:
                org.telegram.ui.xt xtVar2 = (org.telegram.ui.xt) obj2;
                ArrayList arrayList7 = (ArrayList) obj;
                org.telegram.ui.zt ztVar = xtVar2.h;
                if (ztVar.f) {
                    xtVar2.e = arrayList7;
                    if (ztVar.e && (tl0Var = ztVar.a) != null) {
                        f2.p0 adapter = tl0Var.getAdapter();
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
            case 13:
                MessagesController.getInstance(((org.telegram.ui.bu) obj2).currentAccount).processUpdates((TLRPC.Updates) obj, false);
                break;
            case 14:
                org.telegram.ui.py.d0((org.telegram.ui.py) obj2, (String) obj);
                break;
            case 15:
                sh.p2.j(((org.telegram.ui.py) obj2).currentAccount, ((TLRPC.TL_attachMenuBot) obj).bot_id, null);
                break;
            case 16:
                org.telegram.ui.py pyVar = (org.telegram.ui.py) obj2;
                org.telegram.ui.ActionBar.h3[] h3VarArr = (org.telegram.ui.ActionBar.h3[]) obj;
                org.telegram.ui.ActionBar.h3 h3Var = h3VarArr[0];
                if (h3Var != null) {
                    h3Var.dismiss();
                    h3VarArr[0] = null;
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.nv(pyVar, 24), 300L);
                break;
            case 17:
                ((org.telegram.ui.oy) obj).a.postOnAnimation(new org.telegram.ui.nv((org.telegram.ui.py) obj2, 14));
                break;
            case 18:
                org.telegram.ui.py pyVar2 = (org.telegram.ui.py) obj2;
                pyVar2.getMessagesController().addDialogToFolder((ArrayList) obj, (pyVar2.S2 == 0 && pyVar2.U2 == 0) ? 0 : 1, -1, null, 0L);
                break;
            case 19:
                ArrayList arrayList8 = (ArrayList) obj;
                org.telegram.ui.py pyVar3 = ((org.telegram.ui.pw) obj2).b;
                pyVar3.v3 = 2;
                pyVar3.A4(true, true);
                pyVar3.o3();
                while (i12 < arrayList8.size()) {
                    long j10 = ((TLRPC.Dialog) arrayList8.get(i12)).id;
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList8.get(i12);
                    if (pyVar3.getMessagesController().isForum(j10) || pyVar3.getMessagesController().isMonoForumWithManageRights(j10)) {
                        pyVar3.getMessagesController().markAllTopicsAsRead(j10);
                    }
                    pyVar3.getMessagesController().markMentionsAsRead(j10, 0L);
                    MessagesController messagesController = pyVar3.getMessagesController();
                    int i18 = dialog.top_message;
                    messagesController.markDialogAsRead(j10, i18, i18, dialog.last_message_date, false, 0L, 0, true, 0);
                    i12++;
                }
                break;
            case 20:
                ((org.telegram.ui.pw) obj2).d((MessagesController.DialogFilter) obj);
                break;
            case 21:
                CharSequence charSequence = (CharSequence) obj;
                org.telegram.ui.py pyVar4 = ((org.telegram.ui.bx) obj2).a;
                pyVar4.E2 = null;
                rq0 rq0Var = pyVar4.D2;
                if (rq0Var != null && rq0Var.h) {
                    rq0Var.e(charSequence, false);
                    break;
                }
                break;
            case 22:
                org.telegram.ui.ActionBar.p2[] p2VarArr = (org.telegram.ui.ActionBar.p2[]) obj;
                ((org.telegram.ui.px) obj2).b.removeSelfFromStack();
                if (p2VarArr[1] == null) {
                    p2VarArr[0].finishFragment();
                    break;
                } else {
                    p2VarArr[0].removeSelfFromStack();
                    p2VarArr[1].finishFragment();
                    break;
                }
            case 23:
                org.telegram.ui.cz czVar = (org.telegram.ui.cz) obj2;
                org.telegram.ui.xn xnVar = czVar.a;
                yx0 yx0Var = new yx0(xnVar.getParentActivity(), czVar.a, ((MessageObject) obj).getInputStickerSet(), null, xnVar.V, xnVar.getResourceProvider());
                yx0Var.setCalcMandatoryInsets(xnVar.x9());
                xnVar.showDialog(yx0Var);
                break;
            case 24:
                org.telegram.ui.xz xzVar = (org.telegram.ui.xz) obj2;
                xzVar.getClass();
                ((org.telegram.ui.ActionBar.d2) obj).dismiss();
                org.telegram.ui.yz yzVar = xzVar.B;
                org.telegram.ui.zz zzVar = yzVar.c;
                Utilities.Callback callback = zzVar.x;
                if (callback != null) {
                    callback.run(zzVar.d);
                }
                yzVar.c.finishFragment();
                break;
            case 25:
                org.telegram.ui.b10 b10Var = (org.telegram.ui.b10) obj2;
                org.telegram.ui.zz zzVar2 = new org.telegram.ui.zz(b10Var.r, ((org.telegram.ui.s00) obj).m);
                zzVar2.y = new org.telegram.ui.c00(b10Var, 1);
                zzVar2.x = new org.telegram.ui.c00(b10Var, 2);
                b10Var.presentFragment(zzVar2);
                break;
            case 26:
                org.telegram.ui.b10 b10Var2 = (org.telegram.ui.b10) obj2;
                Runnable runnable = (Runnable) obj;
                b10Var2.h = false;
                b10Var2.s = false;
                b10Var2.r.flags = b10Var2.y;
                b10Var2.i0(true);
                b10Var2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 27:
                org.telegram.ui.b10 b10Var3 = (org.telegram.ui.b10) obj2;
                TLObject tLObject2 = (TLObject) obj;
                ArrayList arrayList9 = b10Var3.I;
                b10Var3.K = false;
                if (tLObject2 instanceof TL_chatlists.TL_chatlists_exportedInvites) {
                    TL_chatlists.TL_chatlists_exportedInvites tL_chatlists_exportedInvites = (TL_chatlists.TL_chatlists_exportedInvites) tLObject2;
                    b10Var3.getMessagesController().putChats(tL_chatlists_exportedInvites.chats, false);
                    b10Var3.getMessagesController().putUsers(tL_chatlists_exportedInvites.users, false);
                    arrayList9.clear();
                    arrayList9.addAll(tL_chatlists_exportedInvites.invites);
                    b10Var3.w0();
                }
                b10Var3.J = 0;
                break;
            case 28:
                org.telegram.ui.b10 b10Var4 = (org.telegram.ui.b10) obj2;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj;
                MessagesController.DialogFilter dialogFilter = b10Var4.r;
                if (d2Var != null) {
                    try {
                        d2Var.dismiss();
                    } catch (Exception e6) {
                        FileLog.e(e6);
                    }
                }
                b10Var4.getMessagesController().removeFilter(dialogFilter);
                b10Var4.getMessagesStorage().deleteDialogFilter(dialogFilter);
                b10Var4.finishFragment();
                break;
            default:
                org.telegram.ui.b10 b10Var5 = (org.telegram.ui.b10) obj2;
                b10Var5.getClass();
                b10Var5.m0(((TL_chatlists.TL_chatlists_exportedChatlistInvite) obj).invite);
                break;
        }
    }
}
