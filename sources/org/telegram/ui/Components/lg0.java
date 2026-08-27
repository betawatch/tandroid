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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lg0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lg0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        int indexOf;
        int L;
        int i10;
        int i11 = 4;
        ArrayList arrayList = null;
        boolean z11 = false;
        Object[] objArr = 0;
        boolean z12 = true;
        switch (this.a) {
            case 0:
                mg0 mg0Var = (mg0) this.b;
                TLObject tLObject = (TLObject) this.c;
                mg0Var.I = false;
                if (tLObject instanceof TLRPC.SearchPostsFlood) {
                    TLRPC.SearchPostsFlood searchPostsFlood = (TLRPC.SearchPostsFlood) tLObject;
                    mg0Var.d = searchPostsFlood;
                    if (searchPostsFlood.query_is_free) {
                        mg0Var.a(false);
                        break;
                    } else {
                        mg0Var.d();
                        mg0Var.c.U2.N(true);
                        break;
                    }
                }
                break;
            case 1:
                rg0 rg0Var = (rg0) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                ArrayList arrayList3 = rg0Var.a;
                int i12 = rg0Var.x;
                int size = arrayList2.size();
                rg0Var.x = size;
                if (i12 != size && rg0Var.O != null) {
                    rg0Var.g();
                }
                int size2 = arrayList3.size();
                int i13 = 0;
                while (i13 < size2) {
                    og0 og0Var = (og0) arrayList3.get(i13);
                    if (og0Var.o && !og0Var.p) {
                        arrayList2.add(og0Var);
                    } else if (rg0.j(og0Var.a, arrayList2) == null) {
                        rg0 rg0Var2 = og0Var.y;
                        float f10 = rg0Var2.J;
                        RectF rectF = og0Var.c;
                        RectF rectF2 = og0Var.f;
                        t80 t80Var = og0Var.r;
                        if (t80Var != null) {
                            t80Var.a();
                            og0Var.t = z11;
                            og0Var.s = z11;
                        }
                        og0Var.o = z12;
                        boolean z13 = rectF.left - 1.0f <= f10;
                        boolean z14 = rectF.right + 1.0f >= ((float) rg0Var2.getMeasuredWidth()) - f10;
                        if (z13 && z14) {
                            z13 = false;
                            z14 = false;
                        }
                        og0Var.g.set(rectF);
                        rectF2.set(rectF);
                        if (z13) {
                            rectF2.right = rectF2.left;
                        } else if (z14) {
                            rectF2.left = rectF2.right;
                        } else {
                            int i14 = og0Var.a;
                            if (i14 == 3 || i14 == 2) {
                                z10 = true;
                                if (rg0Var2.D == 1) {
                                    rectF2.left = rectF2.right;
                                    og0Var.e.d(0.0f, z10);
                                    arrayList2.add(og0Var);
                                    i13++;
                                    z11 = false;
                                    z12 = true;
                                }
                            } else {
                                z10 = true;
                            }
                            float centerX = rectF2.centerX();
                            rectF2.right = centerX;
                            rectF2.left = centerX;
                            og0Var.e.d(0.0f, z10);
                            arrayList2.add(og0Var);
                            i13++;
                            z11 = false;
                            z12 = true;
                        }
                        z10 = true;
                        og0Var.e.d(0.0f, z10);
                        arrayList2.add(og0Var);
                        i13++;
                        z11 = false;
                        z12 = true;
                    }
                    i13++;
                    z11 = false;
                    z12 = true;
                }
                arrayList3.clear();
                arrayList3.addAll(arrayList2);
                rg0Var.invalidate();
                break;
            case 2:
                rg0 rg0Var3 = (rg0) this.b;
                og0 og0Var2 = (og0) this.c;
                qg0 qg0Var = rg0Var3.B;
                int i15 = og0Var2.a;
                RectF rectF3 = og0Var2.d;
                ProfileActivity.Y(((org.telegram.ui.gx0) qg0Var).b, i15, rectF3.left, rectF3.top);
                break;
            case 3:
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.b;
                ViewParent viewParent = (ViewParent) this.c;
                s1Var.invalidate();
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
                wi0 wi0Var = (wi0) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                ArrayList arrayList5 = wi0Var.r;
                wi0Var.n.addAll(arrayList4);
                int size3 = arrayList4.size();
                int i16 = 0;
                while (i16 < size3) {
                    Object obj = arrayList4.get(i16);
                    i16++;
                    vi0 vi0Var = (vi0) obj;
                    int i17 = 0;
                    while (true) {
                        if (i17 >= arrayList5.size()) {
                            arrayList5.add(vi0Var);
                        } else if (MessageObject.getObjectPeerId(((vi0) arrayList5.get(i17)).a) != MessageObject.getObjectPeerId(vi0Var.a)) {
                            i17++;
                        } else if (vi0Var.c > 0) {
                            ((vi0) arrayList5.get(i17)).c = vi0Var.c;
                        }
                    }
                }
                q0.a aVar = wi0Var.w;
                if (aVar != null) {
                    aVar.accept(arrayList4);
                }
                wi0Var.a();
                break;
            case 6:
                cn0 cn0Var = (cn0) this.b;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) this.c;
                ArrayList arrayList6 = cn0Var.G;
                if (!arrayList6.isEmpty() && (indexOf = arrayList6.indexOf(tL_sponsoredPeer)) >= 0 && (L = cn0Var.L()) < cn0Var.h()) {
                    arrayList6.remove(indexOf);
                    cn0Var.u(L + 1 + indexOf);
                    int size4 = cn0Var.f0.e.size();
                    int size5 = arrayList6.size();
                    if (cn0Var.C0) {
                        size4 = Math.min(3, size4);
                    }
                    if (size5 + size4 <= 0) {
                        cn0Var.u(L);
                        break;
                    }
                }
                break;
            case 7:
                cn0 cn0Var2 = (cn0) this.b;
                org.telegram.ui.gy gyVar = (org.telegram.ui.gy) this.c;
                cn0Var2.T();
                mc.a0(gyVar).c(LocaleController.getString(R.string.AdHidden)).j();
                break;
            case 8:
                ((nn0) this.b).sendAccessibilityEvent((View) this.c, 4);
                break;
            case 9:
                re reVar = (re) this.b;
                org.telegram.ui.rn rnVar = (org.telegram.ui.rn) this.c;
                if (rnVar != null) {
                    rnVar.presentFragment(new PremiumPreviewFragment(0, "select_sender"));
                    reVar.dismiss();
                    break;
                }
                break;
            case 10:
                ((WindowManager) this.c).removeView(((re) this.b).B);
                break;
            case 11:
                sp0 sp0Var = (sp0) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                if (tLObject2 != null) {
                    sp0Var.g0 = (TLRPC.TL_exportedMessageLink) tLObject2;
                    sp0Var.Z0();
                    if (sp0Var.i0) {
                        sp0Var.M0();
                    }
                }
                sp0Var.h0 = false;
                break;
            case 12:
                zs0 zs0Var = (zs0) this.b;
                zp0 zp0Var = (zp0) this.c;
                zs0Var.C = null;
                zs0Var.D = null;
                zp0Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(220L).setListener(new sz(zp0Var, 21)).start();
                break;
            case 13:
                hu0 hu0Var = (hu0) this.b;
                jh.k6 k6Var = (jh.k6) this.c;
                ar0 ar0Var = hu0Var.S;
                if (ar0Var != null) {
                    int i18 = k6Var.a;
                    ar0Var.n.d(i18, ar0Var.s.i(i18));
                    break;
                }
                break;
            case 14:
                mc.a0(((ps0) this.b).f.r1).Q(R.raw.contact_check, 36, LocaleController.formatString(R.string.YouJoinedChannel, ((TLRPC.Chat) this.c).title)).k(true);
                break;
            case 15:
                ct0 ct0Var = (ct0) this.b;
                String str = (String) this.c;
                if (!ct0Var.v.p1[ct0Var.r].a.isEmpty() && ((i10 = ct0Var.r) == 1 || i10 == 4)) {
                    MessageObject messageObject = (MessageObject) i0.a.i(1, ct0Var.v.p1[i10].a);
                    int id2 = messageObject.getId();
                    long dialogId = messageObject.getDialogId();
                    hu0 hu0Var2 = ct0Var.v;
                    ct0Var.F(id2, str, dialogId, hu0Var2.f1 == hu0Var2.r1.getUserConfig().getClientUserId() ? messageObject.getSavedDialogId() : 0L);
                } else if (ct0Var.r == 3) {
                    hu0 hu0Var3 = ct0Var.v;
                    ct0Var.F(0, str, hu0Var3.f1, hu0Var3.B);
                }
                int i19 = ct0Var.r;
                if (i19 == 1 || i19 == 4) {
                    ArrayList arrayList7 = new ArrayList(ct0Var.v.p1[ct0Var.r].a);
                    ct0Var.s++;
                    Utilities.searchQueue.postRunnable(new gs0(ct0Var, str, arrayList7, i11));
                    break;
                }
                break;
            case 16:
                ct0 ct0Var2 = (ct0) this.b;
                ArrayList arrayList8 = (ArrayList) this.c;
                hu0 hu0Var4 = ct0Var2.v;
                boolean z15 = hu0Var4.R0;
                zs0[] zs0VarArr = hu0Var4.g0;
                if (z15) {
                    ct0Var2.s--;
                    int h = ct0Var2.h();
                    ct0Var2.d = arrayList8;
                    int h10 = ct0Var2.h();
                    if (ct0Var2.s == 0 || h10 != 0) {
                        hu0Var4.m1(false);
                    }
                    for (int i20 = 0; i20 < zs0VarArr.length; i20++) {
                        zs0 zs0Var2 = zs0VarArr[i20];
                        if (zs0Var2.B == ct0Var2.r) {
                            if (ct0Var2.s == 0 && h10 == 0) {
                                zs0Var2.w.d.setText(LocaleController.getString("NoResult", R.string.NoResult));
                                zs0VarArr[i20].w.f.setVisibility(8);
                                zs0VarArr[i20].w.e(false, true);
                            } else if (h == 0) {
                                hu0Var4.z(zs0Var2.h, 0, null);
                            }
                        }
                    }
                    ct0Var2.l();
                    break;
                }
                break;
            case 17:
                TLObject tLObject3 = (TLObject) this.c;
                TLRPC.Document document = (TLRPC.Document) this.b;
                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                int i21 = NotificationCenter.customStickerCreated;
                Boolean bool = Boolean.FALSE;
                notificationCenter.postNotificationNameOnUIThread(i21, bool, tLObject3, document, null, bool);
                break;
            case 18:
                MessagesController.getInstance(((rx0) this.b).a.a).updateEmojiStatus((TLRPC.EmojiStatus) this.c);
                break;
            case 19:
                d21 d21Var = (d21) this.b;
                MessagesController.getInstance(d21Var.b).getTopicsController().deleteTopics(-d21Var.c, (ArrayList) this.c);
                int i22 = d21.b0;
                break;
            case 20:
                d21 d21Var2 = (d21) this.b;
                TLRPC.Updates updates = (TLRPC.Updates) this.c;
                d21Var2.getClass();
                MessagesController.getInstance(d21Var2.b).loadFullChat(updates.chats.get(0).id, 0, true);
                break;
            case 21:
                org.telegram.ui.Cells.j1 j1Var = (org.telegram.ui.Cells.j1) this.b;
                TLRPC.TL_messages_transcribedAudio tL_messages_transcribedAudio = (TLRPC.TL_messages_transcribedAudio) this.c;
                if (j1Var != null) {
                    j1Var.i0(tL_messages_transcribedAudio.trial_remains_num > 0 ? 1 : 2);
                    break;
                }
                break;
            case 22:
                b31.p((b31) this.b, (TLObject) this.c);
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
                org.telegram.ui.pk pkVar = (org.telegram.ui.pk) this.b;
                ((org.telegram.ui.ActionBar.n1) this.c).d(true);
                r31.a(pkVar.getContext(), pkVar.d);
                break;
            case 25:
                ((TranslateController) this.c).setHideTranslateDialog(((org.telegram.ui.pk) this.b).b, false);
                break;
            case 26:
                UndoView undoView = (UndoView) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                if (tLObject4 instanceof TLRPC.PaymentReceipt) {
                    undoView.s.presentFragment(new org.telegram.ui.do0((TLRPC.PaymentReceipt) tLObject4));
                    break;
                } else {
                    int i23 = UndoView.a0;
                    undoView.getClass();
                    break;
                }
            case 27:
                ((n41) this.b).D.onClick((org.telegram.ui.Cells.o8) this.c);
                break;
            case 28:
                m61 m61Var = (m61) this.b;
                h3.v1 v1Var = (h3.v1) this.c;
                Throwable cause = v1Var.getCause();
                if (!(cause instanceof y3.l) || (!cause.toString().contains("av1") && !cause.toString().contains("av01"))) {
                    TextureView textureView = m61Var.n;
                    if (textureView == null || ((m61Var.A || !(cause instanceof y3.p)) && !(cause instanceof e5.l))) {
                        m61Var.F.onError(m61Var, v1Var);
                        break;
                    } else {
                        m61Var.A = true;
                        if (m61Var.d != null) {
                            ViewGroup viewGroup = (ViewGroup) textureView.getParent();
                            if (viewGroup != null) {
                                int indexOfChild = viewGroup.indexOfChild(m61Var.n);
                                viewGroup.removeView(m61Var.n);
                                viewGroup.addView(m61Var.n, indexOfChild);
                            }
                            DispatchQueue dispatchQueue = m61Var.b;
                            if (dispatchQueue != null) {
                                dispatchQueue.postRunnable(new d61(m61Var, objArr == true ? 1 : 0));
                                break;
                            } else {
                                h3.k0 k0Var = m61Var.d;
                                TextureView textureView2 = m61Var.n;
                                k0Var.q0();
                                if (textureView2 != null && textureView2 == k0Var.V) {
                                    k0Var.q0();
                                    k0Var.b0();
                                    k0Var.g0(null);
                                    k0Var.a0(0, 0);
                                }
                                m61Var.d.j0(m61Var.n);
                                ArrayList arrayList9 = m61Var.J;
                                if (arrayList9 != null) {
                                    m61Var.G(arrayList9, m61Var.K);
                                } else if (m61Var.Q) {
                                    m61Var.H(m61Var.M, m61Var.O, m61Var.N, m61Var.P);
                                } else {
                                    m61Var.E(m61Var.M, m61Var.O);
                                }
                                m61Var.D();
                                break;
                            }
                        }
                    }
                } else {
                    FileLog.e(v1Var);
                    FileLog.e("av1 codec failed, we think this codec is not supported");
                    MessagesController.getGlobalMainSettings().edit().putBoolean("unsupport_video/av01", true).commit();
                    HashMap hashMap = m61.h0;
                    if (hashMap != null) {
                        hashMap.clear();
                    }
                    ArrayList arrayList10 = m61Var.J;
                    if (arrayList10 != null) {
                        int i24 = 0;
                        while (i24 < arrayList10.size()) {
                            i61 i61Var = (i61) arrayList10.get(i24);
                            int i25 = 0;
                            while (true) {
                                ArrayList arrayList11 = i61Var.d;
                                if (i25 < arrayList11.size()) {
                                    k61 k61Var = (k61) arrayList11.get(i25);
                                    if (!TextUtils.isEmpty(k61Var.m) && !m61.Y(k61Var.m)) {
                                        arrayList11.remove(i25);
                                        i25--;
                                    }
                                    i25++;
                                } else {
                                    if (arrayList11.isEmpty()) {
                                        arrayList10.remove(i24);
                                        i24--;
                                    }
                                    i24++;
                                }
                            }
                        }
                        arrayList = arrayList10;
                    }
                    m61Var.J = arrayList;
                    if (arrayList != null) {
                        m61Var.G(arrayList, m61Var.K);
                        break;
                    }
                }
                break;
            default:
                ((l61) this.b).f.G.onVisualizerUpdate(true, true, (float[]) this.c);
                break;
        }
    }

    public /* synthetic */ lg0(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ lg0(TLObject tLObject, TLRPC.Document document) {
        this.a = 17;
        this.c = tLObject;
        this.b = document;
    }
}
