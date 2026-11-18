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

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ll0 implements oj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ FrameLayout c;

    public /* synthetic */ ll0(FrameLayout frameLayout, int i7, int i10) {
        this.a = i10;
        this.c = frameLayout;
        this.b = i7;
    }

    @Override // org.telegram.ui.Components.oj0
    public final void c(int i7, View view) {
        long j3;
        TLRPC.Chat chat;
        org.telegram.ui.jm0 jm0Var;
        org.telegram.ui.fm0 fm0Var;
        int i10;
        int i11;
        ch.p0 p0Var;
        TLRPC.Document document;
        switch (this.a) {
            case 0:
                ql0 ql0Var = (ql0) this.c;
                org.telegram.ui.ActionBar.h2 h2Var = ql0Var.H;
                di.l4 l4Var = ql0Var.c;
                org.telegram.messenger.fj E = l4Var.E(i7);
                if (E != null) {
                    if (!ql0Var.J.V1()) {
                        if (view instanceof nl0) {
                            org.telegram.ui.Cells.h7 h7Var = ((nl0) view).a;
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
                                            chat = org.telegram.messenger.mp.u1(org.telegram.messenger.j10.t0).O0(Long.valueOf(E.k.peer_id.channel_id));
                                        } else {
                                            j3 = 0;
                                            chat = null;
                                        }
                                        if (chat == null) {
                                            chat = E.k.peer_id.chat_id != j3 ? org.telegram.messenger.mp.u1(org.telegram.messenger.j10.t0).O0(Long.valueOf(E.k.peer_id.chat_id)) : null;
                                        }
                                        if (chat != null) {
                                            z10 = chat.noforwards;
                                        }
                                        x10 = x10 || z10;
                                    }
                                    if (x10) {
                                        PhotoViewer.p1().I2(null, h2Var, null);
                                        ArrayList arrayList = new ArrayList();
                                        arrayList.add(message);
                                        PhotoViewer.p1().I2(null, h2Var, null);
                                        PhotoViewer.p1().a2(arrayList, 0, 0L, 0L, 0L, new org.telegram.ui.oq0());
                                        break;
                                    } else {
                                        org.telegram.messenger.g0.s2(message, ql0Var.G, h2Var);
                                    }
                                }
                            } else if (h7Var.G) {
                                org.telegram.messenger.w7.G(org.telegram.messenger.c.a(org.telegram.messenger.j10.t0).a).f(F0);
                                h7Var.f(true);
                            } else {
                                E.P = true;
                                org.telegram.messenger.w7.G(org.telegram.messenger.c.a(org.telegram.messenger.j10.t0).a).W(F0, E, 0, 0);
                                h7Var.f(true);
                                org.telegram.messenger.a6.q(this.b).y();
                            }
                            ql0Var.d(true);
                        }
                        if (view instanceof org.telegram.ui.Cells.g7) {
                            ((org.telegram.ui.Cells.g7) view).a();
                            break;
                        }
                    } else {
                        ql0Var.J.Z0(E, view, 0);
                        org.telegram.ui.vz vzVar = ql0Var.K;
                        int e12 = E.e1();
                        vzVar.a = org.telegram.messenger.fj.B0(E.k);
                        vzVar.b = e12;
                        l4Var.g(i7);
                        if (!ql0Var.J.V1()) {
                            l4Var.k(0, ((ql0) l4Var.d).r);
                            break;
                        }
                    }
                }
                break;
            case 1:
                org.telegram.ui.fm0 fm0Var2 = (org.telegram.ui.fm0) this.c;
                org.telegram.ui.lm0 lm0Var = fm0Var2.q0;
                ArrayList arrayList2 = fm0Var2.m0;
                if (!(view instanceof org.telegram.ui.em0)) {
                    int i12 = fm0Var2.W;
                    int i13 = this.b;
                    if (i7 != i12) {
                        int i14 = fm0Var2.c0;
                        if (i7 >= i14 && i7 < fm0Var2.d0) {
                            int i15 = i7 - i14;
                            if (fm0Var2.L != null) {
                                if (fm0Var2.K != null && i15 >= 0 && i15 < arrayList2.size()) {
                                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList2.get(i15);
                                    if (i13 == 1) {
                                        TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                                        if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                                            fm0Var2.n = 0L;
                                            fm0Var2.h = -1;
                                            fm0Var2.r = null;
                                            fm0Var2.s = (TLRPC.TL_peerColorCollectible) peerColor;
                                        }
                                    } else {
                                        fm0Var2.n = 0L;
                                        fm0Var2.h = -1;
                                        fm0Var2.r = org.telegram.messenger.mp.r0(tL_starGiftUnique);
                                        fm0Var2.s = null;
                                    }
                                    fm0Var2.J = tL_starGiftUnique;
                                    fm0Var2.j(true);
                                    fm0Var2.i();
                                    fm0Var2.f(true);
                                    org.telegram.ui.em0 em0Var = fm0Var2.E;
                                    if (em0Var != null) {
                                        em0Var.b(true);
                                        break;
                                    }
                                }
                            } else if (i15 >= 0 && i15 < arrayList2.size()) {
                                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList2.get(i15);
                                if (i13 == 1) {
                                    TLRPC.PeerColor peerColor2 = tL_starGiftUnique2.peer_color;
                                    if (peerColor2 instanceof TLRPC.TL_peerColorCollectible) {
                                        fm0Var2.n = 0L;
                                        fm0Var2.h = -1;
                                        fm0Var2.J = null;
                                        fm0Var2.r = null;
                                        fm0Var2.s = (TLRPC.TL_peerColorCollectible) peerColor2;
                                    }
                                } else {
                                    fm0Var2.n = 0L;
                                    fm0Var2.h = -1;
                                    fm0Var2.J = null;
                                    fm0Var2.r = org.telegram.messenger.mp.r0(tL_starGiftUnique2);
                                    fm0Var2.s = null;
                                }
                                fm0Var2.j(true);
                                fm0Var2.i();
                                fm0Var2.f(true);
                                org.telegram.ui.em0 em0Var2 = fm0Var2.E;
                                if (em0Var2 != null) {
                                    em0Var2.b(true);
                                    break;
                                }
                            }
                        }
                    } else {
                        fm0Var2.h = -1;
                        fm0Var2.n = 0L;
                        fm0Var2.r = null;
                        fm0Var2.s = null;
                        fm0Var2.J = null;
                        fm0Var2.i();
                        if (i13 == 0) {
                            lm0Var.h.i();
                        }
                        org.telegram.ui.em0 em0Var3 = fm0Var2.E;
                        if (em0Var3 != null) {
                            em0Var3.b(true);
                        }
                        fm0Var2.j(true);
                        fm0Var2.f(true);
                        org.telegram.ui.fm0 fm0Var3 = lm0Var.n;
                        if (fm0Var3 != null && (jm0Var = fm0Var3.a) != null && (fm0Var = lm0Var.h) != null) {
                            jm0Var.a(fm0Var.h);
                            break;
                        }
                    }
                } else {
                    org.telegram.ui.em0 em0Var4 = (org.telegram.ui.em0) view;
                    int i16 = fm0Var2.n0;
                    if (fm0Var2.p0 == null) {
                        m5 m5Var = em0Var4.c;
                        org.telegram.ui.i11[] i11VarArr = new org.telegram.ui.i11[1];
                        float L = org.telegram.messenger.g0.L(330.0f);
                        Point point = org.telegram.messenger.g0.q;
                        int min = (int) Math.min(L, point.y * 0.75f);
                        int min2 = (int) Math.min(org.telegram.messenger.g0.L(324.0f), point.x * 0.95f);
                        if (m5Var != null) {
                            m5Var.f();
                            em0Var4.c();
                            Rect rect = org.telegram.messenger.g0.Q;
                            rect.set(m5Var.getBounds());
                            int L2 = i16 == 1 ? (org.telegram.messenger.g0.L(12.0f) + (-rect.centerY())) - min : (-(em0Var4.getHeight() - rect.centerY())) - org.telegram.messenger.g0.L(16.0f);
                            i11 = org.telegram.messenger.g0.L(12.0f) + (rect.centerX() - (point.x - min2));
                            i10 = L2;
                        } else {
                            i10 = 0;
                            i11 = 0;
                        }
                        org.telegram.ui.bm0 bm0Var = new org.telegram.ui.bm0(fm0Var2, lm0Var, fm0Var2.getContext(), Integer.valueOf(i11), i16 == 1 ? 5 : 7, lm0Var.getResourceProvider(), i16 == 1 ? 24 : 16, em0Var4.a(), em0Var4, i11VarArr);
                        bm0Var.h1 = true;
                        long j10 = fm0Var2.n;
                        bm0Var.setSelected(j10 == 0 ? null : Long.valueOf(j10));
                        bm0Var.setSaveState(3);
                        bm0Var.y(m5Var, em0Var4);
                        org.telegram.ui.cm0 cm0Var = new org.telegram.ui.cm0(fm0Var2, bm0Var);
                        fm0Var2.p0 = cm0Var;
                        i11VarArr[0] = cm0Var;
                        cm0Var.showAsDropDown(em0Var4, 0, i10, (org.telegram.messenger.gd.a0 ? 3 : 5) | 48);
                        i11VarArr[0].b();
                    }
                    break;
                }
                break;
            default:
                org.telegram.ui.r11 r11Var = (org.telegram.ui.r11) this.c;
                boolean z11 = view instanceof org.telegram.ui.b11;
                int i17 = this.b;
                try {
                    if (!z11) {
                        if (!(view instanceof ImageView)) {
                            if (!(view instanceof org.telegram.ui.w01)) {
                                if (view != null) {
                                    view.callOnClick();
                                    break;
                                }
                            } else {
                                r11Var.i(i7, (org.telegram.ui.w01) view);
                                if (i17 != 1 && i17 != 11) {
                                    r11Var.performHapticFeedback(3, 1);
                                }
                            }
                        } else {
                            r11Var.o(view, null);
                            if (i17 != 1 && i17 != 11) {
                                r11Var.performHapticFeedback(3, 1);
                            }
                        }
                    } else {
                        org.telegram.ui.b11 b11Var = (org.telegram.ui.b11) view;
                        if (b11Var.s || (((p0Var = b11Var.y) != null && p0Var.a) || i17 == 13 || i17 == 14)) {
                            r11Var.l();
                            r11Var.r(b11Var, b11Var.y);
                        } else if (!b11Var.R || (document = b11Var.d) == null) {
                            r11Var.o(b11Var, b11Var.e);
                        } else if (r11Var.a0 == 6) {
                            r11Var.p(b11Var, Long.valueOf(document.id), document, b11Var.w, null);
                        } else {
                            r11Var.p(b11Var, null, document, b11Var.w, null);
                        }
                        if (i17 != 1 && i17 != 11) {
                            r11Var.performHapticFeedback(3, 1);
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
