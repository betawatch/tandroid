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

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class po0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ po0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11;
        ArrayList arrayList;
        wl0 wl0Var;
        int i12 = 8;
        ArrayList arrayList2 = null;
        int i13 = 0;
        switch (this.a) {
            case 0:
                ((qo0) this.b).sendAccessibilityEvent((View) this.c, 4);
                break;
            case 1:
                ef efVar = (ef) this.b;
                org.telegram.ui.zn znVar = (org.telegram.ui.zn) this.c;
                if (znVar != null) {
                    znVar.presentFragment(new PremiumPreviewFragment(0, "select_sender"));
                    efVar.dismiss();
                    break;
                }
                break;
            case 2:
                ((WindowManager) this.c).removeView(((ef) this.b).B);
                break;
            case 3:
                vq0 vq0Var = (vq0) this.b;
                TLObject tLObject = (TLObject) this.c;
                if (tLObject != null) {
                    vq0Var.k0 = (TLRPC.TL_exportedMessageLink) tLObject;
                    vq0Var.Z0();
                    if (vq0Var.m0) {
                        vq0Var.M0();
                    }
                }
                vq0Var.l0 = false;
                break;
            case 4:
                du0 du0Var = (du0) this.b;
                cr0 cr0Var = (cr0) this.c;
                du0Var.G = null;
                du0Var.H = null;
                cr0Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(220L).setListener(new ed0(cr0Var, 14)).start();
                break;
            case 5:
                kv0 kv0Var = (kv0) this.b;
                ai.e9 e9Var = (ai.e9) this.c;
                fs0 fs0Var = kv0Var.W;
                if (fs0Var != null) {
                    int i14 = e9Var.a;
                    fs0Var.n.d(i14, fs0Var.s.i(i14));
                    break;
                }
                break;
            case 6:
                xc.a0(((tt0) this.b).f.v1).Q(R.raw.contact_check, 36, LocaleController.formatString(R.string.YouJoinedChannel, ((TLRPC.Chat) this.c).title)).k(true);
                break;
            case 7:
                gu0 gu0Var = (gu0) this.b;
                String str = (String) this.c;
                if (!gu0Var.v.t1[gu0Var.r].a.isEmpty() && ((i10 = gu0Var.r) == 1 || i10 == 4)) {
                    MessageObject messageObject = (MessageObject) hg.k0.g(1, gu0Var.v.t1[i10].a);
                    int id2 = messageObject.getId();
                    long dialogId = messageObject.getDialogId();
                    kv0 kv0Var2 = gu0Var.v;
                    gu0Var.F(id2, str, dialogId, kv0Var2.j1 == kv0Var2.v1.getUserConfig().getClientUserId() ? messageObject.getSavedDialogId() : 0L);
                } else if (gu0Var.r == 3) {
                    kv0 kv0Var3 = gu0Var.v;
                    gu0Var.F(0, str, kv0Var3.j1, kv0Var3.F);
                }
                int i15 = gu0Var.r;
                if (i15 == 1 || i15 == 4) {
                    ArrayList arrayList3 = new ArrayList(gu0Var.v.t1[gu0Var.r].a);
                    gu0Var.s++;
                    Utilities.searchQueue.postRunnable(new dn0((Object) gu0Var, (Serializable) str, arrayList3, i12));
                    break;
                }
                break;
            case 8:
                gu0 gu0Var2 = (gu0) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                kv0 kv0Var4 = gu0Var2.v;
                boolean z10 = kv0Var4.V0;
                du0[] du0VarArr = kv0Var4.k0;
                if (z10) {
                    gu0Var2.s--;
                    int h = gu0Var2.h();
                    gu0Var2.d = arrayList4;
                    int h10 = gu0Var2.h();
                    if (gu0Var2.s == 0 || h10 != 0) {
                        kv0Var4.m1(false);
                    }
                    for (int i16 = 0; i16 < du0VarArr.length; i16++) {
                        du0 du0Var2 = du0VarArr[i16];
                        if (du0Var2.F == gu0Var2.r) {
                            if (gu0Var2.s == 0 && h10 == 0) {
                                du0Var2.w.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
                                du0VarArr[i16].w.f.setVisibility(8);
                                du0VarArr[i16].w.e(false, true);
                            } else if (h == 0) {
                                kv0Var4.z(du0Var2.h, 0, null);
                            }
                        }
                    }
                    gu0Var2.l();
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
                MessagesController.getInstance(((uy0) this.b).a.a).updateEmojiStatus((TLRPC.EmojiStatus) this.c);
                break;
            case 11:
                m31 m31Var = (m31) this.b;
                MessagesController.getInstance(m31Var.b).getTopicsController().deleteTopics(-m31Var.c, (ArrayList) this.c);
                int i18 = m31.f0;
                break;
            case 12:
                m31 m31Var2 = (m31) this.b;
                TLRPC.Updates updates = (TLRPC.Updates) this.c;
                m31Var2.getClass();
                MessagesController.getInstance(m31Var2.b).loadFullChat(updates.chats.get(0).id, 0, true);
                break;
            case 13:
                org.telegram.ui.Cells.l1 l1Var = (org.telegram.ui.Cells.l1) this.b;
                TLRPC.TL_messages_transcribedAudio tL_messages_transcribedAudio = (TLRPC.TL_messages_transcribedAudio) this.c;
                if (l1Var != null) {
                    l1Var.d0(tL_messages_transcribedAudio.trial_remains_num > 0 ? 1 : 2);
                    break;
                }
                break;
            case 14:
                k41.o((k41) this.b, (TLObject) this.c);
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
                org.telegram.ui.yk ykVar = (org.telegram.ui.yk) this.b;
                ((org.telegram.ui.ActionBar.n1) this.c).d(true);
                b51.a(ykVar.getContext(), ykVar.d);
                break;
            case 17:
                ((TranslateController) this.c).setHideTranslateDialog(((org.telegram.ui.yk) this.b).b, false);
                break;
            case 18:
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
            case 19:
                ((x51) this.b).D.onClick((org.telegram.ui.Cells.v8) this.c);
                break;
            case 20:
                u71 u71Var = (u71) this.b;
                b2.u0 u0Var = (b2.u0) this.c;
                Throwable cause = u0Var.getCause();
                if (!(cause instanceof r2.n) || (!cause.toString().contains("av1") && !cause.toString().contains("av01"))) {
                    TextureView textureView = u71Var.n;
                    if (textureView == null || ((u71Var.E || !(cause instanceof r2.p)) && !(cause instanceof a3.x))) {
                        u71Var.J.onError(u71Var, u0Var);
                        break;
                    } else {
                        u71Var.E = true;
                        if (u71Var.d != null) {
                            ViewGroup viewGroup = (ViewGroup) textureView.getParent();
                            if (viewGroup != null) {
                                int indexOfChild = viewGroup.indexOfChild(u71Var.n);
                                viewGroup.removeView(u71Var.n);
                                viewGroup.addView(u71Var.n, indexOfChild);
                            }
                            DispatchQueue dispatchQueue = u71Var.b;
                            if (dispatchQueue != null) {
                                dispatchQueue.postRunnable(new m71(u71Var, i13));
                                break;
                            } else {
                                i2.e0 e0Var = u71Var.d;
                                TextureView textureView2 = u71Var.n;
                                e0Var.B1();
                                if (textureView2 != null && textureView2 == e0Var.V) {
                                    e0Var.B1();
                                    e0Var.o1();
                                    e0Var.t1(null);
                                    e0Var.m1(0, 0);
                                }
                                u71Var.d.v1(u71Var.n);
                                ArrayList arrayList5 = u71Var.N;
                                if (arrayList5 != null) {
                                    u71Var.F(arrayList5, u71Var.O);
                                } else if (u71Var.U) {
                                    u71Var.G(u71Var.Q, u71Var.S, u71Var.R, u71Var.T);
                                } else {
                                    u71Var.D(u71Var.Q, u71Var.S);
                                }
                                u71Var.C();
                                break;
                            }
                        }
                    }
                } else {
                    FileLog.e(u0Var);
                    FileLog.e("av1 codec failed, we think this codec is not supported");
                    MessagesController.getGlobalMainSettings().edit().putBoolean("unsupport_video/av01", true).commit();
                    HashMap hashMap = u71.l0;
                    if (hashMap != null) {
                        hashMap.clear();
                    }
                    ArrayList arrayList6 = u71Var.N;
                    if (arrayList6 != null) {
                        int i20 = 0;
                        while (i20 < arrayList6.size()) {
                            q71 q71Var = (q71) arrayList6.get(i20);
                            int i21 = 0;
                            while (true) {
                                ArrayList arrayList7 = q71Var.d;
                                if (i21 < arrayList7.size()) {
                                    s71 s71Var = (s71) arrayList7.get(i21);
                                    if (!TextUtils.isEmpty(s71Var.m) && !u71.Y(s71Var.m)) {
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
                    u71Var.N = arrayList2;
                    if (arrayList2 != null) {
                        u71Var.F(arrayList2, u71Var.O);
                        break;
                    }
                }
                break;
            case 21:
                ((t71) this.b).f.K.onVisualizerUpdate(true, true, (float[]) this.c);
                break;
            case 22:
                b81 b81Var = (b81) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                if (bitmap != null) {
                    if (b81Var.w != null) {
                        Bitmap bitmap2 = b81Var.v;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        b81Var.v = b81Var.w;
                    }
                    b81Var.w = bitmap;
                    Bitmap bitmap3 = b81Var.w;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                    b81Var.G = bitmapShader;
                    bitmapShader.setLocalMatrix(b81Var.L);
                    b81Var.J.setShader(b81Var.G);
                    b81Var.invalidate();
                    int dp = AndroidUtilities.dp(150.0f);
                    float width = bitmap.getWidth() / bitmap.getHeight();
                    if (width > 1.0f) {
                        i11 = (int) (dp / width);
                    } else {
                        dp = (int) (dp * width);
                        i11 = dp;
                    }
                    ViewGroup.LayoutParams layoutParams = b81Var.getLayoutParams();
                    if (b81Var.getVisibility() != 0 || layoutParams.width != dp || layoutParams.height != i11) {
                        layoutParams.width = dp;
                        layoutParams.height = i11;
                        b81Var.setVisibility(0);
                        b81Var.requestLayout();
                    }
                }
                b81Var.f = null;
                break;
            case 23:
                final p91 p91Var = (p91) this.b;
                p91Var.e.b.evaluateJavascript((String) this.c, new ValueCallback() { // from class: org.telegram.ui.Components.o91
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(Object obj) {
                        String str3 = (String) obj;
                        p91 p91Var2 = p91.this;
                        String[] strArr = p91Var2.c;
                        strArr[0] = strArr[0].replace(p91Var2.d, "/signature/" + str3.substring(1, str3.length() - 1));
                        p91Var2.b.countDown();
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
                wl0 wl0Var2 = (wl0) this.b;
                Object obj = this.c;
                if (wl0Var2 != null) {
                    wl0Var2.setOnItemClickListener((kl0) obj);
                    break;
                }
                break;
            case 28:
                org.telegram.ui.yt ytVar = (org.telegram.ui.yt) this.b;
                String lowerCase = ((String) this.c).trim().toLowerCase();
                int i22 = 29;
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new po0(i22, ytVar, new ArrayList()));
                    break;
                } else {
                    String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                    ArrayList arrayList8 = new ArrayList();
                    ArrayList arrayList9 = ytVar.f;
                    int size = arrayList9.size();
                    while (i13 < size) {
                        Object obj2 = arrayList9.get(i13);
                        i13++;
                        org.telegram.ui.vt vtVar = (org.telegram.ui.vt) obj2;
                        String str3 = vtVar.a;
                        if (str3 == null) {
                            str3 = "";
                        }
                        String lowerCase2 = str3.toLowerCase();
                        String lowerCase3 = AndroidUtilities.translitSafe(vtVar.a).toLowerCase();
                        String str4 = vtVar.b;
                        if (str4 == null) {
                            str4 = "";
                        }
                        String lowerCase4 = str4.toLowerCase();
                        String lowerCase5 = AndroidUtilities.translitSafe(vtVar.b).toLowerCase();
                        String str5 = vtVar.c;
                        if (str5 == null) {
                            str5 = "";
                        }
                        String concat = TextUtils.isEmpty(str5) ? "" : "+".concat(str5);
                        if (lowerCase2.startsWith(lowerCase)) {
                            arrayList = arrayList9;
                        } else {
                            arrayList = arrayList9;
                            if (!lowerCase2.contains(" ".concat(lowerCase)) && !lowerCase3.startsWith(translitSafe) && !org.telegram.messenger.wh.u(" ", translitSafe, lowerCase3) && !lowerCase4.startsWith(lowerCase) && !lowerCase4.contains(" ".concat(lowerCase)) && !lowerCase5.startsWith(translitSafe) && !org.telegram.messenger.wh.u(" ", translitSafe, lowerCase5) && !str5.startsWith(lowerCase) && !concat.startsWith(lowerCase)) {
                                arrayList9 = arrayList;
                            }
                        }
                        arrayList8.add(vtVar);
                        arrayList9 = arrayList;
                    }
                    AndroidUtilities.runOnUIThread(new po0(29, ytVar, arrayList8));
                    break;
                }
                break;
            default:
                org.telegram.ui.yt ytVar2 = (org.telegram.ui.yt) this.b;
                ArrayList arrayList10 = (ArrayList) this.c;
                org.telegram.ui.au auVar = ytVar2.h;
                if (auVar.f) {
                    ytVar2.e = arrayList10;
                    if (auVar.e && (wl0Var = auVar.a) != null) {
                        s4.h0 adapter = wl0Var.getAdapter();
                        org.telegram.ui.yt ytVar3 = auVar.d;
                        if (adapter != ytVar3) {
                            auVar.a.setAdapter(ytVar3);
                            auVar.a.setFastScrollVisible(false);
                        }
                    }
                    ytVar2.l();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ po0(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }
}
