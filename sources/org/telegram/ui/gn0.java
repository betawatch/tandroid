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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class gn0 extends org.telegram.ui.Components.sk0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ int d;
    public final /* synthetic */ nn0 e;

    public gn0(nn0 nn0Var, Context context, int i10) {
        this.e = nn0Var;
        this.c = context;
        this.d = i10;
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        return i10 == 3 || i10 == 6 || i10 == 8 || i10 == 12;
    }

    @Override // s4.g0
    public final int b() {
        return this.e.k0;
    }

    @Override // s4.g0
    public final int d(int i10) {
        nn0 nn0Var = this.e;
        if (i10 == nn0Var.R || i10 == nn0Var.g0 || i10 == nn0Var.T || i10 == nn0Var.W) {
            return 2;
        }
        if (i10 == nn0Var.Q) {
            return 1;
        }
        if (i10 == nn0Var.S) {
            return 3;
        }
        if (i10 == nn0Var.U) {
            return 5;
        }
        if (i10 == nn0Var.V) {
            return 6;
        }
        if (i10 == nn0Var.h0) {
            return 10;
        }
        if (i10 == nn0Var.i0) {
            return 11;
        }
        if (i10 == nn0Var.a0) {
            return 7;
        }
        if (i10 >= nn0Var.b0 && i10 < nn0Var.c0) {
            return nn0Var.K == null ? 8 : 12;
        }
        if (i10 < nn0Var.d0 || i10 >= nn0Var.e0) {
            return (i10 == nn0Var.k0 - 1 || i10 == nn0Var.j0) ? 4 : 2;
        }
        return 9;
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        String L0;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        int i11;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        View view = c1Var.a;
        nn0 nn0Var = this.e;
        HashMap hashMap = nn0Var.M;
        ArrayList arrayList = nn0Var.l0;
        ArrayList arrayList2 = nn0Var.L;
        tn0 tn0Var = nn0Var.p0;
        int d = d(i10);
        int i12 = this.d;
        int i13 = 1;
        r11 = true;
        boolean z10 = true;
        int i14 = 0;
        switch (d) {
            case 1:
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, view, tn0Var.getResourceProvider());
                ((qn0) view).updateColors();
                break;
            case 2:
                org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
                b9Var.setFixedSize(0);
                if (i10 != nn0Var.R) {
                    if (i10 != nn0Var.W) {
                        if (i10 == nn0Var.g0) {
                            b9Var.setText(org.telegram.messenger.cd.L0(2131743766, null));
                            break;
                        }
                    } else {
                        b9Var.setText("");
                        b9Var.setFixedSize(12);
                        break;
                    }
                } else {
                    if (i12 == 1) {
                        L0 = org.telegram.messenger.cd.L0(tn0Var.a ? 2131752434 : 2131743778, null);
                    } else {
                        L0 = org.telegram.messenger.cd.L0(tn0Var.a ? 2131752322 : 2131743760, null);
                    }
                    b9Var.setText(org.telegram.messenger.i0.G2(org.telegram.messenger.i0.T2(L0, new org.telegram.ui.Components.qq(this, i12, 16)), true));
                    break;
                }
                break;
            case 3:
                ((mn0) view).updateColors();
                break;
            case 6:
                org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
                p8Var.updateColors();
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, p8Var, tn0Var.getResourceProvider());
                p8Var.updateColors();
                if (i10 == nn0Var.V) {
                    p8Var.k(org.telegram.messenger.cd.L0(tn0Var.a ? 2131752324 : 2131743763, null), false);
                    break;
                }
                break;
            case 7:
                org.telegram.ui.Cells.p4 p4Var = (org.telegram.ui.Cells.p4) view;
                if (i10 == nn0Var.a0) {
                    p4Var.c(org.telegram.messenger.cd.L0(2131743767, null), false);
                }
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, p4Var, tn0Var.getResourceProvider());
                break;
            case 8:
                cn0 cn0Var = (cn0) view;
                int i15 = i10 - nn0Var.b0;
                if (i15 >= 0 && i15 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(i15);
                    cn0Var.a(i15, tL_starGiftUnique);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = nn0Var.r;
                    cn0Var.b((tL_emojiStatusCollectible != null && tL_emojiStatusCollectible.collectible_id == tL_starGiftUnique.id) || ((tL_peerColorCollectible = nn0Var.s) != null && tL_peerColorCollectible.collectible_id == tL_starGiftUnique.id), false);
                    cn0Var.d.invalidate();
                    break;
                }
                break;
            case 10:
                nn0Var.F = view;
                sn0 sn0Var = nn0Var.E;
                arrayList2.clear();
                hashMap.clear();
                i11 = ((org.telegram.ui.ActionBar.k2) tn0Var).currentAccount;
                ArrayList arrayList3 = rh.e6.y(i11, false).I;
                arrayList2.add(org.telegram.messenger.cd.L0(2131749955, null));
                int i16 = 0;
                int i17 = 0;
                while (i16 < arrayList3.size()) {
                    TL_stars.StarGift starGift = (TL_stars.StarGift) arrayList3.get(i16);
                    if ((i12 == 0 || (i12 == i13 && starGift.peer_color_available)) && starGift.availability_resale > 0) {
                        if (nn0Var.K == starGift) {
                            i17 = arrayList2.size();
                        }
                        hashMap.put(Integer.valueOf(arrayList2.size()), starGift);
                        TextPaint textPaint = new TextPaint(i13);
                        textPaint.setTextSize(org.telegram.messenger.i0.L(14.0f));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
                        org.telegram.ui.Components.o5 o5Var = new org.telegram.ui.Components.o5(starGift.getDocument(), textPaint.getFontMetricsInt());
                        o5Var.size = org.telegram.messenger.i0.L(14.0f);
                        spannableStringBuilder.setSpan(o5Var, 0, 1, 33);
                        spannableStringBuilder.append(starGift.title);
                        arrayList2.add(spannableStringBuilder);
                    }
                    i16++;
                    i13 = 1;
                }
                fn0 fn0Var = new fn0(this, i14);
                ArrayList arrayList4 = sn0Var.f;
                boolean z11 = sn0Var.K == 0;
                sn0Var.K = 0;
                sn0Var.h = fn0Var;
                arrayList4.clear();
                arrayList4.addAll(arrayList2);
                sn0Var.c.f();
                sn0Var.a(i17, z11);
                nn0Var.l(sn0Var);
                view.post(new dn0(nn0Var, 3));
                break;
            case 11:
                ((ln0) view).updateColors();
                break;
            case 12:
                ph.c1 c1Var2 = (ph.c1) view;
                int i18 = i10 - nn0Var.b0;
                if (nn0Var.J != null && i18 >= 0 && i18 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(i18);
                    c1Var2.h(tL_starGiftUnique2, false, false, false, true, false);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = nn0Var.r;
                    if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.id) && ((tL_peerColorCollectible2 = nn0Var.s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique2.id)) {
                        z10 = false;
                    }
                    c1Var2.f(z10, false);
                    break;
                }
                break;
        }
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        int i11;
        org.telegram.ui.ActionBar.p6 p6Var;
        org.telegram.ui.ActionBar.p6 p6Var2;
        org.telegram.ui.ActionBar.p6 p6Var3;
        org.telegram.ui.ActionBar.p6 p6Var4;
        View view;
        View view2;
        int i12;
        org.telegram.ui.ActionBar.p6 p6Var5;
        nn0 nn0Var = this.e;
        tn0 tn0Var = nn0Var.p0;
        switch (i10) {
            case 1:
                Context context = nn0Var.getContext();
                i11 = ((org.telegram.ui.ActionBar.k2) tn0Var).currentAccount;
                p6Var = ((org.telegram.ui.ActionBar.k2) tn0Var).resourceProvider;
                qn0 qn0Var = new qn0(this.d, i11, context, p6Var);
                nn0Var.f = qn0Var;
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, qn0Var, tn0Var.getResourceProvider());
                qn0Var.a(nn0Var.h, false);
                qn0Var.setOnColorClick(new fn0(this, 1));
                view2 = qn0Var;
                break;
            case 2:
            default:
                view2 = new org.telegram.ui.Cells.b9(nn0Var.getContext(), tn0Var.getResourceProvider());
                break;
            case 3:
                mn0 mn0Var = new mn0(nn0Var, nn0Var.getContext());
                nn0Var.D = mn0Var;
                mn0Var.b(false);
                view2 = mn0Var;
                break;
            case 4:
                View bnVar = new org.telegram.ui.Components.bn(nn0Var.getContext(), 16);
                bnVar.setTag(-33024);
                view = bnVar;
                view2 = view;
                break;
            case 5:
                View view3 = new View(nn0Var.getContext());
                view3.setTag(-33024);
                view = view3;
                view2 = view;
                break;
            case 6:
                View p8Var = new org.telegram.ui.Cells.p8(nn0Var.getContext(), tn0Var.getResourceProvider());
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, p8Var, tn0Var.getResourceProvider());
                view2 = p8Var;
                break;
            case 7:
                Context context2 = nn0Var.getContext();
                p6Var2 = ((org.telegram.ui.ActionBar.k2) tn0Var).resourceProvider;
                View p4Var = new org.telegram.ui.Cells.p4(context2, p6Var2);
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, p4Var, tn0Var.getResourceProvider());
                view2 = p4Var;
                break;
            case 8:
                Context context3 = nn0Var.getContext();
                p6Var3 = ((org.telegram.ui.ActionBar.k2) tn0Var).resourceProvider;
                View cn0Var = new cn0(context3, p6Var3, false);
                cn0Var.setTag(-33024);
                view = cn0Var;
                view2 = view;
                break;
            case 9:
                Context context4 = this.c;
                p6Var4 = ((org.telegram.ui.ActionBar.k2) tn0Var).resourceProvider;
                org.telegram.ui.Components.zz zzVar = new org.telegram.ui.Components.zz(context4, p6Var4);
                zzVar.setIsSingleCell(true);
                zzVar.setViewType(35);
                zzVar.setTag(-33024);
                view = zzVar;
                view2 = view;
                break;
            case 10:
                View bnVar2 = new org.telegram.ui.Components.bn(nn0Var.getContext(), 17);
                bnVar2.setTag(-33024);
                view = bnVar2;
                view2 = view;
                break;
            case 11:
                view2 = new ln0(nn0Var, nn0Var.getContext());
                break;
            case 12:
                Context context5 = nn0Var.getContext();
                i12 = ((org.telegram.ui.ActionBar.k2) tn0Var).currentAccount;
                p6Var5 = ((org.telegram.ui.ActionBar.k2) tn0Var).resourceProvider;
                View c1Var = new ph.c1(i12, context5, p6Var5);
                c1Var.setTag(-33024);
                view = c1Var;
                view2 = view;
                break;
        }
        return new org.telegram.ui.Components.ck0(view2);
    }

    @Override // s4.g0
    public final void y(s4.c1 c1Var) {
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        nn0 nn0Var = this.e;
        ArrayList arrayList = nn0Var.l0;
        int i10 = c1Var.f;
        View view = c1Var.a;
        if (i10 == 10) {
            nn0Var.F = view;
            view.post(new dn0(nn0Var, 2));
            return;
        }
        boolean z10 = true;
        if (i10 == 8) {
            cn0 cn0Var = (cn0) view;
            int b10 = c1Var.b() - nn0Var.b0;
            if (b10 < 0 || b10 >= arrayList.size()) {
                return;
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(b10);
            cn0Var.a(b10, tL_starGiftUnique);
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = nn0Var.r;
            if ((tL_emojiStatusCollectible == null || tL_emojiStatusCollectible.collectible_id != tL_starGiftUnique.id) && ((tL_peerColorCollectible2 = nn0Var.s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique.id)) {
                z10 = false;
            }
            cn0Var.b(z10, false);
            return;
        }
        if (i10 == 12) {
            ph.c1 c1Var2 = (ph.c1) view;
            int b11 = c1Var.b() - nn0Var.b0;
            if (nn0Var.J != null && b11 >= 0 && b11 < arrayList.size()) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(b11);
                c1Var2.h(tL_starGiftUnique2, false, false, false, true, false);
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = nn0Var.r;
                if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.id) && ((tL_peerColorCollectible = nn0Var.s) == null || tL_peerColorCollectible.collectible_id != tL_starGiftUnique2.id)) {
                    z10 = false;
                }
                c1Var2.f(z10, false);
            }
        }
    }
}
