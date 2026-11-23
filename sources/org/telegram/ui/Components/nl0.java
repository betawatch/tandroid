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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class nl0 implements qj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ FrameLayout c;

    public /* synthetic */ nl0(FrameLayout frameLayout, int i7, int i10) {
        this.a = i10;
        this.c = frameLayout;
        this.b = i7;
    }

    @Override // org.telegram.ui.Components.qj0
    public final void b(int i7, View view) {
        long j3;
        TLRPC.Chat chat;
        org.telegram.ui.hm0 hm0Var;
        org.telegram.ui.dm0 dm0Var;
        int i10;
        int i11;
        ch.p0 p0Var;
        TLRPC.Document document;
        switch (this.a) {
            case 0:
                sl0 sl0Var = (sl0) this.c;
                org.telegram.ui.ActionBar.g2 g2Var = sl0Var.H;
                di.l4 l4Var = sl0Var.c;
                org.telegram.messenger.fj E = l4Var.E(i7);
                if (E != null) {
                    if (!sl0Var.J.i0()) {
                        if (view instanceof pl0) {
                            org.telegram.ui.Cells.h7 h7Var = ((pl0) view).a;
                            org.telegram.messenger.fj message = h7Var.getMessage();
                            TLRPC.Document F0 = message.F0();
                            if (h7Var.H) {
                                if (message.h4() || org.telegram.messenger.fj.R4(message.k)) {
                                    MediaController.B().S(message);
                                    break;
                                } else {
                                    boolean x10 = message.x();
                                    if (!x10) {
                                        TLRPC.Message message2 = message.k;
                                        boolean z10 = message2 != null && message2.noforwards;
                                        if (E.k.peer_id.channel_id != 0) {
                                            j3 = 0;
                                            chat = org.telegram.messenger.mp.u1(org.telegram.messenger.i10.t0).O0(Long.valueOf(E.k.peer_id.channel_id));
                                        } else {
                                            j3 = 0;
                                            chat = null;
                                        }
                                        if (chat == null) {
                                            chat = E.k.peer_id.chat_id != j3 ? org.telegram.messenger.mp.u1(org.telegram.messenger.i10.t0).O0(Long.valueOf(E.k.peer_id.chat_id)) : null;
                                        }
                                        if (chat != null) {
                                            z10 = chat.noforwards;
                                        }
                                        x10 = x10 || z10;
                                    }
                                    if (x10) {
                                        PhotoViewer.p1().J2(null, g2Var, null);
                                        ArrayList arrayList = new ArrayList();
                                        arrayList.add(message);
                                        PhotoViewer.p1().J2(null, g2Var, null);
                                        PhotoViewer.p1().b2(arrayList, 0, 0L, 0L, 0L, new org.telegram.ui.oq0());
                                        break;
                                    } else {
                                        org.telegram.messenger.g0.s2(message, sl0Var.G, g2Var);
                                    }
                                }
                            } else if (h7Var.G) {
                                org.telegram.messenger.w7.G(org.telegram.messenger.c.a(org.telegram.messenger.i10.t0).a).f(F0);
                                h7Var.f(true);
                            } else {
                                E.P = true;
                                org.telegram.messenger.w7.G(org.telegram.messenger.c.a(org.telegram.messenger.i10.t0).a).W(F0, E, 0, 0);
                                h7Var.f(true);
                                org.telegram.messenger.a6.q(this.b).y();
                            }
                            sl0Var.d(true);
                        }
                        if (view instanceof org.telegram.ui.Cells.g7) {
                            ((org.telegram.ui.Cells.g7) view).a();
                            break;
                        }
                    } else {
                        sl0Var.J.S(E, view, 0);
                        org.telegram.ui.uz uzVar = sl0Var.K;
                        int e12 = E.e1();
                        uzVar.a = org.telegram.messenger.fj.B0(E.k);
                        uzVar.b = e12;
                        l4Var.g(i7);
                        if (!sl0Var.J.i0()) {
                            l4Var.k(0, ((sl0) l4Var.d).r);
                            break;
                        }
                    }
                }
                break;
            case 1:
                org.telegram.ui.dm0 dm0Var2 = (org.telegram.ui.dm0) this.c;
                org.telegram.ui.jm0 jm0Var = dm0Var2.q0;
                ArrayList arrayList2 = dm0Var2.m0;
                if (!(view instanceof org.telegram.ui.cm0)) {
                    int i12 = dm0Var2.W;
                    int i13 = this.b;
                    if (i7 != i12) {
                        int i14 = dm0Var2.c0;
                        if (i7 >= i14 && i7 < dm0Var2.d0) {
                            int i15 = i7 - i14;
                            if (dm0Var2.L != null) {
                                if (dm0Var2.K != null && i15 >= 0 && i15 < arrayList2.size()) {
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
                                        dm0Var2.r = org.telegram.messenger.mp.r0(tL_starGiftUnique);
                                        dm0Var2.s = null;
                                    }
                                    dm0Var2.J = tL_starGiftUnique;
                                    dm0Var2.j(true);
                                    dm0Var2.i();
                                    dm0Var2.f(true);
                                    org.telegram.ui.cm0 cm0Var = dm0Var2.E;
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
                                        dm0Var2.J = null;
                                        dm0Var2.r = null;
                                        dm0Var2.s = (TLRPC.TL_peerColorCollectible) peerColor2;
                                    }
                                } else {
                                    dm0Var2.n = 0L;
                                    dm0Var2.h = -1;
                                    dm0Var2.J = null;
                                    dm0Var2.r = org.telegram.messenger.mp.r0(tL_starGiftUnique2);
                                    dm0Var2.s = null;
                                }
                                dm0Var2.j(true);
                                dm0Var2.i();
                                dm0Var2.f(true);
                                org.telegram.ui.cm0 cm0Var2 = dm0Var2.E;
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
                        dm0Var2.J = null;
                        dm0Var2.i();
                        if (i13 == 0) {
                            jm0Var.h.i();
                        }
                        org.telegram.ui.cm0 cm0Var3 = dm0Var2.E;
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
                    int i16 = dm0Var2.n0;
                    if (dm0Var2.p0 == null) {
                        m5 m5Var = cm0Var4.c;
                        org.telegram.ui.h11[] h11VarArr = new org.telegram.ui.h11[1];
                        float L = org.telegram.messenger.g0.L(330.0f);
                        Point point = org.telegram.messenger.g0.q;
                        int min = (int) Math.min(L, point.y * 0.75f);
                        int min2 = (int) Math.min(org.telegram.messenger.g0.L(324.0f), point.x * 0.95f);
                        if (m5Var != null) {
                            m5Var.f();
                            cm0Var4.c();
                            Rect rect = org.telegram.messenger.g0.Q;
                            rect.set(m5Var.getBounds());
                            int L2 = i16 == 1 ? (org.telegram.messenger.g0.L(12.0f) + (-rect.centerY())) - min : (-(cm0Var4.getHeight() - rect.centerY())) - org.telegram.messenger.g0.L(16.0f);
                            i11 = org.telegram.messenger.g0.L(12.0f) + (rect.centerX() - (point.x - min2));
                            i10 = L2;
                        } else {
                            i10 = 0;
                            i11 = 0;
                        }
                        org.telegram.ui.zl0 zl0Var = new org.telegram.ui.zl0(dm0Var2, jm0Var, dm0Var2.getContext(), Integer.valueOf(i11), i16 == 1 ? 5 : 7, jm0Var.getResourceProvider(), i16 == 1 ? 24 : 16, cm0Var4.a(), cm0Var4, h11VarArr);
                        zl0Var.h1 = true;
                        long j10 = dm0Var2.n;
                        zl0Var.setSelected(j10 == 0 ? null : Long.valueOf(j10));
                        zl0Var.setSaveState(3);
                        zl0Var.y(m5Var, cm0Var4);
                        org.telegram.ui.am0 am0Var = new org.telegram.ui.am0(dm0Var2, zl0Var);
                        dm0Var2.p0 = am0Var;
                        h11VarArr[0] = am0Var;
                        am0Var.showAsDropDown(cm0Var4, 0, i10, (org.telegram.messenger.gd.a0 ? 3 : 5) | 48);
                        h11VarArr[0].b();
                    }
                    break;
                }
                break;
            default:
                org.telegram.ui.q11 q11Var = (org.telegram.ui.q11) this.c;
                boolean z11 = view instanceof org.telegram.ui.a11;
                int i17 = this.b;
                try {
                    if (!z11) {
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
                        if (a11Var.s || (((p0Var = a11Var.y) != null && p0Var.a) || i17 == 13 || i17 == 14)) {
                            q11Var.l();
                            q11Var.r(a11Var, a11Var.y);
                        } else if (!a11Var.R || (document = a11Var.d) == null) {
                            q11Var.o(a11Var, a11Var.e);
                        } else if (q11Var.a0 == 6) {
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
