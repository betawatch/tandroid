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
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class sh0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sh0(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int indexOf;
        int K;
        int i7;
        hi.r7 r7Var;
        android.support.v4.media.session.a0 a0Var;
        int i10;
        ArrayList arrayList = null;
        int i11 = 1;
        switch (this.a) {
            case 0:
                wh0 wh0Var = (wh0) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                ArrayList arrayList3 = wh0Var.r;
                wh0Var.n.addAll(arrayList2);
                int size = arrayList2.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList2.get(i12);
                    i12++;
                    vh0 vh0Var = (vh0) obj;
                    int i13 = 0;
                    while (true) {
                        if (i13 < arrayList3.size()) {
                            TLObject tLObject = ((vh0) arrayList3.get(i13)).a;
                            long j3 = tLObject instanceof TLRPC.Chat ? -((TLRPC.Chat) tLObject).id : tLObject instanceof TLRPC.User ? ((TLRPC.User) tLObject).id : 0L;
                            TLObject tLObject2 = vh0Var.a;
                            if (j3 != (tLObject2 instanceof TLRPC.Chat ? -((TLRPC.Chat) tLObject2).id : tLObject2 instanceof TLRPC.User ? ((TLRPC.User) tLObject2).id : 0L)) {
                                i13++;
                            } else if (vh0Var.c > 0) {
                                ((vh0) arrayList3.get(i13)).c = vh0Var.c;
                            }
                        } else {
                            arrayList3.add(vh0Var);
                        }
                    }
                }
                q0.a aVar = wh0Var.x;
                if (aVar != null) {
                    aVar.accept(arrayList2);
                }
                wh0Var.a();
                break;
            case 1:
                mm0 mm0Var = (mm0) this.b;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) this.c;
                ArrayList arrayList4 = mm0Var.L;
                if (!arrayList4.isEmpty() && (indexOf = arrayList4.indexOf(tL_sponsoredPeer)) >= 0 && (K = mm0Var.K()) < mm0Var.b()) {
                    arrayList4.remove(indexOf);
                    mm0Var.s(K + 1 + indexOf);
                    int size2 = mm0Var.k0.e.size();
                    int size3 = arrayList4.size();
                    if (mm0Var.H0) {
                        size2 = Math.min(3, size2);
                    }
                    if (size3 + size2 <= 0) {
                        mm0Var.s(K);
                        break;
                    }
                }
                break;
            case 2:
                mm0 mm0Var2 = (mm0) this.b;
                org.telegram.ui.bx bxVar = (org.telegram.ui.bx) this.c;
                mm0Var2.S();
                kc.b0(bxVar).c(org.telegram.messenger.gd.N0(2131754485, null)).j();
                break;
            case 3:
                ((ym0) this.b).sendAccessibilityEvent((View) this.c, 4);
                break;
            case 4:
                ye yeVar = (ye) this.b;
                org.telegram.ui.bn bnVar = (org.telegram.ui.bn) this.c;
                if (bnVar != null) {
                    bnVar.presentFragment(new PremiumPreviewFragment(0, "select_sender"));
                    yeVar.dismiss();
                    break;
                }
                break;
            case 5:
                ((WindowManager) this.c).removeView(((ye) this.b).B);
                break;
            case 6:
                zo0 zo0Var = (zo0) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                if (tLObject3 != null) {
                    zo0Var.g2 = (TLRPC.TL_exportedMessageLink) tLObject3;
                    zo0Var.b1();
                    if (zo0Var.i2) {
                        zo0Var.N0();
                    }
                }
                zo0Var.h2 = false;
                break;
            case 7:
                it0 it0Var = (it0) this.b;
                fi.i6 i6Var = (fi.i6) this.c;
                iq0 iq0Var = it0Var.c0;
                if (iq0Var != null) {
                    int i14 = i6Var.a;
                    iq0Var.b.e(i14, iq0Var.d.i(i14));
                    break;
                }
                break;
            case 8:
                ds0 ds0Var = (ds0) this.b;
                bi.v2 v2Var = (bi.v2) this.c;
                ds0Var.G = null;
                ds0Var.H = null;
                v2Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(220L).setListener(new p60(v2Var, 20)).start();
                break;
            case 9:
                di.p8 p8Var = (di.p8) this.b;
                Runnable[] runnableArr = (Runnable[]) this.c;
                p8Var.e = !p8Var.e;
                runnableArr[0].run();
                p8Var.k(true);
                break;
            case 10:
                kc.b0(((tr0) this.b).f.y1).Q(R.raw.contact_check, 36, org.telegram.messenger.gd.a0(null, null, 2131742565, ((TLRPC.Chat) this.c).title)).k(true);
                break;
            case 11:
                fs0 fs0Var = (fs0) this.b;
                String str = (String) this.c;
                if (!fs0Var.w.w1[fs0Var.r].a.isEmpty() && ((i7 = fs0Var.r) == 1 || i7 == 4)) {
                    org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) i5.c.h(1, fs0Var.w.w1[i7].a);
                    int e12 = fjVar.e1();
                    long B0 = org.telegram.messenger.fj.B0(fjVar.k);
                    it0 it0Var2 = fs0Var.w;
                    fs0Var.F(e12, B0, it0Var2.m1 == it0Var2.y1.getUserConfig().e() ? fjVar.P1() : 0L, str);
                } else if (fs0Var.r == 3) {
                    it0 it0Var3 = fs0Var.w;
                    fs0Var.F(0, it0Var3.m1, it0Var3.G, str);
                }
                int i15 = fs0Var.r;
                if (i15 == 1 || i15 == 4) {
                    ArrayList arrayList5 = new ArrayList(fs0Var.w.w1[fs0Var.r].a);
                    fs0Var.s++;
                    Utilities.g.c(new as0((Object) fs0Var, (Serializable) str, arrayList5, i11));
                    break;
                }
                break;
            case 12:
                fs0 fs0Var2 = (fs0) this.b;
                ArrayList arrayList6 = (ArrayList) this.c;
                it0 it0Var4 = fs0Var2.w;
                boolean z10 = it0Var4.Y0;
                ds0[] ds0VarArr = it0Var4.n0;
                if (z10) {
                    fs0Var2.s--;
                    int b10 = fs0Var2.b();
                    fs0Var2.d = arrayList6;
                    int b11 = fs0Var2.b();
                    if (fs0Var2.s == 0 || b11 != 0) {
                        it0Var4.B1(false);
                    }
                    for (int i16 = 0; i16 < ds0VarArr.length; i16++) {
                        ds0 ds0Var2 = ds0VarArr[i16];
                        if (ds0Var2.F == fs0Var2.r) {
                            if (fs0Var2.s == 0 && b11 == 0) {
                                ds0Var2.w.d.setText(org.telegram.messenger.gd.N0(2131747974, "NoResult"));
                                ds0VarArr[i16].w.f.setVisibility(8);
                                ds0VarArr[i16].w.e(false, true);
                            } else if (b10 == 0) {
                                it0Var4.D(ds0Var2.h, 0, null);
                            }
                        }
                    }
                    fs0Var2.f();
                    break;
                }
                break;
            case 13:
                TLObject tLObject4 = (TLObject) this.b;
                TLRPC.Document document = (TLRPC.Document) this.c;
                org.telegram.messenger.ks f10 = org.telegram.messenger.ks.f(org.telegram.messenger.i10.t0);
                Boolean bool = Boolean.FALSE;
                f10.m(org.telegram.messenger.ks.u3, bool, tLObject4, document, null, bool);
                break;
            case 14:
                org.telegram.messenger.mp.u1(((vw0) this.b).a.a).t5((TLRPC.EmojiStatus) this.c, null);
                break;
            case 15:
                z11 z11Var = (z11) this.b;
                org.telegram.messenger.mp.u1(z11Var.e).t7.d((ArrayList) this.c, -z11Var.f);
                int i17 = z11.m0;
                break;
            case 16:
                z11 z11Var2 = (z11) this.b;
                TLRPC.Updates updates = (TLRPC.Updates) this.c;
                z11Var2.getClass();
                org.telegram.messenger.mp.u1(z11Var2.e).b3(0, updates.chats.get(0).id, true);
                break;
            case 17:
                org.telegram.ui.Cells.m1 m1Var = (org.telegram.ui.Cells.m1) this.b;
                TLRPC.TL_messages_transcribedAudio tL_messages_transcribedAudio = (TLRPC.TL_messages_transcribedAudio) this.c;
                if (m1Var != null) {
                    m1Var.m0(tL_messages_transcribedAudio.trial_remains_num > 0 ? 1 : 2);
                    break;
                }
                break;
            case 18:
                org.telegram.messenger.ks ksVar = (org.telegram.messenger.ks) this.b;
                f21 f21Var = (f21) this.c;
                ksVar.n(f21Var, org.telegram.messenger.ks.Y1);
                ksVar.n(f21Var, org.telegram.messenger.ks.Z1);
                break;
            case 19:
                a31 a31Var = (a31) this.b;
                TLObject tLObject5 = (TLObject) this.c;
                org.telegram.messenger.ut utVar = a31Var.t1;
                a31Var.m1 = null;
                if (tLObject5 instanceof TLRPC.TL_messages_translatedRichMessage) {
                    TLRPC.TL_messages_translatedRichMessage tL_messages_translatedRichMessage = (TLRPC.TL_messages_translatedRichMessage) tLObject5;
                    if (!tL_messages_translatedRichMessage.result.isEmpty() && tL_messages_translatedRichMessage.result.get(0) != null) {
                        a31Var.P1 = false;
                        TL_iv.RichMessage richMessage = tL_messages_translatedRichMessage.result.get(0);
                        if (utVar != null) {
                            utVar.set(richMessage);
                            a31Var.I1.D(utVar);
                            break;
                        }
                    }
                }
                if (a31Var.P1) {
                    a31Var.dismiss();
                    org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.S4, 1, org.telegram.messenger.gd.N0(2131743699, null));
                    break;
                } else {
                    org.telegram.messenger.f3.o(null, 2131743699, new kc((FrameLayout) a31Var.b, a31Var.J0), null);
                    w21 w21Var = a31Var.x1.e;
                    String str2 = a31Var.w1;
                    a31Var.v1 = str2;
                    w21Var.setText(a31.P0(str2, null, null));
                    break;
                }
                break;
            case 20:
                org.telegram.ui.ck ckVar = (org.telegram.ui.ck) this.b;
                ((org.telegram.ui.ActionBar.g1) this.c).d(true);
                r31.a(ckVar.getContext(), ckVar.d);
                break;
            case 21:
                ((org.telegram.messenger.y00) this.c).J(((org.telegram.ui.ck) this.b).b, false, false);
                break;
            case 22:
                UndoView undoView = (UndoView) this.b;
                TLObject tLObject6 = (TLObject) this.c;
                if (tLObject6 instanceof TLRPC.PaymentReceipt) {
                    undoView.s.presentFragment(new org.telegram.ui.kl0((TLRPC.PaymentReceipt) tLObject6));
                    break;
                } else {
                    int i18 = UndoView.j0;
                    undoView.getClass();
                    break;
                }
            case 23:
                ((n41) this.b).E.onClick((org.telegram.ui.Cells.q8) this.c);
                break;
            case 24:
                h61 h61Var = (h61) this.b;
                e2.v0 v0Var = (e2.v0) this.c;
                Throwable cause = v0Var.getCause();
                if (!(cause instanceof u2.n) || (!cause.toString().contains("av1") && !cause.toString().contains("av01"))) {
                    TextureView textureView = h61Var.n;
                    if (textureView == null || ((h61Var.F || !(cause instanceof u2.p)) && !(cause instanceof d3.u))) {
                        h61Var.K.onError(h61Var, v0Var);
                        break;
                    } else {
                        h61Var.F = true;
                        if (h61Var.d != null) {
                            ViewGroup viewGroup = (ViewGroup) textureView.getParent();
                            if (viewGroup != null) {
                                int indexOfChild = viewGroup.indexOfChild(h61Var.n);
                                viewGroup.removeView(h61Var.n);
                                viewGroup.addView(h61Var.n, indexOfChild);
                            }
                            org.telegram.messenger.r5 r5Var = h61Var.b;
                            if (r5Var != null) {
                                r5Var.postRunnable(new v51(h61Var, i11));
                                break;
                            } else {
                                l2.g0 g0Var = h61Var.d;
                                TextureView textureView2 = h61Var.n;
                                g0Var.F1();
                                if (textureView2 != null && textureView2 == g0Var.X) {
                                    g0Var.F1();
                                    g0Var.s1();
                                    g0Var.x1(null);
                                    g0Var.q1(0, 0);
                                }
                                h61Var.d.z1(h61Var.n);
                                ArrayList arrayList7 = h61Var.O;
                                if (arrayList7 != null) {
                                    h61Var.k0(arrayList7, h61Var.P);
                                } else if (h61Var.V) {
                                    h61Var.l0(h61Var.R, h61Var.T, h61Var.S, h61Var.U);
                                } else {
                                    h61Var.j0(h61Var.R, h61Var.T);
                                }
                                h61Var.h0();
                                break;
                            }
                        }
                    }
                } else {
                    org.telegram.messenger.a8.g(v0Var, true);
                    org.telegram.messenger.a8.d("av1 codec failed, we think this codec is not supported");
                    org.telegram.messenger.mp.g1().edit().putBoolean("unsupport_video/av01", true).commit();
                    HashMap hashMap = h61.m0;
                    if (hashMap != null) {
                        hashMap.clear();
                    }
                    ArrayList arrayList8 = h61Var.O;
                    if (arrayList8 != null) {
                        int i19 = 0;
                        while (i19 < arrayList8.size()) {
                            e61 e61Var = (e61) arrayList8.get(i19);
                            int i20 = 0;
                            while (true) {
                                ArrayList arrayList9 = e61Var.d;
                                if (i20 < arrayList9.size()) {
                                    g61 g61Var = (g61) arrayList9.get(i20);
                                    if (!TextUtils.isEmpty(g61Var.m) && !h61.D0(g61Var.m)) {
                                        arrayList9.remove(i20);
                                        i20--;
                                    }
                                    i20++;
                                } else {
                                    if (arrayList9.isEmpty()) {
                                        arrayList8.remove(i19);
                                        i19--;
                                    }
                                    i19++;
                                }
                            }
                        }
                        arrayList = arrayList8;
                    }
                    h61Var.O = arrayList;
                    if (arrayList != null) {
                        h61Var.k0(arrayList, h61Var.P);
                        break;
                    }
                }
                break;
            case 25:
                ((h61) ((oi.b6) this.b).f).L.w(true, (float[]) this.c);
                break;
            case 26:
                j61 j61Var = (j61) this.b;
                if (j61Var.b == ((hi.r7[]) this.c)[0]) {
                    if (org.telegram.messenger.mp.g1().getBoolean("asr_video_captions", false) && (a0Var = (r7Var = j61Var.b).f) != null && (DictationAsr.C((ai.q) a0Var.b) || DictationAsr.A((ai.q) r7Var.f.b))) {
                        j61Var.b();
                    }
                    j61Var.a.i();
                    break;
                }
                break;
            case 27:
                j61 j61Var2 = (j61) this.b;
                if (j61Var2.b == ((hi.r7) this.c) && j61Var2.d) {
                    j61Var2.d();
                    break;
                }
                break;
            case 28:
                p61 p61Var = (p61) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                if (bitmap != null) {
                    if (p61Var.x != null) {
                        Bitmap bitmap2 = p61Var.w;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        p61Var.w = p61Var.x;
                    }
                    p61Var.x = bitmap;
                    Bitmap bitmap3 = p61Var.x;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                    p61Var.H = bitmapShader;
                    bitmapShader.setLocalMatrix(p61Var.M);
                    p61Var.K.setShader(p61Var.H);
                    p61Var.invalidate();
                    int L = org.telegram.messenger.g0.L(150.0f);
                    float width = bitmap.getWidth() / bitmap.getHeight();
                    if (width > 1.0f) {
                        i10 = (int) (L / width);
                    } else {
                        L = (int) (L * width);
                        i10 = L;
                    }
                    ViewGroup.LayoutParams layoutParams = p61Var.getLayoutParams();
                    if (p61Var.getVisibility() != 0 || layoutParams.width != L || layoutParams.height != i10) {
                        layoutParams.width = L;
                        layoutParams.height = i10;
                        p61Var.setVisibility(0);
                        p61Var.requestLayout();
                    }
                }
                p61Var.f = null;
                break;
            default:
                final z71 z71Var = (z71) this.b;
                z71Var.e.b.evaluateJavascript((String) this.c, new ValueCallback() { // from class: org.telegram.ui.Components.y71
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(Object obj2) {
                        String str3 = (String) obj2;
                        z71 z71Var2 = z71.this;
                        String[] strArr = z71Var2.c;
                        strArr[0] = strArr[0].replace(z71Var2.d, "/signature/" + str3.substring(1, str3.length() - 1));
                        z71Var2.b.countDown();
                    }
                });
                break;
        }
    }

    public /* synthetic */ sh0(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }
}
