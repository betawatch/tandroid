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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cl0 implements fj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ FrameLayout c;

    public /* synthetic */ cl0(FrameLayout frameLayout, int i3, int i10) {
        this.a = i10;
        this.c = frameLayout;
        this.b = i3;
    }

    @Override // org.telegram.ui.Components.fj0
    public final void f(int i3, View view) {
        long j10;
        TLRPC.Chat chat;
        org.telegram.ui.am0 am0Var;
        org.telegram.ui.wl0 wl0Var;
        int i10;
        int i11;
        dh.n0 n0Var;
        TLRPC.Document document;
        switch (this.a) {
            case 0:
                hl0 hl0Var = (hl0) this.c;
                org.telegram.ui.ActionBar.d2 d2Var = hl0Var.H;
                ci.r4 r4Var = hl0Var.c;
                org.telegram.messenger.zi E = r4Var.E(i3);
                if (E != null) {
                    if (!hl0Var.J.I()) {
                        if (view instanceof el0) {
                            org.telegram.ui.Cells.g7 g7Var = ((el0) view).a;
                            org.telegram.messenger.zi message = g7Var.getMessage();
                            TLRPC.Document F0 = message.F0();
                            if (g7Var.H) {
                                if (message.i4() || org.telegram.messenger.zi.S4(message.k)) {
                                    MediaController.B().S(message);
                                    break;
                                } else {
                                    boolean x10 = message.x();
                                    if (!x10) {
                                        TLRPC.Message message2 = message.k;
                                        boolean z10 = message2 != null && message2.noforwards;
                                        if (E.k.peer_id.channel_id != 0) {
                                            j10 = 0;
                                            chat = org.telegram.messenger.hp.s1(org.telegram.messenger.h10.t0).M0(Long.valueOf(E.k.peer_id.channel_id));
                                        } else {
                                            j10 = 0;
                                            chat = null;
                                        }
                                        if (chat == null) {
                                            chat = E.k.peer_id.chat_id != j10 ? org.telegram.messenger.hp.s1(org.telegram.messenger.h10.t0).M0(Long.valueOf(E.k.peer_id.chat_id)) : null;
                                        }
                                        if (chat != null) {
                                            z10 = chat.noforwards;
                                        }
                                        x10 = x10 || z10;
                                    }
                                    if (x10) {
                                        PhotoViewer.v1().N2(null, d2Var, null);
                                        ArrayList arrayList = new ArrayList();
                                        arrayList.add(message);
                                        PhotoViewer.v1().N2(null, d2Var, null);
                                        PhotoViewer.v1().e2(arrayList, 0, 0L, 0L, 0L, new org.telegram.ui.eq0());
                                        break;
                                    } else {
                                        org.telegram.messenger.g0.s2(message, hl0Var.G, d2Var);
                                    }
                                }
                            } else if (g7Var.G) {
                                org.telegram.messenger.w7.G(org.telegram.messenger.c.a(org.telegram.messenger.h10.t0).a).f(F0);
                                g7Var.f(true);
                            } else {
                                E.P = true;
                                org.telegram.messenger.w7.G(org.telegram.messenger.c.a(org.telegram.messenger.h10.t0).a).X(F0, E, 0, 0);
                                g7Var.f(true);
                                org.telegram.messenger.z5.q(this.b).y();
                            }
                            hl0Var.d(true);
                        }
                        if (view instanceof org.telegram.ui.Cells.f7) {
                            ((org.telegram.ui.Cells.f7) view).a();
                            break;
                        }
                    } else {
                        hl0Var.J.w(E, view, 0);
                        org.telegram.ui.pz pzVar = hl0Var.K;
                        int f12 = E.f1();
                        pzVar.a = org.telegram.messenger.zi.B0(E.k);
                        pzVar.b = f12;
                        r4Var.g(i3);
                        if (!hl0Var.J.I()) {
                            r4Var.k(0, ((hl0) r4Var.d).r);
                            break;
                        }
                    }
                }
                break;
            case 1:
                org.telegram.ui.wl0 wl0Var2 = (org.telegram.ui.wl0) this.c;
                org.telegram.ui.cm0 cm0Var = wl0Var2.q0;
                ArrayList arrayList2 = wl0Var2.m0;
                if (!(view instanceof org.telegram.ui.vl0)) {
                    int i12 = wl0Var2.W;
                    int i13 = this.b;
                    if (i3 != i12) {
                        int i14 = wl0Var2.c0;
                        if (i3 >= i14 && i3 < wl0Var2.d0) {
                            int i15 = i3 - i14;
                            if (wl0Var2.L != null) {
                                if (wl0Var2.K != null && i15 >= 0 && i15 < arrayList2.size()) {
                                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList2.get(i15);
                                    if (i13 == 1) {
                                        TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                                        if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                                            wl0Var2.n = 0L;
                                            wl0Var2.h = -1;
                                            wl0Var2.r = null;
                                            wl0Var2.s = (TLRPC.TL_peerColorCollectible) peerColor;
                                        }
                                    } else {
                                        wl0Var2.n = 0L;
                                        wl0Var2.h = -1;
                                        wl0Var2.r = org.telegram.messenger.hp.q0(tL_starGiftUnique);
                                        wl0Var2.s = null;
                                    }
                                    wl0Var2.J = tL_starGiftUnique;
                                    wl0Var2.j(true);
                                    wl0Var2.i();
                                    wl0Var2.f(true);
                                    org.telegram.ui.vl0 vl0Var = wl0Var2.E;
                                    if (vl0Var != null) {
                                        vl0Var.b(true);
                                        break;
                                    }
                                }
                            } else if (i15 >= 0 && i15 < arrayList2.size()) {
                                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList2.get(i15);
                                if (i13 == 1) {
                                    TLRPC.PeerColor peerColor2 = tL_starGiftUnique2.peer_color;
                                    if (peerColor2 instanceof TLRPC.TL_peerColorCollectible) {
                                        wl0Var2.n = 0L;
                                        wl0Var2.h = -1;
                                        wl0Var2.J = null;
                                        wl0Var2.r = null;
                                        wl0Var2.s = (TLRPC.TL_peerColorCollectible) peerColor2;
                                    }
                                } else {
                                    wl0Var2.n = 0L;
                                    wl0Var2.h = -1;
                                    wl0Var2.J = null;
                                    wl0Var2.r = org.telegram.messenger.hp.q0(tL_starGiftUnique2);
                                    wl0Var2.s = null;
                                }
                                wl0Var2.j(true);
                                wl0Var2.i();
                                wl0Var2.f(true);
                                org.telegram.ui.vl0 vl0Var2 = wl0Var2.E;
                                if (vl0Var2 != null) {
                                    vl0Var2.b(true);
                                    break;
                                }
                            }
                        }
                    } else {
                        wl0Var2.h = -1;
                        wl0Var2.n = 0L;
                        wl0Var2.r = null;
                        wl0Var2.s = null;
                        wl0Var2.J = null;
                        wl0Var2.i();
                        if (i13 == 0) {
                            cm0Var.h.i();
                        }
                        org.telegram.ui.vl0 vl0Var3 = wl0Var2.E;
                        if (vl0Var3 != null) {
                            vl0Var3.b(true);
                        }
                        wl0Var2.j(true);
                        wl0Var2.f(true);
                        org.telegram.ui.wl0 wl0Var3 = cm0Var.n;
                        if (wl0Var3 != null && (am0Var = wl0Var3.a) != null && (wl0Var = cm0Var.h) != null) {
                            am0Var.a(wl0Var.h);
                            break;
                        }
                    }
                } else {
                    org.telegram.ui.vl0 vl0Var4 = (org.telegram.ui.vl0) view;
                    int i16 = wl0Var2.n0;
                    if (wl0Var2.p0 == null) {
                        e5 e5Var = vl0Var4.c;
                        org.telegram.ui.x01[] x01VarArr = new org.telegram.ui.x01[1];
                        float L = org.telegram.messenger.g0.L(330.0f);
                        Point point = org.telegram.messenger.g0.q;
                        int min = (int) Math.min(L, point.y * 0.75f);
                        int min2 = (int) Math.min(org.telegram.messenger.g0.L(324.0f), point.x * 0.95f);
                        if (e5Var != null) {
                            e5Var.f();
                            vl0Var4.c();
                            Rect rect = org.telegram.messenger.g0.Q;
                            rect.set(e5Var.getBounds());
                            int L2 = i16 == 1 ? (org.telegram.messenger.g0.L(12.0f) + (-rect.centerY())) - min : (-(vl0Var4.getHeight() - rect.centerY())) - org.telegram.messenger.g0.L(16.0f);
                            i11 = org.telegram.messenger.g0.L(12.0f) + (rect.centerX() - (point.x - min2));
                            i10 = L2;
                        } else {
                            i10 = 0;
                            i11 = 0;
                        }
                        org.telegram.ui.sl0 sl0Var = new org.telegram.ui.sl0(wl0Var2, cm0Var, wl0Var2.getContext(), Integer.valueOf(i11), i16 == 1 ? 5 : 7, cm0Var.getResourceProvider(), i16 == 1 ? 24 : 16, vl0Var4.a(), vl0Var4, x01VarArr);
                        sl0Var.h1 = true;
                        long j11 = wl0Var2.n;
                        sl0Var.setSelected(j11 == 0 ? null : Long.valueOf(j11));
                        sl0Var.setSaveState(3);
                        sl0Var.y(e5Var, vl0Var4);
                        org.telegram.ui.tl0 tl0Var = new org.telegram.ui.tl0(wl0Var2, sl0Var);
                        wl0Var2.p0 = tl0Var;
                        x01VarArr[0] = tl0Var;
                        tl0Var.showAsDropDown(vl0Var4, 0, i10, (org.telegram.messenger.bd.a0 ? 3 : 5) | 48);
                        x01VarArr[0].b();
                    }
                    break;
                }
                break;
            default:
                org.telegram.ui.g11 g11Var = (org.telegram.ui.g11) this.c;
                boolean z11 = view instanceof org.telegram.ui.q01;
                int i17 = this.b;
                try {
                    if (!z11) {
                        if (!(view instanceof ImageView)) {
                            if (!(view instanceof org.telegram.ui.l01)) {
                                if (view != null) {
                                    view.callOnClick();
                                    break;
                                }
                            } else {
                                g11Var.i(i3, (org.telegram.ui.l01) view);
                                if (i17 != 1 && i17 != 11) {
                                    g11Var.performHapticFeedback(3, 1);
                                }
                            }
                        } else {
                            g11Var.o(view, null);
                            if (i17 != 1 && i17 != 11) {
                                g11Var.performHapticFeedback(3, 1);
                            }
                        }
                    } else {
                        org.telegram.ui.q01 q01Var = (org.telegram.ui.q01) view;
                        if (q01Var.s || (((n0Var = q01Var.y) != null && n0Var.a) || i17 == 13 || i17 == 14)) {
                            g11Var.l();
                            g11Var.r(q01Var, q01Var.y);
                        } else if (!q01Var.R || (document = q01Var.d) == null) {
                            g11Var.o(q01Var, q01Var.e);
                        } else if (g11Var.a0 == 6) {
                            g11Var.p(q01Var, Long.valueOf(document.id), document, q01Var.w, null);
                        } else {
                            g11Var.p(q01Var, null, document, q01Var.w, null);
                        }
                        if (i17 != 1 && i17 != 11) {
                            g11Var.performHapticFeedback(3, 1);
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
