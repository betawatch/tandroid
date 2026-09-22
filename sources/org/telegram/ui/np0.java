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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class np0 extends org.telegram.ui.Components.kl0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ int d;
    public final /* synthetic */ up0 e;

    public np0(up0 up0Var, Context context, int i10) {
        this.e = up0Var;
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
        aq0 aq0Var = up0Var.p0;
        int j3 = j(i10);
        int i12 = this.d;
        int i13 = 1;
        r10 = true;
        boolean z10 = true;
        switch (j3) {
            case 1:
                view.setBackgroundColor(aq0Var.getThemedColor(org.telegram.ui.ActionBar.i6.d6));
                ((xp0) view).b();
                break;
            case 2:
                org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                e9Var.setFixedSize(0);
                if (i10 != up0Var.R) {
                    if (i10 != up0Var.W) {
                        if (i10 == up0Var.g0) {
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
                        string = LocaleController.getString(aq0Var.a ? R.string.ChannelColorHint : R.string.UserColorHint);
                    } else {
                        string = LocaleController.getString(aq0Var.a ? R.string.ChannelProfileHint : R.string.UserProfileHint2);
                    }
                    e9Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string, new org.telegram.ui.Components.id(this, i12, 21)), true));
                    break;
                }
                break;
            case 3:
                tp0 tp0Var = (tp0) view;
                aq0 aq0Var2 = tp0Var.d.p0;
                tp0Var.setBackgroundColor(aq0Var2.getThemedColor(org.telegram.ui.ActionBar.i6.d6));
                tp0Var.a.setTextColor(aq0Var2.getThemedColor(org.telegram.ui.ActionBar.i6.G6));
                break;
            case 6:
                org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                r8Var.v();
                r8Var.setBackgroundColor(aq0Var.getThemedColor(org.telegram.ui.ActionBar.i6.d6));
                r8Var.v();
                if (i10 == up0Var.V) {
                    r8Var.i(LocaleController.getString(aq0Var.a ? R.string.ChannelProfileColorReset : R.string.UserProfileColorReset), false);
                    break;
                }
                break;
            case 7:
                org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                if (i10 == up0Var.a0) {
                    m4Var.c(LocaleController.getString(R.string.UserProfileCollectibleHeader), false);
                }
                m4Var.setBackgroundColor(aq0Var.getThemedColor(org.telegram.ui.ActionBar.i6.d6));
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
                zp0 zp0Var = up0Var.E;
                arrayList2.clear();
                hashMap.clear();
                i11 = ((org.telegram.ui.ActionBar.n2) aq0Var).currentAccount;
                ArrayList arrayList3 = yh.u5.y(i11, false).I;
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
                        org.telegram.ui.Components.x5 x5Var = new org.telegram.ui.Components.x5(starGift.getDocument(), textPaint.getFontMetricsInt());
                        x5Var.size = AndroidUtilities.dp(14.0f);
                        spannableStringBuilder.setSpan(x5Var, 0, 1, 33);
                        spannableStringBuilder.append(starGift.title);
                        arrayList2.add(spannableStringBuilder);
                    }
                    i15++;
                    i13 = 1;
                }
                mp0 mp0Var = new mp0(this, 0);
                ArrayList arrayList4 = zp0Var.f;
                boolean z11 = zp0Var.K == 0;
                zp0Var.K = 0;
                zp0Var.h = mp0Var;
                arrayList4.clear();
                arrayList4.addAll(arrayList2);
                zp0Var.c.l();
                zp0Var.a(i16, z11);
                up0Var.l(zp0Var);
                view.post(new kp0(up0Var, 3));
                break;
            case 11:
                ((sp0) view).a();
                break;
            case 12:
                xh.i1 i1Var = (xh.i1) view;
                int i17 = i10 - up0Var.b0;
                if (up0Var.J != null && i17 >= 0 && i17 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(i17);
                    i1Var.g(tL_starGiftUnique2, false, false, false, true, false);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = up0Var.r;
                    if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.id) && ((tL_peerColorCollectible2 = up0Var.s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique2.id)) {
                        z10 = false;
                    }
                    i1Var.e(z10, false);
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
        up0 up0Var = this.e;
        aq0 aq0Var = up0Var.p0;
        switch (i10) {
            case 1:
                Context context = up0Var.getContext();
                i11 = ((org.telegram.ui.ActionBar.n2) aq0Var).currentAccount;
                e6Var = ((org.telegram.ui.ActionBar.n2) aq0Var).resourceProvider;
                xp0 xp0Var = new xp0(this.d, i11, context, e6Var);
                up0Var.f = xp0Var;
                xp0Var.setBackgroundColor(aq0Var.getThemedColor(org.telegram.ui.ActionBar.i6.d6));
                xp0Var.a(up0Var.h, false);
                xp0Var.setOnColorClick(new mp0(this, 1));
                view2 = xp0Var;
                break;
            case 2:
            default:
                view2 = new org.telegram.ui.Cells.e9(up0Var.getContext(), aq0Var.getResourceProvider());
                break;
            case 3:
                tp0 tp0Var = new tp0(up0Var, up0Var.getContext());
                up0Var.y = tp0Var;
                tp0Var.b(false);
                view2 = tp0Var;
                break;
            case 4:
                View knVar = new org.telegram.ui.Components.kn(up0Var.getContext(), 20);
                knVar.setTag(-33024);
                view = knVar;
                view2 = view;
                break;
            case 5:
                View view3 = new View(up0Var.getContext());
                view3.setTag(-33024);
                view = view3;
                view2 = view;
                break;
            case 6:
                View r8Var = new org.telegram.ui.Cells.r8(up0Var.getContext(), aq0Var.getResourceProvider());
                r8Var.setBackgroundColor(aq0Var.getThemedColor(org.telegram.ui.ActionBar.i6.d6));
                view2 = r8Var;
                break;
            case 7:
                Context context2 = up0Var.getContext();
                e6Var2 = ((org.telegram.ui.ActionBar.n2) aq0Var).resourceProvider;
                View m4Var = new org.telegram.ui.Cells.m4(context2, e6Var2);
                m4Var.setBackgroundColor(aq0Var.getThemedColor(org.telegram.ui.ActionBar.i6.d6));
                view2 = m4Var;
                break;
            case 8:
                Context context3 = up0Var.getContext();
                e6Var3 = ((org.telegram.ui.ActionBar.n2) aq0Var).resourceProvider;
                View ip0Var = new ip0(context3, e6Var3, false);
                ip0Var.setTag(-33024);
                view = ip0Var;
                view2 = view;
                break;
            case 9:
                Context context4 = this.c;
                e6Var4 = ((org.telegram.ui.ActionBar.n2) aq0Var).resourceProvider;
                org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(context4, e6Var4);
                t00Var.setIsSingleCell(true);
                t00Var.setViewType(35);
                t00Var.setTag(-33024);
                view = t00Var;
                view2 = view;
                break;
            case 10:
                View knVar2 = new org.telegram.ui.Components.kn(up0Var.getContext(), 21);
                knVar2.setTag(-33024);
                view = knVar2;
                view2 = view;
                break;
            case 11:
                view2 = new sp0(up0Var, up0Var.getContext());
                break;
            case 12:
                Context context5 = up0Var.getContext();
                i12 = ((org.telegram.ui.ActionBar.n2) aq0Var).currentAccount;
                e6Var5 = ((org.telegram.ui.ActionBar.n2) aq0Var).resourceProvider;
                View i1Var = new xh.i1(context5, i12, e6Var5);
                i1Var.setTag(-33024);
                view = i1Var;
                view2 = view;
                break;
        }
        return new org.telegram.ui.Components.vk0(view2);
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
            xh.i1 i1Var = (xh.i1) view;
            int b11 = c1Var.b() - up0Var.b0;
            if (up0Var.J != null && b11 >= 0 && b11 < arrayList.size()) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(b11);
                i1Var.g(tL_starGiftUnique2, false, false, false, true, false);
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = up0Var.r;
                if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.id) && ((tL_peerColorCollectible = up0Var.s) == null || tL_peerColorCollectible.collectible_id != tL_starGiftUnique2.id)) {
                    z10 = false;
                }
                i1Var.e(z10, false);
            }
        }
    }
}
