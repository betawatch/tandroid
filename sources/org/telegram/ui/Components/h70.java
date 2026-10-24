package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class h70 extends lm0 {
    public final /* synthetic */ m70 c;

    public h70(m70 m70Var) {
        this.c = m70Var;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        int i10;
        int b10 = b1Var.b();
        m70 m70Var = this.c;
        if (b10 == m70Var.n) {
            long j10 = m70Var.b.admin_id;
            i10 = ((org.telegram.ui.ActionBar.h3) m70Var).currentAccount;
            return j10 != UserConfig.getInstance(i10).clientUserId;
        }
        if (b10 < m70Var.x || b10 >= m70Var.y) {
            return b10 >= m70Var.O && b10 < m70Var.P;
        }
        return true;
    }

    @Override // s4.g0
    public final int h() {
        return this.c.S;
    }

    @Override // s4.g0
    public final int j(int i10) {
        m70 m70Var = this.c;
        if (i10 == m70Var.h || i10 == m70Var.N || i10 == m70Var.w || i10 == m70Var.e) {
            return 0;
        }
        if (i10 == m70Var.n) {
            return 1;
        }
        if (i10 >= m70Var.O && i10 < m70Var.P) {
            return 1;
        }
        if (i10 >= m70Var.x && i10 < m70Var.y) {
            return 1;
        }
        if (i10 == m70Var.r || i10 == m70Var.s) {
            return 2;
        }
        if (i10 == m70Var.H) {
            return 3;
        }
        if (i10 == m70Var.I) {
            return 4;
        }
        if (i10 == m70Var.J) {
            return 5;
        }
        m70Var.getClass();
        if (i10 == 0 || i10 == m70Var.K || i10 == m70Var.L) {
            return 6;
        }
        if (i10 == m70Var.v) {
            return 7;
        }
        if (i10 == m70Var.M) {
            return 8;
        }
        return i10 == m70Var.f ? 9 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:135:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03d2  */
    @Override // s4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.b1 b1Var, int i10) {
        int i11;
        int i12;
        long j10;
        TLRPC.TL_chatInviteImporter tL_chatInviteImporter;
        TLRPC.ChatParticipant chatParticipant;
        TLRPC.User user;
        String str;
        String str2;
        boolean z10;
        boolean z11;
        boolean z12;
        String str3;
        boolean z13;
        TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing;
        int i13;
        int i14;
        String str4;
        boolean z14;
        boolean z15;
        int i15;
        boolean z16;
        int i16;
        int i17;
        String format;
        int i18;
        String formatString;
        m70 m70Var = this.c;
        HashMap hashMap = m70Var.c;
        TLRPC.ChatFull chatFull = m70Var.d;
        TLRPC.TL_chatInviteExported tL_chatInviteExported = m70Var.b;
        int i19 = b1Var.f;
        View view = b1Var.a;
        if (i19 == 0) {
            org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) view;
            if (i10 == m70Var.h) {
                u3Var.setText(LocaleController.getString(R.string.LinkCreatedeBy));
                u3Var.setRightText(null);
                return;
            }
            if (i10 == m70Var.e) {
                u3Var.setText(LocaleController.getString(R.string.LinkRevenue));
                u3Var.setRightText(null);
                return;
            }
            if (i10 != m70Var.w) {
                if (i10 == m70Var.E) {
                    u3Var.setText(LocaleController.formatPluralString("PeopleSubscriptionExpired", tL_chatInviteExported.subscription_expired, new Object[0]));
                    u3Var.setRightText(null);
                    return;
                } else {
                    if (i10 == m70Var.N) {
                        u3Var.setText(LocaleController.formatPluralString("JoinRequests", tL_chatInviteExported.requested, new Object[0]));
                        u3Var.setRightText(null);
                        return;
                    }
                    return;
                }
            }
            int i20 = tL_chatInviteExported.usage;
            if (i20 > 0) {
                u3Var.setText(LocaleController.formatPluralString("PeopleJoined", i20, new Object[0]));
            } else {
                u3Var.setText(LocaleController.getString(tL_chatInviteExported.subscription_pricing != null ? R.string.NoOneSubscribed : R.string.NoOneJoined));
            }
            if (tL_chatInviteExported.expired || tL_chatInviteExported.revoked || (i11 = tL_chatInviteExported.usage_limit) <= 0 || (i12 = tL_chatInviteExported.usage) <= 0) {
                u3Var.setRightText(null);
                return;
            } else {
                u3Var.setRightText(LocaleController.formatPluralString("PeopleJoinedRemaining", i11 - i12, new Object[0]));
                return;
            }
        }
        if (i19 != 1) {
            if (i19 == 3) {
                r90 r90Var = (r90) view;
                r90Var.d(0, null, false);
                r90Var.setLink(tL_chatInviteExported.link);
                r90Var.setRevoke(tL_chatInviteExported.revoked);
                r90Var.setPermanent(tL_chatInviteExported.permanent);
                r90Var.setCanEdit(m70Var.k0);
                r90Var.b(!m70Var.k0);
                return;
            }
            if (i19 == 4) {
                l70 l70Var = (l70) view;
                AndroidUtilities.cancelRunOnUIThread(l70Var.w);
                l70Var.x = false;
                org.telegram.ui.ActionBar.r6.W(l70Var.getTextView(), org.telegram.ui.ActionBar.k6.B6, null);
                l70Var.setFixedSize(0);
                if (tL_chatInviteExported.revoked) {
                    l70Var.setText(LocaleController.getString(R.string.LinkIsNoActive));
                    return;
                }
                if (tL_chatInviteExported.expired) {
                    int i21 = tL_chatInviteExported.usage_limit;
                    if (i21 > 0 && i21 == tL_chatInviteExported.usage) {
                        l70Var.setText(LocaleController.getString(R.string.LinkIsExpiredLimitReached));
                        return;
                    } else {
                        l70Var.setText(LocaleController.getString(R.string.LinkIsExpired));
                        org.telegram.ui.ActionBar.r6.W(l70Var.getTextView(), org.telegram.ui.ActionBar.k6.p7, null);
                        return;
                    }
                }
                if (tL_chatInviteExported.expire_date <= 0) {
                    l70Var.setFixedSize(-1);
                    l70Var.setText(null);
                    return;
                }
                long currentTimeMillis = (m70Var.i0 * 1000) + System.currentTimeMillis();
                long j11 = tL_chatInviteExported.expire_date;
                long j12 = (j11 * 1000) - currentTimeMillis;
                if (j12 < 0) {
                    j12 = 0;
                }
                if (j12 > 86400000) {
                    l70Var.setText(LocaleController.formatString("LinkExpiresIn", R.string.LinkExpiresIn, LocaleController.formatDateAudio(j11, false)));
                    return;
                }
                long j13 = j12 / 1000;
                int i22 = (int) (j13 % 60);
                long j14 = j13 / 60;
                StringBuilder sb2 = new StringBuilder();
                Locale locale = Locale.ENGLISH;
                sb2.append(String.format(locale, "%02d", Integer.valueOf((int) (j14 / 60))));
                sb2.append(String.format(locale, ":%02d", Integer.valueOf((int) (j14 % 60))));
                sb2.append(String.format(locale, ":%02d", Integer.valueOf(i22)));
                String sb3 = sb2.toString();
                l70Var.x = true;
                org.telegram.ui.Cells.u5 u5Var = l70Var.w;
                AndroidUtilities.cancelRunOnUIThread(u5Var);
                if (l70Var.x) {
                    AndroidUtilities.runOnUIThread(u5Var, 500L);
                }
                l70Var.setText(LocaleController.formatString("LinkExpiresInTime", R.string.LinkExpiresInTime, sb3));
                return;
            }
            if (i19 == 8) {
                i70 i70Var = (i70) view;
                int i23 = tL_chatInviteExported.usage_limit;
                if (i23 <= 0) {
                    i70Var.a.setVisibility(8);
                    return;
                } else {
                    i70Var.a.setText(LocaleController.formatPluralString("PeopleCanJoinViaLinkCount", i23, new Object[0]));
                    i70Var.a.setVisibility(0);
                    return;
                }
            }
            if (i19 != 9) {
                return;
            }
            j70 j70Var = (j70) view;
            TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing2 = tL_chatInviteExported.subscription_pricing;
            int i24 = tL_chatInviteExported.usage;
            m70 m70Var2 = j70Var.f;
            TextView textView = j70Var.c;
            TextView textView2 = j70Var.b;
            if (tL_starsSubscriptionPricing2 == null) {
                return;
            }
            int i25 = tL_starsSubscriptionPricing2.period;
            if (i25 == 2592000) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(LocaleController.formatString(R.string.LinkRevenuePrice, Long.valueOf(tL_starsSubscriptionPricing2.amount)));
                sb4.append(i24 > 0 ? i2.o1.k(i24, " x ") : "");
                textView2.setText(ai.nd.Y0(false, sb4.toString(), 0.8f, null));
                if (i24 == 0) {
                    formatString = LocaleController.getString(R.string.NoOneSubscribed);
                } else {
                    int i26 = R.string.LinkRevenuePriceInfo;
                    BillingController billingController = BillingController.getInstance();
                    double d = tL_starsSubscriptionPricing2.amount / 1000.0d;
                    i18 = ((org.telegram.ui.ActionBar.h3) m70Var2).currentAccount;
                    formatString = LocaleController.formatString(i26, billingController.formatCurrency((long) (d * MessagesController.getInstance(i18).starsUsdWithdrawRate1000 * i24), "USD"));
                }
                textView.setText(formatString);
                return;
            }
            String str5 = i25 == 300 ? "5min" : "min";
            StringBuilder sb5 = new StringBuilder();
            Locale locale2 = Locale.US;
            sb5.append(String.format(locale2, "⭐%1$d/%2$s", Long.valueOf(tL_starsSubscriptionPricing2.amount), str5));
            sb5.append(i24 > 0 ? i2.o1.k(i24, " x ") : "");
            textView2.setText(ai.nd.Y0(false, sb5.toString(), 0.8f, null));
            if (i24 == 0) {
                format = LocaleController.getString(R.string.NoOneSubscribed);
            } else {
                BillingController billingController2 = BillingController.getInstance();
                double d10 = tL_starsSubscriptionPricing2.amount / 1000.0d;
                i17 = ((org.telegram.ui.ActionBar.h3) m70Var2).currentAccount;
                format = String.format(locale2, "you get approximately %1$s %2$s", billingController2.formatCurrency((long) (d10 * MessagesController.getInstance(i17).starsUsdWithdrawRate1000 * i24), "USD"), "for ".concat(str5));
            }
            textView.setText(format);
            return;
        }
        k70 k70Var = (k70) view;
        if (i10 == m70Var.n) {
            j10 = tL_chatInviteExported.admin_id;
            tL_chatInviteImporter = null;
        } else {
            int i27 = m70Var.x;
            ArrayList arrayList = m70Var.d0;
            int i28 = m70Var.F;
            if (i28 != -1 && i10 >= i28) {
                arrayList = m70Var.e0;
                i27 = i28;
            }
            int i29 = m70Var.O;
            if (i29 != -1 && i10 >= i29) {
                arrayList = m70Var.f0;
                i27 = i29;
            }
            TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = (TLRPC.TL_chatInviteImporter) arrayList.get(i10 - i27);
            j10 = tL_chatInviteImporter2.user_id;
            tL_chatInviteImporter = tL_chatInviteImporter2;
        }
        TLRPC.User user2 = (TLRPC.User) hashMap.get(Long.valueOf(j10));
        if (chatFull != null && chatFull.participants != null) {
            for (int i30 = 0; i30 < chatFull.participants.participants.size(); i30++) {
                if (chatFull.participants.participants.get(i30).user_id == j10) {
                    chatParticipant = chatFull.participants.participants.get(i30);
                    break;
                }
            }
        }
        chatParticipant = null;
        if (i10 == m70Var.n) {
            user2 = (TLRPC.User) hashMap.get(Long.valueOf(j10));
            if (user2 == null) {
                i16 = ((org.telegram.ui.ActionBar.h3) m70Var).currentAccount;
                user2 = MessagesController.getInstance(i16).getUser(Long.valueOf(tL_chatInviteExported.admin_id));
            }
            if (user2 != null) {
                str = LocaleController.formatDateAudio(tL_chatInviteExported.date, false);
                user = user2;
                if (i10 != m70Var.n && chatParticipant != null) {
                    if (chatParticipant instanceof TLRPC.TL_chatChannelParticipant) {
                        TLRPC.ChannelParticipant channelParticipant = ((TLRPC.TL_chatChannelParticipant) chatParticipant).channelParticipant;
                        String str6 = channelParticipant.rank;
                        if (channelParticipant instanceof TLRPC.TL_channelParticipantCreator) {
                            if (TextUtils.isEmpty(str6)) {
                                str6 = LocaleController.getString("ChannelCreator", R.string.ChannelCreator);
                            }
                            str4 = str6;
                            z14 = true;
                            z15 = true;
                        } else if (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) {
                            if (TextUtils.isEmpty(str6)) {
                                str6 = LocaleController.getString("ChannelAdmin", R.string.ChannelAdmin);
                            }
                            long j15 = channelParticipant.promoted_by;
                            i15 = ((org.telegram.ui.ActionBar.h3) m70Var).currentAccount;
                            z16 = j15 == UserConfig.getInstance(i15).getClientUserId();
                            str4 = str6;
                            z14 = true;
                            z15 = false;
                            String str7 = str4;
                            z11 = z15;
                            str2 = str7;
                            z12 = z16;
                            z10 = z14;
                        } else {
                            str4 = str6;
                            z14 = false;
                            z15 = false;
                        }
                        z16 = false;
                        String str72 = str4;
                        z11 = z15;
                        str2 = str72;
                        z12 = z16;
                        z10 = z14;
                    } else {
                        String str8 = chatParticipant.rank;
                        if (chatParticipant instanceof TLRPC.TL_chatParticipantCreator) {
                            if (TextUtils.isEmpty(str8)) {
                                str8 = LocaleController.getString("ChannelCreator", R.string.ChannelCreator);
                            }
                            str2 = str8;
                            z10 = true;
                            z11 = true;
                            z12 = false;
                        } else if (chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) {
                            if (TextUtils.isEmpty(str8)) {
                                str8 = LocaleController.getString("ChannelAdmin", R.string.ChannelAdmin);
                            }
                            long j16 = chatParticipant.inviter_id;
                            i14 = ((org.telegram.ui.ActionBar.h3) m70Var).currentAccount;
                            z12 = j16 == UserConfig.getInstance(i14).getClientUserId();
                            z10 = true;
                            z11 = false;
                            str2 = str8;
                        } else {
                            str2 = str8;
                        }
                    }
                    if (UserObject.isUserSelf(user)) {
                        i13 = ((org.telegram.ui.ActionBar.h3) m70Var).currentAccount;
                        str3 = str;
                        if (ChatObject.canManageMyTag(MessagesController.getInstance(i13).getChat(Long.valueOf(m70Var.g0)))) {
                            z13 = true;
                            k70Var.a(str2, z10, z11, z13, new c70(this, user, str2, z10, z11, z12, 0));
                            k70Var.d(user, null, str3, false);
                            if (i10 != m70Var.n || (tL_starsSubscriptionPricing = tL_chatInviteExported.subscription_pricing) == null || tL_chatInviteImporter == null) {
                                return;
                            }
                            int i31 = tL_chatInviteImporter.date;
                            TextView textView3 = k70Var.c0;
                            TextView textView4 = k70Var.b0;
                            SpannableStringBuilder Y0 = ai.nd.Y0(false, "⭐️" + tL_starsSubscriptionPricing.amount, 0.7f, null);
                            int i32 = tL_starsSubscriptionPricing.period;
                            String string = i32 == 2592000 ? LocaleController.getString(R.string.StarsParticipantSubscriptionPerMonth) : i32 == 300 ? "per 5 minutes" : "per each minute";
                            textView4.setText(Y0);
                            textView3.setText(string);
                            k70Var.h((int) Math.max(ei.x3.g(Y0, textView4.getPaint()), ei.x3.g(string, textView3.getPaint())), true);
                            k70Var.c.l(LocaleController.formatJoined(i31), false);
                            return;
                        }
                    } else {
                        str3 = str;
                    }
                    z13 = false;
                    k70Var.a(str2, z10, z11, z13, new c70(this, user, str2, z10, z11, z12, 0));
                    k70Var.d(user, null, str3, false);
                    if (i10 != m70Var.n) {
                        return;
                    } else {
                        return;
                    }
                }
                str2 = null;
                z10 = false;
                z11 = false;
                z12 = false;
                if (UserObject.isUserSelf(user)) {
                }
                z13 = false;
                k70Var.a(str2, z10, z11, z13, new c70(this, user, str2, z10, z11, z12, 0));
                k70Var.d(user, null, str3, false);
                if (i10 != m70Var.n) {
                }
            }
        }
        user = user2;
        str = null;
        if (i10 != m70Var.n) {
        }
        str2 = null;
        z10 = false;
        z11 = false;
        z12 = false;
        if (UserObject.isUserSelf(user)) {
        }
        z13 = false;
        k70Var.a(str2, z10, z11, z13, new c70(this, user, str2, z10, z11, z12, 0));
        k70Var.d(user, null, str3, false);
        if (i10 != m70Var.n) {
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        org.telegram.ui.ActionBar.g6 g6Var;
        Context context = viewGroup.getContext();
        m70 m70Var = this.c;
        switch (i10) {
            case 1:
                view2 = new k70(context);
                break;
            case 2:
                int i11 = org.telegram.ui.ActionBar.k6.a7;
                View b7Var = new org.telegram.ui.Cells.b7(context, org.telegram.ui.ActionBar.k6.x0(null, i11, false), 0);
                org.telegram.ui.ActionBar.r6.i(i11, b7Var, null);
                view = b7Var;
                view2 = view;
                break;
            case 3:
                d70 d70Var = new d70(this, context, m70Var.U, m70Var, m70Var.h0);
                d70Var.setDelegate(new g70(this));
                d70Var.setLayoutParams(new s4.o0(-1, -2));
                view2 = d70Var;
                break;
            case 4:
                view2 = new l70(m70Var, context);
                break;
            case 5:
                b10 b10Var = new b10(context, null);
                b10Var.setIsSingleCell(true);
                b10Var.setViewType(10);
                b10Var.w = false;
                b10Var.setPaddingLeft(AndroidUtilities.dp(10.0f));
                view = b10Var;
                view2 = view;
                break;
            case 6:
                view2 = new un(context, 12);
                break;
            case 7:
                view2 = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.b1) null);
                break;
            case 8:
                i70 i70Var = new i70(context);
                TextView textView = new TextView(context);
                i70Var.a = textView;
                textView.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.y6, null);
                textView.setGravity(1);
                i70Var.addView(textView, w7.z5.d(-1, -2.0f, 16, 60.0f, 0.0f, 60.0f, 0.0f));
                view2 = i70Var;
                break;
            case 9:
                view2 = new j70(m70Var, context);
                break;
            default:
                g6Var = ((org.telegram.ui.ActionBar.h3) m70Var).resourcesProvider;
                view2 = new org.telegram.ui.Cells.u3(context, g6Var);
                break;
        }
        return com.google.android.gms.internal.play_billing.k3.l(view2, view2, -1, -2);
    }
}
