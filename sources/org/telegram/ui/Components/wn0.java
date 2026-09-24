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

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wn0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wn0(int i10, Object obj, Object obj2) {
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
                eo0 eo0Var = (eo0) this.b;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) this.c;
                ArrayList arrayList2 = eo0Var.K;
                if (!arrayList2.isEmpty() && (indexOf = arrayList2.indexOf(tL_sponsoredPeer)) >= 0 && (L = eo0Var.L()) < eo0Var.h()) {
                    arrayList2.remove(indexOf);
                    eo0Var.u(L + 1 + indexOf);
                    int size = eo0Var.j0.e.size();
                    int size2 = arrayList2.size();
                    if (eo0Var.G0) {
                        size = Math.min(3, size);
                    }
                    if (size2 + size <= 0) {
                        eo0Var.u(L);
                        break;
                    }
                }
                break;
            case 1:
                eo0 eo0Var2 = (eo0) this.b;
                org.telegram.ui.qy qyVar = (org.telegram.ui.qy) this.c;
                eo0Var2.T();
                yc.a0(qyVar).c(LocaleController.getString(R.string.AdHidden)).j();
                break;
            case 2:
                ((po0) this.b).sendAccessibilityEvent((View) this.c, 4);
                break;
            case 3:
                ff ffVar = (ff) this.b;
                org.telegram.ui.wn wnVar = (org.telegram.ui.wn) this.c;
                if (wnVar != null) {
                    wnVar.presentFragment(new PremiumPreviewFragment(0, "select_sender"));
                    ffVar.dismiss();
                    break;
                }
                break;
            case 4:
                ((WindowManager) this.c).removeView(((ff) this.b).B);
                break;
            case 5:
                uq0 uq0Var = (uq0) this.b;
                TLObject tLObject = (TLObject) this.c;
                if (tLObject != null) {
                    uq0Var.k0 = (TLRPC.TL_exportedMessageLink) tLObject;
                    uq0Var.Z0();
                    if (uq0Var.m0) {
                        uq0Var.M0();
                    }
                }
                uq0Var.l0 = false;
                break;
            case 6:
                cu0 cu0Var = (cu0) this.b;
                br0 br0Var = (br0) this.c;
                cu0Var.G = null;
                cu0Var.H = null;
                br0Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(220L).setListener(new fd0(br0Var, 14)).start();
                break;
            case 7:
                jv0 jv0Var = (jv0) this.b;
                ai.e9 e9Var = (ai.e9) this.c;
                es0 es0Var = jv0Var.W;
                if (es0Var != null) {
                    int i14 = e9Var.a;
                    es0Var.n.d(i14, es0Var.s.i(i14));
                    break;
                }
                break;
            case 8:
                yc.a0(((st0) this.b).f.v1).Q(R.raw.contact_check, 36, LocaleController.formatString(R.string.YouJoinedChannel, ((TLRPC.Chat) this.c).title)).k(true);
                break;
            case 9:
                fu0 fu0Var = (fu0) this.b;
                String str = (String) this.c;
                if (!fu0Var.v.t1[fu0Var.r].a.isEmpty() && ((i10 = fu0Var.r) == 1 || i10 == 4)) {
                    MessageObject messageObject = (MessageObject) hg.c.g(1, fu0Var.v.t1[i10].a);
                    int id2 = messageObject.getId();
                    long dialogId = messageObject.getDialogId();
                    jv0 jv0Var2 = fu0Var.v;
                    fu0Var.F(id2, str, dialogId, jv0Var2.j1 == jv0Var2.v1.getUserConfig().getClientUserId() ? messageObject.getSavedDialogId() : 0L);
                } else if (fu0Var.r == 3) {
                    jv0 jv0Var3 = fu0Var.v;
                    fu0Var.F(0, str, jv0Var3.j1, jv0Var3.F);
                }
                int i15 = fu0Var.r;
                if (i15 == 1 || i15 == 4) {
                    ArrayList arrayList3 = new ArrayList(fu0Var.v.t1[fu0Var.r].a);
                    fu0Var.s++;
                    Utilities.searchQueue.postRunnable(new cn0((Object) fu0Var, (Serializable) str, arrayList3, i12));
                    break;
                }
                break;
            case 10:
                fu0 fu0Var2 = (fu0) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                jv0 jv0Var4 = fu0Var2.v;
                boolean z10 = jv0Var4.V0;
                cu0[] cu0VarArr = jv0Var4.k0;
                if (z10) {
                    fu0Var2.s--;
                    int h = fu0Var2.h();
                    fu0Var2.d = arrayList4;
                    int h10 = fu0Var2.h();
                    if (fu0Var2.s == 0 || h10 != 0) {
                        jv0Var4.m1(false);
                    }
                    for (int i16 = 0; i16 < cu0VarArr.length; i16++) {
                        cu0 cu0Var2 = cu0VarArr[i16];
                        if (cu0Var2.F == fu0Var2.r) {
                            if (fu0Var2.s == 0 && h10 == 0) {
                                cu0Var2.w.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
                                cu0VarArr[i16].w.f.setVisibility(8);
                                cu0VarArr[i16].w.e(false, true);
                            } else if (h == 0) {
                                jv0Var4.z(cu0Var2.h, 0, null);
                            }
                        }
                    }
                    fu0Var2.l();
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
                MessagesController.getInstance(((sy0) this.b).a.a).updateEmojiStatus((TLRPC.EmojiStatus) this.c);
                break;
            case 13:
                k31 k31Var = (k31) this.b;
                MessagesController.getInstance(k31Var.b).getTopicsController().deleteTopics(-k31Var.c, (ArrayList) this.c);
                int i18 = k31.f0;
                break;
            case 14:
                k31 k31Var2 = (k31) this.b;
                TLRPC.Updates updates = (TLRPC.Updates) this.c;
                k31Var2.getClass();
                MessagesController.getInstance(k31Var2.b).loadFullChat(updates.chats.get(0).id, 0, true);
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
                i41.o((i41) this.b, (TLObject) this.c);
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
                org.telegram.ui.wk wkVar = (org.telegram.ui.wk) this.b;
                ((org.telegram.ui.ActionBar.m1) this.c).d(true);
                z41.a(wkVar.getContext(), wkVar.d);
                break;
            case 19:
                ((TranslateController) this.c).setHideTranslateDialog(((org.telegram.ui.wk) this.b).b, false);
                break;
            case 20:
                UndoView undoView = (UndoView) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                if (tLObject3 instanceof TLRPC.PaymentReceipt) {
                    undoView.s.presentFragment(new org.telegram.ui.oo0((TLRPC.PaymentReceipt) tLObject3));
                    break;
                } else {
                    int i19 = UndoView.e0;
                    undoView.getClass();
                    break;
                }
            case 21:
                ((v51) this.b).D.onClick((org.telegram.ui.Cells.v8) this.c);
                break;
            case 22:
                s71 s71Var = (s71) this.b;
                b2.u0 u0Var = (b2.u0) this.c;
                Throwable cause = u0Var.getCause();
                if (!(cause instanceof r2.n) || (!cause.toString().contains("av1") && !cause.toString().contains("av01"))) {
                    TextureView textureView = s71Var.n;
                    if (textureView == null || ((s71Var.E || !(cause instanceof r2.p)) && !(cause instanceof a3.x))) {
                        s71Var.J.onError(s71Var, u0Var);
                        break;
                    } else {
                        s71Var.E = true;
                        if (s71Var.d != null) {
                            ViewGroup viewGroup = (ViewGroup) textureView.getParent();
                            if (viewGroup != null) {
                                int indexOfChild = viewGroup.indexOfChild(s71Var.n);
                                viewGroup.removeView(s71Var.n);
                                viewGroup.addView(s71Var.n, indexOfChild);
                            }
                            DispatchQueue dispatchQueue = s71Var.b;
                            if (dispatchQueue != null) {
                                dispatchQueue.postRunnable(new g71(s71Var, i13));
                                break;
                            } else {
                                i2.f0 f0Var = s71Var.d;
                                TextureView textureView2 = s71Var.n;
                                f0Var.B1();
                                if (textureView2 != null && textureView2 == f0Var.V) {
                                    f0Var.B1();
                                    f0Var.o1();
                                    f0Var.t1(null);
                                    f0Var.m1(0, 0);
                                }
                                s71Var.d.v1(s71Var.n);
                                ArrayList arrayList5 = s71Var.N;
                                if (arrayList5 != null) {
                                    s71Var.F(arrayList5, s71Var.O);
                                } else if (s71Var.U) {
                                    s71Var.G(s71Var.Q, s71Var.S, s71Var.R, s71Var.T);
                                } else {
                                    s71Var.D(s71Var.Q, s71Var.S);
                                }
                                s71Var.C();
                                break;
                            }
                        }
                    }
                } else {
                    FileLog.e(u0Var);
                    FileLog.e("av1 codec failed, we think this codec is not supported");
                    MessagesController.getGlobalMainSettings().edit().putBoolean("unsupport_video/av01", true).commit();
                    HashMap hashMap = s71.l0;
                    if (hashMap != null) {
                        hashMap.clear();
                    }
                    ArrayList arrayList6 = s71Var.N;
                    if (arrayList6 != null) {
                        int i20 = 0;
                        while (i20 < arrayList6.size()) {
                            o71 o71Var = (o71) arrayList6.get(i20);
                            int i21 = 0;
                            while (true) {
                                ArrayList arrayList7 = o71Var.d;
                                if (i21 < arrayList7.size()) {
                                    q71 q71Var = (q71) arrayList7.get(i21);
                                    if (!TextUtils.isEmpty(q71Var.m) && !s71.Y(q71Var.m)) {
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
                    s71Var.N = arrayList;
                    if (arrayList != null) {
                        s71Var.F(arrayList, s71Var.O);
                        break;
                    }
                }
                break;
            case 23:
                ((r71) this.b).f.K.onVisualizerUpdate(true, true, (float[]) this.c);
                break;
            case 24:
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
            case 25:
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
                wl0 wl0Var = (wl0) this.b;
                Object obj = this.c;
                if (wl0Var != null) {
                    wl0Var.setOnItemClickListener((kl0) obj);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ wn0(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }
}
