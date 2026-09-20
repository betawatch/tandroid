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

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
        int i13 = 0;
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
                org.telegram.ui.uy uyVar = (org.telegram.ui.uy) this.c;
                eo0Var2.T();
                xc.a0(uyVar).c(LocaleController.getString(R.string.AdHidden)).j();
                break;
            case 2:
                ((po0) this.b).sendAccessibilityEvent((View) this.c, 4);
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
                br0Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(220L).setListener(new dd0(br0Var, 14)).start();
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
                xc.a0(((st0) this.b).f.v1).Q(R.raw.contact_check, 36, LocaleController.formatString(R.string.YouJoinedChannel, ((TLRPC.Chat) this.c).title)).k(true);
                break;
            case 9:
                fu0 fu0Var = (fu0) this.b;
                String str = (String) this.c;
                if (!fu0Var.v.t1[fu0Var.r].a.isEmpty() && ((i10 = fu0Var.r) == 1 || i10 == 4)) {
                    MessageObject messageObject = (MessageObject) hg.k0.g(1, fu0Var.v.t1[i10].a);
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
                MessagesController.getInstance(((ty0) this.b).a.a).updateEmojiStatus((TLRPC.EmojiStatus) this.c);
                break;
            case 13:
                l31 l31Var = (l31) this.b;
                MessagesController.getInstance(l31Var.b).getTopicsController().deleteTopics(-l31Var.c, (ArrayList) this.c);
                int i18 = l31.f0;
                break;
            case 14:
                l31 l31Var2 = (l31) this.b;
                TLRPC.Updates updates = (TLRPC.Updates) this.c;
                l31Var2.getClass();
                MessagesController.getInstance(l31Var2.b).loadFullChat(updates.chats.get(0).id, 0, true);
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
                j41.o((j41) this.b, (TLObject) this.c);
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
                org.telegram.ui.yk ykVar = (org.telegram.ui.yk) this.b;
                ((org.telegram.ui.ActionBar.n1) this.c).d(true);
                a51.a(ykVar.getContext(), ykVar.d);
                break;
            case 19:
                ((TranslateController) this.c).setHideTranslateDialog(((org.telegram.ui.yk) this.b).b, false);
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
                ((w51) this.b).D.onClick((org.telegram.ui.Cells.w8) this.c);
                break;
            case 22:
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
                                dispatchQueue.postRunnable(new l71(t71Var, i13));
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
                        int i20 = 0;
                        while (i20 < arrayList6.size()) {
                            p71 p71Var = (p71) arrayList6.get(i20);
                            int i21 = 0;
                            while (true) {
                                ArrayList arrayList7 = p71Var.d;
                                if (i21 < arrayList7.size()) {
                                    r71 r71Var = (r71) arrayList7.get(i21);
                                    if (!TextUtils.isEmpty(r71Var.m) && !t71.Y(r71Var.m)) {
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
                    t71Var.N = arrayList;
                    if (arrayList != null) {
                        t71Var.F(arrayList, t71Var.O);
                        break;
                    }
                }
                break;
            case 23:
                ((s71) this.b).f.K.onVisualizerUpdate(true, true, (float[]) this.c);
                break;
            case 24:
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
            case 25:
                final o91 o91Var = (o91) this.b;
                o91Var.e.b.evaluateJavascript((String) this.c, new ValueCallback() { // from class: org.telegram.ui.Components.n91
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(Object obj) {
                        String str3 = (String) obj;
                        o91 o91Var2 = o91.this;
                        String[] strArr = o91Var2.c;
                        strArr[0] = strArr[0].replace(o91Var2.d, "/signature/" + str3.substring(1, str3.length() - 1));
                        o91Var2.b.countDown();
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
                vl0 vl0Var = (vl0) this.b;
                Object obj = this.c;
                if (vl0Var != null) {
                    vl0Var.setOnItemClickListener((jl0) obj);
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
