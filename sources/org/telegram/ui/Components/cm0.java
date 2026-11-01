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

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cm0 implements hk0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ FrameLayout c;

    public /* synthetic */ cm0(FrameLayout frameLayout, int i10, int i11) {
        this.a = i11;
        this.c = frameLayout;
        this.b = i10;
    }

    @Override // org.telegram.ui.Components.hk0
    public final void f(int i10, View view) {
        long j10;
        TLRPC.Chat chat;
        org.telegram.ui.pn0 pn0Var;
        org.telegram.ui.ln0 ln0Var;
        int i11;
        int i12;
        sg.o0 o0Var;
        TLRPC.Document document;
        switch (this.a) {
            case 0:
                hm0 hm0Var = (hm0) this.c;
                org.telegram.ui.ActionBar.k2 k2Var = hm0Var.G;
                kg.f fVar = hm0Var.c;
                org.telegram.messenger.kj E = fVar.E(i10);
                if (E != null) {
                    if (!hm0Var.I.f()) {
                        if (view instanceof em0) {
                            org.telegram.ui.Cells.l7 l7Var = ((em0) view).a;
                            org.telegram.messenger.kj message = l7Var.getMessage();
                            TLRPC.Document F0 = message.F0();
                            if (l7Var.G) {
                                if (message.h4() || org.telegram.messenger.kj.R4(message.k)) {
                                    MediaController.B().S(message);
                                    break;
                                } else {
                                    boolean x10 = message.x();
                                    if (!x10) {
                                        TLRPC.Message message2 = message.k;
                                        boolean z10 = message2 != null && message2.noforwards;
                                        if (E.k.peer_id.channel_id != 0) {
                                            j10 = 0;
                                            chat = org.telegram.messenger.wp.r1(org.telegram.messenger.e20.s0).L0(Long.valueOf(E.k.peer_id.channel_id));
                                        } else {
                                            j10 = 0;
                                            chat = null;
                                        }
                                        if (chat == null) {
                                            chat = E.k.peer_id.chat_id != j10 ? org.telegram.messenger.wp.r1(org.telegram.messenger.e20.s0).L0(Long.valueOf(E.k.peer_id.chat_id)) : null;
                                        }
                                        if (chat != null) {
                                            z10 = chat.noforwards;
                                        }
                                        x10 = x10 || z10;
                                    }
                                    if (x10) {
                                        PhotoViewer.v1().N2(null, k2Var, null);
                                        ArrayList arrayList = new ArrayList();
                                        arrayList.add(message);
                                        PhotoViewer.v1().N2(null, k2Var, null);
                                        PhotoViewer.v1().e2(arrayList, 0, 0L, 0L, 0L, new org.telegram.ui.xr0());
                                        break;
                                    } else {
                                        org.telegram.messenger.i0.s2(message, hm0Var.F, k2Var);
                                    }
                                }
                            } else if (l7Var.F) {
                                org.telegram.messenger.b8.G(org.telegram.messenger.c.a(org.telegram.messenger.e20.s0).a).f(F0);
                                l7Var.f(true);
                            } else {
                                E.P = true;
                                org.telegram.messenger.b8.G(org.telegram.messenger.c.a(org.telegram.messenger.e20.s0).a).X(F0, E, 0, 0);
                                l7Var.f(true);
                                org.telegram.messenger.b6.q(this.b).y();
                            }
                            hm0Var.d(true);
                        }
                        if (view instanceof org.telegram.ui.Cells.k7) {
                            ((org.telegram.ui.Cells.k7) view).a();
                            break;
                        }
                    } else {
                        hm0Var.I.e(E, view, 0);
                        org.telegram.ui.r00 r00Var = hm0Var.J;
                        int f12 = E.f1();
                        r00Var.a = org.telegram.messenger.kj.B0(E.k);
                        r00Var.b = f12;
                        fVar.g(i10);
                        if (!hm0Var.I.f()) {
                            fVar.k(0, ((hm0) fVar.d).r);
                            break;
                        }
                    }
                }
                break;
            case 1:
                org.telegram.ui.ln0 ln0Var2 = (org.telegram.ui.ln0) this.c;
                org.telegram.ui.rn0 rn0Var = ln0Var2.p0;
                ArrayList arrayList2 = ln0Var2.l0;
                if (!(view instanceof org.telegram.ui.kn0)) {
                    int i13 = ln0Var2.V;
                    int i14 = this.b;
                    if (i10 != i13) {
                        int i15 = ln0Var2.b0;
                        if (i10 >= i15 && i10 < ln0Var2.c0) {
                            int i16 = i10 - i15;
                            if (ln0Var2.K != null) {
                                if (ln0Var2.J != null && i16 >= 0 && i16 < arrayList2.size()) {
                                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList2.get(i16);
                                    if (i14 == 1) {
                                        TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                                        if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                                            ln0Var2.n = 0L;
                                            ln0Var2.h = -1;
                                            ln0Var2.r = null;
                                            ln0Var2.s = (TLRPC.TL_peerColorCollectible) peerColor;
                                        }
                                    } else {
                                        ln0Var2.n = 0L;
                                        ln0Var2.h = -1;
                                        ln0Var2.r = org.telegram.messenger.wp.q0(tL_starGiftUnique);
                                        ln0Var2.s = null;
                                    }
                                    ln0Var2.I = tL_starGiftUnique;
                                    ln0Var2.j(true);
                                    ln0Var2.i();
                                    ln0Var2.f(true);
                                    org.telegram.ui.kn0 kn0Var = ln0Var2.D;
                                    if (kn0Var != null) {
                                        kn0Var.b(true);
                                        break;
                                    }
                                }
                            } else if (i16 >= 0 && i16 < arrayList2.size()) {
                                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList2.get(i16);
                                if (i14 == 1) {
                                    TLRPC.PeerColor peerColor2 = tL_starGiftUnique2.peer_color;
                                    if (peerColor2 instanceof TLRPC.TL_peerColorCollectible) {
                                        ln0Var2.n = 0L;
                                        ln0Var2.h = -1;
                                        ln0Var2.I = null;
                                        ln0Var2.r = null;
                                        ln0Var2.s = (TLRPC.TL_peerColorCollectible) peerColor2;
                                    }
                                } else {
                                    ln0Var2.n = 0L;
                                    ln0Var2.h = -1;
                                    ln0Var2.I = null;
                                    ln0Var2.r = org.telegram.messenger.wp.q0(tL_starGiftUnique2);
                                    ln0Var2.s = null;
                                }
                                ln0Var2.j(true);
                                ln0Var2.i();
                                ln0Var2.f(true);
                                org.telegram.ui.kn0 kn0Var2 = ln0Var2.D;
                                if (kn0Var2 != null) {
                                    kn0Var2.b(true);
                                    break;
                                }
                            }
                        }
                    } else {
                        ln0Var2.h = -1;
                        ln0Var2.n = 0L;
                        ln0Var2.r = null;
                        ln0Var2.s = null;
                        ln0Var2.I = null;
                        ln0Var2.i();
                        if (i14 == 0) {
                            rn0Var.h.i();
                        }
                        org.telegram.ui.kn0 kn0Var3 = ln0Var2.D;
                        if (kn0Var3 != null) {
                            kn0Var3.b(true);
                        }
                        ln0Var2.j(true);
                        ln0Var2.f(true);
                        org.telegram.ui.ln0 ln0Var3 = rn0Var.n;
                        if (ln0Var3 != null && (pn0Var = ln0Var3.a) != null && (ln0Var = rn0Var.h) != null) {
                            pn0Var.a(ln0Var.h);
                            break;
                        }
                    }
                } else {
                    org.telegram.ui.kn0 kn0Var4 = (org.telegram.ui.kn0) view;
                    int i17 = ln0Var2.m0;
                    if (ln0Var2.o0 == null) {
                        d5 d5Var = kn0Var4.c;
                        org.telegram.ui.x21[] x21VarArr = new org.telegram.ui.x21[1];
                        float L = org.telegram.messenger.i0.L(330.0f);
                        Point point = org.telegram.messenger.i0.q;
                        int min = (int) Math.min(L, point.y * 0.75f);
                        int min2 = (int) Math.min(org.telegram.messenger.i0.L(324.0f), point.x * 0.95f);
                        if (d5Var != null) {
                            d5Var.f();
                            kn0Var4.c();
                            Rect rect = org.telegram.messenger.i0.Q;
                            rect.set(d5Var.getBounds());
                            int L2 = i17 == 1 ? (org.telegram.messenger.i0.L(12.0f) + (-rect.centerY())) - min : (-(kn0Var4.getHeight() - rect.centerY())) - org.telegram.messenger.i0.L(16.0f);
                            i12 = org.telegram.messenger.i0.L(12.0f) + (rect.centerX() - (point.x - min2));
                            i11 = L2;
                        } else {
                            i11 = 0;
                            i12 = 0;
                        }
                        org.telegram.ui.hn0 hn0Var = new org.telegram.ui.hn0(ln0Var2, rn0Var, ln0Var2.getContext(), Integer.valueOf(i12), i17 == 1 ? 5 : 7, rn0Var.getResourceProvider(), i17 == 1 ? 24 : 16, kn0Var4.a(), kn0Var4, x21VarArr);
                        hn0Var.g1 = true;
                        long j11 = ln0Var2.n;
                        hn0Var.setSelected(j11 == 0 ? null : Long.valueOf(j11));
                        hn0Var.setSaveState(3);
                        hn0Var.y(d5Var, kn0Var4);
                        org.telegram.ui.in0 in0Var = new org.telegram.ui.in0(ln0Var2, hn0Var);
                        ln0Var2.o0 = in0Var;
                        x21VarArr[0] = in0Var;
                        in0Var.showAsDropDown(kn0Var4, 0, i11, (org.telegram.messenger.dd.X ? 3 : 5) | 48);
                        x21VarArr[0].b();
                    }
                    break;
                }
                break;
            default:
                org.telegram.ui.g31 g31Var = (org.telegram.ui.g31) this.c;
                boolean z11 = view instanceof org.telegram.ui.q21;
                int i18 = this.b;
                try {
                    if (!z11) {
                        if (!(view instanceof ImageView)) {
                            if (!(view instanceof org.telegram.ui.l21)) {
                                if (view != null) {
                                    view.callOnClick();
                                    break;
                                }
                            } else {
                                g31Var.i(i10, (org.telegram.ui.l21) view);
                                if (i18 != 1 && i18 != 11) {
                                    g31Var.performHapticFeedback(3, 1);
                                }
                            }
                        } else {
                            g31Var.o(view, null);
                            if (i18 != 1 && i18 != 11) {
                                g31Var.performHapticFeedback(3, 1);
                            }
                        }
                    } else {
                        org.telegram.ui.q21 q21Var = (org.telegram.ui.q21) view;
                        if (q21Var.s || (((o0Var = q21Var.y) != null && o0Var.a) || i18 == 13 || i18 == 14)) {
                            g31Var.l();
                            g31Var.r(q21Var, q21Var.y);
                        } else if (!q21Var.Q || (document = q21Var.d) == null) {
                            g31Var.o(q21Var, q21Var.e);
                        } else if (g31Var.W == 6) {
                            g31Var.p(q21Var, Long.valueOf(document.id), document, q21Var.w, null);
                        } else {
                            g31Var.p(q21Var, null, document, q21Var.w, null);
                        }
                        if (i18 != 1 && i18 != 11) {
                            g31Var.performHapticFeedback(3, 1);
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
