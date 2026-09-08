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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class op0 extends org.telegram.ui.Components.kl0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ int d;
    public final /* synthetic */ vp0 e;

    public op0(vp0 vp0Var, Context context, int i10) {
        this.e = vp0Var;
        this.c = context;
        this.d = i10;
    }

    @Override // org.telegram.ui.Components.kl0
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
        vp0 vp0Var = this.e;
        if (i10 == vp0Var.R || i10 == vp0Var.g0 || i10 == vp0Var.T || i10 == vp0Var.W) {
            return 2;
        }
        if (i10 == vp0Var.Q) {
            return 1;
        }
        if (i10 == vp0Var.S) {
            return 3;
        }
        if (i10 == vp0Var.U) {
            return 5;
        }
        if (i10 == vp0Var.V) {
            return 6;
        }
        if (i10 == vp0Var.h0) {
            return 10;
        }
        if (i10 == vp0Var.i0) {
            return 11;
        }
        if (i10 == vp0Var.a0) {
            return 7;
        }
        if (i10 >= vp0Var.b0 && i10 < vp0Var.c0) {
            return vp0Var.K == null ? 8 : 12;
        }
        if (i10 < vp0Var.d0 || i10 >= vp0Var.e0) {
            return (i10 == vp0Var.k0 - 1 || i10 == vp0Var.j0) ? 4 : 2;
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
        vp0 vp0Var = this.e;
        HashMap hashMap = vp0Var.M;
        ArrayList arrayList = vp0Var.l0;
        ArrayList arrayList2 = vp0Var.L;
        bq0 bq0Var = vp0Var.p0;
        int j3 = j(i10);
        int i12 = this.d;
        int i13 = 1;
        r10 = true;
        boolean z10 = true;
        switch (j3) {
            case 1:
                view.setBackgroundColor(bq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                ((yp0) view).b();
                break;
            case 2:
                org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                e9Var.setFixedSize(0);
                if (i10 != vp0Var.R) {
                    if (i10 != vp0Var.W) {
                        if (i10 == vp0Var.g0) {
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
                        string = LocaleController.getString(bq0Var.a ? R.string.ChannelColorHint : R.string.UserColorHint);
                    } else {
                        string = LocaleController.getString(bq0Var.a ? R.string.ChannelProfileHint : R.string.UserProfileHint2);
                    }
                    e9Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string, new org.telegram.ui.Components.m8(this, i12, 22)), true));
                    break;
                }
                break;
            case 3:
                up0 up0Var = (up0) view;
                bq0 bq0Var2 = up0Var.d.p0;
                up0Var.setBackgroundColor(bq0Var2.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                up0Var.a.setTextColor(bq0Var2.getThemedColor(org.telegram.ui.ActionBar.j6.G6));
                break;
            case 6:
                org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                r8Var.v();
                r8Var.setBackgroundColor(bq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                r8Var.v();
                if (i10 == vp0Var.V) {
                    r8Var.i(LocaleController.getString(bq0Var.a ? R.string.ChannelProfileColorReset : R.string.UserProfileColorReset), false);
                    break;
                }
                break;
            case 7:
                org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
                if (i10 == vp0Var.a0) {
                    l4Var.c(LocaleController.getString(R.string.UserProfileCollectibleHeader), false);
                }
                l4Var.setBackgroundColor(bq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                break;
            case 8:
                jp0 jp0Var = (jp0) view;
                int i14 = i10 - vp0Var.b0;
                if (i14 >= 0 && i14 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(i14);
                    jp0Var.a(i14, tL_starGiftUnique);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = vp0Var.r;
                    jp0Var.b((tL_emojiStatusCollectible != null && tL_emojiStatusCollectible.collectible_id == tL_starGiftUnique.id) || ((tL_peerColorCollectible = vp0Var.s) != null && tL_peerColorCollectible.collectible_id == tL_starGiftUnique.id), false);
                    jp0Var.d.invalidate();
                    break;
                }
                break;
            case 10:
                vp0Var.F = view;
                aq0 aq0Var = vp0Var.E;
                arrayList2.clear();
                hashMap.clear();
                i11 = ((org.telegram.ui.ActionBar.n2) bq0Var).currentAccount;
                ArrayList arrayList3 = zh.s5.y(i11, false).I;
                arrayList2.add(LocaleController.getString(R.string.Gift2TabMine));
                int i15 = 0;
                int i16 = 0;
                while (i15 < arrayList3.size()) {
                    TL_stars.StarGift starGift = (TL_stars.StarGift) arrayList3.get(i15);
                    if ((i12 == 0 || (i12 == i13 && starGift.peer_color_available)) && starGift.availability_resale > 0) {
                        if (vp0Var.K == starGift) {
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
                np0 np0Var = new np0(this, 0);
                ArrayList arrayList4 = aq0Var.f;
                boolean z11 = aq0Var.K == 0;
                aq0Var.K = 0;
                aq0Var.h = np0Var;
                arrayList4.clear();
                arrayList4.addAll(arrayList2);
                aq0Var.c.l();
                aq0Var.a(i16, z11);
                vp0Var.l(aq0Var);
                view.post(new lp0(vp0Var, 3));
                break;
            case 11:
                ((tp0) view).a();
                break;
            case 12:
                yh.h1 h1Var = (yh.h1) view;
                int i17 = i10 - vp0Var.b0;
                if (vp0Var.J != null && i17 >= 0 && i17 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(i17);
                    h1Var.g(tL_starGiftUnique2, false, false, false, true, false);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = vp0Var.r;
                    if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.id) && ((tL_peerColorCollectible2 = vp0Var.s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique2.id)) {
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
        vp0 vp0Var = this.e;
        bq0 bq0Var = vp0Var.p0;
        switch (i10) {
            case 1:
                Context context = vp0Var.getContext();
                i11 = ((org.telegram.ui.ActionBar.n2) bq0Var).currentAccount;
                f6Var = ((org.telegram.ui.ActionBar.n2) bq0Var).resourceProvider;
                yp0 yp0Var = new yp0(this.d, i11, context, f6Var);
                vp0Var.f = yp0Var;
                yp0Var.setBackgroundColor(bq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                yp0Var.a(vp0Var.h, false);
                yp0Var.setOnColorClick(new np0(this, 1));
                view2 = yp0Var;
                break;
            case 2:
            default:
                view2 = new org.telegram.ui.Cells.e9(vp0Var.getContext(), bq0Var.getResourceProvider());
                break;
            case 3:
                up0 up0Var = new up0(vp0Var, vp0Var.getContext());
                vp0Var.y = up0Var;
                up0Var.b(false);
                view2 = up0Var;
                break;
            case 4:
                View jnVar = new org.telegram.ui.Components.jn(vp0Var.getContext(), 20);
                jnVar.setTag(-33024);
                view = jnVar;
                view2 = view;
                break;
            case 5:
                View view3 = new View(vp0Var.getContext());
                view3.setTag(-33024);
                view = view3;
                view2 = view;
                break;
            case 6:
                View r8Var = new org.telegram.ui.Cells.r8(vp0Var.getContext(), bq0Var.getResourceProvider());
                r8Var.setBackgroundColor(bq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                view2 = r8Var;
                break;
            case 7:
                Context context2 = vp0Var.getContext();
                f6Var2 = ((org.telegram.ui.ActionBar.n2) bq0Var).resourceProvider;
                View l4Var = new org.telegram.ui.Cells.l4(context2, f6Var2);
                l4Var.setBackgroundColor(bq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                view2 = l4Var;
                break;
            case 8:
                Context context3 = vp0Var.getContext();
                f6Var3 = ((org.telegram.ui.ActionBar.n2) bq0Var).resourceProvider;
                View jp0Var = new jp0(context3, f6Var3, false);
                jp0Var.setTag(-33024);
                view = jp0Var;
                view2 = view;
                break;
            case 9:
                Context context4 = this.c;
                f6Var4 = ((org.telegram.ui.ActionBar.n2) bq0Var).resourceProvider;
                org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(context4, f6Var4);
                t00Var.setIsSingleCell(true);
                t00Var.setViewType(35);
                t00Var.setTag(-33024);
                view = t00Var;
                view2 = view;
                break;
            case 10:
                View jnVar2 = new org.telegram.ui.Components.jn(vp0Var.getContext(), 21);
                jnVar2.setTag(-33024);
                view = jnVar2;
                view2 = view;
                break;
            case 11:
                view2 = new tp0(vp0Var, vp0Var.getContext());
                break;
            case 12:
                Context context5 = vp0Var.getContext();
                i12 = ((org.telegram.ui.ActionBar.n2) bq0Var).currentAccount;
                f6Var5 = ((org.telegram.ui.ActionBar.n2) bq0Var).resourceProvider;
                View h1Var = new yh.h1(context5, i12, f6Var5);
                h1Var.setTag(-33024);
                view = h1Var;
                view2 = view;
                break;
        }
        return new org.telegram.ui.Components.vk0(view2);
    }

    @Override // s4.h0
    public final void y(s4.c1 c1Var) {
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        vp0 vp0Var = this.e;
        ArrayList arrayList = vp0Var.l0;
        int i10 = c1Var.f;
        View view = c1Var.a;
        if (i10 == 10) {
            vp0Var.F = view;
            view.post(new lp0(vp0Var, 2));
            return;
        }
        boolean z10 = true;
        if (i10 == 8) {
            jp0 jp0Var = (jp0) view;
            int b10 = c1Var.b() - vp0Var.b0;
            if (b10 < 0 || b10 >= arrayList.size()) {
                return;
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(b10);
            jp0Var.a(b10, tL_starGiftUnique);
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = vp0Var.r;
            if ((tL_emojiStatusCollectible == null || tL_emojiStatusCollectible.collectible_id != tL_starGiftUnique.id) && ((tL_peerColorCollectible2 = vp0Var.s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique.id)) {
                z10 = false;
            }
            jp0Var.b(z10, false);
            return;
        }
        if (i10 == 12) {
            yh.h1 h1Var = (yh.h1) view;
            int b11 = c1Var.b() - vp0Var.b0;
            if (vp0Var.J != null && b11 >= 0 && b11 < arrayList.size()) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(b11);
                h1Var.g(tL_starGiftUnique2, false, false, false, true, false);
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = vp0Var.r;
                if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.id) && ((tL_peerColorCollectible = vp0Var.s) == null || tL_peerColorCollectible.collectible_id != tL_starGiftUnique2.id)) {
                    z10 = false;
                }
                h1Var.e(z10, false);
            }
        }
    }
}
