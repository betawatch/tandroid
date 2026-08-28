package org.telegram.ui.Components;

import android.graphics.RectF;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.HashMap;
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
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jg0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jg0(int i9, Object obj, Object obj2) {
        this.a = i9;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        int indexOf;
        int L;
        int i9;
        ArrayList arrayList = null;
        boolean z11 = false;
        Object[] objArr = 0;
        boolean z12 = true;
        switch (this.a) {
            case 0:
                kg0 kg0Var = (kg0) this.b;
                TLObject tLObject = (TLObject) this.c;
                kg0Var.I = false;
                if (tLObject instanceof TLRPC.SearchPostsFlood) {
                    TLRPC.SearchPostsFlood searchPostsFlood = (TLRPC.SearchPostsFlood) tLObject;
                    kg0Var.d = searchPostsFlood;
                    if (searchPostsFlood.query_is_free) {
                        kg0Var.a(false);
                        break;
                    } else {
                        kg0Var.d();
                        kg0Var.c.U2.N(true);
                        break;
                    }
                }
                break;
            case 1:
                pg0 pg0Var = (pg0) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                ArrayList arrayList3 = pg0Var.a;
                int i10 = pg0Var.x;
                int size = arrayList2.size();
                pg0Var.x = size;
                if (i10 != size && pg0Var.O != null) {
                    pg0Var.g();
                }
                int size2 = arrayList3.size();
                int i11 = 0;
                while (i11 < size2) {
                    mg0 mg0Var = (mg0) arrayList3.get(i11);
                    if (mg0Var.o && !mg0Var.p) {
                        arrayList2.add(mg0Var);
                    } else if (pg0.j(mg0Var.a, arrayList2) == null) {
                        pg0 pg0Var2 = mg0Var.y;
                        float f10 = pg0Var2.J;
                        RectF rectF = mg0Var.c;
                        RectF rectF2 = mg0Var.f;
                        p80 p80Var = mg0Var.r;
                        if (p80Var != null) {
                            p80Var.a();
                            mg0Var.t = z11;
                            mg0Var.s = z11;
                        }
                        mg0Var.o = z12;
                        boolean z13 = rectF.left - 1.0f <= f10;
                        boolean z14 = rectF.right + 1.0f >= ((float) pg0Var2.getMeasuredWidth()) - f10;
                        if (z13 && z14) {
                            z13 = false;
                            z14 = false;
                        }
                        mg0Var.g.set(rectF);
                        rectF2.set(rectF);
                        if (z13) {
                            rectF2.right = rectF2.left;
                        } else if (z14) {
                            rectF2.left = rectF2.right;
                        } else {
                            int i12 = mg0Var.a;
                            if (i12 == 3 || i12 == 2) {
                                z10 = true;
                                if (pg0Var2.D == 1) {
                                    rectF2.left = rectF2.right;
                                    mg0Var.e.d(0.0f, z10);
                                    arrayList2.add(mg0Var);
                                    i11++;
                                    z11 = false;
                                    z12 = true;
                                }
                            } else {
                                z10 = true;
                            }
                            float centerX = rectF2.centerX();
                            rectF2.right = centerX;
                            rectF2.left = centerX;
                            mg0Var.e.d(0.0f, z10);
                            arrayList2.add(mg0Var);
                            i11++;
                            z11 = false;
                            z12 = true;
                        }
                        z10 = true;
                        mg0Var.e.d(0.0f, z10);
                        arrayList2.add(mg0Var);
                        i11++;
                        z11 = false;
                        z12 = true;
                    }
                    i11++;
                    z11 = false;
                    z12 = true;
                }
                arrayList3.clear();
                arrayList3.addAll(arrayList2);
                pg0Var.invalidate();
                break;
            case 2:
                pg0 pg0Var3 = (pg0) this.b;
                mg0 mg0Var2 = (mg0) this.c;
                og0 og0Var = pg0Var3.B;
                int i13 = mg0Var2.a;
                RectF rectF3 = mg0Var2.d;
                ProfileActivity.X(((org.telegram.ui.fx0) og0Var).b, i13, rectF3.left, rectF3.top);
                break;
            case 3:
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.b;
                ViewParent viewParent = (ViewParent) this.c;
                t1Var.invalidate();
                if (viewParent instanceof View) {
                    ((View) viewParent).invalidate();
                    break;
                }
                break;
            case 4:
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
            case 5:
                ui0 ui0Var = (ui0) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                ArrayList arrayList5 = ui0Var.r;
                ui0Var.n.addAll(arrayList4);
                int size3 = arrayList4.size();
                int i14 = 0;
                while (i14 < size3) {
                    Object obj = arrayList4.get(i14);
                    i14++;
                    ti0 ti0Var = (ti0) obj;
                    int i15 = 0;
                    while (true) {
                        if (i15 >= arrayList5.size()) {
                            arrayList5.add(ti0Var);
                        } else if (MessageObject.getObjectPeerId(((ti0) arrayList5.get(i15)).a) != MessageObject.getObjectPeerId(ti0Var.a)) {
                            i15++;
                        } else if (ti0Var.c > 0) {
                            ((ti0) arrayList5.get(i15)).c = ti0Var.c;
                        }
                    }
                }
                q0.a aVar = ui0Var.w;
                if (aVar != null) {
                    aVar.accept(arrayList4);
                }
                ui0Var.a();
                break;
            case 6:
                an0 an0Var = (an0) this.b;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) this.c;
                ArrayList arrayList6 = an0Var.G;
                if (!arrayList6.isEmpty() && (indexOf = arrayList6.indexOf(tL_sponsoredPeer)) >= 0 && (L = an0Var.L()) < an0Var.h()) {
                    arrayList6.remove(indexOf);
                    an0Var.u(L + 1 + indexOf);
                    int size4 = an0Var.f0.e.size();
                    int size5 = arrayList6.size();
                    if (an0Var.C0) {
                        size4 = Math.min(3, size4);
                    }
                    if (size5 + size4 <= 0) {
                        an0Var.u(L);
                        break;
                    }
                }
                break;
            case 7:
                an0 an0Var2 = (an0) this.b;
                org.telegram.ui.dy dyVar = (org.telegram.ui.dy) this.c;
                an0Var2.T();
                oc.a0(dyVar).c(LocaleController.getString(R.string.AdHidden)).j();
                break;
            case 8:
                ((mn0) this.b).sendAccessibilityEvent((View) this.c, 4);
                break;
            case 9:
                ve veVar = (ve) this.b;
                org.telegram.ui.qn qnVar = (org.telegram.ui.qn) this.c;
                if (qnVar != null) {
                    qnVar.presentFragment(new PremiumPreviewFragment(0, "select_sender"));
                    veVar.dismiss();
                    break;
                }
                break;
            case 10:
                ((WindowManager) this.c).removeView(((ve) this.b).B);
                break;
            case 11:
                rp0 rp0Var = (rp0) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                if (tLObject2 != null) {
                    rp0Var.g0 = (TLRPC.TL_exportedMessageLink) tLObject2;
                    rp0Var.Z0();
                    if (rp0Var.i0) {
                        rp0Var.M0();
                    }
                }
                rp0Var.h0 = false;
                break;
            case 12:
                xs0 xs0Var = (xs0) this.b;
                yp0 yp0Var = (yp0) this.c;
                xs0Var.C = null;
                xs0Var.D = null;
                yp0Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(220L).setListener(new r60(yp0Var, 19)).start();
                break;
            case 13:
                eu0 eu0Var = (eu0) this.b;
                ih.o6 o6Var = (ih.o6) this.c;
                zq0 zq0Var = eu0Var.S;
                if (zq0Var != null) {
                    int i16 = o6Var.a;
                    zq0Var.n.d(i16, zq0Var.s.i(i16));
                    break;
                }
                break;
            case 14:
                oc.a0(((ns0) this.b).f.r1).Q(R.raw.contact_check, 36, LocaleController.formatString(R.string.YouJoinedChannel, ((TLRPC.Chat) this.c).title)).k(true);
                break;
            case 15:
                at0 at0Var = (at0) this.b;
                String str = (String) this.c;
                if (!at0Var.v.p1[at0Var.r].a.isEmpty() && ((i9 = at0Var.r) == 1 || i9 == 4)) {
                    MessageObject messageObject = (MessageObject) j3.r0.j(1, at0Var.v.p1[i9].a);
                    int id2 = messageObject.getId();
                    long dialogId = messageObject.getDialogId();
                    eu0 eu0Var2 = at0Var.v;
                    at0Var.F(id2, str, dialogId, eu0Var2.f1 == eu0Var2.r1.getUserConfig().getClientUserId() ? messageObject.getSavedDialogId() : 0L);
                } else if (at0Var.r == 3) {
                    eu0 eu0Var3 = at0Var.v;
                    at0Var.F(0, str, eu0Var3.f1, eu0Var3.B);
                }
                int i17 = at0Var.r;
                if (i17 == 1 || i17 == 4) {
                    ArrayList arrayList7 = new ArrayList(at0Var.v.p1[at0Var.r].a);
                    at0Var.s++;
                    Utilities.searchQueue.postRunnable(new ue0(at0Var, str, arrayList7, 10));
                    break;
                }
                break;
            case 16:
                at0 at0Var2 = (at0) this.b;
                ArrayList arrayList8 = (ArrayList) this.c;
                eu0 eu0Var4 = at0Var2.v;
                boolean z15 = eu0Var4.R0;
                xs0[] xs0VarArr = eu0Var4.g0;
                if (z15) {
                    at0Var2.s--;
                    int h = at0Var2.h();
                    at0Var2.d = arrayList8;
                    int h10 = at0Var2.h();
                    if (at0Var2.s == 0 || h10 != 0) {
                        eu0Var4.m1(false);
                    }
                    for (int i18 = 0; i18 < xs0VarArr.length; i18++) {
                        xs0 xs0Var2 = xs0VarArr[i18];
                        if (xs0Var2.B == at0Var2.r) {
                            if (at0Var2.s == 0 && h10 == 0) {
                                xs0Var2.w.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
                                xs0VarArr[i18].w.f.setVisibility(8);
                                xs0VarArr[i18].w.e(false, true);
                            } else if (h == 0) {
                                eu0Var4.z(xs0Var2.h, 0, null);
                            }
                        }
                    }
                    at0Var2.l();
                    break;
                }
                break;
            case 17:
                TLObject tLObject3 = (TLObject) this.c;
                TLRPC.Document document = (TLRPC.Document) this.b;
                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                int i19 = NotificationCenter.customStickerCreated;
                Boolean bool = Boolean.FALSE;
                notificationCenter.postNotificationNameOnUIThread(i19, bool, tLObject3, document, null, bool);
                break;
            case 18:
                MessagesController.getInstance(((px0) this.b).a.a).updateEmojiStatus((TLRPC.EmojiStatus) this.c);
                break;
            case 19:
                b21 b21Var = (b21) this.b;
                MessagesController.getInstance(b21Var.b).getTopicsController().deleteTopics(-b21Var.c, (ArrayList) this.c);
                int i20 = b21.b0;
                break;
            case 20:
                b21 b21Var2 = (b21) this.b;
                TLRPC.Updates updates = (TLRPC.Updates) this.c;
                b21Var2.getClass();
                MessagesController.getInstance(b21Var2.b).loadFullChat(updates.chats.get(0).id, 0, true);
                break;
            case 21:
                org.telegram.ui.Cells.k1 k1Var = (org.telegram.ui.Cells.k1) this.b;
                TLRPC.TL_messages_transcribedAudio tL_messages_transcribedAudio = (TLRPC.TL_messages_transcribedAudio) this.c;
                if (k1Var != null) {
                    k1Var.i0(tL_messages_transcribedAudio.trial_remains_num > 0 ? 1 : 2);
                    break;
                }
                break;
            case 22:
                z21.o((z21) this.b, (TLObject) this.c);
                break;
            case 23:
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.b;
                String str2 = (String) this.c;
                if (callback2 != null) {
                    callback2.run(str2, Boolean.FALSE);
                    break;
                }
                break;
            case 24:
                org.telegram.ui.nk nkVar = (org.telegram.ui.nk) this.b;
                ((org.telegram.ui.ActionBar.o1) this.c).d(true);
                p31.a(nkVar.getContext(), nkVar.d);
                break;
            case 25:
                ((TranslateController) this.c).setHideTranslateDialog(((org.telegram.ui.nk) this.b).b, false);
                break;
            case 26:
                UndoView undoView = (UndoView) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                if (tLObject4 instanceof TLRPC.PaymentReceipt) {
                    undoView.s.presentFragment(new org.telegram.ui.co0((TLRPC.PaymentReceipt) tLObject4));
                    break;
                } else {
                    int i21 = UndoView.a0;
                    undoView.getClass();
                    break;
                }
            case 27:
                ((l41) this.b).D.onClick((org.telegram.ui.Cells.s8) this.c);
                break;
            case 28:
                k61 k61Var = (k61) this.b;
                h3.v1 v1Var = (h3.v1) this.c;
                Throwable cause = v1Var.getCause();
                if (!(cause instanceof y3.l) || (!cause.toString().contains("av1") && !cause.toString().contains("av01"))) {
                    TextureView textureView = k61Var.n;
                    if (textureView == null || ((k61Var.A || !(cause instanceof y3.p)) && !(cause instanceof e5.m))) {
                        k61Var.F.onError(k61Var, v1Var);
                        break;
                    } else {
                        k61Var.A = true;
                        if (k61Var.d != null) {
                            ViewGroup viewGroup = (ViewGroup) textureView.getParent();
                            if (viewGroup != null) {
                                int indexOfChild = viewGroup.indexOfChild(k61Var.n);
                                viewGroup.removeView(k61Var.n);
                                viewGroup.addView(k61Var.n, indexOfChild);
                            }
                            DispatchQueue dispatchQueue = k61Var.b;
                            if (dispatchQueue != null) {
                                dispatchQueue.postRunnable(new b61(k61Var, objArr == true ? 1 : 0));
                                break;
                            } else {
                                h3.k0 k0Var = k61Var.d;
                                TextureView textureView2 = k61Var.n;
                                k0Var.q0();
                                if (textureView2 != null && textureView2 == k0Var.V) {
                                    k0Var.q0();
                                    k0Var.b0();
                                    k0Var.g0(null);
                                    k0Var.a0(0, 0);
                                }
                                k61Var.d.j0(k61Var.n);
                                ArrayList arrayList9 = k61Var.J;
                                if (arrayList9 != null) {
                                    k61Var.G(arrayList9, k61Var.K);
                                } else if (k61Var.Q) {
                                    k61Var.H(k61Var.M, k61Var.O, k61Var.N, k61Var.P);
                                } else {
                                    k61Var.E(k61Var.M, k61Var.O);
                                }
                                k61Var.D();
                                break;
                            }
                        }
                    }
                } else {
                    FileLog.e(v1Var);
                    FileLog.e("av1 codec failed, we think this codec is not supported");
                    MessagesController.getGlobalMainSettings().edit().putBoolean("unsupport_video/av01", true).commit();
                    HashMap hashMap = k61.h0;
                    if (hashMap != null) {
                        hashMap.clear();
                    }
                    ArrayList arrayList10 = k61Var.J;
                    if (arrayList10 != null) {
                        int i22 = 0;
                        while (i22 < arrayList10.size()) {
                            g61 g61Var = (g61) arrayList10.get(i22);
                            int i23 = 0;
                            while (true) {
                                ArrayList arrayList11 = g61Var.d;
                                if (i23 < arrayList11.size()) {
                                    i61 i61Var = (i61) arrayList11.get(i23);
                                    if (!TextUtils.isEmpty(i61Var.m) && !k61.Y(i61Var.m)) {
                                        arrayList11.remove(i23);
                                        i23--;
                                    }
                                    i23++;
                                } else {
                                    if (arrayList11.isEmpty()) {
                                        arrayList10.remove(i22);
                                        i22--;
                                    }
                                    i22++;
                                }
                            }
                        }
                        arrayList = arrayList10;
                    }
                    k61Var.J = arrayList;
                    if (arrayList != null) {
                        k61Var.G(arrayList, k61Var.K);
                        break;
                    }
                }
                break;
            default:
                ((j61) this.b).f.G.onVisualizerUpdate(true, true, (float[]) this.c);
                break;
        }
    }

    public /* synthetic */ jg0(Object obj, Object obj2, Object obj3, int i9) {
        this.a = i9;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ jg0(TLObject tLObject, TLRPC.Document document) {
        this.a = 17;
        this.c = tLObject;
        this.b = document;
    }
}
