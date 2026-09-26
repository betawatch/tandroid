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

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class gp0 extends org.telegram.ui.Components.vl0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ int d;
    public final /* synthetic */ np0 e;

    public gp0(np0 np0Var, Context context, int i10) {
        this.e = np0Var;
        this.c = context;
        this.d = i10;
    }

    @Override // org.telegram.ui.Components.vl0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
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
    public final void v(s4.c1 c1Var, int i10) {
        String string;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        int i11;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        View view = c1Var.a;
        np0 np0Var = this.e;
        HashMap hashMap = np0Var.M;
        ArrayList arrayList = np0Var.l0;
        ArrayList arrayList2 = np0Var.L;
        tp0 tp0Var = np0Var.p0;
        int j3 = j(i10);
        int i12 = this.d;
        int i13 = 1;
        r10 = true;
        boolean z10 = true;
        switch (j3) {
            case 1:
                view.setBackgroundColor(tp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
                ((qp0) view).b();
                break;
            case 2:
                org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                e9Var.setFixedSize(0);
                if (i10 != np0Var.R) {
                    if (i10 != np0Var.W) {
                        if (i10 == np0Var.g0) {
                            e9Var.setText(LocaleController.getString(R.string.UserProfileCollectibleInfo));
                            break;
                        }
                    } else {
                        e9Var.setText("");
                        e9Var.setFixedSize(12);
                        break;
                    }
                } else {
                    if (i12 == 1) {
                        string = LocaleController.getString(tp0Var.a ? R.string.ChannelColorHint : R.string.UserColorHint);
                    } else {
                        string = LocaleController.getString(tp0Var.a ? R.string.ChannelProfileHint : R.string.UserProfileHint2);
                    }
                    e9Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string, new org.telegram.ui.Components.ld(this, i12, 21)), true));
                    break;
                }
                break;
            case 3:
                mp0 mp0Var = (mp0) view;
                tp0 tp0Var2 = mp0Var.d.p0;
                mp0Var.setBackgroundColor(tp0Var2.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
                mp0Var.a.setTextColor(tp0Var2.getThemedColor(org.telegram.ui.ActionBar.h6.G6));
                break;
            case 6:
                org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                r8Var.v();
                r8Var.setBackgroundColor(tp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
                r8Var.v();
                if (i10 == np0Var.V) {
                    r8Var.i(LocaleController.getString(tp0Var.a ? R.string.ChannelProfileColorReset : R.string.UserProfileColorReset), false);
                    break;
                }
                break;
            case 7:
                org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                if (i10 == np0Var.a0) {
                    m4Var.c(LocaleController.getString(R.string.UserProfileCollectibleHeader), false);
                }
                m4Var.setBackgroundColor(tp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
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
                i11 = ((org.telegram.ui.ActionBar.m2) tp0Var).currentAccount;
                ArrayList arrayList3 = yh.s5.y(i11, false).I;
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
                        org.telegram.ui.Components.z5 z5Var = new org.telegram.ui.Components.z5(starGift.getDocument(), textPaint.getFontMetricsInt());
                        z5Var.size = AndroidUtilities.dp(14.0f);
                        spannableStringBuilder.setSpan(z5Var, 0, 1, 33);
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
                ((lp0) view).a();
                break;
            case 12:
                xh.j1 j1Var = (xh.j1) view;
                int i17 = i10 - np0Var.b0;
                if (np0Var.J != null && i17 >= 0 && i17 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(i17);
                    j1Var.g(tL_starGiftUnique2, false, false, false, true, false);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = np0Var.r;
                    if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.id) && ((tL_peerColorCollectible2 = np0Var.s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique2.id)) {
                        z10 = false;
                    }
                    j1Var.e(z10, false);
                    break;
                }
                break;
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        int i11;
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.d6 d6Var2;
        org.telegram.ui.ActionBar.d6 d6Var3;
        org.telegram.ui.ActionBar.d6 d6Var4;
        View view;
        View view2;
        int i12;
        org.telegram.ui.ActionBar.d6 d6Var5;
        np0 np0Var = this.e;
        tp0 tp0Var = np0Var.p0;
        switch (i10) {
            case 1:
                Context context = np0Var.getContext();
                i11 = ((org.telegram.ui.ActionBar.m2) tp0Var).currentAccount;
                d6Var = ((org.telegram.ui.ActionBar.m2) tp0Var).resourceProvider;
                qp0 qp0Var = new qp0(this.d, i11, context, d6Var);
                np0Var.f = qp0Var;
                qp0Var.setBackgroundColor(tp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
                qp0Var.a(np0Var.h, false);
                qp0Var.setOnColorClick(new fp0(this, 1));
                view2 = qp0Var;
                break;
            case 2:
            default:
                view2 = new org.telegram.ui.Cells.e9(np0Var.getContext(), tp0Var.getResourceProvider());
                break;
            case 3:
                mp0 mp0Var = new mp0(np0Var, np0Var.getContext());
                np0Var.y = mp0Var;
                mp0Var.b(false);
                view2 = mp0Var;
                break;
            case 4:
                View lnVar = new org.telegram.ui.Components.ln(np0Var.getContext(), 20);
                lnVar.setTag(-33024);
                view = lnVar;
                view2 = view;
                break;
            case 5:
                View view3 = new View(np0Var.getContext());
                view3.setTag(-33024);
                view = view3;
                view2 = view;
                break;
            case 6:
                View r8Var = new org.telegram.ui.Cells.r8(np0Var.getContext(), tp0Var.getResourceProvider());
                r8Var.setBackgroundColor(tp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
                view2 = r8Var;
                break;
            case 7:
                Context context2 = np0Var.getContext();
                d6Var2 = ((org.telegram.ui.ActionBar.m2) tp0Var).resourceProvider;
                View m4Var = new org.telegram.ui.Cells.m4(context2, d6Var2);
                m4Var.setBackgroundColor(tp0Var.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
                view2 = m4Var;
                break;
            case 8:
                Context context3 = np0Var.getContext();
                d6Var3 = ((org.telegram.ui.ActionBar.m2) tp0Var).resourceProvider;
                View bp0Var = new bp0(context3, d6Var3, false);
                bp0Var.setTag(-33024);
                view = bp0Var;
                view2 = view;
                break;
            case 9:
                Context context4 = this.c;
                d6Var4 = ((org.telegram.ui.ActionBar.m2) tp0Var).resourceProvider;
                org.telegram.ui.Components.u00 u00Var = new org.telegram.ui.Components.u00(context4, d6Var4);
                u00Var.setIsSingleCell(true);
                u00Var.setViewType(35);
                u00Var.setTag(-33024);
                view = u00Var;
                view2 = view;
                break;
            case 10:
                View lnVar2 = new org.telegram.ui.Components.ln(np0Var.getContext(), 21);
                lnVar2.setTag(-33024);
                view = lnVar2;
                view2 = view;
                break;
            case 11:
                view2 = new lp0(np0Var, np0Var.getContext());
                break;
            case 12:
                Context context5 = np0Var.getContext();
                i12 = ((org.telegram.ui.ActionBar.m2) tp0Var).currentAccount;
                d6Var5 = ((org.telegram.ui.ActionBar.m2) tp0Var).resourceProvider;
                View j1Var = new xh.j1(context5, i12, d6Var5);
                j1Var.setTag(-33024);
                view = j1Var;
                view2 = view;
                break;
        }
        return new org.telegram.ui.Components.gl0(view2);
    }

    @Override // s4.h0
    public final void y(s4.c1 c1Var) {
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        np0 np0Var = this.e;
        ArrayList arrayList = np0Var.l0;
        int i10 = c1Var.f;
        View view = c1Var.a;
        if (i10 == 10) {
            np0Var.F = view;
            view.post(new dp0(np0Var, 2));
            return;
        }
        boolean z10 = true;
        if (i10 == 8) {
            bp0 bp0Var = (bp0) view;
            int b10 = c1Var.b() - np0Var.b0;
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
            xh.j1 j1Var = (xh.j1) view;
            int b11 = c1Var.b() - np0Var.b0;
            if (np0Var.J != null && b11 >= 0 && b11 < arrayList.size()) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(b11);
                j1Var.g(tL_starGiftUnique2, false, false, false, true, false);
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = np0Var.r;
                if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.id) && ((tL_peerColorCollectible = np0Var.s) == null || tL_peerColorCollectible.collectible_id != tL_starGiftUnique2.id)) {
                    z10 = false;
                }
                j1Var.e(z10, false);
            }
        }
    }
}
