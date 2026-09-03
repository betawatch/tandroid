package eg;

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
import java.util.ArrayList;
import java.util.HashSet;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.Cells.f4;
import org.telegram.ui.Cells.l4;
import org.telegram.ui.Cells.y6;
import org.telegram.ui.Components.f51;
import org.telegram.ui.Components.f90;
import org.telegram.ui.Components.gn;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.m90;
import org.telegram.ui.Components.ql0;
import org.telegram.ui.Components.u00;
import org.telegram.ui.ai;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class n0 extends ql0 {
    public final /* synthetic */ v0 c;

    public n0(v0 v0Var) {
        this.c = v0Var;
    }

    @Override // org.telegram.ui.Components.ql0
    public final boolean D(f2.l1 l1Var) {
        v0 v0Var = this.c;
        int i10 = v0Var.e0;
        if ((i10 == 11 || i10 == 34) && !v0Var.V) {
            return false;
        }
        int i11 = l1Var.f;
        return i11 == 1 || i11 == 4;
    }

    @Override // f2.o0
    public final int h() {
        return this.c.h0;
    }

    @Override // f2.o0
    public final int j(int i10) {
        int i11;
        v0 v0Var = this.c;
        if (v0Var.i0 == i10) {
            return 0;
        }
        if (v0Var.j0 == i10) {
            return 2;
        }
        if (v0Var.k0 == i10) {
            return 3;
        }
        if (v0Var.n0 == i10) {
            return 5;
        }
        if (v0Var.o0 == i10) {
            return 6;
        }
        if (v0Var.W == i10) {
            return 7;
        }
        if (v0Var.p0 == i10) {
            return 8;
        }
        ArrayList arrayList = v0Var.r0;
        if (arrayList != null && i10 >= (i11 = v0Var.q0) && i10 <= arrayList.size() + i11) {
            return 9;
        }
        int i12 = v0Var.e0;
        return (i12 == 5 || i12 == 11 || i12 == 34) ? 4 : 1;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        int i11;
        String formatUserStatus;
        v0 v0Var = this.c;
        int i12 = v0Var.e0;
        HashSet hashSet = v0Var.v0;
        int i13 = l1Var.f;
        View view = l1Var.a;
        if (i13 == 1) {
            TLRPC.Chat chat = (TLRPC.Chat) v0Var.f0.get(i10 - v0Var.l0);
            org.telegram.ui.Cells.n nVar = (org.telegram.ui.Cells.n) view;
            TLRPC.Chat currentChannel = nVar.getCurrentChannel();
            nVar.a(chat, false);
            nVar.r.a(hashSet.contains(chat), currentChannel == chat);
            return;
        }
        if (i13 != 9) {
            if (i13 == 3) {
                l4 l4Var = (l4) view;
                if (i12 != 11 && i12 != 34) {
                    if (i12 == 2) {
                        l4Var.setText(LocaleController.getString(R.string.YourPublicCommunities));
                        return;
                    } else {
                        l4Var.setText(LocaleController.getString(R.string.LastActiveCommunities));
                        return;
                    }
                }
                if (v0Var.V) {
                    l4Var.setText(LocaleController.getString(R.string.ChannelInviteViaLink));
                    return;
                } else if (v0Var.y0.size() == 1) {
                    l4Var.setText(LocaleController.getString(R.string.ChannelInviteViaLinkRestricted2));
                    return;
                } else {
                    l4Var.setText(LocaleController.getString(R.string.ChannelInviteViaLinkRestricted3));
                    return;
                }
            }
            if (i13 != 4) {
                return;
            }
            f4 f4Var = (f4) view;
            if (i12 == 5) {
                TLRPC.Chat chat2 = (TLRPC.Chat) v0Var.w0.get(i10 - v0Var.l0);
                f4Var.e(chat2, chat2.title, (String) v0Var.x0.get(i10 - v0Var.l0), ((float) i10) != ((float) v0Var.m0) - 1.0f);
                f4Var.c(hashSet.contains(chat2), false);
                return;
            }
            if (i12 == 11 || i12 == 34) {
                TLRPC.User user = (TLRPC.User) v0Var.y0.get(i10 - v0Var.l0);
                ArrayList arrayList = v0Var.z0;
                boolean z4 = arrayList != null && arrayList.contains(Long.valueOf(user.id));
                TL_account.requirementToContactPremium requirementtocontactpremium = z4 ? new TL_account.requirementToContactPremium() : null;
                f4Var.O = true;
                f4Var.N = requirementtocontactpremium;
                f4Var.g();
                if (z4) {
                    formatUserStatus = LocaleController.getString(R.string.InvitePremiumBlockedUser);
                } else {
                    i11 = ((g3) v0Var).currentAccount;
                    formatUserStatus = LocaleController.formatUserStatus(i11, user, null, null);
                }
                f4Var.e(user, ContactsController.formatName(user.first_name, user.last_name), formatUserStatus, ((float) i10) != ((float) v0Var.m0) - 1.0f);
                f4Var.c(hashSet.contains(user), false);
                return;
            }
            return;
        }
        int i14 = i10 - v0Var.q0;
        ArrayList arrayList2 = v0Var.r0;
        if (arrayList2 == null || i14 < 0 || i14 >= arrayList2.size()) {
            return;
        }
        q0 q0Var = (q0) view;
        p0 p0Var = (p0) v0Var.r0.get(i14);
        dg.s1 s1Var = q0Var.c;
        ImageView imageView = q0Var.a;
        k5 k5Var = q0Var.b;
        if (p0Var instanceof o0) {
            q0Var.f = (o0) p0Var;
            q0Var.e = null;
            imageView.setVisibility(8);
            k5Var.setVisibility(8);
            s1Var.setVisibility(0);
            k5 k5Var2 = q0Var.d;
            o0 o0Var = q0Var.f;
            k5Var2.l(LocaleController.formatPluralString(o0Var.h ? "BoostLevelUnlocks" : "BoostLevel", o0Var.g, new Object[0]), false);
            return;
        }
        if (p0Var != null) {
            q0Var.f = null;
            q0Var.e = p0Var;
            imageView.setVisibility(0);
            imageView.setImageResource(q0Var.e.a);
            k5Var.setVisibility(0);
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
                    SpannableString spannableString = new SpannableString(android.support.v4.media.a.m(q0Var.e.e, "", new StringBuilder()));
                    spannableString.setSpan(new f51(AndroidUtilities.bold()), 0, spannableString.length(), 33);
                    spannableStringBuilder.replace(indexOf, indexOf + 2, (CharSequence) spannableString);
                }
                k5Var.l(spannableStringBuilder, false);
            } else {
                String string2 = LocaleController.getString(p0Var2.b);
                String str = string2 != null ? string2 : "";
                if (q0Var.e.c != null) {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str);
                    int indexOf2 = str.indexOf("%s");
                    if (indexOf2 >= 0) {
                        spannableStringBuilder2 = new SpannableStringBuilder(str);
                        SpannableString spannableString2 = new SpannableString(q0Var.e.c);
                        spannableString2.setSpan(new f51(AndroidUtilities.bold()), 0, spannableString2.length(), 33);
                        spannableStringBuilder2.replace(indexOf2, indexOf2 + 2, (CharSequence) spannableString2);
                    }
                    k5Var.l(spannableStringBuilder2, false);
                } else {
                    k5Var.l(str, false);
                }
            }
            s1Var.setVisibility(8);
        }
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        f6 f6Var;
        f6 f6Var2;
        int i11;
        int i12;
        int i13;
        int i14;
        f6 f6Var3;
        f6 f6Var4;
        f6 f6Var5;
        f6 f6Var6;
        f6 f6Var7;
        int i15;
        int i16;
        f6 f6Var8;
        f6 f6Var9;
        View view;
        f6 f6Var10;
        f6 f6Var11;
        f6 f6Var12;
        Context context = viewGroup.getContext();
        final int i17 = 0;
        v0 v0Var = this.c;
        switch (i10) {
            case 1:
                view = new org.telegram.ui.Cells.n(context, new m0(this), true, 9);
                break;
            case 2:
                int i18 = j6.a7;
                f6Var = ((g3) v0Var).resourcesProvider;
                view = new y6(context, j6.v0(i18, f6Var), 0);
                break;
            case 3:
                View l4Var = new l4(context);
                l4Var.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
                view = l4Var;
                break;
            case 4:
                f6Var2 = ((g3) v0Var).resourcesProvider;
                View f4Var = new f4(1, 0, context, f6Var2, false, false);
                i11 = ((g3) v0Var).backgroundPaddingLeft;
                i12 = ((g3) v0Var).backgroundPaddingLeft;
                f4Var.setPadding(i11, 0, i12, 0);
                view = f4Var;
                break;
            case 5:
                u00 u00Var = new u00(context, null);
                u00Var.setViewType(v0Var.e0 == 2 ? 22 : 21);
                u00Var.setIsSingleCell(true);
                u00Var.setIgnoreHeightCheck(true);
                u00Var.setItemsCount(10);
                view = u00Var;
                break;
            case 6:
                view = new gn(v0Var.getContext(), 1);
                break;
            case 7:
                FrameLayout frameLayout = new FrameLayout(v0Var.getContext());
                i13 = ((g3) v0Var).backgroundPaddingLeft;
                int dp = AndroidUtilities.dp(6.0f) + i13;
                i14 = ((g3) v0Var).backgroundPaddingLeft;
                frameLayout.setPadding(dp, 0, AndroidUtilities.dp(6.0f) + i14, 0);
                TextView textView = new TextView(context);
                if (v0Var.N0 == null && ChatObject.hasAdminRights(v0Var.s1())) {
                    v0Var.N0 = new e3.h(this, 2);
                }
                textView.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(v0Var.N0 == null ? 18.0f : 50.0f), AndroidUtilities.dp(13.0f));
                textView.setTextSize(1, 16.0f);
                textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                textView.setSingleLine(true);
                frameLayout.addView(textView, b6.d(-1, -2.0f, 0, 11.0f, 0.0f, 11.0f, 0.0f));
                int dp2 = AndroidUtilities.dp(8.0f);
                int i19 = j6.e7;
                f6Var3 = ((g3) v0Var).resourcesProvider;
                int v02 = j6.v0(i19, f6Var3);
                int i20 = j6.i6;
                f6Var4 = ((g3) v0Var).resourcesProvider;
                int k10 = i0.a.k(j6.v0(i20, f6Var4), 76);
                textView.setBackground(j6.i0(dp2, dp2, dp2, dp2, v02, k10, k10));
                int i21 = j6.G6;
                f6Var5 = ((g3) v0Var).resourcesProvider;
                textView.setTextColor(j6.v0(i21, f6Var5));
                final int i22 = 2;
                textView.setOnClickListener(new View.OnClickListener(this) { // from class: eg.k0
                    public final /* synthetic */ n0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        f6 f6Var13;
                        switch (i22) {
                            case 0:
                                v0 v0Var2 = this.b.c;
                                org.telegram.ui.ActionBar.p2 p2Var = v0Var2.n;
                                long j10 = v0Var2.X;
                                f6Var13 = ((g3) v0Var2).resourcesProvider;
                                gg.x.m(p2Var, f6Var13, j10, null);
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
                                v0Var4.N0.run();
                                v0Var4.dismiss();
                                break;
                        }
                    }
                });
                if (v0Var.N0 != null) {
                    ImageView imageView = new ImageView(v0Var.getContext());
                    imageView.setImageResource(R.drawable.msg_stats);
                    int i23 = j6.j5;
                    f6Var6 = ((g3) v0Var).resourcesProvider;
                    imageView.setColorFilter(j6.v0(i23, f6Var6));
                    imageView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                    int dp3 = AndroidUtilities.dp(20.0f);
                    f6Var7 = ((g3) v0Var).resourcesProvider;
                    int k11 = i0.a.k(j6.v0(i20, f6Var7), 76);
                    imageView.setBackground(j6.i0(dp3, dp3, dp3, dp3, 0, k11, k11));
                    frameLayout.addView(imageView, b6.d(40, 40.0f, 21, 15.0f, 0.0f, 15.0f, 0.0f));
                    final int i24 = 3;
                    imageView.setOnClickListener(new View.OnClickListener(this) { // from class: eg.k0
                        public final /* synthetic */ n0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            f6 f6Var13;
                            switch (i24) {
                                case 0:
                                    v0 v0Var2 = this.b.c;
                                    org.telegram.ui.ActionBar.p2 p2Var = v0Var2.n;
                                    long j10 = v0Var2.X;
                                    f6Var13 = ((g3) v0Var2).resourcesProvider;
                                    gg.x.m(p2Var, f6Var13, j10, null);
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
                                    v0Var4.N0.run();
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
                i15 = ((g3) v0Var).backgroundPaddingLeft;
                int dp4 = AndroidUtilities.dp(6.0f) + i15;
                i16 = ((g3) v0Var).backgroundPaddingLeft;
                linearLayout.setPadding(dp4, 0, AndroidUtilities.dp(6.0f) + i16, 0);
                linearLayout.setOrientation(1);
                m90 m90Var = new m90(context);
                f90 f90Var = new f90(context, null);
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(v0Var.x1() ? R.string.BoostingStoriesByGiftingGroup2 : R.string.BoostingStoriesByGiftingChannel2));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.BoostingStoriesByGiftingLink));
                spannableStringBuilder.setSpan(new l0(this, i17), 0, spannableStringBuilder.length(), 33);
                SpannableString spannableString = new SpannableString(">");
                Drawable mutate = v0Var.getContext().getResources().getDrawable(R.drawable.msg_arrowright).mutate();
                int i25 = j6.gc;
                mutate.setColorFilter(new PorterDuffColorFilter(i25, PorterDuff.Mode.SRC_IN));
                lq lqVar = new lq(0, mutate);
                lqVar.setColorKey(i25);
                lqVar.setSize(AndroidUtilities.dp(18.0f));
                lqVar.setWidth(AndroidUtilities.dp(11.0f));
                lqVar.setTranslateX(-AndroidUtilities.dp(5.0f));
                spannableString.setSpan(lqVar, 0, spannableString.length(), 33);
                f90Var.setText(TextUtils.concat(replaceTags, " ", AndroidUtilities.replaceCharSequence(">", spannableStringBuilder, spannableString)));
                f90Var.setTextSize(1, 14.0f);
                f90Var.setLineSpacing(AndroidUtilities.dp(3.0f), 1.0f);
                f6Var8 = ((g3) v0Var).resourcesProvider;
                if (f6Var8 instanceof nh.b) {
                    int i26 = j6.y6;
                    f6Var11 = ((g3) v0Var).resourcesProvider;
                    f90Var.setTextColor(j6.v0(i26, f6Var11));
                } else {
                    int i27 = j6.G6;
                    f6Var9 = ((g3) v0Var).resourcesProvider;
                    f90Var.setTextColor(j6.v0(i27, f6Var9));
                }
                f90Var.setGravity(1);
                f90Var.setOnClickListener(new View.OnClickListener(this) { // from class: eg.k0
                    public final /* synthetic */ n0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        f6 f6Var13;
                        switch (i17) {
                            case 0:
                                v0 v0Var2 = this.b.c;
                                org.telegram.ui.ActionBar.p2 p2Var = v0Var2.n;
                                long j10 = v0Var2.X;
                                f6Var13 = ((g3) v0Var2).resourcesProvider;
                                gg.x.m(p2Var, f6Var13, j10, null);
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
                                v0Var4.N0.run();
                                v0Var4.dismiss();
                                break;
                        }
                    }
                });
                m90Var.setOnClickListener(new androidx.mediarouter.app.c(f90Var, 5));
                if (v0Var.y1()) {
                    f6Var10 = ((g3) v0Var).resourcesProvider;
                    final int i28 = 1;
                    ph.d dVar = new ph.d(context, f6Var10, true);
                    dVar.g(LocaleController.getString(R.string.Copy), false, true);
                    dVar.setOnClickListener(new View.OnClickListener(this) { // from class: eg.k0
                        public final /* synthetic */ n0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            f6 f6Var13;
                            switch (i28) {
                                case 0:
                                    v0 v0Var2 = this.b.c;
                                    org.telegram.ui.ActionBar.p2 p2Var = v0Var2.n;
                                    long j10 = v0Var2.X;
                                    f6Var13 = ((g3) v0Var2).resourcesProvider;
                                    gg.x.m(p2Var, f6Var13, j10, null);
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
                                    v0Var4.N0.run();
                                    v0Var4.dismiss();
                                    break;
                            }
                        }
                    });
                    LinearLayout linearLayout2 = new LinearLayout(context);
                    linearLayout2.addView(v0Var.D0, b6.p(-1, 44, 1.0f, 0, 0, 0, 4, 0));
                    linearLayout2.addView(dVar, b6.p(-1, 44, 1.0f, 0, 4, 0, 0, 0));
                    linearLayout.addView(linearLayout2, b6.k(12.0f, 12.0f, 12.0f, 8.0f, -1, 44));
                } else {
                    linearLayout.addView(v0Var.C0, b6.k(12.0f, 12.0f, 12.0f, 8.0f, -1, 48));
                }
                linearLayout.addView(m90Var, b6.k(0.0f, -5.0f, 0.0f, 0.0f, -1, 48));
                linearLayout.addView(f90Var, b6.k(12.0f, -6.0f, 12.0f, 17.0f, -1, -2));
                view = linearLayout;
                break;
            case 9:
                f6Var12 = ((g3) v0Var).resourcesProvider;
                view = new q0(v0Var, context, f6Var12);
                break;
            default:
                u0 u0Var = new u0(v0Var, context);
                v0Var.a0 = u0Var;
                view = u0Var;
                break;
        }
        return ai.n(view, view, -1, -2);
    }
}
