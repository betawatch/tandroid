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

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final /* synthetic */ class vo0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vo0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11;
        ArrayList arrayList;
        zl0 zl0Var;
        int i12 = 8;
        int i13 = 3;
        ArrayList arrayList2 = null;
        int i14 = 0;
        switch (this.a) {
            case 0:
                ((wo0) this.b).sendAccessibilityEvent((View) this.c, 4);
                break;
            case 1:
                gf gfVar = (gf) this.b;
                org.telegram.ui.yn ynVar = (org.telegram.ui.yn) this.c;
                if (ynVar != null) {
                    ynVar.presentFragment(new PremiumPreviewFragment(0, "select_sender"));
                    gfVar.dismiss();
                    break;
                }
                break;
            case 2:
                ((WindowManager) this.c).removeView(((gf) this.b).B);
                break;
            case 3:
                br0 br0Var = (br0) this.b;
                TLObject tLObject = (TLObject) this.c;
                if (tLObject != null) {
                    br0Var.k0 = (TLRPC.TL_exportedMessageLink) tLObject;
                    br0Var.W0();
                    if (br0Var.m0) {
                        br0Var.J0();
                    }
                }
                br0Var.l0 = false;
                break;
            case 4:
                ju0 ju0Var = (ju0) this.b;
                hr0 hr0Var = (hr0) this.c;
                ju0Var.G = null;
                ju0Var.H = null;
                hr0Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(220L).setListener(new hd0(hr0Var, 14)).start();
                break;
            case 5:
                qv0 qv0Var = (qv0) this.b;
                ai.e9 e9Var = (ai.e9) this.c;
                ls0 ls0Var = qv0Var.W;
                if (ls0Var != null) {
                    int i15 = e9Var.a;
                    ls0Var.n.d(i15, ls0Var.s.i(i15));
                    break;
                }
                break;
            case 6:
                yc.a0(((zt0) this.b).f.v1).Q(R.raw.contact_check, 36, LocaleController.formatString(R.string.YouJoinedChannel, ((TLRPC.Chat) this.c).title)).k(true);
                break;
            case 7:
                mu0 mu0Var = (mu0) this.b;
                String str = (String) this.c;
                if (!mu0Var.v.t1[mu0Var.r].a.isEmpty() && ((i10 = mu0Var.r) == 1 || i10 == 4)) {
                    MessageObject messageObject = (MessageObject) hg.c.g(1, mu0Var.v.t1[i10].a);
                    int id2 = messageObject.getId();
                    long dialogId = messageObject.getDialogId();
                    qv0 qv0Var2 = mu0Var.v;
                    mu0Var.F(id2, str, dialogId, qv0Var2.j1 == qv0Var2.v1.getUserConfig().getClientUserId() ? messageObject.getSavedDialogId() : 0L);
                } else if (mu0Var.r == 3) {
                    qv0 qv0Var3 = mu0Var.v;
                    mu0Var.F(0, str, qv0Var3.j1, qv0Var3.F);
                }
                int i16 = mu0Var.r;
                if (i16 == 1 || i16 == 4) {
                    ArrayList arrayList3 = new ArrayList(mu0Var.v.t1[mu0Var.r].a);
                    mu0Var.s++;
                    Utilities.searchQueue.postRunnable(new in0((Object) mu0Var, (Serializable) str, arrayList3, i12));
                    break;
                }
                break;
            case 8:
                mu0 mu0Var2 = (mu0) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                qv0 qv0Var4 = mu0Var2.v;
                boolean z10 = qv0Var4.V0;
                ju0[] ju0VarArr = qv0Var4.k0;
                if (z10) {
                    mu0Var2.s--;
                    int h = mu0Var2.h();
                    mu0Var2.d = arrayList4;
                    int h10 = mu0Var2.h();
                    if (mu0Var2.s == 0 || h10 != 0) {
                        qv0Var4.m1(false);
                    }
                    for (int i17 = 0; i17 < ju0VarArr.length; i17++) {
                        ju0 ju0Var2 = ju0VarArr[i17];
                        if (ju0Var2.F == mu0Var2.r) {
                            if (mu0Var2.s == 0 && h10 == 0) {
                                ju0Var2.w.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
                                ju0VarArr[i17].w.f.setVisibility(8);
                                ju0VarArr[i17].w.e(false, true);
                            } else if (h == 0) {
                                qv0Var4.z(ju0Var2.h, 0, null);
                            }
                        }
                    }
                    mu0Var2.l();
                    break;
                }
                break;
            case 9:
                TLObject tLObject2 = (TLObject) this.b;
                TLRPC.Document document = (TLRPC.Document) this.c;
                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                int i18 = NotificationCenter.customStickerCreated;
                Boolean bool = Boolean.FALSE;
                notificationCenter.postNotificationNameOnUIThread(i18, bool, tLObject2, document, null, bool);
                break;
            case 10:
                MessagesController.getInstance(((ez0) this.b).a.a).updateEmojiStatus((TLRPC.EmojiStatus) this.c);
                break;
            case 11:
                w31 w31Var = (w31) this.b;
                MessagesController.getInstance(w31Var.b).getTopicsController().deleteTopics(-w31Var.c, (ArrayList) this.c);
                int i19 = w31.f0;
                break;
            case 12:
                w31 w31Var2 = (w31) this.b;
                TLRPC.Updates updates = (TLRPC.Updates) this.c;
                w31Var2.getClass();
                MessagesController.getInstance(w31Var2.b).loadFullChat(updates.chats.get(0).id, 0, true);
                break;
            case 13:
                org.telegram.ui.Cells.l1 l1Var = (org.telegram.ui.Cells.l1) this.b;
                TLRPC.TL_messages_transcribedAudio tL_messages_transcribedAudio = (TLRPC.TL_messages_transcribedAudio) this.c;
                if (l1Var != null) {
                    l1Var.e0(tL_messages_transcribedAudio.trial_remains_num > 0 ? 1 : 2);
                    break;
                }
                break;
            case 14:
                u41.o((u41) this.b, (TLObject) this.c);
                break;
            case 15:
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.b;
                String str2 = (String) this.c;
                if (callback2 != null) {
                    callback2.run(str2, Boolean.FALSE);
                    break;
                }
                break;
            case 16:
                org.telegram.ui.wk wkVar = (org.telegram.ui.wk) this.b;
                ((org.telegram.ui.ActionBar.n1) this.c).d(true);
                l51.a(wkVar.getContext(), wkVar.d);
                break;
            case 17:
                ((TranslateController) this.c).setHideTranslateDialog(((org.telegram.ui.wk) this.b).b, false);
                break;
            case 18:
                UndoView undoView = (UndoView) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                if (tLObject3 instanceof TLRPC.PaymentReceipt) {
                    undoView.s.presentFragment(new org.telegram.ui.so0((TLRPC.PaymentReceipt) tLObject3));
                    break;
                } else {
                    int i20 = UndoView.e0;
                    undoView.getClass();
                    break;
                }
            case 19:
                ((h61) this.b).D.onClick((org.telegram.ui.Cells.v8) this.c);
                break;
            case 20:
                e81 e81Var = (e81) this.b;
                b2.u0 u0Var = (b2.u0) this.c;
                Throwable cause = u0Var.getCause();
                if (!(cause instanceof r2.n) || (!cause.toString().contains("av1") && !cause.toString().contains("av01"))) {
                    TextureView textureView = e81Var.n;
                    if (textureView == null || ((e81Var.E || !(cause instanceof r2.p)) && !(cause instanceof a3.x))) {
                        e81Var.J.onError(e81Var, u0Var);
                        break;
                    } else {
                        e81Var.E = true;
                        if (e81Var.d != null) {
                            ViewGroup viewGroup = (ViewGroup) textureView.getParent();
                            if (viewGroup != null) {
                                int indexOfChild = viewGroup.indexOfChild(e81Var.n);
                                viewGroup.removeView(e81Var.n);
                                viewGroup.addView(e81Var.n, indexOfChild);
                            }
                            DispatchQueue dispatchQueue = e81Var.b;
                            if (dispatchQueue != null) {
                                dispatchQueue.postRunnable(new q61(e81Var, i13));
                                break;
                            } else {
                                i2.f0 f0Var = e81Var.d;
                                TextureView textureView2 = e81Var.n;
                                f0Var.B1();
                                if (textureView2 != null && textureView2 == f0Var.V) {
                                    f0Var.B1();
                                    f0Var.o1();
                                    f0Var.t1(null);
                                    f0Var.m1(0, 0);
                                }
                                e81Var.d.v1(e81Var.n);
                                ArrayList arrayList5 = e81Var.N;
                                if (arrayList5 != null) {
                                    e81Var.F(arrayList5, e81Var.O);
                                } else if (e81Var.U) {
                                    e81Var.G(e81Var.Q, e81Var.S, e81Var.R, e81Var.T);
                                } else {
                                    e81Var.D(e81Var.Q, e81Var.S);
                                }
                                e81Var.C();
                                break;
                            }
                        }
                    }
                } else {
                    FileLog.e(u0Var);
                    FileLog.e("av1 codec failed, we think this codec is not supported");
                    MessagesController.getGlobalMainSettings().edit().putBoolean("unsupport_video/av01", true).commit();
                    HashMap hashMap = e81.l0;
                    if (hashMap != null) {
                        hashMap.clear();
                    }
                    ArrayList arrayList6 = e81Var.N;
                    if (arrayList6 != null) {
                        int i21 = 0;
                        while (i21 < arrayList6.size()) {
                            a81 a81Var = (a81) arrayList6.get(i21);
                            int i22 = 0;
                            while (true) {
                                ArrayList arrayList7 = a81Var.d;
                                if (i22 < arrayList7.size()) {
                                    c81 c81Var = (c81) arrayList7.get(i22);
                                    if (!TextUtils.isEmpty(c81Var.m) && !e81.Y(c81Var.m)) {
                                        arrayList7.remove(i22);
                                        i22--;
                                    }
                                    i22++;
                                } else {
                                    if (arrayList7.isEmpty()) {
                                        arrayList6.remove(i21);
                                        i21--;
                                    }
                                    i21++;
                                }
                            }
                        }
                        arrayList2 = arrayList6;
                    }
                    e81Var.N = arrayList2;
                    if (arrayList2 != null) {
                        e81Var.F(arrayList2, e81Var.O);
                        break;
                    }
                }
                break;
            case 21:
                ((d81) this.b).f.K.onVisualizerUpdate(true, true, (float[]) this.c);
                break;
            case 22:
                l81 l81Var = (l81) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                if (bitmap != null) {
                    if (l81Var.w != null) {
                        Bitmap bitmap2 = l81Var.v;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        l81Var.v = l81Var.w;
                    }
                    l81Var.w = bitmap;
                    Bitmap bitmap3 = l81Var.w;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                    l81Var.G = bitmapShader;
                    bitmapShader.setLocalMatrix(l81Var.L);
                    l81Var.J.setShader(l81Var.G);
                    l81Var.invalidate();
                    int dp = AndroidUtilities.dp(150.0f);
                    float width = bitmap.getWidth() / bitmap.getHeight();
                    if (width > 1.0f) {
                        i11 = (int) (dp / width);
                    } else {
                        dp = (int) (dp * width);
                        i11 = dp;
                    }
                    ViewGroup.LayoutParams layoutParams = l81Var.getLayoutParams();
                    if (l81Var.getVisibility() != 0 || layoutParams.width != dp || layoutParams.height != i11) {
                        layoutParams.width = dp;
                        layoutParams.height = i11;
                        l81Var.setVisibility(0);
                        l81Var.requestLayout();
                    }
                }
                l81Var.f = null;
                break;
            case 23:
                final z91 z91Var = (z91) this.b;
                z91Var.e.b.evaluateJavascript((String) this.c, new ValueCallback() { // from class: org.telegram.ui.Components.y91
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(Object obj) {
                        String str3 = (String) obj;
                        z91 z91Var2 = z91.this;
                        String[] strArr = z91Var2.c;
                        strArr[0] = strArr[0].replace(z91Var2.d, "/signature/" + str3.substring(1, str3.length() - 1));
                        z91Var2.b.countDown();
                    }
                });
                break;
            case 24:
                ((org.telegram.ui.Components.voip.k) this.b).a.setOnClickListener((View.OnClickListener) this.c);
                break;
            case 25:
                org.telegram.ui.Components.voip.u uVar = (org.telegram.ui.Components.voip.u) this.b;
                Bitmap bitmap4 = (Bitmap) this.c;
                HashMap<String, Bitmap> hashMap2 = uVar.F.thumbs;
                ChatObject.VideoParticipant videoParticipant = uVar.w;
                boolean z11 = videoParticipant.presentation;
                TLRPC.GroupCallParticipant groupCallParticipant = videoParticipant.participant;
                hashMap2.put(z11 ? groupCallParticipant.presentationEndpoint : groupCallParticipant.videoEndpoint, bitmap4);
                break;
            case 26:
                org.telegram.ui.Components.voip.m0 m0Var = (org.telegram.ui.Components.voip.m0) this.b;
                org.telegram.ui.Components.voip.u uVar2 = (org.telegram.ui.Components.voip.u) this.c;
                m0Var.getClass();
                uVar2.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setListener(new org.telegram.ui.Components.voip.z(uVar2)).setDuration(150L).start();
                break;
            case 27:
                zl0 zl0Var2 = (zl0) this.b;
                Object obj = this.c;
                if (zl0Var2 != null) {
                    zl0Var2.setOnItemClickListener((ml0) obj);
                    break;
                }
                break;
            case 28:
                org.telegram.ui.xt xtVar = (org.telegram.ui.xt) this.b;
                String lowerCase = ((String) this.c).trim().toLowerCase();
                int i23 = 29;
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new vo0(i23, xtVar, new ArrayList()));
                    break;
                } else {
                    String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                    ArrayList arrayList8 = new ArrayList();
                    ArrayList arrayList9 = xtVar.f;
                    int size = arrayList9.size();
                    while (i14 < size) {
                        Object obj2 = arrayList9.get(i14);
                        i14++;
                        org.telegram.ui.ut utVar = (org.telegram.ui.ut) obj2;
                        String str3 = utVar.a;
                        if (str3 == null) {
                            str3 = "";
                        }
                        String lowerCase2 = str3.toLowerCase();
                        String lowerCase3 = AndroidUtilities.translitSafe(utVar.a).toLowerCase();
                        String str4 = utVar.b;
                        if (str4 == null) {
                            str4 = "";
                        }
                        String lowerCase4 = str4.toLowerCase();
                        String lowerCase5 = AndroidUtilities.translitSafe(utVar.b).toLowerCase();
                        String str5 = utVar.c;
                        if (str5 == null) {
                            str5 = "";
                        }
                        String concat = TextUtils.isEmpty(str5) ? "" : "+".concat(str5);
                        if (lowerCase2.startsWith(lowerCase)) {
                            arrayList = arrayList9;
                        } else {
                            arrayList = arrayList9;
                            if (!lowerCase2.contains(" ".concat(lowerCase)) && !lowerCase3.startsWith(translitSafe) && !org.telegram.messenger.bi.u(" ", translitSafe, lowerCase3) && !lowerCase4.startsWith(lowerCase) && !lowerCase4.contains(" ".concat(lowerCase)) && !lowerCase5.startsWith(translitSafe) && !org.telegram.messenger.bi.u(" ", translitSafe, lowerCase5) && !str5.startsWith(lowerCase) && !concat.startsWith(lowerCase)) {
                                arrayList9 = arrayList;
                            }
                        }
                        arrayList8.add(utVar);
                        arrayList9 = arrayList;
                    }
                    AndroidUtilities.runOnUIThread(new vo0(29, xtVar, arrayList8));
                    break;
                }
                break;
            default:
                org.telegram.ui.xt xtVar2 = (org.telegram.ui.xt) this.b;
                ArrayList arrayList10 = (ArrayList) this.c;
                org.telegram.ui.zt ztVar = xtVar2.h;
                if (ztVar.f) {
                    xtVar2.e = arrayList10;
                    if (ztVar.e && (zl0Var = ztVar.a) != null) {
                        s4.h0 adapter = zl0Var.getAdapter();
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
        }
    }

    public /* synthetic */ vo0(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }
}
