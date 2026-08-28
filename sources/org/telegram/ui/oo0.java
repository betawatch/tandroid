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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class oo0 extends org.telegram.ui.Components.vk0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ int d;
    public final /* synthetic */ uo0 e;

    public oo0(uo0 uo0Var, Context context, int i9) {
        this.e = uo0Var;
        this.c = context;
        this.d = i9;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        int i9 = q1Var.f;
        return i9 == 3 || i9 == 6 || i9 == 8 || i9 == 12;
    }

    @Override // f2.r0
    public final int h() {
        return this.e.a0;
    }

    @Override // f2.r0
    public final int j(int i9) {
        uo0 uo0Var = this.e;
        if (i9 != uo0Var.I && i9 != uo0Var.U && i9 != uo0Var.K && i9 != uo0Var.N) {
            if (i9 == uo0Var.H) {
                return 1;
            }
            if (i9 == uo0Var.J) {
                return 3;
            }
            if (i9 == uo0Var.L) {
                return 5;
            }
            if (i9 == uo0Var.M) {
                return 6;
            }
            if (i9 == uo0Var.V) {
                return 10;
            }
            if (i9 == uo0Var.W) {
                return 11;
            }
            if (i9 == uo0Var.O) {
                return 7;
            }
            if (i9 >= uo0Var.P && i9 < uo0Var.Q) {
                return uo0Var.B == null ? 8 : 12;
            }
            if (i9 >= uo0Var.R && i9 < uo0Var.S) {
                return 9;
            }
            if (i9 == uo0Var.a0 - 1) {
                return 4;
            }
        }
        return 2;
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        String string;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        int i10;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        View view = q1Var.a;
        uo0 uo0Var = this.e;
        HashMap hashMap = uo0Var.D;
        ArrayList arrayList = uo0Var.b0;
        ArrayList arrayList2 = uo0Var.C;
        zo0 zo0Var = uo0Var.f0;
        int j10 = j(i9);
        int i11 = this.d;
        int i12 = 1;
        r10 = true;
        boolean z10 = true;
        switch (j10) {
            case 1:
                view.setBackgroundColor(zo0Var.getThemedColor(org.telegram.ui.ActionBar.f6.d6));
                ((xo0) view).b();
                break;
            case 2:
                org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
                b9Var.setFixedSize(0);
                if (i9 != uo0Var.I) {
                    if (i9 != uo0Var.N) {
                        if (i9 == uo0Var.U) {
                            b9Var.setText(LocaleController.getString(R.string.UserProfileCollectibleInfo));
                            b9Var.setBackground(org.telegram.ui.ActionBar.f6.V0(uo0Var.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.f6.b7));
                            break;
                        }
                    } else {
                        b9Var.setText("");
                        b9Var.setFixedSize(12);
                        b9Var.setBackground(org.telegram.ui.ActionBar.f6.V0(uo0Var.getContext(), uo0Var.O >= 0 ? R.drawable.greydivider : R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.f6.b7));
                        break;
                    }
                } else {
                    if (i11 == 1) {
                        string = LocaleController.getString(zo0Var.a ? R.string.ChannelColorHint : R.string.UserColorHint);
                    } else {
                        string = LocaleController.getString(zo0Var.a ? R.string.ChannelProfileHint : R.string.UserProfileHint2);
                    }
                    b9Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string, new org.telegram.ui.Components.qd(this, i11, 20)), true));
                    b9Var.setBackground(org.telegram.ui.ActionBar.f6.V0(uo0Var.getContext(), uo0Var.M >= 0 ? R.drawable.greydivider : R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.f6.b7));
                    break;
                }
                break;
            case 3:
                to0 to0Var = (to0) view;
                zo0 zo0Var2 = to0Var.d.f0;
                to0Var.setBackgroundColor(zo0Var2.getThemedColor(org.telegram.ui.ActionBar.f6.d6));
                to0Var.a.setTextColor(zo0Var2.getThemedColor(org.telegram.ui.ActionBar.f6.G6));
                break;
            case 6:
                org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
                p8Var.v();
                p8Var.setBackgroundColor(zo0Var.getThemedColor(org.telegram.ui.ActionBar.f6.d6));
                p8Var.v();
                if (i9 == uo0Var.M) {
                    p8Var.i(LocaleController.getString(zo0Var.a ? R.string.ChannelProfileColorReset : R.string.UserProfileColorReset), false);
                    break;
                }
                break;
            case 7:
                org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                if (i9 == uo0Var.O) {
                    m4Var.c(LocaleController.getString(R.string.UserProfileCollectibleHeader), false);
                }
                m4Var.setBackgroundColor(zo0Var.getThemedColor(org.telegram.ui.ActionBar.f6.d6));
                break;
            case 8:
                ko0 ko0Var = (ko0) view;
                int i13 = i9 - uo0Var.P;
                if (i13 >= 0 && i13 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(i13);
                    ko0Var.a(i13, tL_starGiftUnique);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = uo0Var.s;
                    ko0Var.b((tL_emojiStatusCollectible != null && tL_emojiStatusCollectible.collectible_id == tL_starGiftUnique.id) || ((tL_peerColorCollectible = uo0Var.v) != null && tL_peerColorCollectible.collectible_id == tL_starGiftUnique.id), false);
                    ko0Var.d.invalidate();
                    break;
                }
                break;
            case 10:
                fh.o2 o2Var = (fh.o2) view;
                arrayList2.clear();
                hashMap.clear();
                i10 = ((org.telegram.ui.ActionBar.o2) zo0Var).currentAccount;
                ArrayList arrayList3 = gh.v7.y(i10, false).I;
                arrayList2.add(LocaleController.getString(R.string.Gift2TabMine));
                int i14 = 0;
                int i15 = 0;
                while (i14 < arrayList3.size()) {
                    TL_stars.StarGift starGift = (TL_stars.StarGift) arrayList3.get(i14);
                    if ((i11 == 0 || (i11 == i12 && starGift.peer_color_available)) && starGift.availability_resale > 0) {
                        if (uo0Var.B == starGift) {
                            i15 = arrayList2.size();
                        }
                        hashMap.put(Integer.valueOf(arrayList2.size()), starGift);
                        TextPaint textPaint = new TextPaint(i12);
                        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
                        org.telegram.ui.Components.t5 t5Var = new org.telegram.ui.Components.t5(starGift.getDocument(), textPaint.getFontMetricsInt());
                        t5Var.size = AndroidUtilities.dp(14.0f);
                        spannableStringBuilder.setSpan(t5Var, 0, 1, 33);
                        spannableStringBuilder.append(starGift.title);
                        arrayList2.add(spannableStringBuilder);
                    }
                    i14++;
                    i12 = 1;
                }
                o2Var.a(0, arrayList2, i15, new no0(this, 0));
                o2Var.setBackgroundColor(zo0Var.getThemedColor(org.telegram.ui.ActionBar.f6.d6));
                o2Var.b();
                break;
            case 11:
                ((so0) view).a();
                break;
            case 12:
                fh.f2 f2Var = (fh.f2) view;
                int i16 = i9 - uo0Var.P;
                if (uo0Var.A != null && i16 >= 0 && i16 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(i16);
                    f2Var.g(tL_starGiftUnique2, false, false, false, true, false);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = uo0Var.s;
                    if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.id) && ((tL_peerColorCollectible2 = uo0Var.v) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique2.id)) {
                        z10 = false;
                    }
                    f2Var.e(z10, false);
                    break;
                }
                break;
        }
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        int i10;
        org.telegram.ui.ActionBar.b6 b6Var;
        org.telegram.ui.ActionBar.b6 b6Var2;
        org.telegram.ui.ActionBar.b6 b6Var3;
        org.telegram.ui.ActionBar.b6 b6Var4;
        int i11;
        org.telegram.ui.ActionBar.b6 b6Var5;
        View view;
        uo0 uo0Var = this.e;
        zo0 zo0Var = uo0Var.f0;
        switch (i9) {
            case 1:
                Context context = uo0Var.getContext();
                i10 = ((org.telegram.ui.ActionBar.o2) zo0Var).currentAccount;
                b6Var = ((org.telegram.ui.ActionBar.o2) zo0Var).resourceProvider;
                xo0 xo0Var = new xo0(this.d, i10, context, b6Var);
                uo0Var.h = xo0Var;
                xo0Var.setBackgroundColor(zo0Var.getThemedColor(org.telegram.ui.ActionBar.f6.d6));
                xo0Var.a(uo0Var.n, false);
                xo0Var.setOnColorClick(new no0(this, 1));
                view = xo0Var;
                break;
            case 2:
            default:
                view = new org.telegram.ui.Cells.b9(uo0Var.getContext(), zo0Var.getResourceProvider());
                break;
            case 3:
                to0 to0Var = new to0(uo0Var, uo0Var.getContext());
                uo0Var.x = to0Var;
                to0Var.b(false);
                view = to0Var;
                break;
            case 4:
                View anVar = new org.telegram.ui.Components.an(uo0Var.getContext(), 22);
                anVar.setBackground(org.telegram.ui.ActionBar.f6.V0(uo0Var.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.f6.b7));
                view = anVar;
                break;
            case 5:
                view = new org.telegram.ui.Components.an(uo0Var.getContext(), 21);
                break;
            case 6:
                View p8Var = new org.telegram.ui.Cells.p8(uo0Var.getContext(), zo0Var.getResourceProvider());
                p8Var.setBackgroundColor(zo0Var.getThemedColor(org.telegram.ui.ActionBar.f6.d6));
                view = p8Var;
                break;
            case 7:
                Context context2 = uo0Var.getContext();
                b6Var2 = ((org.telegram.ui.ActionBar.o2) zo0Var).resourceProvider;
                View m4Var = new org.telegram.ui.Cells.m4(context2, b6Var2);
                m4Var.setBackgroundColor(zo0Var.getThemedColor(org.telegram.ui.ActionBar.f6.d6));
                view = m4Var;
                break;
            case 8:
                Context context3 = uo0Var.getContext();
                b6Var3 = ((org.telegram.ui.ActionBar.o2) zo0Var).resourceProvider;
                view = new ko0(context3, b6Var3, false);
                break;
            case 9:
                Context context4 = this.c;
                b6Var4 = ((org.telegram.ui.ActionBar.o2) zo0Var).resourceProvider;
                org.telegram.ui.Components.e00 e00Var = new org.telegram.ui.Components.e00(context4, b6Var4);
                e00Var.setIsSingleCell(true);
                e00Var.setViewType(35);
                view = e00Var;
                break;
            case 10:
                View o2Var = new fh.o2(uo0Var.getContext(), false);
                o2Var.setBackgroundColor(zo0Var.getThemedColor(org.telegram.ui.ActionBar.f6.d6));
                view = o2Var;
                break;
            case 11:
                view = new so0(uo0Var, uo0Var.getContext());
                break;
            case 12:
                Context context5 = uo0Var.getContext();
                i11 = ((org.telegram.ui.ActionBar.o2) zo0Var).currentAccount;
                b6Var5 = ((org.telegram.ui.ActionBar.o2) zo0Var).resourceProvider;
                view = new fh.f2(context5, i11, b6Var5);
                break;
        }
        return new org.telegram.ui.Components.ik0(view);
    }

    @Override // f2.r0
    public final void y(f2.q1 q1Var) {
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        uo0 uo0Var = this.e;
        ArrayList arrayList = uo0Var.b0;
        int i9 = q1Var.f;
        View view = q1Var.a;
        boolean z10 = true;
        if (i9 == 8) {
            ko0 ko0Var = (ko0) view;
            int b10 = q1Var.b() - uo0Var.P;
            if (b10 < 0 || b10 >= arrayList.size()) {
                return;
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(b10);
            ko0Var.a(b10, tL_starGiftUnique);
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = uo0Var.s;
            if ((tL_emojiStatusCollectible == null || tL_emojiStatusCollectible.collectible_id != tL_starGiftUnique.id) && ((tL_peerColorCollectible2 = uo0Var.v) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique.id)) {
                z10 = false;
            }
            ko0Var.b(z10, false);
            return;
        }
        if (i9 == 12) {
            fh.f2 f2Var = (fh.f2) view;
            int b11 = q1Var.b() - uo0Var.P;
            if (uo0Var.A != null && b11 >= 0 && b11 < arrayList.size()) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(b11);
                f2Var.g(tL_starGiftUnique2, false, false, false, true, false);
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = uo0Var.s;
                if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.id) && ((tL_peerColorCollectible = uo0Var.v) == null || tL_peerColorCollectible.collectible_id != tL_starGiftUnique2.id)) {
                    z10 = false;
                }
                f2Var.e(z10, false);
            }
        }
    }
}
