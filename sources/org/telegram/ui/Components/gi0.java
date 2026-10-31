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
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class gi0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gi0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int indexOf;
        int K;
        int i10;
        int i11;
        int i12 = 3;
        int i13 = 4;
        ArrayList arrayList = null;
        switch (this.a) {
            case 0:
                li0 li0Var = (li0) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                ArrayList arrayList3 = li0Var.r;
                li0Var.n.addAll(arrayList2);
                int size = arrayList2.size();
                int i14 = 0;
                while (i14 < size) {
                    Object obj = arrayList2.get(i14);
                    i14++;
                    ki0 ki0Var = (ki0) obj;
                    int i15 = 0;
                    while (true) {
                        if (i15 < arrayList3.size()) {
                            TLObject tLObject = ((ki0) arrayList3.get(i15)).a;
                            long j10 = tLObject instanceof TLRPC.Chat ? -((TLRPC.Chat) tLObject).id : tLObject instanceof TLRPC.User ? ((TLRPC.User) tLObject).id : 0L;
                            TLObject tLObject2 = ki0Var.a;
                            if (j10 != (tLObject2 instanceof TLRPC.Chat ? -((TLRPC.Chat) tLObject2).id : tLObject2 instanceof TLRPC.User ? ((TLRPC.User) tLObject2).id : 0L)) {
                                i15++;
                            } else if (ki0Var.c > 0) {
                                ((ki0) arrayList3.get(i15)).c = ki0Var.c;
                            }
                        } else {
                            arrayList3.add(ki0Var);
                        }
                    }
                }
                q0.a aVar = li0Var.x;
                if (aVar != null) {
                    aVar.accept(arrayList2);
                }
                li0Var.a();
                break;
            case 1:
                zm0 zm0Var = (zm0) this.b;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) this.c;
                ArrayList arrayList4 = zm0Var.K;
                if (!arrayList4.isEmpty() && (indexOf = arrayList4.indexOf(tL_sponsoredPeer)) >= 0 && (K = zm0Var.K()) < zm0Var.b()) {
                    arrayList4.remove(indexOf);
                    zm0Var.s(K + 1 + indexOf);
                    int size2 = zm0Var.j0.e.size();
                    int size3 = arrayList4.size();
                    if (zm0Var.G0) {
                        size2 = Math.min(3, size2);
                    }
                    if (size3 + size2 <= 0) {
                        zm0Var.s(K);
                        break;
                    }
                }
                break;
            case 2:
                zm0 zm0Var2 = (zm0) this.b;
                org.telegram.ui.ay ayVar = (org.telegram.ui.ay) this.c;
                zm0Var2.S();
                cc.a0(ayVar).c(org.telegram.messenger.cd.L0(2131754488, null)).j();
                break;
            case 3:
                ((ln0) this.b).sendAccessibilityEvent((View) this.c, 4);
                break;
            case 4:
                ie ieVar = (ie) this.b;
                org.telegram.ui.un unVar = (org.telegram.ui.un) this.c;
                if (unVar != null) {
                    unVar.presentFragment(new PremiumPreviewFragment(0, "select_sender"));
                    ieVar.dismiss();
                    break;
                }
                break;
            case 5:
                ((WindowManager) this.c).removeView(((ie) this.b).B);
                break;
            case 6:
                op0 op0Var = (op0) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                if (tLObject3 != null) {
                    op0Var.c2 = (TLRPC.TL_exportedMessageLink) tLObject3;
                    op0Var.a1();
                    if (op0Var.e2) {
                        op0Var.M0();
                    }
                }
                op0Var.d2 = false;
                break;
            case 7:
                zt0 zt0Var = (zt0) this.b;
                th.y4 y4Var = (th.y4) this.c;
                zq0 zq0Var = zt0Var.b0;
                if (zq0Var != null) {
                    int i16 = y4Var.a;
                    zq0Var.b.d(i16, zq0Var.d.i(i16));
                    break;
                }
                break;
            case 8:
                ss0 ss0Var = (ss0) this.b;
                org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) this.c;
                ss0Var.F = null;
                ss0Var.G = null;
                a5Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(220L).setListener(new t60(a5Var, 20)).start();
                break;
            case 9:
                rh.v5 v5Var = (rh.v5) this.b;
                Runnable[] runnableArr = (Runnable[]) this.c;
                v5Var.e = !v5Var.e;
                runnableArr[0].run();
                v5Var.j(true);
                break;
            case 10:
                cc.a0(((js0) this.b).f.x1).Q(R.raw.contact_check, 36, org.telegram.messenger.cd.a0(null, null, 2131742861, ((TLRPC.Chat) this.c).title)).k(true);
                break;
            case 11:
                us0 us0Var = (us0) this.b;
                String str = (String) this.c;
                if (!us0Var.w.v1[us0Var.r].a.isEmpty() && ((i10 = us0Var.r) == 1 || i10 == 4)) {
                    org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) i0.a.g(1, us0Var.w.v1[i10].a);
                    int f12 = jjVar.f1();
                    long B0 = org.telegram.messenger.jj.B0(jjVar.k);
                    zt0 zt0Var2 = us0Var.w;
                    us0Var.F(f12, B0, zt0Var2.l1 == zt0Var2.x1.getUserConfig().e() ? jjVar.Q1() : 0L, str);
                } else if (us0Var.r == 3) {
                    zt0 zt0Var3 = us0Var.w;
                    us0Var.F(0, zt0Var3.l1, zt0Var3.F, str);
                }
                int i17 = us0Var.r;
                if (i17 == 1 || i17 == 4) {
                    ArrayList arrayList5 = new ArrayList(us0Var.w.v1[us0Var.r].a);
                    us0Var.s++;
                    Utilities.g.c(new jg(us0Var, str, arrayList5, 24));
                    break;
                }
                break;
            case 12:
                us0 us0Var2 = (us0) this.b;
                ArrayList arrayList6 = (ArrayList) this.c;
                zt0 zt0Var4 = us0Var2.w;
                boolean z10 = zt0Var4.X0;
                ss0[] ss0VarArr = zt0Var4.m0;
                if (z10) {
                    us0Var2.s--;
                    int b10 = us0Var2.b();
                    us0Var2.d = arrayList6;
                    int b11 = us0Var2.b();
                    if (us0Var2.s == 0 || b11 != 0) {
                        zt0Var4.w1(false);
                    }
                    for (int i18 = 0; i18 < ss0VarArr.length; i18++) {
                        ss0 ss0Var2 = ss0VarArr[i18];
                        if (ss0Var2.E == us0Var2.r) {
                            if (us0Var2.s == 0 && b11 == 0) {
                                ss0Var2.w.d.setText(org.telegram.messenger.cd.L0(2131748183, "NoResult"));
                                ss0VarArr[i18].w.f.setVisibility(8);
                                ss0VarArr[i18].w.e(false, true);
                            } else if (b10 == 0) {
                                zt0Var4.C(ss0Var2.h, 0, null);
                            }
                        }
                    }
                    us0Var2.f();
                    break;
                }
                break;
            case 13:
                TLObject tLObject4 = (TLObject) this.b;
                TLRPC.Document document = (TLRPC.Document) this.c;
                org.telegram.messenger.zs f7 = org.telegram.messenger.zs.f(org.telegram.messenger.d20.s0);
                Boolean bool = Boolean.FALSE;
                f7.m(org.telegram.messenger.zs.s3, bool, tLObject4, document, null, bool);
                break;
            case 14:
                org.telegram.messenger.vp.r1(((ox0) this.b).a.a).e5((TLRPC.EmojiStatus) this.c, null);
                break;
            case 15:
                o21 o21Var = (o21) this.b;
                org.telegram.messenger.vp.r1(o21Var.n).r7.d((ArrayList) this.c, -o21Var.r);
                int i19 = o21.o0;
                break;
            case 16:
                o21 o21Var2 = (o21) this.b;
                TLRPC.Updates updates = (TLRPC.Updates) this.c;
                o21Var2.getClass();
                org.telegram.messenger.vp.r1(o21Var2.n).T2(0, updates.chats.get(0).id, true);
                break;
            case 17:
                org.telegram.ui.Cells.l1 l1Var = (org.telegram.ui.Cells.l1) this.b;
                TLRPC.TL_messages_transcribedAudio tL_messages_transcribedAudio = (TLRPC.TL_messages_transcribedAudio) this.c;
                if (l1Var != null) {
                    l1Var.c0(tL_messages_transcribedAudio.trial_remains_num > 0 ? 1 : 2);
                    break;
                }
                break;
            case 18:
                m31 m31Var = (m31) this.b;
                TLObject tLObject5 = (TLObject) this.c;
                org.telegram.messenger.lu luVar = m31Var.p1;
                m31Var.i1 = null;
                if (tLObject5 instanceof TLRPC.TL_messages_translatedRichMessage) {
                    TLRPC.TL_messages_translatedRichMessage tL_messages_translatedRichMessage = (TLRPC.TL_messages_translatedRichMessage) tLObject5;
                    if (!tL_messages_translatedRichMessage.result.isEmpty() && tL_messages_translatedRichMessage.result.get(0) != null) {
                        m31Var.L1 = false;
                        TL_iv.RichMessage richMessage = tL_messages_translatedRichMessage.result.get(0);
                        if (luVar != null) {
                            luVar.set(richMessage);
                            m31Var.E1.D(luVar);
                            break;
                        }
                    }
                }
                if (m31Var.L1) {
                    m31Var.dismiss();
                    org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.P4, 1, org.telegram.messenger.cd.L0(2131743971, null));
                    break;
                } else {
                    org.telegram.messenger.m5.o(null, 2131743971, new cc((FrameLayout) m31Var.b, m31Var.I0), null);
                    i31 i31Var = m31Var.t1.e;
                    String str2 = m31Var.s1;
                    m31Var.r1 = str2;
                    i31Var.setText(m31.O0(str2, null, null));
                    break;
                }
                break;
            case 19:
                org.telegram.ui.xk xkVar = (org.telegram.ui.xk) this.b;
                ((org.telegram.ui.ActionBar.k1) this.c).d(true);
                d41.a(xkVar.getContext(), xkVar.d);
                break;
            case 20:
                ((org.telegram.messenger.t10) this.c).J(((org.telegram.ui.xk) this.b).b, false, false);
                break;
            case 21:
                UndoView undoView = (UndoView) this.b;
                TLObject tLObject6 = (TLObject) this.c;
                if (tLObject6 instanceof TLRPC.PaymentReceipt) {
                    undoView.s.presentFragment(new org.telegram.ui.sm0((TLRPC.PaymentReceipt) tLObject6));
                    break;
                } else {
                    int i20 = UndoView.i0;
                    undoView.getClass();
                    break;
                }
            case 22:
                ((a51) this.b).D.onClick((org.telegram.ui.Cells.s8) this.c);
                break;
            case 23:
                u61 u61Var = (u61) this.b;
                b2.y0 y0Var = (b2.y0) this.c;
                Throwable cause = y0Var.getCause();
                if (!(cause instanceof r2.n) || (!cause.toString().contains("av1") && !cause.toString().contains("av01"))) {
                    TextureView textureView = u61Var.n;
                    if (textureView == null || ((u61Var.E || !(cause instanceof r2.p)) && !(cause instanceof a3.x))) {
                        u61Var.J.onError(u61Var, y0Var);
                        break;
                    } else {
                        u61Var.E = true;
                        if (u61Var.d != null) {
                            ViewGroup viewGroup = (ViewGroup) textureView.getParent();
                            if (viewGroup != null) {
                                int indexOfChild = viewGroup.indexOfChild(u61Var.n);
                                viewGroup.removeView(u61Var.n);
                                viewGroup.addView(u61Var.n, indexOfChild);
                            }
                            org.telegram.messenger.s5 s5Var = u61Var.b;
                            if (s5Var != null) {
                                s5Var.postRunnable(new j51(u61Var, i12));
                                break;
                            } else {
                                i2.i0 i0Var = u61Var.d;
                                TextureView textureView2 = u61Var.n;
                                i0Var.F1();
                                if (textureView2 != null && textureView2 == i0Var.X) {
                                    i0Var.F1();
                                    i0Var.s1();
                                    i0Var.x1(null);
                                    i0Var.q1(0, 0);
                                }
                                u61Var.d.z1(u61Var.n);
                                ArrayList arrayList7 = u61Var.N;
                                if (arrayList7 != null) {
                                    u61Var.k0(arrayList7, u61Var.O);
                                } else if (u61Var.U) {
                                    u61Var.l0(u61Var.Q, u61Var.S, u61Var.R, u61Var.T);
                                } else {
                                    u61Var.j0(u61Var.Q, u61Var.S);
                                }
                                u61Var.h0();
                                break;
                            }
                        }
                    }
                } else {
                    org.telegram.messenger.f8.g(y0Var, true);
                    org.telegram.messenger.f8.d("av1 codec failed, we think this codec is not supported");
                    org.telegram.messenger.vp.d1().edit().putBoolean("unsupport_video/av01", true).commit();
                    HashMap hashMap = u61.l0;
                    if (hashMap != null) {
                        hashMap.clear();
                    }
                    ArrayList arrayList8 = u61Var.N;
                    if (arrayList8 != null) {
                        int i21 = 0;
                        while (i21 < arrayList8.size()) {
                            r61 r61Var = (r61) arrayList8.get(i21);
                            int i22 = 0;
                            while (true) {
                                ArrayList arrayList9 = r61Var.d;
                                if (i22 < arrayList9.size()) {
                                    t61 t61Var = (t61) arrayList9.get(i22);
                                    if (!TextUtils.isEmpty(t61Var.m) && !u61.D0(t61Var.m)) {
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
                    u61Var.N = arrayList;
                    if (arrayList != null) {
                        u61Var.k0(arrayList, u61Var.O);
                        break;
                    }
                }
                break;
            case 24:
                ((u61) ((bi.r6) this.b).f).K.B(true, (float[]) this.c);
                break;
            case 25:
                b71 b71Var = (b71) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                if (bitmap != null) {
                    if (b71Var.x != null) {
                        Bitmap bitmap2 = b71Var.w;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        b71Var.w = b71Var.x;
                    }
                    b71Var.x = bitmap;
                    Bitmap bitmap3 = b71Var.x;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                    b71Var.G = bitmapShader;
                    bitmapShader.setLocalMatrix(b71Var.L);
                    b71Var.J.setShader(b71Var.G);
                    b71Var.invalidate();
                    int L = org.telegram.messenger.i0.L(150.0f);
                    float width = bitmap.getWidth() / bitmap.getHeight();
                    if (width > 1.0f) {
                        i11 = (int) (L / width);
                    } else {
                        L = (int) (L * width);
                        i11 = L;
                    }
                    ViewGroup.LayoutParams layoutParams = b71Var.getLayoutParams();
                    if (b71Var.getVisibility() != 0 || layoutParams.width != L || layoutParams.height != i11) {
                        layoutParams.width = L;
                        layoutParams.height = i11;
                        b71Var.setVisibility(0);
                        b71Var.requestLayout();
                    }
                }
                b71Var.f = null;
                break;
            case 26:
                final l81 l81Var = (l81) this.b;
                l81Var.e.b.evaluateJavascript((String) this.c, new ValueCallback() { // from class: org.telegram.ui.Components.k81
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(Object obj2) {
                        String str3 = (String) obj2;
                        l81 l81Var2 = l81.this;
                        String[] strArr = l81Var2.c;
                        strArr[0] = strArr[0].replace(l81Var2.d, "/signature/" + str3.substring(1, str3.length() - 1));
                        l81Var2.b.countDown();
                    }
                });
                break;
            case 27:
                ((org.telegram.ui.Components.voip.j) this.b).a.setOnClickListener((View.OnClickListener) this.c);
                break;
            case 28:
                org.telegram.ui.Components.voip.r rVar = (org.telegram.ui.Components.voip.r) this.b;
                Bitmap bitmap4 = (Bitmap) this.c;
                HashMap hashMap2 = rVar.F.h;
                org.telegram.messenger.v3 v3Var = rVar.x;
                boolean z11 = v3Var.b;
                TLRPC.GroupCallParticipant groupCallParticipant = v3Var.a;
                hashMap2.put(z11 ? groupCallParticipant.presentationEndpoint : groupCallParticipant.videoEndpoint, bitmap4);
                break;
            default:
                org.telegram.ui.Components.voip.w wVar = (org.telegram.ui.Components.voip.w) this.b;
                org.telegram.ui.Components.voip.r rVar2 = (org.telegram.ui.Components.voip.r) this.c;
                wVar.getClass();
                rVar2.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setListener(new org.telegram.ui.Components.voip.p(rVar2, i13)).setDuration(150L).start();
                break;
        }
    }

    public /* synthetic */ gi0(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }
}
