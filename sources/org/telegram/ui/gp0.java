package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class gp0 extends org.telegram.ui.Components.mm0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ int d;
    public final /* synthetic */ np0 e;

    public gp0(np0 np0Var, Context context, int i10) {
        this.e = np0Var;
        this.c = context;
        this.d = i10;
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean D(s4.e1 e1Var) {
        int i10 = e1Var.f;
        return i10 == 3 || i10 == 6 || i10 == 8 || i10 == 12;
    }

    @Override // s4.h0
    public final int h() {
        return this.e.k0;
    }

    @Override // s4.h0
    public final int j(int i10) {
        np0 np0Var = this.e;
        if (i10 == np0Var.R || i10 == np0Var.g0 || i10 == np0Var.T || i10 == np0Var.W) {
            return 2;
        }
        if (i10 == np0Var.Q) {
            return 1;
        }
        if (i10 == np0Var.S) {
            return 3;
        }
        if (i10 == np0Var.U) {
            return 5;
        }
        if (i10 == np0Var.V) {
            return 6;
        }
        if (i10 == np0Var.h0) {
            return 10;
        }
        if (i10 == np0Var.i0) {
            return 11;
        }
        if (i10 == np0Var.a0) {
            return 7;
        }
        if (i10 >= np0Var.b0 && i10 < np0Var.c0) {
            return np0Var.K == null ? 8 : 12;
        }
        if (i10 < np0Var.d0 || i10 >= np0Var.e0) {
            return (i10 == np0Var.k0 - 1 || i10 == np0Var.j0) ? 4 : 2;
        }
        return 9;
    }

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        String string;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        int i11;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        View view = e1Var.a;
        np0 np0Var = this.e;
        HashMap hashMap = np0Var.M;
        ArrayList arrayList = np0Var.l0;
        ArrayList arrayList2 = np0Var.L;
        tp0 tp0Var = np0Var.p0;
        int j10 = j(i10);
        int i12 = this.d;
        int i13 = 1;
        r10 = true;
        boolean z10 = true;
        switch (j10) {
            case 1:
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, view, tp0Var.getResourceProvider());
                ((qp0) view).updateColors();
                break;
            case 2:
                org.telegram.ui.Cells.i9 i9Var = (org.telegram.ui.Cells.i9) view;
                i9Var.setFixedSize(0);
                if (i10 != np0Var.R) {
                    if (i10 != np0Var.W) {
                        if (i10 == np0Var.g0) {
                            i9Var.setText(LocaleController.getString(R.string.UserProfileCollectibleInfo));
                            break;
                        }
                    } else {
                        i9Var.setText("");
                        i9Var.setFixedSize(12);
                        break;
                    }
                } else {
                    if (i12 == 1) {
                        string = LocaleController.getString(tp0Var.a ? R.string.ChannelColorHint : R.string.UserColorHint);
                    } else {
                        string = LocaleController.getString(tp0Var.a ? R.string.ChannelProfileHint : R.string.UserProfileHint2);
                    }
                    i9Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string, new org.telegram.ui.Components.h2(this, i12, 24)), true));
                    break;
                }
                break;
            case 3:
                ((mp0) view).updateColors();
                break;
            case 6:
                org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) view;
                v8Var.updateColors();
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, v8Var, tp0Var.getResourceProvider());
                v8Var.updateColors();
                if (i10 == np0Var.V) {
                    v8Var.k(LocaleController.getString(tp0Var.a ? R.string.ChannelProfileColorReset : R.string.UserProfileColorReset), false);
                    break;
                }
                break;
            case 7:
                org.telegram.ui.Cells.q4 q4Var = (org.telegram.ui.Cells.q4) view;
                if (i10 == np0Var.a0) {
                    q4Var.c(LocaleController.getString(R.string.UserProfileCollectibleHeader), false);
                }
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, q4Var, tp0Var.getResourceProvider());
                break;
            case 8:
                bp0 bp0Var = (bp0) view;
                int i14 = i10 - np0Var.b0;
                if (i14 >= 0 && i14 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(i14);
                    bp0Var.a(i14, tL_starGiftUnique);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = np0Var.r;
                    bp0Var.b((tL_emojiStatusCollectible != null && tL_emojiStatusCollectible.collectible_id == tL_starGiftUnique.id) || ((tL_peerColorCollectible = np0Var.s) != null && tL_peerColorCollectible.collectible_id == tL_starGiftUnique.id), false);
                    bp0Var.d.invalidate();
                    break;
                }
                break;
            case 10:
                np0Var.F = view;
                sp0 sp0Var = np0Var.E;
                arrayList2.clear();
                hashMap.clear();
                i11 = ((org.telegram.ui.ActionBar.r2) tp0Var).currentAccount;
                ArrayList arrayList3 = bi.ca.y(i11, false).I;
                arrayList2.add(LocaleController.getString(R.string.Gift2TabMine));
                int i15 = 0;
                int i16 = 0;
                while (i15 < arrayList3.size()) {
                    TL_stars.StarGift starGift = (TL_stars.StarGift) arrayList3.get(i15);
                    if ((i12 == 0 || (i12 == i13 && starGift.peer_color_available)) && starGift.availability_resale > 0) {
                        if (np0Var.K == starGift) {
                            i16 = arrayList2.size();
                        }
                        hashMap.put(Integer.valueOf(arrayList2.size()), starGift);
                        TextPaint textPaint = new TextPaint(i13);
                        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
                        org.telegram.ui.Components.c6 c6Var = new org.telegram.ui.Components.c6(starGift.getDocument(), textPaint.getFontMetricsInt());
                        c6Var.size = AndroidUtilities.dp(14.0f);
                        spannableStringBuilder.setSpan(c6Var, 0, 1, 33);
                        spannableStringBuilder.append(starGift.title);
                        arrayList2.add(spannableStringBuilder);
                    }
                    i15++;
                    i13 = 1;
                }
                fp0 fp0Var = new fp0(this, 0);
                ArrayList arrayList4 = sp0Var.f;
                boolean z11 = sp0Var.K == 0;
                sp0Var.K = 0;
                sp0Var.h = fp0Var;
                arrayList4.clear();
                arrayList4.addAll(arrayList2);
                sp0Var.c.l();
                sp0Var.a(i16, z11);
                np0Var.l(sp0Var);
                view.post(new dp0(np0Var, 3));
                break;
            case 11:
                ((lp0) view).updateColors();
                break;
            case 12:
                zh.g1 g1Var = (zh.g1) view;
                int i17 = i10 - np0Var.b0;
                if (np0Var.J != null && i17 >= 0 && i17 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(i17);
                    g1Var.h(tL_starGiftUnique2, false, false, false, true, false);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = np0Var.r;
                    if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.id) && ((tL_peerColorCollectible2 = np0Var.s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique2.id)) {
                        z10 = false;
                    }
                    g1Var.f(z10, false);
                    break;
                }
                break;
        }
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        int i11;
        org.telegram.ui.ActionBar.u6 u6Var;
        org.telegram.ui.ActionBar.u6 u6Var2;
        org.telegram.ui.ActionBar.u6 u6Var3;
        org.telegram.ui.ActionBar.u6 u6Var4;
        View view;
        View view2;
        int i12;
        org.telegram.ui.ActionBar.u6 u6Var5;
        np0 np0Var = this.e;
        tp0 tp0Var = np0Var.p0;
        switch (i10) {
            case 1:
                Context context = np0Var.getContext();
                i11 = ((org.telegram.ui.ActionBar.r2) tp0Var).currentAccount;
                u6Var = ((org.telegram.ui.ActionBar.r2) tp0Var).resourceProvider;
                qp0 qp0Var = new qp0(this.d, i11, context, u6Var);
                np0Var.f = qp0Var;
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, qp0Var, tp0Var.getResourceProvider());
                qp0Var.a(np0Var.h, false);
                qp0Var.setOnColorClick(new fp0(this, 1));
                view2 = qp0Var;
                break;
            case 2:
            default:
                view2 = new org.telegram.ui.Cells.i9(np0Var.getContext(), tp0Var.getResourceProvider());
                break;
            case 3:
                mp0 mp0Var = new mp0(np0Var, np0Var.getContext());
                np0Var.y = mp0Var;
                mp0Var.b(false);
                view2 = mp0Var;
                break;
            case 4:
                View vnVar = new org.telegram.ui.Components.vn(np0Var.getContext(), 20);
                vnVar.setTag(-33024);
                view = vnVar;
                view2 = view;
                break;
            case 5:
                View view3 = new View(np0Var.getContext());
                view3.setTag(-33024);
                view = view3;
                view2 = view;
                break;
            case 6:
                View v8Var = new org.telegram.ui.Cells.v8(np0Var.getContext(), tp0Var.getResourceProvider());
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, v8Var, tp0Var.getResourceProvider());
                view2 = v8Var;
                break;
            case 7:
                Context context2 = np0Var.getContext();
                u6Var2 = ((org.telegram.ui.ActionBar.r2) tp0Var).resourceProvider;
                View q4Var = new org.telegram.ui.Cells.q4(context2, u6Var2);
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, q4Var, tp0Var.getResourceProvider());
                view2 = q4Var;
                break;
            case 8:
                Context context3 = np0Var.getContext();
                u6Var3 = ((org.telegram.ui.ActionBar.r2) tp0Var).resourceProvider;
                View bp0Var = new bp0(context3, u6Var3, false);
                bp0Var.setTag(-33024);
                view = bp0Var;
                view2 = view;
                break;
            case 9:
                Context context4 = this.c;
                u6Var4 = ((org.telegram.ui.ActionBar.r2) tp0Var).resourceProvider;
                org.telegram.ui.Components.c10 c10Var = new org.telegram.ui.Components.c10(context4, u6Var4);
                c10Var.setIsSingleCell(true);
                c10Var.setViewType(35);
                c10Var.setTag(-33024);
                view = c10Var;
                view2 = view;
                break;
            case 10:
                View vnVar2 = new org.telegram.ui.Components.vn(np0Var.getContext(), 21);
                vnVar2.setTag(-33024);
                view = vnVar2;
                view2 = view;
                break;
            case 11:
                view2 = new lp0(np0Var, np0Var.getContext());
                break;
            case 12:
                Context context5 = np0Var.getContext();
                i12 = ((org.telegram.ui.ActionBar.r2) tp0Var).currentAccount;
                u6Var5 = ((org.telegram.ui.ActionBar.r2) tp0Var).resourceProvider;
                View g1Var = new zh.g1(context5, i12, u6Var5);
                g1Var.setTag(-33024);
                view = g1Var;
                view2 = view;
                break;
        }
        return new org.telegram.ui.Components.wl0(view2);
    }

    @Override // s4.h0
    public final void y(s4.e1 e1Var) {
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        np0 np0Var = this.e;
        ArrayList arrayList = np0Var.l0;
        int i10 = e1Var.f;
        View view = e1Var.a;
        if (i10 == 10) {
            np0Var.F = view;
            view.post(new dp0(np0Var, 2));
            return;
        }
        boolean z10 = true;
        if (i10 == 8) {
            bp0 bp0Var = (bp0) view;
            int b10 = e1Var.b() - np0Var.b0;
            if (b10 < 0 || b10 >= arrayList.size()) {
                return;
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(b10);
            bp0Var.a(b10, tL_starGiftUnique);
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = np0Var.r;
            if ((tL_emojiStatusCollectible == null || tL_emojiStatusCollectible.collectible_id != tL_starGiftUnique.id) && ((tL_peerColorCollectible2 = np0Var.s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique.id)) {
                z10 = false;
            }
            bp0Var.b(z10, false);
            return;
        }
        if (i10 == 12) {
            zh.g1 g1Var = (zh.g1) view;
            int b11 = e1Var.b() - np0Var.b0;
            if (np0Var.J != null && b11 >= 0 && b11 < arrayList.size()) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(b11);
                g1Var.h(tL_starGiftUnique2, false, false, false, true, false);
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = np0Var.r;
                if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.id) && ((tL_peerColorCollectible = np0Var.s) == null || tL_peerColorCollectible.collectible_id != tL_starGiftUnique2.id)) {
                    z10 = false;
                }
                g1Var.f(z10, false);
            }
        }
    }
}
