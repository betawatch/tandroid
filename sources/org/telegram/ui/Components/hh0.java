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
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_forum;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class hh0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hh0(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int indexOf;
        int K;
        int i7;
        int i10;
        ArrayList arrayList = null;
        switch (this.a) {
            case 0:
                lh0 lh0Var = (lh0) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                ArrayList arrayList3 = lh0Var.r;
                lh0Var.n.addAll(arrayList2);
                int size = arrayList2.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList2.get(i11);
                    i11++;
                    kh0 kh0Var = (kh0) obj;
                    int i12 = 0;
                    while (true) {
                        if (i12 < arrayList3.size()) {
                            TLObject tLObject = ((kh0) arrayList3.get(i12)).a;
                            long j3 = tLObject instanceof TLRPC.Chat ? -((TLRPC.Chat) tLObject).id : tLObject instanceof TLRPC.User ? ((TLRPC.User) tLObject).id : 0L;
                            TLObject tLObject2 = kh0Var.a;
                            if (j3 != (tLObject2 instanceof TLRPC.Chat ? -((TLRPC.Chat) tLObject2).id : tLObject2 instanceof TLRPC.User ? ((TLRPC.User) tLObject2).id : 0L)) {
                                i12++;
                            } else if (kh0Var.c > 0) {
                                ((kh0) arrayList3.get(i12)).c = kh0Var.c;
                            }
                        } else {
                            arrayList3.add(kh0Var);
                        }
                    }
                }
                q0.a aVar = lh0Var.x;
                if (aVar != null) {
                    aVar.accept(arrayList2);
                }
                lh0Var.a();
                break;
            case 1:
                cm0 cm0Var = (cm0) this.b;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) this.c;
                ArrayList arrayList4 = cm0Var.L;
                if (!arrayList4.isEmpty() && (indexOf = arrayList4.indexOf(tL_sponsoredPeer)) >= 0 && (K = cm0Var.K()) < cm0Var.b()) {
                    arrayList4.remove(indexOf);
                    cm0Var.s(K + 1 + indexOf);
                    int size2 = cm0Var.k0.e.size();
                    int size3 = arrayList4.size();
                    if (cm0Var.H0) {
                        size2 = Math.min(3, size2);
                    }
                    if (size3 + size2 <= 0) {
                        cm0Var.s(K);
                        break;
                    }
                }
                break;
            case 2:
                cm0 cm0Var2 = (cm0) this.b;
                org.telegram.ui.yw ywVar = (org.telegram.ui.yw) this.c;
                cm0Var2.S();
                cc.a0(ywVar).c(org.telegram.messenger.hd.M0(2131754488, null)).j();
                break;
            case 3:
                ((om0) this.b).sendAccessibilityEvent((View) this.c, 4);
                break;
            case 4:
                oe oeVar = (oe) this.b;
                org.telegram.ui.an anVar = (org.telegram.ui.an) this.c;
                if (anVar != null) {
                    anVar.presentFragment(new PremiumPreviewFragment(0, "select_sender"));
                    oeVar.dismiss();
                    break;
                }
                break;
            case 5:
                ((WindowManager) this.c).removeView(((oe) this.b).B);
                break;
            case 6:
                po0 po0Var = (po0) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                if (tLObject3 != null) {
                    po0Var.g2 = (TLRPC.TL_exportedMessageLink) tLObject3;
                    po0Var.a1();
                    if (po0Var.i2) {
                        po0Var.M0();
                    }
                }
                po0Var.h2 = false;
                break;
            case 7:
                ys0 ys0Var = (ys0) this.b;
                fi.l6 l6Var = (fi.l6) this.c;
                zp0 zp0Var = ys0Var.c0;
                if (zp0Var != null) {
                    int i13 = l6Var.a;
                    zp0Var.b.d(i13, zp0Var.d.i(i13));
                    break;
                }
                break;
            case 8:
                tr0 tr0Var = (tr0) this.b;
                bi.v1 v1Var = (bi.v1) this.c;
                tr0Var.G = null;
                tr0Var.H = null;
                v1Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(220L).setListener(new h60(v1Var, 20)).start();
                break;
            case 9:
                di.m8 m8Var = (di.m8) this.b;
                Runnable[] runnableArr = (Runnable[]) this.c;
                m8Var.e = !m8Var.e;
                runnableArr[0].run();
                m8Var.j(true);
                break;
            case 10:
                cc.a0(((kr0) this.b).f.y1).Q(R.raw.contact_check, 36, org.telegram.messenger.hd.a0(null, null, 2131742836, ((TLRPC.Chat) this.c).title)).k(true);
                break;
            case 11:
                vr0 vr0Var = (vr0) this.b;
                String str = (String) this.c;
                if (!vr0Var.w.w1[vr0Var.r].a.isEmpty() && ((i7 = vr0Var.r) == 1 || i7 == 4)) {
                    org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) i5.c.h(1, vr0Var.w.w1[i7].a);
                    int e12 = gjVar.e1();
                    long B0 = org.telegram.messenger.gj.B0(gjVar.k);
                    ys0 ys0Var2 = vr0Var.w;
                    vr0Var.F(e12, B0, ys0Var2.m1 == ys0Var2.y1.getUserConfig().e() ? gjVar.P1() : 0L, str);
                } else if (vr0Var.r == 3) {
                    ys0 ys0Var3 = vr0Var.w;
                    vr0Var.F(0, ys0Var3.m1, ys0Var3.G, str);
                }
                int i14 = vr0Var.r;
                if (i14 == 1 || i14 == 4) {
                    ArrayList arrayList5 = new ArrayList(vr0Var.w.w1[vr0Var.r].a);
                    vr0Var.s++;
                    Utilities.g.c(new yf(vr0Var, str, arrayList5, 26));
                    break;
                }
                break;
            case 12:
                vr0 vr0Var2 = (vr0) this.b;
                ArrayList arrayList6 = (ArrayList) this.c;
                ys0 ys0Var4 = vr0Var2.w;
                boolean z10 = ys0Var4.Y0;
                tr0[] tr0VarArr = ys0Var4.n0;
                if (z10) {
                    vr0Var2.s--;
                    int b10 = vr0Var2.b();
                    vr0Var2.d = arrayList6;
                    int b11 = vr0Var2.b();
                    if (vr0Var2.s == 0 || b11 != 0) {
                        ys0Var4.B1(false);
                    }
                    for (int i15 = 0; i15 < tr0VarArr.length; i15++) {
                        tr0 tr0Var2 = tr0VarArr[i15];
                        if (tr0Var2.F == vr0Var2.r) {
                            if (vr0Var2.s == 0 && b11 == 0) {
                                tr0Var2.w.d.setText(org.telegram.messenger.hd.M0(2131748167, "NoResult"));
                                tr0VarArr[i15].w.f.setVisibility(8);
                                tr0VarArr[i15].w.e(false, true);
                            } else if (b10 == 0) {
                                ys0Var4.D(tr0Var2.h, 0, null);
                            }
                        }
                    }
                    vr0Var2.f();
                    break;
                }
                break;
            case 13:
                TLObject tLObject4 = (TLObject) this.b;
                TLRPC.Document document = (TLRPC.Document) this.c;
                org.telegram.messenger.ns f10 = org.telegram.messenger.ns.f(org.telegram.messenger.m10.t0);
                Boolean bool = Boolean.FALSE;
                f10.m(org.telegram.messenger.ns.s3, bool, tLObject4, document, null, bool);
                break;
            case 14:
                org.telegram.messenger.np.s1(((nw0) this.b).a.a).i5((TLRPC.EmojiStatus) this.c, null);
                break;
            case 15:
                v01 v01Var = (v01) this.b;
                String str2 = (String) this.c;
                v01Var.P = null;
                org.telegram.messenger.h00 h00Var = org.telegram.messenger.np.s1(v01Var.a).r7;
                long j10 = -v01Var.b;
                gh ghVar = new gh(11, v01Var, str2);
                h00Var.getClass();
                TL_forum.TL_messages_getForumTopics tL_messages_getForumTopics = new TL_forum.TL_messages_getForumTopics();
                tL_messages_getForumTopics.peer = h00Var.getMessagesController().j1(-j10);
                tL_messages_getForumTopics.q = str2;
                tL_messages_getForumTopics.limit = 50;
                v01Var.O = h00Var.getConnectionsManager().sendRequest(tL_messages_getForumTopics, new org.telegram.messenger.mj(h00Var, j10, ghVar, 10));
                break;
            case 16:
                p11 p11Var = (p11) this.b;
                org.telegram.messenger.np.s1(p11Var.e).r7.d((ArrayList) this.c, -p11Var.f);
                int i16 = p11.m0;
                break;
            case 17:
                p11 p11Var2 = (p11) this.b;
                TLRPC.Updates updates = (TLRPC.Updates) this.c;
                p11Var2.getClass();
                org.telegram.messenger.np.s1(p11Var2.e).V2(0, updates.chats.get(0).id, true);
                break;
            case 18:
                org.telegram.messenger.ns nsVar = (org.telegram.messenger.ns) this.b;
                v11 v11Var = (v11) this.c;
                nsVar.n(v11Var, org.telegram.messenger.ns.Y1);
                nsVar.n(v11Var, org.telegram.messenger.ns.Z1);
                break;
            case 19:
                org.telegram.ui.Cells.l1 l1Var = (org.telegram.ui.Cells.l1) this.b;
                TLRPC.TL_messages_transcribedAudio tL_messages_transcribedAudio = (TLRPC.TL_messages_transcribedAudio) this.c;
                if (l1Var != null) {
                    l1Var.e0(tL_messages_transcribedAudio.trial_remains_num > 0 ? 1 : 2);
                    break;
                }
                break;
            case 20:
                p21 p21Var = (p21) this.b;
                TLObject tLObject5 = (TLObject) this.c;
                org.telegram.messenger.xt xtVar = p21Var.t1;
                p21Var.m1 = null;
                if (tLObject5 instanceof TLRPC.TL_messages_translatedRichMessage) {
                    TLRPC.TL_messages_translatedRichMessage tL_messages_translatedRichMessage = (TLRPC.TL_messages_translatedRichMessage) tLObject5;
                    if (!tL_messages_translatedRichMessage.result.isEmpty() && tL_messages_translatedRichMessage.result.get(0) != null) {
                        p21Var.P1 = false;
                        TL_iv.RichMessage richMessage = tL_messages_translatedRichMessage.result.get(0);
                        if (xtVar != null) {
                            xtVar.set(richMessage);
                            p21Var.I1.D(xtVar);
                            break;
                        }
                    }
                }
                if (p21Var.P1) {
                    p21Var.dismiss();
                    org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.P4, 1, org.telegram.messenger.hd.M0(2131743946, null));
                    break;
                } else {
                    org.telegram.messenger.k5.o(null, 2131743946, new cc((FrameLayout) p21Var.b, p21Var.J0), null);
                    l21 l21Var = p21Var.x1.e;
                    String str3 = p21Var.w1;
                    p21Var.v1 = str3;
                    l21Var.setText(p21.O0(str3, null, null));
                    break;
                }
                break;
            case 21:
                org.telegram.ui.bk bkVar = (org.telegram.ui.bk) this.b;
                ((org.telegram.ui.ActionBar.g1) this.c).d(true);
                f31.a(bkVar.getContext(), bkVar.d);
                break;
            case 22:
                ((org.telegram.messenger.c10) this.c).J(((org.telegram.ui.bk) this.b).b, false, false);
                break;
            case 23:
                UndoView undoView = (UndoView) this.b;
                TLObject tLObject6 = (TLObject) this.c;
                if (tLObject6 instanceof TLRPC.PaymentReceipt) {
                    undoView.s.presentFragment(new org.telegram.ui.jl0((TLRPC.PaymentReceipt) tLObject6));
                    break;
                } else {
                    int i17 = UndoView.j0;
                    undoView.getClass();
                    break;
                }
            case 24:
                ((b41) this.b).D.onClick((org.telegram.ui.Cells.p8) this.c);
                break;
            case 25:
                u51 u51Var = (u51) this.b;
                e2.v0 v0Var = (e2.v0) this.c;
                Throwable cause = v0Var.getCause();
                if (!(cause instanceof u2.n) || (!cause.toString().contains("av1") && !cause.toString().contains("av01"))) {
                    TextureView textureView = u51Var.n;
                    if (textureView == null || ((u51Var.F || !(cause instanceof u2.p)) && !(cause instanceof d3.u))) {
                        u51Var.K.onError(u51Var, v0Var);
                        break;
                    } else {
                        u51Var.F = true;
                        if (u51Var.d != null) {
                            ViewGroup viewGroup = (ViewGroup) textureView.getParent();
                            if (viewGroup != null) {
                                int indexOfChild = viewGroup.indexOfChild(u51Var.n);
                                viewGroup.removeView(u51Var.n);
                                viewGroup.addView(u51Var.n, indexOfChild);
                            }
                            org.telegram.messenger.q5 q5Var = u51Var.b;
                            if (q5Var != null) {
                                q5Var.postRunnable(new w41(u51Var, r6));
                                break;
                            } else {
                                l2.f0 f0Var = u51Var.d;
                                TextureView textureView2 = u51Var.n;
                                f0Var.F1();
                                if (textureView2 != null && textureView2 == f0Var.X) {
                                    f0Var.F1();
                                    f0Var.s1();
                                    f0Var.x1(null);
                                    f0Var.q1(0, 0);
                                }
                                u51Var.d.z1(u51Var.n);
                                ArrayList arrayList7 = u51Var.O;
                                if (arrayList7 != null) {
                                    u51Var.k0(arrayList7, u51Var.P);
                                } else if (u51Var.V) {
                                    u51Var.l0(u51Var.R, u51Var.T, u51Var.S, u51Var.U);
                                } else {
                                    u51Var.j0(u51Var.R, u51Var.T);
                                }
                                u51Var.h0();
                                break;
                            }
                        }
                    }
                } else {
                    org.telegram.messenger.a8.g(v0Var, true);
                    org.telegram.messenger.a8.d("av1 codec failed, we think this codec is not supported");
                    org.telegram.messenger.np.e1().edit().putBoolean("unsupport_video/av01", true).commit();
                    HashMap hashMap = u51.m0;
                    if (hashMap != null) {
                        hashMap.clear();
                    }
                    ArrayList arrayList8 = u51Var.O;
                    if (arrayList8 != null) {
                        int i18 = 0;
                        while (i18 < arrayList8.size()) {
                            r51 r51Var = (r51) arrayList8.get(i18);
                            int i19 = 0;
                            while (true) {
                                ArrayList arrayList9 = r51Var.d;
                                if (i19 < arrayList9.size()) {
                                    t51 t51Var = (t51) arrayList9.get(i19);
                                    if (!TextUtils.isEmpty(t51Var.m) && !u51.D0(t51Var.m)) {
                                        arrayList9.remove(i19);
                                        i19--;
                                    }
                                    i19++;
                                } else {
                                    if (arrayList9.isEmpty()) {
                                        arrayList8.remove(i18);
                                        i18--;
                                    }
                                    i18++;
                                }
                            }
                        }
                        arrayList = arrayList8;
                    }
                    u51Var.O = arrayList;
                    if (arrayList != null) {
                        u51Var.k0(arrayList, u51Var.P);
                        break;
                    }
                }
                break;
            case 26:
                ((u51) ((oi.z5) this.b).f).L.A(true, (float[]) this.c);
                break;
            case 27:
                a61 a61Var = (a61) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                if (bitmap != null) {
                    if (a61Var.x != null) {
                        Bitmap bitmap2 = a61Var.w;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        a61Var.w = a61Var.x;
                    }
                    a61Var.x = bitmap;
                    Bitmap bitmap3 = a61Var.x;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                    a61Var.H = bitmapShader;
                    bitmapShader.setLocalMatrix(a61Var.M);
                    a61Var.K.setShader(a61Var.H);
                    a61Var.invalidate();
                    int L = org.telegram.messenger.g0.L(150.0f);
                    float width = bitmap.getWidth() / bitmap.getHeight();
                    if (width > 1.0f) {
                        i10 = (int) (L / width);
                    } else {
                        L = (int) (L * width);
                        i10 = L;
                    }
                    ViewGroup.LayoutParams layoutParams = a61Var.getLayoutParams();
                    if (a61Var.getVisibility() != 0 || layoutParams.width != L || layoutParams.height != i10) {
                        layoutParams.width = L;
                        layoutParams.height = i10;
                        a61Var.setVisibility(0);
                        a61Var.requestLayout();
                    }
                }
                a61Var.f = null;
                break;
            case 28:
                final l71 l71Var = (l71) this.b;
                l71Var.e.b.evaluateJavascript((String) this.c, new ValueCallback() { // from class: org.telegram.ui.Components.k71
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(Object obj2) {
                        String str4 = (String) obj2;
                        l71 l71Var2 = l71.this;
                        String[] strArr = l71Var2.c;
                        strArr[0] = strArr[0].replace(l71Var2.d, "/signature/" + str4.substring(1, str4.length() - 1));
                        l71Var2.b.countDown();
                    }
                });
                break;
            default:
                ((org.telegram.ui.Components.voip.q) this.b).a.setOnClickListener((View.OnClickListener) this.c);
                break;
        }
    }

    public /* synthetic */ hh0(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }
}
