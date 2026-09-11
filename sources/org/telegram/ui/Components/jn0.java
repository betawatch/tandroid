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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class jn0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jn0(int i10, Object obj, Object obj2) {
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
        int i12 = 5;
        ArrayList arrayList = null;
        int i13 = 0;
        switch (this.a) {
            case 0:
                rn0 rn0Var = (rn0) this.b;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) this.c;
                ArrayList arrayList2 = rn0Var.K;
                if (!arrayList2.isEmpty() && (indexOf = arrayList2.indexOf(tL_sponsoredPeer)) >= 0 && (L = rn0Var.L()) < rn0Var.h()) {
                    arrayList2.remove(indexOf);
                    rn0Var.u(L + 1 + indexOf);
                    int size = rn0Var.j0.e.size();
                    int size2 = arrayList2.size();
                    if (rn0Var.G0) {
                        size = Math.min(3, size);
                    }
                    if (size2 + size <= 0) {
                        rn0Var.u(L);
                        break;
                    }
                }
                break;
            case 1:
                rn0 rn0Var2 = (rn0) this.b;
                org.telegram.ui.uy uyVar = (org.telegram.ui.uy) this.c;
                rn0Var2.T();
                yc.a0(uyVar).c(LocaleController.getString(R.string.AdHidden)).j();
                break;
            case 2:
                ((co0) this.b).sendAccessibilityEvent((View) this.c, 4);
                break;
            case 3:
                ff ffVar = (ff) this.b;
                org.telegram.ui.co coVar = (org.telegram.ui.co) this.c;
                if (coVar != null) {
                    coVar.presentFragment(new PremiumPreviewFragment(0, "select_sender"));
                    ffVar.dismiss();
                    break;
                }
                break;
            case 4:
                ((WindowManager) this.c).removeView(((ff) this.b).B);
                break;
            case 5:
                hq0 hq0Var = (hq0) this.b;
                TLObject tLObject = (TLObject) this.c;
                if (tLObject != null) {
                    hq0Var.k0 = (TLRPC.TL_exportedMessageLink) tLObject;
                    hq0Var.Z0();
                    if (hq0Var.m0) {
                        hq0Var.M0();
                    }
                }
                hq0Var.l0 = false;
                break;
            case 6:
                qt0 qt0Var = (qt0) this.b;
                oq0 oq0Var = (oq0) this.c;
                qt0Var.G = null;
                qt0Var.H = null;
                oq0Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(220L).setListener(new r80(oq0Var, 16)).start();
                break;
            case 7:
                xu0 xu0Var = (xu0) this.b;
                bi.m8 m8Var = (bi.m8) this.c;
                sr0 sr0Var = xu0Var.W;
                if (sr0Var != null) {
                    int i14 = m8Var.a;
                    sr0Var.n.d(i14, sr0Var.s.i(i14));
                    break;
                }
                break;
            case 8:
                yc.a0(((gt0) this.b).f.v1).Q(R.raw.contact_check, 36, LocaleController.formatString(R.string.YouJoinedChannel, ((TLRPC.Chat) this.c).title)).k(true);
                break;
            case 9:
                tt0 tt0Var = (tt0) this.b;
                String str = (String) this.c;
                if (!tt0Var.v.t1[tt0Var.r].a.isEmpty() && ((i10 = tt0Var.r) == 1 || i10 == 4)) {
                    MessageObject messageObject = (MessageObject) i2.g.h(1, tt0Var.v.t1[i10].a);
                    int id2 = messageObject.getId();
                    long dialogId = messageObject.getDialogId();
                    xu0 xu0Var2 = tt0Var.v;
                    tt0Var.F(id2, str, dialogId, xu0Var2.j1 == xu0Var2.v1.getUserConfig().getClientUserId() ? messageObject.getSavedDialogId() : 0L);
                } else if (tt0Var.r == 3) {
                    xu0 xu0Var3 = tt0Var.v;
                    tt0Var.F(0, str, xu0Var3.j1, xu0Var3.F);
                }
                int i15 = tt0Var.r;
                if (i15 == 1 || i15 == 4) {
                    ArrayList arrayList3 = new ArrayList(tt0Var.v.t1[tt0Var.r].a);
                    tt0Var.s++;
                    Utilities.searchQueue.postRunnable(new er0(tt0Var, str, arrayList3, i12));
                    break;
                }
                break;
            case 10:
                tt0 tt0Var2 = (tt0) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                xu0 xu0Var4 = tt0Var2.v;
                boolean z10 = xu0Var4.V0;
                qt0[] qt0VarArr = xu0Var4.k0;
                if (z10) {
                    tt0Var2.s--;
                    int h = tt0Var2.h();
                    tt0Var2.d = arrayList4;
                    int h10 = tt0Var2.h();
                    if (tt0Var2.s == 0 || h10 != 0) {
                        xu0Var4.m1(false);
                    }
                    for (int i16 = 0; i16 < qt0VarArr.length; i16++) {
                        qt0 qt0Var2 = qt0VarArr[i16];
                        if (qt0Var2.F == tt0Var2.r) {
                            if (tt0Var2.s == 0 && h10 == 0) {
                                qt0Var2.w.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
                                qt0VarArr[i16].w.f.setVisibility(8);
                                qt0VarArr[i16].w.e(false, true);
                            } else if (h == 0) {
                                xu0Var4.z(qt0Var2.h, 0, null);
                            }
                        }
                    }
                    tt0Var2.l();
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
                MessagesController.getInstance(((hy0) this.b).a.a).updateEmojiStatus((TLRPC.EmojiStatus) this.c);
                break;
            case 13:
                w21 w21Var = (w21) this.b;
                MessagesController.getInstance(w21Var.b).getTopicsController().deleteTopics(-w21Var.c, (ArrayList) this.c);
                int i18 = w21.f0;
                break;
            case 14:
                w21 w21Var2 = (w21) this.b;
                TLRPC.Updates updates = (TLRPC.Updates) this.c;
                w21Var2.getClass();
                MessagesController.getInstance(w21Var2.b).loadFullChat(updates.chats.get(0).id, 0, true);
                break;
            case 15:
                org.telegram.ui.Cells.k1 k1Var = (org.telegram.ui.Cells.k1) this.b;
                TLRPC.TL_messages_transcribedAudio tL_messages_transcribedAudio = (TLRPC.TL_messages_transcribedAudio) this.c;
                if (k1Var != null) {
                    k1Var.c0(tL_messages_transcribedAudio.trial_remains_num > 0 ? 1 : 2);
                    break;
                }
                break;
            case 16:
                u31.o((u31) this.b, (TLObject) this.c);
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
                org.telegram.ui.zk zkVar = (org.telegram.ui.zk) this.b;
                ((org.telegram.ui.ActionBar.n1) this.c).d(true);
                l41.a(zkVar.getContext(), zkVar.d);
                break;
            case 19:
                ((TranslateController) this.c).setHideTranslateDialog(((org.telegram.ui.zk) this.b).b, false);
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
                ((h51) this.b).D.onClick((org.telegram.ui.Cells.v8) this.c);
                break;
            case 22:
                g71 g71Var = (g71) this.b;
                b2.u0 u0Var = (b2.u0) this.c;
                Throwable cause = u0Var.getCause();
                if (!(cause instanceof r2.n) || (!cause.toString().contains("av1") && !cause.toString().contains("av01"))) {
                    TextureView textureView = g71Var.n;
                    if (textureView == null || ((g71Var.E || !(cause instanceof r2.p)) && !(cause instanceof a3.w))) {
                        g71Var.J.onError(g71Var, u0Var);
                        break;
                    } else {
                        g71Var.E = true;
                        if (g71Var.d != null) {
                            ViewGroup viewGroup = (ViewGroup) textureView.getParent();
                            if (viewGroup != null) {
                                int indexOfChild = viewGroup.indexOfChild(g71Var.n);
                                viewGroup.removeView(g71Var.n);
                                viewGroup.addView(g71Var.n, indexOfChild);
                            }
                            DispatchQueue dispatchQueue = g71Var.b;
                            if (dispatchQueue != null) {
                                dispatchQueue.postRunnable(new x61(g71Var, i13));
                                break;
                            } else {
                                i2.f0 f0Var = g71Var.d;
                                TextureView textureView2 = g71Var.n;
                                f0Var.B1();
                                if (textureView2 != null && textureView2 == f0Var.V) {
                                    f0Var.B1();
                                    f0Var.o1();
                                    f0Var.t1(null);
                                    f0Var.m1(0, 0);
                                }
                                g71Var.d.v1(g71Var.n);
                                ArrayList arrayList5 = g71Var.N;
                                if (arrayList5 != null) {
                                    g71Var.F(arrayList5, g71Var.O);
                                } else if (g71Var.U) {
                                    g71Var.G(g71Var.Q, g71Var.S, g71Var.R, g71Var.T);
                                } else {
                                    g71Var.D(g71Var.Q, g71Var.S);
                                }
                                g71Var.C();
                                break;
                            }
                        }
                    }
                } else {
                    FileLog.e(u0Var);
                    FileLog.e("av1 codec failed, we think this codec is not supported");
                    MessagesController.getGlobalMainSettings().edit().putBoolean("unsupport_video/av01", true).commit();
                    HashMap hashMap = g71.l0;
                    if (hashMap != null) {
                        hashMap.clear();
                    }
                    ArrayList arrayList6 = g71Var.N;
                    if (arrayList6 != null) {
                        int i20 = 0;
                        while (i20 < arrayList6.size()) {
                            c71 c71Var = (c71) arrayList6.get(i20);
                            int i21 = 0;
                            while (true) {
                                ArrayList arrayList7 = c71Var.d;
                                if (i21 < arrayList7.size()) {
                                    e71 e71Var = (e71) arrayList7.get(i21);
                                    if (!TextUtils.isEmpty(e71Var.m) && !g71.Y(e71Var.m)) {
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
                    g71Var.N = arrayList;
                    if (arrayList != null) {
                        g71Var.F(arrayList, g71Var.O);
                        break;
                    }
                }
                break;
            case 23:
                ((f71) this.b).f.K.onVisualizerUpdate(true, true, (float[]) this.c);
                break;
            case 24:
                n71 n71Var = (n71) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                if (bitmap != null) {
                    if (n71Var.w != null) {
                        Bitmap bitmap2 = n71Var.v;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        n71Var.v = n71Var.w;
                    }
                    n71Var.w = bitmap;
                    Bitmap bitmap3 = n71Var.w;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                    n71Var.G = bitmapShader;
                    bitmapShader.setLocalMatrix(n71Var.L);
                    n71Var.J.setShader(n71Var.G);
                    n71Var.invalidate();
                    int dp = AndroidUtilities.dp(150.0f);
                    float width = bitmap.getWidth() / bitmap.getHeight();
                    if (width > 1.0f) {
                        i11 = (int) (dp / width);
                    } else {
                        dp = (int) (dp * width);
                        i11 = dp;
                    }
                    ViewGroup.LayoutParams layoutParams = n71Var.getLayoutParams();
                    if (n71Var.getVisibility() != 0 || layoutParams.width != dp || layoutParams.height != i11) {
                        layoutParams.width = dp;
                        layoutParams.height = i11;
                        n71Var.setVisibility(0);
                        n71Var.requestLayout();
                    }
                }
                n71Var.f = null;
                break;
            case 25:
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
            case 26:
                ((org.telegram.ui.Components.voip.k) this.b).a.setOnClickListener((View.OnClickListener) this.c);
                break;
            case 27:
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) this.b;
                Bitmap bitmap4 = (Bitmap) this.c;
                HashMap<String, Bitmap> hashMap2 = tVar.F.thumbs;
                ChatObject.VideoParticipant videoParticipant = tVar.w;
                boolean z11 = videoParticipant.presentation;
                TLRPC.GroupCallParticipant groupCallParticipant = videoParticipant.participant;
                hashMap2.put(z11 ? groupCallParticipant.presentationEndpoint : groupCallParticipant.videoEndpoint, bitmap4);
                break;
            case 28:
                org.telegram.ui.Components.voip.l0 l0Var = (org.telegram.ui.Components.voip.l0) this.b;
                org.telegram.ui.Components.voip.t tVar2 = (org.telegram.ui.Components.voip.t) this.c;
                l0Var.getClass();
                tVar2.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setListener(new org.telegram.ui.Components.voip.y(tVar2)).setDuration(150L).start();
                break;
            default:
                ll0 ll0Var = (ll0) this.b;
                Object obj = this.c;
                if (ll0Var != null) {
                    ll0Var.setOnItemClickListener((zk0) obj);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ jn0(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }
}
