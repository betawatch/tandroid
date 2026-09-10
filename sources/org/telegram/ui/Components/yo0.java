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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class yo0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yo0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11;
        ArrayList arrayList;
        vl0 vl0Var;
        ArrayList arrayList2 = null;
        int i12 = 0;
        switch (this.a) {
            case 0:
                ff ffVar = (ff) this.b;
                org.telegram.ui.eo eoVar = (org.telegram.ui.eo) this.c;
                if (eoVar != null) {
                    eoVar.presentFragment(new PremiumPreviewFragment(0, "select_sender"));
                    ffVar.dismiss();
                    break;
                }
                break;
            case 1:
                ((WindowManager) this.c).removeView(((ff) this.b).B);
                break;
            case 2:
                sq0 sq0Var = (sq0) this.b;
                TLObject tLObject = (TLObject) this.c;
                if (tLObject != null) {
                    sq0Var.k0 = (TLRPC.TL_exportedMessageLink) tLObject;
                    sq0Var.Z0();
                    if (sq0Var.m0) {
                        sq0Var.M0();
                    }
                }
                sq0Var.l0 = false;
                break;
            case 3:
                au0 au0Var = (au0) this.b;
                zq0 zq0Var = (zq0) this.c;
                au0Var.G = null;
                au0Var.H = null;
                zq0Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(220L).setListener(new zn0(zq0Var, 3)).start();
                break;
            case 4:
                iv0 iv0Var = (iv0) this.b;
                zh.b5 b5Var = (zh.b5) this.c;
                cs0 cs0Var = iv0Var.W;
                if (cs0Var != null) {
                    int i13 = b5Var.a;
                    cs0Var.n.d(i13, cs0Var.s.i(i13));
                    break;
                }
                break;
            case 5:
                wc.a0(((qt0) this.b).f.v1).Q(R.raw.contact_check, 36, LocaleController.formatString(R.string.YouJoinedChannel, ((TLRPC.Chat) this.c).title)).k(true);
                break;
            case 6:
                du0 du0Var = (du0) this.b;
                String str = (String) this.c;
                if (!du0Var.v.t1[du0Var.r].a.isEmpty() && ((i10 = du0Var.r) == 1 || i10 == 4)) {
                    MessageObject messageObject = (MessageObject) hc.b.i(1, du0Var.v.t1[i10].a);
                    int id2 = messageObject.getId();
                    long dialogId = messageObject.getDialogId();
                    iv0 iv0Var2 = du0Var.v;
                    du0Var.F(id2, str, dialogId, iv0Var2.j1 == iv0Var2.v1.getUserConfig().getClientUserId() ? messageObject.getSavedDialogId() : 0L);
                } else if (du0Var.r == 3) {
                    iv0 iv0Var3 = du0Var.v;
                    du0Var.F(0, str, iv0Var3.j1, iv0Var3.F);
                }
                int i14 = du0Var.r;
                if (i14 == 1 || i14 == 4) {
                    ArrayList arrayList3 = new ArrayList(du0Var.v.t1[du0Var.r].a);
                    du0Var.s++;
                    Utilities.searchQueue.postRunnable(new gf(du0Var, str, arrayList3, 27));
                    break;
                }
                break;
            case 7:
                du0 du0Var2 = (du0) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                iv0 iv0Var4 = du0Var2.v;
                boolean z10 = iv0Var4.V0;
                au0[] au0VarArr = iv0Var4.k0;
                if (z10) {
                    du0Var2.s--;
                    int h = du0Var2.h();
                    du0Var2.d = arrayList4;
                    int h10 = du0Var2.h();
                    if (du0Var2.s == 0 || h10 != 0) {
                        iv0Var4.m1(false);
                    }
                    for (int i15 = 0; i15 < au0VarArr.length; i15++) {
                        au0 au0Var2 = au0VarArr[i15];
                        if (au0Var2.F == du0Var2.r) {
                            if (du0Var2.s == 0 && h10 == 0) {
                                au0Var2.w.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
                                au0VarArr[i15].w.f.setVisibility(8);
                                au0VarArr[i15].w.e(false, true);
                            } else if (h == 0) {
                                iv0Var4.z(au0Var2.h, 0, null);
                            }
                        }
                    }
                    du0Var2.l();
                    break;
                }
                break;
            case 8:
                TLObject tLObject2 = (TLObject) this.b;
                TLRPC.Document document = (TLRPC.Document) this.c;
                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                int i16 = NotificationCenter.customStickerCreated;
                Boolean bool = Boolean.FALSE;
                notificationCenter.postNotificationNameOnUIThread(i16, bool, tLObject2, document, null, bool);
                break;
            case 9:
                MessagesController.getInstance(((uy0) this.b).a.a).updateEmojiStatus((TLRPC.EmojiStatus) this.c);
                break;
            case 10:
                k31 k31Var = (k31) this.b;
                MessagesController.getInstance(k31Var.b).getTopicsController().deleteTopics(-k31Var.c, (ArrayList) this.c);
                int i17 = k31.f0;
                break;
            case 11:
                k31 k31Var2 = (k31) this.b;
                TLRPC.Updates updates = (TLRPC.Updates) this.c;
                k31Var2.getClass();
                MessagesController.getInstance(k31Var2.b).loadFullChat(updates.chats.get(0).id, 0, true);
                break;
            case 12:
                org.telegram.ui.Cells.k1 k1Var = (org.telegram.ui.Cells.k1) this.b;
                TLRPC.TL_messages_transcribedAudio tL_messages_transcribedAudio = (TLRPC.TL_messages_transcribedAudio) this.c;
                if (k1Var != null) {
                    k1Var.c0(tL_messages_transcribedAudio.trial_remains_num > 0 ? 1 : 2);
                    break;
                }
                break;
            case 13:
                i41.o((i41) this.b, (TLObject) this.c);
                break;
            case 14:
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.b;
                String str2 = (String) this.c;
                if (callback2 != null) {
                    callback2.run(str2, Boolean.FALSE);
                    break;
                }
                break;
            case 15:
                org.telegram.ui.bl blVar = (org.telegram.ui.bl) this.b;
                ((org.telegram.ui.ActionBar.p1) this.c).d(true);
                z41.a(blVar.getContext(), blVar.d);
                break;
            case 16:
                ((TranslateController) this.c).setHideTranslateDialog(((org.telegram.ui.bl) this.b).b, false);
                break;
            case 17:
                UndoView undoView = (UndoView) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                if (tLObject3 instanceof TLRPC.PaymentReceipt) {
                    undoView.s.presentFragment(new org.telegram.ui.wo0((TLRPC.PaymentReceipt) tLObject3));
                    break;
                } else {
                    int i18 = UndoView.e0;
                    undoView.getClass();
                    break;
                }
            case 18:
                ((v51) this.b).D.onClick((org.telegram.ui.Cells.w8) this.c);
                break;
            case 19:
                t71 t71Var = (t71) this.b;
                b2.u0 u0Var = (b2.u0) this.c;
                Throwable cause = u0Var.getCause();
                if (!(cause instanceof r2.n) || (!cause.toString().contains("av1") && !cause.toString().contains("av01"))) {
                    TextureView textureView = t71Var.n;
                    if (textureView == null || ((t71Var.E || !(cause instanceof r2.p)) && !(cause instanceof a3.x))) {
                        t71Var.J.onError(t71Var, u0Var);
                        break;
                    } else {
                        t71Var.E = true;
                        if (t71Var.d != null) {
                            ViewGroup viewGroup = (ViewGroup) textureView.getParent();
                            if (viewGroup != null) {
                                int indexOfChild = viewGroup.indexOfChild(t71Var.n);
                                viewGroup.removeView(t71Var.n);
                                viewGroup.addView(t71Var.n, indexOfChild);
                            }
                            DispatchQueue dispatchQueue = t71Var.b;
                            if (dispatchQueue != null) {
                                dispatchQueue.postRunnable(new k71(t71Var, i12));
                                break;
                            } else {
                                i2.e0 e0Var = t71Var.d;
                                TextureView textureView2 = t71Var.n;
                                e0Var.B1();
                                if (textureView2 != null && textureView2 == e0Var.V) {
                                    e0Var.B1();
                                    e0Var.o1();
                                    e0Var.t1(null);
                                    e0Var.m1(0, 0);
                                }
                                t71Var.d.v1(t71Var.n);
                                ArrayList arrayList5 = t71Var.N;
                                if (arrayList5 != null) {
                                    t71Var.F(arrayList5, t71Var.O);
                                } else if (t71Var.U) {
                                    t71Var.G(t71Var.Q, t71Var.S, t71Var.R, t71Var.T);
                                } else {
                                    t71Var.D(t71Var.Q, t71Var.S);
                                }
                                t71Var.C();
                                break;
                            }
                        }
                    }
                } else {
                    FileLog.e(u0Var);
                    FileLog.e("av1 codec failed, we think this codec is not supported");
                    MessagesController.getGlobalMainSettings().edit().putBoolean("unsupport_video/av01", true).commit();
                    HashMap hashMap = t71.l0;
                    if (hashMap != null) {
                        hashMap.clear();
                    }
                    ArrayList arrayList6 = t71Var.N;
                    if (arrayList6 != null) {
                        int i19 = 0;
                        while (i19 < arrayList6.size()) {
                            p71 p71Var = (p71) arrayList6.get(i19);
                            int i20 = 0;
                            while (true) {
                                ArrayList arrayList7 = p71Var.d;
                                if (i20 < arrayList7.size()) {
                                    r71 r71Var = (r71) arrayList7.get(i20);
                                    if (!TextUtils.isEmpty(r71Var.m) && !t71.Y(r71Var.m)) {
                                        arrayList7.remove(i20);
                                        i20--;
                                    }
                                    i20++;
                                } else {
                                    if (arrayList7.isEmpty()) {
                                        arrayList6.remove(i19);
                                        i19--;
                                    }
                                    i19++;
                                }
                            }
                        }
                        arrayList2 = arrayList6;
                    }
                    t71Var.N = arrayList2;
                    if (arrayList2 != null) {
                        t71Var.F(arrayList2, t71Var.O);
                        break;
                    }
                }
                break;
            case 20:
                ((s71) this.b).f.K.onVisualizerUpdate(true, true, (float[]) this.c);
                break;
            case 21:
                a81 a81Var = (a81) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                if (bitmap != null) {
                    if (a81Var.w != null) {
                        Bitmap bitmap2 = a81Var.v;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        a81Var.v = a81Var.w;
                    }
                    a81Var.w = bitmap;
                    Bitmap bitmap3 = a81Var.w;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                    a81Var.G = bitmapShader;
                    bitmapShader.setLocalMatrix(a81Var.L);
                    a81Var.J.setShader(a81Var.G);
                    a81Var.invalidate();
                    int dp = AndroidUtilities.dp(150.0f);
                    float width = bitmap.getWidth() / bitmap.getHeight();
                    if (width > 1.0f) {
                        i11 = (int) (dp / width);
                    } else {
                        dp = (int) (dp * width);
                        i11 = dp;
                    }
                    ViewGroup.LayoutParams layoutParams = a81Var.getLayoutParams();
                    if (a81Var.getVisibility() != 0 || layoutParams.width != dp || layoutParams.height != i11) {
                        layoutParams.width = dp;
                        layoutParams.height = i11;
                        a81Var.setVisibility(0);
                        a81Var.requestLayout();
                    }
                }
                a81Var.f = null;
                break;
            case 22:
                final n91 n91Var = (n91) this.b;
                n91Var.e.b.evaluateJavascript((String) this.c, new ValueCallback() { // from class: org.telegram.ui.Components.m91
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(Object obj) {
                        String str3 = (String) obj;
                        n91 n91Var2 = n91.this;
                        String[] strArr = n91Var2.c;
                        strArr[0] = strArr[0].replace(n91Var2.d, "/signature/" + str3.substring(1, str3.length() - 1));
                        n91Var2.b.countDown();
                    }
                });
                break;
            case 23:
                ((org.telegram.ui.Components.voip.k) this.b).a.setOnClickListener((View.OnClickListener) this.c);
                break;
            case 24:
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) this.b;
                Bitmap bitmap4 = (Bitmap) this.c;
                HashMap<String, Bitmap> hashMap2 = tVar.F.thumbs;
                ChatObject.VideoParticipant videoParticipant = tVar.w;
                boolean z11 = videoParticipant.presentation;
                TLRPC.GroupCallParticipant groupCallParticipant = videoParticipant.participant;
                hashMap2.put(z11 ? groupCallParticipant.presentationEndpoint : groupCallParticipant.videoEndpoint, bitmap4);
                break;
            case 25:
                org.telegram.ui.Components.voip.m0 m0Var = (org.telegram.ui.Components.voip.m0) this.b;
                org.telegram.ui.Components.voip.t tVar2 = (org.telegram.ui.Components.voip.t) this.c;
                m0Var.getClass();
                tVar2.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setListener(new org.telegram.ui.Components.voip.z(tVar2)).setDuration(150L).start();
                break;
            case 26:
                vl0 vl0Var2 = (vl0) this.b;
                Object obj = this.c;
                if (vl0Var2 != null) {
                    vl0Var2.setOnItemClickListener((jl0) obj);
                    break;
                }
                break;
            case 27:
                org.telegram.ui.zt ztVar = (org.telegram.ui.zt) this.b;
                String lowerCase = ((String) this.c).trim().toLowerCase();
                int i21 = 28;
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new yo0(i21, ztVar, new ArrayList()));
                    break;
                } else {
                    String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                    ArrayList arrayList8 = new ArrayList();
                    ArrayList arrayList9 = ztVar.f;
                    int size = arrayList9.size();
                    while (i12 < size) {
                        Object obj2 = arrayList9.get(i12);
                        i12++;
                        org.telegram.ui.wt wtVar = (org.telegram.ui.wt) obj2;
                        String str3 = wtVar.a;
                        if (str3 == null) {
                            str3 = "";
                        }
                        String lowerCase2 = str3.toLowerCase();
                        String lowerCase3 = AndroidUtilities.translitSafe(wtVar.a).toLowerCase();
                        String str4 = wtVar.b;
                        if (str4 == null) {
                            str4 = "";
                        }
                        String lowerCase4 = str4.toLowerCase();
                        String lowerCase5 = AndroidUtilities.translitSafe(wtVar.b).toLowerCase();
                        String str5 = wtVar.c;
                        if (str5 == null) {
                            str5 = "";
                        }
                        String concat = TextUtils.isEmpty(str5) ? "" : "+".concat(str5);
                        if (lowerCase2.startsWith(lowerCase)) {
                            arrayList = arrayList9;
                        } else {
                            arrayList = arrayList9;
                            if (!lowerCase2.contains(" ".concat(lowerCase)) && !lowerCase3.startsWith(translitSafe) && !org.telegram.messenger.a2.w(" ", translitSafe, lowerCase3) && !lowerCase4.startsWith(lowerCase) && !lowerCase4.contains(" ".concat(lowerCase)) && !lowerCase5.startsWith(translitSafe) && !org.telegram.messenger.a2.w(" ", translitSafe, lowerCase5) && !str5.startsWith(lowerCase) && !concat.startsWith(lowerCase)) {
                                arrayList9 = arrayList;
                            }
                        }
                        arrayList8.add(wtVar);
                        arrayList9 = arrayList;
                    }
                    AndroidUtilities.runOnUIThread(new yo0(28, ztVar, arrayList8));
                    break;
                }
                break;
            case 28:
                org.telegram.ui.zt ztVar2 = (org.telegram.ui.zt) this.b;
                ArrayList arrayList10 = (ArrayList) this.c;
                org.telegram.ui.bu buVar = ztVar2.h;
                if (buVar.f) {
                    ztVar2.e = arrayList10;
                    if (buVar.e && (vl0Var = buVar.a) != null) {
                        s4.h0 adapter = vl0Var.getAdapter();
                        org.telegram.ui.zt ztVar3 = buVar.d;
                        if (adapter != ztVar3) {
                            buVar.a.setAdapter(ztVar3);
                            buVar.a.setFastScrollVisible(false);
                        }
                    }
                    ztVar2.l();
                    break;
                }
                break;
            default:
                MessagesController.getInstance(((org.telegram.ui.du) this.b).currentAccount).processUpdates((TLRPC.Updates) this.c, false);
                break;
        }
    }

    public /* synthetic */ yo0(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }
}
