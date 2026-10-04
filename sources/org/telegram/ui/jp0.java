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

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class jp0 extends org.telegram.ui.Components.yl0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ int d;
    public final /* synthetic */ qp0 e;

    public jp0(qp0 qp0Var, Context context, int i10) {
        this.e = qp0Var;
        this.c = context;
        this.d = i10;
    }

    @Override // org.telegram.ui.Components.yl0
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
        qp0 qp0Var = this.e;
        if (i10 == qp0Var.R || i10 == qp0Var.g0 || i10 == qp0Var.T || i10 == qp0Var.W) {
            return 2;
        }
        if (i10 == qp0Var.Q) {
            return 1;
        }
        if (i10 == qp0Var.S) {
            return 3;
        }
        if (i10 == qp0Var.U) {
            return 5;
        }
        if (i10 == qp0Var.V) {
            return 6;
        }
        if (i10 == qp0Var.h0) {
            return 10;
        }
        if (i10 == qp0Var.i0) {
            return 11;
        }
        if (i10 == qp0Var.a0) {
            return 7;
        }
        if (i10 >= qp0Var.b0 && i10 < qp0Var.c0) {
            return qp0Var.K == null ? 8 : 12;
        }
        if (i10 < qp0Var.d0 || i10 >= qp0Var.e0) {
            return (i10 == qp0Var.k0 - 1 || i10 == qp0Var.j0) ? 4 : 2;
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
        qp0 qp0Var = this.e;
        HashMap hashMap = qp0Var.M;
        ArrayList arrayList = qp0Var.l0;
        ArrayList arrayList2 = qp0Var.L;
        wp0 wp0Var = qp0Var.p0;
        int j3 = j(i10);
        int i12 = this.d;
        int i13 = 1;
        r10 = true;
        boolean z10 = true;
        switch (j3) {
            case 1:
                view.setBackgroundColor(wp0Var.getThemedColor(org.telegram.ui.ActionBar.i6.d6));
                ((tp0) view).b();
                break;
            case 2:
                org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                e9Var.setFixedSize(0);
                if (i10 != qp0Var.R) {
                    if (i10 != qp0Var.W) {
                        if (i10 == qp0Var.g0) {
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
                        string = LocaleController.getString(wp0Var.a ? R.string.ChannelColorHint : R.string.UserColorHint);
                    } else {
                        string = LocaleController.getString(wp0Var.a ? R.string.ChannelProfileHint : R.string.UserProfileHint2);
                    }
                    e9Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string, new org.telegram.ui.Components.ld(this, i12, 20)), true));
                    break;
                }
                break;
            case 3:
                pp0 pp0Var = (pp0) view;
                wp0 wp0Var2 = pp0Var.d.p0;
                pp0Var.setBackgroundColor(wp0Var2.getThemedColor(org.telegram.ui.ActionBar.i6.d6));
                pp0Var.a.setTextColor(wp0Var2.getThemedColor(org.telegram.ui.ActionBar.i6.G6));
                break;
            case 6:
                org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                r8Var.v();
                r8Var.setBackgroundColor(wp0Var.getThemedColor(org.telegram.ui.ActionBar.i6.d6));
                r8Var.v();
                if (i10 == qp0Var.V) {
                    r8Var.i(LocaleController.getString(wp0Var.a ? R.string.ChannelProfileColorReset : R.string.UserProfileColorReset), false);
                    break;
                }
                break;
            case 7:
                org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                if (i10 == qp0Var.a0) {
                    m4Var.c(LocaleController.getString(R.string.UserProfileCollectibleHeader), false);
                }
                m4Var.setBackgroundColor(wp0Var.getThemedColor(org.telegram.ui.ActionBar.i6.d6));
                break;
            case 8:
                ep0 ep0Var = (ep0) view;
                int i14 = i10 - qp0Var.b0;
                if (i14 >= 0 && i14 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(i14);
                    ep0Var.a(i14, tL_starGiftUnique);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = qp0Var.r;
                    ep0Var.b((tL_emojiStatusCollectible != null && tL_emojiStatusCollectible.collectible_id == tL_starGiftUnique.id) || ((tL_peerColorCollectible = qp0Var.s) != null && tL_peerColorCollectible.collectible_id == tL_starGiftUnique.id), false);
                    ep0Var.d.invalidate();
                    break;
                }
                break;
            case 10:
                qp0Var.F = view;
                vp0 vp0Var = qp0Var.E;
                arrayList2.clear();
                hashMap.clear();
                i11 = ((org.telegram.ui.ActionBar.n2) wp0Var).currentAccount;
                ArrayList arrayList3 = yh.t5.y(i11, false).I;
                arrayList2.add(LocaleController.getString(R.string.Gift2TabMine));
                int i15 = 0;
                int i16 = 0;
                while (i15 < arrayList3.size()) {
                    TL_stars.StarGift starGift = (TL_stars.StarGift) arrayList3.get(i15);
                    if ((i12 == 0 || (i12 == i13 && starGift.peer_color_available)) && starGift.availability_resale > 0) {
                        if (qp0Var.K == starGift) {
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
                ip0 ip0Var = new ip0(this, 0);
                ArrayList arrayList4 = vp0Var.f;
                boolean z11 = vp0Var.K == 0;
                vp0Var.K = 0;
                vp0Var.h = ip0Var;
                arrayList4.clear();
                arrayList4.addAll(arrayList2);
                vp0Var.c.l();
                vp0Var.a(i16, z11);
                qp0Var.l(vp0Var);
                view.post(new gp0(qp0Var, 3));
                break;
            case 11:
                ((op0) view).a();
                break;
            case 12:
                xh.i1 i1Var = (xh.i1) view;
                int i17 = i10 - qp0Var.b0;
                if (qp0Var.J != null && i17 >= 0 && i17 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(i17);
                    i1Var.g(tL_starGiftUnique2, false, false, false, true, false);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = qp0Var.r;
                    if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.id) && ((tL_peerColorCollectible2 = qp0Var.s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique2.id)) {
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
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.d6 d6Var2;
        org.telegram.ui.ActionBar.d6 d6Var3;
        org.telegram.ui.ActionBar.d6 d6Var4;
        View view;
        View view2;
        int i12;
        org.telegram.ui.ActionBar.d6 d6Var5;
        qp0 qp0Var = this.e;
        wp0 wp0Var = qp0Var.p0;
        switch (i10) {
            case 1:
                Context context = qp0Var.getContext();
                i11 = ((org.telegram.ui.ActionBar.n2) wp0Var).currentAccount;
                d6Var = ((org.telegram.ui.ActionBar.n2) wp0Var).resourceProvider;
                tp0 tp0Var = new tp0(this.d, i11, context, d6Var);
                qp0Var.f = tp0Var;
                tp0Var.setBackgroundColor(wp0Var.getThemedColor(org.telegram.ui.ActionBar.i6.d6));
                tp0Var.a(qp0Var.h, false);
                tp0Var.setOnColorClick(new ip0(this, 1));
                view2 = tp0Var;
                break;
            case 2:
            default:
                view2 = new org.telegram.ui.Cells.e9(qp0Var.getContext(), wp0Var.getResourceProvider());
                break;
            case 3:
                pp0 pp0Var = new pp0(qp0Var, qp0Var.getContext());
                qp0Var.y = pp0Var;
                pp0Var.b(false);
                view2 = pp0Var;
                break;
            case 4:
                View nnVar = new org.telegram.ui.Components.nn(qp0Var.getContext(), 20);
                nnVar.setTag(-33024);
                view = nnVar;
                view2 = view;
                break;
            case 5:
                View view3 = new View(qp0Var.getContext());
                view3.setTag(-33024);
                view = view3;
                view2 = view;
                break;
            case 6:
                View r8Var = new org.telegram.ui.Cells.r8(qp0Var.getContext(), wp0Var.getResourceProvider());
                r8Var.setBackgroundColor(wp0Var.getThemedColor(org.telegram.ui.ActionBar.i6.d6));
                view2 = r8Var;
                break;
            case 7:
                Context context2 = qp0Var.getContext();
                d6Var2 = ((org.telegram.ui.ActionBar.n2) wp0Var).resourceProvider;
                View m4Var = new org.telegram.ui.Cells.m4(context2, d6Var2);
                m4Var.setBackgroundColor(wp0Var.getThemedColor(org.telegram.ui.ActionBar.i6.d6));
                view2 = m4Var;
                break;
            case 8:
                Context context3 = qp0Var.getContext();
                d6Var3 = ((org.telegram.ui.ActionBar.n2) wp0Var).resourceProvider;
                View ep0Var = new ep0(context3, d6Var3, false);
                ep0Var.setTag(-33024);
                view = ep0Var;
                view2 = view;
                break;
            case 9:
                Context context4 = this.c;
                d6Var4 = ((org.telegram.ui.ActionBar.n2) wp0Var).resourceProvider;
                org.telegram.ui.Components.w00 w00Var = new org.telegram.ui.Components.w00(context4, d6Var4);
                w00Var.setIsSingleCell(true);
                w00Var.setViewType(35);
                w00Var.setTag(-33024);
                view = w00Var;
                view2 = view;
                break;
            case 10:
                View nnVar2 = new org.telegram.ui.Components.nn(qp0Var.getContext(), 21);
                nnVar2.setTag(-33024);
                view = nnVar2;
                view2 = view;
                break;
            case 11:
                view2 = new op0(qp0Var, qp0Var.getContext());
                break;
            case 12:
                Context context5 = qp0Var.getContext();
                i12 = ((org.telegram.ui.ActionBar.n2) wp0Var).currentAccount;
                d6Var5 = ((org.telegram.ui.ActionBar.n2) wp0Var).resourceProvider;
                View i1Var = new xh.i1(context5, i12, d6Var5);
                i1Var.setTag(-33024);
                view = i1Var;
                view2 = view;
                break;
        }
        return new org.telegram.ui.Components.il0(view2);
    }

    @Override // s4.h0
    public final void y(s4.c1 c1Var) {
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        qp0 qp0Var = this.e;
        ArrayList arrayList = qp0Var.l0;
        int i10 = c1Var.f;
        View view = c1Var.a;
        if (i10 == 10) {
            qp0Var.F = view;
            view.post(new gp0(qp0Var, 2));
            return;
        }
        boolean z10 = true;
        if (i10 == 8) {
            ep0 ep0Var = (ep0) view;
            int b10 = c1Var.b() - qp0Var.b0;
            if (b10 < 0 || b10 >= arrayList.size()) {
                return;
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(b10);
            ep0Var.a(b10, tL_starGiftUnique);
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = qp0Var.r;
            if ((tL_emojiStatusCollectible == null || tL_emojiStatusCollectible.collectible_id != tL_starGiftUnique.id) && ((tL_peerColorCollectible2 = qp0Var.s) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique.id)) {
                z10 = false;
            }
            ep0Var.b(z10, false);
            return;
        }
        if (i10 == 12) {
            xh.i1 i1Var = (xh.i1) view;
            int b11 = c1Var.b() - qp0Var.b0;
            if (qp0Var.J != null && b11 >= 0 && b11 < arrayList.size()) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(b11);
                i1Var.g(tL_starGiftUnique2, false, false, false, true, false);
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = qp0Var.r;
                if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.id) && ((tL_peerColorCollectible = qp0Var.s) == null || tL_peerColorCollectible.collectible_id != tL_starGiftUnique2.id)) {
                    z10 = false;
                }
                i1Var.e(z10, false);
            }
        }
    }
}
