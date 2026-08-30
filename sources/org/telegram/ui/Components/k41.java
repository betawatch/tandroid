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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
        sl0 sl0Var;
        int i11 = this.a;
        ArrayList arrayList = null;
        int i12 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i11) {
            case 0:
                org.telegram.ui.wk wkVar = (org.telegram.ui.wk) obj2;
                ((org.telegram.ui.ActionBar.p1) obj).d(true);
                m41.a(wkVar.getContext(), wkVar.d);
                break;
            case 1:
                ((TranslateController) obj).setHideTranslateDialog(((org.telegram.ui.wk) obj2).b, false);
                break;
            case 2:
                UndoView undoView = (UndoView) obj2;
                TLObject tLObject = (TLObject) obj;
                if (!(tLObject instanceof TLRPC.PaymentReceipt)) {
                    int i13 = UndoView.b0;
                    undoView.getClass();
                    break;
                } else {
                    undoView.s.presentFragment(new org.telegram.ui.jo0((TLRPC.PaymentReceipt) tLObject));
                    break;
                }
            case 3:
                ((i51) obj2).D.onClick((org.telegram.ui.Cells.r8) obj);
                break;
            case 4:
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
            case 5:
                ((h71) obj2).f.H.onVisualizerUpdate(true, true, (float[]) obj);
                break;
            case 6:
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
            case 7:
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
            case 8:
                ((org.telegram.ui.Components.voip.k) obj2).a.setOnClickListener((View.OnClickListener) obj);
                break;
            case 9:
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) obj2;
                Bitmap bitmap4 = (Bitmap) obj;
                HashMap<String, Bitmap> hashMap2 = tVar.C.thumbs;
                ChatObject.VideoParticipant videoParticipant = tVar.w;
                boolean z4 = videoParticipant.presentation;
                TLRPC.GroupCallParticipant groupCallParticipant = videoParticipant.participant;
                hashMap2.put(z4 ? groupCallParticipant.presentationEndpoint : groupCallParticipant.videoEndpoint, bitmap4);
                break;
            case 10:
                org.telegram.ui.Components.voip.t tVar2 = (org.telegram.ui.Components.voip.t) obj;
                ((org.telegram.ui.Components.voip.k0) obj2).getClass();
                tVar2.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setListener(new org.telegram.ui.Components.voip.x(tVar2)).setDuration(150L).start();
                break;
            case 11:
                sl0 sl0Var2 = (sl0) obj2;
                if (sl0Var2 != null) {
                    sl0Var2.setOnItemClickListener((il0) obj);
                    break;
                }
                break;
            case 12:
                org.telegram.ui.wt wtVar = (org.telegram.ui.wt) obj2;
                String lowerCase = ((String) obj).trim().toLowerCase();
                int i17 = 13;
                if (lowerCase.length() != 0) {
                    String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = wtVar.f;
                    int size = arrayList6.size();
                    while (i12 < size) {
                        Object obj3 = arrayList6.get(i12);
                        i12++;
                        org.telegram.ui.st stVar = (org.telegram.ui.st) obj3;
                        String str = stVar.a;
                        if (str == null) {
                            str = "";
                        }
                        String lowerCase2 = str.toLowerCase();
                        String lowerCase3 = AndroidUtilities.translitSafe(stVar.a).toLowerCase();
                        String str2 = stVar.b;
                        if (str2 == null) {
                            str2 = "";
                        }
                        String lowerCase4 = str2.toLowerCase();
                        String lowerCase5 = AndroidUtilities.translitSafe(stVar.b).toLowerCase();
                        String str3 = stVar.c;
                        if (str3 == null) {
                            str3 = "";
                        }
                        String concat = TextUtils.isEmpty(str3) ? "" : "+".concat(str3);
                        if (lowerCase2.startsWith(lowerCase) || lowerCase2.contains(" ".concat(lowerCase)) || lowerCase3.startsWith(translitSafe) || org.telegram.messenger.y3.w(" ", translitSafe, lowerCase3) || lowerCase4.startsWith(lowerCase) || lowerCase4.contains(" ".concat(lowerCase)) || lowerCase5.startsWith(translitSafe) || org.telegram.messenger.y3.w(" ", translitSafe, lowerCase5) || str3.startsWith(lowerCase) || concat.startsWith(lowerCase)) {
                            arrayList5.add(stVar);
                        }
                    }
                    AndroidUtilities.runOnUIThread(new k41(13, wtVar, arrayList5));
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(new k41(i17, wtVar, new ArrayList()));
                    break;
                }
                break;
            case 13:
                org.telegram.ui.wt wtVar2 = (org.telegram.ui.wt) obj2;
                ArrayList arrayList7 = (ArrayList) obj;
                org.telegram.ui.yt ytVar = wtVar2.h;
                if (ytVar.f) {
                    wtVar2.e = arrayList7;
                    if (ytVar.e && (sl0Var = ytVar.a) != null) {
                        f2.o0 adapter = sl0Var.getAdapter();
                        org.telegram.ui.wt wtVar3 = ytVar.d;
                        if (adapter != wtVar3) {
                            ytVar.a.setAdapter(wtVar3);
                            ytVar.a.setFastScrollVisible(false);
                        }
                    }
                    wtVar2.l();
                    break;
                }
                break;
            case 14:
                MessagesController.getInstance(((org.telegram.ui.au) obj2).currentAccount).processUpdates((TLRPC.Updates) obj, false);
                break;
            case 15:
                org.telegram.ui.oy.d0((org.telegram.ui.oy) obj2, (String) obj);
                break;
            case 16:
                rh.q2.j(((org.telegram.ui.oy) obj2).currentAccount, ((TLRPC.TL_attachMenuBot) obj).bot_id, null);
                break;
            case 17:
                org.telegram.ui.oy oyVar = (org.telegram.ui.oy) obj2;
                org.telegram.ui.ActionBar.g3[] g3VarArr = (org.telegram.ui.ActionBar.g3[]) obj;
                org.telegram.ui.ActionBar.g3 g3Var = g3VarArr[0];
                if (g3Var != null) {
                    g3Var.dismiss();
                    g3VarArr[0] = null;
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.mv(oyVar, 24), 300L);
                break;
            case 18:
                ((org.telegram.ui.ny) obj).a.postOnAnimation(new org.telegram.ui.mv((org.telegram.ui.oy) obj2, 14));
                break;
            case 19:
                org.telegram.ui.oy oyVar2 = (org.telegram.ui.oy) obj2;
                oyVar2.getMessagesController().addDialogToFolder((ArrayList) obj, (oyVar2.S2 == 0 && oyVar2.U2 == 0) ? 0 : 1, -1, null, 0L);
                break;
            case 20:
                ArrayList arrayList8 = (ArrayList) obj;
                org.telegram.ui.oy oyVar3 = ((org.telegram.ui.ow) obj2).b;
                oyVar3.v3 = 2;
                oyVar3.A4(true, true);
                oyVar3.o3();
                while (i12 < arrayList8.size()) {
                    long j10 = ((TLRPC.Dialog) arrayList8.get(i12)).id;
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList8.get(i12);
                    if (oyVar3.getMessagesController().isForum(j10) || oyVar3.getMessagesController().isMonoForumWithManageRights(j10)) {
                        oyVar3.getMessagesController().markAllTopicsAsRead(j10);
                    }
                    oyVar3.getMessagesController().markMentionsAsRead(j10, 0L);
                    MessagesController messagesController = oyVar3.getMessagesController();
                    int i18 = dialog.top_message;
                    messagesController.markDialogAsRead(j10, i18, i18, dialog.last_message_date, false, 0L, 0, true, 0);
                    i12++;
                }
                break;
            case 21:
                ((org.telegram.ui.ow) obj2).d((MessagesController.DialogFilter) obj);
                break;
            case 22:
                CharSequence charSequence = (CharSequence) obj;
                org.telegram.ui.oy oyVar4 = ((org.telegram.ui.ax) obj2).a;
                oyVar4.E2 = null;
                qq0 qq0Var = oyVar4.D2;
                if (qq0Var != null && qq0Var.h) {
                    qq0Var.e(charSequence, false);
                    break;
                }
                break;
            case 23:
                org.telegram.ui.ActionBar.p2[] p2VarArr = (org.telegram.ui.ActionBar.p2[]) obj;
                ((org.telegram.ui.ox) obj2).b.removeSelfFromStack();
                if (p2VarArr[1] == null) {
                    p2VarArr[0].finishFragment();
                    break;
                } else {
                    p2VarArr[0].removeSelfFromStack();
                    p2VarArr[1].finishFragment();
                    break;
                }
            case 24:
                org.telegram.ui.bz bzVar = (org.telegram.ui.bz) obj2;
                org.telegram.ui.xn xnVar = bzVar.a;
                xx0 xx0Var = new xx0(xnVar.getParentActivity(), bzVar.a, ((MessageObject) obj).getInputStickerSet(), null, xnVar.V, xnVar.getResourceProvider());
                xx0Var.setCalcMandatoryInsets(xnVar.x9());
                xnVar.showDialog(xx0Var);
                break;
            case 25:
                org.telegram.ui.wz wzVar = (org.telegram.ui.wz) obj2;
                wzVar.getClass();
                ((org.telegram.ui.ActionBar.d2) obj).dismiss();
                org.telegram.ui.xz xzVar = wzVar.B;
                org.telegram.ui.yz yzVar = xzVar.c;
                Utilities.Callback callback = yzVar.x;
                if (callback != null) {
                    callback.run(yzVar.d);
                }
                xzVar.c.finishFragment();
                break;
            case 26:
                org.telegram.ui.b10 b10Var = (org.telegram.ui.b10) obj2;
                org.telegram.ui.yz yzVar2 = new org.telegram.ui.yz(b10Var.r, ((org.telegram.ui.s00) obj).m);
                yzVar2.y = new org.telegram.ui.b00(b10Var, 1);
                yzVar2.x = new org.telegram.ui.b00(b10Var, 2);
                b10Var.presentFragment(yzVar2);
                break;
            case 27:
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
            case 28:
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
            default:
                org.telegram.ui.b10 b10Var4 = (org.telegram.ui.b10) obj2;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj;
                MessagesController.DialogFilter dialogFilter = b10Var4.r;
                if (d2Var != null) {
                    try {
                        d2Var.dismiss();
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                b10Var4.getMessagesController().removeFilter(dialogFilter);
                b10Var4.getMessagesStorage().deleteDialogFilter(dialogFilter);
                b10Var4.finishFragment();
                break;
        }
    }
}
