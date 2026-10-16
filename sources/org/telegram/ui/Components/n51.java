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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n51 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n51(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        mm0 mm0Var;
        int i11 = this.a;
        int i12 = 2;
        ArrayList arrayList = null;
        int i13 = 1;
        int i14 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i11) {
            case 0:
                ((TranslateController) obj).setHideTranslateDialog(((org.telegram.ui.el) obj2).b, false);
                break;
            case 1:
                UndoView undoView = (UndoView) obj2;
                TLObject tLObject = (TLObject) obj;
                if (!(tLObject instanceof TLRPC.PaymentReceipt)) {
                    int i15 = UndoView.e0;
                    undoView.getClass();
                    break;
                } else {
                    undoView.s.presentFragment(new org.telegram.ui.ap0((TLRPC.PaymentReceipt) tLObject));
                    break;
                }
            case 2:
                ((m61) obj2).D.onClick((org.telegram.ui.Cells.v8) obj);
                break;
            case 3:
                i81 i81Var = (i81) obj2;
                b2.z0 z0Var = (b2.z0) obj;
                Throwable cause = z0Var.getCause();
                if (!(cause instanceof r2.n) || (!cause.toString().contains("av1") && !cause.toString().contains("av01"))) {
                    TextureView textureView = i81Var.n;
                    if (textureView != null && ((!i81Var.E && (cause instanceof r2.p)) || (cause instanceof a3.x))) {
                        i81Var.E = true;
                        if (i81Var.d != null) {
                            ViewGroup viewGroup = (ViewGroup) textureView.getParent();
                            if (viewGroup != null) {
                                int indexOfChild = viewGroup.indexOfChild(i81Var.n);
                                viewGroup.removeView(i81Var.n);
                                viewGroup.addView(i81Var.n, indexOfChild);
                            }
                            DispatchQueue dispatchQueue = i81Var.b;
                            if (dispatchQueue == null) {
                                i2.h0 h0Var = i81Var.d;
                                TextureView textureView2 = i81Var.n;
                                h0Var.F1();
                                if (textureView2 != null && textureView2 == h0Var.X) {
                                    h0Var.F1();
                                    h0Var.s1();
                                    h0Var.x1(null);
                                    h0Var.q1(0, 0);
                                }
                                i81Var.d.z1(i81Var.n);
                                ArrayList arrayList2 = i81Var.N;
                                if (arrayList2 != null) {
                                    i81Var.F(arrayList2, i81Var.O);
                                } else if (i81Var.U) {
                                    i81Var.G(i81Var.Q, i81Var.S, i81Var.R, i81Var.T);
                                } else {
                                    i81Var.D(i81Var.Q, i81Var.S);
                                }
                                i81Var.C();
                                break;
                            } else {
                                dispatchQueue.postRunnable(new w71(i81Var, i13));
                                break;
                            }
                        }
                    } else {
                        i81Var.J.onError(i81Var, z0Var);
                        break;
                    }
                } else {
                    FileLog.e(z0Var);
                    FileLog.e("av1 codec failed, we think this codec is not supported");
                    MessagesController.getGlobalMainSettings().edit().putBoolean("unsupport_video/av01", true).commit();
                    HashMap hashMap = i81.l0;
                    if (hashMap != null) {
                        hashMap.clear();
                    }
                    ArrayList arrayList3 = i81Var.N;
                    if (arrayList3 != null) {
                        int i16 = 0;
                        while (i16 < arrayList3.size()) {
                            e81 e81Var = (e81) arrayList3.get(i16);
                            int i17 = 0;
                            while (true) {
                                ArrayList arrayList4 = e81Var.d;
                                if (i17 < arrayList4.size()) {
                                    g81 g81Var = (g81) arrayList4.get(i17);
                                    if (!TextUtils.isEmpty(g81Var.m) && !i81.Y(g81Var.m)) {
                                        arrayList4.remove(i17);
                                        i17--;
                                    }
                                    i17++;
                                } else {
                                    if (arrayList4.isEmpty()) {
                                        arrayList3.remove(i16);
                                        i16--;
                                    }
                                    i16++;
                                }
                            }
                        }
                        arrayList = arrayList3;
                    }
                    i81Var.N = arrayList;
                    if (arrayList != null) {
                        i81Var.F(arrayList, i81Var.O);
                        break;
                    }
                }
                break;
            case 4:
                ((h81) obj2).f.K.onVisualizerUpdate(true, true, (float[]) obj);
                break;
            case 5:
                q81 q81Var = (q81) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (bitmap != null) {
                    if (q81Var.w != null) {
                        Bitmap bitmap2 = q81Var.v;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        q81Var.v = q81Var.w;
                    }
                    q81Var.w = bitmap;
                    Bitmap bitmap3 = q81Var.w;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                    q81Var.G = bitmapShader;
                    bitmapShader.setLocalMatrix(q81Var.L);
                    q81Var.J.setShader(q81Var.G);
                    q81Var.invalidate();
                    int dp = AndroidUtilities.dp(150.0f);
                    float width = bitmap.getWidth() / bitmap.getHeight();
                    if (width > 1.0f) {
                        i10 = (int) (dp / width);
                    } else {
                        int i18 = (int) (dp * width);
                        i10 = dp;
                        dp = i18;
                    }
                    ViewGroup.LayoutParams layoutParams = q81Var.getLayoutParams();
                    if (q81Var.getVisibility() != 0 || layoutParams.width != dp || layoutParams.height != i10) {
                        layoutParams.width = dp;
                        layoutParams.height = i10;
                        q81Var.setVisibility(0);
                        q81Var.requestLayout();
                    }
                }
                q81Var.f = null;
                break;
            case 6:
                final ca1 ca1Var = (ca1) obj2;
                ca1Var.e.b.evaluateJavascript((String) obj, new ValueCallback() { // from class: org.telegram.ui.Components.ba1
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(Object obj3) {
                        String str = (String) obj3;
                        ca1 ca1Var2 = ca1.this;
                        String[] strArr = ca1Var2.c;
                        strArr[0] = strArr[0].replace(ca1Var2.d, "/signature/" + str.substring(1, str.length() - 1));
                        ca1Var2.b.countDown();
                    }
                });
                break;
            case 7:
                ((org.telegram.ui.Components.voip.k) obj2).a.setOnClickListener((View.OnClickListener) obj);
                break;
            case 8:
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) obj2;
                Bitmap bitmap4 = (Bitmap) obj;
                HashMap<String, Bitmap> hashMap2 = tVar.F.thumbs;
                ChatObject.VideoParticipant videoParticipant = tVar.w;
                boolean z10 = videoParticipant.presentation;
                TLRPC.GroupCallParticipant groupCallParticipant = videoParticipant.participant;
                hashMap2.put(z10 ? groupCallParticipant.presentationEndpoint : groupCallParticipant.videoEndpoint, bitmap4);
                break;
            case 9:
                org.telegram.ui.Components.voip.t tVar2 = (org.telegram.ui.Components.voip.t) obj;
                ((org.telegram.ui.Components.voip.l0) obj2).getClass();
                tVar2.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setListener(new org.telegram.ui.Components.voip.y(tVar2)).setDuration(150L).start();
                break;
            case 10:
                mm0 mm0Var2 = (mm0) obj2;
                if (mm0Var2 != null) {
                    mm0Var2.setOnItemClickListener((am0) obj);
                    break;
                }
                break;
            case 11:
                org.telegram.ui.du duVar = (org.telegram.ui.du) obj2;
                String lowerCase = ((String) obj).trim().toLowerCase();
                int i19 = 12;
                if (lowerCase.length() != 0) {
                    String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = duVar.f;
                    int size = arrayList6.size();
                    while (i14 < size) {
                        Object obj3 = arrayList6.get(i14);
                        i14++;
                        org.telegram.ui.au auVar = (org.telegram.ui.au) obj3;
                        String str = auVar.a;
                        if (str == null) {
                            str = "";
                        }
                        String lowerCase2 = str.toLowerCase();
                        String lowerCase3 = AndroidUtilities.translitSafe(auVar.a).toLowerCase();
                        String str2 = auVar.b;
                        if (str2 == null) {
                            str2 = "";
                        }
                        String lowerCase4 = str2.toLowerCase();
                        String lowerCase5 = AndroidUtilities.translitSafe(auVar.b).toLowerCase();
                        String str3 = auVar.c;
                        if (str3 == null) {
                            str3 = "";
                        }
                        String concat = TextUtils.isEmpty(str3) ? "" : "+".concat(str3);
                        if (lowerCase2.startsWith(lowerCase) || lowerCase2.contains(" ".concat(lowerCase)) || lowerCase3.startsWith(translitSafe) || org.telegram.messenger.g0.w(" ", translitSafe, lowerCase3) || lowerCase4.startsWith(lowerCase) || lowerCase4.contains(" ".concat(lowerCase)) || lowerCase5.startsWith(translitSafe) || org.telegram.messenger.g0.w(" ", translitSafe, lowerCase5) || str3.startsWith(lowerCase) || concat.startsWith(lowerCase)) {
                            arrayList5.add(auVar);
                        }
                    }
                    AndroidUtilities.runOnUIThread(new n51(12, duVar, arrayList5));
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(new n51(i19, duVar, new ArrayList()));
                    break;
                }
                break;
            case 12:
                org.telegram.ui.du duVar2 = (org.telegram.ui.du) obj2;
                ArrayList arrayList7 = (ArrayList) obj;
                org.telegram.ui.fu fuVar = duVar2.h;
                if (fuVar.f) {
                    duVar2.e = arrayList7;
                    if (fuVar.e && (mm0Var = fuVar.a) != null) {
                        s4.g0 adapter = mm0Var.getAdapter();
                        org.telegram.ui.du duVar3 = fuVar.d;
                        if (adapter != duVar3) {
                            fuVar.a.setAdapter(duVar3);
                            fuVar.a.setFastScrollVisible(false);
                        }
                    }
                    duVar2.l();
                    break;
                }
                break;
            case 13:
                MessagesController.getInstance(((org.telegram.ui.hu) obj2).currentAccount).lambda$processUpdates$377((TLRPC.Updates) obj, false);
                break;
            case 14:
                org.telegram.ui.yy.e0((org.telegram.ui.yy) obj2, (String) obj);
                break;
            case 15:
                fi.k3.j(((org.telegram.ui.yy) obj2).currentAccount, ((TLRPC.TL_attachMenuBot) obj).bot_id, null);
                break;
            case 16:
                org.telegram.ui.yy yyVar = (org.telegram.ui.yy) obj2;
                org.telegram.ui.ActionBar.e3[] e3VarArr = (org.telegram.ui.ActionBar.e3[]) obj;
                org.telegram.ui.ActionBar.e3 e3Var = e3VarArr[0];
                if (e3Var != null) {
                    e3Var.dismiss();
                    e3VarArr[0] = null;
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.uv(yyVar, 25), 300L);
                break;
            case 17:
                ((org.telegram.ui.xy) obj).a.postOnAnimation(new org.telegram.ui.uv((org.telegram.ui.yy) obj2, 15));
                break;
            case 18:
                org.telegram.ui.yy yyVar2 = (org.telegram.ui.yy) obj2;
                yyVar2.getMessagesController().addDialogToFolder((ArrayList) obj, (yyVar2.W2 == 0 && yyVar2.Y2 == 0) ? 0 : 1, -1, null, 0L);
                break;
            case 19:
                ArrayList arrayList8 = (ArrayList) obj;
                org.telegram.ui.yy yyVar3 = ((org.telegram.ui.xw) obj2).b;
                yyVar3.z3 = 2;
                yyVar3.y4(true, true);
                yyVar3.m3();
                while (i14 < arrayList8.size()) {
                    long j10 = ((TLRPC.Dialog) arrayList8.get(i14)).id;
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList8.get(i14);
                    if (yyVar3.getMessagesController().isForum(j10) || yyVar3.getMessagesController().isMonoForumWithManageRights(j10)) {
                        yyVar3.getMessagesController().markAllTopicsAsRead(j10);
                    }
                    yyVar3.getMessagesController().markMentionsAsRead(j10, 0L);
                    MessagesController messagesController = yyVar3.getMessagesController();
                    int i20 = dialog.top_message;
                    messagesController.markDialogAsRead(j10, i20, i20, dialog.last_message_date, false, 0L, 0, true, 0);
                    i14++;
                }
                break;
            case 20:
                ((org.telegram.ui.xw) obj2).d((MessagesController.DialogFilter) obj);
                break;
            case 21:
                CharSequence charSequence = (CharSequence) obj;
                org.telegram.ui.yy yyVar4 = ((org.telegram.ui.jx) obj2).a;
                yyVar4.H2 = null;
                nr0 nr0Var = yyVar4.G2;
                if (nr0Var != null && nr0Var.h) {
                    nr0Var.e(charSequence, false);
                    break;
                }
                break;
            case 22:
                org.telegram.ui.ActionBar.m2[] m2VarArr = (org.telegram.ui.ActionBar.m2[]) obj;
                ((org.telegram.ui.xx) obj2).b.removeSelfFromStack();
                if (m2VarArr[1] == null) {
                    m2VarArr[0].finishFragment();
                    break;
                } else {
                    m2VarArr[0].removeSelfFromStack();
                    m2VarArr[1].finishFragment();
                    break;
                }
            case 23:
                org.telegram.ui.kz kzVar = (org.telegram.ui.kz) obj2;
                org.telegram.ui.fo foVar = kzVar.a;
                uy0 uy0Var = new uy0(foVar.getParentActivity(), kzVar.a, ((MessageObject) obj).getInputStickerSet(), null, foVar.Y, foVar.getResourceProvider());
                uy0Var.setCalcMandatoryInsets(foVar.C9());
                foVar.showDialog(uy0Var);
                break;
            case 24:
                org.telegram.ui.f00 f00Var = (org.telegram.ui.f00) obj2;
                f00Var.getClass();
                ((org.telegram.ui.ActionBar.a2) obj).dismiss();
                org.telegram.ui.g00 g00Var = f00Var.E;
                org.telegram.ui.h00 h00Var = g00Var.c;
                Utilities.Callback callback = h00Var.x;
                if (callback != null) {
                    callback.run(h00Var.d);
                }
                g00Var.c.finishFragment();
                break;
            case 25:
                org.telegram.ui.k10 k10Var = (org.telegram.ui.k10) obj2;
                org.telegram.ui.h00 h00Var2 = new org.telegram.ui.h00(k10Var.r, ((org.telegram.ui.b10) obj).m);
                h00Var2.y = new org.telegram.ui.k00(k10Var, i13);
                h00Var2.x = new org.telegram.ui.k00(k10Var, i12);
                k10Var.presentFragment(h00Var2);
                break;
            case 26:
                org.telegram.ui.k10 k10Var2 = (org.telegram.ui.k10) obj2;
                Runnable runnable = (Runnable) obj;
                k10Var2.h = false;
                k10Var2.s = false;
                k10Var2.r.flags = k10Var2.y;
                k10Var2.i0(true);
                k10Var2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 27:
                org.telegram.ui.k10 k10Var3 = (org.telegram.ui.k10) obj2;
                TLObject tLObject2 = (TLObject) obj;
                ArrayList arrayList9 = k10Var3.L;
                k10Var3.N = false;
                if (tLObject2 instanceof TL_chatlists.TL_chatlists_exportedInvites) {
                    TL_chatlists.TL_chatlists_exportedInvites tL_chatlists_exportedInvites = (TL_chatlists.TL_chatlists_exportedInvites) tLObject2;
                    k10Var3.getMessagesController().putChats(tL_chatlists_exportedInvites.chats, false);
                    k10Var3.getMessagesController().putUsers(tL_chatlists_exportedInvites.users, false);
                    arrayList9.clear();
                    arrayList9.addAll(tL_chatlists_exportedInvites.invites);
                    k10Var3.w0();
                }
                k10Var3.M = 0;
                break;
            case 28:
                org.telegram.ui.k10 k10Var4 = (org.telegram.ui.k10) obj2;
                org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) obj;
                MessagesController.DialogFilter dialogFilter = k10Var4.r;
                if (a2Var != null) {
                    try {
                        a2Var.dismiss();
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                k10Var4.getMessagesController().removeFilter(dialogFilter);
                k10Var4.getMessagesStorage().deleteDialogFilter(dialogFilter);
                k10Var4.finishFragment();
                break;
            default:
                org.telegram.ui.k10 k10Var5 = (org.telegram.ui.k10) obj2;
                k10Var5.getClass();
                k10Var5.m0(((TL_chatlists.TL_chatlists_exportedChatlistInvite) obj).invite);
                break;
        }
    }
}
