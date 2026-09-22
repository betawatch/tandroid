package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.ValueCallback;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class yn0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yn0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int indexOf;
        int L;
        int i10;
        int i11;
        int i12 = 8;
        ArrayList arrayList = null;
        int i13 = 1;
        switch (this.a) {
            case 0:
                go0 go0Var = (go0) this.b;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) this.c;
                ArrayList arrayList2 = go0Var.K;
                if (!arrayList2.isEmpty() && (indexOf = arrayList2.indexOf(tL_sponsoredPeer)) >= 0 && (L = go0Var.L()) < go0Var.h()) {
                    arrayList2.remove(indexOf);
                    go0Var.u(L + 1 + indexOf);
                    int size = go0Var.j0.e.size();
                    int size2 = arrayList2.size();
                    if (go0Var.G0) {
                        size = Math.min(3, size);
                    }
                    if (size2 + size <= 0) {
                        go0Var.u(L);
                        break;
                    }
                }
                break;
            case 1:
                go0 go0Var2 = (go0) this.b;
                org.telegram.ui.uy uyVar = (org.telegram.ui.uy) this.c;
                go0Var2.T();
                xc.a0(uyVar).c(LocaleController.getString(R.string.AdHidden)).j();
                break;
            case 2:
                ((ro0) this.b).sendAccessibilityEvent((View) this.c, 4);
                break;
            case 3:
                ef efVar = (ef) this.b;
                org.telegram.ui.zn znVar = (org.telegram.ui.zn) this.c;
                if (znVar != null) {
                    znVar.presentFragment(new PremiumPreviewFragment(0, "select_sender"));
                    efVar.dismiss();
                    break;
                }
                break;
            case 4:
                ((WindowManager) this.c).removeView(((ef) this.b).B);
                break;
            case 5:
                wq0 wq0Var = (wq0) this.b;
                TLObject tLObject = (TLObject) this.c;
                if (tLObject != null) {
                    wq0Var.k0 = (TLRPC.TL_exportedMessageLink) tLObject;
                    wq0Var.Z0();
                    if (wq0Var.m0) {
                        wq0Var.M0();
                    }
                }
                wq0Var.l0 = false;
                break;
            case 6:
                eu0 eu0Var = (eu0) this.b;
                dr0 dr0Var = (dr0) this.c;
                eu0Var.G = null;
                eu0Var.H = null;
                dr0Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(220L).setListener(new gd0(dr0Var, 14)).start();
                break;
            case 7:
                lv0 lv0Var = (lv0) this.b;
                ai.e9 e9Var = (ai.e9) this.c;
                gs0 gs0Var = lv0Var.W;
                if (gs0Var != null) {
                    int i14 = e9Var.a;
                    gs0Var.n.d(i14, gs0Var.s.i(i14));
                    break;
                }
                break;
            case 8:
                xc.a0(((ut0) this.b).f.v1).Q(R.raw.contact_check, 36, LocaleController.formatString(R.string.YouJoinedChannel, ((TLRPC.Chat) this.c).title)).k(true);
                break;
            case 9:
                hu0 hu0Var = (hu0) this.b;
                String str = (String) this.c;
                if (!hu0Var.v.t1[hu0Var.r].a.isEmpty() && ((i10 = hu0Var.r) == 1 || i10 == 4)) {
                    MessageObject messageObject = (MessageObject) hg.k0.g(1, hu0Var.v.t1[i10].a);
                    int id2 = messageObject.getId();
                    long dialogId = messageObject.getDialogId();
                    lv0 lv0Var2 = hu0Var.v;
                    hu0Var.F(id2, str, dialogId, lv0Var2.j1 == lv0Var2.v1.getUserConfig().getClientUserId() ? messageObject.getSavedDialogId() : 0L);
                } else if (hu0Var.r == 3) {
                    lv0 lv0Var3 = hu0Var.v;
                    hu0Var.F(0, str, lv0Var3.j1, lv0Var3.F);
                }
                int i15 = hu0Var.r;
                if (i15 == 1 || i15 == 4) {
                    ArrayList arrayList3 = new ArrayList(hu0Var.v.t1[hu0Var.r].a);
                    hu0Var.s++;
                    Utilities.searchQueue.postRunnable(new en0((Object) hu0Var, (Serializable) str, arrayList3, i12));
                    break;
                }
                break;
            case 10:
                hu0 hu0Var2 = (hu0) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                lv0 lv0Var4 = hu0Var2.v;
                boolean z10 = lv0Var4.V0;
                eu0[] eu0VarArr = lv0Var4.k0;
                if (z10) {
                    hu0Var2.s--;
                    int h = hu0Var2.h();
                    hu0Var2.d = arrayList4;
                    int h10 = hu0Var2.h();
                    if (hu0Var2.s == 0 || h10 != 0) {
                        lv0Var4.m1(false);
                    }
                    for (int i16 = 0; i16 < eu0VarArr.length; i16++) {
                        eu0 eu0Var2 = eu0VarArr[i16];
                        if (eu0Var2.F == hu0Var2.r) {
                            if (hu0Var2.s == 0 && h10 == 0) {
                                eu0Var2.w.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
                                eu0VarArr[i16].w.f.setVisibility(8);
                                eu0VarArr[i16].w.e(false, true);
                            } else if (h == 0) {
                                lv0Var4.z(eu0Var2.h, 0, null);
                            }
                        }
                    }
                    hu0Var2.l();
                    break;
                }
                break;
            case 11:
                TLObject tLObject2 = (TLObject) this.b;
                TLRPC.Document document = (TLRPC.Document) this.c;
                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                int i17 = NotificationCenter.customStickerCreated;
                Boolean bool = Boolean.FALSE;
                notificationCenter.postNotificationNameOnUIThread(i17, bool, tLObject2, document, null, bool);
                break;
            case 12:
                MessagesController.getInstance(((vy0) this.b).a.a).updateEmojiStatus((TLRPC.EmojiStatus) this.c);
                break;
            case 13:
                n31 n31Var = (n31) this.b;
                MessagesController.getInstance(n31Var.b).getTopicsController().deleteTopics(-n31Var.c, (ArrayList) this.c);
                int i18 = n31.f0;
                break;
            case 14:
                n31 n31Var2 = (n31) this.b;
                TLRPC.Updates updates = (TLRPC.Updates) this.c;
                n31Var2.getClass();
                MessagesController.getInstance(n31Var2.b).loadFullChat(updates.chats.get(0).id, 0, true);
                break;
            case 15:
                org.telegram.ui.Cells.l1 l1Var = (org.telegram.ui.Cells.l1) this.b;
                TLRPC.TL_messages_transcribedAudio tL_messages_transcribedAudio = (TLRPC.TL_messages_transcribedAudio) this.c;
                if (l1Var != null) {
                    l1Var.d0(tL_messages_transcribedAudio.trial_remains_num > 0 ? 1 : 2);
                    break;
                }
                break;
            case 16:
                l41.o((l41) this.b, (TLObject) this.c);
                break;
            case 17:
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.b;
                String str2 = (String) this.c;
                if (callback2 != null) {
                    callback2.run(str2, Boolean.FALSE);
                    break;
                }
                break;
            case 18:
                org.telegram.ui.zk zkVar = (org.telegram.ui.zk) this.b;
                ((org.telegram.ui.ActionBar.n1) this.c).d(true);
                c51.a(zkVar.getContext(), zkVar.d);
                break;
            case 19:
                ((TranslateController) this.c).setHideTranslateDialog(((org.telegram.ui.zk) this.b).b, false);
                break;
            case 20:
                UndoView undoView = (UndoView) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                if (tLObject3 instanceof TLRPC.PaymentReceipt) {
                    undoView.s.presentFragment(new org.telegram.ui.xo0((TLRPC.PaymentReceipt) tLObject3));
                    break;
                } else {
                    int i19 = UndoView.e0;
                    undoView.getClass();
                    break;
                }
            case 21:
                ((y51) this.b).D.onClick((org.telegram.ui.Cells.w8) this.c);
                break;
            case 22:
                v71 v71Var = (v71) this.b;
                b2.u0 u0Var = (b2.u0) this.c;
                Throwable cause = u0Var.getCause();
                if (!(cause instanceof r2.n) || (!cause.toString().contains("av1") && !cause.toString().contains("av01"))) {
                    TextureView textureView = v71Var.n;
                    if (textureView == null || ((v71Var.E || !(cause instanceof r2.p)) && !(cause instanceof a3.x))) {
                        v71Var.J.onError(v71Var, u0Var);
                        break;
                    } else {
                        v71Var.E = true;
                        if (v71Var.d != null) {
                            ViewGroup viewGroup = (ViewGroup) textureView.getParent();
                            if (viewGroup != null) {
                                int indexOfChild = viewGroup.indexOfChild(v71Var.n);
                                viewGroup.removeView(v71Var.n);
                                viewGroup.addView(v71Var.n, indexOfChild);
                            }
                            DispatchQueue dispatchQueue = v71Var.b;
                            if (dispatchQueue != null) {
                                dispatchQueue.postRunnable(new j71(v71Var, i13));
                                break;
                            } else {
                                i2.e0 e0Var = v71Var.d;
                                TextureView textureView2 = v71Var.n;
                                e0Var.B1();
                                if (textureView2 != null && textureView2 == e0Var.V) {
                                    e0Var.B1();
                                    e0Var.o1();
                                    e0Var.t1(null);
                                    e0Var.m1(0, 0);
                                }
                                v71Var.d.v1(v71Var.n);
                                ArrayList arrayList5 = v71Var.N;
                                if (arrayList5 != null) {
                                    v71Var.F(arrayList5, v71Var.O);
                                } else if (v71Var.U) {
                                    v71Var.G(v71Var.Q, v71Var.S, v71Var.R, v71Var.T);
                                } else {
                                    v71Var.D(v71Var.Q, v71Var.S);
                                }
                                v71Var.C();
                                break;
                            }
                        }
                    }
                } else {
                    FileLog.e(u0Var);
                    FileLog.e("av1 codec failed, we think this codec is not supported");
                    MessagesController.getGlobalMainSettings().edit().putBoolean("unsupport_video/av01", true).commit();
                    HashMap hashMap = v71.l0;
                    if (hashMap != null) {
                        hashMap.clear();
                    }
                    ArrayList arrayList6 = v71Var.N;
                    if (arrayList6 != null) {
                        int i20 = 0;
                        while (i20 < arrayList6.size()) {
                            r71 r71Var = (r71) arrayList6.get(i20);
                            int i21 = 0;
                            while (true) {
                                ArrayList arrayList7 = r71Var.d;
                                if (i21 < arrayList7.size()) {
                                    t71 t71Var = (t71) arrayList7.get(i21);
                                    if (!TextUtils.isEmpty(t71Var.m) && !v71.Y(t71Var.m)) {
                                        arrayList7.remove(i21);
                                        i21--;
                                    }
                                    i21++;
                                } else {
                                    if (arrayList7.isEmpty()) {
                                        arrayList6.remove(i20);
                                        i20--;
                                    }
                                    i20++;
                                }
                            }
                        }
                        arrayList = arrayList6;
                    }
                    v71Var.N = arrayList;
                    if (arrayList != null) {
                        v71Var.F(arrayList, v71Var.O);
                        break;
                    }
                }
                break;
            case 23:
                ((u71) this.b).f.K.onVisualizerUpdate(true, true, (float[]) this.c);
                break;
            case 24:
                d81 d81Var = (d81) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                if (bitmap != null) {
                    if (d81Var.w != null) {
                        Bitmap bitmap2 = d81Var.v;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        d81Var.v = d81Var.w;
                    }
                    d81Var.w = bitmap;
                    Bitmap bitmap3 = d81Var.w;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                    d81Var.G = bitmapShader;
                    bitmapShader.setLocalMatrix(d81Var.L);
                    d81Var.J.setShader(d81Var.G);
                    d81Var.invalidate();
                    int dp = AndroidUtilities.dp(150.0f);
                    float width = bitmap.getWidth() / bitmap.getHeight();
                    if (width > 1.0f) {
                        i11 = (int) (dp / width);
                    } else {
                        dp = (int) (dp * width);
                        i11 = dp;
                    }
                    ViewGroup.LayoutParams layoutParams = d81Var.getLayoutParams();
                    if (d81Var.getVisibility() != 0 || layoutParams.width != dp || layoutParams.height != i11) {
                        layoutParams.width = dp;
                        layoutParams.height = i11;
                        d81Var.setVisibility(0);
                        d81Var.requestLayout();
                    }
                }
                d81Var.f = null;
                break;
            case 25:
                final q91 q91Var = (q91) this.b;
                q91Var.e.b.evaluateJavascript((String) this.c, new ValueCallback() { // from class: org.telegram.ui.Components.p91
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(Object obj) {
                        String str3 = (String) obj;
                        q91 q91Var2 = q91.this;
                        String[] strArr = q91Var2.c;
                        strArr[0] = strArr[0].replace(q91Var2.d, "/signature/" + str3.substring(1, str3.length() - 1));
                        q91Var2.b.countDown();
                    }
                });
                break;
            case 26:
                ((org.telegram.ui.Components.voip.k) this.b).a.setOnClickListener((View.OnClickListener) this.c);
                break;
            case 27:
                org.telegram.ui.Components.voip.u uVar = (org.telegram.ui.Components.voip.u) this.b;
                Bitmap bitmap4 = (Bitmap) this.c;
                HashMap<String, Bitmap> hashMap2 = uVar.F.thumbs;
                ChatObject.VideoParticipant videoParticipant = uVar.w;
                boolean z11 = videoParticipant.presentation;
                TLRPC.GroupCallParticipant groupCallParticipant = videoParticipant.participant;
                hashMap2.put(z11 ? groupCallParticipant.presentationEndpoint : groupCallParticipant.videoEndpoint, bitmap4);
                break;
            case 28:
                org.telegram.ui.Components.voip.m0 m0Var = (org.telegram.ui.Components.voip.m0) this.b;
                org.telegram.ui.Components.voip.u uVar2 = (org.telegram.ui.Components.voip.u) this.c;
                m0Var.getClass();
                uVar2.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setListener(new org.telegram.ui.Components.voip.z(uVar2)).setDuration(150L).start();
                break;
            default:
                yl0 yl0Var = (yl0) this.b;
                Object obj = this.c;
                if (yl0Var != null) {
                    yl0Var.setOnItemClickListener((ml0) obj);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ yn0(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }
}
