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

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ho0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ho0(int i10, Object obj, Object obj2) {
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
        ArrayList arrayList;
        ArrayList arrayList2 = null;
        int i12 = 0;
        switch (this.a) {
            case 0:
                po0 po0Var = (po0) this.b;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) this.c;
                ArrayList arrayList3 = po0Var.K;
                if (!arrayList3.isEmpty() && (indexOf = arrayList3.indexOf(tL_sponsoredPeer)) >= 0 && (L = po0Var.L()) < po0Var.h()) {
                    arrayList3.remove(indexOf);
                    po0Var.u(L + 1 + indexOf);
                    int size = po0Var.j0.e.size();
                    int size2 = arrayList3.size();
                    if (po0Var.G0) {
                        size = Math.min(3, size);
                    }
                    if (size2 + size <= 0) {
                        po0Var.u(L);
                        break;
                    }
                }
                break;
            case 1:
                po0 po0Var2 = (po0) this.b;
                org.telegram.ui.cy cyVar = (org.telegram.ui.cy) this.c;
                po0Var2.T();
                xc.a0(cyVar).c(LocaleController.getString(R.string.AdHidden)).j();
                break;
            case 2:
                ((ap0) this.b).sendAccessibilityEvent((View) this.c, 4);
                break;
            case 3:
                ef efVar = (ef) this.b;
                org.telegram.ui.qn qnVar = (org.telegram.ui.qn) this.c;
                if (qnVar != null) {
                    qnVar.presentFragment(new PremiumPreviewFragment(0, "select_sender"));
                    efVar.dismiss();
                    break;
                }
                break;
            case 4:
                ((WindowManager) this.c).removeView(((ef) this.b).B);
                break;
            case 5:
                fr0 fr0Var = (fr0) this.b;
                TLObject tLObject = (TLObject) this.c;
                if (tLObject != null) {
                    fr0Var.l0 = (TLRPC.TL_exportedMessageLink) tLObject;
                    fr0Var.b1();
                    if (fr0Var.n0) {
                        fr0Var.O0();
                    }
                }
                fr0Var.m0 = false;
                break;
            case 6:
                nu0 nu0Var = (nu0) this.b;
                mr0 mr0Var = (mr0) this.c;
                nu0Var.G = null;
                nu0Var.H = null;
                mr0Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(220L).setListener(new c80(mr0Var, 19)).start();
                break;
            case 7:
                uv0 uv0Var = (uv0) this.b;
                ci.b7 b7Var = (ci.b7) this.c;
                ps0 ps0Var = uv0Var.W;
                if (ps0Var != null) {
                    int i13 = b7Var.a;
                    ps0Var.n.d(i13, ps0Var.s.i(i13));
                    break;
                }
                break;
            case 8:
                xc.a0(((du0) this.b).f.v1).Q(R.raw.contact_check, 36, LocaleController.formatString(R.string.YouJoinedChannel, ((TLRPC.Chat) this.c).title)).k(true);
                break;
            case 9:
                qu0 qu0Var = (qu0) this.b;
                String str = (String) this.c;
                if (!qu0Var.v.t1[qu0Var.r].a.isEmpty() && ((i10 = qu0Var.r) == 1 || i10 == 4)) {
                    MessageObject messageObject = (MessageObject) i2.e.h(1, qu0Var.v.t1[i10].a);
                    int id2 = messageObject.getId();
                    long dialogId = messageObject.getDialogId();
                    uv0 uv0Var2 = qu0Var.v;
                    qu0Var.F(id2, str, dialogId, uv0Var2.j1 == uv0Var2.v1.getUserConfig().getClientUserId() ? messageObject.getSavedDialogId() : 0L);
                } else if (qu0Var.r == 3) {
                    uv0 uv0Var3 = qu0Var.v;
                    qu0Var.F(0, str, uv0Var3.j1, uv0Var3.F);
                }
                int i14 = qu0Var.r;
                if (i14 == 1 || i14 == 4) {
                    ArrayList arrayList4 = new ArrayList(qu0Var.v.t1[qu0Var.r].a);
                    qu0Var.s++;
                    Utilities.searchQueue.postRunnable(new lg((Object) qu0Var, (Object) str, arrayList4, 26));
                    break;
                }
                break;
            case 10:
                qu0 qu0Var2 = (qu0) this.b;
                ArrayList arrayList5 = (ArrayList) this.c;
                uv0 uv0Var4 = qu0Var2.v;
                boolean z10 = uv0Var4.V0;
                nu0[] nu0VarArr = uv0Var4.k0;
                if (z10) {
                    qu0Var2.s--;
                    int h = qu0Var2.h();
                    qu0Var2.d = arrayList5;
                    int h10 = qu0Var2.h();
                    if (qu0Var2.s == 0 || h10 != 0) {
                        uv0Var4.o1(false);
                    }
                    for (int i15 = 0; i15 < nu0VarArr.length; i15++) {
                        nu0 nu0Var2 = nu0VarArr[i15];
                        if (nu0Var2.F == qu0Var2.r) {
                            if (qu0Var2.s == 0 && h10 == 0) {
                                nu0Var2.w.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
                                nu0VarArr[i15].w.f.setVisibility(8);
                                nu0VarArr[i15].w.e(false, true);
                            } else if (h == 0) {
                                uv0Var4.z(nu0Var2.h, 0, null);
                            }
                        }
                    }
                    qu0Var2.l();
                    break;
                }
                break;
            case 11:
                TLObject tLObject2 = (TLObject) this.b;
                TLRPC.Document document = (TLRPC.Document) this.c;
                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                int i16 = NotificationCenter.customStickerCreated;
                Boolean bool = Boolean.FALSE;
                notificationCenter.postNotificationNameOnUIThread(i16, bool, tLObject2, document, null, bool);
                break;
            case 12:
                MessagesController.getInstance(((dz0) this.b).a.a).updateEmojiStatus((TLRPC.EmojiStatus) this.c);
                break;
            case 13:
                s31 s31Var = (s31) this.b;
                MessagesController.getInstance(s31Var.b).getTopicsController().deleteTopics(-s31Var.c, (ArrayList) this.c);
                int i17 = s31.f0;
                break;
            case 14:
                s31 s31Var2 = (s31) this.b;
                TLRPC.Updates updates = (TLRPC.Updates) this.c;
                s31Var2.getClass();
                MessagesController.getInstance(s31Var2.b).loadFullChat(updates.chats.get(0).id, 0, true);
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
                t41.p((t41) this.b, (TLObject) this.c);
                break;
            case 17:
                org.telegram.ui.rk rkVar = (org.telegram.ui.rk) this.b;
                ((org.telegram.ui.ActionBar.m1) this.c).d(true);
                k51.a(rkVar.getContext(), rkVar.d);
                break;
            case 18:
                ((TranslateController) this.c).setHideTranslateDialog(((org.telegram.ui.rk) this.b).b, false);
                break;
            case 19:
                UndoView undoView = (UndoView) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                if (tLObject3 instanceof TLRPC.PaymentReceipt) {
                    undoView.s.presentFragment(new org.telegram.ui.eo0((TLRPC.PaymentReceipt) tLObject3));
                    break;
                } else {
                    int i18 = UndoView.e0;
                    undoView.getClass();
                    break;
                }
            case 20:
                ((h61) this.b).D.onClick((org.telegram.ui.Cells.u8) this.c);
                break;
            case 21:
                c81 c81Var = (c81) this.b;
                b2.y0 y0Var = (b2.y0) this.c;
                Throwable cause = y0Var.getCause();
                if (!(cause instanceof r2.n) || (!cause.toString().contains("av1") && !cause.toString().contains("av01"))) {
                    TextureView textureView = c81Var.n;
                    if (textureView == null || ((c81Var.E || !(cause instanceof r2.p)) && !(cause instanceof a3.x))) {
                        c81Var.J.onError(c81Var, y0Var);
                        break;
                    } else {
                        c81Var.E = true;
                        if (c81Var.d != null) {
                            ViewGroup viewGroup = (ViewGroup) textureView.getParent();
                            if (viewGroup != null) {
                                int indexOfChild = viewGroup.indexOfChild(c81Var.n);
                                viewGroup.removeView(c81Var.n);
                                viewGroup.addView(c81Var.n, indexOfChild);
                            }
                            DispatchQueue dispatchQueue = c81Var.b;
                            if (dispatchQueue != null) {
                                dispatchQueue.postRunnable(new u71(c81Var, 0));
                                break;
                            } else {
                                i2.i0 i0Var = c81Var.d;
                                TextureView textureView2 = c81Var.n;
                                i0Var.F1();
                                if (textureView2 != null && textureView2 == i0Var.X) {
                                    i0Var.F1();
                                    i0Var.s1();
                                    i0Var.x1(null);
                                    i0Var.q1(0, 0);
                                }
                                c81Var.d.z1(c81Var.n);
                                ArrayList arrayList6 = c81Var.N;
                                if (arrayList6 != null) {
                                    c81Var.F(arrayList6, c81Var.O);
                                } else if (c81Var.U) {
                                    c81Var.G(c81Var.Q, c81Var.S, c81Var.R, c81Var.T);
                                } else {
                                    c81Var.D(c81Var.Q, c81Var.S);
                                }
                                c81Var.C();
                                break;
                            }
                        }
                    }
                } else {
                    FileLog.e(y0Var);
                    FileLog.e("av1 codec failed, we think this codec is not supported");
                    MessagesController.getGlobalMainSettings().edit().putBoolean("unsupport_video/av01", true).commit();
                    HashMap hashMap = c81.l0;
                    if (hashMap != null) {
                        hashMap.clear();
                    }
                    ArrayList arrayList7 = c81Var.N;
                    if (arrayList7 != null) {
                        int i19 = 0;
                        while (i19 < arrayList7.size()) {
                            y71 y71Var = (y71) arrayList7.get(i19);
                            int i20 = 0;
                            while (true) {
                                ArrayList arrayList8 = y71Var.d;
                                if (i20 < arrayList8.size()) {
                                    a81 a81Var = (a81) arrayList8.get(i20);
                                    if (!TextUtils.isEmpty(a81Var.m) && !c81.Y(a81Var.m)) {
                                        arrayList8.remove(i20);
                                        i20--;
                                    }
                                    i20++;
                                } else {
                                    if (arrayList8.isEmpty()) {
                                        arrayList7.remove(i19);
                                        i19--;
                                    }
                                    i19++;
                                }
                            }
                        }
                        arrayList2 = arrayList7;
                    }
                    c81Var.N = arrayList2;
                    if (arrayList2 != null) {
                        c81Var.F(arrayList2, c81Var.O);
                        break;
                    }
                }
                break;
            case 22:
                ((b81) this.b).f.K.onVisualizerUpdate(true, true, (float[]) this.c);
                break;
            case 23:
                j81 j81Var = (j81) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                if (bitmap != null) {
                    if (j81Var.w != null) {
                        Bitmap bitmap2 = j81Var.v;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        j81Var.v = j81Var.w;
                    }
                    j81Var.w = bitmap;
                    Bitmap bitmap3 = j81Var.w;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                    j81Var.G = bitmapShader;
                    bitmapShader.setLocalMatrix(j81Var.L);
                    j81Var.J.setShader(j81Var.G);
                    j81Var.invalidate();
                    int dp = AndroidUtilities.dp(150.0f);
                    float width = bitmap.getWidth() / bitmap.getHeight();
                    if (width > 1.0f) {
                        i11 = (int) (dp / width);
                    } else {
                        dp = (int) (dp * width);
                        i11 = dp;
                    }
                    ViewGroup.LayoutParams layoutParams = j81Var.getLayoutParams();
                    if (j81Var.getVisibility() != 0 || layoutParams.width != dp || layoutParams.height != i11) {
                        layoutParams.width = dp;
                        layoutParams.height = i11;
                        j81Var.setVisibility(0);
                        j81Var.requestLayout();
                    }
                }
                j81Var.f = null;
                break;
            case 24:
                final v91 v91Var = (v91) this.b;
                v91Var.e.b.evaluateJavascript((String) this.c, new ValueCallback() { // from class: org.telegram.ui.Components.u91
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(Object obj) {
                        String str2 = (String) obj;
                        v91 v91Var2 = v91.this;
                        String[] strArr = v91Var2.c;
                        strArr[0] = strArr[0].replace(v91Var2.d, "/signature/" + str2.substring(1, str2.length() - 1));
                        v91Var2.b.countDown();
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
                jm0 jm0Var = (jm0) this.b;
                Object obj = this.c;
                if (jm0Var != null) {
                    jm0Var.setOnItemClickListener((xl0) obj);
                    break;
                }
                break;
            default:
                org.telegram.ui.mt mtVar = (org.telegram.ui.mt) this.b;
                String lowerCase = ((String) this.c).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.lt(i12, mtVar, new ArrayList()));
                    break;
                } else {
                    String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                    ArrayList arrayList9 = new ArrayList();
                    ArrayList arrayList10 = mtVar.f;
                    int size3 = arrayList10.size();
                    int i21 = 0;
                    while (i21 < size3) {
                        Object obj2 = arrayList10.get(i21);
                        i21++;
                        org.telegram.ui.ht htVar = (org.telegram.ui.ht) obj2;
                        String str2 = htVar.a;
                        if (str2 == null) {
                            str2 = "";
                        }
                        String lowerCase2 = str2.toLowerCase();
                        String lowerCase3 = AndroidUtilities.translitSafe(htVar.a).toLowerCase();
                        String str3 = htVar.b;
                        if (str3 == null) {
                            str3 = "";
                        }
                        String lowerCase4 = str3.toLowerCase();
                        String lowerCase5 = AndroidUtilities.translitSafe(htVar.b).toLowerCase();
                        String str4 = htVar.c;
                        if (str4 == null) {
                            str4 = "";
                        }
                        String concat = TextUtils.isEmpty(str4) ? "" : "+".concat(str4);
                        if (lowerCase2.startsWith(lowerCase)) {
                            arrayList = arrayList10;
                        } else {
                            arrayList = arrayList10;
                            if (!lowerCase2.contains(" ".concat(lowerCase)) && !lowerCase3.startsWith(translitSafe) && !org.telegram.messenger.g0.w(" ", translitSafe, lowerCase3) && !lowerCase4.startsWith(lowerCase) && !lowerCase4.contains(" ".concat(lowerCase)) && !lowerCase5.startsWith(translitSafe) && !org.telegram.messenger.g0.w(" ", translitSafe, lowerCase5) && !str4.startsWith(lowerCase) && !concat.startsWith(lowerCase)) {
                                arrayList10 = arrayList;
                            }
                        }
                        arrayList9.add(htVar);
                        arrayList10 = arrayList;
                    }
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.lt(0, mtVar, arrayList9));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ho0(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }
}
