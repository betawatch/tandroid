package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d71 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d71(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        String str;
        cc1 cc1Var;
        String str2;
        int i11;
        nm0 nm0Var;
        ArrayList arrayList = null;
        int i12 = 0;
        switch (this.a) {
            case 0:
                UndoView undoView = (UndoView) this.b;
                TLObject tLObject = (TLObject) this.c;
                if (tLObject instanceof TLRPC.PaymentReceipt) {
                    undoView.s.presentFragment(new org.telegram.ui.ro0((TLRPC.PaymentReceipt) tLObject));
                    return;
                } else {
                    int i13 = UndoView.i0;
                    undoView.getClass();
                    return;
                }
            case 1:
                ((u61) this.b).D.onClick((org.telegram.ui.Cells.z8) this.c);
                return;
            case 2:
                t81 t81Var = (t81) this.b;
                b2.z0 z0Var = (b2.z0) this.c;
                Throwable cause = z0Var.getCause();
                if ((cause instanceof r2.n) && (cause.toString().contains("av1") || cause.toString().contains("av01"))) {
                    FileLog.e(z0Var);
                    FileLog.e("av1 codec failed, we think this codec is not supported");
                    MessagesController.getGlobalMainSettings().edit().putBoolean("unsupport_video/av01", true).commit();
                    HashMap hashMap = t81.l0;
                    if (hashMap != null) {
                        hashMap.clear();
                    }
                    ArrayList arrayList2 = t81Var.N;
                    if (arrayList2 != null) {
                        int i14 = 0;
                        while (i14 < arrayList2.size()) {
                            p81 p81Var = (p81) arrayList2.get(i14);
                            int i15 = 0;
                            while (true) {
                                ArrayList arrayList3 = p81Var.d;
                                if (i15 < arrayList3.size()) {
                                    r81 r81Var = (r81) arrayList3.get(i15);
                                    if (!TextUtils.isEmpty(r81Var.m) && !t81.Y(r81Var.m)) {
                                        arrayList3.remove(i15);
                                        i15--;
                                    }
                                    i15++;
                                } else {
                                    if (arrayList3.isEmpty()) {
                                        arrayList2.remove(i14);
                                        i14--;
                                    }
                                    i14++;
                                }
                            }
                        }
                        arrayList = arrayList2;
                    }
                    t81Var.N = arrayList;
                    if (arrayList != null) {
                        t81Var.F(arrayList, t81Var.O);
                        return;
                    }
                    return;
                }
                TextureView textureView = t81Var.n;
                if (textureView == null || ((t81Var.E || !(cause instanceof r2.p)) && !(cause instanceof a3.x))) {
                    t81Var.J.onError(t81Var, z0Var);
                    return;
                }
                t81Var.E = true;
                if (t81Var.d != null) {
                    ViewGroup viewGroup = (ViewGroup) textureView.getParent();
                    if (viewGroup != null) {
                        int indexOfChild = viewGroup.indexOfChild(t81Var.n);
                        viewGroup.removeView(t81Var.n);
                        viewGroup.addView(t81Var.n, indexOfChild);
                    }
                    DispatchQueue dispatchQueue = t81Var.b;
                    if (dispatchQueue != null) {
                        dispatchQueue.postRunnable(new t51(t81Var, 6));
                        return;
                    }
                    i2.j0 j0Var = t81Var.d;
                    TextureView textureView2 = t81Var.n;
                    j0Var.F1();
                    if (textureView2 != null && textureView2 == j0Var.X) {
                        j0Var.F1();
                        j0Var.s1();
                        j0Var.x1(null);
                        j0Var.q1(0, 0);
                    }
                    t81Var.d.z1(t81Var.n);
                    ArrayList arrayList4 = t81Var.N;
                    if (arrayList4 != null) {
                        t81Var.F(arrayList4, t81Var.O);
                    } else if (t81Var.U) {
                        t81Var.G(t81Var.Q, t81Var.S, t81Var.R, t81Var.T);
                    } else {
                        t81Var.D(t81Var.Q, t81Var.S);
                    }
                    t81Var.C();
                    return;
                }
                return;
            case 3:
                ((s81) this.b).f.K.onVisualizerUpdate(true, true, (float[]) this.c);
                return;
            case 4:
                a91 a91Var = (a91) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                if (bitmap != null) {
                    if (a91Var.w != null) {
                        Bitmap bitmap2 = a91Var.v;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        a91Var.v = a91Var.w;
                    }
                    a91Var.w = bitmap;
                    Bitmap bitmap3 = a91Var.w;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                    a91Var.G = bitmapShader;
                    bitmapShader.setLocalMatrix(a91Var.L);
                    a91Var.J.setShader(a91Var.G);
                    a91Var.invalidate();
                    int dp = AndroidUtilities.dp(150.0f);
                    float width = bitmap.getWidth() / bitmap.getHeight();
                    if (width > 1.0f) {
                        i10 = (int) (dp / width);
                    } else {
                        dp = (int) (dp * width);
                        i10 = dp;
                    }
                    ViewGroup.LayoutParams layoutParams = a91Var.getLayoutParams();
                    if (a91Var.getVisibility() != 0 || layoutParams.width != dp || layoutParams.height != i10) {
                        layoutParams.width = dp;
                        layoutParams.height = i10;
                        a91Var.setVisibility(0);
                        a91Var.requestLayout();
                    }
                }
                a91Var.f = null;
                return;
            case 5:
                final ma1 ma1Var = (ma1) this.b;
                ma1Var.e.b.evaluateJavascript((String) this.c, new ValueCallback() { // from class: org.telegram.ui.Components.la1
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(Object obj) {
                        String str3 = (String) obj;
                        ma1 ma1Var2 = ma1.this;
                        String[] strArr = ma1Var2.c;
                        strArr[0] = strArr[0].replace(ma1Var2.d, "/signature/" + str3.substring(1, str3.length() - 1));
                        ma1Var2.b.countDown();
                    }
                });
                return;
            case 6:
                dc1 dc1Var = (dc1) this.b;
                qa1 qa1Var = (qa1) this.c;
                dc1Var.I = qa1Var;
                dc1Var.L = qa1Var;
                dc1Var.f(true);
                return;
            case 7:
                ((ra1) this.b).d.e((String) this.c);
                return;
            case 8:
                ((ab1) this.b).f.e((String) this.c);
                return;
            case 9:
                dc1 dc1Var2 = (dc1) this.b;
                za1 za1Var = (za1) this.c;
                dc1Var2.I = za1Var;
                dc1Var2.L = za1Var;
                dc1Var2.f(true);
                return;
            case 10:
                gb1 gb1Var = (gb1) this.b;
                TLRPC.TL_messageMediaWidget tL_messageMediaWidget = (TLRPC.TL_messageMediaWidget) this.c;
                gb1Var.q = tL_messageMediaWidget;
                gb1Var.p = tL_messageMediaWidget.public_data_hash;
                jb1.c(gb1Var, jb1.w(tL_messageMediaWidget.chat_data), jb1.w(tL_messageMediaWidget.public_data));
                return;
            case 11:
                MessagesStorage messagesStorage = (MessagesStorage) this.b;
                gb1 gb1Var2 = (gb1) this.c;
                Object[] widgetState = messagesStorage.getWidgetState(gb1Var2.c, gb1Var2.d);
                ArrayList arrayList5 = (ArrayList) widgetState[1];
                if (!arrayList5.isEmpty()) {
                    String a2 = gb1Var2.a();
                    ConcurrentHashMap concurrentHashMap = jb1.b;
                    hb1 hb1Var = (hb1) concurrentHashMap.get(a2);
                    if (hb1Var == null) {
                        hb1Var = new hb1();
                        hb1 hb1Var2 = (hb1) concurrentHashMap.putIfAbsent(a2, hb1Var);
                        if (hb1Var2 != null) {
                            hb1Var = hb1Var2;
                        }
                    }
                    synchronized (hb1Var) {
                        if (hb1Var.a.isEmpty()) {
                            while (i12 < arrayList5.size() && i12 < 4) {
                                hb1Var.a.add((int[]) arrayList5.get(i12));
                                i12++;
                            }
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new d71(12, gb1Var2, widgetState));
                return;
            case 12:
                gb1 gb1Var3 = (gb1) this.b;
                String str3 = (String) ((Object[]) this.c)[0];
                HashMap hashMap2 = jb1.c;
                gb1Var3.y = true;
                String a10 = gb1Var3.a();
                if (str3 != null && !hashMap2.containsKey(a10)) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("local", new JSONObject(str3));
                        hashMap2.put(a10, jSONObject);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                nb1 nb1Var = gb1Var3.s;
                if (nb1Var != null) {
                    JSONObject jSONObject2 = (JSONObject) hashMap2.get(a10);
                    try {
                        str = LocaleController.getInstance().getCurrentLocale().toLanguageTag();
                    } catch (Exception unused) {
                        str = null;
                    }
                    String jSONObject3 = jSONObject2 != null ? jSONObject2.toString() : null;
                    nb1Var.t = str;
                    nb1Var.u = jSONObject3;
                }
                bn0 bn0Var = gb1Var3.t;
                if (bn0Var != null && (nb1Var == null || nb1Var.i <= 0)) {
                    bn0Var.q("cached heights read");
                }
                if (gb1Var3.z) {
                    gb1Var3.z = false;
                    if (gb1Var3.w > 0 && nb1Var != null) {
                        jb1.v(gb1Var3);
                    }
                }
                jb1.n();
                return;
            case 13:
                dc1 dc1Var3 = (dc1) this.b;
                dc1Var3.M = ((Exception) this.c).toString();
                if (dc1Var3.t || (cc1Var = dc1Var3.I) == null) {
                    return;
                }
                cc1Var.e(dc1Var3.M);
                return;
            case 14:
                ((org.telegram.ui.Components.voip.k) this.b).a.setOnClickListener((View.OnClickListener) this.c);
                return;
            case 15:
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) this.b;
                Bitmap bitmap4 = (Bitmap) this.c;
                HashMap<String, Bitmap> hashMap3 = tVar.F.thumbs;
                ChatObject.VideoParticipant videoParticipant = tVar.w;
                boolean z10 = videoParticipant.presentation;
                TLRPC.GroupCallParticipant groupCallParticipant = videoParticipant.participant;
                hashMap3.put(z10 ? groupCallParticipant.presentationEndpoint : groupCallParticipant.videoEndpoint, bitmap4);
                return;
            case 16:
                org.telegram.ui.Components.voip.l0 l0Var = (org.telegram.ui.Components.voip.l0) this.b;
                org.telegram.ui.Components.voip.t tVar2 = (org.telegram.ui.Components.voip.t) this.c;
                l0Var.getClass();
                tVar2.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setListener(new org.telegram.ui.Components.voip.y(tVar2)).setDuration(150L).start();
                return;
            case 17:
                nm0 nm0Var2 = (nm0) this.b;
                Object obj = this.c;
                if (nm0Var2 != null) {
                    nm0Var2.setOnItemClickListener((am0) obj);
                    return;
                }
                return;
            case 18:
                org.telegram.ui.ot otVar = (org.telegram.ui.ot) this.b;
                String str4 = "";
                String lowerCase = ((String) this.c).trim().toLowerCase();
                int i16 = 19;
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new d71(i16, otVar, new ArrayList()));
                    return;
                }
                String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = otVar.f;
                int size = arrayList7.size();
                while (i12 < size) {
                    Object obj2 = arrayList7.get(i12);
                    int i17 = i12 + 1;
                    org.telegram.ui.lt ltVar = (org.telegram.ui.lt) obj2;
                    String str5 = ltVar.a;
                    if (str5 == null) {
                        str5 = str4;
                    }
                    String lowerCase2 = str5.toLowerCase();
                    String lowerCase3 = AndroidUtilities.translitSafe(ltVar.a).toLowerCase();
                    String str6 = ltVar.b;
                    if (str6 == null) {
                        str6 = str4;
                    }
                    String lowerCase4 = str6.toLowerCase();
                    String lowerCase5 = AndroidUtilities.translitSafe(ltVar.b).toLowerCase();
                    String str7 = ltVar.c;
                    if (str7 == null) {
                        str7 = str4;
                    }
                    if (TextUtils.isEmpty(str7)) {
                        str2 = str4;
                    } else {
                        str2 = str4;
                        str4 = "+".concat(str7);
                    }
                    if (lowerCase2.startsWith(lowerCase)) {
                        i11 = i17;
                    } else {
                        i11 = i17;
                        if (!lowerCase2.contains(" ".concat(lowerCase)) && !lowerCase3.startsWith(translitSafe) && !org.telegram.messenger.wh.u(" ", translitSafe, lowerCase3) && !lowerCase4.startsWith(lowerCase) && !lowerCase4.contains(" ".concat(lowerCase)) && !lowerCase5.startsWith(translitSafe) && !org.telegram.messenger.wh.u(" ", translitSafe, lowerCase5) && !str7.startsWith(lowerCase) && !str4.startsWith(lowerCase)) {
                            str4 = str2;
                            i12 = i11;
                        }
                    }
                    arrayList6.add(ltVar);
                    str4 = str2;
                    i12 = i11;
                }
                AndroidUtilities.runOnUIThread(new d71(19, otVar, arrayList6));
                return;
            case 19:
                org.telegram.ui.ot otVar2 = (org.telegram.ui.ot) this.b;
                ArrayList arrayList8 = (ArrayList) this.c;
                org.telegram.ui.qt qtVar = otVar2.h;
                if (qtVar.f) {
                    otVar2.e = arrayList8;
                    if (qtVar.e && (nm0Var = qtVar.a) != null) {
                        s4.h0 adapter = nm0Var.getAdapter();
                        org.telegram.ui.ot otVar3 = qtVar.d;
                        if (adapter != otVar3) {
                            qtVar.a.setAdapter(otVar3);
                            qtVar.a.setFastScrollVisible(false);
                        }
                    }
                    otVar2.l();
                    return;
                }
                return;
            case 20:
                MessagesController.getInstance(((org.telegram.ui.tt) this.b).currentAccount).lambda$processUpdates$379((TLRPC.Updates) this.c, false);
                return;
            case 21:
                org.telegram.ui.ey.d0((org.telegram.ui.ey) this.b, (String) this.c);
                return;
            case 22:
                hi.m3.j(((org.telegram.ui.ey) this.b).currentAccount, ((TLRPC.TL_attachMenuBot) this.c).bot_id, null);
                return;
            case 23:
                org.telegram.ui.ey eyVar = (org.telegram.ui.ey) this.b;
                org.telegram.ui.ActionBar.k3[] k3VarArr = (org.telegram.ui.ActionBar.k3[]) this.c;
                org.telegram.ui.ActionBar.k3 k3Var = k3VarArr[0];
                if (k3Var != null) {
                    k3Var.dismiss();
                    k3VarArr[0] = null;
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ev(eyVar, 25), 300L);
                return;
            case 24:
                org.telegram.ui.ey eyVar2 = (org.telegram.ui.ey) this.b;
                eyVar2.getMessagesController().addDialogToFolder((ArrayList) this.c, (eyVar2.W2 == 0 && eyVar2.Y2 == 0) ? 0 : 1, -1, null, 0L);
                return;
            case 25:
                org.telegram.ui.mw mwVar = (org.telegram.ui.mw) this.b;
                CharSequence charSequence = (CharSequence) this.c;
                org.telegram.ui.ey eyVar3 = mwVar.a;
                eyVar3.H2 = null;
                rr0 rr0Var = eyVar3.G2;
                if (rr0Var == null || !rr0Var.h) {
                    return;
                }
                rr0Var.e(charSequence, false);
                return;
            case 26:
                org.telegram.ui.ax axVar = (org.telegram.ui.ax) this.b;
                org.telegram.ui.ActionBar.r2[] r2VarArr = (org.telegram.ui.ActionBar.r2[]) this.c;
                axVar.b.removeSelfFromStack();
                if (r2VarArr[1] == null) {
                    r2VarArr[0].finishFragment();
                    return;
                } else {
                    r2VarArr[0].removeSelfFromStack();
                    r2VarArr[1].finishFragment();
                    return;
                }
            case 27:
                org.telegram.ui.ux uxVar = (org.telegram.ui.ux) this.b;
                ArrayList arrayList9 = (ArrayList) this.c;
                org.telegram.ui.ey eyVar4 = uxVar.b;
                eyVar4.z3 = 2;
                eyVar4.I4(true, true);
                eyVar4.w3();
                while (i12 < arrayList9.size()) {
                    long j10 = ((TLRPC.Dialog) arrayList9.get(i12)).id;
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList9.get(i12);
                    if (eyVar4.getMessagesController().isForum(j10) || eyVar4.getMessagesController().isMonoForumWithManageRights(j10)) {
                        eyVar4.getMessagesController().markAllTopicsAsRead(j10);
                    }
                    eyVar4.getMessagesController().markMentionsAsRead(j10, 0L);
                    MessagesController messagesController = eyVar4.getMessagesController();
                    int i18 = dialog.top_message;
                    messagesController.markDialogAsRead(j10, i18, i18, dialog.last_message_date, false, 0L, 0, true, 0);
                    i12++;
                }
                return;
            case 28:
                ((org.telegram.ui.ux) this.b).d((MessagesController.DialogFilter) this.c);
                return;
            default:
                org.telegram.ui.qy qyVar = (org.telegram.ui.qy) this.b;
                MessageObject messageObject = (MessageObject) this.c;
                org.telegram.ui.wn wnVar = qyVar.a;
                dz0 dz0Var = new dz0(wnVar.getParentActivity(), qyVar.a, messageObject.getInputStickerSet(), null, wnVar.Y, wnVar.getResourceProvider());
                dz0Var.setCalcMandatoryInsets(wnVar.I9());
                wnVar.showDialog(dz0Var);
                return;
        }
    }
}
