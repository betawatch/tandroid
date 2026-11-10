package org.telegram.ui.Components;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yk0 implements bj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ FrameLayout c;

    public /* synthetic */ yk0(FrameLayout frameLayout, int i7, int i10) {
        this.a = i10;
        this.c = frameLayout;
        this.b = i7;
    }

    @Override // org.telegram.ui.Components.bj0
    public final void c(int i7, View view) {
        long j3;
        TLRPC.Chat chat;
        org.telegram.ui.im0 im0Var;
        org.telegram.ui.em0 em0Var;
        int i10;
        int i11;
        ch.o0 o0Var;
        TLRPC.Document document;
        switch (this.a) {
            case 0:
                dl0 dl0Var = (dl0) this.c;
                org.telegram.ui.ActionBar.f2 f2Var = dl0Var.G;
                bi.k5 k5Var = dl0Var.c;
                org.telegram.messenger.ij E = k5Var.E(i7);
                if (E != null) {
                    if (!dl0Var.I.i()) {
                        if (view instanceof al0) {
                            org.telegram.ui.Cells.h7 h7Var = ((al0) view).a;
                            org.telegram.messenger.ij message = h7Var.getMessage();
                            TLRPC.Document F0 = message.F0();
                            if (h7Var.G) {
                                if (message.h4() || org.telegram.messenger.ij.R4(message.k)) {
                                    MediaController.B().S(message);
                                    break;
                                } else {
                                    boolean x10 = message.x();
                                    if (!x10) {
                                        TLRPC.Message message2 = message.k;
                                        boolean z9 = message2 != null && message2.noforwards;
                                        if (E.k.peer_id.channel_id != 0) {
                                            j3 = 0;
                                            chat = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).M0(Long.valueOf(E.k.peer_id.channel_id));
                                        } else {
                                            j3 = 0;
                                            chat = null;
                                        }
                                        if (chat == null) {
                                            chat = E.k.peer_id.chat_id != j3 ? org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).M0(Long.valueOf(E.k.peer_id.chat_id)) : null;
                                        }
                                        if (chat != null) {
                                            z9 = chat.noforwards;
                                        }
                                        x10 = x10 || z9;
                                    }
                                    if (x10) {
                                        PhotoViewer.p1().H2(null, f2Var, null);
                                        ArrayList arrayList = new ArrayList();
                                        arrayList.add(message);
                                        PhotoViewer.p1().H2(null, f2Var, null);
                                        PhotoViewer.p1().Z1(arrayList, 0, 0L, 0L, 0L, new org.telegram.ui.qq0());
                                        break;
                                    } else {
                                        org.telegram.messenger.g0.s2(message, dl0Var.F, f2Var);
                                    }
                                }
                            } else if (h7Var.F) {
                                org.telegram.messenger.w7.G(org.telegram.messenger.c.a(org.telegram.messenger.p10.s0).a).f(F0);
                                h7Var.f(true);
                            } else {
                                E.P = true;
                                org.telegram.messenger.w7.G(org.telegram.messenger.c.a(org.telegram.messenger.p10.s0).a).W(F0, E, 0, 0);
                                h7Var.f(true);
                                org.telegram.messenger.z5.q(this.b).y();
                            }
                            dl0Var.d(true);
                        }
                        if (view instanceof org.telegram.ui.Cells.g7) {
                            ((org.telegram.ui.Cells.g7) view).a();
                            break;
                        }
                    } else {
                        dl0Var.I.h(E, view, 0);
                        org.telegram.ui.uz uzVar = dl0Var.J;
                        int e12 = E.e1();
                        uzVar.a = org.telegram.messenger.ij.B0(E.k);
                        uzVar.b = e12;
                        k5Var.g(i7);
                        if (!dl0Var.I.i()) {
                            k5Var.k(0, ((dl0) k5Var.d).r);
                            break;
                        }
                    }
                }
                break;
            case 1:
                org.telegram.ui.em0 em0Var2 = (org.telegram.ui.em0) this.c;
                org.telegram.ui.km0 km0Var = em0Var2.p0;
                ArrayList arrayList2 = em0Var2.l0;
                if (!(view instanceof org.telegram.ui.dm0)) {
                    int i12 = em0Var2.V;
                    int i13 = this.b;
                    if (i7 != i12) {
                        int i14 = em0Var2.b0;
                        if (i7 >= i14 && i7 < em0Var2.c0) {
                            int i15 = i7 - i14;
                            if (em0Var2.K != null) {
                                if (em0Var2.J != null && i15 >= 0 && i15 < arrayList2.size()) {
                                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList2.get(i15);
                                    if (i13 == 1) {
                                        TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                                        if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                                            em0Var2.n = 0L;
                                            em0Var2.h = -1;
                                            em0Var2.r = null;
                                            em0Var2.s = (TLRPC.TL_peerColorCollectible) peerColor;
                                        }
                                    } else {
                                        em0Var2.n = 0L;
                                        em0Var2.h = -1;
                                        em0Var2.r = org.telegram.messenger.qp.q0(tL_starGiftUnique);
                                        em0Var2.s = null;
                                    }
                                    em0Var2.I = tL_starGiftUnique;
                                    em0Var2.j(true);
                                    em0Var2.i();
                                    em0Var2.f(true);
                                    org.telegram.ui.dm0 dm0Var = em0Var2.D;
                                    if (dm0Var != null) {
                                        dm0Var.b(true);
                                        break;
                                    }
                                }
                            } else if (i15 >= 0 && i15 < arrayList2.size()) {
                                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList2.get(i15);
                                if (i13 == 1) {
                                    TLRPC.PeerColor peerColor2 = tL_starGiftUnique2.peer_color;
                                    if (peerColor2 instanceof TLRPC.TL_peerColorCollectible) {
                                        em0Var2.n = 0L;
                                        em0Var2.h = -1;
                                        em0Var2.I = null;
                                        em0Var2.r = null;
                                        em0Var2.s = (TLRPC.TL_peerColorCollectible) peerColor2;
                                    }
                                } else {
                                    em0Var2.n = 0L;
                                    em0Var2.h = -1;
                                    em0Var2.I = null;
                                    em0Var2.r = org.telegram.messenger.qp.q0(tL_starGiftUnique2);
                                    em0Var2.s = null;
                                }
                                em0Var2.j(true);
                                em0Var2.i();
                                em0Var2.f(true);
                                org.telegram.ui.dm0 dm0Var2 = em0Var2.D;
                                if (dm0Var2 != null) {
                                    dm0Var2.b(true);
                                    break;
                                }
                            }
                        }
                    } else {
                        em0Var2.h = -1;
                        em0Var2.n = 0L;
                        em0Var2.r = null;
                        em0Var2.s = null;
                        em0Var2.I = null;
                        em0Var2.i();
                        if (i13 == 0) {
                            km0Var.h.i();
                        }
                        org.telegram.ui.dm0 dm0Var3 = em0Var2.D;
                        if (dm0Var3 != null) {
                            dm0Var3.b(true);
                        }
                        em0Var2.j(true);
                        em0Var2.f(true);
                        org.telegram.ui.em0 em0Var3 = km0Var.n;
                        if (em0Var3 != null && (im0Var = em0Var3.a) != null && (em0Var = km0Var.h) != null) {
                            im0Var.a(em0Var.h);
                            break;
                        }
                    }
                } else {
                    org.telegram.ui.dm0 dm0Var4 = (org.telegram.ui.dm0) view;
                    int i16 = em0Var2.m0;
                    if (em0Var2.o0 == null) {
                        f5 f5Var = dm0Var4.c;
                        org.telegram.ui.k11[] k11VarArr = new org.telegram.ui.k11[1];
                        float L = org.telegram.messenger.g0.L(330.0f);
                        Point point = org.telegram.messenger.g0.q;
                        int min = (int) Math.min(L, point.y * 0.75f);
                        int min2 = (int) Math.min(org.telegram.messenger.g0.L(324.0f), point.x * 0.95f);
                        if (f5Var != null) {
                            f5Var.f();
                            dm0Var4.c();
                            Rect rect = org.telegram.messenger.g0.Q;
                            rect.set(f5Var.getBounds());
                            int L2 = i16 == 1 ? (org.telegram.messenger.g0.L(12.0f) + (-rect.centerY())) - min : (-(dm0Var4.getHeight() - rect.centerY())) - org.telegram.messenger.g0.L(16.0f);
                            i11 = org.telegram.messenger.g0.L(12.0f) + (rect.centerX() - (point.x - min2));
                            i10 = L2;
                        } else {
                            i10 = 0;
                            i11 = 0;
                        }
                        org.telegram.ui.am0 am0Var = new org.telegram.ui.am0(em0Var2, km0Var, em0Var2.getContext(), Integer.valueOf(i11), i16 == 1 ? 5 : 7, km0Var.getResourceProvider(), i16 == 1 ? 24 : 16, dm0Var4.a(), dm0Var4, k11VarArr);
                        am0Var.g1 = true;
                        long j10 = em0Var2.n;
                        am0Var.setSelected(j10 == 0 ? null : Long.valueOf(j10));
                        am0Var.setSaveState(3);
                        am0Var.y(f5Var, dm0Var4);
                        org.telegram.ui.bm0 bm0Var = new org.telegram.ui.bm0(em0Var2, am0Var);
                        em0Var2.o0 = bm0Var;
                        k11VarArr[0] = bm0Var;
                        bm0Var.showAsDropDown(dm0Var4, 0, i10, (org.telegram.messenger.id.a0 ? 3 : 5) | 48);
                        k11VarArr[0].b();
                    }
                    break;
                }
                break;
            default:
                org.telegram.ui.t11 t11Var = (org.telegram.ui.t11) this.c;
                boolean z10 = view instanceof org.telegram.ui.d11;
                int i17 = this.b;
                try {
                    if (!z10) {
                        if (!(view instanceof ImageView)) {
                            if (!(view instanceof org.telegram.ui.y01)) {
                                if (view != null) {
                                    view.callOnClick();
                                    break;
                                }
                            } else {
                                t11Var.i(i7, (org.telegram.ui.y01) view);
                                if (i17 != 1 && i17 != 11) {
                                    t11Var.performHapticFeedback(3, 1);
                                }
                            }
                        } else {
                            t11Var.o(view, null);
                            if (i17 != 1 && i17 != 11) {
                                t11Var.performHapticFeedback(3, 1);
                            }
                        }
                    } else {
                        org.telegram.ui.d11 d11Var = (org.telegram.ui.d11) view;
                        if (d11Var.s || (((o0Var = d11Var.y) != null && o0Var.a) || i17 == 13 || i17 == 14)) {
                            t11Var.l();
                            t11Var.r(d11Var, d11Var.y);
                        } else if (!d11Var.Q || (document = d11Var.d) == null) {
                            t11Var.o(d11Var, d11Var.e);
                        } else if (t11Var.W == 6) {
                            t11Var.p(d11Var, Long.valueOf(document.id), document, d11Var.w, null);
                        } else {
                            t11Var.p(d11Var, null, document, d11Var.w, null);
                        }
                        if (i17 != 1 && i17 != 11) {
                            t11Var.performHapticFeedback(3, 1);
                        }
                    }
                    break;
                } catch (Exception unused) {
                    return;
                }
                break;
        }
    }
}
