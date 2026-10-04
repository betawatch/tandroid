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

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class uo0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ uo0(int i10, Object obj, Object obj2) {
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
        ArrayList arrayList2 = null;
        int i13 = 0;
        switch (this.a) {
            case 0:
                ((vo0) this.b).sendAccessibilityEvent((View) this.c, 4);
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
                zq0 zq0Var = (zq0) this.b;
                TLObject tLObject = (TLObject) this.c;
                if (tLObject != null) {
                    zq0Var.k0 = (TLRPC.TL_exportedMessageLink) tLObject;
                    zq0Var.W0();
                    if (zq0Var.m0) {
                        zq0Var.J0();
                    }
                }
                zq0Var.l0 = false;
                break;
            case 4:
                iu0 iu0Var = (iu0) this.b;
                gr0 gr0Var = (gr0) this.c;
                iu0Var.G = null;
                iu0Var.H = null;
                gr0Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(220L).setListener(new hd0(gr0Var, 14)).start();
                break;
            case 5:
                pv0 pv0Var = (pv0) this.b;
                ai.e9 e9Var = (ai.e9) this.c;
                ks0 ks0Var = pv0Var.W;
                if (ks0Var != null) {
                    int i14 = e9Var.a;
                    ks0Var.n.d(i14, ks0Var.s.i(i14));
                    break;
                }
                break;
            case 6:
                yc.a0(((yt0) this.b).f.v1).Q(R.raw.contact_check, 36, LocaleController.formatString(R.string.YouJoinedChannel, ((TLRPC.Chat) this.c).title)).k(true);
                break;
            case 7:
                lu0 lu0Var = (lu0) this.b;
                String str = (String) this.c;
                if (!lu0Var.v.t1[lu0Var.r].a.isEmpty() && ((i10 = lu0Var.r) == 1 || i10 == 4)) {
                    MessageObject messageObject = (MessageObject) hg.k0.g(1, lu0Var.v.t1[i10].a);
                    int id2 = messageObject.getId();
                    long dialogId = messageObject.getDialogId();
                    pv0 pv0Var2 = lu0Var.v;
                    lu0Var.F(id2, str, dialogId, pv0Var2.j1 == pv0Var2.v1.getUserConfig().getClientUserId() ? messageObject.getSavedDialogId() : 0L);
                } else if (lu0Var.r == 3) {
                    pv0 pv0Var3 = lu0Var.v;
                    lu0Var.F(0, str, pv0Var3.j1, pv0Var3.F);
                }
                int i15 = lu0Var.r;
                if (i15 == 1 || i15 == 4) {
                    ArrayList arrayList3 = new ArrayList(lu0Var.v.t1[lu0Var.r].a);
                    lu0Var.s++;
                    Utilities.searchQueue.postRunnable(new in0((Object) lu0Var, (Serializable) str, arrayList3, i12));
                    break;
                }
                break;
            case 8:
                lu0 lu0Var2 = (lu0) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                pv0 pv0Var4 = lu0Var2.v;
                boolean z10 = pv0Var4.V0;
                iu0[] iu0VarArr = pv0Var4.k0;
                if (z10) {
                    lu0Var2.s--;
                    int h = lu0Var2.h();
                    lu0Var2.d = arrayList4;
                    int h10 = lu0Var2.h();
                    if (lu0Var2.s == 0 || h10 != 0) {
                        pv0Var4.m1(false);
                    }
                    for (int i16 = 0; i16 < iu0VarArr.length; i16++) {
                        iu0 iu0Var2 = iu0VarArr[i16];
                        if (iu0Var2.F == lu0Var2.r) {
                            if (lu0Var2.s == 0 && h10 == 0) {
                                iu0Var2.w.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
                                iu0VarArr[i16].w.f.setVisibility(8);
                                iu0VarArr[i16].w.e(false, true);
                            } else if (h == 0) {
                                pv0Var4.z(iu0Var2.h, 0, null);
                            }
                        }
                    }
                    lu0Var2.l();
                    break;
                }
                break;
            case 9:
                TLObject tLObject2 = (TLObject) this.b;
                TLRPC.Document document = (TLRPC.Document) this.c;
                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                int i17 = NotificationCenter.customStickerCreated;
                Boolean bool = Boolean.FALSE;
                notificationCenter.postNotificationNameOnUIThread(i17, bool, tLObject2, document, null, bool);
                break;
            case 10:
                MessagesController.getInstance(((dz0) this.b).a.a).updateEmojiStatus((TLRPC.EmojiStatus) this.c);
                break;
            case 11:
                v31 v31Var = (v31) this.b;
                MessagesController.getInstance(v31Var.b).getTopicsController().deleteTopics(-v31Var.c, (ArrayList) this.c);
                int i18 = v31.f0;
                break;
            case 12:
                v31 v31Var2 = (v31) this.b;
                TLRPC.Updates updates = (TLRPC.Updates) this.c;
                v31Var2.getClass();
                MessagesController.getInstance(v31Var2.b).loadFullChat(updates.chats.get(0).id, 0, true);
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
                t41.o((t41) this.b, (TLObject) this.c);
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
                k51.a(wkVar.getContext(), wkVar.d);
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
                    int i19 = UndoView.e0;
                    undoView.getClass();
                    break;
                }
            case 19:
                ((g61) this.b).D.onClick((org.telegram.ui.Cells.v8) this.c);
                break;
            case 20:
                d81 d81Var = (d81) this.b;
                b2.u0 u0Var = (b2.u0) this.c;
                Throwable cause = u0Var.getCause();
                if (!(cause instanceof r2.n) || (!cause.toString().contains("av1") && !cause.toString().contains("av01"))) {
                    TextureView textureView = d81Var.n;
                    if (textureView == null || ((d81Var.E || !(cause instanceof r2.p)) && !(cause instanceof a3.x))) {
                        d81Var.J.onError(d81Var, u0Var);
                        break;
                    } else {
                        d81Var.E = true;
                        if (d81Var.d != null) {
                            ViewGroup viewGroup = (ViewGroup) textureView.getParent();
                            if (viewGroup != null) {
                                int indexOfChild = viewGroup.indexOfChild(d81Var.n);
                                viewGroup.removeView(d81Var.n);
                                viewGroup.addView(d81Var.n, indexOfChild);
                            }
                            DispatchQueue dispatchQueue = d81Var.b;
                            if (dispatchQueue != null) {
                                dispatchQueue.postRunnable(new f71(d81Var, r6));
                                break;
                            } else {
                                i2.f0 f0Var = d81Var.d;
                                TextureView textureView2 = d81Var.n;
                                f0Var.B1();
                                if (textureView2 != null && textureView2 == f0Var.V) {
                                    f0Var.B1();
                                    f0Var.o1();
                                    f0Var.t1(null);
                                    f0Var.m1(0, 0);
                                }
                                d81Var.d.v1(d81Var.n);
                                ArrayList arrayList5 = d81Var.N;
                                if (arrayList5 != null) {
                                    d81Var.F(arrayList5, d81Var.O);
                                } else if (d81Var.U) {
                                    d81Var.G(d81Var.Q, d81Var.S, d81Var.R, d81Var.T);
                                } else {
                                    d81Var.D(d81Var.Q, d81Var.S);
                                }
                                d81Var.C();
                                break;
                            }
                        }
                    }
                } else {
                    FileLog.e(u0Var);
                    FileLog.e("av1 codec failed, we think this codec is not supported");
                    MessagesController.getGlobalMainSettings().edit().putBoolean("unsupport_video/av01", true).commit();
                    HashMap hashMap = d81.l0;
                    if (hashMap != null) {
                        hashMap.clear();
                    }
                    ArrayList arrayList6 = d81Var.N;
                    if (arrayList6 != null) {
                        int i20 = 0;
                        while (i20 < arrayList6.size()) {
                            z71 z71Var = (z71) arrayList6.get(i20);
                            int i21 = 0;
                            while (true) {
                                ArrayList arrayList7 = z71Var.d;
                                if (i21 < arrayList7.size()) {
                                    b81 b81Var = (b81) arrayList7.get(i21);
                                    if (!TextUtils.isEmpty(b81Var.m) && !d81.Y(b81Var.m)) {
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
                        arrayList2 = arrayList6;
                    }
                    d81Var.N = arrayList2;
                    if (arrayList2 != null) {
                        d81Var.F(arrayList2, d81Var.O);
                        break;
                    }
                }
                break;
            case 21:
                ((c81) this.b).f.K.onVisualizerUpdate(true, true, (float[]) this.c);
                break;
            case 22:
                k81 k81Var = (k81) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                if (bitmap != null) {
                    if (k81Var.w != null) {
                        Bitmap bitmap2 = k81Var.v;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        k81Var.v = k81Var.w;
                    }
                    k81Var.w = bitmap;
                    Bitmap bitmap3 = k81Var.w;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                    k81Var.G = bitmapShader;
                    bitmapShader.setLocalMatrix(k81Var.L);
                    k81Var.J.setShader(k81Var.G);
                    k81Var.invalidate();
                    int dp = AndroidUtilities.dp(150.0f);
                    float width = bitmap.getWidth() / bitmap.getHeight();
                    if (width > 1.0f) {
                        i11 = (int) (dp / width);
                    } else {
                        dp = (int) (dp * width);
                        i11 = dp;
                    }
                    ViewGroup.LayoutParams layoutParams = k81Var.getLayoutParams();
                    if (k81Var.getVisibility() != 0 || layoutParams.width != dp || layoutParams.height != i11) {
                        layoutParams.width = dp;
                        layoutParams.height = i11;
                        k81Var.setVisibility(0);
                        k81Var.requestLayout();
                    }
                }
                k81Var.f = null;
                break;
            case 23:
                final y91 y91Var = (y91) this.b;
                y91Var.e.b.evaluateJavascript((String) this.c, new ValueCallback() { // from class: org.telegram.ui.Components.x91
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(Object obj) {
                        String str3 = (String) obj;
                        y91 y91Var2 = y91.this;
                        String[] strArr = y91Var2.c;
                        strArr[0] = strArr[0].replace(y91Var2.d, "/signature/" + str3.substring(1, str3.length() - 1));
                        y91Var2.b.countDown();
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
                int i22 = 29;
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new uo0(i22, xtVar, new ArrayList()));
                    break;
                } else {
                    String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                    ArrayList arrayList8 = new ArrayList();
                    ArrayList arrayList9 = xtVar.f;
                    int size = arrayList9.size();
                    while (i13 < size) {
                        Object obj2 = arrayList9.get(i13);
                        i13++;
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
                            if (!lowerCase2.contains(" ".concat(lowerCase)) && !lowerCase3.startsWith(translitSafe) && !org.telegram.messenger.f0.w(" ", translitSafe, lowerCase3) && !lowerCase4.startsWith(lowerCase) && !lowerCase4.contains(" ".concat(lowerCase)) && !lowerCase5.startsWith(translitSafe) && !org.telegram.messenger.f0.w(" ", translitSafe, lowerCase5) && !str5.startsWith(lowerCase) && !concat.startsWith(lowerCase)) {
                                arrayList9 = arrayList;
                            }
                        }
                        arrayList8.add(utVar);
                        arrayList9 = arrayList;
                    }
                    AndroidUtilities.runOnUIThread(new uo0(29, xtVar, arrayList8));
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

    public /* synthetic */ uo0(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }
}
