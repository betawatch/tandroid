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

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class fm0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fm0(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7;
        int i10;
        int i11 = 4;
        ArrayList arrayList = null;
        int i12 = 0;
        int i13 = 1;
        switch (this.a) {
            case 0:
                nm0 nm0Var = (nm0) this.b;
                org.telegram.ui.cx cxVar = (org.telegram.ui.cx) this.c;
                nm0Var.S();
                lc.b0(cxVar).c(org.telegram.messenger.hd.N0(2131754485, null)).j();
                break;
            case 1:
                ((zm0) this.b).sendAccessibilityEvent((View) this.c, 4);
                break;
            case 2:
                xe xeVar = (xe) this.b;
                org.telegram.ui.bn bnVar = (org.telegram.ui.bn) this.c;
                if (bnVar != null) {
                    bnVar.presentFragment(new PremiumPreviewFragment(0, "select_sender"));
                    xeVar.dismiss();
                    break;
                }
                break;
            case 3:
                ((WindowManager) this.c).removeView(((xe) this.b).B);
                break;
            case 4:
                ap0 ap0Var = (ap0) this.b;
                TLObject tLObject = (TLObject) this.c;
                if (tLObject != null) {
                    ap0Var.g2 = (TLRPC.TL_exportedMessageLink) tLObject;
                    ap0Var.b1();
                    if (ap0Var.i2) {
                        ap0Var.N0();
                    }
                }
                ap0Var.h2 = false;
                break;
            case 5:
                jt0 jt0Var = (jt0) this.b;
                fi.i6 i6Var = (fi.i6) this.c;
                jq0 jq0Var = jt0Var.c0;
                if (jq0Var != null) {
                    int i14 = i6Var.a;
                    jq0Var.b.e(i14, jq0Var.d.i(i14));
                    break;
                }
                break;
            case 6:
                ds0 ds0Var = (ds0) this.b;
                bi.t2 t2Var = (bi.t2) this.c;
                ds0Var.G = null;
                ds0Var.H = null;
                t2Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(220L).setListener(new s60(t2Var, 20)).start();
                break;
            case 7:
                di.p8 p8Var = (di.p8) this.b;
                Runnable[] runnableArr = (Runnable[]) this.c;
                p8Var.e = !p8Var.e;
                runnableArr[0].run();
                p8Var.k(true);
                break;
            case 8:
                lc.b0(((ur0) this.b).f.y1).Q(R.raw.contact_check, 36, org.telegram.messenger.hd.a0(null, null, 2131742570, ((TLRPC.Chat) this.c).title)).k(true);
                break;
            case 9:
                gs0 gs0Var = (gs0) this.b;
                String str = (String) this.c;
                if (!gs0Var.w.w1[gs0Var.r].a.isEmpty() && ((i7 = gs0Var.r) == 1 || i7 == 4)) {
                    org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) i5.c.h(1, gs0Var.w.w1[i7].a);
                    int e12 = gjVar.e1();
                    long B0 = org.telegram.messenger.gj.B0(gjVar.k);
                    jt0 jt0Var2 = gs0Var.w;
                    gs0Var.F(e12, B0, jt0Var2.m1 == jt0Var2.y1.getUserConfig().e() ? gjVar.P1() : 0L, str);
                } else if (gs0Var.r == 3) {
                    jt0 jt0Var3 = gs0Var.w;
                    gs0Var.F(0, jt0Var3.m1, jt0Var3.G, str);
                }
                int i15 = gs0Var.r;
                if (i15 == 1 || i15 == 4) {
                    ArrayList arrayList2 = new ArrayList(gs0Var.w.w1[gs0Var.r].a);
                    gs0Var.s++;
                    Utilities.g.c(new es0((Object) gs0Var, (Object) str, (Object) arrayList2, i12));
                    break;
                }
                break;
            case 10:
                gs0 gs0Var2 = (gs0) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                jt0 jt0Var4 = gs0Var2.w;
                boolean z10 = jt0Var4.Y0;
                ds0[] ds0VarArr = jt0Var4.n0;
                if (z10) {
                    gs0Var2.s--;
                    int b10 = gs0Var2.b();
                    gs0Var2.d = arrayList3;
                    int b11 = gs0Var2.b();
                    if (gs0Var2.s == 0 || b11 != 0) {
                        jt0Var4.B1(false);
                    }
                    for (int i16 = 0; i16 < ds0VarArr.length; i16++) {
                        ds0 ds0Var2 = ds0VarArr[i16];
                        if (ds0Var2.F == gs0Var2.r) {
                            if (gs0Var2.s == 0 && b11 == 0) {
                                ds0Var2.w.d.setText(org.telegram.messenger.hd.N0(2131747974, "NoResult"));
                                ds0VarArr[i16].w.f.setVisibility(8);
                                ds0VarArr[i16].w.e(false, true);
                            } else if (b10 == 0) {
                                jt0Var4.D(ds0Var2.h, 0, null);
                            }
                        }
                    }
                    gs0Var2.f();
                    break;
                }
                break;
            case 11:
                TLObject tLObject2 = (TLObject) this.b;
                TLRPC.Document document = (TLRPC.Document) this.c;
                org.telegram.messenger.ls f10 = org.telegram.messenger.ls.f(org.telegram.messenger.k10.t0);
                Boolean bool = Boolean.FALSE;
                f10.m(org.telegram.messenger.ls.u3, bool, tLObject2, document, null, bool);
                break;
            case 12:
                org.telegram.messenger.np.u1(((ww0) this.b).a.a).t5((TLRPC.EmojiStatus) this.c, null);
                break;
            case 13:
                a21 a21Var = (a21) this.b;
                org.telegram.messenger.np.u1(a21Var.e).t7.d((ArrayList) this.c, -a21Var.f);
                int i17 = a21.m0;
                break;
            case 14:
                a21 a21Var2 = (a21) this.b;
                TLRPC.Updates updates = (TLRPC.Updates) this.c;
                a21Var2.getClass();
                org.telegram.messenger.np.u1(a21Var2.e).b3(0, updates.chats.get(0).id, true);
                break;
            case 15:
                org.telegram.ui.Cells.m1 m1Var = (org.telegram.ui.Cells.m1) this.b;
                TLRPC.TL_messages_transcribedAudio tL_messages_transcribedAudio = (TLRPC.TL_messages_transcribedAudio) this.c;
                if (m1Var != null) {
                    m1Var.h0(tL_messages_transcribedAudio.trial_remains_num > 0 ? 1 : 2);
                    break;
                }
                break;
            case 16:
                org.telegram.messenger.ls lsVar = (org.telegram.messenger.ls) this.b;
                g21 g21Var = (g21) this.c;
                lsVar.n(g21Var, org.telegram.messenger.ls.Y1);
                lsVar.n(g21Var, org.telegram.messenger.ls.Z1);
                break;
            case 17:
                b31 b31Var = (b31) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                org.telegram.messenger.vt vtVar = b31Var.t1;
                b31Var.m1 = null;
                if (tLObject3 instanceof TLRPC.TL_messages_translatedRichMessage) {
                    TLRPC.TL_messages_translatedRichMessage tL_messages_translatedRichMessage = (TLRPC.TL_messages_translatedRichMessage) tLObject3;
                    if (!tL_messages_translatedRichMessage.result.isEmpty() && tL_messages_translatedRichMessage.result.get(0) != null) {
                        b31Var.P1 = false;
                        TL_iv.RichMessage richMessage = tL_messages_translatedRichMessage.result.get(0);
                        if (vtVar != null) {
                            vtVar.set(richMessage);
                            b31Var.I1.D(vtVar);
                            break;
                        }
                    }
                }
                if (b31Var.P1) {
                    b31Var.dismiss();
                    org.telegram.messenger.ls.e().k(org.telegram.messenger.ls.S4, 1, org.telegram.messenger.hd.N0(2131743701, null));
                    break;
                } else {
                    org.telegram.messenger.f3.o(null, 2131743701, new lc((FrameLayout) b31Var.b, b31Var.J0), null);
                    x21 x21Var = b31Var.x1.e;
                    String str2 = b31Var.w1;
                    b31Var.v1 = str2;
                    x21Var.setText(b31.P0(str2, null, null));
                    break;
                }
                break;
            case 18:
                org.telegram.ui.ck ckVar = (org.telegram.ui.ck) this.b;
                ((org.telegram.ui.ActionBar.g1) this.c).d(true);
                s31.a(ckVar.getContext(), ckVar.d);
                break;
            case 19:
                ((org.telegram.messenger.a10) this.c).J(((org.telegram.ui.ck) this.b).b, false, false);
                break;
            case 20:
                UndoView undoView = (UndoView) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                if (tLObject4 instanceof TLRPC.PaymentReceipt) {
                    undoView.s.presentFragment(new org.telegram.ui.ml0((TLRPC.PaymentReceipt) tLObject4));
                    break;
                } else {
                    int i18 = UndoView.j0;
                    undoView.getClass();
                    break;
                }
            case 21:
                ((o41) this.b).E.onClick((org.telegram.ui.Cells.r8) this.c);
                break;
            case 22:
                i61 i61Var = (i61) this.b;
                e2.v0 v0Var = (e2.v0) this.c;
                Throwable cause = v0Var.getCause();
                if (!(cause instanceof u2.n) || (!cause.toString().contains("av1") && !cause.toString().contains("av01"))) {
                    TextureView textureView = i61Var.n;
                    if (textureView == null || ((i61Var.F || !(cause instanceof u2.p)) && !(cause instanceof d3.u))) {
                        i61Var.K.onError(i61Var, v0Var);
                        break;
                    } else {
                        i61Var.F = true;
                        if (i61Var.d != null) {
                            ViewGroup viewGroup = (ViewGroup) textureView.getParent();
                            if (viewGroup != null) {
                                int indexOfChild = viewGroup.indexOfChild(i61Var.n);
                                viewGroup.removeView(i61Var.n);
                                viewGroup.addView(i61Var.n, indexOfChild);
                            }
                            org.telegram.messenger.r5 r5Var = i61Var.b;
                            if (r5Var != null) {
                                r5Var.postRunnable(new w51(i61Var, i13));
                                break;
                            } else {
                                l2.f0 f0Var = i61Var.d;
                                TextureView textureView2 = i61Var.n;
                                f0Var.F1();
                                if (textureView2 != null && textureView2 == f0Var.X) {
                                    f0Var.F1();
                                    f0Var.s1();
                                    f0Var.x1(null);
                                    f0Var.q1(0, 0);
                                }
                                i61Var.d.z1(i61Var.n);
                                ArrayList arrayList4 = i61Var.O;
                                if (arrayList4 != null) {
                                    i61Var.k0(arrayList4, i61Var.P);
                                } else if (i61Var.V) {
                                    i61Var.l0(i61Var.R, i61Var.T, i61Var.S, i61Var.U);
                                } else {
                                    i61Var.j0(i61Var.R, i61Var.T);
                                }
                                i61Var.h0();
                                break;
                            }
                        }
                    }
                } else {
                    org.telegram.messenger.a8.g(v0Var, true);
                    org.telegram.messenger.a8.d("av1 codec failed, we think this codec is not supported");
                    org.telegram.messenger.np.g1().edit().putBoolean("unsupport_video/av01", true).commit();
                    HashMap hashMap = i61.m0;
                    if (hashMap != null) {
                        hashMap.clear();
                    }
                    ArrayList arrayList5 = i61Var.O;
                    if (arrayList5 != null) {
                        int i19 = 0;
                        while (i19 < arrayList5.size()) {
                            f61 f61Var = (f61) arrayList5.get(i19);
                            int i20 = 0;
                            while (true) {
                                ArrayList arrayList6 = f61Var.d;
                                if (i20 < arrayList6.size()) {
                                    h61 h61Var = (h61) arrayList6.get(i20);
                                    if (!TextUtils.isEmpty(h61Var.m) && !i61.D0(h61Var.m)) {
                                        arrayList6.remove(i20);
                                        i20--;
                                    }
                                    i20++;
                                } else {
                                    if (arrayList6.isEmpty()) {
                                        arrayList5.remove(i19);
                                        i19--;
                                    }
                                    i19++;
                                }
                            }
                        }
                        arrayList = arrayList5;
                    }
                    i61Var.O = arrayList;
                    if (arrayList != null) {
                        i61Var.k0(arrayList, i61Var.P);
                        break;
                    }
                }
                break;
            case 23:
                ((i61) ((oi.b6) this.b).f).L.x(true, (float[]) this.c);
                break;
            case 24:
                o61 o61Var = (o61) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                if (bitmap != null) {
                    if (o61Var.x != null) {
                        Bitmap bitmap2 = o61Var.w;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        o61Var.w = o61Var.x;
                    }
                    o61Var.x = bitmap;
                    Bitmap bitmap3 = o61Var.x;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                    o61Var.H = bitmapShader;
                    bitmapShader.setLocalMatrix(o61Var.M);
                    o61Var.K.setShader(o61Var.H);
                    o61Var.invalidate();
                    int L = org.telegram.messenger.g0.L(150.0f);
                    float width = bitmap.getWidth() / bitmap.getHeight();
                    if (width > 1.0f) {
                        i10 = (int) (L / width);
                    } else {
                        L = (int) (L * width);
                        i10 = L;
                    }
                    ViewGroup.LayoutParams layoutParams = o61Var.getLayoutParams();
                    if (o61Var.getVisibility() != 0 || layoutParams.width != L || layoutParams.height != i10) {
                        layoutParams.width = L;
                        layoutParams.height = i10;
                        o61Var.setVisibility(0);
                        o61Var.requestLayout();
                    }
                }
                o61Var.f = null;
                break;
            case 25:
                final y71 y71Var = (y71) this.b;
                y71Var.e.b.evaluateJavascript((String) this.c, new ValueCallback() { // from class: org.telegram.ui.Components.x71
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(Object obj) {
                        String str3 = (String) obj;
                        y71 y71Var2 = y71.this;
                        String[] strArr = y71Var2.c;
                        strArr[0] = strArr[0].replace(y71Var2.d, "/signature/" + str3.substring(1, str3.length() - 1));
                        y71Var2.b.countDown();
                    }
                });
                break;
            case 26:
                ((org.telegram.ui.Components.voip.q) this.b).a.setOnClickListener((View.OnClickListener) this.c);
                break;
            case 27:
                org.telegram.ui.Components.voip.y yVar = (org.telegram.ui.Components.voip.y) this.b;
                Bitmap bitmap4 = (Bitmap) this.c;
                HashMap hashMap2 = yVar.G.h;
                org.telegram.messenger.u3 u3Var = yVar.x;
                boolean z11 = u3Var.b;
                TLRPC.GroupCallParticipant groupCallParticipant = u3Var.a;
                hashMap2.put(z11 ? groupCallParticipant.presentationEndpoint : groupCallParticipant.videoEndpoint, bitmap4);
                break;
            case 28:
                org.telegram.ui.Components.voip.k0 k0Var = (org.telegram.ui.Components.voip.k0) this.b;
                org.telegram.ui.Components.voip.y yVar2 = (org.telegram.ui.Components.voip.y) this.c;
                k0Var.getClass();
                yVar2.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setListener(new org.telegram.ui.Components.voip.w(yVar2, i11)).setDuration(150L).start();
                break;
            default:
                ek0 ek0Var = (ek0) this.b;
                Object obj = this.c;
                if (ek0Var != null) {
                    ek0Var.setOnItemClickListener((qj0) obj);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ fm0(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }
}
