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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class np0 extends org.telegram.ui.Components.ul0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ int d;
    public final /* synthetic */ up0 e;

    public np0(up0 up0Var, Context context, int i10) {
        this.e = up0Var;
        this.c = context;
        this.d = i10;
    }

    @Override // org.telegram.ui.Components.ul0
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
        up0 up0Var = this.e;
        if (i10 == up0Var.R || i10 == up0Var.g0 || i10 == up0Var.T || i10 == up0Var.W) {
            return 2;
        }
        if (i10 == up0Var.Q) {
            return 1;
        }
        if (i10 == up0Var.S) {
            return 3;
        }
        if (i10 == up0Var.U) {
            return 5;
        }
        if (i10 == up0Var.V) {
            return 6;
        }
        if (i10 == up0Var.h0) {
            return 10;
        }
        if (i10 == up0Var.i0) {
            return 11;
        }
        if (i10 == up0Var.a0) {
            return 7;
        }
        if (i10 >= up0Var.b0 && i10 < up0Var.c0) {
            return up0Var.K == null ? 8 : 12;
        }
        if (i10 < up0Var.d0 || i10 >= up0Var.e0) {
            return (i10 == up0Var.k0 - 1 || i10 == up0Var.j0) ? 4 : 2;
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
        up0 up0Var = this.e;
        HashMap hashMap = up0Var.M;
        ArrayList arrayList = up0Var.l0;
        ArrayList arrayList2 = up0Var.L;
        bq0 bq0Var = up0Var.p0;
        int j3 = j(i10);
        int i12 = this.d;
        int i13 = 1;
        r10 = true;
        boolean z10 = true;
        switch (j3) {
            case 1:
                view.setBackgroundColor(bq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                ((xp0) view).b();
                break;
            case 2:
                org.telegram.ui.Cells.f9 f9Var = (org.telegram.ui.Cells.f9) view;
                f9Var.setFixedSize(0);
                if (i10 != up0Var.R) {
                    if (i10 != up0Var.W) {
                        if (i10 == up0Var.g0) {
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
                        string = LocaleController.getString(bq0Var.a ? R.string.ChannelColorHint : R.string.UserColorHint);
                    } else {
                        string = LocaleController.getString(bq0Var.a ? R.string.ChannelProfileHint : R.string.UserProfileHint2);
                    }
                    f9Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string, new org.telegram.ui.Components.zd(this, i12, 20)), true));
                    break;
                }
                break;
            case 3:
                tp0 tp0Var = (tp0) view;
                bq0 bq0Var2 = tp0Var.d.p0;
                tp0Var.setBackgroundColor(bq0Var2.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                tp0Var.a.setTextColor(bq0Var2.getThemedColor(org.telegram.ui.ActionBar.j6.G6));
                break;
            case 6:
                org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
                s8Var.v();
                s8Var.setBackgroundColor(bq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                s8Var.v();
                if (i10 == up0Var.V) {
                    s8Var.i(LocaleController.getString(bq0Var.a ? R.string.ChannelProfileColorReset : R.string.UserProfileColorReset), false);
                    break;
                }
                break;
            case 7:
                org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                if (i10 == up0Var.a0) {
                    m4Var.c(LocaleController.getString(R.string.UserProfileCollectibleHeader), false);
                }
                m4Var.setBackgroundColor(bq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                break;
            case 8:
                ip0 ip0Var = (ip0) view;
                int i14 = i10 - up0Var.b0;
                if (i14 >= 0 && i14 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(i14);
                    ip0Var.a(i14, tL_starGiftUnique);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = up0Var.r;
                    ip0Var.b((tL_emojiStatusCollectible != null && tL_emojiStatusCollectible.collectible_id == tL_starGiftUnique.id) || ((tL_peerColorCollectible = up0Var.s) != null && tL_peerColorCollectible.collectible_id == tL_starGiftUnique.id), false);
                    ip0Var.d.invalidate();
                    break;
                }
                break;
            case 10:
                up0Var.F = view;
                aq0 aq0Var = up0Var.E;
                arrayList2.clear();
                hashMap.clear();
                i11 = ((org.telegram.ui.ActionBar.p2) bq0Var).currentAccount;
                ArrayList arrayList3 = xh.v5.y(i11, false).I;
                arrayList2.add(LocaleController.getString(R.string.Gift2TabMine));
                int i15 = 0;
                int i16 = 0;
                while (i15 < arrayList3.size()) {
                    TL_stars.StarGift starGift = (TL_stars.StarGift) arrayList3.get(i15);
                    if ((i12 == 0 || (i12 == i13 && starGift.peer_color_available)) && starGift.availability_resale > 0) {
                        if (up0Var.K == starGift) {
                            i16 = arrayList2.size();
                        }
                        hashMap.put(Integer.valueOf(arrayList2.size()), starGift);
                        TextPaint textPaint = new TextPaint(i13);
                        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
                        org.telegram.ui.Components.y5 y5Var = new org.telegram.ui.Components.y5(starGift.getDocument(), textPaint.getFontMetricsInt());
                        y5Var.size = AndroidUtilities.dp(14.0f);
                        spannableStringBuilder.setSpan(y5Var, 0, 1, 33);
                        spannableStringBuilder.append(starGift.title);
                        arrayList2.add(spannableStringBuilder);
                    }
                    i15++;
                    i13 = 1;
                }
                mp0 mp0Var = new mp0(this, 0);
                ArrayList arrayList4 = aq0Var.f;
                boolean z11 = aq0Var.K == 0;
                aq0Var.K = 0;
                aq0Var.h = mp0Var;
                arrayList4.clear();
                arrayList4.addAll(arrayList2);
                aq0Var.c.l();
                aq0Var.a(i16, z11);
                up0Var.l(aq0Var);
                view.post(new kp0(up0Var, 3));
                break;
            case 11:
                ((sp0) view).a();
                break;
            case 12:
                wh.h1 h1Var = (wh.h1) view;
                int i17 = i10 - up0Var.b0;
                if (up0Var.J != null && i17 >= 0 && i17 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(i17);
                    h1Var.g(tL_starGiftUnique2, false, false, false, true, false);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = up0Var.r;
                    if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.id) && ((tL_peerColorCollectible2 = up0Var.s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique2.id)) {
                        z10 = false;
                    }
                    h1Var.e(z10, false);
                    break;
                }
                break;
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        int i11;
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        org.telegram.ui.ActionBar.f6 f6Var3;
        org.telegram.ui.ActionBar.f6 f6Var4;
        View view;
        View view2;
        int i12;
        org.telegram.ui.ActionBar.f6 f6Var5;
        up0 up0Var = this.e;
        bq0 bq0Var = up0Var.p0;
        switch (i10) {
            case 1:
                Context context = up0Var.getContext();
                i11 = ((org.telegram.ui.ActionBar.p2) bq0Var).currentAccount;
                f6Var = ((org.telegram.ui.ActionBar.p2) bq0Var).resourceProvider;
                xp0 xp0Var = new xp0(this.d, i11, context, f6Var);
                up0Var.f = xp0Var;
                xp0Var.setBackgroundColor(bq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                xp0Var.a(up0Var.h, false);
                xp0Var.setOnColorClick(new mp0(this, 1));
                view2 = xp0Var;
                break;
            case 2:
            default:
                view2 = new org.telegram.ui.Cells.f9(up0Var.getContext(), bq0Var.getResourceProvider());
                break;
            case 3:
                tp0 tp0Var = new tp0(up0Var, up0Var.getContext());
                up0Var.y = tp0Var;
                tp0Var.b(false);
                view2 = tp0Var;
                break;
            case 4:
                View qnVar = new org.telegram.ui.Components.qn(up0Var.getContext(), 19);
                qnVar.setTag(-33024);
                view = qnVar;
                view2 = view;
                break;
            case 5:
                View view3 = new View(up0Var.getContext());
                view3.setTag(-33024);
                view = view3;
                view2 = view;
                break;
            case 6:
                View s8Var = new org.telegram.ui.Cells.s8(up0Var.getContext(), bq0Var.getResourceProvider());
                s8Var.setBackgroundColor(bq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                view2 = s8Var;
                break;
            case 7:
                Context context2 = up0Var.getContext();
                f6Var2 = ((org.telegram.ui.ActionBar.p2) bq0Var).resourceProvider;
                View m4Var = new org.telegram.ui.Cells.m4(context2, f6Var2);
                m4Var.setBackgroundColor(bq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                view2 = m4Var;
                break;
            case 8:
                Context context3 = up0Var.getContext();
                f6Var3 = ((org.telegram.ui.ActionBar.p2) bq0Var).resourceProvider;
                View ip0Var = new ip0(context3, f6Var3, false);
                ip0Var.setTag(-33024);
                view = ip0Var;
                view2 = view;
                break;
            case 9:
                Context context4 = this.c;
                f6Var4 = ((org.telegram.ui.ActionBar.p2) bq0Var).resourceProvider;
                org.telegram.ui.Components.a10 a10Var = new org.telegram.ui.Components.a10(context4, f6Var4);
                a10Var.setIsSingleCell(true);
                a10Var.setViewType(35);
                a10Var.setTag(-33024);
                view = a10Var;
                view2 = view;
                break;
            case 10:
                View qnVar2 = new org.telegram.ui.Components.qn(up0Var.getContext(), 20);
                qnVar2.setTag(-33024);
                view = qnVar2;
                view2 = view;
                break;
            case 11:
                view2 = new sp0(up0Var, up0Var.getContext());
                break;
            case 12:
                Context context5 = up0Var.getContext();
                i12 = ((org.telegram.ui.ActionBar.p2) bq0Var).currentAccount;
                f6Var5 = ((org.telegram.ui.ActionBar.p2) bq0Var).resourceProvider;
                View h1Var = new wh.h1(context5, i12, f6Var5);
                h1Var.setTag(-33024);
                view = h1Var;
                view2 = view;
                break;
        }
        return new org.telegram.ui.Components.fl0(view2);
    }

    @Override // s4.h0
    public final void y(s4.c1 c1Var) {
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        up0 up0Var = this.e;
        ArrayList arrayList = up0Var.l0;
        int i10 = c1Var.f;
        View view = c1Var.a;
        if (i10 == 10) {
            up0Var.F = view;
            view.post(new kp0(up0Var, 2));
            return;
        }
        boolean z10 = true;
        if (i10 == 8) {
            ip0 ip0Var = (ip0) view;
            int b10 = c1Var.b() - up0Var.b0;
            if (b10 < 0 || b10 >= arrayList.size()) {
                return;
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(b10);
            ip0Var.a(b10, tL_starGiftUnique);
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = up0Var.r;
            if ((tL_emojiStatusCollectible == null || tL_emojiStatusCollectible.collectible_id != tL_starGiftUnique.id) && ((tL_peerColorCollectible2 = up0Var.s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique.id)) {
                z10 = false;
            }
            ip0Var.b(z10, false);
            return;
        }
        if (i10 == 12) {
            wh.h1 h1Var = (wh.h1) view;
            int b11 = c1Var.b() - up0Var.b0;
            if (up0Var.J != null && b11 >= 0 && b11 < arrayList.size()) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(b11);
                h1Var.g(tL_starGiftUnique2, false, false, false, true, false);
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = up0Var.r;
                if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.id) && ((tL_peerColorCollectible = up0Var.s) == null || tL_peerColorCollectible.collectible_id != tL_starGiftUnique2.id)) {
                    z10 = false;
                }
                h1Var.e(z10, false);
            }
        }
    }
}
