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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class po0 extends org.telegram.ui.Components.yk0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ int d;
    public final /* synthetic */ vo0 e;

    public po0(vo0 vo0Var, Context context, int i10) {
        this.e = vo0Var;
        this.c = context;
        this.d = i10;
    }

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(f2.o1 o1Var) {
        int i10 = o1Var.f;
        return i10 == 3 || i10 == 6 || i10 == 8 || i10 == 12;
    }

    @Override // f2.q0
    public final int h() {
        return this.e.a0;
    }

    @Override // f2.q0
    public final int j(int i10) {
        vo0 vo0Var = this.e;
        if (i10 != vo0Var.I && i10 != vo0Var.U && i10 != vo0Var.K && i10 != vo0Var.N) {
            if (i10 == vo0Var.H) {
                return 1;
            }
            if (i10 == vo0Var.J) {
                return 3;
            }
            if (i10 == vo0Var.L) {
                return 5;
            }
            if (i10 == vo0Var.M) {
                return 6;
            }
            if (i10 == vo0Var.V) {
                return 10;
            }
            if (i10 == vo0Var.W) {
                return 11;
            }
            if (i10 == vo0Var.O) {
                return 7;
            }
            if (i10 >= vo0Var.P && i10 < vo0Var.Q) {
                return vo0Var.B == null ? 8 : 12;
            }
            if (i10 >= vo0Var.R && i10 < vo0Var.S) {
                return 9;
            }
            if (i10 == vo0Var.a0 - 1) {
                return 4;
            }
        }
        return 2;
    }

    @Override // f2.q0
    public final void v(f2.o1 o1Var, int i10) {
        String string;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        int i11;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        View view = o1Var.a;
        vo0 vo0Var = this.e;
        HashMap hashMap = vo0Var.D;
        ArrayList arrayList = vo0Var.b0;
        ArrayList arrayList2 = vo0Var.C;
        ap0 ap0Var = vo0Var.f0;
        int j10 = j(i10);
        int i12 = this.d;
        int i13 = 1;
        r10 = true;
        boolean z10 = true;
        switch (j10) {
            case 1:
                view.setBackgroundColor(ap0Var.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                ((yo0) view).b();
                break;
            case 2:
                org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
                x8Var.setFixedSize(0);
                if (i10 != vo0Var.I) {
                    if (i10 != vo0Var.N) {
                        if (i10 == vo0Var.U) {
                            x8Var.setText(LocaleController.getString(R.string.UserProfileCollectibleInfo));
                            x8Var.setBackground(org.telegram.ui.ActionBar.g6.V0(vo0Var.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.b7));
                            break;
                        }
                    } else {
                        x8Var.setText("");
                        x8Var.setFixedSize(12);
                        x8Var.setBackground(org.telegram.ui.ActionBar.g6.V0(vo0Var.getContext(), vo0Var.O >= 0 ? R.drawable.greydivider : R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.b7));
                        break;
                    }
                } else {
                    if (i12 == 1) {
                        string = LocaleController.getString(ap0Var.a ? R.string.ChannelColorHint : R.string.UserColorHint);
                    } else {
                        string = LocaleController.getString(ap0Var.a ? R.string.ChannelProfileHint : R.string.UserProfileHint2);
                    }
                    x8Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string, new org.telegram.ui.Components.xl(this, i12, 19)), true));
                    x8Var.setBackground(org.telegram.ui.ActionBar.g6.V0(vo0Var.getContext(), vo0Var.M >= 0 ? R.drawable.greydivider : R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.b7));
                    break;
                }
                break;
            case 3:
                uo0 uo0Var = (uo0) view;
                ap0 ap0Var2 = uo0Var.d.f0;
                uo0Var.setBackgroundColor(ap0Var2.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                uo0Var.a.setTextColor(ap0Var2.getThemedColor(org.telegram.ui.ActionBar.g6.G6));
                break;
            case 6:
                org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view;
                l8Var.v();
                l8Var.setBackgroundColor(ap0Var.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                l8Var.v();
                if (i10 == vo0Var.M) {
                    l8Var.i(LocaleController.getString(ap0Var.a ? R.string.ChannelProfileColorReset : R.string.UserProfileColorReset), false);
                    break;
                }
                break;
            case 7:
                org.telegram.ui.Cells.j4 j4Var = (org.telegram.ui.Cells.j4) view;
                if (i10 == vo0Var.O) {
                    j4Var.c(LocaleController.getString(R.string.UserProfileCollectibleHeader), false);
                }
                j4Var.setBackgroundColor(ap0Var.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                break;
            case 8:
                lo0 lo0Var = (lo0) view;
                int i14 = i10 - vo0Var.P;
                if (i14 >= 0 && i14 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(i14);
                    lo0Var.a(i14, tL_starGiftUnique);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = vo0Var.s;
                    lo0Var.b((tL_emojiStatusCollectible != null && tL_emojiStatusCollectible.collectible_id == tL_starGiftUnique.id) || ((tL_peerColorCollectible = vo0Var.v) != null && tL_peerColorCollectible.collectible_id == tL_starGiftUnique.id), false);
                    lo0Var.d.invalidate();
                    break;
                }
                break;
            case 10:
                gh.j2 j2Var = (gh.j2) view;
                arrayList2.clear();
                hashMap.clear();
                i11 = ((org.telegram.ui.ActionBar.n2) ap0Var).currentAccount;
                ArrayList arrayList3 = hh.u7.y(i11, false).I;
                arrayList2.add(LocaleController.getString(R.string.Gift2TabMine));
                int i15 = 0;
                int i16 = 0;
                while (i15 < arrayList3.size()) {
                    TL_stars.StarGift starGift = (TL_stars.StarGift) arrayList3.get(i15);
                    if ((i12 == 0 || (i12 == i13 && starGift.peer_color_available)) && starGift.availability_resale > 0) {
                        if (vo0Var.B == starGift) {
                            i16 = arrayList2.size();
                        }
                        hashMap.put(Integer.valueOf(arrayList2.size()), starGift);
                        TextPaint textPaint = new TextPaint(i13);
                        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
                        org.telegram.ui.Components.t5 t5Var = new org.telegram.ui.Components.t5(starGift.getDocument(), textPaint.getFontMetricsInt());
                        t5Var.size = AndroidUtilities.dp(14.0f);
                        spannableStringBuilder.setSpan(t5Var, 0, 1, 33);
                        spannableStringBuilder.append(starGift.title);
                        arrayList2.add(spannableStringBuilder);
                    }
                    i15++;
                    i13 = 1;
                }
                j2Var.a(0, arrayList2, i16, new oo0(this, 0));
                j2Var.setBackgroundColor(ap0Var.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                j2Var.b();
                break;
            case 11:
                ((to0) view).a();
                break;
            case 12:
                gh.b2 b2Var = (gh.b2) view;
                int i17 = i10 - vo0Var.P;
                if (vo0Var.A != null && i17 >= 0 && i17 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(i17);
                    b2Var.g(tL_starGiftUnique2, false, false, false, true, false);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = vo0Var.s;
                    if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.id) && ((tL_peerColorCollectible2 = vo0Var.v) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique2.id)) {
                        z10 = false;
                    }
                    b2Var.e(z10, false);
                    break;
                }
                break;
        }
    }

    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        int i11;
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.ActionBar.c6 c6Var2;
        org.telegram.ui.ActionBar.c6 c6Var3;
        org.telegram.ui.ActionBar.c6 c6Var4;
        int i12;
        org.telegram.ui.ActionBar.c6 c6Var5;
        View view;
        vo0 vo0Var = this.e;
        ap0 ap0Var = vo0Var.f0;
        switch (i10) {
            case 1:
                Context context = vo0Var.getContext();
                i11 = ((org.telegram.ui.ActionBar.n2) ap0Var).currentAccount;
                c6Var = ((org.telegram.ui.ActionBar.n2) ap0Var).resourceProvider;
                yo0 yo0Var = new yo0(this.d, i11, context, c6Var);
                vo0Var.h = yo0Var;
                yo0Var.setBackgroundColor(ap0Var.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                yo0Var.a(vo0Var.n, false);
                yo0Var.setOnColorClick(new oo0(this, 1));
                view = yo0Var;
                break;
            case 2:
            default:
                view = new org.telegram.ui.Cells.x8(vo0Var.getContext(), ap0Var.getResourceProvider());
                break;
            case 3:
                uo0 uo0Var = new uo0(vo0Var, vo0Var.getContext());
                vo0Var.x = uo0Var;
                uo0Var.b(false);
                view = uo0Var;
                break;
            case 4:
                View zmVar = new org.telegram.ui.Components.zm(vo0Var.getContext(), 20);
                zmVar.setBackground(org.telegram.ui.ActionBar.g6.V0(vo0Var.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.b7));
                view = zmVar;
                break;
            case 5:
                view = new org.telegram.ui.Components.zm(vo0Var.getContext(), 19);
                break;
            case 6:
                View l8Var = new org.telegram.ui.Cells.l8(vo0Var.getContext(), ap0Var.getResourceProvider());
                l8Var.setBackgroundColor(ap0Var.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                view = l8Var;
                break;
            case 7:
                Context context2 = vo0Var.getContext();
                c6Var2 = ((org.telegram.ui.ActionBar.n2) ap0Var).resourceProvider;
                View j4Var = new org.telegram.ui.Cells.j4(context2, c6Var2);
                j4Var.setBackgroundColor(ap0Var.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                view = j4Var;
                break;
            case 8:
                Context context3 = vo0Var.getContext();
                c6Var3 = ((org.telegram.ui.ActionBar.n2) ap0Var).resourceProvider;
                view = new lo0(context3, c6Var3, false);
                break;
            case 9:
                Context context4 = this.c;
                c6Var4 = ((org.telegram.ui.ActionBar.n2) ap0Var).resourceProvider;
                org.telegram.ui.Components.h00 h00Var = new org.telegram.ui.Components.h00(context4, c6Var4);
                h00Var.setIsSingleCell(true);
                h00Var.setViewType(35);
                view = h00Var;
                break;
            case 10:
                View j2Var = new gh.j2(vo0Var.getContext(), false);
                j2Var.setBackgroundColor(ap0Var.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                view = j2Var;
                break;
            case 11:
                view = new to0(vo0Var, vo0Var.getContext());
                break;
            case 12:
                Context context5 = vo0Var.getContext();
                i12 = ((org.telegram.ui.ActionBar.n2) ap0Var).currentAccount;
                c6Var5 = ((org.telegram.ui.ActionBar.n2) ap0Var).resourceProvider;
                view = new gh.b2(context5, i12, c6Var5);
                break;
        }
        return new org.telegram.ui.Components.lk0(view);
    }

    @Override // f2.q0
    public final void y(f2.o1 o1Var) {
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        vo0 vo0Var = this.e;
        ArrayList arrayList = vo0Var.b0;
        int i10 = o1Var.f;
        View view = o1Var.a;
        boolean z10 = true;
        if (i10 == 8) {
            lo0 lo0Var = (lo0) view;
            int b10 = o1Var.b() - vo0Var.P;
            if (b10 < 0 || b10 >= arrayList.size()) {
                return;
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(b10);
            lo0Var.a(b10, tL_starGiftUnique);
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = vo0Var.s;
            if ((tL_emojiStatusCollectible == null || tL_emojiStatusCollectible.collectible_id != tL_starGiftUnique.id) && ((tL_peerColorCollectible2 = vo0Var.v) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique.id)) {
                z10 = false;
            }
            lo0Var.b(z10, false);
            return;
        }
        if (i10 == 12) {
            gh.b2 b2Var = (gh.b2) view;
            int b11 = o1Var.b() - vo0Var.P;
            if (vo0Var.A != null && b11 >= 0 && b11 < arrayList.size()) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(b11);
                b2Var.g(tL_starGiftUnique2, false, false, false, true, false);
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = vo0Var.s;
                if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.id) && ((tL_peerColorCollectible = vo0Var.v) == null || tL_peerColorCollectible.collectible_id != tL_starGiftUnique2.id)) {
                    z10 = false;
                }
                b2Var.e(z10, false);
            }
        }
    }
}
