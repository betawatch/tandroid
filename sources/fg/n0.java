package fg;

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
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.l5;
import org.telegram.ui.Cells.g4;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Cells.z6;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.n90;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.u00;
import org.telegram.ui.yh;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class n0 extends sl0 {
    public final /* synthetic */ v0 c;

    public n0(v0 v0Var) {
        this.c = v0Var;
    }

    @Override // org.telegram.ui.Components.sl0
    public final boolean D(f2.m1 m1Var) {
        v0 v0Var = this.c;
        int i10 = v0Var.e0;
        if ((i10 == 11 || i10 == 34) && !v0Var.V) {
            return false;
        }
        int i11 = m1Var.f;
        return i11 == 1 || i11 == 4;
    }

    @Override // f2.p0
    public final int h() {
        return this.c.h0;
    }

    @Override // f2.p0
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

    @Override // f2.p0
    public final void v(f2.m1 m1Var, int i10) {
        int i11;
        String formatUserStatus;
        v0 v0Var = this.c;
        int i12 = v0Var.e0;
        HashSet hashSet = v0Var.v0;
        int i13 = m1Var.f;
        View view = m1Var.a;
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
                m4 m4Var = (m4) view;
                if (i12 != 11 && i12 != 34) {
                    if (i12 == 2) {
                        m4Var.setText(LocaleController.getString(R.string.YourPublicCommunities));
                        return;
                    } else {
                        m4Var.setText(LocaleController.getString(R.string.LastActiveCommunities));
                        return;
                    }
                }
                if (v0Var.V) {
                    m4Var.setText(LocaleController.getString(R.string.ChannelInviteViaLink));
                    return;
                } else if (v0Var.y0.size() == 1) {
                    m4Var.setText(LocaleController.getString(R.string.ChannelInviteViaLinkRestricted2));
                    return;
                } else {
                    m4Var.setText(LocaleController.getString(R.string.ChannelInviteViaLinkRestricted3));
                    return;
                }
            }
            if (i13 != 4) {
                return;
            }
            g4 g4Var = (g4) view;
            if (i12 == 5) {
                TLRPC.Chat chat2 = (TLRPC.Chat) v0Var.w0.get(i10 - v0Var.l0);
                g4Var.e(chat2, chat2.title, (String) v0Var.x0.get(i10 - v0Var.l0), ((float) i10) != ((float) v0Var.m0) - 1.0f);
                g4Var.c(hashSet.contains(chat2), false);
                return;
            }
            if (i12 == 11 || i12 == 34) {
                TLRPC.User user = (TLRPC.User) v0Var.y0.get(i10 - v0Var.l0);
                ArrayList arrayList = v0Var.z0;
                boolean z4 = arrayList != null && arrayList.contains(Long.valueOf(user.id));
                TL_account.requirementToContactPremium requirementtocontactpremium = z4 ? new TL_account.requirementToContactPremium() : null;
                g4Var.O = true;
                g4Var.N = requirementtocontactpremium;
                g4Var.g();
                if (z4) {
                    formatUserStatus = LocaleController.getString(R.string.InvitePremiumBlockedUser);
                } else {
                    i11 = ((h3) v0Var).currentAccount;
                    formatUserStatus = LocaleController.formatUserStatus(i11, user, null, null);
                }
                g4Var.e(user, ContactsController.formatName(user.first_name, user.last_name), formatUserStatus, ((float) i10) != ((float) v0Var.m0) - 1.0f);
                g4Var.c(hashSet.contains(user), false);
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
        eg.q1 q1Var = q0Var.c;
        ImageView imageView = q0Var.a;
        l5 l5Var = q0Var.b;
        if (p0Var instanceof o0) {
            q0Var.f = (o0) p0Var;
            q0Var.e = null;
            imageView.setVisibility(8);
            l5Var.setVisibility(8);
            q1Var.setVisibility(0);
            l5 l5Var2 = q0Var.d;
            o0 o0Var = q0Var.f;
            l5Var2.l(LocaleController.formatPluralString(o0Var.h ? "BoostLevelUnlocks" : "BoostLevel", o0Var.g, new Object[0]), false);
            return;
        }
        if (p0Var != null) {
            q0Var.f = null;
            q0Var.e = p0Var;
            imageView.setVisibility(0);
            imageView.setImageResource(q0Var.e.a);
            l5Var.setVisibility(0);
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
                    spannableString.setSpan(new g51(AndroidUtilities.bold()), 0, spannableString.length(), 33);
                    spannableStringBuilder.replace(indexOf, indexOf + 2, (CharSequence) spannableString);
                }
                l5Var.l(spannableStringBuilder, false);
            } else {
                String string2 = LocaleController.getString(p0Var2.b);
                String str = string2 != null ? string2 : "";
                if (q0Var.e.c != null) {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str);
                    int indexOf2 = str.indexOf("%s");
                    if (indexOf2 >= 0) {
                        spannableStringBuilder2 = new SpannableStringBuilder(str);
                        SpannableString spannableString2 = new SpannableString(q0Var.e.c);
                        spannableString2.setSpan(new g51(AndroidUtilities.bold()), 0, spannableString2.length(), 33);
                        spannableStringBuilder2.replace(indexOf2, indexOf2 + 2, (CharSequence) spannableString2);
                    }
                    l5Var.l(spannableStringBuilder2, false);
                } else {
                    l5Var.l(str, false);
                }
            }
            q1Var.setVisibility(8);
        }
    }

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        g6 g6Var;
        g6 g6Var2;
        int i11;
        int i12;
        int i13;
        int i14;
        g6 g6Var3;
        g6 g6Var4;
        g6 g6Var5;
        g6 g6Var6;
        g6 g6Var7;
        int i15;
        int i16;
        g6 g6Var8;
        g6 g6Var9;
        View view;
        g6 g6Var10;
        g6 g6Var11;
        g6 g6Var12;
        Context context = viewGroup.getContext();
        final int i17 = 0;
        v0 v0Var = this.c;
        switch (i10) {
            case 1:
                view = new org.telegram.ui.Cells.n(context, new m0(this), true, 9);
                break;
            case 2:
                int i18 = k6.a7;
                g6Var = ((h3) v0Var).resourcesProvider;
                view = new z6(context, k6.v0(i18, g6Var), 0);
                break;
            case 3:
                View m4Var = new m4(context);
                m4Var.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
                view = m4Var;
                break;
            case 4:
                g6Var2 = ((h3) v0Var).resourcesProvider;
                View g4Var = new g4(1, 0, context, g6Var2, false, false);
                i11 = ((h3) v0Var).backgroundPaddingLeft;
                i12 = ((h3) v0Var).backgroundPaddingLeft;
                g4Var.setPadding(i11, 0, i12, 0);
                view = g4Var;
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
                view = new jn(v0Var.getContext(), 1);
                break;
            case 7:
                FrameLayout frameLayout = new FrameLayout(v0Var.getContext());
                i13 = ((h3) v0Var).backgroundPaddingLeft;
                int dp = AndroidUtilities.dp(6.0f) + i13;
                i14 = ((h3) v0Var).backgroundPaddingLeft;
                frameLayout.setPadding(dp, 0, AndroidUtilities.dp(6.0f) + i14, 0);
                TextView textView = new TextView(context);
                if (v0Var.N0 == null && ChatObject.hasAdminRights(v0Var.s1())) {
                    v0Var.N0 = new eh.m(this, 4);
                }
                textView.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(v0Var.N0 == null ? 18.0f : 50.0f), AndroidUtilities.dp(13.0f));
                textView.setTextSize(1, 16.0f);
                textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                textView.setSingleLine(true);
                frameLayout.addView(textView, c6.d(-1, -2.0f, 0, 11.0f, 0.0f, 11.0f, 0.0f));
                int dp2 = AndroidUtilities.dp(8.0f);
                int i19 = k6.e7;
                g6Var3 = ((h3) v0Var).resourcesProvider;
                int v02 = k6.v0(i19, g6Var3);
                int i20 = k6.i6;
                g6Var4 = ((h3) v0Var).resourcesProvider;
                int k10 = i0.a.k(k6.v0(i20, g6Var4), 76);
                textView.setBackground(k6.i0(dp2, dp2, dp2, dp2, v02, k10, k10));
                int i21 = k6.G6;
                g6Var5 = ((h3) v0Var).resourcesProvider;
                textView.setTextColor(k6.v0(i21, g6Var5));
                final int i22 = 2;
                textView.setOnClickListener(new View.OnClickListener(this) { // from class: fg.k0
                    public final /* synthetic */ n0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        g6 g6Var13;
                        switch (i22) {
                            case 0:
                                v0 v0Var2 = this.b.c;
                                org.telegram.ui.ActionBar.p2 p2Var = v0Var2.n;
                                long j10 = v0Var2.X;
                                g6Var13 = ((h3) v0Var2).resourcesProvider;
                                hg.x.m(p2Var, g6Var13, j10, null);
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
                    int i23 = k6.j5;
                    g6Var6 = ((h3) v0Var).resourcesProvider;
                    imageView.setColorFilter(k6.v0(i23, g6Var6));
                    imageView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                    int dp3 = AndroidUtilities.dp(20.0f);
                    g6Var7 = ((h3) v0Var).resourcesProvider;
                    int k11 = i0.a.k(k6.v0(i20, g6Var7), 76);
                    imageView.setBackground(k6.i0(dp3, dp3, dp3, dp3, 0, k11, k11));
                    frameLayout.addView(imageView, c6.d(40, 40.0f, 21, 15.0f, 0.0f, 15.0f, 0.0f));
                    final int i24 = 3;
                    imageView.setOnClickListener(new View.OnClickListener(this) { // from class: fg.k0
                        public final /* synthetic */ n0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            g6 g6Var13;
                            switch (i24) {
                                case 0:
                                    v0 v0Var2 = this.b.c;
                                    org.telegram.ui.ActionBar.p2 p2Var = v0Var2.n;
                                    long j10 = v0Var2.X;
                                    g6Var13 = ((h3) v0Var2).resourcesProvider;
                                    hg.x.m(p2Var, g6Var13, j10, null);
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
                i15 = ((h3) v0Var).backgroundPaddingLeft;
                int dp4 = AndroidUtilities.dp(6.0f) + i15;
                i16 = ((h3) v0Var).backgroundPaddingLeft;
                linearLayout.setPadding(dp4, 0, AndroidUtilities.dp(6.0f) + i16, 0);
                linearLayout.setOrientation(1);
                n90 n90Var = new n90(context);
                g90 g90Var = new g90(context, null);
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(v0Var.x1() ? R.string.BoostingStoriesByGiftingGroup2 : R.string.BoostingStoriesByGiftingChannel2));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.BoostingStoriesByGiftingLink));
                spannableStringBuilder.setSpan(new l0(this, i17), 0, spannableStringBuilder.length(), 33);
                SpannableString spannableString = new SpannableString(">");
                Drawable mutate = v0Var.getContext().getResources().getDrawable(R.drawable.msg_arrowright).mutate();
                int i25 = k6.gc;
                mutate.setColorFilter(new PorterDuffColorFilter(i25, PorterDuff.Mode.SRC_IN));
                oq oqVar = new oq(0, mutate);
                oqVar.setColorKey(i25);
                oqVar.setSize(AndroidUtilities.dp(18.0f));
                oqVar.setWidth(AndroidUtilities.dp(11.0f));
                oqVar.setTranslateX(-AndroidUtilities.dp(5.0f));
                spannableString.setSpan(oqVar, 0, spannableString.length(), 33);
                g90Var.setText(TextUtils.concat(replaceTags, " ", AndroidUtilities.replaceCharSequence(">", spannableStringBuilder, spannableString)));
                g90Var.setTextSize(1, 14.0f);
                g90Var.setLineSpacing(AndroidUtilities.dp(3.0f), 1.0f);
                g6Var8 = ((h3) v0Var).resourcesProvider;
                if (g6Var8 instanceof oh.b) {
                    int i26 = k6.y6;
                    g6Var11 = ((h3) v0Var).resourcesProvider;
                    g90Var.setTextColor(k6.v0(i26, g6Var11));
                } else {
                    int i27 = k6.G6;
                    g6Var9 = ((h3) v0Var).resourcesProvider;
                    g90Var.setTextColor(k6.v0(i27, g6Var9));
                }
                g90Var.setGravity(1);
                g90Var.setOnClickListener(new View.OnClickListener(this) { // from class: fg.k0
                    public final /* synthetic */ n0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        g6 g6Var13;
                        switch (i17) {
                            case 0:
                                v0 v0Var2 = this.b.c;
                                org.telegram.ui.ActionBar.p2 p2Var = v0Var2.n;
                                long j10 = v0Var2.X;
                                g6Var13 = ((h3) v0Var2).resourcesProvider;
                                hg.x.m(p2Var, g6Var13, j10, null);
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
                n90Var.setOnClickListener(new androidx.mediarouter.app.c(g90Var, 5));
                if (v0Var.y1()) {
                    g6Var10 = ((h3) v0Var).resourcesProvider;
                    final int i28 = 1;
                    qh.d dVar = new qh.d(context, g6Var10, true);
                    dVar.g(LocaleController.getString(R.string.Copy), false, true);
                    dVar.setOnClickListener(new View.OnClickListener(this) { // from class: fg.k0
                        public final /* synthetic */ n0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            g6 g6Var13;
                            switch (i28) {
                                case 0:
                                    v0 v0Var2 = this.b.c;
                                    org.telegram.ui.ActionBar.p2 p2Var = v0Var2.n;
                                    long j10 = v0Var2.X;
                                    g6Var13 = ((h3) v0Var2).resourcesProvider;
                                    hg.x.m(p2Var, g6Var13, j10, null);
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
                    linearLayout2.addView(v0Var.D0, c6.p(-1, 44, 1.0f, 0, 0, 0, 4, 0));
                    linearLayout2.addView(dVar, c6.p(-1, 44, 1.0f, 0, 4, 0, 0, 0));
                    linearLayout.addView(linearLayout2, c6.k(12.0f, 12.0f, 12.0f, 8.0f, -1, 44));
                } else {
                    linearLayout.addView(v0Var.C0, c6.k(12.0f, 12.0f, 12.0f, 8.0f, -1, 48));
                }
                linearLayout.addView(n90Var, c6.k(0.0f, -5.0f, 0.0f, 0.0f, -1, 48));
                linearLayout.addView(g90Var, c6.k(12.0f, -6.0f, 12.0f, 17.0f, -1, -2));
                view = linearLayout;
                break;
            case 9:
                g6Var12 = ((h3) v0Var).resourcesProvider;
                view = new q0(v0Var, context, g6Var12);
                break;
            default:
                u0 u0Var = new u0(v0Var, context);
                v0Var.a0 = u0Var;
                view = u0Var;
                break;
        }
        return yh.o(view, view, -1, -2);
    }
}
