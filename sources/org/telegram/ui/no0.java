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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class no0 extends org.telegram.ui.Components.il0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ int d;
    public final /* synthetic */ to0 e;

    public no0(to0 to0Var, Context context, int i10) {
        this.e = to0Var;
        this.c = context;
        this.d = i10;
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        int i10 = n1Var.f;
        return i10 == 3 || i10 == 6 || i10 == 8 || i10 == 12;
    }

    @Override // f2.p0
    public final int h() {
        return this.e.a0;
    }

    @Override // f2.p0
    public final int j(int i10) {
        to0 to0Var = this.e;
        if (i10 != to0Var.I && i10 != to0Var.U && i10 != to0Var.K && i10 != to0Var.N) {
            if (i10 == to0Var.H) {
                return 1;
            }
            if (i10 == to0Var.J) {
                return 3;
            }
            if (i10 == to0Var.L) {
                return 5;
            }
            if (i10 == to0Var.M) {
                return 6;
            }
            if (i10 == to0Var.V) {
                return 10;
            }
            if (i10 == to0Var.W) {
                return 11;
            }
            if (i10 == to0Var.O) {
                return 7;
            }
            if (i10 >= to0Var.P && i10 < to0Var.Q) {
                return to0Var.B == null ? 8 : 12;
            }
            if (i10 >= to0Var.R && i10 < to0Var.S) {
                return 9;
            }
            if (i10 == to0Var.a0 - 1) {
                return 4;
            }
        }
        return 2;
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        String string;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        int i11;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        View view = n1Var.a;
        to0 to0Var = this.e;
        HashMap hashMap = to0Var.D;
        ArrayList arrayList = to0Var.b0;
        ArrayList arrayList2 = to0Var.C;
        yo0 yo0Var = to0Var.f0;
        int j10 = j(i10);
        int i12 = this.d;
        int i13 = 1;
        r10 = true;
        boolean z10 = true;
        switch (j10) {
            case 1:
                view.setBackgroundColor(yo0Var.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                ((wo0) view).b();
                break;
            case 2:
                org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
                y8Var.setFixedSize(0);
                if (i10 != to0Var.I) {
                    if (i10 != to0Var.N) {
                        if (i10 == to0Var.U) {
                            y8Var.setText(LocaleController.getString(R.string.UserProfileCollectibleInfo));
                            y8Var.setBackground(org.telegram.ui.ActionBar.g6.V0(to0Var.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.b7));
                            break;
                        }
                    } else {
                        y8Var.setText("");
                        y8Var.setFixedSize(12);
                        y8Var.setBackground(org.telegram.ui.ActionBar.g6.V0(to0Var.getContext(), to0Var.O >= 0 ? R.drawable.greydivider : R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.b7));
                        break;
                    }
                } else {
                    if (i12 == 1) {
                        string = LocaleController.getString(yo0Var.a ? R.string.ChannelColorHint : R.string.UserColorHint);
                    } else {
                        string = LocaleController.getString(yo0Var.a ? R.string.ChannelProfileHint : R.string.UserProfileHint2);
                    }
                    y8Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(string, new org.telegram.ui.Components.i8(this, i12, 22)), true));
                    y8Var.setBackground(org.telegram.ui.ActionBar.g6.V0(to0Var.getContext(), to0Var.M >= 0 ? R.drawable.greydivider : R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.b7));
                    break;
                }
                break;
            case 3:
                so0 so0Var = (so0) view;
                yo0 yo0Var2 = so0Var.d.f0;
                so0Var.setBackgroundColor(yo0Var2.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                so0Var.a.setTextColor(yo0Var2.getThemedColor(org.telegram.ui.ActionBar.g6.G6));
                break;
            case 6:
                org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
                m8Var.v();
                m8Var.setBackgroundColor(yo0Var.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                m8Var.v();
                if (i10 == to0Var.M) {
                    m8Var.i(LocaleController.getString(yo0Var.a ? R.string.ChannelProfileColorReset : R.string.UserProfileColorReset), false);
                    break;
                }
                break;
            case 7:
                org.telegram.ui.Cells.k4 k4Var = (org.telegram.ui.Cells.k4) view;
                if (i10 == to0Var.O) {
                    k4Var.c(LocaleController.getString(R.string.UserProfileCollectibleHeader), false);
                }
                k4Var.setBackgroundColor(yo0Var.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                break;
            case 8:
                jo0 jo0Var = (jo0) view;
                int i14 = i10 - to0Var.P;
                if (i14 >= 0 && i14 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(i14);
                    jo0Var.a(i14, tL_starGiftUnique);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = to0Var.s;
                    jo0Var.b((tL_emojiStatusCollectible != null && tL_emojiStatusCollectible.collectible_id == tL_starGiftUnique.id) || ((tL_peerColorCollectible = to0Var.v) != null && tL_peerColorCollectible.collectible_id == tL_starGiftUnique.id), false);
                    jo0Var.d.invalidate();
                    break;
                }
                break;
            case 10:
                ih.g2 g2Var = (ih.g2) view;
                arrayList2.clear();
                hashMap.clear();
                i11 = ((org.telegram.ui.ActionBar.o2) yo0Var).currentAccount;
                ArrayList arrayList3 = jh.s7.y(i11, false).I;
                arrayList2.add(LocaleController.getString(R.string.Gift2TabMine));
                int i15 = 0;
                int i16 = 0;
                while (i15 < arrayList3.size()) {
                    TL_stars.StarGift starGift = (TL_stars.StarGift) arrayList3.get(i15);
                    if ((i12 == 0 || (i12 == i13 && starGift.peer_color_available)) && starGift.availability_resale > 0) {
                        if (to0Var.B == starGift) {
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
                g2Var.a(0, arrayList2, i16, new mo0(this, 0));
                g2Var.setBackgroundColor(yo0Var.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                g2Var.b();
                break;
            case 11:
                ((ro0) view).a();
                break;
            case 12:
                ih.y1 y1Var = (ih.y1) view;
                int i17 = i10 - to0Var.P;
                if (to0Var.A != null && i17 >= 0 && i17 < arrayList.size()) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(i17);
                    y1Var.g(tL_starGiftUnique2, false, false, false, true, false);
                    TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = to0Var.s;
                    if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.id) && ((tL_peerColorCollectible2 = to0Var.v) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique2.id)) {
                        z10 = false;
                    }
                    y1Var.e(z10, false);
                    break;
                }
                break;
        }
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        int i11;
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.ActionBar.c6 c6Var2;
        org.telegram.ui.ActionBar.c6 c6Var3;
        org.telegram.ui.ActionBar.c6 c6Var4;
        int i12;
        org.telegram.ui.ActionBar.c6 c6Var5;
        View view;
        to0 to0Var = this.e;
        yo0 yo0Var = to0Var.f0;
        switch (i10) {
            case 1:
                Context context = to0Var.getContext();
                i11 = ((org.telegram.ui.ActionBar.o2) yo0Var).currentAccount;
                c6Var = ((org.telegram.ui.ActionBar.o2) yo0Var).resourceProvider;
                wo0 wo0Var = new wo0(this.d, i11, context, c6Var);
                to0Var.h = wo0Var;
                wo0Var.setBackgroundColor(yo0Var.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                wo0Var.a(to0Var.n, false);
                wo0Var.setOnColorClick(new mo0(this, 1));
                view = wo0Var;
                break;
            case 2:
            default:
                view = new org.telegram.ui.Cells.y8(to0Var.getContext(), yo0Var.getResourceProvider());
                break;
            case 3:
                so0 so0Var = new so0(to0Var, to0Var.getContext());
                to0Var.x = so0Var;
                so0Var.b(false);
                view = so0Var;
                break;
            case 4:
                View fnVar = new org.telegram.ui.Components.fn(to0Var.getContext(), 19);
                fnVar.setBackground(org.telegram.ui.ActionBar.g6.V0(to0Var.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.b7));
                view = fnVar;
                break;
            case 5:
                view = new org.telegram.ui.Components.fn(to0Var.getContext(), 18);
                break;
            case 6:
                View m8Var = new org.telegram.ui.Cells.m8(to0Var.getContext(), yo0Var.getResourceProvider());
                m8Var.setBackgroundColor(yo0Var.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                view = m8Var;
                break;
            case 7:
                Context context2 = to0Var.getContext();
                c6Var2 = ((org.telegram.ui.ActionBar.o2) yo0Var).resourceProvider;
                View k4Var = new org.telegram.ui.Cells.k4(context2, c6Var2);
                k4Var.setBackgroundColor(yo0Var.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                view = k4Var;
                break;
            case 8:
                Context context3 = to0Var.getContext();
                c6Var3 = ((org.telegram.ui.ActionBar.o2) yo0Var).resourceProvider;
                view = new jo0(context3, c6Var3, false);
                break;
            case 9:
                Context context4 = this.c;
                c6Var4 = ((org.telegram.ui.ActionBar.o2) yo0Var).resourceProvider;
                org.telegram.ui.Components.p00 p00Var = new org.telegram.ui.Components.p00(context4, c6Var4);
                p00Var.setIsSingleCell(true);
                p00Var.setViewType(35);
                view = p00Var;
                break;
            case 10:
                View g2Var = new ih.g2(to0Var.getContext(), false);
                g2Var.setBackgroundColor(yo0Var.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                view = g2Var;
                break;
            case 11:
                view = new ro0(to0Var, to0Var.getContext());
                break;
            case 12:
                Context context5 = to0Var.getContext();
                i12 = ((org.telegram.ui.ActionBar.o2) yo0Var).currentAccount;
                c6Var5 = ((org.telegram.ui.ActionBar.o2) yo0Var).resourceProvider;
                view = new ih.y1(context5, i12, c6Var5);
                break;
        }
        return new org.telegram.ui.Components.vk0(view);
    }

    @Override // f2.p0
    public final void y(f2.n1 n1Var) {
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible;
        TLRPC.TL_peerColorCollectible tL_peerColorCollectible2;
        to0 to0Var = this.e;
        ArrayList arrayList = to0Var.b0;
        int i10 = n1Var.f;
        View view = n1Var.a;
        boolean z10 = true;
        if (i10 == 8) {
            jo0 jo0Var = (jo0) view;
            int b10 = n1Var.b() - to0Var.P;
            if (b10 < 0 || b10 >= arrayList.size()) {
                return;
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) arrayList.get(b10);
            jo0Var.a(b10, tL_starGiftUnique);
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = to0Var.s;
            if ((tL_emojiStatusCollectible == null || tL_emojiStatusCollectible.collectible_id != tL_starGiftUnique.id) && ((tL_peerColorCollectible2 = to0Var.v) == null || tL_peerColorCollectible2.collectible_id != tL_starGiftUnique.id)) {
                z10 = false;
            }
            jo0Var.b(z10, false);
            return;
        }
        if (i10 == 12) {
            ih.y1 y1Var = (ih.y1) view;
            int b11 = n1Var.b() - to0Var.P;
            if (to0Var.A != null && b11 >= 0 && b11 < arrayList.size()) {
                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) arrayList.get(b11);
                y1Var.g(tL_starGiftUnique2, false, false, false, true, false);
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible2 = to0Var.s;
                if ((tL_emojiStatusCollectible2 == null || tL_emojiStatusCollectible2.collectible_id != tL_starGiftUnique2.id) && ((tL_peerColorCollectible = to0Var.v) == null || tL_peerColorCollectible.collectible_id != tL_starGiftUnique2.id)) {
                    z10 = false;
                }
                y1Var.e(z10, false);
            }
        }
    }
}
