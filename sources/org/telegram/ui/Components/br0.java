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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class br0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ br0(int i10, Object obj, Object obj2) {
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
                st0 st0Var = (st0) this.b;
                pq0 pq0Var = (pq0) this.c;
                st0Var.G = null;
                st0Var.H = null;
                pq0Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(220L).setListener(new jd0(pq0Var, 13)).start();
                break;
            case 1:
                zu0 zu0Var = (zu0) this.b;
                ai.e9 e9Var = (ai.e9) this.c;
                ur0 ur0Var = zu0Var.W;
                if (ur0Var != null) {
                    int i14 = e9Var.a;
                    ur0Var.n.d(i14, ur0Var.s.i(i14));
                    break;
                }
                break;
            case 2:
                vc.a0(((it0) this.b).f.v1).Q(R.raw.contact_check, 36, LocaleController.formatString(R.string.YouJoinedChannel, ((TLRPC.Chat) this.c).title)).k(true);
                break;
            case 3:
                vt0 vt0Var = (vt0) this.b;
                String str = (String) this.c;
                if (!vt0Var.v.t1[vt0Var.r].a.isEmpty() && ((i10 = vt0Var.r) == 1 || i10 == 4)) {
                    MessageObject messageObject = (MessageObject) hg.k0.h(1, vt0Var.v.t1[i10].a);
                    int id2 = messageObject.getId();
                    long dialogId = messageObject.getDialogId();
                    zu0 zu0Var2 = vt0Var.v;
                    vt0Var.F(id2, str, dialogId, zu0Var2.j1 == zu0Var2.v1.getUserConfig().getClientUserId() ? messageObject.getSavedDialogId() : 0L);
                } else if (vt0Var.r == 3) {
                    zu0 zu0Var3 = vt0Var.v;
                    vt0Var.F(0, str, zu0Var3.j1, zu0Var3.F);
                }
                int i15 = vt0Var.r;
                if (i15 == 1 || i15 == 4) {
                    ArrayList arrayList3 = new ArrayList(vt0Var.v.t1[vt0Var.r].a);
                    vt0Var.s++;
                    Utilities.searchQueue.postRunnable(new gr0(vt0Var, str, arrayList3, i12));
                    break;
                }
                break;
            case 4:
                vt0 vt0Var2 = (vt0) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                zu0 zu0Var4 = vt0Var2.v;
                boolean z10 = zu0Var4.V0;
                st0[] st0VarArr = zu0Var4.k0;
                if (z10) {
                    vt0Var2.s--;
                    int h = vt0Var2.h();
                    vt0Var2.d = arrayList4;
                    int h10 = vt0Var2.h();
                    if (vt0Var2.s == 0 || h10 != 0) {
                        zu0Var4.m1(false);
                    }
                    for (int i16 = 0; i16 < st0VarArr.length; i16++) {
                        st0 st0Var2 = st0VarArr[i16];
                        if (st0Var2.F == vt0Var2.r) {
                            if (vt0Var2.s == 0 && h10 == 0) {
                                st0Var2.w.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
                                st0VarArr[i16].w.f.setVisibility(8);
                                st0VarArr[i16].w.e(false, true);
                            } else if (h == 0) {
                                zu0Var4.z(st0Var2.h, 0, null);
                            }
                        }
                    }
                    vt0Var2.l();
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
                MessagesController.getInstance(((jy0) this.b).a.a).updateEmojiStatus((TLRPC.EmojiStatus) this.c);
                break;
            case 7:
                y21 y21Var = (y21) this.b;
                MessagesController.getInstance(y21Var.b).getTopicsController().deleteTopics(-y21Var.c, (ArrayList) this.c);
                int i18 = y21.f0;
                break;
            case 8:
                y21 y21Var2 = (y21) this.b;
                TLRPC.Updates updates = (TLRPC.Updates) this.c;
                y21Var2.getClass();
                MessagesController.getInstance(y21Var2.b).loadFullChat(updates.chats.get(0).id, 0, true);
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
                w31.o((w31) this.b, (TLObject) this.c);
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
                org.telegram.ui.al alVar = (org.telegram.ui.al) this.b;
                ((org.telegram.ui.ActionBar.o1) this.c).d(true);
                n41.a(alVar.getContext(), alVar.d);
                break;
            case 13:
                ((TranslateController) this.c).setHideTranslateDialog(((org.telegram.ui.al) this.b).b, false);
                break;
            case 14:
                UndoView undoView = (UndoView) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                if (tLObject2 instanceof TLRPC.PaymentReceipt) {
                    undoView.s.presentFragment(new org.telegram.ui.yo0((TLRPC.PaymentReceipt) tLObject2));
                    break;
                } else {
                    int i19 = UndoView.e0;
                    undoView.getClass();
                    break;
                }
            case 15:
                ((j51) this.b).D.onClick((org.telegram.ui.Cells.v8) this.c);
                break;
            case 16:
                h71 h71Var = (h71) this.b;
                b2.u0 u0Var = (b2.u0) this.c;
                Throwable cause = u0Var.getCause();
                if (!(cause instanceof r2.n) || (!cause.toString().contains("av1") && !cause.toString().contains("av01"))) {
                    TextureView textureView = h71Var.n;
                    if (textureView == null || ((h71Var.E || !(cause instanceof r2.p)) && !(cause instanceof a3.x))) {
                        h71Var.J.onError(h71Var, u0Var);
                        break;
                    } else {
                        h71Var.E = true;
                        if (h71Var.d != null) {
                            ViewGroup viewGroup = (ViewGroup) textureView.getParent();
                            if (viewGroup != null) {
                                int indexOfChild = viewGroup.indexOfChild(h71Var.n);
                                viewGroup.removeView(h71Var.n);
                                viewGroup.addView(h71Var.n, indexOfChild);
                            }
                            DispatchQueue dispatchQueue = h71Var.b;
                            if (dispatchQueue != null) {
                                dispatchQueue.postRunnable(new y61(h71Var, i13));
                                break;
                            } else {
                                i2.e0 e0Var = h71Var.d;
                                TextureView textureView2 = h71Var.n;
                                e0Var.B1();
                                if (textureView2 != null && textureView2 == e0Var.V) {
                                    e0Var.B1();
                                    e0Var.o1();
                                    e0Var.t1(null);
                                    e0Var.m1(0, 0);
                                }
                                h71Var.d.v1(h71Var.n);
                                ArrayList arrayList5 = h71Var.N;
                                if (arrayList5 != null) {
                                    h71Var.F(arrayList5, h71Var.O);
                                } else if (h71Var.U) {
                                    h71Var.G(h71Var.Q, h71Var.S, h71Var.R, h71Var.T);
                                } else {
                                    h71Var.D(h71Var.Q, h71Var.S);
                                }
                                h71Var.C();
                                break;
                            }
                        }
                    }
                } else {
                    FileLog.e(u0Var);
                    FileLog.e("av1 codec failed, we think this codec is not supported");
                    MessagesController.getGlobalMainSettings().edit().putBoolean("unsupport_video/av01", true).commit();
                    HashMap hashMap = h71.l0;
                    if (hashMap != null) {
                        hashMap.clear();
                    }
                    ArrayList arrayList6 = h71Var.N;
                    if (arrayList6 != null) {
                        int i20 = 0;
                        while (i20 < arrayList6.size()) {
                            d71 d71Var = (d71) arrayList6.get(i20);
                            int i21 = 0;
                            while (true) {
                                ArrayList arrayList7 = d71Var.d;
                                if (i21 < arrayList7.size()) {
                                    f71 f71Var = (f71) arrayList7.get(i21);
                                    if (!TextUtils.isEmpty(f71Var.m) && !h71.Y(f71Var.m)) {
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
                    h71Var.N = arrayList2;
                    if (arrayList2 != null) {
                        h71Var.F(arrayList2, h71Var.O);
                        break;
                    }
                }
                break;
            case 17:
                ((g71) this.b).f.K.onVisualizerUpdate(true, true, (float[]) this.c);
                break;
            case 18:
                o71 o71Var = (o71) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                if (bitmap != null) {
                    if (o71Var.w != null) {
                        Bitmap bitmap2 = o71Var.v;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        o71Var.v = o71Var.w;
                    }
                    o71Var.w = bitmap;
                    Bitmap bitmap3 = o71Var.w;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                    o71Var.G = bitmapShader;
                    bitmapShader.setLocalMatrix(o71Var.L);
                    o71Var.J.setShader(o71Var.G);
                    o71Var.invalidate();
                    int dp = AndroidUtilities.dp(150.0f);
                    float width = bitmap.getWidth() / bitmap.getHeight();
                    if (width > 1.0f) {
                        i11 = (int) (dp / width);
                    } else {
                        dp = (int) (dp * width);
                        i11 = dp;
                    }
                    ViewGroup.LayoutParams layoutParams = o71Var.getLayoutParams();
                    if (o71Var.getVisibility() != 0 || layoutParams.width != dp || layoutParams.height != i11) {
                        layoutParams.width = dp;
                        layoutParams.height = i11;
                        o71Var.setVisibility(0);
                        o71Var.requestLayout();
                    }
                }
                o71Var.f = null;
                break;
            case 19:
                final c91 c91Var = (c91) this.b;
                c91Var.e.b.evaluateJavascript((String) this.c, new ValueCallback() { // from class: org.telegram.ui.Components.b91
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(Object obj) {
                        String str3 = (String) obj;
                        c91 c91Var2 = c91.this;
                        String[] strArr = c91Var2.c;
                        strArr[0] = strArr[0].replace(c91Var2.d, "/signature/" + str3.substring(1, str3.length() - 1));
                        c91Var2.b.countDown();
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
                org.telegram.ui.au auVar = (org.telegram.ui.au) this.b;
                String lowerCase = ((String) this.c).trim().toLowerCase();
                int i22 = 25;
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new br0(i22, auVar, new ArrayList()));
                    break;
                } else {
                    String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                    ArrayList arrayList8 = new ArrayList();
                    ArrayList arrayList9 = auVar.f;
                    int size = arrayList9.size();
                    while (i13 < size) {
                        Object obj2 = arrayList9.get(i13);
                        i13++;
                        org.telegram.ui.xt xtVar = (org.telegram.ui.xt) obj2;
                        String str3 = xtVar.a;
                        if (str3 == null) {
                            str3 = "";
                        }
                        String lowerCase2 = str3.toLowerCase();
                        String lowerCase3 = AndroidUtilities.translitSafe(xtVar.a).toLowerCase();
                        String str4 = xtVar.b;
                        if (str4 == null) {
                            str4 = "";
                        }
                        String lowerCase4 = str4.toLowerCase();
                        String lowerCase5 = AndroidUtilities.translitSafe(xtVar.b).toLowerCase();
                        String str5 = xtVar.c;
                        if (str5 == null) {
                            str5 = "";
                        }
                        String concat = TextUtils.isEmpty(str5) ? "" : "+".concat(str5);
                        if (lowerCase2.startsWith(lowerCase)) {
                            arrayList = arrayList9;
                        } else {
                            arrayList = arrayList9;
                            if (!lowerCase2.contains(" ".concat(lowerCase)) && !lowerCase3.startsWith(translitSafe) && !org.telegram.messenger.w1.w(" ", translitSafe, lowerCase3) && !lowerCase4.startsWith(lowerCase) && !lowerCase4.contains(" ".concat(lowerCase)) && !lowerCase5.startsWith(translitSafe) && !org.telegram.messenger.w1.w(" ", translitSafe, lowerCase5) && !str5.startsWith(lowerCase) && !concat.startsWith(lowerCase)) {
                                arrayList9 = arrayList;
                            }
                        }
                        arrayList8.add(xtVar);
                        arrayList9 = arrayList;
                    }
                    AndroidUtilities.runOnUIThread(new br0(25, auVar, arrayList8));
                    break;
                }
                break;
            case 25:
                org.telegram.ui.au auVar2 = (org.telegram.ui.au) this.b;
                ArrayList arrayList10 = (ArrayList) this.c;
                org.telegram.ui.cu cuVar = auVar2.h;
                if (cuVar.f) {
                    auVar2.e = arrayList10;
                    if (cuVar.e && (ml0Var = cuVar.a) != null) {
                        s4.h0 adapter = ml0Var.getAdapter();
                        org.telegram.ui.au auVar3 = cuVar.d;
                        if (adapter != auVar3) {
                            cuVar.a.setAdapter(auVar3);
                            cuVar.a.setFastScrollVisible(false);
                        }
                    }
                    auVar2.l();
                    break;
                }
                break;
            case 26:
                MessagesController.getInstance(((org.telegram.ui.eu) this.b).currentAccount).processUpdates((TLRPC.Updates) this.c, false);
                break;
            case 27:
                org.telegram.ui.wy.e0((org.telegram.ui.wy) this.b, (String) this.c);
                break;
            case 28:
                ei.k3.j(((org.telegram.ui.wy) this.b).currentAccount, ((TLRPC.TL_attachMenuBot) this.c).bot_id, null);
                break;
            default:
                org.telegram.ui.wy wyVar = (org.telegram.ui.wy) this.b;
                org.telegram.ui.ActionBar.g3[] g3VarArr = (org.telegram.ui.ActionBar.g3[]) this.c;
                org.telegram.ui.ActionBar.g3 g3Var = g3VarArr[0];
                if (g3Var != null) {
                    g3Var.dismiss();
                    g3VarArr[0] = null;
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.rv(wyVar, 24), 300L);
                break;
        }
    }

    public /* synthetic */ br0(y21 y21Var, ArrayList arrayList, sh shVar) {
        this.a = 7;
        this.b = y21Var;
        this.c = arrayList;
    }
}
