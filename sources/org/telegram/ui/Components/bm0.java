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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class bm0 implements gk0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ FrameLayout c;

    public /* synthetic */ bm0(FrameLayout frameLayout, int i10, int i11) {
        this.a = i11;
        this.c = frameLayout;
        this.b = i10;
    }

    @Override // org.telegram.ui.Components.gk0
    public final void f(int i10, View view) {
        long j10;
        TLRPC.Chat chat;
        org.telegram.ui.rn0 rn0Var;
        org.telegram.ui.nn0 nn0Var;
        int i11;
        int i12;
        sg.o0 o0Var;
        TLRPC.Document document;
        switch (this.a) {
            case 0:
                gm0 gm0Var = (gm0) this.c;
                org.telegram.ui.ActionBar.k2 k2Var = gm0Var.G;
                kg.f fVar = gm0Var.c;
                org.telegram.messenger.jj E = fVar.E(i10);
                if (E != null) {
                    if (!gm0Var.I.f()) {
                        if (view instanceof dm0) {
                            org.telegram.ui.Cells.l7 l7Var = ((dm0) view).a;
                            org.telegram.messenger.jj message = l7Var.getMessage();
                            TLRPC.Document F0 = message.F0();
                            if (l7Var.G) {
                                if (message.h4() || org.telegram.messenger.jj.R4(message.k)) {
                                    MediaController.B().S(message);
                                    break;
                                } else {
                                    boolean x10 = message.x();
                                    if (!x10) {
                                        TLRPC.Message message2 = message.k;
                                        boolean z10 = message2 != null && message2.noforwards;
                                        if (E.k.peer_id.channel_id != 0) {
                                            j10 = 0;
                                            chat = org.telegram.messenger.vp.r1(org.telegram.messenger.d20.s0).L0(Long.valueOf(E.k.peer_id.channel_id));
                                        } else {
                                            j10 = 0;
                                            chat = null;
                                        }
                                        if (chat == null) {
                                            chat = E.k.peer_id.chat_id != j10 ? org.telegram.messenger.vp.r1(org.telegram.messenger.d20.s0).L0(Long.valueOf(E.k.peer_id.chat_id)) : null;
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
                                        PhotoViewer.v1().e2(arrayList, 0, 0L, 0L, 0L, new org.telegram.ui.yr0());
                                        break;
                                    } else {
                                        org.telegram.messenger.i0.s2(message, gm0Var.F, k2Var);
                                    }
                                }
                            } else if (l7Var.F) {
                                org.telegram.messenger.b8.G(org.telegram.messenger.c.a(org.telegram.messenger.d20.s0).a).f(F0);
                                l7Var.f(true);
                            } else {
                                E.P = true;
                                org.telegram.messenger.b8.G(org.telegram.messenger.c.a(org.telegram.messenger.d20.s0).a).X(F0, E, 0, 0);
                                l7Var.f(true);
                                org.telegram.messenger.b6.q(this.b).y();
                            }
                            gm0Var.d(true);
                        }
                        if (view instanceof org.telegram.ui.Cells.k7) {
                            ((org.telegram.ui.Cells.k7) view).a();
                            break;
                        }
                    } else {
                        gm0Var.I.e(E, view, 0);
                        org.telegram.ui.s00 s00Var = gm0Var.J;
                        int f12 = E.f1();
                        s00Var.a = org.telegram.messenger.jj.B0(E.k);
                        s00Var.b = f12;
                        fVar.g(i10);
                        if (!gm0Var.I.f()) {
                            fVar.k(0, ((gm0) fVar.d).r);
                            break;
                        }
                    }
                }
                break;
            case 1:
                org.telegram.ui.nn0 nn0Var2 = (org.telegram.ui.nn0) this.c;
                org.telegram.ui.tn0 tn0Var = nn0Var2.p0;
                ArrayList arrayList2 = nn0Var2.l0;
                if (!(view instanceof org.telegram.ui.mn0)) {
                    int i13 = nn0Var2.V;
                    int i14 = this.b;
                    if (i10 != i13) {
                        int i15 = nn0Var2.b0;
                        if (i10 >= i15 && i10 < nn0Var2.c0) {
                            int i16 = i10 - i15;
                            if (nn0Var2.K != null) {
                                if (nn0Var2.J != null && i16 >= 0 && i16 < arrayList2.size()) {
                                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList2.get(i16);
                                    if (i14 == 1) {
                                        TLRPC.PeerColor peerColor = tL_starGiftUnique.peer_color;
                                        if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                                            nn0Var2.n = 0L;
                                            nn0Var2.h = -1;
                                            nn0Var2.r = null;
                                            nn0Var2.s = (TLRPC.TL_peerColorCollectible) peerColor;
                                        }
                                    } else {
                                        nn0Var2.n = 0L;
                                        nn0Var2.h = -1;
                                        nn0Var2.r = org.telegram.messenger.vp.q0(tL_starGiftUnique);
                                        nn0Var2.s = null;
                                    }
                                    nn0Var2.I = tL_starGiftUnique;
                                    nn0Var2.j(true);
                                    nn0Var2.i();
                                    nn0Var2.f(true);
                                    org.telegram.ui.mn0 mn0Var = nn0Var2.D;
                                    if (mn0Var != null) {
                                        mn0Var.b(true);
                                        break;
                                    }
                                }
                            } else if (i16 >= 0 && i16 < arrayList2.size()) {
                                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList2.get(i16);
                                if (i14 == 1) {
                                    TLRPC.PeerColor peerColor2 = tL_starGiftUnique2.peer_color;
                                    if (peerColor2 instanceof TLRPC.TL_peerColorCollectible) {
                                        nn0Var2.n = 0L;
                                        nn0Var2.h = -1;
                                        nn0Var2.I = null;
                                        nn0Var2.r = null;
                                        nn0Var2.s = (TLRPC.TL_peerColorCollectible) peerColor2;
                                    }
                                } else {
                                    nn0Var2.n = 0L;
                                    nn0Var2.h = -1;
                                    nn0Var2.I = null;
                                    nn0Var2.r = org.telegram.messenger.vp.q0(tL_starGiftUnique2);
                                    nn0Var2.s = null;
                                }
                                nn0Var2.j(true);
                                nn0Var2.i();
                                nn0Var2.f(true);
                                org.telegram.ui.mn0 mn0Var2 = nn0Var2.D;
                                if (mn0Var2 != null) {
                                    mn0Var2.b(true);
                                    break;
                                }
                            }
                        }
                    } else {
                        nn0Var2.h = -1;
                        nn0Var2.n = 0L;
                        nn0Var2.r = null;
                        nn0Var2.s = null;
                        nn0Var2.I = null;
                        nn0Var2.i();
                        if (i14 == 0) {
                            tn0Var.h.i();
                        }
                        org.telegram.ui.mn0 mn0Var3 = nn0Var2.D;
                        if (mn0Var3 != null) {
                            mn0Var3.b(true);
                        }
                        nn0Var2.j(true);
                        nn0Var2.f(true);
                        org.telegram.ui.nn0 nn0Var3 = tn0Var.n;
                        if (nn0Var3 != null && (rn0Var = nn0Var3.a) != null && (nn0Var = tn0Var.h) != null) {
                            rn0Var.a(nn0Var.h);
                            break;
                        }
                    }
                } else {
                    org.telegram.ui.mn0 mn0Var4 = (org.telegram.ui.mn0) view;
                    int i17 = nn0Var2.m0;
                    if (nn0Var2.o0 == null) {
                        d5 d5Var = mn0Var4.c;
                        org.telegram.ui.z21[] z21VarArr = new org.telegram.ui.z21[1];
                        float L = org.telegram.messenger.i0.L(330.0f);
                        Point point = org.telegram.messenger.i0.q;
                        int min = (int) Math.min(L, point.y * 0.75f);
                        int min2 = (int) Math.min(org.telegram.messenger.i0.L(324.0f), point.x * 0.95f);
                        if (d5Var != null) {
                            d5Var.f();
                            mn0Var4.c();
                            Rect rect = org.telegram.messenger.i0.Q;
                            rect.set(d5Var.getBounds());
                            int L2 = i17 == 1 ? (org.telegram.messenger.i0.L(12.0f) + (-rect.centerY())) - min : (-(mn0Var4.getHeight() - rect.centerY())) - org.telegram.messenger.i0.L(16.0f);
                            i12 = org.telegram.messenger.i0.L(12.0f) + (rect.centerX() - (point.x - min2));
                            i11 = L2;
                        } else {
                            i11 = 0;
                            i12 = 0;
                        }
                        org.telegram.ui.jn0 jn0Var = new org.telegram.ui.jn0(nn0Var2, tn0Var, nn0Var2.getContext(), Integer.valueOf(i12), i17 == 1 ? 5 : 7, tn0Var.getResourceProvider(), i17 == 1 ? 24 : 16, mn0Var4.a(), mn0Var4, z21VarArr);
                        jn0Var.g1 = true;
                        long j11 = nn0Var2.n;
                        jn0Var.setSelected(j11 == 0 ? null : Long.valueOf(j11));
                        jn0Var.setSaveState(3);
                        jn0Var.y(d5Var, mn0Var4);
                        org.telegram.ui.kn0 kn0Var = new org.telegram.ui.kn0(nn0Var2, jn0Var);
                        nn0Var2.o0 = kn0Var;
                        z21VarArr[0] = kn0Var;
                        kn0Var.showAsDropDown(mn0Var4, 0, i11, (org.telegram.messenger.cd.X ? 3 : 5) | 48);
                        z21VarArr[0].b();
                    }
                    break;
                }
                break;
            default:
                org.telegram.ui.i31 i31Var = (org.telegram.ui.i31) this.c;
                boolean z11 = view instanceof org.telegram.ui.s21;
                int i18 = this.b;
                try {
                    if (!z11) {
                        if (!(view instanceof ImageView)) {
                            if (!(view instanceof org.telegram.ui.n21)) {
                                if (view != null) {
                                    view.callOnClick();
                                    break;
                                }
                            } else {
                                i31Var.i(i10, (org.telegram.ui.n21) view);
                                if (i18 != 1 && i18 != 11) {
                                    i31Var.performHapticFeedback(3, 1);
                                }
                            }
                        } else {
                            i31Var.o(view, null);
                            if (i18 != 1 && i18 != 11) {
                                i31Var.performHapticFeedback(3, 1);
                            }
                        }
                    } else {
                        org.telegram.ui.s21 s21Var = (org.telegram.ui.s21) view;
                        if (s21Var.s || (((o0Var = s21Var.y) != null && o0Var.a) || i18 == 13 || i18 == 14)) {
                            i31Var.l();
                            i31Var.r(s21Var, s21Var.y);
                        } else if (!s21Var.Q || (document = s21Var.d) == null) {
                            i31Var.o(s21Var, s21Var.e);
                        } else if (i31Var.W == 6) {
                            i31Var.p(s21Var, Long.valueOf(document.id), document, s21Var.w, null);
                        } else {
                            i31Var.p(s21Var, null, document, s21Var.w, null);
                        }
                        if (i18 != 1 && i18 != 11) {
                            i31Var.performHapticFeedback(3, 1);
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
