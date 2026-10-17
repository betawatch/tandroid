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

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class go0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ go0(int i10, Object obj, Object obj2) {
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
                oo0 oo0Var = (oo0) this.b;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) this.c;
                ArrayList arrayList3 = oo0Var.K;
                if (!arrayList3.isEmpty() && (indexOf = arrayList3.indexOf(tL_sponsoredPeer)) >= 0 && (L = oo0Var.L()) < oo0Var.h()) {
                    arrayList3.remove(indexOf);
                    oo0Var.u(L + 1 + indexOf);
                    int size = oo0Var.j0.e.size();
                    int size2 = arrayList3.size();
                    if (oo0Var.G0) {
                        size = Math.min(3, size);
                    }
                    if (size2 + size <= 0) {
                        oo0Var.u(L);
                        break;
                    }
                }
                break;
            case 1:
                oo0 oo0Var2 = (oo0) this.b;
                org.telegram.ui.ey eyVar = (org.telegram.ui.ey) this.c;
                oo0Var2.T();
                xc.a0(eyVar).c(LocaleController.getString(R.string.AdHidden)).j();
                break;
            case 2:
                ((zo0) this.b).sendAccessibilityEvent((View) this.c, 4);
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
                dr0 dr0Var = (dr0) this.b;
                TLObject tLObject = (TLObject) this.c;
                if (tLObject != null) {
                    dr0Var.k0 = (TLRPC.TL_exportedMessageLink) tLObject;
                    dr0Var.a1();
                    if (dr0Var.m0) {
                        dr0Var.N0();
                    }
                }
                dr0Var.l0 = false;
                break;
            case 6:
                lu0 lu0Var = (lu0) this.b;
                kr0 kr0Var = (kr0) this.c;
                lu0Var.G = null;
                lu0Var.H = null;
                kr0Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(220L).setListener(new c80(kr0Var, 19)).start();
                break;
            case 7:
                sv0 sv0Var = (sv0) this.b;
                ci.b7 b7Var = (ci.b7) this.c;
                ns0 ns0Var = sv0Var.W;
                if (ns0Var != null) {
                    int i13 = b7Var.a;
                    ns0Var.n.d(i13, ns0Var.s.i(i13));
                    break;
                }
                break;
            case 8:
                xc.a0(((bu0) this.b).f.v1).Q(R.raw.contact_check, 36, LocaleController.formatString(R.string.YouJoinedChannel, ((TLRPC.Chat) this.c).title)).k(true);
                break;
            case 9:
                ou0 ou0Var = (ou0) this.b;
                String str = (String) this.c;
                if (!ou0Var.v.t1[ou0Var.r].a.isEmpty() && ((i10 = ou0Var.r) == 1 || i10 == 4)) {
                    MessageObject messageObject = (MessageObject) i0.a.h(1, ou0Var.v.t1[i10].a);
                    int id2 = messageObject.getId();
                    long dialogId = messageObject.getDialogId();
                    sv0 sv0Var2 = ou0Var.v;
                    ou0Var.F(id2, str, dialogId, sv0Var2.j1 == sv0Var2.v1.getUserConfig().getClientUserId() ? messageObject.getSavedDialogId() : 0L);
                } else if (ou0Var.r == 3) {
                    sv0 sv0Var3 = ou0Var.v;
                    ou0Var.F(0, str, sv0Var3.j1, sv0Var3.F);
                }
                int i14 = ou0Var.r;
                if (i14 == 1 || i14 == 4) {
                    ArrayList arrayList4 = new ArrayList(ou0Var.v.t1[ou0Var.r].a);
                    ou0Var.s++;
                    Utilities.searchQueue.postRunnable(new lg((Object) ou0Var, (Object) str, arrayList4, 26));
                    break;
                }
                break;
            case 10:
                ou0 ou0Var2 = (ou0) this.b;
                ArrayList arrayList5 = (ArrayList) this.c;
                sv0 sv0Var4 = ou0Var2.v;
                boolean z10 = sv0Var4.V0;
                lu0[] lu0VarArr = sv0Var4.k0;
                if (z10) {
                    ou0Var2.s--;
                    int h = ou0Var2.h();
                    ou0Var2.d = arrayList5;
                    int h10 = ou0Var2.h();
                    if (ou0Var2.s == 0 || h10 != 0) {
                        sv0Var4.o1(false);
                    }
                    for (int i15 = 0; i15 < lu0VarArr.length; i15++) {
                        lu0 lu0Var2 = lu0VarArr[i15];
                        if (lu0Var2.F == ou0Var2.r) {
                            if (ou0Var2.s == 0 && h10 == 0) {
                                lu0Var2.w.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
                                lu0VarArr[i15].w.f.setVisibility(8);
                                lu0VarArr[i15].w.e(false, true);
                            } else if (h == 0) {
                                sv0Var4.z(lu0Var2.h, 0, null);
                            }
                        }
                    }
                    ou0Var2.l();
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
                MessagesController.getInstance(((bz0) this.b).a.a).updateEmojiStatus((TLRPC.EmojiStatus) this.c);
                break;
            case 13:
                q31 q31Var = (q31) this.b;
                MessagesController.getInstance(q31Var.b).getTopicsController().deleteTopics(-q31Var.c, (ArrayList) this.c);
                int i17 = q31.f0;
                break;
            case 14:
                q31 q31Var2 = (q31) this.b;
                TLRPC.Updates updates = (TLRPC.Updates) this.c;
                q31Var2.getClass();
                MessagesController.getInstance(q31Var2.b).loadFullChat(updates.chats.get(0).id, 0, true);
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
                r41.p((r41) this.b, (TLObject) this.c);
                break;
            case 17:
                org.telegram.ui.tk tkVar = (org.telegram.ui.tk) this.b;
                ((org.telegram.ui.ActionBar.m1) this.c).d(true);
                i51.a(tkVar.getContext(), tkVar.d);
                break;
            case 18:
                ((TranslateController) this.c).setHideTranslateDialog(((org.telegram.ui.tk) this.b).b, false);
                break;
            case 19:
                UndoView undoView = (UndoView) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                if (tLObject3 instanceof TLRPC.PaymentReceipt) {
                    undoView.s.presentFragment(new org.telegram.ui.fo0((TLRPC.PaymentReceipt) tLObject3));
                    break;
                } else {
                    int i18 = UndoView.e0;
                    undoView.getClass();
                    break;
                }
            case 20:
                ((f61) this.b).D.onClick((org.telegram.ui.Cells.u8) this.c);
                break;
            case 21:
                a81 a81Var = (a81) this.b;
                b2.y0 y0Var = (b2.y0) this.c;
                Throwable cause = y0Var.getCause();
                if (!(cause instanceof r2.n) || (!cause.toString().contains("av1") && !cause.toString().contains("av01"))) {
                    TextureView textureView = a81Var.n;
                    if (textureView == null || ((a81Var.E || !(cause instanceof r2.p)) && !(cause instanceof a3.x))) {
                        a81Var.J.onError(a81Var, y0Var);
                        break;
                    } else {
                        a81Var.E = true;
                        if (a81Var.d != null) {
                            ViewGroup viewGroup = (ViewGroup) textureView.getParent();
                            if (viewGroup != null) {
                                int indexOfChild = viewGroup.indexOfChild(a81Var.n);
                                viewGroup.removeView(a81Var.n);
                                viewGroup.addView(a81Var.n, indexOfChild);
                            }
                            DispatchQueue dispatchQueue = a81Var.b;
                            if (dispatchQueue != null) {
                                dispatchQueue.postRunnable(new s71(a81Var, 0));
                                break;
                            } else {
                                i2.g0 g0Var = a81Var.d;
                                TextureView textureView2 = a81Var.n;
                                g0Var.F1();
                                if (textureView2 != null && textureView2 == g0Var.X) {
                                    g0Var.F1();
                                    g0Var.s1();
                                    g0Var.x1(null);
                                    g0Var.q1(0, 0);
                                }
                                a81Var.d.z1(a81Var.n);
                                ArrayList arrayList6 = a81Var.N;
                                if (arrayList6 != null) {
                                    a81Var.F(arrayList6, a81Var.O);
                                } else if (a81Var.U) {
                                    a81Var.G(a81Var.Q, a81Var.S, a81Var.R, a81Var.T);
                                } else {
                                    a81Var.D(a81Var.Q, a81Var.S);
                                }
                                a81Var.C();
                                break;
                            }
                        }
                    }
                } else {
                    FileLog.e(y0Var);
                    FileLog.e("av1 codec failed, we think this codec is not supported");
                    MessagesController.getGlobalMainSettings().edit().putBoolean("unsupport_video/av01", true).commit();
                    HashMap hashMap = a81.l0;
                    if (hashMap != null) {
                        hashMap.clear();
                    }
                    ArrayList arrayList7 = a81Var.N;
                    if (arrayList7 != null) {
                        int i19 = 0;
                        while (i19 < arrayList7.size()) {
                            w71 w71Var = (w71) arrayList7.get(i19);
                            int i20 = 0;
                            while (true) {
                                ArrayList arrayList8 = w71Var.d;
                                if (i20 < arrayList8.size()) {
                                    y71 y71Var = (y71) arrayList8.get(i20);
                                    if (!TextUtils.isEmpty(y71Var.m) && !a81.Y(y71Var.m)) {
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
                    a81Var.N = arrayList2;
                    if (arrayList2 != null) {
                        a81Var.F(arrayList2, a81Var.O);
                        break;
                    }
                }
                break;
            case 22:
                ((z71) this.b).f.K.onVisualizerUpdate(true, true, (float[]) this.c);
                break;
            case 23:
                h81 h81Var = (h81) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                if (bitmap != null) {
                    if (h81Var.w != null) {
                        Bitmap bitmap2 = h81Var.v;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        h81Var.v = h81Var.w;
                    }
                    h81Var.w = bitmap;
                    Bitmap bitmap3 = h81Var.w;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                    h81Var.G = bitmapShader;
                    bitmapShader.setLocalMatrix(h81Var.L);
                    h81Var.J.setShader(h81Var.G);
                    h81Var.invalidate();
                    int dp = AndroidUtilities.dp(150.0f);
                    float width = bitmap.getWidth() / bitmap.getHeight();
                    if (width > 1.0f) {
                        i11 = (int) (dp / width);
                    } else {
                        dp = (int) (dp * width);
                        i11 = dp;
                    }
                    ViewGroup.LayoutParams layoutParams = h81Var.getLayoutParams();
                    if (h81Var.getVisibility() != 0 || layoutParams.width != dp || layoutParams.height != i11) {
                        layoutParams.width = dp;
                        layoutParams.height = i11;
                        h81Var.setVisibility(0);
                        h81Var.requestLayout();
                    }
                }
                h81Var.f = null;
                break;
            case 24:
                final t91 t91Var = (t91) this.b;
                t91Var.e.b.evaluateJavascript((String) this.c, new ValueCallback() { // from class: org.telegram.ui.Components.s91
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(Object obj) {
                        String str2 = (String) obj;
                        t91 t91Var2 = t91.this;
                        String[] strArr = t91Var2.c;
                        strArr[0] = strArr[0].replace(t91Var2.d, "/signature/" + str2.substring(1, str2.length() - 1));
                        t91Var2.b.countDown();
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
                im0 im0Var = (im0) this.b;
                Object obj = this.c;
                if (im0Var != null) {
                    im0Var.setOnItemClickListener((wl0) obj);
                    break;
                }
                break;
            default:
                org.telegram.ui.ot otVar = (org.telegram.ui.ot) this.b;
                String lowerCase = ((String) this.c).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.nt(i12, otVar, new ArrayList()));
                    break;
                } else {
                    String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                    ArrayList arrayList9 = new ArrayList();
                    ArrayList arrayList10 = otVar.f;
                    int size3 = arrayList10.size();
                    int i21 = 0;
                    while (i21 < size3) {
                        Object obj2 = arrayList10.get(i21);
                        i21++;
                        org.telegram.ui.kt ktVar = (org.telegram.ui.kt) obj2;
                        String str2 = ktVar.a;
                        if (str2 == null) {
                            str2 = "";
                        }
                        String lowerCase2 = str2.toLowerCase();
                        String lowerCase3 = AndroidUtilities.translitSafe(ktVar.a).toLowerCase();
                        String str3 = ktVar.b;
                        if (str3 == null) {
                            str3 = "";
                        }
                        String lowerCase4 = str3.toLowerCase();
                        String lowerCase5 = AndroidUtilities.translitSafe(ktVar.b).toLowerCase();
                        String str4 = ktVar.c;
                        if (str4 == null) {
                            str4 = "";
                        }
                        String concat = TextUtils.isEmpty(str4) ? "" : "+".concat(str4);
                        if (lowerCase2.startsWith(lowerCase)) {
                            arrayList = arrayList10;
                        } else {
                            arrayList = arrayList10;
                            if (!lowerCase2.contains(" ".concat(lowerCase)) && !lowerCase3.startsWith(translitSafe) && !org.telegram.messenger.wh.w(" ", translitSafe, lowerCase3) && !lowerCase4.startsWith(lowerCase) && !lowerCase4.contains(" ".concat(lowerCase)) && !lowerCase5.startsWith(translitSafe) && !org.telegram.messenger.wh.w(" ", translitSafe, lowerCase5) && !str4.startsWith(lowerCase) && !concat.startsWith(lowerCase)) {
                                arrayList10 = arrayList;
                            }
                        }
                        arrayList9.add(ktVar);
                        arrayList10 = arrayList;
                    }
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.nt(0, otVar, arrayList9));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ go0(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }
}
