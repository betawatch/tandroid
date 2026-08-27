package ag;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import h7.z5;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.Cells.d4;
import org.telegram.ui.Cells.j4;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Cells.w6;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.h00;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.w80;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.Components.zm;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class z0 extends yk0 {
    public final /* synthetic */ i1 c;

    public z0(i1 i1Var) {
        this.c = i1Var;
    }

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(f2.o1 o1Var) {
        i1 i1Var = this.c;
        int i10 = i1Var.d0;
        if ((i10 == 11 || i10 == 34) && !i1Var.U) {
            return false;
        }
        int i11 = o1Var.f;
        return i11 == 1 || i11 == 4;
    }

    @Override // f2.q0
    public final int h() {
        return this.c.g0;
    }

    @Override // f2.q0
    public final int j(int i10) {
        int i11;
        i1 i1Var = this.c;
        if (i1Var.h0 == i10) {
            return 0;
        }
        if (i1Var.i0 == i10) {
            return 2;
        }
        if (i1Var.j0 == i10) {
            return 3;
        }
        if (i1Var.m0 == i10) {
            return 5;
        }
        if (i1Var.n0 == i10) {
            return 6;
        }
        if (i1Var.V == i10) {
            return 7;
        }
        if (i1Var.o0 == i10) {
            return 8;
        }
        ArrayList arrayList = i1Var.q0;
        if (arrayList != null && i10 >= (i11 = i1Var.p0) && i10 <= arrayList.size() + i11) {
            return 9;
        }
        int i12 = i1Var.d0;
        return (i12 == 5 || i12 == 11 || i12 == 34) ? 4 : 1;
    }

    @Override // f2.q0
    public final void v(f2.o1 o1Var, int i10) {
        int i11;
        String formatUserStatus;
        i1 i1Var = this.c;
        int i12 = i1Var.d0;
        HashSet hashSet = i1Var.u0;
        int i13 = o1Var.f;
        View view = o1Var.a;
        if (i13 == 1) {
            TLRPC.Chat chat = (TLRPC.Chat) i1Var.e0.get(i10 - i1Var.k0);
            org.telegram.ui.Cells.n nVar = (org.telegram.ui.Cells.n) view;
            TLRPC.Chat currentChannel = nVar.getCurrentChannel();
            nVar.a(chat, false);
            nVar.r.a(hashSet.contains(chat), currentChannel == chat);
            return;
        }
        if (i13 != 9) {
            if (i13 == 3) {
                j4 j4Var = (j4) view;
                if (i12 != 11 && i12 != 34) {
                    if (i12 == 2) {
                        j4Var.setText(LocaleController.getString(R.string.YourPublicCommunities));
                        return;
                    } else {
                        j4Var.setText(LocaleController.getString(R.string.LastActiveCommunities));
                        return;
                    }
                }
                if (i1Var.U) {
                    j4Var.setText(LocaleController.getString(R.string.ChannelInviteViaLink));
                    return;
                } else if (i1Var.x0.size() == 1) {
                    j4Var.setText(LocaleController.getString(R.string.ChannelInviteViaLinkRestricted2));
                    return;
                } else {
                    j4Var.setText(LocaleController.getString(R.string.ChannelInviteViaLinkRestricted3));
                    return;
                }
            }
            if (i13 != 4) {
                return;
            }
            d4 d4Var = (d4) view;
            if (i12 == 5) {
                TLRPC.Chat chat2 = (TLRPC.Chat) i1Var.v0.get(i10 - i1Var.k0);
                d4Var.e(chat2, chat2.title, (String) i1Var.w0.get(i10 - i1Var.k0), ((float) i10) != ((float) i1Var.l0) - 1.0f);
                d4Var.c(hashSet.contains(chat2), false);
                return;
            }
            if (i12 == 11 || i12 == 34) {
                TLRPC.User user = (TLRPC.User) i1Var.x0.get(i10 - i1Var.k0);
                ArrayList arrayList = i1Var.y0;
                boolean z10 = arrayList != null && arrayList.contains(Long.valueOf(user.id));
                TL_account.requirementToContactPremium requirementtocontactpremium = z10 ? new TL_account.requirementToContactPremium() : null;
                d4Var.N = true;
                d4Var.M = requirementtocontactpremium;
                d4Var.g();
                if (z10) {
                    formatUserStatus = LocaleController.getString(R.string.InvitePremiumBlockedUser);
                } else {
                    i11 = ((org.telegram.ui.ActionBar.e3) i1Var).currentAccount;
                    formatUserStatus = LocaleController.formatUserStatus(i11, user, null, null);
                }
                d4Var.e(user, ContactsController.formatName(user.first_name, user.last_name), formatUserStatus, ((float) i10) != ((float) i1Var.l0) - 1.0f);
                d4Var.c(hashSet.contains(user), false);
                return;
            }
            return;
        }
        int i14 = i10 - i1Var.p0;
        ArrayList arrayList2 = i1Var.q0;
        if (arrayList2 == null || i14 < 0 || i14 >= arrayList2.size()) {
            return;
        }
        c1 c1Var = (c1) view;
        b1 b1Var = (b1) i1Var.q0.get(i14);
        w wVar = c1Var.c;
        ImageView imageView = c1Var.a;
        h5 h5Var = c1Var.b;
        if (b1Var instanceof a1) {
            c1Var.f = (a1) b1Var;
            c1Var.e = null;
            imageView.setVisibility(8);
            h5Var.setVisibility(8);
            wVar.setVisibility(0);
            h5 h5Var2 = c1Var.d;
            a1 a1Var = c1Var.f;
            h5Var2.l(LocaleController.formatPluralString(a1Var.h ? "BoostLevelUnlocks" : "BoostLevel", a1Var.g, new Object[0]), false);
            return;
        }
        if (b1Var != null) {
            c1Var.f = null;
            c1Var.e = b1Var;
            imageView.setVisibility(0);
            imageView.setImageResource(c1Var.e.a);
            h5Var.setVisibility(0);
            b1 b1Var2 = c1Var.e;
            if (b1Var2.d != null) {
                String string = LocaleController.getString(c1Var.e.d + "_" + LocaleController.getStringParamForNumber(c1Var.e.e));
                if (string == null || string.startsWith("LOC_ERR")) {
                    string = LocaleController.getString(c1Var.e.d + "_other");
                }
                if (string == null) {
                    string = "";
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                int indexOf = string.indexOf("%d");
                if (indexOf >= 0) {
                    spannableStringBuilder = new SpannableStringBuilder(string);
                    SpannableString spannableString = new SpannableString(a9.p.k(c1Var.e.e, "", new StringBuilder()));
                    spannableString.setSpan(new k41(AndroidUtilities.bold()), 0, spannableString.length(), 33);
                    spannableStringBuilder.replace(indexOf, indexOf + 2, (CharSequence) spannableString);
                }
                h5Var.l(spannableStringBuilder, false);
            } else {
                String string2 = LocaleController.getString(b1Var2.b);
                String str = string2 != null ? string2 : "";
                if (c1Var.e.c != null) {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str);
                    int indexOf2 = str.indexOf("%s");
                    if (indexOf2 >= 0) {
                        spannableStringBuilder2 = new SpannableStringBuilder(str);
                        SpannableString spannableString2 = new SpannableString(c1Var.e.c);
                        spannableString2.setSpan(new k41(AndroidUtilities.bold()), 0, spannableString2.length(), 33);
                        spannableStringBuilder2.replace(indexOf2, indexOf2 + 2, (CharSequence) spannableString2);
                    }
                    h5Var.l(spannableStringBuilder2, false);
                } else {
                    h5Var.l(str, false);
                }
            }
            wVar.setVisibility(8);
        }
    }

    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        c6 c6Var;
        c6 c6Var2;
        int i11;
        int i12;
        int i13;
        int i14;
        c6 c6Var3;
        c6 c6Var4;
        c6 c6Var5;
        c6 c6Var6;
        c6 c6Var7;
        int i15;
        int i16;
        c6 c6Var8;
        c6 c6Var9;
        View view;
        c6 c6Var10;
        c6 c6Var11;
        c6 c6Var12;
        Context context = viewGroup.getContext();
        final int i17 = 0;
        i1 i1Var = this.c;
        switch (i10) {
            case 1:
                view = new org.telegram.ui.Cells.n(context, new y0(this), true, 9);
                break;
            case 2:
                int i18 = g6.a7;
                c6Var = ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider;
                view = new w6(context, g6.v0(i18, c6Var), 0);
                break;
            case 3:
                View j4Var = new j4(context);
                j4Var.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
                view = j4Var;
                break;
            case 4:
                c6Var2 = ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider;
                View d4Var = new d4(1, 0, context, c6Var2, false, false);
                i11 = ((org.telegram.ui.ActionBar.e3) i1Var).backgroundPaddingLeft;
                i12 = ((org.telegram.ui.ActionBar.e3) i1Var).backgroundPaddingLeft;
                d4Var.setPadding(i11, 0, i12, 0);
                view = d4Var;
                break;
            case 5:
                h00 h00Var = new h00(context, null);
                h00Var.setViewType(i1Var.d0 == 2 ? 22 : 21);
                h00Var.setIsSingleCell(true);
                h00Var.setIgnoreHeightCheck(true);
                h00Var.setItemsCount(10);
                view = h00Var;
                break;
            case 6:
                view = new zm(i1Var.getContext(), 1);
                break;
            case 7:
                FrameLayout frameLayout = new FrameLayout(i1Var.getContext());
                i13 = ((org.telegram.ui.ActionBar.e3) i1Var).backgroundPaddingLeft;
                int dp = AndroidUtilities.dp(6.0f) + i13;
                i14 = ((org.telegram.ui.ActionBar.e3) i1Var).backgroundPaddingLeft;
                frameLayout.setPadding(dp, 0, AndroidUtilities.dp(6.0f) + i14, 0);
                TextView textView = new TextView(context);
                if (i1Var.M0 == null && ChatObject.hasAdminRights(i1Var.s1())) {
                    i1Var.M0 = new af.e(this, 1);
                }
                textView.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(i1Var.M0 == null ? 18.0f : 50.0f), AndroidUtilities.dp(13.0f));
                textView.setTextSize(1, 16.0f);
                textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                textView.setSingleLine(true);
                frameLayout.addView(textView, z5.d(-1, -2.0f, 0, 11.0f, 0.0f, 11.0f, 0.0f));
                int dp2 = AndroidUtilities.dp(8.0f);
                int i19 = g6.e7;
                c6Var3 = ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider;
                int v02 = g6.v0(i19, c6Var3);
                int i20 = g6.i6;
                c6Var4 = ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider;
                int k10 = i0.b.k(g6.v0(i20, c6Var4), 76);
                textView.setBackground(g6.i0(dp2, dp2, dp2, dp2, v02, k10, k10));
                int i21 = g6.G6;
                c6Var5 = ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider;
                textView.setTextColor(g6.v0(i21, c6Var5));
                final int i22 = 2;
                textView.setOnClickListener(new View.OnClickListener(this) { // from class: ag.v0
                    public final /* synthetic */ z0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        c6 c6Var13;
                        switch (i22) {
                            case 0:
                                i1 i1Var2 = this.b.c;
                                org.telegram.ui.ActionBar.n2 n2Var = i1Var2.n;
                                long j10 = i1Var2.W;
                                c6Var13 = ((org.telegram.ui.ActionBar.e3) i1Var2).resourcesProvider;
                                cg.x.m(n2Var, c6Var13, j10, null);
                                break;
                            case 1:
                                i1 i1Var3 = this.b.c;
                                AndroidUtilities.addToClipboard(i1Var3.p1());
                                i1Var3.dismiss();
                                break;
                            case 2:
                                AndroidUtilities.addToClipboard(this.b.c.p1());
                                break;
                            default:
                                i1 i1Var4 = this.b.c;
                                i1Var4.M0.run();
                                i1Var4.dismiss();
                                break;
                        }
                    }
                });
                if (i1Var.M0 != null) {
                    ImageView imageView = new ImageView(i1Var.getContext());
                    imageView.setImageResource(R.drawable.msg_stats);
                    int i23 = g6.j5;
                    c6Var6 = ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider;
                    imageView.setColorFilter(g6.v0(i23, c6Var6));
                    imageView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                    int dp3 = AndroidUtilities.dp(20.0f);
                    c6Var7 = ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider;
                    int k11 = i0.b.k(g6.v0(i20, c6Var7), 76);
                    imageView.setBackground(g6.i0(dp3, dp3, dp3, dp3, 0, k11, k11));
                    frameLayout.addView(imageView, z5.d(40, 40.0f, 21, 15.0f, 0.0f, 15.0f, 0.0f));
                    final int i24 = 3;
                    imageView.setOnClickListener(new View.OnClickListener(this) { // from class: ag.v0
                        public final /* synthetic */ z0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            c6 c6Var13;
                            switch (i24) {
                                case 0:
                                    i1 i1Var2 = this.b.c;
                                    org.telegram.ui.ActionBar.n2 n2Var = i1Var2.n;
                                    long j10 = i1Var2.W;
                                    c6Var13 = ((org.telegram.ui.ActionBar.e3) i1Var2).resourcesProvider;
                                    cg.x.m(n2Var, c6Var13, j10, null);
                                    break;
                                case 1:
                                    i1 i1Var3 = this.b.c;
                                    AndroidUtilities.addToClipboard(i1Var3.p1());
                                    i1Var3.dismiss();
                                    break;
                                case 2:
                                    AndroidUtilities.addToClipboard(this.b.c.p1());
                                    break;
                                default:
                                    i1 i1Var4 = this.b.c;
                                    i1Var4.M0.run();
                                    i1Var4.dismiss();
                                    break;
                            }
                        }
                    });
                }
                textView.setText(i1Var.p1());
                textView.setGravity(17);
                view = frameLayout;
                break;
            case 8:
                LinearLayout linearLayout = new LinearLayout(context);
                i15 = ((org.telegram.ui.ActionBar.e3) i1Var).backgroundPaddingLeft;
                int dp4 = AndroidUtilities.dp(6.0f) + i15;
                i16 = ((org.telegram.ui.ActionBar.e3) i1Var).backgroundPaddingLeft;
                linearLayout.setPadding(dp4, 0, AndroidUtilities.dp(6.0f) + i16, 0);
                linearLayout.setOrientation(1);
                w80 w80Var = new w80(context);
                p80 p80Var = new p80(context, null);
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(i1Var.x1() ? R.string.BoostingStoriesByGiftingGroup2 : R.string.BoostingStoriesByGiftingChannel2));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.BoostingStoriesByGiftingLink));
                spannableStringBuilder.setSpan(new x0(this, i17), 0, spannableStringBuilder.length(), 33);
                SpannableString spannableString = new SpannableString(">");
                Drawable mutate = i1Var.getContext().getResources().getDrawable(R.drawable.msg_arrowright).mutate();
                int i25 = g6.gc;
                mutate.setColorFilter(new PorterDuffColorFilter(i25, PorterDuff.Mode.SRC_IN));
                cq cqVar = new cq(0, mutate);
                cqVar.setColorKey(i25);
                cqVar.setSize(AndroidUtilities.dp(18.0f));
                cqVar.setWidth(AndroidUtilities.dp(11.0f));
                cqVar.setTranslateX(-AndroidUtilities.dp(5.0f));
                spannableString.setSpan(cqVar, 0, spannableString.length(), 33);
                p80Var.setText(TextUtils.concat(replaceTags, " ", AndroidUtilities.replaceCharSequence(">", spannableStringBuilder, spannableString)));
                p80Var.setTextSize(1, 14.0f);
                p80Var.setLineSpacing(AndroidUtilities.dp(3.0f), 1.0f);
                c6Var8 = ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider;
                if (c6Var8 instanceof jh.b) {
                    int i26 = g6.y6;
                    c6Var11 = ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider;
                    p80Var.setTextColor(g6.v0(i26, c6Var11));
                } else {
                    int i27 = g6.G6;
                    c6Var9 = ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider;
                    p80Var.setTextColor(g6.v0(i27, c6Var9));
                }
                final int i28 = 1;
                p80Var.setGravity(1);
                p80Var.setOnClickListener(new View.OnClickListener(this) { // from class: ag.v0
                    public final /* synthetic */ z0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        c6 c6Var13;
                        switch (i17) {
                            case 0:
                                i1 i1Var2 = this.b.c;
                                org.telegram.ui.ActionBar.n2 n2Var = i1Var2.n;
                                long j10 = i1Var2.W;
                                c6Var13 = ((org.telegram.ui.ActionBar.e3) i1Var2).resourcesProvider;
                                cg.x.m(n2Var, c6Var13, j10, null);
                                break;
                            case 1:
                                i1 i1Var3 = this.b.c;
                                AndroidUtilities.addToClipboard(i1Var3.p1());
                                i1Var3.dismiss();
                                break;
                            case 2:
                                AndroidUtilities.addToClipboard(this.b.c.p1());
                                break;
                            default:
                                i1 i1Var4 = this.b.c;
                                i1Var4.M0.run();
                                i1Var4.dismiss();
                                break;
                        }
                    }
                });
                w80Var.setOnClickListener(new w0(p80Var, i17));
                if (i1Var.y1()) {
                    c6Var10 = ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider;
                    lh.d dVar = new lh.d(context, c6Var10, true);
                    dVar.g(LocaleController.getString(R.string.Copy), false, true);
                    dVar.setOnClickListener(new View.OnClickListener(this) { // from class: ag.v0
                        public final /* synthetic */ z0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            c6 c6Var13;
                            switch (i28) {
                                case 0:
                                    i1 i1Var2 = this.b.c;
                                    org.telegram.ui.ActionBar.n2 n2Var = i1Var2.n;
                                    long j10 = i1Var2.W;
                                    c6Var13 = ((org.telegram.ui.ActionBar.e3) i1Var2).resourcesProvider;
                                    cg.x.m(n2Var, c6Var13, j10, null);
                                    break;
                                case 1:
                                    i1 i1Var3 = this.b.c;
                                    AndroidUtilities.addToClipboard(i1Var3.p1());
                                    i1Var3.dismiss();
                                    break;
                                case 2:
                                    AndroidUtilities.addToClipboard(this.b.c.p1());
                                    break;
                                default:
                                    i1 i1Var4 = this.b.c;
                                    i1Var4.M0.run();
                                    i1Var4.dismiss();
                                    break;
                            }
                        }
                    });
                    LinearLayout linearLayout2 = new LinearLayout(context);
                    linearLayout2.addView(i1Var.C0, z5.p(-1, 44, 1.0f, 0, 0, 0, 4, 0));
                    linearLayout2.addView(dVar, z5.p(-1, 44, 1.0f, 0, 4, 0, 0, 0));
                    linearLayout.addView(linearLayout2, z5.k(12.0f, 12.0f, 12.0f, 8.0f, -1, 44));
                } else {
                    linearLayout.addView(i1Var.B0, z5.k(12.0f, 12.0f, 12.0f, 8.0f, -1, 48));
                }
                linearLayout.addView(w80Var, z5.k(0.0f, -5.0f, 0.0f, 0.0f, -1, 48));
                linearLayout.addView(p80Var, z5.k(12.0f, -6.0f, 12.0f, 17.0f, -1, -2));
                view = linearLayout;
                break;
            case 9:
                c6Var12 = ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider;
                view = new c1(i1Var, context, c6Var12);
                break;
            default:
                g1 g1Var = new g1(i1Var, context);
                i1Var.Z = g1Var;
                view = g1Var;
                break;
        }
        return pa.l(view, view, -1, -2);
    }
}
