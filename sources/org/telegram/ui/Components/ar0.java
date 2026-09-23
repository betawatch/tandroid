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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class ar0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ar0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11;
        ArrayList arrayList;
        ml0 ml0Var;
        int i12 = 5;
        ArrayList arrayList2 = null;
        int i13 = 0;
        switch (this.a) {
            case 0:
                rt0 rt0Var = (rt0) this.b;
                oq0 oq0Var = (oq0) this.c;
                rt0Var.G = null;
                rt0Var.H = null;
                oq0Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(220L).setListener(new jd0(oq0Var, 13)).start();
                break;
            case 1:
                yu0 yu0Var = (yu0) this.b;
                ai.e9 e9Var = (ai.e9) this.c;
                tr0 tr0Var = yu0Var.W;
                if (tr0Var != null) {
                    int i14 = e9Var.a;
                    tr0Var.n.d(i14, tr0Var.s.i(i14));
                    break;
                }
                break;
            case 2:
                xc.a0(((ht0) this.b).f.v1).Q(R.raw.contact_check, 36, LocaleController.formatString(R.string.YouJoinedChannel, ((TLRPC.Chat) this.c).title)).k(true);
                break;
            case 3:
                ut0 ut0Var = (ut0) this.b;
                String str = (String) this.c;
                if (!ut0Var.v.t1[ut0Var.r].a.isEmpty() && ((i10 = ut0Var.r) == 1 || i10 == 4)) {
                    MessageObject messageObject = (MessageObject) hg.c.h(1, ut0Var.v.t1[i10].a);
                    int id2 = messageObject.getId();
                    long dialogId = messageObject.getDialogId();
                    yu0 yu0Var2 = ut0Var.v;
                    ut0Var.F(id2, str, dialogId, yu0Var2.j1 == yu0Var2.v1.getUserConfig().getClientUserId() ? messageObject.getSavedDialogId() : 0L);
                } else if (ut0Var.r == 3) {
                    yu0 yu0Var3 = ut0Var.v;
                    ut0Var.F(0, str, yu0Var3.j1, yu0Var3.F);
                }
                int i15 = ut0Var.r;
                if (i15 == 1 || i15 == 4) {
                    ArrayList arrayList3 = new ArrayList(ut0Var.v.t1[ut0Var.r].a);
                    ut0Var.s++;
                    Utilities.searchQueue.postRunnable(new fr0(ut0Var, str, arrayList3, i12));
                    break;
                }
                break;
            case 4:
                ut0 ut0Var2 = (ut0) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                yu0 yu0Var4 = ut0Var2.v;
                boolean z10 = yu0Var4.V0;
                rt0[] rt0VarArr = yu0Var4.k0;
                if (z10) {
                    ut0Var2.s--;
                    int h = ut0Var2.h();
                    ut0Var2.d = arrayList4;
                    int h10 = ut0Var2.h();
                    if (ut0Var2.s == 0 || h10 != 0) {
                        yu0Var4.m1(false);
                    }
                    for (int i16 = 0; i16 < rt0VarArr.length; i16++) {
                        rt0 rt0Var2 = rt0VarArr[i16];
                        if (rt0Var2.F == ut0Var2.r) {
                            if (ut0Var2.s == 0 && h10 == 0) {
                                rt0Var2.w.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
                                rt0VarArr[i16].w.f.setVisibility(8);
                                rt0VarArr[i16].w.e(false, true);
                            } else if (h == 0) {
                                yu0Var4.z(rt0Var2.h, 0, null);
                            }
                        }
                    }
                    ut0Var2.l();
                    break;
                }
                break;
            case 5:
                TLObject tLObject = (TLObject) this.b;
                TLRPC.Document document = (TLRPC.Document) this.c;
                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                int i17 = NotificationCenter.customStickerCreated;
                Boolean bool = Boolean.FALSE;
                notificationCenter.postNotificationNameOnUIThread(i17, bool, tLObject, document, null, bool);
                break;
            case 6:
                MessagesController.getInstance(((hy0) this.b).a.a).updateEmojiStatus((TLRPC.EmojiStatus) this.c);
                break;
            case 7:
                w21 w21Var = (w21) this.b;
                MessagesController.getInstance(w21Var.b).getTopicsController().deleteTopics(-w21Var.c, (ArrayList) this.c);
                int i18 = w21.f0;
                break;
            case 8:
                w21 w21Var2 = (w21) this.b;
                TLRPC.Updates updates = (TLRPC.Updates) this.c;
                w21Var2.getClass();
                MessagesController.getInstance(w21Var2.b).loadFullChat(updates.chats.get(0).id, 0, true);
                break;
            case 9:
                org.telegram.ui.Cells.k1 k1Var = (org.telegram.ui.Cells.k1) this.b;
                TLRPC.TL_messages_transcribedAudio tL_messages_transcribedAudio = (TLRPC.TL_messages_transcribedAudio) this.c;
                if (k1Var != null) {
                    k1Var.d0(tL_messages_transcribedAudio.trial_remains_num > 0 ? 1 : 2);
                    break;
                }
                break;
            case 10:
                u31.o((u31) this.b, (TLObject) this.c);
                break;
            case 11:
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.b;
                String str2 = (String) this.c;
                if (callback2 != null) {
                    callback2.run(str2, Boolean.FALSE);
                    break;
                }
                break;
            case 12:
                org.telegram.ui.wk wkVar = (org.telegram.ui.wk) this.b;
                ((org.telegram.ui.ActionBar.n1) this.c).d(true);
                l41.a(wkVar.getContext(), wkVar.d);
                break;
            case 13:
                ((TranslateController) this.c).setHideTranslateDialog(((org.telegram.ui.wk) this.b).b, false);
                break;
            case 14:
                UndoView undoView = (UndoView) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                if (tLObject2 instanceof TLRPC.PaymentReceipt) {
                    undoView.s.presentFragment(new org.telegram.ui.qo0((TLRPC.PaymentReceipt) tLObject2));
                    break;
                } else {
                    int i19 = UndoView.e0;
                    undoView.getClass();
                    break;
                }
            case 15:
                ((h51) this.b).D.onClick((org.telegram.ui.Cells.w8) this.c);
                break;
            case 16:
                f71 f71Var = (f71) this.b;
                b2.u0 u0Var = (b2.u0) this.c;
                Throwable cause = u0Var.getCause();
                if (!(cause instanceof r2.n) || (!cause.toString().contains("av1") && !cause.toString().contains("av01"))) {
                    TextureView textureView = f71Var.n;
                    if (textureView == null || ((f71Var.E || !(cause instanceof r2.p)) && !(cause instanceof a3.x))) {
                        f71Var.J.onError(f71Var, u0Var);
                        break;
                    } else {
                        f71Var.E = true;
                        if (f71Var.d != null) {
                            ViewGroup viewGroup = (ViewGroup) textureView.getParent();
                            if (viewGroup != null) {
                                int indexOfChild = viewGroup.indexOfChild(f71Var.n);
                                viewGroup.removeView(f71Var.n);
                                viewGroup.addView(f71Var.n, indexOfChild);
                            }
                            DispatchQueue dispatchQueue = f71Var.b;
                            if (dispatchQueue != null) {
                                dispatchQueue.postRunnable(new w61(f71Var, i13));
                                break;
                            } else {
                                i2.f0 f0Var = f71Var.d;
                                TextureView textureView2 = f71Var.n;
                                f0Var.B1();
                                if (textureView2 != null && textureView2 == f0Var.V) {
                                    f0Var.B1();
                                    f0Var.o1();
                                    f0Var.t1(null);
                                    f0Var.m1(0, 0);
                                }
                                f71Var.d.v1(f71Var.n);
                                ArrayList arrayList5 = f71Var.N;
                                if (arrayList5 != null) {
                                    f71Var.F(arrayList5, f71Var.O);
                                } else if (f71Var.U) {
                                    f71Var.G(f71Var.Q, f71Var.S, f71Var.R, f71Var.T);
                                } else {
                                    f71Var.D(f71Var.Q, f71Var.S);
                                }
                                f71Var.C();
                                break;
                            }
                        }
                    }
                } else {
                    FileLog.e(u0Var);
                    FileLog.e("av1 codec failed, we think this codec is not supported");
                    MessagesController.getGlobalMainSettings().edit().putBoolean("unsupport_video/av01", true).commit();
                    HashMap hashMap = f71.l0;
                    if (hashMap != null) {
                        hashMap.clear();
                    }
                    ArrayList arrayList6 = f71Var.N;
                    if (arrayList6 != null) {
                        int i20 = 0;
                        while (i20 < arrayList6.size()) {
                            b71 b71Var = (b71) arrayList6.get(i20);
                            int i21 = 0;
                            while (true) {
                                ArrayList arrayList7 = b71Var.d;
                                if (i21 < arrayList7.size()) {
                                    d71 d71Var = (d71) arrayList7.get(i21);
                                    if (!TextUtils.isEmpty(d71Var.m) && !f71.Y(d71Var.m)) {
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
                    f71Var.N = arrayList2;
                    if (arrayList2 != null) {
                        f71Var.F(arrayList2, f71Var.O);
                        break;
                    }
                }
                break;
            case 17:
                ((e71) this.b).f.K.onVisualizerUpdate(true, true, (float[]) this.c);
                break;
            case 18:
                m71 m71Var = (m71) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                if (bitmap != null) {
                    if (m71Var.w != null) {
                        Bitmap bitmap2 = m71Var.v;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        m71Var.v = m71Var.w;
                    }
                    m71Var.w = bitmap;
                    Bitmap bitmap3 = m71Var.w;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                    m71Var.G = bitmapShader;
                    bitmapShader.setLocalMatrix(m71Var.L);
                    m71Var.J.setShader(m71Var.G);
                    m71Var.invalidate();
                    int dp = AndroidUtilities.dp(150.0f);
                    float width = bitmap.getWidth() / bitmap.getHeight();
                    if (width > 1.0f) {
                        i11 = (int) (dp / width);
                    } else {
                        dp = (int) (dp * width);
                        i11 = dp;
                    }
                    ViewGroup.LayoutParams layoutParams = m71Var.getLayoutParams();
                    if (m71Var.getVisibility() != 0 || layoutParams.width != dp || layoutParams.height != i11) {
                        layoutParams.width = dp;
                        layoutParams.height = i11;
                        m71Var.setVisibility(0);
                        m71Var.requestLayout();
                    }
                }
                m71Var.f = null;
                break;
            case 19:
                final a91 a91Var = (a91) this.b;
                a91Var.e.b.evaluateJavascript((String) this.c, new ValueCallback() { // from class: org.telegram.ui.Components.z81
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(Object obj) {
                        String str3 = (String) obj;
                        a91 a91Var2 = a91.this;
                        String[] strArr = a91Var2.c;
                        strArr[0] = strArr[0].replace(a91Var2.d, "/signature/" + str3.substring(1, str3.length() - 1));
                        a91Var2.b.countDown();
                    }
                });
                break;
            case 20:
                ((org.telegram.ui.Components.voip.k) this.b).a.setOnClickListener((View.OnClickListener) this.c);
                break;
            case 21:
                org.telegram.ui.Components.voip.u uVar = (org.telegram.ui.Components.voip.u) this.b;
                Bitmap bitmap4 = (Bitmap) this.c;
                HashMap<String, Bitmap> hashMap2 = uVar.F.thumbs;
                ChatObject.VideoParticipant videoParticipant = uVar.w;
                boolean z11 = videoParticipant.presentation;
                TLRPC.GroupCallParticipant groupCallParticipant = videoParticipant.participant;
                hashMap2.put(z11 ? groupCallParticipant.presentationEndpoint : groupCallParticipant.videoEndpoint, bitmap4);
                break;
            case 22:
                org.telegram.ui.Components.voip.m0 m0Var = (org.telegram.ui.Components.voip.m0) this.b;
                org.telegram.ui.Components.voip.u uVar2 = (org.telegram.ui.Components.voip.u) this.c;
                m0Var.getClass();
                uVar2.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setListener(new org.telegram.ui.Components.voip.z(uVar2)).setDuration(150L).start();
                break;
            case 23:
                ml0 ml0Var2 = (ml0) this.b;
                Object obj = this.c;
                if (ml0Var2 != null) {
                    ml0Var2.setOnItemClickListener((al0) obj);
                    break;
                }
                break;
            case 24:
                org.telegram.ui.vt vtVar = (org.telegram.ui.vt) this.b;
                String lowerCase = ((String) this.c).trim().toLowerCase();
                int i22 = 25;
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new ar0(i22, vtVar, new ArrayList()));
                    break;
                } else {
                    String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                    ArrayList arrayList8 = new ArrayList();
                    ArrayList arrayList9 = vtVar.f;
                    int size = arrayList9.size();
                    while (i13 < size) {
                        Object obj2 = arrayList9.get(i13);
                        i13++;
                        org.telegram.ui.st stVar = (org.telegram.ui.st) obj2;
                        String str3 = stVar.a;
                        if (str3 == null) {
                            str3 = "";
                        }
                        String lowerCase2 = str3.toLowerCase();
                        String lowerCase3 = AndroidUtilities.translitSafe(stVar.a).toLowerCase();
                        String str4 = stVar.b;
                        if (str4 == null) {
                            str4 = "";
                        }
                        String lowerCase4 = str4.toLowerCase();
                        String lowerCase5 = AndroidUtilities.translitSafe(stVar.b).toLowerCase();
                        String str5 = stVar.c;
                        if (str5 == null) {
                            str5 = "";
                        }
                        String concat = TextUtils.isEmpty(str5) ? "" : "+".concat(str5);
                        if (lowerCase2.startsWith(lowerCase)) {
                            arrayList = arrayList9;
                        } else {
                            arrayList = arrayList9;
                            if (!lowerCase2.contains(" ".concat(lowerCase)) && !lowerCase3.startsWith(translitSafe) && !org.telegram.messenger.z0.w(" ", translitSafe, lowerCase3) && !lowerCase4.startsWith(lowerCase) && !lowerCase4.contains(" ".concat(lowerCase)) && !lowerCase5.startsWith(translitSafe) && !org.telegram.messenger.z0.w(" ", translitSafe, lowerCase5) && !str5.startsWith(lowerCase) && !concat.startsWith(lowerCase)) {
                                arrayList9 = arrayList;
                            }
                        }
                        arrayList8.add(stVar);
                        arrayList9 = arrayList;
                    }
                    AndroidUtilities.runOnUIThread(new ar0(25, vtVar, arrayList8));
                    break;
                }
                break;
            case 25:
                org.telegram.ui.vt vtVar2 = (org.telegram.ui.vt) this.b;
                ArrayList arrayList10 = (ArrayList) this.c;
                org.telegram.ui.xt xtVar = vtVar2.h;
                if (xtVar.f) {
                    vtVar2.e = arrayList10;
                    if (xtVar.e && (ml0Var = xtVar.a) != null) {
                        s4.h0 adapter = ml0Var.getAdapter();
                        org.telegram.ui.vt vtVar3 = xtVar.d;
                        if (adapter != vtVar3) {
                            xtVar.a.setAdapter(vtVar3);
                            xtVar.a.setFastScrollVisible(false);
                        }
                    }
                    vtVar2.l();
                    break;
                }
                break;
            case 26:
                MessagesController.getInstance(((org.telegram.ui.zt) this.b).currentAccount).processUpdates((TLRPC.Updates) this.c, false);
                break;
            case 27:
                org.telegram.ui.ry.d0((org.telegram.ui.ry) this.b, (String) this.c);
                break;
            case 28:
                ei.k3.j(((org.telegram.ui.ry) this.b).currentAccount, ((TLRPC.TL_attachMenuBot) this.c).bot_id, null);
                break;
            default:
                org.telegram.ui.ry ryVar = (org.telegram.ui.ry) this.b;
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) this.c;
                org.telegram.ui.ActionBar.f3 f3Var = f3VarArr[0];
                if (f3Var != null) {
                    f3Var.dismiss();
                    f3VarArr[0] = null;
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.mv(ryVar, 24), 300L);
                break;
        }
    }

    public /* synthetic */ ar0(w21 w21Var, ArrayList arrayList, th thVar) {
        this.a = 7;
        this.b = w21Var;
        this.c = arrayList;
    }
}
