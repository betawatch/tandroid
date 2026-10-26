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
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c71 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c71(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        String str;
        xb1 xb1Var;
        String str2;
        int i11;
        mm0 mm0Var;
        ArrayList arrayList = null;
        int i12 = 0;
        switch (this.a) {
            case 0:
                UndoView undoView = (UndoView) this.b;
                TLObject tLObject = (TLObject) this.c;
                if (tLObject instanceof TLRPC.PaymentReceipt) {
                    undoView.s.presentFragment(new org.telegram.ui.po0((TLRPC.PaymentReceipt) tLObject));
                    return;
                } else {
                    int i13 = UndoView.i0;
                    undoView.getClass();
                    return;
                }
            case 1:
                ((t61) this.b).D.onClick((org.telegram.ui.Cells.z8) this.c);
                return;
            case 2:
                s81 s81Var = (s81) this.b;
                b2.z0 z0Var = (b2.z0) this.c;
                Throwable cause = z0Var.getCause();
                if ((cause instanceof r2.n) && (cause.toString().contains("av1") || cause.toString().contains("av01"))) {
                    FileLog.e(z0Var);
                    FileLog.e("av1 codec failed, we think this codec is not supported");
                    MessagesController.getGlobalMainSettings().edit().putBoolean("unsupport_video/av01", true).commit();
                    HashMap hashMap = s81.l0;
                    if (hashMap != null) {
                        hashMap.clear();
                    }
                    ArrayList arrayList2 = s81Var.N;
                    if (arrayList2 != null) {
                        int i14 = 0;
                        while (i14 < arrayList2.size()) {
                            o81 o81Var = (o81) arrayList2.get(i14);
                            int i15 = 0;
                            while (true) {
                                ArrayList arrayList3 = o81Var.d;
                                if (i15 < arrayList3.size()) {
                                    q81 q81Var = (q81) arrayList3.get(i15);
                                    if (!TextUtils.isEmpty(q81Var.m) && !s81.Y(q81Var.m)) {
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
                    s81Var.N = arrayList;
                    if (arrayList != null) {
                        s81Var.F(arrayList, s81Var.O);
                        return;
                    }
                    return;
                }
                TextureView textureView = s81Var.n;
                if (textureView == null || ((s81Var.E || !(cause instanceof r2.p)) && !(cause instanceof a3.x))) {
                    s81Var.J.onError(s81Var, z0Var);
                    return;
                }
                s81Var.E = true;
                if (s81Var.d != null) {
                    ViewGroup viewGroup = (ViewGroup) textureView.getParent();
                    if (viewGroup != null) {
                        int indexOfChild = viewGroup.indexOfChild(s81Var.n);
                        viewGroup.removeView(s81Var.n);
                        viewGroup.addView(s81Var.n, indexOfChild);
                    }
                    DispatchQueue dispatchQueue = s81Var.b;
                    if (dispatchQueue != null) {
                        dispatchQueue.postRunnable(new s51(s81Var, 6));
                        return;
                    }
                    i2.j0 j0Var = s81Var.d;
                    TextureView textureView2 = s81Var.n;
                    j0Var.F1();
                    if (textureView2 != null && textureView2 == j0Var.X) {
                        j0Var.F1();
                        j0Var.s1();
                        j0Var.x1(null);
                        j0Var.q1(0, 0);
                    }
                    s81Var.d.z1(s81Var.n);
                    ArrayList arrayList4 = s81Var.N;
                    if (arrayList4 != null) {
                        s81Var.F(arrayList4, s81Var.O);
                    } else if (s81Var.U) {
                        s81Var.G(s81Var.Q, s81Var.S, s81Var.R, s81Var.T);
                    } else {
                        s81Var.D(s81Var.Q, s81Var.S);
                    }
                    s81Var.C();
                    return;
                }
                return;
            case 3:
                ((r81) this.b).f.K.onVisualizerUpdate(true, true, (float[]) this.c);
                return;
            case 4:
                z81 z81Var = (z81) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                if (bitmap != null) {
                    if (z81Var.w != null) {
                        Bitmap bitmap2 = z81Var.v;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        z81Var.v = z81Var.w;
                    }
                    z81Var.w = bitmap;
                    Bitmap bitmap3 = z81Var.w;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                    z81Var.G = bitmapShader;
                    bitmapShader.setLocalMatrix(z81Var.L);
                    z81Var.J.setShader(z81Var.G);
                    z81Var.invalidate();
                    int dp = AndroidUtilities.dp(150.0f);
                    float width = bitmap.getWidth() / bitmap.getHeight();
                    if (width > 1.0f) {
                        i10 = (int) (dp / width);
                    } else {
                        dp = (int) (dp * width);
                        i10 = dp;
                    }
                    ViewGroup.LayoutParams layoutParams = z81Var.getLayoutParams();
                    if (z81Var.getVisibility() != 0 || layoutParams.width != dp || layoutParams.height != i10) {
                        layoutParams.width = dp;
                        layoutParams.height = i10;
                        z81Var.setVisibility(0);
                        z81Var.requestLayout();
                    }
                }
                z81Var.f = null;
                return;
            case 5:
                final la1 la1Var = (la1) this.b;
                la1Var.e.b.evaluateJavascript((String) this.c, new ValueCallback() { // from class: org.telegram.ui.Components.ka1
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(Object obj) {
                        String str3 = (String) obj;
                        la1 la1Var2 = la1.this;
                        String[] strArr = la1Var2.c;
                        strArr[0] = strArr[0].replace(la1Var2.d, "/signature/" + str3.substring(1, str3.length() - 1));
                        la1Var2.b.countDown();
                    }
                });
                return;
            case 6:
                yb1 yb1Var = (yb1) this.b;
                pa1 pa1Var = (pa1) this.c;
                yb1Var.H = pa1Var;
                yb1Var.K = pa1Var;
                yb1Var.e(true);
                return;
            case 7:
                ((qa1) this.b).d.e((String) this.c);
                return;
            case 8:
                ((za1) this.b).f.e((String) this.c);
                return;
            case 9:
                yb1 yb1Var2 = (yb1) this.b;
                ya1 ya1Var = (ya1) this.c;
                yb1Var2.H = ya1Var;
                yb1Var2.K = ya1Var;
                yb1Var2.e(true);
                return;
            case 10:
                MessagesStorage messagesStorage = (MessagesStorage) this.b;
                db1 db1Var = (db1) this.c;
                Object[] widgetState = messagesStorage.getWidgetState(db1Var.c, db1Var.d);
                ArrayList arrayList5 = (ArrayList) widgetState[1];
                if (!arrayList5.isEmpty()) {
                    String a2 = db1Var.a();
                    ConcurrentHashMap concurrentHashMap = fb1.b;
                    eb1 eb1Var = (eb1) concurrentHashMap.get(a2);
                    if (eb1Var == null) {
                        eb1Var = new eb1();
                        eb1 eb1Var2 = (eb1) concurrentHashMap.putIfAbsent(a2, eb1Var);
                        if (eb1Var2 != null) {
                            eb1Var = eb1Var2;
                        }
                    }
                    synchronized (eb1Var) {
                        if (eb1Var.a.isEmpty()) {
                            while (i12 < arrayList5.size() && i12 < 4) {
                                eb1Var.a.add((int[]) arrayList5.get(i12));
                                i12++;
                            }
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new c71(11, db1Var, widgetState));
                return;
            case 11:
                db1 db1Var2 = (db1) this.b;
                String str3 = (String) ((Object[]) this.c)[0];
                HashMap hashMap2 = fb1.c;
                db1Var2.o = true;
                String a10 = db1Var2.a();
                if (str3 != null && !hashMap2.containsKey(a10)) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("local", new JSONObject(str3));
                        hashMap2.put(a10, jSONObject);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                jb1 jb1Var = db1Var2.i;
                if (jb1Var != null) {
                    JSONObject jSONObject2 = (JSONObject) hashMap2.get(a10);
                    try {
                        str = LocaleController.getInstance().getCurrentLocale().toLanguageTag();
                    } catch (Exception unused) {
                        str = null;
                    }
                    String jSONObject3 = jSONObject2 != null ? jSONObject2.toString() : null;
                    jb1Var.t = str;
                    jb1Var.u = jSONObject3;
                }
                an0 an0Var = db1Var2.j;
                if (an0Var != null && (jb1Var == null || jb1Var.i <= 0)) {
                    an0Var.l("cached heights read");
                }
                if (db1Var2.p) {
                    db1Var2.p = false;
                    if (db1Var2.m > 0 && jb1Var != null) {
                        fb1.p(db1Var2);
                    }
                }
                fb1.j();
                return;
            case 12:
                yb1 yb1Var3 = (yb1) this.b;
                yb1Var3.L = ((Exception) this.c).toString();
                if (yb1Var3.s || (xb1Var = yb1Var3.H) == null) {
                    return;
                }
                xb1Var.c(yb1Var3.L);
                return;
            case 13:
                ((org.telegram.ui.Components.voip.k) this.b).a.setOnClickListener((View.OnClickListener) this.c);
                return;
            case 14:
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) this.b;
                Bitmap bitmap4 = (Bitmap) this.c;
                HashMap<String, Bitmap> hashMap3 = tVar.F.thumbs;
                ChatObject.VideoParticipant videoParticipant = tVar.w;
                boolean z10 = videoParticipant.presentation;
                TLRPC.GroupCallParticipant groupCallParticipant = videoParticipant.participant;
                hashMap3.put(z10 ? groupCallParticipant.presentationEndpoint : groupCallParticipant.videoEndpoint, bitmap4);
                return;
            case 15:
                org.telegram.ui.Components.voip.l0 l0Var = (org.telegram.ui.Components.voip.l0) this.b;
                org.telegram.ui.Components.voip.t tVar2 = (org.telegram.ui.Components.voip.t) this.c;
                l0Var.getClass();
                tVar2.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setListener(new org.telegram.ui.Components.voip.y(tVar2)).setDuration(150L).start();
                return;
            case 16:
                mm0 mm0Var2 = (mm0) this.b;
                Object obj = this.c;
                if (mm0Var2 != null) {
                    mm0Var2.setOnItemClickListener((zl0) obj);
                    return;
                }
                return;
            case 17:
                org.telegram.ui.mt mtVar = (org.telegram.ui.mt) this.b;
                String str4 = "";
                String lowerCase = ((String) this.c).trim().toLowerCase();
                int i16 = 18;
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new c71(i16, mtVar, new ArrayList()));
                    return;
                }
                String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = mtVar.f;
                int size = arrayList7.size();
                while (i12 < size) {
                    Object obj2 = arrayList7.get(i12);
                    int i17 = i12 + 1;
                    org.telegram.ui.jt jtVar = (org.telegram.ui.jt) obj2;
                    String str5 = jtVar.a;
                    if (str5 == null) {
                        str5 = str4;
                    }
                    String lowerCase2 = str5.toLowerCase();
                    String lowerCase3 = AndroidUtilities.translitSafe(jtVar.a).toLowerCase();
                    String str6 = jtVar.b;
                    if (str6 == null) {
                        str6 = str4;
                    }
                    String lowerCase4 = str6.toLowerCase();
                    String lowerCase5 = AndroidUtilities.translitSafe(jtVar.b).toLowerCase();
                    String str7 = jtVar.c;
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
                        if (!lowerCase2.contains(" ".concat(lowerCase)) && !lowerCase3.startsWith(translitSafe) && !org.telegram.messenger.vh.u(" ", translitSafe, lowerCase3) && !lowerCase4.startsWith(lowerCase) && !lowerCase4.contains(" ".concat(lowerCase)) && !lowerCase5.startsWith(translitSafe) && !org.telegram.messenger.vh.u(" ", translitSafe, lowerCase5) && !str7.startsWith(lowerCase) && !str4.startsWith(lowerCase)) {
                            str4 = str2;
                            i12 = i11;
                        }
                    }
                    arrayList6.add(jtVar);
                    str4 = str2;
                    i12 = i11;
                }
                AndroidUtilities.runOnUIThread(new c71(18, mtVar, arrayList6));
                return;
            case 18:
                org.telegram.ui.mt mtVar2 = (org.telegram.ui.mt) this.b;
                ArrayList arrayList8 = (ArrayList) this.c;
                org.telegram.ui.ot otVar = mtVar2.h;
                if (otVar.f) {
                    mtVar2.e = arrayList8;
                    if (otVar.e && (mm0Var = otVar.a) != null) {
                        s4.h0 adapter = mm0Var.getAdapter();
                        org.telegram.ui.mt mtVar3 = otVar.d;
                        if (adapter != mtVar3) {
                            otVar.a.setAdapter(mtVar3);
                            otVar.a.setFastScrollVisible(false);
                        }
                    }
                    mtVar2.l();
                    return;
                }
                return;
            case 19:
                MessagesController.getInstance(((org.telegram.ui.rt) this.b).currentAccount).lambda$processUpdates$379((TLRPC.Updates) this.c, false);
                return;
            case 20:
                org.telegram.ui.cy.d0((org.telegram.ui.cy) this.b, (String) this.c);
                return;
            case 21:
                hi.m3.j(((org.telegram.ui.cy) this.b).currentAccount, ((TLRPC.TL_attachMenuBot) this.c).bot_id, null);
                return;
            case 22:
                org.telegram.ui.cy cyVar = (org.telegram.ui.cy) this.b;
                org.telegram.ui.ActionBar.k3[] k3VarArr = (org.telegram.ui.ActionBar.k3[]) this.c;
                org.telegram.ui.ActionBar.k3 k3Var = k3VarArr[0];
                if (k3Var != null) {
                    k3Var.dismiss();
                    k3VarArr[0] = null;
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.cv(cyVar, 25), 300L);
                return;
            case 23:
                org.telegram.ui.cy cyVar2 = (org.telegram.ui.cy) this.b;
                cyVar2.getMessagesController().addDialogToFolder((ArrayList) this.c, (cyVar2.W2 == 0 && cyVar2.Y2 == 0) ? 0 : 1, -1, null, 0L);
                return;
            case 24:
                org.telegram.ui.kw kwVar = (org.telegram.ui.kw) this.b;
                CharSequence charSequence = (CharSequence) this.c;
                org.telegram.ui.cy cyVar3 = kwVar.a;
                cyVar3.H2 = null;
                qr0 qr0Var = cyVar3.G2;
                if (qr0Var == null || !qr0Var.h) {
                    return;
                }
                qr0Var.e(charSequence, false);
                return;
            case 25:
                org.telegram.ui.yw ywVar = (org.telegram.ui.yw) this.b;
                org.telegram.ui.ActionBar.r2[] r2VarArr = (org.telegram.ui.ActionBar.r2[]) this.c;
                ywVar.b.removeSelfFromStack();
                if (r2VarArr[1] == null) {
                    r2VarArr[0].finishFragment();
                    return;
                } else {
                    r2VarArr[0].removeSelfFromStack();
                    r2VarArr[1].finishFragment();
                    return;
                }
            case 26:
                org.telegram.ui.rx rxVar = (org.telegram.ui.rx) this.b;
                ArrayList arrayList9 = (ArrayList) this.c;
                org.telegram.ui.cy cyVar4 = rxVar.b;
                cyVar4.z3 = 2;
                cyVar4.I4(true, true);
                cyVar4.w3();
                while (i12 < arrayList9.size()) {
                    long j10 = ((TLRPC.Dialog) arrayList9.get(i12)).id;
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList9.get(i12);
                    if (cyVar4.getMessagesController().isForum(j10) || cyVar4.getMessagesController().isMonoForumWithManageRights(j10)) {
                        cyVar4.getMessagesController().markAllTopicsAsRead(j10);
                    }
                    cyVar4.getMessagesController().markMentionsAsRead(j10, 0L);
                    MessagesController messagesController = cyVar4.getMessagesController();
                    int i18 = dialog.top_message;
                    messagesController.markDialogAsRead(j10, i18, i18, dialog.last_message_date, false, 0L, 0, true, 0);
                    i12++;
                }
                return;
            case 27:
                ((org.telegram.ui.rx) this.b).d((MessagesController.DialogFilter) this.c);
                return;
            case 28:
                org.telegram.ui.oy oyVar = (org.telegram.ui.oy) this.b;
                MessageObject messageObject = (MessageObject) this.c;
                org.telegram.ui.un unVar = oyVar.a;
                cz0 cz0Var = new cz0(unVar.getParentActivity(), oyVar.a, messageObject.getInputStickerSet(), null, unVar.Y, unVar.getResourceProvider());
                cz0Var.setCalcMandatoryInsets(unVar.F9());
                unVar.showDialog(cz0Var);
                return;
            default:
                org.telegram.ui.jz jzVar = (org.telegram.ui.jz) this.b;
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) this.c;
                jzVar.getClass();
                e2Var.dismiss();
                org.telegram.ui.kz kzVar = jzVar.E;
                org.telegram.ui.lz lzVar = kzVar.c;
                Utilities.Callback callback = lzVar.w;
                if (callback != null) {
                    callback.run(lzVar.d);
                }
                kzVar.c.finishFragment();
                return;
        }
    }
}
