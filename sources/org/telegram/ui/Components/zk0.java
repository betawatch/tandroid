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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class zk0 implements cj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ FrameLayout c;

    public /* synthetic */ zk0(FrameLayout frameLayout, int i7, int i10) {
        this.a = i10;
        this.c = frameLayout;
        this.b = i7;
    }

    @Override // org.telegram.ui.Components.cj0
    public final void c(int i7, View view) {
        long j3;
        TLRPC.Chat chat;
        org.telegram.ui.hm0 hm0Var;
        org.telegram.ui.dm0 dm0Var;
        int i10;
        int i11;
        ch.o0 o0Var;
        TLRPC.Document document;
        switch (this.a) {
            case 0:
                el0 el0Var = (el0) this.c;
                org.telegram.ui.ActionBar.f2 f2Var = el0Var.G;
                bi.k5 k5Var = el0Var.c;
                org.telegram.messenger.ij E = k5Var.E(i7);
                if (E != null) {
                    if (!el0Var.I.i()) {
                        if (view instanceof bl0) {
                            org.telegram.ui.Cells.h7 h7Var = ((bl0) view).a;
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
                                        PhotoViewer.p1().Z1(arrayList, 0, 0L, 0L, 0L, new org.telegram.ui.pq0());
                                        break;
                                    } else {
                                        org.telegram.messenger.g0.s2(message, el0Var.F, f2Var);
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
                            el0Var.d(true);
                        }
                        if (view instanceof org.telegram.ui.Cells.g7) {
                            ((org.telegram.ui.Cells.g7) view).a();
                            break;
                        }
                    } else {
                        el0Var.I.h(E, view, 0);
                        org.telegram.ui.tz tzVar = el0Var.J;
                        int e12 = E.e1();
                        tzVar.a = org.telegram.messenger.ij.B0(E.k);
                        tzVar.b = e12;
                        k5Var.g(i7);
                        if (!el0Var.I.i()) {
                            k5Var.k(0, ((el0) k5Var.d).r);
                            break;
                        }
                    }
                }
                break;
            case 1:
                org.telegram.ui.dm0 dm0Var2 = (org.telegram.ui.dm0) this.c;
                org.telegram.ui.jm0 jm0Var = dm0Var2.p0;
                ArrayList arrayList2 = dm0Var2.l0;
                if (!(view instanceof org.telegram.ui.cm0)) {
                    int i12 = dm0Var2.V;
                    int i13 = this.b;
                    if (i7 != i12) {
                        int i14 = dm0Var2.b0;
                        if (i7 >= i14 && i7 < dm0Var2.c0) {
                            int i15 = i7 - i14;
                            if (dm0Var2.K != null) {
                                if (dm0Var2.J != null && i15 >= 0 && i15 < arrayList2.size()) {
                                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList2.get(i15);
                                    if (i13 == 1) {
                                        TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                                        if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                                            dm0Var2.n = 0L;
                                            dm0Var2.h = -1;
                                            dm0Var2.r = null;
                                            dm0Var2.s = (TLRPC.TL_peerColorCollectible) peerColor;
                                        }
                                    } else {
                                        dm0Var2.n = 0L;
                                        dm0Var2.h = -1;
                                        dm0Var2.r = org.telegram.messenger.qp.q0(tL_starGiftUnique);
                                        dm0Var2.s = null;
                                    }
                                    dm0Var2.I = tL_starGiftUnique;
                                    dm0Var2.j(true);
                                    dm0Var2.i();
                                    dm0Var2.f(true);
                                    org.telegram.ui.cm0 cm0Var = dm0Var2.D;
                                    if (cm0Var != null) {
                                        cm0Var.b(true);
                                        break;
                                    }
                                }
                            } else if (i15 >= 0 && i15 < arrayList2.size()) {
                                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList2.get(i15);
                                if (i13 == 1) {
                                    TLRPC.PeerColor peerColor2 = tL_starGiftUnique2.peer_color;
                                    if (peerColor2 instanceof TLRPC.TL_peerColorCollectible) {
                                        dm0Var2.n = 0L;
                                        dm0Var2.h = -1;
                                        dm0Var2.I = null;
                                        dm0Var2.r = null;
                                        dm0Var2.s = (TLRPC.TL_peerColorCollectible) peerColor2;
                                    }
                                } else {
                                    dm0Var2.n = 0L;
                                    dm0Var2.h = -1;
                                    dm0Var2.I = null;
                                    dm0Var2.r = org.telegram.messenger.qp.q0(tL_starGiftUnique2);
                                    dm0Var2.s = null;
                                }
                                dm0Var2.j(true);
                                dm0Var2.i();
                                dm0Var2.f(true);
                                org.telegram.ui.cm0 cm0Var2 = dm0Var2.D;
                                if (cm0Var2 != null) {
                                    cm0Var2.b(true);
                                    break;
                                }
                            }
                        }
                    } else {
                        dm0Var2.h = -1;
                        dm0Var2.n = 0L;
                        dm0Var2.r = null;
                        dm0Var2.s = null;
                        dm0Var2.I = null;
                        dm0Var2.i();
                        if (i13 == 0) {
                            jm0Var.h.i();
                        }
                        org.telegram.ui.cm0 cm0Var3 = dm0Var2.D;
                        if (cm0Var3 != null) {
                            cm0Var3.b(true);
                        }
                        dm0Var2.j(true);
                        dm0Var2.f(true);
                        org.telegram.ui.dm0 dm0Var3 = jm0Var.n;
                        if (dm0Var3 != null && (hm0Var = dm0Var3.a) != null && (dm0Var = jm0Var.h) != null) {
                            hm0Var.a(dm0Var.h);
                            break;
                        }
                    }
                } else {
                    org.telegram.ui.cm0 cm0Var4 = (org.telegram.ui.cm0) view;
                    int i16 = dm0Var2.m0;
                    if (dm0Var2.o0 == null) {
                        g5 g5Var = cm0Var4.c;
                        org.telegram.ui.j11[] j11VarArr = new org.telegram.ui.j11[1];
                        float L = org.telegram.messenger.g0.L(330.0f);
                        Point point = org.telegram.messenger.g0.q;
                        int min = (int) Math.min(L, point.y * 0.75f);
                        int min2 = (int) Math.min(org.telegram.messenger.g0.L(324.0f), point.x * 0.95f);
                        if (g5Var != null) {
                            g5Var.f();
                            cm0Var4.c();
                            Rect rect = org.telegram.messenger.g0.Q;
                            rect.set(g5Var.getBounds());
                            int L2 = i16 == 1 ? (org.telegram.messenger.g0.L(12.0f) + (-rect.centerY())) - min : (-(cm0Var4.getHeight() - rect.centerY())) - org.telegram.messenger.g0.L(16.0f);
                            i11 = org.telegram.messenger.g0.L(12.0f) + (rect.centerX() - (point.x - min2));
                            i10 = L2;
                        } else {
                            i10 = 0;
                            i11 = 0;
                        }
                        org.telegram.ui.zl0 zl0Var = new org.telegram.ui.zl0(dm0Var2, jm0Var, dm0Var2.getContext(), Integer.valueOf(i11), i16 == 1 ? 5 : 7, jm0Var.getResourceProvider(), i16 == 1 ? 24 : 16, cm0Var4.a(), cm0Var4, j11VarArr);
                        zl0Var.g1 = true;
                        long j10 = dm0Var2.n;
                        zl0Var.setSelected(j10 == 0 ? null : Long.valueOf(j10));
                        zl0Var.setSaveState(3);
                        zl0Var.y(g5Var, cm0Var4);
                        org.telegram.ui.am0 am0Var = new org.telegram.ui.am0(dm0Var2, zl0Var);
                        dm0Var2.o0 = am0Var;
                        j11VarArr[0] = am0Var;
                        am0Var.showAsDropDown(cm0Var4, 0, i10, (org.telegram.messenger.id.a0 ? 3 : 5) | 48);
                        j11VarArr[0].b();
                    }
                    break;
                }
                break;
            default:
                org.telegram.ui.s11 s11Var = (org.telegram.ui.s11) this.c;
                boolean z10 = view instanceof org.telegram.ui.c11;
                int i17 = this.b;
                try {
                    if (!z10) {
                        if (!(view instanceof ImageView)) {
                            if (!(view instanceof org.telegram.ui.x01)) {
                                if (view != null) {
                                    view.callOnClick();
                                    break;
                                }
                            } else {
                                s11Var.i(i7, (org.telegram.ui.x01) view);
                                if (i17 != 1 && i17 != 11) {
                                    s11Var.performHapticFeedback(3, 1);
                                }
                            }
                        } else {
                            s11Var.o(view, null);
                            if (i17 != 1 && i17 != 11) {
                                s11Var.performHapticFeedback(3, 1);
                            }
                        }
                    } else {
                        org.telegram.ui.c11 c11Var = (org.telegram.ui.c11) view;
                        if (c11Var.s || (((o0Var = c11Var.y) != null && o0Var.a) || i17 == 13 || i17 == 14)) {
                            s11Var.l();
                            s11Var.r(c11Var, c11Var.y);
                        } else if (!c11Var.Q || (document = c11Var.d) == null) {
                            s11Var.o(c11Var, c11Var.e);
                        } else if (s11Var.W == 6) {
                            s11Var.p(c11Var, Long.valueOf(document.id), document, c11Var.w, null);
                        } else {
                            s11Var.p(c11Var, null, document, c11Var.w, null);
                        }
                        if (i17 != 1 && i17 != 11) {
                            s11Var.performHapticFeedback(3, 1);
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
