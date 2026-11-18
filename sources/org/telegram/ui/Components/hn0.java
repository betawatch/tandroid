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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class hn0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hn0(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7;
        int i10;
        ArrayList arrayList;
        ck0 ck0Var;
        int i11 = 4;
        int i12 = 29;
        ArrayList arrayList2 = null;
        int i13 = 0;
        int i14 = 1;
        switch (this.a) {
            case 0:
                xe xeVar = (xe) this.b;
                org.telegram.ui.bn bnVar = (org.telegram.ui.bn) this.c;
                if (bnVar != null) {
                    bnVar.presentFragment(new PremiumPreviewFragment(0, "select_sender"));
                    xeVar.dismiss();
                    break;
                }
                break;
            case 1:
                ((WindowManager) this.c).removeView(((xe) this.b).B);
                break;
            case 2:
                yo0 yo0Var = (yo0) this.b;
                TLObject tLObject = (TLObject) this.c;
                if (tLObject != null) {
                    yo0Var.g2 = (TLRPC.TL_exportedMessageLink) tLObject;
                    yo0Var.b1();
                    if (yo0Var.i2) {
                        yo0Var.N0();
                    }
                }
                yo0Var.h2 = false;
                break;
            case 3:
                gt0 gt0Var = (gt0) this.b;
                fi.i6 i6Var = (fi.i6) this.c;
                hq0 hq0Var = gt0Var.c0;
                if (hq0Var != null) {
                    int i15 = i6Var.a;
                    hq0Var.b.e(i15, hq0Var.d.i(i15));
                    break;
                }
                break;
            case 4:
                bs0 bs0Var = (bs0) this.b;
                bi.p2 p2Var = (bi.p2) this.c;
                bs0Var.G = null;
                bs0Var.H = null;
                p2Var.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(220L).setListener(new q60(p2Var, 20)).start();
                break;
            case 5:
                di.o8 o8Var = (di.o8) this.b;
                Runnable[] runnableArr = (Runnable[]) this.c;
                o8Var.e = !o8Var.e;
                runnableArr[0].run();
                o8Var.k(true);
                break;
            case 6:
                lc.b0(((sr0) this.b).f.y1).Q(R.raw.contact_check, 36, org.telegram.messenger.gd.a0(null, null, 2131742578, ((TLRPC.Chat) this.c).title)).k(true);
                break;
            case 7:
                ds0 ds0Var = (ds0) this.b;
                String str = (String) this.c;
                if (!ds0Var.w.w1[ds0Var.r].a.isEmpty() && ((i7 = ds0Var.r) == 1 || i7 == 4)) {
                    org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) i5.c.h(1, ds0Var.w.w1[i7].a);
                    int e12 = fjVar.e1();
                    long B0 = org.telegram.messenger.fj.B0(fjVar.k);
                    gt0 gt0Var2 = ds0Var.w;
                    ds0Var.F(e12, B0, gt0Var2.m1 == gt0Var2.y1.getUserConfig().e() ? fjVar.P1() : 0L, str);
                    ds0Var = ds0Var;
                } else if (ds0Var.r == 3) {
                    gt0 gt0Var3 = ds0Var.w;
                    ds0Var.F(0, gt0Var3.m1, gt0Var3.G, str);
                }
                int i16 = ds0Var.r;
                if (i16 == 1 || i16 == 4) {
                    ArrayList arrayList3 = new ArrayList(ds0Var.w.w1[ds0Var.r].a);
                    ds0Var.s++;
                    Utilities.g.c(new k7(ds0Var, str, arrayList3, 29));
                    break;
                }
                break;
            case 8:
                ds0 ds0Var2 = (ds0) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                gt0 gt0Var4 = ds0Var2.w;
                boolean z10 = gt0Var4.Y0;
                bs0[] bs0VarArr = gt0Var4.n0;
                if (z10) {
                    ds0Var2.s--;
                    int b10 = ds0Var2.b();
                    ds0Var2.d = arrayList4;
                    int b11 = ds0Var2.b();
                    if (ds0Var2.s == 0 || b11 != 0) {
                        gt0Var4.B1(false);
                    }
                    for (int i17 = 0; i17 < bs0VarArr.length; i17++) {
                        bs0 bs0Var2 = bs0VarArr[i17];
                        if (bs0Var2.F == ds0Var2.r) {
                            if (ds0Var2.s == 0 && b11 == 0) {
                                bs0Var2.w.d.setText(org.telegram.messenger.gd.M0(2131747975, "NoResult"));
                                bs0VarArr[i17].w.f.setVisibility(8);
                                bs0VarArr[i17].w.e(false, true);
                            } else if (b10 == 0) {
                                gt0Var4.D(bs0Var2.h, 0, null);
                            }
                        }
                    }
                    ds0Var2.f();
                    break;
                }
                break;
            case 9:
                TLObject tLObject2 = (TLObject) this.b;
                TLRPC.Document document = (TLRPC.Document) this.c;
                org.telegram.messenger.ks f10 = org.telegram.messenger.ks.f(org.telegram.messenger.j10.t0);
                Boolean bool = Boolean.FALSE;
                f10.m(org.telegram.messenger.ks.u3, bool, tLObject2, document, null, bool);
                break;
            case 10:
                org.telegram.messenger.mp.u1(((uw0) this.b).a.a).t5((TLRPC.EmojiStatus) this.c, null);
                break;
            case 11:
                z11 z11Var = (z11) this.b;
                org.telegram.messenger.mp.u1(z11Var.e).t7.d((ArrayList) this.c, -z11Var.f);
                int i18 = z11.m0;
                break;
            case 12:
                z11 z11Var2 = (z11) this.b;
                TLRPC.Updates updates = (TLRPC.Updates) this.c;
                z11Var2.getClass();
                org.telegram.messenger.mp.u1(z11Var2.e).b3(0, updates.chats.get(0).id, true);
                break;
            case 13:
                org.telegram.messenger.ks ksVar = (org.telegram.messenger.ks) this.b;
                e21 e21Var = (e21) this.c;
                ksVar.n(e21Var, org.telegram.messenger.ks.Y1);
                ksVar.n(e21Var, org.telegram.messenger.ks.Z1);
                break;
            case 14:
                org.telegram.ui.Cells.m1 m1Var = (org.telegram.ui.Cells.m1) this.b;
                TLRPC.TL_messages_transcribedAudio tL_messages_transcribedAudio = (TLRPC.TL_messages_transcribedAudio) this.c;
                if (m1Var != null) {
                    m1Var.h0(tL_messages_transcribedAudio.trial_remains_num > 0 ? 1 : 2);
                    break;
                }
                break;
            case 15:
                y21 y21Var = (y21) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                org.telegram.messenger.ut utVar = y21Var.t1;
                y21Var.m1 = null;
                if (tLObject3 instanceof TLRPC.TL_messages_translatedRichMessage) {
                    TLRPC.TL_messages_translatedRichMessage tL_messages_translatedRichMessage = (TLRPC.TL_messages_translatedRichMessage) tLObject3;
                    if (!tL_messages_translatedRichMessage.result.isEmpty() && tL_messages_translatedRichMessage.result.get(0) != null) {
                        y21Var.P1 = false;
                        TL_iv.RichMessage richMessage = tL_messages_translatedRichMessage.result.get(0);
                        if (utVar != null) {
                            utVar.set(richMessage);
                            y21Var.I1.D(utVar);
                            break;
                        }
                    }
                }
                if (y21Var.P1) {
                    y21Var.dismiss();
                    org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.S4, 1, org.telegram.messenger.gd.M0(2131743709, null));
                    break;
                } else {
                    org.telegram.messenger.f3.o(null, 2131743709, new lc((FrameLayout) y21Var.b, y21Var.J0), null);
                    u21 u21Var = y21Var.x1.e;
                    String str2 = y21Var.w1;
                    y21Var.v1 = str2;
                    u21Var.setText(y21.P0(str2, null, null));
                    break;
                }
                break;
            case 16:
                org.telegram.ui.ck ckVar = (org.telegram.ui.ck) this.b;
                ((org.telegram.ui.ActionBar.h1) this.c).d(true);
                p31.a(ckVar.getContext(), ckVar.d);
                break;
            case 17:
                ((org.telegram.messenger.z00) this.c).J(((org.telegram.ui.ck) this.b).b, false, false);
                break;
            case 18:
                UndoView undoView = (UndoView) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                if (tLObject4 instanceof TLRPC.PaymentReceipt) {
                    undoView.s.presentFragment(new org.telegram.ui.ml0((TLRPC.PaymentReceipt) tLObject4));
                    break;
                } else {
                    int i19 = UndoView.j0;
                    undoView.getClass();
                    break;
                }
            case 19:
                ((l41) this.b).E.onClick((org.telegram.ui.Cells.r8) this.c);
                break;
            case 20:
                f61 f61Var = (f61) this.b;
                e2.v0 v0Var = (e2.v0) this.c;
                Throwable cause = v0Var.getCause();
                if (!(cause instanceof u2.n) || (!cause.toString().contains("av1") && !cause.toString().contains("av01"))) {
                    TextureView textureView = f61Var.n;
                    if (textureView == null || ((f61Var.F || !(cause instanceof u2.p)) && !(cause instanceof d3.u))) {
                        f61Var.K.onError(f61Var, v0Var);
                        break;
                    } else {
                        f61Var.F = true;
                        if (f61Var.d != null) {
                            ViewGroup viewGroup = (ViewGroup) textureView.getParent();
                            if (viewGroup != null) {
                                int indexOfChild = viewGroup.indexOfChild(f61Var.n);
                                viewGroup.removeView(f61Var.n);
                                viewGroup.addView(f61Var.n, indexOfChild);
                            }
                            org.telegram.messenger.r5 r5Var = f61Var.b;
                            if (r5Var != null) {
                                r5Var.postRunnable(new t51(f61Var, i14));
                                break;
                            } else {
                                l2.f0 f0Var = f61Var.d;
                                TextureView textureView2 = f61Var.n;
                                f0Var.F1();
                                if (textureView2 != null && textureView2 == f0Var.X) {
                                    f0Var.F1();
                                    f0Var.s1();
                                    f0Var.x1(null);
                                    f0Var.q1(0, 0);
                                }
                                f61Var.d.z1(f61Var.n);
                                ArrayList arrayList5 = f61Var.O;
                                if (arrayList5 != null) {
                                    f61Var.k0(arrayList5, f61Var.P);
                                } else if (f61Var.V) {
                                    f61Var.l0(f61Var.R, f61Var.T, f61Var.S, f61Var.U);
                                } else {
                                    f61Var.j0(f61Var.R, f61Var.T);
                                }
                                f61Var.h0();
                                break;
                            }
                        }
                    }
                } else {
                    org.telegram.messenger.a8.g(v0Var, true);
                    org.telegram.messenger.a8.d("av1 codec failed, we think this codec is not supported");
                    org.telegram.messenger.mp.g1().edit().putBoolean("unsupport_video/av01", true).commit();
                    HashMap hashMap = f61.m0;
                    if (hashMap != null) {
                        hashMap.clear();
                    }
                    ArrayList arrayList6 = f61Var.O;
                    if (arrayList6 != null) {
                        int i20 = 0;
                        while (i20 < arrayList6.size()) {
                            c61 c61Var = (c61) arrayList6.get(i20);
                            int i21 = 0;
                            while (true) {
                                ArrayList arrayList7 = c61Var.d;
                                if (i21 < arrayList7.size()) {
                                    e61 e61Var = (e61) arrayList7.get(i21);
                                    if (!TextUtils.isEmpty(e61Var.m) && !f61.D0(e61Var.m)) {
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
                    f61Var.O = arrayList2;
                    if (arrayList2 != null) {
                        f61Var.k0(arrayList2, f61Var.P);
                        break;
                    }
                }
                break;
            case 21:
                ((f61) ((oi.a6) this.b).f).L.x(true, (float[]) this.c);
                break;
            case 22:
                l61 l61Var = (l61) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                if (bitmap != null) {
                    if (l61Var.x != null) {
                        Bitmap bitmap2 = l61Var.w;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        l61Var.w = l61Var.x;
                    }
                    l61Var.x = bitmap;
                    Bitmap bitmap3 = l61Var.x;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                    l61Var.H = bitmapShader;
                    bitmapShader.setLocalMatrix(l61Var.M);
                    l61Var.K.setShader(l61Var.H);
                    l61Var.invalidate();
                    int L = org.telegram.messenger.g0.L(150.0f);
                    float width = bitmap.getWidth() / bitmap.getHeight();
                    if (width > 1.0f) {
                        i10 = (int) (L / width);
                    } else {
                        L = (int) (L * width);
                        i10 = L;
                    }
                    ViewGroup.LayoutParams layoutParams = l61Var.getLayoutParams();
                    if (l61Var.getVisibility() != 0 || layoutParams.width != L || layoutParams.height != i10) {
                        layoutParams.width = L;
                        layoutParams.height = i10;
                        l61Var.setVisibility(0);
                        l61Var.requestLayout();
                    }
                }
                l61Var.f = null;
                break;
            case 23:
                final v71 v71Var = (v71) this.b;
                v71Var.e.b.evaluateJavascript((String) this.c, new ValueCallback() { // from class: org.telegram.ui.Components.u71
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(Object obj) {
                        String str3 = (String) obj;
                        v71 v71Var2 = v71.this;
                        String[] strArr = v71Var2.c;
                        strArr[0] = strArr[0].replace(v71Var2.d, "/signature/" + str3.substring(1, str3.length() - 1));
                        v71Var2.b.countDown();
                    }
                });
                break;
            case 24:
                ((org.telegram.ui.Components.voip.q) this.b).a.setOnClickListener((View.OnClickListener) this.c);
                break;
            case 25:
                org.telegram.ui.Components.voip.y yVar = (org.telegram.ui.Components.voip.y) this.b;
                Bitmap bitmap4 = (Bitmap) this.c;
                HashMap hashMap2 = yVar.G.h;
                org.telegram.messenger.u3 u3Var = yVar.x;
                boolean z11 = u3Var.b;
                TLRPC.GroupCallParticipant groupCallParticipant = u3Var.a;
                hashMap2.put(z11 ? groupCallParticipant.presentationEndpoint : groupCallParticipant.videoEndpoint, bitmap4);
                break;
            case 26:
                org.telegram.ui.Components.voip.k0 k0Var = (org.telegram.ui.Components.voip.k0) this.b;
                org.telegram.ui.Components.voip.y yVar2 = (org.telegram.ui.Components.voip.y) this.c;
                k0Var.getClass();
                yVar2.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setListener(new org.telegram.ui.Components.voip.w(yVar2, i11)).setDuration(150L).start();
                break;
            case 27:
                ck0 ck0Var2 = (ck0) this.b;
                Object obj = this.c;
                if (ck0Var2 != null) {
                    ck0Var2.setOnItemClickListener((oj0) obj);
                    break;
                }
                break;
            case 28:
                ck ckVar2 = (ck) this.b;
                String lowerCase = ((String) this.c).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    org.telegram.messenger.g0.g3(new hn0(i12, ckVar2, new ArrayList()));
                    break;
                } else {
                    String M3 = org.telegram.messenger.g0.M3(lowerCase);
                    ArrayList arrayList8 = new ArrayList();
                    ArrayList arrayList9 = ckVar2.f;
                    int size = arrayList9.size();
                    while (i13 < size) {
                        Object obj2 = arrayList9.get(i13);
                        i13++;
                        org.telegram.ui.ps psVar = (org.telegram.ui.ps) obj2;
                        String str3 = psVar.a;
                        if (str3 == null) {
                            str3 = "";
                        }
                        String lowerCase2 = str3.toLowerCase();
                        String lowerCase3 = org.telegram.messenger.g0.M3(psVar.a).toLowerCase();
                        String str4 = psVar.b;
                        if (str4 == null) {
                            str4 = "";
                        }
                        String lowerCase4 = str4.toLowerCase();
                        String lowerCase5 = org.telegram.messenger.g0.M3(psVar.b).toLowerCase();
                        String str5 = psVar.c;
                        if (str5 == null) {
                            str5 = "";
                        }
                        String concat = TextUtils.isEmpty(str5) ? "" : "+".concat(str5);
                        if (lowerCase2.startsWith(lowerCase)) {
                            arrayList = arrayList9;
                        } else {
                            arrayList = arrayList9;
                            if (!lowerCase2.contains(" ".concat(lowerCase)) && !lowerCase3.startsWith(M3) && !lowerCase3.contains(" ".concat(M3)) && !lowerCase4.startsWith(lowerCase) && !lowerCase4.contains(" ".concat(lowerCase)) && !lowerCase5.startsWith(M3) && !lowerCase5.contains(" ".concat(M3)) && !str5.startsWith(lowerCase) && !concat.startsWith(lowerCase)) {
                                arrayList9 = arrayList;
                            }
                        }
                        arrayList8.add(psVar);
                        arrayList9 = arrayList;
                    }
                    org.telegram.messenger.g0.g3(new hn0(29, ckVar2, arrayList8));
                    break;
                }
                break;
            default:
                ck ckVar3 = (ck) this.b;
                ArrayList arrayList10 = (ArrayList) this.c;
                org.telegram.ui.ts tsVar = (org.telegram.ui.ts) ckVar3.n;
                if (tsVar.f) {
                    ckVar3.e = arrayList10;
                    if (tsVar.e && (ck0Var = tsVar.a) != null) {
                        v4.i0 adapter = ck0Var.getAdapter();
                        ck ckVar4 = tsVar.d;
                        if (adapter != ckVar4) {
                            tsVar.a.setAdapter(ckVar4);
                            tsVar.a.setFastScrollVisible(false);
                        }
                    }
                    ckVar3.f();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ hn0(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }
}
