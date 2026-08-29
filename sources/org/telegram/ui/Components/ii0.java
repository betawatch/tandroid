package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.webkit.ValueCallback;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ii0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ii0(int i10, Object obj, Object obj2) {
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
        ArrayList arrayList = null;
        int i12 = 0;
        switch (this.a) {
            case 0:
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.b;
                Object obj = (ViewParent) this.c;
                s1Var.invalidate();
                if (obj instanceof View) {
                    ((View) obj).invalidate();
                    break;
                }
                break;
            case 1:
                RLottieNative rLottieNative = (RLottieNative) this.b;
                RLottieNative rLottieNative2 = (RLottieNative) this.c;
                if (rLottieNative != null) {
                    rLottieNative.d();
                }
                if (rLottieNative2 != null) {
                    rLottieNative2.d();
                    break;
                }
                break;
            case 2:
                fj0 fj0Var = (fj0) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                ArrayList arrayList3 = fj0Var.r;
                fj0Var.n.addAll(arrayList2);
                int size = arrayList2.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj2 = arrayList2.get(i13);
                    i13++;
                    ej0 ej0Var = (ej0) obj2;
                    int i14 = 0;
                    while (true) {
                        if (i14 >= arrayList3.size()) {
                            arrayList3.add(ej0Var);
                        } else if (MessageObject.getObjectPeerId(((ej0) arrayList3.get(i14)).a) != MessageObject.getObjectPeerId(ej0Var.a)) {
                            i14++;
                        } else if (ej0Var.c > 0) {
                            ((ej0) arrayList3.get(i14)).c = ej0Var.c;
                        }
                    }
                }
                q0.a aVar = fj0Var.w;
                if (aVar != null) {
                    aVar.accept(arrayList2);
                }
                fj0Var.a();
                break;
            case 3:
                mn0 mn0Var = (mn0) this.b;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) this.c;
                ArrayList arrayList4 = mn0Var.G;
                if (!arrayList4.isEmpty() && (indexOf = arrayList4.indexOf(tL_sponsoredPeer)) >= 0 && (L = mn0Var.L()) < mn0Var.h()) {
                    arrayList4.remove(indexOf);
                    mn0Var.u(L + 1 + indexOf);
                    int size2 = mn0Var.f0.e.size();
                    int size3 = arrayList4.size();
                    if (mn0Var.C0) {
                        size2 = Math.min(3, size2);
                    }
                    if (size3 + size2 <= 0) {
                        mn0Var.u(L);
                        break;
                    }
                }
                break;
            case 4:
                mn0 mn0Var2 = (mn0) this.b;
                org.telegram.ui.fy fyVar = (org.telegram.ui.fy) this.c;
                mn0Var2.T();
                tc.a0(fyVar).c(LocaleController.getString(R.string.AdHidden)).j();
                break;
            case 5:
                ((xn0) this.b).sendAccessibilityEvent((View) this.c, 4);
                break;
            case 6:
                ye yeVar = (ye) this.b;
                org.telegram.ui.tn tnVar = (org.telegram.ui.tn) this.c;
                if (tnVar != null) {
                    tnVar.presentFragment(new PremiumPreviewFragment(0, "select_sender"));
                    yeVar.dismiss();
                    break;
                }
                break;
            case 7:
                ((WindowManager) this.c).removeView(((ye) this.b).B);
                break;
            case 8:
                dq0 dq0Var = (dq0) this.b;
                TLObject tLObject = (TLObject) this.c;
                if (tLObject != null) {
                    dq0Var.g0 = (TLRPC.TL_exportedMessageLink) tLObject;
                    dq0Var.Z0();
                    if (dq0Var.i0) {
                        dq0Var.M0();
                    }
                }
                dq0Var.h0 = false;
                break;
            case 9:
                it0 it0Var = (it0) this.b;
                kq0 kq0Var = (kq0) this.c;
                it0Var.C = null;
                it0Var.D = null;
                kq0Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(220L).setListener(new zz(kq0Var, 21)).start();
                break;
            case 10:
                qu0 qu0Var = (qu0) this.b;
                lh.l6 l6Var = (lh.l6) this.c;
                kr0 kr0Var = qu0Var.S;
                if (kr0Var != null) {
                    int i15 = l6Var.a;
                    kr0Var.n.d(i15, kr0Var.s.i(i15));
                    break;
                }
                break;
            case 11:
                tc.a0(((ys0) this.b).f.r1).Q(R.raw.contact_check, 36, LocaleController.formatString(R.string.YouJoinedChannel, ((TLRPC.Chat) this.c).title)).k(true);
                break;
            case 12:
                lt0 lt0Var = (lt0) this.b;
                String str = (String) this.c;
                if (!lt0Var.v.p1[lt0Var.r].a.isEmpty() && ((i10 = lt0Var.r) == 1 || i10 == 4)) {
                    MessageObject messageObject = (MessageObject) j7.l1.i(1, lt0Var.v.p1[i10].a);
                    int id2 = messageObject.getId();
                    long dialogId = messageObject.getDialogId();
                    qu0 qu0Var2 = lt0Var.v;
                    lt0Var.F(id2, str, dialogId, qu0Var2.f1 == qu0Var2.r1.getUserConfig().getClientUserId() ? messageObject.getSavedDialogId() : 0L);
                } else if (lt0Var.r == 3) {
                    qu0 qu0Var3 = lt0Var.v;
                    lt0Var.F(0, str, qu0Var3.f1, qu0Var3.B);
                }
                int i16 = lt0Var.r;
                if (i16 == 1 || i16 == 4) {
                    ArrayList arrayList5 = new ArrayList(lt0Var.v.p1[lt0Var.r].a);
                    lt0Var.s++;
                    Utilities.searchQueue.postRunnable(new g(lt0Var, str, arrayList5, 29));
                    break;
                }
                break;
            case 13:
                lt0 lt0Var2 = (lt0) this.b;
                ArrayList arrayList6 = (ArrayList) this.c;
                qu0 qu0Var4 = lt0Var2.v;
                boolean z10 = qu0Var4.R0;
                it0[] it0VarArr = qu0Var4.g0;
                if (z10) {
                    lt0Var2.s--;
                    int h = lt0Var2.h();
                    lt0Var2.d = arrayList6;
                    int h10 = lt0Var2.h();
                    if (lt0Var2.s == 0 || h10 != 0) {
                        qu0Var4.m1(false);
                    }
                    for (int i17 = 0; i17 < it0VarArr.length; i17++) {
                        it0 it0Var2 = it0VarArr[i17];
                        if (it0Var2.B == lt0Var2.r) {
                            if (lt0Var2.s == 0 && h10 == 0) {
                                it0Var2.w.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
                                it0VarArr[i17].w.f.setVisibility(8);
                                it0VarArr[i17].w.e(false, true);
                            } else if (h == 0) {
                                qu0Var4.z(it0Var2.h, 0, null);
                            }
                        }
                    }
                    lt0Var2.l();
                    break;
                }
                break;
            case 14:
                TLObject tLObject2 = (TLObject) this.b;
                TLRPC.Document document = (TLRPC.Document) this.c;
                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                int i18 = NotificationCenter.customStickerCreated;
                Boolean bool = Boolean.FALSE;
                notificationCenter.postNotificationNameOnUIThread(i18, bool, tLObject2, document, null, bool);
                break;
            case 15:
                MessagesController.getInstance(((ay0) this.b).a.a).updateEmojiStatus((TLRPC.EmojiStatus) this.c);
                break;
            case 16:
                m21 m21Var = (m21) this.b;
                MessagesController.getInstance(m21Var.b).getTopicsController().deleteTopics(-m21Var.c, (ArrayList) this.c);
                int i19 = m21.b0;
                break;
            case 17:
                m21 m21Var2 = (m21) this.b;
                TLRPC.Updates updates = (TLRPC.Updates) this.c;
                m21Var2.getClass();
                MessagesController.getInstance(m21Var2.b).loadFullChat(updates.chats.get(0).id, 0, true);
                break;
            case 18:
                org.telegram.ui.Cells.j1 j1Var = (org.telegram.ui.Cells.j1) this.b;
                TLRPC.TL_messages_transcribedAudio tL_messages_transcribedAudio = (TLRPC.TL_messages_transcribedAudio) this.c;
                if (j1Var != null) {
                    j1Var.c0(tL_messages_transcribedAudio.trial_remains_num > 0 ? 1 : 2);
                    break;
                }
                break;
            case 19:
                k31.o((k31) this.b, (TLObject) this.c);
                break;
            case 20:
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.b;
                String str2 = (String) this.c;
                if (callback2 != null) {
                    callback2.run(str2, Boolean.FALSE);
                    break;
                }
                break;
            case 21:
                org.telegram.ui.qk qkVar = (org.telegram.ui.qk) this.b;
                ((org.telegram.ui.ActionBar.o1) this.c).d(true);
                a41.a(qkVar.getContext(), qkVar.d);
                break;
            case 22:
                ((TranslateController) this.c).setHideTranslateDialog(((org.telegram.ui.qk) this.b).b, false);
                break;
            case 23:
                UndoView undoView = (UndoView) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                if (tLObject3 instanceof TLRPC.PaymentReceipt) {
                    undoView.s.presentFragment(new org.telegram.ui.bo0((TLRPC.PaymentReceipt) tLObject3));
                    break;
                } else {
                    int i20 = UndoView.a0;
                    undoView.getClass();
                    break;
                }
            case 24:
                ((w41) this.b).D.onClick((org.telegram.ui.Cells.p8) this.c);
                break;
            case 25:
                x61 x61Var = (x61) this.b;
                j3.v1 v1Var = (j3.v1) this.c;
                Throwable cause = v1Var.getCause();
                if (!(cause instanceof a4.o) || (!cause.toString().contains("av1") && !cause.toString().contains("av01"))) {
                    TextureView textureView = x61Var.n;
                    if (textureView == null || ((x61Var.A || !(cause instanceof a4.s)) && !(cause instanceof g5.m))) {
                        x61Var.F.onError(x61Var, v1Var);
                        break;
                    } else {
                        x61Var.A = true;
                        if (x61Var.d != null) {
                            ViewGroup viewGroup = (ViewGroup) textureView.getParent();
                            if (viewGroup != null) {
                                int indexOfChild = viewGroup.indexOfChild(x61Var.n);
                                viewGroup.removeView(x61Var.n);
                                viewGroup.addView(x61Var.n, indexOfChild);
                            }
                            DispatchQueue dispatchQueue = x61Var.b;
                            if (dispatchQueue != null) {
                                dispatchQueue.postRunnable(new o61(x61Var, i12));
                                break;
                            } else {
                                j3.k0 k0Var = x61Var.d;
                                TextureView textureView2 = x61Var.n;
                                k0Var.q0();
                                if (textureView2 != null && textureView2 == k0Var.V) {
                                    k0Var.q0();
                                    k0Var.b0();
                                    k0Var.g0(null);
                                    k0Var.a0(0, 0);
                                }
                                x61Var.d.j0(x61Var.n);
                                ArrayList arrayList7 = x61Var.J;
                                if (arrayList7 != null) {
                                    x61Var.G(arrayList7, x61Var.K);
                                } else if (x61Var.Q) {
                                    x61Var.H(x61Var.M, x61Var.O, x61Var.N, x61Var.P);
                                } else {
                                    x61Var.E(x61Var.M, x61Var.O);
                                }
                                x61Var.D();
                                break;
                            }
                        }
                    }
                } else {
                    FileLog.e(v1Var);
                    FileLog.e("av1 codec failed, we think this codec is not supported");
                    MessagesController.getGlobalMainSettings().edit().putBoolean("unsupport_video/av01", true).commit();
                    HashMap hashMap = x61.h0;
                    if (hashMap != null) {
                        hashMap.clear();
                    }
                    ArrayList arrayList8 = x61Var.J;
                    if (arrayList8 != null) {
                        int i21 = 0;
                        while (i21 < arrayList8.size()) {
                            t61 t61Var = (t61) arrayList8.get(i21);
                            int i22 = 0;
                            while (true) {
                                ArrayList arrayList9 = t61Var.d;
                                if (i22 < arrayList9.size()) {
                                    v61 v61Var = (v61) arrayList9.get(i22);
                                    if (!TextUtils.isEmpty(v61Var.m) && !x61.Y(v61Var.m)) {
                                        arrayList9.remove(i22);
                                        i22--;
                                    }
                                    i22++;
                                } else {
                                    if (arrayList9.isEmpty()) {
                                        arrayList8.remove(i21);
                                        i21--;
                                    }
                                    i21++;
                                }
                            }
                        }
                        arrayList = arrayList8;
                    }
                    x61Var.J = arrayList;
                    if (arrayList != null) {
                        x61Var.G(arrayList, x61Var.K);
                        break;
                    }
                }
                break;
            case 26:
                ((w61) this.b).f.G.onVisualizerUpdate(true, true, (float[]) this.c);
                break;
            case 27:
                d71 d71Var = (d71) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                if (bitmap != null) {
                    if (d71Var.w != null) {
                        Bitmap bitmap2 = d71Var.v;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        d71Var.v = d71Var.w;
                    }
                    d71Var.w = bitmap;
                    Bitmap bitmap3 = d71Var.w;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                    d71Var.C = bitmapShader;
                    bitmapShader.setLocalMatrix(d71Var.H);
                    d71Var.F.setShader(d71Var.C);
                    d71Var.invalidate();
                    int dp = AndroidUtilities.dp(150.0f);
                    float width = bitmap.getWidth() / bitmap.getHeight();
                    if (width > 1.0f) {
                        i11 = (int) (dp / width);
                    } else {
                        dp = (int) (dp * width);
                        i11 = dp;
                    }
                    ViewGroup.LayoutParams layoutParams = d71Var.getLayoutParams();
                    if (d71Var.getVisibility() != 0 || layoutParams.width != dp || layoutParams.height != i11) {
                        layoutParams.width = dp;
                        layoutParams.height = i11;
                        d71Var.setVisibility(0);
                        d71Var.requestLayout();
                    }
                }
                d71Var.f = null;
                break;
            case 28:
                final r81 r81Var = (r81) this.b;
                r81Var.e.b.evaluateJavascript((String) this.c, new ValueCallback() { // from class: org.telegram.ui.Components.q81
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(Object obj3) {
                        String str3 = (String) obj3;
                        r81 r81Var2 = r81.this;
                        String[] strArr = r81Var2.c;
                        strArr[0] = strArr[0].replace(r81Var2.d, "/signature/" + str3.substring(1, str3.length() - 1));
                        r81Var2.b.countDown();
                    }
                });
                break;
            default:
                ((org.telegram.ui.Components.voip.k) this.b).a.setOnClickListener((View.OnClickListener) this.c);
                break;
        }
    }

    public /* synthetic */ ii0(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }
}
