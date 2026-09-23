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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class hp0 extends org.telegram.ui.Components.ll0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ int d;
    public final /* synthetic */ op0 e;

    public hp0(op0 op0Var, Context context, int i10) {
        this.e = op0Var;
        this.c = context;
        this.d = i10;
    }

    @Override // org.telegram.ui.Components.ll0
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
        op0 op0Var = this.e;
        if (i10 == op0Var.R || i10 == op0Var.g0 || i10 == op0Var.T || i10 == op0Var.W) {
            return 2;
        }
        if (i10 == op0Var.Q) {
            return 1;
        }
        if (i10 == op0Var.S) {
            return 3;
        }
        if (i10 == op0Var.U) {
            return 5;
        }
        if (i10 == op0Var.V) {
            return 6;
        }
        if (i10 == op0Var.h0) {
            return 10;
        }
        if (i10 == op0Var.i0) {
            return 11;
        }
        if (i10 == op0Var.a0) {
            return 7;
        }
        if (i10 >= op0Var.b0 && i10 < op0Var.c0) {
            return op0Var.K == null ? 8 : 12;
        }
        if (i10 < op0Var.d0 || i10 >= op0Var.e0) {
            return (i10 == op0Var.k0 - 1 || i10 == op0Var.j0) ? 4 : 2;
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
        op0 op0Var = this.e;
        HashMap hashMap = op0Var.M;
        ArrayList arrayList = op0Var.l0;
        ArrayList arrayList2 = op0Var.L;
        up0 up0Var = op0Var.p0;
        int j3 = j(i10);
        int i12 = this.d;
        int i13 = 1;
        r10 = true;
        boolean z10 = true;
        switch (j3) {
            case 1:
                view.setBackgroundColor(up0Var.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
                ((rp0) view).b();
                break;
            case 2:
                org.telegram.ui.Cells.f9 f9Var = (org.telegram.ui.Cells.f9) view;
                f9Var.setFixedSize(0);
                if (i10 != op0Var.R) {
                    if (i10 != op0Var.W) {
                        if (i10 == op0Var.g0) {
                            f9Var.setText(LocaleController.getString(R.string.UserProfileCollectibleInfo));
                            break;
                        }
                    } else {
                        f9Var.setText("");
                        f9Var.setFixedSize(12);
                        break;
                    }
                } else {
                    if (i12 == 1) {
                        string = LocaleController.getString(up0Var.a ? R.string.ChannelColorHint : R.string.UserColorHint);
                    } else {
                        string = LocaleController.getString(up0Var.a ? R.string.ChannelProfileHint : R.string.UserProfileHint2);
                    }
                    f9Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string, new org.telegram.ui.Components.kd(this, i12, 21)), true));
                    break;
                }
                break;
            case 3:
                np0 np0Var = (np0) view;
                up0 up0Var2 = np0Var.d.p0;
                np0Var.setBackgroundColor(up0Var2.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
                np0Var.a.setTextColor(up0Var2.getThemedColor(org.telegram.ui.ActionBar.h6.G6));
                break;
            case 6:
                org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
                s8Var.v();
                s8Var.setBackgroundColor(up0Var.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
                s8Var.v();
                if (i10 == op0Var.V) {
                    s8Var.i(LocaleController.getString(up0Var.a ? R.string.ChannelProfileColorReset : R.string.UserProfileColorReset), false);
                    break;
                }
                break;
            case 7:
                org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                if (i10 == op0Var.a0) {
                    m4Var.c(LocaleController.getString(R.string.UserProfileCollectibleHeader), false);
                }
                m4Var.setBackgroundColor(up0Var.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
                break;
            case 8:
                cp0 cp0Var = (cp0) view;
                int i14 = i10 - op0Var.b0;
                if (i14 >= 0 && i14 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(i14);
                    cp0Var.a(i14, tL_starGiftUnique);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = op0Var.r;
                    cp0Var.b((tL_emojiStatusCollectible != null && tL_emojiStatusCollectible.collectible_id == tL_starGiftUnique.id) || ((tL_peerColorCollectible = op0Var.s) != null && tL_peerColorCollectible.collectible_id == tL_starGiftUnique.id), false);
                    cp0Var.d.invalidate();
                    break;
                }
                break;
            case 10:
                op0Var.F = view;
                tp0 tp0Var = op0Var.E;
                arrayList2.clear();
                hashMap.clear();
                i11 = ((org.telegram.ui.ActionBar.n2) up0Var).currentAccount;
                ArrayList arrayList3 = yh.t5.y(i11, false).I;
                arrayList2.add(LocaleController.getString(R.string.Gift2TabMine));
                int i15 = 0;
                int i16 = 0;
                while (i15 < arrayList3.size()) {
                    TL_stars.StarGift starGift = (TL_stars.StarGift) arrayList3.get(i15);
                    if ((i12 == 0 || (i12 == i13 && starGift.peer_color_available)) && starGift.availability_resale > 0) {
                        if (op0Var.K == starGift) {
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
                gp0 gp0Var = new gp0(this, 0);
                ArrayList arrayList4 = tp0Var.f;
                boolean z11 = tp0Var.K == 0;
                tp0Var.K = 0;
                tp0Var.h = gp0Var;
                arrayList4.clear();
                arrayList4.addAll(arrayList2);
                tp0Var.c.l();
                tp0Var.a(i16, z11);
                op0Var.l(tp0Var);
                view.post(new ep0(op0Var, 3));
                break;
            case 11:
                ((mp0) view).a();
                break;
            case 12:
                xh.j1 j1Var = (xh.j1) view;
                int i17 = i10 - op0Var.b0;
                if (op0Var.J != null && i17 >= 0 && i17 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(i17);
                    j1Var.g(tL_starGiftUnique2, false, false, false, true, false);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = op0Var.r;
                    if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.id) && ((tL_peerColorCollectible2 = op0Var.s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique2.id)) {
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
        op0 op0Var = this.e;
        up0 up0Var = op0Var.p0;
        switch (i10) {
            case 1:
                Context context = op0Var.getContext();
                i11 = ((org.telegram.ui.ActionBar.n2) up0Var).currentAccount;
                d6Var = ((org.telegram.ui.ActionBar.n2) up0Var).resourceProvider;
                rp0 rp0Var = new rp0(this.d, i11, context, d6Var);
                op0Var.f = rp0Var;
                rp0Var.setBackgroundColor(up0Var.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
                rp0Var.a(op0Var.h, false);
                rp0Var.setOnColorClick(new gp0(this, 1));
                view2 = rp0Var;
                break;
            case 2:
            default:
                view2 = new org.telegram.ui.Cells.f9(op0Var.getContext(), up0Var.getResourceProvider());
                break;
            case 3:
                np0 np0Var = new np0(op0Var, op0Var.getContext());
                op0Var.y = np0Var;
                np0Var.b(false);
                view2 = np0Var;
                break;
            case 4:
                View lnVar = new org.telegram.ui.Components.ln(op0Var.getContext(), 20);
                lnVar.setTag(-33024);
                view = lnVar;
                view2 = view;
                break;
            case 5:
                View view3 = new View(op0Var.getContext());
                view3.setTag(-33024);
                view = view3;
                view2 = view;
                break;
            case 6:
                View s8Var = new org.telegram.ui.Cells.s8(op0Var.getContext(), up0Var.getResourceProvider());
                s8Var.setBackgroundColor(up0Var.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
                view2 = s8Var;
                break;
            case 7:
                Context context2 = op0Var.getContext();
                d6Var2 = ((org.telegram.ui.ActionBar.n2) up0Var).resourceProvider;
                View m4Var = new org.telegram.ui.Cells.m4(context2, d6Var2);
                m4Var.setBackgroundColor(up0Var.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
                view2 = m4Var;
                break;
            case 8:
                Context context3 = op0Var.getContext();
                d6Var3 = ((org.telegram.ui.ActionBar.n2) up0Var).resourceProvider;
                View cp0Var = new cp0(context3, d6Var3, false);
                cp0Var.setTag(-33024);
                view = cp0Var;
                view2 = view;
                break;
            case 9:
                Context context4 = this.c;
                d6Var4 = ((org.telegram.ui.ActionBar.n2) up0Var).resourceProvider;
                org.telegram.ui.Components.u00 u00Var = new org.telegram.ui.Components.u00(context4, d6Var4);
                u00Var.setIsSingleCell(true);
                u00Var.setViewType(35);
                u00Var.setTag(-33024);
                view = u00Var;
                view2 = view;
                break;
            case 10:
                View lnVar2 = new org.telegram.ui.Components.ln(op0Var.getContext(), 21);
                lnVar2.setTag(-33024);
                view = lnVar2;
                view2 = view;
                break;
            case 11:
                view2 = new mp0(op0Var, op0Var.getContext());
                break;
            case 12:
                Context context5 = op0Var.getContext();
                i12 = ((org.telegram.ui.ActionBar.n2) up0Var).currentAccount;
                d6Var5 = ((org.telegram.ui.ActionBar.n2) up0Var).resourceProvider;
                View j1Var = new xh.j1(context5, i12, d6Var5);
                j1Var.setTag(-33024);
                view = j1Var;
                view2 = view;
                break;
        }
        return new org.telegram.ui.Components.wk0(view2);
    }

    @Override // s4.h0
    public final void y(s4.c1 c1Var) {
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        op0 op0Var = this.e;
        ArrayList arrayList = op0Var.l0;
        int i10 = c1Var.f;
        View view = c1Var.a;
        if (i10 == 10) {
            op0Var.F = view;
            view.post(new ep0(op0Var, 2));
            return;
        }
        boolean z10 = true;
        if (i10 == 8) {
            cp0 cp0Var = (cp0) view;
            int b10 = c1Var.b() - op0Var.b0;
            if (b10 < 0 || b10 >= arrayList.size()) {
                return;
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(b10);
            cp0Var.a(b10, tL_starGiftUnique);
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = op0Var.r;
            if ((tL_emojiStatusCollectible == null || tL_emojiStatusCollectible.collectible_id != tL_starGiftUnique.id) && ((tL_peerColorCollectible2 = op0Var.s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique.id)) {
                z10 = false;
            }
            cp0Var.b(z10, false);
            return;
        }
        if (i10 == 12) {
            xh.j1 j1Var = (xh.j1) view;
            int b11 = c1Var.b() - op0Var.b0;
            if (op0Var.J != null && b11 >= 0 && b11 < arrayList.size()) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(b11);
                j1Var.g(tL_starGiftUnique2, false, false, false, true, false);
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = op0Var.r;
                if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.id) && ((tL_peerColorCollectible = op0Var.s) == null || tL_peerColorCollectible.collectible_id != tL_starGiftUnique2.id)) {
                    z10 = false;
                }
                j1Var.e(z10, false);
            }
        }
    }
}
