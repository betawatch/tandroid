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

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class pp0 extends org.telegram.ui.Components.vl0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ int d;
    public final /* synthetic */ wp0 e;

    public pp0(wp0 wp0Var, Context context, int i10) {
        this.e = wp0Var;
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
        wp0 wp0Var = this.e;
        if (i10 == wp0Var.R || i10 == wp0Var.g0 || i10 == wp0Var.T || i10 == wp0Var.W) {
            return 2;
        }
        if (i10 == wp0Var.Q) {
            return 1;
        }
        if (i10 == wp0Var.S) {
            return 3;
        }
        if (i10 == wp0Var.U) {
            return 5;
        }
        if (i10 == wp0Var.V) {
            return 6;
        }
        if (i10 == wp0Var.h0) {
            return 10;
        }
        if (i10 == wp0Var.i0) {
            return 11;
        }
        if (i10 == wp0Var.a0) {
            return 7;
        }
        if (i10 >= wp0Var.b0 && i10 < wp0Var.c0) {
            return wp0Var.K == null ? 8 : 12;
        }
        if (i10 < wp0Var.d0 || i10 >= wp0Var.e0) {
            return (i10 == wp0Var.k0 - 1 || i10 == wp0Var.j0) ? 4 : 2;
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
        wp0 wp0Var = this.e;
        HashMap hashMap = wp0Var.M;
        ArrayList arrayList = wp0Var.l0;
        ArrayList arrayList2 = wp0Var.L;
        cq0 cq0Var = wp0Var.p0;
        int j3 = j(i10);
        int i12 = this.d;
        int i13 = 1;
        r10 = true;
        boolean z10 = true;
        switch (j3) {
            case 1:
                view.setBackgroundColor(cq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                ((zp0) view).b();
                break;
            case 2:
                org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                e9Var.setFixedSize(0);
                if (i10 != wp0Var.R) {
                    if (i10 != wp0Var.W) {
                        if (i10 == wp0Var.g0) {
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
                        string = LocaleController.getString(cq0Var.a ? R.string.ChannelColorHint : R.string.UserColorHint);
                    } else {
                        string = LocaleController.getString(cq0Var.a ? R.string.ChannelProfileHint : R.string.UserProfileHint2);
                    }
                    e9Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string, new org.telegram.ui.Components.x2(this, i12, 23)), true));
                    break;
                }
                break;
            case 3:
                vp0 vp0Var = (vp0) view;
                cq0 cq0Var2 = vp0Var.d.p0;
                vp0Var.setBackgroundColor(cq0Var2.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                vp0Var.a.setTextColor(cq0Var2.getThemedColor(org.telegram.ui.ActionBar.j6.G6));
                break;
            case 6:
                org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                r8Var.v();
                r8Var.setBackgroundColor(cq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                r8Var.v();
                if (i10 == wp0Var.V) {
                    r8Var.i(LocaleController.getString(cq0Var.a ? R.string.ChannelProfileColorReset : R.string.UserProfileColorReset), false);
                    break;
                }
                break;
            case 7:
                org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                if (i10 == wp0Var.a0) {
                    m4Var.c(LocaleController.getString(R.string.UserProfileCollectibleHeader), false);
                }
                m4Var.setBackgroundColor(cq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                break;
            case 8:
                kp0 kp0Var = (kp0) view;
                int i14 = i10 - wp0Var.b0;
                if (i14 >= 0 && i14 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(i14);
                    kp0Var.a(i14, tL_starGiftUnique);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = wp0Var.r;
                    kp0Var.b((tL_emojiStatusCollectible != null && tL_emojiStatusCollectible.collectible_id == tL_starGiftUnique.id) || ((tL_peerColorCollectible = wp0Var.s) != null && tL_peerColorCollectible.collectible_id == tL_starGiftUnique.id), false);
                    kp0Var.d.invalidate();
                    break;
                }
                break;
            case 10:
                wp0Var.F = view;
                bq0 bq0Var = wp0Var.E;
                arrayList2.clear();
                hashMap.clear();
                i11 = ((org.telegram.ui.ActionBar.n2) cq0Var).currentAccount;
                ArrayList arrayList3 = yh.t5.y(i11, false).I;
                arrayList2.add(LocaleController.getString(R.string.Gift2TabMine));
                int i15 = 0;
                int i16 = 0;
                while (i15 < arrayList3.size()) {
                    TL_stars.StarGift starGift = (TL_stars.StarGift) arrayList3.get(i15);
                    if ((i12 == 0 || (i12 == i13 && starGift.peer_color_available)) && starGift.availability_resale > 0) {
                        if (wp0Var.K == starGift) {
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
                op0 op0Var = new op0(this, 0);
                ArrayList arrayList4 = bq0Var.f;
                boolean z11 = bq0Var.K == 0;
                bq0Var.K = 0;
                bq0Var.h = op0Var;
                arrayList4.clear();
                arrayList4.addAll(arrayList2);
                bq0Var.c.l();
                bq0Var.a(i16, z11);
                wp0Var.l(bq0Var);
                view.post(new mp0(wp0Var, 3));
                break;
            case 11:
                ((up0) view).a();
                break;
            case 12:
                xh.j1 j1Var = (xh.j1) view;
                int i17 = i10 - wp0Var.b0;
                if (wp0Var.J != null && i17 >= 0 && i17 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(i17);
                    j1Var.g(tL_starGiftUnique2, false, false, false, true, false);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = wp0Var.r;
                    if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.id) && ((tL_peerColorCollectible2 = wp0Var.s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique2.id)) {
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
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        org.telegram.ui.ActionBar.e6 e6Var3;
        org.telegram.ui.ActionBar.e6 e6Var4;
        View view;
        View view2;
        int i12;
        org.telegram.ui.ActionBar.e6 e6Var5;
        wp0 wp0Var = this.e;
        cq0 cq0Var = wp0Var.p0;
        switch (i10) {
            case 1:
                Context context = wp0Var.getContext();
                i11 = ((org.telegram.ui.ActionBar.n2) cq0Var).currentAccount;
                e6Var = ((org.telegram.ui.ActionBar.n2) cq0Var).resourceProvider;
                zp0 zp0Var = new zp0(this.d, i11, context, e6Var);
                wp0Var.f = zp0Var;
                zp0Var.setBackgroundColor(cq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                zp0Var.a(wp0Var.h, false);
                zp0Var.setOnColorClick(new op0(this, 1));
                view2 = zp0Var;
                break;
            case 2:
            default:
                view2 = new org.telegram.ui.Cells.e9(wp0Var.getContext(), cq0Var.getResourceProvider());
                break;
            case 3:
                vp0 vp0Var = new vp0(wp0Var, wp0Var.getContext());
                wp0Var.y = vp0Var;
                vp0Var.b(false);
                view2 = vp0Var;
                break;
            case 4:
                View knVar = new org.telegram.ui.Components.kn(wp0Var.getContext(), 20);
                knVar.setTag(-33024);
                view = knVar;
                view2 = view;
                break;
            case 5:
                View view3 = new View(wp0Var.getContext());
                view3.setTag(-33024);
                view = view3;
                view2 = view;
                break;
            case 6:
                View r8Var = new org.telegram.ui.Cells.r8(wp0Var.getContext(), cq0Var.getResourceProvider());
                r8Var.setBackgroundColor(cq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                view2 = r8Var;
                break;
            case 7:
                Context context2 = wp0Var.getContext();
                e6Var2 = ((org.telegram.ui.ActionBar.n2) cq0Var).resourceProvider;
                View m4Var = new org.telegram.ui.Cells.m4(context2, e6Var2);
                m4Var.setBackgroundColor(cq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                view2 = m4Var;
                break;
            case 8:
                Context context3 = wp0Var.getContext();
                e6Var3 = ((org.telegram.ui.ActionBar.n2) cq0Var).resourceProvider;
                View kp0Var = new kp0(context3, e6Var3, false);
                kp0Var.setTag(-33024);
                view = kp0Var;
                view2 = view;
                break;
            case 9:
                Context context4 = this.c;
                e6Var4 = ((org.telegram.ui.ActionBar.n2) cq0Var).resourceProvider;
                org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(context4, e6Var4);
                t00Var.setIsSingleCell(true);
                t00Var.setViewType(35);
                t00Var.setTag(-33024);
                view = t00Var;
                view2 = view;
                break;
            case 10:
                View knVar2 = new org.telegram.ui.Components.kn(wp0Var.getContext(), 21);
                knVar2.setTag(-33024);
                view = knVar2;
                view2 = view;
                break;
            case 11:
                view2 = new up0(wp0Var, wp0Var.getContext());
                break;
            case 12:
                Context context5 = wp0Var.getContext();
                i12 = ((org.telegram.ui.ActionBar.n2) cq0Var).currentAccount;
                e6Var5 = ((org.telegram.ui.ActionBar.n2) cq0Var).resourceProvider;
                View j1Var = new xh.j1(context5, i12, e6Var5);
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
        wp0 wp0Var = this.e;
        ArrayList arrayList = wp0Var.l0;
        int i10 = c1Var.f;
        View view = c1Var.a;
        if (i10 == 10) {
            wp0Var.F = view;
            view.post(new mp0(wp0Var, 2));
            return;
        }
        boolean z10 = true;
        if (i10 == 8) {
            kp0 kp0Var = (kp0) view;
            int b10 = c1Var.b() - wp0Var.b0;
            if (b10 < 0 || b10 >= arrayList.size()) {
                return;
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(b10);
            kp0Var.a(b10, tL_starGiftUnique);
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = wp0Var.r;
            if ((tL_emojiStatusCollectible == null || tL_emojiStatusCollectible.collectible_id != tL_starGiftUnique.id) && ((tL_peerColorCollectible2 = wp0Var.s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique.id)) {
                z10 = false;
            }
            kp0Var.b(z10, false);
            return;
        }
        if (i10 == 12) {
            xh.j1 j1Var = (xh.j1) view;
            int b11 = c1Var.b() - wp0Var.b0;
            if (wp0Var.J != null && b11 >= 0 && b11 < arrayList.size()) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(b11);
                j1Var.g(tL_starGiftUnique2, false, false, false, true, false);
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = wp0Var.r;
                if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.id) && ((tL_peerColorCollectible = wp0Var.s) == null || tL_peerColorCollectible.collectible_id != tL_starGiftUnique2.id)) {
                    z10 = false;
                }
                j1Var.e(z10, false);
            }
        }
    }
}
