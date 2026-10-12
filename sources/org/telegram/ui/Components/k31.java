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
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class k31 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k31(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        mm0 mm0Var;
        int i11 = this.a;
        ArrayList arrayList = null;
        int i12 = 1;
        int i13 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i11) {
            case 0:
                y31 y31Var = (y31) obj2;
                MessagesController.getInstance(y31Var.b).getTopicsController().deleteTopics(-y31Var.c, (ArrayList) obj);
                int i14 = y31.f0;
                break;
            case 1:
                y31 y31Var2 = (y31) obj2;
                y31Var2.getClass();
                MessagesController.getInstance(y31Var2.b).loadFullChat(((TLRPC.Updates) obj).chats.get(0).id, 0, true);
                break;
            case 2:
                org.telegram.ui.Cells.l1 l1Var = (org.telegram.ui.Cells.l1) obj2;
                TLRPC.TL_messages_transcribedAudio tL_messages_transcribedAudio = (TLRPC.TL_messages_transcribedAudio) obj;
                if (l1Var != null) {
                    l1Var.d0(tL_messages_transcribedAudio.trial_remains_num > 0 ? 1 : 2);
                    break;
                }
                break;
            case 3:
                x41.q((x41) obj2, (TLObject) obj);
                break;
            case 4:
                org.telegram.ui.el elVar = (org.telegram.ui.el) obj2;
                ((org.telegram.ui.ActionBar.m1) obj).d(true);
                o51.a(elVar.getContext(), elVar.d);
                break;
            case 5:
                ((TranslateController) obj).setHideTranslateDialog(((org.telegram.ui.el) obj2).b, false);
                break;
            case 6:
                UndoView undoView = (UndoView) obj2;
                TLObject tLObject = (TLObject) obj;
                if (!(tLObject instanceof TLRPC.PaymentReceipt)) {
                    int i15 = UndoView.e0;
                    undoView.getClass();
                    break;
                } else {
                    undoView.s.presentFragment(new org.telegram.ui.cp0((TLRPC.PaymentReceipt) tLObject));
                    break;
                }
            case 7:
                ((l61) obj2).D.onClick((org.telegram.ui.Cells.v8) obj);
                break;
            case 8:
                h81 h81Var = (h81) obj2;
                b2.z0 z0Var = (b2.z0) obj;
                Throwable cause = z0Var.getCause();
                if (!(cause instanceof r2.n) || (!cause.toString().contains("av1") && !cause.toString().contains("av01"))) {
                    TextureView textureView = h81Var.n;
                    if (textureView != null && ((!h81Var.E && (cause instanceof r2.p)) || (cause instanceof a3.x))) {
                        h81Var.E = true;
                        if (h81Var.d != null) {
                            ViewGroup viewGroup = (ViewGroup) textureView.getParent();
                            if (viewGroup != null) {
                                int indexOfChild = viewGroup.indexOfChild(h81Var.n);
                                viewGroup.removeView(h81Var.n);
                                viewGroup.addView(h81Var.n, indexOfChild);
                            }
                            DispatchQueue dispatchQueue = h81Var.b;
                            if (dispatchQueue == null) {
                                i2.h0 h0Var = h81Var.d;
                                TextureView textureView2 = h81Var.n;
                                h0Var.F1();
                                if (textureView2 != null && textureView2 == h0Var.X) {
                                    h0Var.F1();
                                    h0Var.s1();
                                    h0Var.x1(null);
                                    h0Var.q1(0, 0);
                                }
                                h81Var.d.z1(h81Var.n);
                                ArrayList arrayList2 = h81Var.N;
                                if (arrayList2 != null) {
                                    h81Var.F(arrayList2, h81Var.O);
                                } else if (h81Var.U) {
                                    h81Var.G(h81Var.Q, h81Var.S, h81Var.R, h81Var.T);
                                } else {
                                    h81Var.D(h81Var.Q, h81Var.S);
                                }
                                h81Var.C();
                                break;
                            } else {
                                dispatchQueue.postRunnable(new v71(h81Var, i12));
                                break;
                            }
                        }
                    } else {
                        h81Var.J.onError(h81Var, z0Var);
                        break;
                    }
                } else {
                    FileLog.e(z0Var);
                    FileLog.e("av1 codec failed, we think this codec is not supported");
                    MessagesController.getGlobalMainSettings().edit().putBoolean("unsupport_video/av01", true).commit();
                    HashMap hashMap = h81.l0;
                    if (hashMap != null) {
                        hashMap.clear();
                    }
                    ArrayList arrayList3 = h81Var.N;
                    if (arrayList3 != null) {
                        int i16 = 0;
                        while (i16 < arrayList3.size()) {
                            d81 d81Var = (d81) arrayList3.get(i16);
                            int i17 = 0;
                            while (true) {
                                ArrayList arrayList4 = d81Var.d;
                                if (i17 < arrayList4.size()) {
                                    f81 f81Var = (f81) arrayList4.get(i17);
                                    if (!TextUtils.isEmpty(f81Var.m) && !h81.Y(f81Var.m)) {
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
                    h81Var.N = arrayList;
                    if (arrayList != null) {
                        h81Var.F(arrayList, h81Var.O);
                        break;
                    }
                }
                break;
            case 9:
                ((g81) obj2).f.K.onVisualizerUpdate(true, true, (float[]) obj);
                break;
            case 10:
                p81 p81Var = (p81) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (bitmap != null) {
                    if (p81Var.w != null) {
                        Bitmap bitmap2 = p81Var.v;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        p81Var.v = p81Var.w;
                    }
                    p81Var.w = bitmap;
                    Bitmap bitmap3 = p81Var.w;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                    p81Var.G = bitmapShader;
                    bitmapShader.setLocalMatrix(p81Var.L);
                    p81Var.J.setShader(p81Var.G);
                    p81Var.invalidate();
                    int dp = AndroidUtilities.dp(150.0f);
                    float width = bitmap.getWidth() / bitmap.getHeight();
                    if (width > 1.0f) {
                        i10 = (int) (dp / width);
                    } else {
                        int i18 = (int) (dp * width);
                        i10 = dp;
                        dp = i18;
                    }
                    ViewGroup.LayoutParams layoutParams = p81Var.getLayoutParams();
                    if (p81Var.getVisibility() != 0 || layoutParams.width != dp || layoutParams.height != i10) {
                        layoutParams.width = dp;
                        layoutParams.height = i10;
                        p81Var.setVisibility(0);
                        p81Var.requestLayout();
                    }
                }
                p81Var.f = null;
                break;
            case 11:
                final ba1 ba1Var = (ba1) obj2;
                ba1Var.e.b.evaluateJavascript((String) obj, new ValueCallback() { // from class: org.telegram.ui.Components.aa1
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(Object obj3) {
                        String str = (String) obj3;
                        ba1 ba1Var2 = ba1.this;
                        String[] strArr = ba1Var2.c;
                        strArr[0] = strArr[0].replace(ba1Var2.d, "/signature/" + str.substring(1, str.length() - 1));
                        ba1Var2.b.countDown();
                    }
                });
                break;
            case 12:
                ((org.telegram.ui.Components.voip.k) obj2).a.setOnClickListener((View.OnClickListener) obj);
                break;
            case 13:
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) obj2;
                Bitmap bitmap4 = (Bitmap) obj;
                HashMap<String, Bitmap> hashMap2 = tVar.F.thumbs;
                ChatObject.VideoParticipant videoParticipant = tVar.w;
                boolean z10 = videoParticipant.presentation;
                TLRPC.GroupCallParticipant groupCallParticipant = videoParticipant.participant;
                hashMap2.put(z10 ? groupCallParticipant.presentationEndpoint : groupCallParticipant.videoEndpoint, bitmap4);
                break;
            case 14:
                org.telegram.ui.Components.voip.t tVar2 = (org.telegram.ui.Components.voip.t) obj;
                ((org.telegram.ui.Components.voip.l0) obj2).getClass();
                tVar2.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setListener(new org.telegram.ui.Components.voip.y(tVar2)).setDuration(150L).start();
                break;
            case 15:
                mm0 mm0Var2 = (mm0) obj2;
                if (mm0Var2 != null) {
                    mm0Var2.setOnItemClickListener((am0) obj);
                    break;
                }
                break;
            case 16:
                org.telegram.ui.du duVar = (org.telegram.ui.du) obj2;
                String lowerCase = ((String) obj).trim().toLowerCase();
                int i19 = 17;
                if (lowerCase.length() != 0) {
                    String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = duVar.f;
                    int size = arrayList6.size();
                    while (i13 < size) {
                        Object obj3 = arrayList6.get(i13);
                        i13++;
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
                        if (lowerCase2.startsWith(lowerCase) || lowerCase2.contains(" ".concat(lowerCase)) || lowerCase3.startsWith(translitSafe) || org.telegram.messenger.yh.v(" ", translitSafe, lowerCase3) || lowerCase4.startsWith(lowerCase) || lowerCase4.contains(" ".concat(lowerCase)) || lowerCase5.startsWith(translitSafe) || org.telegram.messenger.yh.v(" ", translitSafe, lowerCase5) || str3.startsWith(lowerCase) || concat.startsWith(lowerCase)) {
                            arrayList5.add(auVar);
                        }
                    }
                    AndroidUtilities.runOnUIThread(new k31(17, duVar, arrayList5));
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(new k31(i19, duVar, new ArrayList()));
                    break;
                }
            case 17:
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
            case 18:
                MessagesController.getInstance(((org.telegram.ui.hu) obj2).currentAccount).lambda$processUpdates$377((TLRPC.Updates) obj, false);
                break;
            case 19:
                org.telegram.ui.yy.b0((org.telegram.ui.yy) obj2, (String) obj);
                break;
            case 20:
                fi.k3.j(((org.telegram.ui.yy) obj2).currentAccount, ((TLRPC.TL_attachMenuBot) obj).bot_id, null);
                break;
            case 21:
                org.telegram.ui.yy yyVar = (org.telegram.ui.yy) obj2;
                org.telegram.ui.ActionBar.e3[] e3VarArr = (org.telegram.ui.ActionBar.e3[]) obj;
                org.telegram.ui.ActionBar.e3 e3Var = e3VarArr[0];
                if (e3Var != null) {
                    e3Var.dismiss();
                    e3VarArr[0] = null;
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.uv(yyVar, 25), 300L);
                break;
            case 22:
                ((org.telegram.ui.xy) obj).a.postOnAnimation(new org.telegram.ui.uv((org.telegram.ui.yy) obj2, 15));
                break;
            case 23:
                org.telegram.ui.yy yyVar2 = (org.telegram.ui.yy) obj2;
                yyVar2.getMessagesController().addDialogToFolder((ArrayList) obj, (yyVar2.V2 == 0 && yyVar2.X2 == 0) ? 0 : 1, -1, null, 0L);
                break;
            case 24:
                ArrayList arrayList8 = (ArrayList) obj;
                org.telegram.ui.yy yyVar3 = ((org.telegram.ui.xw) obj2).b;
                yyVar3.y3 = 2;
                yyVar3.x4(true, true);
                yyVar3.l3();
                while (i13 < arrayList8.size()) {
                    long j10 = ((TLRPC.Dialog) arrayList8.get(i13)).id;
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList8.get(i13);
                    if (yyVar3.getMessagesController().isForum(j10) || yyVar3.getMessagesController().isMonoForumWithManageRights(j10)) {
                        yyVar3.getMessagesController().markAllTopicsAsRead(j10);
                    }
                    yyVar3.getMessagesController().markMentionsAsRead(j10, 0L);
                    MessagesController messagesController = yyVar3.getMessagesController();
                    int i20 = dialog.top_message;
                    messagesController.markDialogAsRead(j10, i20, i20, dialog.last_message_date, false, 0L, 0, true, 0);
                    i13++;
                }
                break;
            case 25:
                ((org.telegram.ui.xw) obj2).d((MessagesController.DialogFilter) obj);
                break;
            case 26:
                CharSequence charSequence = (CharSequence) obj;
                org.telegram.ui.yy yyVar4 = ((org.telegram.ui.jx) obj2).a;
                yyVar4.H2 = null;
                or0 or0Var = yyVar4.G2;
                if (or0Var != null && or0Var.h) {
                    or0Var.e(charSequence, false);
                    break;
                }
                break;
            case 27:
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
            case 28:
                org.telegram.ui.kz kzVar = (org.telegram.ui.kz) obj2;
                org.telegram.ui.fo foVar = kzVar.a;
                ty0 ty0Var = new ty0(foVar.getParentActivity(), kzVar.a, ((MessageObject) obj).getInputStickerSet(), null, foVar.Y, foVar.getResourceProvider());
                ty0Var.setCalcMandatoryInsets(foVar.C9());
                foVar.showDialog(ty0Var);
                break;
            default:
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
        }
    }

    public /* synthetic */ k31(y31 y31Var, ArrayList arrayList, ve veVar) {
        this.a = 0;
        this.b = y31Var;
        this.c = arrayList;
    }
}
