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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class dl0 implements gj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ FrameLayout c;

    public /* synthetic */ dl0(FrameLayout frameLayout, int i7, int i10) {
        this.a = i10;
        this.c = frameLayout;
        this.b = i7;
    }

    @Override // org.telegram.ui.Components.gj0
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
                il0 il0Var = (il0) this.c;
                org.telegram.ui.ActionBar.e2 e2Var = il0Var.H;
                di.i4 i4Var = il0Var.c;
                org.telegram.messenger.gj E = i4Var.E(i7);
                if (E != null) {
                    if (!il0Var.J.g0()) {
                        if (view instanceof fl0) {
                            org.telegram.ui.Cells.g7 g7Var = ((fl0) view).a;
                            org.telegram.messenger.gj message = g7Var.getMessage();
                            TLRPC.Document F0 = message.F0();
                            if (g7Var.H) {
                                if (message.h4() || org.telegram.messenger.gj.R4(message.k)) {
                                    MediaController.B().S(message);
                                    break;
                                } else {
                                    boolean x10 = message.x();
                                    if (!x10) {
                                        TLRPC.Message message2 = message.k;
                                        boolean z10 = message2 != null && message2.noforwards;
                                        if (E.k.peer_id.channel_id != 0) {
                                            j3 = 0;
                                            chat = org.telegram.messenger.np.s1(org.telegram.messenger.m10.t0).M0(Long.valueOf(E.k.peer_id.channel_id));
                                        } else {
                                            j3 = 0;
                                            chat = null;
                                        }
                                        if (chat == null) {
                                            chat = E.k.peer_id.chat_id != j3 ? org.telegram.messenger.np.s1(org.telegram.messenger.m10.t0).M0(Long.valueOf(E.k.peer_id.chat_id)) : null;
                                        }
                                        if (chat != null) {
                                            z10 = chat.noforwards;
                                        }
                                        x10 = x10 || z10;
                                    }
                                    if (x10) {
                                        PhotoViewer.p1().I2(null, e2Var, null);
                                        ArrayList arrayList = new ArrayList();
                                        arrayList.add(message);
                                        PhotoViewer.p1().I2(null, e2Var, null);
                                        PhotoViewer.p1().a2(arrayList, 0, 0L, 0L, 0L, new org.telegram.ui.mq0());
                                        break;
                                    } else {
                                        org.telegram.messenger.g0.s2(message, il0Var.G, e2Var);
                                    }
                                }
                            } else if (g7Var.G) {
                                org.telegram.messenger.w7.G(org.telegram.messenger.c.a(org.telegram.messenger.m10.t0).a).f(F0);
                                g7Var.f(true);
                            } else {
                                E.P = true;
                                org.telegram.messenger.w7.G(org.telegram.messenger.c.a(org.telegram.messenger.m10.t0).a).W(F0, E, 0, 0);
                                g7Var.f(true);
                                org.telegram.messenger.z5.q(this.b).y();
                            }
                            il0Var.d(true);
                        }
                        if (view instanceof org.telegram.ui.Cells.f7) {
                            ((org.telegram.ui.Cells.f7) view).a();
                            break;
                        }
                    } else {
                        il0Var.J.M(E, view, 0);
                        org.telegram.ui.sz szVar = il0Var.K;
                        int e12 = E.e1();
                        szVar.a = org.telegram.messenger.gj.B0(E.k);
                        szVar.b = e12;
                        i4Var.g(i7);
                        if (!il0Var.J.g0()) {
                            i4Var.k(0, ((il0) i4Var.d).r);
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
                                        dm0Var2.r = org.telegram.messenger.np.q0(tL_starGiftUnique);
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
                                    dm0Var2.r = org.telegram.messenger.np.q0(tL_starGiftUnique2);
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
                        e5 e5Var = cm0Var4.c;
                        org.telegram.ui.e11[] e11VarArr = new org.telegram.ui.e11[1];
                        float L = org.telegram.messenger.g0.L(330.0f);
                        Point point = org.telegram.messenger.g0.q;
                        int min = (int) Math.min(L, point.y * 0.75f);
                        int min2 = (int) Math.min(org.telegram.messenger.g0.L(324.0f), point.x * 0.95f);
                        if (e5Var != null) {
                            e5Var.f();
                            cm0Var4.c();
                            Rect rect = org.telegram.messenger.g0.Q;
                            rect.set(e5Var.getBounds());
                            int L2 = i16 == 1 ? (org.telegram.messenger.g0.L(12.0f) + (-rect.centerY())) - min : (-(cm0Var4.getHeight() - rect.centerY())) - org.telegram.messenger.g0.L(16.0f);
                            i11 = org.telegram.messenger.g0.L(12.0f) + (rect.centerX() - (point.x - min2));
                            i10 = L2;
                        } else {
                            i10 = 0;
                            i11 = 0;
                        }
                        org.telegram.ui.zl0 zl0Var = new org.telegram.ui.zl0(dm0Var2, jm0Var, dm0Var2.getContext(), Integer.valueOf(i11), i16 == 1 ? 5 : 7, jm0Var.getResourceProvider(), i16 == 1 ? 24 : 16, cm0Var4.a(), cm0Var4, e11VarArr);
                        zl0Var.h1 = true;
                        long j10 = dm0Var2.n;
                        zl0Var.setSelected(j10 == 0 ? null : Long.valueOf(j10));
                        zl0Var.setSaveState(3);
                        zl0Var.y(e5Var, cm0Var4);
                        org.telegram.ui.am0 am0Var = new org.telegram.ui.am0(dm0Var2, zl0Var);
                        dm0Var2.p0 = am0Var;
                        e11VarArr[0] = am0Var;
                        am0Var.showAsDropDown(cm0Var4, 0, i10, (org.telegram.messenger.hd.a0 ? 3 : 5) | 48);
                        e11VarArr[0].b();
                    }
                    break;
                }
                break;
            default:
                org.telegram.ui.n11 n11Var = (org.telegram.ui.n11) this.c;
                boolean z11 = view instanceof org.telegram.ui.x01;
                int i17 = this.b;
                try {
                    if (!z11) {
                        if (!(view instanceof ImageView)) {
                            if (!(view instanceof org.telegram.ui.s01)) {
                                if (view != null) {
                                    view.callOnClick();
                                    break;
                                }
                            } else {
                                n11Var.i(i7, (org.telegram.ui.s01) view);
                                if (i17 != 1 && i17 != 11) {
                                    n11Var.performHapticFeedback(3, 1);
                                }
                            }
                        } else {
                            n11Var.o(view, null);
                            if (i17 != 1 && i17 != 11) {
                                n11Var.performHapticFeedback(3, 1);
                            }
                        }
                    } else {
                        org.telegram.ui.x01 x01Var = (org.telegram.ui.x01) view;
                        if (x01Var.s || (((p0Var = x01Var.y) != null && p0Var.a) || i17 == 13 || i17 == 14)) {
                            n11Var.l();
                            n11Var.r(x01Var, x01Var.y);
                        } else if (!x01Var.R || (document = x01Var.d) == null) {
                            n11Var.o(x01Var, x01Var.e);
                        } else if (n11Var.a0 == 6) {
                            n11Var.p(x01Var, Long.valueOf(document.id), document, x01Var.w, null);
                        } else {
                            n11Var.p(x01Var, null, document, x01Var.w, null);
                        }
                        if (i17 != 1 && i17 != 11) {
                            n11Var.performHapticFeedback(3, 1);
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
