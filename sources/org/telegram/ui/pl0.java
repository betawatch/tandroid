package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class pl0 extends org.telegram.ui.Components.sj0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ int d;
    public final /* synthetic */ wl0 e;

    public pl0(wl0 wl0Var, Context context, int i3) {
        this.e = wl0Var;
        this.c = context;
        this.d = i3;
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        int i3 = d1Var.f;
        return i3 == 3 || i3 == 6 || i3 == 8 || i3 == 12;
    }

    @Override // u4.h0
    public final int b() {
        return this.e.l0;
    }

    @Override // u4.h0
    public final int d(int i3) {
        wl0 wl0Var = this.e;
        if (i3 == wl0Var.S || i3 == wl0Var.h0 || i3 == wl0Var.U || i3 == wl0Var.a0) {
            return 2;
        }
        if (i3 == wl0Var.R) {
            return 1;
        }
        if (i3 == wl0Var.T) {
            return 3;
        }
        if (i3 == wl0Var.V) {
            return 5;
        }
        if (i3 == wl0Var.W) {
            return 6;
        }
        if (i3 == wl0Var.i0) {
            return 10;
        }
        if (i3 == wl0Var.j0) {
            return 11;
        }
        if (i3 == wl0Var.b0) {
            return 7;
        }
        if (i3 >= wl0Var.c0 && i3 < wl0Var.d0) {
            return wl0Var.L == null ? 8 : 12;
        }
        if (i3 < wl0Var.e0 || i3 >= wl0Var.f0) {
            return (i3 == wl0Var.l0 - 1 || i3 == wl0Var.k0) ? 4 : 2;
        }
        return 9;
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        String M0;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        int i10;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        View view = d1Var.a;
        wl0 wl0Var = this.e;
        HashMap hashMap = wl0Var.N;
        ArrayList arrayList = wl0Var.m0;
        ArrayList arrayList2 = wl0Var.M;
        cm0 cm0Var = wl0Var.q0;
        int d = d(i3);
        int i11 = this.d;
        int i12 = 1;
        r11 = true;
        boolean z10 = true;
        int i13 = 0;
        switch (d) {
            case 1:
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, view, cm0Var.getResourceProvider());
                ((zl0) view).updateColors();
                break;
            case 2:
                org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
                y8Var.setFixedSize(0);
                if (i3 != wl0Var.S) {
                    if (i3 != wl0Var.a0) {
                        if (i3 == wl0Var.h0) {
                            y8Var.setText(org.telegram.messenger.bd.M0(2131743750, null));
                            break;
                        }
                    } else {
                        y8Var.setText("");
                        y8Var.setFixedSize(12);
                        break;
                    }
                } else {
                    if (i11 == 1) {
                        M0 = org.telegram.messenger.bd.M0(cm0Var.a ? 2131752434 : 2131743762, null);
                    } else {
                        M0 = org.telegram.messenger.bd.M0(cm0Var.a ? 2131752322 : 2131743744, null);
                    }
                    y8Var.setText(org.telegram.messenger.g0.H2(org.telegram.messenger.g0.U2(M0, new org.telegram.ui.Components.o2(this, i11, 21)), true));
                    break;
                }
                break;
            case 3:
                ((vl0) view).updateColors();
                break;
            case 6:
                org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view;
                l8Var.updateColors();
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, l8Var, cm0Var.getResourceProvider());
                l8Var.updateColors();
                if (i3 == wl0Var.W) {
                    l8Var.k(org.telegram.messenger.bd.M0(cm0Var.a ? 2131752324 : 2131743747, null), false);
                    break;
                }
                break;
            case 7:
                org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                if (i3 == wl0Var.b0) {
                    n4Var.c(org.telegram.messenger.bd.M0(2131743751, null), false);
                }
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, n4Var, cm0Var.getResourceProvider());
                break;
            case 8:
                ll0 ll0Var = (ll0) view;
                int i14 = i3 - wl0Var.c0;
                if (i14 >= 0 && i14 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(i14);
                    ll0Var.a(i14, tL_starGiftUnique);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = wl0Var.r;
                    ll0Var.b((tL_emojiStatusCollectible != null && tL_emojiStatusCollectible.collectible_id == tL_starGiftUnique.id) || ((tL_peerColorCollectible = wl0Var.s) != null && tL_peerColorCollectible.collectible_id == tL_starGiftUnique.id), false);
                    ll0Var.d.invalidate();
                    break;
                }
                break;
            case 10:
                wl0Var.G = view;
                bm0 bm0Var = wl0Var.F;
                arrayList2.clear();
                hashMap.clear();
                i10 = ((org.telegram.ui.ActionBar.d2) cm0Var).currentAccount;
                ArrayList arrayList3 = ci.e9.y(i10, false).I;
                arrayList2.add(org.telegram.messenger.bd.M0(2131749954, null));
                int i15 = 0;
                int i16 = 0;
                while (i15 < arrayList3.size()) {
                    TL_stars.StarGift starGift = (TL_stars.StarGift) arrayList3.get(i15);
                    if ((i11 == 0 || (i11 == i12 && starGift.peer_color_available)) && starGift.availability_resale > 0) {
                        if (wl0Var.L == starGift) {
                            i16 = arrayList2.size();
                        }
                        hashMap.put(Integer.valueOf(arrayList2.size()), starGift);
                        TextPaint textPaint = new TextPaint(i12);
                        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
                        org.telegram.ui.Components.p5 p5Var = new org.telegram.ui.Components.p5(starGift.getDocument(), textPaint.getFontMetricsInt());
                        p5Var.size = org.telegram.messenger.g0.L(14.0f);
                        spannableStringBuilder.setSpan(p5Var, 0, 1, 33);
                        spannableStringBuilder.append(starGift.title);
                        arrayList2.add(spannableStringBuilder);
                    }
                    i15++;
                    i12 = 1;
                }
                ol0 ol0Var = new ol0(this, i13);
                ArrayList arrayList4 = bm0Var.f;
                boolean z11 = bm0Var.L == 0;
                bm0Var.L = 0;
                bm0Var.h = ol0Var;
                arrayList4.clear();
                arrayList4.addAll(arrayList2);
                bm0Var.c.f();
                bm0Var.a(i16, z11);
                wl0Var.l(bm0Var);
                view.post(new ml0(wl0Var, 3));
                break;
            case 11:
                ((ul0) view).updateColors();
                break;
            case 12:
                ai.q2 q2Var = (ai.q2) view;
                int i17 = i3 - wl0Var.c0;
                if (wl0Var.K != null && i17 >= 0 && i17 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(i17);
                    q2Var.h(tL_starGiftUnique2, false, false, false, true, false);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = wl0Var.r;
                    if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.id) && ((tL_peerColorCollectible2 = wl0Var.s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique2.id)) {
                        z10 = false;
                    }
                    q2Var.f(z10, false);
                    break;
                }
                break;
        }
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        int i10;
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        org.telegram.ui.ActionBar.e6 e6Var3;
        org.telegram.ui.ActionBar.e6 e6Var4;
        View view;
        View view2;
        int i11;
        org.telegram.ui.ActionBar.e6 e6Var5;
        wl0 wl0Var = this.e;
        cm0 cm0Var = wl0Var.q0;
        switch (i3) {
            case 1:
                Context context = wl0Var.getContext();
                i10 = ((org.telegram.ui.ActionBar.d2) cm0Var).currentAccount;
                e6Var = ((org.telegram.ui.ActionBar.d2) cm0Var).resourceProvider;
                zl0 zl0Var = new zl0(this.d, i10, context, e6Var);
                wl0Var.f = zl0Var;
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, zl0Var, cm0Var.getResourceProvider());
                zl0Var.a(wl0Var.h, false);
                zl0Var.setOnColorClick(new ol0(this, 1));
                view2 = zl0Var;
                break;
            case 2:
            default:
                view2 = new org.telegram.ui.Cells.y8(wl0Var.getContext(), cm0Var.getResourceProvider());
                break;
            case 3:
                vl0 vl0Var = new vl0(wl0Var, wl0Var.getContext());
                wl0Var.E = vl0Var;
                vl0Var.b(false);
                view2 = vl0Var;
                break;
            case 4:
                View smVar = new org.telegram.ui.Components.sm(wl0Var.getContext(), 20);
                smVar.setTag(-33024);
                view = smVar;
                view2 = view;
                break;
            case 5:
                View view3 = new View(wl0Var.getContext());
                view3.setTag(-33024);
                view = view3;
                view2 = view;
                break;
            case 6:
                View l8Var = new org.telegram.ui.Cells.l8(wl0Var.getContext(), cm0Var.getResourceProvider());
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, l8Var, cm0Var.getResourceProvider());
                view2 = l8Var;
                break;
            case 7:
                Context context2 = wl0Var.getContext();
                e6Var2 = ((org.telegram.ui.ActionBar.d2) cm0Var).resourceProvider;
                View n4Var = new org.telegram.ui.Cells.n4(context2, e6Var2);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, n4Var, cm0Var.getResourceProvider());
                view2 = n4Var;
                break;
            case 8:
                Context context3 = wl0Var.getContext();
                e6Var3 = ((org.telegram.ui.ActionBar.d2) cm0Var).resourceProvider;
                View ll0Var = new ll0(context3, e6Var3, false);
                ll0Var.setTag(-33024);
                view = ll0Var;
                view2 = view;
                break;
            case 9:
                Context context4 = this.c;
                e6Var4 = ((org.telegram.ui.ActionBar.d2) cm0Var).resourceProvider;
                org.telegram.ui.Components.iz izVar = new org.telegram.ui.Components.iz(context4, e6Var4);
                izVar.setIsSingleCell(true);
                izVar.setViewType(35);
                izVar.setTag(-33024);
                view = izVar;
                view2 = view;
                break;
            case 10:
                View smVar2 = new org.telegram.ui.Components.sm(wl0Var.getContext(), 21);
                smVar2.setTag(-33024);
                view = smVar2;
                view2 = view;
                break;
            case 11:
                view2 = new ul0(wl0Var, wl0Var.getContext());
                break;
            case 12:
                Context context5 = wl0Var.getContext();
                i11 = ((org.telegram.ui.ActionBar.d2) cm0Var).currentAccount;
                e6Var5 = ((org.telegram.ui.ActionBar.d2) cm0Var).resourceProvider;
                View q2Var = new ai.q2(i11, context5, e6Var5);
                q2Var.setTag(-33024);
                view = q2Var;
                view2 = view;
                break;
        }
        return new org.telegram.ui.Components.bj0(view2);
    }

    @Override // u4.h0
    public final void y(u4.d1 d1Var) {
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        wl0 wl0Var = this.e;
        ArrayList arrayList = wl0Var.m0;
        int i3 = d1Var.f;
        View view = d1Var.a;
        if (i3 == 10) {
            wl0Var.G = view;
            view.post(new ml0(wl0Var, 2));
            return;
        }
        boolean z10 = true;
        if (i3 == 8) {
            ll0 ll0Var = (ll0) view;
            int b10 = d1Var.b() - wl0Var.c0;
            if (b10 < 0 || b10 >= arrayList.size()) {
                return;
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(b10);
            ll0Var.a(b10, tL_starGiftUnique);
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = wl0Var.r;
            if ((tL_emojiStatusCollectible == null || tL_emojiStatusCollectible.collectible_id != tL_starGiftUnique.id) && ((tL_peerColorCollectible2 = wl0Var.s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique.id)) {
                z10 = false;
            }
            ll0Var.b(z10, false);
            return;
        }
        if (i3 == 12) {
            ai.q2 q2Var = (ai.q2) view;
            int b11 = d1Var.b() - wl0Var.c0;
            if (wl0Var.K != null && b11 >= 0 && b11 < arrayList.size()) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(b11);
                q2Var.h(tL_starGiftUnique2, false, false, false, true, false);
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = wl0Var.r;
                if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.id) && ((tL_peerColorCollectible = wl0Var.s) == null || tL_peerColorCollectible.collectible_id != tL_starGiftUnique2.id)) {
                    z10 = false;
                }
                q2Var.f(z10, false);
            }
        }
    }
}
