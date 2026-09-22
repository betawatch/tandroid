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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
        ll0 ll0Var;
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
                vc.a0(((ht0) this.b).f.v1).Q(R.raw.contact_check, 36, LocaleController.formatString(R.string.YouJoinedChannel, ((TLRPC.Chat) this.c).title)).k(true);
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
                MessagesController.getInstance(((iy0) this.b).a.a).updateEmojiStatus((TLRPC.EmojiStatus) this.c);
                break;
            case 7:
                x21 x21Var = (x21) this.b;
                MessagesController.getInstance(x21Var.b).getTopicsController().deleteTopics(-x21Var.c, (ArrayList) this.c);
                int i18 = x21.f0;
                break;
            case 8:
                x21 x21Var2 = (x21) this.b;
                TLRPC.Updates updates = (TLRPC.Updates) this.c;
                x21Var2.getClass();
                MessagesController.getInstance(x21Var2.b).loadFullChat(updates.chats.get(0).id, 0, true);
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
                v31.o((v31) this.b, (TLObject) this.c);
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
                org.telegram.ui.zk zkVar = (org.telegram.ui.zk) this.b;
                ((org.telegram.ui.ActionBar.n1) this.c).d(true);
                m41.a(zkVar.getContext(), zkVar.d);
                break;
            case 13:
                ((TranslateController) this.c).setHideTranslateDialog(((org.telegram.ui.zk) this.b).b, false);
                break;
            case 14:
                UndoView undoView = (UndoView) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                if (tLObject2 instanceof TLRPC.PaymentReceipt) {
                    undoView.s.presentFragment(new org.telegram.ui.wo0((TLRPC.PaymentReceipt) tLObject2));
                    break;
                } else {
                    int i19 = UndoView.e0;
                    undoView.getClass();
                    break;
                }
            case 15:
                ((i51) this.b).D.onClick((org.telegram.ui.Cells.v8) this.c);
                break;
            case 16:
                g71 g71Var = (g71) this.b;
                b2.u0 u0Var = (b2.u0) this.c;
                Throwable cause = u0Var.getCause();
                if (!(cause instanceof r2.n) || (!cause.toString().contains("av1") && !cause.toString().contains("av01"))) {
                    TextureView textureView = g71Var.n;
                    if (textureView == null || ((g71Var.E || !(cause instanceof r2.p)) && !(cause instanceof a3.x))) {
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
                                i2.e0 e0Var = g71Var.d;
                                TextureView textureView2 = g71Var.n;
                                e0Var.B1();
                                if (textureView2 != null && textureView2 == e0Var.V) {
                                    e0Var.B1();
                                    e0Var.o1();
                                    e0Var.t1(null);
                                    e0Var.m1(0, 0);
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
                        arrayList2 = arrayList6;
                    }
                    g71Var.N = arrayList2;
                    if (arrayList2 != null) {
                        g71Var.F(arrayList2, g71Var.O);
                        break;
                    }
                }
                break;
            case 17:
                ((f71) this.b).f.K.onVisualizerUpdate(true, true, (float[]) this.c);
                break;
            case 18:
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
            case 19:
                final b91 b91Var = (b91) this.b;
                b91Var.e.b.evaluateJavascript((String) this.c, new ValueCallback() { // from class: org.telegram.ui.Components.a91
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(Object obj) {
                        String str3 = (String) obj;
                        b91 b91Var2 = b91.this;
                        String[] strArr = b91Var2.c;
                        strArr[0] = strArr[0].replace(b91Var2.d, "/signature/" + str3.substring(1, str3.length() - 1));
                        b91Var2.b.countDown();
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
                ll0 ll0Var2 = (ll0) this.b;
                Object obj = this.c;
                if (ll0Var2 != null) {
                    ll0Var2.setOnItemClickListener((zk0) obj);
                    break;
                }
                break;
            case 24:
                org.telegram.ui.yt ytVar = (org.telegram.ui.yt) this.b;
                String lowerCase = ((String) this.c).trim().toLowerCase();
                int i22 = 25;
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new ar0(i22, ytVar, new ArrayList()));
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
                            if (!lowerCase2.contains(" ".concat(lowerCase)) && !lowerCase3.startsWith(translitSafe) && !org.telegram.messenger.y0.w(" ", translitSafe, lowerCase3) && !lowerCase4.startsWith(lowerCase) && !lowerCase4.contains(" ".concat(lowerCase)) && !lowerCase5.startsWith(translitSafe) && !org.telegram.messenger.y0.w(" ", translitSafe, lowerCase5) && !str5.startsWith(lowerCase) && !concat.startsWith(lowerCase)) {
                                arrayList9 = arrayList;
                            }
                        }
                        arrayList8.add(vtVar);
                        arrayList9 = arrayList;
                    }
                    AndroidUtilities.runOnUIThread(new ar0(25, ytVar, arrayList8));
                    break;
                }
                break;
            case 25:
                org.telegram.ui.yt ytVar2 = (org.telegram.ui.yt) this.b;
                ArrayList arrayList10 = (ArrayList) this.c;
                org.telegram.ui.au auVar = ytVar2.h;
                if (auVar.f) {
                    ytVar2.e = arrayList10;
                    if (auVar.e && (ll0Var = auVar.a) != null) {
                        s4.h0 adapter = ll0Var.getAdapter();
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
            case 26:
                MessagesController.getInstance(((org.telegram.ui.cu) this.b).currentAccount).processUpdates((TLRPC.Updates) this.c, false);
                break;
            case 27:
                org.telegram.ui.uy.e0((org.telegram.ui.uy) this.b, (String) this.c);
                break;
            case 28:
                ei.k3.j(((org.telegram.ui.uy) this.b).currentAccount, ((TLRPC.TL_attachMenuBot) this.c).bot_id, null);
                break;
            default:
                org.telegram.ui.uy uyVar = (org.telegram.ui.uy) this.b;
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) this.c;
                org.telegram.ui.ActionBar.f3 f3Var = f3VarArr[0];
                if (f3Var != null) {
                    f3Var.dismiss();
                    f3VarArr[0] = null;
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.pv(uyVar, 24), 300L);
                break;
        }
    }

    public /* synthetic */ ar0(x21 x21Var, ArrayList arrayList, sh shVar) {
        this.a = 7;
        this.b = x21Var;
        this.c = arrayList;
    }
}
