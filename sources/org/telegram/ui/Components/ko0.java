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

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ko0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ko0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int indexOf;
        int K;
        int i10;
        int i11;
        ArrayList arrayList;
        ArrayList arrayList2 = null;
        int i12 = 0;
        int i13 = 1;
        switch (this.a) {
            case 0:
                so0 so0Var = (so0) this.b;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) this.c;
                ArrayList arrayList3 = so0Var.K;
                if (!arrayList3.isEmpty() && (indexOf = arrayList3.indexOf(tL_sponsoredPeer)) >= 0 && (K = so0Var.K()) < so0Var.h()) {
                    arrayList3.remove(indexOf);
                    so0Var.u(K + 1 + indexOf);
                    int size = so0Var.j0.e.size();
                    int size2 = arrayList3.size();
                    if (so0Var.G0) {
                        size = Math.min(3, size);
                    }
                    if (size2 + size <= 0) {
                        so0Var.u(K);
                        break;
                    }
                }
                break;
            case 1:
                so0 so0Var2 = (so0) this.b;
                org.telegram.ui.ey eyVar = (org.telegram.ui.ey) this.c;
                so0Var2.S();
                xc.a0(eyVar).c(LocaleController.getString(R.string.AdHidden)).j();
                break;
            case 2:
                ((ep0) this.b).sendAccessibilityEvent((View) this.c, 4);
                break;
            case 3:
                ef efVar = (ef) this.b;
                org.telegram.ui.sn snVar = (org.telegram.ui.sn) this.c;
                if (snVar != null) {
                    snVar.presentFragment(new PremiumPreviewFragment(0, "select_sender"));
                    efVar.dismiss();
                    break;
                }
                break;
            case 4:
                ((WindowManager) this.c).removeView(((ef) this.b).B);
                break;
            case 5:
                ir0 ir0Var = (ir0) this.b;
                TLObject tLObject = (TLObject) this.c;
                if (tLObject != null) {
                    ir0Var.l0 = (TLRPC.TL_exportedMessageLink) tLObject;
                    ir0Var.f1();
                    if (ir0Var.n0) {
                        ir0Var.R0();
                    }
                }
                ir0Var.m0 = false;
                break;
            case 6:
                qu0 qu0Var = (qu0) this.b;
                pr0 pr0Var = (pr0) this.c;
                qu0Var.G = null;
                qu0Var.H = null;
                pr0Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(220L).setListener(new i60(pr0Var, 20)).start();
                break;
            case 7:
                xv0 xv0Var = (xv0) this.b;
                ci.a7 a7Var = (ci.a7) this.c;
                ss0 ss0Var = xv0Var.W;
                if (ss0Var != null) {
                    int i14 = a7Var.a;
                    ss0Var.n.d(i14, ss0Var.s.i(i14));
                    break;
                }
                break;
            case 8:
                xc.a0(((gu0) this.b).f.v1).Q(R.raw.contact_check, 36, LocaleController.formatString(R.string.YouJoinedChannel, ((TLRPC.Chat) this.c).title)).k(true);
                break;
            case 9:
                tu0 tu0Var = (tu0) this.b;
                String str = (String) this.c;
                if (!tu0Var.v.t1[tu0Var.r].a.isEmpty() && ((i10 = tu0Var.r) == 1 || i10 == 4)) {
                    MessageObject messageObject = (MessageObject) i2.o1.i(1, tu0Var.v.t1[i10].a);
                    int id2 = messageObject.getId();
                    long dialogId = messageObject.getDialogId();
                    xv0 xv0Var2 = tu0Var.v;
                    tu0Var.F(id2, str, dialogId, xv0Var2.j1 == xv0Var2.v1.getUserConfig().getClientUserId() ? messageObject.getSavedDialogId() : 0L);
                } else if (tu0Var.r == 3) {
                    xv0 xv0Var3 = tu0Var.v;
                    tu0Var.F(0, str, xv0Var3.j1, xv0Var3.F);
                }
                int i15 = tu0Var.r;
                if (i15 == 1 || i15 == 4) {
                    ArrayList arrayList4 = new ArrayList(tu0Var.v.t1[tu0Var.r].a);
                    tu0Var.s++;
                    Utilities.searchQueue.postRunnable(new lg((Object) tu0Var, (Object) str, arrayList4, 26));
                    break;
                }
                break;
            case 10:
                tu0 tu0Var2 = (tu0) this.b;
                ArrayList arrayList5 = (ArrayList) this.c;
                xv0 xv0Var4 = tu0Var2.v;
                boolean z10 = xv0Var4.V0;
                qu0[] qu0VarArr = xv0Var4.k0;
                if (z10) {
                    tu0Var2.s--;
                    int h = tu0Var2.h();
                    tu0Var2.d = arrayList5;
                    int h10 = tu0Var2.h();
                    if (tu0Var2.s == 0 || h10 != 0) {
                        xv0Var4.p1(false);
                    }
                    for (int i16 = 0; i16 < qu0VarArr.length; i16++) {
                        qu0 qu0Var2 = qu0VarArr[i16];
                        if (qu0Var2.F == tu0Var2.r) {
                            if (tu0Var2.s == 0 && h10 == 0) {
                                qu0Var2.w.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
                                qu0VarArr[i16].w.f.setVisibility(8);
                                qu0VarArr[i16].w.e(false, true);
                            } else if (h == 0) {
                                xv0Var4.z(qu0Var2.h, 0, null);
                            }
                        }
                    }
                    tu0Var2.l();
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
                MessagesController.getInstance(((gz0) this.b).a.a).updateEmojiStatus((TLRPC.EmojiStatus) this.c);
                break;
            case 13:
                w31 w31Var = (w31) this.b;
                MessagesController.getInstance(w31Var.b).getTopicsController().deleteTopics(-w31Var.c, (ArrayList) this.c);
                int i18 = w31.i0;
                break;
            case 14:
                w31 w31Var2 = (w31) this.b;
                TLRPC.Updates updates = (TLRPC.Updates) this.c;
                w31Var2.getClass();
                MessagesController.getInstance(w31Var2.b).loadFullChat(updates.chats.get(0).id, 0, true);
                break;
            case 15:
                org.telegram.ui.Cells.k1 k1Var = (org.telegram.ui.Cells.k1) this.b;
                TLRPC.TL_messages_transcribedAudio tL_messages_transcribedAudio = (TLRPC.TL_messages_transcribedAudio) this.c;
                if (k1Var != null) {
                    k1Var.d0(tL_messages_transcribedAudio.trial_remains_num > 0 ? 1 : 2);
                    break;
                }
                break;
            case 16:
                y41.p((y41) this.b, (TLObject) this.c);
                break;
            case 17:
                org.telegram.ui.sk skVar = (org.telegram.ui.sk) this.b;
                ((org.telegram.ui.ActionBar.m1) this.c).d(true);
                p51.a(skVar.getContext(), skVar.d);
                break;
            case 18:
                ((TranslateController) this.c).setHideTranslateDialog(((org.telegram.ui.sk) this.b).b, false);
                break;
            case 19:
                UndoView undoView = (UndoView) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                if (tLObject3 instanceof TLRPC.PaymentReceipt) {
                    undoView.s.presentFragment(new org.telegram.ui.io0((TLRPC.PaymentReceipt) tLObject3));
                    break;
                } else {
                    int i19 = UndoView.i0;
                    undoView.getClass();
                    break;
                }
            case 20:
                ((m61) this.b).D.onClick((org.telegram.ui.Cells.v8) this.c);
                break;
            case 21:
                j81 j81Var = (j81) this.b;
                b2.y0 y0Var = (b2.y0) this.c;
                Throwable cause = y0Var.getCause();
                if (!(cause instanceof r2.n) || (!cause.toString().contains("av1") && !cause.toString().contains("av01"))) {
                    TextureView textureView = j81Var.n;
                    if (textureView == null || ((j81Var.E || !(cause instanceof r2.p)) && !(cause instanceof a3.x))) {
                        j81Var.J.onError(j81Var, y0Var);
                        break;
                    } else {
                        j81Var.E = true;
                        if (j81Var.d != null) {
                            ViewGroup viewGroup = (ViewGroup) textureView.getParent();
                            if (viewGroup != null) {
                                int indexOfChild = viewGroup.indexOfChild(j81Var.n);
                                viewGroup.removeView(j81Var.n);
                                viewGroup.addView(j81Var.n, indexOfChild);
                            }
                            DispatchQueue dispatchQueue = j81Var.b;
                            if (dispatchQueue != null) {
                                dispatchQueue.postRunnable(new x71(j81Var, i13));
                                break;
                            } else {
                                i2.h0 h0Var = j81Var.d;
                                TextureView textureView2 = j81Var.n;
                                h0Var.F1();
                                if (textureView2 != null && textureView2 == h0Var.X) {
                                    h0Var.F1();
                                    h0Var.s1();
                                    h0Var.x1(null);
                                    h0Var.q1(0, 0);
                                }
                                j81Var.d.z1(j81Var.n);
                                ArrayList arrayList6 = j81Var.N;
                                if (arrayList6 != null) {
                                    j81Var.F(arrayList6, j81Var.O);
                                } else if (j81Var.U) {
                                    j81Var.G(j81Var.Q, j81Var.S, j81Var.R, j81Var.T);
                                } else {
                                    j81Var.D(j81Var.Q, j81Var.S);
                                }
                                j81Var.C();
                                break;
                            }
                        }
                    }
                } else {
                    FileLog.e(y0Var);
                    FileLog.e("av1 codec failed, we think this codec is not supported");
                    MessagesController.getGlobalMainSettings().edit().putBoolean("unsupport_video/av01", true).commit();
                    HashMap hashMap = j81.l0;
                    if (hashMap != null) {
                        hashMap.clear();
                    }
                    ArrayList arrayList7 = j81Var.N;
                    if (arrayList7 != null) {
                        int i20 = 0;
                        while (i20 < arrayList7.size()) {
                            f81 f81Var = (f81) arrayList7.get(i20);
                            int i21 = 0;
                            while (true) {
                                ArrayList arrayList8 = f81Var.d;
                                if (i21 < arrayList8.size()) {
                                    h81 h81Var = (h81) arrayList8.get(i21);
                                    if (!TextUtils.isEmpty(h81Var.m) && !j81.Y(h81Var.m)) {
                                        arrayList8.remove(i21);
                                        i21--;
                                    }
                                    i21++;
                                } else {
                                    if (arrayList8.isEmpty()) {
                                        arrayList7.remove(i20);
                                        i20--;
                                    }
                                    i20++;
                                }
                            }
                        }
                        arrayList2 = arrayList7;
                    }
                    j81Var.N = arrayList2;
                    if (arrayList2 != null) {
                        j81Var.F(arrayList2, j81Var.O);
                        break;
                    }
                }
                break;
            case 22:
                ((i81) this.b).f.K.onVisualizerUpdate(true, true, (float[]) this.c);
                break;
            case 23:
                q81 q81Var = (q81) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                if (bitmap != null) {
                    if (q81Var.w != null) {
                        Bitmap bitmap2 = q81Var.v;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        q81Var.v = q81Var.w;
                    }
                    q81Var.w = bitmap;
                    Bitmap bitmap3 = q81Var.w;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                    q81Var.G = bitmapShader;
                    bitmapShader.setLocalMatrix(q81Var.L);
                    q81Var.J.setShader(q81Var.G);
                    q81Var.invalidate();
                    int dp = AndroidUtilities.dp(150.0f);
                    float width = bitmap.getWidth() / bitmap.getHeight();
                    if (width > 1.0f) {
                        i11 = (int) (dp / width);
                    } else {
                        dp = (int) (dp * width);
                        i11 = dp;
                    }
                    ViewGroup.LayoutParams layoutParams = q81Var.getLayoutParams();
                    if (q81Var.getVisibility() != 0 || layoutParams.width != dp || layoutParams.height != i11) {
                        layoutParams.width = dp;
                        layoutParams.height = i11;
                        q81Var.setVisibility(0);
                        q81Var.requestLayout();
                    }
                }
                q81Var.f = null;
                break;
            case 24:
                final ca1 ca1Var = (ca1) this.b;
                ca1Var.e.b.evaluateJavascript((String) this.c, new ValueCallback() { // from class: org.telegram.ui.Components.ba1
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(Object obj) {
                        String str2 = (String) obj;
                        ca1 ca1Var2 = ca1.this;
                        String[] strArr = ca1Var2.c;
                        strArr[0] = strArr[0].replace(ca1Var2.d, "/signature/" + str2.substring(1, str2.length() - 1));
                        ca1Var2.b.countDown();
                    }
                });
                break;
            case 25:
                ((org.telegram.ui.Components.voip.k) this.b).a.setOnClickListener((View.OnClickListener) this.c);
                break;
            case 26:
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) this.b;
                Bitmap bitmap4 = (Bitmap) this.c;
                HashMap<String, Bitmap> hashMap2 = tVar.F.thumbs;
                ChatObject.VideoParticipant videoParticipant = tVar.w;
                boolean z11 = videoParticipant.presentation;
                TLRPC.GroupCallParticipant groupCallParticipant = videoParticipant.participant;
                hashMap2.put(z11 ? groupCallParticipant.presentationEndpoint : groupCallParticipant.videoEndpoint, bitmap4);
                break;
            case 27:
                org.telegram.ui.Components.voip.l0 l0Var = (org.telegram.ui.Components.voip.l0) this.b;
                org.telegram.ui.Components.voip.t tVar2 = (org.telegram.ui.Components.voip.t) this.c;
                l0Var.getClass();
                tVar2.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setListener(new org.telegram.ui.Components.voip.y(tVar2)).setDuration(150L).start();
                break;
            case 28:
                mm0 mm0Var = (mm0) this.b;
                Object obj = this.c;
                if (mm0Var != null) {
                    mm0Var.setOnItemClickListener((am0) obj);
                    break;
                }
                break;
            default:
                org.telegram.ui.pt ptVar = (org.telegram.ui.pt) this.b;
                String lowerCase = ((String) this.c).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.ot(i12, ptVar, new ArrayList()));
                    break;
                } else {
                    String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                    ArrayList arrayList9 = new ArrayList();
                    ArrayList arrayList10 = ptVar.f;
                    int size3 = arrayList10.size();
                    int i22 = 0;
                    while (i22 < size3) {
                        Object obj2 = arrayList10.get(i22);
                        i22++;
                        org.telegram.ui.lt ltVar = (org.telegram.ui.lt) obj2;
                        String str2 = ltVar.a;
                        if (str2 == null) {
                            str2 = "";
                        }
                        String lowerCase2 = str2.toLowerCase();
                        String lowerCase3 = AndroidUtilities.translitSafe(ltVar.a).toLowerCase();
                        String str3 = ltVar.b;
                        if (str3 == null) {
                            str3 = "";
                        }
                        String lowerCase4 = str3.toLowerCase();
                        String lowerCase5 = AndroidUtilities.translitSafe(ltVar.b).toLowerCase();
                        String str4 = ltVar.c;
                        if (str4 == null) {
                            str4 = "";
                        }
                        String concat = TextUtils.isEmpty(str4) ? "" : "+".concat(str4);
                        if (lowerCase2.startsWith(lowerCase)) {
                            arrayList = arrayList10;
                        } else {
                            arrayList = arrayList10;
                            if (!lowerCase2.contains(" ".concat(lowerCase)) && !lowerCase3.startsWith(translitSafe) && !org.telegram.messenger.v0.w(" ", translitSafe, lowerCase3) && !lowerCase4.startsWith(lowerCase) && !lowerCase4.contains(" ".concat(lowerCase)) && !lowerCase5.startsWith(translitSafe) && !org.telegram.messenger.v0.w(" ", translitSafe, lowerCase5) && !str4.startsWith(lowerCase) && !concat.startsWith(lowerCase)) {
                                arrayList10 = arrayList;
                            }
                        }
                        arrayList9.add(ltVar);
                        arrayList10 = arrayList;
                    }
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.ot(0, ptVar, arrayList9));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ko0(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }
}
