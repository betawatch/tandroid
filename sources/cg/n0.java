package cg;

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
import i7.f6;
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
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.Cells.e4;
import org.telegram.ui.Cells.k4;
import org.telegram.ui.Cells.x6;
import org.telegram.ui.Components.f90;
import org.telegram.ui.Components.fn;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.iq;
import org.telegram.ui.Components.p00;
import org.telegram.ui.Components.t41;
import org.telegram.ui.Components.y80;
import org.telegram.ui.th;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class n0 extends il0 {
    public final /* synthetic */ v0 c;

    public n0(v0 v0Var) {
        this.c = v0Var;
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        v0 v0Var = this.c;
        int i10 = v0Var.d0;
        if ((i10 == 11 || i10 == 34) && !v0Var.U) {
            return false;
        }
        int i11 = n1Var.f;
        return i11 == 1 || i11 == 4;
    }

    @Override // f2.p0
    public final int h() {
        return this.c.g0;
    }

    @Override // f2.p0
    public final int j(int i10) {
        int i11;
        v0 v0Var = this.c;
        if (v0Var.h0 == i10) {
            return 0;
        }
        if (v0Var.i0 == i10) {
            return 2;
        }
        if (v0Var.j0 == i10) {
            return 3;
        }
        if (v0Var.m0 == i10) {
            return 5;
        }
        if (v0Var.n0 == i10) {
            return 6;
        }
        if (v0Var.V == i10) {
            return 7;
        }
        if (v0Var.o0 == i10) {
            return 8;
        }
        ArrayList arrayList = v0Var.q0;
        if (arrayList != null && i10 >= (i11 = v0Var.p0) && i10 <= arrayList.size() + i11) {
            return 9;
        }
        int i12 = v0Var.d0;
        return (i12 == 5 || i12 == 11 || i12 == 34) ? 4 : 1;
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        int i11;
        String formatUserStatus;
        v0 v0Var = this.c;
        int i12 = v0Var.d0;
        HashSet hashSet = v0Var.u0;
        int i13 = n1Var.f;
        View view = n1Var.a;
        if (i13 == 1) {
            TLRPC.Chat chat = (TLRPC.Chat) v0Var.e0.get(i10 - v0Var.k0);
            org.telegram.ui.Cells.n nVar = (org.telegram.ui.Cells.n) view;
            TLRPC.Chat currentChannel = nVar.getCurrentChannel();
            nVar.a(chat, false);
            nVar.r.a(hashSet.contains(chat), currentChannel == chat);
            return;
        }
        if (i13 != 9) {
            if (i13 == 3) {
                k4 k4Var = (k4) view;
                if (i12 != 11 && i12 != 34) {
                    if (i12 == 2) {
                        k4Var.setText(LocaleController.getString(R.string.YourPublicCommunities));
                        return;
                    } else {
                        k4Var.setText(LocaleController.getString(R.string.LastActiveCommunities));
                        return;
                    }
                }
                if (v0Var.U) {
                    k4Var.setText(LocaleController.getString(R.string.ChannelInviteViaLink));
                    return;
                } else if (v0Var.x0.size() == 1) {
                    k4Var.setText(LocaleController.getString(R.string.ChannelInviteViaLinkRestricted2));
                    return;
                } else {
                    k4Var.setText(LocaleController.getString(R.string.ChannelInviteViaLinkRestricted3));
                    return;
                }
            }
            if (i13 != 4) {
                return;
            }
            e4 e4Var = (e4) view;
            if (i12 == 5) {
                TLRPC.Chat chat2 = (TLRPC.Chat) v0Var.v0.get(i10 - v0Var.k0);
                e4Var.e(chat2, chat2.title, (String) v0Var.w0.get(i10 - v0Var.k0), ((float) i10) != ((float) v0Var.l0) - 1.0f);
                e4Var.c(hashSet.contains(chat2), false);
                return;
            }
            if (i12 == 11 || i12 == 34) {
                TLRPC.User user = (TLRPC.User) v0Var.x0.get(i10 - v0Var.k0);
                ArrayList arrayList = v0Var.y0;
                boolean z10 = arrayList != null && arrayList.contains(Long.valueOf(user.id));
                TL_account.requirementToContactPremium requirementtocontactpremium = z10 ? new TL_account.requirementToContactPremium() : null;
                e4Var.N = true;
                e4Var.M = requirementtocontactpremium;
                e4Var.g();
                if (z10) {
                    formatUserStatus = LocaleController.getString(R.string.InvitePremiumBlockedUser);
                } else {
                    i11 = ((f3) v0Var).currentAccount;
                    formatUserStatus = LocaleController.formatUserStatus(i11, user, null, null);
                }
                e4Var.e(user, ContactsController.formatName(user.first_name, user.last_name), formatUserStatus, ((float) i10) != ((float) v0Var.l0) - 1.0f);
                e4Var.c(hashSet.contains(user), false);
                return;
            }
            return;
        }
        int i14 = i10 - v0Var.p0;
        ArrayList arrayList2 = v0Var.q0;
        if (arrayList2 == null || i14 < 0 || i14 >= arrayList2.size()) {
            return;
        }
        q0 q0Var = (q0) view;
        p0 p0Var = (p0) v0Var.q0.get(i14);
        bg.u1 u1Var = q0Var.c;
        ImageView imageView = q0Var.a;
        h5 h5Var = q0Var.b;
        if (p0Var instanceof o0) {
            q0Var.f = (o0) p0Var;
            q0Var.e = null;
            imageView.setVisibility(8);
            h5Var.setVisibility(8);
            u1Var.setVisibility(0);
            h5 h5Var2 = q0Var.d;
            o0 o0Var = q0Var.f;
            h5Var2.l(LocaleController.formatPluralString(o0Var.h ? "BoostLevelUnlocks" : "BoostLevel", o0Var.g, new Object[0]), false);
            return;
        }
        if (p0Var != null) {
            q0Var.f = null;
            q0Var.e = p0Var;
            imageView.setVisibility(0);
            imageView.setImageResource(q0Var.e.a);
            h5Var.setVisibility(0);
            p0 p0Var2 = q0Var.e;
            if (p0Var2.d != null) {
                String string = LocaleController.getString(q0Var.e.d + "_" + LocaleController.getStringParamForNumber(q0Var.e.e));
                if (string == null || string.startsWith("LOC_ERR")) {
                    string = LocaleController.getString(q0Var.e.d + "_other");
                }
                if (string == null) {
                    string = "";
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                int indexOf = string.indexOf("%d");
                if (indexOf >= 0) {
                    spannableStringBuilder = new SpannableStringBuilder(string);
                    SpannableString spannableString = new SpannableString(a4.w.l(q0Var.e.e, "", new StringBuilder()));
                    spannableString.setSpan(new t41(AndroidUtilities.bold()), 0, spannableString.length(), 33);
                    spannableStringBuilder.replace(indexOf, indexOf + 2, (CharSequence) spannableString);
                }
                h5Var.l(spannableStringBuilder, false);
            } else {
                String string2 = LocaleController.getString(p0Var2.b);
                String str = string2 != null ? string2 : "";
                if (q0Var.e.c != null) {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str);
                    int indexOf2 = str.indexOf("%s");
                    if (indexOf2 >= 0) {
                        spannableStringBuilder2 = new SpannableStringBuilder(str);
                        SpannableString spannableString2 = new SpannableString(q0Var.e.c);
                        spannableString2.setSpan(new t41(AndroidUtilities.bold()), 0, spannableString2.length(), 33);
                        spannableStringBuilder2.replace(indexOf2, indexOf2 + 2, (CharSequence) spannableString2);
                    }
                    h5Var.l(spannableStringBuilder2, false);
                } else {
                    h5Var.l(str, false);
                }
            }
            u1Var.setVisibility(8);
        }
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
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
        v0 v0Var = this.c;
        switch (i10) {
            case 1:
                view = new org.telegram.ui.Cells.n(context, new m0(this), true, 9);
                break;
            case 2:
                int i18 = g6.a7;
                c6Var = ((f3) v0Var).resourcesProvider;
                view = new x6(context, g6.v0(i18, c6Var), 0);
                break;
            case 3:
                View k4Var = new k4(context);
                k4Var.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
                view = k4Var;
                break;
            case 4:
                c6Var2 = ((f3) v0Var).resourcesProvider;
                View e4Var = new e4(1, 0, context, c6Var2, false, false);
                i11 = ((f3) v0Var).backgroundPaddingLeft;
                i12 = ((f3) v0Var).backgroundPaddingLeft;
                e4Var.setPadding(i11, 0, i12, 0);
                view = e4Var;
                break;
            case 5:
                p00 p00Var = new p00(context, null);
                p00Var.setViewType(v0Var.d0 == 2 ? 22 : 21);
                p00Var.setIsSingleCell(true);
                p00Var.setIgnoreHeightCheck(true);
                p00Var.setItemsCount(10);
                view = p00Var;
                break;
            case 6:
                view = new fn(v0Var.getContext(), 1);
                break;
            case 7:
                FrameLayout frameLayout = new FrameLayout(v0Var.getContext());
                i13 = ((f3) v0Var).backgroundPaddingLeft;
                int dp = AndroidUtilities.dp(6.0f) + i13;
                i14 = ((f3) v0Var).backgroundPaddingLeft;
                frameLayout.setPadding(dp, 0, AndroidUtilities.dp(6.0f) + i14, 0);
                TextView textView = new TextView(context);
                if (v0Var.M0 == null && ChatObject.hasAdminRights(v0Var.s1())) {
                    v0Var.M0 = new a4.g(this, 26);
                }
                textView.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(v0Var.M0 == null ? 18.0f : 50.0f), AndroidUtilities.dp(13.0f));
                textView.setTextSize(1, 16.0f);
                textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                textView.setSingleLine(true);
                frameLayout.addView(textView, f6.d(-1, -2.0f, 0, 11.0f, 0.0f, 11.0f, 0.0f));
                int dp2 = AndroidUtilities.dp(8.0f);
                int i19 = g6.e7;
                c6Var3 = ((f3) v0Var).resourcesProvider;
                int v02 = g6.v0(i19, c6Var3);
                int i20 = g6.i6;
                c6Var4 = ((f3) v0Var).resourcesProvider;
                int k9 = i0.a.k(g6.v0(i20, c6Var4), 76);
                textView.setBackground(g6.i0(dp2, dp2, dp2, dp2, v02, k9, k9));
                int i21 = g6.G6;
                c6Var5 = ((f3) v0Var).resourcesProvider;
                textView.setTextColor(g6.v0(i21, c6Var5));
                final int i22 = 2;
                textView.setOnClickListener(new View.OnClickListener(this) { // from class: cg.k0
                    public final /* synthetic */ n0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        c6 c6Var13;
                        switch (i22) {
                            case 0:
                                v0 v0Var2 = this.b.c;
                                org.telegram.ui.ActionBar.o2 o2Var = v0Var2.n;
                                long j10 = v0Var2.W;
                                c6Var13 = ((f3) v0Var2).resourcesProvider;
                                eg.y.m(o2Var, c6Var13, j10, null);
                                break;
                            case 1:
                                v0 v0Var3 = this.b.c;
                                AndroidUtilities.addToClipboard(v0Var3.p1());
                                v0Var3.dismiss();
                                break;
                            case 2:
                                AndroidUtilities.addToClipboard(this.b.c.p1());
                                break;
                            default:
                                v0 v0Var4 = this.b.c;
                                v0Var4.M0.run();
                                v0Var4.dismiss();
                                break;
                        }
                    }
                });
                if (v0Var.M0 != null) {
                    ImageView imageView = new ImageView(v0Var.getContext());
                    imageView.setImageResource(R.drawable.msg_stats);
                    int i23 = g6.j5;
                    c6Var6 = ((f3) v0Var).resourcesProvider;
                    imageView.setColorFilter(g6.v0(i23, c6Var6));
                    imageView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                    int dp3 = AndroidUtilities.dp(20.0f);
                    c6Var7 = ((f3) v0Var).resourcesProvider;
                    int k10 = i0.a.k(g6.v0(i20, c6Var7), 76);
                    imageView.setBackground(g6.i0(dp3, dp3, dp3, dp3, 0, k10, k10));
                    frameLayout.addView(imageView, f6.d(40, 40.0f, 21, 15.0f, 0.0f, 15.0f, 0.0f));
                    final int i24 = 3;
                    imageView.setOnClickListener(new View.OnClickListener(this) { // from class: cg.k0
                        public final /* synthetic */ n0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            c6 c6Var13;
                            switch (i24) {
                                case 0:
                                    v0 v0Var2 = this.b.c;
                                    org.telegram.ui.ActionBar.o2 o2Var = v0Var2.n;
                                    long j10 = v0Var2.W;
                                    c6Var13 = ((f3) v0Var2).resourcesProvider;
                                    eg.y.m(o2Var, c6Var13, j10, null);
                                    break;
                                case 1:
                                    v0 v0Var3 = this.b.c;
                                    AndroidUtilities.addToClipboard(v0Var3.p1());
                                    v0Var3.dismiss();
                                    break;
                                case 2:
                                    AndroidUtilities.addToClipboard(this.b.c.p1());
                                    break;
                                default:
                                    v0 v0Var4 = this.b.c;
                                    v0Var4.M0.run();
                                    v0Var4.dismiss();
                                    break;
                            }
                        }
                    });
                }
                textView.setText(v0Var.p1());
                textView.setGravity(17);
                view = frameLayout;
                break;
            case 8:
                LinearLayout linearLayout = new LinearLayout(context);
                i15 = ((f3) v0Var).backgroundPaddingLeft;
                int dp4 = AndroidUtilities.dp(6.0f) + i15;
                i16 = ((f3) v0Var).backgroundPaddingLeft;
                linearLayout.setPadding(dp4, 0, AndroidUtilities.dp(6.0f) + i16, 0);
                linearLayout.setOrientation(1);
                f90 f90Var = new f90(context);
                y80 y80Var = new y80(context, null);
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(v0Var.x1() ? R.string.BoostingStoriesByGiftingGroup2 : R.string.BoostingStoriesByGiftingChannel2));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.BoostingStoriesByGiftingLink));
                spannableStringBuilder.setSpan(new l0(this, i17), 0, spannableStringBuilder.length(), 33);
                SpannableString spannableString = new SpannableString(">");
                Drawable mutate = v0Var.getContext().getResources().getDrawable(R.drawable.msg_arrowright).mutate();
                int i25 = g6.gc;
                mutate.setColorFilter(new PorterDuffColorFilter(i25, PorterDuff.Mode.SRC_IN));
                iq iqVar = new iq(0, mutate);
                iqVar.setColorKey(i25);
                iqVar.setSize(AndroidUtilities.dp(18.0f));
                iqVar.setWidth(AndroidUtilities.dp(11.0f));
                iqVar.setTranslateX(-AndroidUtilities.dp(5.0f));
                spannableString.setSpan(iqVar, 0, spannableString.length(), 33);
                y80Var.setText(TextUtils.concat(replaceTags, " ", AndroidUtilities.replaceCharSequence(">", spannableStringBuilder, spannableString)));
                y80Var.setTextSize(1, 14.0f);
                y80Var.setLineSpacing(AndroidUtilities.dp(3.0f), 1.0f);
                c6Var8 = ((f3) v0Var).resourcesProvider;
                if (c6Var8 instanceof lh.b) {
                    int i26 = g6.y6;
                    c6Var11 = ((f3) v0Var).resourcesProvider;
                    y80Var.setTextColor(g6.v0(i26, c6Var11));
                } else {
                    int i27 = g6.G6;
                    c6Var9 = ((f3) v0Var).resourcesProvider;
                    y80Var.setTextColor(g6.v0(i27, c6Var9));
                }
                y80Var.setGravity(1);
                y80Var.setOnClickListener(new View.OnClickListener(this) { // from class: cg.k0
                    public final /* synthetic */ n0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        c6 c6Var13;
                        switch (i17) {
                            case 0:
                                v0 v0Var2 = this.b.c;
                                org.telegram.ui.ActionBar.o2 o2Var = v0Var2.n;
                                long j10 = v0Var2.W;
                                c6Var13 = ((f3) v0Var2).resourcesProvider;
                                eg.y.m(o2Var, c6Var13, j10, null);
                                break;
                            case 1:
                                v0 v0Var3 = this.b.c;
                                AndroidUtilities.addToClipboard(v0Var3.p1());
                                v0Var3.dismiss();
                                break;
                            case 2:
                                AndroidUtilities.addToClipboard(this.b.c.p1());
                                break;
                            default:
                                v0 v0Var4 = this.b.c;
                                v0Var4.M0.run();
                                v0Var4.dismiss();
                                break;
                        }
                    }
                });
                f90Var.setOnClickListener(new ag.o(y80Var, 5));
                if (v0Var.y1()) {
                    c6Var10 = ((f3) v0Var).resourcesProvider;
                    final int i28 = 1;
                    nh.d dVar = new nh.d(context, c6Var10, true);
                    dVar.g(LocaleController.getString(R.string.Copy), false, true);
                    dVar.setOnClickListener(new View.OnClickListener(this) { // from class: cg.k0
                        public final /* synthetic */ n0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            c6 c6Var13;
                            switch (i28) {
                                case 0:
                                    v0 v0Var2 = this.b.c;
                                    org.telegram.ui.ActionBar.o2 o2Var = v0Var2.n;
                                    long j10 = v0Var2.W;
                                    c6Var13 = ((f3) v0Var2).resourcesProvider;
                                    eg.y.m(o2Var, c6Var13, j10, null);
                                    break;
                                case 1:
                                    v0 v0Var3 = this.b.c;
                                    AndroidUtilities.addToClipboard(v0Var3.p1());
                                    v0Var3.dismiss();
                                    break;
                                case 2:
                                    AndroidUtilities.addToClipboard(this.b.c.p1());
                                    break;
                                default:
                                    v0 v0Var4 = this.b.c;
                                    v0Var4.M0.run();
                                    v0Var4.dismiss();
                                    break;
                            }
                        }
                    });
                    LinearLayout linearLayout2 = new LinearLayout(context);
                    linearLayout2.addView(v0Var.C0, f6.p(-1, 44, 1.0f, 0, 0, 0, 4, 0));
                    linearLayout2.addView(dVar, f6.p(-1, 44, 1.0f, 0, 4, 0, 0, 0));
                    linearLayout.addView(linearLayout2, f6.k(12.0f, 12.0f, 12.0f, 8.0f, -1, 44));
                } else {
                    linearLayout.addView(v0Var.B0, f6.k(12.0f, 12.0f, 12.0f, 8.0f, -1, 48));
                }
                linearLayout.addView(f90Var, f6.k(0.0f, -5.0f, 0.0f, 0.0f, -1, 48));
                linearLayout.addView(y80Var, f6.k(12.0f, -6.0f, 12.0f, 17.0f, -1, -2));
                view = linearLayout;
                break;
            case 9:
                c6Var12 = ((f3) v0Var).resourcesProvider;
                view = new q0(v0Var, context, c6Var12);
                break;
            default:
                u0 u0Var = new u0(v0Var, context);
                v0Var.Z = u0Var;
                view = u0Var;
                break;
        }
        return th.m(view, view, -1, -2);
    }
}
