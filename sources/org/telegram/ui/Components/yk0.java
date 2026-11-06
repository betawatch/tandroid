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

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
        org.telegram.ui.fm0 fm0Var;
        org.telegram.ui.bm0 bm0Var;
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
                                if (message.i4() || org.telegram.messenger.ij.S4(message.k)) {
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
                                        PhotoViewer.p1().Z1(arrayList, 0, 0L, 0L, 0L, new org.telegram.ui.nq0());
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
                        org.telegram.ui.rz rzVar = dl0Var.J;
                        int f12 = E.f1();
                        rzVar.a = org.telegram.messenger.ij.B0(E.k);
                        rzVar.b = f12;
                        k5Var.g(i7);
                        if (!dl0Var.I.i()) {
                            k5Var.k(0, ((dl0) k5Var.d).r);
                            break;
                        }
                    }
                }
                break;
            case 1:
                org.telegram.ui.bm0 bm0Var2 = (org.telegram.ui.bm0) this.c;
                org.telegram.ui.hm0 hm0Var = bm0Var2.p0;
                ArrayList arrayList2 = bm0Var2.l0;
                if (!(view instanceof org.telegram.ui.am0)) {
                    int i12 = bm0Var2.V;
                    int i13 = this.b;
                    if (i7 != i12) {
                        int i14 = bm0Var2.b0;
                        if (i7 >= i14 && i7 < bm0Var2.c0) {
                            int i15 = i7 - i14;
                            if (bm0Var2.K != null) {
                                if (bm0Var2.J != null && i15 >= 0 && i15 < arrayList2.size()) {
                                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList2.get(i15);
                                    if (i13 == 1) {
                                        TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                                        if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                                            bm0Var2.n = 0L;
                                            bm0Var2.h = -1;
                                            bm0Var2.r = null;
                                            bm0Var2.s = (TLRPC.TL_peerColorCollectible) peerColor;
                                        }
                                    } else {
                                        bm0Var2.n = 0L;
                                        bm0Var2.h = -1;
                                        bm0Var2.r = org.telegram.messenger.qp.q0(tL_starGiftUnique);
                                        bm0Var2.s = null;
                                    }
                                    bm0Var2.I = tL_starGiftUnique;
                                    bm0Var2.j(true);
                                    bm0Var2.i();
                                    bm0Var2.f(true);
                                    org.telegram.ui.am0 am0Var = bm0Var2.D;
                                    if (am0Var != null) {
                                        am0Var.b(true);
                                        break;
                                    }
                                }
                            } else if (i15 >= 0 && i15 < arrayList2.size()) {
                                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList2.get(i15);
                                if (i13 == 1) {
                                    TLRPC.PeerColor peerColor2 = tL_starGiftUnique2.peer_color;
                                    if (peerColor2 instanceof TLRPC.TL_peerColorCollectible) {
                                        bm0Var2.n = 0L;
                                        bm0Var2.h = -1;
                                        bm0Var2.I = null;
                                        bm0Var2.r = null;
                                        bm0Var2.s = (TLRPC.TL_peerColorCollectible) peerColor2;
                                    }
                                } else {
                                    bm0Var2.n = 0L;
                                    bm0Var2.h = -1;
                                    bm0Var2.I = null;
                                    bm0Var2.r = org.telegram.messenger.qp.q0(tL_starGiftUnique2);
                                    bm0Var2.s = null;
                                }
                                bm0Var2.j(true);
                                bm0Var2.i();
                                bm0Var2.f(true);
                                org.telegram.ui.am0 am0Var2 = bm0Var2.D;
                                if (am0Var2 != null) {
                                    am0Var2.b(true);
                                    break;
                                }
                            }
                        }
                    } else {
                        bm0Var2.h = -1;
                        bm0Var2.n = 0L;
                        bm0Var2.r = null;
                        bm0Var2.s = null;
                        bm0Var2.I = null;
                        bm0Var2.i();
                        if (i13 == 0) {
                            hm0Var.h.i();
                        }
                        org.telegram.ui.am0 am0Var3 = bm0Var2.D;
                        if (am0Var3 != null) {
                            am0Var3.b(true);
                        }
                        bm0Var2.j(true);
                        bm0Var2.f(true);
                        org.telegram.ui.bm0 bm0Var3 = hm0Var.n;
                        if (bm0Var3 != null && (fm0Var = bm0Var3.a) != null && (bm0Var = hm0Var.h) != null) {
                            fm0Var.a(bm0Var.h);
                            break;
                        }
                    }
                } else {
                    org.telegram.ui.am0 am0Var4 = (org.telegram.ui.am0) view;
                    int i16 = bm0Var2.m0;
                    if (bm0Var2.o0 == null) {
                        g5 g5Var = am0Var4.c;
                        org.telegram.ui.h11[] h11VarArr = new org.telegram.ui.h11[1];
                        float L = org.telegram.messenger.g0.L(330.0f);
                        Point point = org.telegram.messenger.g0.q;
                        int min = (int) Math.min(L, point.y * 0.75f);
                        int min2 = (int) Math.min(org.telegram.messenger.g0.L(324.0f), point.x * 0.95f);
                        if (g5Var != null) {
                            g5Var.f();
                            am0Var4.c();
                            Rect rect = org.telegram.messenger.g0.Q;
                            rect.set(g5Var.getBounds());
                            int L2 = i16 == 1 ? (org.telegram.messenger.g0.L(12.0f) + (-rect.centerY())) - min : (-(am0Var4.getHeight() - rect.centerY())) - org.telegram.messenger.g0.L(16.0f);
                            i11 = org.telegram.messenger.g0.L(12.0f) + (rect.centerX() - (point.x - min2));
                            i10 = L2;
                        } else {
                            i10 = 0;
                            i11 = 0;
                        }
                        org.telegram.ui.xl0 xl0Var = new org.telegram.ui.xl0(bm0Var2, hm0Var, bm0Var2.getContext(), Integer.valueOf(i11), i16 == 1 ? 5 : 7, hm0Var.getResourceProvider(), i16 == 1 ? 24 : 16, am0Var4.a(), am0Var4, h11VarArr);
                        xl0Var.g1 = true;
                        long j10 = bm0Var2.n;
                        xl0Var.setSelected(j10 == 0 ? null : Long.valueOf(j10));
                        xl0Var.setSaveState(3);
                        xl0Var.y(g5Var, am0Var4);
                        org.telegram.ui.yl0 yl0Var = new org.telegram.ui.yl0(bm0Var2, xl0Var);
                        bm0Var2.o0 = yl0Var;
                        h11VarArr[0] = yl0Var;
                        yl0Var.showAsDropDown(am0Var4, 0, i10, (org.telegram.messenger.hd.a0 ? 3 : 5) | 48);
                        h11VarArr[0].b();
                    }
                    break;
                }
                break;
            default:
                org.telegram.ui.q11 q11Var = (org.telegram.ui.q11) this.c;
                boolean z10 = view instanceof org.telegram.ui.a11;
                int i17 = this.b;
                try {
                    if (!z10) {
                        if (!(view instanceof ImageView)) {
                            if (!(view instanceof org.telegram.ui.v01)) {
                                if (view != null) {
                                    view.callOnClick();
                                    break;
                                }
                            } else {
                                q11Var.i(i7, (org.telegram.ui.v01) view);
                                if (i17 != 1 && i17 != 11) {
                                    q11Var.performHapticFeedback(3, 1);
                                }
                            }
                        } else {
                            q11Var.o(view, null);
                            if (i17 != 1 && i17 != 11) {
                                q11Var.performHapticFeedback(3, 1);
                            }
                        }
                    } else {
                        org.telegram.ui.a11 a11Var = (org.telegram.ui.a11) view;
                        if (a11Var.s || (((o0Var = a11Var.y) != null && o0Var.a) || i17 == 13 || i17 == 14)) {
                            q11Var.l();
                            q11Var.r(a11Var, a11Var.y);
                        } else if (!a11Var.Q || (document = a11Var.d) == null) {
                            q11Var.o(a11Var, a11Var.e);
                        } else if (q11Var.W == 6) {
                            q11Var.p(a11Var, Long.valueOf(document.id), document, a11Var.w, null);
                        } else {
                            q11Var.p(a11Var, null, document, a11Var.w, null);
                        }
                        if (i17 != 1 && i17 != 11) {
                            q11Var.performHapticFeedback(3, 1);
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
