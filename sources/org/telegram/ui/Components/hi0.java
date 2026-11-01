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

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hi0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hi0(int i10, Object obj, Object obj2) {
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
        ArrayList arrayList = null;
        switch (this.a) {
            case 0:
                mi0 mi0Var = (mi0) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                ArrayList arrayList3 = mi0Var.r;
                mi0Var.n.addAll(arrayList2);
                int size = arrayList2.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj = arrayList2.get(i13);
                    i13++;
                    li0 li0Var = (li0) obj;
                    int i14 = 0;
                    while (true) {
                        if (i14 < arrayList3.size()) {
                            TLObject tLObject = ((li0) arrayList3.get(i14)).a;
                            long j10 = tLObject instanceof TLRPC.Chat ? -((TLRPC.Chat) tLObject).id : tLObject instanceof TLRPC.User ? ((TLRPC.User) tLObject).id : 0L;
                            TLObject tLObject2 = li0Var.a;
                            if (j10 != (tLObject2 instanceof TLRPC.Chat ? -((TLRPC.Chat) tLObject2).id : tLObject2 instanceof TLRPC.User ? ((TLRPC.User) tLObject2).id : 0L)) {
                                i14++;
                            } else if (li0Var.c > 0) {
                                ((li0) arrayList3.get(i14)).c = li0Var.c;
                            }
                        } else {
                            arrayList3.add(li0Var);
                        }
                    }
                }
                q0.a aVar = mi0Var.x;
                if (aVar != null) {
                    aVar.accept(arrayList2);
                }
                mi0Var.a();
                break;
            case 1:
                an0 an0Var = (an0) this.b;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) this.c;
                ArrayList arrayList4 = an0Var.K;
                if (!arrayList4.isEmpty() && (indexOf = arrayList4.indexOf(tL_sponsoredPeer)) >= 0 && (K = an0Var.K()) < an0Var.b()) {
                    arrayList4.remove(indexOf);
                    an0Var.s(K + 1 + indexOf);
                    int size2 = an0Var.j0.e.size();
                    int size3 = arrayList4.size();
                    if (an0Var.G0) {
                        size2 = Math.min(3, size2);
                    }
                    if (size3 + size2 <= 0) {
                        an0Var.s(K);
                        break;
                    }
                }
                break;
            case 2:
                an0 an0Var2 = (an0) this.b;
                org.telegram.ui.zx zxVar = (org.telegram.ui.zx) this.c;
                an0Var2.S();
                cc.a0(zxVar).c(org.telegram.messenger.dd.L0(2131754488, null)).j();
                break;
            case 3:
                ((mn0) this.b).sendAccessibilityEvent((View) this.c, 4);
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
                pp0 pp0Var = (pp0) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                if (tLObject3 != null) {
                    pp0Var.c2 = (TLRPC.TL_exportedMessageLink) tLObject3;
                    pp0Var.a1();
                    if (pp0Var.e2) {
                        pp0Var.M0();
                    }
                }
                pp0Var.d2 = false;
                break;
            case 7:
                au0 au0Var = (au0) this.b;
                th.y4 y4Var = (th.y4) this.c;
                ar0 ar0Var = au0Var.b0;
                if (ar0Var != null) {
                    int i15 = y4Var.a;
                    ar0Var.b.d(i15, ar0Var.d.i(i15));
                    break;
                }
                break;
            case 8:
                ts0 ts0Var = (ts0) this.b;
                org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) this.c;
                ts0Var.F = null;
                ts0Var.G = null;
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
                cc.a0(((ks0) this.b).f.x1).Q(R.raw.contact_check, 36, org.telegram.messenger.dd.a0(null, null, 2131742861, ((TLRPC.Chat) this.c).title)).k(true);
                break;
            case 11:
                vs0 vs0Var = (vs0) this.b;
                String str = (String) this.c;
                if (!vs0Var.w.v1[vs0Var.r].a.isEmpty() && ((i10 = vs0Var.r) == 1 || i10 == 4)) {
                    org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) i0.a.g(1, vs0Var.w.v1[i10].a);
                    int f12 = kjVar.f1();
                    long B0 = org.telegram.messenger.kj.B0(kjVar.k);
                    au0 au0Var2 = vs0Var.w;
                    vs0Var.F(f12, B0, au0Var2.l1 == au0Var2.x1.getUserConfig().e() ? kjVar.Q1() : 0L, str);
                } else if (vs0Var.r == 3) {
                    au0 au0Var3 = vs0Var.w;
                    vs0Var.F(0, au0Var3.l1, au0Var3.F, str);
                }
                int i16 = vs0Var.r;
                if (i16 == 1 || i16 == 4) {
                    ArrayList arrayList5 = new ArrayList(vs0Var.w.v1[vs0Var.r].a);
                    vs0Var.s++;
                    Utilities.g.c(new jg(vs0Var, str, arrayList5, 24));
                    break;
                }
                break;
            case 12:
                vs0 vs0Var2 = (vs0) this.b;
                ArrayList arrayList6 = (ArrayList) this.c;
                au0 au0Var4 = vs0Var2.w;
                boolean z10 = au0Var4.X0;
                ts0[] ts0VarArr = au0Var4.m0;
                if (z10) {
                    vs0Var2.s--;
                    int b10 = vs0Var2.b();
                    vs0Var2.d = arrayList6;
                    int b11 = vs0Var2.b();
                    if (vs0Var2.s == 0 || b11 != 0) {
                        au0Var4.x1(false);
                    }
                    for (int i17 = 0; i17 < ts0VarArr.length; i17++) {
                        ts0 ts0Var2 = ts0VarArr[i17];
                        if (ts0Var2.E == vs0Var2.r) {
                            if (vs0Var2.s == 0 && b11 == 0) {
                                ts0Var2.w.d.setText(org.telegram.messenger.dd.L0(2131748183, "NoResult"));
                                ts0VarArr[i17].w.f.setVisibility(8);
                                ts0VarArr[i17].w.e(false, true);
                            } else if (b10 == 0) {
                                au0Var4.C(ts0Var2.h, 0, null);
                            }
                        }
                    }
                    vs0Var2.f();
                    break;
                }
                break;
            case 13:
                TLObject tLObject4 = (TLObject) this.b;
                TLRPC.Document document = (TLRPC.Document) this.c;
                org.telegram.messenger.at f7 = org.telegram.messenger.at.f(org.telegram.messenger.e20.s0);
                Boolean bool = Boolean.FALSE;
                f7.m(org.telegram.messenger.at.s3, bool, tLObject4, document, null, bool);
                break;
            case 14:
                org.telegram.messenger.wp.r1(((px0) this.b).a.a).e5((TLRPC.EmojiStatus) this.c, null);
                break;
            case 15:
                u11 u11Var = (u11) this.b;
                String str2 = (String) this.c;
                u11Var.O = null;
                org.telegram.messenger.y00 y00Var = org.telegram.messenger.wp.r1(u11Var.a).r7;
                long j11 = -u11Var.b;
                vg vgVar = new vg(14, u11Var, str2);
                y00Var.getClass();
                TL_forum.TL_messages_getForumTopics tL_messages_getForumTopics = new TL_forum.TL_messages_getForumTopics();
                tL_messages_getForumTopics.peer = y00Var.getMessagesController().i1(-j11);
                tL_messages_getForumTopics.q = str2;
                tL_messages_getForumTopics.limit = 50;
                u11Var.N = y00Var.getConnectionsManager().sendRequest(tL_messages_getForumTopics, new org.telegram.messenger.rj(y00Var, j11, vgVar, 10));
                break;
            case 16:
                p21 p21Var = (p21) this.b;
                org.telegram.messenger.wp.r1(p21Var.e).r7.d((ArrayList) this.c, -p21Var.f);
                int i18 = p21.l0;
                break;
            case 17:
                p21 p21Var2 = (p21) this.b;
                TLRPC.Updates updates = (TLRPC.Updates) this.c;
                p21Var2.getClass();
                org.telegram.messenger.wp.r1(p21Var2.e).T2(0, updates.chats.get(0).id, true);
                break;
            case 18:
                org.telegram.ui.Cells.l1 l1Var = (org.telegram.ui.Cells.l1) this.b;
                TLRPC.TL_messages_transcribedAudio tL_messages_transcribedAudio = (TLRPC.TL_messages_transcribedAudio) this.c;
                if (l1Var != null) {
                    l1Var.c0(tL_messages_transcribedAudio.trial_remains_num > 0 ? 1 : 2);
                    break;
                }
                break;
            case 19:
                n31 n31Var = (n31) this.b;
                TLObject tLObject5 = (TLObject) this.c;
                org.telegram.messenger.mu muVar = n31Var.p1;
                n31Var.i1 = null;
                if (tLObject5 instanceof TLRPC.TL_messages_translatedRichMessage) {
                    TLRPC.TL_messages_translatedRichMessage tL_messages_translatedRichMessage = (TLRPC.TL_messages_translatedRichMessage) tLObject5;
                    if (!tL_messages_translatedRichMessage.result.isEmpty() && tL_messages_translatedRichMessage.result.get(0) != null) {
                        n31Var.L1 = false;
                        TL_iv.RichMessage richMessage = tL_messages_translatedRichMessage.result.get(0);
                        if (muVar != null) {
                            muVar.set(richMessage);
                            n31Var.E1.D(muVar);
                            break;
                        }
                    }
                }
                if (n31Var.L1) {
                    n31Var.dismiss();
                    org.telegram.messenger.at.e().k(org.telegram.messenger.at.P4, 1, org.telegram.messenger.dd.L0(2131743971, null));
                    break;
                } else {
                    org.telegram.messenger.m5.o(null, 2131743971, new cc((FrameLayout) n31Var.b, n31Var.I0), null);
                    j31 j31Var = n31Var.t1.e;
                    String str3 = n31Var.s1;
                    n31Var.r1 = str3;
                    j31Var.setText(n31.O0(str3, null, null));
                    break;
                }
                break;
            case 20:
                org.telegram.ui.xk xkVar = (org.telegram.ui.xk) this.b;
                ((org.telegram.ui.ActionBar.k1) this.c).d(true);
                e41.a(xkVar.getContext(), xkVar.d);
                break;
            case 21:
                ((org.telegram.messenger.u10) this.c).J(((org.telegram.ui.xk) this.b).b, false, false);
                break;
            case 22:
                UndoView undoView = (UndoView) this.b;
                TLObject tLObject6 = (TLObject) this.c;
                if (tLObject6 instanceof TLRPC.PaymentReceipt) {
                    undoView.s.presentFragment(new org.telegram.ui.qm0((TLRPC.PaymentReceipt) tLObject6));
                    break;
                } else {
                    int i19 = UndoView.i0;
                    undoView.getClass();
                    break;
                }
            case 23:
                ((b51) this.b).D.onClick((org.telegram.ui.Cells.s8) this.c);
                break;
            case 24:
                v61 v61Var = (v61) this.b;
                b2.y0 y0Var = (b2.y0) this.c;
                Throwable cause = y0Var.getCause();
                if (!(cause instanceof r2.n) || (!cause.toString().contains("av1") && !cause.toString().contains("av01"))) {
                    TextureView textureView = v61Var.n;
                    if (textureView == null || ((v61Var.E || !(cause instanceof r2.p)) && !(cause instanceof a3.x))) {
                        v61Var.J.onError(v61Var, y0Var);
                        break;
                    } else {
                        v61Var.E = true;
                        if (v61Var.d != null) {
                            ViewGroup viewGroup = (ViewGroup) textureView.getParent();
                            if (viewGroup != null) {
                                int indexOfChild = viewGroup.indexOfChild(v61Var.n);
                                viewGroup.removeView(v61Var.n);
                                viewGroup.addView(v61Var.n, indexOfChild);
                            }
                            org.telegram.messenger.s5 s5Var = v61Var.b;
                            if (s5Var != null) {
                                s5Var.postRunnable(new k51(v61Var, i12));
                                break;
                            } else {
                                i2.i0 i0Var = v61Var.d;
                                TextureView textureView2 = v61Var.n;
                                i0Var.F1();
                                if (textureView2 != null && textureView2 == i0Var.X) {
                                    i0Var.F1();
                                    i0Var.s1();
                                    i0Var.x1(null);
                                    i0Var.q1(0, 0);
                                }
                                v61Var.d.z1(v61Var.n);
                                ArrayList arrayList7 = v61Var.N;
                                if (arrayList7 != null) {
                                    v61Var.k0(arrayList7, v61Var.O);
                                } else if (v61Var.U) {
                                    v61Var.l0(v61Var.Q, v61Var.S, v61Var.R, v61Var.T);
                                } else {
                                    v61Var.j0(v61Var.Q, v61Var.S);
                                }
                                v61Var.h0();
                                break;
                            }
                        }
                    }
                } else {
                    org.telegram.messenger.f8.g(y0Var, true);
                    org.telegram.messenger.f8.d("av1 codec failed, we think this codec is not supported");
                    org.telegram.messenger.wp.d1().edit().putBoolean("unsupport_video/av01", true).commit();
                    HashMap hashMap = v61.l0;
                    if (hashMap != null) {
                        hashMap.clear();
                    }
                    ArrayList arrayList8 = v61Var.N;
                    if (arrayList8 != null) {
                        int i20 = 0;
                        while (i20 < arrayList8.size()) {
                            s61 s61Var = (s61) arrayList8.get(i20);
                            int i21 = 0;
                            while (true) {
                                ArrayList arrayList9 = s61Var.d;
                                if (i21 < arrayList9.size()) {
                                    u61 u61Var = (u61) arrayList9.get(i21);
                                    if (!TextUtils.isEmpty(u61Var.m) && !v61.D0(u61Var.m)) {
                                        arrayList9.remove(i21);
                                        i21--;
                                    }
                                    i21++;
                                } else {
                                    if (arrayList9.isEmpty()) {
                                        arrayList8.remove(i20);
                                        i20--;
                                    }
                                    i20++;
                                }
                            }
                        }
                        arrayList = arrayList8;
                    }
                    v61Var.N = arrayList;
                    if (arrayList != null) {
                        v61Var.k0(arrayList, v61Var.O);
                        break;
                    }
                }
                break;
            case 25:
                ((v61) ((bi.r6) this.b).f).K.B(true, (float[]) this.c);
                break;
            case 26:
                c71 c71Var = (c71) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                if (bitmap != null) {
                    if (c71Var.x != null) {
                        Bitmap bitmap2 = c71Var.w;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        c71Var.w = c71Var.x;
                    }
                    c71Var.x = bitmap;
                    Bitmap bitmap3 = c71Var.x;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                    c71Var.G = bitmapShader;
                    bitmapShader.setLocalMatrix(c71Var.L);
                    c71Var.J.setShader(c71Var.G);
                    c71Var.invalidate();
                    int L = org.telegram.messenger.i0.L(150.0f);
                    float width = bitmap.getWidth() / bitmap.getHeight();
                    if (width > 1.0f) {
                        i11 = (int) (L / width);
                    } else {
                        L = (int) (L * width);
                        i11 = L;
                    }
                    ViewGroup.LayoutParams layoutParams = c71Var.getLayoutParams();
                    if (c71Var.getVisibility() != 0 || layoutParams.width != L || layoutParams.height != i11) {
                        layoutParams.width = L;
                        layoutParams.height = i11;
                        c71Var.setVisibility(0);
                        c71Var.requestLayout();
                    }
                }
                c71Var.f = null;
                break;
            case 27:
                final m81 m81Var = (m81) this.b;
                m81Var.e.b.evaluateJavascript((String) this.c, new ValueCallback() { // from class: org.telegram.ui.Components.l81
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(Object obj2) {
                        String str4 = (String) obj2;
                        m81 m81Var2 = m81.this;
                        String[] strArr = m81Var2.c;
                        strArr[0] = strArr[0].replace(m81Var2.d, "/signature/" + str4.substring(1, str4.length() - 1));
                        m81Var2.b.countDown();
                    }
                });
                break;
            case 28:
                ((org.telegram.ui.Components.voip.j) this.b).a.setOnClickListener((View.OnClickListener) this.c);
                break;
            default:
                org.telegram.ui.Components.voip.r rVar = (org.telegram.ui.Components.voip.r) this.b;
                Bitmap bitmap4 = (Bitmap) this.c;
                HashMap hashMap2 = rVar.F.h;
                org.telegram.messenger.v3 v3Var = rVar.x;
                boolean z11 = v3Var.b;
                TLRPC.GroupCallParticipant groupCallParticipant = v3Var.a;
                hashMap2.put(z11 ? groupCallParticipant.presentationEndpoint : groupCallParticipant.videoEndpoint, bitmap4);
                break;
        }
    }

    public /* synthetic */ hi0(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }
}
