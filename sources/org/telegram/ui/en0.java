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

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class en0 extends org.telegram.ui.Components.tk0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ int d;
    public final /* synthetic */ ln0 e;

    public en0(ln0 ln0Var, Context context, int i10) {
        this.e = ln0Var;
        this.c = context;
        this.d = i10;
    }

    @Override // org.telegram.ui.Components.tk0
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
        ln0 ln0Var = this.e;
        if (i10 == ln0Var.R || i10 == ln0Var.g0 || i10 == ln0Var.T || i10 == ln0Var.W) {
            return 2;
        }
        if (i10 == ln0Var.Q) {
            return 1;
        }
        if (i10 == ln0Var.S) {
            return 3;
        }
        if (i10 == ln0Var.U) {
            return 5;
        }
        if (i10 == ln0Var.V) {
            return 6;
        }
        if (i10 == ln0Var.h0) {
            return 10;
        }
        if (i10 == ln0Var.i0) {
            return 11;
        }
        if (i10 == ln0Var.a0) {
            return 7;
        }
        if (i10 >= ln0Var.b0 && i10 < ln0Var.c0) {
            return ln0Var.K == null ? 8 : 12;
        }
        if (i10 < ln0Var.d0 || i10 >= ln0Var.e0) {
            return (i10 == ln0Var.k0 - 1 || i10 == ln0Var.j0) ? 4 : 2;
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
        ln0 ln0Var = this.e;
        HashMap hashMap = ln0Var.M;
        ArrayList arrayList = ln0Var.l0;
        ArrayList arrayList2 = ln0Var.L;
        rn0 rn0Var = ln0Var.p0;
        int d = d(i10);
        int i12 = this.d;
        int i13 = 1;
        r11 = true;
        boolean z10 = true;
        int i14 = 0;
        switch (d) {
            case 1:
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, view, rn0Var.getResourceProvider());
                ((on0) view).updateColors();
                break;
            case 2:
                org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
                b9Var.setFixedSize(0);
                if (i10 != ln0Var.R) {
                    if (i10 != ln0Var.W) {
                        if (i10 == ln0Var.g0) {
                            b9Var.setText(org.telegram.messenger.dd.L0(2131743766, null));
                            break;
                        }
                    } else {
                        b9Var.setText("");
                        b9Var.setFixedSize(12);
                        break;
                    }
                } else {
                    if (i12 == 1) {
                        L0 = org.telegram.messenger.dd.L0(rn0Var.a ? 2131752434 : 2131743778, null);
                    } else {
                        L0 = org.telegram.messenger.dd.L0(rn0Var.a ? 2131752322 : 2131743760, null);
                    }
                    b9Var.setText(org.telegram.messenger.i0.G2(org.telegram.messenger.i0.T2(L0, new org.telegram.ui.Components.qq(this, i12, 16)), true));
                    break;
                }
                break;
            case 3:
                ((kn0) view).updateColors();
                break;
            case 6:
                org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
                p8Var.updateColors();
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, p8Var, rn0Var.getResourceProvider());
                p8Var.updateColors();
                if (i10 == ln0Var.V) {
                    p8Var.k(org.telegram.messenger.dd.L0(rn0Var.a ? 2131752324 : 2131743763, null), false);
                    break;
                }
                break;
            case 7:
                org.telegram.ui.Cells.p4 p4Var = (org.telegram.ui.Cells.p4) view;
                if (i10 == ln0Var.a0) {
                    p4Var.c(org.telegram.messenger.dd.L0(2131743767, null), false);
                }
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, p4Var, rn0Var.getResourceProvider());
                break;
            case 8:
                an0 an0Var = (an0) view;
                int i15 = i10 - ln0Var.b0;
                if (i15 >= 0 && i15 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(i15);
                    an0Var.a(i15, tL_starGiftUnique);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = ln0Var.r;
                    an0Var.b((tL_emojiStatusCollectible != null && tL_emojiStatusCollectible.collectible_id == tL_starGiftUnique.id) || ((tL_peerColorCollectible = ln0Var.s) != null && tL_peerColorCollectible.collectible_id == tL_starGiftUnique.id), false);
                    an0Var.d.invalidate();
                    break;
                }
                break;
            case 10:
                ln0Var.F = view;
                qn0 qn0Var = ln0Var.E;
                arrayList2.clear();
                hashMap.clear();
                i11 = ((org.telegram.ui.ActionBar.k2) rn0Var).currentAccount;
                ArrayList arrayList3 = rh.e6.y(i11, false).I;
                arrayList2.add(org.telegram.messenger.dd.L0(2131749955, null));
                int i16 = 0;
                int i17 = 0;
                while (i16 < arrayList3.size()) {
                    TL_stars.StarGift starGift = (TL_stars.StarGift) arrayList3.get(i16);
                    if ((i12 == 0 || (i12 == i13 && starGift.peer_color_available)) && starGift.availability_resale > 0) {
                        if (ln0Var.K == starGift) {
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
                dn0 dn0Var = new dn0(this, i14);
                ArrayList arrayList4 = qn0Var.f;
                boolean z11 = qn0Var.K == 0;
                qn0Var.K = 0;
                qn0Var.h = dn0Var;
                arrayList4.clear();
                arrayList4.addAll(arrayList2);
                qn0Var.c.f();
                qn0Var.a(i17, z11);
                ln0Var.l(qn0Var);
                view.post(new bn0(ln0Var, 3));
                break;
            case 11:
                ((jn0) view).updateColors();
                break;
            case 12:
                ph.c1 c1Var2 = (ph.c1) view;
                int i18 = i10 - ln0Var.b0;
                if (ln0Var.J != null && i18 >= 0 && i18 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(i18);
                    c1Var2.h(tL_starGiftUnique2, false, false, false, true, false);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = ln0Var.r;
                    if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.id) && ((tL_peerColorCollectible2 = ln0Var.s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique2.id)) {
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
        ln0 ln0Var = this.e;
        rn0 rn0Var = ln0Var.p0;
        switch (i10) {
            case 1:
                Context context = ln0Var.getContext();
                i11 = ((org.telegram.ui.ActionBar.k2) rn0Var).currentAccount;
                p6Var = ((org.telegram.ui.ActionBar.k2) rn0Var).resourceProvider;
                on0 on0Var = new on0(this.d, i11, context, p6Var);
                ln0Var.f = on0Var;
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, on0Var, rn0Var.getResourceProvider());
                on0Var.a(ln0Var.h, false);
                on0Var.setOnColorClick(new dn0(this, 1));
                view2 = on0Var;
                break;
            case 2:
            default:
                view2 = new org.telegram.ui.Cells.b9(ln0Var.getContext(), rn0Var.getResourceProvider());
                break;
            case 3:
                kn0 kn0Var = new kn0(ln0Var, ln0Var.getContext());
                ln0Var.D = kn0Var;
                kn0Var.b(false);
                view2 = kn0Var;
                break;
            case 4:
                View bnVar = new org.telegram.ui.Components.bn(ln0Var.getContext(), 16);
                bnVar.setTag(-33024);
                view = bnVar;
                view2 = view;
                break;
            case 5:
                View view3 = new View(ln0Var.getContext());
                view3.setTag(-33024);
                view = view3;
                view2 = view;
                break;
            case 6:
                View p8Var = new org.telegram.ui.Cells.p8(ln0Var.getContext(), rn0Var.getResourceProvider());
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, p8Var, rn0Var.getResourceProvider());
                view2 = p8Var;
                break;
            case 7:
                Context context2 = ln0Var.getContext();
                p6Var2 = ((org.telegram.ui.ActionBar.k2) rn0Var).resourceProvider;
                View p4Var = new org.telegram.ui.Cells.p4(context2, p6Var2);
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, p4Var, rn0Var.getResourceProvider());
                view2 = p4Var;
                break;
            case 8:
                Context context3 = ln0Var.getContext();
                p6Var3 = ((org.telegram.ui.ActionBar.k2) rn0Var).resourceProvider;
                View an0Var = new an0(context3, p6Var3, false);
                an0Var.setTag(-33024);
                view = an0Var;
                view2 = view;
                break;
            case 9:
                Context context4 = this.c;
                p6Var4 = ((org.telegram.ui.ActionBar.k2) rn0Var).resourceProvider;
                org.telegram.ui.Components.zz zzVar = new org.telegram.ui.Components.zz(context4, p6Var4);
                zzVar.setIsSingleCell(true);
                zzVar.setViewType(35);
                zzVar.setTag(-33024);
                view = zzVar;
                view2 = view;
                break;
            case 10:
                View bnVar2 = new org.telegram.ui.Components.bn(ln0Var.getContext(), 17);
                bnVar2.setTag(-33024);
                view = bnVar2;
                view2 = view;
                break;
            case 11:
                view2 = new jn0(ln0Var, ln0Var.getContext());
                break;
            case 12:
                Context context5 = ln0Var.getContext();
                i12 = ((org.telegram.ui.ActionBar.k2) rn0Var).currentAccount;
                p6Var5 = ((org.telegram.ui.ActionBar.k2) rn0Var).resourceProvider;
                View c1Var = new ph.c1(i12, context5, p6Var5);
                c1Var.setTag(-33024);
                view = c1Var;
                view2 = view;
                break;
        }
        return new org.telegram.ui.Components.dk0(view2);
    }

    @Override // s4.g0
    public final void y(s4.c1 c1Var) {
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        ln0 ln0Var = this.e;
        ArrayList arrayList = ln0Var.l0;
        int i10 = c1Var.f;
        View view = c1Var.a;
        if (i10 == 10) {
            ln0Var.F = view;
            view.post(new bn0(ln0Var, 2));
            return;
        }
        boolean z10 = true;
        if (i10 == 8) {
            an0 an0Var = (an0) view;
            int b10 = c1Var.b() - ln0Var.b0;
            if (b10 < 0 || b10 >= arrayList.size()) {
                return;
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(b10);
            an0Var.a(b10, tL_starGiftUnique);
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = ln0Var.r;
            if ((tL_emojiStatusCollectible == null || tL_emojiStatusCollectible.collectible_id != tL_starGiftUnique.id) && ((tL_peerColorCollectible2 = ln0Var.s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique.id)) {
                z10 = false;
            }
            an0Var.b(z10, false);
            return;
        }
        if (i10 == 12) {
            ph.c1 c1Var2 = (ph.c1) view;
            int b11 = c1Var.b() - ln0Var.b0;
            if (ln0Var.J != null && b11 >= 0 && b11 < arrayList.size()) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(b11);
                c1Var2.h(tL_starGiftUnique2, false, false, false, true, false);
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = ln0Var.r;
                if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.id) && ((tL_peerColorCollectible = ln0Var.s) == null || tL_peerColorCollectible.collectible_id != tL_starGiftUnique2.id)) {
                    z10 = false;
                }
                c1Var2.f(z10, false);
            }
        }
    }
}
